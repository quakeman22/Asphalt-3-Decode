import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

final class Class_22 {

   static int[] var_3f = new int[]{0, 2, 1, 3};
   static int[] var_a1;
   int var_f7;
   byte[] var_146;
   byte[] var_156;
   byte[] var_167;
   byte[] var_179;
   byte[] var_1d5;
   short[] var_1f1;
   byte[] var_1fb;
   byte[] var_232;
   short[] var_28a;
   byte[] var_2d3;
   int[][] var_2e9;
   int var_325;
   int var_373;
   boolean var_3d1;
   short var_3f8;
   byte[] var_42f;
   short[] var_478;
   Image[][] var_4c1;
   static int var_524;
   static int var_55a;
   static int var_583;
   static int[] var_5e3 = new int[50];
   static int[] var_630 = new int[50];
   static byte[] var_658 = new byte[50];
   byte[] var_6a3;
   short[] var_6f0;
   static int var_740 = -1;
   static int var_76d = -1;


   final void sub_5d(byte[] var1, int var2, int var3, int var4) {
      try {
         System.gc();
         ++var2;
         ++var2;
         boolean var5 = false;
         int var6 = (var1[var2++] & 255) + ((var1[var2++] & 255) << 8) + ((var1[var2++] & 255) << 16) + ((var1[var2++] & 255) << 24);
         this.var_f7 = (var1[var2++] & 255) + ((var1[var2++] & 255) << 8);
         if(var4 == -1) {
            var4 = this.var_f7 - 1;
         }

         int var7;
         if(this.var_f7 > 0) {
            if((var6 & 2) != 0) {
               this.var_146 = new byte[this.var_f7];
               this.var_156 = new byte[this.var_f7];
            }

            this.var_167 = new byte[this.var_f7];
            this.var_179 = new byte[this.var_f7];

            for(var7 = 0; var7 < this.var_f7; ++var7) {
               if((var6 & 2) != 0) {
                  this.var_146[var7] = var1[var2++];
                  this.var_156[var7] = var1[var2++];
               }

               this.var_167[var7] = var1[var2++];
               if(this.var_167[var7] == -1) {
                  var2 += 6;
               } else {
                  this.var_179[var7] = var1[var2++];
               }
            }
         }

         if((var7 = (var1[var2++] & 255) + ((var1[var2++] & 255) << 8)) > 0) {
            this.var_1fb = new byte[var7 << 2];
            System.arraycopy(var1, var2, this.var_1fb, 0, this.var_1fb.length);
            var2 += this.var_1fb.length;
         }

         int var8;
         int var9;
         if((var8 = (var1[var2++] & 255) + ((var1[var2++] & 255) << 8)) > 0) {
            this.var_1d5 = new byte[var8];
            this.var_1f1 = new short[var8];

            for(var9 = 0; var9 < var8; ++var9) {
               this.var_1d5[var9] = var1[var2++];
               ++var2;
               this.var_1f1[var9] = (short)((var1[var2++] & 255) + ((var1[var2++] & 255) << 8));
            }

            var2 += var8 << 2;
         }

         if((var9 = (var1[var2++] & 255) + ((var1[var2++] & 255) << 8)) > 0) {
            this.var_2d3 = new byte[var9 * 5];
            System.arraycopy(var1, var2, this.var_2d3, 0, this.var_2d3.length);
            var2 += this.var_2d3.length;
         }

         int var10;
         if((var10 = (var1[var2++] & 255) + ((var1[var2++] & 255) << 8)) > 0) {
            this.var_232 = new byte[var10];
            this.var_28a = new short[var10];

            for(int var11 = 0; var11 < var10; ++var11) {
               this.var_232[var11] = var1[var2++];
               ++var2;
               this.var_28a[var11] = (short)((var1[var2++] & 255) + ((var1[var2++] & 255) << 8));
            }
         }

         if(this.var_f7 <= 0) {
            System.gc();
         } else if((var6 & 16777216) != 0) {
            short var18 = (short)((var1[var2++] & 255) + ((var1[var2++] & 255) << 8));
            this.var_325 = var1[var2++] & 255;
            int var12;
            if((var12 = var1[var2++] & 255) == 0) {
               var12 = 256;
            }

            this.var_2e9 = new int[16][];

            int var13;
            int var14;
            int var15;
            int var16;
            for(var13 = 0; var13 < this.var_325; ++var13) {
               this.var_2e9[var13] = new int[var12];
               if(var18 == 21781) {
                  for(var14 = 0; var14 < var12; ++var14) {
                     var15 = (var1[var2++] & 255) + ((var1[var2++] & 255) << 8);
                     var16 = -16777216;
                     if((var15 & '\u8000') != '\u8000') {
                        var16 = 0;
                        this.var_3d1 = true;
                     }

                     this.var_2e9[var13][var14] = var16 | (var15 & 31744) << 9 | (var15 & 992) << 6 | (var15 & 31) << 3;
                  }
               }
            }

            this.var_3f8 = (short)((var1[var2++] & 255) + ((var1[var2++] & 255) << 8));
            if(this.var_f7 > 0) {
               this.var_478 = new short[this.var_f7];
               var13 = 0;
               var14 = var2;

               for(var15 = 0; var15 < var3; this.var_478[var15++] = -1) {
                  var16 = (var1[var14] & 255) + ((var1[var14 + 1] & 255) << 8);
                  var14 += 2;
                  var14 += var16;
               }

               while(var15 <= var4) {
                  var16 = (var1[var14] & 255) + ((var1[var14 + 1] & 255) << 8);
                  var14 += 2;
                  this.var_478[var15++] = (short)var13;
                  var14 += var16;
                  var13 += var16;
               }

               while(var15 < this.var_f7) {
                  this.var_478[var15++] = -1;
               }

               this.var_42f = new byte[var13];

               for(var15 = 0; var15 < this.var_f7; ++var15) {
                  var16 = (var1[var2] & 255) + ((var1[var2 + 1] & 255) << 8);
                  var2 += 2;
                  if(this.var_478[var15] != -1) {
                     System.arraycopy(var1, var2, this.var_42f, this.var_478[var15] & '\uffff', var16);
                  }

                  var2 += var16;
               }
            }

            System.gc();
         }
      } catch (Exception var17) {
         ;
      }
   }

   final void sub_84(Image var1) {
      this.var_4c1 = new Image[1][this.var_f7];

      for(int var2 = 0; var2 < this.var_f7; ++var2) {
         Class_df.sub_238a(var1, var_a1, 0, this.var_167[var2], this.var_146[var2], this.var_156[var2], this.var_167[var2], this.var_179[var2]);
         this.var_4c1[0][var2] = Image.createRGBImage(var_a1, this.var_167[var2], this.var_179[var2], true);
      }

   }

   final void sub_a6(int var1, int var2, int var3, int var4) {
      if(this.var_f7 != 0) {
         if(var3 == -1) {
            var3 = this.var_f7 - 1;
         }

         if(this.var_4c1 == null) {
            this.var_4c1 = new Image[this.var_325][];
         }

         if(this.var_4c1[var1] == null) {
            this.var_4c1[var1] = new Image[this.var_f7];
         }

         int var5;
         if(var4 >= 0) {
            for(var5 = var2; var5 <= var3; ++var5) {
               this.var_4c1[var1][var5] = this.var_4c1[var4][var5];
            }
         } else {
            var5 = this.var_373;
            this.var_373 = var1;
            System.gc();

            for(int var6 = var2; var6 <= var3; ++var6) {
               if(this.var_167[var6] != -1) {
                  int var7 = this.var_167[var6] & 255;
                  int var8 = this.var_179[var6] & 255;
                  int[] var9;
                  if(var7 != 0 && var8 != 0 && (var9 = this.sub_4b8(var6, 0)) != null) {
                     boolean var10 = false;
                     int var11 = var7 * var8;

                     for(int var12 = 0; var12 < var11; ++var12) {
                        if((var9[var12] & -16777216) != -16777216) {
                           var10 = true;
                           break;
                        }
                     }

                     this.var_4c1[var1][var6] = Image.createRGBImage(var9, var7, var8, var10);
                  }
               }
            }

            System.gc();
            this.var_373 = var5;
         }

         System.gc();
      }
   }

   final void sub_c7() {
      this.var_2e9 = (int[][])null;
      this.var_42f = null;
      this.var_478 = null;
      System.gc();
   }

   final int sub_105(int var1) {
      return this.var_232[var1] & 255;
   }

   final int sub_12b(int var1) {
      return this.var_1d5[var1] & 255;
   }

   final int sub_180(int var1, int var2) {
      int var3 = this.var_1f1[var1] + var2 << 2;
      return this.var_1fb[var3];
   }

   final int sub_1e1(int var1, int var2) {
      int var3 = this.var_1f1[var1] + var2 << 2;
      return this.var_1fb[var3 + 1];
   }

   final int sub_21c(int var1, int var2) {
      int var3 = this.var_1f1[var1] + var2 << 2;
      return this.var_1fb[var3 + 2];
   }

   final int sub_258(int var1, int var2) {
      int var3 = this.var_1f1[var1] + var2 << 2;
      return this.var_1fb[var3 + 3];
   }

   final int sub_270(int var1, int var2) {
      int var3 = this.var_1f1[var1] + var2 << 2;
      int var4 = this.var_1fb[var3] & 255;
      return this.var_167[var4] & 255;
   }

   final int sub_2be(int var1, int var2) {
      int var3 = this.var_1f1[var1] + var2 << 2;
      int var4 = this.var_1fb[var3] & 255;
      return this.var_179[var4] & 255;
   }

   final int sub_314(int var1, int var2) {
      int var3 = (this.var_28a[var1] + var2) * 5;
      return this.var_2d3[var3] & 255;
   }

   private void sub_332(int[] var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = (this.var_28a[var2] + var3) * 5;
      int var8 = this.var_2d3[var7] & 255;
      if((var6 & 32) != 0) {
         var4 = (var6 & 1) != 0?var4 + this.var_2d3[var7 + 2]:var4 - this.var_2d3[var7 + 2];
         var5 = (var6 & 2) != 0?var5 + this.var_2d3[var7 + 3]:var5 - this.var_2d3[var7 + 3];
      }

      this.sub_35d(var1, var8, var4, var5, var6 ^ this.var_2d3[var7 + 4] & 15);
   }

   final void sub_35d(int[] var1, int var2, int var3, int var4, int var5) {
      this.sub_3b8(var1, var2, 0);
      int var6 = this.var_1d5[var2] & 255;
      int var7 = var1[0];
      int var8 = var1[1];
      int var9 = var1[2] - var1[0];
      int var10 = var1[3] - var1[1];

      for(int var11 = 1; var11 < var6; ++var11) {
         this.sub_3b8(var1, var2, var11);
         if(var1[0] < var7) {
            var9 += var7 - var1[0];
            var7 = var1[0];
         }

         if(var1[1] < var8) {
            var10 += var8 - var1[1];
            var8 = var1[1];
         }

         if(var1[2] > var7 + var9) {
            var9 = var1[2] - var7;
         }

         if(var1[3] > var8 + var10) {
            var10 = var1[3] - var8;
         }
      }

      var3 = (var5 & 1) != 0?var3 - (var7 + var9):var3 + var7;
      var4 = (var5 & 2) != 0?var4 - (var8 + var10):var4 + var8;
      var1[0] = var3;
      var1[1] = var4;
      var1[2] = var1[0] + var9;
      var1[3] = var1[1] + var10;
   }

   private void sub_3b8(int[] var1, int var2, int var3) {
      var1[0] = this.sub_1e1(var2, var3);
      var1[1] = this.sub_21c(var2, var3);
      var1[2] = var1[0] + this.sub_270(var2, var3);
      var1[3] = var1[1] + this.sub_2be(var2, var3);
   }

   final void sub_410(Graphics var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = (this.var_28a[var2] + var3) * 5;
      int var8 = this.var_2d3[var7] & 255;
      var4 = (var6 & 1) != 0?var4 - this.var_2d3[var7 + 2]:var4 + this.var_2d3[var7 + 2];
      var5 = (var6 & 2) != 0?var5 - this.var_2d3[var7 + 3]:var5 + this.var_2d3[var7 + 3];
      this.sub_429(var1, var8, var4, var5, var6 ^ this.var_2d3[var7 + 4] & 15);
   }

   final void sub_429(Graphics var1, int var2, int var3, int var4, int var5) {
      int var6 = this.var_1d5[var2] & 255;

      for(int var7 = 0; var7 < var6; ++var7) {
         this.sub_47f(var1, var2, var7, var3, var4, var5);
      }

   }

   private void sub_47f(Graphics var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = this.var_1f1[var2] + var3 << 2;
      int var8 = this.var_1fb[var7 + 3] & 255;
      int var9 = this.var_1fb[var7] & 255;
      var4 = (var6 & 1) != 0?var4 - ((this.var_167[var9] & 255) + this.var_1fb[var7 + 1]):var4 + this.var_1fb[var7 + 1];
      var5 = (var6 & 2) != 0?var5 - ((this.var_179[var9] & 255) + this.var_1fb[var7 + 2]):var5 + this.var_1fb[var7 + 2];
      this.sub_4a2(var1, var9, var4, var5, var6 ^ var8 & 15);
   }

   final void sub_4a2(Graphics var1, int var2, int var3, int var4, int var5) {
      int var6 = this.var_167[var2] & 255;
      int var7 = this.var_179[var2] & 255;
      if(var6 != 255) {
         Image var8 = null;
         if(this.var_4c1 != null && this.var_4c1[this.var_373] != null) {
            var8 = this.var_4c1[this.var_373][var2];
         }

         if(var8 == null) {
            int[] var9;
            if((var9 = this.sub_4b8(var2, 0)) != null) {
               sub_4d4(var1, var9, var3, var4, var6, var7, var5, this.var_3d1);
            }
         } else {
            var1.drawRegion(var8, 0, 0, var6, var7, var_3f[var5], var3, var4, 0);
         }
      }
   }

   final int[] sub_4b8(int var1, int var2) {
      if(this.var_42f != null && this.var_478 != null) {
         int var3 = this.var_167[var1] & 255;
         int var4 = this.var_179[var1] & 255;
         int[] var5 = var_a1;
         int[] var6;
         if((var6 = this.var_2e9[this.var_373]) == null) {
            return null;
         } else {
            byte[] var7 = this.var_42f;
            int var8 = this.var_478[var1] & '\uffff';
            int var9 = var2;
            int var10 = var2 + var3 * var4;
            if(this.var_3f8 == 10225) {
               while(var9 < var10) {
                  int var11;
                  if((var11 = var7[var8++] & 255) > 127) {
                     int var12 = var7[var8++] & 255;
                     int var13 = var6[var12];

                     for(var11 -= 128; var11-- > 0; var5[var9++] = var13) {
                        ;
                     }
                  } else {
                     var5[var9++] = var6[var11];
                  }
               }
            } else if(this.var_3f8 == 5632) {
               while(var9 < var10) {
                  var5[var9++] = var6[var7[var8] >> 4 & 15];
                  var5[var9++] = var6[var7[var8] & 15];
                  ++var8;
               }
            } else if(this.var_3f8 == 1024) {
               while(var9 < var10) {
                  var5[var9++] = var6[var7[var8] >> 6 & 3];
                  var5[var9++] = var6[var7[var8] >> 4 & 3];
                  var5[var9++] = var6[var7[var8] >> 2 & 3];
                  var5[var9++] = var6[var7[var8] & 3];
                  ++var8;
               }
            } else if(this.var_3f8 == 512) {
               while(var9 < var10) {
                  var5[var9++] = var6[var7[var8] >> 7 & 1];
                  var5[var9++] = var6[var7[var8] >> 6 & 1];
                  var5[var9++] = var6[var7[var8] >> 5 & 1];
                  var5[var9++] = var6[var7[var8] >> 4 & 1];
                  var5[var9++] = var6[var7[var8] >> 3 & 1];
                  var5[var9++] = var6[var7[var8] >> 2 & 1];
                  var5[var9++] = var6[var7[var8] >> 1 & 1];
                  var5[var9++] = var6[var7[var8] & 1];
                  ++var8;
               }
            } else if(this.var_3f8 == 22018) {
               while(var9 < var10) {
                  var5[var9++] = var6[var7[var8++] & 255];
               }
            }

            return var5;
         }
      } else {
         return null;
      }
   }

   private static void sub_4d4(Graphics var0, int[] var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      int var9;
      int var10;
      int var11;
      if((var6 & 2) != 0) {
         boolean var8 = false;
         var9 = 0;
         var10 = var2 * var3;

         for(var11 = var5 / 2; var9 < var11; ++var9) {
            System.arraycopy(var1, 0, var1, var10, var4);
            System.arraycopy(var1, var10 - (var5 - var3 + 1) * var4 - 1, var1, 0, var4);
            System.arraycopy(var1, var10, var1, 0, var4);
         }
      }

      if((var6 & 1) != 0) {
         int var14 = 0;
         var9 = var4 - 1;
         int var13 = var4 / 2;

         for(int var12 = 0; var12 < var5; ++var12) {
            for(var11 = 0; var11 < var13; ++var11) {
               var10 = var1[var14];
               var1[var14] = var1[var9];
               var1[var9] = var10;
               ++var14;
               --var9;
            }

            var9 = (var14 += var4 - var13) + var4 - 1;
         }
      }

      var0.drawRGB(var1, 0, var4, var2, var3, var4, var5, var7);
   }

   final void sub_4f8(byte[] var1, int var2, int var3) {
      var_524 = 0;
      var_55a = 0;
      int var4 = 0;
      int[] var5 = new int[4];
      int var7 = 0;

      for(int var8 = var2; var8 < var3; ++var8) {
         int var10000;
         int var10001;
         int var6;
         if((var6 = var1[var8] & 255) > 32) {
            var6 = this.var_6a3[var6] & 255;
            var_5e3[var7] = var4;
            var_630[var7] = var_55a;
            var_658[var7] = (byte)var6;
            ++var7;
            this.sub_332(var5, 0, var6, 0, 0, 0);
            var10000 = var4;
            var10001 = var5[2] - var5[0] + this.var_6f0[0];
         } else {
            if(var6 != 32) {
               if(var6 == 10) {
                  if(var4 > var_524) {
                     var_524 = var4;
                  }

                  var4 = 0;
                  var_55a += this.var_6f0[1] + this.var_6f0[2];
               }
               continue;
            }

            var10000 = var4;
            var10001 = this.var_6f0[3];
         }

         var4 = var10000 + var10001;
      }

      if(var4 > var_524) {
         var_524 = var4;
      }

      if(var_524 > 0) {
         var_524 -= this.var_6f0[0];
      }

      var_55a += this.var_6f0[2];
      var_583 = var7;
   }

   final void sub_521(Graphics var1, byte[] var2, int var3, int var4, int var5) {
      int var10000;
      int var10001;
      label43: {
         int var6 = var_740 >= 0?var_740:0;
         int var7 = var_76d >= 0?var_76d:var2.length;
         this.sub_4f8(var2, var6, var7);
         if((var5 & 8) != 0) {
            var10000 = var3;
            var10001 = var_524;
         } else {
            if((var5 & 1) == 0) {
               break label43;
            }

            var10000 = var3;
            var10001 = var_524 >> 1;
         }

         var3 = var10000 - var10001;
      }

      label37: {
         if((var5 & 32) != 0) {
            var10000 = var4;
            var10001 = var_55a;
         } else {
            if((var5 & 2) == 0) {
               break label37;
            }

            var10000 = var4;
            var10001 = var_55a >> 1;
         }

         var4 = var10000 - var10001;
      }

      for(int var8 = 0; var8 < var_583; ++var8) {
         this.sub_410(var1, 0, var_658[var8] & 255, var3 + var_5e3[var8], var4 + var_630[var8], 0);
      }

   }

   final void sub_550(Graphics var1, byte[] var2, int var3, int var4, int var5) {
      int var6 = 0;
      int var7 = var2.length;
      int[] var8 = new int[100];

      for(int var9 = 0; var9 < var7; ++var9) {
         if(var2[var9] == 10) {
            var8[var6++] = var9;
         }
      }

      short var10;
      short var13;
      label33: {
         var8[var6++] = var7;
         var13 = this.var_6f0[2];
         var10 = this.var_6f0[1];
         int var11 = var13 * var6 + var10 * (var6 - 1);
         int var10000;
         int var10001;
         if((var5 & 32) != 0) {
            var10000 = var4;
            var10001 = var11;
         } else {
            if((var5 & 2) == 0) {
               break label33;
            }

            var10000 = var4;
            var10001 = var11 >> 1;
         }

         var4 = var10000 - var10001;
      }

      var5 = 16 | var5 & 13;

      for(int var12 = 0; var12 < var6; ++var12) {
         var_740 = var12 > 0?var8[var12 - 1] + 1:0;
         var_76d = var8[var12];
         this.sub_521(var1, var2, var3, var4 + var12 * (var13 + var10), var5);
      }

      var_740 = -1;
      var_76d = -1;
   }

}
