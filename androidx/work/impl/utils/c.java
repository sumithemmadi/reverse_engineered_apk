package androidx.work.impl.utils;

import android.content.Context;
import android.content.SharedPreferences;

public class c {
  private final Context a;
  
  private SharedPreferences b;
  
  private boolean c;
  
  public c(Context paramContext) {
    this.a = paramContext;
  }
  
  private void a() {
    if (!this.c) {
      this.b = this.a.getSharedPreferences("androidx.work.util.id", 0);
      this.c = true;
    } 
  }
  
  private int c(String paramString) {
    SharedPreferences sharedPreferences = this.b;
    int i = 0;
    int j = sharedPreferences.getInt(paramString, 0);
    if (j != Integer.MAX_VALUE)
      i = j + 1; 
    e(paramString, i);
    return j;
  }
  
  private void e(String paramString, int paramInt) {
    this.b.edit().putInt(paramString, paramInt).apply();
  }
  
  public int b() {
    // Byte code:
    //   0: ldc androidx/work/impl/utils/c
    //   2: monitorenter
    //   3: aload_0
    //   4: invokespecial a : ()V
    //   7: aload_0
    //   8: ldc 'next_alarm_manager_id'
    //   10: invokespecial c : (Ljava/lang/String;)I
    //   13: istore_1
    //   14: ldc androidx/work/impl/utils/c
    //   16: monitorexit
    //   17: iload_1
    //   18: ireturn
    //   19: astore_2
    //   20: ldc androidx/work/impl/utils/c
    //   22: monitorexit
    //   23: aload_2
    //   24: athrow
    // Exception table:
    //   from	to	target	type
    //   3	17	19	finally
    //   20	23	19	finally
  }
  
  public int d(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: ldc androidx/work/impl/utils/c
    //   2: monitorenter
    //   3: aload_0
    //   4: invokespecial a : ()V
    //   7: aload_0
    //   8: ldc 'next_job_scheduler_id'
    //   10: invokespecial c : (Ljava/lang/String;)I
    //   13: istore_3
    //   14: iload_3
    //   15: iload_1
    //   16: if_icmplt -> 32
    //   19: iload_3
    //   20: iload_2
    //   21: if_icmple -> 27
    //   24: goto -> 32
    //   27: iload_3
    //   28: istore_1
    //   29: goto -> 41
    //   32: aload_0
    //   33: ldc 'next_job_scheduler_id'
    //   35: iload_1
    //   36: iconst_1
    //   37: iadd
    //   38: invokespecial e : (Ljava/lang/String;I)V
    //   41: ldc androidx/work/impl/utils/c
    //   43: monitorexit
    //   44: iload_1
    //   45: ireturn
    //   46: astore #4
    //   48: ldc androidx/work/impl/utils/c
    //   50: monitorexit
    //   51: aload #4
    //   53: athrow
    // Exception table:
    //   from	to	target	type
    //   3	14	46	finally
    //   32	41	46	finally
    //   41	44	46	finally
    //   48	51	46	finally
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/impl/utils/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */