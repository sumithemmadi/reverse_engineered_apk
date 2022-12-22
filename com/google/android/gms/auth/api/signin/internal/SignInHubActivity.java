package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.FragmentActivity;
import androidx.loader.content.b;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.d;

@KeepName
public class SignInHubActivity extends FragmentActivity {
  private static boolean q = false;
  
  private boolean r = false;
  
  private SignInConfiguration s;
  
  private boolean t;
  
  private int u;
  
  private Intent v;
  
  private final void C(int paramInt) {
    Status status = new Status(paramInt);
    Intent intent = new Intent();
    intent.putExtra("googleSignInStatus", (Parcelable)status);
    setResult(0, intent);
    finish();
    q = false;
  }
  
  private final void E() {
    t().c(0, null, new a(null));
    q = false;
  }
  
  public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent) {
    return true;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {
    if (this.r)
      return; 
    setResult(0);
    if (paramInt1 == 40962) {
      if (paramIntent != null) {
        SignInAccount signInAccount = (SignInAccount)paramIntent.getParcelableExtra("signInAccount");
        if (signInAccount != null && signInAccount.S() != null) {
          GoogleSignInAccount googleSignInAccount = signInAccount.S();
          p.c((Context)this).b(this.s.o0(), (GoogleSignInAccount)com.google.android.gms.internal.auth_api.a.a(googleSignInAccount));
          paramIntent.removeExtra("signInAccount");
          paramIntent.putExtra("googleSignInAccount", (Parcelable)googleSignInAccount);
          this.t = true;
          this.u = paramInt2;
          this.v = paramIntent;
          E();
          return;
        } 
        if (paramIntent.hasExtra("errorCode")) {
          paramInt2 = paramIntent.getIntExtra("errorCode", 8);
          paramInt1 = paramInt2;
          if (paramInt2 == 13)
            paramInt1 = 12501; 
          C(paramInt1);
          return;
        } 
      } 
      C(8);
    } 
  }
  
  protected void onCreate(Bundle paramBundle) {
    String str1;
    super.onCreate(paramBundle);
    Intent intent = getIntent();
    String str2 = (String)com.google.android.gms.internal.auth_api.a.a(intent.getAction());
    if ("com.google.android.gms.auth.NO_IMPL".equals(str2)) {
      C(12500);
      return;
    } 
    if (!str2.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !str2.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
      str1 = String.valueOf(intent.getAction());
      if (str1.length() != 0) {
        str1 = "Unknown action: ".concat(str1);
      } else {
        str1 = new String("Unknown action: ");
      } 
      Log.e("AuthSignInClient", str1);
      finish();
      return;
    } 
    SignInConfiguration signInConfiguration = (SignInConfiguration)((Bundle)com.google.android.gms.internal.auth_api.a.a(intent.getBundleExtra("config"))).getParcelable("config");
    if (signInConfiguration == null) {
      Log.e("AuthSignInClient", "Activity started with invalid configuration.");
      setResult(0);
      finish();
      return;
    } 
    this.s = signInConfiguration;
    if (str1 == null) {
      if (q) {
        setResult(0);
        C(12502);
        return;
      } 
      q = true;
      Intent intent1 = new Intent(str2);
      if (str2.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
        intent1.setPackage("com.google.android.gms");
      } else {
        intent1.setPackage(getPackageName());
      } 
      intent1.putExtra("config", (Parcelable)this.s);
      try {
        startActivityForResult(intent1, 40962);
        return;
      } catch (ActivityNotFoundException activityNotFoundException) {
        this.r = true;
        Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
        C(17);
        return;
      } 
    } 
    boolean bool = activityNotFoundException.getBoolean("signingInGoogleApiClients");
    this.t = bool;
    if (bool) {
      this.u = activityNotFoundException.getInt("signInResultCode");
      this.v = (Intent)com.google.android.gms.internal.auth_api.a.a(activityNotFoundException.getParcelable("signInResultData"));
      E();
    } 
  }
  
  protected void onSaveInstanceState(Bundle paramBundle) {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putBoolean("signingInGoogleApiClients", this.t);
    if (this.t) {
      paramBundle.putInt("signInResultCode", this.u);
      paramBundle.putParcelable("signInResultData", (Parcelable)this.v);
    } 
  }
  
  private final class a implements b.o.a.a.a<Void> {
    private a(SignInHubActivity this$0) {}
    
    public final b<Void> b(int param1Int, Bundle param1Bundle) {
      return (b<Void>)new e((Context)this.a, d.b());
    }
    
    public final void c(b<Void> param1b) {}
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/auth/api/signin/internal/SignInHubActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */