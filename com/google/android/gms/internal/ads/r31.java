package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.util.n0;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public final class r31 extends wk {
  private static final List<String> b = new ArrayList<String>(Arrays.asList(new String[] { "/aclk", "/pcs/click" }));
  
  private static final List<String> c = new ArrayList<String>(Arrays.asList(new String[] { ".doubleclick.net", ".googleadservices.com" }));
  
  private static final List<String> d = new ArrayList<String>(Arrays.asList(new String[] { "/pagead/adview", "/pcs/view", "/pagead/conversion" }));
  
  private static final List<String> e = new ArrayList<String>(Arrays.asList(new String[] { ".doubleclick.net", ".googleadservices.com", ".googlesyndication.com" }));
  
  private ss f;
  
  private Context g;
  
  private p12 h;
  
  private zzazn i;
  
  private wi1<dk0> j;
  
  private final nt1 k;
  
  private final ScheduledExecutorService l;
  
  private zzasq m;
  
  private Point n = new Point();
  
  private Point o = new Point();
  
  public r31(ss paramss, Context paramContext, p12 paramp12, zzazn paramzzazn, wi1<dk0> paramwi1, nt1 paramnt1, ScheduledExecutorService paramScheduledExecutorService) {
    this.f = paramss;
    this.g = paramContext;
    this.h = paramp12;
    this.i = paramzzazn;
    this.j = paramwi1;
    this.k = paramnt1;
    this.l = paramScheduledExecutorService;
  }
  
  private final Uri S9(Uri paramUri, a parama) {
    try {
      Uri uri = this.h.b(paramUri, this.g, (View)b.o1(parama), null);
      paramUri = uri;
    } catch (zzeh zzeh) {
      cm.d("", zzeh);
    } 
    if (paramUri.getQueryParameter("ms") != null)
      return paramUri; 
    throw new Exception("Failed to append spam signals to click url.");
  }
  
  private static Uri T9(Uri paramUri, String paramString1, String paramString2) {
    StringBuilder stringBuilder;
    String str = paramUri.toString();
    int i = str.indexOf("&adurl=");
    int j = i;
    if (i == -1)
      j = str.indexOf("?adurl="); 
    if (j != -1) {
      stringBuilder = new StringBuilder(str.substring(0, ++j));
      stringBuilder.append(paramString1);
      stringBuilder.append("=");
      stringBuilder.append(paramString2);
      stringBuilder.append("&");
      stringBuilder.append(str.substring(j));
      return Uri.parse(stringBuilder.toString());
    } 
    return stringBuilder.buildUpon().appendQueryParameter(paramString1, paramString2).build();
  }
  
  private static boolean aa(Uri paramUri, List<String> paramList1, List<String> paramList2) {
    String str2 = paramUri.getHost();
    String str1 = paramUri.getPath();
    if (str2 != null && str1 != null) {
      Iterator<String> iterator = paramList1.iterator();
      while (iterator.hasNext()) {
        if (str1.contains(iterator.next())) {
          Iterator<String> iterator1 = paramList2.iterator();
          while (iterator1.hasNext()) {
            if (str2.endsWith(iterator1.next()))
              return true; 
          } 
        } 
      } 
    } 
    return false;
  }
  
  private final boolean ba() {
    zzasq zzasq1 = this.m;
    if (zzasq1 != null) {
      Map<String, WeakReference<View>> map = zzasq1.c;
      if (map != null && !map.isEmpty())
        return true; 
    } 
    return false;
  }
  
  private final ot1<String> fa(String paramString) {
    dk0[] arrayOfDk0 = new dk0[1];
    ot1<?> ot1 = dt1.k(this.j.b(), new y31(this, arrayOfDk0, paramString), this.k);
    ot1.a(new b41(this, arrayOfDk0), this.k);
    ot1 = ys1.H(ot1);
    x<Integer> x = m0.u5;
    return ot1.C(((Integer)er2.e().<Integer>c(x)).intValue(), TimeUnit.MILLISECONDS, this.l).D(w31.a, this.k).E(Exception.class, z31.a, this.k);
  }
  
  private static boolean ga(Uri paramUri) {
    return aa(paramUri, d, e);
  }
  
  public final void A6(List<Uri> paramList, a parama, uf paramuf) {
    try {
      StringBuilder stringBuilder;
      String str;
      x<Boolean> x = m0.t5;
      if (!((Boolean)er2.e().<Boolean>c(x)).booleanValue()) {
        paramuf.l1("The updating URL feature is not enabled.");
        return;
      } 
      if (paramList.size() != 1) {
        paramuf.l1("There should be only 1 click URL.");
        return;
      } 
      Uri uri = paramList.get(0);
      if (!aa(uri, b, c)) {
        str = String.valueOf(uri);
        int i = str.length();
        stringBuilder = new StringBuilder();
        this(i + 18);
        stringBuilder.append("Not a Google URL: ");
        stringBuilder.append(str);
        cm.i(stringBuilder.toString());
        paramuf.e5(paramList);
        return;
      } 
      ot1<?> ot1 = this.k.a(new s31(this, (Uri)str, (a)stringBuilder));
      if (ba()) {
        ot1 = dt1.k(ot1, new v31(this), this.k);
      } else {
        cm.h("Asset view map is empty.");
      } 
      dt1.g(ot1, new c41(this, paramuf), this.f.f());
      return;
    } catch (RemoteException remoteException) {
      cm.c("", (Throwable)remoteException);
      return;
    } 
  }
  
  public final void J8(a parama, zzaye paramzzaye, sk paramsk) {
    Context context = (Context)b.o1(parama);
    this.g = context;
    String str2 = paramzzaye.b;
    String str3 = paramzzaye.c;
    zzvs zzvs2 = paramzzaye.d;
    zzvl zzvl2 = paramzzaye.e;
    o31 o31 = this.f.w();
    w30.a a1 = (new w30.a()).g(context);
    ii1 ii13 = new ii1();
    String str1 = str2;
    if (str2 == null)
      str1 = "adUnitId"; 
    ii1 ii12 = ii13.A(str1);
    zzvl zzvl1 = zzvl2;
    if (zzvl2 == null)
      zzvl1 = (new jq2()).a(); 
    ii1 ii11 = ii12.C(zzvl1);
    zzvs zzvs1 = zzvs2;
    if (zzvs2 == null)
      zzvs1 = new zzvs(); 
    dt1.g(o31.b(a1.c(ii11.z(zzvs1).e()).d()).a(new g41((new g41.a()).b(str3), null)).c((new k90.a()).n()).d().a(), new a41(this, paramsk), this.f.f());
  }
  
  public final void N9(List<Uri> paramList, a parama, uf paramuf) {
    x<Boolean> x = m0.t5;
    if (!((Boolean)er2.e().<Boolean>c(x)).booleanValue())
      try {
        paramuf.l1("The updating URL feature is not enabled.");
        return;
      } catch (RemoteException remoteException) {
        cm.c("", (Throwable)remoteException);
        return;
      }  
    ot1<?> ot1 = this.k.a(new q31(this, (List)remoteException, parama));
    if (ba()) {
      ot1 = dt1.k(ot1, new t31(this), this.k);
    } else {
      cm.h("Asset view map is empty.");
    } 
    dt1.g(ot1, new f41(this, paramuf), this.f.f());
  }
  
  public final void Q2(zzasq paramzzasq) {
    this.m = paramzzasq;
    this.j.a(1);
  }
  
  public final a f4(a parama1, a parama2) {
    return null;
  }
  
  public final a q1(a parama) {
    return null;
  }
  
  public final void w4(a parama) {
    View view;
    x<Boolean> x = m0.t5;
    if (!((Boolean)er2.e().<Boolean>c(x)).booleanValue())
      return; 
    MotionEvent motionEvent2 = (MotionEvent)b.o1(parama);
    zzasq zzasq1 = this.m;
    if (zzasq1 == null) {
      zzasq1 = null;
    } else {
      view = zzasq1.b;
    } 
    this.n = n0.a(motionEvent2, view);
    if (motionEvent2.getAction() == 0)
      this.o = this.n; 
    MotionEvent motionEvent1 = MotionEvent.obtain(motionEvent2);
    Point point = this.n;
    motionEvent1.setLocation(point.x, point.y);
    this.h.d(motionEvent1);
    motionEvent1.recycle();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/r31.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */