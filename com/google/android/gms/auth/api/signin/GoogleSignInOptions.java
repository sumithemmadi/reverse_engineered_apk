package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.auth.api.signin.internal.a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GoogleSignInOptions extends AbstractSafeParcelable implements a.d, ReflectedParcelable {
  public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;
  
  public static final Scope b = new Scope("profile");
  
  public static final Scope c = new Scope("email");
  
  public static final Scope d = new Scope("openid");
  
  public static final Scope e;
  
  public static final Scope f = new Scope("https://www.googleapis.com/auth/games");
  
  public static final GoogleSignInOptions g = (new a()).c().d().a();
  
  public static final GoogleSignInOptions h;
  
  private static Comparator<Scope> i;
  
  private final int j;
  
  private final ArrayList<Scope> k;
  
  private Account l;
  
  private boolean m;
  
  private final boolean n;
  
  private final boolean o;
  
  private String p;
  
  private String q;
  
  private ArrayList<GoogleSignInOptionsExtensionParcelable> r;
  
  private String s;
  
  private Map<Integer, GoogleSignInOptionsExtensionParcelable> t;
  
  static {
    h = (new a()).e(scope, new Scope[0]).a();
    CREATOR = new h();
    i = new g();
  }
  
  GoogleSignInOptions(int paramInt, ArrayList<Scope> paramArrayList, Account paramAccount, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString1, String paramString2, ArrayList<GoogleSignInOptionsExtensionParcelable> paramArrayList1, String paramString3) {
    this(paramInt, paramArrayList, paramAccount, paramBoolean1, paramBoolean2, paramBoolean3, paramString1, paramString2, w0(paramArrayList1), paramString3);
  }
  
  private GoogleSignInOptions(int paramInt, ArrayList<Scope> paramArrayList, Account paramAccount, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString1, String paramString2, Map<Integer, GoogleSignInOptionsExtensionParcelable> paramMap, String paramString3) {
    this.j = paramInt;
    this.k = paramArrayList;
    this.l = paramAccount;
    this.m = paramBoolean1;
    this.n = paramBoolean2;
    this.o = paramBoolean3;
    this.p = paramString1;
    this.q = paramString2;
    this.r = new ArrayList<GoogleSignInOptionsExtensionParcelable>(paramMap.values());
    this.t = paramMap;
    this.s = paramString3;
  }
  
  private final JSONObject B0() {
    JSONObject jSONObject = new JSONObject();
    try {
      JSONArray jSONArray = new JSONArray();
      this();
      Collections.sort(this.k, i);
      ArrayList<Scope> arrayList = this.k;
      int i = arrayList.size();
      byte b = 0;
      while (b < i) {
        Scope scope = (Scope)arrayList.get(b);
        b++;
        jSONArray.put(((Scope)scope).o0());
      } 
      jSONObject.put("scopes", jSONArray);
      Account account = this.l;
      if (account != null)
        jSONObject.put("accountName", account.name); 
      jSONObject.put("idTokenRequested", this.m);
      jSONObject.put("forceCodeForRefreshToken", this.o);
      jSONObject.put("serverAuthRequested", this.n);
      if (!TextUtils.isEmpty(this.p))
        jSONObject.put("serverClientId", this.p); 
      if (!TextUtils.isEmpty(this.q))
        jSONObject.put("hostedDomain", this.q); 
      return jSONObject;
    } catch (JSONException jSONException) {
      RuntimeException runtimeException = new RuntimeException((Throwable)jSONException);
      throw runtimeException;
    } 
  }
  
  private static Map<Integer, GoogleSignInOptionsExtensionParcelable> w0(List<GoogleSignInOptionsExtensionParcelable> paramList) {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    if (paramList == null)
      return (Map)hashMap; 
    for (GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable : paramList)
      hashMap.put(Integer.valueOf(googleSignInOptionsExtensionParcelable.o0()), googleSignInOptionsExtensionParcelable); 
    return (Map)hashMap;
  }
  
  public static GoogleSignInOptions x0(String paramString) {
    if (TextUtils.isEmpty(paramString))
      return null; 
    JSONObject jSONObject = new JSONObject(paramString);
    HashSet<Scope> hashSet = new HashSet();
    JSONArray jSONArray = jSONObject.getJSONArray("scopes");
    int i = jSONArray.length();
    for (byte b = 0; b < i; b++)
      hashSet.add(new Scope(jSONArray.getString(b))); 
    String str = jSONObject.optString("accountName", null);
    if (!TextUtils.isEmpty(str)) {
      Account account = new Account(str, "com.google");
    } else {
      str = null;
    } 
    return new GoogleSignInOptions(3, new ArrayList<Scope>(hashSet), (Account)str, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.optString("serverClientId", null), jSONObject.optString("hostedDomain", null), new HashMap<Integer, GoogleSignInOptionsExtensionParcelable>(), null);
  }
  
  public final String D0() {
    return B0().toString();
  }
  
  public Account U() {
    return this.l;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == null)
      return false; 
    try {
      GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions)paramObject;
      if (this.r.size() <= 0 && googleSignInOptions.r.size() <= 0 && this.k.size() == googleSignInOptions.q0().size() && this.k.containsAll(googleSignInOptions.q0())) {
        paramObject = this.l;
        if (((paramObject == null) ? (googleSignInOptions.U() == null) : paramObject.equals(googleSignInOptions.U())) && (TextUtils.isEmpty(this.p) ? TextUtils.isEmpty(googleSignInOptions.r0()) : this.p.equals(googleSignInOptions.r0())) && this.o == googleSignInOptions.s0() && this.m == googleSignInOptions.t0() && this.n == googleSignInOptions.u0()) {
          boolean bool = TextUtils.equals(this.s, googleSignInOptions.p0());
          if (bool)
            return true; 
        } 
      } 
    } catch (ClassCastException classCastException) {}
    return false;
  }
  
  public int hashCode() {
    ArrayList<String> arrayList = new ArrayList();
    ArrayList<Scope> arrayList1 = this.k;
    int i = arrayList1.size();
    byte b = 0;
    while (b < i) {
      Scope scope = (Scope)arrayList1.get(b);
      b++;
      arrayList.add(((Scope)scope).o0());
    } 
    Collections.sort(arrayList);
    return (new a()).a(arrayList).a(this.l).a(this.p).c(this.o).c(this.m).c(this.n).a(this.s).b();
  }
  
  public ArrayList<GoogleSignInOptionsExtensionParcelable> o0() {
    return this.r;
  }
  
  public String p0() {
    return this.s;
  }
  
  public ArrayList<Scope> q0() {
    return new ArrayList<Scope>(this.k);
  }
  
  public String r0() {
    return this.p;
  }
  
  public boolean s0() {
    return this.o;
  }
  
  public boolean t0() {
    return this.m;
  }
  
  public boolean u0() {
    return this.n;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = com.google.android.gms.common.internal.safeparcel.a.a(paramParcel);
    com.google.android.gms.common.internal.safeparcel.a.k(paramParcel, 1, this.j);
    com.google.android.gms.common.internal.safeparcel.a.v(paramParcel, 2, q0(), false);
    com.google.android.gms.common.internal.safeparcel.a.q(paramParcel, 3, (Parcelable)U(), paramInt, false);
    com.google.android.gms.common.internal.safeparcel.a.c(paramParcel, 4, t0());
    com.google.android.gms.common.internal.safeparcel.a.c(paramParcel, 5, u0());
    com.google.android.gms.common.internal.safeparcel.a.c(paramParcel, 6, s0());
    com.google.android.gms.common.internal.safeparcel.a.r(paramParcel, 7, r0(), false);
    com.google.android.gms.common.internal.safeparcel.a.r(paramParcel, 8, this.q, false);
    com.google.android.gms.common.internal.safeparcel.a.v(paramParcel, 9, o0(), false);
    com.google.android.gms.common.internal.safeparcel.a.r(paramParcel, 10, p0(), false);
    com.google.android.gms.common.internal.safeparcel.a.b(paramParcel, i);
  }
  
  static {
    Scope scope = new Scope("https://www.googleapis.com/auth/games_lite");
    e = scope;
  }
  
  public static final class a {
    private Set<Scope> a = new HashSet<Scope>();
    
    private boolean b;
    
    private boolean c;
    
    private boolean d;
    
    private String e;
    
    private Account f;
    
    private String g;
    
    private Map<Integer, GoogleSignInOptionsExtensionParcelable> h = new HashMap<Integer, GoogleSignInOptionsExtensionParcelable>();
    
    private String i;
    
    public a() {}
    
    public a(GoogleSignInOptions param1GoogleSignInOptions) {
      t.j(param1GoogleSignInOptions);
      this.a = new HashSet<Scope>(GoogleSignInOptions.v0(param1GoogleSignInOptions));
      this.b = GoogleSignInOptions.z0(param1GoogleSignInOptions);
      this.c = GoogleSignInOptions.A0(param1GoogleSignInOptions);
      this.d = GoogleSignInOptions.C0(param1GoogleSignInOptions);
      this.e = GoogleSignInOptions.E0(param1GoogleSignInOptions);
      this.f = GoogleSignInOptions.F0(param1GoogleSignInOptions);
      this.g = GoogleSignInOptions.G0(param1GoogleSignInOptions);
      this.h = GoogleSignInOptions.y0(GoogleSignInOptions.H0(param1GoogleSignInOptions));
      this.i = GoogleSignInOptions.I0(param1GoogleSignInOptions);
    }
    
    public final GoogleSignInOptions a() {
      if (this.a.contains(GoogleSignInOptions.f)) {
        Set<Scope> set = this.a;
        Scope scope = GoogleSignInOptions.e;
        if (set.contains(scope))
          this.a.remove(scope); 
      } 
      if (this.d && (this.f == null || !this.a.isEmpty()))
        c(); 
      return new GoogleSignInOptions(3, new ArrayList<Scope>(this.a), this.f, this.d, this.b, this.c, this.e, this.g, this.h, this.i, null);
    }
    
    public final a b() {
      this.a.add(GoogleSignInOptions.c);
      return this;
    }
    
    public final a c() {
      this.a.add(GoogleSignInOptions.d);
      return this;
    }
    
    public final a d() {
      this.a.add(GoogleSignInOptions.b);
      return this;
    }
    
    public final a e(Scope param1Scope, Scope... param1VarArgs) {
      this.a.add(param1Scope);
      this.a.addAll(Arrays.asList(param1VarArgs));
      return this;
    }
    
    public final a f(String param1String) {
      this.i = param1String;
      return this;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/auth/api/signin/GoogleSignInOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */