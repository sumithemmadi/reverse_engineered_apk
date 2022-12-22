package androidx.work.impl.utils;

import android.content.Context;
import android.content.SharedPreferences;

public class e {
  private Context a;
  
  private SharedPreferences b;
  
  public e(Context paramContext) {
    this.a = paramContext;
  }
  
  private SharedPreferences a() {
    // Byte code:
    //   0: ldc androidx/work/impl/utils/e
    //   2: monitorenter
    //   3: aload_0
    //   4: getfield b : Landroid/content/SharedPreferences;
    //   7: ifnonnull -> 24
    //   10: aload_0
    //   11: aload_0
    //   12: getfield a : Landroid/content/Context;
    //   15: ldc 'androidx.work.util.preferences'
    //   17: iconst_0
    //   18: invokevirtual getSharedPreferences : (Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   21: putfield b : Landroid/content/SharedPreferences;
    //   24: aload_0
    //   25: getfield b : Landroid/content/SharedPreferences;
    //   28: astore_1
    //   29: ldc androidx/work/impl/utils/e
    //   31: monitorexit
    //   32: aload_1
    //   33: areturn
    //   34: astore_1
    //   35: ldc androidx/work/impl/utils/e
    //   37: monitorexit
    //   38: aload_1
    //   39: athrow
    // Exception table:
    //   from	to	target	type
    //   3	24	34	finally
    //   24	32	34	finally
    //   35	38	34	finally
  }
  
  public boolean b() {
    return a().getBoolean("reschedule_needed", false);
  }
  
  public void c(boolean paramBoolean) {
    a().edit().putBoolean("reschedule_needed", paramBoolean).apply();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/impl/utils/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */