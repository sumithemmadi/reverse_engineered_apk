package com.google.android.gms.measurement.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.k.c;
import com.google.android.gms.internal.measurement.ra;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public final class e extends m5 {
  private Boolean b;
  
  private d c = c.a;
  
  private Boolean d;
  
  e(s4 params4) {
    super(params4);
  }
  
  public static final long I() {
    return ((Long)c3.e.b(null)).longValue();
  }
  
  public static final long i() {
    return ((Long)c3.E.b(null)).longValue();
  }
  
  private final String j(String paramString1, String paramString2) {
    try {
      paramString1 = (String)Class.forName("android.os.SystemProperties").getMethod("get", new Class[] { String.class, String.class }).invoke(null, new Object[] { paramString1, "" });
      t.j(paramString1);
      return paramString1;
    } catch (ClassNotFoundException classNotFoundException) {
      this.a.f().o().b("Could not find SystemProperties class", classNotFoundException);
    } catch (NoSuchMethodException noSuchMethodException) {
      this.a.f().o().b("Could not find SystemProperties.get() method", noSuchMethodException);
    } catch (IllegalAccessException illegalAccessException) {
      this.a.f().o().b("Could not access SystemProperties.get()", illegalAccessException);
    } catch (InvocationTargetException invocationTargetException) {
      this.a.f().o().b("SystemProperties.get() threw an exception", invocationTargetException);
    } 
    return "";
  }
  
  public final boolean A() {
    this.a.d();
    Boolean bool = y("firebase_analytics_collection_deactivated");
    return (bool != null && bool.booleanValue());
  }
  
  public final boolean B() {
    Boolean bool = y("google_analytics_adid_collection_enabled");
    return (bool == null || bool.booleanValue());
  }
  
  public final boolean C() {
    ra.a();
    if (!w(null, c3.s0))
      return true; 
    Boolean bool = y("google_analytics_automatic_screen_reporting_enabled");
    return (bool == null || bool.booleanValue());
  }
  
  public final String D() {
    return j("debug.firebase.analytics.app", "");
  }
  
  public final String E() {
    return j("debug.deferred.deeplink", "");
  }
  
  public final boolean F(String paramString) {
    return "1".equals(this.c.e(paramString, "gaia_collection_enabled"));
  }
  
  public final boolean G(String paramString) {
    return "1".equals(this.c.e(paramString, "measurement.event_sampling_enabled"));
  }
  
  final boolean H() {
    if (this.b == null) {
      Boolean bool = y("app_measurement_lite");
      this.b = bool;
      if (bool == null)
        this.b = Boolean.FALSE; 
    } 
    return (this.b.booleanValue() || !this.a.O());
  }
  
  final void k(d paramd) {
    this.c = paramd;
  }
  
  final String l() {
    this.a.d();
    return "FA";
  }
  
  public final int m() {
    u9 u9 = this.a.G();
    Boolean bool = u9.a.R().q();
    return (u9.N() >= 201500 || (bool != null && !bool.booleanValue())) ? 100 : 25;
  }
  
  public final int n(String paramString) {
    return u(paramString, c3.J, 25, 100);
  }
  
  final int o(String paramString) {
    return u(paramString, c3.I, 500, 2000);
  }
  
  public final long p() {
    this.a.d();
    return 39065L;
  }
  
  @EnsuresNonNull({"this.isMainProcess"})
  public final boolean q() {
    // Byte code:
    //   0: aload_0
    //   1: getfield d : Ljava/lang/Boolean;
    //   4: ifnonnull -> 111
    //   7: aload_0
    //   8: monitorenter
    //   9: aload_0
    //   10: getfield d : Ljava/lang/Boolean;
    //   13: ifnonnull -> 101
    //   16: aload_0
    //   17: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   20: invokevirtual a : ()Landroid/content/Context;
    //   23: invokevirtual getApplicationInfo : ()Landroid/content/pm/ApplicationInfo;
    //   26: astore_1
    //   27: invokestatic a : ()Ljava/lang/String;
    //   30: astore_2
    //   31: aload_1
    //   32: ifnull -> 72
    //   35: aload_1
    //   36: getfield processName : Ljava/lang/String;
    //   39: astore_1
    //   40: iconst_0
    //   41: istore_3
    //   42: iload_3
    //   43: istore #4
    //   45: aload_1
    //   46: ifnull -> 63
    //   49: iload_3
    //   50: istore #4
    //   52: aload_1
    //   53: aload_2
    //   54: invokevirtual equals : (Ljava/lang/Object;)Z
    //   57: ifeq -> 63
    //   60: iconst_1
    //   61: istore #4
    //   63: aload_0
    //   64: iload #4
    //   66: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   69: putfield d : Ljava/lang/Boolean;
    //   72: aload_0
    //   73: getfield d : Ljava/lang/Boolean;
    //   76: ifnonnull -> 101
    //   79: aload_0
    //   80: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   83: putfield d : Ljava/lang/Boolean;
    //   86: aload_0
    //   87: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   90: invokevirtual f : ()Lcom/google/android/gms/measurement/internal/o3;
    //   93: invokevirtual o : ()Lcom/google/android/gms/measurement/internal/m3;
    //   96: ldc 'My process not in the list of running processes'
    //   98: invokevirtual a : (Ljava/lang/String;)V
    //   101: aload_0
    //   102: monitorexit
    //   103: goto -> 111
    //   106: astore_2
    //   107: aload_0
    //   108: monitorexit
    //   109: aload_2
    //   110: athrow
    //   111: aload_0
    //   112: getfield d : Ljava/lang/Boolean;
    //   115: invokevirtual booleanValue : ()Z
    //   118: ireturn
    // Exception table:
    //   from	to	target	type
    //   9	31	106	finally
    //   35	40	106	finally
    //   52	60	106	finally
    //   63	72	106	finally
    //   72	101	106	finally
    //   101	103	106	finally
    //   107	109	106	finally
  }
  
  public final String r(String paramString, a3<String> parama3) {
    return (paramString == null) ? (String)parama3.b(null) : (String)parama3.b(this.c.e(paramString, parama3.a()));
  }
  
  public final long s(String paramString, a3<Long> parama3) {
    if (paramString == null)
      return ((Long)parama3.b(null)).longValue(); 
    paramString = this.c.e(paramString, parama3.a());
    if (TextUtils.isEmpty(paramString))
      return ((Long)parama3.b(null)).longValue(); 
    try {
      return ((Long)parama3.b(Long.valueOf(Long.parseLong(paramString)))).longValue();
    } catch (NumberFormatException numberFormatException) {
      return ((Long)parama3.b(null)).longValue();
    } 
  }
  
  public final int t(String paramString, a3<Integer> parama3) {
    if (paramString == null)
      return ((Integer)parama3.b(null)).intValue(); 
    paramString = this.c.e(paramString, parama3.a());
    if (TextUtils.isEmpty(paramString))
      return ((Integer)parama3.b(null)).intValue(); 
    try {
      return ((Integer)parama3.b(Integer.valueOf(Integer.parseInt(paramString)))).intValue();
    } catch (NumberFormatException numberFormatException) {
      return ((Integer)parama3.b(null)).intValue();
    } 
  }
  
  public final int u(String paramString, a3<Integer> parama3, int paramInt1, int paramInt2) {
    return Math.max(Math.min(t(paramString, parama3), paramInt2), paramInt1);
  }
  
  public final double v(String paramString, a3<Double> parama3) {
    if (paramString == null)
      return ((Double)parama3.b(null)).doubleValue(); 
    paramString = this.c.e(paramString, parama3.a());
    if (TextUtils.isEmpty(paramString))
      return ((Double)parama3.b(null)).doubleValue(); 
    try {
      return ((Double)parama3.b(Double.valueOf(Double.parseDouble(paramString)))).doubleValue();
    } catch (NumberFormatException numberFormatException) {
      return ((Double)parama3.b(null)).doubleValue();
    } 
  }
  
  public final boolean w(String paramString, a3<Boolean> parama3) {
    if (paramString == null)
      return ((Boolean)parama3.b(null)).booleanValue(); 
    paramString = this.c.e(paramString, parama3.a());
    return TextUtils.isEmpty(paramString) ? ((Boolean)parama3.b(null)).booleanValue() : ((Boolean)parama3.b(Boolean.valueOf(Boolean.parseBoolean(paramString)))).booleanValue();
  }
  
  final Bundle x() {
    try {
      if (this.a.a().getPackageManager() == null) {
        this.a.f().o().a("Failed to load metadata: PackageManager is null");
        return null;
      } 
      ApplicationInfo applicationInfo = c.a(this.a.a()).c(this.a.a().getPackageName(), 128);
      if (applicationInfo == null) {
        this.a.f().o().a("Failed to load metadata: ApplicationInfo is null");
        return null;
      } 
      return applicationInfo.metaData;
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
      this.a.f().o().b("Failed to load metadata: Package name not found", nameNotFoundException);
      return null;
    } 
  }
  
  final Boolean y(String paramString) {
    t.f(paramString);
    Bundle bundle = x();
    if (bundle == null) {
      this.a.f().o().a("Failed to load metadata: Metadata bundle is null");
      return null;
    } 
    return !bundle.containsKey(paramString) ? null : Boolean.valueOf(bundle.getBoolean(paramString));
  }
  
  final List<String> z(String paramString) {
    // Byte code:
    //   0: ldc_w 'analytics.safelisted_events'
    //   3: invokestatic f : (Ljava/lang/String;)Ljava/lang/String;
    //   6: pop
    //   7: aload_0
    //   8: invokevirtual x : ()Landroid/os/Bundle;
    //   11: astore_1
    //   12: aload_1
    //   13: ifnonnull -> 37
    //   16: aload_0
    //   17: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   20: invokevirtual f : ()Lcom/google/android/gms/measurement/internal/o3;
    //   23: invokevirtual o : ()Lcom/google/android/gms/measurement/internal/m3;
    //   26: ldc_w 'Failed to load metadata: Metadata bundle is null'
    //   29: invokevirtual a : (Ljava/lang/String;)V
    //   32: aconst_null
    //   33: astore_1
    //   34: goto -> 61
    //   37: aload_1
    //   38: ldc_w 'analytics.safelisted_events'
    //   41: invokevirtual containsKey : (Ljava/lang/String;)Z
    //   44: ifne -> 50
    //   47: goto -> 32
    //   50: aload_1
    //   51: ldc_w 'analytics.safelisted_events'
    //   54: invokevirtual getInt : (Ljava/lang/String;)I
    //   57: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   60: astore_1
    //   61: aload_1
    //   62: ifnull -> 114
    //   65: aload_0
    //   66: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   69: invokevirtual a : ()Landroid/content/Context;
    //   72: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   75: aload_1
    //   76: invokevirtual intValue : ()I
    //   79: invokevirtual getStringArray : (I)[Ljava/lang/String;
    //   82: astore_1
    //   83: aload_1
    //   84: ifnonnull -> 89
    //   87: aconst_null
    //   88: areturn
    //   89: aload_1
    //   90: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   93: astore_1
    //   94: aload_1
    //   95: areturn
    //   96: astore_1
    //   97: aload_0
    //   98: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   101: invokevirtual f : ()Lcom/google/android/gms/measurement/internal/o3;
    //   104: invokevirtual o : ()Lcom/google/android/gms/measurement/internal/m3;
    //   107: ldc_w 'Failed to load string array from metadata: resource not found'
    //   110: aload_1
    //   111: invokevirtual b : (Ljava/lang/String;Ljava/lang/Object;)V
    //   114: aconst_null
    //   115: areturn
    // Exception table:
    //   from	to	target	type
    //   65	83	96	android/content/res/Resources$NotFoundException
    //   89	94	96	android/content/res/Resources$NotFoundException
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/measurement/internal/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */