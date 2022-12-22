package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.util.h1;
import java.util.regex.Pattern;

public final class xn0 implements q40, f50, u80, bq2 {
  private final Context b;
  
  private final ti1 c;
  
  private final jo0 d;
  
  private final ci1 e;
  
  private final nh1 f;
  
  private final pu0 g;
  
  private Boolean h;
  
  private final boolean i;
  
  public xn0(Context paramContext, ti1 paramti1, jo0 paramjo0, ci1 paramci1, nh1 paramnh1, pu0 parampu0) {
    this.b = paramContext;
    this.c = paramti1;
    this.d = paramjo0;
    this.e = paramci1;
    this.f = paramnh1;
    this.g = parampu0;
    x<Boolean> x = m0.q5;
    this.i = ((Boolean)er2.e().<Boolean>c(x)).booleanValue();
  }
  
  private static boolean B(String paramString1, String paramString2) {
    if (paramString1 != null && paramString2 != null)
      try {
        return Pattern.matches(paramString1, paramString2);
      } catch (RuntimeException runtimeException) {
        q.g().e(runtimeException, "CsiActionsListener.isPatternMatched");
      }  
    return false;
  }
  
  private final mo0 C(String paramString) {
    mo0 mo0 = this.d.b().a(this.e.b.b).g(this.f);
    mo0.h("action", paramString);
    if (!this.f.s.isEmpty())
      mo0.h("ancn", this.f.s.get(0)); 
    if (this.f.d0) {
      q.c();
      if (h1.O(this.b)) {
        paramString = "online";
      } else {
        paramString = "offline";
      } 
      mo0.h("device_connectivity", paramString);
      mo0.h("event_timestamp", String.valueOf(q.j().a()));
      mo0.h("offline_ad", "1");
    } 
    return mo0;
  }
  
  private final void r(mo0 parammo0) {
    av0 av0;
    if (this.f.d0) {
      String str = parammo0.d();
      av0 = new av0(q.j().a(), this.e.b.b.b, str, qu0.b);
      this.g.o(av0);
      return;
    } 
    av0.c();
  }
  
  private final boolean t() {
    // Byte code:
    //   0: aload_0
    //   1: getfield h : Ljava/lang/Boolean;
    //   4: ifnonnull -> 63
    //   7: aload_0
    //   8: monitorenter
    //   9: aload_0
    //   10: getfield h : Ljava/lang/Boolean;
    //   13: ifnonnull -> 53
    //   16: getstatic com/google/android/gms/internal/ads/m0.t1 : Lcom/google/android/gms/internal/ads/x;
    //   19: astore_1
    //   20: invokestatic e : ()Lcom/google/android/gms/internal/ads/i0;
    //   23: aload_1
    //   24: invokevirtual c : (Lcom/google/android/gms/internal/ads/x;)Ljava/lang/Object;
    //   27: checkcast java/lang/String
    //   30: astore_1
    //   31: invokestatic c : ()Lcom/google/android/gms/ads/internal/util/h1;
    //   34: pop
    //   35: aload_0
    //   36: aload_1
    //   37: aload_0
    //   38: getfield b : Landroid/content/Context;
    //   41: invokestatic J : (Landroid/content/Context;)Ljava/lang/String;
    //   44: invokestatic B : (Ljava/lang/String;Ljava/lang/String;)Z
    //   47: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   50: putfield h : Ljava/lang/Boolean;
    //   53: aload_0
    //   54: monitorexit
    //   55: goto -> 63
    //   58: astore_1
    //   59: aload_0
    //   60: monitorexit
    //   61: aload_1
    //   62: athrow
    //   63: aload_0
    //   64: getfield h : Ljava/lang/Boolean;
    //   67: invokevirtual booleanValue : ()Z
    //   70: ireturn
    // Exception table:
    //   from	to	target	type
    //   9	53	58	finally
    //   53	55	58	finally
    //   59	61	58	finally
  }
  
  public final void Q0() {
    if (!this.i)
      return; 
    mo0 mo0 = C("ifts");
    mo0.h("reason", "blocked");
    mo0.c();
  }
  
  public final void S() {
    if (!t() && !this.f.d0)
      return; 
    r(C("impression"));
  }
  
  public final void Y(zzcaf paramzzcaf) {
    if (!this.i)
      return; 
    mo0 mo0 = C("ifts");
    mo0.h("reason", "exception");
    if (!TextUtils.isEmpty(paramzzcaf.getMessage()))
      mo0.h("msg", paramzzcaf.getMessage()); 
    mo0.c();
  }
  
  public final void i() {
    if (!t())
      return; 
    C("adapter_impression").c();
  }
  
  public final void n() {
    if (!t())
      return; 
    C("adapter_shown").c();
  }
  
  public final void x() {
    if (!this.f.d0)
      return; 
    r(C("click"));
  }
  
  public final void y(zzvg paramzzvg) {
    if (!this.i)
      return; 
    mo0 mo0 = C("ifts");
    mo0.h("reason", "adapter");
    int i = paramzzvg.b;
    String str2 = paramzzvg.c;
    int j = i;
    String str3 = str2;
    if (paramzzvg.d.equals("com.google.android.gms.ads")) {
      zzvg zzvg1 = paramzzvg.e;
      j = i;
      str3 = str2;
      if (zzvg1 != null) {
        j = i;
        str3 = str2;
        if (!zzvg1.d.equals("com.google.android.gms.ads")) {
          paramzzvg = paramzzvg.e;
          j = paramzzvg.b;
          str3 = paramzzvg.c;
        } 
      } 
    } 
    if (j >= 0)
      mo0.h("arec", String.valueOf(j)); 
    String str1 = this.c.a(str3);
    if (str1 != null)
      mo0.h("areec", str1); 
    mo0.c();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/xn0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */