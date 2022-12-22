package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

public abstract class i {
  private static int a = 129;
  
  private static final Object b = new Object();
  
  private static i c;
  
  public static int b() {
    return a;
  }
  
  public static i c(Context paramContext) {
    synchronized (b) {
      if (c == null) {
        o0 o0 = new o0();
        this(paramContext.getApplicationContext());
        c = o0;
      } 
      return c;
    } 
  }
  
  public boolean a(ComponentName paramComponentName, ServiceConnection paramServiceConnection, String paramString) {
    return f(new a(paramComponentName, b()), paramServiceConnection, paramString);
  }
  
  public void d(ComponentName paramComponentName, ServiceConnection paramServiceConnection, String paramString) {
    g(new a(paramComponentName, b()), paramServiceConnection, paramString);
  }
  
  public final void e(String paramString1, String paramString2, int paramInt, ServiceConnection paramServiceConnection, String paramString3, boolean paramBoolean) {
    g(new a(paramString1, paramString2, paramInt, paramBoolean), paramServiceConnection, paramString3);
  }
  
  protected abstract boolean f(a parama, ServiceConnection paramServiceConnection, String paramString);
  
  protected abstract void g(a parama, ServiceConnection paramServiceConnection, String paramString);
  
  protected static final class a {
    private static final Uri a = (new Uri.Builder()).scheme("content").authority("com.google.android.gms.chimera").build();
    
    private final String b = null;
    
    private final String c = null;
    
    private final ComponentName d;
    
    private final int e;
    
    private final boolean f;
    
    public a(ComponentName param1ComponentName, int param1Int) {
      this.d = t.<ComponentName>j(param1ComponentName);
      this.e = param1Int;
      this.f = false;
    }
    
    public a(String param1String1, String param1String2, int param1Int, boolean param1Boolean) {
      this.d = null;
      this.e = param1Int;
      this.f = param1Boolean;
    }
    
    private final Intent d(Context param1Context) {
      StringBuilder stringBuilder1;
      Intent intent;
      Bundle bundle = new Bundle();
      bundle.putString("serviceActionBundleKey", this.b);
      StringBuilder stringBuilder2 = null;
      try {
        Bundle bundle1 = param1Context.getContentResolver().call(a, "serviceIntentCall", null, bundle);
      } catch (IllegalArgumentException illegalArgumentException) {
        String str = String.valueOf(illegalArgumentException);
        stringBuilder1 = new StringBuilder(str.length() + 34);
        stringBuilder1.append("Dynamic intent resolution failed: ");
        stringBuilder1.append(str);
        Log.w("ConnectionStatusConfig", stringBuilder1.toString());
        stringBuilder1 = null;
      } 
      if (stringBuilder1 == null) {
        stringBuilder1 = stringBuilder2;
      } else {
        intent = (Intent)stringBuilder1.getParcelable("serviceResponseIntentKey");
      } 
      if (intent == null) {
        String str = String.valueOf(this.b);
        if (str.length() != 0) {
          str = "Dynamic lookup for intent failed for action: ".concat(str);
        } else {
          str = new String("Dynamic lookup for intent failed for action: ");
        } 
        Log.w("ConnectionStatusConfig", str);
      } 
      return intent;
    }
    
    public final Intent a(Context param1Context) {
      Intent intent;
      if (this.b != null) {
        if (this.f) {
          Intent intent1 = d(param1Context);
        } else {
          param1Context = null;
        } 
        Context context = param1Context;
        if (param1Context == null)
          intent = (new Intent(this.b)).setPackage(this.c); 
      } else {
        intent = (new Intent()).setComponent(this.d);
      } 
      return intent;
    }
    
    public final String b() {
      return this.c;
    }
    
    public final ComponentName c() {
      return this.d;
    }
    
    public final int e() {
      return this.e;
    }
    
    public final boolean equals(Object param1Object) {
      if (this == param1Object)
        return true; 
      if (!(param1Object instanceof a))
        return false; 
      param1Object = param1Object;
      return (r.a(this.b, ((a)param1Object).b) && r.a(this.c, ((a)param1Object).c) && r.a(this.d, ((a)param1Object).d) && this.e == ((a)param1Object).e && this.f == ((a)param1Object).f);
    }
    
    public final int hashCode() {
      return r.b(new Object[] { this.b, this.c, this.d, Integer.valueOf(this.e), Boolean.valueOf(this.f) });
    }
    
    public final String toString() {
      String str1 = this.b;
      String str2 = str1;
      if (str1 == null) {
        t.j(this.d);
        str2 = this.d.flattenToString();
      } 
      return str2;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/internal/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */