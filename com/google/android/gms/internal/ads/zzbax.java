package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.util.b1;
import com.google.android.gms.ads.internal.util.h1;
import com.google.android.gms.common.internal.t;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class zzbax extends FrameLayout implements mn {
  private final eo b;
  
  private final FrameLayout c;
  
  private final z0 d;
  
  private final go e;
  
  private final long f;
  
  private zzbav g;
  
  private boolean h;
  
  private boolean i;
  
  private boolean j;
  
  private boolean k;
  
  private long l;
  
  private long m;
  
  private String n;
  
  private String[] o;
  
  private Bitmap p;
  
  private ImageView q;
  
  private boolean r;
  
  public zzbax(Context paramContext, eo parameo, int paramInt, boolean paramBoolean, z0 paramz0, bo parambo) {
    super(paramContext);
    this.b = parameo;
    this.d = paramz0;
    FrameLayout frameLayout = new FrameLayout(paramContext);
    this.c = frameLayout;
    x<Boolean> x2 = m0.F;
    if (((Boolean)er2.e().<Boolean>c(x2)).booleanValue())
      frameLayout.setBackgroundResource(17170444); 
    addView((View)frameLayout, (ViewGroup.LayoutParams)new FrameLayout.LayoutParams(-1, -1));
    t.j(parameo.g());
    zzbav zzbav2 = (parameo.g()).b.a(paramContext, parameo, paramInt, paramBoolean, paramz0, parambo);
    this.g = zzbav2;
    if (zzbav2 != null) {
      frameLayout.addView((View)zzbav2, (ViewGroup.LayoutParams)new FrameLayout.LayoutParams(-1, -1, 17));
      x<Boolean> x3 = m0.w;
      if (((Boolean)er2.e().<Boolean>c(x3)).booleanValue())
        u(); 
    } 
    this.q = new ImageView(paramContext);
    x<Long> x = m0.A;
    this.f = ((Long)er2.e().<Long>c(x)).longValue();
    x<Boolean> x1 = m0.y;
    paramBoolean = ((Boolean)er2.e().<Boolean>c(x1)).booleanValue();
    this.k = paramBoolean;
    if (paramz0 != null) {
      String str;
      if (paramBoolean) {
        str = "1";
      } else {
        str = "0";
      } 
      paramz0.d("spinner_used", str);
    } 
    this.e = new go(this);
    zzbav zzbav1 = this.g;
    if (zzbav1 != null)
      zzbav1.k(this); 
    if (this.g == null)
      i("AdVideoUnderlay Error", "Allocating player failed."); 
  }
  
  private final void B(String paramString, String... paramVarArgs) {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    hashMap.put("event", paramString);
    int i = paramVarArgs.length;
    byte b = 0;
    paramString = null;
    while (b < i) {
      String str = paramVarArgs[b];
      if (paramString == null) {
        paramString = str;
      } else {
        hashMap.put(paramString, str);
        paramString = null;
      } 
      b++;
    } 
    this.b.B("onVideoEvent", (Map)hashMap);
  }
  
  public static void p(eo parameo) {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    hashMap.put("event", "no_video_view");
    parameo.B("onVideoEvent", (Map)hashMap);
  }
  
  public static void q(eo parameo, String paramString) {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    hashMap.put("event", "decoderProps");
    hashMap.put("error", paramString);
    parameo.B("onVideoEvent", (Map)hashMap);
  }
  
  public static void r(eo parameo, Map<String, List<Map<String, Object>>> paramMap) {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    hashMap.put("event", "decoderProps");
    hashMap.put("mimeTypes", paramMap);
    parameo.B("onVideoEvent", (Map)hashMap);
  }
  
  private final boolean w() {
    return (this.q.getParent() != null);
  }
  
  private final void x() {
    if (this.b.a() == null)
      return; 
    if (this.i && !this.j) {
      this.b.a().getWindow().clearFlags(128);
      this.i = false;
    } 
  }
  
  public final void A(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (paramInt3 != 0 && paramInt4 != 0) {
      FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(paramInt3, paramInt4);
      layoutParams.setMargins(paramInt1, paramInt2, 0, 0);
      this.c.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
      requestLayout();
    } 
  }
  
  public final void C(int paramInt) {
    this.g.p(paramInt);
  }
  
  public final void D(int paramInt) {
    this.g.q(paramInt);
  }
  
  public final void E(int paramInt) {
    this.g.r(paramInt);
  }
  
  public final void F(int paramInt) {
    this.g.s(paramInt);
  }
  
  public final void G(int paramInt) {
    this.g.t(paramInt);
  }
  
  @TargetApi(14)
  public final void H(MotionEvent paramMotionEvent) {
    zzbav zzbav1 = this.g;
    if (zzbav1 == null)
      return; 
    zzbav1.dispatchTouchEvent(paramMotionEvent);
  }
  
  public final void I() {
    if (this.g == null)
      return; 
    if (!TextUtils.isEmpty(this.n)) {
      this.g.o(this.n, this.o);
      return;
    } 
    B("no_src", new String[0]);
  }
  
  public final void a() {
    zzbav zzbav1 = this.g;
    if (zzbav1 == null)
      return; 
    if (this.m == 0L)
      B("canplaythrough", new String[] { "duration", String.valueOf(zzbav1.getDuration() / 1000.0F), "videoWidth", String.valueOf(this.g.getVideoWidth()), "videoHeight", String.valueOf(this.g.getVideoHeight()) }); 
  }
  
  public final void b(int paramInt1, int paramInt2) {
    if (this.k) {
      x<Integer> x = m0.z;
      paramInt1 = Math.max(paramInt1 / ((Integer)er2.e().<Integer>c(x)).intValue(), 1);
      paramInt2 = Math.max(paramInt2 / ((Integer)er2.e().<Integer>c(x)).intValue(), 1);
      Bitmap bitmap = this.p;
      if (bitmap == null || bitmap.getWidth() != paramInt1 || this.p.getHeight() != paramInt2) {
        this.p = Bitmap.createBitmap(paramInt1, paramInt2, Bitmap.Config.ARGB_8888);
        this.r = false;
      } 
    } 
  }
  
  public final void c() {
    B("pause", new String[0]);
    x();
    this.h = false;
  }
  
  public final void d() {
    this.e.b();
    h1.a.post(new sn(this));
  }
  
  public final void e() {
    if (this.b.a() != null && !this.i) {
      boolean bool;
      if (((this.b.a().getWindow().getAttributes()).flags & 0x80) != 0) {
        bool = true;
      } else {
        bool = false;
      } 
      this.j = bool;
      if (!bool) {
        this.b.a().getWindow().addFlags(128);
        this.i = true;
      } 
    } 
    this.h = true;
  }
  
  public final void f() {
    B("ended", new String[0]);
    x();
  }
  
  public final void finalize() {
    try {
      this.e.a();
      zzbav zzbav1 = this.g;
      if (zzbav1 != null) {
        nt1 nt1 = fm.e;
        zzbav1.getClass();
        nt1.execute(qn.a(zzbav1));
      } 
      return;
    } finally {
      super.finalize();
    } 
  }
  
  public final void g() {
    if (this.r && this.p != null && !w()) {
      this.q.setImageBitmap(this.p);
      this.q.invalidate();
      this.c.addView((View)this.q, (ViewGroup.LayoutParams)new FrameLayout.LayoutParams(-1, -1));
      this.c.bringChildToFront((View)this.q);
    } 
    this.e.a();
    this.m = this.l;
    h1.a.post(new rn(this));
  }
  
  public final void h() {
    if (this.h && w())
      this.c.removeView((View)this.q); 
    if (this.p != null) {
      long l = q.j().b();
      if (this.g.getBitmap(this.p) != null)
        this.r = true; 
      l = q.j().b() - l;
      if (b1.n()) {
        StringBuilder stringBuilder = new StringBuilder(46);
        stringBuilder.append("Spinner frame grab took ");
        stringBuilder.append(l);
        stringBuilder.append("ms");
        b1.m(stringBuilder.toString());
      } 
      if (l > this.f) {
        cm.i("Spinner frame grab crossed jank threshold! Suspending spinner.");
        this.k = false;
        this.p = null;
        z0 z01 = this.d;
        if (z01 != null)
          z01.d("spinner_jank", Long.toString(l)); 
      } 
    } 
  }
  
  public final void i(String paramString1, String paramString2) {
    B("error", new String[] { "what", paramString1, "extra", paramString2 });
  }
  
  public final void j() {
    this.e.a();
    zzbav zzbav1 = this.g;
    if (zzbav1 != null)
      zzbav1.i(); 
    x();
  }
  
  public final void k() {
    zzbav zzbav1 = this.g;
    if (zzbav1 == null)
      return; 
    zzbav1.c();
  }
  
  public final void l() {
    zzbav zzbav1 = this.g;
    if (zzbav1 == null)
      return; 
    zzbav1.g();
  }
  
  public final void m(int paramInt) {
    zzbav zzbav1 = this.g;
    if (zzbav1 == null)
      return; 
    zzbav1.h(paramInt);
  }
  
  public final void n(float paramFloat1, float paramFloat2) {
    zzbav zzbav1 = this.g;
    if (zzbav1 != null)
      zzbav1.j(paramFloat1, paramFloat2); 
  }
  
  public final void onWindowFocusChanged(boolean paramBoolean) {
    super.onWindowFocusChanged(paramBoolean);
    if (paramBoolean) {
      this.e.b();
    } else {
      this.e.a();
      this.m = this.l;
    } 
    h1.a.post(new on(this, paramBoolean));
  }
  
  public final void onWindowVisibilityChanged(int paramInt) {
    boolean bool;
    super.onWindowVisibilityChanged(paramInt);
    if (paramInt == 0) {
      this.e.b();
      bool = true;
    } else {
      this.e.a();
      this.m = this.l;
      bool = false;
    } 
    h1.a.post(new un(this, bool));
  }
  
  public final void s() {
    zzbav zzbav1 = this.g;
    if (zzbav1 == null)
      return; 
    zzbav1.c.b(true);
    zzbav1.a();
  }
  
  public final void setVolume(float paramFloat) {
    zzbav zzbav1 = this.g;
    if (zzbav1 == null)
      return; 
    zzbav1.c.c(paramFloat);
    zzbav1.a();
  }
  
  public final void t() {
    zzbav zzbav1 = this.g;
    if (zzbav1 == null)
      return; 
    zzbav1.c.b(false);
    zzbav1.a();
  }
  
  @TargetApi(14)
  public final void u() {
    zzbav zzbav1 = this.g;
    if (zzbav1 == null)
      return; 
    TextView textView = new TextView(zzbav1.getContext());
    String str = String.valueOf(this.g.l());
    if (str.length() != 0) {
      str = "AdMob - ".concat(str);
    } else {
      str = new String("AdMob - ");
    } 
    textView.setText(str);
    textView.setTextColor(-65536);
    textView.setBackgroundColor(-256);
    this.c.addView((View)textView, (ViewGroup.LayoutParams)new FrameLayout.LayoutParams(-2, -2, 17));
    this.c.bringChildToFront((View)textView);
  }
  
  final void v() {
    zzbav zzbav1 = this.g;
    if (zzbav1 == null)
      return; 
    long l = zzbav1.getCurrentPosition();
    if (this.l != l && l > 0L) {
      float f = (float)l / 1000.0F;
      x<Boolean> x = m0.D1;
      if (((Boolean)er2.e().<Boolean>c(x)).booleanValue()) {
        B("timeupdate", new String[] { 
              "time", String.valueOf(f), "totalBytes", String.valueOf(this.g.getTotalBytes()), "qoeCachedBytes", String.valueOf(this.g.u()), "qoeLoadedBytes", String.valueOf(this.g.m()), "droppedFrames", String.valueOf(this.g.n()), 
              "reportTime", String.valueOf(q.j().a()) });
      } else {
        B("timeupdate", new String[] { "time", String.valueOf(f) });
      } 
      this.l = l;
    } 
  }
  
  public final void z(String paramString, String[] paramArrayOfString) {
    this.n = paramString;
    this.o = paramArrayOfString;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzbax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */