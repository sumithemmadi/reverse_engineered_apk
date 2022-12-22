package com.google.android.gms.internal.ads;

public abstract class vc2 {
  public static final vc2 a = new uc2();
  
  public final boolean a() {
    return (g() == 0);
  }
  
  public final int b(int paramInt1, xc2 paramxc2, wc2 paramwc2, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: aload_2
    //   3: iconst_0
    //   4: invokevirtual e : (ILcom/google/android/gms/internal/ads/xc2;Z)Lcom/google/android/gms/internal/ads/xc2;
    //   7: pop
    //   8: aload_0
    //   9: iconst_0
    //   10: aload_3
    //   11: iconst_0
    //   12: invokevirtual c : (ILcom/google/android/gms/internal/ads/wc2;Z)Lcom/google/android/gms/internal/ads/wc2;
    //   15: pop
    //   16: iconst_1
    //   17: istore #5
    //   19: iload_1
    //   20: ifne -> 99
    //   23: iload #4
    //   25: ifeq -> 68
    //   28: iload #4
    //   30: iconst_1
    //   31: if_icmpeq -> 63
    //   34: iload #4
    //   36: iconst_2
    //   37: if_icmpne -> 55
    //   40: iload #5
    //   42: istore_1
    //   43: aload_0
    //   44: invokevirtual g : ()I
    //   47: iconst_1
    //   48: isub
    //   49: ifne -> 82
    //   52: goto -> 63
    //   55: new java/lang/IllegalStateException
    //   58: dup
    //   59: invokespecial <init> : ()V
    //   62: athrow
    //   63: iconst_0
    //   64: istore_1
    //   65: goto -> 82
    //   68: iload #5
    //   70: istore_1
    //   71: aload_0
    //   72: invokevirtual g : ()I
    //   75: iconst_1
    //   76: isub
    //   77: ifne -> 82
    //   80: iconst_m1
    //   81: istore_1
    //   82: iload_1
    //   83: iconst_m1
    //   84: if_icmpne -> 89
    //   87: iconst_m1
    //   88: ireturn
    //   89: aload_0
    //   90: iload_1
    //   91: aload_3
    //   92: iconst_0
    //   93: invokevirtual c : (ILcom/google/android/gms/internal/ads/wc2;Z)Lcom/google/android/gms/internal/ads/wc2;
    //   96: pop
    //   97: iconst_0
    //   98: ireturn
    //   99: iload_1
    //   100: iconst_1
    //   101: iadd
    //   102: ireturn
  }
  
  public final wc2 c(int paramInt, wc2 paramwc2, boolean paramBoolean) {
    return d(paramInt, paramwc2, false, 0L);
  }
  
  public abstract wc2 d(int paramInt, wc2 paramwc2, boolean paramBoolean, long paramLong);
  
  public abstract xc2 e(int paramInt, xc2 paramxc2, boolean paramBoolean);
  
  public abstract int f(Object paramObject);
  
  public abstract int g();
  
  public abstract int h();
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/vc2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */