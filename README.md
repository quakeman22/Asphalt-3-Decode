# Asphalt 3 J2ME — Engenharia Reversa

**Jogo:** Asphalt: Urban GT 3 · Gameloft · J2ME  
**Engine:** GLLib (mesmo engine de AC1, AC2, PoP SoT J2ME)  
**Objetivo:** Editor de pistas Python — leitura/edição do pack /2, visualização de imagens de todos os packs

---

## Status dos Packs

| Pack | Splits | Entries | Conteúdo | Analisado |
|------|--------|---------|----------|-----------|
| `/0` | 1 | 12 | Carros PNG 184×221, ícones 15×15, waypoints/IA | Parcial |
| `/1` | 1 | 5 | Paleta ARGB4444, 3 fontes numéricas, HUD coords | Parcial |
| `/2` | 1 | 6 | **6 pistas** — objetivo principal | ✅ Confirmado |
| `/3` | 1 | 3 | Tabela UI (385+86 entries), strings localização (5 idiomas) | Parcial |
| `/4` + `/41` | 2 | 31 | 26× PNG (split 0) + 5× PNG (split 1) | ✅ Confirmado |
| `/5`+`/51–54` | 5 | 39 | Sprites GLLib `df03` — carros, efeitos, elementos | Parcial |
| `/6` | ? | ? | Áudio — baixa prioridade | ❌ Não analisado |
| `/7` | 1 | 8 | Structs de veículos | Parcial |

---

## GLLib PackReader — `Class_6b.java` — CONFIRMADO

Este é o sistema de leitura de packs do engine GLLib. Toda leitura de dados do jogo passa por aqui.

### Funções principais

| Função Java | Equivalente Python | Descrição |
|---|---|---|
| `sub_cf(path)` | `open_pack(path)` | Abre o pack, lê header completo |
| `sub_16c(entry)` | `seek_entry(idx)` | Posiciona o stream no início do entry |
| `sub_1a9(n)` | `skip(n)` | Avança N bytes no stream |
| `sub_2c6()` | `read_u8()` | Lê 1 byte unsigned |
| `sub_2f0()` | `read_u16()` | Lê uint16 Little Endian |
| `sub_376()` | `read_u32()` | Lê uint32 Little Endian |
| `sub_27d(entry)` | `read_entry_bytes(idx)` | Lê entry inteiro como `bytes` |
| `sub_3f0(entry)` | `read_entry_image(idx)` | Lê entry como bytes e cria Image (PNG nativo) |
| `sub_248(buf,off,n)` | `read_into(buf,n)` | Lê N bytes para buffer |
| `sub_1cc()` | `close_pack()` | Fecha o pack |

### Formato do Header do Pack

```
uint32 LE  n_entries
uint8      n_splits
uint32 LE  split_size[0 .. n_splits-1]   ← um por split

// para cada entry v de 1 até n_entries-1:
uint32 LE  offset[v]
uint8      split_idx[v]   ← só presente se n_splits > 1

// entry[0]: offset=0, split_idx=0 (implícito, não está no header)

// Cálculo do tamanho de cada entry:
// se split_idx[v] == split_idx[v-1]:
//     size[v-1] = offset[v] - offset[v-1] - 1
// senão:
//     size[v-1] = split_size[split_idx[v-1]] - offset[v-1] - 1
// último entry:
//     size[last] = split_size[split_idx[last]] - offset[last] - 1

// Posição absoluta para leitura:
// split 0:  data_start + offset[idx] + 1
//           (data_start = posição no arquivo após o header completo)
// split N:  offset[idx] + 1
//           (relativo ao início do arquivo splitN, ex: /41, /51, /52...)
```

### Parser Python de referência

```python
def parse_pack(path, split_paths=None):
    with open(path, 'rb') as f:
        data = f.read()
    split_data = {}
    if split_paths:
        for i, sp in enumerate(split_paths, 1):
            with open(sp, 'rb') as f:
                split_data[i] = f.read()

    pos = 0
    n_entries = int.from_bytes(data[0:4], 'little'); pos = 4
    n_splits  = data[pos]; pos += 1
    split_sizes = []
    for _ in range(n_splits):
        split_sizes.append(int.from_bytes(data[pos:pos+4], 'little')); pos += 4

    offsets = [0]; split_idxs = [0]
    for _ in range(1, n_entries):
        offsets.append(int.from_bytes(data[pos:pos+4], 'little')); pos += 4
        if n_splits > 1:
            split_idxs.append(data[pos]); pos += 1
        else:
            split_idxs.append(0)

    data_start = pos
    entries = []
    for i in range(n_entries):
        if i < n_entries - 1:
            if split_idxs[i+1] == split_idxs[i]:
                size = offsets[i+1] - offsets[i] - 1
            else:
                size = split_sizes[split_idxs[i]] - offsets[i] - 1
        else:
            size = split_sizes[split_idxs[i]] - offsets[i] - 1

        if split_idxs[i] == 0:
            abs_off = data_start + offsets[i] + 1
            entries.append(data[abs_off:abs_off+size])
        else:
            src = split_data[split_idxs[i]]
            abs_off = offsets[i] + 1
            entries.append(src[abs_off:abs_off+size])

    return entries
```

---

## Pack /4 + /41 — Imagens PNG — CONFIRMADO

- **2 splits:** arquivo `/4` (split 0) + arquivo `/41` (split 1)
- **31 entries totais**, todos PNG nativos — lidos com `Image.createImage(bytes)` (Java) ou `PIL.Image.open(BytesIO(bytes))` (Python)
- Nenhum decode especial — são PNG padrão dentro do pack

### Entries confirmados

| Entry | Split | Arquivo | Size | Conteúdo |
|-------|-------|---------|------|----------|
| [0] | 0 | `/4` | 790b | Logo/splash |
| [1] | 0 | `/4` | 445b | UI pequena |
| [2–13] | 0 | `/4` | 1338–4439b | Spritesheets menu/corrida |
| [14–25] | 0 | `/4` | 480–649b | Labels de pistas/carros (12 variantes) |
| [26] | 1 | `/41` | 11652b | Tela cheia 240×320 |
| [27] | 1 | `/41` | 2758b | Banner horizontal |
| [28] | 1 | `/41` | 2297b | Tira vertical |
| [29] | 1 | `/41` | 222b | Barra fina |
| [30] | 1 | `/41` | 3402b | Painel meio-tela |

---

## Pack /2 — Pistas — CONFIRMADO

- **1 split, 6 entries** — uma pista por entry
- Função de carregamento: `sub_1011(entry_idx, lap_idx)` em `Class_df.java`

### Entries

| Entry | Size | n_segs | Sky color |
|-------|------|--------|-----------|
| [0] | 5294b | 176 | #1c9cfc |
| [1] | 8401b | 200 | #a5f3e1 |
| [2] | 4606b | 200 | #385bfc |
| [3] | 5431b | 200 | #f9f6a9 |
| [4] | 4454b | 200 | #eeb5ff |
| [5] | 5544b | 200 | #396ab3 |

### Estrutura de cada entry (ordem de leitura confirmada via `sub_1011`)

```
// --- CABEÇALHO DE VOLTAS ---
uint8       n_laps
skip        7 bytes
uint8       var8           ← dado específico da volta 0
skip        45*(n_laps-1) + 37 bytes   ← restante das voltas

// --- DADOS FIXOS DA CORRIDA ---
uint8[2]    var_2e02[0..1]
uint8       hz_near        ← var_2f40 = 55 + este byte
uint8       hz_far         ← var_3003 = 55 + este byte
uint8       scale_x        ← var_30ab
uint8       scale_y        ← var_30e8
RGB(3b)     sky_color      ← var_3154  (cor do céu)
RGB(3b)     color2         ← var_316b
RGB(3b)     color3         ← var_31a9
RGB(3b)     color4         ← var_31bf
RGB(3b)     color5         ← var_31d5
uint16      var_3214
uint8[2]    var_2e02[2..3]
uint16[3]   var_2e02[4..6]
RGB(3b)     var_326e
RGB(3b)     var_3281
skip        3 bytes
uint16      var_32be
uint16      var_331e
RGB(3b)     var_333d
RGB(3b)     var_338b
uint8       packed          ← var_349d = (byte & 0x70) >> 4 / var_35ac = byte & 0x0F
RGB(3b)     var_33e5
RGB(3b)     var_343d
uint8       var_36f3        ← 255 = -1
RGB(3b)[5]  var_425c..var_42dc
uint16[3]   var_4368, var_4354, var_42f8
RGB(3b)[2]  var_43a8, var_43da
uint16      var_401d
uint8[3]    var_4078, var_40af, var_4113

// --- EVENTOS DE COR (ambiente ao longo da pista) ---
uint8       n_color_events  ← var_4166
n_color_events × {
    RGB(3b)   cor
    uint16    val1
    uint16    val2
}

// --- OBJETOS ESTÁTICOS ---
uint16      n_objects       ← var7
n_objects × {
    uint8   v3   (255 = -1)
    uint8   v4   (255 = -1)
    uint8   v5   (255 = -1)
    uint8   v6   (255 = -1)
    uint16  pos1
    uint16  pos2
}

// --- BILLBOARD GROUPS ---
uint16      n_bb_groups     ← var_3845
n_bb_groups × {
    uint8   n_points
    if n_points > 0: n_points × uint16[2]  (coordenadas)
    uint8   n_shapes
    n_shapes × {
        uint8  shape_type
        if type==0: uint8[3]          (3 bytes)
        if type==1 or type==3: uint16[4]   (8 bytes)
        if type==2: uint16[6]         (12 bytes)
    }
}

// --- SEGMENT COLOR EVENTS ---
uint16      n_seg_colors    ← var_38c9
n_seg_colors × {
    uint16  position
    uint8   type
    RGB(3b) color0
    RGB(3b) color1
}

// --- TRACK EVENTS ---
uint16      n_events        ← var_3ac9
n_events × {
    uint8   type
    uint16  value
}

// --- DADOS IGNORADOS ---
skip        1 byte

// --- VOLTAS EXTRAS (lap data alternativo) ---
// loop var8 vezes:
//   uint16  n  → skip n*5 bytes

// --- SEGMENTOS (dados centrais da pista) ---
uint16      n_segments      ← var_35f4
n_segments × uint16  packed_segment:
    bits [15..11]  curvX  (signed 5-bit, >15 → -32)   ← curvatura horizontal
    bits [10..6]   curvY  (signed 5-bit, >15 → -32)   ← inclinação vertical
    bits [5..0]    tex    (0–63)                        ← índice de textura

n_segments × uint16  var_3b22   ← sprite/objeto do segmento
n_segments × uint8   var_3b5b   ← flags do segmento
```

### Curvatura — interpretação

- `curvX = 0` → segmento reto
- `curvX > 0` → curva para direita
- `curvX < 0` → curva para esquerda
- Ângulo acumulado: `angle += curvX * 2.4°` por segmento (confirmado empiricamente)
- `curvY` → inclinação da pista (slope), não afeta o mapa top-down

---

## Pack /5 + Splits — Sprites GLLib `df03`

- **5 splits:** `/5` (split 0), `/51`, `/52`, `/53`, `/54`
- **39 entries totais**
- Todos GLLib df03 com paleta embutida (flags `0x01000000`)
- Entries não-GLLib nos splits 1–4 precisam dos arquivos `/51`–`/54` para inspecionar

### Split 0 — arquivo `/5`, entries [0–10] — CONFIRMADO

| Entry | Size | n_frames | Pixel Format | Dims (sample) | Conteúdo provável |
|-------|------|----------|--------------|---------------|-------------------|
| [0] | 2925b | 68 | 2bpp (0x0400) | 3–4px | Efeitos/partículas pequenas |
| [1] | 4028b | 68 | 2bpp (0x0400) | 3–5px | Efeitos/partículas pequenas |
| [2] | 1105b | 14 | 4bpp (0x1600) | 4–10px | Ícones/elementos UI |
| [3] | 1448b | 6 | 4bpp (0x1600) | 4–23px | Elementos UI/HUD |
| [4] | 2400b | 3 | RLE (0x27F1) | 37–44px | Carro pequeno ou objeto |
| [5] | 12048b | 51 | RLE (0x27F1) | 1–7px | Efeitos variados |
| [6] | 1079b | 11 | 1bpp (0x0200) | 3–6px | Sombras/máscaras |
| [7] | 1514b | 4 | RLE (0x27F1) | 22–25px | Objeto médio |
| [8] | 7462b | 50 | 4bpp (0x1600) | 3–6px | Animação complexa |
| [9] | 4669b | 6 | RLE (0x27F1) | até 69×48 | **Carro em perspectiva** |
| [10] | 8473b | 11 | RLE (0x27F1) | até 14×51 | Objeto vertical |

### Splits 1–4 — entries [11–38]

| Split | Arquivo | Entries | GLLib | Não-GLLib |
|-------|---------|---------|-------|-----------|
| 1 | `/51` | [11–15] | [11] 68 frames | [12–15] formato desconhecido |
| 2 | `/52` | [16–29] | [16] 68 frames | [17–29] formato desconhecido |
| 3 | `/53` | [30–35] | [30] 68 frames | [31–35] maior: [34]=22180b |
| 4 | `/54` | [36–38] | [36] 68 frames | [37–38] formato desconhecido |

**Nota:** Os entries não-GLLib (12–15, 17–29, 31–35, 37–38) precisam dos binários `/51`–`/54` para identificar o formato.

### Formato GLLib Sprite `df03`

```
uint8[2]   df 03              magic
uint8[4]   01 01 01 01        versão/flags
uint8      n_frames
uint8      00
n_frames × { uint8 w, uint8 h }
uint16     n_anims
n_anims × { uint16 frame_idx, uint16 flags }
uint16     n_sequences
n_sequences × { uint16 frame_idx, uint16 duration }
n_frames × { uint16 x_offset, uint8 w, uint8 h }
pixel data raw  ← ~2bpp, paleta = pack /1 entry [0] ARGB4444
```

**Paleta:** pack `/1` entry `[0]` — 2048 entradas ARGB4444, carregada via `sub_44b()` em `Class_6b`.  
**Renderização:** igual ao AC1/AC2 — mesmo sistema GLLib.

---

## Pack /1 — UI e Fontes — CONFIRMADO

- **1 split, 5 entries**, tamanho total: 5167 bytes

| Entry | Size | Conteúdo |
|-------|------|----------|
| [0] | 4096b | **Paleta ARGB4444** — 2048 entradas × 2 bytes, usada pelos sprites GLLib do pack `/5` |
| [1] | 190b | **Fonte grande** — 89×223px, 13 chars: `0123456789$%-` |
| [2] | 186b | **Fonte média** — 87×223px, 9 chars: `012345678` |
| [3] | 40b | **Fonte pequena** — 14×57px, 12 chars: `0123456789$.` |
| [4] | 650b | **Tabela HUD** — formato desconhecido (magic `CH` = 0x4348), 650 bytes |

### Paleta ARGB4444 — entry [0]

```
2048 × uint16 LE, formato ARGB4444:
  bits [15..12] = Alpha  (4 bits → multiplicar por 17 para obter 8 bits)
  bits [11..8]  = Red
  bits [7..4]   = Green
  bits [3..0]   = Blue

def decode_argb4444(word):
    a = ((word >> 12) & 0xF) * 17
    r = ((word >> 8)  & 0xF) * 17
    g = ((word >> 4)  & 0xF) * 17
    b = ( word        & 0xF) * 17
    return (a << 24) | (r << 16) | (g << 8) | b
```

**Nota:** Esta paleta é diferente da ARGB1555 embutida nos sprites `df03`. A ARGB4444 do pack `/1` é a paleta global carregada uma vez e usada para todos os sprites do pack `/5`.

### Formato das Fontes — entries [1], [2], [3]

```
uint16    width          ← largura total da imagem de fonte
uint16    height         ← altura total
uint16    0xFFFF         ← magic separador
uint16    char_height    ← altura de cada glyph em pixels
uint16    n_chars        ← número de caracteres
uint16    default_width  ← largura padrão de glyph
n_chars × uint16  char_codes    ← código ASCII de cada char
n_chars × uint16  x_offsets     ← posição X de cada char na imagem
pixel_data                       ← dados de pixel (formato a determinar com Class_22)
```

| Entry | w×h | n_chars | Chars | char_h | def_w |
|-------|-----|---------|-------|--------|-------|
| [1] | 89×223 | 13 | `0123456789$%-` | 4 | 6 |
| [2] | 87×223 | 9 | `012345678` | 4 | 4 |
| [3] | 14×57 | 12 | `0123456789$.` | 6 | 6 |

### Entry [4] — Tabela HUD

- Magic bytes `CH` (0x43 0x48) nos bytes [2..3]
- 650 bytes, divisível exatamente por 26 (25 structs) e por 5 (130 structs)
- Contém valores coerentes com coordenadas de tela (0–320)
- **Formato exato desconhecido** — necessário o código Java que lê este entry

---

## Pack /0 — Assets Gerais — CONFIRMADO

- **1 split, 12 entries**, tamanho total: 19940 bytes

| Entry | Size | Tipo | Dimensão | Conteúdo |
|-------|------|------|----------|----------|
| [0] | 7810b | PNG | 184×221 | Sprite de carro lateral (jogador/NPC) |
| [1] | 5412b | PNG | 184×221 | Sprite de carro lateral (outro) |
| [2] | 1870b | PNG | 98×68 | Elemento HUD/cenário |
| [3] | 616b | GLLib df03 | — | Sprite animado, 4 frames: 12×10, 10×10, 16×27, 16×27 (com paleta embutida) |
| [4] | 226b | PNG | 15×15 | Ícone UI |
| [5] | 178b | PNG | 15×15 | Ícone UI |
| [6] | 149b | PNG | 15×15 | Ícone UI |
| [7] | 531b | PNG | 15×15 | Ícone UI |
| [8] | 230b | PNG | 15×15 | Ícone UI |
| [9] | 238b | PNG | 15×15 | Ícone UI |
| [10] | 188b | PNG | 15×15 | Ícone UI |
| [11] | 2480b | binário | — | **Strings promocionais multilíngue** (Gameloft catalog, press 5 to visit, etc.) |

### Estrutura do Entry [11]

```
uint32 LE   n_sub = 28
28 × uint16 offsets[]     ← offsets relativos ao byte 4 (após o uint32)

// sub[0] e sub[27]: tabelas de índices uint16 que referenciam as strings
// sub[1..26]:       strings de texto multilíngue (EN/DE/ES/FR/IT/PT)
//                   formato interno: uint8 len + texto latin-1
//                   conteúdo: textos de promoção, avaliações de imprensa,
//                             catálogo de jogos Gameloft, instruções de portal
```

**Nota:** O MD anterior dizia "waypoints/pathfinding IA" — **incorreto**. São strings promocionais.

---

## Pack /3 — UI e Localização

| Entry | Conteúdo |
|-------|----------|
| [0] | 385 entries × 94b — tabela de assets por tela |
| [1] | 86 entries × ~80b — tabela secundária |
| [2] | Strings localizadas: EN/DE/ES/FR/IT (`uint8 len` + texto) |

---

## Pack /7 — Veículos (8 entries)

```
uint8   car_id        (9=jogador, 10–16=NPCs)
uint8   flag          (1=especial/desbloqueável)
uint8   velocidade_base  (30 ou 40)
uint8   zero
uint8   handling      (108–160)
skip    3 bytes
uint16[3]  sprite_offsets
...    constantes de spritesheet e física por marcha
```

---

## GLLib Sprite/Font Renderer — `Class_22.java` — CONFIRMADO

Esta é a classe central de **renderização de sprites e fontes paletizados** do engine GLLib.  
Usada para todos os sprites do pack `/5` e para as fontes do pack `/1`.

### Papel

- Carrega um sprite/fonte a partir de `byte[]` bruto (entry do pack)
- Armazena paleta(s), pixel data comprimido, metadados de frames e animações
- Decodifica pixel data sob demanda (`sub_4b8`) e desenha via `Graphics.drawRGB` ou `drawRegion`

### Estrutura do binário GLLib Sprite (`sub_5d`)

```
// Entrada: byte[] bruto do entry, com offset inicial +2 (2 bytes ignorados no início)

uint32 LE   flags               ← bit 1 (0x02): tem offsets x/y por frame
                                  bit 24 (0x01000000): tem paleta embutida
uint16      n_frames

// Se n_frames > 0:
//   Se flags & 0x02:
//     n_frames × uint8  frame_x   (var_146)
//     n_frames × uint8  frame_y   (var_156)
//   n_frames × uint8  frame_w   (var_167)  ← 0xFF = frame vazio (skip 6 bytes)
//   n_frames × uint8  frame_h   (var_179)  ← só presente se frame_w != 0xFF

uint16      n_anim_frames
n_anim_frames × 4 bytes         (var_1fb — dados de frames de animação)

uint16      n_anims
n_anims × {
    uint8   tipo_anim   (var_1d5)
    uint8   ignorado
    uint16  anim_offset (var_1f1)
    4 bytes ignorados
}

uint16      n_sequences
n_sequences × 5 bytes           (var_2d3 — sequências de animação)

uint16      n_glyphs             ← para fontes
n_glyphs × {
    uint8   tipo_glyph  (var_232)
    uint8   ignorado
    uint16  glyph_offset (var_28a)
}

// Se flags & 0x01000000 (paleta embutida):
//   uint16   magic = 0x5515  ← verificação (valor 21781, não 0x5555)
//   uint8    n_palettes     (var_325)
//   uint8    palette_size   (var_12, 0=256)
//   n_palettes × palette_size × uint16  ARGB1555
//     decodifica: alpha = bit15, R = bits14-10 <<3, G = bits9-5 <<3, B = bits4-0 <<3
//   uint16   pixel_format   (var_3f8)
//   // pixel data: n_frames × (uint16 chunk_size + chunk_size bytes)
//   // frames fora do range [var3..var4] são ignorados (var_478[frame] = -1)
```

### Formatos de pixel (var_3f8)

| Valor | Constante | Descrição |
|-------|-----------|-----------|
| `0x27F1` (10225) | RLE | byte > 127 → run-length (byte-128 repetições do próximo índice de paleta); byte ≤ 127 → índice direto |
| `0x1600` (5632) | 4bpp | 2 pixels por byte: nibble alto = pixel 0, nibble baixo = pixel 1 |
| `0x0400` (1024) | 2bpp | 4 pixels por byte: bits 7-6, 5-4, 3-2, 1-0 |
| `0x0200` (512) | 1bpp | 8 pixels por byte |
| `0x5602` (22018) | 8bpp | 1 byte = 1 índice de paleta |

### Decode de pixel data — Python de referência

```python
def decode_pixels(pixel_data, palette, n_pixels, pixel_format):
    out = []
    i = 0
    if pixel_format == 0x27C2:   # RLE
        while len(out) < n_pixels:
            b = pixel_data[i] & 0xFF; i += 1
            if b > 127:
                color = palette[pixel_data[i] & 0xFF]; i += 1
                out.extend([color] * (b - 128))
            else:
                out.append(palette[b])
    elif pixel_format == 0x1600:  # 4bpp
        while len(out) < n_pixels:
            b = pixel_data[i] & 0xFF; i += 1
            out.append(palette[b >> 4 & 0xF])
            out.append(palette[b & 0xF])
    elif pixel_format == 0x0400:  # 2bpp
        while len(out) < n_pixels:
            b = pixel_data[i] & 0xFF; i += 1
            out.append(palette[b >> 6 & 3])
            out.append(palette[b >> 4 & 3])
            out.append(palette[b >> 2 & 3])
            out.append(palette[b & 3])
    elif pixel_format == 0x0200:  # 1bpp
        while len(out) < n_pixels:
            b = pixel_data[i] & 0xFF; i += 1
            for bit in range(7, -1, -1):
                out.append(palette[(b >> bit) & 1])
    elif pixel_format == 0x5602:  # 8bpp
        while len(out) < n_pixels:
            out.append(palette[pixel_data[i] & 0xFF]); i += 1
    return out  # lista de ARGB int32

def decode_argb1555(word):
    alpha = 0xFF000000 if (word & 0x8000) else 0
    r = (word & 0x7C00) >> 7   # bits 14-10 → shift para 8bit
    g = (word & 0x03E0) >> 2
    b = (word & 0x001F) << 3
    return alpha | (r << 16) | (g << 8) | b
```

### Funções de desenho

| Método | Descrição |
|--------|-----------|
| `sub_5d(bytes, offset, lap_start, lap_end)` | Carrega o sprite/fonte do byte array |
| `sub_84(Image)` | Carrega frames a partir de um PNG externo (sprites do pack /0) |
| `sub_a6(palette_idx, frame_start, frame_end, src_palette)` | Decodifica frames para `Image[]` usando paleta |
| `sub_c7()` | Libera pixel data da memória (mantém apenas Image[]) |
| `sub_4b8(frame, offset)` | Decodifica um frame para `int[]` ARGB (sem alocar Image) |
| `sub_4a2(g, frame, x, y, flags)` | Desenha um frame no Graphics |
| `sub_410(g, anim, seq, x, y, flags)` | Desenha uma sequência de animação |
| `sub_521(g, text, x, y, align)` | Renderiza texto com a fonte carregada |
| `sub_4f8(text, start, end)` | Mede dimensões do texto (sem desenhar) |

### Flags de transformação (`var5` nos métodos de draw)

| Bit | Efeito |
|-----|--------|
| bit 0 | Flip horizontal |
| bit 1 | Flip vertical |

---

## Classes Java Relevantes

| Classe | Papel |
|--------|-------|
| `Class_6b.java` | **PackReader** — abre packs, lê entries, fornece stream de bytes |
| `Class_22.java` | **Sprite/Font Renderer** — decodifica e desenha sprites paletizados e fontes |
| `Class_df.java` | Canvas principal — `sub_1011()` carrega pistas, `sub_1704()` roda física/corrida |

---

## Próximos Passos — Editor Python

1. **Abrir qualquer pack via arquivo** — usar o parser de referência acima
2. **Visualizador de imagens** — packs com PNG nativos: `/0` (parcial), `/4`+`/41` (todos), outros a confirmar
3. **Editor de pistas** — pack `/2`: ler/editar segmentos (curvX, curvY, tex) + cores de ambiente + write-back (repack)
4. **Decoder sprites GLLib `df03`** — pack `/5`+splits: implementar 2bpp + paleta ARGB4444 do `/1`
5. **Packs restantes a inspecionar:** `/0`, `/1`, `/3`, `/5`–`/54`, `/7` — atualizar um de cada vez e documentar aqui

---

## Notas para continuação do projeto

- Toda leitura de pack usa o parser Python de referência desta seção (baseado em `Class_6b.java`)
- O formato do pack /2 está **completamente mapeado e testado** — os 6 entries parseiam sem erro
- Imagens PNG são **nativas** dentro dos packs — sem decode GLLib necessário
- Sprites GLLib `df03` (pack /5) precisam de decode: 2bpp + paleta ARGB4444 do pack /1 entry [0]

