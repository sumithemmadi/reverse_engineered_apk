package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.util.DynamiteApi;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public final class DynamiteModule {
  private static Boolean a;
  
  private static k b;
  
  private static m c;
  
  private static String d;
  
  private static int e = -1;
  
  private static final ThreadLocal<b> f = new ThreadLocal<b>();
  
  private static final a.b g = new b();
  
  public static final a h = new a();
  
  public static final a i = new d();
  
  public static final a j = new c();
  
  public static final a k = new f();
  
  public static final a l = new e();
  
  public static final a m = new h();
  
  private static final a n = new g();
  
  private final Context o;
  
  private DynamiteModule(Context paramContext) {
    this.o = (Context)t.j(paramContext);
  }
  
  public static int a(Context paramContext, String paramString) {
    try {
      StringBuilder stringBuilder2;
      ClassLoader classLoader = paramContext.getApplicationContext().getClassLoader();
      null = String.valueOf(paramString).length();
      StringBuilder stringBuilder1 = new StringBuilder();
      this(null + 61);
      stringBuilder1.append("com.google.android.gms.dynamite.descriptors.");
      stringBuilder1.append(paramString);
      stringBuilder1.append(".ModuleDescriptor");
      Class<?> clazz = classLoader.loadClass(stringBuilder1.toString());
      Field field1 = clazz.getDeclaredField("MODULE_ID");
      Field field2 = clazz.getDeclaredField("MODULE_VERSION");
      if (!field1.get(null).equals(paramString)) {
        String str = String.valueOf(field1.get(null));
        int i = str.length();
        null = String.valueOf(paramString).length();
        stringBuilder2 = new StringBuilder();
        this(i + 51 + null);
        stringBuilder2.append("Module descriptor id '");
        stringBuilder2.append(str);
        stringBuilder2.append("' didn't match expected id '");
        stringBuilder2.append(paramString);
        stringBuilder2.append("'");
        Log.e("DynamiteModule", stringBuilder2.toString());
        return 0;
      } 
      return stringBuilder2.getInt(null);
    } catch (ClassNotFoundException classNotFoundException) {
      StringBuilder stringBuilder = new StringBuilder(String.valueOf(paramString).length() + 45);
      stringBuilder.append("Local module descriptor class for ");
      stringBuilder.append(paramString);
      stringBuilder.append(" not found.");
      Log.w("DynamiteModule", stringBuilder.toString());
    } catch (Exception exception) {
      String str = String.valueOf(exception.getMessage());
      if (str.length() != 0) {
        str = "Failed to load module descriptor class: ".concat(str);
      } else {
        str = new String("Failed to load module descriptor class: ");
      } 
      Log.e("DynamiteModule", str);
    } 
    return 0;
  }
  
  public static int c(Context paramContext, String paramString) {
    return f(paramContext, paramString, false);
  }
  
  public static DynamiteModule e(Context paramContext, a parama, String paramString) {
    ThreadLocal<b> threadLocal = f;
    b b1 = threadLocal.get();
    b b2 = new b(null);
    threadLocal.set(b2);
    try {
      a.a a1 = parama.a(paramContext, paramString, g);
      int i = a1.a;
      int j = a1.b;
      int n = String.valueOf(paramString).length();
      int i1 = String.valueOf(paramString).length();
      StringBuilder stringBuilder2 = new StringBuilder();
      this(n + 68 + i1);
      stringBuilder2.append("Considering local module ");
      stringBuilder2.append(paramString);
      stringBuilder2.append(":");
      stringBuilder2.append(i);
      stringBuilder2.append(" and remote module ");
      stringBuilder2.append(paramString);
      stringBuilder2.append(":");
      stringBuilder2.append(j);
      Log.i("DynamiteModule", stringBuilder2.toString());
      i1 = a1.c;
      if (i1 != 0 && (i1 != -1 || a1.a != 0) && (i1 != 1 || a1.b != 0)) {
        DynamiteModule dynamiteModule;
        Cursor cursor;
        if (i1 == -1) {
          dynamiteModule = g(paramContext, paramString);
          return dynamiteModule;
        } 
        if (i1 == 1) {
          Cursor cursor1;
          try {
            return h((Context)dynamiteModule, paramString, a1.b);
          } catch (LoadingException loadingException3) {
            String str = String.valueOf(loadingException3.getMessage());
            if (str.length() != 0) {
              str = "Failed to load remote module: ".concat(str);
            } else {
              str = new String("Failed to load remote module: ");
            } 
            Log.w("DynamiteModule", str);
            i1 = a1.a;
            if (i1 != 0) {
              c c = new c();
              this(i1, 0);
              if ((cursor.a((Context)cursor1, paramString, c)).c == -1)
                return g((Context)cursor1, paramString); 
            } 
            LoadingException loadingException2 = new LoadingException();
            this("Remote load failed. No local fallback found.", loadingException3, null);
            throw loadingException2;
          } 
        } 
        LoadingException loadingException1 = new LoadingException();
        i1 = a1.c;
        StringBuilder stringBuilder = new StringBuilder();
        this(47);
        stringBuilder.append("VersionPolicy returned invalid code:");
        stringBuilder.append(i1);
        this(stringBuilder.toString(), (b)null);
        throw loadingException1;
      } 
      LoadingException loadingException = new LoadingException();
      i1 = a1.a;
      i = a1.b;
      StringBuilder stringBuilder1 = new StringBuilder();
      this(91);
      stringBuilder1.append("No acceptable module found. Local version is ");
      stringBuilder1.append(i1);
      stringBuilder1.append(" and remote version is ");
      stringBuilder1.append(i);
      stringBuilder1.append(".");
      this(stringBuilder1.toString(), (b)null);
      throw loadingException;
    } finally {
      Cursor cursor = b2.a;
      if (cursor != null)
        cursor.close(); 
      f.set(b1);
    } 
  }
  
  public static int f(Context paramContext, String paramString, boolean paramBoolean) {
    // Byte code:
    //   0: ldc com/google/android/gms/dynamite/DynamiteModule
    //   2: monitorenter
    //   3: getstatic com/google/android/gms/dynamite/DynamiteModule.a : Ljava/lang/Boolean;
    //   6: astore_3
    //   7: aload_3
    //   8: astore #4
    //   10: aload_3
    //   11: ifnonnull -> 331
    //   14: aload_0
    //   15: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   18: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   21: ldc com/google/android/gms/dynamite/DynamiteModule$DynamiteLoaderClassLoader
    //   23: invokevirtual getName : ()Ljava/lang/String;
    //   26: invokevirtual loadClass : (Ljava/lang/String;)Ljava/lang/Class;
    //   29: ldc_w 'sClassLoader'
    //   32: invokevirtual getDeclaredField : (Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   35: astore #5
    //   37: aload #5
    //   39: invokevirtual getDeclaringClass : ()Ljava/lang/Class;
    //   42: astore_3
    //   43: aload_3
    //   44: monitorenter
    //   45: aload #5
    //   47: aconst_null
    //   48: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   51: checkcast java/lang/ClassLoader
    //   54: astore #4
    //   56: aload #4
    //   58: ifnull -> 90
    //   61: aload #4
    //   63: invokestatic getSystemClassLoader : ()Ljava/lang/ClassLoader;
    //   66: if_acmpne -> 77
    //   69: getstatic java/lang/Boolean.FALSE : Ljava/lang/Boolean;
    //   72: astore #4
    //   74: goto -> 245
    //   77: aload #4
    //   79: invokestatic k : (Ljava/lang/ClassLoader;)V
    //   82: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   85: astore #4
    //   87: goto -> 245
    //   90: ldc_w 'com.google.android.gms'
    //   93: aload_0
    //   94: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   97: invokevirtual getPackageName : ()Ljava/lang/String;
    //   100: invokevirtual equals : (Ljava/lang/Object;)Z
    //   103: ifeq -> 123
    //   106: aload #5
    //   108: aconst_null
    //   109: invokestatic getSystemClassLoader : ()Ljava/lang/ClassLoader;
    //   112: invokevirtual set : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   115: getstatic java/lang/Boolean.FALSE : Ljava/lang/Boolean;
    //   118: astore #4
    //   120: goto -> 245
    //   123: aload_0
    //   124: aload_1
    //   125: iload_2
    //   126: invokestatic n : (Landroid/content/Context;Ljava/lang/String;Z)I
    //   129: istore #6
    //   131: getstatic com/google/android/gms/dynamite/DynamiteModule.d : Ljava/lang/String;
    //   134: astore #4
    //   136: aload #4
    //   138: ifnull -> 221
    //   141: aload #4
    //   143: invokevirtual isEmpty : ()Z
    //   146: ifeq -> 152
    //   149: goto -> 221
    //   152: getstatic android/os/Build$VERSION.SDK_INT : I
    //   155: bipush #29
    //   157: if_icmplt -> 179
    //   160: new dalvik/system/DelegateLastClassLoader
    //   163: astore #4
    //   165: aload #4
    //   167: getstatic com/google/android/gms/dynamite/DynamiteModule.d : Ljava/lang/String;
    //   170: invokestatic getSystemClassLoader : ()Ljava/lang/ClassLoader;
    //   173: invokespecial <init> : (Ljava/lang/String;Ljava/lang/ClassLoader;)V
    //   176: goto -> 194
    //   179: new com/google/android/gms/dynamite/i
    //   182: dup
    //   183: getstatic com/google/android/gms/dynamite/DynamiteModule.d : Ljava/lang/String;
    //   186: invokestatic getSystemClassLoader : ()Ljava/lang/ClassLoader;
    //   189: invokespecial <init> : (Ljava/lang/String;Ljava/lang/ClassLoader;)V
    //   192: astore #4
    //   194: aload #4
    //   196: invokestatic k : (Ljava/lang/ClassLoader;)V
    //   199: aload #5
    //   201: aconst_null
    //   202: aload #4
    //   204: invokevirtual set : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   207: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   210: putstatic com/google/android/gms/dynamite/DynamiteModule.a : Ljava/lang/Boolean;
    //   213: aload_3
    //   214: monitorexit
    //   215: ldc com/google/android/gms/dynamite/DynamiteModule
    //   217: monitorexit
    //   218: iload #6
    //   220: ireturn
    //   221: aload_3
    //   222: monitorexit
    //   223: ldc com/google/android/gms/dynamite/DynamiteModule
    //   225: monitorexit
    //   226: iload #6
    //   228: ireturn
    //   229: astore #4
    //   231: aload #5
    //   233: aconst_null
    //   234: invokestatic getSystemClassLoader : ()Ljava/lang/ClassLoader;
    //   237: invokevirtual set : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   240: getstatic java/lang/Boolean.FALSE : Ljava/lang/Boolean;
    //   243: astore #4
    //   245: aload_3
    //   246: monitorexit
    //   247: goto -> 326
    //   250: astore #4
    //   252: aload_3
    //   253: monitorexit
    //   254: aload #4
    //   256: athrow
    //   257: astore #4
    //   259: goto -> 269
    //   262: astore #4
    //   264: goto -> 269
    //   267: astore #4
    //   269: aload #4
    //   271: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   274: astore #4
    //   276: aload #4
    //   278: invokevirtual length : ()I
    //   281: istore #6
    //   283: new java/lang/StringBuilder
    //   286: astore_3
    //   287: aload_3
    //   288: iload #6
    //   290: bipush #30
    //   292: iadd
    //   293: invokespecial <init> : (I)V
    //   296: aload_3
    //   297: ldc_w 'Failed to load module via V2: '
    //   300: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   303: pop
    //   304: aload_3
    //   305: aload #4
    //   307: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   310: pop
    //   311: ldc 'DynamiteModule'
    //   313: aload_3
    //   314: invokevirtual toString : ()Ljava/lang/String;
    //   317: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   320: pop
    //   321: getstatic java/lang/Boolean.FALSE : Ljava/lang/Boolean;
    //   324: astore #4
    //   326: aload #4
    //   328: putstatic com/google/android/gms/dynamite/DynamiteModule.a : Ljava/lang/Boolean;
    //   331: ldc com/google/android/gms/dynamite/DynamiteModule
    //   333: monitorexit
    //   334: aload #4
    //   336: invokevirtual booleanValue : ()Z
    //   339: istore #7
    //   341: iload #7
    //   343: ifeq -> 404
    //   346: aload_0
    //   347: aload_1
    //   348: iload_2
    //   349: invokestatic n : (Landroid/content/Context;Ljava/lang/String;Z)I
    //   352: istore #6
    //   354: iload #6
    //   356: ireturn
    //   357: astore_1
    //   358: aload_1
    //   359: invokevirtual getMessage : ()Ljava/lang/String;
    //   362: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   365: astore_1
    //   366: aload_1
    //   367: invokevirtual length : ()I
    //   370: ifeq -> 384
    //   373: ldc_w 'Failed to retrieve remote module version: '
    //   376: aload_1
    //   377: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   380: astore_1
    //   381: goto -> 395
    //   384: new java/lang/String
    //   387: dup
    //   388: ldc_w 'Failed to retrieve remote module version: '
    //   391: invokespecial <init> : (Ljava/lang/String;)V
    //   394: astore_1
    //   395: ldc 'DynamiteModule'
    //   397: aload_1
    //   398: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   401: pop
    //   402: iconst_0
    //   403: ireturn
    //   404: aload_0
    //   405: aload_1
    //   406: iload_2
    //   407: invokestatic l : (Landroid/content/Context;Ljava/lang/String;Z)I
    //   410: istore #6
    //   412: iload #6
    //   414: ireturn
    //   415: astore_1
    //   416: ldc com/google/android/gms/dynamite/DynamiteModule
    //   418: monitorexit
    //   419: aload_1
    //   420: athrow
    //   421: astore_1
    //   422: aload_0
    //   423: aload_1
    //   424: invokestatic a : (Landroid/content/Context;Ljava/lang/Throwable;)Z
    //   427: pop
    //   428: aload_1
    //   429: athrow
    //   430: astore #4
    //   432: goto -> 82
    // Exception table:
    //   from	to	target	type
    //   0	3	421	finally
    //   3	7	415	finally
    //   14	45	267	java/lang/ClassNotFoundException
    //   14	45	262	java/lang/IllegalAccessException
    //   14	45	257	java/lang/NoSuchFieldException
    //   14	45	415	finally
    //   45	56	250	finally
    //   61	74	250	finally
    //   77	82	430	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   77	82	250	finally
    //   82	87	250	finally
    //   90	120	250	finally
    //   123	136	229	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   123	136	250	finally
    //   141	149	229	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   141	149	250	finally
    //   152	176	229	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   152	176	250	finally
    //   179	194	229	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   179	194	250	finally
    //   194	213	229	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   194	213	250	finally
    //   213	215	250	finally
    //   215	218	415	finally
    //   221	223	250	finally
    //   223	226	415	finally
    //   231	245	250	finally
    //   245	247	250	finally
    //   252	254	250	finally
    //   254	257	267	java/lang/ClassNotFoundException
    //   254	257	262	java/lang/IllegalAccessException
    //   254	257	257	java/lang/NoSuchFieldException
    //   254	257	415	finally
    //   269	326	415	finally
    //   326	331	415	finally
    //   331	334	415	finally
    //   334	341	421	finally
    //   346	354	357	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   346	354	421	finally
    //   358	381	421	finally
    //   384	395	421	finally
    //   395	402	421	finally
    //   404	412	421	finally
    //   416	419	415	finally
    //   419	421	421	finally
  }
  
  private static DynamiteModule g(Context paramContext, String paramString) {
    paramString = String.valueOf(paramString);
    if (paramString.length() != 0) {
      paramString = "Selected local version of ".concat(paramString);
    } else {
      paramString = new String("Selected local version of ");
    } 
    Log.i("DynamiteModule", paramString);
    return new DynamiteModule(paramContext.getApplicationContext());
  }
  
  private static DynamiteModule h(Context paramContext, String paramString, int paramInt) {
    // Byte code:
    //   0: ldc com/google/android/gms/dynamite/DynamiteModule
    //   2: monitorenter
    //   3: getstatic com/google/android/gms/dynamite/DynamiteModule.a : Ljava/lang/Boolean;
    //   6: astore_3
    //   7: ldc com/google/android/gms/dynamite/DynamiteModule
    //   9: monitorexit
    //   10: aload_3
    //   11: ifnull -> 195
    //   14: aload_3
    //   15: invokevirtual booleanValue : ()Z
    //   18: ifeq -> 28
    //   21: aload_0
    //   22: aload_1
    //   23: iload_2
    //   24: invokestatic m : (Landroid/content/Context;Ljava/lang/String;I)Lcom/google/android/gms/dynamite/DynamiteModule;
    //   27: areturn
    //   28: aload_1
    //   29: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   32: invokevirtual length : ()I
    //   35: istore #4
    //   37: new java/lang/StringBuilder
    //   40: astore_3
    //   41: aload_3
    //   42: iload #4
    //   44: bipush #51
    //   46: iadd
    //   47: invokespecial <init> : (I)V
    //   50: aload_3
    //   51: ldc_w 'Selected remote version of '
    //   54: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   57: pop
    //   58: aload_3
    //   59: aload_1
    //   60: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   63: pop
    //   64: aload_3
    //   65: ldc_w ', version >= '
    //   68: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   71: pop
    //   72: aload_3
    //   73: iload_2
    //   74: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   77: pop
    //   78: ldc 'DynamiteModule'
    //   80: aload_3
    //   81: invokevirtual toString : ()Ljava/lang/String;
    //   84: invokestatic i : (Ljava/lang/String;Ljava/lang/String;)I
    //   87: pop
    //   88: aload_0
    //   89: invokestatic i : (Landroid/content/Context;)Lcom/google/android/gms/dynamite/k;
    //   92: astore_3
    //   93: aload_3
    //   94: ifnull -> 181
    //   97: aload_3
    //   98: invokeinterface b : ()I
    //   103: iconst_2
    //   104: if_icmplt -> 123
    //   107: aload_3
    //   108: aload_0
    //   109: invokestatic a2 : (Ljava/lang/Object;)Lcom/google/android/gms/dynamic/a;
    //   112: aload_1
    //   113: iload_2
    //   114: invokeinterface r7 : (Lcom/google/android/gms/dynamic/a;Ljava/lang/String;I)Lcom/google/android/gms/dynamic/a;
    //   119: astore_1
    //   120: goto -> 145
    //   123: ldc 'DynamiteModule'
    //   125: ldc_w 'Dynamite loader version < 2, falling back to createModuleContext'
    //   128: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   131: pop
    //   132: aload_3
    //   133: aload_0
    //   134: invokestatic a2 : (Ljava/lang/Object;)Lcom/google/android/gms/dynamic/a;
    //   137: aload_1
    //   138: iload_2
    //   139: invokeinterface J3 : (Lcom/google/android/gms/dynamic/a;Ljava/lang/String;I)Lcom/google/android/gms/dynamic/a;
    //   144: astore_1
    //   145: aload_1
    //   146: invokestatic o1 : (Lcom/google/android/gms/dynamic/a;)Ljava/lang/Object;
    //   149: ifnull -> 167
    //   152: new com/google/android/gms/dynamite/DynamiteModule
    //   155: dup
    //   156: aload_1
    //   157: invokestatic o1 : (Lcom/google/android/gms/dynamic/a;)Ljava/lang/Object;
    //   160: checkcast android/content/Context
    //   163: invokespecial <init> : (Landroid/content/Context;)V
    //   166: areturn
    //   167: new com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   170: astore_1
    //   171: aload_1
    //   172: ldc_w 'Failed to load remote module.'
    //   175: aconst_null
    //   176: invokespecial <init> : (Ljava/lang/String;Lcom/google/android/gms/dynamite/b;)V
    //   179: aload_1
    //   180: athrow
    //   181: new com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   184: astore_1
    //   185: aload_1
    //   186: ldc_w 'Failed to create IDynamiteLoader.'
    //   189: aconst_null
    //   190: invokespecial <init> : (Ljava/lang/String;Lcom/google/android/gms/dynamite/b;)V
    //   193: aload_1
    //   194: athrow
    //   195: new com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   198: astore_1
    //   199: aload_1
    //   200: ldc_w 'Failed to determine which loading route to use.'
    //   203: aconst_null
    //   204: invokespecial <init> : (Ljava/lang/String;Lcom/google/android/gms/dynamite/b;)V
    //   207: aload_1
    //   208: athrow
    //   209: astore_1
    //   210: ldc com/google/android/gms/dynamite/DynamiteModule
    //   212: monitorexit
    //   213: aload_1
    //   214: athrow
    //   215: astore_1
    //   216: aload_0
    //   217: aload_1
    //   218: invokestatic a : (Landroid/content/Context;Ljava/lang/Throwable;)Z
    //   221: pop
    //   222: new com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   225: dup
    //   226: ldc_w 'Failed to load remote module.'
    //   229: aload_1
    //   230: aconst_null
    //   231: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;Lcom/google/android/gms/dynamite/b;)V
    //   234: athrow
    //   235: astore_0
    //   236: aload_0
    //   237: athrow
    //   238: astore_0
    //   239: new com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   242: dup
    //   243: ldc_w 'Failed to load remote module.'
    //   246: aload_0
    //   247: aconst_null
    //   248: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;Lcom/google/android/gms/dynamite/b;)V
    //   251: athrow
    // Exception table:
    //   from	to	target	type
    //   0	3	238	android/os/RemoteException
    //   0	3	235	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   0	3	215	finally
    //   3	10	209	finally
    //   14	28	238	android/os/RemoteException
    //   14	28	235	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   14	28	215	finally
    //   28	93	238	android/os/RemoteException
    //   28	93	235	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   28	93	215	finally
    //   97	120	238	android/os/RemoteException
    //   97	120	235	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   97	120	215	finally
    //   123	145	238	android/os/RemoteException
    //   123	145	235	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   123	145	215	finally
    //   145	167	238	android/os/RemoteException
    //   145	167	235	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   145	167	215	finally
    //   167	181	238	android/os/RemoteException
    //   167	181	235	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   167	181	215	finally
    //   181	195	238	android/os/RemoteException
    //   181	195	235	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   181	195	215	finally
    //   195	209	238	android/os/RemoteException
    //   195	209	235	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   195	209	215	finally
    //   210	213	209	finally
    //   213	215	238	android/os/RemoteException
    //   213	215	235	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   213	215	215	finally
  }
  
  private static k i(Context paramContext) {
    // Byte code:
    //   0: ldc com/google/android/gms/dynamite/DynamiteModule
    //   2: monitorenter
    //   3: getstatic com/google/android/gms/dynamite/DynamiteModule.b : Lcom/google/android/gms/dynamite/k;
    //   6: astore_1
    //   7: aload_1
    //   8: ifnull -> 16
    //   11: ldc com/google/android/gms/dynamite/DynamiteModule
    //   13: monitorexit
    //   14: aload_1
    //   15: areturn
    //   16: aload_0
    //   17: ldc_w 'com.google.android.gms'
    //   20: iconst_3
    //   21: invokevirtual createPackageContext : (Ljava/lang/String;I)Landroid/content/Context;
    //   24: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   27: ldc_w 'com.google.android.gms.chimera.container.DynamiteLoaderImpl'
    //   30: invokevirtual loadClass : (Ljava/lang/String;)Ljava/lang/Class;
    //   33: invokevirtual newInstance : ()Ljava/lang/Object;
    //   36: checkcast android/os/IBinder
    //   39: astore_1
    //   40: aload_1
    //   41: ifnonnull -> 49
    //   44: aconst_null
    //   45: astore_0
    //   46: goto -> 83
    //   49: aload_1
    //   50: ldc_w 'com.google.android.gms.dynamite.IDynamiteLoader'
    //   53: invokeinterface queryLocalInterface : (Ljava/lang/String;)Landroid/os/IInterface;
    //   58: astore_0
    //   59: aload_0
    //   60: instanceof com/google/android/gms/dynamite/k
    //   63: ifeq -> 74
    //   66: aload_0
    //   67: checkcast com/google/android/gms/dynamite/k
    //   70: astore_0
    //   71: goto -> 83
    //   74: new com/google/android/gms/dynamite/j
    //   77: dup
    //   78: aload_1
    //   79: invokespecial <init> : (Landroid/os/IBinder;)V
    //   82: astore_0
    //   83: aload_0
    //   84: ifnull -> 141
    //   87: aload_0
    //   88: putstatic com/google/android/gms/dynamite/DynamiteModule.b : Lcom/google/android/gms/dynamite/k;
    //   91: ldc com/google/android/gms/dynamite/DynamiteModule
    //   93: monitorexit
    //   94: aload_0
    //   95: areturn
    //   96: astore_0
    //   97: aload_0
    //   98: invokevirtual getMessage : ()Ljava/lang/String;
    //   101: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   104: astore_0
    //   105: aload_0
    //   106: invokevirtual length : ()I
    //   109: ifeq -> 123
    //   112: ldc_w 'Failed to load IDynamiteLoader from GmsCore: '
    //   115: aload_0
    //   116: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   119: astore_0
    //   120: goto -> 134
    //   123: new java/lang/String
    //   126: dup
    //   127: ldc_w 'Failed to load IDynamiteLoader from GmsCore: '
    //   130: invokespecial <init> : (Ljava/lang/String;)V
    //   133: astore_0
    //   134: ldc 'DynamiteModule'
    //   136: aload_0
    //   137: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)I
    //   140: pop
    //   141: ldc com/google/android/gms/dynamite/DynamiteModule
    //   143: monitorexit
    //   144: aconst_null
    //   145: areturn
    //   146: astore_0
    //   147: ldc com/google/android/gms/dynamite/DynamiteModule
    //   149: monitorexit
    //   150: aload_0
    //   151: athrow
    // Exception table:
    //   from	to	target	type
    //   3	7	146	finally
    //   11	14	146	finally
    //   16	40	96	java/lang/Exception
    //   16	40	146	finally
    //   49	71	96	java/lang/Exception
    //   49	71	146	finally
    //   74	83	96	java/lang/Exception
    //   74	83	146	finally
    //   87	91	96	java/lang/Exception
    //   87	91	146	finally
    //   91	94	146	finally
    //   97	120	146	finally
    //   123	134	146	finally
    //   134	141	146	finally
    //   141	144	146	finally
    //   147	150	146	finally
  }
  
  private static Boolean j() {
    // Byte code:
    //   0: ldc com/google/android/gms/dynamite/DynamiteModule
    //   2: monitorenter
    //   3: getstatic com/google/android/gms/dynamite/DynamiteModule.e : I
    //   6: iconst_2
    //   7: if_icmplt -> 15
    //   10: iconst_1
    //   11: istore_0
    //   12: goto -> 17
    //   15: iconst_0
    //   16: istore_0
    //   17: ldc com/google/android/gms/dynamite/DynamiteModule
    //   19: monitorexit
    //   20: iload_0
    //   21: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   24: areturn
    //   25: astore_1
    //   26: ldc com/google/android/gms/dynamite/DynamiteModule
    //   28: monitorexit
    //   29: aload_1
    //   30: athrow
    // Exception table:
    //   from	to	target	type
    //   3	10	25	finally
    //   17	25	25	finally
    //   26	29	25	finally
  }
  
  private static void k(ClassLoader paramClassLoader) {
    try {
      m m1;
      IBinder iBinder = paramClassLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
      if (iBinder == null) {
        iBinder = null;
      } else {
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
        if (iInterface instanceof m) {
          m1 = (m)iInterface;
        } else {
          m1 = new l((IBinder)m1);
        } 
      } 
      c = m1;
      return;
    } catch (ClassNotFoundException classNotFoundException) {
    
    } catch (IllegalAccessException illegalAccessException) {
    
    } catch (InstantiationException instantiationException) {
    
    } catch (InvocationTargetException invocationTargetException) {
    
    } catch (NoSuchMethodException noSuchMethodException) {}
    throw new LoadingException("Failed to instantiate dynamite loader", noSuchMethodException, null);
  }
  
  private static int l(Context paramContext, String paramString, boolean paramBoolean) {
    k k1 = i(paramContext);
    if (k1 == null)
      return 0; 
    try {
      if (k1.b() >= 2)
        return k1.G5(com.google.android.gms.dynamic.b.a2(paramContext), paramString, paramBoolean); 
      Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
      return k1.X6(com.google.android.gms.dynamic.b.a2(paramContext), paramString, paramBoolean);
    } catch (RemoteException remoteException) {
      String str = String.valueOf(remoteException.getMessage());
      if (str.length() != 0) {
        str = "Failed to retrieve remote module version: ".concat(str);
      } else {
        str = new String("Failed to retrieve remote module version: ");
      } 
      Log.w("DynamiteModule", str);
      return 0;
    } 
  }
  
  private static DynamiteModule m(Context paramContext, String paramString, int paramInt) {
    // Byte code:
    //   0: new java/lang/StringBuilder
    //   3: dup
    //   4: aload_1
    //   5: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   8: invokevirtual length : ()I
    //   11: bipush #51
    //   13: iadd
    //   14: invokespecial <init> : (I)V
    //   17: astore_3
    //   18: aload_3
    //   19: ldc_w 'Selected remote version of '
    //   22: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   25: pop
    //   26: aload_3
    //   27: aload_1
    //   28: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   31: pop
    //   32: aload_3
    //   33: ldc_w ', version >= '
    //   36: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   39: pop
    //   40: aload_3
    //   41: iload_2
    //   42: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   45: pop
    //   46: ldc 'DynamiteModule'
    //   48: aload_3
    //   49: invokevirtual toString : ()Ljava/lang/String;
    //   52: invokestatic i : (Ljava/lang/String;Ljava/lang/String;)I
    //   55: pop
    //   56: ldc com/google/android/gms/dynamite/DynamiteModule
    //   58: monitorenter
    //   59: getstatic com/google/android/gms/dynamite/DynamiteModule.c : Lcom/google/android/gms/dynamite/m;
    //   62: astore_3
    //   63: ldc com/google/android/gms/dynamite/DynamiteModule
    //   65: monitorexit
    //   66: aload_3
    //   67: ifnull -> 222
    //   70: getstatic com/google/android/gms/dynamite/DynamiteModule.f : Ljava/lang/ThreadLocal;
    //   73: invokevirtual get : ()Ljava/lang/Object;
    //   76: checkcast com/google/android/gms/dynamite/DynamiteModule$b
    //   79: astore #4
    //   81: aload #4
    //   83: ifnull -> 210
    //   86: aload #4
    //   88: getfield a : Landroid/database/Cursor;
    //   91: ifnull -> 210
    //   94: aload_0
    //   95: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   98: astore_0
    //   99: aload #4
    //   101: getfield a : Landroid/database/Cursor;
    //   104: astore #4
    //   106: aconst_null
    //   107: invokestatic a2 : (Ljava/lang/Object;)Lcom/google/android/gms/dynamic/a;
    //   110: pop
    //   111: invokestatic j : ()Ljava/lang/Boolean;
    //   114: invokevirtual booleanValue : ()Z
    //   117: ifeq -> 150
    //   120: ldc 'DynamiteModule'
    //   122: ldc_w 'Dynamite loader version >= 2, using loadModule2NoCrashUtils'
    //   125: invokestatic v : (Ljava/lang/String;Ljava/lang/String;)I
    //   128: pop
    //   129: aload_3
    //   130: aload_0
    //   131: invokestatic a2 : (Ljava/lang/Object;)Lcom/google/android/gms/dynamic/a;
    //   134: aload_1
    //   135: iload_2
    //   136: aload #4
    //   138: invokestatic a2 : (Ljava/lang/Object;)Lcom/google/android/gms/dynamic/a;
    //   141: invokeinterface o2 : (Lcom/google/android/gms/dynamic/a;Ljava/lang/String;ILcom/google/android/gms/dynamic/a;)Lcom/google/android/gms/dynamic/a;
    //   146: astore_0
    //   147: goto -> 177
    //   150: ldc 'DynamiteModule'
    //   152: ldc_w 'Dynamite loader version < 2, falling back to loadModule2'
    //   155: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   158: pop
    //   159: aload_3
    //   160: aload_0
    //   161: invokestatic a2 : (Ljava/lang/Object;)Lcom/google/android/gms/dynamic/a;
    //   164: aload_1
    //   165: iload_2
    //   166: aload #4
    //   168: invokestatic a2 : (Ljava/lang/Object;)Lcom/google/android/gms/dynamic/a;
    //   171: invokeinterface m2 : (Lcom/google/android/gms/dynamic/a;Ljava/lang/String;ILcom/google/android/gms/dynamic/a;)Lcom/google/android/gms/dynamic/a;
    //   176: astore_0
    //   177: aload_0
    //   178: invokestatic o1 : (Lcom/google/android/gms/dynamic/a;)Ljava/lang/Object;
    //   181: checkcast android/content/Context
    //   184: astore_0
    //   185: aload_0
    //   186: ifnull -> 198
    //   189: new com/google/android/gms/dynamite/DynamiteModule
    //   192: dup
    //   193: aload_0
    //   194: invokespecial <init> : (Landroid/content/Context;)V
    //   197: areturn
    //   198: new com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   201: dup
    //   202: ldc_w 'Failed to get module context'
    //   205: aconst_null
    //   206: invokespecial <init> : (Ljava/lang/String;Lcom/google/android/gms/dynamite/b;)V
    //   209: athrow
    //   210: new com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   213: dup
    //   214: ldc_w 'No result cursor'
    //   217: aconst_null
    //   218: invokespecial <init> : (Ljava/lang/String;Lcom/google/android/gms/dynamite/b;)V
    //   221: athrow
    //   222: new com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   225: dup
    //   226: ldc_w 'DynamiteLoaderV2 was not cached.'
    //   229: aconst_null
    //   230: invokespecial <init> : (Ljava/lang/String;Lcom/google/android/gms/dynamite/b;)V
    //   233: athrow
    //   234: astore_0
    //   235: ldc com/google/android/gms/dynamite/DynamiteModule
    //   237: monitorexit
    //   238: aload_0
    //   239: athrow
    // Exception table:
    //   from	to	target	type
    //   59	66	234	finally
    //   235	238	234	finally
  }
  
  private static int n(Context paramContext, String paramString, boolean paramBoolean) {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aconst_null
    //   3: astore #4
    //   5: aload_0
    //   6: invokevirtual getContentResolver : ()Landroid/content/ContentResolver;
    //   9: astore #5
    //   11: iload_2
    //   12: ifeq -> 22
    //   15: ldc_w 'api_force_staging'
    //   18: astore_0
    //   19: goto -> 26
    //   22: ldc_w 'api'
    //   25: astore_0
    //   26: aload_0
    //   27: invokevirtual length : ()I
    //   30: istore #6
    //   32: aload_1
    //   33: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   36: invokevirtual length : ()I
    //   39: istore #7
    //   41: new java/lang/StringBuilder
    //   44: astore #8
    //   46: aload #8
    //   48: iload #6
    //   50: bipush #42
    //   52: iadd
    //   53: iload #7
    //   55: iadd
    //   56: invokespecial <init> : (I)V
    //   59: aload #8
    //   61: ldc_w 'content://com.google.android.gms.chimera/'
    //   64: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   67: pop
    //   68: aload #8
    //   70: aload_0
    //   71: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   74: pop
    //   75: aload #8
    //   77: ldc_w '/'
    //   80: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   83: pop
    //   84: aload #8
    //   86: aload_1
    //   87: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   90: pop
    //   91: aload #5
    //   93: aload #8
    //   95: invokevirtual toString : ()Ljava/lang/String;
    //   98: invokestatic parse : (Ljava/lang/String;)Landroid/net/Uri;
    //   101: aconst_null
    //   102: aconst_null
    //   103: aconst_null
    //   104: aconst_null
    //   105: invokevirtual query : (Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   108: astore_0
    //   109: aload_0
    //   110: ifnull -> 230
    //   113: aload_0
    //   114: invokeinterface moveToFirst : ()Z
    //   119: ifeq -> 230
    //   122: aload_0
    //   123: iconst_0
    //   124: invokeinterface getInt : (I)I
    //   129: istore #7
    //   131: iload #7
    //   133: ifle -> 217
    //   136: ldc com/google/android/gms/dynamite/DynamiteModule
    //   138: monitorenter
    //   139: aload_0
    //   140: iconst_2
    //   141: invokeinterface getString : (I)Ljava/lang/String;
    //   146: putstatic com/google/android/gms/dynamite/DynamiteModule.d : Ljava/lang/String;
    //   149: aload_0
    //   150: ldc_w 'loaderVersion'
    //   153: invokeinterface getColumnIndex : (Ljava/lang/String;)I
    //   158: istore #6
    //   160: iload #6
    //   162: iflt -> 176
    //   165: aload_0
    //   166: iload #6
    //   168: invokeinterface getInt : (I)I
    //   173: putstatic com/google/android/gms/dynamite/DynamiteModule.e : I
    //   176: ldc com/google/android/gms/dynamite/DynamiteModule
    //   178: monitorexit
    //   179: getstatic com/google/android/gms/dynamite/DynamiteModule.f : Ljava/lang/ThreadLocal;
    //   182: invokevirtual get : ()Ljava/lang/Object;
    //   185: checkcast com/google/android/gms/dynamite/DynamiteModule$b
    //   188: astore_1
    //   189: aload_1
    //   190: ifnull -> 217
    //   193: aload_1
    //   194: getfield a : Landroid/database/Cursor;
    //   197: ifnonnull -> 217
    //   200: aload_1
    //   201: aload_0
    //   202: putfield a : Landroid/database/Cursor;
    //   205: aload #4
    //   207: astore_0
    //   208: goto -> 217
    //   211: astore_1
    //   212: ldc com/google/android/gms/dynamite/DynamiteModule
    //   214: monitorexit
    //   215: aload_1
    //   216: athrow
    //   217: aload_0
    //   218: ifnull -> 227
    //   221: aload_0
    //   222: invokeinterface close : ()V
    //   227: iload #7
    //   229: ireturn
    //   230: ldc 'DynamiteModule'
    //   232: ldc_w 'Failed to retrieve remote module version.'
    //   235: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   238: pop
    //   239: new com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   242: astore_1
    //   243: aload_1
    //   244: ldc_w 'Failed to connect to dynamite module ContentResolver.'
    //   247: aconst_null
    //   248: invokespecial <init> : (Ljava/lang/String;Lcom/google/android/gms/dynamite/b;)V
    //   251: aload_1
    //   252: athrow
    //   253: astore_1
    //   254: goto -> 295
    //   257: astore_1
    //   258: goto -> 270
    //   261: astore_1
    //   262: aload_3
    //   263: astore_0
    //   264: goto -> 295
    //   267: astore_1
    //   268: aconst_null
    //   269: astore_0
    //   270: aload_1
    //   271: instanceof com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   274: ifeq -> 279
    //   277: aload_1
    //   278: athrow
    //   279: new com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   282: astore_3
    //   283: aload_3
    //   284: ldc_w 'V2 version check failed'
    //   287: aload_1
    //   288: aconst_null
    //   289: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;Lcom/google/android/gms/dynamite/b;)V
    //   292: aload_3
    //   293: athrow
    //   294: astore_1
    //   295: aload_0
    //   296: ifnull -> 305
    //   299: aload_0
    //   300: invokeinterface close : ()V
    //   305: aload_1
    //   306: athrow
    // Exception table:
    //   from	to	target	type
    //   5	11	267	java/lang/Exception
    //   5	11	261	finally
    //   26	109	267	java/lang/Exception
    //   26	109	261	finally
    //   113	131	257	java/lang/Exception
    //   113	131	253	finally
    //   136	139	257	java/lang/Exception
    //   136	139	253	finally
    //   139	160	211	finally
    //   165	176	211	finally
    //   176	179	211	finally
    //   179	189	257	java/lang/Exception
    //   179	189	253	finally
    //   193	205	257	java/lang/Exception
    //   193	205	253	finally
    //   212	215	211	finally
    //   215	217	257	java/lang/Exception
    //   215	217	253	finally
    //   230	253	257	java/lang/Exception
    //   230	253	253	finally
    //   270	279	294	finally
    //   279	294	294	finally
  }
  
  public final Context b() {
    return this.o;
  }
  
  public final IBinder d(String paramString) {
    try {
      return (IBinder)this.o.getClassLoader().loadClass(paramString).newInstance();
    } catch (ClassNotFoundException classNotFoundException) {
    
    } catch (InstantiationException instantiationException) {
    
    } catch (IllegalAccessException illegalAccessException) {}
    paramString = String.valueOf(paramString);
    if (paramString.length() != 0) {
      paramString = "Failed to instantiate module class: ".concat(paramString);
    } else {
      paramString = new String("Failed to instantiate module class: ");
    } 
    throw new LoadingException(paramString, illegalAccessException, null);
  }
  
  @DynamiteApi
  public static class DynamiteLoaderClassLoader {
    public static ClassLoader sClassLoader;
  }
  
  public static class LoadingException extends Exception {
    private LoadingException(String param1String) {
      super(param1String);
    }
    
    private LoadingException(String param1String, Throwable param1Throwable) {
      super(param1String, param1Throwable);
    }
  }
  
  public static interface a {
    a a(Context param1Context, String param1String, b param1b);
    
    public static final class a {
      public int a = 0;
      
      public int b = 0;
      
      public int c = 0;
    }
    
    public static interface b {
      int a(Context param2Context, String param2String, boolean param2Boolean);
      
      int b(Context param2Context, String param2String);
    }
  }
  
  public static final class a {
    public int a = 0;
    
    public int b = 0;
    
    public int c = 0;
  }
  
  public static interface b {
    int a(Context param1Context, String param1String, boolean param1Boolean);
    
    int b(Context param1Context, String param1String);
  }
  
  private static final class b {
    public Cursor a;
    
    private b() {}
  }
  
  private static final class c implements a.b {
    private final int a;
    
    private final int b;
    
    public c(int param1Int1, int param1Int2) {
      this.a = param1Int1;
      this.b = 0;
    }
    
    public final int a(Context param1Context, String param1String, boolean param1Boolean) {
      return 0;
    }
    
    public final int b(Context param1Context, String param1String) {
      return this.a;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/dynamite/DynamiteModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */