package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.c;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.k.c;
import com.google.android.gms.common.util.f;
import com.google.android.gms.internal.measurement.ia;
import com.google.android.gms.internal.measurement.kc;
import java.io.ByteArrayInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public final class u9 extends n5 {
  private static final String[] c = new String[] { "firebase_", "google_", "ga_" };
  
  private static final String[] d = new String[] { "_err" };
  
  private SecureRandom f;
  
  private final AtomicLong g = new AtomicLong(0L);
  
  private int h;
  
  private Integer i = null;
  
  u9(s4 params4) {
    super(params4);
  }
  
  static MessageDigest B() {
    byte b = 0;
    while (true) {
      if (b < 2) {
        try {
          MessageDigest messageDigest = MessageDigest.getInstance("MD5");
          if (messageDigest != null)
            return messageDigest; 
        } catch (NoSuchAlgorithmException noSuchAlgorithmException) {}
        b++;
        continue;
      } 
      return null;
    } 
  }
  
  static long C(byte[] paramArrayOfbyte) {
    boolean bool2;
    t.j(paramArrayOfbyte);
    int i = paramArrayOfbyte.length;
    boolean bool1 = false;
    if (i > 0) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    t.m(bool2);
    i--;
    long l = 0L;
    while (i >= 0 && i >= paramArrayOfbyte.length - 8) {
      l += (paramArrayOfbyte[i] & 0xFFL) << bool1;
      bool1 += true;
      i--;
    } 
    return l;
  }
  
  static boolean D(Context paramContext, boolean paramBoolean) {
    t.j(paramContext);
    return (Build.VERSION.SDK_INT >= 24) ? f0(paramContext, "com.google.android.gms.measurement.AppMeasurementJobService") : f0(paramContext, "com.google.android.gms.measurement.AppMeasurementService");
  }
  
  static boolean F(String paramString) {
    return (!TextUtils.isEmpty(paramString) && paramString.startsWith("_"));
  }
  
  static boolean G(String paramString1, String paramString2) {
    return (paramString1 != null || paramString2 != null) ? ((paramString1 == null) ? false : paramString1.equals(paramString2)) : true;
  }
  
  public static boolean M(String paramString) {
    return !d[0].equals(paramString);
  }
  
  public static ArrayList<Bundle> Y(List<zzaa> paramList) {
    if (paramList == null)
      return new ArrayList<Bundle>(0); 
    ArrayList<Bundle> arrayList = new ArrayList(paramList.size());
    for (zzaa zzaa : paramList) {
      Bundle bundle = new Bundle();
      bundle.putString("app_id", zzaa.b);
      bundle.putString("origin", zzaa.c);
      bundle.putLong("creation_timestamp", zzaa.e);
      bundle.putString("name", zzaa.d.c);
      p5.a(bundle, zzaa.d.o0());
      bundle.putBoolean("active", zzaa.f);
      String str = zzaa.g;
      if (str != null)
        bundle.putString("trigger_event_name", str); 
      zzas zzas = zzaa.h;
      if (zzas != null) {
        bundle.putString("timed_out_event_name", zzas.b);
        zzaq zzaq = zzaa.h.c;
        if (zzaq != null)
          bundle.putBundle("timed_out_event_params", zzaq.t0()); 
      } 
      bundle.putLong("trigger_timeout", zzaa.i);
      zzas = zzaa.j;
      if (zzas != null) {
        bundle.putString("triggered_event_name", zzas.b);
        zzaq zzaq = zzaa.j.c;
        if (zzaq != null)
          bundle.putBundle("triggered_event_params", zzaq.t0()); 
      } 
      bundle.putLong("triggered_timestamp", zzaa.d.d);
      bundle.putLong("time_to_live", zzaa.k);
      zzas = zzaa.l;
      if (zzas != null) {
        bundle.putString("expired_event_name", zzas.b);
        zzaq zzaq = zzaa.l.c;
        if (zzaq != null)
          bundle.putBundle("expired_event_params", zzaq.t0()); 
      } 
      arrayList.add(bundle);
    } 
    return arrayList;
  }
  
  static boolean a0(Context paramContext) {
    t.j(paramContext);
    try {
      PackageManager packageManager = paramContext.getPackageManager();
      if (packageManager == null)
        return false; 
      ComponentName componentName = new ComponentName();
      this(paramContext, "com.google.android.gms.measurement.AppMeasurementReceiver");
      ActivityInfo activityInfo = packageManager.getReceiverInfo(componentName, 0);
      if (activityInfo != null) {
        boolean bool = activityInfo.enabled;
        if (bool)
          return true; 
      } 
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {}
    return false;
  }
  
  static final boolean b0(Bundle paramBundle, int paramInt) {
    if (paramBundle.getLong("_err") == 0L) {
      paramBundle.putLong("_err", paramInt);
      return true;
    } 
    return false;
  }
  
  static final boolean c0(String paramString) {
    t.j(paramString);
    return paramString.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
  }
  
  private final Object d0(int paramInt, Object paramObject, boolean paramBoolean1, boolean paramBoolean2) {
    if (paramObject == null)
      return null; 
    if (paramObject instanceof Long || paramObject instanceof Double)
      return paramObject; 
    if (paramObject instanceof Integer)
      return Long.valueOf(((Integer)paramObject).intValue()); 
    if (paramObject instanceof Byte)
      return Long.valueOf(((Byte)paramObject).byteValue()); 
    if (paramObject instanceof Short)
      return Long.valueOf(((Short)paramObject).shortValue()); 
    if (paramObject instanceof Boolean) {
      long l;
      if (true != ((Boolean)paramObject).booleanValue()) {
        l = 0L;
      } else {
        l = 1L;
      } 
      return Long.valueOf(l);
    } 
    if (paramObject instanceof Float)
      return Double.valueOf(((Float)paramObject).doubleValue()); 
    if (paramObject instanceof String || paramObject instanceof Character || paramObject instanceof CharSequence)
      return q(String.valueOf(paramObject), paramInt, paramBoolean1); 
    if (paramBoolean2 && (paramObject instanceof Bundle[] || paramObject instanceof Parcelable[])) {
      ArrayList<Object> arrayList = new ArrayList();
      paramObject = paramObject;
      int i = paramObject.length;
      for (paramInt = 0; paramInt < i; paramInt++) {
        Object object = paramObject[paramInt];
        if (object instanceof Bundle) {
          object = I((Bundle)object);
          if (!object.isEmpty())
            arrayList.add(object); 
        } 
      } 
      return arrayList.toArray(new Bundle[arrayList.size()]);
    } 
    return null;
  }
  
  private final int e0(String paramString) {
    if ("_ldl".equals(paramString)) {
      this.a.z();
      return 2048;
    } 
    if (!"_id".equals(paramString)) {
      if (this.a.z().w(null, c3.g0) && "_lgclid".equals(paramString)) {
        this.a.z();
        return 100;
      } 
      this.a.z();
      return 36;
    } 
    this.a.z();
    return 256;
  }
  
  private static boolean f0(Context paramContext, String paramString) {
    try {
      PackageManager packageManager = paramContext.getPackageManager();
      if (packageManager == null)
        return false; 
      ComponentName componentName = new ComponentName();
      this(paramContext, paramString);
      ServiceInfo serviceInfo = packageManager.getServiceInfo(componentName, 0);
      if (serviceInfo != null) {
        boolean bool = serviceInfo.enabled;
        if (bool)
          return true; 
      } 
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {}
    return false;
  }
  
  private static boolean g0(String paramString, String[] paramArrayOfString) {
    t.j(paramArrayOfString);
    int i = paramArrayOfString.length;
    for (byte b = 0; b < i; b++) {
      if (G(paramString, paramArrayOfString[b]))
        return true; 
    } 
    return false;
  }
  
  static boolean j0(String paramString) {
    t.f(paramString);
    return (paramString.charAt(0) != '_' || paramString.equals("_ep"));
  }
  
  final void A(t9 paramt9, String paramString1, int paramInt1, String paramString2, String paramString3, int paramInt2, boolean paramBoolean) {
    Bundle bundle = new Bundle();
    b0(bundle, paramInt1);
    if (!TextUtils.isEmpty(paramString2) && !TextUtils.isEmpty(paramString3))
      bundle.putString(paramString2, paramString3); 
    if (paramInt1 == 6 || paramInt1 == 7 || paramInt1 == 2)
      bundle.putLong("_el", paramInt2); 
    if (paramBoolean) {
      paramt9.R(paramString1, "_err", bundle);
      return;
    } 
    this.a.d();
    this.a.F().X("auto", "_err", bundle);
  }
  
  final boolean E(String paramString) {
    h();
    if (c.a(this.a.a()).a(paramString) == 0)
      return true; 
    this.a.f().v().b("Permission not granted", paramString);
    return false;
  }
  
  final boolean H(String paramString) {
    if (TextUtils.isEmpty(paramString))
      return false; 
    String str = this.a.z().D();
    this.a.d();
    return str.equals(paramString);
  }
  
  final Bundle I(Bundle paramBundle) {
    Bundle bundle = new Bundle();
    if (paramBundle != null)
      for (String str : paramBundle.keySet()) {
        Object object = s(str, paramBundle.get(str));
        if (object == null) {
          this.a.f().t().b("Param value can't be null", this.a.H().q(str));
          continue;
        } 
        z(bundle, str, object);
      }  
    return bundle;
  }
  
  final zzas J(String paramString1, String paramString2, Bundle paramBundle, String paramString3, long paramLong, boolean paramBoolean1, boolean paramBoolean2) {
    if (TextUtils.isEmpty(paramString2))
      return null; 
    if (p0(paramString2) == 0) {
      if (paramBundle != null) {
        paramBundle = new Bundle(paramBundle);
      } else {
        paramBundle = new Bundle();
      } 
      paramBundle.putString("_o", paramString3);
      paramBundle = t(paramString1, paramString2, paramBundle, f.b("_o"), false);
      Bundle bundle = paramBundle;
      if (paramBoolean1)
        bundle = I(paramBundle); 
      t.j(bundle);
      return new zzas(paramString2, new zzaq(bundle), paramString3, paramLong);
    } 
    this.a.f().o().b("Invalid conditional property event name", this.a.H().r(paramString2));
    throw new IllegalArgumentException();
  }
  
  final boolean K(Context paramContext, String paramString) {
    X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
    try {
      PackageInfo packageInfo = c.a(paramContext).e(paramString, 64);
      if (packageInfo != null) {
        Signature[] arrayOfSignature = packageInfo.signatures;
        if (arrayOfSignature != null && arrayOfSignature.length > 0) {
          Signature signature = arrayOfSignature[0];
          CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
          ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream();
          this(signature.toByteArray());
          return ((X509Certificate)certificateFactory.generateCertificate(byteArrayInputStream)).getSubjectX500Principal().equals(x500Principal);
        } 
      } 
    } catch (CertificateException certificateException) {
      this.a.f().o().b("Error obtaining certificate", certificateException);
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
      this.a.f().o().b("Package name not found", nameNotFoundException);
    } 
    return true;
  }
  
  final byte[] L(Parcelable paramParcelable) {
    if (paramParcelable == null)
      return null; 
    Parcel parcel = Parcel.obtain();
    try {
      paramParcelable.writeToParcel(parcel, 0);
      return parcel.marshall();
    } finally {
      parcel.recycle();
    } 
  }
  
  @EnsuresNonNull({"this.apkVersion"})
  public final int N() {
    if (this.i == null)
      this.i = Integer.valueOf(c.f().a(this.a.a()) / 1000); 
    return this.i.intValue();
  }
  
  public final int O(int paramInt) {
    return c.f().h(this.a.a(), 12451000);
  }
  
  public final long P(long paramLong1, long paramLong2) {
    return (paramLong1 + paramLong2 * 60000L) / 86400000L;
  }
  
  final void Q(Bundle paramBundle, long paramLong) {
    long l = paramBundle.getLong("_et");
    if (l != 0L)
      this.a.f().r().b("Params already contained engagement", Long.valueOf(l)); 
    paramBundle.putLong("_et", paramLong + l);
  }
  
  public final void R(kc paramkc, String paramString) {
    Bundle bundle = new Bundle();
    bundle.putString("r", paramString);
    try {
      paramkc.z(bundle);
      return;
    } catch (RemoteException remoteException) {
      this.a.f().r().b("Error returning string value to wrapper", remoteException);
      return;
    } 
  }
  
  public final void S(kc paramkc, long paramLong) {
    Bundle bundle = new Bundle();
    bundle.putLong("r", paramLong);
    try {
      paramkc.z(bundle);
      return;
    } catch (RemoteException remoteException) {
      this.a.f().r().b("Error returning long value to wrapper", remoteException);
      return;
    } 
  }
  
  public final void T(kc paramkc, int paramInt) {
    Bundle bundle = new Bundle();
    bundle.putInt("r", paramInt);
    try {
      paramkc.z(bundle);
      return;
    } catch (RemoteException remoteException) {
      this.a.f().r().b("Error returning int value to wrapper", remoteException);
      return;
    } 
  }
  
  public final void U(kc paramkc, byte[] paramArrayOfbyte) {
    Bundle bundle = new Bundle();
    bundle.putByteArray("r", paramArrayOfbyte);
    try {
      paramkc.z(bundle);
      return;
    } catch (RemoteException remoteException) {
      this.a.f().r().b("Error returning byte array to wrapper", remoteException);
      return;
    } 
  }
  
  public final void V(kc paramkc, boolean paramBoolean) {
    Bundle bundle = new Bundle();
    bundle.putBoolean("r", paramBoolean);
    try {
      paramkc.z(bundle);
      return;
    } catch (RemoteException remoteException) {
      this.a.f().r().b("Error returning boolean value to wrapper", remoteException);
      return;
    } 
  }
  
  public final void W(kc paramkc, Bundle paramBundle) {
    try {
      paramkc.z(paramBundle);
      return;
    } catch (RemoteException remoteException) {
      this.a.f().r().b("Error returning bundle value to wrapper", remoteException);
      return;
    } 
  }
  
  public final void X(kc paramkc, ArrayList<Bundle> paramArrayList) {
    Bundle bundle = new Bundle();
    bundle.putParcelableArrayList("r", paramArrayList);
    try {
      paramkc.z(bundle);
      return;
    } catch (RemoteException remoteException) {
      this.a.f().r().b("Error returning bundle list to wrapper", remoteException);
      return;
    } 
  }
  
  public final URL Z(long paramLong1, String paramString1, String paramString2, long paramLong2) {
    try {
      t.f(paramString2);
      t.f(paramString1);
      String str = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", new Object[] { String.format("v%s.%s", new Object[] { Long.valueOf(39065L), Integer.valueOf(N()) }), paramString2, paramString1, Long.valueOf(paramLong2) });
      paramString2 = str;
      if (paramString1.equals(this.a.z().E()))
        paramString2 = str.concat("&ddl_test=1"); 
      return new URL(paramString2);
    } catch (MalformedURLException malformedURLException) {
    
    } catch (IllegalArgumentException illegalArgumentException) {}
    this.a.f().o().b("Failed to create BOW URL for Deferred Deep Link. exception", illegalArgumentException.getMessage());
    return null;
  }
  
  public final long h0() {
    if (this.g.get() == 0L)
      synchronized (this.g) {
        Random random = new Random();
        this(System.nanoTime() ^ this.a.b().a());
        long l1 = random.nextLong();
        int i = this.h + 1;
        this.h = i;
        long l2 = i;
        return l1 + l2;
      }  
    synchronized (this.g) {
      this.g.compareAndSet(-1L, 1L);
      return this.g.getAndIncrement();
    } 
  }
  
  protected final boolean i() {
    return true;
  }
  
  @EnsuresNonNull({"this.secureRandom"})
  final SecureRandom i0() {
    h();
    if (this.f == null)
      this.f = new SecureRandom(); 
    return this.f;
  }
  
  protected final void j() {
    h();
    SecureRandom secureRandom = new SecureRandom();
    long l1 = secureRandom.nextLong();
    long l2 = l1;
    if (l1 == 0L) {
      l1 = secureRandom.nextLong();
      l2 = l1;
      if (l1 == 0L) {
        this.a.f().r().a("Utils falling back to Random for random id");
        l2 = l1;
      } 
    } 
    this.g.set(l2);
  }
  
  final Bundle k0(Uri paramUri) {
    if (paramUri != null)
      try {
        CharSequence charSequence1;
        CharSequence charSequence2;
        CharSequence charSequence3;
        CharSequence charSequence4;
        boolean bool = paramUri.isHierarchical();
        if (bool) {
          charSequence1 = paramUri.getQueryParameter("utm_campaign");
          charSequence2 = paramUri.getQueryParameter("utm_source");
          charSequence3 = paramUri.getQueryParameter("utm_medium");
          charSequence4 = paramUri.getQueryParameter("gclid");
        } else {
          CharSequence charSequence = null;
          charSequence2 = charSequence;
          charSequence1 = charSequence2;
          charSequence4 = charSequence1;
          charSequence3 = charSequence1;
          charSequence1 = charSequence;
        } 
        if (!TextUtils.isEmpty(charSequence1) || !TextUtils.isEmpty(charSequence2) || !TextUtils.isEmpty(charSequence3) || !TextUtils.isEmpty(charSequence4)) {
          Bundle bundle = new Bundle();
          if (!TextUtils.isEmpty(charSequence1))
            bundle.putString("campaign", (String)charSequence1); 
          if (!TextUtils.isEmpty(charSequence2))
            bundle.putString("source", (String)charSequence2); 
          if (!TextUtils.isEmpty(charSequence3))
            bundle.putString("medium", (String)charSequence3); 
          if (!TextUtils.isEmpty(charSequence4))
            bundle.putString("gclid", (String)charSequence4); 
          charSequence2 = paramUri.getQueryParameter("utm_term");
          if (!TextUtils.isEmpty(charSequence2))
            bundle.putString("term", (String)charSequence2); 
          charSequence2 = paramUri.getQueryParameter("utm_content");
          if (!TextUtils.isEmpty(charSequence2))
            bundle.putString("content", (String)charSequence2); 
          charSequence2 = paramUri.getQueryParameter("aclid");
          if (!TextUtils.isEmpty(charSequence2))
            bundle.putString("aclid", (String)charSequence2); 
          charSequence2 = paramUri.getQueryParameter("cp1");
          if (!TextUtils.isEmpty(charSequence2))
            bundle.putString("cp1", (String)charSequence2); 
          String str = paramUri.getQueryParameter("anid");
          if (!TextUtils.isEmpty(str))
            bundle.putString("anid", str); 
          return bundle;
        } 
        return null;
      } catch (UnsupportedOperationException unsupportedOperationException) {
        this.a.f().r().b("Install referrer url isn't a hierarchical URI", unsupportedOperationException);
      }  
    return null;
  }
  
  final boolean l0(String paramString1, String paramString2) {
    if (paramString2 == null) {
      this.a.f().q().b("Name is required and can't be null. Type", paramString1);
      return false;
    } 
    if (paramString2.length() == 0) {
      this.a.f().q().b("Name is required and can't be empty. Type", paramString1);
      return false;
    } 
    int i = paramString2.codePointAt(0);
    if (!Character.isLetter(i)) {
      this.a.f().q().c("Name must start with a letter. Type, name", paramString1, paramString2);
      return false;
    } 
    int j = paramString2.length();
    i = Character.charCount(i);
    while (i < j) {
      int k = paramString2.codePointAt(i);
      if (k == 95 || Character.isLetterOrDigit(k)) {
        i += Character.charCount(k);
        continue;
      } 
      this.a.f().q().c("Name must consist of letters, digits or _ (underscores). Type, name", paramString1, paramString2);
      return false;
    } 
    return true;
  }
  
  final boolean m0(String paramString1, String paramString2) {
    if (paramString2 == null) {
      this.a.f().q().b("Name is required and can't be null. Type", paramString1);
      return false;
    } 
    if (paramString2.length() == 0) {
      this.a.f().q().b("Name is required and can't be empty. Type", paramString1);
      return false;
    } 
    int i = paramString2.codePointAt(0);
    int j = i;
    if (!Character.isLetter(i))
      if (i == 95) {
        j = 95;
      } else {
        this.a.f().q().c("Name must start with a letter or _ (underscore). Type, name", paramString1, paramString2);
        return false;
      }  
    i = paramString2.length();
    j = Character.charCount(j);
    while (j < i) {
      int k = paramString2.codePointAt(j);
      if (k == 95 || Character.isLetterOrDigit(k)) {
        j += Character.charCount(k);
        continue;
      } 
      this.a.f().q().c("Name must consist of letters, digits or _ (underscores). Type, name", paramString1, paramString2);
      return false;
    } 
    return true;
  }
  
  final boolean n0(String paramString1, String[] paramArrayOfString1, String[] paramArrayOfString2, String paramString2) {
    if (paramString2 == null) {
      this.a.f().q().b("Name is required and can't be null. Type", paramString1);
      return false;
    } 
    t.j(paramString2);
    String[] arrayOfString = c;
    for (byte b = 0; b < 3; b++) {
      if (paramString2.startsWith(arrayOfString[b])) {
        this.a.f().q().c("Name starts with reserved prefix. Type, name", paramString1, paramString2);
        return false;
      } 
    } 
    if (paramArrayOfString1 != null && g0(paramString2, paramArrayOfString1) && (paramArrayOfString2 == null || !g0(paramString2, paramArrayOfString2))) {
      this.a.f().q().c("Name is reserved. Type, name", paramString1, paramString2);
      return false;
    } 
    return true;
  }
  
  final boolean o(String paramString1, String paramString2, String paramString3) {
    if (!TextUtils.isEmpty(paramString1)) {
      if (!c0(paramString1)) {
        if (this.a.K())
          this.a.f().q().b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", o3.x(paramString1)); 
        return false;
      } 
    } else {
      ia.a();
      if (!this.a.z().w(null, c3.i0) || TextUtils.isEmpty(paramString3)) {
        if (!TextUtils.isEmpty(paramString2)) {
          if (!c0(paramString2)) {
            this.a.f().q().b("Invalid admob_app_id. Analytics disabled.", o3.x(paramString2));
            return false;
          } 
          return true;
        } 
      } else {
        return true;
      } 
      if (this.a.K())
        this.a.f().q().a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI"); 
      return false;
    } 
    return true;
  }
  
  final boolean o0(String paramString1, int paramInt, String paramString2) {
    if (paramString2 == null) {
      this.a.f().q().b("Name is required and can't be null. Type", paramString1);
      return false;
    } 
    if (paramString2.codePointCount(0, paramString2.length()) > paramInt) {
      this.a.f().q().d("Name is too long. Type, maximum supported length, name", paramString1, Integer.valueOf(paramInt), paramString2);
      return false;
    } 
    return true;
  }
  
  final boolean p(String paramString1, String paramString2, String paramString3, String paramString4) {
    boolean bool1 = TextUtils.isEmpty(paramString1);
    boolean bool2 = TextUtils.isEmpty(paramString2);
    if (!bool1 && !bool2) {
      t.j(paramString1);
      return !paramString1.equals(paramString2);
    } 
    return (bool1 && bool2) ? ((!TextUtils.isEmpty(paramString3) && !TextUtils.isEmpty(paramString4)) ? (!paramString3.equals(paramString4)) : (!TextUtils.isEmpty(paramString4))) : (!bool1 ? (TextUtils.isEmpty(paramString4) ? false : ((TextUtils.isEmpty(paramString3) || !paramString3.equals(paramString4)))) : ((TextUtils.isEmpty(paramString3) || !paramString3.equals(paramString4))));
  }
  
  final int p0(String paramString) {
    if (!m0("event", paramString))
      return 2; 
    if (!n0("event", q5.a, q5.b, paramString))
      return 13; 
    this.a.z();
    return !o0("event", 40, paramString) ? 2 : 0;
  }
  
  public final String q(String paramString, int paramInt, boolean paramBoolean) {
    return (paramString == null) ? null : ((paramString.codePointCount(0, paramString.length()) > paramInt) ? (paramBoolean ? String.valueOf(paramString.substring(0, paramString.offsetByCodePoints(0, paramInt))).concat("...") : null) : paramString);
  }
  
  final int q0(String paramString) {
    if (!m0("user property", paramString))
      return 6; 
    if (!n0("user property", s5.a, null, paramString))
      return 15; 
    this.a.z();
    return !o0("user property", 24, paramString) ? 6 : 0;
  }
  
  final int r(String paramString1, String paramString2, String paramString3, Object paramObject, Bundle paramBundle, List<String> paramList, boolean paramBoolean1, boolean paramBoolean2) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual h : ()V
    //   4: aload_0
    //   5: aload #4
    //   7: invokevirtual t0 : (Ljava/lang/Object;)Z
    //   10: ifeq -> 270
    //   13: iload #8
    //   15: ifeq -> 267
    //   18: aload_3
    //   19: getstatic com/google/android/gms/measurement/internal/r5.c : [Ljava/lang/String;
    //   22: invokestatic g0 : (Ljava/lang/String;[Ljava/lang/String;)Z
    //   25: ifne -> 31
    //   28: bipush #20
    //   30: ireturn
    //   31: aload_0
    //   32: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   35: invokevirtual R : ()Lcom/google/android/gms/measurement/internal/k8;
    //   38: astore #9
    //   40: aload #9
    //   42: invokevirtual h : ()V
    //   45: aload #9
    //   47: invokevirtual j : ()V
    //   50: aload #9
    //   52: invokevirtual r : ()Z
    //   55: ifne -> 61
    //   58: goto -> 81
    //   61: aload #9
    //   63: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   66: invokevirtual G : ()Lcom/google/android/gms/measurement/internal/u9;
    //   69: invokevirtual N : ()I
    //   72: ldc_w 200900
    //   75: if_icmpge -> 81
    //   78: bipush #25
    //   80: ireturn
    //   81: aload_0
    //   82: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   85: invokevirtual z : ()Lcom/google/android/gms/measurement/internal/e;
    //   88: pop
    //   89: aload #4
    //   91: instanceof [Landroid/os/Parcelable;
    //   94: istore #10
    //   96: iload #10
    //   98: ifeq -> 112
    //   101: aload #4
    //   103: checkcast [Landroid/os/Parcelable;
    //   106: arraylength
    //   107: istore #11
    //   109: goto -> 130
    //   112: aload #4
    //   114: instanceof java/util/ArrayList
    //   117: ifeq -> 270
    //   120: aload #4
    //   122: checkcast java/util/ArrayList
    //   125: invokevirtual size : ()I
    //   128: istore #11
    //   130: iload #11
    //   132: sipush #200
    //   135: if_icmple -> 270
    //   138: aload_0
    //   139: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   142: invokevirtual f : ()Lcom/google/android/gms/measurement/internal/o3;
    //   145: invokevirtual t : ()Lcom/google/android/gms/measurement/internal/m3;
    //   148: ldc_w 'Parameter array is too long; discarded. Value kind, name, array length'
    //   151: ldc_w 'param'
    //   154: aload_3
    //   155: iload #11
    //   157: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   160: invokevirtual d : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   163: aload_0
    //   164: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   167: invokevirtual z : ()Lcom/google/android/gms/measurement/internal/e;
    //   170: pop
    //   171: iload #10
    //   173: ifeq -> 212
    //   176: aload #4
    //   178: checkcast [Landroid/os/Parcelable;
    //   181: astore #9
    //   183: aload #9
    //   185: arraylength
    //   186: sipush #200
    //   189: if_icmple -> 260
    //   192: aload #5
    //   194: aload_3
    //   195: aload #9
    //   197: sipush #200
    //   200: invokestatic copyOf : ([Ljava/lang/Object;I)[Ljava/lang/Object;
    //   203: checkcast [Landroid/os/Parcelable;
    //   206: invokevirtual putParcelableArray : (Ljava/lang/String;[Landroid/os/Parcelable;)V
    //   209: goto -> 260
    //   212: aload #4
    //   214: instanceof java/util/ArrayList
    //   217: ifeq -> 260
    //   220: aload #4
    //   222: checkcast java/util/ArrayList
    //   225: astore #9
    //   227: aload #9
    //   229: invokevirtual size : ()I
    //   232: sipush #200
    //   235: if_icmple -> 260
    //   238: aload #5
    //   240: aload_3
    //   241: new java/util/ArrayList
    //   244: dup
    //   245: aload #9
    //   247: iconst_0
    //   248: sipush #200
    //   251: invokevirtual subList : (II)Ljava/util/List;
    //   254: invokespecial <init> : (Ljava/util/Collection;)V
    //   257: invokevirtual putParcelableArrayList : (Ljava/lang/String;Ljava/util/ArrayList;)V
    //   260: bipush #17
    //   262: istore #11
    //   264: goto -> 273
    //   267: bipush #21
    //   269: ireturn
    //   270: iconst_0
    //   271: istore #11
    //   273: aload_0
    //   274: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   277: invokevirtual z : ()Lcom/google/android/gms/measurement/internal/e;
    //   280: aload_1
    //   281: getstatic com/google/android/gms/measurement/internal/c3.T : Lcom/google/android/gms/measurement/internal/a3;
    //   284: invokevirtual w : (Ljava/lang/String;Lcom/google/android/gms/measurement/internal/a3;)Z
    //   287: ifeq -> 297
    //   290: aload_2
    //   291: invokestatic F : (Ljava/lang/String;)Z
    //   294: ifne -> 304
    //   297: aload_3
    //   298: invokestatic F : (Ljava/lang/String;)Z
    //   301: ifeq -> 320
    //   304: aload_0
    //   305: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   308: invokevirtual z : ()Lcom/google/android/gms/measurement/internal/e;
    //   311: pop
    //   312: sipush #256
    //   315: istore #12
    //   317: goto -> 332
    //   320: aload_0
    //   321: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   324: invokevirtual z : ()Lcom/google/android/gms/measurement/internal/e;
    //   327: pop
    //   328: bipush #100
    //   330: istore #12
    //   332: aload_0
    //   333: ldc_w 'param'
    //   336: aload_3
    //   337: iload #12
    //   339: aload #4
    //   341: invokevirtual u0 : (Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Z
    //   344: ifeq -> 350
    //   347: iload #11
    //   349: ireturn
    //   350: iload #8
    //   352: ifeq -> 593
    //   355: aload #4
    //   357: instanceof android/os/Bundle
    //   360: ifeq -> 382
    //   363: aload_0
    //   364: aload_1
    //   365: aload_2
    //   366: aload_3
    //   367: aload #4
    //   369: checkcast android/os/Bundle
    //   372: aload #6
    //   374: iload #7
    //   376: invokevirtual v0 : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/util/List;Z)V
    //   379: goto -> 590
    //   382: aload #4
    //   384: instanceof [Landroid/os/Parcelable;
    //   387: ifeq -> 474
    //   390: aload #4
    //   392: checkcast [Landroid/os/Parcelable;
    //   395: astore #5
    //   397: aload #5
    //   399: arraylength
    //   400: istore #13
    //   402: iconst_0
    //   403: istore #12
    //   405: iload #12
    //   407: iload #13
    //   409: if_icmpge -> 590
    //   412: aload #5
    //   414: iload #12
    //   416: aaload
    //   417: astore #4
    //   419: aload #4
    //   421: instanceof android/os/Bundle
    //   424: ifne -> 452
    //   427: aload_0
    //   428: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   431: invokevirtual f : ()Lcom/google/android/gms/measurement/internal/o3;
    //   434: invokevirtual t : ()Lcom/google/android/gms/measurement/internal/m3;
    //   437: ldc_w 'All Parcelable[] elements must be of type Bundle. Value type, name'
    //   440: aload #4
    //   442: invokevirtual getClass : ()Ljava/lang/Class;
    //   445: aload_3
    //   446: invokevirtual c : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   449: goto -> 593
    //   452: aload_0
    //   453: aload_1
    //   454: aload_2
    //   455: aload_3
    //   456: aload #4
    //   458: checkcast android/os/Bundle
    //   461: aload #6
    //   463: iload #7
    //   465: invokevirtual v0 : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/util/List;Z)V
    //   468: iinc #12, 1
    //   471: goto -> 405
    //   474: aload #4
    //   476: instanceof java/util/ArrayList
    //   479: ifeq -> 593
    //   482: aload #4
    //   484: checkcast java/util/ArrayList
    //   487: astore #5
    //   489: aload #5
    //   491: invokeinterface size : ()I
    //   496: istore #13
    //   498: iconst_0
    //   499: istore #12
    //   501: iload #12
    //   503: iload #13
    //   505: if_icmpge -> 590
    //   508: aload #5
    //   510: iload #12
    //   512: invokeinterface get : (I)Ljava/lang/Object;
    //   517: astore #4
    //   519: aload #4
    //   521: instanceof android/os/Bundle
    //   524: ifne -> 568
    //   527: aload_0
    //   528: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   531: invokevirtual f : ()Lcom/google/android/gms/measurement/internal/o3;
    //   534: invokevirtual t : ()Lcom/google/android/gms/measurement/internal/m3;
    //   537: astore_2
    //   538: aload #4
    //   540: ifnull -> 552
    //   543: aload #4
    //   545: invokevirtual getClass : ()Ljava/lang/Class;
    //   548: astore_1
    //   549: goto -> 556
    //   552: ldc_w 'null'
    //   555: astore_1
    //   556: aload_2
    //   557: ldc_w 'All ArrayList elements must be of type Bundle. Value type, name'
    //   560: aload_1
    //   561: aload_3
    //   562: invokevirtual c : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   565: goto -> 593
    //   568: aload_0
    //   569: aload_1
    //   570: aload_2
    //   571: aload_3
    //   572: aload #4
    //   574: checkcast android/os/Bundle
    //   577: aload #6
    //   579: iload #7
    //   581: invokevirtual v0 : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/util/List;Z)V
    //   584: iinc #12, 1
    //   587: goto -> 501
    //   590: iload #11
    //   592: ireturn
    //   593: iconst_4
    //   594: ireturn
  }
  
  final int r0(String paramString) {
    if (!l0("event param", paramString))
      return 3; 
    if (!n0("event param", null, null, paramString))
      return 14; 
    this.a.z();
    return !o0("event param", 40, paramString) ? 3 : 0;
  }
  
  final Object s(String paramString, Object paramObject) {
    boolean bool = "_ev".equals(paramString);
    char c = 'Ā';
    if (bool) {
      this.a.z();
      return d0(256, paramObject, true, true);
    } 
    if (F(paramString)) {
      this.a.z();
    } else {
      this.a.z();
      c = 'd';
    } 
    return d0(c, paramObject, false, true);
  }
  
  final int s0(String paramString) {
    if (!m0("event param", paramString))
      return 3; 
    if (!n0("event param", null, null, paramString))
      return 14; 
    this.a.z();
    return !o0("event param", 40, paramString) ? 3 : 0;
  }
  
  final Bundle t(String paramString1, String paramString2, Bundle paramBundle, List<String> paramList, boolean paramBoolean) {
    Set set;
    boolean bool = g0(paramString2, q5.d);
    Bundle bundle = new Bundle(paramBundle);
    int i = this.a.z().m();
    if (this.a.z().w(paramString1, c3.Y)) {
      set = new TreeSet(paramBundle.keySet());
    } else {
      set = paramBundle.keySet();
    } 
    Iterator<String> iterator = set.iterator();
    byte b = 0;
    while (iterator.hasNext()) {
      String str = iterator.next();
      if (paramList == null || !paramList.contains(str)) {
        if (paramBoolean) {
          j = r0(str);
        } else {
          j = 0;
        } 
        int k = j;
        if (!j)
          k = s0(str); 
        j = k;
      } else {
        j = 0;
      } 
      if (j) {
        Object object;
        if (j == 3) {
          object = str;
        } else {
          object = null;
        } 
        w(bundle, j, str, str, object);
        bundle.remove(str);
        continue;
      } 
      int j = r(paramString1, paramString2, str, paramBundle.get(str), bundle, paramList, paramBoolean, bool);
      if (j == 17) {
        w(bundle, 17, str, str, Boolean.FALSE);
      } else if (j != 0) {
        String str1 = str;
        if (!"_ev".equals(str1)) {
          if (j == 21) {
            str = paramString2;
          } else {
            str = str1;
          } 
          w(bundle, j, str, str1, paramBundle.get(str1));
          bundle.remove(str1);
          continue;
        } 
      } 
      if (j0(str) && ++b > i) {
        StringBuilder stringBuilder = new StringBuilder(48);
        stringBuilder.append("Event can't contain more than ");
        stringBuilder.append(i);
        stringBuilder.append(" params");
        String str1 = stringBuilder.toString();
        this.a.f().q().c(str1, this.a.H().p(paramString2), this.a.H().s(paramBundle));
        b0(bundle, 5);
        bundle.remove(str);
      } 
    } 
    return bundle;
  }
  
  final boolean t0(Object paramObject) {
    return (paramObject instanceof Parcelable[] || paramObject instanceof ArrayList || paramObject instanceof Bundle);
  }
  
  final void u(p3 paramp3, int paramInt) {
    Iterator<?> iterator = (new TreeSet(paramp3.d.keySet())).iterator();
    int i = 0;
    while (iterator.hasNext()) {
      String str = (String)iterator.next();
      if (j0(str)) {
        int j = i + 1;
        i = j;
        if (j > paramInt) {
          StringBuilder stringBuilder = new StringBuilder(48);
          stringBuilder.append("Event can't contain more than ");
          stringBuilder.append(paramInt);
          stringBuilder.append(" params");
          String str1 = stringBuilder.toString();
          this.a.f().q().c(str1, this.a.H().p(paramp3.a), this.a.H().s(paramp3.d));
          b0(paramp3.d, 5);
          paramp3.d.remove(str);
          i = j;
        } 
      } 
    } 
  }
  
  final boolean u0(String paramString1, String paramString2, int paramInt, Object paramObject) {
    if (paramObject == null)
      return true; 
    if (!(paramObject instanceof Long) && !(paramObject instanceof Float) && !(paramObject instanceof Integer) && !(paramObject instanceof Byte) && !(paramObject instanceof Short) && !(paramObject instanceof Boolean) && !(paramObject instanceof Double)) {
      if (paramObject instanceof String || paramObject instanceof Character || paramObject instanceof CharSequence) {
        paramObject = String.valueOf(paramObject);
        if (paramObject.codePointCount(0, paramObject.length()) > paramInt) {
          this.a.f().t().d("Value is too long; discarded. Value kind, name, value length", paramString1, paramString2, Integer.valueOf(paramObject.length()));
          return false;
        } 
        return true;
      } 
      return false;
    } 
    return true;
  }
  
  final void v(Bundle paramBundle1, Bundle paramBundle2) {
    if (paramBundle2 == null)
      return; 
    for (String str : paramBundle2.keySet()) {
      if (!paramBundle1.containsKey(str))
        this.a.G().z(paramBundle1, str, paramBundle2.get(str)); 
    } 
  }
  
  final void v0(String paramString1, String paramString2, String paramString3, Bundle paramBundle, List<String> paramList, boolean paramBoolean) {
    if (paramBundle == null)
      return; 
    this.a.z();
    Iterator<?> iterator = (new TreeSet(paramBundle.keySet())).iterator();
    int i = 0;
    while (iterator.hasNext()) {
      int j;
      String str = (String)iterator.next();
      if (paramList == null || !paramList.contains(str)) {
        byte b;
        if (paramBoolean) {
          b = r0(str);
        } else {
          b = 0;
        } 
        j = b;
        if (!b)
          j = s0(str); 
      } else {
        j = 0;
      } 
      if (j) {
        Object object;
        if (j == 3) {
          object = str;
        } else {
          object = null;
        } 
        w(paramBundle, j, str, str, object);
        paramBundle.remove(str);
        continue;
      } 
      if (t0(paramBundle.get(str))) {
        this.a.f().t().d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", paramString2, paramString3, str);
        j = 22;
      } else {
        j = r(paramString1, paramString2, str, paramBundle.get(str), paramBundle, paramList, paramBoolean, false);
      } 
      if (j != 0 && !"_ev".equals(str)) {
        w(paramBundle, j, str, str, paramBundle.get(str));
        paramBundle.remove(str);
        continue;
      } 
      if (j0(str) && !g0(str, r5.d)) {
        j = i + 1;
        i = j;
        if (j > 0) {
          this.a.f().q().c("Item cannot contain custom parameters", this.a.H().p(paramString2), this.a.H().s(paramBundle));
          b0(paramBundle, 23);
          paramBundle.remove(str);
          i = j;
        } 
      } 
    } 
  }
  
  final void w(Bundle paramBundle, int paramInt, String paramString1, String paramString2, Object paramObject) {
    if (b0(paramBundle, paramInt)) {
      this.a.z();
      paramBundle.putString("_ev", q(paramString1, 40, true));
      if (paramObject != null) {
        t.j(paramBundle);
        if (paramObject instanceof String || paramObject instanceof CharSequence)
          paramBundle.putLong("_el", String.valueOf(paramObject).length()); 
      } 
    } 
  }
  
  final int x(String paramString, Object paramObject) {
    boolean bool;
    if ("_ldl".equals(paramString)) {
      bool = u0("user property referrer", paramString, e0(paramString), paramObject);
    } else {
      bool = u0("user property", paramString, e0(paramString), paramObject);
    } 
    return bool ? 0 : 7;
  }
  
  final Object y(String paramString, Object paramObject) {
    return "_ldl".equals(paramString) ? d0(e0(paramString), paramObject, true, false) : d0(e0(paramString), paramObject, false, false);
  }
  
  final void z(Bundle paramBundle, String paramString, Object paramObject) {
    if (paramBundle == null)
      return; 
    if (paramObject instanceof Long) {
      paramBundle.putLong(paramString, ((Long)paramObject).longValue());
      return;
    } 
    if (paramObject instanceof String) {
      paramBundle.putString(paramString, String.valueOf(paramObject));
      return;
    } 
    if (paramObject instanceof Double) {
      paramBundle.putDouble(paramString, ((Double)paramObject).doubleValue());
      return;
    } 
    if (paramObject instanceof Bundle[]) {
      paramBundle.putParcelableArray(paramString, (Parcelable[])paramObject);
      return;
    } 
    if (paramString != null) {
      if (paramObject != null) {
        String str = paramObject.getClass().getSimpleName();
      } else {
        paramBundle = null;
      } 
      this.a.f().t().c("Not putting event parameter. Invalid value type. name, type", this.a.H().q(paramString), paramBundle);
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/measurement/internal/u9.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */