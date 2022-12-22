package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public final class uy1 extends tt1 {
  private uy1(Context paramContext, String paramString, boolean paramBoolean, int paramInt) {
    super(paramContext, paramString, paramBoolean, paramInt);
  }
  
  public static uy1 y(String paramString, Context paramContext, boolean paramBoolean) {
    return z(paramString, paramContext, false, zy0.a);
  }
  
  public static uy1 z(String paramString, Context paramContext, boolean paramBoolean, int paramInt) {
    tt1.q(paramContext, paramBoolean);
    tt1.s(paramString, paramContext, paramBoolean, paramInt);
    return new uy1(paramContext, paramString, paramBoolean, paramInt);
  }
  
  protected final List<Callable<Void>> p(z92 paramz92, Context paramContext, zzcf$zza.a parama, ie0 paramie0) {
    if (paramz92.r() == null || !this.C)
      return super.p(paramz92, paramContext, parama, paramie0); 
    int i = paramz92.o();
    ArrayList<Callable<Void>> arrayList = new ArrayList();
    arrayList.addAll(super.p(paramz92, paramContext, parama, paramie0));
    arrayList.add(new ta2(paramz92, "STRTQE1n2Nae56fJRHDsAlh+RkDZLMqz8liSxR9TDmqE0af2eosWM09BrF9F7xVl", "is62fUaYcSmzgiuoZcKcHzaXthoDXTG3NdfDayg76F0=", parama, i, 24));
    return arrayList;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/uy1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */