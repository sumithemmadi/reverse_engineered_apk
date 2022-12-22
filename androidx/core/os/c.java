package androidx.core.os;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

@Deprecated
public final class c {
  private static long a;
  
  private static Method b;
  
  private static Method c;
  
  private static Method d;
  
  private static Method e;
  
  static {
    int i = Build.VERSION.SDK_INT;
    if (i >= 18 && i < 29)
      try {
        a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
        Class<long> clazz = long.class;
        b = Trace.class.getMethod("isTagEnabled", new Class[] { clazz });
        Class<int> clazz1 = int.class;
        c = Trace.class.getMethod("asyncTraceBegin", new Class[] { clazz, String.class, clazz1 });
        d = Trace.class.getMethod("asyncTraceEnd", new Class[] { clazz, String.class, clazz1 });
        e = Trace.class.getMethod("traceCounter", new Class[] { clazz, String.class, clazz1 });
      } catch (Exception exception) {
        Log.i("TraceCompat", "Unable to initialize via reflection.", exception);
      }  
  }
  
  public static void a(String paramString) {
    if (Build.VERSION.SDK_INT >= 18)
      Trace.beginSection(paramString); 
  }
  
  public static void b() {
    if (Build.VERSION.SDK_INT >= 18)
      Trace.endSection(); 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/core/os/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */