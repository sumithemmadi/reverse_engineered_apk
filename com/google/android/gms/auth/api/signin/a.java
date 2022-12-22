package com.google.android.gms.auth.api.signin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.signin.internal.i;
import com.google.android.gms.auth.api.signin.internal.p;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.tasks.g;
import com.google.android.gms.tasks.j;

public final class a {
  public static c a(Activity paramActivity, GoogleSignInOptions paramGoogleSignInOptions) {
    return new c(paramActivity, (GoogleSignInOptions)t.j(paramGoogleSignInOptions));
  }
  
  public static c b(Context paramContext, GoogleSignInOptions paramGoogleSignInOptions) {
    return new c(paramContext, (GoogleSignInOptions)t.j(paramGoogleSignInOptions));
  }
  
  public static GoogleSignInAccount c(Context paramContext) {
    return p.c(paramContext).e();
  }
  
  public static g<GoogleSignInAccount> d(Intent paramIntent) {
    d d = i.a(paramIntent);
    if (d == null)
      return j.d((Exception)b.a(Status.d)); 
    GoogleSignInAccount googleSignInAccount = d.a();
    return (!d.c().s0() || googleSignInAccount == null) ? j.d((Exception)b.a(d.c())) : j.e(googleSignInAccount);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/auth/api/signin/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */