package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import com.google.android.gms.common.k.c;

public class f {
  private static f a;
  
  private final Context b;
  
  private f(Context paramContext) {
    this.b = paramContext.getApplicationContext();
  }
  
  public static f a(Context paramContext) {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic j : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4: pop
    //   5: ldc com/google/android/gms/common/f
    //   7: monitorenter
    //   8: getstatic com/google/android/gms/common/f.a : Lcom/google/android/gms/common/f;
    //   11: ifnonnull -> 31
    //   14: aload_0
    //   15: invokestatic c : (Landroid/content/Context;)V
    //   18: new com/google/android/gms/common/f
    //   21: astore_1
    //   22: aload_1
    //   23: aload_0
    //   24: invokespecial <init> : (Landroid/content/Context;)V
    //   27: aload_1
    //   28: putstatic com/google/android/gms/common/f.a : Lcom/google/android/gms/common/f;
    //   31: ldc com/google/android/gms/common/f
    //   33: monitorexit
    //   34: getstatic com/google/android/gms/common/f.a : Lcom/google/android/gms/common/f;
    //   37: areturn
    //   38: astore_0
    //   39: ldc com/google/android/gms/common/f
    //   41: monitorexit
    //   42: aload_0
    //   43: athrow
    // Exception table:
    //   from	to	target	type
    //   8	31	38	finally
    //   31	34	38	finally
    //   39	42	38	finally
  }
  
  private static o d(PackageInfo paramPackageInfo, o... paramVarArgs) {
    Signature[] arrayOfSignature2 = paramPackageInfo.signatures;
    if (arrayOfSignature2 == null)
      return null; 
    if (arrayOfSignature2.length != 1) {
      Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
      return null;
    } 
    Signature[] arrayOfSignature1 = paramPackageInfo.signatures;
    byte b = 0;
    r r = new r(arrayOfSignature1[0].toByteArray());
    while (b < paramVarArgs.length) {
      if (paramVarArgs[b].equals(r))
        return paramVarArgs[b]; 
      b++;
    } 
    return null;
  }
  
  private final v e(String paramString, int paramInt) {
    try {
      PackageInfo packageInfo = c.a(this.b).g(paramString, 64, paramInt);
      boolean bool = e.f(this.b);
      if (packageInfo == null)
        return v.b("null pkg"); 
      Signature[] arrayOfSignature = packageInfo.signatures;
      if (arrayOfSignature == null || arrayOfSignature.length != 1)
        return v.b("single cert required"); 
      r r = new r();
      this(packageInfo.signatures[0].toByteArray());
      String str = packageInfo.packageName;
      v v = n.a(str, r, bool, false);
      if (v.b) {
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        if (applicationInfo != null && (applicationInfo.flags & 0x2) != 0 && (n.a(str, r, false, true)).b)
          return v.b("debuggable release cert app rejected"); 
      } 
      return v;
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
      paramString = String.valueOf(paramString);
      if (paramString.length() != 0) {
        paramString = "no pkg ".concat(paramString);
      } else {
        paramString = new String("no pkg ");
      } 
      return v.b(paramString);
    } 
  }
  
  public static boolean f(PackageInfo paramPackageInfo, boolean paramBoolean) {
    if (paramPackageInfo != null && paramPackageInfo.signatures != null) {
      o o;
      if (paramBoolean) {
        o = d(paramPackageInfo, t.a);
      } else {
        o = d((PackageInfo)o, new o[] { t.a[0] });
      } 
      if (o != null)
        return true; 
    } 
    return false;
  }
  
  public boolean b(PackageInfo paramPackageInfo) {
    if (paramPackageInfo == null)
      return false; 
    if (f(paramPackageInfo, false))
      return true; 
    if (f(paramPackageInfo, true)) {
      if (e.f(this.b))
        return true; 
      Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
    } 
    return false;
  }
  
  public boolean c(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : Landroid/content/Context;
    //   4: invokestatic a : (Landroid/content/Context;)Lcom/google/android/gms/common/k/b;
    //   7: iload_1
    //   8: invokevirtual i : (I)[Ljava/lang/String;
    //   11: astore_2
    //   12: aload_2
    //   13: ifnull -> 77
    //   16: aload_2
    //   17: arraylength
    //   18: ifne -> 24
    //   21: goto -> 77
    //   24: aconst_null
    //   25: astore_3
    //   26: aload_2
    //   27: arraylength
    //   28: istore #4
    //   30: iconst_0
    //   31: istore #5
    //   33: iload #5
    //   35: iload #4
    //   37: if_icmpge -> 66
    //   40: aload_0
    //   41: aload_2
    //   42: iload #5
    //   44: aaload
    //   45: iload_1
    //   46: invokespecial e : (Ljava/lang/String;I)Lcom/google/android/gms/common/v;
    //   49: astore_3
    //   50: aload_3
    //   51: getfield b : Z
    //   54: ifeq -> 60
    //   57: goto -> 83
    //   60: iinc #5, 1
    //   63: goto -> 33
    //   66: aload_3
    //   67: invokestatic j : (Ljava/lang/Object;)Ljava/lang/Object;
    //   70: checkcast com/google/android/gms/common/v
    //   73: astore_3
    //   74: goto -> 83
    //   77: ldc 'no pkgs'
    //   79: invokestatic b : (Ljava/lang/String;)Lcom/google/android/gms/common/v;
    //   82: astore_3
    //   83: aload_3
    //   84: invokevirtual g : ()V
    //   87: aload_3
    //   88: getfield b : Z
    //   91: ireturn
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */