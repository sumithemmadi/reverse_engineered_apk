package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.a;
import com.google.android.gms.auth.api.signin.c;
import com.google.android.gms.common.util.t;

public final class u extends r {
  private final Context b;
  
  public u(Context paramContext) {
    this.b = paramContext;
  }
  
  private final void i1() {
    if (t.a(this.b, Binder.getCallingUid()))
      return; 
    int i = Binder.getCallingUid();
    StringBuilder stringBuilder = new StringBuilder(52);
    stringBuilder.append("Calling UID ");
    stringBuilder.append(i);
    stringBuilder.append(" is not Google Play services.");
    throw new SecurityException(stringBuilder.toString());
  }
  
  public final void g0() {
    i1();
    b b = b.b(this.b);
    GoogleSignInAccount googleSignInAccount = b.c();
    GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.g;
    if (googleSignInAccount != null)
      googleSignInOptions = b.d(); 
    c c = a.b(this.b, googleSignInOptions);
    if (googleSignInAccount != null) {
      c.m();
      return;
    } 
    c.n();
  }
  
  public final void s0() {
    i1();
    p.c(this.b).a();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/auth/api/signin/internal/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */