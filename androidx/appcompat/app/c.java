package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import b.e.b;
import java.lang.ref.WeakReference;
import java.util.Iterator;

public abstract class c {
  private static int b = -100;
  
  private static final b<WeakReference<c>> c = new b();
  
  private static final Object d = new Object();
  
  private static void A(c paramc) {
    synchronized (d) {
      Iterator<WeakReference<c>> iterator = c.iterator();
      while (iterator.hasNext()) {
        c c1 = ((WeakReference<c>)iterator.next()).get();
        if (c1 == paramc || c1 == null)
          iterator.remove(); 
      } 
      return;
    } 
  }
  
  public static void F(int paramInt) {
    if (paramInt != -1 && paramInt != 0 && paramInt != 1 && paramInt != 2 && paramInt != 3) {
      Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
    } else if (b != paramInt) {
      b = paramInt;
      f();
    } 
  }
  
  static void c(c paramc) {
    synchronized (d) {
      A(paramc);
      b<WeakReference<c>> b1 = c;
      WeakReference weakReference = new WeakReference();
      this((T)paramc);
      b1.add(weakReference);
      return;
    } 
  }
  
  private static void f() {
    synchronized (d) {
      Iterator<WeakReference<c>> iterator = c.iterator();
      while (iterator.hasNext()) {
        c c1 = ((WeakReference<c>)iterator.next()).get();
        if (c1 != null)
          c1.e(); 
      } 
      return;
    } 
  }
  
  public static c i(Activity paramActivity, b paramb) {
    return new AppCompatDelegateImpl(paramActivity, paramb);
  }
  
  public static c j(Dialog paramDialog, b paramb) {
    return new AppCompatDelegateImpl(paramDialog, paramb);
  }
  
  public static int l() {
    return b;
  }
  
  static void z(c paramc) {
    synchronized (d) {
      A(paramc);
      return;
    } 
  }
  
  public abstract boolean B(int paramInt);
  
  public abstract void C(int paramInt);
  
  public abstract void D(View paramView);
  
  public abstract void E(View paramView, ViewGroup.LayoutParams paramLayoutParams);
  
  public void G(int paramInt) {}
  
  public abstract void H(CharSequence paramCharSequence);
  
  public abstract void d(View paramView, ViewGroup.LayoutParams paramLayoutParams);
  
  public abstract boolean e();
  
  @Deprecated
  public void g(Context paramContext) {}
  
  public Context h(Context paramContext) {
    g(paramContext);
    return paramContext;
  }
  
  public abstract <T extends View> T k(int paramInt);
  
  public int m() {
    return -100;
  }
  
  public abstract MenuInflater n();
  
  public abstract ActionBar o();
  
  public abstract void p();
  
  public abstract void q();
  
  public abstract void r(Configuration paramConfiguration);
  
  public abstract void s(Bundle paramBundle);
  
  public abstract void t();
  
  public abstract void u(Bundle paramBundle);
  
  public abstract void v();
  
  public abstract void w(Bundle paramBundle);
  
  public abstract void x();
  
  public abstract void y();
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/app/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */