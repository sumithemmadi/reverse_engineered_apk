package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.common.util.o;
import org.json.JSONException;

@TargetApi(14)
public final class sl2 extends Thread {
  private boolean b = false;
  
  private boolean c = false;
  
  private boolean d = false;
  
  private final Object e;
  
  private final ll2 f;
  
  private final int g;
  
  private final int h;
  
  private final int i;
  
  private final int j;
  
  private final int k;
  
  private final int l;
  
  private final int m;
  
  private final int n;
  
  private final String o;
  
  private final boolean p;
  
  private final boolean q;
  
  private final boolean r;
  
  public sl2() {
    this(new ll2());
  }
  
  private sl2(ll2 paramll2) {
    this.f = paramll2;
    this.e = new Object();
    this.h = ((Long)z1.d.a()).intValue();
    this.i = ((Long)z1.a.a()).intValue();
    this.j = ((Long)z1.e.a()).intValue();
    this.k = ((Long)z1.c.a()).intValue();
    x<Integer> x2 = m0.M;
    this.l = ((Integer)er2.e().<Integer>c(x2)).intValue();
    x2 = m0.N;
    this.m = ((Integer)er2.e().<Integer>c(x2)).intValue();
    x2 = m0.O;
    this.n = ((Integer)er2.e().<Integer>c(x2)).intValue();
    this.g = ((Long)z1.f.a()).intValue();
    x<String> x1 = m0.Q;
    this.o = er2.e().<String>c(x1);
    x<Boolean> x = m0.R;
    this.p = ((Boolean)er2.e().<Boolean>c(x)).booleanValue();
    x = m0.S;
    this.q = ((Boolean)er2.e().<Boolean>c(x)).booleanValue();
    x = m0.T;
    this.r = ((Boolean)er2.e().<Boolean>c(x)).booleanValue();
    setName("ContentFetchTask");
  }
  
  private final wl2 b(View paramView, ml2 paramml2) {
    WebView webView;
    byte b = 0;
    if (paramView == null)
      return new wl2(this, 0, 0); 
    boolean bool = paramView.getGlobalVisibleRect(new Rect());
    if (paramView instanceof TextView && !(paramView instanceof android.widget.EditText)) {
      CharSequence charSequence = ((TextView)paramView).getText();
      if (!TextUtils.isEmpty(charSequence)) {
        paramml2.d(charSequence.toString(), bool, paramView.getX(), paramView.getY(), paramView.getWidth(), paramView.getHeight());
        return new wl2(this, 1, 0);
      } 
      return new wl2(this, 0, 0);
    } 
    if (paramView instanceof WebView && !(paramView instanceof tq)) {
      boolean bool1;
      webView = (WebView)paramView;
      if (!o.f()) {
        bool1 = false;
      } else {
        paramml2.n();
        webView.post(new ul2(this, paramml2, webView, bool));
        bool1 = true;
      } 
      return bool1 ? new wl2(this, 0, 1) : new wl2(this, 0, 0);
    } 
    if (webView instanceof ViewGroup) {
      ViewGroup viewGroup = (ViewGroup)webView;
      int j = 0;
      int i = 0;
      while (b < viewGroup.getChildCount()) {
        wl2 wl2 = b(viewGroup.getChildAt(b), paramml2);
        j += wl2.a;
        i += wl2.b;
        b++;
      } 
      return new wl2(this, j, i);
    } 
    return new wl2(this, 0, 0);
  }
  
  private static boolean f() {
    boolean bool = false;
    try {
      Context context = q.f().b();
      if (context == null)
        return false; 
      ActivityManager activityManager = (ActivityManager)context.getSystemService("activity");
      KeyguardManager keyguardManager = (KeyguardManager)context.getSystemService("keyguard");
      return bool1;
    } finally {
      Exception exception = null;
      q.g().e(exception, "ContentFetchTask.isInForeground");
    } 
  }
  
  private final void h() {
    synchronized (this.e) {
      this.c = true;
      StringBuilder stringBuilder = new StringBuilder();
      this(42);
      stringBuilder.append("ContentFetchThread: paused, mPause = ");
      stringBuilder.append(true);
      cm.e(stringBuilder.toString());
      return;
    } 
  }
  
  public final void a() {
    synchronized (this.e) {
      this.c = false;
      this.e.notifyAll();
      cm.e("ContentFetchThread: wakeup");
      return;
    } 
  }
  
  final void c(ml2 paramml2, WebView paramWebView, String paramString, boolean paramBoolean) {
    paramml2.m();
    try {
      return;
    } catch (JSONException jSONException) {
      return;
    } finally {
      paramml2 = null;
      cm.b("Failed to get webview content.", (Throwable)paramml2);
      q.g().e((Throwable)paramml2, "ContentFetchTask.processWebViewContent");
    } 
  }
  
  final void d(View paramView) {
    try {
      ml2 ml2 = new ml2();
      this(this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.q);
      Context context = q.f().b();
      if (context != null && !TextUtils.isEmpty(this.o)) {
        Resources resources = context.getResources();
        x<String> x = m0.P;
        String str = (String)paramView.getTag(resources.getIdentifier(er2.e().<String>c(x), "id", context.getPackageName()));
        if (str != null && str.equals(this.o))
          return; 
      } 
      wl2 wl2 = b(paramView, ml2);
      ml2.p();
      if (wl2.a == 0 && wl2.b == 0)
        return; 
      if (wl2.b == 0 && ml2.q() == 0)
        return; 
      if (wl2.b == 0 && this.f.a(ml2))
        return; 
      this.f.c(ml2);
      return;
    } catch (Exception exception) {
      cm.c("Exception in fetchContentOnUIThread", exception);
      q.g().e(exception, "ContentFetchTask.fetchContent");
      return;
    } 
  }
  
  public final void e() {
    synchronized (this.e) {
      if (this.b) {
        cm.e("Content hash thread already started, quiting...");
        return;
      } 
      this.b = true;
      start();
      return;
    } 
  }
  
  public final ml2 g() {
    return this.f.d(this.r);
  }
  
  public final boolean i() {
    return this.c;
  }
  
  public final void run() {
    label43: while (true) {
      try {
        if (f()) {
          Activity activity = q.f().a();
          if (activity == null) {
            cm.e("ContentFetchThread: no activity. Sleeping.");
            h();
          } else {
            View view1 = null;
            View view2 = view1;
            try {
              if (activity.getWindow() != null) {
                view2 = view1;
                if (activity.getWindow().getDecorView() != null)
                  view2 = activity.getWindow().getDecorView().findViewById(16908290); 
              } 
            } catch (Exception exception) {
              q.g().e(exception, "ContentFetchTask.extractContent");
              cm.e("Failed getting root view of activity. Content not extracted.");
              view2 = view1;
            } 
            if (view2 != null) {
              rl2 rl2 = new rl2();
              this(this, view2);
              view2.post(rl2);
            } 
          } 
        } else {
          cm.e("ContentFetchTask: sleeping");
          h();
        } 
        Thread.sleep((this.g * 1000));
      } catch (InterruptedException interruptedException) {
        cm.c("Error in ContentFetchTask", interruptedException);
      } catch (Exception exception) {
        cm.c("Error in ContentFetchTask", exception);
        q.g().e(exception, "ContentFetchTask.run");
      } 
      Object object = this.e;
      /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
      while (true) {
        try {
          boolean bool = this.c;
          if (bool) {
            try {
              cm.e("ContentFetchTask: waiting");
              this.e.wait();
            } catch (InterruptedException interruptedException) {}
            continue;
          } 
          /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
        } finally {
          Exception exception;
        } 
        continue label43;
      } 
      break;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/sl2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */