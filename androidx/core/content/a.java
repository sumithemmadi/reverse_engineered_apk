package androidx.core.content;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.TypedValue;
import java.io.File;

public class a {
  private static final Object a = new Object();
  
  private static TypedValue b;
  
  public static int a(Context paramContext, String paramString) {
    if (paramString != null)
      return paramContext.checkPermission(paramString, Process.myPid(), Process.myUid()); 
    throw new IllegalArgumentException("permission is null");
  }
  
  public static Context b(Context paramContext) {
    return (Build.VERSION.SDK_INT >= 24) ? paramContext.createDeviceProtectedStorageContext() : null;
  }
  
  private static File c(File paramFile) {
    // Byte code:
    //   0: ldc androidx/core/content/a
    //   2: monitorenter
    //   3: aload_0
    //   4: invokevirtual exists : ()Z
    //   7: ifne -> 70
    //   10: aload_0
    //   11: invokevirtual mkdirs : ()Z
    //   14: ifne -> 70
    //   17: aload_0
    //   18: invokevirtual exists : ()Z
    //   21: istore_1
    //   22: iload_1
    //   23: ifeq -> 31
    //   26: ldc androidx/core/content/a
    //   28: monitorexit
    //   29: aload_0
    //   30: areturn
    //   31: new java/lang/StringBuilder
    //   34: astore_2
    //   35: aload_2
    //   36: invokespecial <init> : ()V
    //   39: aload_2
    //   40: ldc 'Unable to create files subdir '
    //   42: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   45: pop
    //   46: aload_2
    //   47: aload_0
    //   48: invokevirtual getPath : ()Ljava/lang/String;
    //   51: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   54: pop
    //   55: ldc 'ContextCompat'
    //   57: aload_2
    //   58: invokevirtual toString : ()Ljava/lang/String;
    //   61: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   64: pop
    //   65: ldc androidx/core/content/a
    //   67: monitorexit
    //   68: aconst_null
    //   69: areturn
    //   70: ldc androidx/core/content/a
    //   72: monitorexit
    //   73: aload_0
    //   74: areturn
    //   75: astore_0
    //   76: ldc androidx/core/content/a
    //   78: monitorexit
    //   79: aload_0
    //   80: athrow
    // Exception table:
    //   from	to	target	type
    //   3	22	75	finally
    //   31	65	75	finally
  }
  
  public static int d(Context paramContext, int paramInt) {
    return (Build.VERSION.SDK_INT >= 23) ? paramContext.getColor(paramInt) : paramContext.getResources().getColor(paramInt);
  }
  
  public static ColorStateList e(Context paramContext, int paramInt) {
    return (Build.VERSION.SDK_INT >= 23) ? paramContext.getColorStateList(paramInt) : paramContext.getResources().getColorStateList(paramInt);
  }
  
  public static Drawable f(Context paramContext, int paramInt) {
    int i = Build.VERSION.SDK_INT;
    if (i >= 21)
      return paramContext.getDrawable(paramInt); 
    if (i >= 16)
      return paramContext.getResources().getDrawable(paramInt); 
    synchronized (a) {
      if (b == null) {
        TypedValue typedValue = new TypedValue();
        this();
        b = typedValue;
      } 
      paramContext.getResources().getValue(paramInt, b, true);
      paramInt = b.resourceId;
      return paramContext.getResources().getDrawable(paramInt);
    } 
  }
  
  public static File[] g(Context paramContext) {
    return (Build.VERSION.SDK_INT >= 19) ? paramContext.getExternalCacheDirs() : new File[] { paramContext.getExternalCacheDir() };
  }
  
  public static File[] h(Context paramContext, String paramString) {
    return (Build.VERSION.SDK_INT >= 19) ? paramContext.getExternalFilesDirs(paramString) : new File[] { paramContext.getExternalFilesDir(paramString) };
  }
  
  public static File i(Context paramContext) {
    return (Build.VERSION.SDK_INT >= 21) ? paramContext.getNoBackupFilesDir() : c(new File((paramContext.getApplicationInfo()).dataDir, "no_backup"));
  }
  
  public static boolean j(Context paramContext, Intent[] paramArrayOfIntent, Bundle paramBundle) {
    if (Build.VERSION.SDK_INT >= 16) {
      paramContext.startActivities(paramArrayOfIntent, paramBundle);
    } else {
      paramContext.startActivities(paramArrayOfIntent);
    } 
    return true;
  }
  
  public static void k(Context paramContext, Intent paramIntent, Bundle paramBundle) {
    if (Build.VERSION.SDK_INT >= 16) {
      paramContext.startActivity(paramIntent, paramBundle);
    } else {
      paramContext.startActivity(paramIntent);
    } 
  }
  
  public static void l(Context paramContext, Intent paramIntent) {
    if (Build.VERSION.SDK_INT >= 26) {
      paramContext.startForegroundService(paramIntent);
    } else {
      paramContext.startService(paramIntent);
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/core/content/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */