import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.game.GameCanvas;
import javax.microedition.rms.InvalidRecordIDException;
import javax.microedition.rms.RecordComparator;
import javax.microedition.rms.RecordEnumeration;
import javax.microedition.rms.RecordFilter;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;

public final class Class_df extends GameCanvas implements Runnable {

   static final int[] var_7f = new int[]{1, 2, 5, 6, 7, 9};
   static final int[] var_aa = new int[]{1, 2, 8, 5, 6, 7, 9};
   static final int[] var_10e = new int[]{10, 12, 11};
   static final int[] var_16b = new int[]{13, 14, 15, 16};
   static final int[] var_1b3 = new int[]{1, 5, 3, 4, 2, 6, 7};
   static final int[] var_1f0 = new int[]{60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73};
   static final int[][] var_214 = new int[][]{{14, 10, 105, 7, 3, 9, 10, 11, 13}, {22, 107, 105}, {24, 107, 105, -1}, {19, 107, 105, 4}, {20, 107, 105, 12}, {25, 107, 105, 6, 1, 2}, {32}, {31}, {0}, {16, 107, 105}, {17, 107, 10}, {18, 107, 10}, {21, 107, 105, 5}, {15, 10, 105, -1, 8}, {14, 10, 105, 7, 3, 15, 9, 10, 11, 13}, {3}};
   static final int[] var_226 = new int[]{0, 8000, 20000, '\u9c40', '\uea60', 80000, 100000, 120000, 140000, 160000, 180000, 200000, 220000, 240000, 260000, 280000, 300000, 350000, 400000, 450000, 500000, 550000, 600000, 650000, 700000, 750000, 800000, 850000, 900000, 950000, 1000000};
   static final int[] var_248 = new int[]{8000, 4000, 2000};
   static final int[] var_25c = new int[]{5000, 10000, 25000};
   static final int[][] var_272 = new int[][]{{32, 51, 46, 69}, {33, 52, 50, 72}, {34, 53, 47, 70}, {35, 54, 48, 71}, {36, 55, 49, 73}};
   static final int[][] var_2bc = new int[][]{{0, 161, 23, 169, -110, 60}, {1, 165, 24, 169, -80, 55}, {2, 163, 24, 170, 9, 56}, {3, 164, 24, 171, 13, 42}, {4, 167, 25, 173, 45, 70}, {5, 168, 25, 174, 90, 55}};
   static final int[][] var_2f7 = new int[][]{{0, 0, 113, 123, 2, 23}, {1, 1, 121, 132, 6, -1}, {2, 3, 116, 126, 3, 24}, {4, 6, 114, 124, 1, 20}, {3, 9, 119, 130, 9, 21}, {5, 13, 115, 125, 4, 22}, {6, 17, 120, 131, 5, -1}};
   static final int[][] var_357 = new int[][]{{32, 54, 57, 1}, {33, 55, 58, 10}, {34, 56, 59, 17}};
   static final int[][] var_395 = new int[][]{{82, -1, 0}, {83, 2, 1}, {84, 4, 3}, {85, 6, 5}, {86, 8, 7}, {87, 10, 9}, {88, 12, 11}, {89, 15, 14}, {90, -1, 13}};
   static final int[] var_3de = new int[]{1, 7, 4, 2};
   static Graphics var_3ec = null;
   static long var_41c;
   static byte[] var_46b;
   static byte[] var_490;
   static boolean var_4de = false;
   static long var_53c;
   static boolean var_56a = false;
   static int var_586 = 0;
   static int var_5ed = 0;
   private static long var_5fd = 0L;
   static long var_64f = 0L;
   static int var_697;
   static int var_6bb;
   static int var_6c8;
   static int var_6ef;
   static byte var_71f;
   static boolean var_75a;
   static boolean var_766;
   static boolean var_79d;
   static boolean var_7f8;
   static boolean var_815;
   static int var_837;
   static Graphics var_883;
   static Image var_8cc;
   static Graphics var_8f3 = null;
   static int var_93b;
   static int var_97e;
   static Image var_9a5;
   static int var_9ed;
   static int var_a14;
   static int[] var_a33;
   static int[] var_a77;
   static int[] var_acb;
   static int var_b22;
   static int[] var_b68;
   static int[] var_ba5;
   static int[] var_bf1;
   static Image var_c54;
   static Image var_c68;
   static Image var_c74;
   static Image var_ca1;
   static Image var_cf4;
   static byte[] var_d30;
   static boolean var_d86;
   static int var_dcc;
   static int var_e23;
   static boolean var_e5e;
   static int[] var_e92;
   static int var_ebe;
   static boolean var_ed3;
   static boolean var_f28;
   static boolean[] var_f50;
   static int[] var_f8d;
   static int var_faa;
   static int var_feb;
   static byte[] var_1019;
   static int var_105e;
   static int var_10b0;
   static int var_10cd;
   static int var_10f1;
   static int var_110a;
   static boolean var_1150;
   static boolean var_11b3;
   static int[] var_120d;
   static byte[] var_123e;
   static byte[] var_126b;
   static int var_12a0;
   static int var_1302;
   static int var_1348;
   static boolean var_13aa;
   static int var_13e0;
   static int[] var_143f;
   static int[] var_1462;
   static byte[] var_148c;
   static int[][] var_14f0;
   static byte[][] var_1523;
   static byte[][][] var_1568;
   static byte[] var_15ca;
   static int[] var_160d;
   static int[] var_1669;
   static byte[][] var_167e;
   static byte[] var_16d6;
   static int[][] var_1729;
   static int[][] var_1786;
   static byte[] var_17dd;
   static short[][] var_1830;
   static byte[] var_1841;
   static byte[] var_1870;
   static int[] var_187b;
   static byte var_18ae;
   static int var_18e1;
   static int var_1918;
   static int var_1940;
   static byte[][][] var_1951;
   static int[][][] var_1992;
   static boolean var_19e1;
   static int var_1a15;
   static boolean var_1a4b;
   static boolean var_1a7a;
   static int var_1ad4;
   static int var_1b2e;
   static int[] var_1b64;
   static boolean var_1b7a;
   static boolean var_1b8a;
   static int[] var_1bba;
   static int var_1bd8;
   static int var_1bf6;
   static int var_1c00;
   static int var_1c13;
   static boolean var_1c3d;
   static boolean var_1c6a;
   static int var_1c98;
   static int var_1cc4;
   static int var_1cda;
   static int var_1cfb;
   static int[] var_1d1d;
   static byte[] var_1d55;
   static int var_1d9d;
   static int var_1de6;
   static byte[] var_1e0a;
   static short[] var_1e43;
   static int var_1ea4;
   static int var_1ed8;
   static int var_1f1f;
   static int var_1f5b;
   static int var_1f82;
   static int var_1fbb;
   static long var_200b;
   static int var_2017;
   static int var_2034;
   static int var_208e;
   static int var_209d;
   static int var_20ae;
   static int var_20d0;
   static int var_2134;
   static int var_2161;
   static int var_21ad;
   static int var_21c1;
   static int var_221f;
   static int var_2267;
   static boolean var_22a5;
   static int var_22bf;
   static Image var_22fb;
   static boolean var_2358;
   static Class_22[] var_23b2;
   static int[] var_23c4;
   static Image var_23d0;
   static byte[][] var_23e6;
   static Image[][] var_2401;
   static int[][] var_2437;
   static int var_2468;
   static int var_247f;
   static Image var_248c;
   static Graphics var_24a4;
   static int var_24d0;
   static int var_252a;
   static int[] var_2537;
   static int[] var_2581;
   static boolean[] var_2591;
   static int var_25c4;
   static int var_25dd;
   static int var_262f;
   static int var_2659;
   static Class_22[] var_267b;
   static Class_22 var_26a9;
   static Class_22 var_26d3;
   static Class_22 var_2732;
   static int var_2780;
   static int var_27d5;
   static int var_2801;
   static boolean var_284e;
   static byte[][] var_2866;
   static short[][] var_2891;
   static byte[] var_28a0;
   static byte[] var_28df;
   static byte[] var_2934;
   static byte[] var_2941;
   static byte[] var_297c;
   static Class_22 var_29c0;
   static int var_29d9;
   static int var_2a39;
   static int var_2a74;
   static int var_2aa8;
   static int var_2aca;
   static int var_2af6;
   static int var_2b26;
   static int var_2b71;
   static int var_2b8f;
   static int var_2bd6;
   static int var_2c34;
   static int var_2c7e;
   static int var_2cce;
   static int var_2d25;
   static int var_2d85;
   static int var_2da8;
   static int[] var_2e02;
   static int[] var_2e30;
   static Image[] var_2e70;
   static Image var_2e81;
   static Image var_2ed9;
   static int var_2ef6;
   static int var_2f40;
   static int var_2f96;
   static int var_2fe6;
   static int var_3003;
   static int var_3058;
   static int var_30ab;
   static int var_30e8;
   static int var_3127;
   static int var_3154;
   static int var_316b;
   static int var_31a9;
   static int var_31bf;
   static int var_31d5;
   static int var_3214;
   static Image[][] var_3254;
   static int var_326e;
   static int var_3281;
   static int var_32be;
   static int var_331e;
   static int var_333d;
   static int var_338b;
   static int var_33e5;
   static int var_343d;
   static byte var_349d;
   static short[] var_34bf;
   static int var_3508;
   static int var_3542;
   static int var_3578;
   static int var_35ac;
   static int var_35f4;
   static int[] var_3629;
   static int[] var_363f;
   static byte[] var_3694;
   static int var_36f3;
   static int var_374b;
   static boolean var_3782;
   static int var_37a2;
   static int var_37fd;
   static int var_3845;
   static byte[] var_3871;
   static short[][][] var_388c;
   static short[][] var_38b0;
   static int var_38c9;
   static int[] var_3925;
   static int[][] var_395f;
   static byte[] var_39af;
   static short[][] var_3a02;
   static short[][] var_3a0e;
   static int[] var_3a70;
   static int[] var_3a9d;
   static int var_3ac9;
   static byte[] var_3aea;
   static short[] var_3af6;
   static short[] var_3b22;
   static byte[] var_3b5b;
   static int[] var_3b7d;
   static int[] var_3bbe;
   static int[] var_3bfe;
   static int[] var_3c51;
   static int[] var_3c80;
   static int[] var_3c8a;
   static int[] var_3cab;
   static int[] var_3cf2;
   static int[] var_3d1b;
   static int[] var_3d62;
   static int[] var_3da9;
   static short[] var_3dba;
   static Class_9b[][] var_3e1d;
   static short[] var_3e61;
   static Class_9b[][] var_3e97;
   static int var_3edf;
   static int[] var_3f34;
   static int[] var_3f84;
   static int[] var_3fc9;
   static int var_401d;
   static int var_4078;
   static int var_40af;
   static int var_4113;
   static int var_4166;
   static int[] var_41aa;
   static short[] var_41dd;
   static short[] var_4241;
   static int var_425c;
   static int var_4281;
   static int var_42a5;
   static int var_42b4;
   static int var_42dc;
   static int var_42f8;
   static int var_4354;
   static int var_4368;
   static int var_43a8;
   static int var_43da;
   static int[] var_43ed;
   static int[] var_4434;
   static int[] var_4476;
   static int var_44a1;
   static Class_9b var_44e8;
   static Class_9b var_4503;
   static boolean var_4543;
   static int var_459c;
   static Class_9b var_45ee;
   static int var_460c;
   static Class_9b var_4651;
   static Class_9b var_467f;
   static Class_9b var_46d6;
   static Class_9b[] var_4723;
   static int var_4761;
   static int var_47af;
   static int var_47e4;
   static boolean var_4832;
   static int var_486c;
   static int var_48ad;
   static int var_48e7;
   static boolean var_4943;
   static int[][] var_495d = new int[5][2];
   static int var_499b = 0;
   static int var_49be;
   static boolean var_49db;
   static int var_4a02;
   static final String[] var_4a1d = new String[]{"SCDA", "BBRK"};
   static final String[] var_4a5e = new String[]{"-OPSS", "-MMN", "-PSDK"};
   static final String[] var_4ac2 = new String[]{"-RF06", "-BBRK", "-NYN"};
   static Class_22 var_4b11;
   static Image[] var_4b70;
   static String[] var_4bd3;
   static byte[] var_4bfb;
   static int var_4c5f;
   static byte[] var_4cb5;
   static int var_4cf1;
   static byte[] var_4d30;
   static byte var_4d8c;
   static int var_4dc4;
   static int var_4dd9;
   static boolean var_4e02;
   static boolean var_4e30;
   static String var_4e51 = null;
   static final String var_4e5b = (new String("no")).toUpperCase();
   static final String var_4eb5 = (new String("del")).toUpperCase();
   static final byte[] var_4ed3 = new byte[30];
   static int var_4f04 = 0;
   static int var_4f5e = 0;
   static boolean var_4fbe = false;
   static final int[] var_5005 = new int[]{5, 10, 25, 50, 100, 250, 500, 1000, 2000, 3000, 5000, 10000, 15000, 20000, 30000, '\uc350'};
   static int var_5017;
   static int var_505d;
   static int var_50a1;
   static boolean[] var_50ba = null;
   static int var_50f0;
   static int var_5130;
   static int var_5183;
   static int var_51c6;
   static int var_5202;
   static int var_5222;
   static int var_5266 = 0;
   static int var_5290 = 0;
   static int[] var_52c7 = new int[]{-15, -20, 15, 16, -20, 5, -9, -24, 2, 10, -24, 2, -4, -24, 2, 5, -24, 2, 0, -24, 2, -13, -20, 5, 14, -20, 15};
   static int[][] var_52da = new int[][]{{2, 5, 7, 8}, {3, 4}, {0, 6}, {5, 8}, {1, 2}, {0, 8}, {4, 5, 7, 8}, {0, 1, 2, 3, 6}};
   static int var_533c = 0;
   static int var_5379 = 0;
   static int var_539d;
   static int[] var_53b0;
   static int[] var_53f7;
   static int[] var_543d;
   static int[] var_544f;
   static int[] var_5490;
   static int[] var_54f1;
   static int var_5504;
   static int var_5551;
   static int var_55aa;
   static int var_55d8;
   static int var_5637;
   static int var_5689;
   static int[] var_56dd;


   Class_df() {
      super(false);
      var_46b = new byte[15];
      var_490 = new byte[15];
      sub_283(1);
      var_6bb = -1;
      var_6c8 = -1;
      var_6ef = -1;
      var_71f = 0;
      var_75a = true;
      this.setFullScreenMode(true);
   }

   public final void hideNotify() {
      sub_2b();
   }

   public final void showNotify() {
      this.sub_78();
   }

   private static void sub_2b() {
      if(!var_4de) {
         var_4de = true;
         sub_1fa();

         try {
            if(Class_6b.sub_836(0)) {
               if(Class_6b.var_5ae[0] < 7) {
                  Class_6b.sub_7ef(0);
                  return;
               }

               Class_6b.sub_754(0);
            }

         } catch (Exception var0) {
            ;
         }
      }
   }

   private void sub_78() {
      if(var_4de) {
         var_75a = true;
         var_766 = true;
         sub_1fa();
         var_5fd = System.currentTimeMillis();
         var_41c = var_5fd;
         this.repaint();
         var_4de = false;
      }
   }

   static void sub_a7() {
      var_697 = -1;
   }

   public final void run() {
      try {
         this.setCommandListener((CommandListener)null);
         var_56a = true;

         while(var_697 >= 0) {
            if(!var_4de) {
               var_41c = System.currentTimeMillis();
               sub_130(this.getGraphics());
               this.flushGraphics();

               while(System.currentTimeMillis() - var_41c < 50L) {
                  Thread.yield();
               }
            }
         }
      } catch (Exception var3) {
         var3.printStackTrace();
         var_697 = -1;
      }

      if(var_e5e) {
         try {
            GloftASP3.var_59.setFullScreenMode(false);
            Thread.sleep(1000L);
            sub_fc();
            Thread.sleep(1000L);
            Display.getDisplay(GloftASP3.var_47).setCurrent((Displayable)null);
         } catch (Exception var2) {
            ;
         }
      }

      GloftASP3.var_47.destroyApp(true);
   }

   private static void sub_fc() {
      try {
         sub_723(var_4e51);
      } catch (Exception var1) {
         System.out.println("Cannot start download...\n" + var_4e51 + "\n" + var1);
      }
   }

   public final void paint(Graphics var1) {}

   private static void sub_130(Graphics var0) {
      if(var_56a) {
         if(!var_4de) {
            var_79d = var_766;
            var_766 = false;
            if(var_79d) {
               try {
                  if(var_697 < 36) {
                     Class_6b.sub_7fc(0);
                  }

                  var_5fd = System.currentTimeMillis();
               } catch (Exception var2) {
                  ;
               }
            }

            var_53c = System.currentTimeMillis();
            var_5ed = (int)(var_53c - var_5fd);
            var_5fd = var_53c;
            if(var_5ed > 819) {
               var_5ed = 819;
            }

            var_64f += (long)var_5ed;
            ++var_586;

            try {
               var_3ec = var0;
               sub_2303();
            } catch (Exception var1) {
               var_697 = -1;
            }

            System.currentTimeMillis();
            if(Runtime.getRuntime().freeMemory() < 50000L) {
               System.gc();
            }

            sub_1b2();
            var_7f8 = var_815;
            var_815 = false;
         }
      }
   }

   protected final void keyPressed(int var1) {
      byte var2 = sub_18e(var1);
      if(var_490[var2] <= 0) {
         for(int var3 = 0; var3 < 15; ++var3) {
            if(var_490[var3] > 0 && var2 != var3) {
               var_490[var3] *= -1;
            }
         }

         var_490[var2] = 1;
      }
   }

   protected final void keyRepeated(int var1) {}

   protected final void keyReleased(int var1) {
      byte var2 = sub_18e(var1);
      if(var_490[var2] > 0) {
         var_490[var2] *= -1;
      }

   }

   private static byte sub_18e(int var0) {
      if(-6 == var0) {
         return (byte)13;
      } else if(-7 == var0) {
         return (byte)14;
      } else {
         try {
            int var1;
            if((var1 = GloftASP3.var_59.getGameAction(var0)) == 1) {
               return (byte)1;
            }

            if(var1 == 2) {
               return (byte)3;
            }

            if(var1 == 5) {
               return (byte)4;
            }

            if(var1 == 6) {
               return (byte)2;
            }

            if(var1 == 8) {
               return (byte)5;
            }
         } catch (Exception var2) {
            ;
         }

         return (byte)(var0 == 1?1:(var0 == 2?3:(var0 == 5?4:(var0 == 6?2:(var0 == 35?12:(var0 == 42?11:(var0 == 48?6:(var0 == 49?7:(var0 == 50?1:(var0 == 51?8:(var0 == 52?3:(var0 == 53?5:(var0 == 54?4:(var0 == 55?9:(var0 == 56?2:(var0 == 57?10:0))))))))))))))));
      }
   }

   private static void sub_1b2() {
      for(int var0 = 0; var0 < 15; ++var0) {
         var_46b[var0] = var_490[var0];
         if(var_490[var0] != 0) {
            byte[] var10000;
            int var10001;
            byte var10002;
            if(var_490[var0] < 0) {
               var10000 = var_490;
               var10001 = var0;
               var10002 = 0;
            } else {
               if(var_490[var0] >= 126) {
                  continue;
               }

               ++var_490[var0];
               if(var0 < 13) {
                  continue;
               }

               var10000 = var_490;
               var10001 = var0;
               var10002 = (byte)(var_490[var0] * -1);
            }

            var10000[var10001] = var10002;
         }
      }

   }

   private static void sub_1fa() {
      for(int var0 = 0; var0 < 15; ++var0) {
         var_46b[var0] = 0;
         var_490[var0] = 0;
      }

   }

   private static boolean sub_249() {
      for(int var0 = 1; var0 < 15; ++var0) {
         if(var_46b[var0] < 0) {
            return true;
         }
      }

      return false;
   }

   private static void sub_283(int var0) {
      var_6bb = var_697;
      var_697 = var0;
      var_71f = 0;
      var_75a = true;
      var_815 = true;
   }

   static void sub_2a7(int var0, int var1) {
      sub_283(var0);
      var_6c8 = var1;
   }

   private static void sub_2b8() {
      sub_283(var_6c8);
   }

   private static void sub_31c() {
      sub_283(var_6bb);
   }

   private static void sub_35a(boolean var0) {
      if(var_4bd3 == null) {
         var_4bd3 = new String[12];
      }

      int var1;
      for(var1 = 0; var1 < 2; ++var1) {
         var_4bd3[0 + var1] = GloftASP3.var_47.getAppProperty("URL-" + var_4a1d[var1]);
      }

      var_4bd3[3] = GloftASP3.var_47.getAppProperty("URL-OPERATOR");
      var_4bd3[2] = GloftASP3.var_47.getAppProperty("URL-ACTION");
      String var2 = null;

      for(var1 = 0; var1 <= 3; ++var1) {
         var2 = var1 == 3?"URL-WH":"URL-WH" + var_4a5e[var1];
         var_4bd3[4 + var1] = GloftASP3.var_47.getAppProperty(var2);
      }

      for(var1 = 0; var1 <= 3; ++var1) {
         var2 = var1 == 3?"URL-BS":"URL-BS" + var_4ac2[var1];
         var_4bd3[8 + var1] = GloftASP3.var_47.getAppProperty(var2);
      }

      if(!var0) {
         var_4cb5 = new byte[4];
         var_4d30 = new byte[4];
      }

      var_4cf1 = 0;
      var_4d8c = 0;
      if(!var0) {
         var_4bfb = new byte[6];
      }

      var_4c5f = 0;

      for(var1 = 0; var1 < 12; ++var1) {
         if(var_4bd3[var1] == null || var_4bd3[var1].trim().length() == 0) {
            var_4bd3[var1] = null;
         }
      }

      String var10000;
      String var3;
      for(var1 = 0; var1 < 2; ++var1) {
         var10000 = var_4bd3[0 + var1] == null?null:var_4bd3[0 + var1].trim().toUpperCase();
         var3 = var10000;
         if(var10000 == null || var3.compareTo(var_4eb5) != 0) {
            if(!var0) {
               var_4bfb[var_4c5f] = (byte)var1;
            }

            ++var_4c5f;
         }

         if(var3 != null && var3.compareTo(var_4e5b) == 0) {
            var_4bd3[0 + var1] = null;
         }
      }

      for(var1 = 0; var1 <= 3; ++var1) {
         if(var_4bd3[4 + var1] != null) {
            if((var3 = var_4bd3[4 + var1].trim().toUpperCase()).compareTo(var_4e5b) != 0 && var3.compareTo(var_4eb5) != 0) {
               if(!var0) {
                  var_4cb5[var_4cf1] = (byte)var1;
               }

               ++var_4cf1;
            } else {
               var_4bd3[4 + var1] = null;
            }
         }
      }

      if(var_4cf1 > 0) {
         if(!var0) {
            var_4bfb[var_4c5f] = 2;
         }

         ++var_4c5f;
      }

      for(var1 = 0; var1 <= 3; ++var1) {
         if(var_4bd3[8 + var1] != null) {
            if((var3 = var_4bd3[8 + var1].trim().toUpperCase()).compareTo(var_4e5b) != 0 && var3.compareTo(var_4eb5) != 0) {
               if(!var0) {
                  var_4d30[var_4d8c] = (byte)var1;
               }

               ++var_4d8c;
            } else {
               var_4bd3[8 + var1] = null;
            }
         }
      }

      if(var_4d8c > 0) {
         if(!var0) {
            var_4bfb[var_4c5f] = 3;
         }

         ++var_4c5f;
      }

      if(var_4bd3[2] != null && (var3 = var_4bd3[2].trim().toUpperCase()).compareTo(var_4eb5) != 0 && var3.compareTo(var_4e5b) != 0) {
         if(!var0) {
            var_4bfb[var_4c5f] = 4;
         }

         ++var_4c5f;
      }

      var10000 = var_4bd3[3] != null?var_4bd3[3].trim().toUpperCase():null;
      var3 = var10000;
      if(var10000 == null || var3.compareTo(var_4eb5) != 0) {
         if(!var0) {
            var_4bfb[var_4c5f] = 5;
         }

         ++var_4c5f;
      }

      if(var3 == null || var3.compareTo(var_4e5b) == 0) {
         var_4bd3[3] = null;
      }

      var_4e02 = var_4c5f == 0;
   }

   private static void sub_39a() {
      sub_35a(true);
      var_4bd3 = null;
      var_4bfb = null;
      var_4cb5 = null;
      var_4d30 = null;
      System.gc();
   }

   private static boolean sub_3db(int var0) {
      int var1;
      switch(var0) {
      case 1:
         var_8cc = Image.createImage(240, 320);
         var_883 = var_8cc.getGraphics();
         var_d86 = false;
         sub_c49(true);
      case 2:
         Class_6b.sub_cf("/5");
         break;
      case 3:
         sub_f9b(0, 1);
         var_267b[1].sub_a6(0, 0, -1, -1);
         var_267b[1].sub_a6(2, 0, -1, -1);
         var_267b[1].sub_c7();
         var_267b[1].var_373 = 0;
         break;
      case 4:
         sub_f9b(1, 0);
         var_267b[0].sub_a6(0, 0, -1, -1);
         var_267b[0].sub_a6(1, 0, -1, -1);
         var_267b[0].sub_c7();
         break;
      case 5:
         var_26a9 = sub_117d(28, true, 1, 1);
         Class_6b.sub_1cc();
         break;
      case 6:
         Class_6b.sub_cf("/4");
         var_9a5 = Class_6b.sub_3f0(1);
         Class_6b.sub_1cc();
         break;
      case 7:
         int var2 = var_3ec.getDisplayColor(0);
         int var3 = var_9a5.getWidth();
         int var4 = var_9a5.getHeight();
         int var5 = var3 * var4;
         sub_238a(var_9a5, var_23c4, 0, var3, 0, 0, var3, var4);

         for(var1 = 0; var1 < var5; ++var1) {
            if((var_23c4[var1] & 16777215) == var2) {
               var_23c4[var1] = 0;
            }
         }

         var_9a5 = null;
         System.gc();
         var_9a5 = Image.createRGBImage(var_23c4, var3, var4, true);
         break;
      case 8:
         Class_6b.sub_cf("/0");
         var_4b11 = sub_117d(3, true, 0, -1);
         break;
      case 9:
         var_4b70 = new Image[11];

         for(var1 = 0; var1 < 2; ++var1) {
            var_4b70[0 + var1] = Class_6b.sub_3f0(0 + var1);
         }

         return false;
      case 10:
         var_4b70[2] = Class_6b.sub_3f0(2);
         break;
      case 11:
         for(var1 = 0; var1 < 3; ++var1) {
            var_4b70[3 + var1] = Class_6b.sub_3f0(4 + var1);
         }

         return false;
      case 12:
         for(var1 = 0; var1 < 3; ++var1) {
            var_4b70[7 + var1] = Class_6b.sub_3f0(7 + var1);
         }

         return false;
      case 13:
         var_4b70[10] = Class_6b.sub_3f0(10);
         var_4b70[6] = var_4b70[10];
         break;
      case 14:
         Class_6b.sub_537(11, var_93b);
         Class_6b.sub_1cc();
         break;
      case 15:
         sub_35a(false);
         var_4dd9 = 0;
         break;
      case 16:
         System.gc();
         return true;
      }

      return false;
   }

   private static void sub_422() {
      var_883 = null;
      var_8cc = null;
      var_4b11 = null;
      var_4b70 = null;
      var_4bd3 = null;
      sub_fb9();
      Class_6b.sub_55c();
      var_9a5 = null;
      var_4bfb = null;
      var_4cb5 = null;
      var_4d30 = null;
      var_26a9 = null;
      System.gc();
   }

   private static void sub_47a(boolean var0) {
      if(var0) {
         var_4b11.sub_4a2(var_3ec, 1, 0, 320 - var_4b11.var_179[1], 0);
      }

      var_4b11.sub_4a2(var_3ec, 0, 240 - var_4b11.var_167[0], 320 - var_4b11.var_179[0], 0);
   }

   private static void sub_4c6(int var0, int var1) {
      for(int var2 = 0; var2 < 34; ++var2) {
         int var10000;
         int var10001;
         if(var2 < 17) {
            var10000 = 17;
            var10001 = var2;
         } else {
            var10000 = var2;
            var10001 = 17;
         }

         int var4 = (var10000 - var10001 << 8) / 17;
         int var3 = sub_112a(var0, var1, var4);
         var_3ec.setColor(var3);
         sub_a6c(0, var2 * 9, 240, 9);
      }

      var_3ec.setColor(var0);
      sub_a6c(0, 306, 240, 14);
   }

   private static void sub_574() {
      int var0 = Class_6b.var_361[512 - (int)(var_64f << 1 & 2047L) & 2047] >> 10;
      var_4b11.sub_429(var_3ec, 0, 5 + var0, 135, 0);
      var_4b11.sub_429(var_3ec, 1, 235 - var0, 135, 0);
   }

   private static void sub_5b4(int var0, int var1, int var2, int var3) {
      byte[] var6 = Class_6b.sub_595(var0);
      if((var_64f & 511L) >= 255L) {
         int var10000;
         int var10001;
         int var4;
         int var5;
         label28: {
            var_267b[1].sub_4f8(var6, 0, var6.length);
            var4 = Class_22.var_524 + 10;
            var5 = Class_22.var_55a + 10;
            if((var3 & 1) != 0) {
               var10000 = var1;
               var10001 = var4 >> 1;
            } else {
               if((var3 & 8) == 0) {
                  break label28;
               }

               var10000 = var1;
               var10001 = var4;
            }

            var1 = var10000 - var10001;
         }

         label22: {
            if((var3 & 2) != 0) {
               var10000 = var2;
               var10001 = var5 >> 1;
            } else {
               if((var3 & 32) == 0) {
                  break label22;
               }

               var10000 = var2;
               var10001 = var5;
            }

            var2 = var10000 - var10001;
         }

         var_3ec.setColor(16711680);
         sub_a6c(var1, var2, var4, var5);
         sub_bd5(var6, 1, var1 + (var4 >> 1), var2 + (var5 >> 1), 3);
      }
   }

   private static void sub_5d3(int var0) {
      sub_4c6(0, 136);
      var_3ec.drawImage(var_4b70[var0], 120, 25, 17);
      sub_bd5(sub_b56(Class_6b.sub_595(0 + var0), 1, 216), 1, 120, 283, 3);
   }

   private static void sub_61c() {
      sub_4c6(0, 136);
      var_3ec.drawImage(var_9a5, 120, 25, 17);
      var_267b[0].var_373 = 1;
      sub_b8e(8, 0, 120, var_9a5.getHeight() + 50, 17);
      boolean var0 = false;
      var_267b[1].var_373 = 0;
      sub_b8e(4, 1, 120, 135, 17);
      int var1 = 135 + var_267b[1].var_6f0[2] + var_267b[1].var_6f0[1];
      var_267b[1].var_373 = 2;
      sub_b8e(5, 1, 120, var1, 17);
      var1 += var_267b[1].var_6f0[2] + var_267b[1].var_6f0[1];
      var_267b[1].var_373 = 0;
      sub_bd5(sub_b56(Class_6b.sub_595(6), 1, 180), 1, 120, var1, 17);
   }

   private static void sub_62c() {
      sub_4c6(0, 9044224);
      var_3ec.drawImage(var_4b70[2], 120, 25, 17);
      short var0 = var_267b[1].var_6f0[2];
      short var1 = var_267b[1].var_6f0[1];
      boolean var2 = false;
      sub_b8e(4, 1, 120, 135, 17);
      int var3 = 135 + var0 + var1;
      var_267b[1].var_373 = 2;
      sub_b8e(9, 1, 120, var3, 17);
      var3 += var0 + var1;
      var_267b[1].var_373 = 0;
      sub_b8e(10, 1, 120, var3, 17);
      var3 += var0 + var1;
      sub_b8e(11, 1, 120, var3, 17);
      var3 += var0 + var1;
      sub_b8e(12, 1, 120, var3, 17);
   }

   private static void sub_646(boolean var0) {
      sub_4c6(0, 136);
      var_3ec.drawImage(var_9a5, 120, 25, 17);
      int var1 = 25 + var_9a5.getHeight() + var_267b[0].var_6f0[1];
      var_267b[0].var_373 = 1;
      sub_b8e(var0?13:14, 0, 120, var1, 17);
      int var2 = var0?var_4cf1:var_4d8c;
      byte[] var3 = var0?var_4cb5:var_4d30;
      int var4 = var0?3:7;
      byte var10 = 100;
      var_267b[0].var_373 = 0;
      var_267b[1].var_373 = 0;
      var_4b70[var4].getHeight();
      int var6 = var_4b70[var4].getWidth();
      var1 = var10 + 10;
      int var7 = var0?15:19;
      int var8 = 170 - var6 - 2 - 3 + 10;

      for(int var9 = 0; var9 < var2; ++var9) {
         var_3ec.drawImage(var_4b70[var4 + var3[var9]], 35, var1, 6);
         sub_bd5(sub_b56(Class_6b.sub_595(var7 + var3[var9]), 1, var8), 1, 35 + var6 + 2, var1, 6);
         var1 += 20;
         var1 += 4;
      }

   }

   private static void sub_6a7() {
      var_3ec.setColor(16711680);
      int var1 = 100 + 24 * var_4dc4;
      var_3ec.drawRect(32, var1, 176, 20);
      var_3ec.drawRect(31, var1 - 1, 178, 22);
   }

   private static void sub_6c4(int var0) {
      label66: {
         byte var10000;
         byte var10001;
         short var10002;
         byte var10003;
         switch(var0) {
         case 2:
         case 3:
            if(var_4e30) {
               sub_1aca();
               sub_646(var0 == 2);
               sub_47a(true);
               sub_1b25();
            }

            sub_1b40();
            break label66;
         case 4:
            if(var_4e30) {
               sub_1aca();
               sub_62c();
               sub_47a(var_4bd3[2] != null);
               sub_1b25();
            }

            sub_1b40();
            if(var_4bd3[2] == null) {
               break label66;
            }

            var10000 = 7;
            var10001 = 120;
            var10002 = 310;
            var10003 = 33;
            break;
         case 5:
            if(var_4e30) {
               sub_1aca();
               sub_61c();
               sub_47a(var_4bd3[3] != null);
               sub_1b25();
            }

            sub_1b40();
            if(var_4bd3[3] == null) {
               break label66;
            }

            var10000 = 7;
            var10001 = 120;
            var10002 = 310;
            var10003 = 33;
            break;
         default:
            if(var_4e30) {
               sub_1aca();
               sub_5d3(var0);
               sub_47a(var_4bd3[0 + var0] != null);
               sub_1b25();
            }

            sub_1b40();
            if(var_4bd3[0 + var0] == null) {
               break label66;
            }

            var10000 = 3;
            var10001 = 120;
            var10002 = 135;
            var10003 = 3;
         }

         sub_5b4(var10000, var10001, var10002, var10003);
      }

      if(var0 == 2 || var0 == 3) {
         sub_6a7();
      }

      var_4e30 = false;
   }

   private static void sub_723(String var0) {
      try {
         GloftASP3.var_47.platformRequest(var0);
      } catch (Exception var1) {
         ;
      }
   }

   private static void sub_75b() {
      Class_9b.var_e14 = (int[][])null;
      var_2801 = 0;
      var_284e = false;
      var_1150 = false;
      var_11b3 = true;
      var_23b2 = new Class_22[40];
      var_267b = new Class_22[3];
      var_23c4 = new int[22500];
      Class_22.var_a1 = var_23c4;
      var_1e0a = new byte[6];
      var_1e43 = new short[16];
      var_1019 = new byte[6];
      var_1cc4 = 0;
      var_167e = new byte[7][16];
      var_1d55 = new byte[24];
      var_1d1d = new int[24];
      var_120d = new int[22];
      sub_1856();
      var_160d = new int[4];
      var_93b = -1;
      Class_6b.sub_5c8(9, 100);
      var_f28 = false;
      var_1c6a = false;
      sub_79d();
      var_d86 = true;
   }

   private static void sub_79d() {
      var_1d9d = 0;
      var_1de6 = 0;
      var_1cda = 0;
      var_1019[4] = -1;
      var_1019[1] = 0;
      var_1019[2] = 0;
      var_1019[0] = 0;
      var_1019[3] = 0;
      var_1019[5] = 0;
      var_1cc4 = 0;

      int var0;
      for(var0 = 0; var0 < 7; ++var0) {
         for(int var1 = 0; var1 < 16; ++var1) {
            var_167e[var0][var1] = 0;
         }
      }

      for(var0 = 0; var0 < var_1d55.length; ++var0) {
         var_1d55[var0] = 0;
      }

      for(var0 = 0; var0 < var_1d1d.length; ++var0) {
         var_1d1d[var0] = 0;
      }

      for(var0 = 0; var0 < 6; ++var0) {
         var_1e0a[var0] = 0;
      }

      for(var0 = 0; var0 < 16; ++var0) {
         short[] var10000;
         int var10001;
         byte var10002;
         if(var0 == 0) {
            var10000 = var_1e43;
            var10001 = var0;
            var10002 = -1;
         } else {
            var10000 = var_1e43;
            var10001 = var0;
            var10002 = 1;
         }

         var10000[var10001] = var10002;
      }

      var_1cfb = 0;
      var_1c3d = false;
      var_49be = 0;
      var_49db = false;
   }

   static void sub_7b1(int var0) {
      var_2468 = 0;
      var_24d0 = 2;
      var_247f = var0;
   }

   private static void sub_7ff() {
      if(var_24d0 >= 0) {
         switch(var_24d0) {
         case 0:
            var_2468 = 16384;
            break;
         case 1:
            var_267b[0].sub_521(var_24a4, Class_6b.sub_595(var_247f), 95, 14, 3);
            break;
         case 2:
            var_26d3.sub_429(var_24a4, 0, 0, 0, 0);
         }

         --var_24d0;
      }
   }

   private static void sub_810(int var0, int var1) {
      var_3ec.drawImage(var_248c, var0, var1, 0);
   }

   private static void sub_82d(int var0) {
      Class_6b.sub_16c(var0);
      var_15ca = new byte[4];

      int var3;
      for(var3 = 0; var3 < 4; ++var3) {
         var_15ca[var3] = (byte)Class_6b.sub_2c6();
      }

      var_143f = new int[16];
      var_1462 = new int[16];
      var_148c = new byte[16];
      var_14f0 = new int[16][];
      var_1523 = new byte[16][];
      var_1568 = new byte[16][][];

      for(var3 = 0; var3 < 16; ++var3) {
         var_143f[var3] = Class_6b.sub_2f0();
         var_1462[var3] = Class_6b.sub_2c6();
         var_148c[var3] = (byte)Class_6b.sub_2c6();
         var_14f0[var3] = new int[var_148c[var3]];
         var_1568[var3] = new byte[var_148c[var3]][4];
         var_1523[var3] = new byte[var_148c[var3]];
         var_14f0[var3][0] = Class_6b.sub_2f0();

         for(int var4 = 1; var4 < var_148c[var3]; ++var4) {
            int var1 = Class_6b.sub_2f0();
            var_14f0[var3][var4] = var1 & 4095;
            var_1523[var3][var4] = (byte)Class_6b.sub_2c6();
            var1 >>= 12;
            int var2 = Class_6b.sub_2f0();

            for(int var5 = 0; var5 < 4; ++var5) {
               var_1568[var3][var4][var5] = (byte)(var2 >> var5 * 4 & 15);
               if((var1 >> var5 & 1) != 0) {
                  var_1568[var3][var4][var5] = (byte)(-var_1568[var3][var4][var5]);
               }
            }
         }
      }

   }

   private static void sub_879(int[] var0, byte[] var1) {
      int var2;
      for(var2 = 0; var2 < 4; ++var2) {
         var0[var2] = 0;
      }

      for(var2 = 0; var2 < 16; ++var2) {
         for(int var3 = 0; var3 < 4; ++var3) {
            var0[var3] += var_1568[var2][var1[var2]][var3];
         }
      }

      for(var2 = 0; var2 < 4; ++var2) {
         var0[var2] = (var0[var2] * var_15ca[var2] << 12) / 10000;
      }

   }

   private static int sub_8dc(int var0, int var1, int[] var2) {
      int var3 = var2[var1];
      if(var1 == 1 || var1 == 2) {
         var3 = -var3;
      }

      return var0 + (var0 * var3 >> 12);
   }

   private static void sub_939(int var0) {
      Class_22 var10000;
      byte var10001;
      if(var0 > 0) {
         var10000 = var_267b[1];
         var10001 = 1;
      } else if(var0 < 0) {
         var10000 = var_267b[1];
         var10001 = 2;
      } else {
         var10000 = var_267b[1];
         var10001 = 0;
      }

      var10000.var_373 = var10001;
   }

   private static void sub_966(int var0) {
      for(int var1 = 0; var1 < 16; ++var1) {
         var_167e[var0][var1] = var_16d6[var1];
      }

   }

   private static void sub_9c4(int var0) {
      for(int var1 = 0; var1 < 16; ++var1) {
         var_16d6[var1] = var_167e[var0][var1];
      }

   }

   private static void sub_9d1(Class_9b var0, int[] var1) {
      int var2;
      if(var_1019[4] == 0) {
         for(var2 = 0; var2 < var1.length; ++var2) {
            var1[var2] += 20;
         }
      }

      for(var2 = 0; var2 < 4; ++var2) {
         var0.var_21b[var2] = sub_8dc(var0.var_21b[var2], 0, var1);
      }

      var0.var_1d2 = sub_8dc(var0.var_1d2, 2, var1);
      var0.var_175 = sub_8dc(var0.var_175, 1, var1);
   }

   private static void sub_a04(int var0, int var1, int var2) {
      Class_22 var3 = var_23b2[var1];
      int[] var4 = new int[4];
      var3.sub_35d(var4, var2, 0, 0, 0);
      int var7 = var4[0];
      int var8 = var4[1];
      int var5 = var4[2] - var4[0];
      int var6 = var4[3] - var4[1];
      System.gc();
      var4 = new int[var5 * var6];
      byte var9 = var3.var_1d5[var2];
      int var10 = var3.var_1f1[var2] << 2;

      for(int var21 = 0; var21 < var9; ++var21) {
         byte var11 = var3.var_1fb[var10++];
         int var12 = var3.var_1fb[var10++] - var7;
         int var13 = var3.var_1fb[var10++] - var8;
         byte var16 = var3.var_1fb[var10++];
         byte var14 = var3.var_167[var11];
         byte var15 = var3.var_179[var11];
         boolean var19 = (var16 & 1) != 0;
         boolean var20 = (var16 & 2) != 0;
         if(var3.var_42f != null) {
            var3.sub_4b8(var11, 0);
         } else if(var3.var_4c1 != null && var3.var_4c1[var3.var_373] != null && var3.var_4c1[var3.var_373][var11] != null) {
            sub_238a(var3.var_4c1[var3.var_373][var11], var_23c4, 0, var14, 0, 0, var14, var15);
         }

         int var18 = 0;
         byte var10000;
         int var22;
         byte var23;
         if(var20) {
            var22 = var15 - 1;
            var23 = -1;
            var10000 = -1;
         } else {
            var22 = 0;
            var23 = var15;
            var10000 = 1;
         }

         for(byte var24 = var10000; var22 != var23; var22 += var24) {
            int var17 = (var13 + var22) * var5 + var12;
            int var25;
            if(var19) {
               var18 += var14 - 1;

               for(var25 = 0; var25 < var14; ++var25) {
                  if((var_23c4[var18 - var25] & -16777216) != 0) {
                     var4[var17] = var_23c4[var18 - var25];
                  }

                  ++var17;
               }

               ++var18;
            } else {
               for(var25 = var14; var25-- > 0; ++var17) {
                  if((var_23c4[var18] & -16777216) != 0) {
                     var4[var17] = var_23c4[var18];
                  }

                  ++var18;
               }
            }
         }
      }

      var_2437[var0] = var4;
      var_23e6[var0] = new byte[4];
      var_23e6[var0][0] = (byte)var5;
      var_23e6[var0][1] = (byte)var6;
      var_23e6[var0][2] = (byte)var7;
      var_23e6[var0][3] = (byte)var8;
   }

   static void sub_a18(int var0, int var1, int var2, int var3, int var4) {
      int[] var15 = var_2437[var0];
      if(var1 > 8192) {
         var1 = 8192;
      }

      byte var5 = var_23e6[var0][0];
      byte var6 = var_23e6[var0][1];
      byte var7 = var_23e6[var0][2];
      byte var8 = var_23e6[var0][3];
      int var9 = var5 * var1 >> 12;
      int var10 = var6 * var1 >> 12;
      int var11 = var7 * var1 >> 12;
      int var12 = var8 * var1 >> 12;
      int var16;
      byte var10000;
      if((var4 & 1) == 0) {
         var16 = 0;
         var10000 = 1;
      } else {
         var16 = var9 - 1;
         var10000 = -1;
      }

      byte var20 = var10000;
      int var17;
      if((var4 & 2) == 0) {
         var17 = 0;
         var10000 = 1;
      } else {
         var17 = var10 - 1;
         var10000 = -1;
      }

      byte var21 = var10000;
      int var19 = var17;

      for(int var22 = 0; var22 < var10; ++var22) {
         int var18 = var16;

         for(int var23 = 0; var23 < var9; ++var23) {
            int var13 = (var23 - (var9 >> 1) << 12) / var1 + (var5 >> 1);
            int var14 = (var22 - (var10 >> 1) << 12) / var1 + (var6 >> 1);
            if(var13 < 0) {
               var13 = 0;
            }

            if(var13 >= var5) {
               var13 = var5 - 1;
            }

            if(var14 < 0) {
               var14 = 0;
            }

            if(var14 >= var6) {
               var14 = var6 - 1;
            }

            var_23c4[var18 + var19 * var9] = var15[var13 + var14 * var5];
            var18 += var20;
         }

         var19 += var21;
      }

      var2 += var11;
      var3 += var12;

      try {
         var_3ec.drawRGB(var_23c4, 0, var9, var2, var3, var9, var10, true);
      } catch (Exception var24) {
         ;
      }
   }

   private static void sub_a2a(int var0, int var1) {
      int[] var2;
      int var3 = (var2 = var_2437[var0]).length;
      var1 &= 255;

      for(int var5 = var3 - 1; var5 >= 0; --var5) {
         if((var2[var5] & -16777216) != 0) {
            int var4 = var2[var5] & 16777215 | var1 << 24;
            var2[var5] = var4;
         }
      }

   }

   private static void sub_a6c(int var0, int var1, int var2, int var3) {
      int var4;
      int var5 = (var4 = var_3ec.getClipX()) + var_3ec.getClipWidth();
      int var6;
      int var7 = (var6 = var_3ec.getClipY()) + var_3ec.getClipHeight();
      if(var0 < var5 && var0 + var2 >= var4 && var1 < var7 && var1 + var3 >= var6) {
         int var8;
         if(var0 < var4) {
            var8 = var4 - var0;
            var0 += var8;
            var2 -= var8;
         }

         if(var0 + var2 >= var5) {
            var8 = var0 + var2 - var5;
            var2 -= var8;
         }

         if(var1 < var6) {
            var8 = var6 - var1;
            var1 += var8;
            var3 -= var8;
         }

         if(var1 + var3 >= var7) {
            var8 = var1 + var3 - var7;
            var3 -= var8;
         }

         var_3ec.fillRect(var0, var1, var2, var3);
      }
   }

   static void sub_ac9(int var0, int var1, int var2, int var3, int var4, int var5) {
      var_3ec.fillTriangle(var0, var1, var2, var3, var4, var5);
   }

   private static void sub_b01(int var0, int var1, int var2) {
      int var5 = 0;
      boolean var8 = false;
      if(var0 < 0) {
         var0 = -var0;
         var8 = true;
      }

      int var3 = var_4ed3.length - 1;
      if(var1 >= 0) {
         byte[] var6;
         int var4 = (var6 = Class_6b.sub_595(var1)).length;
         var3 -= var4;
         System.arraycopy(var6, 0, var_4ed3, var3 + 1, var4);
         var_4ed3[var3--] = 32;
      }

      do {
         ++var5;
         var_4ed3[var3--] = (byte)(var0 % 10 + 48);
         var0 /= 10;
         if(var2 == var5) {
            byte var9 = 46;
            if(var_93b == 3) {
               var9 = 44;
            }

            if(var_93b == 1) {
               var9 = 44;
            }

            var_4ed3[var3--] = var9;
         }

         if(var0 > 0 && (var1 == 47 || var1 == 83) && var5 % 3 == 0) {
            var_4ed3[var3--] = 32;
         }
      } while(var3 >= 0 && var0 > 0);

      if(var8 && var3 >= 0) {
         var_4ed3[var3--] = 45;
      }

      var_4f04 = var3 + 1;
      var_4f5e = var_4ed3.length;
   }

   private static int sub_b20(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      sub_b01(var0, var1, var2);
      Class_22.var_740 = var_4f04;
      Class_22.var_76d = var_4f5e;
      sub_bc7(var_4ed3, var3, var4, var5, var6);
      Class_22.var_740 = -1;
      Class_22.var_76d = -1;
      return Class_22.var_524;
   }

   private static int sub_b45(byte[] var0, int var1, int var2, int var3) {
      int var5 = var2;
      int var6 = var0.length;
      boolean var9 = true;
      int var4 = 0;
      int var8 = var2;
      int var7 = var2;

      while(var4 < var3) {
         if(var5 == var6 || var0[var5] == 10) {
            if(var9) {
               var_267b[var1].sub_4f8(var0, var7, var5);
               var4 += Class_22.var_524;
            }

            return var4 < var3?var5:var8;
         }

         if(var9) {
            if(var0[var5] == 32) {
               var_267b[var1].sub_4f8(var0, var7, var5);
               if((var4 += Class_22.var_524) >= var3) {
                  return var8;
               }

               var8 = var5;
               var9 = false;
            } else {
               ++var5;
            }
         } else if(var0[var5] == 32) {
            var4 += var_267b[var1].var_6f0[3];
            ++var5;
         } else {
            var7 = var5;
            var9 = true;
         }
      }

      return var8;
   }

   private static byte[] sub_b56(byte[] var0, int var1, int var2) {
      int var3 = 0;
      int var5;
      byte[] var9 = new byte[var5 = var0.length];
      System.arraycopy(var0, 0, var9, 0, var5);

      int var4;
      for(; var3 < var5; var3 = var4 + 1) {
         if((var4 = sub_b45(var0, var1, var3, var2)) == var3) {
            var4 = var5;
         }

         if(var4 < var5) {
            var9[var4] = 10;
         }
      }

      return var9;
   }

   private static void sub_b8e(int var0, int var1, int var2, int var3, int var4) {
      sub_bc7(Class_6b.sub_595(var0), var1, var2, var3, var4);
   }

   private static void sub_bc7(byte[] var0, int var1, int var2, int var3, int var4) {
      var_267b[var1].sub_521(var_3ec, var0, var2, var3, var4);
   }

   private static void sub_bd5(byte[] var0, int var1, int var2, int var3, int var4) {
      var_267b[var1].sub_550(var_3ec, var0, var2, var3, var4);
   }

   private static byte[] sub_c2d(byte[] var0, byte[] var1) {
      byte[] var2 = new byte[var0.length + var1.length];
      System.arraycopy(var0, 0, var2, 0, var0.length);
      System.arraycopy(var1, 0, var2, var0.length, var1.length);
      return var2;
   }

   private static boolean sub_c49(boolean var0) {
      RecordStore var4 = null;
      RecordEnumeration var5 = null;
      var_4fbe = true;

      try {
         byte[] var6 = new byte[290];
         var5 = (var4 = RecordStore.openRecordStore("Asphalt3", true)).enumerateRecords((RecordFilter)null, (RecordComparator)null, false);
         int var1;
         int var21;
         if(var0) {
            var6[0] = 33;
            var6[1] = (byte)var_93b;
            var6[2] = (byte)(var_1c3d?1:0);
            var6[4] = (byte)var_1c98;
            var6[3] = (byte)(var_1c6a?1:0);
            var6[5] = (byte)(var_d86?1:0);
            var6[6] = (byte)var_1cc4;
            System.arraycopy(var_1019, 0, var6, 7, 6);
            System.arraycopy(var_1e0a, 0, var6, 13, 6);
            System.arraycopy(var_1e0a, 0, var6, 13, 6);
            var6[19] = (byte)(var_1d9d >>> 8);
            var6[20] = (byte)(var_1d9d & 255);
            var6[21] = (byte)var_1de6;

            for(var1 = 0; var1 < 16; ++var1) {
               var6[22 + 2 * var1] = (byte)(var_1e43[var1] >>> 8);
               var6[22 + 2 * var1 + 1] = (byte)(var_1e43[var1] & 255);
            }

            var6[54] = (byte)(var_1cda >>> 24);
            var6[55] = (byte)(var_1cda >>> 16);
            var6[56] = (byte)(var_1cda >>> 8);
            var6[57] = (byte)(var_1cda & 255);

            for(var1 = 0; var1 < 7; ++var1) {
               System.arraycopy(var_167e[var1], 0, var6, 58 + var1 * 16, 16);
            }

            for(var1 = 0; var1 < 24; ++var1) {
               var6[170 + (var1 << 2)] = (byte)(var_1d1d[var1] >>> 24);
               var6[170 + (var1 << 2) + 1] = (byte)(var_1d1d[var1] >>> 16);
               var6[170 + (var1 << 2) + 2] = (byte)(var_1d1d[var1] >>> 8);
               var6[170 + (var1 << 2) + 3] = (byte)(var_1d1d[var1] & 255);
            }

            System.arraycopy(var_1d55, 0, var6, 266, 24);
            if(var5.hasNextElement()) {
               var21 = var5.nextRecordId();
               var4.setRecord(var21, var6, 0, var6.length);
            } else {
               var4.addRecord(var6, 0, var6.length);
            }

            return true;
         }

         try {
            var21 = var5.nextRecordId();
            if((var6 = var4.getRecord(var21))[0] == 33) {
               var_93b = var6[1];
               var_1c3d = var6[2] != 0;
               var_1c6a = var6[3] != 0;
               var_1c98 = var6[4];
               var_d86 = var6[5] != 0;
               var_1cc4 = var6[6];
               System.arraycopy(var6, 7, var_1019, 0, 6);
               System.arraycopy(var6, 13, var_1e0a, 0, 6);
               var_1d9d = (short)((var6[19] & 255) << 8 | var6[20] & 255);
               var_1de6 = var6[21];

               for(var1 = 0; var1 < 16; ++var1) {
                  var_1e43[var1] = (short)((var6[22 + 2 * var1] & 255) << 8 | var6[22 + 2 * var1 + 1] & 255);
               }

               var_1cda = (var6[54] & 255) << 24 | (var6[55] & 255) << 16 | (var6[56] & 255) << 8 | var6[57] & 255;

               for(var1 = 0; var1 < 7; ++var1) {
                  for(int var2 = 0; var2 < 16; ++var2) {
                     var_167e[var1][var2] = var6[58 + var1 * 16 + var2];
                  }
               }

               for(var1 = 0; var1 < 24; ++var1) {
                  var_1d1d[var1] = (var6[170 + (var1 << 2)] & 255) << 24 | (var6[170 + (var1 << 2) + 1] & 255) << 16 | (var6[170 + (var1 << 2) + 2] & 255) << 8 | var6[170 + (var1 << 2) + 3] & 255;
               }

               System.arraycopy(var6, 266, var_1d55, 0, 24);
            }

            return true;
         } catch (InvalidRecordIDException var18) {
            var5.reset();
            return false;
         }
      } catch (RecordStoreException var19) {
         boolean var7 = false;
      } finally {
         if(var5 != null) {
            var5.destroy();
         }

         if(var4 != null) {
            try {
               var4.closeRecordStore();
            } catch (RecordStoreException var17) {
               ;
            }
         }

         System.gc();
         var_4fbe = false;
      }

      return false;
   }

   static void sub_c6a() {
      if(!var_4832) {
         var_2bd6 = var_44e8.var_5d4;
         var_4832 = true;
         var_486c = 14336;
         Class_9b.sub_60e();
         var_44e8.var_2f5 = 1;
         sub_283(41);
      }

   }

   private static void sub_cb7(boolean var0, int var1, int var2, int var3, int var4, int var5, boolean var6) {
      int var7 = var_5005[var1];
      var_1ea4 += var2;
      var_1f1f += var3;
      var_2017 |= 524288;
      if(var_105e != 3 && var_105e != 1) {
         var_2017 |= 4;
      }

      if(var_105e == 3 && var0) {
         if(var7 > var_1ed8) {
            var7 = var_1ed8;
         }

         var_1ed8 -= var7;
         var_2017 |= 64;
         var_120d[var4] -= var7;
         if(var5 < 0) {
            return;
         }
      } else {
         boolean var8 = var_4651.var_48;
         if(var6) {
            var_25c4 += var7;
            ++var_262f;
            var_25dd = 8192;
         } else {
            var_1ed8 += var7;
            if(var8) {
               var_1ed8 += var7;
               var_120d[13] += var7;
            }

            var_2017 |= 64;
         }

         var_120d[var4] += var7;
         if(var5 < 0) {
            return;
         }
      }

      ++var_120d[var5];
   }

   static void sub_cd9(int var0, boolean var1) {
      var_2537[var_252a] = var0 + 37;
      var_2581[var_252a] = 4096;
      var_2591[var_252a] = var1;
      ++var_252a;
      if(var_252a == 1) {
         var_252a = 0;
      }

   }

   static void sub_d31(int var0, int var1) {
      for(int var3 = 0; var3 < 1; ++var3) {
         if(var_2581[var3] > 0) {
            int var2 = (4096 - var_2581[var3]) * 30 / 4096;
            if(var_2591[var3]) {
               var_26a9.sub_429(var_3ec, 54, var0, var1 - var2, 0);
            }

            var_26a9.sub_429(var_3ec, var_2537[var3], var0, var1 - var2, 0);
            var_2581[var3] -= var_837;
         }
      }

   }

   static void sub_d62(int var0) {
      label78: {
         boolean var10000;
         byte var10001;
         byte var10002;
         short var10003;
         byte var10004;
         byte var10005;
         boolean var10006;
         label77: {
            switch(var0) {
            case 0:
               var10000 = false;
               var10001 = 2;
               var10002 = 2;
               var10003 = 10;
               var10004 = 5;
               var10005 = 6;
               break;
            case 1:
               var10000 = false;
               var10001 = 3;
               var10002 = 3;
               var10003 = 20;
               var10004 = 7;
               var10005 = 8;
               break;
            case 2:
               var10000 = true;
               var10001 = 1;
               var10002 = 2;
               var10003 = 25;
               var10004 = 13;
               var10005 = -1;
               break;
            case 3:
               if(var_44e8.var_341 <= 227555) {
                  break label78;
               }

               var10000 = false;
               var10001 = 3;
               var10002 = 3;
               var10003 = 512;
               var10004 = 11;
               var10005 = 12;
               break;
            case 4:
               var10000 = false;
               var10001 = 3;
               var10002 = 2;
               var10003 = 256;
               var10004 = 9;
               var10005 = 10;
               break;
            case 5:
               if(var_105e != 3 && var_44e8.var_341 > 170666) {
                  int var1 = var_44e8.var_341 >= 341333?4096:(var_44e8.var_341 - 170666 << 12) / 170667;
                  var_22bf = 4 + (Math.min(Math.max(var1, 0), 4096) * 6 >> 12);
                  sub_cb7(true, var_22bf, 2 + (Math.min(Math.max(var1, 0), 4096) * 8 >> 12), 512 + (Math.min(Math.max(var1, 0), 4096) * 512 >> 12), 13, -1, false);
                  var_22a5 = true;
                  var_2c34 = 0;
                  var_2267 = 16384;
                  sub_283(42);
               }
               break label78;
            case 6:
               var10000 = true;
               var10001 = 4;
               var10002 = 2;
               var10003 = 85;
               var10004 = 3;
               var10005 = 4;
               break;
            case 7:
            case 12:
               var10000 = true;
               var10001 = 3;
               var10002 = 5;
               var10003 = 51;
               var10004 = 3;
               var10005 = 4;
               break;
            case 8:
            case 10:
            case 14:
               var10000 = var0 != 14;
               var10001 = 5;
               var10002 = 5;
               var10003 = 256;
               var10004 = 3;
               var10005 = 4;
               var10006 = true;
               break label77;
            case 9:
            default:
               break label78;
            case 11:
               var10000 = true;
               var10001 = 5;
               var10002 = 5;
               var10003 = 256;
               var10004 = 3;
               var10005 = 4;
               var10006 = true;
               break label77;
            case 13:
               var10000 = true;
               var10001 = 5;
               var10002 = 5;
               var10003 = 256;
               var10004 = 3;
               var10005 = 4;
               var10006 = true;
               break label77;
            case 15:
               if(var_44e8.var_70e >= 2) {
                  return;
               }

               var_1fbb = var_35f4 - var_44e8.var_532 + var_48ad;
               var_1fbb <<= 10;
               var_1fbb /= 100;
               break label78;
            case 17:
               var10000 = true;
               var10001 = 9;
               var10002 = 20;
               var10003 = 2048;
               var10004 = 1;
               var10005 = 2;
               var10006 = true;
               break label77;
            case 18:
               var10000 = false;
               var10001 = 9;
               var10002 = 20;
               var10003 = 1536;
               var10004 = 1;
               var10005 = 2;
               var10006 = true;
               break label77;
            case 19:
               var10000 = true;
               var10001 = 8;
               var10002 = 15;
               var10003 = 768;
               var10004 = 1;
               var10005 = 2;
               var10006 = true;
               break label77;
            case 20:
               var_4943 = true;
            case 16:
               var10000 = false;
               var10001 = 8;
               var10002 = 15;
               var10003 = 1536;
               var10004 = 1;
               var10005 = 2;
               var10006 = true;
               break label77;
            }

            var10006 = false;
         }

         sub_cb7(var10000, var10001, var10002, var10003, var10004, var10005, var10006);
      }

      if(var_1ea4 > 250) {
         var_1ea4 = 250;
      }

      if(var_1f1f > 4096) {
         var_1f1f = 4096;
      }

      if(var_1f5b <= 0 || var0 + 20 >= var_1f82) {
         if(var_1f5b > 0) {
            var_2017 |= 128;
         }

         var_2017 |= 1;
         var_1f82 = var0 + 20;
         var_1f5b = 12288;
      }

   }

   static void sub_d76() {
      var_2801 = 12288;
      var_284e = true;
   }

   private static void sub_dbf(Class_9b var0) {
      if(var0.var_c == 3 || var0.var_c == 1) {
         ++var_2780;
      }

      var_2017 |= 16;
   }

   static void sub_e20(Class_9b var0, int var1) {
      int var10000;
      if(var1 == 0) {
         if(var_105e == 3) {
            var10000 = var0.var_c == 3?17:(var0.var_98 == 0?20:19);
         } else {
            if(var_105e == 2) {
               sub_dbf(var0);
            }

            if(var0.var_c == 3) {
               var10000 = 17;
            } else {
               if(var0.var_c != 1) {
                  return;
               }

               var10000 = 16;
            }
         }
      } else if(var0.var_c == 2) {
         var10000 = var_105e == 3?12:7;
      } else if(var0.var_c == 1) {
         var10000 = var_105e == 3?(var0.var_98 == 0?14:13):(var1 == 3?(var_44e8.var_2f5 > 1?9:8):10);
      } else {
         if(var0.var_c != 3) {
            return;
         }

         var10000 = 11;
      }

      sub_d62(var10000);
   }

   private static void sub_e76(int var0) {
      if(var_105e == 1) {
         byte var1;
         if(((var1 = var_1019[3]) == 0 || var1 == 2) && !var_45ee.var_48) {
            var_505d += var0;
            if(var_505d >= 20480) {
               Class_9b.sub_14c();
               var_505d = 0;
            }
         }

         if((var1 == 1 || var1 == 2) && !var_4651.var_48) {
            var_50a1 += var0;
            if(var_50a1 >= '\ua000') {
               Class_9b.sub_919();
               var_50a1 = 0;
            }
         }

         if(var_44e8.var_70e >= 2 && !var_467f.var_48) {
            var_4543 = var_3782;
            return;
         }
      } else if(var_105e == 0 || var_105e == 2 || var_105e == 4) {
         if(var_5017 > var_1ea4) {
            var_5017 = var_1ea4;
         }

         int var2 = var_1019[4] == 2?122:172;
         if(var_1ea4 >= 95 && var_5017 < 95) {
            Class_9b.sub_14c();
         }

         if(var_1ea4 >= var2 && var_5017 < var2) {
            Class_9b.sub_26f();
         }

         int var10000;
         if(var_1ea4 >= 210) {
            label78: {
               if(var_50a1 >= 20480) {
                  if(var_44e8.var_70e >= var_48e7 && var_44e8.var_532 > var_35f4 - 20) {
                     break label78;
                  }

                  Class_9b.sub_919();
                  var10000 = 0;
               } else {
                  var10000 = var_50a1 + var0;
               }

               var_50a1 = var10000;
            }
         }

         if(var_1ea4 >= 250) {
            if(var_45ee.var_48) {
               var10000 = 0;
            } else if(var_505d >= '\ua000') {
               Class_9b.sub_14c();
               var10000 = 0;
            } else {
               var10000 = var_505d + var0;
            }

            var_505d = var10000;
         }

         var_5017 = var_1ea4;
      }

   }

   private static int sub_ed1(int var0, Class_9b var1) {
      int var4 = -1;

      try {
         Class_6b.sub_cf("/7");
         Class_6b.sub_16c(var0);
         var1.sub_994(0, 0, 0, 0);
         var4 = Class_6b.sub_2c6();
         var1.var_2af = Class_6b.sub_2c6() != 0;
         var1.var_1d2 = Class_6b.sub_2f0() << 12;
         var1.var_175 = Class_6b.sub_473(Class_6b.sub_2f0(), 8);

         int var3;
         int var5;
         for(var3 = 0; var3 < 4; ++var3) {
            var5 = Class_6b.sub_2f0();
            var1.var_21b[var3] = (var5 << 12) * 10 / 36;
         }

         int var2 = Class_6b.sub_2c6();
         var1.var_266 = new int[var2 + 1];
         var1.var_266[0] = 0;

         for(var3 = 0; var3 < var2; ++var3) {
            var5 = Class_6b.sub_2f0();
            var1.var_266[var3 + 1] = (var5 << 12) * 10 / 36;
         }

         var1.var_d3 = new short[12];
         int var6 = (Class_6b.sub_2c6() * 10 << 12) / 1000;
         var1.var_d3[0] = (short)var6;
         var6 = (Class_6b.sub_2c6() * 10 << 12) / 1000;
         var1.var_d3[1] = (short)var6;
         var1.var_d3[2] = (short)(Class_6b.sub_2c6() * 100);
         var1.var_3e5 = var1.var_d3[2];
         var1.var_d3[4] = (short)Class_6b.sub_2c6();
         var1.var_d3[5] = (short)Class_6b.sub_2c6();
         var1.var_d3[6] = (short)Class_6b.sub_2c6();
         var1.var_d3[7] = (short)Class_6b.sub_2c6();
         var1.var_d3[8] = (short)Class_6b.sub_2c6();
         int var7 = Class_6b.sub_2c6();
         var1.var_d3[9] = (short)(var7 * 10);
         var1.var_d3[10] = (short)Class_6b.sub_2c6();
         var1.var_d3[11] = (short)Class_6b.sub_2c6();
         if(var1.var_c == 0) {
            Class_9b.var_a93 = new byte[6][];

            for(var3 = 0; var3 < 6; ++var3) {
               int var8 = Class_6b.sub_2c6();
               Class_9b.var_a93[var3] = new byte[var8 * 3];
               if(var8 > 0) {
                  Class_6b.sub_248(Class_9b.var_a93[var3], 0, var8 * 3);
               }
            }
         } else {
            for(var3 = 0; var3 < 6; ++var3) {
               Class_6b.sub_1a9(Class_6b.sub_2c6() * 3);
            }
         }

         var1.var_126 = (byte)Class_6b.sub_2c6();
      } catch (Exception var9) {
         ;
      }

      return var4;
   }

   private static void sub_f2c(int var0) {
      Class_6b.sub_16c(var_2f7[var0][0]);
      var_1b64[var0] = Class_6b.sub_2c6();
      Class_6b.sub_1a9(13);
      int var2 = Class_6b.sub_2c6();
      Class_6b.sub_1a9(2 * var2 + 11);

      for(var2 = 0; var2 < 6; ++var2) {
         Class_6b.sub_1a9(Class_6b.sub_2c6() * 3);
      }

      int var1 = Class_6b.sub_2c6();
      var_1786[var0] = new int[var1];

      for(var2 = 0; var2 < var1; ++var2) {
         var_1786[var0][var2] = -16777216 | Class_6b.sub_2c6() << 16 | (Class_6b.sub_2c6() & 255) << 8 | Class_6b.sub_2c6() & 255;
      }

      var_17dd[var0] = (byte)Class_6b.sub_2c6();
      var_1830[var0][0] = (short)Class_6b.sub_2f0();
      var_1830[var0][1] = (short)Class_6b.sub_2c6();
      var_1830[var0][2] = (short)Class_6b.sub_2c6();
      var_1830[var0][3] = (short)(Class_6b.sub_2c6() * 10);
      var_1830[var0][4] = (short)Class_6b.sub_2f0();
      var_1830[var0][5] = (short)Class_6b.sub_2f0();
      int var5 = Class_6b.sub_2c6();

      for(var2 = 0; var2 < var5; ++var2) {
         int var4 = Class_6b.sub_2c6();
         var_1729[var0][var4] = Class_6b.sub_2f0();
      }

      for(var2 = 0; var2 < 16; ++var2) {
         var_1729[var0][var2] |= 1;
      }

      var_1729[var0][0] = (1 << var1) - 1;
   }

   private static void sub_f56(Class_22 var0, int var1, int var2, Class_22 var3, int var4) {
      Image var5;
      int var10 = (var5 = var0.var_4c1[var1][var2]).getWidth();
      int var11 = var5.getHeight();
      Image var6;
      Graphics var7;
      int var8 = (var7 = (var6 = Image.createImage(var10, var11)).getGraphics()).getDisplayColor(16711935) & 16777215;
      var7.setColor(var8);
      var7.fillRect(0, 0, var10, var11);
      var7.drawImage(var5, 0, 0, 0);
      var3.sub_429(var7, var4, 0, 0, 0);
      sub_238a(var6, var_23c4, 0, var10, 0, 0, var10, var11);

      for(int var9 = 0; var9 < var10 * var11; ++var9) {
         if((var_23c4[var9] & 16777215) == var8) {
            var_23c4[var9] = 0;
         }
      }

      var0.var_4c1[var1][var2] = Image.createRGBImage(var_23c4, var10, var11, true);
   }

   private static void sub_f68() {
      var_2866 = new byte[3][];
      var_2891 = new short[3][4];

      try {
         for(int var0 = 0; var0 < 3; ++var0) {
            Class_6b.sub_16c(1 + var0);
            int var2 = Class_6b.sub_2f0();
            var_2866[var0] = new byte[Class_6b.sub_2f0() + 1];

            int var1;
            for(var1 = 0; var1 < 4; ++var1) {
               var_2891[var0][var1] = (short)Class_6b.sub_2f0();
            }

            for(var1 = 0; var1 < var_2866[var0].length; ++var1) {
               var_2866[var0][var1] = 0;
            }

            for(var1 = 0; var1 < var2; ++var1) {
               var_2866[var0][Class_6b.sub_2f0()] = (byte)var1;
            }
         }

      } catch (Exception var3) {
         ;
      }
   }

   private static void sub_f9b(int var0, int var1) {
      var_267b[var1] = new Class_22();
      var_267b[var1].sub_5d(Class_6b.sub_27d(var0), 0, 0, -1);
      var_267b[var1].var_6a3 = var_2866[var1];
      var_267b[var1].var_6f0 = var_2891[var1];
   }

   private static void sub_fb9() {
      int var0;
      int var1;
      Class_22 var2;
      if((var2 = var_267b[0]).var_4c1 != null) {
         for(var0 = 0; var0 < var2.var_325; ++var0) {
            if(var0 != 0 && var2.var_4c1[var0] != null) {
               for(var1 = 0; var1 < var2.var_4c1[var0].length; ++var1) {
                  var2.var_4c1[var0][var1] = null;
               }

               var2.var_4c1[var0] = null;
            }
         }
      }

      var2.sub_c7();
      if((var2 = var_267b[1]).var_4c1 != null) {
         for(var0 = 0; var0 < var2.var_325; ++var0) {
            if(var0 != 0 && var2.var_4c1[var0] != null) {
               for(var1 = 0; var1 < var2.var_4c1[var0].length; ++var1) {
                  var2.var_4c1[var0][var1] = null;
               }
            }
         }
      }

      var2.sub_c7();
      var_267b[2] = null;
   }

   private static void sub_1011(int var0, int var1) {
      try {
         Class_6b.sub_cf("/2");
         Class_6b.sub_16c(var0);
         int var10 = Class_6b.sub_2c6();
         Class_6b.sub_1a9(45 * var1 + 7);
         int var8 = Class_6b.sub_2c6();
         Class_6b.sub_1a9(45 * (var10 - var1 - 1) + 37);
         var_2e02 = new int[7];
         var_2e02[0] = Class_6b.sub_2c6();
         var_2e02[1] = Class_6b.sub_2c6();
         var_2f40 = 55 + Class_6b.sub_2c6();
         var_3003 = 55 + Class_6b.sub_2c6();
         var_30ab = Class_6b.sub_2c6();
         var_30e8 = Class_6b.sub_2c6();
         var_3154 = -16777216 | Class_6b.sub_2c6() << 16 | (Class_6b.sub_2c6() & 255) << 8 | Class_6b.sub_2c6() & 255;
         var_316b = -16777216 | Class_6b.sub_2c6() << 16 | (Class_6b.sub_2c6() & 255) << 8 | Class_6b.sub_2c6() & 255;
         var_31a9 = -16777216 | Class_6b.sub_2c6() << 16 | (Class_6b.sub_2c6() & 255) << 8 | Class_6b.sub_2c6() & 255;
         var_31bf = -16777216 | Class_6b.sub_2c6() << 16 | (Class_6b.sub_2c6() & 255) << 8 | Class_6b.sub_2c6() & 255;
         var_31d5 = -16777216 | Class_6b.sub_2c6() << 16 | (Class_6b.sub_2c6() & 255) << 8 | Class_6b.sub_2c6() & 255;
         var_3214 = Class_6b.sub_2f0();
         var_2e02[2] = Class_6b.sub_2c6();
         var_2e02[3] = Class_6b.sub_2c6();
         var_2e02[4] = Class_6b.sub_2f0();
         var_2e02[5] = Class_6b.sub_2f0();
         var_2e02[6] = Class_6b.sub_2f0();
         var_326e = -16777216 | Class_6b.sub_2c6() << 16 | (Class_6b.sub_2c6() & 255) << 8 | Class_6b.sub_2c6() & 255;
         var_3281 = -16777216 | Class_6b.sub_2c6() << 16 | (Class_6b.sub_2c6() & 255) << 8 | Class_6b.sub_2c6() & 255;
         Class_6b.sub_2c6();
         Class_6b.sub_2c6();
         Class_6b.sub_2c6();
         var_32be = Class_6b.sub_2f0();
         var_331e = Class_6b.sub_2f0();
         var_333d = -16777216 | Class_6b.sub_2c6() << 16 | (Class_6b.sub_2c6() & 255) << 8 | Class_6b.sub_2c6() & 255;
         var_338b = -16777216 | Class_6b.sub_2c6() << 16 | (Class_6b.sub_2c6() & 255) << 8 | Class_6b.sub_2c6() & 255;
         byte var2;
         var_349d = (byte)(((var2 = (byte)Class_6b.sub_2c6()) & 112) >> 4);
         var_35ac = (byte)(var2 & 15);
         var_3508 = var_32be * 2 / var_349d;
         var_3542 = -(var_3508 * var_349d) / 2 + var_3508 / 2;
         var_3578 = 0;

         int var15;
         for(var15 = 0; var15 < var_349d; ++var15) {
            if((var_35ac >> var15 & 1) == 1) {
               ++var_3578;
            }
         }

         var_33e5 = -16777216 | Class_6b.sub_2c6() << 16 | (Class_6b.sub_2c6() & 255) << 8 | Class_6b.sub_2c6() & 255;
         var_343d = -16777216 | Class_6b.sub_2c6() << 16 | (Class_6b.sub_2c6() & 255) << 8 | Class_6b.sub_2c6() & 255;
         var_36f3 = Class_6b.sub_2c6();
         if(var_36f3 == 255) {
            var_36f3 = -1;
         }

         var_425c = -16777216 | Class_6b.sub_2c6() << 16 | (Class_6b.sub_2c6() & 255) << 8 | Class_6b.sub_2c6() & 255;
         var_4281 = -16777216 | Class_6b.sub_2c6() << 16 | (Class_6b.sub_2c6() & 255) << 8 | Class_6b.sub_2c6() & 255;
         var_42a5 = -16777216 | Class_6b.sub_2c6() << 16 | (Class_6b.sub_2c6() & 255) << 8 | Class_6b.sub_2c6() & 255;
         var_42b4 = -16777216 | Class_6b.sub_2c6() << 16 | (Class_6b.sub_2c6() & 255) << 8 | Class_6b.sub_2c6() & 255;
         var_42dc = -16777216 | Class_6b.sub_2c6() << 16 | (Class_6b.sub_2c6() & 255) << 8 | Class_6b.sub_2c6() & 255;
         var_4368 = Class_6b.sub_2f0();
         var_4354 = Class_6b.sub_2f0();
         var_42f8 = Class_6b.sub_2f0();
         var_43a8 = -16777216 | Class_6b.sub_2c6() << 16 | (Class_6b.sub_2c6() & 255) << 8 | Class_6b.sub_2c6() & 255;
         var_43da = -16777216 | Class_6b.sub_2c6() << 16 | (Class_6b.sub_2c6() & 255) << 8 | Class_6b.sub_2c6() & 255;
         var_401d = Class_6b.sub_2f0();
         var_4078 = Class_6b.sub_2c6();
         var_40af = Class_6b.sub_2c6();
         var_4113 = Class_6b.sub_2c6();
         var_4166 = Class_6b.sub_2c6();
         if(var_4166 != 0) {
            var_41aa = new int[var_4166];
            var_41dd = new short[var_4166];
            var_4241 = new short[var_4166];

            for(var15 = 0; var15 < var_4166; ++var15) {
               var_41aa[var15] = -16777216 | Class_6b.sub_2c6() << 16 | (Class_6b.sub_2c6() & 255) << 8 | Class_6b.sub_2c6() & 255;
               var_41dd[var15] = (short)Class_6b.sub_2f0();
               var_4241[var15] = (short)Class_6b.sub_2f0();
            }
         } else {
            var_41aa = null;
            var_41dd = null;
            var_4241 = null;
         }

         int var3;
         int var4;
         int var7;
         if((var7 = Class_6b.sub_2f0()) > 0) {
            var_3a70 = new int[var7];
            var_3a9d = new int[var7];
            var_3a02 = new short[var7][];
            var_3a0e = new short[var7][];

            for(var15 = 0; var15 < var7; ++var15) {
               var3 = (var3 = Class_6b.sub_2c6()) == 255?-1:var3;
               var4 = (var4 = Class_6b.sub_2c6()) == 255?-1:var4;
               int var5 = (var5 = Class_6b.sub_2c6()) == 255?-1:var5;
               int var6 = (var6 = Class_6b.sub_2c6()) == 255?-1:var6;
               if(var3 >= 0 && var4 >= 0) {
                  var_3a02[var15] = new short[2];
                  var_3a02[var15][0] = (short)var3;
                  var_3a02[var15][1] = (short)var4;
               }

               if(var5 >= 0 && var6 >= 0) {
                  var_3a0e[var15] = new short[3];
                  var_3a0e[var15][0] = (short)var5;
                  var_3a0e[var15][1] = (short)var6;
                  var_3a0e[var15][2] = 0;
               }

               var_3a70[var15] = Class_6b.sub_2f0();
               var_3a9d[var15] = Class_6b.sub_2f0();
            }
         }

         var_3845 = Class_6b.sub_2f0();
         if(var_3845 > 0) {
            var_3871 = new byte[var_3845];
            var_388c = new short[var_3845][][];
            var_38b0 = new short[var_3845][];

            for(var15 = 0; var15 < var_3845; ++var15) {
               int var11;
               if((var11 = Class_6b.sub_2c6()) > 0) {
                  var_38b0[var15] = new short[var11 * 2];

                  for(var3 = 0; var3 < var_38b0[var15].length; ++var3) {
                     var_38b0[var15][var3] = (short)Class_6b.sub_2f0();
                  }
               }

               var_3871[var15] = (byte)Class_6b.sub_2c6();
               var_388c[var15] = new short[var_3871[var15]][];

               for(var3 = 0; var3 < var_3871[var15]; ++var3) {
                  byte var16;
                  short[] var10000;
                  byte var10001;
                  int var10002;
                  if((var16 = (byte)Class_6b.sub_2c6()) == 0) {
                     var_388c[var15][var3] = new short[4];
                     var_388c[var15][var3][0] = (short)var16;
                     var_388c[var15][var3][1] = (short)Class_6b.sub_2c6();
                     var_388c[var15][var3][2] = (short)Class_6b.sub_2c6();
                     var10000 = var_388c[var15][var3];
                     var10001 = 3;
                     var10002 = Class_6b.sub_2c6();
                  } else {
                     label187: {
                        if(var16 != 1) {
                           if(var16 == 2) {
                              var_388c[var15][var3] = new short[7];
                              var_388c[var15][var3][0] = (short)var16;
                              var_388c[var15][var3][1] = (short)Class_6b.sub_2f0();
                              var_388c[var15][var3][2] = (short)Class_6b.sub_2f0();
                              var_388c[var15][var3][3] = (short)Class_6b.sub_2f0();
                              var_388c[var15][var3][4] = (short)Class_6b.sub_2f0();
                              var_388c[var15][var3][5] = (short)Class_6b.sub_2f0();
                              var10000 = var_388c[var15][var3];
                              var10001 = 6;
                              break label187;
                           }

                           if(var16 != 3) {
                              continue;
                           }
                        }

                        var_388c[var15][var3] = new short[5];
                        var_388c[var15][var3][0] = (short)var16;
                        var_388c[var15][var3][1] = (short)Class_6b.sub_2f0();
                        var_388c[var15][var3][2] = (short)Class_6b.sub_2f0();
                        var_388c[var15][var3][3] = (short)Class_6b.sub_2f0();
                        var10000 = var_388c[var15][var3];
                        var10001 = 4;
                     }

                     var10002 = Class_6b.sub_2f0();
                  }

                  var10000[var10001] = (short)var10002;
               }
            }
         }

         var_38c9 = Class_6b.sub_2f0();
         if(var_38c9 > 0) {
            var_3925 = new int[var_38c9];
            var_39af = new byte[var_38c9];
            var_395f = new int[var_38c9][2];

            for(var15 = 0; var15 < var_38c9; ++var15) {
               var_3925[var15] = Class_6b.sub_2f0();
               var_39af[var15] = (byte)Class_6b.sub_2c6();

               for(var3 = 0; var3 < 2; ++var3) {
                  var_395f[var15][var3] = -16777216 | Class_6b.sub_2c6() << 16 | (Class_6b.sub_2c6() & 255) << 8 | Class_6b.sub_2c6() & 255;
               }
            }
         }

         var_3ac9 = Class_6b.sub_2f0();
         if(var_3ac9 > 0) {
            var_3aea = new byte[var_3ac9];
            var_3af6 = new short[var_3ac9];

            for(var15 = 0; var15 < var_3ac9; ++var15) {
               var_3aea[var15] = (byte)Class_6b.sub_2c6();
               var_3af6[var15] = (short)Class_6b.sub_2f0();
            }
         }

         Class_9b.var_e14 = new int[8][];

         for(var15 = 0; var15 < 8; ++var15) {
            Class_9b.var_e14[var15] = new int[2];
         }

         Class_6b.sub_2c6();

         for(var15 = 0; var15 < var8; ++var15) {
            var_35f4 = Class_6b.sub_2f0();
            Class_6b.sub_1a9(var_35f4 * 5);
         }

         var_35f4 = Class_6b.sub_2f0();
         var_3629 = new int[var_35f4];
         var_363f = new int[var_35f4];
         var_3694 = new byte[var_35f4];

         for(var15 = 0; var15 < var_35f4; ++var15) {
            if((var4 = (var3 = Class_6b.sub_2f0()) >> 11 & 31) > 15) {
               var4 -= 32;
            }

            var_3629[var15] = (var4 << 11) / 360;
            if((var4 = var3 >> 6 & 31) > 15) {
               var4 -= 32;
            }

            var_363f[var15] = (var4 << 11) / 360;
            var4 = var3 & 63;
            var_3694[var15] = (byte)var4;
         }

         var_3b22 = new short[var_35f4];

         for(var15 = 0; var15 < var_35f4; ++var15) {
            short var17 = (short)Class_6b.sub_2f0();
            var_3b22[var15] = var17;
            if((var17 & '\uf000') == 16384) {
               int var12 = var_3aea[var17 & 2047] & 255;
               short var13 = var_3a02[var12][1];
               if((var_105e == 1 || var_105e == 3) && var13 != 1 && var13 != 2) {
                  var_3b22[var15] = 0;
               }
            }
         }

         var_3b5b = new byte[var_35f4];

         for(var15 = 0; var15 < var_35f4; ++var15) {
            var_3b5b[var15] = (byte)Class_6b.sub_2c6();
         }

         var_2437 = new int[10 + var7][];
         var_23e6 = new byte[10 + var7][];
         var_3782 = true;
         var_37a2 = 0;
         var_43ed = new int[4];
         var_43ed[0] = 420;
         var_43ed[1] = 420;
         var_43ed[2] = 400;
         var_43ed[3] = 390;
         var_4434 = new int[4];
         var_4434[0] = 128;
         var_4434[1] = 128;
         var_4434[2] = 120;
         var_4434[3] = 115;
         var_4476 = new int[4];
         var_4476[0] = 0;
         var_4476[1] = 0;
         var_4476[2] = 10;
         var_4476[3] = 20;
         Class_6b.sub_1cc();
      } catch (Exception var14) {
         ;
      }
   }

   private static void sub_1055(boolean var0) {
      int var1;
      for(var1 = 0; var1 < var_3a02.length; ++var1) {
         if(var_3a02[var1] != null) {
            short var2 = var_3a02[var1][0];
            short var3 = var_3a02[var1][1];
            if(var0) {
               sub_a04(10 + var1, var2, var3);
            } else {
               sub_114d(var2);
            }

            short var4;
            if(var_3a0e[var1] != null && (var4 = var_3a0e[var1][0]) >= 0 && !var0) {
               sub_114d(var4);
            }
         }
      }

      if(var0) {
         for(var1 = 0; var1 < var_3a02.length; ++var1) {
            if(var_3a02[var1] != null) {
               sub_11f7(var_3a02[var1][0]);
            }

            Class_22 var6;
            if(var_3a0e[var1] != null && (var6 = var_23b2[var_3a0e[var1][0]]).var_42f != null) {
               var6.sub_a6(0, 0, -1, -1);
               var6.sub_c7();
            }
         }
      }

      System.gc();
   }

   private static void sub_1068(int var0) {
      sub_238a(var_2e70[var0], var_2e30, 0, 87, 0, 0, 87, 22);
      var_2e70[var0] = null;
      System.gc();
      sub_10bb(var_2e30, var_3254[var0], 22, 518, var_31a9, var_31bf, var_2e02[5], var_2e02[6], var_2e02[4]);
   }

   private static void sub_10bb(int[] var0, Image[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      boolean var9 = false;
      int var14 = 0;

      for(int var15 = var2; var15 <= var3; var15 += 4) {
         int var10;
         int var13;
         label19: {
            var13 = 0;
            var10 = 0;
            int var10000;
            if(var15 >= var7) {
               var13 = (var15 - var7 << 8) / (var3 - var7);
               var10000 = var4;
            } else {
               if(var15 > var6) {
                  break label19;
               }

               var13 = (var15 - var6 << 8) / (var2 - var6);
               var10000 = var5;
            }

            var10 = var10000;
         }

         int var11;
         int var12 = (var11 = 256000 / var15) * 21 / var8 % 22;
         sub_111e(var0, var_23c4, var15, var12, 1, var10, var13);
         var1[var14++] = Image.createRGBImage(var_23c4, var15, 1, false);
      }

   }

   private static void sub_111e(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6) {
      int var12 = '\uae00' / var2;

      for(int var14 = 0; var14 < var4; ++var14) {
         int var13;
         for(var13 = var3 + var14; var13 >= 22; var13 -= 22) {
            ;
         }

         int var7 = 87 * var13 << 8;
         int var8 = var14 * var2;

         for(int var9 = 0; var9 < var2 >> 1; ++var9) {
            int var10 = var0[var7 >> 8];
            if(((var7 >> 8) + 1) % 87 != 0) {
               var10 = sub_112a(var0[(var7 >> 8) + 1], var10, var7 & 255);
            }

            var10 = sub_112a(var5, var10, var6);
            var1[var8 + var9] = var10;
            var1[var8 + (var2 - var9 - 1)] = var10;
            var7 += var12;
         }
      }

   }

   private static int sub_112a(int var0, int var1, int var2) {
      int var3 = 16711680;
      int var4 = -16777216;
      if(var2 <= 0) {
         return var1;
      } else if(var2 >= 256) {
         return var0;
      } else {
         while(var3 > 0) {
            var4 |= (var0 & var3) * var2 + (var1 & var3) * (256 - var2) >> 8 & var3;
            var3 >>= 8;
         }

         return var4;
      }
   }

   private static void sub_114d(int var0) {
      var_50ba[var0] = true;
   }

   private static Class_22 sub_117d(int var0, boolean var1, int var2, int var3) {
      Class_22 var4;
      (var4 = new Class_22()).sub_5d(Class_6b.sub_27d(var0), 0, var2, var3);
      if(var1) {
         for(int var5 = 0; var5 < var4.var_325; ++var5) {
            var4.sub_a6(var5, var2, var3, -1);
         }

         var4.sub_c7();
      }

      return var4;
   }

   private static void sub_11c2(int var0, boolean var1) {
      var_23b2[var0] = sub_117d(var0, var1, 0, -1);
   }

   private static void sub_11f7(int var0) {
      var_23b2[var0] = null;
   }

   private static boolean sub_1227() {
      System.gc();
      int var0;
      int var1;
      switch(var_29d9) {
      case 1:
         Class_6b.sub_cf("/3");
         Class_6b.sub_537(0, var_93b);
         Class_6b.sub_1cc();
      case 2:
      default:
         break;
      case 3:
         sub_c49(true);
         if(var_8cc == null) {
            var_8cc = Image.createImage(240, 320);
            var_883 = var_8cc.getGraphics();
         }

         var_1729 = new int[7][16];
         var_1786 = new int[7][];
         var_17dd = new byte[7];
         var_1830 = new short[7][6];
         var_16d6 = new byte[16];
         var_1669 = new int[4];
         var_1b64 = new int[7];
         Class_6b.sub_cf("/7");
         var_2a39 = 0;
         break;
      case 4:
         if(var_2a39 < 7) {
            sub_f2c(var_2a39);
            --var_29d9;
            ++var_2a39;
         } else {
            Class_6b.sub_1cc();
         }
         break;
      case 5:
         Class_6b.sub_cf("/4");
         break;
      case 6:
         if(var_c54 == null) {
            var_c54 = Class_6b.sub_3f0(26);
         }

         Image var3 = var_c54;
         var_c54 = Image.createImage(var_c54.getWidth(), var3.getHeight());
         var_c54.getGraphics().drawImage(var3, 0, 0, 0);
         System.gc();
         break;
      case 7:
         var_c68 = Class_6b.sub_3f0(27);
         var_c74 = Class_6b.sub_3f0(28);
         break;
      case 8:
         var_ca1 = Class_6b.sub_3f0(29);
         var_cf4 = Class_6b.sub_3f0(30);
         Class_6b.sub_1cc();
         break;
      case 9:
         Class_6b.sub_cf("/5");
         break;
      case 10:
         var_267b[1] = null;
         System.gc();
         sub_f9b(0, 1);
         var_267b[1].sub_a6(0, 0, -1, -1);
         var_267b[1].sub_a6(3, 0, -1, -1);
         var_267b[1].sub_a6(2, 0, 9, -1);
         var_267b[1].sub_a6(2, 42, 43, -1);
         var_267b[1].sub_a6(1, 0, 9, -1);
         var_267b[1].sub_a6(1, 42, 43, -1);
         var_267b[1].sub_c7();
         break;
      case 11:
         var_267b[0] = null;
         System.gc();
         sub_f9b(1, 0);
         var_267b[0].sub_a6(0, 0, -1, -1);
         var_267b[0].sub_a6(1, 0, -1, -1);
         var_267b[0].sub_c7();
         break;
      case 12:
         sub_f9b(2, 2);
         var_267b[2].sub_a6(0, 0, -1, -1);
         var_267b[2].sub_c7();
         break;
      case 13:
         var_2a39 = 0;
         break;
      case 14:
         var_23b2[9] = sub_117d(9, false, 16, 49);
         break;
      case 15:
         if(var_2a39 < 7) {
            var_23b2[var_1b64[var_2a39]] = sub_117d(var_1b64[var_2a39], false, 0, 0);
            --var_29d9;
            ++var_2a39;
         } else {
            var_2a39 = 0;
         }
         break;
      case 16:
         if(var_2a39 < 7) {
            if(var_17dd[var_2a39] != -1) {
               sub_11c2(var_17dd[var_2a39], false);
            }

            --var_29d9;
            ++var_2a39;
         } else {
            var_2a39 = 0;
         }
         break;
      case 17:
         if(var_2a39 < 3) {
            sub_11c2(var_357[var_2a39][0], true);
            ++var_2a39;
            --var_29d9;
         }
         break;
      case 18:
         sub_11c2(35, true);
         break;
      case 19:
         sub_11c2(37, true);
         break;
      case 20:
         sub_11c2(38, true);
         sub_11c2(39, true);
         Class_6b.sub_1cc();
         break;
      case 21:
         Class_6b.sub_cf("/1");
         sub_82d(4);
         byte var4 = 0;

         for(var0 = 0; var0 < 16; ++var0) {
            if(var4 < var_148c[var0]) {
               var4 = var_148c[var0];
            }
         }

         var_1841 = new byte[var1 = Math.max(Math.max(Math.max(var4, 7), 6), 16)];
         var_18ae = 0;
         var_1870 = new byte[var1];
         var_187b = new int[var1];
         Class_6b.sub_1cc();
         break;
      case 22:
         var_1951 = new byte[6][][];
         var_1992 = new int[6][][];
         Class_6b.sub_cf("/2");

         for(var0 = 0; var0 < 6; ++var0) {
            Class_6b.sub_16c(var_2bc[var0][0]);
            int var2 = Class_6b.sub_2c6();
            var_1951[var0] = new byte[var2][32];
            var_1992[var0] = new int[var2][9];

            for(var1 = 0; var1 < var2; ++var1) {
               var_1992[var0][var1][0] = Class_6b.sub_2c6();
               var_1992[var0][var1][8] = Class_6b.sub_2f0();
               var_1992[var0][var1][7] = Class_6b.sub_2f0();
               var_1992[var0][var1][6] = Class_6b.sub_2f0();
               var_1992[var0][var1][1] = Class_6b.sub_2c6();
               var_1992[var0][var1][2] = Class_6b.sub_2c6();
               var_1992[var0][var1][3] = Class_6b.sub_2f0();
               var_1992[var0][var1][4] = Class_6b.sub_2c6();
               var_1992[var0][var1][5] = Class_6b.sub_2c6();
               Class_6b.sub_248(var_1951[var0][var1], 0, 32);
            }
         }

         Class_6b.sub_1cc();
         break;
      case 23:
         Class_6b.sub_cf("/6");
         Class_6b.sub_617(0);
         Class_6b.sub_617(1);
         Class_6b.sub_617(7);
         Class_6b.sub_617(8);
         Class_6b.sub_1cc();
         break;
      case 24:
         Class_6b.sub_690(var_6c8 == 28?1:0, 0);
         sub_2313();
         break;
      case 25:
         var_1cfb = sub_235e(var_1cda);
         break;
      case 26:
         var_883.setColor(0);
         var_883.fillRect(0, 0, 240, 320);
         var_883.drawImage(var_c54, 0, 0, 0);
         break;
      case 27:
         sub_2407(var_c54, 1760, 1216, 624);
         break;
      case 28:
         var_53b0 = new int[26];
         var_53f7 = new int[26];
         var_543d = new int[26];
         var_544f = new int[26];
         var_5490 = new int[26];
         var_54f1 = new int[26];
         sub_2021();
         var_1bba = new int[10];
         break;
      case 29:
         return true;
      }

      ++var_29d9;
      return false;
   }

   private static void sub_1260() {
      var_8cc = null;
      var_883 = null;

      for(int var0 = 0; var0 < 40; ++var0) {
         if(var0 != 36) {
            sub_11f7(var0);
         }
      }

      Class_6b.sub_754(0);
      Class_6b.sub_893(0);
      Class_6b.sub_657(0);
      Class_6b.sub_657(1);
      Class_6b.sub_657(7);
      Class_6b.sub_657(8);
      var_15ca = null;
      var_143f = null;
      var_1462 = null;
      var_148c = null;
      var_14f0 = (int[][])null;
      var_1523 = (byte[][])null;
      var_1568 = (byte[][][])null;
      var_1669 = null;
      var_1729 = (int[][])null;
      var_16d6 = null;
      var_1841 = null;
      var_1951 = (byte[][][])null;
      var_1992 = (int[][][])null;
      var_1b64 = null;
      sub_fb9();
      Class_6b.sub_55c();
      var_cf4 = null;
      var_53b0 = null;
      var_53f7 = null;
      var_543d = null;
      var_544f = null;
      var_5490 = null;
      var_54f1 = null;
      var_56dd = null;
      var_c68 = null;
      var_c74 = null;
      var_ca1 = null;
      var_1bba = null;
      var_126b = null;
   }

   private static boolean sub_126a() {
      System.gc();
      int var0;
      int var1;
      Class_22 var2;
      Class_22 var3;
      byte var5;
      byte var6;
      switch(var_29d9) {
      case 1:
         byte var10002;
         int var10003;
         byte[] var29;
         int var30;
         if(var_13aa) {
            var29 = var_1e0a;
            var30 = var_13e0;
            var10002 = var_1e0a[var_13e0];
            var10003 = 1;
         } else {
            var29 = var_1e0a;
            var30 = var_1019[1];
            var10002 = var_1e0a[var_1019[1]];
            var10003 = 1 << var_1019[2];
         }

         var29[var30] = (byte)(var10002 | var10003);
         var_1d9d |= 1 << var_1019[0];

         for(var0 = 0; var0 < 16; ++var0) {
            var_1e43[var0] = (short)(var_1e43[var0] | 1 << var_167e[var_1019[0]][var0]);
         }

         if(var_1019[4] >= 0) {
            var_1de6 |= 1 << var_1019[4];
         }

         sub_c49(true);
         var_50ba = new boolean[40];
         Class_6b.sub_cf("/3");
         Class_6b.sub_537(1, var_93b);
         var_28df = sub_c2d(Class_6b.sub_595(57), var_28a0);
         var_28df = sub_c2d(var_28df, Class_6b.sub_595(58));
         var_28df = sub_b56(var_28df, 0, 220);
         break;
      case 2:
         Class_6b.sub_cf("/6");
         Class_6b.sub_617(2 + var_1019[5]);
         Class_6b.sub_617(5);
         Class_6b.sub_617(6);
         Class_6b.sub_617(7);
         Class_6b.sub_617(8);
         Class_6b.sub_690(2 + var_1019[5], 0);
         var_3b7d = new int[10];
         var_3bbe = new int[11];
         var_3bfe = new int[11];
         var_3c51 = new int[11];
         var_3c80 = new int[10];
         var_3c8a = new int[10];
         var_3cab = new int[10];
         var_3cf2 = new int[11];
         var_3d1b = new int[10];
         var_3d62 = new int[11];
         var_3da9 = new int[11];
         var_3dba = new short[10];
         var_3e1d = new Class_9b[10][10];
         var_3e61 = new short[10];
         var_3e97 = new Class_9b[10][10];
         var_3f34 = new int[11];
         var_3f84 = new int[11];
         var_3fc9 = new int[11];
         var_22fb = Image.createImage(120, 100);
         break;
      case 3:
         if(var_13aa) {
            sub_1011(var_2bc[var_13e0][0], 0);
         } else {
            sub_1011(var_2bc[var_1019[1]][0], var_1019[2]);
         }
      case 4:
      default:
         break;
      case 5:
         Class_6b.sub_cf("/4");
         var_2e81 = Class_6b.sub_3f0(var_2e02[0]);
         var_2ed9 = Class_6b.sub_3f0(var_2e02[1]);
         var_2e30 = new int[1914];
         var_2e70 = new Image[2];
         var_3254 = new Image[2][125];
         var_2a39 = 0;
         break;
      case 6:
         var_2e70[var_2a39] = Class_6b.sub_3f0(var_2e02[2 + var_2a39]);
         ++var_2a39;
         if(var_2a39 < 2) {
            --var_29d9;
         } else {
            var_2a39 = 0;
         }
         break;
      case 7:
         sub_1068(var_2a39++);
         if(var_2a39 < 2) {
            --var_29d9;
         }
         break;
      case 8:
         var_34bf = new short[125];

         for(var0 = 0; var0 < 125; ++var0) {
            if(var_3254[0][var0] != null) {
               var_34bf[var0] = (short)(var_3254[0][var0].getWidth() / var_349d);
            }
         }

         var_2e02 = null;
         var_2e30 = null;
         System.gc();
         break;
      case 9:
         var_23d0 = Class_6b.sub_3f0(31);
         Class_6b.sub_1cc();
         break;
      case 10:
         sub_1055(false);
         break;
      case 11:
         sub_114d(5);
         sub_114d(7);
         sub_114d(6);
         sub_114d(8);
         break;
      case 12:
         sub_114d(28);
         sub_114d(29);
         sub_114d(30);
         sub_114d(31);
         break;
      case 13:
         var_44e8 = new Class_9b(0);
         var_44a1 = sub_ed1(var_2f7[var_1019[0]][0], var_44e8);
         sub_114d(var_44a1);
         if(!var_44e8.var_2af) {
            sub_114d(9);
         }

         if(var_167e[var_1019[0]][1] != 0) {
            sub_114d(var_17dd[var_1019[0]]);
         }

         var_4723 = new Class_9b[2];

         for(var0 = 0; var0 < 2; ++var0) {
            var_4723[var0] = new Class_9b(4);
         }

         sub_114d(4);
         var_4503 = new Class_9b(2);
         var_4503.var_d3 = new short[12];
         var_4503.var_d3[6] = 165;
         var_4503.var_d3[9] = 200;
         boolean var24 = false;
         var_467f = new Class_9b(1);
         var_467f.sub_1a(var_44e8);
         var_467f.var_d3[9] = (short)(var_467f.var_d3[9] / 2);
         var_45ee = new Class_9b(3);
         sub_ed1(7, var_45ee);
         var_45ee.var_d3[9] = (short)(var_45ee.var_d3[9] / 2);
         sub_114d(10);
         var_4651 = new Class_9b(5);
         sub_114d(3);
         var_46d6 = new Class_9b(6);
         var_46d6.var_d3 = new short[12];
         var_46d6.var_d3[6] = 200;
         var_46d6.var_d3[9] = 200;
         sub_114d(23);
         System.gc();
         sub_114d(23);
         sub_114d(2);
         var_2a39 = 0;
         Class_6b.sub_cf("/5");
         break;
      case 14:
         while(var_2a39 < 40 && !var_50ba[var_2a39]) {
            ++var_2a39;
         }

         if(var_2a39 < 40) {
            sub_11c2(var_2a39, false);
            ++var_2a39;
            --var_29d9;
         } else {
            var_2a39 = 0;
            Class_6b.sub_1cc();
         }
         break;
      case 15:
         for(var0 = 0; var0 < var_23b2[6].var_2e9[0].length; ++var0) {
            if((var_23b2[6].var_2e9[0][var0] & -16777216) != 0) {
               var_23b2[6].var_2e9[0][var0] = 1711276032;
            }
         }

         var_23b2[10].sub_a6(0, 0, -1, -1);
         var_23b2[10].sub_c7();
         var_23b2[5].sub_a6(0, 0, -1, -1);
         var_23b2[5].sub_c7();
         var_23b2[7].sub_a6(0, 0, -1, -1);
         var_23b2[7].sub_c7();
         var_23b2[6].sub_a6(0, 0, -1, -1);
         var_23b2[6].sub_c7();
         var_23b2[29].sub_a6(0, 0, -1, -1);
         var_23b2[29].sub_c7();
         break;
      case 16:
         var_23b2[3].sub_a6(0, 0, -1, -1);
         var_23b2[3].sub_c7();
         var_23b2[28].sub_a6(0, 0, -1, -1);
         var_23b2[28].sub_c7();
         var_23b2[30].sub_a6(0, 0, -1, -1);
         var_23b2[30].sub_c7();
         var_23b2[31].sub_a6(0, 0, -1, -1);
         var_23b2[31].sub_c7();
         break;
      case 17:
         var_23b2[8].sub_84(var_23d0);
         var_23d0 = null;
         System.gc();
         var_267b[2] = var_23b2[2];
         var_267b[2].var_6a3 = var_2866[2];
         var_267b[2].var_6f0 = var_2891[2];
         var_267b[2].sub_a6(0, 0, -1, -1);
         var_26a9 = var_23b2[28];
         var_26d3 = var_23b2[31];
         var_2732 = var_23b2[30];
         Class_9b.var_e52 = var_23b2[29];
         Class_9b.var_e7b = var_23b2[var_44a1];
         Class_9b.var_ef4 = var_23b2[10];
         Class_9b.var_f8f = var_23b2[5];
         Class_9b.var_fcd = var_23b2[7];
         Class_9b.var_1003 = var_23b2[6];
         Class_9b.var_105d = var_23b2[3];
         break;
      case 18:
         int var21;
         if((var21 = Class_6b.sub_496(0, var_44e8.var_126)) == var_167e[var_1019[0]][0]) {
            var21 = (var21 + 1) % var_44e8.var_126;
         }

         var_23b2[var_44a1].var_373 = var21;
         Class_22 var28 = var_23b2[var_44a1];
         if(var_44e8.var_2af) {
            ;
         }

         var0 = var28.sub_314(2, 0);
         sub_a04(0, var_44a1, var0);
         var28 = var_23b2[var_44a1];
         if(var_44e8.var_2af) {
            ;
         }

         var0 = var28.sub_314(1, 0);
         if(var_44e8.var_2af) {
            sub_a04(1, var_44a1, var0);
         } else {
            sub_a04(1, 9, var_23b2[9].sub_314(var_44e8.var_d3[10], 0));
            int[] var23 = var_2437[1];
            var5 = var_23e6[1][0];
            var6 = var_23e6[1][1];
            byte var7 = var_23e6[1][2];
            byte var8 = var_23e6[1][3];
            var_2437[1] = null;
            var_23e6[1] = null;
            System.gc();
            sub_a04(1, var_44a1, var0);
            int[] var9 = var_2437[1];
            byte var10 = var_23e6[1][0];
            byte var11 = var_23e6[1][1];
            byte var12 = var_23e6[1][2];
            byte var13 = var_23e6[1][3];
            var_2437[1] = null;
            var_23e6[1] = null;
            System.gc();
            int var26 = var7 + var12;
            int var27 = var8 + var13;
            int var16 = Math.min(var12, var26);
            int var17 = Math.min(var13, var27);
            int var14 = Math.max(var12 + var10, var26 + var5) - var16;
            int var15 = Math.max(var13 + var11, var27 + var6) - var17;
            int[] var18 = new int[var14 * var15];

            for(var0 = 0; var0 < var6; ++var0) {
               System.arraycopy(var23, var0 * var5, var18, (var27 - var17 + var0) * var14 + (var26 - var16), var5);
            }

            for(var0 = 0; var0 < var11; ++var0) {
               for(var1 = 0; var1 < var10; ++var1) {
                  if((var9[var0 * var10 + var1] & -16777216) != 0) {
                     var18[(var13 - var17 + var0) * var14 + var12 - var16 + var1] = var9[var0 * var10 + var1];
                  }
               }
            }

            var_2437[1] = var18;
            var_23e6[1] = new byte[4];
            var_23e6[1][0] = (byte)var14;
            var_23e6[1][1] = (byte)var15;
            var_23e6[1][2] = (byte)var16;
            var_23e6[1][3] = (byte)var17;
         }

         System.gc();
         if(var_44e8.var_2af) {
            ++var_29d9;
         } else {
            var_2a39 = 0;
         }
         break;
      case 19:
         var2 = var_23b2[9];
         var6 = var_167e[var_1019[0]][2];
         short[] var10000;
         byte var10001;
         if(var_2a39 == 0) {
            var10000 = var_44e8.var_d3;
            var10001 = 10;
         } else {
            var10000 = var_44e8.var_d3;
            var10001 = 11;
         }

         short var20 = var10000[var10001];

         for(var0 = 0; var0 < var2.sub_105(var20); ++var0) {
            int var22 = var2.sub_314(var20, var0);

            for(var1 = 0; var1 < var2.sub_12b(var22); ++var1) {
               int var25 = var2.sub_180(var22, var1);
               var2.sub_a6(var6, var25, var25, -1);
            }
         }

         ++var_2a39;
         if(var_2a39 < 2) {
            --var_29d9;
         } else {
            var2.sub_c7();
            var2.var_373 = var6;
            Class_9b.var_ea1 = var2;
            sub_11f7(9);
         }
         break;
      case 20:
         sub_a04(6, 8, 0);
         var2 = var_23b2[var_44a1];
         byte var19 = var_167e[var_1019[0]][0];
         var2.var_373 = var19;
         var2.sub_a6(var19, 1, -1, -1);
         var2.sub_c7();
         break;
      case 21:
         if(var_167e[var_1019[0]][1] != 0) {
            var3 = var_23b2[var_44a1];
            var5 = var_167e[var_1019[0]][0];
            Class_22 var4;
            (var4 = var_23b2[var_17dd[var_1019[0]]]).var_373 = var_167e[var_1019[0]][1] - 1;
            sub_f56(var3, var5, 1, var4, 0);
            sub_f56(var3, var5, 2, var4, 1);
            sub_f56(var3, var5, 3, var4, 2);
            sub_f56(var3, var5, 4, var4, 3);
            sub_f56(var3, var5, 5, var4, 4);
            sub_f56(var3, var5, 6, var4, 5);
            sub_f56(var3, var5, 7, var4, 6);
            sub_f56(var3, var5, 8, var4, 7);
            sub_11f7(var_17dd[var_1019[0]]);
         }
         break;
      case 22:
         sub_a04(3, 4, 2);
         sub_a04(2, 4, 1);
         sub_11f7(4);
         System.gc();
         break;
      case 23:
         sub_a04(5, 6, 1);
         sub_1055(true);
         break;
      case 24:
         (var3 = var_23b2[23]).sub_a6(0, 0, -1, -1);
         var3.sub_c7();
         sub_a04(4, 23, 0);

         for(var0 = 0; var0 < var3.var_f7; ++var0) {
            if(var0 < 3 || var0 > 4) {
               var3.var_4c1[var3.var_373][var0] = null;
            }
         }

         System.gc();
         break;
      case 25:
         sub_a04(7, 29, 13);
         sub_a04(8, 29, 12);
         sub_a04(9, 29, 11);
         sub_9d1(var_44e8, var_160d);
         System.gc();
         break;
      case 26:
         var_248c = Image.createImage(191, 26);
         var_24a4 = var_248c.getGraphics();
         var_2537 = new int[1];
         var_2581 = new int[1];
         var_2591 = new boolean[1];
         sub_1828();
         break;
      case 27:
         var_50ba = null;
         break;
      case 28:
         return true;
      }

      ++var_29d9;
      return false;
   }

   private static void sub_1292() {
      var_2e02 = null;
      var_22fb = null;
      Class_6b.sub_754(0);
      Class_6b.sub_893(0);
      Class_6b.sub_657(2 + var_1019[5]);
      Class_6b.sub_657(5);
      Class_6b.sub_657(6);
      Class_6b.sub_657(7);
      Class_6b.sub_657(8);
      var_3b7d = null;
      var_3bbe = null;
      var_3bfe = null;
      var_3c51 = null;
      var_3c80 = null;
      var_3c8a = null;
      var_3cab = null;
      var_3cf2 = null;
      var_3d1b = null;
      var_3d62 = null;
      var_3da9 = null;
      var_3dba = null;
      var_3e61 = null;
      int var0;
      if(var_3e1d != null) {
         for(var0 = 0; var0 < var_3e1d.length; ++var0) {
            var_3e1d[var0] = null;
         }

         var_3e1d = (Class_9b[][])null;
      }

      if(var_3e97 != null) {
         for(var0 = 0; var0 < var_3e97.length; ++var0) {
            var_3e97[var0] = null;
         }

         var_3e97 = (Class_9b[][])null;
      }

      var_3f34 = null;
      var_3f84 = null;
      var_3fc9 = null;
      var_2e81 = null;
      var_2ed9 = null;
      var_3629 = null;
      var_363f = null;
      var_3694 = null;
      var_41aa = null;
      var_41dd = null;
      var_4241 = null;
      var_3a70 = null;
      var_3a9d = null;
      var_34bf = null;
      if(var_3a02 != null) {
         for(var0 = 0; var0 < var_3a02.length; ++var0) {
            var_3a02[var0] = null;
         }

         var_3a02 = (short[][])null;
      }

      if(var_3a0e != null) {
         for(var0 = 0; var0 < var_3a0e.length; ++var0) {
            var_3a0e[var0] = null;
         }

         var_3a0e = (short[][])null;
      }

      var_3aea = null;
      var_3af6 = null;
      var_3b22 = null;
      var_3b5b = null;
      int var1;
      if(var_3254 != null) {
         for(var0 = 0; var0 < var_3254.length; ++var0) {
            if(var_3254[var0] != null) {
               for(var1 = 0; var1 < var_3254[var0].length; ++var1) {
                  var_3254[var0][var1] = null;
               }
            }

            var_3254[var0] = null;
         }

         var_3254 = (Image[][])null;
      }

      var_3871 = null;
      var_38b0 = (short[][])null;
      if(var_388c != null) {
         for(var0 = 0; var0 < var_388c.length; ++var0) {
            if(var_388c[var0] != null) {
               for(var1 = 0; var1 < var_388c[var0].length; ++var1) {
                  var_388c[var0][var1] = null;
               }

               var_388c[var0] = (short[][])null;
            }
         }

         var_388c = (short[][][])null;
      }

      var_43ed = null;
      var_4434 = null;
      var_4476 = null;
      Class_9b.var_e52 = null;
      Class_9b.var_e7b = null;
      Class_9b.var_ea1 = null;
      Class_9b.var_ef4 = null;
      Class_9b.var_f8f = null;
      Class_9b.var_fcd = null;
      Class_9b.var_1003 = null;
      Class_9b.var_105d = null;
      var_26a9 = null;
      var_2732 = null;
      if(var_44e8 != null) {
         var_44e8.sub_9df();
         var_44e8 = null;
      }

      if(var_46d6 != null) {
         var_46d6.sub_9df();
         var_46d6 = null;
      }

      if(var_4651 != null) {
         var_4651.sub_9df();
         var_4651 = null;
      }

      if(var_45ee != null) {
         var_45ee.sub_9df();
         var_45ee = null;
      }

      if(var_4503 != null) {
         var_4503.sub_9df();
         var_4503 = null;
      }

      if(var_467f != null) {
         var_467f.sub_9df();
         var_467f = null;
      }

      if(var_4723 != null) {
         for(var0 = 0; var0 < var_4723.length; ++var0) {
            if(var_4723[var0] != null) {
               var_4723[var0].sub_9df();
               var_4723[var0] = null;
            }
         }

         var_4723 = null;
      }

      if(Class_9b.var_e14 != null) {
         for(var0 = 0; var0 < Class_9b.var_e14.length; ++var0) {
            Class_9b.var_e14[var0] = null;
         }

         Class_9b.var_e14 = (int[][])null;
      }

      var_2537 = null;
      var_2581 = null;
      var_2591 = null;
      if(var_23e6 != null) {
         for(var0 = 0; var0 < var_23e6.length; ++var0) {
            var_23e6[var0] = null;
         }

         var_23e6 = (byte[][])null;
      }

      if(var_2401 != null) {
         for(var0 = 0; var0 < var_2401.length; ++var0) {
            var_2401[var0] = null;
         }

         var_2401 = (Image[][])null;
      }

      if(var_2437 != null) {
         for(var0 = 0; var0 < var_2437.length; ++var0) {
            var_2437[var0] = null;
         }

         var_2437 = (int[][])null;
      }

      var_26d3 = null;
      var_248c = null;
      var_24a4 = null;
      Class_9b.var_f3f = null;
      Class_9b.var_1025 = null;
      Class_6b.sub_55c();

      for(var0 = 0; var0 < 40; ++var0) {
         if(var0 != 36) {
            sub_11f7(var0);
         }
      }

      var_3925 = null;
      var_39af = null;
      var_395f = (int[][])null;
      var_28df = null;
      Class_9b.var_a93 = (byte[][])null;
      sub_fb9();
      System.gc();
   }

   static void sub_12e4(int var0, int var1, int var2, int var3) {
      if(var_5130 <= 0 || var_5222 <= var3) {
         var_50f0 = var0;
         var_5183 = var1;
         var_51c6 = var2;
         var_5222 = var3;
         var_5202 = 1;
         var_5130 = var0;
      }

   }

   private static void sub_133f() {
      var_5130 = 0;
      sub_13e9(0, 0);
   }

   private static void sub_138f(int var0) {
      if(!var_284e) {
         if(!var_4832) {
            if(var_5130 > 0) {
               int var1 = (var_5130 * var_5222 << 12) / var_50f0;
               int var2 = (var_5183 * var1 >> 12) * var_5202;
               int var3 = (var_51c6 * var1 >> 12) * var_5202;
               sub_13e9(var2, var3);
               var_5202 = -var_5202;
               var_5130 -= var0;
               if(var_5130 <= 0) {
                  sub_13e9(0, 0);
                  return;
               }
            }

         }
      }
   }

   private static void sub_13e9(int var0, int var1) {
      var_3ec.translate(var0 - var_5266, var1 - var_5290);
      var_5266 = var0;
      var_5290 = var1;
   }

   private static void sub_13f5() {
      sub_142e(0, 56, 240, 234);
   }

   private static void sub_142e(int var0, int var1, int var2, int var3) {
      var_3ec.setClip(var0 - var_5266, var1 - var_5290, var2, var3);
   }

   private static void sub_1438(int var0, int var1, int var2, int var3) {
      var_3ec.clipRect(var0 - var_5266, var1 - var_5290, var2, var3);
   }

   private static void sub_148d() {
      sub_13e9(0, 0);
      if(var_4832) {
         sub_14f6(var_486c, 14336, 56);
      } else if(var_27d5 > 0) {
         sub_1504();
      } else if(var_284e) {
         if(var_4651.var_48) {
            sub_14f6(var_2801, 12288, -1);
         } else {
            sub_142e(0, 0, 240, 320);
            sub_1548(Class_6b.sub_595(var_1f82), 283, 17);
         }

         var_20d0 = 4096;
         var_20ae = 0;
         sub_158e();
      } else {
         int var1 = 1 << var_586 % 6;
         sub_142e(0, 0, 240, 320);
         if(var_75a) {
            var_20d0 = 4096;
            var_20ae = 0;
            var1 |= 64;
            var_3ec.setColor(var_3154);
            sub_a6c(0, 0, 240, 56);
            var_3ec.setColor(var_33e5);
            sub_a6c(0, 290, 240, 30);
            var_3ec.setColor(16777215);
            var_3ec.drawLine(0, 31, 240, 31);
            var_3ec.setColor(2128330);
            var_3ec.drawLine(0, 30, 240, 30);
            var_26a9.sub_429(var_3ec, 9, 120, 0, 0);
            var_26a9.sub_429(var_3ec, var_105e == 1?3:4, 120, 0, 0);
            if(var_105e != 1 && var_105e != 3) {
               var_26a9.sub_429(var_3ec, 5, 120, 0, 0);
            }

            var_26a9.sub_429(var_3ec, 31, 120, 320, 0);
            var_26a9.sub_429(var_3ec, var_1c3d?35:34, 120, 320, 0);
            sub_161e();
            var_2017 |= 65784;
            if(var_105e != 3 && var_105e != 1) {
               var_2017 |= 4;
            }

            if(var_1f5b > 0) {
               var_2017 |= 1;
            }
         }

         int var0;
         int var2;
         int var3;
         if(var_2017 != 0) {
            var_3ec.setColor(var_3154);
            if((var1 & 66) != 0) {
               if((var_2017 & 2) != 0) {
                  var_26a9.sub_429(var_3ec, 5, 120, 0, 0);
                  var_2017 &= -3;
               }

               if((var_2017 & 4) != 0) {
                  if((var2 = var_1ea4 * 91 / 250) > 0) {
                     sub_142e(146, 0, var2, 56);
                     var_26a9.sub_429(var_3ec, 6, 120, 0, 0);
                     sub_142e(0, 0, 240, 320);
                  }

                  var_2017 &= -5;
               }
            }

            if((var_2017 & 8) != 0 && (var1 & 68) != 0) {
               var_26a9.sub_429(var_3ec, 0 + Math.min(Math.max(var_44e8.var_70e, 1), var_48e7) - 1, 120, 0, 0);
               var_2017 &= -9;
            }

            byte var10000;
            if((var_2017 & 16) != 0 && (var1 & 72) != 0) {
               sub_a6c(1, 0, 36, 28);
               int var10001;
               if(var_105e == 2) {
                  var10000 = 55;
                  var10001 = var_2780;
               } else {
                  var10000 = 18;
                  var10001 = var_4761;
               }

               var2 = var10000 + var10001;
               var_26a9.sub_429(var_3ec, var2, 120, 0, 0);
               var_2017 &= -17;
            }

            if((var_2017 & 32) != 0 && (var1 & 72) != 0) {
               var2 = var_105e == 2?var_10b0 - 1:var_374b;
               sub_a6c(44, 1, 15, 12);
               var_26a9.sub_429(var_3ec, 10 + var2, 120, 0, 0);
               var_2017 &= -33;
            }

            if((var_2017 & 64) != 0 && (var1 & 80) != 0) {
               sub_a6c(158, 0, 80, 12);
               sub_b20(var_1ed8, 83, 0, 2, 238, 0, 24);
               var_2017 &= -65;
            }

            if((var_2017 & 512) != 0) {
               var_26a9.sub_429(var_3ec, 26, 120, 0, 0);
               var_2017 &= -513;
            }

            if((var_2017 & 1024) != 0) {
               sub_a6c(0, 33, 40, 23);
               var_2017 &= -1025;
            }

            if((var1 & 65) != 0) {
               if((var_2017 & 128) != 0) {
                  short var10002;
                  byte var7;
                  if(var_105e != 3 && var_105e != 1) {
                     var10000 = 40;
                     var7 = 33;
                     var10002 = 200;
                  } else {
                     var10000 = 0;
                     var7 = 33;
                     var10002 = 240;
                  }

                  sub_a6c(var10000, var7, var10002, 23);
                  var_2017 &= -129;
               }

               if((var_2017 & 1) != 0) {
                  if(var_1f82 != -1) {
                     byte[] var4 = Class_6b.sub_595(var_1f82);
                     var_267b[0].sub_4f8(var4, 0, var4.length);
                     var3 = Class_22.var_524;
                     var2 = 120 - (var3 >> 1);
                     if(var_105e != 3 && var_105e != 1 && var2 < 40) {
                        var2 = 40;
                     }

                     sub_a6c(40, 33, 200, 23);
                     int var5;
                     int var6;
                     if(var_1f82 == 35) {
                        var5 = var_1fbb;
                        if(!var_1c3d) {
                           var5 = var5 * 1000 / 914;
                        }

                        sub_b01(var5, var_1c3d?81:82, 0);
                        var_267b[0].sub_4f8(var_4ed3, var_4f04, var_4f5e);
                        var6 = Class_22.var_524;
                        var2 -= var6 >> 1;
                        Class_22.var_740 = var_4f04;
                        Class_22.var_76d = var_4f5e;
                        sub_bc7(var_4ed3, 0, var2 + var3, 38, 20);
                        Class_22.var_740 = -1;
                        Class_22.var_76d = -1;
                     }

                     sub_b8e(var_1f82, 0, var2, 38, 20);
                     if(var_1f82 != 35) {
                        var5 = var2 + var3;
                        var6 = Math.min(var_262f, 3);

                        for(var0 = 0; var0 < var6; ++var0) {
                           Class_9b.var_e52.sub_429(var_3ec, 16, var5, 33, 0);
                           var5 += 6;
                        }
                     }
                  }

                  var_2017 &= -2;
               }
            }

            if((var_2017 & 65536) != 0 && (var1 & 96) != 0) {
               var_3ec.setColor(6316128);
               sub_a6c(194, 297, 31, 13);
               sub_b20(sub_2455(var_44e8.var_341), -1, 0, 0, 225, 297, 24);
               var_2017 &= -65537;
            }

            if((var_2017 & 131072) != 0) {
               var_26a9.sub_429(var_3ec, 33, 120, 320, 0);
               var_2017 &= -131073;
            }

            if((var_2017 & 262144) != 0) {
               var_26a9.sub_429(var_3ec, 32, 120, 320, 0);
               var_2017 &= -262145;
            }
         }

         sub_158e();
         sub_142e(0, 0, 240, 320);
         var2 = 172 + (Class_6b.var_361[var_2161 & 2047] * 13 >> 12);
         var3 = 317 + (Class_6b.var_361[512 - var_2161 & 2047] * 13 >> 12);
         var_3ec.setColor(0);
         var_3ec.drawLine(172, 317, var_21ad, var_21c1);
         var_3ec.setColor(16777215);
         var_3ec.drawLine(172, 317, var2, var3);
         var_21ad = var2;
         var_21c1 = var3;
         var_221f = var_2161;
         if(var_105e != 3 && var_105e != 1 && var_1ea4 == 250) {
            var0 = (var_4a02 >> 3 & 1) == 0?7:8;
            var_26a9.sub_429(var_3ec, var0, 120, 0, 0);
         }

         if(var_2468 > 0) {
            var_2468 -= var_837;
            sub_810(25, 114);
         }

      }
   }

   private static void sub_14e8(int var0) {
      int var3;
      label14: {
         var_2161 = 1024;
         int var1 = var_44e8.var_266[Class_9b.var_c5f - 1];
         int var2 = var_44e8.var_266[Class_9b.var_c5f];
         short var10000;
         if((var3 = (var_44e8.var_341 - var1) * 512 / (var2 - var1)) > 768) {
            var10000 = 768;
         } else {
            if(var3 >= 0) {
               break label14;
            }

            var10000 = 0;
         }

         var3 = var10000;
      }

      var_2161 += var3;
      var_2161 = var_221f + (Math.min(Math.max(var0 * 5, 0), 4096) * ((var_2161 & 2047) - var_221f) >> 12);
      var_2161 += var_4a02 & 16;
   }

   private static void sub_14f6(int var0, int var1, int var2) {
      sub_142e(0, 0, 240, 320);
      sub_1548(var2 == -1?null:Class_6b.sub_595(var2), 298, 3);
      if(var0 > var1 - 2048) {
         Class_9b.sub_45e(var_2732, 0, 120, 0, var1 - var0, 2048);
         Class_9b.sub_45e(var_2732, 1, 120, 320, var1 - var0, 2048);
      } else if(var0 < 2048) {
         Class_9b.sub_45e(var_2732, 2, 120, 0, 2048 - var0, 2048);
         Class_9b.sub_45e(var_2732, 3, 120, 320, 2048 - var0, 2048);
      } else {
         var_2732.sub_429(var_3ec, 8, 120, 0, 0);
         var_2732.sub_429(var_3ec, 14, 120, 320, 0);
         Class_9b.sub_45e(var_2732, 4, 120, 0, (var1 - var0 - 2048) % 10240, 10240);
      }
   }

   private static void sub_1504() {
      sub_142e(0, 0, 240, 320);
      if(var_27d5 == 16384 || var_75a) {
         sub_1548(var_28df, 305, 3);
         var_2732.sub_429(var_3ec, 8, 120, 0, 0);
      }

      var_2732.sub_429(var_3ec, 9, 120, 0, 0);
      Class_9b.sub_45e(var_2732, 4, 120, 0, (16384 - var_27d5) % 10240, 10240);
   }

   private static void sub_1548(byte[] var0, int var1, int var2) {
      var_3ec.setColor(0);
      sub_a6c(0, 0, 240, 56);
      sub_a6c(0, 275, 240, 45);
      if(var0 != null) {
         sub_bc7(sub_b56(var0, 0, 230), 0, 120, var1, var2);
      }

      sub_161e();
   }

   private static void sub_155c(int var0, int var1, int var2) {
      if(var1 > var0) {
         var1 = var1 * 128 >> 12;
         sub_142e((var0 = var0 * 128 >> 12) + 15, 308, var1 - var0, 12);
         var_26a9.sub_429(var_3ec, var2, 120, 320, 0);
      }

   }

   private static void sub_158e() {
      int var0 = (var_4a02 & 1) == 0?29:30;
      sub_155c(var_20ae, var_208e, 28);
      sub_155c(var_208e, var_2034, var0);
      sub_155c(var_2034, var_209d, var0);
      sub_155c(var_209d, var_20d0, 27);
      var_20d0 = var_209d;
      var_20ae = var_208e;
   }

   private static int sub_15b3(int var0, int var1, int var2, int var3) {
      int var7 = 25 * (var0 + 1);
      int var5 = (320 - var7) / 2;
      var_3ec.setColor(var1);
      sub_a6c(5, var5, 230, var7);
      var_3ec.setColor(16777215);
      var_3ec.drawRect(5, var5, 229, var7 - 1);
      var_3ec.drawLine(5, var5 + var7 - 25, 234, var5 + var7 - 25);
      int var8 = var2;
      var2 = var3;
      var3 = var8;
      var8 = var_26a9.sub_270(36, 0);
      if(var3 >= 0) {
         var_26a9.sub_429(var_3ec, 36, 234, var5 + var7 - 1, 0);
         sub_b8e(var3, 0, 235 - var8 - 2, var5 + var7 - 12, 10);
      }

      if(var2 >= 0) {
         var_26a9.sub_429(var_3ec, 36, 5 + var8 + 1, var5 + var7 - 1, 0);
         sub_b8e(var2, 0, 7 + var8, var5 + var7 - 12, 6);
      }

      return var5;
   }

   private static void sub_15e4(int var0, int var1, int var2) {
      var_3ec.setColor(var2);
      var_3ec.fillRect(10, var0 + 25 * var1 + 1, 220, 23);
      var_3ec.setColor(0);
      var_3ec.drawRect(10, var0 + 25 * var1 + 1, 219, 22);
   }

   private static void sub_161e() {
      var_26a9.sub_429(var_3ec, 36, 0, 320, 1);
   }

   private static void sub_167d() {
      boolean var14 = false;
      int var15 = 0;
      int var16 = 0;
      int var17 = 0;
      int var2 = var_2b71;
      int var3 = var_2af6;
      int var4 = var_363f[var2] - var_2b26;
      int var5 = -var_2bd6;
      int var6 = -var_2b8f;
      int var7 = -var_2aa8;
      int var22 = var_44e8.var_63f * Class_6b.var_361[512 - (var_363f[var_44e8.var_532] - var_2b26) & 2047] >> 12;
      if(var_44e8.var_532 != var_2b71) {
         var22 += Class_6b.var_361[512 - (var_363f[var_2b71] - var_2b26) & 2047] << 10 >> 12;
      }

      var7 -= var22 + var_2c7e;
      int var23 = var_32be << 1;
      int var9 = 0;

      int var0;
      int var18;
      int var19;
      int var20;
      int var21;
      for(var0 = 0; var0 < 10; ++var0) {
         var_3dba[var0] = 0;
         var_3e61[var0] = 0;
         int var8 = -Class_6b.var_361[512 - var3 & 2047];
         var9 = Class_6b.var_361[var3 & 2047] * Class_6b.var_361[var4 & 2047] >> 12;
         short var10 = Class_6b.var_361[512 - var4 & 2047];
         var_3b7d[var0] = var2;
         var_3bbe[var0] = var5;
         var_3bfe[var0] = var6;
         var_3c51[var0] = var7;
         var_3c80[var0] = var8;
         var_3c8a[var0] = var9;
         var_3cab[var0] = var10;
         int var11 = var5 - var_32be;
         int var12 = var6;
         int var13 = var7;
         var5 += var8 >> 2;
         var6 += var9 >> 2;
         var7 += var10 >> 2;
         var15 = var5 - var_32be;
         var16 = var6;
         var17 = var7;
         var_3fc9[var0] = 0;
         var_3cf2[var0] = 0;
         if(var6 >= 500) {
            if(var12 < 500) {
               var11 += (var15 - var11) * (500 - var12) / (var6 - var12);
               var13 += (var7 - var13) * (500 - var12) / (var6 - var12);
               var12 = 500;
            }

            label41: {
               var21 = (var_2a74 << 12) / var12;
               var19 = var_2da8 - (var13 * var21 >> 12);
               var18 = 120 + (var11 * var21 >> 12);
               short var10000;
               if((var20 = var23 * var21 >> 12) < 22) {
                  var18 += var20 - 22 >> 1;
                  var10000 = 22;
               } else {
                  if(var20 <= 518) {
                     break label41;
                  }

                  int var1 = var20 - 518;
                  var18 += (var1 >> 1) + var1 * var_2bd6 / (var_32be << 1);
                  var10000 = 518;
               }

               var20 = var10000;
            }

            var_3f34[var0] = var18;
            var_3f84[var0] = var19;
            var_3fc9[var0] = var20;
            var_3cf2[var0] = var21;
         }

         ++var2;
         if(var2 >= var_35f4) {
            var2 = 0;
         }

         var3 += var_3629[var2];
         var4 = var_363f[var2] - var_2b26;
      }

      var_3fc9[var0] = 0;
      var_3cf2[var0] = 0;
      if(var16 >= 500 && var9 > 0) {
         var21 = (var_2a74 << 12) / var16;
         var19 = var_2da8 - (var17 * var21 >> 12);
         var18 = 120 + (var15 * var21 >> 12);
         var20 = var23 * var21 >> 12;
         var_3bbe[var0] = var5;
         var_3bfe[var0] = var6;
         var_3c51[var0] = var7;
         if(var20 < 22) {
            var18 += var20 - 22 >> 1;
            var20 = 22;
         }

         var_3f34[var0] = var18;
         var_3f84[var0] = var19;
         var_3fc9[var0] = var20;
         var_3cf2[var0] = var21;
      }

   }

   private static void sub_16ab() {
      boolean var31 = false;
      boolean var32 = false;
      boolean var33 = false;
      int var34 = 0;
      int var35 = 0;
      int var36 = 0;
      int var37 = 0;
      boolean var38 = false;
      boolean var39 = false;
      boolean var40 = false;
      int var4 = var_2b71;
      var_3edf = 290;
      int var0 = 290;
      int var1 = 0 - var_5266;
      int var2 = 240;
      int var3 = var1 + 240;
      var_3ec.setColor(16711680);
      sub_13f5();

      for(int var50 = 0; var50 < 10; ++var50) {
         boolean var41 = false;
         boolean var42 = false;
         if(var_3fc9[var50] != 0 && var_3fc9[var50 + 1] != 0) {
            var_3d1b[var50] = var0;
            var_3d62[var50] = var1;
            var_3da9[var50] = var2;
            int var5 = var_3f34[var50];
            int var6 = var_3f84[var50];
            int var7 = var_3fc9[var50];
            int var8 = var_3f34[var50 + 1];
            int var9 = var_3f84[var50 + 1];
            int var10 = var_3fc9[var50 + 1];
            int var53 = var_3694[var4] >> 2 & 3;
            int var54 = var_3694[var4] >> 4 & 3;
            int var12;
            int var13;
            int var14;
            int var10000;
            int var22;
            int var23;
            int var27;
            int var28;
            if(var53 <= 0 && var54 <= 0) {
               var12 = var5;
               var13 = var8;
               var14 = var7;
               var10000 = var10;
            } else if(var53 + var54 >= var_349d) {
               var12 = var5 + (var7 >> 1);
               var13 = var8 + (var10 >> 1);
               var14 = 0;
               var10000 = 0;
            } else {
               var27 = var7 / var_349d;
               var28 = var10 / var_349d;
               var22 = var27 * var53;
               var23 = var28 * var53;
               var12 = var5 + var22;
               var14 = var7 - (var22 + var27 * var54);
               var13 = var8 + var23;
               var10000 = var10 - (var23 + var28 * var54);
            }

            int var15 = var10000;
            if(var53 != var34 || var54 != var35) {
               var38 = false;
            }

            var34 = var53;
            var35 = var54;
            byte var49 = var_3b5b[var4];
            if(var6 >= 56 && var9 <= 290) {
               int var21;
               int var52 = (var21 = var_3bfe[var50]) > var_3214?(var21 - var_3214 << 8) / (10240 - var_3214):0;
               int var24;
               int var29;
               if((var49 & 192) == 128) {
                  if(!var38) {
                     var39 = (var49 & 1) != 0;
                     var40 = (var49 & 2) != 0;
                  }

                  var29 = (var4 & 1) == 0?var_43a8:var_43da;
                  var29 = sub_112a(var_31d5, var29, var52);
                  var_3ec.setColor(var29);
                  var21 = var_3edf;
                  if(var39) {
                     if(var12 < var13) {
                        var22 = var12;
                        var23 = var13;
                     } else {
                        var22 = var13;
                        var23 = var12;
                        if(var12 > var1) {
                           var_3da9[var50] += var_3d62[var50] - var12;
                           var_3d62[var50] = var12;
                        }
                     }

                     if(var23 > var3) {
                        var23 = var3;
                     }

                     if(var23 > var1) {
                        if(!var38 || var50 == 0) {
                           var22 = 0 - var_5266;
                        }

                        if(var22 < var1) {
                           var22 = var1;
                        }

                        var_3ec.fillRect(var22, 56, var23 - var22, var21 - 56);
                        var2 += var1 - var23;
                        var1 = var23;
                     }

                     var41 = true;
                  }

                  if(var40) {
                     var22 = var12 + var14;
                     if((var23 = var13 + var15) > var22) {
                        var24 = var22;
                        var22 = var23;
                        var23 = var24;
                        if(var24 < var3) {
                           var_3da9[var50] = var24 - var_3d62[var50];
                        }
                     }

                     if(var23 < var1) {
                        var23 = var1;
                     }

                     if(var23 < var3) {
                        if(!var38 || var50 == 0) {
                           var22 = 240 - var_5266;
                        }

                        if(var22 > var3) {
                           var22 = var3;
                        }

                        var_3ec.fillRect(var23, 56, var22 - var23, var21 - 56);
                        var2 = var23 - var1;
                     }

                     var42 = true;
                  }

                  var38 = true;
               }

               var3 = var1 + var2;
               if(var6 < var9) {
                  if(var6 < var0) {
                     var0 = var6 + 1;
                  }

                  var_3d1b[var50] = var0;
               } else if(var6 >= var9) {
                  int var17;
                  label228: {
                     var17 = var6;
                     if(var6 >= var_3edf) {
                        var10000 = var_3edf - 1;
                     } else {
                        if(var6 < 290) {
                           break label228;
                        }

                        var10000 = 289;
                     }

                     var17 = var10000;
                  }

                  if(var9 < 56) {
                     var9 = 56;
                  }

                  if(var17 >= var9 && var_3da9[var50] > 0) {
                     int var30 = (var4 & 1) == 0?var_326e:var_3281;
                     var30 = sub_112a(var_31bf, var30, var52);
                     if((var49 & 192) == 64) {
                        var28 = var49 & 15;
                        var29 = var_395f[var28][var4 & 1];
                        var29 = sub_112a(var_31d5, var29, var52);
                        var27 = var_3925[var28];
                        int var26 = var_3cf2[var50 + 1];
                        if(!var38) {
                           var39 = false;
                           var40 = false;
                           byte var51 = var_39af[var28];
                           int var25 = var_3cf2[var50];
                           var22 = var27 * var25 >> 12;
                           if((var51 & 1) != 0) {
                              var36 = var12 - var22;
                              var39 = true;
                           }

                           if((var51 & 2) != 0) {
                              var37 = var12 + var14 + var22;
                              var40 = true;
                           }

                           var38 = true;
                        }

                        var27 = var27 * var26 >> 12;
                        var24 = 0;
                        if(var39) {
                           var22 = var36;
                           var36 = var23 = var13 - var27;
                           sub_1779(var22, var23, var12 + 2, var13 + 2, var6, var9, var1, var30, var29);
                           var41 = true;
                           var24 = Math.max(var12, var13);
                        }

                        if(var40) {
                           var22 = var37;
                           var37 = var23 = var13 + var15 + var27;
                           sub_17c8(var22, var23, var12 + var14 - 2, var13 + var15 - 2, var6, var9, var24, var3, var30, var29);
                           var42 = true;
                        }
                     }

                     if(!var41) {
                        var22 = Math.min(Math.max(var12, var13) + 2, var3);
                        if(var1 < var22) {
                           var_3ec.setColor(var30);
                           var_3ec.fillRect(var1, var9, var22 - var1, var6 - var9);
                        }
                     }

                     if(!var42) {
                        var22 = Math.max(Math.min(var12 + var14, var13 + var15) - 2, var1);
                        if(var3 > var22) {
                           var_3ec.setColor(var30);
                           var_3ec.fillRect(var22, var9, var3 - var22, var6 - var9);
                        }
                     }

                     int var19 = (var8 - var5 << 16) / (var9 - var6 - 1);
                     int var20 = (var10 - var7 << 16) / (var9 - var6 - 1);
                     int var16 = (var5 << 16) + (var17 - var6) * var19;
                     int var18 = (var7 << 16) + (var17 - var6) * var20;
                     if(var53 + var54 < var_349d) {
                        for(Image[] var43 = var_3254[var4 & 1]; var17 >= var9; var18 -= var20) {
                           int var11;
                           int var46 = var11 = var18 >> 16;
                           var11 -= 22;
                           var11 >>= 2;
                           int var48;
                           int var44 = (var48 = var43[var11].getWidth()) - var46;
                           int var45 = (var16 >> 16) - (var44 >> 1);
                           int var47 = var_34bf[var11] * var53;
                           var45 += var47;
                           var48 -= var47 + var_34bf[var11] * var54;
                           if((var22 = var45 - var_3d62[var50]) < 0) {
                              var48 += var22;
                              var47 -= var22;
                              var45 = var_3d62[var50];
                           }

                           if((var22 = var_3d62[var50] + var_3da9[var50] - (var45 + var48)) < 0) {
                              var48 += var22;
                           }

                           if(var48 > 0) {
                              var_3ec.drawRegion(var43[var11], var47, 0, var48, 1, 0, var45, var17, 20);
                           }

                           --var17;
                           var16 -= var19;
                        }

                        var10000 = var17 + 1;
                     } else {
                        var10000 = var9;
                     }

                     var_3edf = var10000;
                  }
               }
            }

            if(++var4 >= var_35f4) {
               var4 = 0;
            }

            if((var49 & 32) != 0) {
               var38 = false;
            }
         } else if(++var4 >= var_35f4) {
            var4 = 0;
         }
      }

      var_3d62[10] = var1;
      var_3da9[10] = var2;
   }

   private static void sub_1704(int var0) {
      ++var_4a02;
      var_44e8.sub_a41(var0);
      var_44e8.sub_f18(var0);
      var_4503.sub_c9b(var0);
      var_4503.sub_f18(var0);
      var_467f.sub_87c(var0);
      var_467f.sub_f18(var0);
      var_45ee.sub_1f4(var0);
      var_45ee.sub_f18(var0);
      var_4651.sub_2f8(var0);

      int var1;
      for(var1 = 0; var1 < var_4723.length; ++var1) {
         var_4723[var1].sub_4e(var0);
      }

      var_44e8.sub_ee();
      if(!var_44e8.var_a60) {
         for(var1 = 0; var1 < var_4723.length; ++var1) {
            if(var_4723[var1].var_48) {
               var_4723[var1].sub_cb();
            }
         }

         if(var_467f.var_48) {
            var_467f.sub_ee();
            var_467f.sub_cb();
         }

         if(var_4503.var_48) {
            var_4503.sub_cb();
         }
      }

      var_46d6.sub_943(var0);
      if(!var_44e8.var_a60 && var_45ee.var_48) {
         var_45ee.sub_ee();
         var_45ee.sub_cb();
      }

      int var10000;
      if(!var_11b3) {
         label88: {
            label87: {
               if(var_105e == 1) {
                  if(!var_467f.var_48) {
                     var10000 = var_467f.sub_6d3() <= 0?0:1;
                     break label87;
                  }

                  var_4761 = 0;
                  if(var_467f.sub_d2c(var_44e8) <= -100) {
                     break label88;
                  }
               } else {
                  var_4761 = var_467f.var_98;
                  if(!var_467f.var_48 || var_467f.sub_d2c(var_44e8) <= -100) {
                     break label88;
                  }
               }

               var10000 = var_4761 + 1;
            }

            var_4761 = var10000;
         }
      }

      if(var_2134 != var_4761) {
         if(var_105e != 2) {
            var_2017 |= 16;
         }

         var_2134 = var_4761;
      }

      var_2da8 = 190 + (var_3127 >> 1);
      var_2c34 = 0;
      var_2c7e += Math.min(Math.max(var0 * 5, 0), 4096) * (var_44e8.var_68f - var_2c7e) >> 12;
      var_2b71 = var_44e8.var_532;
      var_2b8f = var_44e8.var_63f - (640 + var_2aca);
      short[] var10001;
      short var10002;
      int var10003;
      if(var_2b8f < 0) {
         var_2b8f += 1024;
         --var_2b71;
         if(var_2b71 < 0) {
            var_2b71 += var_35f4;
         }

         var_2af6 = -(var_3629[var_44e8.var_532] * var_44e8.var_63f) >> 10;
         var_2bd6 = var_44e8.var_5d4;
         var_2bd6 -= Class_6b.var_361[512 - var_2af6 & 2047] << 10 >> 12;
         var10000 = var_2bd6;
         var10001 = Class_6b.var_361;
         var10002 = 512;
         var10003 = var_2af6 + var_3629[var_44e8.var_532];
      } else {
         var_2af6 = var_3629[var_44e8.var_532] * (1024 - var_44e8.var_63f) >> 10;
         var10000 = var_44e8.var_5d4;
         var10001 = Class_6b.var_361;
         var10002 = 512;
         var10003 = var_2af6;
      }

      var_2bd6 = var10000 - (var10001[var10002 - var10003 & 2047] * var_44e8.var_63f >> 12);
      if(!var_22a5) {
         var_2bd6 += var_2c34;
      }

      var_2b26 += Math.min(Math.max(var0 * 3, 0), 4096) * (var_363f[var_2b71] - var_2b26) >> 12;
      int var2 = var_2cce + (var_3629[var_44e8.var_532] * var_44e8.var_63f >> 10);
      var_2ef6 = 240 * ((var2 << 7) / var_30ab & 2047) >> 11;
      var_2fe6 = 240 * ((var2 << 7) / var_30e8 & 2047) >> 11;
      int var3 = var_2d25 + (var_363f[var_44e8.var_532] * var_44e8.var_63f >> 10);
      int var4 = ((Class_6b.var_361[512 - var_2b26 & 2047] << 13) / var_30ab >> 12) + var_3127;
      int var5 = ((Class_6b.var_361[512 - var_2b26 & 2047] << 13) / var_30e8 >> 12) + var_3127;
      var_2f96 = var_2f40 + (var3 << 2) / var_30ab + var4;
      var_3058 = var_3003 + (var3 << 2) / var_30e8 + var5;
      sub_138f(var0);
      sub_e76(var0);
      if(var_105e == 1) {
         if(var_44e8.var_70e == 2 && var_44e8.var_70e != var_44e8.var_74c) {
            sub_2350();
         }

         if(!var_467f.var_48 && var_467f.sub_6d3() > 0 && var_44e8.var_532 % 50 == 0) {
            sub_d62(15);
         }
      }

   }

   private static void sub_1732() {
      int var33 = 0;
      int var34 = 0;
      int var35 = 0;
      boolean var36 = false;
      var_499b = (var_3bbe[3] - var_3bbe[0]) / 10;

      for(int var0 = 9; var0 >= 0; --var0) {
         sub_13f5();
         var_3ec.clipRect(var_3d62[var0], 56, var_3da9[var0], var_3d1b[var0] - 56);
         int var1 = var_3b7d[var0];
         int var3 = var_3bbe[var0];
         int var7 = var_3bfe[var0];
         int var11 = var_3c51[var0];
         int var15 = var_3cf2[var0];
         int var39 = var7 > var_3214?(var7 - var_3214 << 8) / (10240 - var_3214):0;
         int var10001;
         int var19;
         int var20;
         int var21;
         int var23;
         int var24;
         int var25;
         int var27;
         int var28;
         int var37;
         if(var1 == 0 && var7 > 500) {
            var27 = var11 + 800;
            var28 = var11 + 500;
            var20 = (var19 = var_3f34[var0]) + var_3fc9[var0];
            var23 = var_2da8 - (var27 * var15 >> 12);
            var24 = var_2da8 - (var28 * var15 >> 12);

            for(var25 = 0; var25 < 2; ++var25) {
               var37 = var25 & 1;

               for(var21 = 0; var21 < 8; ++var21) {
                  Graphics var10000;
                  if(var37 == 0) {
                     var10000 = var_3ec;
                     var10001 = 0;
                  } else {
                     var10000 = var_3ec;
                     var10001 = 16777215;
                  }

                  var10000.setColor(var10001);
                  sub_a6c(((var20 - var19) * var21 >> 3) + var19, ((var24 - var23) * var25 >> 1) + var23, (var20 - var19 >> 3) + 1, (var24 - var23 >> 1) + 1);
                  var37 = var37 + 1 & 1;
               }
            }

            var_3ec.setColor(0);
            var_3ec.drawLine(var19, var23, var19, var_3f84[var0]);
            var_3ec.drawLine(var20, var23, var20, var_3f84[var0]);
         }

         if(var_4651.var_48 && var0 == 2) {
            var_4651.sub_35a();
         }

         byte var44;
         int var50;
         if((var44 = var_3b5b[var1]) != 0 && (var44 & 192) == 192) {
            if(var0 == 0) {
               var19 = 0 - var_5266;
               var20 = 240 - var_5266;
               var50 = 56;
            } else {
               var20 = (var19 = var_3f34[var0]) + var_3fc9[var0];
               var50 = var_2da8 - ((var11 + var_4368) * var15 >> 12);
            }

            var23 = var50;
            if(var36) {
               if((var1 & 1) == 0) {
                  var37 = var_425c;
                  var50 = var_4281;
               } else {
                  var37 = var_42a5;
                  var50 = var_42b4;
               }

               var27 = var50;
               if(var39 > 0) {
                  var37 = sub_112a(var_31d5, var37, var39);
                  var27 = sub_112a(var_31d5, var27, var39);
               }

               var24 = var_3f84[var0 + 1];
               var_3ec.setColor(var27);
               sub_a6c(var19, var23, var20 - var19, var35 - var23);
               var_3ec.setColor(var37);
               var25 = var_3f84[var0];
               sub_ac9(var19, var23, var19, var25, var33, var35);
               sub_ac9(var33, var35, var19, var25, var33, var24);
               sub_ac9(var20, var23, var20, var25, var34, var35);
               sub_ac9(var34, var35, var20, var25, var34, var24);
            }

            var33 = var19;
            var34 = var20;
            var35 = var23;
            var36 = true;
            if((var44 & 16) != 0) {
               var21 = (var20 - var19) * var_42f8 >> 10;
               var25 = var_3f84[var0];
               var24 = var23 - (var25 - var23) * var_4354 / var_4368;
               var37 = var_42dc;
               if(var39 > 0) {
                  var37 = sub_112a(var_31d5, var37, var39);
               }

               var_3ec.setColor(var37);
               sub_a6c(var19 - var21, var24, var21, var25 - var24);
               sub_a6c(var20, var24, var21, var25 - var24);
               sub_a6c(var19, var24, var20 - var19, var23 - var24);
               var36 = false;
            }
         }

         short var49;
         if((var49 = var_3b22[var1]) != 0 && var7 > 500) {
            boolean var2;
            int var16;
            if((var49 & '\uf000') == 12288 && var0 != 0 && var0 < 15) {
               var2 = (var49 & 2048) != 0;
               int var42 = var49 & 2047;
               var37 = 0;

               for(int var43 = 0; var43 < var_3871[var42]; ++var43) {
                  short[] var41;
                  if((var41 = var_388c[var42][var43])[0] == 0) {
                     var37 = var41[3] + (var41[2] << 8) + (var41[1] << 16);
                     if(var39 != 0) {
                        var37 = sub_112a(var_31d5, var37, var39);
                     }
                  } else if(var41[0] == 1) {
                     if(var2) {
                        var19 = (var20 = -var41[1] + var3) - var41[3];
                     } else {
                        var20 = (var19 = var41[1] + var3) + var41[3];
                     }

                     var23 = (var24 = var41[2] + var11) + var41[4];
                     var19 = 120 + (var19 * var15 >> 12);
                     var20 = 120 + (var20 * var15 >> 12);
                     var23 = var_2da8 - (var23 * var15 >> 12);
                     var24 = var_2da8 - (var24 * var15 >> 12);
                     var_3ec.setColor(var37);
                     sub_a6c(var19, var23, var20 - var19, var24 - var23);
                  } else {
                     int var17;
                     int var30;
                     int var31;
                     if(var41[0] == 2) {
                        var30 = var0 + (var41[2] >> 14);
                        var31 = var0 + (var41[4] >> 14);
                        int var32 = var0 + (var41[6] >> 14);
                        if(var30 < 10 && var31 < 10 && var32 < 10) {
                           var16 = var_3cf2[var30];
                           var17 = var_3cf2[var31];
                           int var18 = var_3cf2[var32];
                           if(var16 != 0 && var17 != 0 && var18 != 0) {
                              var23 = (var41[2] & 8191) + var_3c51[var30];
                              var24 = (var41[4] & 8191) + var_3c51[var31];
                              var25 = (var41[6] & 8191) + var_3c51[var32];
                              if(var2) {
                                 var19 = -var41[1] + var_3bbe[var30];
                                 var20 = -var41[3] + var_3bbe[var31];
                                 var50 = -var41[5];
                              } else {
                                 var19 = var41[1] + var_3bbe[var30];
                                 var20 = var41[3] + var_3bbe[var31];
                                 var50 = var41[5];
                              }

                              var21 = var50 + var_3bbe[var32];
                              var19 = 120 + (var19 * var16 >> 12);
                              var20 = 120 + (var20 * var17 >> 12);
                              var21 = 120 + (var21 * var18 >> 12);
                              var23 = var_2da8 - (var23 * var16 >> 12);
                              var24 = var_2da8 - (var24 * var17 >> 12);
                              var25 = var_2da8 - (var25 * var18 >> 12);
                              var_3ec.setColor(var37);
                              sub_ac9(var19, var23, var20, var24, var21, var25);
                           }
                        }
                     } else if(var41[0] == 3) {
                        var30 = var0 + (var41[2] >> 14);
                        var31 = var0 + (var41[4] >> 14);
                        if(var30 <= 10 && var31 <= 10) {
                           var16 = var_3cf2[var30];
                           var17 = var_3cf2[var31];
                           if(var16 != 0 && var17 != 0) {
                              var23 = (var41[2] & 8191) + var_3c51[var30];
                              var24 = (var41[4] & 8191) + var_3c51[var31];
                              if(var2) {
                                 var19 = -var41[1] + var_3bbe[var30];
                                 var50 = -var41[3];
                              } else {
                                 var19 = var41[1] + var_3bbe[var30];
                                 var50 = var41[3];
                              }

                              var20 = var50 + var_3bbe[var31];
                              var19 = 120 + (var19 * var16 >> 12);
                              var20 = 120 + (var20 * var17 >> 12);
                              var23 = var_2da8 - (var23 * var16 >> 12);
                              var24 = var_2da8 - (var24 * var17 >> 12);
                              var_3ec.setColor(var37);
                              var_3ec.drawLine(var19, var23, var20, var24);
                           }
                        }
                     }
                  }
               }
            }

            int var22;
            if((var49 & '\uf000') == 8192) {
               if(var0 >= 9) {
                  continue;
               }

               var2 = (var49 & 2048) != 0;
               int var29 = var49 & 2047;
               var27 = var_32be + var_401d;
               short var40 = var_41dd[var29];
               if(var2) {
                  var27 = -var27 - var40;
               }

               var28 = var27 + var40;
               var19 = 120 + ((var3 + var27) * var15 >> 12);
               var20 = 120 + ((var3 + var28) * var15 >> 12);
               var23 = var_2da8 - ((var11 + var_4241[var29]) * var15 >> 12);
               var24 = var_2da8 - (var11 * var15 >> 12);
               var16 = var_3cf2[var0 + 1];
               int var12 = var_3c51[var0 + 1];
               var25 = var_2da8 - ((var12 + var_4241[var29]) * var16 >> 12);
               int var26 = var_2da8 - (var12 * var16 >> 12);
               var37 = sub_112a(var_41aa[var29], 0, var_4078);
               if(var39 != 0) {
                  var37 = sub_112a(var_31d5, var37, var39);
               }

               var_3ec.setColor(var37);
               sub_a6c(var19, var23, var20 - var19, var24 - var23);
               var21 = 120 + ((var_3bbe[var0 + 1] + var28) * var16 >> 12);
               var22 = 120 + ((var_3bbe[var0 + 1] + var27) * var16 >> 12);
               int var10002;
               int var10003;
               int var10004;
               int var10005;
               if(var21 > var20) {
                  var37 = sub_112a(var_41aa[var29], 16777215, var_4113);
                  if(var39 != 0) {
                     var37 = sub_112a(var_31d5, var37, var39);
                  }

                  var_3ec.setColor(var37);
                  sub_ac9(var20, var23, var21, var25, var20, var24);
                  var50 = var21;
                  var10001 = var25;
                  var10002 = var20;
                  var10003 = var24;
                  var10004 = var21;
                  var10005 = var26;
               } else {
                  var37 = sub_112a(var_41aa[var29], 0, var_40af);
                  if(var39 != 0) {
                     var37 = sub_112a(var_31d5, var37, var39);
                  }

                  var_3ec.setColor(var37);
                  sub_ac9(var22, var25, var19, var23, var22, var26);
                  var50 = var19;
                  var10001 = var23;
                  var10002 = var22;
                  var10003 = var26;
                  var10004 = var19;
                  var10005 = var24;
               }

               sub_ac9(var50, var10001, var10002, var10003, var10004, var10005);
            }

            if((var49 & '\uf000') == 4096) {
               var2 = (var49 & 2048) == 0;
               var22 = var49 & 2047;
               short var48 = var_3af6[var22];
               var22 = var_3aea[var22] & 255;
               var19 = var48 + var3;
               var27 = var_3a70[var22] + var11;
               var16 = Math.min(4096, (640 + var_2aca << 12) / var7);
               var19 = 120 + (var19 * var15 >> 12);
               var23 = var_2da8 - (var27 * var15 >> 12);
               sub_a18(10 + var22, var16, var19, var23, var2?1:0);
            }
         }

         if(var0 <= 12) {
            Class_9b[] var45 = var_3e97[var0];
            short var46 = var_3e61[var0];

            int var47;
            for(var47 = 0; var47 < var46; ++var47) {
               var45[var47].sub_517();
            }

            var45 = var_3e1d[var0];
            var46 = var_3dba[var0];

            for(var47 = 0; var47 < var46; ++var47) {
               var45[var47].sub_3e3();
            }
         }
      }

      sub_13f5();
   }

   private static void sub_1779(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var13 = var4;
      int var9;
      int var12;
      int var10000;
      if(var1 > var0) {
         if(var0 < var6) {
            var13 = var5 + (var4 - var5) * (var6 - var1) / (var0 - var1) + 1;
            var0 = var6;
         }

         var9 = var0;
         var12 = var5;
         var10000 = var1;
      } else {
         if(var1 < var6) {
            var1 = var6;
         }

         var9 = var1;
         var12 = var4;
         var10000 = var0;
      }

      int var10 = var10000;
      int var11;
      if((var11 = Math.max(var2, var3)) > var6) {
         if(var11 > var10) {
            var_3ec.setColor(var7);
            var_3ec.fillRect(var9, var5, var11 - var9, var4 - var5);
         }

         var_3ec.setColor(var8);
         if(var10 > var6) {
            var_3ec.fillTriangle(var0, var13, var1, var5, var9, var12);
         }

         if(var9 > var6) {
            var_3ec.fillRect(var6, var5, var9 - var6, var4 - var5);
         }
      }

   }

   private static void sub_17c8(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var14 = var4;
      int var10;
      int var11;
      int var10000;
      if(var1 < var0) {
         if(var0 > var7) {
            var14 = var5 + (var4 - var5) * (var7 - var1) / (var0 - var1) + 1;
            var0 = var7;
         }

         var10 = var0;
         var11 = var1;
         var10000 = var5;
      } else {
         if(var1 > var7) {
            var1 = var7;
         }

         var10 = var1;
         var11 = var0;
         var10000 = var4;
      }

      int var13 = var10000;
      int var12;
      if((var12 = Math.min(var2, var3)) < var7) {
         if(var12 < var11) {
            var_3ec.setColor(var8);
            if(var12 < var6) {
               var12 = var6;
            }

            var_3ec.fillRect(var12, var5, var10 - var12, var4 - var5);
         }

         var_3ec.setColor(var9);
         if(var11 < var7) {
            var_3ec.fillTriangle(var0, var14, var1, var5, var10, var13);
         }

         if(var10 < var7) {
            var_3ec.fillRect(var10, var5, var7 - var10, var4 - var5);
         }
      }

   }

   private static void sub_17dc() {
      sub_167d();
      sub_13f5();
      sub_16ab();
      sub_13f5();
      int var4 = var_2ed9.getHeight();
      int var5;
      if((var5 = var_3058 + var4) > var_3edf) {
         var4 = var_3edf - var_3058;
         var5 = var_3edf;
      }

      int var6;
      Graphics var10000;
      int var10001;
      if(var_3da9[10] > 0) {
         label91: {
            sub_13f5();
            int var10002;
            short var10003;
            int var10004;
            if(var_5290 > 0) {
               var_3ec.setColor(var_3154);
               var10000 = var_3ec;
               var10001 = 0 - var_5266;
               var10002 = 56 - var_5290;
               var10003 = 240;
               var10004 = var_5290;
            } else {
               if(var_5290 >= 0) {
                  break label91;
               }

               var_3ec.setColor(var_33e5);
               var10000 = var_3ec;
               var10001 = 0 - var_5266;
               var10002 = 290;
               var10003 = 240;
               var10004 = -var_5290;
            }

            var10000.fillRect(var10001, var10002, var10003, var10004);
         }

         var_3ec.clipRect(var_3d62[10], 56, var_3da9[10], 234);
         var6 = var_2e81.getHeight();
         int var7;
         if((var7 = var_2f96 + var6) > var_3edf) {
            var6 = var_3edf - var_2f96;
            var7 = var_3edf;
         }

         if(var_2f96 > 56) {
            var_3ec.setColor(var_3154);
            var_3ec.fillRect(0 - var_5266, 56, 240, Math.min(var_2f96, var_3edf) - 56);
         }

         if(var7 < var5) {
            var_3ec.setColor(var_316b);
            sub_a6c(0 - var_5266, var7, 240, var5 - var7);
         } else {
            var6 = var5 - var_2f96;
         }

         if(var6 > 0) {
            var_3ec.drawRegion(var_2e81, 0, 0, 240 - var_2ef6, var6, 0, var_2ef6 - var_5266, var_2f96, 0);
            var_3ec.drawRegion(var_2e81, 240 - var_2ef6, 0, var_2ef6, var6, 0, -var_5266, var_2f96, 0);
         }

         if(var4 > 0) {
            var_3ec.drawRegion(var_2ed9, 0, 0, 240 - var_2fe6, var4, 0, var_2fe6 - var_5266, var_3058, 0);
            var_3ec.drawRegion(var_2ed9, 240 - var_2fe6, 0, var_2fe6, var4, 0, -var_5266, var_3058, 0);
         }

         if(var5 < var_3edf) {
            var_3ec.setColor(var_31bf);
            var_3ec.fillRect(0 - var_5266, var5, 240, var_3edf - var5);
         }
      }

      int var2;
      if(!var_4832) {
         for(var2 = 0; var2 < var_4723.length; ++var2) {
            sub_180c(var_4723[var2]);
         }
      }

      sub_180c(var_46d6);
      sub_180c(var_4503);
      sub_180c(var_467f);
      sub_180c(var_45ee);
      sub_180c(var_44e8);
      sub_1732();
      if(!var_4832 && var_44e8.var_2f5 > 1) {
         sub_13f5();
         sub_1438(1, 57, 238, 232);

         for(var2 = 0; var2 < 5; ++var2) {
            int var0 = Class_6b.var_361[512 - var_495d[var2][0] & 2047] << 4;
            int var1 = Class_6b.var_361[var_495d[var2][0] & 2047] << 4;
            int var3 = (60 - var_3127 + var_495d[var2][1]) / 10;
            if(var_495d[var2][0] >= 624 && var_495d[var2][0] <= 1416) {
               var10000 = var_3ec;
               var10001 = var_333d;
            } else {
               var10000 = var_3ec;
               var10001 = var_338b;
            }

            var10000.setColor(var10001);
            var_3ec.drawLine(120 + (var0 * 20 >> 12), 170 + var_3127 + (var1 * 20 >> 12), 120 + var_499b + (var0 * var3 >> 12), 170 + var_3127 + (var1 * var3 >> 12));
         }

         if(var_44e8.var_2f5 > 2) {
            var6 = var_4a02 >> 1 & 7;
            int[] var15 = var_52da[var6];

            for(var2 = 0; var2 < var15.length; ++var2) {
               int var14 = var15[var2] * 3;
               int var10 = var_52c7[var14] + var_44e8.var_767 - var_44e8.var_46f * 15;
               int var11 = var_52c7[var14 + 1] + var_44e8.var_7b7;
               int var13 = 290 - var_52c7[var14 + 2];
               int var16;
               if(var11 == 125) {
                  var16 = var10;
               } else {
                  var14 = (120 - var10 << 12) / (125 - var11);
                  var16 = 120 - (var14 * (125 - var13) >> 12);
               }

               int var12 = var16;
               var_3ec.setColor(14600869);
               var_3ec.drawLine(var10, var11, var12, var13);
            }
         }
      }

   }

   private static void sub_180c(Class_9b var0) {
      if(var0.var_48) {
         int var1;
         if((var1 = var0.var_532 - var_3b7d[0]) < 0) {
            var1 += var_35f4;
         }

         if((var1 < 9 || var1 == 9 && var0.var_63f < var_2b8f) && var0.sub_39e(var1)) {
            short var2 = var_3dba[var1];
            Class_9b[] var3 = var_3e1d[var1];
            int var4 = 0;
            if(var2 < var3.length) {
               while(var4 < var2 && var3[var4].var_63f >= var0.var_63f) {
                  ++var4;
               }

               for(int var5 = var2; var5 > var4; --var5) {
                  var3[var5] = var3[var5 - 1];
               }

               var3[var4] = var0;
               ++var_3dba[var1];
            }

            if(var0.var_c == 0 || var0.var_c == 4) {
               var_3e97[var1][var_3e61[var1]] = var0;
               ++var_3e61[var1];
            }
         }

      }
   }

   private static void sub_1828() {
      var_2a74 = 128;
      var_2aa8 = 1220;
      var_3127 = 0;
      var_1150 = false;
      var_11b3 = false;

      int var0;
      for(var0 = 0; var0 < 2; ++var0) {
         var_4723[var0].var_48 = false;
      }

      var_4503.var_48 = false;
      var_467f.var_48 = false;
      var_45ee.var_48 = false;
      var_4651.var_48 = false;
      var_46d6.var_48 = false;
      var_44e8.sub_994(0, var_35f4 - 1, 1023, 0);
      var_44e8.var_442 = 0;
      var_44e8.var_46f = 0;
      var_44e8.var_2f5 = 0;
      Class_9b.var_c5f = 1;
      var_44e8.var_48 = true;
      Class_9b.var_b39 = 0;
      Class_9b.var_da7 = -1;
      var_2af6 = 0;
      var_2b26 = 0;
      var_2b71 = var_44e8.var_532;
      var_2b8f = var_44e8.var_63f - 640;
      var_2bd6 = var_44e8.var_5d4;
      var_2c34 = 0;
      var_2cce = 0;
      var_2d25 = 0;
      if(var_2b8f < 0) {
         var_2b8f += 1024;
         --var_2b71;
         if(var_2b71 < 0) {
            var_2b71 += var_35f4;
         }
      }

      var_2ef6 = 0;
      var_2fe6 = 0;
      var_2da8 = 190;
      var_1ea4 = 0;
      Class_9b.var_10e5 = 4096;
      Class_9b.var_111b = 4096;
      var_1f1f = 1024;
      var_1ed8 = 0;
      var_47af = 0;
      var_47e4 = 0;
      var_4832 = false;
      var_2bd6 = var_44e8.var_5d4;
      var_2780 = 0;
      var_1f82 = -1;
      var_1f5b = 0;
      var_4543 = var_3782;
      var_459c = 16384;
      var_374b = 7;

      for(var0 = 0; var0 < 7; ++var0) {
         int[] var10000;
         byte var10001;
         byte var10002;
         if(var0 < 3) {
            var10000 = Class_9b.var_e14[var0];
            var10001 = 1;
            var10002 = 30;
         } else {
            var10000 = Class_9b.var_e14[var0];
            var10001 = 1;
            var10002 = 20;
         }

         var10000[var10001] = var10002 * var_37fd >> 7;
         Class_9b.var_e14[var0][0] = Class_9b.var_e14[var0][1];
      }

      Class_9b.sub_7ba();
      var_4761 = var_105e == 1?1:var_374b;
      sub_239b();
      var_200b = 0L;
      var_48e7 = 3;

      for(var0 = 0; var0 < var_120d.length; ++var0) {
         var_120d[var0] = 0;
      }

      if(var_105e == 1) {
         var_48ad = 20;
         var_48e7 = 2;
      } else if(var_105e == 3) {
         var_1ed8 = 30000;
         var_120d[13] += 30000;
         var_1f1f = 4096;
      }

      var_22a5 = false;
      var_2267 = 0;
      var_2468 = 0;
      var_24d0 = -1;
      var_247f = -1;
      var_252a = 0;

      for(var0 = 0; var0 < 1; ++var0) {
         var_2581[var0] = 0;
      }

      var_25c4 = 0;
      var_25dd = 0;
      var_262f = 0;
      var_2f96 = var_2f40;
      var_3058 = var_3003;
      var_2ef6 = 0;
      var_2fe6 = 0;
      Class_9b.sub_60e();
      var_27d5 = 0;
      var_2801 = 0;
      var_284e = false;
      var_2017 = 0;
      var_2034 = var_1f1f;
      var_209d = var_1f1f;
      var_208e = var_1f1f;
      var_20ae = 0;
      var_20d0 = 4096;
      var_2134 = var_4761;
      var_21ad = 172;
      var_21c1 = 317;
      var_221f = 1024;
      var_2aca = 0;
      Class_9b.sub_b6a();
      sub_133f();
      var_4a02 = 0;
      var_2d85 = 0;
      var_2c7e = 0;
      Class_9b.var_b9b = 0;
      Class_9b.var_1139 = 0;
      var_4943 = false;
   }

   private static void sub_1856() {
      var_e92 = new int[10];
      var_f50 = new boolean[10];
      var_f8d = new int[10];
      var_ed3 = true;
   }

   private static void sub_18a9(int var0) {
      for(int var1 = 0; var1 < 10; ++var1) {
         var_e92[var1] = 0;
         var_f50[var1] = false;
      }

      var_faa = 0;
      var_feb = var0;
      var_ed3 = true;
   }

   private static void sub_18b7(int var0) {
      int var1;
      if((var1 = var_214[var_feb][var0 + 3]) == -1) {
         sub_18e5();
      } else {
         int var2 = var_214[var1][0];
         var_f8d[var_faa] = var_feb;
         sub_283(var2);
         var_feb = var1;
         ++var_faa;
      }
   }

   private static void sub_18e5() {
      if(var_faa > 0) {
         --var_faa;
         var_feb = var_f8d[var_faa];
         var_ed3 = true;
         sub_283(var_214[var_feb][0]);
      }

   }

   private static boolean sub_1908(int var0, int var1, int var2, int var3, boolean var4) {
      var_ebe = 0;
      if(var_ed3 && (var_46b[5] < 0 || var_46b[13] < 0)) {
         if(var_f28) {
            try {
               if(!Class_6b.sub_836(0)) {
                  Class_6b.sub_6f5(7, 0, 1);
               }
            } catch (Exception var5) {
               ;
            }
         }

         return true;
      } else {
         int[] var10000;
         int var10001;
         int var10002;
         if(var_46b[var2] < 0) {
            label46: {
               var_ebe = -1;
               if(var_e92[var0] == 0) {
                  if(!var4) {
                     break label46;
                  }

                  var10000 = var_e92;
                  var10001 = var0;
                  var10002 = var1;
               } else {
                  var10000 = var_e92;
                  var10001 = var0;
                  var10002 = var_e92[var0];
               }

               var10000[var10001] = var10002 - 1;
            }

            var_f50[var0] = true;
         }

         if(var_46b[var3] < 0) {
            label38: {
               var_ebe = 1;
               if(var_e92[var0] == var1 - 1) {
                  if(!var4) {
                     break label38;
                  }

                  var10000 = var_e92;
                  var10001 = var0;
                  var10002 = 0;
               } else {
                  var10000 = var_e92;
                  var10001 = var0;
                  var10002 = var_e92[var0] + 1;
               }

               var10000[var10001] = var10002;
            }

            var_f50[var0] = true;
         }

         return false;
      }
   }

   private static boolean sub_1914(int var0, int var1, int var2, int var3) {
      if(sub_1908(var0, var1, var2, var3, true)) {
         sub_18b7(0);
         return true;
      } else {
         if(var_46b[14] < 0) {
            if(!Class_6b.sub_836(0)) {
               Class_6b.sub_6f5(8, 0, 1);
            }

            sub_18e5();
         }

         return false;
      }
   }

   private static void sub_1945(boolean var0, boolean var1) {
      if(var0) {
         sub_1960(var_214[var_feb][1], true);
      }

      if(var1) {
         sub_1960(var_214[var_feb][2], false);
      }

   }

   private static void sub_1960(int var0, boolean var1) {
      boolean var2 = false;
      boolean var4 = false;
      if(var0 != 10) {
         byte var10000;
         byte var5;
         short var6;
         if(var1) {
            var5 = 54;
            var6 = 238;
            var10000 = 40;
         } else {
            var5 = 53;
            var6 = 1;
            var10000 = 36;
         }

         byte var7 = var10000;
         var_23b2[35].sub_429(var_3ec, var5, 120, 320, 0);
         var_267b[1].var_373 = 0;
         sub_b8e(var0, 1, var6, 314, var7);
      }
   }

   private static void sub_1974(boolean var0) {
      var_3ec.setColor(0);
      sub_a6c(0, 0, 240, 320);
      var_3ec.drawImage(var_c54, 0, 0, 0);
      if(var0) {
         var_3ec.drawImage(var_c68, 0, 5, 0);
         var_3ec.drawImage(var_c74, var_c54.getWidth(), var_c54.getHeight(), 40);
         if(var_ca1 != null) {
            var_3ec.drawImage(var_ca1, 120, 320, 33);
         }
      }

   }

   private static void sub_19d7(int var0) {
      var_3ec.setColor(0);
      sub_a6c(0, 0, 240, 320);
      var_3ec.drawImage(var_cf4, 0, var0, 0);
   }

   private static void sub_1a07() {
      sub_142e(0, 0, 240, 320);
      var_3ec.setColor(0);
      sub_a6c(0, 0, 240, 320);
      sub_19d7(160);
      var_23b2[34].sub_429(var_3ec, 0, 0, 196, 0);
      var_23b2[35].sub_429(var_3ec, 0, 120, 0, 0);
      var_23b2[35].sub_429(var_3ec, 1, 120, 320, 0);
      var_23b2[35].sub_429(var_3ec, 3, 120, 320, 0);
   }

   private static void sub_1a2e(int var0, int var1) {
      var_1918 = var0;
      var_1940 = var1;
   }

   private static void sub_1a47(int var0, int var1) {
      var_1918 = var0;
      var_1940 = var1;
   }

   private static boolean sub_1a8a(int var0) {
      boolean var1 = false;
      if(var0 == 0) {
         if(var_46b[5] >= 0 && var_46b[13] >= 0) {
            return var1;
         }

         var_1c6a = !var_1c6a;
         sub_2313();
      } else {
         if(var0 != 1 || var_46b[5] >= 0 && var_46b[13] >= 0) {
            return var1;
         }

         var_1c3d = !var_1c3d;
      }

      var1 = true;
      return var1;
   }

   private static void sub_1aca() {
      var_8f3 = var_3ec;
      var_3ec = var_883;
   }

   private static void sub_1b25() {
      var_3ec = var_8f3;
      var_8f3 = null;
   }

   private static void sub_1b40() {
      var_3ec.drawImage(var_8cc, 0, 0, 0);
   }

   private static void sub_1b7c(int var0, boolean var1) {
      var_1c00 = 6144;
      var_1c13 = var0;
      var_1b8a = Class_6b.sub_496(0, 2) == 0;
      var_1bf6 = -1;
      int var2;
      short var5;
      if(var1) {
         var_1c00 = 6144;
         var_1c13 = var0;
         var_1b8a = Class_6b.sub_496(0, 2) == 0;
         var_1bf6 = Class_6b.sub_496(0, var0);
         boolean var3 = false;

         for(var2 = 0; var2 < var0; ++var2) {
            var_1bba[var2] = -1;
         }

         var_1bba[var_1bf6] = 0;

         for(int var4 = 1; var4 < var0; ++var4) {
            int var10000 = Class_6b.sub_496(0, var0);

            while(true) {
               var2 = var10000;
               if(var_1bba[var2] < 0) {
                  var_1bba[var2] = 30 * var4;
                  break;
               }

               var10000 = (var2 + 1) % var0;
            }
         }

         var5 = 0;
      } else {
         var_1c00 = 0;
         var_1c13 = var0;
         var_1b8a = true;
         var_1bf6 = 0;

         for(var2 = 0; var2 < var0; ++var2) {
            var_1bba[var2] = 0;
         }

         var5 = 240;
      }

      var_1bd8 = var5;
   }

   private static void sub_1ba5(int var0, int var1) {
      if(var_1c00 > 0) {
         int var2 = var_1bd8 - var_1bba[var0];
         if(var_1b8a) {
            var2 = 240 - var2;
         }

         sub_142e(var2 - 25, var1 - 10, 50, 20);
         var_23b2[38].sub_429(var_3ec, var0 == var_1bf6?1:0, var2, var1, var_1b8a?1:0);
      }
   }

   private static void sub_1bb6(int var0, int var1, int var2) {
      int var3;
      int var4;
      if(var_1b8a) {
         var4 = var_1bd8 - var_1bba[var0];
         var3 = 240 - var4;
      } else {
         var3 = 0;
         var4 = var_1bd8 - var_1bba[var0];
      }

      var_3ec.setClip(var3, var1, var4, var2);
   }

   private static boolean sub_1c01(int var0) {
      if(var_1bf6 == -1) {
         var_1bf6 = Class_6b.sub_496(0, var_1c13);
         return false;
      } else {
         var_1c00 -= var0;
         if(var_1c00 <= 0) {
            var_1c00 = 0;
         }

         var_1bd8 = (240 + var_1c13 * 30) * (6144 - var_1c00) / 6144;
         return var_1c00 == 0;
      }
   }

   private static void sub_1c58(int var0, int var1) {
      Class_9b.sub_45e(var_23b2[35], 2, var0, var1, (int)(var_64f & 511L), 512);
   }

   private static void sub_1cb9(int var0, int var1, boolean var2, int var3) {
      int var4 = var2?0:1;
      int var5 = var_23b2[35].sub_105(var4);
      var_23b2[35].sub_410(var_3ec, var4, var_586 % var5, var0, var1, var3);
   }

   private static void sub_1cfd(int var0, int var1, boolean var2, int var3) {
      int var4 = var2?0:1;
      int var5 = var_23b2[36].sub_105(var4);
      var_23b2[36].sub_410(var_3ec, var4, var_586 % var5, var0, var1, var3);
   }

   private static void sub_1d61() {
      sub_b20(var_1cda, 47, 0, 2, 2, 288, 20);
      var_267b[1].var_373 = 0;
      int var0;
      int var1;
      if((var1 = (var0 = var_1cda * 90) / var_226[var_226.length - 1]) > 90) {
         var1 = 90;
      }

      int var2 = 0;

      int var4;
      for(var4 = 0; var4 < 24; ++var4) {
         if(var_1d55[var4] == 1) {
            ++var2;
         }
      }

      var2 = var2 * 10 / 24;
      int var3;
      if((var3 = var1 + var2) == 0 && var_1cfb > 0) {
         var3 = 1;
      }

      var4 = sub_b20(var3, 50, 0, 1, 238, 288, 24);
      sub_b8e(26, 1, 238 - var4, 288, 24);
   }

   private static void sub_1d7f() {
      short[] var10 = var_1830[var_1019[0]];
      var_3ec.setColor(10256989);
      var_23b2[35].sub_429(var_3ec, 18, 120, 88, 0);
      sub_a6c(0, 236, 240, 47);
      var_23b2[35].sub_429(var_3ec, 19, 120, 320, 0);
      var_23b2[32].sub_429(var_3ec, 3, 240, 183, 1);
      sub_879(var_1669, var_16d6);
      sub_879(var_160d, var_167e[var_1019[0]]);
      boolean var0 = false;
      var_267b[1].var_373 = 3;
      sub_b8e(134, 1, 1, 240, 20);
      sub_b8e(135, 1, 1, 250, 20);
      sub_b8e(136, 1, 1, 260, 20);
      sub_b8e(137, 1, 1, 270, 20);
      int var2 = sub_8dc(var10[0], 0, var_160d);
      int var3 = sub_8dc(var10[1], 1, var_160d);
      int var4 = sub_8dc(var10[2], 2, var_160d);
      int var5 = sub_8dc(var10[3], 3, var_160d);
      int var6 = sub_8dc(var10[0], 0, var_1669);
      int var7 = sub_8dc(var10[1], 1, var_1669);
      int var8 = sub_8dc(var10[2], 2, var_1669);
      int var9 = sub_8dc(var10[3], 3, var_1669);
      if(!var_1c3d) {
         var2 = var2 * 1000 / 1609;
         var6 = var6 * 1000 / 1609;
      }

      sub_939(var6 - var2);
      sub_b20(var6, -1, 0, 1, 70, 240, 24);
      sub_939(var3 - var7);
      sub_b20(var7, -1, 1, 1, 70, 250, 24);
      sub_939(var4 - var8);
      sub_b20(var8, -1, 1, 1, 70, 260, 24);
      sub_939(var9 - var5);
      sub_b20(var9, -1, 0, 1, 70, 270, 24);
      var_267b[1].var_373 = 0;
      int var12 = 70 + (var_267b[1].var_6f0[3] - 1);
      Class_22 var11;
      (var11 = var_23b2[35]).sub_429(var_3ec, var_1c3d?56:55, var12, 240, 0);
      var11.sub_429(var_3ec, 57, var12, 250, 0);
      var11.sub_429(var_3ec, 57, var12, 260, 0);
      var11.sub_429(var_3ec, 58, var12, 270, 0);
   }

   private static void sub_1dc0(boolean var0) {
      label76: {
         var_18e1 += Math.min(Math.max(var_837 * 3, 0), 4096) * (0 - var_18e1) >> 12;
         int var10000;
         if(var_18e1 < 0) {
            var10000 = var_18e1 + 1;
         } else {
            if(var_18e1 <= 0) {
               break label76;
            }

            var10000 = var_18e1 - 1;
         }

         var_18e1 = var10000;
      }

      int var3 = 120 + var_18e1;

      int var1;
      int var2;
      for(var1 = (var2 = var_e92[0]) == 16?36:var_1462[var2]; var3 + var_23b2[35].sub_1e1(var1, 0) > -30; var1 = var2 == 16?36:var_1462[var2]) {
         var_23b2[35].sub_429(var_3ec, var1, var3, 32, 0);
         if(var2 != 16 && var0 && var_1870[var2] != 0) {
            sub_1e1b(var1, var3);
         }

         --var2;
         var3 -= 30;
         if(var2 < 0) {
            var2 += 17;
         }
      }

      var3 = 120 + var_18e1 + 30;
      if((var2 = var_e92[0] + 1) > 16) {
         var2 -= 17;
      }

      for(var1 = var2 == 16?36:var_1462[var2]; var3 + var_23b2[35].sub_1e1(var1, 0) < 240; var1 = var2 == 16?36:var_1462[var2]) {
         var_23b2[35].sub_429(var_3ec, var1, var3, 32, 0);
         if(var2 != 16 && var0 && var_1870[var2] != 0) {
            sub_1e1b(var1, var3);
         }

         var3 += 30;
         ++var2;
         if(var2 > 16) {
            var2 -= 17;
         }
      }

      var_23b2[32].sub_429(var_3ec, 2, 240, 183, 1);
   }

   private static void sub_1e1b(int var0, int var1) {
      sub_1e64(var1 + var_23b2[35].sub_1e1(var0, 0), 150);
   }

   private static void sub_1e64(int var0, int var1) {
      Class_9b.sub_45e(var_23b2[35], 3, var0, var1, (int)(var_64f & 511L), 512);
   }

   private static void sub_1e70() {
      sub_1b40();

      for(int var0 = 0; var0 < var_18ae; ++var0) {
         int var1 = 4 + var0 * 57;
         int var2 = 24 + var0 * 0;
         if(var_1841[var0] >= 0) {
            var_23b2[35].sub_410(var_3ec, 5, var_586 & 1, var1, var2, 0);
            var_23b2[35].sub_429(var_3ec, 51, var1, var2, 0);
         } else if(var_1870[var0] != -1) {
            sub_1c58(var1 + 28, var2);
         }
      }

   }

   private static void sub_1ec4(int var0, byte[] var1, int var2, int var3, int var4) {
      try {
         Class_22 var7 = var_23b2[var_1b64[var0]];
         boolean var8 = var_1cfb >= var_2f7[var0][1];
         int var6 = var7.sub_21c(0, 0) + var3;
         int var5 = (var4 & 1) == 0?var2 + var7.sub_1e1(0, 0):var2 - var7.sub_1e1(0, 0);
         if(var_2f7[var0][5] >= 0) {
            var7 = var_23b2[9];
            Class_22 var10000;
            int var10001;
            if(var8) {
               var10000 = var7;
               var10001 = var1[2];
            } else {
               var10000 = var7;
               var10001 = var7.var_325 - 1;
            }

            var10000.var_373 = var10001;
            var7.sub_429(var_3ec, var_2f7[var0][5], var5, var6, var4);
            var7 = var_23b2[var_1b64[var0]];
         }

         if(var8) {
            var7.var_373 = var1[0];
            var7.sub_429(var_3ec, 0, var2, var3, var4);
            if(var1[1] != 0) {
               (var7 = var_23b2[var_17dd[var0]]).var_373 = var1[1] - 1;
               var7.sub_429(var_3ec, 8, var5, var6, var4);
               return;
            }
         } else {
            var7.var_373 = var_1786[var0].length;
            var7.sub_429(var_3ec, 0, var2, var3, var4);
         }

      } catch (Exception var9) {
         ;
      }
   }

   private static boolean sub_1f12() {
      return false;
   }

   private static void sub_1f63(int var0) {
      Class_22 var1;
      if((var1 = var_23b2[var_1b64[var0]]).var_4c1 != null) {
         for(int var2 = 0; var2 <= var_1786[var0].length; ++var2) {
            if(var1.var_4c1[var2] != null) {
               var1.var_4c1[var2][0] = null;
            }
         }

      }
   }

   private static void sub_1f98(int var0, int var1, int var2) {
      var_5379 = 0;
      var_533c = 0;
      var_539d = var2;
      var_5504 = var0;
      var_5551 = var1;
      var_55aa = (var_5551 - var_5504 << 12) / 20480;

      for(int var3 = 0; var3 < 26; ++var3) {
         var_53f7[var3] = var_5551;
      }

   }

   private static void sub_1fa9(int var0) {
      if(var_539d > 0) {
         var_533c -= var0;
         var_539d -= var0;
         if(var_533c <= 0 && var_53f7[var_5379] >= var_5551) {
            var_53b0[var_5379] = Class_6b.sub_496(0, 240);
            var_53f7[var_5379] = var_5504;
            var_5490[var_5379] = 0;
            var_533c = 819;
            var_5379 = (var_5379 + 1) % 26;
         }
      }

      for(int var1 = 0; var1 < 26; ++var1) {
         if(var_53f7[var1] < var_5551) {
            var_5490[var1] += var0;
            if(var_5490[var1] > var_54f1[var1]) {
               var_53b0[var1] += var_543d[var1];
               var_53f7[var1] += var_55aa * var_54f1[var1] >> 12;
               var_54f1[var1] = Class_6b.sub_496(4096, 12288);
               var_5490[var1] = 0;
               var_543d[var1] = Class_6b.sub_496(24, 120);
               var_543d[var1] &= -2;
               var_544f[var1] = Class_6b.sub_496(21, 45);
               if(var_53b0[var1] > 120) {
                  var_543d[var1] = -var_543d[var1];
               }
            }
         }
      }

   }

   private static void sub_1fd5() {
      sub_142e(0, var_5504, 240, var_5551 - var_5504);

      for(int var5 = 0; var5 < 26; ++var5) {
         if(var_53f7[var5] < var_5551) {
            int var3 = (var_5490[var5] << 12) / var_54f1[var5];
            int var2 = 1024 * var3 >> 12;
            int var0 = var_53b0[var5] + ((4096 - Class_6b.var_361[var2 & 2047] >> 1) * var_543d[var5] >> 12);
            int var1 = var_53f7[var5] + (Class_6b.var_361[512 - var2 & 2047] * Math.abs(var_544f[var5]) >> 12) + (var_55aa * var_5490[var5] >> 12);
            int var4 = var_5490[var5];
            if(var_543d[var5] > 0) {
               var4 = var_54f1[var5] - var4;
            }

            Class_9b.sub_45e(var_23b2[39], 0, var0, var1, var4, var_54f1[var5]);
         }
      }

   }

   private static void sub_2021() {
      var_55d8 = 0;
      var_56dd = new int[4];
      var_5689 = 7;
      var_23b2[37].sub_35d(var_56dd, var_2f7[var_55d8][4], 0, 0, 0);
      var_5637 = var_56dd[0] - var_56dd[2];
   }

   private static void sub_204e(int var0) {
      if(var0 <= 819) {
         var_5637 += 30 * var0 >> 12;
         if(var_5637 > 10) {
            --var_55d8;
            if(var_55d8 < 0) {
               var_55d8 += 7;
            }

            var_23b2[37].sub_35d(var_56dd, var_2f7[var_55d8][4], 0, 0, 0);
            var_5637 -= var_56dd[2] - var_56dd[0] + 10;
            if(var_5689 < 7) {
               ++var_5689;
            }
         }

      }
   }

   private static void sub_2090() {
      int var0 = var_5637;
      int var2 = var_55d8;

      for(int var3 = var_5689; var3 > 0 && var0 < 240; --var3) {
         int var1 = var_2f7[var2][4];
         var_23b2[37].sub_35d(var_56dd, var1, 0, 0, 0);
         var_23b2[37].sub_429(var_3ec, var1, var0 - var_56dd[0], 280, 0);
         var0 += var_56dd[2] - var_56dd[0] + 10;
         var2 = (var2 + 1) % 7;
      }

   }

   private static boolean sub_20bf(int var0) {
      if(var_75a) {
         var_e92[var0] = 0;
         var_75a = false;
         sub_1aca();
         sub_142e(0, 0, 240, 320);
         sub_1a2e(110, 158 + var_e92[var0] * 24);
         sub_1974(true);
         sub_b8e(102, 0, 65, 95, 6);
         sub_b8e(100, 0, 110, 158, 6);
         sub_b8e(101, 0, 110, 182, 6);
         sub_1960(105, false);
         sub_1960(107, true);
         sub_1b25();
         sub_142e(0, 0, 240, 320);
      }

      sub_1a47(110, 158 + var_e92[var0] * 24);
      sub_1b40();
      sub_1cfd(var_1918, var_1940, true, 0);
      sub_204e(var_837);
      sub_2090();
      if(var_46b[14] < 0) {
         var_e92[var0] = 0;
         return true;
      } else {
         return sub_1908(var0, 2, 1, 2, true);
      }
   }

   private static void sub_2122() {
      int var0 = var_1019[4] >= 0?var_357[var_1019[4]][0]:32;
      var_29c0 = var_23b2 != null && var_23b2[var0] != null?var_23b2[var0]:sub_117d(var0, true, 0, -1);
   }

   private static void sub_2157() {
      sub_142e(0, 0, 240, 320);
      var_3ec.setColor(0);
      sub_a6c(0, 0, 240, 320);
      var_29c0.sub_429(var_3ec, 0, 0, 220, 0);
      if(var_297c != null) {
         var_267b[1].var_373 = 0;
         sub_bd5(var_297c, 1, 238, 160, 10);
      }

      sub_21b9(120, 70);
   }

   private static void sub_2181() {
      sub_142e(0, 0, 240, 320);
      sub_1974(false);
      var_29c0.sub_429(var_3ec, 0, 0, 220, 0);
      var_267b[1].var_373 = 0;
      sub_bd5(var_2941, 1, 238, 160, 10);
      sub_21b9(120, 70);
   }

   private static void sub_21b9(int var0, int var1) {
      var0 -= 50;
      --var1;
      var_3ec.setColor(0);
      var_3ec.drawRect(var0 - 1, var1 - 1, 101, 3);
      var_3ec.setColor(4737096);
      sub_a6c(var0, var1, 100, 2);
      var_267b[0].var_373 = 0;
      sub_bc7(var_d30, 0, var0 + 50, var1 - 1 - 2, 33);
   }

   private static void sub_21df(int var0, int var1, int var2, int var3) {
      var0 -= 50;
      --var1;
      if(var2 > 0) {
         var_3ec.setColor(16711680);
         sub_a6c(var0, var1, var2 * 100 / var3 / 1, 2);
      }

   }

   private static void sub_2239() {
      var_297c = sub_b56(Class_6b.sub_595(Class_6b.sub_496(75, 81)), 1, 170);
   }

   private static void sub_228f(int var0, int var1) {
      if(var_75a) {
         if(var_7f8) {
            sub_1f98(0, 320, 81920);
         }

         sub_1aca();
         sub_142e(0, 0, 240, 320);
         sub_1974(true);
         var_267b[1].var_373 = 0;
         sub_bd5(sub_b56(Class_6b.sub_595(var0), 1, 210), 1, 99, 160, 3);
         sub_1b25();
         var_75a = false;
      }

      sub_142e(0, 0, 240, 320);
      sub_1b40();
      if(var_71f == 0 && (var_64f & 511L) <= 255L) {
         var_267b[1].var_373 = 0;
         sub_b8e(0, 1, 99, 305, 33);
      }

      sub_1fd5();
      if(var_71f == 0) {
         sub_1fa9(var1);
      }

      if(var_71f == 0) {
         if(sub_249()) {
            var_71f = 1;
            return;
         }
      } else {
         if(var_71f == 1) {
            sub_c49(true);
            var_71f = 2;
            return;
         }

         sub_283(var_13aa?14:19);
      }

   }

   private static void sub_22b4() {
      var_1c3d = var_93b != 0;
   }

   private static void sub_2303() {
      boolean var0 = false;
      boolean var1 = false;
      boolean var2 = false;
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      var_837 = var_79d?204:(var_5ed << 12) / 1000;
      if(var_697 >= 40 && (var_79d || var_46b[13] < 0)) {
         try {
            Class_6b.sub_754(0);
         } catch (Exception var21) {
            ;
         }

         var_6ef = var_697;
         sub_283(36);
         sub_1fa();
      }

      byte var48;
      label2852: {
         boolean var8;
         boolean var10;
         boolean var11;
         int var12;
         int var13;
         int var14;
         int var15;
         int var10000;
         byte var10002;
         int var23;
         int var24;
         int var25;
         int var26;
         int var27;
         int var28;
         Image var30;
         int var31;
         boolean var34;
         int var36;
         int var37;
         String var38;
         Class_22 var46;
         int var47;
         byte var49;
         boolean var53;
         byte var54;
         byte[] var56;
         switch(var_697) {
         case 0:
            if(var_71f == 0) {
               var_3ec.setColor(0);
               var_3ec.fillRect(0, 0, 240, 320);
               if(Class_6b.var_5ae[0] < 7) {
                  Class_6b.sub_8a2();
               }

               ++var_71f;
               return;
            }

            if(var_71f == 1) {
               sub_c49(true);
               ++var_71f;
               return;
            }

            if(var_71f == 2) {
               if(!Class_6b.sub_836(0)) {
                  ++var_71f;
                  return;
               }
            } else if(!var_4fbe) {
               sub_283(-1);
               return;
            }

            return;
         case 1:
            var_3ec.setColor(0);
            var_3ec.fillRect(0, 0, 240, 320);
            if(var_71f == 1) {
               sub_75b();
               Class_6b.sub_cf("/4");
               var_9ed = (var30 = Class_6b.sub_3f0(0)).getWidth();
               var_a14 = var30.getHeight();
               var_a33 = new int[var_9ed * var_a14];
               var_a77 = new int[var_9ed * var_a14];
               var24 = var_9ed - var30.getWidth() >> 1;
               var26 = var_a14 - var30.getHeight() >> 1;
               sub_238a(var30, var_a77, var24 + var26 * var_9ed, var_9ed, 0, 0, var30.getWidth(), var30.getHeight());
               var_acb = new int[var_9ed * var_a14];
               var_b22 = 0;
               var_b68 = new int[256];
               var_ba5 = new int[256];
               var_bf1 = new int[256];
               System.gc();
               sub_283(2);
            }

            ++var_71f;
            return;
         case 2:
            if(var_79d) {
               var_3ec.setColor(0);
               sub_a6c(0, 0, 240, 320);
            }

            if(var_71f == 0) {
               var_3ec.setColor(0);
               sub_a6c(0, 0, 240, 320);
               var_97e = 0;
               ++var_71f;
               return;
            }

            if(var_71f <= 3) {
               var34 = (var_71f & 1) == 0;
               var36 = var_a14 / 3;
               var13 = 240 - var_9ed >> 1;
               var14 = 320 - var_a14 >> 1;
               var_97e += var_837;
               if((var31 = (var_97e << 12) / 819) > 4096) {
                  var31 = 4096;
               }

               var26 = (var_71f - 1) * var36;
               var12 = var_71f == 3?var_a14 - var26:var36;
               var37 = var31 * var_9ed >> 12;
               var24 = var34?0:var_9ed - var37;
               if(var_79d) {
                  try {
                     var_3ec.drawRGB(var_a77, 0, var_9ed, var13, var14, var_9ed, var26, false);
                  } catch (Exception var20) {
                     ;
                  }
               }

               try {
                  var_3ec.drawRGB(var_a77, var26 * var_9ed + var24, var_9ed, var13 + var24, var14 + var26, var37, var12, false);
               } catch (Exception var19) {
                  ;
               }

               if(var_97e > 819) {
                  ++var_71f;
                  var_97e = 0;
                  return;
               }

               return;
            } else if(var_71f == 4) {
               if(var_97e == 0) {
                  var_9a5 = Class_6b.sub_3f0(1);
                  Class_6b.sub_1cc();
                  var24 = var_9ed - var_9a5.getWidth() >> 1;
                  var26 = var_a14 - var_9a5.getHeight() >> 1;
                  sub_238a(var_9a5, var_a33, var24 + var26 * var_9ed, var_9ed, 0, 0, var_9a5.getWidth(), var_9a5.getHeight());

                  for(var25 = 0; var25 < var_9ed * var_a14; ++var25) {
                     var23 = 0;
                     var53 = false;

                     label2116:
                     while(true) {
                        for(var8 = var53; var23 < var_b22 && !var8; ++var23) {
                           if(var_b68[var23] == var_a33[var25] && var_ba5[var23] == var_a77[var25]) {
                              var53 = true;
                              continue label2116;
                           }
                        }

                        if(var8) {
                           var_acb[var25] = var23;
                        } else {
                           var_b68[var_b22] = var_a33[var25];
                           var_ba5[var_b22] = var_a77[var25];
                           var_acb[var25] = var_b22++;
                        }
                        break;
                     }
                  }
               }

               var_97e += var_837;
               if(var_97e > 2048) {
                  var_97e = 0;
                  ++var_71f;
                  return;
               }

               return;
            } else {
               if(var_71f == 5) {
                  if((var31 = (var_97e << 8) / 2457) > 256) {
                     var31 = 256;
                  }

                  for(var25 = 0; var25 < var_b22; ++var25) {
                     var_bf1[var25] = sub_112a(var_b68[var25], var_ba5[var25], var31);
                  }

                  var23 = var_a14 * var_9ed;

                  for(var25 = 0; var25 < var23; ++var25) {
                     var_23c4[var25] = var_bf1[var_acb[var25]];
                  }

                  var_8cc = Image.createRGBImage(var_23c4, var_9ed, var_a14, false);
                  var_3ec.drawImage(var_8cc, 240 - var_9ed >> 1, 320 - var_a14 >> 1, 20);
                  var_97e += var_837;
                  if(var_97e >= 2457) {
                     ++var_71f;
                     var_a77 = null;
                     var_a33 = null;
                     var_acb = null;
                     var_b68 = null;
                     var_ba5 = null;
                     var_bf1 = null;
                     var_8cc = null;
                     var_29d9 = 0;
                     var_97e = 0;
                     System.gc();
                     return;
                  }
               } else {
                  label2101: {
                     var_97e += var_837;
                     var24 = (var_9ed - var_9a5.getWidth() >> 1) + (240 - var_9ed >> 1);
                     var26 = (var_a14 - var_9a5.getHeight() >> 1) + (320 - var_a14 >> 1);
                     sub_142e(0, 0, 240, 320);
                     var_3ec.setColor(0);
                     sub_a6c(0, 0, 240, 320);
                     var_3ec.drawImage(var_9a5, var24, var26, 20);
                     switch(var_29d9) {
                     case 1:
                        sub_39a();
                        sub_c49(false);
                        break label2101;
                     case 2:
                        Class_6b.sub_cf("/1");
                        break label2101;
                     case 3:
                        Class_6b.sub_44b(0, -1, -1);
                        break label2101;
                     case 4:
                        sub_f68();
                        break;
                     case 5:
                        Class_6b.sub_cf("/3");
                        break label2101;
                     case 6:
                        Class_6b.sub_4ee(2);
                        break;
                     case 7:
                        var_8cc = Image.createImage(240, 320);
                        var_883 = var_8cc.getGraphics();
                        break label2101;
                     case 8:
                        Class_6b.sub_cf("/5");
                        break label2101;
                     case 9:
                        sub_f9b(0, 1);
                        var_267b[1].sub_a6(0, 0, -1, -1);
                        var_267b[1].sub_c7();
                        break label2101;
                     case 10:
                        sub_f9b(1, 0);
                        var_267b[0].sub_a6(0, 0, -1, -1);
                        var_267b[0].sub_c7();
                        break label2101;
                     case 11:
                        sub_2122();
                        break label2101;
                     case 12:
                        sub_11c2(36, true);
                        break;
                     case 13:
                     default:
                        break label2101;
                     }

                     Class_6b.sub_1cc();
                  }

                  if(var_29d9 <= 13) {
                     ++var_29d9;
                     return;
                  }

                  if(var_97e > 8192) {
                     if(var_93b >= 6) {
                        var_93b = -1;
                     }

                     if(var_93b == -1) {
                        if((var38 = Class_6b.sub_4cb().substring(0, 2).toUpperCase()).compareTo("EN") == 0) {
                           var_93b = 0;
                        }

                        if(var38.compareTo("FR") == 0) {
                           var_93b = 3;
                        }

                        if(var38.compareTo("IT") == 0) {
                           var_93b = 4;
                        }

                        if(var38.compareTo("DE") == 0) {
                           var_93b = 1;
                        }

                        if(var38.compareTo("ES") == 0) {
                           var_93b = 2;
                        }

                        if(var38.compareTo("BR") == 0 || var38.compareTo("PT") == 0) {
                           var_93b = 5;
                        }

                        if(var_93b != -1) {
                           sub_22b4();
                        }
                     }

                     if(var_93b == -1) {
                        var_93b = 0;
                        var48 = 9;
                     } else {
                        var_d30 = Class_6b.sub_595(24 + var_93b);
                        var48 = 10;
                     }

                     sub_2a7(var48, 12);
                     var_9a5 = null;
                     return;
                  }
               }

               return;
            }
         case 3:
            if(Class_6b.var_5ae[0] == 0) {
               Class_6b.sub_754(0);
            }

            sub_2122();
            sub_2239();
            sub_2157();
            var_c54 = null;
            sub_2a7(11, 4);
            return;
         case 4:
            if(var_79d) {
               Class_6b.sub_1cc();
               sub_422();
               System.gc();
            }

            if(var_75a) {
               var_f28 = false;
               var_71f = 0;
               sub_2157();
               var_75a = false;
            }

            sub_21df(120, 70, var_71f, 16);
            if(!sub_3db(var_71f)) {
               ++var_71f;
               return;
            }

            var48 = 6;
            break label2852;
         case 5:
            sub_2157();
            if(var_71f == 1) {
               sub_422();
               System.gc();
               sub_2a7(10, 14);
               return;
            }

            var_71f = 1;
            return;
         case 6:
            var10 = var_46b[3] < 0 || var_46b[3] < 0;
            var11 = var_46b[4] < 0 || var_46b[4] < 0;
            boolean var39 = var_46b[1] < 0 || var_46b[1] < 0;
            boolean var41 = var_46b[2] < 0 || var_46b[2] < 0;
            byte var43 = var_4bfb[var_4dd9];
            if(var_75a) {
               var_4e30 = true;
               var_75a = false;
            }

            sub_6c4(var43);
            if(var_4c5f > 1) {
               sub_574();
            }

            if(var10) {
               --var_4dd9;
               if(var_4dd9 < 0) {
                  var_4dd9 = var_4c5f - 1;
               }

               var_4dc4 = 0;
               var_4e30 = true;
            }

            if(var11) {
               ++var_4dd9;
               if(var_4dd9 >= var_4c5f) {
                  var_4dd9 = 0;
               }

               var_4dc4 = 0;
               var_4e30 = true;
            }

            if(var43 == 2 || var43 == 3) {
               if(var41) {
                  var15 = var43 == 2?var_4cf1:var_4d8c;
                  if(var_4dc4 < var15 - 1) {
                     ++var_4dc4;
                  }
               }

               if(var39 && var_4dc4 > 0) {
                  --var_4dc4;
               }
            }

            if(var_46b[5] < 0 || var_46b[13] < 0) {
               String var44;
               String[] var59;
               label2611: {
                  var44 = null;
                  switch(var43) {
                  case 2:
                     var59 = var_4bd3;
                     var49 = 4;
                     var54 = var_4cb5[var_4dc4];
                     break;
                  case 3:
                     var59 = var_4bd3;
                     var49 = 8;
                     var54 = var_4d30[var_4dc4];
                     break;
                  case 4:
                     var59 = var_4bd3;
                     var47 = 2;
                     break label2611;
                  case 5:
                     var59 = var_4bd3;
                     var47 = 3;
                     break label2611;
                  default:
                     var59 = var_4bd3;
                     var49 = 0;
                     var54 = var43;
                  }

                  var47 = var49 + var54;
               }

               if((var44 = var59[var47]) != null) {
                  var_4e51 = var44;
                  sub_283(7);
               }
            }

            if(var_46b[14] >= 0) {
               return;
            }

            var48 = 5;
            break label2852;
         case 7:
            if(var_75a) {
               sub_4c6(0, 136);
               var_3ec.drawImage(var_9a5, 120, 25, 17);
               var_267b[0].var_373 = 0;
               sub_bd5(Class_6b.sub_595(25), 0, 120, 160 - var_267b[0].var_6f0[1], 33);
               sub_b8e(26, 0, 120, 160, 17);
               sub_47a(true);
               var_75a = false;
            }

            if(var_46b[14] < 0) {
               sub_31c();
            }

            if(var_46b[5] >= 0 && var_46b[13] >= 0) {
               return;
            }

            var_e5e = true;
            break;
         case 8:
            if(var_79d) {
               Class_6b.sub_55c();
               var_8cc = null;
               var_883 = null;
               System.gc();
               var_71f = 0;
            }

            if(var_71f == 0) {
               sub_2157();
               ++var_71f;
            } else if(var_71f == 1) {
               var_c54 = null;
               System.gc();
               var_8cc = Image.createImage(240, 320);
               var_883 = var_8cc.getGraphics();
               ++var_71f;
            } else if(var_71f == 2) {
               Class_6b.sub_cf("/3");
               Class_6b.sub_4ee(2);
               Class_6b.sub_1cc();
               ++var_71f;
            } else if(var_71f == 3) {
               sub_2a7(9, 16);
            }

            sub_21df(120, 70, var_71f, 4);
            return;
         case 9:
            if(var_75a) {
               sub_1aca();
               sub_142e(0, 0, 240, 320);
               var_3ec.setColor(0);
               sub_a6c(0, 0, 240, 320);

               for(var25 = 0; var25 < 6; ++var25) {
                  sub_b8e(18 + var25, 0, 92, 117 + 18 * var25, 6);
               }

               sub_1b25();
               var_75a = false;
               var_ed3 = false;
               if(var_7f8) {
                  var_feb = var_93b;
               }
            }

            sub_1a2e(92, 117 + 18 * var_93b);
            sub_1b40();
            sub_b8e(0 + var_93b, 0, 120, 50, 17);
            sub_b8e(6 + var_93b, 0, 0, 319, 36);
            if(var_6bb != 2) {
               sub_b8e(12 + var_93b, 0, 239, 319, 40);
            }

            sub_1cfd(var_1918, var_1940, true, 0);
            if(var_46b[1] < 0) {
               --var_93b;
               if(var_93b < 0) {
                  var_93b += 6;
               }
            }

            if(var_46b[2] < 0) {
               ++var_93b;
               if(var_93b >= 6) {
                  var_93b -= 6;
               }
            }

            if(var_6bb != 2 && var_46b[14] < 0) {
               var_93b = var_feb;
               var_ed3 = true;
            }

            if(var_46b[5] < 0 || var_46b[13] < 0) {
               var_ed3 = true;
            }

            if(var_ed3) {
               if(var_6bb == 2) {
                  sub_22b4();
               }

               var_297c = null;
               var_d30 = Class_6b.sub_595(24 + var_93b);
               Class_6b.sub_55c();
               var_8cc = null;
               var_883 = null;
               sub_2a7(10, var_6c8);
               return;
            }

            return;
         case 10:
            if(var_79d) {
               var_2a39 = 0;
               Class_6b.sub_1cc();
               sub_1260();
               var_c54 = null;
               System.gc();
               var_71f = 0;
            }

            if(var_71f == 0) {
               if(var_29c0 == null) {
                  sub_142e(0, 0, 240, 320);
                  var_3ec.setColor(0);
                  sub_a6c(0, 0, 240, 320);
                  var_71f = 1;
                  return;
               }

               sub_2157();
               var_71f = 2;
               return;
            }

            if(var_71f == 1) {
               if(var_29c0 == null) {
                  Class_6b.sub_cf("/5");
                  sub_2122();
                  Class_6b.sub_1cc();
               }

               sub_2157();
               var_2a39 = 0;
               ++var_71f;
               return;
            }

            if(var_71f == 2) {
               if(var_75a) {
                  var_29c0 = null;
                  System.gc();
                  var_29d9 = 0;
                  var_2a39 = 0;
                  var_75a = false;
               }

               sub_21df(120, 70, var_29d9, 28);
               if(sub_1227()) {
                  if(var_6c8 == 28) {
                     Class_6b.sub_6f5(1, 0, 1);
                  } else if(var_6c8 != 12 && var_6c8 != 16) {
                     Class_6b.sub_6f5(0, 0, 1);
                  }

                  if(var_6c8 != 12) {
                     var_f28 = true;
                  }

                  sub_1fa();
                  sub_2b8();
                  var_1b7a = true;
                  return;
               }
            }

            return;
         case 11:
            if(var_6c8 == 33) {
               sub_2181();
            } else {
               sub_2157();
            }

            if(var_71f == 1) {
               sub_1260();
               sub_2b8();
               return;
            }

            if(!Class_6b.sub_836(0)) {
               ++var_71f;
               return;
            }

            return;
         case 12:
            if(var_75a) {
               var_e92[0] = 0;
               sub_1a2e(80, 160 + var_e92[0] * 20);
            }

            sub_142e(0, 0, 240, 320);
            var_3ec.setColor(0);
            sub_a6c(0, 0, 240, 320);
            var_267b[0].var_373 = 0;
            sub_bd5(sub_b56(Class_6b.sub_595(103), 0, 120), 0, 120, 80, 3);

            for(var25 = 0; var25 < 2; ++var25) {
               var26 = 160 + var25 * 20;
               sub_b8e(100 + var25, 0, 110, var26, 6);
               if(var25 == var_e92[0]) {
                  sub_1a47(110, var26);
               }
            }

            sub_1960(105, false);
            sub_1cfd(var_1918, var_1940, true, 0);
            var_75a = false;
            var_f50[0] = false;
            if(!sub_1908(0, 2, 1, 2, true)) {
               return;
            }

            var_1c6a = var_e92[0] == 1;
            sub_2313();
            Class_6b.sub_6f5(0, 0, 1);
            var_f28 = true;
            var48 = 13;
            break label2852;
         case 13:
            if(var_75a) {
               var_75a = false;
            }

            if(var_71f == 0) {
               sub_142e(0, 0, 240, 320);
               var_3ec.drawImage(var_8cc, 0, 0, 0);
               var_3ec.drawImage(var_c68, 0, 5, 0);
               var_3ec.drawImage(var_c74, var_c54.getWidth(), var_c54.getHeight(), 40);
               var_3ec.drawImage(var_ca1, 120, 320, 33);
               if((var_64f & 511L) <= 255L) {
                  sub_b8e(0, 0, 120, 305, 33);
               }

               if(sub_249()) {
                  var_110a = 1228;
                  ++var_71f;
                  return;
               }

               return;
            }

            if(var_110a > 0) {
               var8 = false;
               var34 = false;
               var10 = false;
               var_110a -= var_837;
               if(var_110a < 0) {
                  var_110a = 0;
               }

               var37 = (var_110a << 12) / 1228;
               var_c54.getGraphics().drawImage(var_8cc, 0, 0, 0);
               sub_2407(var_c54, 145 * var37 + 4096 * 110 >> 8, 179 * var37 + 4096 * 76 >> 8, 216 * var37 + 4096 * 39 >> 8);
               var_3ec.drawImage(var_c54, 0, 0, 0);
               var_3ec.drawImage(var_c68, 0, 5, 0);
               var_3ec.drawImage(var_c74, var_c54.getWidth(), var_c54.getHeight(), 40);
               var_3ec.drawImage(var_ca1, 120, 320, 33);
               return;
            }

            var48 = 14;
            break label2852;
         case 14:
            label2078: {
               if(var_46b[var_3de[var_49be]] < 0) {
                  var10000 = var_49be + 1;
               } else {
                  if(!sub_249()) {
                     break label2078;
                  }

                  var10000 = 0;
               }

               var_49be = var10000;
            }

            if(var_49be == var_3de.length) {
               var_49be = 0;
               var_49db = !var_49db;
            }

            if(var_49db && var_46b[8] < 0) {
               var_1cda = 99999999;
               var_1cfb = sub_235e(var_1cda);
               var_75a = true;
            }

            int[] var42 = var_4e02?var_7f:var_aa;
            if(var_75a) {
               if(var_7f8) {
                  sub_18a9(var_4e02?0:14);
               }

               sub_1a2e(0, 0 + var_e92[0] * 24);
               var_75a = false;
               sub_1b7c(var42.length, var_1b7a);
               var_71f = 0;
               var_1b7a = false;
               sub_1aca();
               sub_142e(0, 0, 240, 320);
               sub_1974(true);
               sub_1b25();
            }

            sub_142e(0, 0, 240, 320);
            if(var_71f == 0) {
               sub_1aca();
               if(var_837 < 4096 && sub_1c01(var_837)) {
                  sub_142e(0, 0, 240, 320);
                  sub_1945(true, true);
                  ++var_71f;
               }

               var_267b[0].var_373 = 0;

               for(var25 = 0; var25 < var42.length; ++var25) {
                  sub_1bb6(var25, 95 + var25 * 24 - 12, 24);
                  if(var42[var25] == 8) {
                     var46 = var_267b[0];
                     var49 = 1;
                  } else {
                     var46 = var_267b[0];
                     var49 = 0;
                  }

                  var46.var_373 = var49;
                  sub_b8e(var42[var25], 0, 25, 95 + var25 * 24, 6);
                  if(var42[var25] == 8) {
                     var_dcc = 25 + Class_22.var_524 + 11;
                     var_e23 = 95 + var25 * 24;
                  }
               }

               sub_1b25();
               sub_1b40();

               for(var25 = 0; var25 < var42.length; ++var25) {
                  sub_1ba5(var25, 95 + var25 * 24);
               }

               var_f50[0] = true;
            }

            if(var_71f == 1) {
               sub_1a47(25, 95 + var_e92[0] * 24);
               sub_1b40();
               sub_1cfd(var_1918, var_1940, true, 0);
               if(var_d86 && !var_4e02) {
                  sub_1c58(var_dcc, var_e23);
               }

               sub_204e(var_837);
               sub_2090();
               if(sub_1908(0, var42.length, 1, 2, true)) {
                  sub_18b7(var_e92[0]);
               }
            }

            var_f50[0] = false;
            return;
         case 15:
            if(sub_20bf(1)) {
               sub_18b7(var_e92[1]);
               return;
            }

            return;
         case 16:
            if(var_75a) {
               if(var_7f8) {
                  var_e92[1] = 0;
                  if(var_6bb == 10) {
                     if(var_4e02) {
                        sub_18a9(0);
                        var48 = 2;
                     } else {
                        sub_18a9(14);
                        var48 = 3;
                     }

                     sub_18b7(var48);
                     var_e92[1] = 2;
                  }

                  var_1b7a = false;
                  sub_1a2e(50, 140 + var_e92[1] * 18);
                  if(Class_6b.var_5ae[0] == 0) {
                     Class_6b.sub_754(0);
                  }

                  var_18ae = (byte)var_16b.length;
                  sub_1aca();
                  sub_142e(0, 0, 240, 320);
                  sub_1974(true);
                  var_267b[0].var_373 = 0;
                  sub_b8e(5, 0, 50, 115, 6);

                  for(var25 = 0; var25 < var_18ae; ++var25) {
                     sub_b8e(var_16b[var25], 0, 50, 140 + var25 * 18, 6);
                     var_187b[var25] = Class_22.var_524;
                  }

                  sub_1945(true, true);
                  sub_1b25();
               }

               var_75a = false;
               var_f50[1] = true;
            }

            sub_1b40();

            for(var25 = 0; var25 < var_18ae; ++var25) {
               var28 = -1;
               if(var25 == 0) {
                  var28 = var_1c6a?21:22;
               } else if(var25 == 1) {
                  var28 = var_1c3d?43:44;
               }

               if(var28 != -1) {
                  sub_bc7(Class_6b.sub_595(var28), 0, 50 + var_187b[var25], 140 + var25 * 18, 6);
               }
            }

            sub_1a47(50, 140 + var_e92[1] * 18);
            sub_1cfd(var_1918, var_1940, true, 0);
            sub_204e(var_837);
            sub_2090();
            var_f50[1] = sub_1a8a(var_e92[1]);
            if(sub_1908(1, var_18ae, 1, 2, true)) {
               if(var_e92[1] == 2) {
                  sub_2122();
                  sub_2239();
                  var_c54 = null;
                  sub_2a7(11, 8);
               } else if(var_e92[1] == 3) {
                  sub_283(27);
               }
            }

            if(var_46b[14] < 0) {
               Class_6b.sub_6f5(0, 0, 1);
               sub_18e5();
               return;
            }

            return;
         case 17:
            if(var_75a) {
               if(var_7f8) {
                  var_e92[0] = 0;
                  if(Class_6b.var_5ae[0] == 0) {
                     Class_6b.sub_754(0);
                  }
               }

               var_f50[0] = true;
               var_75a = false;
               sub_142e(0, 0, 240, 320);
               var_ed3 = false;
            }

            if(var_f50[0]) {
               sub_1aca();
               sub_142e(0, 0, 240, 320);
               sub_1974(false);
               var_23b2[35].sub_429(var_3ec, 0, 120, 0, 0);
               var_23b2[35].sub_429(var_3ec, 1, 120, 320, 0);
               var_267b[0].var_373 = 1;
               sub_b8e(6, 0, 2, 3, 20);
               var_267b[0].var_373 = 0;
               sub_1945(true, true);
               sub_bd5(sub_b56(Class_6b.sub_595(var_1f0[var_e92[0]]), 0, 200), 0, 120, 160, 3);
               sub_1b25();
               var_f50[0] = false;
            }

            sub_1b40();
            if(var_e92[0] != 0) {
               sub_1cb9(10, 155, true, 1);
            }

            if(var_e92[0] != var_1f0.length - 1) {
               sub_1cb9(229, 155, true, 0);
            }

            sub_1908(0, var_1f0.length, 3, 4, false);
            if(var_46b[14] < 0) {
               var_ed3 = true;
               sub_18e5();
               Class_6b.sub_6f5(0, 0, 1);
               return;
            }

            return;
         case 18:
            if(var_75a) {
               sub_142e(0, 0, 240, 320);
               var_3ec.setColor(0);
               sub_a6c(0, 0, 240, 320);
               var_23b2[35].sub_429(var_3ec, 0, 120, 0, 0);
               var_23b2[35].sub_429(var_3ec, 1, 120, 320, 0);
               var_267b[0].var_373 = 1;
               sub_b8e(7, 0, 2, 3, 20);
               sub_1945(true, true);
               var_75a = false;
               if(var_7f8) {
                  sub_1aca();
                  sub_142e(0, 0, 240, 320);
                  var_3ec.setColor(0);
                  sub_a6c(0, 0, 240, 320);
                  sub_1b25();
                  var_1348 = -1;
                  var_1302 = 286;
                  var_12a0 = 0;
                  var_123e = Class_6b.sub_595(var_1302);
                  if(Class_6b.var_5ae[0] == 0) {
                     Class_6b.sub_754(0);
                  }

                  if((var38 = GloftASP3.var_47.getAppProperty("MIDlet-Version")) == null || var38.length() == 0) {
                     var38 = "0.0.0";
                  }

                  var_126b = var38.getBytes();
               }
            }

            var27 = (var26 = (var_1348 + 1) % 312) / 12;
            if(var_1348 / 12 != var27) {
               if(var_12a0 >= var_123e.length) {
                  ++var_1302;
                  if(var_1302 <= 362) {
                     var_123e = null;
                     byte[] var40 = Class_6b.sub_595(var_1302);
                     if(var_1302 == 287) {
                        var40 = sub_c2d(var40, var_126b);
                     }

                     var_123e = var40;
                     var_12a0 = 0;
                  }
               }

               sub_1aca();
               var27 *= 12;
               sub_a6c(0, var27, 240, 12);
               if(var_1302 <= 362) {
                  for(var25 = var_12a0; var25 < var_123e.length && var_123e[var25] == 32; ++var25) {
                     ;
                  }

                  var_12a0 = sub_b45(var_123e, 1, var25, 220);
                  Class_22.var_740 = var25;
                  Class_22.var_76d = var_12a0;
                  sub_bc7(var_123e, 1, 120, var27 + var_267b[1].var_6f0[1] - 2, 17);
                  Class_22.var_740 = -1;
                  Class_22.var_76d = -1;
                  ++var_12a0;
               }

               sub_1b25();
            }

            var_1348 = var26;
            if(var26 < 262) {
               sub_142e(0, 20, 240, 262 - var26);
               var_3ec.drawImage(var_8cc, 0, 20 - var26 - 50, 0);
            }

            var27 = Math.min(var26, 262);
            sub_142e(0, 282 - var27, 240, var27);
            var_3ec.drawImage(var_8cc, 0, 282 - var26, 0);
            if(var_1302 > 389 || var_46b[14] < 0) {
               var_126b = null;
               sub_18e5();
               Class_6b.sub_6f5(0, 0, 1);
               return;
            }

            return;
         case 19:
            if(var_75a || var_f50[0]) {
               if(var_7f8) {
                  if(var_6bb != 14) {
                     sub_18a9(var_4e02?0:14);
                     sub_18b7(1);
                  }

                  var_e92[0] = var_1019[1];
               }

               if(var_75a) {
                  var_13aa = false;
                  var_1b7a = false;
                  var_75a = false;
                  sub_1a2e(var_2bc[var_e92[0]][4] + 120, var_2bc[var_e92[0]][5] + 0);
               }

               sub_1aca();
               var_267b[0].var_373 = 0;
               sub_1a07();
               var_267b[0].var_373 = 1;
               sub_b8e(27, 0, 2, 3, 20);
               var_267b[0].var_373 = 0;
               sub_b8e(var_2bc[var_e92[0]][1], 0, 160, 145, 3);
               var23 = var_1992[var_e92[0]][0][2];
               if(var_1cfb >= var23) {
                  var_267b[1].var_373 = 3;
                  sub_b8e(159, 1, 95, 190, 20);
                  sub_b8e(160, 1, 95, 215, 20);
                  var_267b[1].var_373 = 0;
                  sub_b8e(var_2bc[var_e92[0]][3], 1, 215, 199, 24);
                  sub_b8e(var_2bc[var_e92[0]][2], 1, 215, 224, 24);
                  var53 = true;
               } else {
                  var_23b2[37].sub_429(var_3ec, 10, 153, 184, 0);
                  sub_b8e(38, 1, 164, 241, 17);
                  sub_b20(var_226[var23], 47, 0, 2, 164, 251, 17);
                  var53 = false;
               }

               var_ed3 = var53;
               sub_1d61();
               sub_1945(true, var_1cfb >= var23);
               var_f50[0] = false;
               sub_1a47(var_2bc[var_e92[0]][4] + 120, var_2bc[var_e92[0]][5] + 0 + 5);
               var_18ae = 0;
               Class_22 var7;
               (var7 = var_23b2[35]).sub_429(var_3ec, 2, 120, 0, 0);

               for(var25 = 0; var25 < 6; ++var25) {
                  var24 = 120 + var_2bc[var25][4];
                  var26 = 0 + var_2bc[var25][5];
                  if(var_1cfb < var_1992[var25][0][2]) {
                     var7.sub_429(var_3ec, 4, var24, var26, 0);
                  } else {
                     var7.sub_429(var_3ec, 5, var24, var26, 0);

                     for(var23 = 0; var23 < var_1992[var25].length; ++var23) {
                        if(var_1cfb >= var_1992[var25][var23][2] && (var_1e0a[var25] >> var23 & 1) == 0) {
                           var_1841[var_18ae++] = (byte)var25;
                           break;
                        }
                     }
                  }
               }

               sub_1b25();
            }

            sub_1b40();

            for(var25 = 0; var25 < var_18ae; ++var25) {
               var24 = 120 + var_2bc[var_1841[var25]][4];
               var26 = 0 + var_2bc[var_1841[var25]][5];
               Class_9b.sub_45e(var_23b2[35], 4, var24, var26, (int)(var_64f & 511L), 512);
            }

            sub_1cfd(var_1918, var_1940, false, 0);
            if(sub_1914(0, 6, 3, 4) && var_e92[0] != var_1019[1]) {
               var_1019[1] = (byte)var_e92[0];
               var_1019[2] = 0;
               return;
            }

            return;
         case 20:
            if(var_75a || var_f50[0]) {
               if(var_75a) {
                  if(var_7f8) {
                     var_e92[0] = var_1019[2];

                     for(var25 = 0; var25 < var_1992[var_1019[1]].length; ++var25) {
                        if((var_1e0a[var_1019[1]] >> var25 & 1) != 1 && var_1cfb >= var_1992[var_1019[1]][var25][2]) {
                           var_1870[var25] = (byte)var25;
                           var56 = var_1e0a;
                           var47 = var_1019[1];
                           var54 = (byte)(var_1e0a[var_1019[1]] | 1 << var25);
                        } else {
                           var56 = var_1870;
                           var47 = var25;
                           var54 = -1;
                        }

                        var56[var47] = var54;
                     }
                  }

                  var_75a = false;
                  sub_1a2e(32 + 57 * var_e92[0], 69 + 0 * var_e92[0]);
               }

               sub_1aca();
               sub_1a07();
               var_267b[0].var_373 = 1;
               sub_b8e(28, 0, 2, 3, 20);
               var_267b[0].var_373 = 0;
               sub_b8e(var_2bc[var_1019[1]][1], 0, 160, 120, 3);
               sub_1a47(32 + 57 * var_e92[0], 69 + 0 * var_e92[0] - 2);
               var_267b[1].var_373 = 0;
               if(var_1992[var_1019[1]][var_e92[0]] != null) {
                  var25 = var_1992[var_1019[1]][var_e92[0]][0];
                  sub_b8e(var_272[var25][0], 1, 160, 98, 3);
                  if(var_1cfb >= var_1992[var_1019[1]][var_e92[0]][2]) {
                     if(var_1c3d) {
                        sub_b20(var_1992[var_1019[1]][var_e92[0]][3], 52, 0, 1, 160, 180, 17);
                     } else {
                        sub_b20(var_1992[var_1019[1]][var_e92[0]][3] * 1000 / 914, 53, 0, 1, 160, 180, 17);
                     }

                     sub_b8e(37, 1, 160, 206, 17);
                     var25 = var_1019[1] * 4 + var_e92[0];
                     sub_b20(var_1d1d[var25], 47, 0, 2, 160, 224, 17);
                     var25 = var_1019[1] * 4 + var_e92[0];
                     if(var_1d55[var25] != 0) {
                        var_23b2[35].sub_429(var_3ec, 8 + var_1d55[var25] - 1, 120, 320, 0);
                     }

                     var53 = true;
                  } else {
                     sub_b8e(38, 1, 160, 188, 17);
                     sub_b20(var_226[var_1992[var_1019[1]][var_e92[0]][2]], 47, 0, 2, 160, 206, 17);
                     var_23b2[37].sub_429(var_3ec, 10, 153, 221, 0);
                     var53 = false;
                  }

                  var_ed3 = var53;
               }

               sub_1d61();
               sub_1945(true, var_ed3);
               var_18ae = 4;
               var24 = 4;

               for(var25 = 0; var25 < 4; ++var25) {
                  if(var_1992[var_1019[1]][var25] != null && var_1cfb >= var_1992[var_1019[1]][var25][2]) {
                     var28 = var_1992[var_1019[1]][var25][0];
                     var_23b2[35].sub_429(var_3ec, var_272[var28][2], var24, 24, 0);
                     var_23b2[35].sub_429(var_3ec, var_1d55[var_1019[1] * 4 + var25] == 1?52:51, var24, 24, 0);
                     var56 = var_1841;
                     var47 = var25;
                     var54 = -1;
                  } else {
                     var56 = var_1841;
                     var47 = var25;
                     var54 = (byte)var25;
                  }

                  var56[var47] = var54;
                  var24 += 57;
               }

               sub_1b25();
               var_f50[0] = false;
            }

            sub_1e70();
            sub_1cfd(var_1918, var_1940, false, 0);
            if(var_ed3) {
               var13 = 0;
               var14 = 0;
               byte[] var18 = var_1951[var_1019[1]][var_e92[0]];

               for(var25 = 0; var25 <= 32; ++var25) {
                  var31 = (int)(var_64f >> 7) + var25 << 6;
                  var23 = var25 & 31;
                  int var16 = ((var18[var23] & 31) << 12) / 12;
                  int var17 = (var18[var23] >> 5) - 1 << 12 >> 3;
                  int var35 = var16 * Class_6b.var_361[var31 & 2047] >> 12;
                  var36 = var16 * Class_6b.var_361[512 - var31 & 2047] >> 12;
                  var37 = var17 + (var36 >> 2);
                  var12 = 67108864 / (var36 + '\u8000');
                  var35 = 160 + (var12 * var35 * 32 >> 12 >> 12);
                  var36 = 150 - (var12 * var37 * 32 >> 12 >> 12);
                  if(var25 > 0) {
                     var15 = 2048 + (Math.min(Math.max(var12 * var12 << 1 >> 12, 0), 4096) * 2048 >> 12);
                     var_3ec.setColor((251 * var15 >> 12 << 16) + (210 * var15 >> 12 << 8) + (45 * var15 >> 12));
                     var_3ec.drawLine(var13, var14, var35, var36);
                     var_3ec.drawLine(var13, var14 + 1, var35, var36 + 1);
                     var_3ec.drawLine(var13 + 1, var14, var35 + 1, var36);
                  }

                  var13 = var35;
                  var14 = var36;
               }
            }

            if(sub_1908(var_71f, 4, 3, 4, true)) {
               var_1019[2] = (byte)var_e92[0];
               if(var_1992[var_1019[1]][var_1019[2]][0] == 1) {
                  sub_283(26);
               } else {
                  sub_18b7(0);
               }
            }

            if(var_46b[14] < 0) {
               if(!Class_6b.sub_836(0)) {
                  Class_6b.sub_6f5(8, 0, 1);
               }

               sub_18e5();
               return;
            }

            return;
         case 21:
            if(var_75a || var_f50[0]) {
               if(var_75a) {
                  if(var_7f8) {
                     var_e92[0] = var_1019[0];

                     for(var25 = 0; var25 < 7; ++var25) {
                        if((var_1d9d >> var25 & 1) == 1) {
                           var56 = var_1870;
                           var47 = var25;
                           var10002 = 0;
                        } else {
                           var56 = var_1870;
                           var47 = var25;
                           var10002 = 1;
                        }

                        var56[var47] = var10002;
                     }
                  }

                  var_ebe = 0;
                  var_f50[0] = true;
               }

               if(var_f50[0]) {
                  var_19e1 = true;
                  var_1a15 -= 600 * var_ebe;
                  var_e92[1] = var_167e[var_e92[0]][0];
                  var_f50[1] = false;
                  byte var58 = 0;

                  while(true) {
                     var_18ae = var58;
                     if(var_18ae >= var_1786[var_e92[0]].length || var_1cfb < var_1523[0][var_18ae]) {
                        break;
                     }

                     var58 = (byte)(var_18ae + 1);
                  }
               }

               var8 = var_1cfb >= var_2f7[var_e92[0]][1];
               sub_1aca();
               sub_142e(0, 0, 240, 320);
               sub_1a07();
               var_267b[0].var_373 = 1;
               sub_b8e(31, 0, 2, 3, 20);

               for(var25 = 0; var25 < 7; ++var25) {
                  var28 = var25 == var_e92[0]?13:(var_1cfb < var_2f7[var25][1]?14:12);
                  var_23b2[35].sub_429(var_3ec, var28, 99 + 6 * var25, 24, 0);
               }

               var_23b2[37].sub_429(var_3ec, var_2f7[var_e92[0]][4], 145, 140, 0);
               var_267b[1].var_373 = 0;
               sub_bd5(sub_b56(sub_c2d(Class_6b.sub_595(var_2f7[var_e92[0]][2]), Class_6b.sub_595(var_2f7[var_e92[0]][3])), 1, 100), 1, 145, 180, 3);
               if(var8) {
                  var_267b[1].var_373 = 3;
                  sub_b8e(138, 1, 145, 230, 24);
                  sub_b8e(139, 1, 145, 242, 24);
                  sub_b8e(135, 1, 145, 254, 24);
                  sub_b8e(134, 1, 145, 266, 24);
                  var_267b[1].var_373 = 0;
                  sub_b20(var_1830[var_e92[0]][4], 48, 0, 1, 145 + var_267b[1].var_6f0[3], 230, 20);
                  sub_b20(var_1830[var_e92[0]][5], 49, 0, 1, 145 + var_267b[1].var_6f0[3], 242, 20);
                  sub_b20(var_1830[var_e92[0]][1], 45, 1, 1, 145 + var_267b[1].var_6f0[3], 254, 20);
                  if(var_1c3d) {
                     sub_b20(var_1830[var_e92[0]][0], 43, 0, 1, 145 + var_267b[1].var_6f0[3], 266, 20);
                  } else {
                     sub_b20(var_1830[var_e92[0]][0] * 1000 / 1609, 44, 0, 1, 145 + var_267b[1].var_6f0[3], 266, 20);
                  }
               } else {
                  var_23b2[37].sub_429(var_3ec, 10, 138, 230, 0);
                  sub_b8e(38, 1, 145, 255, 17);
                  sub_b20(var_226[var_2f7[var_e92[0]][1]], 47, 0, 2, 145, 268, 17);
               }

               sub_1d61();
               sub_1945(true, var8);
               var_3ec.setColor(0);
               sub_a6c(0, 29, 240, 41);
               var_23b2[35].sub_429(var_3ec, 11, 120, 0, 0);
               sub_1b25();
               sub_142e(0, 0, 240, 320);
               var_ed3 = var8;
               var_f50[0] = false;
               var_f50[1] = false;
               var_75a = false;
            }

            if(var_f50[1]) {
               sub_1f63(var_e92[0]);
               var_167e[var_e92[0]][0] = (byte)var_e92[1];
               var_f50[1] = false;
            }

            label2255: {
               var25 = 0;
               var23 = 0;
               if(var_1a15 > 0) {
                  var25 = (var_1a15 + 300) / 600;
                  var10000 = (var_1a15 + 300) % 600 - 300;
               } else {
                  if(var_1a15 >= 0) {
                     break label2255;
                  }

                  var25 = (var_1a15 - 300) / 600;
                  var10000 = (var_1a15 - 300) % 600 + 300;
               }

               var23 = var10000;
            }

            if((var28 = var_e92[0] + var25) < 0) {
               var28 += 7;
            }

            if(var28 >= 7) {
               var28 -= 7;
            }

            label2246: {
               if(var_1a15 > 0) {
                  if((var27 = var28 + 1) >= 7) {
                     var27 -= 7;
                  }

                  var10000 = var27;
               } else {
                  if(var_1a15 >= 0) {
                     break label2246;
                  }

                  if((var27 = var28 - 1) < 0) {
                     var27 += 7;
                  }

                  var10000 = var27;
               }

               sub_1f63(var10000);
            }

            if(!sub_1f12()) {
               label2238: {
                  var24 = var_837 * 900 >> 12;
                  if(var_1a15 < 0) {
                     var10000 = var_1a15 > -var24?0:var_1a15 + var24;
                  } else {
                     if(var_1a15 <= 0) {
                        break label2238;
                     }

                     var10000 = var_1a15 < var24?0:var_1a15 - var24;
                  }

                  var_1a15 = var10000;
               }

               if(var_1a15 == 0) {
                  var_19e1 = false;
               }
            }

            sub_1b40();
            var_23b2[35].sub_429(var_3ec, 15, 120 - var23, 0, 0);
            if(var_1cfb >= var_2f7[var28][1]) {
               var_1d9d |= 1 << var28;
            }

            sub_1ec4(var28, var_167e[var28], -var23 + 120, 90, 0);
            if(!var_19e1) {
               if(var_ed3) {
                  for(var25 = 0; var25 < var_18ae; ++var25) {
                     var_3ec.setColor(var_1786[var_e92[0]][var25]);
                     sub_a6c(220 + var25 * 0, 55 + var25 * 15, 7, 7);
                     var_3ec.setColor(9914122);
                     var_3ec.drawRect(220 + var25 * 0 - 2, 55 + var25 * 15 - 2, 10, 10);
                  }
               }

               sub_1cb9(32, 80, true, 1);
               sub_1cb9(207, 80, true, 0);
               if(var_ed3) {
                  if(var_1870[var_e92[0]] == 1) {
                     sub_1c58(7, 64);
                  }

                  if((var24 = (int)((var_64f & 2044L) >> 2)) > 255) {
                     var24 = 511 - var24;
                  }

                  var26 = sub_112a(16777215, 4210760, var24);
                  var_3ec.setColor(var26);
                  var_3ec.drawRect(220 + var_e92[1] * 0 - 2, 55 + var_e92[1] * 15 - 2, 10, 10);
               }
            }

            if(!var_19e1) {
               if(var_ed3) {
                  sub_1908(1, var_18ae, 1, 2, true);
               }

               if(sub_1914(0, 7, 3, 4)) {
                  var_1019[0] = (byte)var_e92[0];
                  return;
               }
            }

            return;
         case 22:
            if(var_75a) {
               if(var_6bb != 23 && var_7f8) {
                  var_e92[0] = 0;
                  sub_9c4(var_1019[0]);
               }

               var_f50[0] = true;
               var_75a = false;

               for(var25 = 0; var25 < 16; ++var25) {
                  var_1870[var25] = 0;

                  for(var23 = 0; var23 < var_148c[var25]; ++var23) {
                     if(var_1cfb >= var_1523[var25][var23] && (var_1729[var_1019[0]][var25] >> var23 & 1) == 1 && (var_1e43[var25] >> var23 & 1) != 1) {
                        ++var_1870[var25];
                     }
                  }
               }
            }

            var_18e1 += var_ebe * 30;
            if(var_f50[0]) {
               sub_1aca();
               sub_142e(0, 0, 240, 320);
               sub_19d7(-1);
               var_23b2[35].sub_429(var_3ec, 0, 120, 0, 0);
               sub_1ec4(var_1019[0], var_16d6, 120, 85, 0);
               var_23b2[37].sub_429(var_3ec, var_2f7[var_1019[0]][4], 205, 19, 0);
               var_267b[0].var_373 = 1;
               sub_b8e(12, 0, 2, 3, 20);
               sub_b8e(var_2f7[var_1019[0]][3], 0, 18, 125, 36);
               var31 = var_e92[0] == 16?158:var_143f[var_e92[0]];
               var_267b[0].var_373 = 0;
               sub_bc7(sub_b56(Class_6b.sub_595(var31), 0, 100), 0, 2, 220, 36);
               if(var_e92[0] != 16 && var_e92[0] != 0) {
                  var31 = var_14f0[var_e92[0]][var_167e[var_1019[0]][var_e92[0]]];
                  var_267b[1].var_373 = 3;
                  sub_b8e(var31, 1, 2, 226, 20);
               }

               sub_1945(true, true);
               sub_1d7f();
               var_23b2[35].sub_429(var_3ec, 1, 120, 320, 0);
               sub_1d61();
               sub_1b25();
               sub_1a2e(34, 166);
               var_f50[var_71f] = true;
               var_f50[0] = false;
            }

            sub_1b40();
            sub_1dc0(true);
            sub_1cfd(var_1918, var_1940, false, 0);
            if(sub_1908(0, 17, 3, 4, true)) {
               sub_283(var_e92[0] == 16?32:23);
            }

            if(var_46b[14] < 0) {
               if(!Class_6b.sub_836(0)) {
                  Class_6b.sub_6f5(8, 0, 1);
               }

               sub_18e5();
               return;
            }

            return;
         case 23:
            if(var_75a) {
               var_75a = false;
               var_f50[1] = true;
               var_71f = (byte)(var_e92[0] == 0?1:0);
               if(var_7f8) {
                  var_e92[1] = 0;
               }

               var_18ae = 0;

               for(var25 = 0; var25 < var_148c[var_e92[0]]; ++var25) {
                  if((var_1729[var_1019[0]][var_e92[0]] >> var25 & 1) == 1 && var_1523[var_e92[0]][var25] <= var_1cfb) {
                     var_1841[var_18ae] = (byte)var25;
                     if(var_7f8 && var25 == var_167e[var_1019[0]][var_e92[0]]) {
                        var_e92[1] = var_18ae;
                     }

                     ++var_18ae;
                  }
               }

               if(var_71f == 1 && var_18ae > var_1786[var_1019[0]].length) {
                  var_18ae = (byte)var_1786[var_1019[0]].length;
               }

               if(var_7f8) {
                  for(var25 = 0; var25 < var_18ae; ++var25) {
                     if((var_1e43[var_e92[0]] >> var_1841[var25] & 1) != 1) {
                        var_1e43[var_e92[0]] = (short)(var_1e43[var_e92[0]] | 1 << var_1841[var25]);
                        var56 = var_1870;
                        var47 = var25;
                        var10002 = 1;
                     } else {
                        var56 = var_1870;
                        var47 = var25;
                        var10002 = 0;
                     }

                     var56[var47] = var10002;
                  }
               }
            }

            if((var24 = var_e92[1] - 2) < 0 || 4 > var_18ae && (var24 = var_18ae - 4) < 0) {
               var24 = 0;
            }

            if((var26 = var24 + 4) > var_18ae) {
               if((var24 -= var26 - var_18ae) < 0) {
                  var24 = 0;
               }

               var26 = var_18ae;
            }

            if(var_f50[1]) {
               if(var_16d6[var_e92[0]] != var_1841[var_e92[1]]) {
                  if(var_71f == 1) {
                     sub_1f63(var_1019[0]);
                  }

                  var_16d6[var_e92[0]] = var_1841[var_e92[1]];
               }

               sub_1aca();
               sub_1945(true, true);
               sub_1d7f();
               sub_1ec4(var_1019[0], var_16d6, 120, 85, 0);
               var_3ec.setColor(0);
               sub_a6c(100, 232, 137, 66);
               var_3ec.setColor(15914496);
               var_3ec.drawRect(100, 232, 137, 66);

               for(var25 = var24; var25 < var26; ++var25) {
                  if(var25 == var_e92[1]) {
                     sub_1a47(105, 244 + (var25 - var24) * 11 + 5);
                  }

                  if(var_71f == 0) {
                     if(var_1841[var25] == var_167e[var_1019[0]][var_e92[0]]) {
                        var46 = var_267b[1];
                        var49 = 0;
                     } else {
                        var46 = var_267b[1];
                        var49 = 3;
                     }

                     var46.var_373 = var49;
                     sub_b8e(var_14f0[var_e92[0]][var_1841[var25]], 1, 105, 244 + (var25 - var24) * 11, 20);
                     var_187b[var25] = 105 + Class_22.var_524 + 2;
                     if(var_187b[var25] <= 222) {
                        continue;
                     }
                  } else {
                     var_3ec.setColor(var_1786[var_1019[0]][var_1841[var25]]);
                     sub_a6c(105, 244 + (var25 - var24) * 11, 129, 9);
                     Graphics var57;
                     if(var_1841[var25] == var_167e[var_1019[0]][var_e92[0]]) {
                        var57 = var_3ec;
                        var47 = 16777215;
                     } else {
                        var57 = var_3ec;
                        var47 = 0;
                     }

                     var57.setColor(var47);
                     var_3ec.drawRect(105, 244 + (var25 - var24) * 11, 129, 9);
                  }

                  var_187b[var25] = 222;
               }

               sub_1b25();
               var_f50[1] = false;
            }

            sub_1b40();
            sub_1dc0(false);
            if(var24 != 0) {
               sub_1cb9(164, 233, false, 0);
            }

            if(var26 != var_18ae) {
               sub_1cb9(164, 299, false, 2);
            }

            for(var25 = var24; var25 < var26; ++var25) {
               if(var_1870[var25] == 1) {
                  sub_1e64(var_187b[var25], 243 + (var25 - var24) * 11 + 5);
               }
            }

            sub_1cfd(var_1918, var_1940, true, 0);
            if(sub_1908(1, var_18ae, 1, 2, false)) {
               sub_966(var_1019[0]);
               sub_31c();
            }

            if(var_46b[14] < 0) {
               Class_6b.sub_6f5(8, 0, 1);
               sub_9c4(var_1019[0]);
               sub_31c();
               return;
            }

            return;
         case 24:
            if(var_75a) {
               if(var_7f8) {
                  int[] var55;
                  if(var_1019[4] >= 0) {
                     var55 = var_e92;
                     var49 = 0;
                     var54 = var_1019[4];
                  } else {
                     var55 = var_e92;
                     var49 = 0;
                     var54 = 0;
                  }

                  var55[var49] = var54;
                  var_18ae = 3;

                  for(var25 = 0; var25 < 3; ++var25) {
                     if(var_1cfb >= var_357[var25][3]) {
                        if((var_1de6 >> var25 & 1) == 0) {
                           var_1841[var25] = -2;
                           var_1de6 |= 1 << var25;
                           continue;
                        }

                        var56 = var_1841;
                        var47 = var25;
                        var54 = -1;
                     } else {
                        var56 = var_1841;
                        var47 = var25;
                        var54 = (byte)var25;
                     }

                     var56[var47] = var54;
                  }
               }

               sub_1a2e(49 + var_e92[0] * 70, 80 + var_e92[0] * 0);
               var_75a = false;
               var_f50[0] = true;
            }

            if(var_f50[0]) {
               var_ed3 = var_1cfb >= var_357[var_e92[0]][3];
               sub_1aca();
               sub_142e(0, 0, 240, 320);
               var_3ec.setColor(0);
               sub_a6c(0, 0, 240, 320);
               if(var_ed3) {
                  sub_bd5(sub_b56(Class_6b.sub_595(var_357[var_e92[0]][2]), 1, 70), 1, 20, 140, 20);
                  var_23b2[var_357[var_e92[0]][0]].sub_429(var_3ec, 0, 240, 183, 1);
               } else {
                  var_23b2[37].sub_429(var_3ec, 10, 44, 168, 0);
                  sub_b8e(38, 1, 50, 200, 17);
                  sub_b20(var_226[var_357[var_e92[0]][3]], 47, 0, 2, 50, 220, 17);
               }

               var_23b2[35].sub_429(var_3ec, 0, 120, 0, 0);
               var_23b2[35].sub_429(var_3ec, 1, 120, 320, 0);
               var_267b[0].var_373 = 1;
               sub_b8e(11, 0, 2, 3, 20);
               sub_1a47(49 + var_e92[0] * 70, 80 + var_e92[0] * 0);
               var_267b[0].var_373 = 0;
               sub_b8e(var_357[var_e92[0]][1], 0, 20, 115, 20);
               sub_1d61();
               sub_1945(true, var_ed3);
               var24 = 22;

               for(var25 = 0; var25 < 3; ++var25) {
                  if(var_1841[var25] < 0) {
                     var_23b2[var_357[var25][0]].sub_429(var_3ec, 1, var24, 32, 0);
                     var_23b2[35].sub_429(var_3ec, 51, var24, 32, 0);
                  }

                  var24 += 70;
               }

               sub_1b25();
               var_f50[0] = false;
            }

            sub_1b40();

            for(var25 = 0; var25 < var_18ae; ++var25) {
               var24 = 22 + var25 * 70;
               var26 = 32 + var25 * 0;
               if(var_1841[var25] == -2) {
                  sub_1c58(var24 + 28, var26);
               } else if(var_1841[var25] >= 0) {
                  var_23b2[35].sub_410(var_3ec, 5, var_586 & 1, var24, var26, 0);
                  var_23b2[35].sub_429(var_3ec, 51, var24, var26, 0);
               }
            }

            sub_1cfd(var_1918, var_1940, false, 0);
            if(sub_1914(0, 3, 3, 4)) {
               var_1019[4] = (byte)var_e92[0];
               return;
            }

            return;
         case 25:
            if(var_75a || var_f50[0]) {
               if(var_75a) {
                  if(var_7f8) {
                     var_e92[0] = 0;
                  }

                  sub_1a2e(20, 53 + 20 * var_e92[0]);
                  var_1a4b = false;

                  for(var25 = 0; var25 < 3; ++var25) {
                     if(var_1cfb >= var_357[var25][3] && (var_1de6 >> var25 & 1) != 1) {
                        var_1a4b = true;
                     }
                  }

                  var_1a7a = false;

                  for(var25 = 0; var25 < 16; ++var25) {
                     for(var23 = 0; var23 < var_148c[var25]; ++var23) {
                        if(var_1cfb >= var_1523[var25][var23] && (var_1e43[var25] >> var23 & 1) != 1 && (var_1729[var_1019[0]][var25] >> var23 & 1) == 1) {
                           var_1a7a = true;
                        }
                     }
                  }
               }

               var_75a = false;
               sub_1aca();
               sub_142e(0, 0, 240, 320);
               sub_19d7(112);
               var_23b2[35].sub_429(var_3ec, 0, 120, 0, 0);
               var_23b2[35].sub_429(var_3ec, 1, 120, 320, 0);
               var_23b2[35].sub_429(var_3ec, 16, 120, 320, 0);
               var_3ec.setColor(10256989);
               sub_a6c(0, 232, 240, 51);
               sub_1ec4(var_1019[0], var_167e[var_1019[0]], 70, 200, 1);
               if(var_1019[4] >= 0) {
                  var_23b2[var_357[var_1019[4]][0]].sub_429(var_3ec, 0, 240, 131, 1);
               }

               var_267b[0].var_373 = 1;
               sub_b8e(29, 0, 2, 3, 20);
               var_267b[0].var_373 = 0;

               for(var25 = 0; var25 < var_10e.length; ++var25) {
                  sub_b8e(var_10e[var25], 0, 20, 53 + var25 * 20, 6);
                  if(var25 == var_e92[0]) {
                     sub_1a47(20, 53 + var25 * 20);
                  }

                  var_187b[var25] = 20 + Class_22.var_524;
               }

               var_267b[0].var_373 = 1;
               sub_b8e(30, 0, 2, 216, 20);
               var_267b[1].var_373 = 3;
               sub_b8e(39, 1, 10, 238, 20);
               sub_b8e(40, 1, 10, 249, 20);
               sub_b8e(41, 1, 10, 260, 20);
               if(var_1019[4] >= 0) {
                  sub_b8e(42, 1, 10, 271, 20);
               }

               var_267b[1].var_373 = 0;
               sub_b8e(var_2f7[var_1019[0]][3], 1, 230, 238, 24);
               sub_b8e(var_2bc[var_1019[1]][1], 1, 230, 249, 24);
               var25 = var_1992[var_1019[1]][var_1019[2]][0];
               sub_b8e(var_272[var25][0], 1, 230, 260, 24);
               if(var_1019[4] >= 0) {
                  sub_b8e(var_357[var_1019[4]][1], 1, 230, 271, 24);
               }

               sub_1d61();
               sub_1945(true, true);
               sub_1b25();
               var_f50[0] = false;
            }

            sub_1b40();
            if(var_1a7a) {
               sub_1e64(var_187b[1], 73);
            }

            if(var_1a4b) {
               sub_1e64(var_187b[2], 93);
            }

            sub_1cfd(var_1918, var_1940, true, 0);
            if(sub_1908(0, var_10e.length, 1, 2, true)) {
               sub_18b7(var_e92[0]);
            }

            if(var_46b[14] < 0) {
               if(!Class_6b.sub_836(0)) {
                  Class_6b.sub_6f5(8, 0, 1);
               }

               sub_18e5();
               return;
            }

            return;
         case 26:
            if(var_75a) {
               if(var_7f8) {
                  var_e92[1] = 0;
               }

               sub_1a2e(106, 132 + 18 * var_e92[0]);
               var_75a = false;
               var_f50[1] = true;
               sub_1aca();
               sub_142e(0, 0, 240, 320);
               var_3ec.setColor(0);
               sub_a6c(85, 81, 145, 110);
               var_3ec.setColor(15822871);
               var_3ec.drawRect(85, 81, 145, 110);
               var_267b[0].var_373 = 0;
               sub_bc7(sub_b56(Class_6b.sub_595(74), 0, 130), 0, 160, 89, 17);
               var_267b[0].var_373 = 1;

               for(var25 = 0; var25 < var_25c.length; ++var25) {
                  sub_b20(var_25c[var25], 47, 0, 2, 106, 132 + var25 * 18, 6);
               }

               sub_1b25();
            }

            sub_1a47(106, 132 + var_e92[1] * 18);
            sub_1e70();
            sub_1cfd(var_1918, var_1940, true, 0);
            var_f50[1] = false;
            if(sub_1908(1, var_25c.length, 1, 2, true)) {
               var_1019[3] = (byte)var_e92[1];
               sub_18b7(0);
            }

            if(var_46b[14] >= 0) {
               return;
            }

            if(!Class_6b.sub_836(0)) {
               Class_6b.sub_6f5(8, 0, 1);
            }

            var48 = 20;
            break label2852;
         case 27:
            if(!sub_20bf(2)) {
               return;
            }

            if(var_e92[2] == 1) {
               sub_79d();
               sub_22b4();
               sub_c49(true);
               sub_2313();
            }

            var48 = 16;
            break label2852;
         case 28:
            if(var_75a) {
               sub_142e(0, 0, 240, 320);
               if(var_7f8) {
                  var_18ae = -1;
                  var_71f = 0;
                  var_f50[0] = true;
                  var_120d[19] = 0;
                  var_120d[21] = 0;
                  var_120d[18] = 0;
                  var_120d[20] = 0;

                  for(var28 = sub_235e(var_1cda - var_120d[16]) + 1; var28 <= var_1cfb; ++var28) {
                     for(var25 = 0; var25 < 7; ++var25) {
                        if(var_2f7[var25][1] == var28) {
                           ++var_120d[19];
                        }
                     }

                     for(var25 = 0; var25 < 3; ++var25) {
                        if(var_357[var25][3] == var28) {
                           ++var_120d[21];
                        }
                     }

                     for(var25 = 0; var25 < 6; ++var25) {
                        for(var23 = 0; var23 < var_1992[var25].length; ++var23) {
                           if(var_1992[var25][var23][2] == var28) {
                              ++var_120d[18];
                           }
                        }
                     }

                     for(var25 = 0; var25 < 16; ++var25) {
                        for(var23 = 0; var23 < var_148c[var25]; ++var23) {
                           if(var_1523[var25][var23] == var28) {
                              ++var_120d[20];
                           }
                        }
                     }
                  }

                  sub_1f98(20, 282, 22528);
                  var8 = true;
                  var34 = true;

                  for(var25 = 0; var25 < 24; ++var25) {
                     var8 = var8 && var_1d55[var25] != 0;
                     var34 = var34 && var_1d55[var25] == 1;
                  }

                  label1993: {
                     var34 = var34 && var_1cfb >= var_226.length - 1;
                     var_6c8 = -1;
                     if(var34) {
                        if((var_1cc4 & 2) != 0) {
                           break label1993;
                        }

                        var_6c8 = 30;
                        var10000 = var_1cc4;
                        var49 = 3;
                     } else {
                        if(!var8 || (var_1cc4 & 1) != 0) {
                           break label1993;
                        }

                        var_6c8 = 29;
                        var10000 = var_1cc4;
                        var49 = 1;
                     }

                     var_1cc4 = var10000 | var49;
                  }

                  if(var_6c8 == -1) {
                     var_6c8 = var_13aa?14:19;
                  }
               }

               var_75a = false;
            }

            if(var_f50[0]) {
               sub_1aca();
               sub_142e(0, 0, 240, 320);
               sub_1974(false);
               var_23b2[35].sub_429(var_3ec, 0, 120, 0, 0);
               var_23b2[35].sub_429(var_3ec, 1, 120, 320, 0);
               sub_1960(106, false);
               var_267b[0].var_373 = 1;
               sub_b8e(81, 0, 2, 3, 20);
               sub_1d61();
               if(var_71f >= 1) {
                  byte var10004;
                  byte var51;
                  if(var_18ae > 0) {
                     var_267b[0].var_373 = 0;
                     var48 = 92;
                     var49 = 0;
                     var10002 = 120;
                     var51 = 29;
                     var10004 = 17;
                  } else {
                     var_267b[0].var_373 = 0;
                     var48 = 97;
                     var49 = 0;
                     var10002 = 120;
                     var51 = 45;
                     var10004 = 5;
                  }

                  sub_b8e(var48, var49, var10002, var51, var10004);
                  sub_b8e(91, 0, 120, 225, 24);
                  sub_b20(var_120d[16], 47, 0, 2, 120, 225, 20);
               }

               sub_1b25();
               var_1ad4 = 0;
               var_f50[0] = false;
            }

            var_1ad4 += var_837;
            var24 = var_1ad4 / 4096;
            if(var_71f < 2) {
               sub_1fa9(var_837);
            }

            if(var_71f == 0) {
               if(var24 < var_395.length && var_18ae != var24) {
                  var_18ae = (byte)var24;
                  if(var_105e != 3 || var_395[var24][0] != 89) {
                     sub_1aca();
                     var_18ae = (byte)var24;
                     var_267b[0].var_373 = 0;
                     sub_b8e(var_395[var24][0], 0, 10, 30 + var24 * 25, 20);
                     if(var_395[var24][1] > 0) {
                        var28 = 10 + Class_22.var_524 + var_267b[0].var_6f0[3];
                        var_267b[0].var_373 = 1;
                        sub_b8e(51, 0, var28, 30 + var24 * 25, 20);
                        sub_b20(var_120d[var_395[var24][1]], -1, 0, 0, var28 + Class_22.var_524 + var_267b[0].var_6f0[3], 30 + var24 * 25, 20);
                     }

                     var_1b2e = 2048;
                     sub_1b25();
                  }
               }

               sub_142e(0, 0, 240, 320);
               sub_1b40();
               if(var_1b2e > 0) {
                  var_1b2e -= var_837;
                  if(var_1b2e <= 0) {
                     var31 = var_120d[var_395[var_18ae][2]];
                     sub_1aca();
                     sub_b20(var31, 47, 0, 2, 230, 30 + var_18ae * 25, 24);
                     sub_1b25();
                  } else {
                     var31 = (2048 - var_1b2e) * var_120d[var_395[var24][2]] / 2048;
                  }

                  sub_b20(var31, 47, 0, 2, 230, 30 + var_18ae * 25, 24);
               }

               if(var_46b[5] < 0 || var_46b[13] < 0 || var24 >= var_395.length + 2) {
                  var_18ae = 0;
                  if(var_120d[19] > 0) {
                     var_1841[var_18ae] = 19;
                     ++var_18ae;
                  }

                  if(var_120d[21] > 0) {
                     var_1841[var_18ae] = 21;
                     ++var_18ae;
                  }

                  if(var_120d[18] > 0) {
                     var_1841[var_18ae] = 18;
                     ++var_18ae;
                  }

                  if(var_120d[20] > 0) {
                     var_1841[var_18ae] = 20;
                     ++var_18ae;
                  }

                  var_71f = 1;
                  var_f50[0] = true;
               }
            } else if(var_71f == 1) {
               if(var24 < var_18ae && var_1841[var24] != -1) {
                  sub_1aca();
                  var_267b[0].var_373 = 0;
                  sub_b20(var_120d[var_1841[var24]], -1, 0, 0, 50, 55 + var24 * 20, 20);
                  sub_b8e(93 + var_1841[var24] - 18, 0, 50 + Class_22.var_524 + var_267b[0].var_6f0[3], 55 + var24 * 20, 20);
                  var_1841[var24] = -1;
                  sub_1b25();
               }

               sub_1b40();
               sub_142e(0, 0, 240, 320);

               for(var25 = 0; var25 < var_18ae; ++var25) {
                  if(var_1841[var25] == -1) {
                     sub_1c58(20, 55 + var25 * 20);
                  }
               }

               if(var24 >= var_18ae) {
                  if((var_586 >> 4 & 1) == 0) {
                     var_267b[1].var_373 = 0;
                     sub_b8e(0, 1, 120, 266, 17);
                  }

                  if(sub_249()) {
                     var_71f = 2;
                  }
               }

               if(var_46b[5] < 0 || var_46b[13] < 0) {
                  var_71f = 2;
               }
            } else if(var_71f == 2) {
               Class_6b.sub_690(0, 0);
               ++var_71f;
            } else if(var_71f == 3) {
               Class_6b.sub_6f5(0, 0, 1);
               ++var_71f;
            } else {
               sub_2b8();
            }

            sub_1fd5();
            return;
         case 29:
            sub_228f(98, var_837);
            return;
         case 30:
            sub_228f(99, var_837);
            return;
         case 31:
            var_13aa = true;
            var_18ae = 0;

            for(var25 = 0; var25 < 6; ++var25) {
               if(var_1992[var25][0][2] <= var_1cfb) {
                  var_1841[var25] = 1;
                  ++var_18ae;
               } else {
                  var_1841[var25] = 0;
               }
            }

            var23 = Class_6b.sub_496(0, var_18ae) + 1;

            for(var25 = 0; var23 > 0; ++var25) {
               if(var_1841[var25] == 1) {
                  --var23;
               }
            }

            var_13e0 = (byte)(var25 - 1);
            var48 = 32;
            break label2852;
         case 32:
            var31 = var_13aa?var_13e0:var_1019[1];
            byte var33 = var_13aa?0:var_1019[2];
            if(Class_6b.var_5ae[0] == 0 || !Class_6b.sub_836(0)) {
               Class_6b.sub_754(0);
               Class_6b.sub_6f5(7, 0, 1);
            }

            var_1019[5] = (byte)((var_1019[5] + 1) % 3);
            var_105e = var_1992[var31][var33][0];
            var_28a0 = Class_6b.sub_595(var_2bc[var31][1]);
            var_10b0 = var_1992[var31][var33][6];
            var_10cd = var_1992[var31][var33][7];
            var_10f1 = var_1992[var31][var33][8];
            var_2934 = Class_6b.sub_595(var_272[var_105e][3]);
            var_37fd = var_1992[var31][var33][5];
            var_2941 = sub_b56(Class_6b.sub_595(var_105e == 0?Class_6b.sub_496(75, 81):var_272[var_105e][3]), 0, 180);
            sub_2122();
            sub_2239();
            sub_2181();
            var_2a39 = 0;
            sub_2a7(11, 33);
            return;
         case 33:
            if(var_79d) {
               var_71f = 0;
               var_2a39 = 0;
               Class_6b.sub_1cc();
               sub_1292();
               System.gc();
               var_c54 = null;
            }

            if(var_71f == 0) {
               if(var_2a39 == 0 && var_c54 != null) {
                  var_2a39 = 3;
               }

               var_3ec.setColor(0);
               sub_a6c(0, 0, 240, 320);
               if(var_2a39 == 0) {
                  Class_6b.sub_cf("/4");
                  ++var_2a39;
                  return;
               }

               if(var_2a39 == 1) {
                  var_c54 = Class_6b.sub_3f0(26);
                  Class_6b.sub_1cc();
                  System.gc();
                  ++var_2a39;
                  return;
               }

               if(var_2a39 == 2) {
                  (var30 = Image.createImage(var_c54.getWidth(), var_c54.getHeight())).getGraphics().drawImage(var_c54, 0, 0, 0);
                  var_c54 = null;
                  System.gc();
                  var_c54 = var30;
                  sub_2407(var_c54, 1760, 1216, 624);
                  ++var_2a39;
                  return;
               }

               if(var_2a39 == 3) {
                  sub_2181();
                  ++var_71f;
                  var_2a39 = 0;
                  return;
               }

               return;
            }

            if(var_75a) {
               var_c54 = null;
               System.gc();
               var_2a39 = 0;
               var_29d9 = 0;
               var_75a = false;
            }

            sub_21df(120, 70, var_29d9, 28);
            if(!sub_126a()) {
               return;
            }

            var48 = 43;
            break label2852;
         case 34:
            sub_2157();
            if(var_71f == 1) {
               sub_1292();
               var_2934 = null;
               var_28a0 = null;
               if(var_1150) {
                  sub_2a7(10, 28);
                  return;
               }

               if(var_11b3 && !var_13aa) {
                  sub_2a7(10, 19);
                  return;
               }

               sub_2a7(10, 14);
               return;
            }

            if(!Class_6b.sub_836(0)) {
               ++var_71f;
               return;
            }

            return;
         case 35:
            if(var_79d) {
               sub_283(36);
               sub_1fa();
               return;
            }

            if(Class_6b.var_5ae[0] == 7) {
               if(var_200b > 0L) {
                  Class_6b.sub_690(var_1150?5:6, 0);
                  return;
               }

               Class_6b.sub_690(2 + var_1019[5], 0);
               return;
            }

            var8 = false;
            if(var_200b > 0L) {
               var10000 = var_1150?5:6;
               var49 = 0;
               var10002 = 1;
            } else {
               var10000 = 2 + var_1019[5];
               var49 = 0;
               var10002 = 0;
            }

            if(Class_6b.sub_6f5(var10000, var49, var10002)) {
               sub_283(var_6ef);
               sub_1fa();
               return;
            }

            return;
         case 36:
            if(var_75a) {
               if(var_815 || var_7f8) {
                  var_e92[0] = 0;
               }

               var_f50[0] = true;
            }

            if(var_f50[0]) {
               sub_17dc();
               sub_148d();
               sub_142e(0, 0, 240, 320);
               var26 = sub_15b3(7, var_33e5, 17, 18);
               var26 += 12;

               for(var25 = 0; var25 < 7; ++var25) {
                  if(var25 == var_e92[0]) {
                     sub_15e4(var26 - 12, var25, var_3154);
                  }

                  int var29 = -1;
                  if(var25 == 2) {
                     var29 = var_1c6a?12:8;
                  } else if(var25 == 3) {
                     var29 = var_1c3d?84:85;
                  }

                  if(var29 == -1) {
                     sub_b8e(var_1b3[var25], 0, 120, var26 + 25 * var25, 3);
                  } else {
                     sub_bc7(sub_c2d(Class_6b.sub_595(var_1b3[var25]), Class_6b.sub_595(var29)), 0, 120, var26 + 25 * var25, 3);
                  }
               }

               var_f50[0] = false;
            }

            if(var_e92[0] == 2) {
               var_f50[0] = sub_1a8a(0);
            }

            if(var_e92[0] == 3) {
               var_f50[0] = sub_1a8a(1);
               var_75a = var_f50[0];
            }

            var_f28 = var_e92[0] != 0;
            if(sub_1908(0, var_1b3.length, 1, 2, true)) {
               label2677: {
                  switch(var_e92[0]) {
                  case 0:
                     var_f28 = true;
                     var48 = 35;
                     break;
                  case 1:
                     var48 = 37;
                     break;
                  case 2:
                  case 3:
                  default:
                     break label2677;
                  case 4:
                     var48 = 39;
                     break;
                  case 5:
                     var48 = 37;
                     break;
                  case 6:
                     var48 = 37;
                  }

                  sub_283(var48);
               }
            }

            if(var_46b[14] >= 0) {
               return;
            }

            var48 = 35;
            break label2852;
         case 37:
            if(var_75a) {
               sub_17dc();
               sub_148d();
               var_e92[1] = 0;
               var_f50[1] = true;
               var_75a = false;
            }

            if(var_f50[1]) {
               sub_142e(0, 0, 240, 320);
               var26 = sub_15b3(3, var_33e5, 17, 18);
               var26 += 12;
               sub_b8e(13, 0, 120, var26, 3);
               var26 += 25;

               for(var25 = 0; var25 < 2; ++var25) {
                  if(var25 == var_e92[1]) {
                     sub_15e4(var26 - 12, var25, var_3154);
                  }

                  sub_b8e(var25 == 0?14:15, 0, 120, var26 + 25 * var25, 3);
               }
            }

            if(var_46b[14] < 0) {
               Class_6b.sub_6f5(8, 0, 1);
               var48 = 36;
               break label2852;
            }

            var_f28 = var_e92[0] != 1 || var_e92[1] == 0;
            if(!sub_1908(1, 2, 1, 2, true)) {
               return;
            }

            var_f28 = true;
            if(var_e92[1] == 0) {
               var48 = 36;
               break label2852;
            }

            var_1150 = false;
            var_11b3 = false;
            if(var_e92[0] == 5) {
               var48 = 34;
               break label2852;
            }

            if(var_e92[0] != 6) {
               if(var_e92[0] != 1) {
                  return;
               }

               sub_1828();
               var48 = 43;
               break label2852;
            }
            break;
         case 38:
            if(var_75a) {
               Class_6b.sub_754(0);
               sub_17dc();
               sub_148d();
               var_e92[1] = 0;
               var_f50[1] = true;
               var_75a = false;
            }

            if(var_f50[1]) {
               sub_142e(0, 0, 240, 320);
               var26 = sub_15b3(3, var_33e5, -1, 18);
               var26 += 12;
               sub_b8e(45, 0, 120, var26, 3);
               var26 += 25;

               for(var25 = 0; var25 < 2; ++var25) {
                  if(var25 == var_e92[1]) {
                     sub_15e4(var26 - 12, var25, var_3154);
                  }

                  sub_b8e(var25 == 0?14:15, 0, 120, var26 + 25 * var25, 3);
               }
            }

            var_f28 = var_e92[1] == 0;
            if(!sub_1908(1, 2, 1, 2, true)) {
               return;
            }

            var_f28 = true;
            if(var_e92[1] == 0) {
               var48 = 34;
            } else {
               sub_1828();
               var48 = 43;
            }
            break label2852;
         case 39:
            if(var_75a) {
               if(var_7f8) {
                  var_e92[1] = 0;
               }

               var_f50[1] = true;
               var_75a = false;
            }

            if(var_f50[1]) {
               byte[] var32 = sub_b56(var_e92[1] == 0?Class_6b.sub_595(19):var_2934, 0, 225);
               var23 = 1;

               for(var25 = 0; var25 < var32.length; ++var25) {
                  if(var32[var25] == 10) {
                     ++var23;
                  }
               }

               sub_17dc();
               var_75a = true;
               sub_148d();
               var_75a = false;
               sub_142e(0, 0, 240, 320);
               var26 = sub_15b3(var23, var_33e5, 17, var_e92[1] < 1?16:-1) + 25 * var23 / 2;
               sub_bd5(var32, 0, 120, var26, 3);
               var_f50[1] = false;
            }

            if((var_46b[5] < 0 || var_46b[13] < 0) && var_e92[1] < 1) {
               ++var_e92[1];
               var_f50[1] = true;
            }

            if(var_46b[14] < 0) {
               if(var_e92[1] > 0) {
                  var_f50[1] = true;
                  --var_e92[1];
                  return;
               }

               Class_6b.sub_6f5(8, 0, 1);
               sub_31c();
               return;
            }

            return;
         case 40:
            if(var_49db) {
               if(var_46b[8] < 0) {
                  var_44e8.var_70e = var_48e7 + 1;
                  if(var_105e == 0) {
                     var_4761 = (byte)Class_6b.sub_496(0, 3);
                  } else if(var_105e == 4) {
                     var_1ed8 = var_10b0;
                  } else if(var_105e == 1) {
                     var_4761 = 0;
                  } else if(var_105e == 2) {
                     var_2780 = var_10b0;
                  } else if(var_105e == 3) {
                     var_4943 = true;
                  }
               }

               if(var_46b[7] < 0) {
                  var_44e8.var_70e = var_48e7 + 1;
                  if(var_105e != 0 && var_105e != 4) {
                     if(var_105e == 1) {
                        var_4761 = 1;
                     } else if(var_105e == 2) {
                        var_2780 = 0;
                     } else if(var_105e == 3) {
                        Class_9b.var_e14[0][0] = Class_9b.var_e14[0][1];
                     }
                  } else {
                     var_4761 = 4;
                  }
               }
            }

            var_11b3 = var_44e8.var_70e > var_48e7 || var_105e == 3 && var_2801 <= 0 && var_4943 || var_105e == 2 && var_2780 >= var_10b0;
            if(var_27d5 > 0) {
               var_27d5 -= var_837;
               if(var_27d5 <= 0 || var_11b3) {
                  var_27d5 = 0;
                  var_75a = true;
               }
            }

            if(var_2801 > 0) {
               var_2801 -= var_837;
               if(var_2801 > 0 && !var_11b3) {
                  var_837 /= 3;
                  var53 = true;
               } else {
                  var_2801 = 0;
                  var_75a = true;
                  var53 = false;
               }

               var_284e = var53;
            }

            sub_7ff();
            if(var_25dd > 0) {
               var_25dd -= var_837;
               if(var_25dd <= 0) {
                  var36 = 0;

                  for(var11 = var_4651.var_48; var_25c4 > var_5005[var36] && var36 < var_5005.length - 1; ++var36) {
                     ;
                  }

                  var_1ed8 += var_5005[var36];
                  var_120d[13] += var_5005[var36] - var_25c4;
                  if(var11) {
                     var_1ed8 += var_5005[var36];
                     var_120d[13] += var_5005[var36];
                  }

                  var_2017 |= 64;
                  sub_cd9(var36, var11);
                  var_262f = 0;
                  var_25c4 = 0;
               }
            }

            if(!var_284e && var_1f5b > 0) {
               var_1f5b -= var_837;
               if(var_1f5b <= 0) {
                  var_2017 |= 128;
               }
            }

            if(var_2aca > 0) {
               var_2aca -= 200 * var_837 >> 12;
               if(var_2aca < 0) {
                  var_2aca = 0;
               }
            }

            sub_1704(var_837);
            if(var_2358) {
               sub_23fd(var_22fb, 4096);
               var_2358 = false;
            }

            label2532: {
               sub_14e8(var_837);
               sub_239b();
               if(var_11b3) {
                  var_2034 = var_1f1f;
                  var_208e = var_1f1f;
                  var10000 = var_1f1f;
               } else {
                  label3146: {
                     if(!var_284e && Class_9b.var_1139 <= 0) {
                        if(var_2034 != var_1f1f) {
                           var_2034 = var_1f1f;
                        } else {
                           var_208e = var_2034;
                        }
                     } else {
                        label2518: {
                           var_2034 = var_1f1f;
                           if(var_284e) {
                              if((var36 = var_2034 - var_208e) > 0) {
                                 var_208e += var_837 * var36 / var_2801;
                              }

                              if(var_208e <= var_2034) {
                                 break label2518;
                              }
                           }

                           var_208e = var_2034;
                        }

                        if(Class_9b.var_1139 <= 0) {
                           var10000 = var_2034;
                           break label3146;
                        }

                        if((var36 = var_209d - var_2034) > 0) {
                           var36 = (var36 << 12) / Class_9b.var_1139;
                           var_209d -= var36 * var_837 >> 12;
                        }

                        if(var_209d >= var_2034) {
                           break label2532;
                        }
                     }

                     var10000 = var_2034;
                  }
               }

               var_209d = var10000;
            }

            sub_17dc();
            sub_148d();
            if(var_2267 > 0) {
               var_2267 -= var_837;
               sub_13f5();
               var36 = 0;
               var37 = 0;
               if(var_2267 < 4096) {
                  var36 = (4096 - var_2267) * 142 / 4096;
               } else if(var_2267 > 12288) {
                  var37 = (var_2267 - 12288) * 108 / 4096;
               }

               var_3ec.setColor(16777215);
               sub_a6c(98 + var36, 60 - var37, var_22fb.getWidth() + 4, 104);
               var_3ec.drawImage(var_22fb, 100 + var36, 62 - var37, 20);
               sub_a6c(98 + var36, 60 - var37 + 100 + 4, 124, 16);
               sub_b20(var_5005[var_22bf], 83, 0, 0, 160 + var36, 178 - var37, 33);
            }

            if(var_2d85 > 0) {
               var_2d85 -= var_837;
               if(var_2d85 < 0) {
                  var_2d85 = 0;
               }

               var_2aa8 = (var25 = var_43ed[var_44e8.var_2f5]) + (var_2aa8 - var25) * var_2d85 / 6144;
               var_2a74 = (var25 = var_4434[var_44e8.var_2f5]) + (var_2a74 - var25) * var_2d85 / 6144;
               var_3127 = (var25 = var_4476[var_44e8.var_2f5]) + (var_3127 - var25) * var_2d85 / 6144;
            }

            if(var_11b3) {
               var_1150 = false;
               if(var_105e == 1) {
                  var_1150 = var_4761 == 0;
               } else if(var_105e == 2) {
                  var_1150 = var_2780 >= var_10f1;
               } else if(var_105e == 0) {
                  var_1150 = var_4761 <= 2;
               } else {
                  label2505: {
                     if(var_105e == 3) {
                        var53 = var_4943;
                     } else {
                        if(var_105e != 4) {
                           break label2505;
                        }

                        var53 = var_1ed8 >= var_10f1;
                     }

                     var_1150 = var53;
                  }
               }

               sub_13f5();
               if(var_1150 && var_105e != 3) {
                  label2494: {
                     label2493: {
                        var36 = var_4761;
                        if(var_105e == 2) {
                           if(var_2780 >= var_10b0) {
                              var48 = 0;
                              break label2493;
                           }

                           if(var_2780 >= var_10cd) {
                              var48 = 1;
                              break label2493;
                           }

                           if(var_2780 < var_10f1) {
                              break label2494;
                           }
                        } else {
                           if(var_105e != 4) {
                              break label2494;
                           }

                           if(var_1ed8 >= var_10b0) {
                              var48 = 0;
                              break label2493;
                           }

                           if(var_1ed8 >= var_10cd) {
                              var48 = 1;
                              break label2493;
                           }

                           if(var_1ed8 < var_10f1) {
                              break label2494;
                           }
                        }

                        var48 = 2;
                     }

                     var36 = var48;
                  }

                  Class_9b.var_e52.sub_410(var_3ec, 8 + (2 - var36), 0, 120, 163, 0);
               }

               var_3ec.setColor(0);

               for(var25 = 153; var25 < 168; var25 += 2) {
                  var_3ec.drawLine(0, var25, 240, var25);
               }

               sub_b8e(var_1150?43:(var_105e == 1?47:44), 0, 120, 160, 3);
               if(var_44e8.var_341 == 0) {
                  if(var_105e == 2) {
                     sub_b20(var_2780, 48, 0, 0, 120, 80, 3);
                  } else if(var_105e == 3) {
                     byte var45 = 50;
                     if(var_1150) {
                        var45 = 49;
                     }

                     sub_bd5(sub_b56(Class_6b.sub_595(var45), 0, 220), 0, 120, 80, 3);
                     if(var_1150 && var_4a02 % 4 < 2) {
                        sub_b20(var_1ed8, 83, 0, 0, 120, 105, 3);
                     }
                  }

                  if(var_200b == 0L) {
                     Class_6b.sub_6f5(var_1150?5:6, 0, 1);
                  }

                  if(!Class_6b.sub_836(0) && var_200b > 20480L || var_200b > 40960L) {
                     Class_6b.sub_754(0);
                     if(var_1150) {
                        label2469: {
                           var36 = 0;
                           if(var_105e == 1) {
                              if(var_1150) {
                                 var_1ed8 += var_25c[var_1019[3]];
                                 var_120d[0] += var_25c[var_1019[3]];
                                 var10000 = 2 - var_1019[3];
                              } else {
                                 var10000 = 3;
                              }
                           } else {
                              label2467: {
                                 if(var_105e == 2) {
                                    var36 = 3;
                                    if(var_2780 >= var_10b0) {
                                       var_1ed8 += 10000;
                                       var_120d[0] += 10000;
                                       var10000 = 0;
                                       break label2467;
                                    }

                                    if(var_2780 >= var_10cd) {
                                       var_1ed8 += 5000;
                                       var_120d[0] += 5000;
                                       var10000 = 1;
                                       break label2467;
                                    }

                                    if(var_2780 < var_10f1) {
                                       break label2469;
                                    }

                                    var_1ed8 += 2500;
                                    var_120d[0] += 2500;
                                 } else {
                                    if(var_105e == 0) {
                                       if(var_4761 < 3) {
                                          var_1ed8 += var_248[var_4761];
                                          var_120d[0] += var_248[var_4761];
                                       }

                                       var10000 = var_4761;
                                       break label2467;
                                    }

                                    if(var_105e == 3) {
                                       if(var_1150) {
                                          var_1ed8 += 20000;
                                          var_120d[0] += 20000;
                                          var10000 = 0;
                                          break label2467;
                                       }

                                       if(Class_9b.var_e14[0][0] <= Class_9b.var_e14[0][1]) {
                                          var10000 = 1;
                                          break label2467;
                                       }

                                       if(Class_9b.var_e14[0][0] >= Class_9b.var_e14[0][1] / 2) {
                                          var10000 = 3;
                                          break label2467;
                                       }
                                    } else {
                                       if(var_105e != 4) {
                                          break label2469;
                                       }

                                       var36 = 3;
                                       if(var_1ed8 >= var_10b0) {
                                          var10000 = 0;
                                          break label2467;
                                       }

                                       if(var_1ed8 >= var_10cd) {
                                          var10000 = 1;
                                          break label2467;
                                       }

                                       if(var_1ed8 < var_10f1) {
                                          break label2469;
                                       }
                                    }
                                 }

                                 var10000 = 2;
                              }
                           }

                           var36 = var10000;
                        }

                        var_1cda += var_1ed8;
                        var_120d[16] = var_1ed8;
                        if(var_1cda > 99999999) {
                           var_1cda = 99999999;
                        }

                        byte var52;
                        if(var_13aa) {
                           var10000 = var_13e0 * 4;
                           var52 = 0;
                        } else {
                           var10000 = var_1019[1] * 4;
                           var52 = var_1019[2];
                        }

                        var25 = var10000 + var52;
                        if(var_1d1d[var25] < var_1ed8) {
                           var_1d1d[var25] = var_1ed8;
                        }

                        if(var36 <= 2) {
                           if(var_13aa) {
                              var10000 = var_13e0 * 4;
                              var52 = 0;
                           } else {
                              var10000 = var_1019[1] * 4;
                              var52 = var_1019[2];
                           }

                           var25 = var10000 + var52;
                           if(var_1d55[var25] == 0 || var_1d55[var25] > var36 + 1) {
                              var_1d55[var25] = (byte)(var36 + 1);
                           }
                        }

                        var48 = 34;
                     } else {
                        var48 = 38;
                     }
                     break label2852;
                  }

                  var_200b += (long)var_837;
               }
            }

            var_75a = false;
            if((var_586 & 7) == 0) {
               return;
            }

            return;
         case 41:
            sub_133f();
            sub_17dc();
            sub_148d();
            var_486c -= var_837;
            if(var_486c <= 0) {
               var_46b[5] = 0;
               var_1ea4 = 0;
               Class_9b.sub_195();
               Class_9b.sub_2b2();
               var_46d6.var_48 = false;
               var_4832 = false;
               var_27d5 = 0;
               var_2659 = 819;
               sub_2a7(44, 40);
               if(var_1019[4] == 1) {
                  var10000 = var_1ed8;
                  var49 = 4;
               } else {
                  var10000 = var_1ed8;
                  var49 = 2;
               }

               var25 = var10000 / var49;
               var_1ed8 -= var25;
               var_120d[14] -= var25;
               ++var_120d[15];
               return;
            }

            return;
         case 42:
            Graphics var9 = var_3ec;
            var_3ec.setColor(16777215);
            sub_142e(0, 0, 240, 320);
            sub_a6c(0, 0, 240, 320);
            var_3ec = var_22fb.getGraphics();
            var_3ec.translate(-(120 - var_22fb.getWidth() / 2), -(290 - var_22fb.getHeight()));
            sub_17dc();
            var_3ec.translate(120 - var_22fb.getWidth() / 2, 290 - var_22fb.getHeight());
            sub_b20(sub_2455(var_44e8.var_341), var_1c3d?84:85, 0, 0, 0, 0, 20);
            var_3ec = var9;
            var_2358 = true;
            var_22a5 = false;
            var48 = 40;
            break label2852;
         case 43:
            if(var_47e4 >= 3) {
               var_47af += var_837;
            }

            var10 = true;
            if(Class_9b.var_cca > 0) {
               var10000 = Class_9b.var_cca - var_837;
            } else {
               var10 = false;
               var10000 = 0;
            }

            Class_9b.var_cca = var10000;
            var_44e8.sub_b98(var_837, 10240, 6, var10);
            byte var22 = -1;
            switch(var_47e4) {
            case 0:
               ++var_47e4;
               var_2161 = 1024;
               break;
            case 1:
               if(Class_6b.sub_836(0)) {
                  Class_6b.sub_754(0);
               }

               Class_6b.sub_6f5(2 + var_1019[5], 0, 0);
               ++var_47e4;
               break;
            case 2:
               ++var_47e4;
               var_47af = 0;
               break;
            case 3:
               var_2aa8 = 420;
               if((var36 = (var_47af << 12) / 6144) > 4096) {
                  var36 = 4096;
               }

               var36 = (var36 = 4096 - var36) * var36 >> 12;
               var_2aa8 += 800 * var36 >> 12;
               if(var_2aa8 < 420) {
                  var_2aa8 = 420;
               }

               var_44e8.var_2f5 = 0;
               if(var_47af > 6144) {
                  var_47af = 0;
                  ++var_47e4;
               }
               break;
            case 4:
               var_2aa8 = 420;
               if(var_47af > 2457) {
                  var_47af = 0;
                  ++var_47e4;
               }
               break;
            case 5:
               var_2aa8 = 420;
               var22 = 9;
               if(var_47af <= 2457) {
                  break;
               }

               var_47af = 0;
               ++var_47e4;
            case 6:
               var_2aa8 = 420;
               var22 = 8;
               if(var_47af <= 2457) {
                  break;
               }

               var_47af = 0;
               ++var_47e4;
            case 7:
               var_44e8.var_2f5 = 1;
               var22 = 7;
               if(var_47af > 2457) {
                  var_47af = 0;
                  ++var_47e4;
                  var22 = -1;
               }
               break;
            case 8:
               var22 = -1;
               var_44e8.var_341 = 0;
               if((var36 = (var_221f - 1024 << 12) / 512) >= 2048 && var36 <= 4096) {
                  var_1f1f = 4096;
                  var_2017 |= 524288;
               }

               Class_9b.sub_b6a();
               sub_283(40);
               var_2017 |= 262144;
            }

            sub_17dc();
            sub_148d();
            sub_13f5();
            if(var_1019[4] >= 0) {
               label1933: {
                  Graphics var10001;
                  int var10003;
                  if(var_47e4 == 7) {
                     var24 = var_47af * 70 / 2457;
                     var46 = var_29c0;
                     var10001 = var_3ec;
                     var10002 = 0;
                     var10003 = 0 - var24;
                  } else {
                     if(var_47e4 >= 7) {
                        break label1933;
                     }

                     var46 = var_29c0;
                     var10001 = var_3ec;
                     var10002 = 0;
                     var10003 = 0;
                  }

                  var46.sub_429(var10001, var10002, var10003, 220, 0);
               }

               if(var_47e4 <= 4) {
                  sub_b8e(0, 0, 120, 121, 17);
               }
            }

            if(var22 != -1) {
               var28 = var_47af > 1638?((var28 = 2457 - var_47af) << 8) / 819:255;
               sub_a2a(var22, Math.min(Math.max(var28, 1), 255));
               var27 = var_47af < 1638?341 + var_47af * 3755 / 1638:4096;
               sub_a18(var22, var27, 120, 160, 0);
            }

            sub_b8e(var_272[var_105e][1], 0, 120, 67, 3);
            if(var_105e == 4) {
               sub_b8e(41, 0, 120, 87, 3);
               sub_b20(var_10b0, 83, 0, 0, 120, 101, 3);
            } else if(var_105e == 2) {
               sub_b8e(42, 0, 120, 87, 3);
               sub_b20(var_10b0, -1, 0, 0, 120, 101, 3);
            }

            short var50;
            if(var_46b[5] <= 0 && var_46b[1] <= 0) {
               var10000 = var_2161;
               var47 = Math.min(Math.max(var_837 * 3, 0), 4096);
               var50 = 1024;
            } else {
               if(var_46b[5] == 1 || var_46b[1] == 1) {
                  Class_9b.var_cca = 3276;
               }

               var_44e8.sub_ac6(var_837);
               var10000 = var_2161;
               var47 = Math.min(Math.max(var_837 * 3, 0), 4096);
               var50 = 1792;
            }

            var_2161 = var10000 + (var47 * (var50 - var_2161) >> 12);
            if(var_47e4 < 8 && var_2161 >= 1536) {
               var_2017 |= 131072;
               return;
            }

            var_2017 |= 262144;
            return;
         case 44:
            var_3ec.setColor(0);
            sub_142e(0, 0, 240, 320);
            var_3ec.fillRect(0, 0, 240, 320);
            var_2659 -= var_837;
            if(var_2659 < 0) {
               var_44e8.sub_994(var_44e8.var_70e, var_44e8.var_532, var_44e8.var_63f, 0);

               while((var_3b22[var_44e8.var_532] & '\uf000') == '\u8000') {
                  var_44e8.sub_df2(1024);
               }

               var_2bd6 = var_44e8.var_5d4;
               var_44e8.var_9f4 = false;
               var_44e8.var_a60 = false;
               var_44e8.var_a22 = 0;
               Class_9b.var_1139 = 0;
               Class_9b.var_da7 = -1;
               Class_9b.sub_60e();
               if(var_467f.var_48) {
                  var_467f.sub_994(var_44e8.var_70e, var_44e8.var_532, var_44e8.var_63f, 6144);
                  var_467f.var_341 = 0;
                  var_467f.var_5d4 = 0;
                  var_467f.var_84 = 0;
                  var_467f.sub_74b();
               }

               if(var_105e == 1 && var_44e8.var_70e < 2) {
                  var_48ad += 30;
                  sub_d62(15);
               }

               var_4503.var_48 = false;
               var_459c = 16384;
               sub_1fa();
               sub_2b8();
               return;
            }

            return;
         default:
            return;
         }

         var48 = 0;
      }

      sub_283(var48);
   }

   private static void sub_2313() {
      Class_6b.sub_6dc(0, var_1c6a?100:0);
   }

   private static void sub_2350() {
      var_467f.var_48 = true;
      var_467f.sub_67b(var_44e8, var_48ad << 10);
      var_467f.var_84 = 2;
      var_467f.var_341 = var_44e8.var_341;
      var_4543 = false;
   }

   private static int sub_235e(int var0) {
      int var1;
      for(var1 = 0; var1 < var_226.length - 1 && var0 > var_226[var1 + 1]; ++var1) {
         ;
      }

      return var1;
   }

   static void sub_238a(Image var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      var0.getRGB(var1, 0, var6, var4, var5, var6, var7);
      int var10;
      int var11;
      if((var10 = (var11 = var3 - var6) * var7 + var2) != 0) {
         for(int var9 = var7 - 1; var9 >= 0; --var9) {
            var10 -= var11;
            int var12 = var9 * var6;

            for(int var8 = 0; var8 < var6; ++var8) {
               var1[var12 + var10 + var8] = var1[var12 + var8];
               var1[var12 + var8] = 0;
            }
         }

      }
   }

   private static void sub_239b() {
      for(int var0 = 0; var0 < 5; ++var0) {
         var_495d[var0][0] = Class_6b.sub_496(0, 2048);
         var_495d[var0][1] = Class_6b.sub_496(0, 50);
      }

   }

   private static void sub_23fd(Image var0, int var1) {
      Graphics var2 = var0.getGraphics();
      int var3 = var_23c4.length / var0.getWidth();
      int var5 = var0.getWidth();
      int var6 = var0.getHeight();
      int var7 = 0;
      int var10000 = 0;

      while(true) {
         int var9 = var10000;
         if(var10000 >= var6) {
            return;
         }

         if((var7 += var3) > var6) {
            var7 = var6;
         }

         sub_238a(var0, var_23c4, 0, var5, 0, var9, var5, var7 - var9);

         for(int var10 = 0; var10 < (var7 - var9) * var5; ++var10) {
            int var4 = ((var_23c4[var10] & 255) + (var_23c4[var10] >> 8 & 255) + (var_23c4[var10] >> 16 & 255)) / 3 * var1 >> 12;
            var_23c4[var10] = var4 + (var4 << 8) + (var4 << 16);
         }

         var2.drawRGB(var_23c4, 0, var5, 0, var9, var5, var7 - var9, false);
         var10000 = var7;
      }
   }

   private static void sub_2407(Image var0, int var1, int var2, int var3) {
      Graphics var4 = var0.getGraphics();
      int var5 = var_23c4.length / var0.getWidth();
      int var9 = var0.getWidth();
      int var10 = var0.getHeight();
      int var11 = 0;
      int var10000 = 0;

      while(true) {
         int var13 = var10000;
         if(var10000 >= var10) {
            return;
         }

         if((var11 += var5) > var10) {
            var11 = var10;
         }

         sub_238a(var0, var_23c4, 0, var9, 0, var13, var9, var11 - var13);

         for(int var14 = 0; var14 < (var11 - var13) * var9; ++var14) {
            int var6 = var_23c4[var14] >> 16 & 255;
            int var7 = var_23c4[var14] >> 8 & 255;
            int var8 = var_23c4[var14] >> 0 & 255;
            var_23c4[var14] = var6 * var1 >> 12 << 16 | var7 * var2 >> 12 << 8 | var8 * var3 >> 12 << 0;
         }

         var4.drawRGB(var_23c4, 0, var9, 0, var13, var9, var11 - var13, false);
         var10000 = var11;
      }
   }

   private static int sub_2455(int var0) {
      if(var0 == 0) {
         return 0;
      } else {
         int var10000;
         short var10001;
         if(var_1c3d) {
            var10000 = var0 * 36;
            var10001 = 10;
         } else {
            var10000 = var0 * 2237;
            var10001 = 1000;
         }

         return var10000 / var10001 >> 12;
      }
   }

}
