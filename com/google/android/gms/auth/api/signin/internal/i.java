package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.d;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.common.i.a;
import java.util.Iterator;

public final class i {
  private static a a = new a("GoogleSignInCommon", new String[0]);
  
  public static d a(Intent paramIntent) {
    Status status1;
    if (paramIntent == null)
      return new d(null, Status.d); 
    Status status2 = (Status)paramIntent.getParcelableExtra("googleSignInStatus");
    GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount)paramIntent.getParcelableExtra("googleSignInAccount");
    if (googleSignInAccount == null) {
      status1 = status2;
      if (status2 == null)
        status1 = Status.d; 
      return new d(null, status1);
    } 
    return new d((GoogleSignInAccount)status1, Status.b);
  }
  
  public static Intent b(Context paramContext, GoogleSignInOptions paramGoogleSignInOptions) {
    a.a("getSignInIntent()", new Object[0]);
    SignInConfiguration signInConfiguration = new SignInConfiguration(paramContext.getPackageName(), paramGoogleSignInOptions);
    Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
    intent.setPackage(paramContext.getPackageName());
    intent.setClass(paramContext, SignInHubActivity.class);
    Bundle bundle = new Bundle();
    bundle.putParcelable("config", (Parcelable)signInConfiguration);
    intent.putExtra("config", bundle);
    return intent;
  }
  
  public static f<Status> c(d paramd, Context paramContext, boolean paramBoolean) {
    a.a("Signing out", new Object[0]);
    d(paramContext);
    return (f<Status>)(paramBoolean ? g.b(Status.b, paramd) : paramd.a(new j(paramd)));
  }
  
  private static void d(Context paramContext) {
    p.c(paramContext).a();
    Iterator<d> iterator = d.b().iterator();
    while (iterator.hasNext())
      ((d)iterator.next()).e(); 
    f.a();
  }
  
  public static Intent e(Context paramContext, GoogleSignInOptions paramGoogleSignInOptions) {
    a.a("getFallbackSignInIntent()", new Object[0]);
    Intent intent = b(paramContext, paramGoogleSignInOptions);
    intent.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
    return intent;
  }
  
  public static f<Status> f(d paramd, Context paramContext, boolean paramBoolean) {
    a.a("Revoking access", new Object[0]);
    String str = b.b(paramContext).e();
    d(paramContext);
    return (f<Status>)(paramBoolean ? f.a(str) : paramd.a(new k(paramd)));
  }
  
  public static Intent g(Context paramContext, GoogleSignInOptions paramGoogleSignInOptions) {
    a.a("getNoImplementationSignInIntent()", new Object[0]);
    Intent intent = b(paramContext, paramGoogleSignInOptions);
    intent.setAction("com.google.android.gms.auth.NO_IMPL");
    return intent;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/auth/api/signin/internal/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */