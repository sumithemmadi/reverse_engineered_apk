package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

public final class nh2 implements mh2 {
  private final mh2[] b;
  
  private final ArrayList<mh2> c;
  
  private final wc2 d;
  
  private lh2 e;
  
  private vc2 f;
  
  private Object g;
  
  private int h;
  
  private zznh i;
  
  public nh2(mh2... paramVarArgs) {
    this.b = paramVarArgs;
    this.c = new ArrayList<mh2>(Arrays.asList(paramVarArgs));
    this.d = new wc2();
    this.h = -1;
  }
  
  private final void d(int paramInt, vc2 paramvc2, Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: getfield i : Lcom/google/android/gms/internal/ads/zznh;
    //   4: ifnonnull -> 93
    //   7: aload_2
    //   8: invokevirtual g : ()I
    //   11: istore #4
    //   13: iconst_0
    //   14: istore #5
    //   16: iload #5
    //   18: iload #4
    //   20: if_icmpge -> 41
    //   23: aload_2
    //   24: iload #5
    //   26: aload_0
    //   27: getfield d : Lcom/google/android/gms/internal/ads/wc2;
    //   30: iconst_0
    //   31: invokevirtual c : (ILcom/google/android/gms/internal/ads/wc2;Z)Lcom/google/android/gms/internal/ads/wc2;
    //   34: pop
    //   35: iinc #5, 1
    //   38: goto -> 16
    //   41: aload_0
    //   42: getfield h : I
    //   45: iconst_m1
    //   46: if_icmpne -> 60
    //   49: aload_0
    //   50: aload_2
    //   51: invokevirtual h : ()I
    //   54: putfield h : I
    //   57: goto -> 84
    //   60: aload_2
    //   61: invokevirtual h : ()I
    //   64: aload_0
    //   65: getfield h : I
    //   68: if_icmpeq -> 84
    //   71: new com/google/android/gms/internal/ads/zznh
    //   74: dup
    //   75: iconst_1
    //   76: invokespecial <init> : (I)V
    //   79: astore #6
    //   81: goto -> 87
    //   84: aconst_null
    //   85: astore #6
    //   87: aload_0
    //   88: aload #6
    //   90: putfield i : Lcom/google/android/gms/internal/ads/zznh;
    //   93: aload_0
    //   94: getfield i : Lcom/google/android/gms/internal/ads/zznh;
    //   97: ifnull -> 101
    //   100: return
    //   101: aload_0
    //   102: getfield c : Ljava/util/ArrayList;
    //   105: aload_0
    //   106: getfield b : [Lcom/google/android/gms/internal/ads/mh2;
    //   109: iload_1
    //   110: aaload
    //   111: invokevirtual remove : (Ljava/lang/Object;)Z
    //   114: pop
    //   115: iload_1
    //   116: ifne -> 129
    //   119: aload_0
    //   120: aload_2
    //   121: putfield f : Lcom/google/android/gms/internal/ads/vc2;
    //   124: aload_0
    //   125: aload_3
    //   126: putfield g : Ljava/lang/Object;
    //   129: aload_0
    //   130: getfield c : Ljava/util/ArrayList;
    //   133: invokevirtual isEmpty : ()Z
    //   136: ifeq -> 156
    //   139: aload_0
    //   140: getfield e : Lcom/google/android/gms/internal/ads/lh2;
    //   143: aload_0
    //   144: getfield f : Lcom/google/android/gms/internal/ads/vc2;
    //   147: aload_0
    //   148: getfield g : Ljava/lang/Object;
    //   151: invokeinterface d : (Lcom/google/android/gms/internal/ads/vc2;Ljava/lang/Object;)V
    //   156: return
  }
  
  public final kh2 a(int paramInt, ri2 paramri2) {
    int i = this.b.length;
    kh2[] arrayOfKh2 = new kh2[i];
    for (byte b = 0; b < i; b++)
      arrayOfKh2[b] = this.b[b].a(paramInt, paramri2); 
    return new oh2(arrayOfKh2);
  }
  
  public final void b(kh2 paramkh2) {
    oh2 oh2 = (oh2)paramkh2;
    byte b = 0;
    while (true) {
      mh2[] arrayOfMh2 = this.b;
      if (b < arrayOfMh2.length) {
        arrayOfMh2[b].b(oh2.b[b]);
        b++;
        continue;
      } 
      break;
    } 
  }
  
  public final void c() {
    mh2[] arrayOfMh2;
    zznh zznh1 = this.i;
    if (zznh1 == null) {
      arrayOfMh2 = this.b;
      int i = arrayOfMh2.length;
      for (byte b = 0; b < i; b++)
        arrayOfMh2[b].c(); 
      return;
    } 
    throw arrayOfMh2;
  }
  
  public final void e(bc2 parambc2, boolean paramBoolean, lh2 paramlh2) {
    this.e = paramlh2;
    byte b = 0;
    while (true) {
      mh2[] arrayOfMh2 = this.b;
      if (b < arrayOfMh2.length) {
        arrayOfMh2[b].e(parambc2, false, new ph2(this, b));
        b++;
        continue;
      } 
      break;
    } 
  }
  
  public final void f() {
    mh2[] arrayOfMh2 = this.b;
    int i = arrayOfMh2.length;
    for (byte b = 0; b < i; b++)
      arrayOfMh2[b].f(); 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/nh2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */