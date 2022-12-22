package com.bumptech.glide.load.data;

import java.io.FilterInputStream;
import java.io.InputStream;

public final class g extends FilterInputStream {
  private static final byte[] b;
  
  private static final int c;
  
  private static final int d;
  
  private final byte e;
  
  private int f;
  
  static {
    byte[] arrayOfByte = new byte[29];
    arrayOfByte[0] = -1;
    arrayOfByte[1] = -31;
    arrayOfByte[2] = 0;
    arrayOfByte[3] = 28;
    arrayOfByte[4] = 69;
    arrayOfByte[5] = 120;
    arrayOfByte[6] = 105;
    arrayOfByte[7] = 102;
    arrayOfByte[8] = 0;
    arrayOfByte[9] = 0;
    arrayOfByte[10] = 77;
    arrayOfByte[11] = 77;
    arrayOfByte[12] = 0;
    arrayOfByte[13] = 0;
    arrayOfByte[14] = 0;
    arrayOfByte[15] = 0;
    arrayOfByte[16] = 0;
    arrayOfByte[17] = 8;
    arrayOfByte[18] = 0;
    arrayOfByte[19] = 1;
    arrayOfByte[20] = 1;
    arrayOfByte[21] = 18;
    arrayOfByte[22] = 0;
    arrayOfByte[23] = 2;
    arrayOfByte[24] = 0;
    arrayOfByte[25] = 0;
    arrayOfByte[26] = 0;
    arrayOfByte[27] = 1;
    arrayOfByte[28] = 0;
    b = arrayOfByte;
    int i = arrayOfByte.length;
    c = i;
    d = i + 2;
  }
  
  public g(InputStream paramInputStream, int paramInt) {
    super(paramInputStream);
    if (paramInt >= -1 && paramInt <= 8) {
      this.e = (byte)(byte)paramInt;
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Cannot add invalid orientation: ");
    stringBuilder.append(paramInt);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public void mark(int paramInt) {
    throw new UnsupportedOperationException();
  }
  
  public boolean markSupported() {
    return false;
  }
  
  public int read() {
    // Byte code:
    //   0: aload_0
    //   1: getfield f : I
    //   4: istore_1
    //   5: iload_1
    //   6: iconst_2
    //   7: if_icmplt -> 50
    //   10: getstatic com/bumptech/glide/load/data/g.d : I
    //   13: istore_2
    //   14: iload_1
    //   15: iload_2
    //   16: if_icmple -> 22
    //   19: goto -> 50
    //   22: iload_1
    //   23: iload_2
    //   24: if_icmpne -> 35
    //   27: aload_0
    //   28: getfield e : B
    //   31: istore_2
    //   32: goto -> 55
    //   35: getstatic com/bumptech/glide/load/data/g.b : [B
    //   38: iload_1
    //   39: iconst_2
    //   40: isub
    //   41: baload
    //   42: sipush #255
    //   45: iand
    //   46: istore_2
    //   47: goto -> 55
    //   50: aload_0
    //   51: invokespecial read : ()I
    //   54: istore_2
    //   55: iload_2
    //   56: iconst_m1
    //   57: if_icmpeq -> 70
    //   60: aload_0
    //   61: aload_0
    //   62: getfield f : I
    //   65: iconst_1
    //   66: iadd
    //   67: putfield f : I
    //   70: iload_2
    //   71: ireturn
  }
  
  public int read(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    int i = this.f;
    int j = d;
    if (i > j) {
      paramInt1 = super.read(paramArrayOfbyte, paramInt1, paramInt2);
    } else if (i == j) {
      paramArrayOfbyte[paramInt1] = (byte)this.e;
      paramInt1 = 1;
    } else if (i < 2) {
      paramInt1 = super.read(paramArrayOfbyte, paramInt1, 2 - i);
    } else {
      paramInt2 = Math.min(j - i, paramInt2);
      System.arraycopy(b, this.f - 2, paramArrayOfbyte, paramInt1, paramInt2);
      paramInt1 = paramInt2;
    } 
    if (paramInt1 > 0)
      this.f += paramInt1; 
    return paramInt1;
  }
  
  public void reset() {
    throw new UnsupportedOperationException();
  }
  
  public long skip(long paramLong) {
    paramLong = super.skip(paramLong);
    if (paramLong > 0L)
      this.f = (int)(this.f + paramLong); 
    return paramLong;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/data/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */