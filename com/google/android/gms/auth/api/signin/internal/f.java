package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.n;
import com.google.android.gms.common.i.a;
import com.google.android.gms.common.internal.t;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public final class f implements Runnable {
  private static final a b = new a("RevokeAccessOperation", new String[0]);
  
  private final String c;
  
  private final n d;
  
  private f(String paramString) {
    this.c = t.f(paramString);
    this.d = new n(null);
  }
  
  public static com.google.android.gms.common.api.f<Status> a(String paramString) {
    if (paramString == null)
      return g.a((i)new Status(4), null); 
    f f1 = new f(paramString);
    (new Thread(f1)).start();
    return (com.google.android.gms.common.api.f<Status>)f1.d;
  }
  
  public final void run() {
    a a1;
    a a2;
    Status status1 = Status.d;
    Status status2 = status1;
    Status status3 = status1;
    try {
      URL uRL = new URL();
      status2 = status1;
      status3 = status1;
      String str = String.valueOf(this.c);
      status2 = status1;
      status3 = status1;
      if (str.length() != 0) {
        status2 = status1;
        status3 = status1;
        str = "https://accounts.google.com/o/oauth2/revoke?token=".concat(str);
      } else {
        status2 = status1;
        status3 = status1;
        str = new String("https://accounts.google.com/o/oauth2/revoke?token=");
      } 
      status2 = status1;
      status3 = status1;
      this(str);
      status2 = status1;
      status3 = status1;
      HttpURLConnection httpURLConnection = (HttpURLConnection)uRL.openConnection();
      status2 = status1;
      status3 = status1;
      httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
      status2 = status1;
      status3 = status1;
      int i = httpURLConnection.getResponseCode();
      if (i == 200) {
        status2 = status1;
        status3 = status1;
        status1 = Status.b;
      } else {
        status2 = status1;
        status3 = status1;
        b.b("Unable to revoke access!", new Object[0]);
      } 
      status2 = status1;
      status3 = status1;
      a a3 = b;
      status2 = status1;
      status3 = status1;
      StringBuilder stringBuilder = new StringBuilder();
      status2 = status1;
      status3 = status1;
      this(26);
      status2 = status1;
      status3 = status1;
      stringBuilder.append("Response Code: ");
      status2 = status1;
      status3 = status1;
      stringBuilder.append(i);
      status2 = status1;
      status3 = status1;
      a3.a(stringBuilder.toString(), new Object[0]);
    } catch (IOException iOException) {
      a2 = b;
      String str = String.valueOf(iOException.toString());
      if (str.length() != 0) {
        str = "IOException when revoking access: ".concat(str);
      } else {
        str = new String("IOException when revoking access: ");
      } 
      a2.b(str, new Object[0]);
      Status status = status3;
    } catch (Exception exception) {
      a a3 = b;
      String str = String.valueOf(exception.toString());
      if (str.length() != 0) {
        str = "Exception when revoking access: ".concat(str);
      } else {
        str = new String("Exception when revoking access: ");
      } 
      a3.b(str, new Object[0]);
      a1 = a2;
    } 
    this.d.f((i)a1);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/auth/api/signin/internal/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */