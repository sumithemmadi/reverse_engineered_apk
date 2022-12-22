package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.util.h1;
import java.util.regex.Pattern;

public final class dt0 implements q40, f50, u80, bq2 {
  private final Context b;
  
  private final ti1 c;
  
  private final ci1 d;
  
  private final nh1 e;
  
  private final pu0 f;
  
  private Boolean g;
  
  private final boolean h;
  
  private final pm1 i;
  
  private final String j;
  
  public dt0(Context paramContext, ti1 paramti1, ci1 paramci1, nh1 paramnh1, pu0 parampu0, pm1 parampm1, String paramString) {
    this.b = paramContext;
    this.c = paramti1;
    this.d = paramci1;
    this.e = paramnh1;
    this.f = parampu0;
    x<Boolean> x = m0.q5;
    this.h = ((Boolean)er2.e().<Boolean>c(x)).booleanValue();
    this.i = parampm1;
    this.j = paramString;
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
  
  private final rm1 C(String paramString) {
    rm1 rm1 = rm1.d(paramString).a(this.d, null).c(this.e).i("request_id", this.j);
    if (!this.e.s.isEmpty())
      rm1.i("ancn", this.e.s.get(0)); 
    if (this.e.d0) {
      q.c();
      if (h1.O(this.b)) {
        paramString = "online";
      } else {
        paramString = "offline";
      } 
      rm1.i("device_connectivity", paramString);
      rm1.i("event_timestamp", String.valueOf(q.j().a()));
      rm1.i("offline_ad", "1");
    } 
    return rm1;
  }
  
  private final void r(rm1 paramrm1) {
    av0 av0;
    if (this.e.d0) {
      String str = this.i.a(paramrm1);
      av0 = new av0(q.j().a(), this.d.b.b.b, str, qu0.b);
      this.f.o(av0);
      return;
    } 
    this.i.b((rm1)av0);
  }
  
  private final boolean t() {
    // Byte code:
    //   0: aload_0
    //   1: getfield g : Ljava/lang/Boolean;
    //   4: ifnonnull -> 63
    //   7: aload_0
    //   8: monitorenter
    //   9: aload_0
    //   10: getfield g : Ljava/lang/Boolean;
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
    //   50: putfield g : Ljava/lang/Boolean;
    //   53: aload_0
    //   54: monitorexit
    //   55: goto -> 63
    //   58: astore_1
    //   59: aload_0
    //   60: monitorexit
    //   61: aload_1
    //   62: athrow
    //   63: aload_0
    //   64: getfield g : Ljava/lang/Boolean;
    //   67: invokevirtual booleanValue : ()Z
    //   70: ireturn
    // Exception table:
    //   from	to	target	type
    //   9	53	58	finally
    //   53	55	58	finally
    //   59	61	58	finally
  }
  
  public final void Q0() {
    if (!this.h)
      return; 
    this.i.b(C("ifts").i("reason", "blocked"));
  }
  
  public final void S() {
    if (!t() && !this.e.d0)
      return; 
    r(C("impression"));
  }
  
  public final void Y(zzcaf paramzzcaf) {
    if (!this.h)
      return; 
    rm1 rm1 = C("ifts").i("reason", "exception");
    if (!TextUtils.isEmpty(paramzzcaf.getMessage()))
      rm1.i("msg", paramzzcaf.getMessage()); 
    this.i.b(rm1);
  }
  
  public final void i() {
    if (!t())
      return; 
    this.i.b(C("adapter_impression"));
  }
  
  public final void n() {
    if (!t())
      return; 
    this.i.b(C("adapter_shown"));
  }
  
  public final void x() {
    if (!this.e.d0)
      return; 
    r(C("click"));
  }
  
  public final void y(zzvg paramzzvg) {
    if (!this.h)
      return; 
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
    String str1 = this.c.a(str3);
    rm1 rm1 = C("ifts").i("reason", "adapter");
    if (j >= 0)
      rm1.i("arec", String.valueOf(j)); 
    if (str1 != null)
      rm1.i("areec", str1); 
    this.i.b(rm1);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/dt0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */