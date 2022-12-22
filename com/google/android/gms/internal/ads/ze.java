package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;

public final class ze {
  private static final Object a = new Object();
  
  private static boolean b = false;
  
  private static boolean c = false;
  
  private kn1 d;
  
  private final a e(String paramString1, WebView paramWebView, String paramString2, String paramString3, String paramString4, String paramString5, zzarm paramzzarm, zzarn paramzzarn, String paramString6) {
    Object<Boolean> object = (Object<Boolean>)a;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    try {
      x<Boolean> x = m0.D3;
      if (!((Boolean)er2.e().<Boolean>c(x)).booleanValue() || !b) {
        try {
          /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
          return null;
        } finally {}
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
        throw paramString1;
      } 
      /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
      object = (Object<Boolean>)m0.G3;
      if (!((Boolean)er2.e().<Boolean>c((x<Boolean>)object)).booleanValue())
        return d(paramString1, paramWebView, paramString2, paramString3, paramString4, paramString5); 
      try {
        return this.d.y2(paramString1, b.a2(paramWebView), paramString2, paramString3, paramString4, paramString5, paramzzarm.toString(), paramzzarn.toString(), paramString6);
      } catch (RemoteException remoteException) {
      
      } catch (NullPointerException nullPointerException) {}
      cm.f("#007 Could not call remote method.", nullPointerException);
      return null;
    } finally {}
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object<ObjectType{java/lang/Boolean}>}, name=null} */
    throw paramString1;
  }
  
  private final void l(Context paramContext) {
    synchronized (a) {
      x<Boolean> x = m0.D3;
      if (((Boolean)er2.e().<Boolean>c(x)).booleanValue()) {
        boolean bool = c;
        if (!bool)
          try {
            c = true;
            this.d = bm.<kn1>a(paramContext, "com.google.android.gms.ads.omid.DynamiteOmid", ye.a);
          } catch (zzazl zzazl) {
            cm.f("#007 Could not call remote method.", zzazl);
          }  
      } 
      return;
    } 
  }
  
  public final String a(Context paramContext) {
    x<Boolean> x = m0.D3;
    if (!((Boolean)er2.e().<Boolean>c(x)).booleanValue())
      return null; 
    try {
      l(paramContext);
      null = String.valueOf(this.d.a9());
      return (null.length() != 0) ? "a.".concat(null) : new String("a.");
    } catch (RemoteException remoteException) {
    
    } catch (NullPointerException nullPointerException) {}
    cm.f("#007 Could not call remote method.", nullPointerException);
    return null;
  }
  
  public final a b(String paramString1, WebView paramWebView, String paramString2, String paramString3, String paramString4) {
    return d(paramString1, paramWebView, paramString2, paramString3, paramString4, "Google");
  }
  
  public final a c(String paramString1, WebView paramWebView, String paramString2, String paramString3, String paramString4, zzarm paramzzarm, zzarn paramzzarn, String paramString5) {
    return e(paramString1, paramWebView, paramString2, paramString3, paramString4, "Google", paramzzarm, paramzzarn, paramString5);
  }
  
  public final a d(String paramString1, WebView paramWebView, String paramString2, String paramString3, String paramString4, String paramString5) {
    Object object = a;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    try {
      x<Boolean> x = m0.D3;
      if (!((Boolean)er2.e().<Boolean>c(x)).booleanValue() || !b) {
        try {
          /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
          return null;
        } finally {}
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
        throw paramString1;
      } 
      /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
      try {
        return this.d.n4(paramString1, b.a2(paramWebView), paramString2, paramString3, paramString4, paramString5);
      } catch (RemoteException remoteException) {
      
      } catch (NullPointerException nullPointerException) {}
      cm.f("#007 Could not call remote method.", nullPointerException);
      return null;
    } finally {}
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    throw paramString1;
  }
  
  public final void f(a parama, View paramView) {
    synchronized (a) {
      x<Boolean> x = m0.D3;
      if (!((Boolean)er2.e().<Boolean>c(x)).booleanValue() || !b)
        return; 
      try {
        this.d.b3(parama, b.a2(paramView));
        return;
      } catch (RemoteException remoteException) {
      
      } catch (NullPointerException nullPointerException) {}
      cm.f("#007 Could not call remote method.", nullPointerException);
      return;
    } 
  }
  
  public final void g(a parama) {
    synchronized (a) {
      x<Boolean> x = m0.D3;
      if (!((Boolean)er2.e().<Boolean>c(x)).booleanValue() || !b)
        return; 
      try {
        this.d.H9(parama);
        return;
      } catch (RemoteException remoteException) {
      
      } catch (NullPointerException nullPointerException) {}
      cm.f("#007 Could not call remote method.", nullPointerException);
      return;
    } 
  }
  
  public final void h(a parama) {
    synchronized (a) {
      x<Boolean> x = m0.D3;
      if (!((Boolean)er2.e().<Boolean>c(x)).booleanValue() || !b)
        return; 
      try {
        this.d.C6(parama);
        return;
      } catch (RemoteException remoteException) {
      
      } catch (NullPointerException nullPointerException) {}
      cm.f("#007 Could not call remote method.", nullPointerException);
      return;
    } 
  }
  
  public final a i(String paramString1, WebView paramWebView, String paramString2, String paramString3, String paramString4, String paramString5, zzarm paramzzarm, zzarn paramzzarn, String paramString6) {
    Object<Boolean> object = (Object<Boolean>)a;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    try {
      x<Boolean> x = m0.D3;
      if (!((Boolean)er2.e().<Boolean>c(x)).booleanValue() || !b) {
        try {
          /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
          return null;
        } finally {}
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
        throw paramString1;
      } 
      /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
      object = (Object<Boolean>)m0.H3;
      if (!((Boolean)er2.e().<Boolean>c((x<Boolean>)object)).booleanValue())
        return d(paramString1, paramWebView, paramString2, paramString3, paramString4, paramString5); 
      try {
        return this.d.C3(paramString1, b.a2(paramWebView), paramString2, paramString3, paramString4, paramString5, paramzzarm.toString(), paramzzarn.toString(), paramString6);
      } catch (RemoteException remoteException) {
      
      } catch (NullPointerException nullPointerException) {}
      cm.f("#007 Could not call remote method.", nullPointerException);
      return null;
    } finally {}
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object<ObjectType{java/lang/Boolean}>}, name=null} */
    throw paramString1;
  }
  
  public final void j(a parama, View paramView) {
    synchronized (a) {
      x<Boolean> x = m0.D3;
      if (!((Boolean)er2.e().<Boolean>c(x)).booleanValue() || !b)
        return; 
      try {
        this.d.U1(parama, b.a2(paramView));
        return;
      } catch (RemoteException remoteException) {
      
      } catch (NullPointerException nullPointerException) {}
      cm.f("#007 Could not call remote method.", nullPointerException);
      return;
    } 
  }
  
  public final boolean k(Context paramContext) {
    synchronized (a) {
      x<Boolean> x = m0.D3;
      if (!((Boolean)er2.e().<Boolean>c(x)).booleanValue())
        return false; 
      if (b)
        return true; 
      try {
        l(paramContext);
        boolean bool = this.d.Q3(b.a2(paramContext));
        b = bool;
        return bool;
      } catch (RemoteException remoteException) {
      
      } catch (NullPointerException nullPointerException) {}
      cm.f("#007 Could not call remote method.", nullPointerException);
      return false;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ze.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */