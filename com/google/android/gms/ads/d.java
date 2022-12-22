package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.b;
import com.google.android.gms.ads.formats.d;
import com.google.android.gms.ads.formats.e;
import com.google.android.gms.ads.formats.f;
import com.google.android.gms.ads.formats.g;
import com.google.android.gms.ads.nativead.b;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.internal.ads.c5;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.eq2;
import com.google.android.gms.internal.ads.er2;
import com.google.android.gms.internal.ads.jr2;
import com.google.android.gms.internal.ads.lq2;
import com.google.android.gms.internal.ads.m4;
import com.google.android.gms.internal.ads.mb;
import com.google.android.gms.internal.ads.n4;
import com.google.android.gms.internal.ads.nb;
import com.google.android.gms.internal.ads.pr2;
import com.google.android.gms.internal.ads.s5;
import com.google.android.gms.internal.ads.ur2;
import com.google.android.gms.internal.ads.ut2;
import com.google.android.gms.internal.ads.w5;
import com.google.android.gms.internal.ads.x5;
import com.google.android.gms.internal.ads.y5;
import com.google.android.gms.internal.ads.zzaeh;

public class d {
  private final lq2 a;
  
  private final Context b;
  
  private final pr2 c;
  
  d(Context paramContext, pr2 parampr2) {
    this(paramContext, parampr2, lq2.a);
  }
  
  private d(Context paramContext, pr2 parampr2, lq2 paramlq2) {
    this.b = paramContext;
    this.c = parampr2;
    this.a = paramlq2;
  }
  
  private final void c(ut2 paramut2) {
    try {
      this.c.Y5(lq2.a(this.b, paramut2));
      return;
    } catch (RemoteException remoteException) {
      cm.c("Failed to load ad.", (Throwable)remoteException);
      return;
    } 
  }
  
  public boolean a() {
    try {
      return this.c.r();
    } catch (RemoteException remoteException) {
      cm.d("Failed to check if ad is loading.", (Throwable)remoteException);
      return false;
    } 
  }
  
  public void b(e parame) {
    c(parame.a());
  }
  
  public static class a {
    private final Context a;
    
    private final ur2 b;
    
    private a(Context param1Context, ur2 param1ur2) {
      this.a = param1Context;
      this.b = param1ur2;
    }
    
    public a(Context param1Context, String param1String) {
      this((Context)t.k(param1Context, "context cannot be null"), er2.b().h(param1Context, param1String, (mb)new nb()));
    }
    
    public d a() {
      try {
        return new d(this.a, this.b.n8());
      } catch (RemoteException remoteException) {
        cm.c("Failed to build AdLoader.", (Throwable)remoteException);
        return null;
      } 
    }
    
    @Deprecated
    public a b(d.a param1a) {
      try {
        ur2 ur21 = this.b;
        x5 x5 = new x5();
        this(param1a);
        ur21.E3((m4)x5);
      } catch (RemoteException remoteException) {
        cm.d("Failed to add app install ad listener", (Throwable)remoteException);
      } 
      return this;
    }
    
    @Deprecated
    public a c(e.a param1a) {
      try {
        ur2 ur21 = this.b;
        w5 w5 = new w5();
        this(param1a);
        ur21.C2((n4)w5);
      } catch (RemoteException remoteException) {
        cm.d("Failed to add content ad listener", (Throwable)remoteException);
      } 
      return this;
    }
    
    @Deprecated
    public a d(String param1String, f.b param1b, f.a param1a) {
      s5 s5 = new s5(param1b, param1a);
      try {
        this.b.k3(param1String, s5.e(), s5.f());
      } catch (RemoteException remoteException) {
        cm.d("Failed to add custom template ad listener", (Throwable)remoteException);
      } 
      return this;
    }
    
    @Deprecated
    public a e(g.a param1a) {
      try {
        ur2 ur21 = this.b;
        y5 y5 = new y5();
        this(param1a);
        ur21.R8((c5)y5);
      } catch (RemoteException remoteException) {
        cm.d("Failed to add google native ad listener", (Throwable)remoteException);
      } 
      return this;
    }
    
    public a f(b param1b) {
      try {
        ur2 ur21 = this.b;
        eq2 eq2 = new eq2();
        this(param1b);
        ur21.C5((jr2)eq2);
      } catch (RemoteException remoteException) {
        cm.d("Failed to set AdListener.", (Throwable)remoteException);
      } 
      return this;
    }
    
    @Deprecated
    public a g(b param1b) {
      try {
        ur2 ur21 = this.b;
        zzaeh zzaeh = new zzaeh();
        this(param1b);
        ur21.c3(zzaeh);
      } catch (RemoteException remoteException) {
        cm.d("Failed to specify native ad options", (Throwable)remoteException);
      } 
      return this;
    }
    
    public a h(b param1b) {
      try {
        ur2 ur21 = this.b;
        zzaeh zzaeh = new zzaeh();
        this(param1b);
        ur21.c3(zzaeh);
      } catch (RemoteException remoteException) {
        cm.d("Failed to specify native ad options", (Throwable)remoteException);
      } 
      return this;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */