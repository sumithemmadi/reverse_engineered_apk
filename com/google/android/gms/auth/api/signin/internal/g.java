package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.h;
import com.google.android.gms.internal.auth_api.b;
import java.util.Iterator;

public final class g extends h<s> {
  private final GoogleSignInOptions H;
  
  public g(Context paramContext, Looper paramLooper, e parame, GoogleSignInOptions paramGoogleSignInOptions, d.a parama, d.b paramb) {
    super(paramContext, paramLooper, 91, parame, parama, paramb);
    GoogleSignInOptions.a a1;
    if (paramGoogleSignInOptions != null) {
      a1 = new GoogleSignInOptions.a(paramGoogleSignInOptions);
    } else {
      a1 = new GoogleSignInOptions.a();
    } 
    a1.f(b.a());
    if (!parame.d().isEmpty()) {
      Iterator<Scope> iterator = parame.d().iterator();
      while (iterator.hasNext())
        a1.e(iterator.next(), new Scope[0]); 
    } 
    this.H = a1.a();
  }
  
  protected final String l() {
    return "com.google.android.gms.auth.api.signin.internal.ISignInService";
  }
  
  public final GoogleSignInOptions n0() {
    return this.H;
  }
  
  public final int o() {
    return 12451000;
  }
  
  protected final String r() {
    return "com.google.android.gms.auth.api.signin.service.START";
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/auth/api/signin/internal/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */