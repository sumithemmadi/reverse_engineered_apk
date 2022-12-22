package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.NetworkType;
import androidx.work.b;
import androidx.work.f;
import androidx.work.impl.l.j;
import java.util.Iterator;
import java.util.List;

abstract class ConstraintProxy extends BroadcastReceiver {
  private static final String a = f.f("ConstraintProxy");
  
  static void a(Context paramContext, List<j> paramList) {
    boolean bool4;
    boolean bool5;
    boolean bool6;
    int j;
    Iterator<j> iterator = paramList.iterator();
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    int i = 0;
    while (true) {
      bool4 = bool1;
      bool5 = bool2;
      bool6 = bool3;
      j = i;
      if (iterator.hasNext()) {
        byte b1;
        b b = ((j)iterator.next()).l;
        bool4 = bool1 | b.f();
        bool5 = bool2 | b.g();
        bool6 = bool3 | b.i();
        if (b.b() != NetworkType.b) {
          b1 = 1;
        } else {
          b1 = 0;
        } 
        j = i | b1;
        bool1 = bool4;
        bool2 = bool5;
        bool3 = bool6;
        i = j;
        if (bool4) {
          bool1 = bool4;
          bool2 = bool5;
          bool3 = bool6;
          i = j;
          if (bool5) {
            bool1 = bool4;
            bool2 = bool5;
            bool3 = bool6;
            i = j;
            if (bool6) {
              bool1 = bool4;
              bool2 = bool5;
              bool3 = bool6;
              i = j;
              if (j != 0)
                break; 
            } 
          } 
        } 
        continue;
      } 
      break;
    } 
    paramContext.sendBroadcast(ConstraintProxyUpdateReceiver.a(paramContext, bool4, bool5, bool6, j));
  }
  
  public void onReceive(Context paramContext, Intent paramIntent) {
    f.c().a(a, String.format("onReceive : %s", new Object[] { paramIntent }), new Throwable[0]);
    paramContext.startService(b.a(paramContext));
  }
  
  public static class BatteryChargingProxy extends ConstraintProxy {}
  
  public static class BatteryNotLowProxy extends ConstraintProxy {}
  
  public static class NetworkStateProxy extends ConstraintProxy {}
  
  public static class StorageNotLowProxy extends ConstraintProxy {}
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/impl/background/systemalarm/ConstraintProxy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */