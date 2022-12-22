package com.google.android.play.core.internal;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

final class x implements s {
  x() {}
  
  x(byte[] paramArrayOfbyte) {}
  
  x(char[] paramArrayOfchar) {}
  
  x(float[] paramArrayOffloat) {}
  
  x(int[] paramArrayOfint) {}
  
  x(short[] paramArrayOfshort) {}
  
  x(boolean[] paramArrayOfboolean) {}
  
  x(byte[][] paramArrayOfbyte) {}
  
  static void c(ClassLoader paramClassLoader, Set<File> paramSet) {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface isEmpty : ()Z
    //   6: ifeq -> 10
    //   9: return
    //   10: new java/util/HashSet
    //   13: dup
    //   14: invokespecial <init> : ()V
    //   17: astore_2
    //   18: aload_1
    //   19: invokeinterface iterator : ()Ljava/util/Iterator;
    //   24: astore_3
    //   25: aload_3
    //   26: invokeinterface hasNext : ()Z
    //   31: ifeq -> 106
    //   34: aload_3
    //   35: invokeinterface next : ()Ljava/lang/Object;
    //   40: checkcast java/io/File
    //   43: astore #4
    //   45: aload #4
    //   47: invokevirtual getParentFile : ()Ljava/io/File;
    //   50: invokevirtual getAbsolutePath : ()Ljava/lang/String;
    //   53: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   56: astore_1
    //   57: aload_1
    //   58: invokevirtual length : ()I
    //   61: ifeq -> 74
    //   64: ldc 'Adding native library parent directory: '
    //   66: aload_1
    //   67: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   70: astore_1
    //   71: goto -> 84
    //   74: new java/lang/String
    //   77: dup
    //   78: ldc 'Adding native library parent directory: '
    //   80: invokespecial <init> : (Ljava/lang/String;)V
    //   83: astore_1
    //   84: ldc 'Splitcompat'
    //   86: aload_1
    //   87: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   90: pop
    //   91: aload_2
    //   92: aload #4
    //   94: invokevirtual getParentFile : ()Ljava/io/File;
    //   97: invokeinterface add : (Ljava/lang/Object;)Z
    //   102: pop
    //   103: goto -> 25
    //   106: aload_0
    //   107: invokestatic e : (Ljava/lang/ClassLoader;)Ljava/lang/Object;
    //   110: ldc 'nativeLibraryDirectories'
    //   112: ldc java/io/File
    //   114: invokestatic e : (Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Class;)Lcom/google/android/play/core/internal/c0;
    //   117: astore_1
    //   118: aload_2
    //   119: aload_1
    //   120: invokevirtual a : ()Ljava/lang/Object;
    //   123: checkcast [Ljava/io/File;
    //   126: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   129: invokeinterface removeAll : (Ljava/util/Collection;)Z
    //   134: pop
    //   135: ldc com/google/android/play/core/splitinstall/g
    //   137: monitorenter
    //   138: aload_2
    //   139: invokeinterface size : ()I
    //   144: istore #5
    //   146: new java/lang/StringBuilder
    //   149: astore_0
    //   150: aload_0
    //   151: bipush #30
    //   153: invokespecial <init> : (I)V
    //   156: aload_0
    //   157: ldc 'Adding directories '
    //   159: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   162: pop
    //   163: aload_0
    //   164: iload #5
    //   166: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   169: pop
    //   170: ldc 'Splitcompat'
    //   172: aload_0
    //   173: invokevirtual toString : ()Ljava/lang/String;
    //   176: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   179: pop
    //   180: aload_1
    //   181: aload_2
    //   182: invokevirtual e : (Ljava/util/Collection;)V
    //   185: ldc com/google/android/play/core/splitinstall/g
    //   187: monitorexit
    //   188: return
    //   189: astore_0
    //   190: ldc com/google/android/play/core/splitinstall/g
    //   192: monitorexit
    //   193: goto -> 198
    //   196: aload_0
    //   197: athrow
    //   198: goto -> 196
    // Exception table:
    //   from	to	target	type
    //   138	188	189	finally
    //   190	193	189	finally
  }
  
  static boolean d(ClassLoader paramClassLoader, File paramFile1, File paramFile2, boolean paramBoolean, v paramv, String paramString, u paramu) {
    ArrayList<IOException> arrayList = new ArrayList();
    Object object = e(paramClassLoader);
    c0<Object[]> c0 = d0.e(object, "dexElements", Object.class);
    List list = Arrays.asList(c0.a());
    ArrayList<File> arrayList1 = new ArrayList();
    Iterator iterator = list.iterator();
    while (iterator.hasNext())
      arrayList1.add(d0.<File>d(iterator.next(), paramString, File.class).a()); 
    if (arrayList1.contains(paramFile2))
      return true; 
    byte b = 0;
    if (!paramBoolean && !paramu.a(object, paramFile2, paramFile1)) {
      object = String.valueOf(paramFile2.getPath());
      if (object.length() != 0) {
        object = "Should be optimized ".concat((String)object);
      } else {
        object = new String("Should be optimized ");
      } 
      Log.w("SplitCompat", (String)object);
      return false;
    } 
    c0.d(Arrays.asList(paramv.a(object, new ArrayList<File>(Collections.singleton(paramFile2)), paramFile1, arrayList)));
    if (!arrayList.isEmpty()) {
      bf bf = new bf("DexPathList.makeDexElement failed");
      int i = arrayList.size();
      while (b < i) {
        IOException iOException = arrayList.get(b);
        Log.e("SplitCompat", "DexPathList.makeDexElement failed", iOException);
        n0.a(bf, iOException);
        b++;
      } 
      d0.<IOException>e(object, "dexElementsSuppressedExceptions", IOException.class).d(arrayList);
      throw bf;
    } 
    return true;
  }
  
  static Object e(ClassLoader paramClassLoader) {
    return d0.<Object>d(paramClassLoader, "pathList", Object.class).a();
  }
  
  static v f() {
    return new y(null);
  }
  
  static u g() {
    return new b0(null);
  }
  
  public static void h(ClassLoader paramClassLoader, Set<File> paramSet, z paramz) {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface isEmpty : ()Z
    //   6: ifeq -> 10
    //   9: return
    //   10: new java/util/HashSet
    //   13: dup
    //   14: invokespecial <init> : ()V
    //   17: astore_3
    //   18: aload_1
    //   19: invokeinterface iterator : ()Ljava/util/Iterator;
    //   24: astore_1
    //   25: aload_1
    //   26: invokeinterface hasNext : ()Z
    //   31: ifeq -> 56
    //   34: aload_3
    //   35: aload_1
    //   36: invokeinterface next : ()Ljava/lang/Object;
    //   41: checkcast java/io/File
    //   44: invokevirtual getParentFile : ()Ljava/io/File;
    //   47: invokeinterface add : (Ljava/lang/Object;)Z
    //   52: pop
    //   53: goto -> 25
    //   56: aload_0
    //   57: invokestatic e : (Ljava/lang/ClassLoader;)Ljava/lang/Object;
    //   60: astore_0
    //   61: aload_0
    //   62: ldc 'nativeLibraryDirectories'
    //   64: ldc java/util/List
    //   66: invokestatic d : (Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Class;)Lcom/google/android/play/core/internal/c0;
    //   69: astore_1
    //   70: ldc com/google/android/play/core/splitinstall/g
    //   72: monitorenter
    //   73: new java/util/ArrayList
    //   76: astore #4
    //   78: aload #4
    //   80: aload_1
    //   81: invokevirtual a : ()Ljava/lang/Object;
    //   84: checkcast java/util/Collection
    //   87: invokespecial <init> : (Ljava/util/Collection;)V
    //   90: aload_3
    //   91: aload #4
    //   93: invokeinterface removeAll : (Ljava/util/Collection;)Z
    //   98: pop
    //   99: aload #4
    //   101: aload_3
    //   102: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   107: pop
    //   108: aload_1
    //   109: aload #4
    //   111: invokevirtual b : (Ljava/lang/Object;)V
    //   114: ldc com/google/android/play/core/splitinstall/g
    //   116: monitorexit
    //   117: new java/util/ArrayList
    //   120: dup
    //   121: invokespecial <init> : ()V
    //   124: astore_1
    //   125: aload_2
    //   126: aload_0
    //   127: new java/util/ArrayList
    //   130: dup
    //   131: aload_3
    //   132: invokespecial <init> : (Ljava/util/Collection;)V
    //   135: aload_1
    //   136: invokeinterface a : (Ljava/lang/Object;Ljava/util/List;Ljava/util/List;)[Ljava/lang/Object;
    //   141: astore_2
    //   142: aload_1
    //   143: invokeinterface isEmpty : ()Z
    //   148: ifne -> 202
    //   151: new com/google/android/play/core/internal/bf
    //   154: dup
    //   155: ldc 'Error in makePathElements'
    //   157: invokespecial <init> : (Ljava/lang/String;)V
    //   160: astore_0
    //   161: aload_1
    //   162: invokeinterface size : ()I
    //   167: istore #5
    //   169: iconst_0
    //   170: istore #6
    //   172: iload #6
    //   174: iload #5
    //   176: if_icmpge -> 200
    //   179: aload_0
    //   180: aload_1
    //   181: iload #6
    //   183: invokeinterface get : (I)Ljava/lang/Object;
    //   188: checkcast java/io/IOException
    //   191: invokestatic a : (Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    //   194: iinc #6, 1
    //   197: goto -> 172
    //   200: aload_0
    //   201: athrow
    //   202: ldc com/google/android/play/core/splitinstall/g
    //   204: monitorenter
    //   205: aload_0
    //   206: ldc 'nativeLibraryPathElements'
    //   208: ldc java/lang/Object
    //   210: invokestatic e : (Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Class;)Lcom/google/android/play/core/internal/c0;
    //   213: aload_2
    //   214: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   217: invokevirtual e : (Ljava/util/Collection;)V
    //   220: ldc com/google/android/play/core/splitinstall/g
    //   222: monitorexit
    //   223: return
    //   224: astore_0
    //   225: ldc com/google/android/play/core/splitinstall/g
    //   227: monitorexit
    //   228: aload_0
    //   229: athrow
    //   230: astore_0
    //   231: ldc com/google/android/play/core/splitinstall/g
    //   233: monitorexit
    //   234: goto -> 239
    //   237: aload_0
    //   238: athrow
    //   239: goto -> 237
    // Exception table:
    //   from	to	target	type
    //   73	117	230	finally
    //   205	223	224	finally
    //   225	228	224	finally
    //   231	234	230	finally
  }
  
  static v i() {
    return new y();
  }
  
  static z j() {
    return new a0(null);
  }
  
  public static boolean k(ClassLoader paramClassLoader, File paramFile1, File paramFile2, boolean paramBoolean) {
    return d(paramClassLoader, paramFile1, paramFile2, paramBoolean, i(), "zip", g());
  }
  
  static void l(ClassLoader paramClassLoader, Set<File> paramSet) {
    h(paramClassLoader, paramSet, new a0());
  }
  
  static boolean m(ClassLoader paramClassLoader, File paramFile1, File paramFile2, boolean paramBoolean) {
    return d(paramClassLoader, paramFile1, paramFile2, paramBoolean, i(), "path", new b0());
  }
  
  public final boolean a(ClassLoader paramClassLoader, File paramFile1, File paramFile2, boolean paramBoolean) {
    b0 b0;
    switch (this.a) {
      default:
        v = i();
        b0 = new b0(null);
        str = "path";
        return d(paramClassLoader, paramFile1, paramFile2, paramBoolean, v, str, b0);
      case 6:
        return m(paramClassLoader, paramFile1, paramFile2, paramBoolean);
      case 5:
        return m(paramClassLoader, paramFile1, paramFile2, paramBoolean);
      case 4:
        return k(paramClassLoader, paramFile1, paramFile2, paramBoolean);
      case 3:
        return k(paramClassLoader, paramFile1, paramFile2, paramBoolean);
      case 2:
        return k(paramClassLoader, paramFile1, paramFile2, paramBoolean);
      case 0:
      case 1:
        break;
    } 
    v v = f();
    u u = g();
    String str = "zip";
    return d(paramClassLoader, paramFile1, paramFile2, paramBoolean, v, str, u);
  }
  
  public final void b(ClassLoader paramClassLoader, Set<File> paramSet) {
    switch (this.a) {
      default:
        l(paramClassLoader, paramSet);
        return;
      case 6:
        l(paramClassLoader, paramSet);
        return;
      case 5:
        l(paramClassLoader, paramSet);
        return;
      case 2:
      case 3:
      case 4:
        h(paramClassLoader, paramSet, j());
        return;
      case 1:
        c(paramClassLoader, paramSet);
        return;
      case 0:
        break;
    } 
    c(paramClassLoader, paramSet);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/play/core/internal/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */