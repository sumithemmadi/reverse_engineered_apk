package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

final class vd2 implements ad2 {
  private int b = -1;
  
  private int c = -1;
  
  private int d = 0;
  
  private ByteBuffer e;
  
  private ByteBuffer f;
  
  private boolean g;
  
  public vd2() {
    ByteBuffer byteBuffer = ad2.a;
    this.e = byteBuffer;
    this.f = byteBuffer;
  }
  
  public final void a() {
    flush();
    this.e = ad2.a;
    this.b = -1;
    this.c = -1;
    this.d = 0;
  }
  
  public final boolean b() {
    return (this.g && this.f == ad2.a);
  }
  
  public final boolean c() {
    int i = this.d;
    return (i != 0 && i != 2);
  }
  
  public final void d() {
    this.g = true;
  }
  
  public final void e(ByteBuffer paramByteBuffer) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual position : ()I
    //   4: istore_2
    //   5: aload_1
    //   6: invokevirtual limit : ()I
    //   9: istore_3
    //   10: iload_3
    //   11: iload_2
    //   12: isub
    //   13: istore #4
    //   15: aload_0
    //   16: getfield d : I
    //   19: istore #5
    //   21: iload #5
    //   23: ldc -2147483648
    //   25: if_icmpeq -> 62
    //   28: iload #4
    //   30: istore #6
    //   32: iload #5
    //   34: iconst_3
    //   35: if_icmpeq -> 68
    //   38: iload #5
    //   40: ldc 1073741824
    //   42: if_icmpne -> 54
    //   45: iload #4
    //   47: iconst_2
    //   48: idiv
    //   49: istore #6
    //   51: goto -> 74
    //   54: new java/lang/IllegalStateException
    //   57: dup
    //   58: invokespecial <init> : ()V
    //   61: athrow
    //   62: iload #4
    //   64: iconst_3
    //   65: idiv
    //   66: istore #6
    //   68: iload #6
    //   70: iconst_1
    //   71: ishl
    //   72: istore #6
    //   74: aload_0
    //   75: getfield e : Ljava/nio/ByteBuffer;
    //   78: invokevirtual capacity : ()I
    //   81: iload #6
    //   83: if_icmpge -> 104
    //   86: aload_0
    //   87: iload #6
    //   89: invokestatic allocateDirect : (I)Ljava/nio/ByteBuffer;
    //   92: invokestatic nativeOrder : ()Ljava/nio/ByteOrder;
    //   95: invokevirtual order : (Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
    //   98: putfield e : Ljava/nio/ByteBuffer;
    //   101: goto -> 112
    //   104: aload_0
    //   105: getfield e : Ljava/nio/ByteBuffer;
    //   108: invokevirtual clear : ()Ljava/nio/Buffer;
    //   111: pop
    //   112: aload_0
    //   113: getfield d : I
    //   116: istore #4
    //   118: iload_2
    //   119: istore #6
    //   121: iload #4
    //   123: ldc -2147483648
    //   125: if_icmpeq -> 237
    //   128: iload_2
    //   129: istore #6
    //   131: iload #4
    //   133: iconst_3
    //   134: if_icmpeq -> 193
    //   137: iload #4
    //   139: ldc 1073741824
    //   141: if_icmpne -> 185
    //   144: iload_2
    //   145: iload_3
    //   146: if_icmpge -> 281
    //   149: aload_0
    //   150: getfield e : Ljava/nio/ByteBuffer;
    //   153: aload_1
    //   154: iload_2
    //   155: iconst_2
    //   156: iadd
    //   157: invokevirtual get : (I)B
    //   160: invokevirtual put : (B)Ljava/nio/ByteBuffer;
    //   163: pop
    //   164: aload_0
    //   165: getfield e : Ljava/nio/ByteBuffer;
    //   168: aload_1
    //   169: iload_2
    //   170: iconst_3
    //   171: iadd
    //   172: invokevirtual get : (I)B
    //   175: invokevirtual put : (B)Ljava/nio/ByteBuffer;
    //   178: pop
    //   179: iinc #2, 4
    //   182: goto -> 144
    //   185: new java/lang/IllegalStateException
    //   188: dup
    //   189: invokespecial <init> : ()V
    //   192: athrow
    //   193: iload #6
    //   195: iload_3
    //   196: if_icmpge -> 281
    //   199: aload_0
    //   200: getfield e : Ljava/nio/ByteBuffer;
    //   203: iconst_0
    //   204: invokevirtual put : (B)Ljava/nio/ByteBuffer;
    //   207: pop
    //   208: aload_0
    //   209: getfield e : Ljava/nio/ByteBuffer;
    //   212: aload_1
    //   213: iload #6
    //   215: invokevirtual get : (I)B
    //   218: sipush #255
    //   221: iand
    //   222: sipush #128
    //   225: isub
    //   226: i2b
    //   227: invokevirtual put : (B)Ljava/nio/ByteBuffer;
    //   230: pop
    //   231: iinc #6, 1
    //   234: goto -> 193
    //   237: iload #6
    //   239: iload_3
    //   240: if_icmpge -> 281
    //   243: aload_0
    //   244: getfield e : Ljava/nio/ByteBuffer;
    //   247: aload_1
    //   248: iload #6
    //   250: iconst_1
    //   251: iadd
    //   252: invokevirtual get : (I)B
    //   255: invokevirtual put : (B)Ljava/nio/ByteBuffer;
    //   258: pop
    //   259: aload_0
    //   260: getfield e : Ljava/nio/ByteBuffer;
    //   263: aload_1
    //   264: iload #6
    //   266: iconst_2
    //   267: iadd
    //   268: invokevirtual get : (I)B
    //   271: invokevirtual put : (B)Ljava/nio/ByteBuffer;
    //   274: pop
    //   275: iinc #6, 3
    //   278: goto -> 237
    //   281: aload_1
    //   282: aload_1
    //   283: invokevirtual limit : ()I
    //   286: invokevirtual position : (I)Ljava/nio/Buffer;
    //   289: pop
    //   290: aload_0
    //   291: getfield e : Ljava/nio/ByteBuffer;
    //   294: invokevirtual flip : ()Ljava/nio/Buffer;
    //   297: pop
    //   298: aload_0
    //   299: aload_0
    //   300: getfield e : Ljava/nio/ByteBuffer;
    //   303: putfield f : Ljava/nio/ByteBuffer;
    //   306: return
  }
  
  public final ByteBuffer f() {
    ByteBuffer byteBuffer = this.f;
    this.f = ad2.a;
    return byteBuffer;
  }
  
  public final void flush() {
    this.f = ad2.a;
    this.g = false;
  }
  
  public final int g() {
    return this.c;
  }
  
  public final boolean h(int paramInt1, int paramInt2, int paramInt3) {
    if (paramInt3 == 3 || paramInt3 == 2 || paramInt3 == Integer.MIN_VALUE || paramInt3 == 1073741824) {
      if (this.b == paramInt1 && this.c == paramInt2 && this.d == paramInt3)
        return false; 
      this.b = paramInt1;
      this.c = paramInt2;
      this.d = paramInt3;
      if (paramInt3 == 2)
        this.e = ad2.a; 
      return true;
    } 
    throw new zzii(paramInt1, paramInt2, paramInt3);
  }
  
  public final int i() {
    return 2;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/vd2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */