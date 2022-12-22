package androidx.work.impl.utils;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.f;
import java.util.HashMap;
import java.util.WeakHashMap;

public class i {
  private static final String a = f.f("WakeLocks");
  
  private static final WeakHashMap<PowerManager.WakeLock, String> b = new WeakHashMap<PowerManager.WakeLock, String>();
  
  public static void a() {
    null = new HashMap<Object, Object>();
    synchronized (b) {
      null.putAll(null);
      for (PowerManager.WakeLock wakeLock : null.keySet()) {
        if (wakeLock != null && wakeLock.isHeld()) {
          String str = String.format("WakeLock held for %s", new Object[] { null.get(wakeLock) });
          f.c().h(a, str, new Throwable[0]);
        } 
      } 
      return;
    } 
  }
  
  public static PowerManager.WakeLock b(Context paramContext, String paramString) {
    PowerManager powerManager = (PowerManager)paramContext.getApplicationContext().getSystemService("power");
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("WorkManager: ");
    stringBuilder.append(paramString);
    paramString = stringBuilder.toString();
    PowerManager.WakeLock wakeLock = powerManager.newWakeLock(1, paramString);
    synchronized (b) {
      null.put(wakeLock, paramString);
      return wakeLock;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/impl/utils/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */