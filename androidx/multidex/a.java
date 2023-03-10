package androidx.multidex;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.util.Log;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.zip.ZipFile;

public final class a {
  private static final Set<File> a = new HashSet<File>();
  
  private static final boolean b = m(System.getProperty("java.vm.version"));
  
  private static void d(Context paramContext) {
    File file = new File(paramContext.getFilesDir(), "secondary-dexes");
    if (file.isDirectory()) {
      StringBuilder stringBuilder1;
      StringBuilder stringBuilder2 = new StringBuilder();
      stringBuilder2.append("Clearing old secondary dex dir (");
      stringBuilder2.append(file.getPath());
      stringBuilder2.append(").");
      Log.i("MultiDex", stringBuilder2.toString());
      File[] arrayOfFile = file.listFiles();
      if (arrayOfFile == null) {
        stringBuilder1 = new StringBuilder();
        stringBuilder1.append("Failed to list secondary dex dir content (");
        stringBuilder1.append(file.getPath());
        stringBuilder1.append(").");
        Log.w("MultiDex", stringBuilder1.toString());
        return;
      } 
      int i = stringBuilder1.length;
      for (byte b = 0; b < i; b++) {
        StringBuilder stringBuilder3 = stringBuilder1[b];
        StringBuilder stringBuilder4 = new StringBuilder();
        stringBuilder4.append("Trying to delete old file ");
        stringBuilder4.append(stringBuilder3.getPath());
        stringBuilder4.append(" of size ");
        stringBuilder4.append(stringBuilder3.length());
        Log.i("MultiDex", stringBuilder4.toString());
        if (!stringBuilder3.delete()) {
          stringBuilder4 = new StringBuilder();
          stringBuilder4.append("Failed to delete old file ");
          stringBuilder4.append(stringBuilder3.getPath());
          Log.w("MultiDex", stringBuilder4.toString());
        } else {
          stringBuilder4 = new StringBuilder();
          stringBuilder4.append("Deleted old file ");
          stringBuilder4.append(stringBuilder3.getPath());
          Log.i("MultiDex", stringBuilder4.toString());
        } 
      } 
      if (!file.delete()) {
        stringBuilder1 = new StringBuilder();
        stringBuilder1.append("Failed to delete secondary dex dir ");
        stringBuilder1.append(file.getPath());
        Log.w("MultiDex", stringBuilder1.toString());
      } else {
        stringBuilder1 = new StringBuilder();
        stringBuilder1.append("Deleted old secondary dex dir ");
        stringBuilder1.append(file.getPath());
        Log.i("MultiDex", stringBuilder1.toString());
      } 
    } 
  }
  
  private static void e(Context paramContext, File paramFile1, File paramFile2, String paramString1, String paramString2, boolean paramBoolean) {
    synchronized (a) {
      if (null.contains(paramFile1))
        return; 
      null.add(paramFile1);
      int i = Build.VERSION.SDK_INT;
      if (i > 20) {
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append("MultiDex is not guaranteed to work in SDK version ");
        stringBuilder.append(i);
        stringBuilder.append(": SDK version higher than ");
        stringBuilder.append(20);
        stringBuilder.append(" should be backed by ");
        stringBuilder.append("runtime with built-in multidex capabilty but it's not the ");
        stringBuilder.append("case here: java.vm.version=\"");
        stringBuilder.append(System.getProperty("java.vm.version"));
        stringBuilder.append("\"");
        Log.w("MultiDex", stringBuilder.toString());
      } 
      try {
        File file;
        ClassLoader classLoader = paramContext.getClassLoader();
        if (classLoader == null) {
          Log.e("MultiDex", "Context class loader is null. Must be running in test mode. Skip patching.");
          return;
        } 
        try {
          d(paramContext);
        } finally {
          Exception exception = null;
        } 
        MultiDexExtractor multiDexExtractor = new MultiDexExtractor();
        this(paramFile1, file);
        paramFile1 = null;
        try {
          List<? extends File> list = multiDexExtractor.l(paramContext, paramString2, false);
          try {
            l(classLoader, file, list);
          } catch (IOException iOException1) {
            if (paramBoolean) {
              Log.w("MultiDex", "Failed to install extracted secondary dex files, retrying with forced extraction", iOException1);
              l(classLoader, file, multiDexExtractor.l(paramContext, paramString2, true));
            } else {
              throw iOException1;
            } 
          } 
          try {
            multiDexExtractor.close();
            File file1 = paramFile1;
          } catch (IOException iOException) {}
          if (iOException == null)
            return; 
          throw iOException;
        } finally {
          try {
            multiDexExtractor.close();
          } catch (IOException iOException) {}
        } 
      } catch (RuntimeException runtimeException) {
        Log.w("MultiDex", "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching.", runtimeException);
        return;
      } 
    } 
  }
  
  private static void f(Object paramObject, String paramString, Object[] paramArrayOfObject) {
    Field field = g(paramObject, paramString);
    Object[] arrayOfObject2 = (Object[])field.get(paramObject);
    Object[] arrayOfObject1 = (Object[])Array.newInstance(arrayOfObject2.getClass().getComponentType(), arrayOfObject2.length + paramArrayOfObject.length);
    System.arraycopy(arrayOfObject2, 0, arrayOfObject1, 0, arrayOfObject2.length);
    System.arraycopy(paramArrayOfObject, 0, arrayOfObject1, arrayOfObject2.length, paramArrayOfObject.length);
    field.set(paramObject, arrayOfObject1);
  }
  
  private static Field g(Object paramObject, String paramString) {
    Class<?> clazz = paramObject.getClass();
    while (clazz != null) {
      try {
        Field field = clazz.getDeclaredField(paramString);
        if (!field.isAccessible())
          field.setAccessible(true); 
        return field;
      } catch (NoSuchFieldException noSuchFieldException) {
        clazz = clazz.getSuperclass();
      } 
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Field ");
    stringBuilder.append(paramString);
    stringBuilder.append(" not found in ");
    stringBuilder.append(paramObject.getClass());
    paramObject = new NoSuchFieldException(stringBuilder.toString());
    throw paramObject;
  }
  
  private static Method h(Object paramObject, String paramString, Class<?>... paramVarArgs) {
    Class<?> clazz = paramObject.getClass();
    while (clazz != null) {
      try {
        Method method = clazz.getDeclaredMethod(paramString, paramVarArgs);
        if (!method.isAccessible())
          method.setAccessible(true); 
        return method;
      } catch (NoSuchMethodException noSuchMethodException) {
        clazz = clazz.getSuperclass();
      } 
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Method ");
    stringBuilder.append(paramString);
    stringBuilder.append(" with parameters ");
    stringBuilder.append(Arrays.asList(paramVarArgs));
    stringBuilder.append(" not found in ");
    stringBuilder.append(paramObject.getClass());
    paramObject = new NoSuchMethodException(stringBuilder.toString());
    throw paramObject;
  }
  
  private static ApplicationInfo i(Context paramContext) {
    try {
      return paramContext.getApplicationInfo();
    } catch (RuntimeException runtimeException) {
      Log.w("MultiDex", "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.", runtimeException);
      return null;
    } 
  }
  
  private static File j(Context paramContext, File paramFile, String paramString) {
    paramFile = new File(paramFile, "code_cache");
    try {
      n(paramFile);
      file = paramFile;
    } catch (IOException iOException) {
      file = new File(file.getFilesDir(), "code_cache");
      n(file);
    } 
    File file = new File(file, paramString);
    n(file);
    return file;
  }
  
  public static void k(Context paramContext) {
    Log.i("MultiDex", "Installing application");
    if (b) {
      Log.i("MultiDex", "VM has multidex support, MultiDex support library is disabled.");
      return;
    } 
    int i = Build.VERSION.SDK_INT;
    if (i >= 4)
      try {
        ApplicationInfo applicationInfo = i(paramContext);
        if (applicationInfo == null) {
          Log.i("MultiDex", "No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled.");
          return;
        } 
        File file1 = new File();
        this(applicationInfo.sourceDir);
        File file2 = new File();
        this(applicationInfo.dataDir);
        e(paramContext, file1, file2, "secondary-dexes", "", true);
        Log.i("MultiDex", "install done");
        return;
      } catch (Exception exception) {
        Log.e("MultiDex", "MultiDex installation failure", exception);
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("MultiDex installation failed (");
        stringBuilder1.append(exception.getMessage());
        stringBuilder1.append(").");
        throw new RuntimeException(stringBuilder1.toString());
      }  
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("MultiDex installation failed. SDK ");
    stringBuilder.append(i);
    stringBuilder.append(" is unsupported. Min SDK version is ");
    stringBuilder.append(4);
    stringBuilder.append(".");
    throw new RuntimeException(stringBuilder.toString());
  }
  
  private static void l(ClassLoader paramClassLoader, File paramFile, List<? extends File> paramList) {
    if (!paramList.isEmpty()) {
      int i = Build.VERSION.SDK_INT;
      if (i >= 19) {
        b.a(paramClassLoader, paramList, paramFile);
      } else if (i >= 14) {
        a.a(paramClassLoader, paramList);
      } else {
        c.a(paramClassLoader, paramList);
      } 
    } 
  }
  
  static boolean m(String paramString) {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: iload_1
    //   3: istore_2
    //   4: aload_0
    //   5: ifnull -> 78
    //   8: ldc_w '(\d+)\.(\d+)(\.\d+)?'
    //   11: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   14: aload_0
    //   15: invokevirtual matcher : (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   18: astore_3
    //   19: iload_1
    //   20: istore_2
    //   21: aload_3
    //   22: invokevirtual matches : ()Z
    //   25: ifeq -> 78
    //   28: aload_3
    //   29: iconst_1
    //   30: invokevirtual group : (I)Ljava/lang/String;
    //   33: invokestatic parseInt : (Ljava/lang/String;)I
    //   36: istore #4
    //   38: aload_3
    //   39: iconst_2
    //   40: invokevirtual group : (I)Ljava/lang/String;
    //   43: invokestatic parseInt : (Ljava/lang/String;)I
    //   46: istore #5
    //   48: iload #4
    //   50: iconst_2
    //   51: if_icmpgt -> 70
    //   54: iload_1
    //   55: istore_2
    //   56: iload #4
    //   58: iconst_2
    //   59: if_icmpne -> 78
    //   62: iload_1
    //   63: istore_2
    //   64: iload #5
    //   66: iconst_1
    //   67: if_icmplt -> 78
    //   70: iconst_1
    //   71: istore_2
    //   72: goto -> 78
    //   75: astore_3
    //   76: iload_1
    //   77: istore_2
    //   78: new java/lang/StringBuilder
    //   81: dup
    //   82: invokespecial <init> : ()V
    //   85: astore_3
    //   86: aload_3
    //   87: ldc_w 'VM with version '
    //   90: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   93: pop
    //   94: aload_3
    //   95: aload_0
    //   96: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   99: pop
    //   100: iload_2
    //   101: ifeq -> 111
    //   104: ldc_w ' has multidex support'
    //   107: astore_0
    //   108: goto -> 115
    //   111: ldc_w ' does not have multidex support'
    //   114: astore_0
    //   115: aload_3
    //   116: aload_0
    //   117: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   120: pop
    //   121: ldc 'MultiDex'
    //   123: aload_3
    //   124: invokevirtual toString : ()Ljava/lang/String;
    //   127: invokestatic i : (Ljava/lang/String;Ljava/lang/String;)I
    //   130: pop
    //   131: iload_2
    //   132: ireturn
    // Exception table:
    //   from	to	target	type
    //   28	48	75	java/lang/NumberFormatException
  }
  
  private static void n(File paramFile) {
    paramFile.mkdir();
    if (!paramFile.isDirectory()) {
      File file = paramFile.getParentFile();
      if (file == null) {
        stringBuilder = new StringBuilder();
        stringBuilder.append("Failed to create dir ");
        stringBuilder.append(paramFile.getPath());
        stringBuilder.append(". Parent file is null.");
        Log.e("MultiDex", stringBuilder.toString());
      } else {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("Failed to create dir ");
        stringBuilder1.append(paramFile.getPath());
        stringBuilder1.append(". parent file is a dir ");
        stringBuilder1.append(stringBuilder.isDirectory());
        stringBuilder1.append(", a file ");
        stringBuilder1.append(stringBuilder.isFile());
        stringBuilder1.append(", exists ");
        stringBuilder1.append(stringBuilder.exists());
        stringBuilder1.append(", readable ");
        stringBuilder1.append(stringBuilder.canRead());
        stringBuilder1.append(", writable ");
        stringBuilder1.append(stringBuilder.canWrite());
        Log.e("MultiDex", stringBuilder1.toString());
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Failed to create directory ");
      stringBuilder.append(paramFile.getPath());
      throw new IOException(stringBuilder.toString());
    } 
  }
  
  private static final class a {
    private static final int a = 4;
    
    private final a b;
    
    private a() {
      d d;
      Class<?> clazz = Class.forName("dalvik.system.DexPathList$Element");
      try {
        b b = new b();
        this(clazz);
      } catch (NoSuchMethodException noSuchMethodException) {
        try {
          c c = new c();
          this(clazz);
        } catch (NoSuchMethodException noSuchMethodException1) {
          d = new d(clazz);
        } 
      } 
      this.b = d;
    }
    
    static void a(ClassLoader param1ClassLoader, List<? extends File> param1List) {
      Object object = a.a(param1ClassLoader, "pathList").get(param1ClassLoader);
      Object[] arrayOfObject = (new a()).b(param1List);
      try {
        a.b(object, "dexElements", arrayOfObject);
      } catch (NoSuchFieldException noSuchFieldException) {
        Log.w("MultiDex", "Failed find field 'dexElements' attempting 'pathElements'", noSuchFieldException);
        a.b(object, "pathElements", arrayOfObject);
      } 
    }
    
    private Object[] b(List<? extends File> param1List) {
      int i = param1List.size();
      Object[] arrayOfObject = new Object[i];
      for (byte b = 0; b < i; b++) {
        File file = param1List.get(b);
        arrayOfObject[b] = this.b.a(file, DexFile.loadDex(file.getPath(), c(file), 0));
      } 
      return arrayOfObject;
    }
    
    private static String c(File param1File) {
      File file = param1File.getParentFile();
      String str = param1File.getName();
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(str.substring(0, str.length() - a));
      stringBuilder.append(".dex");
      return (new File(file, stringBuilder.toString())).getPath();
    }
    
    private static interface a {
      Object a(File param2File, DexFile param2DexFile);
    }
    
    private static class b implements a {
      private final Constructor<?> a;
      
      b(Class<?> param2Class) {
        Constructor<?> constructor = param2Class.getConstructor(new Class[] { File.class, ZipFile.class, DexFile.class });
        this.a = constructor;
        constructor.setAccessible(true);
      }
      
      public Object a(File param2File, DexFile param2DexFile) {
        return this.a.newInstance(new Object[] { param2File, new ZipFile(param2File), param2DexFile });
      }
    }
    
    private static class c implements a {
      private final Constructor<?> a;
      
      c(Class<?> param2Class) {
        Constructor<?> constructor = param2Class.getConstructor(new Class[] { File.class, File.class, DexFile.class });
        this.a = constructor;
        constructor.setAccessible(true);
      }
      
      public Object a(File param2File, DexFile param2DexFile) {
        return this.a.newInstance(new Object[] { param2File, param2File, param2DexFile });
      }
    }
    
    private static class d implements a {
      private final Constructor<?> a;
      
      d(Class<?> param2Class) {
        Constructor<?> constructor = param2Class.getConstructor(new Class[] { File.class, boolean.class, File.class, DexFile.class });
        this.a = constructor;
        constructor.setAccessible(true);
      }
      
      public Object a(File param2File, DexFile param2DexFile) {
        return this.a.newInstance(new Object[] { param2File, Boolean.FALSE, param2File, param2DexFile });
      }
    }
  }
  
  private static interface a {
    Object a(File param1File, DexFile param1DexFile);
  }
  
  private static class b implements a.a {
    private final Constructor<?> a;
    
    b(Class<?> param1Class) {
      Constructor<?> constructor = param1Class.getConstructor(new Class[] { File.class, ZipFile.class, DexFile.class });
      this.a = constructor;
      constructor.setAccessible(true);
    }
    
    public Object a(File param1File, DexFile param1DexFile) {
      return this.a.newInstance(new Object[] { param1File, new ZipFile(param1File), param1DexFile });
    }
  }
  
  private static class c implements a.a {
    private final Constructor<?> a;
    
    c(Class<?> param1Class) {
      Constructor<?> constructor = param1Class.getConstructor(new Class[] { File.class, File.class, DexFile.class });
      this.a = constructor;
      constructor.setAccessible(true);
    }
    
    public Object a(File param1File, DexFile param1DexFile) {
      return this.a.newInstance(new Object[] { param1File, param1File, param1DexFile });
    }
  }
  
  private static class d implements a.a {
    private final Constructor<?> a;
    
    d(Class<?> param1Class) {
      Constructor<?> constructor = param1Class.getConstructor(new Class[] { File.class, boolean.class, File.class, DexFile.class });
      this.a = constructor;
      constructor.setAccessible(true);
    }
    
    public Object a(File param1File, DexFile param1DexFile) {
      return this.a.newInstance(new Object[] { param1File, Boolean.FALSE, param1File, param1DexFile });
    }
  }
  
  private static final class b {
    static void a(ClassLoader param1ClassLoader, List<? extends File> param1List, File param1File) {
      Object object = a.a(param1ClassLoader, "pathList").get(param1ClassLoader);
      ArrayList<IOException> arrayList = new ArrayList();
      a.b(object, "dexElements", b(object, new ArrayList<File>(param1List), param1File, arrayList));
      if (arrayList.size() > 0) {
        IOException[] arrayOfIOException1;
        Iterator<IOException> iterator = arrayList.iterator();
        while (iterator.hasNext())
          Log.w("MultiDex", "Exception in makeDexElement", iterator.next()); 
        Field field = a.a(object, "dexElementsSuppressedExceptions");
        IOException[] arrayOfIOException2 = (IOException[])field.get(object);
        if (arrayOfIOException2 == null) {
          arrayOfIOException1 = arrayList.<IOException>toArray(new IOException[arrayList.size()]);
        } else {
          arrayOfIOException1 = new IOException[arrayList.size() + arrayOfIOException2.length];
          arrayList.toArray(arrayOfIOException1);
          System.arraycopy(arrayOfIOException2, 0, arrayOfIOException1, arrayList.size(), arrayOfIOException2.length);
        } 
        field.set(object, arrayOfIOException1);
        IOException iOException = new IOException("I/O exception during makeDexElement");
        iOException.initCause(arrayList.get(0));
        throw iOException;
      } 
    }
    
    private static Object[] b(Object param1Object, ArrayList<File> param1ArrayList, File param1File, ArrayList<IOException> param1ArrayList1) {
      return (Object[])a.c(param1Object, "makeDexElements", new Class[] { ArrayList.class, File.class, ArrayList.class }).invoke(param1Object, new Object[] { param1ArrayList, param1File, param1ArrayList1 });
    }
  }
  
  private static final class c {
    static void a(ClassLoader param1ClassLoader, List<? extends File> param1List) {
      int i = param1List.size();
      Field field = a.a(param1ClassLoader, "path");
      StringBuilder stringBuilder = new StringBuilder((String)field.get(param1ClassLoader));
      String[] arrayOfString = new String[i];
      File[] arrayOfFile = new File[i];
      ZipFile[] arrayOfZipFile = new ZipFile[i];
      DexFile[] arrayOfDexFile = new DexFile[i];
      ListIterator<? extends File> listIterator = param1List.listIterator();
      while (listIterator.hasNext()) {
        File file = listIterator.next();
        String str = file.getAbsolutePath();
        stringBuilder.append(':');
        stringBuilder.append(str);
        i = listIterator.previousIndex();
        arrayOfString[i] = str;
        arrayOfFile[i] = file;
        arrayOfZipFile[i] = new ZipFile(file);
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(str);
        stringBuilder1.append(".dex");
        arrayOfDexFile[i] = DexFile.loadDex(str, stringBuilder1.toString(), 0);
      } 
      field.set(param1ClassLoader, stringBuilder.toString());
      a.b(param1ClassLoader, "mPaths", (Object[])arrayOfString);
      a.b(param1ClassLoader, "mFiles", (Object[])arrayOfFile);
      a.b(param1ClassLoader, "mZips", (Object[])arrayOfZipFile);
      a.b(param1ClassLoader, "mDexs", (Object[])arrayOfDexFile);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/multidex/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */