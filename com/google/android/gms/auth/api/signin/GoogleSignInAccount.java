package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
  public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new f();
  
  private static e b = h.d();
  
  private final int c;
  
  private String d;
  
  private String e;
  
  private String f;
  
  private String g;
  
  private Uri h;
  
  private String i;
  
  private long j;
  
  private String k;
  
  private List<Scope> l;
  
  private String m;
  
  private String n;
  
  private Set<Scope> o = new HashSet<Scope>();
  
  GoogleSignInAccount(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, Uri paramUri, String paramString5, long paramLong, String paramString6, List<Scope> paramList, String paramString7, String paramString8) {
    this.c = paramInt;
    this.d = paramString1;
    this.e = paramString2;
    this.f = paramString3;
    this.g = paramString4;
    this.h = paramUri;
    this.i = paramString5;
    this.j = paramLong;
    this.k = paramString6;
    this.l = paramList;
    this.m = paramString7;
    this.n = paramString8;
  }
  
  private final JSONObject C0() {
    JSONObject jSONObject = new JSONObject();
    try {
      if (s0() != null)
        jSONObject.put("id", s0()); 
      if (t0() != null)
        jSONObject.put("tokenId", t0()); 
      if (p0() != null)
        jSONObject.put("email", p0()); 
      if (o0() != null)
        jSONObject.put("displayName", o0()); 
      if (r0() != null)
        jSONObject.put("givenName", r0()); 
      if (q0() != null)
        jSONObject.put("familyName", q0()); 
      if (u0() != null)
        jSONObject.put("photoUrl", u0().toString()); 
      if (w0() != null)
        jSONObject.put("serverAuthCode", w0()); 
      jSONObject.put("expirationTime", this.j);
      jSONObject.put("obfuscatedIdentifier", this.k);
      JSONArray jSONArray = new JSONArray();
      this();
      List<Scope> list = this.l;
      Scope[] arrayOfScope = list.<Scope>toArray(new Scope[list.size()]);
      Arrays.sort(arrayOfScope, e.b);
      int i = arrayOfScope.length;
      for (byte b = 0; b < i; b++)
        jSONArray.put(arrayOfScope[b].o0()); 
      jSONObject.put("grantedScopes", jSONArray);
      return jSONObject;
    } catch (JSONException jSONException) {
      RuntimeException runtimeException = new RuntimeException((Throwable)jSONException);
      throw runtimeException;
    } 
  }
  
  public static GoogleSignInAccount y0(String paramString) {
    if (TextUtils.isEmpty(paramString))
      return null; 
    JSONObject jSONObject = new JSONObject(paramString);
    paramString = jSONObject.optString("photoUrl", null);
    if (!TextUtils.isEmpty(paramString)) {
      Uri uri = Uri.parse(paramString);
    } else {
      paramString = null;
    } 
    long l = Long.parseLong(jSONObject.getString("expirationTime"));
    HashSet<Scope> hashSet = new HashSet();
    JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
    int i = jSONArray.length();
    for (byte b = 0; b < i; b++)
      hashSet.add(new Scope(jSONArray.getString(b))); 
    GoogleSignInAccount googleSignInAccount = z0(jSONObject.optString("id"), jSONObject.optString("tokenId", null), jSONObject.optString("email", null), jSONObject.optString("displayName", null), jSONObject.optString("givenName", null), jSONObject.optString("familyName", null), (Uri)paramString, Long.valueOf(l), jSONObject.getString("obfuscatedIdentifier"), hashSet);
    googleSignInAccount.i = jSONObject.optString("serverAuthCode", null);
    return googleSignInAccount;
  }
  
  private static GoogleSignInAccount z0(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, Uri paramUri, Long paramLong, String paramString7, Set<Scope> paramSet) {
    if (paramLong == null)
      paramLong = Long.valueOf(b.a() / 1000L); 
    return new GoogleSignInAccount(3, paramString1, paramString2, paramString3, paramString4, paramUri, null, paramLong.longValue(), t.f(paramString7), new ArrayList<Scope>((Collection<? extends Scope>)t.j(paramSet)), paramString5, paramString6);
  }
  
  public final String A0() {
    return this.k;
  }
  
  public final String B0() {
    JSONObject jSONObject = C0();
    jSONObject.remove("serverAuthCode");
    return jSONObject.toString();
  }
  
  public Account U() {
    return (this.f == null) ? null : new Account(this.f, "com.google");
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (!(paramObject instanceof GoogleSignInAccount))
      return false; 
    paramObject = paramObject;
    return (((GoogleSignInAccount)paramObject).k.equals(this.k) && paramObject.v0().equals(v0()));
  }
  
  public int hashCode() {
    return (this.k.hashCode() + 527) * 31 + v0().hashCode();
  }
  
  public String o0() {
    return this.g;
  }
  
  public String p0() {
    return this.f;
  }
  
  public String q0() {
    return this.n;
  }
  
  public String r0() {
    return this.m;
  }
  
  public String s0() {
    return this.d;
  }
  
  public String t0() {
    return this.e;
  }
  
  public Uri u0() {
    return this.h;
  }
  
  public Set<Scope> v0() {
    HashSet<Scope> hashSet = new HashSet<Scope>(this.l);
    hashSet.addAll(this.o);
    return hashSet;
  }
  
  public String w0() {
    return this.i;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = a.a(paramParcel);
    a.k(paramParcel, 1, this.c);
    a.r(paramParcel, 2, s0(), false);
    a.r(paramParcel, 3, t0(), false);
    a.r(paramParcel, 4, p0(), false);
    a.r(paramParcel, 5, o0(), false);
    a.q(paramParcel, 6, (Parcelable)u0(), paramInt, false);
    a.r(paramParcel, 7, w0(), false);
    a.n(paramParcel, 8, this.j);
    a.r(paramParcel, 9, this.k, false);
    a.v(paramParcel, 10, this.l, false);
    a.r(paramParcel, 11, r0(), false);
    a.r(paramParcel, 12, q0(), false);
    a.b(paramParcel, i);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/auth/api/signin/GoogleSignInAccount.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */