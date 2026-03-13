import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Random;
import javax.microedition.lcdui.Image;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.control.VolumeControl;

final class Class_6b {

   private static byte[] var_14;
   private static InputStream var_75;
   private static String var_8a;
   private static int var_db;
   private static int var_12e;
   private static int var_15a;
   private static int[] var_178;
   private static int[] var_197;
   private static int var_1c7;
   private static int[] var_228;
   private static int var_238;
   static int var_28f;
   static final String[] var_2d8 = new String[]{"unknown", "audio/x-wav", "audio/midi", "audio/mpeg", "ott", "audio/amr", "application/x-smaf", "audio/basic", "audio/x-vorbis", "audio/3gpp", "audio/amr-wb", "audio/amr-wb+", "audio/x-gsm", "audio/x-gsmefr", "audio/qcelp", "audio/spmidi", "audio/x-realaudio", "audio/x-aiff", "audio/x-ms-wma"};
   static Random var_33b;
   static short[] var_361;
   static int[] var_3bc;
   static int[] var_407;
   static int var_42a;
   private static byte[][] var_455;
   static int var_462;
   static int var_4b9;
   static byte[][] var_4c6;
   static int[] var_4ff;
   static boolean var_543 = false;
   static Player[] var_588;
   static int[] var_5ae;
   static int[] var_607;
   static int[] var_61f;
   static int[] var_663;
   static int[] var_677;
   static int var_688 = -1;


   private static void sub_49(String var0) {
      try {
         System.out.println(var0);
      } catch (Exception var2) {
         System.out.println("exception during dbg : " + var2);
      }
   }

   private static void sub_7d(boolean var0, String var1) {
      if(var0) {
         sub_49(var1);
         throw new Exception(var1);
      }
   }

   static boolean sub_cf(String var0) {
      Object var2 = null;
      if(var0 == var_8a && var_12e == 0) {
         return true;
      } else {
         if(var_75 != null) {
            var_75.close();
            var_75 = null;
            System.gc();
         }

         var_8a = var0;
         var_75 = var_8a.getClass().getResourceAsStream(var0);
         var_238 = 0;
         var_db = sub_376();
         var_1c7 = 4;
         var_15a = sub_2c6();
         ++var_1c7;
         int[] var3 = new int[var_15a];

         int var1;
         for(var1 = 0; var1 < var_15a; ++var1) {
            var3[var1] = sub_376();
            var_1c7 += 4;
         }

         if(var_178 != null) {
            var_178 = null;
         }

         var_178 = new int[var_db];
         if(var_228 != null) {
            var_228 = null;
         }

         var_228 = new int[var_db];
         if(var_197 != null) {
            var_197 = null;
         }

         var_197 = new int[var_db];
         var_178[0] = 0;
         var_197[0] = 0;

         for(var1 = 1; var1 < var_db; ++var1) {
            var_178[var1] = sub_376();
            var_1c7 += 4;
            if(var_15a > 1) {
               var_197[var1] = sub_2c6();
               ++var_1c7;
            } else {
               var_197[var1] = 0;
            }

            int[] var10000;
            int var10001;
            int[] var10002;
            int var10003;
            if(var_197[var1] == var_197[var1 - 1]) {
               var10000 = var_228;
               var10001 = var1 - 1;
               var10002 = var_178;
               var10003 = var1;
            } else {
               var10000 = var_228;
               var10001 = var1 - 1;
               var10002 = var3;
               var10003 = var_197[var1 - 1];
            }

            var10000[var10001] = var10002[var10003] - var_178[var1 - 1] - 1;
         }

         var_228[var1 - 1] = var3[var_197[var1 - 1]] - var_178[var1 - 1] - 1;
         var_12e = 0;
         var_238 = 0;
         System.gc();
         return true;
      }
   }

   private static void sub_132(int var0) {
      if(var_12e != var0) {
         if(var_75 != null) {
            var_75.close();
            var_75 = null;
            System.gc();
         }

         String var1 = var_8a;
         if(var0 > 0) {
            var1 = var1 + Integer.toString(var0);
         }

         var_75 = var_8a.getClass().getResourceAsStream(var1);
         if(var0 == 0) {
            sub_1a9(var_1c7);
         }

         var_238 = 0;
         var_12e = var0;
      }
   }

   static void sub_16c(int var0) {
      if(var_12e != var_197[var0]) {
         sub_132(var_197[var0]);
      }

      int var1 = var_178[var0];
      if(var_238 > var1) {
         var_12e = -1;
         sub_132(var_197[var0]);
      } else {
         var1 -= var_238;
      }

      sub_1a9(var1);
      var_28f = sub_21d();
   }

   static void sub_1a9(int var0) {
      if(var0 != 0) {
         if(var_14 == null) {
            var_14 = new byte[256];
         }

         while(var0 > 256) {
            var_75.read(var_14, 0, 256);
            var_238 += 256;
            var0 -= 256;
         }

         if(var0 > 0) {
            var_75.read(var_14, 0, var0);
            var_238 += var0;
         }

      }
   }

   static void sub_1cc() {
      if(var_8a != null) {
         if(var_75 != null) {
            var_75.close();
            var_75 = null;
         }

         var_238 = -1;
         var_8a = null;
         System.gc();
      }

   }

   private static int sub_21d() {
      int var0;
      if((var0 = var_75.read()) >= 0) {
         ++var_238;
      }

      return var0;
   }

   private static int sub_228(byte[] var0) {
      int var1 = var_75.read(var0);
      var_238 += var1;
      return var1;
   }

   static int sub_248(byte[] var0, int var1, int var2) {
      if(var2 == 0) {
         return 0;
      } else {
         int var3 = var_75.read(var0, var1, var2);
         var_238 += var3;
         return var3;
      }
   }

   static byte[] sub_27d(int var0) {
      boolean var1 = false;
      if(var0 >= 0 && var0 < var_db) {
         Object var2 = null;
         sub_16c(var0);
         byte[] var4 = new byte[var_228[var0]];
         int var3 = var_75.read(var4);
         var_238 += var3;
         return var4;
      } else {
         return null;
      }
   }

   static int sub_2c6() {
      return sub_21d() & 255;
   }

   static int sub_2f0() {
      return sub_354();
   }

   private static int sub_354() {
      return sub_21d() & 255 | (sub_21d() & 255) << 8;
   }

   private static int sub_376() {
      return sub_392();
   }

   private static int sub_392() {
      return sub_21d() & 255 | (sub_21d() & 255) << 8 | (sub_21d() & 255) << 16 | (sub_21d() & 255) << 24;
   }

   static Image sub_3f0(int var0) {
      byte[] var2;
      Image var1 = Image.createImage(var2 = sub_27d(var0), 0, var2.length);
      System.gc();
      return var1;
   }

   static void sub_44b(int var0, int var1, int var2) {
      int var3;
      if(var0 >= 0) {
         sub_16c(var0);
         if(var_361 != null) {
            var_361 = null;
         }

         var_361 = new short[2048];

         for(var3 = 0; var3 < 2048; ++var3) {
            var_361[var3] = (short)(sub_21d() & 255 | (sub_21d() & 255) << 8);
         }
      }

      if(var1 >= 0) {
         sub_16c(var1);
         if(var_3bc != null) {
            var_3bc = null;
         }

         var_3bc = new int[256];

         for(var3 = 0; var3 < 256; ++var3) {
            var_3bc[var3] = sub_376();
         }
      }

      if(var2 >= 0) {
         sub_16c(var2);
         if(var_407 != null) {
            var_407 = null;
         }

         var_407 = new int[256];

         for(var3 = 0; var3 < 256; ++var3) {
            var_407[var3] = sub_376();
         }
      }

      var_33b = new Random(System.currentTimeMillis());
   }

   static int sub_473(int var0, int var1) {
      return 12 > var1?var0 << 12 - var1:(12 < var1?var0 >> var1 - 12:var0);
   }

   static int sub_496(int var0, int var1) {
      if(var1 != var0) {
         int var2;
         if((var2 = var_33b.nextInt()) < 0) {
            var2 *= -1;
         }

         return var0 + var2 % (var1 - var0);
      } else {
         return var1;
      }
   }

   static String sub_4cb() {
      String var0 = null;

      try {
         var0 = System.getProperty("microedition.locale");
      } catch (Exception var1) {
         ;
      }

      return var0 == null?"EN":var0;
   }

   static void sub_4ee(int var0) {
      sub_55c();
      var_42a = 0;
      var_455 = (byte[][])null;
      sub_16c(var0);
      if(var_455 != null) {
         var_455 = (byte[][])null;
      }

      var_455 = new byte[30][];

      for(int var1 = 0; var1 < 30; ++var1) {
         int var3 = sub_2c6();
         if(var_455[var1] != null) {
            var_455[var1] = null;
         }

         var_455[var1] = new byte[var3];
         sub_248(var_455[var1], 0, var3);
      }

   }

   static void sub_537(int var0, int var1) {
      Object var5 = null;
      sub_55c();
      sub_16c(var0);
      var_42a = 0;
      var_455 = (byte[][])null;
      var_42a = sub_2f0();
      int[] var7 = new int[var_42a + 1];
      sub_1a9(var1 * var_42a * 2);

      int var6;
      for(var6 = 0; var6 < var_42a; ++var6) {
         var7[var6] = sub_2f0();
      }

      sub_1a9((6 - var1 - 1) * var_42a * 2);
      if(var_455 != null) {
         var_455 = (byte[][])null;
      }

      var_455 = new byte[var_42a][];
      int var4 = 0;

      for(var6 = 0; var6 < var_42a; ++var6) {
         sub_1a9(var7[var6] - var4);
         int var3 = sub_2c6();
         if(var_455[var6] != null) {
            var_455[var6] = null;
         }

         var_455[var6] = new byte[var3];
         sub_228(var_455[var6]);
         var4 = var7[var6] + var3 + 1;
      }

   }

   static void sub_55c() {
      var_42a = 0;
      var_455 = (byte[][])null;
   }

   static byte[] sub_595(int var0) {
      return var_455[var0];
   }

   static void sub_5c8(int var0, int var1) {
      if(var_588 != null) {
         var_588 = null;
      }

      var_588 = new Player[1];
      if(var_5ae != null) {
         var_5ae = null;
      }

      var_5ae = new int[1];
      if(var_607 != null) {
         var_607 = null;
      }

      var_607 = new int[1];
      if(var_61f != null) {
         var_61f = null;
      }

      var_61f = new int[1];
      if(var_663 != null) {
         var_663 = null;
      }

      var_663 = new int[1];
      if(var_677 != null) {
         var_677 = null;
      }

      var_677 = new int[1];

      for(int var2 = 0; var2 < 1; ++var2) {
         var_61f[var2] = 0;
         var_677[var2] = 0;
         var_663[var2] = 20;
         var_5ae[var2] = -1;
      }

      var_4b9 = var0;
      if(var_4c6 != null) {
         var_4c6 = (byte[][])null;
      }

      var_4c6 = new byte[var_4b9][];
      if(var_4ff != null) {
         var_4ff = null;
      }

      var_4ff = new int[var_4b9];
      var_462 = var1;
      var_688 = -1;
   }

   static void sub_617(int var0) {
      if(var_5ae != null) {
         if(var0 >= 0) {
            var_4c6[var0] = sub_27d(var0);
            var_4ff[var0] = var_28f;
         }
      }
   }

   static void sub_657(int var0) {
      if(var_5ae != null) {
         if(var0 >= 0) {
            var_4c6[var0] = null;
            var_4ff[var0] = 0;
            System.gc();
         }
      }
   }

   static void sub_690(int var0, int var1) {
      if(var_5ae != null) {
         if(!var_543) {
            sub_893(var1);
            if(sub_6c8(var1, var0)) {
               var_5ae[var1] = var0;
               var_61f[var1] = 2;
            }

         }
      }
   }

   private static boolean sub_6c8(int var0, int var1) {
      try {
         var_588[var0] = Manager.createPlayer(new ByteArrayInputStream(var_4c6[var1]), var_2d8[var_4ff[var1]]);
         if(var_588[var0] == null) {
            return false;
         } else {
            var_588[var0].realize();
            var_688 = var0;
            var_588[var0].prefetch();
            var_688 = -1;
            return true;
         }
      } catch (Exception var3) {
         var_688 = -1;

         try {
            if(var_588[var0] != null) {
               var_588[var0].close();
            }
         } catch (Exception var2) {
            ;
         }

         var_61f[var0] = 0;
         var_5ae[var0] = -1;
         var_588[var0] = null;
         System.gc();
         return false;
      }
   }

   static void sub_6dc(int var0, int var1) {
      if(var_5ae != null) {
         if(!var_543) {
            sub_7d(var1 < 0 || var1 > 100, "Bad volume value: " + var1);
            var_663[var0] = var1;
            if(var_61f[var0] == 3) {
               if(var_663[var0] == 0) {
                  sub_754(var0);
                  return;
               }

               ((VolumeControl)var_588[var0].getControl("VolumeControl")).setLevel(var_663[var0] * var_462 / 100);
            }

         }
      }
   }

   static boolean sub_6f5(int var0, int var1, int var2) {
      if(var_5ae == null) {
         return false;
      } else if(var_543) {
         return false;
      } else if(var_663[var1] == 0) {
         return true;
      } else {
         if(var_5ae[var1] != var0 || var_61f[var1] != 2 && var_61f[var1] != 3) {
            sub_690(var0, var1);
         }

         if(var_588[var1] == null) {
            return false;
         } else {
            try {
               var_677[var1] = var2;
               Player var10000;
               int var10001;
               if(var_677[var1] == 0) {
                  var10000 = var_588[var1];
                  var10001 = -1;
               } else {
                  var10000 = var_588[var1];
                  var10001 = var_677[var1];
               }

               var10000.setLoopCount(var10001);
               var_588[var1].start();
            } catch (Exception var3) {
               return false;
            }

            var_61f[var1] = 3;
            return true;
         }
      }
   }

   static void sub_754(int var0) {
      if(var_5ae != null) {
         if(!var_543) {
            if(var_588 != null && var_588[var0] != null) {
               var_61f[var0] = 2;
               sub_78f(var0);
            }
         }
      }
   }

   private static boolean sub_78f(int var0) {
      try {
         var_588[var0].stop();
         return true;
      } catch (Exception var1) {
         var_588[var0].close();
         var_588[var0] = null;
         var_61f[var0] = 0;
         var_5ae[var0] = -1;
         System.gc();
         return false;
      }
   }

   static void sub_7ef(int var0) {
      if(var_5ae != null) {
         if(!var_543) {
            if(var_588 != null && var_588[var0] != null) {
               if(sub_836(var0)) {
                  var_61f[var0] = 4;
                  sub_78f(var0);
               }
            }
         }
      }
   }

   static void sub_7fc(int var0) {
      if(var_5ae != null) {
         if(!var_543) {
            if(var_663[var0] != 0) {
               if(var_588 != null && var_588[var0] != null) {
                  if(var_61f[var0] == 4) {
                     Player var10000;
                     int var10001;
                     if(var_677[var0] == 0) {
                        var10000 = var_588[var0];
                        var10001 = -1;
                     } else {
                        var10000 = var_588[var0];
                        var10001 = var_677[var0];
                     }

                     var10000.setLoopCount(var10001);
                     var_588[var0].start();
                     var_61f[var0] = 3;
                  }
               }
            }
         }
      }
   }

   static boolean sub_836(int var0) {
      return var_5ae == null?false:(var_543?false:(var_588 != null && var_588[var0] != null?(var_61f[var0] != 3?false:var_588[var0].getState() == 400):false));
   }

   static void sub_893(int var0) {
      if(var_5ae != null) {
         if(!var_543) {
            var_61f[var0] = 0;
            if(var_588[var0] != null && sub_78f(var0)) {
               var_588[var0].deallocate();
               var_588[var0].close();
               var_588[var0] = null;
               var_5ae[var0] = -1;
               System.gc();
            }

         }
      }
   }

   static void sub_8a2() {
      if(var_5ae != null) {
         for(int var0 = 0; var0 < 1; ++var0) {
            sub_754(var0);
         }

      }
   }

}
