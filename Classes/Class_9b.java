import javax.microedition.lcdui.Graphics;

final class Class_9b {

   int var_c;
   boolean var_48;
   int var_84;
   int var_98;
   short[] var_d3;
   int var_126;
   int var_175;
   int var_1d2;
   int[] var_21b;
   int[] var_266;
   boolean var_2af;
   int var_2f5;
   int var_341;
   int var_376;
   int var_388;
   int var_3a9;
   int var_3e5;
   int var_442;
   int var_46f;
   int var_4a7;
   int var_532;
   int var_57c;
   int var_5d4;
   int var_5fa;
   int var_63f;
   int var_676;
   int var_68f;
   int var_6ce;
   int var_70e;
   int var_74c;
   int var_767;
   int var_7b7;
   int var_811;
   int var_82f;
   int var_856;
   int var_8ac;
   int var_8c4;
   boolean var_920;
   int var_96e;
   int var_9d1;
   boolean var_9f4;
   int var_a22;
   boolean var_a60;
   int var_a76;
   static byte[][] var_a93;
   static int var_aae;
   static int var_b12;
   static int var_b39;
   static int var_b9b;
   static int var_bd5;
   static int var_be1;
   static int var_c2f;
   static int var_c51;
   static int var_c5f;
   static int var_ca4;
   static int var_cca;
   static int var_cfa;
   static boolean var_d2f;
   static int var_d74;
   static int var_da7;
   static int var_dfc;
   static int[][] var_e14;
   static Class_22 var_e52 = null;
   static Class_22 var_e7b = null;
   static Class_22 var_ea1 = null;
   static Class_22 var_ef4 = null;
   static Class_22 var_f3f = null;
   static Class_22 var_f8f = null;
   static Class_22 var_fcd = null;
   static Class_22 var_1003 = null;
   static Class_22 var_1025 = null;
   static Class_22 var_105d = null;
   static int var_10c1;
   static int var_10e5;
   static int var_111b;
   static int var_1139;
   static int[] var_1179 = new int[5];
   static int[] var_1197 = new int[5];
   static int[] var_11a8 = new int[5];
   static int[] var_11d2 = new int[5];
   static int var_11f6 = 0;
   static int var_1200 = 0;


   Class_9b(int var1) {
      this.var_c = (byte)var1;
      this.var_21b = new int[4];
      this.var_2af = false;
   }

   final void sub_1a(Class_9b var1) {
      this.sub_994(0, 0, 0, 0);
      this.var_2af = var1.var_2af;
      this.var_1d2 = var1.var_1d2;
      this.var_175 = var1.var_175;

      int var2;
      for(var2 = 0; var2 < 4; ++var2) {
         this.var_21b[var2] = var1.var_21b[var2];
      }

      this.var_266 = new int[var1.var_266.length];

      for(var2 = 0; var2 < var1.var_266.length; ++var2) {
         this.var_266[var2] = var1.var_266[var2];
      }

      this.var_d3 = new short[12];

      for(var2 = 0; var2 < 12; ++var2) {
         this.var_d3[var2] = var1.var_d3[var2];
      }

      this.var_3e5 = var1.var_3e5;
      this.var_126 = var1.var_126;
   }

   final void sub_4e(int var1) {
      if(this.var_48) {
         if(this.var_9f4) {
            this.var_5d4 = Class_df.var_44e8.var_5d4;
            this.var_63f = Class_df.var_44e8.var_63f + (Class_df.var_44e8.var_d3[9] >> 1);
            this.var_532 = Class_df.var_44e8.var_532;
            this.var_70e = Class_df.var_44e8.var_70e;
            if(this.var_a76 > 0) {
               this.var_a76 -= var1;
               if(this.var_a76 < 0) {
                  this.var_a76 = 0;
               }

               this.var_5d4 -= this.var_856 * this.var_a76 / 1228;
               this.sub_df2(-(this.var_3e5 * this.var_a76) / 1228);
            } else {
               this.var_48 = false;
               this.var_a60 = false;
            }
         } else {
            this.var_676 = this.var_63f;
            this.var_57c = this.var_532;
            this.var_5fa = this.var_5d4;
            this.var_74c = this.var_70e;
            this.var_442 = 0;
            if(this.sub_d2c(Class_df.var_44e8) < -1024) {
               this.var_48 = false;
            }

         }
      }
   }

   private void sub_79(int var1, int var2) {
      Class_df.sub_a18(this.var_46f, 4096, var1, var2, 0);
   }

   final boolean sub_cb() {
      if(this.var_9f4) {
         return false;
      } else {
         Class_9b var1 = Class_df.var_44e8;
         if(Class_df.var_11b3) {
            return false;
         } else if(Math.abs(this.var_68f - var1.var_68f) > 100) {
            return false;
         } else {
            short var2;
            short var3;
            short var10000;
            if(this.var_c == 4) {
               var2 = 150;
               var3 = 150;
               var10000 = 200;
            } else {
               var2 = this.var_d3[6 + this.var_46f];
               var3 = this.var_d3[6 - this.var_46f];
               var10000 = this.var_d3[9];
            }

            short var4 = var10000;
            short var5 = var1.var_d3[6 + var1.var_46f];
            short var6 = var1.var_d3[6 - var1.var_46f];
            short var7 = var1.var_d3[9];
            int var10 = this.sub_d2c(var1);
            int var11 = this.sub_d76(var1);
            int var12;
            int var33;
            if(var11 > var10) {
               var12 = var10;
               var33 = var11;
            } else {
               var12 = var11;
               var33 = var10;
            }

            int var13 = var33 + var4;
            if(var7 >= var12 && var13 >= 0) {
               int var16 = this.var_5d4 - var2;
               int var17 = this.var_5d4 + var3;
               int var18;
               if(var1.var_5d4 < var1.var_5fa) {
                  var18 = var1.var_5d4 - var5;
                  var33 = var1.var_5fa;
               } else {
                  var18 = var1.var_5fa - var5;
                  var33 = var1.var_5d4;
               }

               if(var33 + var6 >= var16 && var17 >= var18) {
                  if(this.var_c == 6) {
                     return true;
                  } else {
                     int var10001;
                     if(this.var_c == 4) {
                        label149: {
                           label148: {
                              this.var_9f4 = true;
                              switch(this.var_8ac) {
                              case 0:
                                 if(Class_df.var_1ea4 <= 0) {
                                    break label149;
                                 }

                                 Class_df.var_1ea4 = 0;
                                 var33 = Class_df.var_2017;
                                 var10001 = 2;
                                 break label148;
                              case 1:
                                 if(Class_df.var_1f1f >= 4096) {
                                    break label149;
                                 }

                                 Class_df.var_1f1f += 1024;
                                 if(Class_df.var_1f1f > 4096) {
                                    Class_df.var_1f1f = 4096;
                                 }

                                 Class_df.sub_cd9(16, false);
                                 break;
                              case 2:
                                 if(Class_df.var_1f1f >= 4096) {
                                    break label149;
                                 }

                                 Class_df.var_1f1f = 4096;
                                 break;
                              case 3:
                                 Class_df.var_1ed8 += Class_df.var_5005[11];
                                 Class_df.var_120d[13] += Class_df.var_5005[11];
                                 Class_df.var_2017 |= 64;
                                 Class_df.sub_cd9(11, Class_df.var_4651.var_48);
                                 break label149;
                              case 4:
                                 Class_df.var_1ed8 += Class_df.var_5005[8];
                                 Class_df.var_120d[13] += Class_df.var_5005[8];
                                 Class_df.var_2017 |= 64;
                                 Class_df.sub_cd9(8, Class_df.var_4651.var_48);
                              default:
                                 break label149;
                              }

                              var33 = Class_df.var_2017;
                              var10001 = 524288;
                           }

                           Class_df.var_2017 = var33 | var10001;
                        }

                        this.var_a76 = 1228;
                        this.var_856 = var1.var_5d4 - this.var_5d4;
                        this.var_3e5 = -this.sub_d2c(var1);
                        return true;
                     } else if(this.var_376 < 0) {
                        var1.sub_fa(0);
                        return true;
                     } else {
                        int var20 = this.var_5d4 - this.var_5fa;
                        int var21 = this.var_3a9;
                        int var22 = var1.var_5d4 - var1.var_5fa;
                        int var23 = var1.var_3a9;
                        int var24 = var20 - var22;
                        int var25 = var21 - var23;
                        if(this.var_c == 3) {
                           var25 = 0;
                           if((var24 = Math.abs(var24)) == 0) {
                              var24 = 1;
                           }

                           if(this.var_5fa > var1.var_5fa) {
                              var24 = -var24;
                           }
                        }

                        int var26;
                        if((var26 = var24 * var24 + var25 * var25) == 0) {
                           var25 = 1;
                           var26 = 1;
                        }

                        int var27 = (var24 * var24 << 12) / var26;
                        int var28 = (var25 * var25 << 12) / var26;
                        int var29;
                        if((var29 = (Math.abs(this.var_442 - (var1.var_442 + var_10c1)) * var27 >> 12) * 2048 >> 12) < 500) {
                           var29 = 500;
                        }

                        if(var24 < 0) {
                           var29 = -var29;
                        }

                        int var30 = (Math.abs(this.var_341 - var1.var_341) * var28 >> 12) * 4096 >> 12;
                        if(var25 != 0 && var30 < 11377) {
                           var30 = 11377;
                        }

                        if(var25 < 0) {
                           var30 = -var30;
                        }

                        if(var30 < -79644) {
                           var30 = -79644;
                        }

                        this.var_442 -= var29;
                        var1.var_442 += var29;
                        this.var_341 -= var30;
                        var1.var_341 += var30;
                        if(var30 < 0 && var1.var_341 > this.var_341) {
                           this.var_341 = var1.var_341 + 22755;
                        }

                        boolean var31 = false;
                        Class_9b var35;
                        if(var28 > 1024) {
                           if(this.var_5d4 + var3 > var1.var_5d4 - var5 && this.var_5d4 - var2 < var1.var_5d4 + var6) {
                              if(var11 > 0 && var10 < var7) {
                                 this.sub_df2(var7 - var10);
                              } else if(var11 < 0 && var10 > 0) {
                                 this.sub_df2(-var10);
                              }
                           }
                        } else if(var10 >= 0 && var10 <= var7) {
                           if(this.var_5fa < var1.var_5fa) {
                              var35 = this;
                              var10001 = var1.var_5d4 - var5 - var3;
                           } else {
                              var35 = this;
                              var10001 = var1.var_5d4 + var6 + var2;
                           }

                           var35.var_5d4 = var10001;
                           var31 = true;
                        }

                        byte var34;
                        if(var1.var_2f5 == 2) {
                           var35 = this;
                           var34 = 6;
                        } else if(var1.var_2f5 == 3) {
                           var35 = this;
                           var34 = 9;
                        } else {
                           var35 = this;
                           var34 = 3;
                        }

                        var35.sub_6f8(var34);
                        int var32 = this.sub_6d3();
                        if(this.var_5d4 < var1.var_5d4) {
                           if(var32 <= 0) {
                              var35 = this;
                              var34 = 0;
                           } else if(var31) {
                              var35 = this;
                              var34 = 2;
                           } else {
                              var35 = this;
                              var34 = 3;
                           }

                           var35.sub_fa(var34);
                           var35 = var1;
                           var34 = 1;
                        } else {
                           if(var32 <= 0) {
                              var35 = this;
                              var34 = 0;
                           } else if(var31) {
                              var35 = this;
                              var34 = 1;
                           } else {
                              var35 = this;
                              var34 = 3;
                           }

                           var35.sub_fa(var34);
                           var35 = var1;
                           var34 = 2;
                        }

                        var35.sub_fa(var34);
                        return true;
                     }
                  }
               } else {
                  return false;
               }
            } else {
               return false;
            }
         }
      }
   }

   final void sub_ee() {
      if(!Class_df.var_11b3) {
         if(!this.var_a60) {
            short var1 = this.var_d3[6 + this.var_46f];
            short var2 = this.var_d3[6 - this.var_46f];
            int var3 = this.var_5d4 - var1;
            int var4 = this.var_5d4 + var2;
            int var5 = this.var_57c;

            int var8;
            Class_9b var10000;
            byte var21;
            while(var5 != this.var_532) {
               var5 = (var5 + 1) % Class_df.var_35f4;
               short var6;
               int var7;
               if((var7 = (var6 = Class_df.var_3b22[var5]) & '\uf000') == 28672 && this.var_68f == 0) {
                  var8 = var6 & 4095;
                  int var10001;
                  if(this.var_341 < 227555) {
                     var10000 = this;
                     var10001 = var8 * this.var_341 / 227555;
                  } else {
                     var10000 = this;
                     var10001 = var8;
                  }

                  var10000.var_8c4 = var10001 << 12;
                  this.var_68f = 1;
               }

               if(this.var_c == 0) {
                  if((Class_df.var_3b5b[var5] & 255) == 208 && this.var_96e != 0) {
                     this.sub_fa(0);
                  }

                  int var10;
                  int var12;
                  int var13;
                  int var14;
                  int var15;
                  int var20;
                  if(var7 == 12288) {
                     var8 = var6 & 2047;
                     short[] var17;
                     if((var17 = Class_df.var_38b0[var8]) == null) {
                        return;
                     }

                     var10 = var6 & 2048;
                     var20 = var17.length;

                     for(int var16 = 0; var16 < var20; var16 += 2) {
                        var12 = var17[var16];
                        var13 = var17[var16 + 1];
                        if(var10 != 0) {
                           var14 = var12;
                           var12 = -var13;
                           var13 = -var14;
                        }

                        var14 = var13 - var3;
                        var15 = var4 - var12;
                        if(var14 > 0 && var15 > 0) {
                           if(var14 < 100) {
                              this.var_5d4 = var13 + var1;
                              this.var_5fa = this.var_5d4;
                              var10000 = this;
                              var21 = 1;
                           } else if(var15 < 100) {
                              this.var_5d4 = var12 - var2;
                              this.var_5fa = this.var_5d4;
                              var10000 = this;
                              var21 = 2;
                           } else {
                              this.sub_df2(-this.var_63f + (this.var_532 - var5 << 10));
                              var10000 = this;
                              var21 = 0;
                           }

                           var10000.sub_fa(var21);
                        }
                     }
                  } else {
                     short var9;
                     if(var7 == 4096) {
                        var8 = var6 & 2047;
                        var9 = Class_df.var_3af6[var8];
                        var10 = Class_df.var_3aea[var8] & 255;
                        if((var20 = Class_df.var_3a9d[var10]) == 0) {
                           return;
                        }

                        var12 = var9 - (var20 >> 1);
                        var14 = (var13 = var9 + (var20 >> 1)) - var3;
                        var15 = var4 - var12;
                        if(var14 > 0 && var15 > 0) {
                           if(Class_df.var_3a0e[var10] == null) {
                              if(var14 < 100) {
                                 this.var_5d4 = var13 + var1;
                                 this.var_5fa = this.var_5d4;
                                 this.sub_fa(1);
                              } else if(var15 < 100) {
                                 this.var_5d4 = var12 - var2;
                                 this.var_5fa = this.var_5d4;
                                 this.sub_fa(2);
                              } else {
                                 this.sub_df2(-this.var_63f + (this.var_532 - var5 << 10));
                                 this.sub_fa(0);
                              }
                           } else {
                              var_bd5 = Class_df.var_3a0e[var10][0];
                              var_be1 = Class_df.var_3a0e[var10][1];
                              var_b9b = 1638;
                              var_c2f = (var9 - this.var_5d4) * Class_df.var_2a74 / 640;
                              Class_df.sub_d62(6);
                              Class_df.sub_12e4(1638, 0, 1, 2);
                           }
                        }
                     } else if(var7 == 16384) {
                        var8 = var6 & 2047;
                        var9 = Class_df.var_3af6[var8];
                        var10 = Class_df.var_3aea[var8] & 255;
                        if(this.var_70e < Class_df.var_48e7 || var5 + 20 < Class_df.var_35f4) {
                           for(var12 = 0; var12 < 2; ++var12) {
                              Class_9b var11;
                              if(!(var11 = Class_df.var_4723[var12]).var_48) {
                                 var11.var_48 = true;
                                 var11.var_9f4 = false;
                                 var11.var_532 = var5 + 20;
                                 var11.var_70e = this.var_70e;
                                 if(var11.var_532 >= Class_df.var_35f4) {
                                    var11.var_532 -= Class_df.var_35f4;
                                    ++var11.var_70e;
                                 }

                                 var11.var_63f = 0;
                                 var11.var_5d4 = var9;
                                 var11.var_68f = Class_df.var_3a70[var10];
                                 var11.var_57c = var11.var_532;
                                 var11.var_676 = var11.var_63f;
                                 var11.var_5fa = var11.var_5d4;
                                 var11.var_74c = var11.var_70e;
                                 var11.var_46f = 10 + var10;
                                 var11.var_8ac = Class_df.var_3a02[var10][1];
                                 var11.var_3e5 = var5;
                                 break;
                              }
                           }
                        }
                     } else if(var7 == '\u8000') {
                        if(this.var_68f == 0) {
                           this.sub_fa(4);
                        }
                     } else if(var7 == 20480) {
                        if(this.var_70e == 2 && Class_df.var_105e != 1 && Class_df.var_105e != 3) {
                           Class_df.sub_d62(5);
                        }
                     } else if(var7 == 24576) {
                        if(this.var_70e <= Class_df.var_48e7) {
                           Class_df.sub_7b1(var8 = var6 & 4095);
                        }
                     } else if(var7 == '\u9000') {
                        if((var8 = var6 & 4095) == 4095) {
                           Class_df.var_3782 = false;
                        } else {
                           Class_df.var_3782 = true;
                           Class_df.var_37a2 = var8 * 1000;
                        }

                        if(Class_df.var_105e == 1) {
                           if(!Class_df.var_467f.var_48) {
                              Class_df.var_4543 = Class_df.var_3782;
                           }
                        } else if(!Class_df.var_45ee.var_48) {
                           Class_df.var_4543 = Class_df.var_3782;
                        }
                     }
                  }
               }
            }

            if(!this.var_a60 && this.var_96e != 0) {
               boolean var18 = (var8 = Class_df.var_3694[this.var_532] & 3) == 3 || var8 == 1;
               boolean var19 = var8 == 3 || var8 == 2;
               if(this.var_c == 0) {
                  if(this.var_9d1 == 1 && var18) {
                     this.var_5d4 = this.sub_e7d() + var1;
                     this.sub_fa(1);
                  }

                  if(this.var_9d1 != 2 || !var19) {
                     return;
                  }

                  this.var_5d4 = this.sub_e88() - var2;
                  var10000 = this;
                  var21 = 2;
               } else {
                  if(!this.var_9f4 || (this.var_96e != 1 || this.var_9d1 != 1 || !var18) && (this.var_96e != 1 || this.var_9d1 != 2 || !var19) && this.var_96e != 2) {
                     return;
                  }

                  this.sub_6f8(this.sub_6d3());
                  var10000 = this;
                  var21 = 0;
               }

               var10000.sub_fa(var21);
            }

         }
      }
   }

   private void sub_fa(int var1) {
      label54: {
         Class_9b var10000;
         short var10001;
         label53: {
            this.var_9f4 = true;
            this.var_a60 = false;
            if(var1 == 1) {
               if(this.var_c == 0) {
                  if(this.var_442 + var_10c1 < 50) {
                     this.var_442 = 50 - var_10c1;
                  }

                  sub_542(4, 819, false, 10);
                  Class_df.sub_12e4(1638, 1, 0, 2);
               } else {
                  this.var_46f = -1;
               }

               var10000 = this;
            } else if(var1 == 2) {
               if(this.var_c == 0) {
                  if(this.var_442 + var_10c1 > -50) {
                     this.var_442 = -50 - var_10c1;
                  }

                  sub_542(5, 819, false, 10);
                  Class_df.sub_12e4(1638, 1, 0, 2);
               } else {
                  this.var_46f = 1;
               }

               var10000 = this;
            } else {
               if(var1 == 0) {
                  this.var_a60 = true;
                  this.var_a22 = 12288;
                  this.var_442 = (-(this.var_5d4 * 2) << 12) / this.var_a22;
                  if(this.var_68f == 0) {
                     this.var_8c4 = Class_6b.sub_496(600, 1000) << 12;
                     this.var_68f = 1;
                  }

                  if(this.var_c == 0) {
                     this.var_2f5 = 1;
                     Class_df.var_2d85 = 6144;
                     var_1139 = 0;
                     Class_df.sub_12e4(1638, 0, 1, 4);
                  } else {
                     Class_df.sub_d76();
                     Class_df.sub_12e4(2457, Class_6b.sub_496(-1, 2), Class_6b.sub_496(-1, 2), 4);
                  }
                  break label54;
               }

               if(var1 == 4) {
                  this.var_a60 = true;
                  var10000 = this;
                  var10001 = 12288;
                  break label53;
               }

               var10000 = this;
            }

            var10001 = 1638;
         }

         var10000.var_a22 = var10001;
      }

      if(this.var_c != 0) {
         Class_df.sub_e20(this, var1);
      }

   }

   static void sub_14c() {
      if(!Class_df.var_4832 && !Class_df.var_44e8.var_a60) {
         Class_9b var0 = Class_df.var_45ee;
         Class_9b var1 = Class_df.var_44e8;
         if(!var0.var_48) {
            var0.sub_994(var1.var_70e, var1.var_532, var1.var_63f, -1500);
            var0.var_48 = true;
            var0.var_5d4 = 0;
            var0.var_98 = 7;
            var0.var_341 = var1.var_341;
            var0.var_376 = var1.var_341;
            var_e14[7][1] = 50 * Class_df.var_37fd >> 7;
            var_e14[7][0] = var_e14[7][1];
            var0.var_84 = 2;
            Class_df.var_460c = 0;
            if(Class_df.var_105e != 1) {
               Class_df.var_4543 = false;
            }
         }

      }
   }

   static void sub_195() {
      Class_df.var_45ee.var_48 = false;
      if(Class_df.var_105e != 1) {
         Class_df.var_4543 = Class_df.var_3782;
      }

   }

   final void sub_1f4(int var1) {
      if(this.var_48) {
         if(Class_df.var_11b3) {
            this.var_341 = this.var_376 = Class_df.var_44e8.var_341;
            this.var_442 = 0;
            this.var_46f = 0;
            this.sub_e2a(var1, 0, false);
         } else if(this.var_a60) {
            this.sub_e2a(var1, 0, false);
         } else {
            Class_df.var_460c += var1;
            Class_9b var2 = Class_df.var_44e8;
            Class_9b var3 = Class_df.var_467f;
            boolean var4 = false;
            boolean var5 = false;
            boolean var6 = false;
            int var8 = var2.var_21b[2];
            int var10 = var2.var_5d4;
            int var11 = var2.var_341;
            boolean var13 = false;
            if(var3.var_48 && !var3.var_a60 && Math.abs(var3.sub_d2c(var2)) < 2000) {
               var13 = true;
            }

            boolean var15 = var2.var_a60;
            boolean var16 = var2.var_96e == 2;
            boolean var17 = var2.var_341 <= 79644;
            int var18 = Math.abs(this.var_5d4 - var2.var_5d4);
            int var20 = Math.abs(this.sub_d2c(var2));
            int var21;
            int var22;
            if(var15) {
               this.var_341 = this.var_376 = var2.var_341;
               var22 = this.var_5d4 < var10?var10 - 500:var10 + 500;
               var21 = this.sub_7ab(var22);
               this.sub_e2a(var1, var21, false);
               int var19 = this.sub_d2c(var2);
               this.sub_67b(var2, var19 + (Math.min(Math.max(var1 << 1, 0), 4096) * (0 - var19) >> 12));
            } else if((var18 <= 500 || var16) && var20 <= 150 && var17) {
               Class_df.sub_c6a();
            } else {
               Class_9b var10000;
               byte var25;
               switch(this.var_84) {
               case 1:
                  int var24;
                  if(this.var_a76 >= 0) {
                     this.var_a76 -= var1;
                     var24 = this.var_5d4 > var10?var10 + 500:var10 - 500;
                  } else {
                     var24 = var10;
                  }

                  label98: {
                     var22 = var24;
                     var21 = this.sub_7ab(var22);
                     if(!this.var_9f4) {
                        if(var11 <= var8) {
                           this.var_341 = var11;
                           this.var_376 = this.var_341;
                           this.sub_e2a(var1, var21, false);
                           this.var_532 = var2.var_532;
                           this.var_63f = var2.var_63f;
                           this.var_3a9 = var2.var_3a9;
                           break label98;
                        }

                        this.var_341 = var8;
                        this.var_376 = this.var_341;
                     } else {
                        this.var_a76 = 2048;
                     }

                     this.sub_e2a(var1, var21, false);
                  }

                  if(!var13 && this.sub_d2c(var2) >= 0) {
                     return;
                  }

                  var10000 = this;
                  var25 = 2;
                  break;
               case 2:
                  int var23 = !var13 && Math.abs(this.var_5d4 - var10) >= 300?10:-220;
                  int var14 = sub_dbb(this.var_70e, this.var_532, this.var_63f, var2.var_74c, var2.var_57c, var2.var_676);
                  if(!this.var_9f4) {
                     this.var_341 = var11;
                     int var10001;
                     int var10002;
                     if(var14 > -220) {
                        var10000 = this;
                        var10001 = this.var_341;
                        var10002 = 22755 * (var23 - var14) / 220;
                     } else {
                        var10000 = this;
                        var10001 = this.var_341;
                        var10002 = 22755;
                     }

                     var10000.var_341 = var10001 + var10002;
                     if(this.var_341 > var8) {
                        this.var_341 = var8;
                     }

                     this.var_376 = this.var_341;
                  }

                  var21 = this.sub_7ab(var10 + (var10 < 0?400:-400));
                  this.sub_e2a(var1, var21, false);
                  if((var14 = this.sub_d2c(var2)) >= 0 && var23 >= 0 && Math.abs(this.var_5d4 - var10) >= 200) {
                     this.sub_df2(-var14);
                     this.var_a76 = 2048;
                     var10000 = this;
                     var25 = 1;
                     break;
                  }

                  return;
               default:
                  return;
               }

               var10000.var_84 = var25;
            }
         }
      }
   }

   private void sub_257(int var1, int var2, int var3) {
      if(this.var_a60) {
         this.sub_629(var1, var2);
      } else {
         var_ef4.sub_410(Class_df.var_3ec, 2 + (this.var_46f << 1), 0, var1, var2, 0);
         if(!Class_df.var_11b3) {
            this.sub_4bc(var1, var2, var3);
         }

      }
   }

   static void sub_26f() {
      Class_9b var0 = Class_df.var_4651;
      if(!Class_df.var_4651.var_48) {
         var0.var_48 = true;
         var0.var_84 = 1;
         var0.var_5d4 = -20;
         var0.var_63f = -20;
         var0.var_5fa = var0.var_5d4;
         var0.var_676 = var0.var_63f;
         var0.var_68f = 0;
         var0.var_a76 = 4096;
         var0.var_a60 = true;
         var0.var_98 = 0;
         Class_df.var_27d5 = 16384;
      }

   }

   static void sub_2b2() {
      Class_df.var_4651.var_48 = false;
      Class_df.var_2017 |= 1024;
   }

   final void sub_2f8(int var1) {
      if(this.var_48) {
         if(!Class_df.var_4832) {
            if(Class_df.var_11b3) {
               if(this.var_84 != 2) {
                  this.var_84 = 2;
                  this.var_5fa = this.var_5d4;
                  this.var_676 = this.var_63f;
                  this.var_a76 = 4096;
                  this.var_856 = 0;
                  Class_df.var_2017 |= 1024;
               }
            } else {
               label67: {
                  Class_9b var10000;
                  byte var10001;
                  if((Class_df.var_64f & 2048L) == 0L) {
                     if(this.var_68f != 0) {
                        break label67;
                     }

                     Class_df.var_2017 |= 512;
                     var10000 = this;
                     var10001 = 1;
                  } else {
                     if(this.var_68f != 1) {
                        break label67;
                     }

                     Class_df.var_2017 |= 1024;
                     var10000 = this;
                     var10001 = 0;
                  }

                  var10000.var_68f = var10001;
               }
            }

            boolean var2 = false;

            for(int var3 = 0; var3 < 7; ++var3) {
               int var5 = (Class_df.var_44e8.var_532 + var3) % Class_df.var_35f4;
               if((Class_df.var_3b5b[var5] & 192) == 192) {
                  var2 = true;
                  break;
               }
            }

            if(this.var_a76 > 0) {
               this.var_a76 -= var1;
               if(this.var_a76 < 0) {
                  this.var_a76 = 0;
               }
            }

            int var6 = Class_df.var_3f34[2] + (Class_df.var_3fc9[2] >> 1);
            int var7 = Class_df.var_3f34[3] + (Class_df.var_3fc9[3] >> 1);
            var6 += (var7 - var6) * Class_df.var_2b8f >> 10;
            switch(this.var_84) {
            case 0:
               if(var2) {
                  this.var_84 = 3;
                  this.var_5fa = this.var_5d4;
                  this.var_676 = this.var_63f;
                  this.var_a76 = 4096;
                  this.var_856 = 0;
               } else {
                  this.var_532 += var1 >> 2;
                  this.var_532 &= 16383;
                  this.var_5d4 = var6 + (10 * (Class_6b.var_361[512 - (this.var_532 >> 2) & 2047] * Class_6b.var_361[this.var_532 >> 1 & 2047] >> 12) >> 12);
                  this.var_63f = 66 + (10 * Class_6b.var_361[512 - (this.var_532 >> 1) & 2047] >> 12);
               }
               break;
            case 1:
               this.var_5d4 = var6 + (this.var_5fa - var6) * this.var_a76 / 4096;
               this.var_63f = 66 + (this.var_676 - 66) * this.var_a76 / 4096;
               if(this.var_a76 == 0) {
                  this.var_532 = 0;
                  this.var_856 = 1;
                  this.var_84 = 0;
               }
               break;
            case 2:
               this.var_5d4 = -20 + (this.var_5fa - -20) * this.var_a76 / 4096;
               this.var_63f = -20 + (this.var_676 - -20) * this.var_a76 / 4096;
               if(this.var_a76 <= 0) {
                  sub_2b2();
               }
               break;
            case 3:
               this.var_5d4 = -20 + (this.var_5fa - -20) * this.var_a76 / 4096;
               this.var_63f = -20 + (this.var_676 - -20) * this.var_a76 / 4096;
               if(!var2) {
                  this.var_5fa = this.var_5d4;
                  this.var_676 = this.var_63f;
                  this.var_a76 = 4096;
                  this.var_84 = 1;
               }
            }

            this.var_98 -= var1;
            this.var_a60 = false;
            if(this.var_98 <= 0) {
               this.var_a60 = true;
               this.var_98 = Class_6b.sub_496(4096, '\u8000');
            }

         }
      }
   }

   final void sub_35a() {
      var_105d.sub_410(Class_df.var_3ec, 0, Class_df.var_4a02 & 1, this.var_5d4, this.var_63f, 0);
      if(this.var_a60) {
         var_105d.sub_429(Class_df.var_3ec, 2, this.var_5d4, this.var_63f, 0);
      }

   }

   private void sub_38f(int var1, int var2, int var3) {
      int var4 = -((this.var_5d4 << 1) * var3 >> 12);
      Class_df.sub_a18(0, 4096, var1 + var4, var2, 0);
      var_f3f.sub_429(Class_df.var_3ec, 0, var1, var2, 0);
      sub_45e(var_1025, this.var_8ac, var1, var2, this.var_a76, 2457);
   }

   final boolean sub_39e(int var1) {
      int var5;
      if((var5 = (Class_df.var_3c8a[var1] * this.var_63f >> 12) + Class_df.var_3bfe[var1]) <= 0) {
         return false;
      } else {
         int var2 = (Class_df.var_3c80[var1] * this.var_63f >> 12) + this.var_5d4 + Class_df.var_3bbe[var1];
         int var4 = (Class_df.var_3cab[var1] * this.var_63f >> 12) + Class_df.var_3c51[var1];
         var2 = 120 + var2 * Class_df.var_2a74 / var5;
         int var6 = Class_df.var_2da8 - var4 * Class_df.var_2a74 / var5;
         int var10000;
         if(this.var_68f == 0) {
            var10000 = var6;
         } else {
            var4 += this.var_68f;
            var10000 = Class_df.var_2da8 - var4 * Class_df.var_2a74 / var5;
         }

         int var3 = var10000;
         int var7 = 2621440 / var5;
         this.var_767 = var2;
         this.var_7b7 = var3;
         this.var_811 = var6;
         this.var_82f = var7;
         return true;
      }
   }

   final void sub_3e3() {
      switch(this.var_c) {
      case 0:
         this.sub_af8(this.var_767, this.var_7b7);
         return;
      case 1:
         this.sub_8c7(this.var_767, this.var_7b7, this.var_82f);
         return;
      case 2:
         this.sub_d07(this.var_767, this.var_7b7, this.var_82f);
         return;
      case 3:
         this.sub_257(this.var_767, this.var_7b7, this.var_82f);
         return;
      case 4:
         this.sub_79(this.var_767, this.var_7b7);
         return;
      case 5:
      default:
         return;
      case 6:
         this.sub_972(this.var_767, this.var_7b7, this.var_82f);
         return;
      case 7:
         this.sub_38f(this.var_767, this.var_7b7, this.var_82f);
      }
   }

   private static void sub_424(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      int var11 = var3 * var0 >> 12;
      int var12 = var4 * var0 >> 12;
      var_f8f.sub_410(Class_df.var_3ec, 9, Class_df.var_4a02 % 3, var1 - var11, var2 - var12, 0);
      var11 = var5 * var0 >> 12;
      var12 = var6 * var0 >> 12;
      var_f8f.sub_410(Class_df.var_3ec, 10, Class_df.var_4a02 % 4, var1 - var11, var2 - var12, 0);
      var11 = var7 * var0 >> 12;
      var12 = var8 * var0 >> 12;
      var_f8f.sub_410(Class_df.var_3ec, 10, (Class_df.var_4a02 + 2) % 4, var1 - var11, var2 - var12, 0);
      var11 = var9 * var0 >> 12;
      var12 = var10 * var0 >> 12;
      var_f8f.sub_410(Class_df.var_3ec, 9, (Class_df.var_4a02 + 1) % 3, var1 - var11, var2 - var12, 0);
   }

   static boolean sub_45e(Class_22 var0, int var1, int var2, int var3, int var4, int var5) {
      boolean var6 = false;
      int var7 = var0.sub_105(var1);
      int var8;
      if((var8 = var4 * var7 / var5) > var7 - 1) {
         var8 = var7 - 1;
         var6 = true;
      }

      var0.sub_410(Class_df.var_3ec, var1, var8, var2, var3, 0);
      return var6;
   }

   private void sub_4bc(int var1, int var2, int var3) {
      int var4 = this.sub_d2c(Class_df.var_44e8);
      Graphics var10000;
      int var10001;
      if(this.var_c == 1) {
         var10000 = Class_df.var_3ec;
         var10001 = 16711680;
      } else {
         var10000 = Class_df.var_3ec;
         var10001 = 255;
      }

      var10000.setColor(var10001);
      if(!Class_df.var_4832) {
         if(var4 > -300) {
            boolean var5 = false;
            if(var4 < 1000) {
               label49: {
                  short var8;
                  short var9;
                  short var10002;
                  short var10003;
                  short var10004;
                  if(var1 >= 240) {
                     var5 = true;
                     var8 = 228;
                     var9 = 238;
                     var10002 = 228;
                     var10003 = 226;
                     var10004 = 240;
                  } else {
                     if(var1 > 0) {
                        break label49;
                     }

                     var5 = true;
                     var1 = 12;
                     var2 = 232;
                     var8 = 12;
                     var9 = 238;
                     var10002 = 12;
                     var10003 = 226;
                     var10004 = 0;
                  }

                  Class_df.sub_ac9(var8, var9, var10002, var10003, var10004, 232);
               }
            }

            if(!var5 && this.var_c == 1) {
               int var6;
               int var10;
               if(Class_df.var_105e != 3 && Class_df.var_105e != 1) {
                  var6 = 0 + this.var_98;
                  if(Class_df.var_4761 == this.var_98) {
                     ++var6;
                  }

                  var10 = Class_df.var_4a02 % var_e52.sub_105(var6);
               } else {
                  var6 = this.var_98 == 0?12:13;
                  var10 = 0;
               }

               int var7 = var10;
               var_e52.sub_410(Class_df.var_3ec, var6, var7, var1, var2 + (-32 * var3 >> 12), 0);
               return;
            }
         } else {
            if(var3 > 8192) {
               var1 = (var1 << 13) / var3;
            }

            Class_df.sub_ac9(var1, 290, var1 + 6, 284, var1 - 6, 284);
         }
      }

   }

   final void sub_517() {
      if(this.var_c == 0) {
         if(!this.var_a60) {
            var_1003.sub_429(Class_df.var_3ec, this.var_2af?0:4 + this.var_46f, this.var_767, this.var_811, 0);
            return;
         }
      } else if(this.var_c == 4) {
         Class_df.sub_a18(5, this.var_82f, this.var_767, this.var_7b7, 0);
      }

   }

   private static void sub_542(int var0, int var1, boolean var2, int var3) {
      if(var_ca4 == -1 || var_d74 > var3) {
         var_ca4 = var0;
         var_cca = 0;
         var_cfa = var1;
         var_d2f = var2;
         var_d74 = var3;
      }

   }

   private static void sub_59b(int var0, int var1) {
      if(var_ca4 >= 0) {
         sub_45e(var_f8f, var_ca4, var0, var1, var_cca, var_cfa);
      }

   }

   private static void sub_5e9(int var0) {
      if(var_ca4 >= 0) {
         var_cca += var0;
         if(var_cca > var_cfa) {
            if(var_d2f) {
               var_cca -= var_cfa;
               return;
            }

            sub_60e();
         }
      }

   }

   static void sub_60e() {
      var_ca4 = -1;
      var_cca = 0;
      var_d74 = 100;
   }

   private void sub_629(int var1, int var2) {
      boolean var3 = true;
      short var6 = -1;
      int var4;
      if(this.var_2af) {
         label77: {
            byte var10000;
            if(this.var_a22 > 10240) {
               var4 = 0;
               if(this.var_5d4 <= 0) {
                  break label77;
               }

               var10000 = 4;
            } else if(this.var_a22 > 5120) {
               var4 = 4;
               if(this.var_5d4 <= 0) {
                  break label77;
               }

               var10000 = 0;
            } else {
               var10000 = 7;
            }

            var4 = var10000;
         }
      } else {
         label69: {
            int var8;
            if(this.var_a22 > 10752) {
               var6 = this.var_d3[11];
               var8 = this.var_5d4 < 0?4:0;
            } else {
               if(this.var_a22 > 6144) {
                  var4 = 2;
                  if(this.var_5d4 < 0) {
                     var4 = 0;
                  }

                  var3 = false;
                  break label69;
               }

               var6 = this.var_d3[11];
               var8 = this.var_5d4 < 0?6:7;
            }

            var4 = var8;
         }
      }

      if(!var3) {
         sub_45e(var_f8f, var4, var1, var2, 10752 - this.var_a22, 4608);
      } else if(this.var_c == 0) {
         if(this.var_2af) {
            var_e7b.sub_410(Class_df.var_3ec, var4, 0, var1, var2, 0);
         } else {
            this.sub_b59(var1, var2, var4, var6);
         }
      } else if(this.var_c == 3) {
         var_ef4.sub_410(Class_df.var_3ec, var4, 0, var1, var2, 0);
      } else {
         int var7 = 0;
         if(!this.var_2af) {
            if(var4 == 6 || var4 == 7) {
               var7 = 2;
            }

            if(var4 == 6 || var4 == 0) {
               var7 |= 1;
            }
         }

         Class_df.sub_a18(1, 4096, var1, var2, var7);
      }
   }

   final void sub_67b(Class_9b var1, int var2) {
      this.var_532 = var1.var_532;
      this.var_63f = var1.var_63f;
      this.var_70e = var1.var_70e;
      this.sub_df2(var2);
   }

   final int sub_6d3() {
      return this.var_c != 1 && this.var_c != 3?100:var_e14[this.var_98][0];
   }

   private void sub_6f8(int var1) {
      if(this.var_c == 1 || this.var_c == 3 && this.var_a22 <= 0) {
         var_e14[this.var_98][0] -= var1;
         if(var_e14[this.var_98][0] < 0) {
            var_e14[this.var_98][0] = 0;
         }
      }

   }

   final void sub_74b() {
      var_e14[this.var_98][0] = var_e14[this.var_98][1];
   }

   private int sub_7ab(int var1) {
      label14: {
         short var2 = this.var_d3[6];
         int var3 = this.sub_e7d() + var2;
         int var4 = this.sub_e88() - var2;
         int var10000;
         if(var1 < var3) {
            var10000 = var3;
         } else {
            if(var1 <= var4) {
               break label14;
            }

            var10000 = var4;
         }

         var1 = var10000;
      }

      int var5 = var1 - this.var_5d4;
      this.var_3e5 = var5 >> 6;
      return var5;
   }

   static void sub_7ba() {
      Class_9b var0 = Class_df.var_467f;
      int var1 = Class_df.var_105e;
      if(Class_df.var_105e != 0 && var1 != 2 && var1 != 3 && var1 != 4) {
         if(var1 == 1) {
            Class_df.var_374b = 1;
            var0.var_48 = false;
            var0.var_98 = 0;
            var_e14[0][1] = 130;
            var_e14[0][0] = 130;
            var0.sub_74b();
         }
      } else {
         var0.sub_994(Class_df.var_44e8.var_70e, Class_df.var_44e8.var_532, Class_df.var_44e8.var_63f, 3072);
         var0.var_98 = Class_df.var_374b - 1;
         var0.var_48 = true;
         var0.var_5d4 = 0;
         var0.var_84 = 0;
         var0.var_341 = 0;
         var0.sub_74b();
         if(var1 == 3) {
            var_e14[0][1] = 20;
            var_e14[0][0] = var_e14[0][1];
            return;
         }
      }

   }

   private void sub_7fe(boolean var1, boolean var2) {
      if(Class_df.var_105e == 0 || Class_df.var_105e == 2 || Class_df.var_105e == 3 || Class_df.var_105e == 4) {
         Class_9b var10000;
         label50: {
            int var10001;
            if(var2) {
               if(Class_df.var_105e == 2) {
                  int[] var3 = var_e14[this.var_98];

                  for(int var4 = this.var_98 + 1; var4 < Class_df.var_374b; ++var4) {
                     var_e14[var4 - 1] = var_e14[var4];
                  }

                  var_e14[--Class_df.var_374b] = var3;
                  if(Class_df.var_374b == 0) {
                     this.var_48 = false;
                     return;
                  }
               }

               if(this.var_98 == 0) {
                  var1 = false;
                  break label50;
               }

               var1 = true;
               var10000 = this;
               var10001 = this.var_98 - 1;
            } else {
               var10000 = this;
               var10001 = this.var_98 + (var1?-1:1);
            }

            var10000.var_98 = var10001;
         }

         this.sub_994(Class_df.var_44e8.var_74c, Class_df.var_44e8.var_57c, Class_df.var_44e8.var_676, var1?6144:-1000);
         byte var5;
         if(var1) {
            var10000 = this;
            var5 = 0;
         } else {
            var10000 = this;
            var5 = 3;
         }

         var10000.var_84 = var5;
         this.var_5d4 = 0;
         this.var_48 = true;
         this.var_341 = Class_df.var_44e8.var_341;
         this.sub_74b();
      }

   }

   private static int sub_859(int var0) {
      return var0 + (var0 > 0?-500:500) * 3;
   }

   final void sub_87c(int var1) {
      if(this.var_48) {
         if(Class_df.var_11b3) {
            this.var_341 = this.var_376 = Class_df.var_44e8.var_341;
            this.var_442 = 0;
            this.sub_e2a(var1, 0, false);
            this.var_46f = 0;
         } else if(this.var_a60) {
            this.sub_e2a(var1, 0, false);
         } else {
            Class_9b var2 = Class_df.var_44e8;
            int var4 = Class_df.var_44e8.var_5d4;
            int var5 = Class_df.var_4503.var_5d4;
            int var6 = sub_dbb(this.var_70e, this.var_532, this.var_63f, var2.var_74c, var2.var_57c, var2.var_676);
            int var7 = var2.var_21b[1] * (28 - (this.var_98 >> 1)) >> 5;
            int var10000;
            if(Class_df.var_4503.var_48 && Math.abs(var5 - this.var_5d4) < 500) {
               int var8 = Math.abs(var4 - var5);
               int var9 = var4 + var5 >> 1;
               var10000 = var8 < 1000?sub_859(var9):var9;
            } else {
               var10000 = var6 < 0?sub_859(var4):var4;
            }

            int var3;
            label60: {
               var3 = var10000;
               Class_9b var10;
               boolean var10001;
               if(var6 > 6644) {
                  if(this.var_98 == Class_df.var_374b - 1) {
                     this.var_84 = 2;
                     var7 >>= 4;
                     break label60;
                  }

                  var10 = this;
                  var10001 = false;
               } else {
                  if(var6 > 2048) {
                     this.var_84 = 0;
                     break label60;
                  }

                  if(var6 > -1000) {
                     this.var_84 = 1;
                     break label60;
                  }

                  if(var6 >= -1500) {
                     break label60;
                  }

                  this.var_84 = 3;
                  if(this.var_98 == 0) {
                     this.var_376 = var2.var_341;
                     break label60;
                  }

                  var10 = this;
                  var10001 = true;
               }

               var10.sub_7fe(var10001, false);
            }

            if(!this.var_9f4) {
               if(this.var_98 == 0 && var6 < 0 && Class_df.var_105e == 3) {
                  this.var_376 = var2.var_341;
                  this.var_341 = this.var_376;
                  this.var_63f = Class_df.var_44e8.var_676;
                  this.var_70e = Class_df.var_44e8.var_74c;
               }

               this.var_5d4 += var1 * (-this.var_5d4 * 12 >> 4) >> 12;
               this.var_376 = var7;
            }

            this.sub_e2a(var1, this.sub_7ab(var3), false);
         }
      }
   }

   private void sub_8c7(int var1, int var2, int var3) {
      boolean var4 = false;
      boolean var5 = false;
      if(this.var_a60) {
         this.sub_629(var1, var2);
         if(this.var_a22 > 11469) {
            sub_45e(var_f8f, 19, var1, var2, 12288 - this.var_a22, 819);
            return;
         }
      } else {
         int var6 = this.var_46f == 0?0:1;
         int var7 = this.var_46f < 0?0:1;
         Class_df.sub_a18(var6, var3, var1, var2, var7);
         if(!Class_df.var_11b3 && this.var_98 >= 0) {
            this.sub_4bc(var1, var2, var3);
         }
      }

   }

   static void sub_919() {
      Class_9b var1 = Class_df.var_46d6;
      if(!Class_df.var_46d6.var_48) {
         var1.sub_67b(Class_df.var_44e8, 20480);
         int var2 = Class_df.var_3694[var1.var_532] >> 2 & 3;
         int var3 = Class_df.var_3694[var1.var_532] >> 4 & 3;
         if(var2 + var3 < Class_df.var_349d) {
            int var0 = Class_6b.sub_496(0, 2) == 0?var2:Class_df.var_349d - var3 - 1;
            var1.var_5d4 = Class_df.var_3542 + Class_df.var_3508 * var0;
            var1.var_48 = true;
            var1.var_5fa = var1.var_5d4;
            var1.var_676 = var1.var_63f;
            var1.var_57c = var1.var_532;
            var1.var_74c = var1.var_70e;
            var1.var_84 = 0;
         }
      }
   }

   final void sub_943(int var1) {
      if(this.var_48) {
         if(this.var_84 == 0) {
            if(this.sub_cb()) {
               if(Class_df.var_44e8.var_2f5 >= 3) {
                  this.var_84 = 2;
                  this.var_856 = 100;
                  this.var_a22 = 2867;
                  return;
               }

               Class_df.var_44e8.sub_fa(0);
               this.var_84 = 1;
               return;
            }

            if(this.sub_d2c(Class_df.var_44e8) >= 0) {
               return;
            }
         } else {
            if(this.var_84 != 2) {
               return;
            }

            if(this.var_a22 > 0) {
               this.var_a22 -= var1;
            }

            this.sub_67b(Class_df.var_44e8, this.var_856);
            Class_9b var10000;
            int var10001;
            int var10002;
            int var10003;
            if(this.var_5d4 > 0) {
               var10000 = this;
               var10001 = this.var_5d4;
               var10002 = Math.min(Math.max(var1, 0), 4096);
               var10003 = this.sub_e88() + 200;
            } else {
               var10000 = this;
               var10001 = this.var_5d4;
               var10002 = Math.min(Math.max(var1, 0), 4096);
               var10003 = this.sub_e7d() - 200;
            }

            var10000.var_5d4 = var10001 + (var10002 * (var10003 - this.var_5d4) >> 12);
            this.var_856 -= 200 * var1 >> 12;
            if(this.var_856 >= -1000) {
               return;
            }
         }

         this.var_48 = false;
      }
   }

   private void sub_972(int var1, int var2, int var3) {
      if(this.var_84 == 0) {
         Class_df.sub_a18(4, var3, var1, var2, 0);
         sub_424(var3, var1, var2, -3, 38, -1, 38, 4, 37, 8, 36);
      } else {
         if(this.var_84 == 2) {
            var_f8f.sub_410(Class_df.var_3ec, this.var_5d4 > 0?0:2, this.var_a22 > 0?0:1, var1, var2, 0);
            if(this.var_a22 > 0) {
               sub_45e(var_f8f, 19, var1, var2, 2867 - this.var_a22, 2867);
            }
         }

      }
   }

   final void sub_994(int var1, int var2, int var3, int var4) {
      this.var_5d4 = 0;
      this.var_5fa = this.var_5d4;
      this.var_70e = var1;
      this.var_532 = var2;
      this.var_63f = var3;
      this.sub_df2(var4);
      this.var_74c = this.var_70e;
      this.var_676 = this.var_63f;
      this.var_57c = this.var_532;
      this.var_68f = 0;
      this.var_8c4 = 0;
      this.var_856 = 0;
      this.var_8ac = 0;
      this.var_341 = 0;
      this.var_388 = 0;
      this.var_3a9 = 0;
      this.var_2f5 = 1;
      this.var_376 = this.var_21b[this.var_2f5];
      this.var_9f4 = false;
      this.var_a22 = 0;
      this.var_a60 = false;
      this.var_442 = 0;
      this.var_46f = 0;
      this.var_4a7 = this.var_46f;
      if(this.var_c == 0) {
         var_aae = 0;
         var_b12 = 1228;
         this.var_98 = 2;
      }

      this.var_84 = -1;
      this.var_96e = 0;
   }

   final void sub_9df() {
      this.var_21b = null;
      this.var_d3 = null;
      System.gc();
   }

   final void sub_a41(int var1) {
      this.var_4a7 = this.var_46f;
      sub_5e9(var1);
      if(var_b9b > 0) {
         var_b9b -= var1;
      }

      Class_9b var14;
      int var10000;
      int var10001;
      if(Class_df.var_11b3) {
         this.var_442 = 0;
         var_1139 = 0;
         this.var_341 -= 113777 * var1 >> 12;
         if(this.var_341 < 0) {
            this.var_341 = 0;
         }

         this.var_376 = this.var_341;
         this.sub_e2a(var1, 0, false);
         var_dfc += var1;
         if(!this.var_a60) {
            if(!this.var_2af && (this.var_70e > Class_df.var_48e7 || Class_df.var_105e != 2 && Class_df.var_105e != 3)) {
               this.var_2f5 = 1;
               if(this.var_341 > 68266) {
                  label293: {
                     if(this.var_46f == 0) {
                        if(var_dfc > 1228) {
                           byte var17;
                           if(this.var_5d4 > 0) {
                              var14 = this;
                              var17 = -1;
                           } else {
                              var14 = this;
                              var17 = 1;
                           }

                           var14.var_46f = var17;
                           var_dfc = 0;
                        }

                        var10000 = -1;
                     } else {
                        if(var_dfc <= 819) {
                           break label293;
                        }

                        label287: {
                           var_dfc = 0;
                           if(this.var_46f < 0) {
                              if(this.var_46f <= -2) {
                                 break label287;
                              }

                              var14 = this;
                              var10001 = this.var_46f - 1;
                           } else {
                              if(this.var_46f <= 0 || this.var_46f >= 2) {
                                 break label287;
                              }

                              var14 = this;
                              var10001 = this.var_46f + 1;
                           }

                           var14.var_46f = var10001;
                        }

                        var10000 = this.var_46f < 0?11:13;
                     }

                     var_da7 = var10000;
                  }

                  if(this.var_68f == 0) {
                     this.sub_b98(var1, 2048, 1, this.var_46f != 0 || var_b39 > 2048);
                  }
               } else {
                  sub_b6a();
                  var_da7 = -1;
               }
            } else {
               this.var_2f5 = 0;
               var_da7 = -1;
               this.var_46f = 0;
               sub_b6a();
            }
         }

         Class_df.var_2017 |= 65536;
      } else {
         boolean var3;
         int var2 = (var3 = this.var_68f == 0)?0:this.var_442 + ((this.var_442 >> 4) * var1 >> 12);
         byte var4 = Class_df.var_46b[5];
         byte var5 = Class_df.var_46b[1];
         boolean var6 = var4 == 1 || var5 == 1;
         boolean var8 = var4 > 0 || var5 > 0;
         if(!this.var_a60) {
            label421: {
               if(Class_df.var_46b[3] > 0) {
                  var10000 = -this.var_3e5;
               } else {
                  if(Class_df.var_46b[4] <= 0) {
                     break label421;
                  }

                  var10000 = this.var_3e5;
               }

               var2 = var10000;
            }

            if(Class_df.var_46b[2] > 0) {
               if(this.var_2f5 != 0) {
                  var_b39 = 3276;
                  if(this.var_2f5 > 1) {
                     var_1139 = 0;
                  }

                  this.var_2f5 = 0;
                  Class_df.var_2d85 = 6144;
               }
            } else if(var8 && Class_df.var_1f1f >= 1024) {
               if(var6) {
                  if(this.var_2f5 < 2) {
                     this.sub_a86(2);
                  } else if(this.var_2f5 == 2) {
                     this.sub_a86(3);
                  }
               } else if(var8 && this.var_2f5 == 2 && var_1139 < 12288) {
                  this.sub_a86(3);
               }
            } else if(var_1139 <= 0) {
               this.var_2f5 = 1;
            }
         }

         if(var_1139 > 0) {
            var_1139 -= var1;
            if(var_1139 <= 0) {
               if(var8 && Class_df.var_1f1f >= 1024) {
                  var_1139 = 20480;
                  Class_df.var_1f1f -= 1024;
                  Class_df.var_2017 |= 524288;
               } else {
                  this.var_2f5 = 1;
                  Class_df.var_2d85 = 6144;
               }
            }
         }

         if(!var3) {
            var14 = this;
            var10001 = this.var_341;
         } else {
            var14 = this;
            var10001 = this.var_21b[this.var_2f5];
         }

         var14.var_376 = var10001;
         if(this.var_96e != 0 && this.var_2f5 != 0 && var3) {
            if(this.var_2f5 >= 2) {
               var14 = this;
               var10001 = this.var_376 * 3 >> 2;
            } else if(this.var_96e == 1) {
               var14 = this;
               var10001 = 136533;
            } else {
               var14 = this;
               var10001 = '\ude38';
            }

            var14.var_376 = var10001;
         }

         if(this.var_2f5 > 0 && this.var_341 == 0) {
            var_b39 = 3276;
         }

         if(var_b39 > 0) {
            var_b39 -= var1;
            if(this.var_2f5 < 1 && this.var_341 < '\ude38') {
               var_b39 = 0;
            }
         }

         this.sub_e2a(var1, var2, var3 && !this.var_a60);
         if(this.var_74c != this.var_70e) {
            Class_df.var_2017 |= 8;
         }

         var3 = this.var_68f == 0;
         if(this.var_341 > 0 && var3) {
            label389: {
               if(this.var_96e == 2) {
                  var10000 = 17;
               } else {
                  if(this.var_96e != 1) {
                     break label389;
                  }

                  var10000 = this.var_9d1 == 1?15:16;
               }

               sub_542(var10000, 2048, false, 10);
            }
         }

         int var9;
         label480: {
            if(this.var_2f5 != 0 && this.var_341 != 0) {
               int var13 = this.var_442;
               var9 = this.var_3e5 * 200 >> 10;
               int var10 = this.var_3e5 * 800 >> 10;
               int var11 = this.var_3e5 * 150 >> 10;
               int var12 = this.var_3e5 * 700 >> 10;
               if(var13 > -var10 && (var13 > -var12 || this.var_4a7 != -2)) {
                  if(var13 < var10 && (var13 < var12 || this.var_4a7 != 2)) {
                     if(var13 > -var9 && (var13 > -var11 || this.var_4a7 != -1)) {
                        if(var13 < var9 && (var13 < var11 || this.var_4a7 != 1)) {
                           if(this.var_46f > 0) {
                              var14 = this;
                              var10001 = this.var_46f - 1;
                           } else {
                              if(this.var_46f >= 0) {
                                 break label480;
                              }

                              var14 = this;
                              var10001 = this.var_46f + 1;
                           }
                        } else {
                           var14 = this;
                           var10001 = 1;
                        }
                     } else {
                        var14 = this;
                        var10001 = -1;
                     }
                  } else {
                     var14 = this;
                     var10001 = 2;
                  }
               } else {
                  var14 = this;
                  var10001 = -2;
               }
            } else {
               var14 = this;
               var10001 = 0;
            }

            var14.var_46f = var10001;
         }

         if(this.var_920) {
            short var15;
            byte var16;
            boolean var10002;
            byte var10003;
            if(this.var_a60) {
               if(this.var_68f == 0) {
                  var16 = 20;
                  var15 = 6144;
                  var10002 = false;
                  var10003 = 0;
               } else {
                  var16 = 19;
                  var15 = 2457;
                  var10002 = false;
                  var10003 = 1;
               }
            } else {
               if((var9 = (this.var_6ce << 12) / 300) > 4096) {
                  var9 = 4096;
               }

               Class_df.sub_12e4(819 + (1638 * var9 >> 12), 0, 1, 6 * var9 >> 12);
               Class_df.sub_d62(3);
               var16 = 8;
               var15 = 2048;
               var10002 = false;
               var10003 = 10;
            }

            sub_542(var16, var15, var10002, var10003);
         }

         if(this.var_341 << 1 >> 12 != this.var_341 - this.var_388 << 1 >> 12) {
            Class_df.var_2017 |= 65536;
         }

         if(this.var_5d4 >= Class_df.var_32be + Class_df.var_331e) {
            var14 = this;
            var10001 = Class_df.var_32be + Class_df.var_331e;
         } else if(this.var_5d4 <= -(Class_df.var_32be + Class_df.var_331e)) {
            var14 = this;
            var10001 = -(Class_df.var_32be + Class_df.var_331e);
         }

         for(var14.var_5d4 = var10001; var_c5f < this.var_266.length - 1 && this.var_341 > this.var_266[var_c5f]; ++var_c5f) {
            ;
         }

         while(var_c5f > 1 && this.var_341 < this.var_266[var_c5f - 1]) {
            --var_c5f;
         }

         if(this.var_341 > 0) {
            if(this.var_341 > 227555) {
               var_111b -= var1;
               if(var_111b < 0) {
                  var_111b += 4096;
                  Class_df.sub_d62(this.var_341 > 341333?1:0);
               }
            }

            if((var9 = (var9 = this.var_5d4 + Class_df.var_32be) < 0?var9 / Class_df.var_3508 - 1:var9 / Class_df.var_3508) < Class_df.var_349d && var9 >= 0 && (Class_df.var_35ac >> Class_df.var_349d - var9 - 1 & 1) == 0) {
               var_10e5 -= var1;
               if(var_10e5 < 0) {
                  var_10e5 += 4096;
                  Class_df.sub_d62(2);
               }
            }

            this.sub_ac6(var1);
         }

         if(!this.var_2af) {
            if(var3) {
               if(this.var_4a7 != this.var_46f || this.var_920) {
                  if(Math.abs(this.var_46f) == 2) {
                     var_da7 = this.var_46f < 0?11:13;
                     var_dfc = 0;
                  } else if(Math.abs(this.var_4a7) == 2) {
                     var_da7 = -1;
                     if(var_dfc > 4096) {
                        Class_df.sub_d62(4);
                     }
                  }

                  if(this.var_4a7 == 0) {
                     sub_b6a();
                  }
               }
            } else if(var_da7 >= 0) {
               var_da7 = -1;
            }
         }

         if(var_da7 >= 0) {
            var_dfc += var1;
         }

         if(!var3) {
            sub_b6a();
         } else {
            this.sub_b98(var1, 2048, 1, this.var_46f != 0 || var_b39 > 2048);
         }
      }
   }

   private void sub_a86(int var1) {
      this.var_2f5 = var1;
      Class_df.var_2d85 = 6144;
      short var10000;
      byte var10001;
      byte var10002;
      byte var10003;
      if(this.var_2f5 == 2) {
         Class_df.var_2aca = 250;
         var10000 = 6144;
         var10001 = 0;
         var10002 = 1;
         var10003 = 2;
      } else {
         Class_df.var_2aca = 150;
         var10000 = 6144;
         var10001 = 0;
         var10002 = 1;
         var10003 = 3;
      }

      Class_df.sub_12e4(var10000, var10001, var10002, var10003);
      var_1139 = 20480;
      Class_df.var_1f1f -= 1024;
      Class_df.var_2017 |= 524288;
   }

   final void sub_ac6(int var1) {
      var_b12 -= var1;
      if(var_b12 <= 0) {
         var_aae = Class_6b.sub_496(-1, 2);
         int var10000;
         short var10001;
         if(this.var_46f == 0) {
            var10000 = var_b12;
            var10001 = 1228;
         } else if(Math.abs(this.var_46f) == 1) {
            var10000 = var_b12;
            var10001 = 819;
         } else {
            var10000 = var_b12;
            var10001 = 409;
         }

         var_b12 = var10000 + var10001;
      }

   }

   private void sub_af8(int var1, int var2) {
      if(Class_df.var_4832) {
         Class_df.var_23b2[23].sub_429(Class_df.var_3ec, this.var_5d4 < 0?2:1, var1, var2, 0);
      }

      if(var_b9b > 0) {
         sub_45e(Class_df.var_23b2[var_bd5], var_be1, var1 + var_c2f, var2, 1638 - var_b9b, 1638);
      }

      var2 += var_aae;
      if(this.var_a60) {
         this.sub_629(var1, var2);
      } else {
         if(this.var_68f == 0 && (var_b39 > 0 || var_da7 >= 0)) {
            this.sub_bf6(16, 0);
         }

         int var10000;
         int var3;
         int var4;
         if(this.var_2af) {
            label105: {
               this.var_8ac = 0;
               var3 = 2;
               if(this.var_2f5 == 0) {
                  var10000 = 5;
               } else {
                  label103: {
                     if(this.var_68f == 0) {
                        if(this.var_46f != 0) {
                           var10000 = 2 + this.var_46f;
                           break label103;
                        }

                        if(20480 - var_1139 >= 4096) {
                           break label105;
                        }
                     }

                     this.var_8ac = 1;
                     var10000 = 6;
                  }
               }

               var3 = var10000;
            }

            var4 = this.var_341 > 0?Class_df.var_4a02 & 1:0;
            var_e7b.sub_410(Class_df.var_3ec, var3, var4, var1, var2, 0);
         } else {
            short var7;
            if(this.var_46f == 0) {
               var4 = this.var_2f5 == 0?5:2;
               var7 = -1;
            } else {
               var4 = 2 + this.var_46f;
               var7 = this.var_d3[(this.var_46f & 1) == 1?10:11];
            }

            short var6 = var7;
            this.sub_b59(var1, var2, var4, var6);
            if(this.var_46f == 0 && this.var_2f5 > 0) {
               if(this.var_532 != this.var_57c) {
                  byte var10001;
                  if((Class_df.var_3b5b[this.var_532] & 192) == 192) {
                     var10000 = this.var_532;
                     var10001 = 3;
                  } else {
                     var10000 = this.var_532;
                     var10001 = 7;
                  }

                  if((var10000 & var10001) == 0) {
                     this.var_98 = 0;
                  }
               }

               if(this.var_98 < 2) {
                  var_e7b.sub_410(Class_df.var_3ec, 8, this.var_98, var1, var2, 0);
                  ++this.var_98;
               }
            }
         }

         var3 = 0;
         if(Class_df.var_105e == 3) {
            var3 = 32;
         }

         if(this.var_68f == 0) {
            var3 |= 8;
         }

         if(this.var_2f5 > 1) {
            var3 |= 2;
         }

         this.sub_bf6(var3, var_aae);
      }

      if(this.var_68f != 0 || this.var_2f5 <= 1) {
         sub_59b(var1 - this.var_46f * 17, var2);
      }

      if(!Class_df.var_22a5 && !Class_df.var_4832) {
         Class_df.sub_d31(var1, var2 - 30);
      }

   }

   private void sub_b59(int var1, int var2, int var3, int var4) {
      int var5 = Class_df.var_4a02 & 1;
      if(this.var_341 == 0) {
         var5 = 0;
      }

      if(var4 >= 0) {
         int var6 = var_e7b.sub_314(var3, var5);
         int var7 = var_e7b.sub_258(var6, 0);
         int var8 = var1 + var_e7b.sub_1e1(var6, 0);
         if((var7 & 1) != 0) {
            var8 += var_e7b.sub_270(var6, 0);
         }

         int var9 = var2 + var_e7b.sub_21c(var6, 0);
         if((var7 & 2) != 0) {
            var9 += var_e7b.sub_2be(var6, 0);
         }

         var_ea1.sub_410(Class_df.var_3ec, var4, var5, var8, var9, var7);
      }

      var_e7b.sub_410(Class_df.var_3ec, var3, var5, var1, var2, 0);
   }

   static void sub_b6a() {
      for(int var0 = 0; var0 < 5; ++var0) {
         var_1179[var0] = 0;
      }

      var_11f6 = 0;
      var_1200 = 0;
   }

   final void sub_b98(int var1, int var2, int var3, boolean var4) {
      for(int var5 = 0; var5 < 5; ++var5) {
         if(var_1179[var5] > 0) {
            var_1179[var5] -= var1;
         }
      }

      if(var4) {
         if(var_11f6 > 0) {
            var_11f6 -= var1;
         }

         if(var_11f6 <= 0) {
            var_1179[var_1200] = var2;
            var_1197[var_1200] = var2;
            var_11f6 = 409;
            var_11a8[var_1200] = this.var_767 + Class_6b.sub_496(-var3, var3 + 1);
            var_11d2[var_1200] = this.var_7b7;
            var_1200 = (var_1200 + 1) % 5;
         }
      }

   }

   private void sub_bf6(int var1, int var2) {
      byte[][] var10000;
      int var10001;
      if(this.var_8ac == 0) {
         var10000 = var_a93;
         var10001 = this.var_46f + 2;
      } else {
         var10000 = var_a93;
         var10001 = 5;
      }

      byte[] var3;
      if((var3 = var10000[var10001]) != null) {
         int var8 = var3.length;
         int var4 = 0;

         while(var4 < var8) {
            byte var5 = var3[var4++];
            int var6 = var3[var4++] + var2;
            byte var7;
            boolean var9 = ((var7 = var3[var4++]) & 128) != 0;
            int var10;
            int var11;
            int var12;
            int var13;
            int var15;
            if(((var15 = var7 & var1) & 8) != 0) {
               for(var13 = 0; var13 < 5; ++var13) {
                  if(var_1179[var13] > 0) {
                     var10 = (var_1197[var13] - var_1179[var13] << 12) / var_1197[var13];
                     var11 = 2048 + (3072 * var10 >> 12);
                     var12 = 30 * var10 >> 12;
                     Class_df.sub_a18(6, var11, var_11a8[var13] + var5, var_11d2[var13] + var6 + var12, 0);
                  }
               }
            }

            if((var15 & 2) != 0) {
               var10 = 0;
               if(this.var_2f5 == 3) {
                  ++var10;
               }

               var_fcd.sub_410(Class_df.var_3ec, var10, Class_df.var_4a02 & 1, this.var_767 + var5, this.var_7b7 + var6, var9?1:0);
            }

            if((var15 & 16) != 0) {
               var11 = var5 * 17 + Class_df.var_2c34 * 2 >> 4;
               Class_df.var_3ec.setColor(Class_df.var_343d);
               var12 = this.var_767 + var5;
               var13 = this.var_7b7 + var6;

               for(int var14 = -2; var14 < 2; ++var14) {
                  Class_df.var_3ec.drawLine(var12 + var14, var13, var12 + var14 + var11, var13 + 50);
               }
            }

            if((var15 & 32) != 0) {
               var_f8f.sub_410(Class_df.var_3ec, 21, Class_df.var_4a02 & 1, this.var_767 + var5, this.var_7b7 + var6, var9?1:0);
            }
         }

      }
   }

   private static int sub_c47(int var0, int var1, int var2) {
      byte var4 = Class_df.var_349d;
      int var5 = Class_df.var_3694[var2] >> 2 & 3;
      int var6 = Class_df.var_3694[var2] >> 4 & 3;

      int var3;
      for(var3 = 0; var3 < var4; ++var3) {
         if((var0 >> var4 - var3 - 1 & 1) == 1) {
            --var1;
         }

         if(var1 <= 0 && var3 > var5 - 1 && var3 < var4 - var6) {
            return var3;
         }
      }

      for(var3 = 0; var3 < Class_df.var_349d; ++var3) {
         if((var0 >> var4 - var3 - 1 & 1) == 1 && var3 > var5 - 1 && var3 < var4 - var6) {
            return var3;
         }
      }

      return -1;
   }

   final void sub_c9b(int var1) {
      if(this.var_48) {
         this.var_5fa = this.var_5d4;
         this.var_57c = this.var_532;
         this.var_676 = this.var_63f;
         this.var_74c = this.var_70e;
         if((Class_df.var_3b22[(this.var_532 + 5) % Class_df.var_35f4] & '\uf000') == '\u8000') {
            this.var_84 = 2;
         }

         int var2;
         if(this.var_9f4) {
            this.var_84 = 1;
         } else {
            if(this.var_341 != this.var_376) {
               label93: {
                  var2 = '\u8555' * var1 >> 12;
                  if(this.var_341 < this.var_376) {
                     this.var_341 += var2;
                     if(this.var_341 <= this.var_376) {
                        break label93;
                     }
                  } else {
                     this.var_341 -= var2;
                     if(this.var_341 >= this.var_376) {
                        break label93;
                     }
                  }

                  this.var_341 = this.var_376;
               }
            }

            int var10000;
            if(this.var_84 != 0) {
               label85: {
                  int var4 = Class_df.var_3694[this.var_532] & 3;
                  short var10001;
                  if(Class_df.var_44e8.var_5d4 - this.var_5d4 < 0) {
                     if(var4 != 3 && var4 != 2) {
                        var10000 = this.sub_e88() + 200;
                        break label85;
                     }

                     var10000 = this.sub_e88() - this.var_d3[6];
                     var10001 = 50;
                  } else {
                     if(var4 == 3 || var4 == 1) {
                        var10000 = this.sub_e7d() + this.var_d3[6] + 50;
                        break label85;
                     }

                     var10000 = this.sub_e7d();
                     var10001 = 200;
                  }

                  var10000 -= var10001;
               }

               int var3;
               label67: {
                  var3 = var10000;
                  if(this.var_376 < 0) {
                     this.var_376 += 79644;
                     if(this.var_376 <= 0) {
                        break label67;
                     }
                  } else {
                     if(this.var_376 <= 0) {
                        break label67;
                     }

                     this.var_376 -= 79644;
                     if(this.var_376 >= 0) {
                        break label67;
                     }
                  }

                  this.var_376 = 0;
               }

               var10000 = var3;
            } else {
               var10000 = this.var_8ac;
            }

            var2 = var10000 - this.var_5d4;
            this.var_442 += Math.min(Math.max(var1 << 2, 0), 4096) * (var2 - this.var_442) >> 12;
         }

         this.var_5d4 += this.var_442 * var1 >> 12;
         this.var_3a9 = (this.var_341 * var1 >> 12) / 40;
         this.sub_df2(this.var_3a9);
         if((var2 = this.sub_d2c(Class_df.var_44e8)) < -5620 || var2 > 15860) {
            this.var_48 = false;
            return;
         }
      } else if(Class_df.var_4543) {
         Class_df.var_459c -= var1;
         if(Class_df.var_459c <= 0) {
            Class_df.var_459c = Class_df.var_37a2;
            boolean var6 = Class_6b.sub_496(0, 100) < 20;
            boolean var7 = Class_df.var_44e8.var_341 > Class_df.var_44e8.var_21b[1] >> 2;
            this.sub_ced(var6, var7);
         }
      }

   }

   private void sub_ced(boolean var1, boolean var2) {
      if(!Class_df.var_11b3) {
         this.var_442 = 0;
         this.var_388 = 0;
         this.var_3a9 = 0;
         this.var_68f = 0;
         this.var_9f4 = false;
         this.var_a22 = 0;
         this.var_a60 = false;
         int var6 = !var1 && !var2?-1000:10240;
         this.sub_67b(Class_df.var_44e8, var6);
         this.var_676 = this.var_63f;
         this.var_57c = this.var_532;
         this.var_5fa = this.var_5d4;
         this.var_74c = this.var_70e;
         int var10000;
         int var5;
         if(var1) {
            var5 = Class_df.var_349d - Class_df.var_3578;
            var10000 = ~Class_df.var_35ac;
         } else {
            var5 = Class_df.var_3578;
            var10000 = Class_df.var_35ac;
         }

         int var4 = var10000;
         int var3 = Class_6b.sub_496(1, var5 + 1);
         this.var_341 = 147911 - var3 * '\ub1c7' / var5;
         if(var1) {
            this.var_341 = -(this.var_341 >> 3);
         }

         this.var_376 = this.var_341;
         if((var3 = sub_c47(var4, var3, this.var_532)) >= 0) {
            this.var_5d4 = Class_df.var_3542 + Class_df.var_3508 * var3;
            this.var_8ac = this.var_5d4;
            this.var_442 = 0;
            this.var_84 = 0;
            this.var_48 = true;
         }
      }
   }

   private void sub_d07(int var1, int var2, int var3) {
      Class_df.sub_a18(this.var_376 < 0?3:2, var3, var1, var2, 0);
   }

   final int sub_d2c(Class_9b var1) {
      return sub_dbb(this.var_70e, this.var_532, this.var_63f, var1.var_70e, var1.var_532, var1.var_63f);
   }

   private int sub_d76(Class_9b var1) {
      return sub_dbb(this.var_74c, this.var_57c, this.var_676, var1.var_74c, var1.var_57c, var1.var_676);
   }

   private static int sub_dbb(int var0, int var1, int var2, int var3, int var4, int var5) {
      return ((var0 - var3) * Class_df.var_35f4 + (var1 - var4) << 10) + var2 - var5;
   }

   final void sub_df2(int var1) {
      this.var_63f += var1;

      while(this.var_63f >= 1024) {
         if(this.var_c == 0) {
            Class_df.var_2cce += Class_df.var_3629[this.var_532];
            Class_df.var_2d25 += Class_df.var_363f[this.var_532];
         }

         this.var_63f -= 1024;
         ++this.var_532;
         if(this.var_532 == Class_df.var_35f4) {
            ++this.var_70e;
            this.var_532 = 0;
         }
      }

      while(this.var_63f < 0) {
         this.var_63f += 1024;
         --this.var_532;
         if(this.var_532 < 0) {
            this.var_532 = Class_df.var_35f4 - 1;
            --this.var_70e;
         }
      }

   }

   private void sub_e2a(int var1, int var2, boolean var3) {
      this.var_5fa = this.var_5d4;
      this.var_676 = this.var_63f;
      this.var_57c = this.var_532;
      this.var_74c = this.var_70e;
      int var7;
      Class_9b var10000;
      int var10001;
      if(!this.var_9f4) {
         label102: {
            if(this.var_376 == 0) {
               this.var_388 = -(this.var_1d2 * var1 >> 12);
               this.var_341 += this.var_388;
               if(this.var_341 >= 0) {
                  break label102;
               }

               var10000 = this;
               var10001 = 0;
            } else {
               int var4 = this.var_175;
               this.var_388 = this.var_341;
               this.var_341 += Math.min(Math.max(var1 * var4 >> 12, 0), 4096) * (this.var_376 - this.var_341) >> 12;
               this.var_388 = this.var_341 - this.var_388;
               var10000 = this;
               var10001 = this.var_341 + (2000 * var1 >> 12);
            }

            var10000.var_341 = var10001;
         }

         if(this.var_341 == 0) {
            this.var_442 = 0;
            if(this.var_c == 0) {
               var_10c1 = 0;
            }
         } else {
            label96: {
               label95: {
                  if(var2 == 0) {
                     if(Math.abs(var7 = var1 * this.var_3e5 / this.var_d3[1]) >= Math.abs(this.var_442)) {
                        var10000 = this;
                        var10001 = 0;
                        break label95;
                     }

                     if(this.var_442 >= 0) {
                        if(this.var_442 <= 0) {
                           break label96;
                        }

                        var10000 = this;
                        var10001 = this.var_442 - var7;
                        break label95;
                     }
                  } else {
                     var7 = var1 * (var2 - this.var_442) / this.var_d3[0];
                     if(this.var_442 != var2 && var7 == 0) {
                        var7 = var2 >= 0?1:-1;
                     }

                     if(this.var_68f != 0) {
                        var7 <<= 1;
                     }
                  }

                  var10000 = this;
                  var10001 = this.var_442 + var7;
               }

               var10000.var_442 = var10001;
            }
         }
      }

      var7 = this.var_341;
      if(this.var_c == 0) {
         var_c51 = var7 > 261688?var7 - 261688 - (var7 - 261688 >> 1):0;
      }

      var7 -= var_c51;
      if(var3) {
         int var8 = (Class_df.var_3629[this.var_532] << 12) / 91;
         int var9 = (var7 << 12) / 91022;
         int var10 = (1100 * var9 >> 12) * var8 >> 12;
         this.var_5d4 += var10 * var1 >> 12;
         var_10c1 = var10;
      }

      int var10002;
      if(this.var_68f == 0) {
         var10000 = this;
         var10001 = this.var_5d4;
         var10002 = this.var_442;
      } else {
         var10000 = this;
         var10001 = this.var_5d4;
         var10002 = this.var_442 >> 1;
      }

      var10000.var_5d4 = var10001 + (var10002 * var1 >> 12);
      this.var_3a9 = (var7 * var1 >> 12) / 40;
      int var6 = Class_df.var_363f[this.var_532];
      this.sub_df2(this.var_3a9);
      this.var_856 = Class_df.var_363f[this.var_532];
      this.var_920 = false;
      if(this.var_68f == 0) {
         if(var6 - this.var_856 > 22) {
            this.var_8c4 = Class_6b.var_361[512 - var6 & 2047] * this.var_3a9 / var1;
            this.var_68f = (this.var_8c4 >> 12) * var1 >> 12;
            this.var_68f -= Class_6b.var_361[512 - this.var_856 & 2047] * this.var_63f >> 12;
            this.var_6ce = this.var_68f;
         }
      } else {
         this.var_68f += (this.var_8c4 >> 12) * var1 >> 12;
         this.var_68f -= Class_6b.var_361[512 - this.var_856 & 2047] * this.var_3a9 >> 12;
         if(this.var_68f > this.var_6ce) {
            this.var_6ce = this.var_68f;
         }

         this.var_8c4 -= var1 * 2200;
         if(this.var_68f <= 0) {
            this.var_920 = true;
            byte var11;
            if(this.var_a60 && this.var_341 > 0 && this.var_8c4 < -4915200) {
               this.var_8c4 = -this.var_8c4 / 4;
               var10000 = this;
               var11 = 1;
            } else if(this.var_8c4 < -4915200 && this.var_856 == 0) {
               this.var_8c4 = -(this.var_8c4 / 3);
               var10000 = this;
               var11 = 1;
            } else {
               this.var_8c4 = 0;
               var10000 = this;
               var11 = 0;
            }

            var10000.var_68f = var11;
         }
      }

      this.sub_ed5();
   }

   private int sub_e7d() {
      int var1 = Class_df.var_3694[this.var_532] >> 2 & 3;
      return -Class_df.var_32be + var1 * Class_df.var_3508;
   }

   private int sub_e88() {
      int var1 = Class_df.var_3694[this.var_532] >> 4 & 3;
      return Class_df.var_32be - var1 * Class_df.var_3508;
   }

   private void sub_ed5() {
      this.var_96e = 0;
      int var2 = this.var_5d4 - this.var_d3[6 + this.var_46f];
      int var3 = this.var_5d4 + this.var_d3[6 - this.var_46f];
      int var1 = this.sub_e7d();
      Class_9b var10000;
      byte var10001;
      if(var2 < var1) {
         this.var_9d1 = 1;
         if(var3 < var1) {
            var10000 = this;
            var10001 = 2;
         } else {
            var10000 = this;
            var10001 = 1;
         }

         var10000.var_96e = var10001;
      }

      var1 = this.sub_e88();
      if(var3 > var1) {
         this.var_9d1 = 2;
         if(var2 > var1) {
            var10000 = this;
            var10001 = 2;
         } else {
            var10000 = this;
            var10001 = 1;
         }

         var10000.var_96e = var10001;
      }

   }

   final void sub_f18(int var1) {
      if(this.var_a60) {
         Class_9b var10000;
         int var10001;
         if(this.var_a22 > var1) {
            var10000 = this;
            var10001 = this.var_a22 - var1;
         } else {
            var10000 = this;
            var10001 = 0;
         }

         var10000.var_a22 = var10001;
         if(this.var_c == 0) {
            this.var_341 += Math.min(Math.max(var1 * 3 >> 1, 0), 4096) * (0 - this.var_341) >> 12;
            this.var_442 += Math.min(Math.max(var1 * 3 >> 1, 0), 4096) * (0 - this.var_442) >> 12;
            if(this.var_341 < 11377 && Math.abs(this.var_442) < 50 && this.var_68f == 0 && this.var_a22 == 0 && !Class_df.var_11b3) {
               if((!Class_df.var_45ee.var_48 || Class_df.var_45ee.var_a60) && (!Class_df.var_46d6.var_48 || Class_df.var_46d6.var_84 != 1)) {
                  Class_df.var_2659 = 819;
                  Class_df.sub_2a7(44, 40);
                  return;
               }

               Class_df.sub_c6a();
               return;
            }
         } else if(!Class_df.var_11b3) {
            int var2;
            if((var2 = (Class_df.var_44e8.var_341 * 28 >> 5) - 5688) < this.var_341) {
               this.var_341 = var2;
            }

            if(this.var_341 <= 0) {
               this.var_341 = 0;
               this.var_442 = 0;
            }

            if(this.sub_d2c(Class_df.var_44e8) < -1024) {
               this.var_9f4 = false;
               this.var_a60 = false;
               if(this.var_c == 1) {
                  this.sub_7fe(true, true);
                  return;
               }

               if(this.var_c == 3) {
                  sub_195();
                  return;
               }
            }
         }
      } else if(this.var_a22 > 0) {
         this.var_a22 -= var1;
         if(this.var_a22 <= 0) {
            this.var_9f4 = false;
            if(this.var_c != 0) {
               this.var_46f = 0;
            }
         }
      }

   }

}
