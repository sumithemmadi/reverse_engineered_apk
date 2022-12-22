package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.kt2;
import com.google.android.gms.internal.ads.ot1;
import com.google.android.gms.internal.ads.sm;
import com.google.android.gms.internal.ads.v3;
import com.google.android.gms.internal.ads.w;
import com.google.android.gms.internal.ads.wl;
import com.google.android.gms.internal.ads.zzl;
import java.util.Map;

public final class x {
  private static v3 a;
  
  private static final Object b = new Object();
  
  @Deprecated
  private static final c0<Void> c = (c0<Void>)new w();
  
  public x(Context paramContext) {
    if (paramContext.getApplicationContext() != null)
      paramContext = paramContext.getApplicationContext(); 
    c(paramContext);
  }
  
  private static v3 c(Context paramContext) {
    // Byte code:
    //   0: getstatic com/google/android/gms/ads/internal/util/x.b : Ljava/lang/Object;
    //   3: astore_1
    //   4: aload_1
    //   5: monitorenter
    //   6: getstatic com/google/android/gms/ads/internal/util/x.a : Lcom/google/android/gms/internal/ads/v3;
    //   9: ifnonnull -> 70
    //   12: aload_0
    //   13: invokestatic a : (Landroid/content/Context;)V
    //   16: invokestatic a : ()Z
    //   19: ifne -> 47
    //   22: getstatic com/google/android/gms/internal/ads/m0.d3 : Lcom/google/android/gms/internal/ads/x;
    //   25: astore_2
    //   26: invokestatic e : ()Lcom/google/android/gms/internal/ads/i0;
    //   29: aload_2
    //   30: invokevirtual c : (Lcom/google/android/gms/internal/ads/x;)Ljava/lang/Object;
    //   33: checkcast java/lang/Boolean
    //   36: invokevirtual booleanValue : ()Z
    //   39: ifeq -> 47
    //   42: iconst_1
    //   43: istore_3
    //   44: goto -> 49
    //   47: iconst_0
    //   48: istore_3
    //   49: iload_3
    //   50: ifeq -> 61
    //   53: aload_0
    //   54: invokestatic b : (Landroid/content/Context;)Lcom/google/android/gms/internal/ads/v3;
    //   57: astore_0
    //   58: goto -> 66
    //   61: aload_0
    //   62: invokestatic a : (Landroid/content/Context;)Lcom/google/android/gms/internal/ads/v3;
    //   65: astore_0
    //   66: aload_0
    //   67: putstatic com/google/android/gms/ads/internal/util/x.a : Lcom/google/android/gms/internal/ads/v3;
    //   70: getstatic com/google/android/gms/ads/internal/util/x.a : Lcom/google/android/gms/internal/ads/v3;
    //   73: astore_0
    //   74: aload_1
    //   75: monitorexit
    //   76: aload_0
    //   77: areturn
    //   78: astore_0
    //   79: aload_1
    //   80: monitorexit
    //   81: aload_0
    //   82: athrow
    // Exception table:
    //   from	to	target	type
    //   6	42	78	finally
    //   53	58	78	finally
    //   61	66	78	finally
    //   66	70	78	finally
    //   70	76	78	finally
    //   79	81	78	finally
  }
  
  public static ot1<kt2> d(String paramString) {
    sm<kt2> sm = new sm();
    a.c(new e0(paramString, sm));
    return (ot1<kt2>)sm;
  }
  
  public final ot1<String> a(int paramInt, String paramString, Map<String, String> paramMap, byte[] paramArrayOfbyte) {
    b0 b0 = new b0(null);
    a0 a0 = new a0(this, paramString, b0);
    wl wl = new wl(null);
    y y = new y(this, paramInt, paramString, b0, a0, paramArrayOfbyte, paramMap, wl);
    if (wl.a())
      try {
        wl.f(paramString, "GET", y.a(), y.B());
      } catch (zzl zzl) {
        cm.i(zzl.getMessage());
      }  
    a.c((w)y);
    return (ot1<String>)b0;
  }
  
  public final ot1<String> b(String paramString, Map<String, String> paramMap) {
    return a(0, paramString, paramMap, null);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/internal/util/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */