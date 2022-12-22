package androidx.work.impl.k.f;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import androidx.work.f;

public class a extends c<Boolean> {
  private static final String i = f.f("BatteryChrgTracker");
  
  public a(Context paramContext, androidx.work.impl.utils.j.a parama) {
    super(paramContext, parama);
  }
  
  private boolean j(Intent paramIntent) {
    int i = Build.VERSION.SDK_INT;
    boolean bool = true;
    if (i >= 23) {
      i = paramIntent.getIntExtra("status", -1);
      boolean bool1 = bool;
      if (i != 2) {
        if (i == 5)
          return bool; 
      } else {
        return bool1;
      } 
    } else if (paramIntent.getIntExtra("plugged", 0) != 0) {
      return bool;
    } 
    return false;
  }
  
  public IntentFilter g() {
    IntentFilter intentFilter = new IntentFilter();
    if (Build.VERSION.SDK_INT >= 23) {
      intentFilter.addAction("android.os.action.CHARGING");
      intentFilter.addAction("android.os.action.DISCHARGING");
    } else {
      intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
      intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
    } 
    return intentFilter;
  }
  
  public void h(Context paramContext, Intent paramIntent) {
    // Byte code:
    //   0: aload_2
    //   1: invokevirtual getAction : ()Ljava/lang/String;
    //   4: astore_1
    //   5: aload_1
    //   6: ifnonnull -> 10
    //   9: return
    //   10: invokestatic c : ()Landroidx/work/f;
    //   13: astore_3
    //   14: getstatic androidx/work/impl/k/f/a.i : Ljava/lang/String;
    //   17: astore_2
    //   18: iconst_1
    //   19: istore #4
    //   21: aload_3
    //   22: aload_2
    //   23: ldc 'Received %s'
    //   25: iconst_1
    //   26: anewarray java/lang/Object
    //   29: dup
    //   30: iconst_0
    //   31: aload_1
    //   32: aastore
    //   33: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   36: iconst_0
    //   37: anewarray java/lang/Throwable
    //   40: invokevirtual a : (Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
    //   43: aload_1
    //   44: invokevirtual hashCode : ()I
    //   47: lookupswitch default -> 88, -1886648615 -> 142, -54942926 -> 130, 948344062 -> 112, 1019184907 -> 94
    //   88: iconst_m1
    //   89: istore #4
    //   91: goto -> 157
    //   94: aload_1
    //   95: ldc 'android.intent.action.ACTION_POWER_CONNECTED'
    //   97: invokevirtual equals : (Ljava/lang/Object;)Z
    //   100: ifne -> 106
    //   103: goto -> 88
    //   106: iconst_3
    //   107: istore #4
    //   109: goto -> 157
    //   112: aload_1
    //   113: ldc 'android.os.action.CHARGING'
    //   115: invokevirtual equals : (Ljava/lang/Object;)Z
    //   118: ifne -> 124
    //   121: goto -> 88
    //   124: iconst_2
    //   125: istore #4
    //   127: goto -> 157
    //   130: aload_1
    //   131: ldc 'android.os.action.DISCHARGING'
    //   133: invokevirtual equals : (Ljava/lang/Object;)Z
    //   136: ifne -> 157
    //   139: goto -> 88
    //   142: aload_1
    //   143: ldc 'android.intent.action.ACTION_POWER_DISCONNECTED'
    //   145: invokevirtual equals : (Ljava/lang/Object;)Z
    //   148: ifne -> 154
    //   151: goto -> 88
    //   154: iconst_0
    //   155: istore #4
    //   157: iload #4
    //   159: tableswitch default -> 188, 0 -> 221, 1 -> 211, 2 -> 201, 3 -> 191
    //   188: goto -> 228
    //   191: aload_0
    //   192: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   195: invokevirtual d : (Ljava/lang/Object;)V
    //   198: goto -> 228
    //   201: aload_0
    //   202: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   205: invokevirtual d : (Ljava/lang/Object;)V
    //   208: goto -> 228
    //   211: aload_0
    //   212: getstatic java/lang/Boolean.FALSE : Ljava/lang/Boolean;
    //   215: invokevirtual d : (Ljava/lang/Object;)V
    //   218: goto -> 228
    //   221: aload_0
    //   222: getstatic java/lang/Boolean.FALSE : Ljava/lang/Boolean;
    //   225: invokevirtual d : (Ljava/lang/Object;)V
    //   228: return
  }
  
  public Boolean i() {
    IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    Intent intent = this.c.registerReceiver(null, intentFilter);
    if (intent == null) {
      f.c().b(i, "getInitialState - null intent received", new Throwable[0]);
      return null;
    } 
    return Boolean.valueOf(j(intent));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/impl/k/f/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */