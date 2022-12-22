package com.android.billingclient.api;

import android.app.Activity;
import android.content.Context;

public abstract class c {
  public static a e(Context paramContext) {
    return new a(paramContext, null);
  }
  
  public abstract void a(a parama, b paramb);
  
  public abstract void b(h paramh, i parami);
  
  public abstract boolean c();
  
  public abstract g d(Activity paramActivity, f paramf);
  
  public abstract Purchase.a f(String paramString);
  
  public abstract void g(l paraml, m paramm);
  
  public abstract void h(e parame);
  
  public static final class a {
    private boolean a;
    
    private final Context b;
    
    private k c;
    
    public c a() {
      Context context = this.b;
      if (context != null) {
        k k1 = this.c;
        if (k1 != null) {
          if (this.a)
            return new d(null, true, context, k1); 
          throw new IllegalArgumentException("Support for pending purchases must be enabled. Enable this by calling 'enablePendingPurchases()' on BillingClientBuilder.");
        } 
        throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
      } 
      throw new IllegalArgumentException("Please provide a valid Context.");
    }
    
    public a b() {
      this.a = true;
      return this;
    }
    
    public a c(k param1k) {
      this.c = param1k;
      return this;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/android/billingclient/api/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */