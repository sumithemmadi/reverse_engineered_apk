package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.ads.v.a;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.c;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class z92 {
  private static final String a = "z92";
  
  protected Context b;
  
  private ExecutorService c;
  
  private DexClassLoader d;
  
  private m32 e;
  
  private byte[] f;
  
  private volatile a g = null;
  
  private volatile boolean h;
  
  private Future i;
  
  private boolean j;
  
  private volatile zzcf$zza k;
  
  private Future l;
  
  private lq1 m;
  
  private boolean n;
  
  private boolean o;
  
  private Map<Pair<String, String>, ib2> p;
  
  private boolean q;
  
  private zzfa r;
  
  private z92(Context paramContext) {
    boolean bool = false;
    this.h = false;
    this.i = null;
    this.k = null;
    this.l = null;
    this.n = false;
    this.o = false;
    this.q = false;
    Context context = paramContext.getApplicationContext();
    if (context != null)
      bool = true; 
    this.j = bool;
    if (bool)
      paramContext = context; 
    this.b = paramContext;
    this.p = new HashMap<Pair<String, String>, ib2>();
    if (this.r == null)
      this.r = new zzfa(this.b); 
  }
  
  private final void B() {
    try {
      if (this.g == null && this.j) {
        a a1 = new a();
        this(this.b);
        a1.f();
        this.g = a1;
      } 
      return;
    } catch (GooglePlayServicesNotAvailableException|IOException|com.google.android.gms.common.GooglePlayServicesRepairableException googlePlayServicesNotAvailableException) {
      this.g = null;
      return;
    } 
  }
  
  private final zzcf$zza C() {
    Exception exception;
    try {
      PackageInfo packageInfo = this.b.getPackageManager().getPackageInfo(this.b.getPackageName(), 0);
      Context context = this.b;
      zzcf$zza zzcf$zza1 = ao1.a(context, context.getPackageName(), Integer.toString(packageInfo.versionCode));
    } finally {
      exception = null;
    } 
  }
  
  public static z92 d(Context paramContext, String paramString1, String paramString2, boolean paramBoolean) {
    z92 z921 = new z92(paramContext);
    try {
      y92 y92 = new y92();
      this();
      z921.c = Executors.newCachedThreadPool(y92);
      z921.h = paramBoolean;
      if (paramBoolean) {
        ExecutorService executorService1 = z921.c;
        ba2 ba2 = new ba2();
        this(z921);
        z921.i = executorService1.submit(ba2);
      } 
      ExecutorService executorService = z921.c;
      da2 da2 = new da2();
      this(z921);
      executorService.execute(da2);
      try {
        c c = c.f();
        if (c.a(z921.b) > 0) {
          paramBoolean = true;
        } else {
          paramBoolean = false;
        } 
        z921.n = paramBoolean;
        if (c.g(z921.b) == 0) {
          paramBoolean = true;
        } else {
          paramBoolean = false;
        } 
        z921.o = paramBoolean;
      } finally {}
      z921.f(0, true);
      if (ea2.a()) {
        x<Boolean> x = m0.Z1;
        if (((Boolean)er2.e().<Boolean>c(x)).booleanValue()) {
          IllegalStateException illegalStateException = new IllegalStateException();
          this("Task Context initialization must not be called from the UI thread.");
          throw illegalStateException;
        } 
      } 
      m32 m321 = new m32();
      this(null);
      z921.e = m321;
      try {
        z921.f = m321.c(paramString1);
        try {
          zzev zzev;
          lq1 lq11;
          File file2 = z921.b.getCacheDir();
          File file1 = file2;
          if (file2 == null) {
            file1 = z921.b.getDir("dex", 0);
            if (file1 == null) {
              zzev = new zzev();
              this();
              throw zzev;
            } 
          } 
          file2 = new File();
          this(String.format("%s/%s.jar", new Object[] { zzev, "1608138930680" }));
          if (!file2.exists()) {
            byte[] arrayOfByte = z921.e.b(z921.f, paramString2);
            file2.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream();
            this(file2);
            fileOutputStream.write(arrayOfByte, 0, arrayOfByte.length);
            fileOutputStream.close();
          } 
          z921.n((File)zzev, "1608138930680");
          try {
            DexClassLoader dexClassLoader = new DexClassLoader();
            this(file2.getAbsolutePath(), zzev.getAbsolutePath(), null, z921.b.getClassLoader());
            z921.d = dexClassLoader;
            p(file2);
            z921.h((File)zzev, "1608138930680");
            k(String.format("%s/%s.dex", new Object[] { zzev, "1608138930680" }));
            lq11 = new lq1();
          } finally {
            p(file2);
            z921.h((File)lq11, "1608138930680");
            k(String.format("%s/%s.dex", new Object[] { lq11, "1608138930680" }));
          } 
        } catch (FileNotFoundException fileNotFoundException) {
          zzev zzev = new zzev();
          this(fileNotFoundException);
          throw zzev;
        } catch (IOException iOException) {
          zzev zzev = new zzev();
          this(iOException);
          throw zzev;
        } catch (zzej zzej) {
          zzev zzev = new zzev();
          this(zzej);
          throw zzev;
        } catch (NullPointerException nullPointerException) {
          zzev zzev = new zzev();
          this(nullPointerException);
          throw zzev;
        } 
      } catch (zzej zzej) {
        zzev zzev = new zzev();
        this(zzej);
        throw zzev;
      } 
    } catch (zzev zzev) {}
    return z921;
  }
  
  private final void h(File paramFile, String paramString) {
    File file1 = new File(String.format("%s/%s.tmp", new Object[] { paramFile, paramString }));
    if (file1.exists())
      return; 
    File file2 = new File(String.format("%s/%s.dex", new Object[] { paramFile, paramString }));
    if (!file2.exists())
      return; 
    long l = file2.length();
    if (l <= 0L)
      return; 
    null = new byte[(int)l];
    String str = null;
    Exception exception = null;
    try {
      FileInputStream fileInputStream = new FileInputStream();
      this(file2);
      try {
        int i = fileInputStream.read(null);
        if (i <= 0)
          return; 
        System.out.print("test");
        System.out.print("test");
        System.out.print("test");
        oi0.a a1 = oi0.S().A(zzejr.zzt(Build.VERSION.SDK.getBytes())).z(zzejr.zzt(paramString.getBytes()));
        byte[] arrayOfByte = this.e.d(this.f, (byte[])iOException2).getBytes();
        a1.x(zzejr.zzt(arrayOfByte)).y(zzejr.zzt(e41.e(arrayOfByte)));
        file1.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream();
        this(file1);
      } catch (IOException|java.security.NoSuchAlgorithmException|zzej iOException) {
        iOException = null;
      } finally {
        null = null;
      } 
      if (fileInputStream != null)
        try {
          fileInputStream.close();
        } catch (IOException iOException) {} 
      if (paramString != null)
        try {
          paramString.close();
        } catch (IOException iOException) {} 
      p(file2);
      throw null;
    } catch (IOException|java.security.NoSuchAlgorithmException|zzej iOException) {
      return;
    } finally {
      paramString = null;
      Exception exception1 = exception;
      if (exception1 != null)
        try {
          exception1.close();
        } catch (IOException iOException) {} 
      if (paramString != null)
        try {
          paramString.close();
        } catch (IOException iOException) {} 
      p(file2);
    } 
  }
  
  private static boolean i(int paramInt, zzcf$zza paramzzcf$zza) {
    if (paramInt < 4) {
      if (paramzzcf$zza == null)
        return true; 
      if (!paramzzcf$zza.q0() || paramzzcf$zza.j0().equals("0000000000000000000000000000000000000000000000000000000000000000") || !paramzzcf$zza.x0() || !paramzzcf$zza.y0().J() || paramzzcf$zza.y0().K() == -2L)
        return true; 
    } 
    return false;
  }
  
  private static void k(String paramString) {
    p(new File(paramString));
  }
  
  private final boolean n(File paramFile, String paramString) {
    m32 m321;
    File file1 = new File(String.format("%s/%s.tmp", new Object[] { paramFile, paramString }));
    if (!file1.exists())
      return false; 
    File file2 = new File(String.format("%s/%s.dex", new Object[] { paramFile, paramString }));
    if (file2.exists())
      return false; 
    paramFile = null;
    String str = null;
    try {
      long l = file1.length();
      if (l <= 0L)
        return false; 
      byte[] arrayOfByte = new byte[(int)l];
      FileInputStream fileInputStream = new FileInputStream(file1);
      try {
        if (fileInputStream.read(arrayOfByte) <= 0)
          return false; 
      } catch (IOException|java.security.NoSuchAlgorithmException|zzej iOException) {
        iOException = null;
      } finally {
        paramFile = null;
      } 
      if (fileInputStream != null)
        try {
          fileInputStream.close();
        } catch (IOException iOException) {} 
      if (paramString != null)
        try {
          paramString.close();
        } catch (IOException iOException) {} 
      throw paramFile;
    } catch (IOException|java.security.NoSuchAlgorithmException|zzej iOException) {
      File file4 = null;
      return false;
    } finally {
      paramString = null;
      m32 m322 = m321;
      if (m322 != null)
        try {
          m322.close();
        } catch (IOException iOException) {} 
      if (paramString != null)
        try {
          paramString.close();
        } catch (IOException iOException) {} 
    } 
  }
  
  private static void p(File paramFile) {
    if (!paramFile.exists()) {
      Log.d(a, String.format("File %s not found. No need for deletion", new Object[] { paramFile.getAbsolutePath() }));
      return;
    } 
    paramFile.delete();
  }
  
  public final Future A() {
    return this.l;
  }
  
  public final a D() {
    if (!this.h)
      return null; 
    if (this.g != null)
      return this.g; 
    Future future = this.i;
    if (future != null)
      try {
        future.get(2000L, TimeUnit.MILLISECONDS);
        this.i = null;
      } catch (InterruptedException|java.util.concurrent.ExecutionException interruptedException) {
      
      } catch (TimeoutException timeoutException) {
        this.i.cancel(true);
      }  
    return this.g;
  }
  
  public final Context a() {
    return this.b;
  }
  
  public final boolean b() {
    return this.q;
  }
  
  public final Method e(String paramString1, String paramString2) {
    ib2 ib2 = this.p.get(new Pair(paramString1, paramString2));
    return (ib2 == null) ? null : ib2.d();
  }
  
  final void f(int paramInt, boolean paramBoolean) {
    if (!this.o)
      return; 
    Future<?> future = this.c.submit(new aa2(this, paramInt, paramBoolean));
    if (paramInt == 0)
      this.l = future; 
  }
  
  public final boolean j(String paramString1, String paramString2, Class<?>... paramVarArgs) {
    if (!this.p.containsKey(new Pair(paramString1, paramString2))) {
      this.p.put(new Pair(paramString1, paramString2), new ib2(this, paramString1, paramString2, paramVarArgs));
      return true;
    } 
    return false;
  }
  
  final zzcf$zza l(int paramInt, boolean paramBoolean) {
    if (paramInt > 0 && paramBoolean) {
      long l = (paramInt * 1000);
      try {
        Thread.sleep(l);
      } catch (InterruptedException interruptedException) {}
    } 
    return C();
  }
  
  public final int o() {
    int i;
    if (this.m != null) {
      i = lq1.e();
    } else {
      i = Integer.MIN_VALUE;
    } 
    return i;
  }
  
  public final boolean q() {
    return this.r.a();
  }
  
  public final ExecutorService r() {
    return this.c;
  }
  
  public final DexClassLoader s() {
    return this.d;
  }
  
  public final m32 t() {
    return this.e;
  }
  
  public final byte[] u() {
    return this.f;
  }
  
  public final boolean v() {
    return this.n;
  }
  
  public final lq1 w() {
    return this.m;
  }
  
  public final boolean x() {
    return this.o;
  }
  
  final zzfa y() {
    return this.r;
  }
  
  public final zzcf$zza z() {
    return this.k;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/z92.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */