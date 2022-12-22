package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.common.api.h;
import java.lang.ref.WeakReference;
import java.util.Map;

public abstract class up implements h {
  protected Context b;
  
  protected String c;
  
  protected WeakReference<eo> d;
  
  public up(eo parameo) {
    this.b = parameo.getContext();
    this.c = q.c().r0(this.b, (parameo.b()).b);
    this.d = new WeakReference<eo>(parameo);
  }
  
  private final void o(String paramString, Map<String, String> paramMap) {
    eo eo = this.d.get();
    if (eo != null)
      eo.B(paramString, paramMap); 
  }
  
  private static String y(String paramString) {
    paramString.hashCode();
    int i = paramString.hashCode();
    byte b = -1;
    switch (i) {
      case 725497484:
        if (!paramString.equals("noCacheDir"))
          break; 
        b = 11;
        break;
      case 580119100:
        if (!paramString.equals("expireFailed"))
          break; 
        b = 10;
        break;
      case 96784904:
        if (!paramString.equals("error"))
          break; 
        b = 9;
        break;
      case 3387234:
        if (!paramString.equals("noop"))
          break; 
        b = 8;
        break;
      case -32082395:
        if (!paramString.equals("externalAbort"))
          break; 
        b = 7;
        break;
      case -354048396:
        if (!paramString.equals("sizeExceeded"))
          break; 
        b = 6;
        break;
      case -642208130:
        if (!paramString.equals("playerFailed"))
          break; 
        b = 5;
        break;
      case -659376217:
        if (!paramString.equals("contentLengthMissing"))
          break; 
        b = 4;
        break;
      case -918817863:
        if (!paramString.equals("downloadTimeout"))
          break; 
        b = 3;
        break;
      case -1347010958:
        if (!paramString.equals("inProgress"))
          break; 
        b = 2;
        break;
      case -1396664534:
        if (!paramString.equals("badUrl"))
          break; 
        b = 1;
        break;
      case -1947652542:
        if (!paramString.equals("interrupted"))
          break; 
        b = 0;
        break;
    } 
    String str = "internal";
    paramString = str;
    switch (b) {
      default:
        paramString = str;
        break;
      case 10:
      case 11:
        paramString = "io";
        break;
      case 6:
      case 7:
        paramString = "policy";
        break;
      case 1:
      case 3:
        paramString = "network";
        break;
      case 0:
      case 2:
      case 4:
      case 5:
      case 8:
      case 9:
        break;
    } 
    return paramString;
  }
  
  public void a() {}
  
  public abstract void g();
  
  protected final void j(String paramString1, String paramString2, int paramInt) {
    sl.a.post(new yp(this, paramString1, paramString2, paramInt));
  }
  
  public final void l(String paramString1, String paramString2, int paramInt1, int paramInt2, long paramLong1, long paramLong2, boolean paramBoolean, int paramInt3, int paramInt4) {
    sl.a.post(new zp(this, paramString1, paramString2, paramInt1, paramInt2, paramLong1, paramLong2, paramBoolean, paramInt3, paramInt4));
  }
  
  public final void m(String paramString1, String paramString2, long paramLong1, long paramLong2, boolean paramBoolean, long paramLong3, long paramLong4, long paramLong5, int paramInt1, int paramInt2) {
    sl.a.post(new wp(this, paramString1, paramString2, paramLong1, paramLong2, paramLong3, paramLong4, paramLong5, paramBoolean, paramInt1, paramInt2));
  }
  
  public final void n(String paramString1, String paramString2, String paramString3, String paramString4) {
    sl.a.post(new aq(this, paramString1, paramString2, paramString3, paramString4));
  }
  
  public final void p(String paramString1, String paramString2, long paramLong) {
    sl.a.post(new bq(this, paramString1, paramString2, paramLong));
  }
  
  protected void q(int paramInt) {}
  
  protected void r(int paramInt) {}
  
  protected void s(int paramInt) {}
  
  protected void t(int paramInt) {}
  
  public boolean u(String paramString, String[] paramArrayOfString) {
    return w(paramString);
  }
  
  public abstract boolean w(String paramString);
  
  protected String x(String paramString) {
    return sl.s(paramString);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/up.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */