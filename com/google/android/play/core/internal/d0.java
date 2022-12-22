package com.google.android.play.core.internal;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public final class d0 {
  public static <R, P0> R a(Object paramObject, String paramString, Class<R> paramClass, Class<P0> paramClass1, P0 paramP0) {
    Method method = m(paramObject, paramString, new Class[] { paramClass1 });
    try {
      return paramClass.cast(method.invoke(paramObject, new Object[] { paramP0 }));
    } catch (Exception exception) {
      throw new bi(String.format("Failed to invoke method %s on an object of type %s", new Object[] { paramString, paramObject.getClass() }), exception);
    } 
  }
  
  public static <R, P0, P1, P2> R b(Object paramObject, String paramString, Class<R> paramClass, Class<P0> paramClass1, P0 paramP0, Class<P1> paramClass2, P1 paramP1, Class<P2> paramClass3, P2 paramP2) {
    Method method = m(paramObject, paramString, new Class[] { paramClass1, paramClass2, paramClass3 });
    try {
      return paramClass.cast(method.invoke(paramObject, new Object[] { paramP0, paramP1, paramP2 }));
    } catch (Exception exception) {
      throw new bi(String.format("Failed to invoke method %s on an object of type %s", new Object[] { paramString, paramObject.getClass() }), exception);
    } 
  }
  
  public static <R> R c(Class<R> paramClass) {
    try {
      null = paramClass.getDeclaredConstructor(new Class[0]);
      if (!null.isAccessible())
        null.setAccessible(true); 
      return null.newInstance(new Object[0]);
    } catch (Exception exception) {
      throw new bi(String.format("Failed to invoke default constructor on class %s", new Object[] { paramClass.getName() }), exception);
    } 
  }
  
  public static <T> c0<T> d(Object paramObject, String paramString, Class<T> paramClass) {
    return new c0<T>(paramObject, o(paramObject, paramString), paramClass);
  }
  
  public static <T> c0 e(Object paramObject, String paramString, Class<T> paramClass) {
    return new c0(paramObject, o(paramObject, paramString), paramClass, null);
  }
  
  public static <R, P0> R f(Class<?> paramClass, Class<R> paramClass1, Class<P0> paramClass2, P0 paramP0) {
    Method method = n(paramClass, "isDexOptNeeded", new Class[] { paramClass2 });
    try {
      return paramClass1.cast(method.invoke((Object)null, new Object[] { paramP0 }));
    } catch (Exception exception) {
      throw new bi(String.format("Failed to invoke static method %s on type %s", new Object[] { "isDexOptNeeded", paramClass }), exception);
    } 
  }
  
  public static <R, P0, P1> R g(Class<?> paramClass, Class<R> paramClass1, Class<P0> paramClass2, P0 paramP0, Class<P1> paramClass3, P1 paramP1) {
    Method method = n(paramClass, "optimizedPathFor", new Class[] { paramClass2, paramClass3 });
    try {
      return paramClass1.cast(method.invoke((Object)null, new Object[] { paramP0, paramP1 }));
    } catch (Exception exception) {
      throw new bi(String.format("Failed to invoke static method %s on type %s", new Object[] { "optimizedPathFor", paramClass }), exception);
    } 
  }
  
  public static void h(PackageManager paramPackageManager, ComponentName paramComponentName, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual getComponentEnabledSetting : (Landroid/content/ComponentName;)I
    //   5: istore_3
    //   6: iload_3
    //   7: iconst_1
    //   8: if_icmpeq -> 180
    //   11: iload_3
    //   12: iconst_2
    //   13: if_icmpeq -> 173
    //   16: aload_1
    //   17: invokevirtual getPackageName : ()Ljava/lang/String;
    //   20: astore #4
    //   22: aload_1
    //   23: invokevirtual getClassName : ()Ljava/lang/String;
    //   26: astore #5
    //   28: aload_0
    //   29: aload #4
    //   31: iload_2
    //   32: sipush #512
    //   35: ior
    //   36: invokevirtual getPackageInfo : (Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   39: astore #4
    //   41: aload #4
    //   43: getfield activities : [Landroid/content/pm/ActivityInfo;
    //   46: astore #6
    //   48: aload #4
    //   50: getfield services : [Landroid/content/pm/ServiceInfo;
    //   53: astore #7
    //   55: aload #4
    //   57: getfield providers : [Landroid/content/pm/ProviderInfo;
    //   60: astore #8
    //   62: iconst_0
    //   63: istore_2
    //   64: iload_2
    //   65: iconst_3
    //   66: if_icmpge -> 147
    //   69: iconst_3
    //   70: anewarray [Landroid/content/pm/ComponentInfo;
    //   73: dup
    //   74: iconst_0
    //   75: aload #6
    //   77: aastore
    //   78: dup
    //   79: iconst_1
    //   80: aload #7
    //   82: aastore
    //   83: dup
    //   84: iconst_2
    //   85: aload #8
    //   87: aastore
    //   88: iload_2
    //   89: aaload
    //   90: astore #9
    //   92: aload #9
    //   94: ifnonnull -> 100
    //   97: goto -> 141
    //   100: aload #9
    //   102: arraylength
    //   103: istore #10
    //   105: iconst_0
    //   106: istore_3
    //   107: iload_3
    //   108: iload #10
    //   110: if_icmpge -> 141
    //   113: aload #9
    //   115: iload_3
    //   116: aaload
    //   117: astore #4
    //   119: aload #4
    //   121: getfield name : Ljava/lang/String;
    //   124: aload #5
    //   126: invokevirtual equals : (Ljava/lang/Object;)Z
    //   129: ifeq -> 135
    //   132: goto -> 150
    //   135: iinc #3, 1
    //   138: goto -> 107
    //   141: iinc #2, 1
    //   144: goto -> 64
    //   147: aconst_null
    //   148: astore #4
    //   150: aload #4
    //   152: ifnonnull -> 158
    //   155: goto -> 173
    //   158: aload #4
    //   160: invokevirtual isEnabled : ()Z
    //   163: istore #11
    //   165: iload #11
    //   167: ifeq -> 173
    //   170: goto -> 180
    //   173: aload_0
    //   174: aload_1
    //   175: iconst_1
    //   176: iconst_1
    //   177: invokevirtual setComponentEnabledSetting : (Landroid/content/ComponentName;II)V
    //   180: return
    //   181: astore #4
    //   183: goto -> 173
    // Exception table:
    //   from	to	target	type
    //   28	62	181	android/content/pm/PackageManager$NameNotFoundException
    //   69	92	181	android/content/pm/PackageManager$NameNotFoundException
    //   100	105	181	android/content/pm/PackageManager$NameNotFoundException
    //   119	132	181	android/content/pm/PackageManager$NameNotFoundException
    //   158	165	181	android/content/pm/PackageManager$NameNotFoundException
  }
  
  public static <T> void i(T paramT, Class<T> paramClass) {
    if (paramT != null)
      return; 
    throw new IllegalStateException(String.valueOf(paramClass.getCanonicalName()).concat(" must be set"));
  }
  
  public static <T> void j(T paramT) {
    paramT.getClass();
  }
  
  public static <T> void k(T paramT) {
    if (paramT != null)
      return; 
    throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
  }
  
  public static void l(f0 paramf0, InputStream paramInputStream, OutputStream paramOutputStream, long paramLong) {
    String str;
    byte[] arrayOfByte = new byte[16384];
    paramInputStream = new DataInputStream(new BufferedInputStream(paramInputStream, 4096));
    int i = paramInputStream.readInt();
    if (i != -771763713) {
      str = String.valueOf(String.format("%x", new Object[] { Integer.valueOf(i) }));
      if (str.length() != 0) {
        str = "Unexpected magic=".concat(str);
      } else {
        str = new String("Unexpected magic=");
      } 
      throw new bq(str);
    } 
    i = paramInputStream.read();
    if (i == 4) {
      long l = 0L;
      while (true) {
        long l1 = paramLong - l;
        try {
          i = paramInputStream.read();
          if (i != -1) {
            if (i != 0) {
              IOException iOException1;
              long l2;
              switch (i) {
                default:
                  p(arrayOfByte, (DataInputStream)paramInputStream, paramOutputStream, i, l1);
                  break;
                case 255:
                  l2 = paramInputStream.readLong();
                  i = paramInputStream.readInt();
                  q(arrayOfByte, (f0)str, paramOutputStream, l2, i, l1);
                  break;
                case 254:
                  l2 = paramInputStream.readInt();
                  i = paramInputStream.readInt();
                  q(arrayOfByte, (f0)str, paramOutputStream, l2, i, l1);
                  break;
                case 253:
                  l2 = paramInputStream.readInt();
                  i = paramInputStream.readUnsignedShort();
                  q(arrayOfByte, (f0)str, paramOutputStream, l2, i, l1);
                  break;
                case 252:
                  l2 = paramInputStream.readInt();
                  i = paramInputStream.read();
                  if (i != -1) {
                    q(arrayOfByte, (f0)str, paramOutputStream, l2, i, l1);
                    break;
                  } 
                  iOException1 = new IOException();
                  this("Unexpected end of patch");
                  throw iOException1;
                case 251:
                  l2 = paramInputStream.readUnsignedShort();
                  i = paramInputStream.readInt();
                  q(arrayOfByte, (f0)iOException1, paramOutputStream, l2, i, l1);
                  break;
                case 250:
                  l2 = paramInputStream.readUnsignedShort();
                  i = paramInputStream.readUnsignedShort();
                  q(arrayOfByte, (f0)iOException1, paramOutputStream, l2, i, l1);
                  break;
                case 249:
                  l2 = paramInputStream.readUnsignedShort();
                  i = paramInputStream.read();
                  if (i != -1) {
                    q(arrayOfByte, (f0)iOException1, paramOutputStream, l2, i, l1);
                    break;
                  } 
                  iOException1 = new IOException();
                  this("Unexpected end of patch");
                  throw iOException1;
                case 248:
                  i = paramInputStream.readInt();
                  p(arrayOfByte, (DataInputStream)paramInputStream, paramOutputStream, i, l1);
                  break;
                case 247:
                  i = paramInputStream.readUnsignedShort();
                  p(arrayOfByte, (DataInputStream)paramInputStream, paramOutputStream, i, l1);
                  break;
              } 
              l += i;
              continue;
            } 
            return;
          } 
          IOException iOException = new IOException();
          this("Patch file overrun");
          throw iOException;
        } finally {
          paramOutputStream.flush();
        } 
      } 
    } 
    StringBuilder stringBuilder = new StringBuilder(30);
    stringBuilder.append("Unexpected version=");
    stringBuilder.append(i);
    bq bq = new bq(stringBuilder.toString());
    throw bq;
  }
  
  private static Method m(Object paramObject, String paramString, Class<?>... paramVarArgs) {
    return n(paramObject.getClass(), paramString, paramVarArgs);
  }
  
  private static Method n(Class<?> paramClass, String paramString, Class<?>... paramVarArgs) {
    Class<?> clazz = paramClass;
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
    bi bi = new bi(String.format("Could not find a method named %s with parameters %s in type %s", new Object[] { paramString, Arrays.asList(paramVarArgs), paramClass }));
    throw bi;
  }
  
  private static Field o(Object paramObject, String paramString) {
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
    paramObject = new bi(String.format("Failed to find a field named %s on an object of instance %s", new Object[] { paramString, paramObject.getClass().getName() }));
    throw paramObject;
  }
  
  private static void p(byte[] paramArrayOfbyte, DataInputStream paramDataInputStream, OutputStream paramOutputStream, int paramInt, long paramLong) {
    if (paramInt >= 0) {
      if (paramInt <= paramLong) {
        while (paramInt > 0) {
          try {
            int i = Math.min(paramInt, 16384);
            paramDataInputStream.readFully(paramArrayOfbyte, 0, i);
            paramOutputStream.write(paramArrayOfbyte, 0, i);
            paramInt -= i;
          } catch (EOFException eOFException) {
            throw new IOException("patch underrun");
          } 
        } 
        return;
      } 
      throw new IOException("Output length overrun");
    } 
    IOException iOException = new IOException("copyLength negative");
    throw iOException;
  }
  
  private static void q(byte[] paramArrayOfbyte, f0 paramf0, OutputStream paramOutputStream, long paramLong1, int paramInt, long paramLong2) {
    if (paramInt >= 0) {
      if (paramLong1 >= 0L) {
        long l = paramInt;
        if (l <= paramLong2)
          try {
            g0 g0 = new g0();
            this(paramf0, paramLong1, l);
            InputStream inputStream = g0.d();
            while (paramInt > 0) {
              try {
                IOException iOException1;
                int i = Math.min(paramInt, 16384);
                int j = 0;
                while (j < i) {
                  int k = inputStream.read(paramArrayOfbyte, j, i - j);
                  if (k != -1) {
                    j += k;
                    continue;
                  } 
                  iOException1 = new IOException();
                  this("truncated input stream");
                  throw iOException1;
                } 
                paramOutputStream.write((byte[])iOException1, 0, i);
              } finally {
                try {
                  inputStream.close();
                } finally {
                  inputStream = null;
                } 
              } 
            } 
            inputStream.close();
            return;
          } catch (EOFException eOFException) {
            throw new IOException("patch underrun", eOFException);
          }  
        throw new IOException("Output length overrun");
      } 
      throw new IOException("inputOffset negative");
    } 
    IOException iOException = new IOException("copyLength negative");
    throw iOException;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/play/core/internal/d0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */