package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.util.u;
import com.google.android.exoplayer2.util.v;
import java.nio.ByteBuffer;

public final class h {
  private static final int[] a = new int[] { 
      2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 
      480, 400, 400, 2048 };
  
  public static void a(int paramInt, v paramv) {
    paramv.I(7);
    byte[] arrayOfByte = paramv.a;
    arrayOfByte[0] = (byte)-84;
    arrayOfByte[1] = (byte)64;
    arrayOfByte[2] = (byte)-1;
    arrayOfByte[3] = (byte)-1;
    arrayOfByte[4] = (byte)(byte)(paramInt >> 16 & 0xFF);
    arrayOfByte[5] = (byte)(byte)(paramInt >> 8 & 0xFF);
    arrayOfByte[6] = (byte)(byte)(paramInt & 0xFF);
  }
  
  public static Format b(v paramv, String paramString1, String paramString2, DrmInitData paramDrmInitData) {
    char c;
    paramv.N(1);
    if ((paramv.z() & 0x20) >> 5 == 1) {
      c = '뮀';
    } else {
      c = '걄';
    } 
    return Format.p(paramString1, "audio/ac4", null, -1, -1, 2, c, null, paramDrmInitData, 0, paramString2);
  }
  
  public static int c(ByteBuffer paramByteBuffer) {
    byte[] arrayOfByte = new byte[16];
    int i = paramByteBuffer.position();
    paramByteBuffer.get(arrayOfByte);
    paramByteBuffer.position(i);
    return (d(new u(arrayOfByte))).e;
  }
  
  public static b d(u paramu) {
    // Byte code:
    //   0: aload_0
    //   1: bipush #16
    //   3: invokevirtual h : (I)I
    //   6: istore_1
    //   7: aload_0
    //   8: bipush #16
    //   10: invokevirtual h : (I)I
    //   13: istore_2
    //   14: iload_2
    //   15: ldc 65535
    //   17: if_icmpne -> 33
    //   20: aload_0
    //   21: bipush #24
    //   23: invokevirtual h : (I)I
    //   26: istore_2
    //   27: bipush #7
    //   29: istore_3
    //   30: goto -> 35
    //   33: iconst_4
    //   34: istore_3
    //   35: iload_2
    //   36: iload_3
    //   37: iadd
    //   38: istore_3
    //   39: iload_3
    //   40: istore_2
    //   41: iload_1
    //   42: ldc 44097
    //   44: if_icmpne -> 51
    //   47: iload_3
    //   48: iconst_2
    //   49: iadd
    //   50: istore_2
    //   51: aload_0
    //   52: iconst_2
    //   53: invokevirtual h : (I)I
    //   56: istore_3
    //   57: iload_3
    //   58: istore_1
    //   59: iload_3
    //   60: iconst_3
    //   61: if_icmpne -> 72
    //   64: iload_3
    //   65: aload_0
    //   66: iconst_2
    //   67: invokestatic f : (Lcom/google/android/exoplayer2/util/u;I)I
    //   70: iadd
    //   71: istore_1
    //   72: aload_0
    //   73: bipush #10
    //   75: invokevirtual h : (I)I
    //   78: istore_3
    //   79: aload_0
    //   80: invokevirtual g : ()Z
    //   83: ifeq -> 99
    //   86: aload_0
    //   87: iconst_3
    //   88: invokevirtual h : (I)I
    //   91: ifle -> 99
    //   94: aload_0
    //   95: iconst_2
    //   96: invokevirtual q : (I)V
    //   99: aload_0
    //   100: invokevirtual g : ()Z
    //   103: ifeq -> 113
    //   106: ldc 48000
    //   108: istore #4
    //   110: goto -> 117
    //   113: ldc 44100
    //   115: istore #4
    //   117: aload_0
    //   118: iconst_4
    //   119: invokevirtual h : (I)I
    //   122: istore #5
    //   124: iload #4
    //   126: ldc 44100
    //   128: if_icmpne -> 148
    //   131: iload #5
    //   133: bipush #13
    //   135: if_icmpne -> 148
    //   138: getstatic com/google/android/exoplayer2/audio/h.a : [I
    //   141: iload #5
    //   143: iaload
    //   144: istore_3
    //   145: goto -> 280
    //   148: iload #4
    //   150: ldc 48000
    //   152: if_icmpne -> 278
    //   155: getstatic com/google/android/exoplayer2/audio/h.a : [I
    //   158: astore_0
    //   159: iload #5
    //   161: aload_0
    //   162: arraylength
    //   163: if_icmpge -> 278
    //   166: aload_0
    //   167: iload #5
    //   169: iaload
    //   170: istore #6
    //   172: iload_3
    //   173: iconst_5
    //   174: irem
    //   175: istore_3
    //   176: iload_3
    //   177: iconst_1
    //   178: if_icmpeq -> 248
    //   181: iload_3
    //   182: iconst_2
    //   183: if_icmpeq -> 228
    //   186: iload_3
    //   187: iconst_3
    //   188: if_icmpeq -> 248
    //   191: iload_3
    //   192: iconst_4
    //   193: if_icmpeq -> 202
    //   196: iload #6
    //   198: istore_3
    //   199: goto -> 267
    //   202: iload #5
    //   204: iconst_3
    //   205: if_icmpeq -> 270
    //   208: iload #5
    //   210: bipush #8
    //   212: if_icmpeq -> 270
    //   215: iload #6
    //   217: istore_3
    //   218: iload #5
    //   220: bipush #11
    //   222: if_icmpne -> 267
    //   225: goto -> 270
    //   228: iload #5
    //   230: bipush #8
    //   232: if_icmpeq -> 270
    //   235: iload #6
    //   237: istore_3
    //   238: iload #5
    //   240: bipush #11
    //   242: if_icmpne -> 267
    //   245: goto -> 270
    //   248: iload #5
    //   250: iconst_3
    //   251: if_icmpeq -> 270
    //   254: iload #6
    //   256: istore_3
    //   257: iload #5
    //   259: bipush #8
    //   261: if_icmpne -> 267
    //   264: goto -> 270
    //   267: goto -> 280
    //   270: iload #6
    //   272: iconst_1
    //   273: iadd
    //   274: istore_3
    //   275: goto -> 267
    //   278: iconst_0
    //   279: istore_3
    //   280: new com/google/android/exoplayer2/audio/h$b
    //   283: dup
    //   284: iload_1
    //   285: iconst_2
    //   286: iload #4
    //   288: iload_2
    //   289: iload_3
    //   290: aconst_null
    //   291: invokespecial <init> : (IIIIILcom/google/android/exoplayer2/audio/h$a;)V
    //   294: areturn
  }
  
  public static int e(byte[] paramArrayOfbyte, int paramInt) {
    int i = paramArrayOfbyte.length;
    byte b = 7;
    if (i < 7)
      return -1; 
    i = (paramArrayOfbyte[2] & 0xFF) << 8 | paramArrayOfbyte[3] & 0xFF;
    if (i == 65535) {
      i = (paramArrayOfbyte[4] & 0xFF) << 16 | (paramArrayOfbyte[5] & 0xFF) << 8 | paramArrayOfbyte[6] & 0xFF;
    } else {
      b = 4;
    } 
    int j = b;
    if (paramInt == 44097)
      j = b + 2; 
    return i + j;
  }
  
  private static int f(u paramu, int paramInt) {
    for (int i = 0;; i = i + 1 << paramInt) {
      i += paramu.h(paramInt);
      if (!paramu.g())
        return i; 
    } 
  }
  
  public static final class b {
    public final int a;
    
    public final int b;
    
    public final int c;
    
    public final int d;
    
    public final int e;
    
    private b(int param1Int1, int param1Int2, int param1Int3, int param1Int4, int param1Int5) {
      this.a = param1Int1;
      this.c = param1Int2;
      this.b = param1Int3;
      this.d = param1Int4;
      this.e = param1Int5;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/audio/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */