package com.google.android.gms.cloudmessaging;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import b.e.g;
import com.google.android.gms.tasks.g;
import com.google.android.gms.tasks.h;
import com.google.android.gms.tasks.j;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class b {
  private static int a;
  
  private static PendingIntent b;
  
  private static final Executor c = z.b;
  
  private final g<String, h<Bundle>> d = new g();
  
  private final Context e;
  
  private final r f;
  
  private final ScheduledExecutorService g;
  
  private Messenger h;
  
  private Messenger i;
  
  private zza j;
  
  public b(Context paramContext) {
    this.e = paramContext;
    this.f = new r(paramContext);
    this.h = new Messenger((Handler)new y(this, Looper.getMainLooper()));
    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
    scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
    scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
    this.g = scheduledThreadPoolExecutor;
  }
  
  private static String e() {
    // Byte code:
    //   0: ldc com/google/android/gms/cloudmessaging/b
    //   2: monitorenter
    //   3: getstatic com/google/android/gms/cloudmessaging/b.a : I
    //   6: istore_0
    //   7: iload_0
    //   8: iconst_1
    //   9: iadd
    //   10: putstatic com/google/android/gms/cloudmessaging/b.a : I
    //   13: iload_0
    //   14: invokestatic toString : (I)Ljava/lang/String;
    //   17: astore_1
    //   18: ldc com/google/android/gms/cloudmessaging/b
    //   20: monitorexit
    //   21: aload_1
    //   22: areturn
    //   23: astore_1
    //   24: ldc com/google/android/gms/cloudmessaging/b
    //   26: monitorexit
    //   27: aload_1
    //   28: athrow
    // Exception table:
    //   from	to	target	type
    //   3	18	23	finally
  }
  
  private static void f(Context paramContext, Intent paramIntent) {
    // Byte code:
    //   0: ldc com/google/android/gms/cloudmessaging/b
    //   2: monitorenter
    //   3: getstatic com/google/android/gms/cloudmessaging/b.b : Landroid/app/PendingIntent;
    //   6: ifnonnull -> 34
    //   9: new android/content/Intent
    //   12: astore_2
    //   13: aload_2
    //   14: invokespecial <init> : ()V
    //   17: aload_2
    //   18: ldc 'com.google.example.invalidpackage'
    //   20: invokevirtual setPackage : (Ljava/lang/String;)Landroid/content/Intent;
    //   23: pop
    //   24: aload_0
    //   25: iconst_0
    //   26: aload_2
    //   27: iconst_0
    //   28: invokestatic getBroadcast : (Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
    //   31: putstatic com/google/android/gms/cloudmessaging/b.b : Landroid/app/PendingIntent;
    //   34: aload_1
    //   35: ldc 'app'
    //   37: getstatic com/google/android/gms/cloudmessaging/b.b : Landroid/app/PendingIntent;
    //   40: invokevirtual putExtra : (Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
    //   43: pop
    //   44: ldc com/google/android/gms/cloudmessaging/b
    //   46: monitorexit
    //   47: return
    //   48: astore_0
    //   49: ldc com/google/android/gms/cloudmessaging/b
    //   51: monitorexit
    //   52: aload_0
    //   53: athrow
    // Exception table:
    //   from	to	target	type
    //   3	34	48	finally
    //   34	44	48	finally
  }
  
  private final void g(Message paramMessage) {
    // Byte code:
    //   0: aload_1
    //   1: ifnull -> 551
    //   4: aload_1
    //   5: getfield obj : Ljava/lang/Object;
    //   8: astore_2
    //   9: aload_2
    //   10: instanceof android/content/Intent
    //   13: ifeq -> 551
    //   16: aload_2
    //   17: checkcast android/content/Intent
    //   20: astore_2
    //   21: aload_2
    //   22: new com/google/android/gms/cloudmessaging/zza$a
    //   25: dup
    //   26: invokespecial <init> : ()V
    //   29: invokevirtual setExtrasClassLoader : (Ljava/lang/ClassLoader;)V
    //   32: aload_2
    //   33: ldc 'google.messenger'
    //   35: invokevirtual hasExtra : (Ljava/lang/String;)Z
    //   38: ifeq -> 78
    //   41: aload_2
    //   42: ldc 'google.messenger'
    //   44: invokevirtual getParcelableExtra : (Ljava/lang/String;)Landroid/os/Parcelable;
    //   47: astore_2
    //   48: aload_2
    //   49: instanceof com/google/android/gms/cloudmessaging/zza
    //   52: ifeq -> 63
    //   55: aload_0
    //   56: aload_2
    //   57: checkcast com/google/android/gms/cloudmessaging/zza
    //   60: putfield j : Lcom/google/android/gms/cloudmessaging/zza;
    //   63: aload_2
    //   64: instanceof android/os/Messenger
    //   67: ifeq -> 78
    //   70: aload_0
    //   71: aload_2
    //   72: checkcast android/os/Messenger
    //   75: putfield i : Landroid/os/Messenger;
    //   78: aload_1
    //   79: getfield obj : Ljava/lang/Object;
    //   82: checkcast android/content/Intent
    //   85: astore_3
    //   86: aload_3
    //   87: invokevirtual getAction : ()Ljava/lang/String;
    //   90: astore_1
    //   91: ldc 'com.google.android.c2dm.intent.REGISTRATION'
    //   93: aload_1
    //   94: invokevirtual equals : (Ljava/lang/Object;)Z
    //   97: ifne -> 149
    //   100: ldc 'Rpc'
    //   102: iconst_3
    //   103: invokestatic isLoggable : (Ljava/lang/String;I)Z
    //   106: ifeq -> 148
    //   109: aload_1
    //   110: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   113: astore_1
    //   114: aload_1
    //   115: invokevirtual length : ()I
    //   118: ifeq -> 131
    //   121: ldc 'Unexpected response action: '
    //   123: aload_1
    //   124: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   127: astore_1
    //   128: goto -> 141
    //   131: new java/lang/String
    //   134: dup
    //   135: ldc 'Unexpected response action: '
    //   137: invokespecial <init> : (Ljava/lang/String;)V
    //   140: astore_1
    //   141: ldc 'Rpc'
    //   143: aload_1
    //   144: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   147: pop
    //   148: return
    //   149: aload_3
    //   150: ldc 'registration_id'
    //   152: invokevirtual getStringExtra : (Ljava/lang/String;)Ljava/lang/String;
    //   155: astore_2
    //   156: aload_2
    //   157: astore_1
    //   158: aload_2
    //   159: ifnonnull -> 169
    //   162: aload_3
    //   163: ldc 'unregistered'
    //   165: invokevirtual getStringExtra : (Ljava/lang/String;)Ljava/lang/String;
    //   168: astore_1
    //   169: aload_1
    //   170: ifnonnull -> 452
    //   173: aload_3
    //   174: ldc 'error'
    //   176: invokevirtual getStringExtra : (Ljava/lang/String;)Ljava/lang/String;
    //   179: astore_2
    //   180: aload_2
    //   181: ifnonnull -> 231
    //   184: aload_3
    //   185: invokevirtual getExtras : ()Landroid/os/Bundle;
    //   188: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   191: astore_2
    //   192: new java/lang/StringBuilder
    //   195: dup
    //   196: aload_2
    //   197: invokevirtual length : ()I
    //   200: bipush #49
    //   202: iadd
    //   203: invokespecial <init> : (I)V
    //   206: astore_1
    //   207: aload_1
    //   208: ldc 'Unexpected response, no error or registration id '
    //   210: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   213: pop
    //   214: aload_1
    //   215: aload_2
    //   216: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   219: pop
    //   220: ldc 'Rpc'
    //   222: aload_1
    //   223: invokevirtual toString : ()Ljava/lang/String;
    //   226: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   229: pop
    //   230: return
    //   231: ldc 'Rpc'
    //   233: iconst_3
    //   234: invokestatic isLoggable : (Ljava/lang/String;I)Z
    //   237: ifeq -> 276
    //   240: aload_2
    //   241: invokevirtual length : ()I
    //   244: ifeq -> 258
    //   247: ldc_w 'Received InstanceID error '
    //   250: aload_2
    //   251: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   254: astore_1
    //   255: goto -> 269
    //   258: new java/lang/String
    //   261: dup
    //   262: ldc_w 'Received InstanceID error '
    //   265: invokespecial <init> : (Ljava/lang/String;)V
    //   268: astore_1
    //   269: ldc 'Rpc'
    //   271: aload_1
    //   272: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   275: pop
    //   276: aload_2
    //   277: ldc_w '|'
    //   280: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   283: ifeq -> 396
    //   286: aload_2
    //   287: ldc_w '\|'
    //   290: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   293: astore_1
    //   294: aload_1
    //   295: arraylength
    //   296: iconst_2
    //   297: if_icmple -> 359
    //   300: ldc_w 'ID'
    //   303: aload_1
    //   304: iconst_1
    //   305: aaload
    //   306: invokevirtual equals : (Ljava/lang/Object;)Z
    //   309: ifne -> 315
    //   312: goto -> 359
    //   315: aload_1
    //   316: iconst_2
    //   317: aaload
    //   318: astore #4
    //   320: aload_1
    //   321: iconst_3
    //   322: aaload
    //   323: astore_2
    //   324: aload_2
    //   325: astore_1
    //   326: aload_2
    //   327: ldc_w ':'
    //   330: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   333: ifeq -> 342
    //   336: aload_2
    //   337: iconst_1
    //   338: invokevirtual substring : (I)Ljava/lang/String;
    //   341: astore_1
    //   342: aload_0
    //   343: aload #4
    //   345: aload_3
    //   346: ldc 'error'
    //   348: aload_1
    //   349: invokevirtual putExtra : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   352: invokevirtual getExtras : ()Landroid/os/Bundle;
    //   355: invokespecial j : (Ljava/lang/String;Landroid/os/Bundle;)V
    //   358: return
    //   359: aload_2
    //   360: invokevirtual length : ()I
    //   363: ifeq -> 377
    //   366: ldc_w 'Unexpected structured response '
    //   369: aload_2
    //   370: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   373: astore_1
    //   374: goto -> 388
    //   377: new java/lang/String
    //   380: dup
    //   381: ldc_w 'Unexpected structured response '
    //   384: invokespecial <init> : (Ljava/lang/String;)V
    //   387: astore_1
    //   388: ldc 'Rpc'
    //   390: aload_1
    //   391: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   394: pop
    //   395: return
    //   396: aload_0
    //   397: getfield d : Lb/e/g;
    //   400: astore_1
    //   401: aload_1
    //   402: monitorenter
    //   403: iconst_0
    //   404: istore #5
    //   406: iload #5
    //   408: aload_0
    //   409: getfield d : Lb/e/g;
    //   412: invokevirtual size : ()I
    //   415: if_icmpge -> 444
    //   418: aload_0
    //   419: aload_0
    //   420: getfield d : Lb/e/g;
    //   423: iload #5
    //   425: invokevirtual i : (I)Ljava/lang/Object;
    //   428: checkcast java/lang/String
    //   431: aload_3
    //   432: invokevirtual getExtras : ()Landroid/os/Bundle;
    //   435: invokespecial j : (Ljava/lang/String;Landroid/os/Bundle;)V
    //   438: iinc #5, 1
    //   441: goto -> 406
    //   444: aload_1
    //   445: monitorexit
    //   446: return
    //   447: astore_2
    //   448: aload_1
    //   449: monitorexit
    //   450: aload_2
    //   451: athrow
    //   452: ldc_w '\|ID\|([^|]+)\|:?+(.*)'
    //   455: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   458: aload_1
    //   459: invokevirtual matcher : (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   462: astore_2
    //   463: aload_2
    //   464: invokevirtual matches : ()Z
    //   467: ifne -> 516
    //   470: ldc 'Rpc'
    //   472: iconst_3
    //   473: invokestatic isLoggable : (Ljava/lang/String;I)Z
    //   476: ifeq -> 515
    //   479: aload_1
    //   480: invokevirtual length : ()I
    //   483: ifeq -> 497
    //   486: ldc_w 'Unexpected response string: '
    //   489: aload_1
    //   490: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   493: astore_1
    //   494: goto -> 508
    //   497: new java/lang/String
    //   500: dup
    //   501: ldc_w 'Unexpected response string: '
    //   504: invokespecial <init> : (Ljava/lang/String;)V
    //   507: astore_1
    //   508: ldc 'Rpc'
    //   510: aload_1
    //   511: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   514: pop
    //   515: return
    //   516: aload_2
    //   517: iconst_1
    //   518: invokevirtual group : (I)Ljava/lang/String;
    //   521: astore_1
    //   522: aload_2
    //   523: iconst_2
    //   524: invokevirtual group : (I)Ljava/lang/String;
    //   527: astore_2
    //   528: aload_1
    //   529: ifnull -> 550
    //   532: aload_3
    //   533: invokevirtual getExtras : ()Landroid/os/Bundle;
    //   536: astore_3
    //   537: aload_3
    //   538: ldc 'registration_id'
    //   540: aload_2
    //   541: invokevirtual putString : (Ljava/lang/String;Ljava/lang/String;)V
    //   544: aload_0
    //   545: aload_1
    //   546: aload_3
    //   547: invokespecial j : (Ljava/lang/String;Landroid/os/Bundle;)V
    //   550: return
    //   551: ldc 'Rpc'
    //   553: ldc_w 'Dropping invalid message'
    //   556: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   559: pop
    //   560: return
    // Exception table:
    //   from	to	target	type
    //   406	438	447	finally
    //   444	446	447	finally
    //   448	450	447	finally
  }
  
  private final void j(String paramString, Bundle paramBundle) {
    synchronized (this.d) {
      h h = (h)this.d.remove(paramString);
      if (h == null) {
        paramString = String.valueOf(paramString);
        if (paramString.length() != 0) {
          paramString = "Missing callback for ".concat(paramString);
        } else {
          paramString = new String("Missing callback for ");
        } 
        Log.w("Rpc", paramString);
        return;
      } 
      h.c(paramBundle);
      return;
    } 
  }
  
  private static boolean l(Bundle paramBundle) {
    return (paramBundle != null && paramBundle.containsKey("google.messenger"));
  }
  
  private final g<Bundle> m(Bundle paramBundle) {
    // Byte code:
    //   0: invokestatic e : ()Ljava/lang/String;
    //   3: astore_2
    //   4: new com/google/android/gms/tasks/h
    //   7: dup
    //   8: invokespecial <init> : ()V
    //   11: astore_3
    //   12: aload_0
    //   13: getfield d : Lb/e/g;
    //   16: astore #4
    //   18: aload #4
    //   20: monitorenter
    //   21: aload_0
    //   22: getfield d : Lb/e/g;
    //   25: aload_2
    //   26: aload_3
    //   27: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   30: pop
    //   31: aload #4
    //   33: monitorexit
    //   34: new android/content/Intent
    //   37: dup
    //   38: invokespecial <init> : ()V
    //   41: astore #4
    //   43: aload #4
    //   45: ldc_w 'com.google.android.gms'
    //   48: invokevirtual setPackage : (Ljava/lang/String;)Landroid/content/Intent;
    //   51: pop
    //   52: aload_0
    //   53: getfield f : Lcom/google/android/gms/cloudmessaging/r;
    //   56: invokevirtual a : ()I
    //   59: iconst_2
    //   60: if_icmpne -> 75
    //   63: aload #4
    //   65: ldc_w 'com.google.iid.TOKEN_REQUEST'
    //   68: invokevirtual setAction : (Ljava/lang/String;)Landroid/content/Intent;
    //   71: pop
    //   72: goto -> 84
    //   75: aload #4
    //   77: ldc_w 'com.google.android.c2dm.intent.REGISTER'
    //   80: invokevirtual setAction : (Ljava/lang/String;)Landroid/content/Intent;
    //   83: pop
    //   84: aload #4
    //   86: aload_1
    //   87: invokevirtual putExtras : (Landroid/os/Bundle;)Landroid/content/Intent;
    //   90: pop
    //   91: aload_0
    //   92: getfield e : Landroid/content/Context;
    //   95: aload #4
    //   97: invokestatic f : (Landroid/content/Context;Landroid/content/Intent;)V
    //   100: new java/lang/StringBuilder
    //   103: dup
    //   104: aload_2
    //   105: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   108: invokevirtual length : ()I
    //   111: iconst_5
    //   112: iadd
    //   113: invokespecial <init> : (I)V
    //   116: astore_1
    //   117: aload_1
    //   118: ldc_w '|ID|'
    //   121: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   124: pop
    //   125: aload_1
    //   126: aload_2
    //   127: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   130: pop
    //   131: aload_1
    //   132: ldc_w '|'
    //   135: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   138: pop
    //   139: aload #4
    //   141: ldc_w 'kid'
    //   144: aload_1
    //   145: invokevirtual toString : ()Ljava/lang/String;
    //   148: invokevirtual putExtra : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   151: pop
    //   152: ldc 'Rpc'
    //   154: iconst_3
    //   155: invokestatic isLoggable : (Ljava/lang/String;I)Z
    //   158: ifeq -> 213
    //   161: aload #4
    //   163: invokevirtual getExtras : ()Landroid/os/Bundle;
    //   166: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   169: astore_1
    //   170: new java/lang/StringBuilder
    //   173: dup
    //   174: aload_1
    //   175: invokevirtual length : ()I
    //   178: bipush #8
    //   180: iadd
    //   181: invokespecial <init> : (I)V
    //   184: astore #5
    //   186: aload #5
    //   188: ldc_w 'Sending '
    //   191: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   194: pop
    //   195: aload #5
    //   197: aload_1
    //   198: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   201: pop
    //   202: ldc 'Rpc'
    //   204: aload #5
    //   206: invokevirtual toString : ()Ljava/lang/String;
    //   209: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   212: pop
    //   213: aload #4
    //   215: ldc 'google.messenger'
    //   217: aload_0
    //   218: getfield h : Landroid/os/Messenger;
    //   221: invokevirtual putExtra : (Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
    //   224: pop
    //   225: aload_0
    //   226: getfield i : Landroid/os/Messenger;
    //   229: ifnonnull -> 239
    //   232: aload_0
    //   233: getfield j : Lcom/google/android/gms/cloudmessaging/zza;
    //   236: ifnull -> 299
    //   239: invokestatic obtain : ()Landroid/os/Message;
    //   242: astore_1
    //   243: aload_1
    //   244: aload #4
    //   246: putfield obj : Ljava/lang/Object;
    //   249: aload_0
    //   250: getfield i : Landroid/os/Messenger;
    //   253: astore #5
    //   255: aload #5
    //   257: ifnull -> 269
    //   260: aload #5
    //   262: aload_1
    //   263: invokevirtual send : (Landroid/os/Message;)V
    //   266: goto -> 332
    //   269: aload_0
    //   270: getfield j : Lcom/google/android/gms/cloudmessaging/zza;
    //   273: aload_1
    //   274: invokevirtual b : (Landroid/os/Message;)V
    //   277: goto -> 332
    //   280: astore_1
    //   281: ldc 'Rpc'
    //   283: iconst_3
    //   284: invokestatic isLoggable : (Ljava/lang/String;I)Z
    //   287: ifeq -> 299
    //   290: ldc 'Rpc'
    //   292: ldc_w 'Messenger failed, fallback to startService'
    //   295: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   298: pop
    //   299: aload_0
    //   300: getfield f : Lcom/google/android/gms/cloudmessaging/r;
    //   303: invokevirtual a : ()I
    //   306: iconst_2
    //   307: if_icmpne -> 322
    //   310: aload_0
    //   311: getfield e : Landroid/content/Context;
    //   314: aload #4
    //   316: invokevirtual sendBroadcast : (Landroid/content/Intent;)V
    //   319: goto -> 332
    //   322: aload_0
    //   323: getfield e : Landroid/content/Context;
    //   326: aload #4
    //   328: invokevirtual startService : (Landroid/content/Intent;)Landroid/content/ComponentName;
    //   331: pop
    //   332: aload_0
    //   333: getfield g : Ljava/util/concurrent/ScheduledExecutorService;
    //   336: new com/google/android/gms/cloudmessaging/u
    //   339: dup
    //   340: aload_3
    //   341: invokespecial <init> : (Lcom/google/android/gms/tasks/h;)V
    //   344: ldc2_w 30
    //   347: getstatic java/util/concurrent/TimeUnit.SECONDS : Ljava/util/concurrent/TimeUnit;
    //   350: invokeinterface schedule : (Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    //   355: astore_1
    //   356: aload_3
    //   357: invokevirtual a : ()Lcom/google/android/gms/tasks/g;
    //   360: getstatic com/google/android/gms/cloudmessaging/b.c : Ljava/util/concurrent/Executor;
    //   363: new com/google/android/gms/cloudmessaging/x
    //   366: dup
    //   367: aload_0
    //   368: aload_2
    //   369: aload_1
    //   370: invokespecial <init> : (Lcom/google/android/gms/cloudmessaging/b;Ljava/lang/String;Ljava/util/concurrent/ScheduledFuture;)V
    //   373: invokevirtual b : (Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/c;)Lcom/google/android/gms/tasks/g;
    //   376: pop
    //   377: aload_3
    //   378: invokevirtual a : ()Lcom/google/android/gms/tasks/g;
    //   381: areturn
    //   382: astore_1
    //   383: aload #4
    //   385: monitorexit
    //   386: aload_1
    //   387: athrow
    // Exception table:
    //   from	to	target	type
    //   21	34	382	finally
    //   249	255	280	android/os/RemoteException
    //   260	266	280	android/os/RemoteException
    //   269	277	280	android/os/RemoteException
    //   383	386	382	finally
  }
  
  public g<Bundle> a(Bundle paramBundle) {
    int i = this.f.c();
    boolean bool = true;
    if (i >= 12000000)
      return f.c(this.e).f(1, paramBundle).h(c, t.a); 
    if (this.f.a() == 0)
      bool = false; 
    return !bool ? j.d(new IOException("MISSING_INSTANCEID_SERVICE")) : m(paramBundle).i(c, new v(this, paramBundle));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/cloudmessaging/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */