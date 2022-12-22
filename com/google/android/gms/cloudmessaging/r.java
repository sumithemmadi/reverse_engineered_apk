package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.k.c;

public final class r {
  private final Context a;
  
  private int b;
  
  private int c = 0;
  
  public r(Context paramContext) {
    this.a = paramContext;
  }
  
  private final PackageInfo b(String paramString) {
    try {
      return c.a(this.a).e(paramString, 0);
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
      String str = String.valueOf(nameNotFoundException);
      StringBuilder stringBuilder = new StringBuilder(str.length() + 23);
      stringBuilder.append("Failed to find package ");
      stringBuilder.append(str);
      Log.w("Metadata", stringBuilder.toString());
      return null;
    } 
  }
  
  public final int a() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield c : I
    //   6: istore_1
    //   7: iload_1
    //   8: ifeq -> 15
    //   11: aload_0
    //   12: monitorexit
    //   13: iload_1
    //   14: ireturn
    //   15: aload_0
    //   16: getfield a : Landroid/content/Context;
    //   19: invokevirtual getPackageManager : ()Landroid/content/pm/PackageManager;
    //   22: astore_2
    //   23: aload_0
    //   24: getfield a : Landroid/content/Context;
    //   27: invokestatic a : (Landroid/content/Context;)Lcom/google/android/gms/common/k/b;
    //   30: ldc 'com.google.android.c2dm.permission.SEND'
    //   32: ldc 'com.google.android.gms'
    //   34: invokevirtual b : (Ljava/lang/String;Ljava/lang/String;)I
    //   37: iconst_m1
    //   38: if_icmpne -> 53
    //   41: ldc 'Metadata'
    //   43: ldc 'Google Play services missing or without correct permission.'
    //   45: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)I
    //   48: pop
    //   49: aload_0
    //   50: monitorexit
    //   51: iconst_0
    //   52: ireturn
    //   53: invokestatic k : ()Z
    //   56: ifne -> 105
    //   59: new android/content/Intent
    //   62: astore_3
    //   63: aload_3
    //   64: ldc 'com.google.android.c2dm.intent.REGISTER'
    //   66: invokespecial <init> : (Ljava/lang/String;)V
    //   69: aload_3
    //   70: ldc 'com.google.android.gms'
    //   72: invokevirtual setPackage : (Ljava/lang/String;)Landroid/content/Intent;
    //   75: pop
    //   76: aload_2
    //   77: aload_3
    //   78: iconst_0
    //   79: invokevirtual queryIntentServices : (Landroid/content/Intent;I)Ljava/util/List;
    //   82: astore_3
    //   83: aload_3
    //   84: ifnull -> 105
    //   87: aload_3
    //   88: invokeinterface size : ()I
    //   93: ifle -> 105
    //   96: aload_0
    //   97: iconst_1
    //   98: putfield c : I
    //   101: aload_0
    //   102: monitorexit
    //   103: iconst_1
    //   104: ireturn
    //   105: new android/content/Intent
    //   108: astore_3
    //   109: aload_3
    //   110: ldc 'com.google.iid.TOKEN_REQUEST'
    //   112: invokespecial <init> : (Ljava/lang/String;)V
    //   115: aload_3
    //   116: ldc 'com.google.android.gms'
    //   118: invokevirtual setPackage : (Ljava/lang/String;)Landroid/content/Intent;
    //   121: pop
    //   122: aload_2
    //   123: aload_3
    //   124: iconst_0
    //   125: invokevirtual queryBroadcastReceivers : (Landroid/content/Intent;I)Ljava/util/List;
    //   128: astore_2
    //   129: aload_2
    //   130: ifnull -> 151
    //   133: aload_2
    //   134: invokeinterface size : ()I
    //   139: ifle -> 151
    //   142: aload_0
    //   143: iconst_2
    //   144: putfield c : I
    //   147: aload_0
    //   148: monitorexit
    //   149: iconst_2
    //   150: ireturn
    //   151: ldc 'Metadata'
    //   153: ldc 'Failed to resolve IID implementation package, falling back'
    //   155: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   158: pop
    //   159: invokestatic k : ()Z
    //   162: ifeq -> 173
    //   165: aload_0
    //   166: iconst_2
    //   167: putfield c : I
    //   170: goto -> 178
    //   173: aload_0
    //   174: iconst_1
    //   175: putfield c : I
    //   178: aload_0
    //   179: getfield c : I
    //   182: istore_1
    //   183: aload_0
    //   184: monitorexit
    //   185: iload_1
    //   186: ireturn
    //   187: astore_2
    //   188: aload_0
    //   189: monitorexit
    //   190: aload_2
    //   191: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	187	finally
    //   15	49	187	finally
    //   53	83	187	finally
    //   87	101	187	finally
    //   105	129	187	finally
    //   133	147	187	finally
    //   151	170	187	finally
    //   173	178	187	finally
    //   178	183	187	finally
  }
  
  public final int c() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield b : I
    //   6: ifne -> 28
    //   9: aload_0
    //   10: ldc 'com.google.android.gms'
    //   12: invokespecial b : (Ljava/lang/String;)Landroid/content/pm/PackageInfo;
    //   15: astore_1
    //   16: aload_1
    //   17: ifnull -> 28
    //   20: aload_0
    //   21: aload_1
    //   22: getfield versionCode : I
    //   25: putfield b : I
    //   28: aload_0
    //   29: getfield b : I
    //   32: istore_2
    //   33: aload_0
    //   34: monitorexit
    //   35: iload_2
    //   36: ireturn
    //   37: astore_1
    //   38: aload_0
    //   39: monitorexit
    //   40: aload_1
    //   41: athrow
    // Exception table:
    //   from	to	target	type
    //   2	16	37	finally
    //   20	28	37	finally
    //   28	33	37	finally
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/cloudmessaging/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */