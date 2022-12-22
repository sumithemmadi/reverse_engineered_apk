package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

public final class dv1 {
  private static final Logger a = Logger.getLogger(dv1.class.getName());
  
  private static final ConcurrentMap<String, b> b = new ConcurrentHashMap<String, b>();
  
  private static final ConcurrentMap<String, a> c = new ConcurrentHashMap<String, a>();
  
  private static final ConcurrentMap<String, Boolean> d = new ConcurrentHashMap<String, Boolean>();
  
  private static final ConcurrentMap<String, fu1<?>> e = new ConcurrentHashMap<String, fu1<?>>();
  
  private static final ConcurrentMap<Class<?>, yu1<?, ?>> f = new ConcurrentHashMap<Class<?>, yu1<?, ?>>();
  
  private static <T> T a(T paramT) {
    paramT.getClass();
    return paramT;
  }
  
  private static <P> mu1<P> b(String paramString, Class<P> paramClass) {
    b b = q(paramString);
    if (paramClass == null)
      return (mu1)b.c(); 
    if (b.b().contains(paramClass))
      return b.a(paramClass); 
    paramString = paramClass.getName();
    String str1 = String.valueOf(b.d());
    Set<Class<?>> set = b.b();
    StringBuilder stringBuilder = new StringBuilder();
    boolean bool = true;
    for (Class<?> clazz : set) {
      if (!bool)
        stringBuilder.append(", "); 
      stringBuilder.append(clazz.getCanonicalName());
      bool = false;
    } 
    String str2 = stringBuilder.toString();
    stringBuilder = new StringBuilder(paramString.length() + 77 + str1.length() + String.valueOf(str2).length());
    stringBuilder.append("Primitive type ");
    stringBuilder.append(paramString);
    stringBuilder.append(" not supported by key manager of type ");
    stringBuilder.append(str1);
    stringBuilder.append(", supported primitives: ");
    stringBuilder.append(str2);
    GeneralSecurityException generalSecurityException = new GeneralSecurityException(stringBuilder.toString());
    throw generalSecurityException;
  }
  
  public static <P> wu1<P> c(tu1 paramtu1, mu1<P> parammu1, Class<P> paramClass) {
    Class<?> clazz = a(paramClass);
    hv1.b(paramtu1.b());
    wu1<?> wu1 = wu1.a(clazz);
    for (c02.b b : paramtu1.b().K()) {
      if (b.J() == zzege.c) {
        zu1<?> zu1 = wu1.b(g(b.M().O(), b.M().P(), clazz), b);
        if (b.N() == paramtu1.b().J())
          wu1.c(zu1); 
      } 
    } 
    return (wu1)wu1;
  }
  
  private static <KeyProtoT extends u52> b d(nu1<KeyProtoT> paramnu1) {
    return new fv1(paramnu1);
  }
  
  public static zzegd e(xz1 paramxz1) {
    // Byte code:
    //   0: ldc com/google/android/gms/internal/ads/dv1
    //   2: monitorenter
    //   3: aload_0
    //   4: invokevirtual J : ()Ljava/lang/String;
    //   7: invokestatic s : (Ljava/lang/String;)Lcom/google/android/gms/internal/ads/mu1;
    //   10: astore_1
    //   11: getstatic com/google/android/gms/internal/ads/dv1.d : Ljava/util/concurrent/ConcurrentMap;
    //   14: aload_0
    //   15: invokevirtual J : ()Ljava/lang/String;
    //   18: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   23: checkcast java/lang/Boolean
    //   26: invokevirtual booleanValue : ()Z
    //   29: ifeq -> 48
    //   32: aload_1
    //   33: aload_0
    //   34: invokevirtual K : ()Lcom/google/android/gms/internal/ads/zzejr;
    //   37: invokeinterface b : (Lcom/google/android/gms/internal/ads/zzejr;)Lcom/google/android/gms/internal/ads/zzegd;
    //   42: astore_0
    //   43: ldc com/google/android/gms/internal/ads/dv1
    //   45: monitorexit
    //   46: aload_0
    //   47: areturn
    //   48: new java/security/GeneralSecurityException
    //   51: astore_1
    //   52: aload_0
    //   53: invokevirtual J : ()Ljava/lang/String;
    //   56: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   59: astore_0
    //   60: aload_0
    //   61: invokevirtual length : ()I
    //   64: ifeq -> 77
    //   67: ldc 'newKey-operation not permitted for key type '
    //   69: aload_0
    //   70: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   73: astore_0
    //   74: goto -> 87
    //   77: new java/lang/String
    //   80: dup
    //   81: ldc 'newKey-operation not permitted for key type '
    //   83: invokespecial <init> : (Ljava/lang/String;)V
    //   86: astore_0
    //   87: aload_1
    //   88: aload_0
    //   89: invokespecial <init> : (Ljava/lang/String;)V
    //   92: aload_1
    //   93: athrow
    //   94: astore_0
    //   95: ldc com/google/android/gms/internal/ads/dv1
    //   97: monitorexit
    //   98: aload_0
    //   99: athrow
    // Exception table:
    //   from	to	target	type
    //   3	43	94	finally
    //   48	74	94	finally
    //   77	87	94	finally
    //   87	94	94	finally
  }
  
  public static <P> P f(wu1<P> paramwu1) {
    Class<P> clazz = paramwu1.d();
    yu1 yu1 = f.get(clazz);
    if (yu1 == null) {
      str1 = paramwu1.d().getName();
      if (str1.length() != 0) {
        str1 = "No wrapper found for ".concat(str1);
      } else {
        str1 = new String("No wrapper found for ");
      } 
      throw new GeneralSecurityException(str1);
    } 
    if (yu1.b().equals(str1.d()))
      return (P)yu1.c((wu1)str1); 
    String str2 = String.valueOf(yu1.b());
    String str1 = String.valueOf(str1.d());
    StringBuilder stringBuilder = new StringBuilder(str2.length() + 44 + str1.length());
    stringBuilder.append("Wrong input primitive class, expected ");
    stringBuilder.append(str2);
    stringBuilder.append(", got ");
    stringBuilder.append(str1);
    throw new GeneralSecurityException(stringBuilder.toString());
  }
  
  private static <P> P g(String paramString, zzejr paramzzejr, Class<P> paramClass) {
    return b(paramString, paramClass).f(paramzzejr);
  }
  
  public static <P> P h(String paramString, u52 paramu52, Class<P> paramClass) {
    return b(paramString, a(paramClass)).e(paramu52);
  }
  
  public static <P> P i(String paramString, byte[] paramArrayOfbyte, Class<P> paramClass) {
    return g(paramString, zzejr.zzt(paramArrayOfbyte), a(paramClass));
  }
  
  public static <P> void j(mu1<P> parammu1, boolean paramBoolean) {
    // Byte code:
    //   0: ldc com/google/android/gms/internal/ads/dv1
    //   2: monitorenter
    //   3: aload_0
    //   4: ifnull -> 70
    //   7: aload_0
    //   8: invokeinterface d : ()Ljava/lang/String;
    //   13: astore_2
    //   14: aload_2
    //   15: aload_0
    //   16: invokevirtual getClass : ()Ljava/lang/Class;
    //   19: iload_1
    //   20: invokestatic n : (Ljava/lang/String;Ljava/lang/Class;Z)V
    //   23: getstatic com/google/android/gms/internal/ads/dv1.b : Ljava/util/concurrent/ConcurrentMap;
    //   26: astore_3
    //   27: new com/google/android/gms/internal/ads/cv1
    //   30: astore #4
    //   32: aload #4
    //   34: aload_0
    //   35: invokespecial <init> : (Lcom/google/android/gms/internal/ads/mu1;)V
    //   38: aload_3
    //   39: aload_2
    //   40: aload #4
    //   42: invokeinterface putIfAbsent : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   47: pop
    //   48: getstatic com/google/android/gms/internal/ads/dv1.d : Ljava/util/concurrent/ConcurrentMap;
    //   51: aload_2
    //   52: iload_1
    //   53: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   56: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   61: pop
    //   62: ldc com/google/android/gms/internal/ads/dv1
    //   64: monitorexit
    //   65: return
    //   66: astore_0
    //   67: goto -> 83
    //   70: new java/lang/IllegalArgumentException
    //   73: astore_0
    //   74: aload_0
    //   75: ldc_w 'key manager must be non-null.'
    //   78: invokespecial <init> : (Ljava/lang/String;)V
    //   81: aload_0
    //   82: athrow
    //   83: ldc com/google/android/gms/internal/ads/dv1
    //   85: monitorexit
    //   86: aload_0
    //   87: athrow
    // Exception table:
    //   from	to	target	type
    //   7	62	66	finally
    //   70	83	66	finally
  }
  
  public static <KeyProtoT extends u52> void k(nu1<KeyProtoT> paramnu1, boolean paramBoolean) {
    // Byte code:
    //   0: ldc com/google/android/gms/internal/ads/dv1
    //   2: monitorenter
    //   3: aload_0
    //   4: invokevirtual a : ()Ljava/lang/String;
    //   7: astore_2
    //   8: aload_2
    //   9: aload_0
    //   10: invokevirtual getClass : ()Ljava/lang/Class;
    //   13: iconst_1
    //   14: invokestatic n : (Ljava/lang/String;Ljava/lang/Class;Z)V
    //   17: getstatic com/google/android/gms/internal/ads/dv1.b : Ljava/util/concurrent/ConcurrentMap;
    //   20: astore_3
    //   21: aload_3
    //   22: aload_2
    //   23: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   28: ifne -> 57
    //   31: aload_3
    //   32: aload_2
    //   33: aload_0
    //   34: invokestatic d : (Lcom/google/android/gms/internal/ads/nu1;)Lcom/google/android/gms/internal/ads/dv1$b;
    //   37: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   42: pop
    //   43: getstatic com/google/android/gms/internal/ads/dv1.c : Ljava/util/concurrent/ConcurrentMap;
    //   46: aload_2
    //   47: aload_0
    //   48: invokestatic o : (Lcom/google/android/gms/internal/ads/nu1;)Lcom/google/android/gms/internal/ads/dv1$a;
    //   51: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   56: pop
    //   57: getstatic com/google/android/gms/internal/ads/dv1.d : Ljava/util/concurrent/ConcurrentMap;
    //   60: aload_2
    //   61: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   64: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   69: pop
    //   70: ldc com/google/android/gms/internal/ads/dv1
    //   72: monitorexit
    //   73: return
    //   74: astore_0
    //   75: ldc com/google/android/gms/internal/ads/dv1
    //   77: monitorexit
    //   78: aload_0
    //   79: athrow
    // Exception table:
    //   from	to	target	type
    //   3	57	74	finally
    //   57	70	74	finally
  }
  
  public static <B, P> void l(yu1<B, P> paramyu1) {
    // Byte code:
    //   0: ldc com/google/android/gms/internal/ads/dv1
    //   2: monitorenter
    //   3: aload_0
    //   4: ifnull -> 191
    //   7: aload_0
    //   8: invokeinterface a : ()Ljava/lang/Class;
    //   13: astore_1
    //   14: getstatic com/google/android/gms/internal/ads/dv1.f : Ljava/util/concurrent/ConcurrentMap;
    //   17: astore_2
    //   18: aload_2
    //   19: aload_1
    //   20: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   25: ifeq -> 174
    //   28: aload_2
    //   29: aload_1
    //   30: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   35: checkcast com/google/android/gms/internal/ads/yu1
    //   38: astore_3
    //   39: aload_0
    //   40: invokevirtual getClass : ()Ljava/lang/Class;
    //   43: aload_3
    //   44: invokevirtual getClass : ()Ljava/lang/Class;
    //   47: invokevirtual equals : (Ljava/lang/Object;)Z
    //   50: ifeq -> 56
    //   53: goto -> 174
    //   56: getstatic com/google/android/gms/internal/ads/dv1.a : Ljava/util/logging/Logger;
    //   59: astore #4
    //   61: getstatic java/util/logging/Level.WARNING : Ljava/util/logging/Level;
    //   64: astore_2
    //   65: aload_1
    //   66: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   69: astore #5
    //   71: aload #5
    //   73: invokevirtual length : ()I
    //   76: istore #6
    //   78: new java/lang/StringBuilder
    //   81: astore #7
    //   83: aload #7
    //   85: iload #6
    //   87: bipush #56
    //   89: iadd
    //   90: invokespecial <init> : (I)V
    //   93: aload #7
    //   95: ldc_w 'Attempted overwrite of a registered SetWrapper for type '
    //   98: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   101: pop
    //   102: aload #7
    //   104: aload #5
    //   106: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   109: pop
    //   110: aload #4
    //   112: aload_2
    //   113: ldc_w 'com.google.crypto.tink.Registry'
    //   116: ldc_w 'registerPrimitiveWrapper'
    //   119: aload #7
    //   121: invokevirtual toString : ()Ljava/lang/String;
    //   124: invokevirtual logp : (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   127: new java/security/GeneralSecurityException
    //   130: astore_2
    //   131: aload_2
    //   132: ldc_w 'SetWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s'
    //   135: iconst_3
    //   136: anewarray java/lang/Object
    //   139: dup
    //   140: iconst_0
    //   141: aload_1
    //   142: invokevirtual getName : ()Ljava/lang/String;
    //   145: aastore
    //   146: dup
    //   147: iconst_1
    //   148: aload_3
    //   149: invokevirtual getClass : ()Ljava/lang/Class;
    //   152: invokevirtual getName : ()Ljava/lang/String;
    //   155: aastore
    //   156: dup
    //   157: iconst_2
    //   158: aload_0
    //   159: invokevirtual getClass : ()Ljava/lang/Class;
    //   162: invokevirtual getName : ()Ljava/lang/String;
    //   165: aastore
    //   166: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   169: invokespecial <init> : (Ljava/lang/String;)V
    //   172: aload_2
    //   173: athrow
    //   174: aload_2
    //   175: aload_1
    //   176: aload_0
    //   177: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   182: pop
    //   183: ldc com/google/android/gms/internal/ads/dv1
    //   185: monitorexit
    //   186: return
    //   187: astore_0
    //   188: goto -> 204
    //   191: new java/lang/IllegalArgumentException
    //   194: astore_0
    //   195: aload_0
    //   196: ldc_w 'wrapper must be non-null'
    //   199: invokespecial <init> : (Ljava/lang/String;)V
    //   202: aload_0
    //   203: athrow
    //   204: ldc com/google/android/gms/internal/ads/dv1
    //   206: monitorexit
    //   207: aload_0
    //   208: athrow
    // Exception table:
    //   from	to	target	type
    //   7	53	187	finally
    //   56	174	187	finally
    //   174	183	187	finally
    //   191	204	187	finally
  }
  
  public static <KeyProtoT extends u52, PublicKeyProtoT extends u52> void m(av1<KeyProtoT, PublicKeyProtoT> paramav1, nu1<PublicKeyProtoT> paramnu1, boolean paramBoolean) {
    // Byte code:
    //   0: ldc com/google/android/gms/internal/ads/dv1
    //   2: monitorenter
    //   3: aload_0
    //   4: invokevirtual a : ()Ljava/lang/String;
    //   7: astore_3
    //   8: aload_1
    //   9: invokevirtual a : ()Ljava/lang/String;
    //   12: astore #4
    //   14: aload_3
    //   15: aload_0
    //   16: invokevirtual getClass : ()Ljava/lang/Class;
    //   19: iconst_1
    //   20: invokestatic n : (Ljava/lang/String;Ljava/lang/Class;Z)V
    //   23: aload #4
    //   25: aload_1
    //   26: invokevirtual getClass : ()Ljava/lang/Class;
    //   29: iconst_0
    //   30: invokestatic n : (Ljava/lang/String;Ljava/lang/Class;Z)V
    //   33: aload_3
    //   34: aload #4
    //   36: invokevirtual equals : (Ljava/lang/Object;)Z
    //   39: ifne -> 363
    //   42: getstatic com/google/android/gms/internal/ads/dv1.b : Ljava/util/concurrent/ConcurrentMap;
    //   45: astore #5
    //   47: aload #5
    //   49: aload_3
    //   50: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   55: ifeq -> 239
    //   58: aload #5
    //   60: aload_3
    //   61: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   66: checkcast com/google/android/gms/internal/ads/dv1$b
    //   69: invokeinterface e : ()Ljava/lang/Class;
    //   74: astore #6
    //   76: aload #6
    //   78: ifnull -> 239
    //   81: aload #6
    //   83: aload_1
    //   84: invokevirtual getClass : ()Ljava/lang/Class;
    //   87: invokevirtual equals : (Ljava/lang/Object;)Z
    //   90: ifeq -> 96
    //   93: goto -> 239
    //   96: getstatic com/google/android/gms/internal/ads/dv1.a : Ljava/util/logging/Logger;
    //   99: astore #7
    //   101: getstatic java/util/logging/Level.WARNING : Ljava/util/logging/Level;
    //   104: astore #8
    //   106: aload_3
    //   107: invokevirtual length : ()I
    //   110: istore #9
    //   112: aload #4
    //   114: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   117: invokevirtual length : ()I
    //   120: istore #10
    //   122: new java/lang/StringBuilder
    //   125: astore #5
    //   127: aload #5
    //   129: iload #9
    //   131: bipush #96
    //   133: iadd
    //   134: iload #10
    //   136: iadd
    //   137: invokespecial <init> : (I)V
    //   140: aload #5
    //   142: ldc_w 'Attempted overwrite of a registered key manager for key type '
    //   145: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   148: pop
    //   149: aload #5
    //   151: aload_3
    //   152: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   155: pop
    //   156: aload #5
    //   158: ldc_w ' with inconsistent public key type '
    //   161: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   164: pop
    //   165: aload #5
    //   167: aload #4
    //   169: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   172: pop
    //   173: aload #7
    //   175: aload #8
    //   177: ldc_w 'com.google.crypto.tink.Registry'
    //   180: ldc_w 'registerAsymmetricKeyManagers'
    //   183: aload #5
    //   185: invokevirtual toString : ()Ljava/lang/String;
    //   188: invokevirtual logp : (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   191: new java/security/GeneralSecurityException
    //   194: astore_3
    //   195: aload_3
    //   196: ldc_w 'public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s'
    //   199: iconst_3
    //   200: anewarray java/lang/Object
    //   203: dup
    //   204: iconst_0
    //   205: aload_0
    //   206: invokevirtual getClass : ()Ljava/lang/Class;
    //   209: invokevirtual getName : ()Ljava/lang/String;
    //   212: aastore
    //   213: dup
    //   214: iconst_1
    //   215: aload #6
    //   217: invokevirtual getName : ()Ljava/lang/String;
    //   220: aastore
    //   221: dup
    //   222: iconst_2
    //   223: aload_1
    //   224: invokevirtual getClass : ()Ljava/lang/Class;
    //   227: invokevirtual getName : ()Ljava/lang/String;
    //   230: aastore
    //   231: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   234: invokespecial <init> : (Ljava/lang/String;)V
    //   237: aload_3
    //   238: athrow
    //   239: aload #5
    //   241: aload_3
    //   242: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   247: ifeq -> 269
    //   250: aload #5
    //   252: aload_3
    //   253: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   258: checkcast com/google/android/gms/internal/ads/dv1$b
    //   261: invokeinterface e : ()Ljava/lang/Class;
    //   266: ifnonnull -> 306
    //   269: new com/google/android/gms/internal/ads/ev1
    //   272: astore #6
    //   274: aload #6
    //   276: aload_0
    //   277: aload_1
    //   278: invokespecial <init> : (Lcom/google/android/gms/internal/ads/av1;Lcom/google/android/gms/internal/ads/nu1;)V
    //   281: aload #5
    //   283: aload_3
    //   284: aload #6
    //   286: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   291: pop
    //   292: getstatic com/google/android/gms/internal/ads/dv1.c : Ljava/util/concurrent/ConcurrentMap;
    //   295: aload_3
    //   296: aload_0
    //   297: invokestatic o : (Lcom/google/android/gms/internal/ads/nu1;)Lcom/google/android/gms/internal/ads/dv1$a;
    //   300: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   305: pop
    //   306: getstatic com/google/android/gms/internal/ads/dv1.d : Ljava/util/concurrent/ConcurrentMap;
    //   309: astore_0
    //   310: aload_0
    //   311: aload_3
    //   312: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   315: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   320: pop
    //   321: aload #5
    //   323: aload #4
    //   325: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   330: ifne -> 347
    //   333: aload #5
    //   335: aload #4
    //   337: aload_1
    //   338: invokestatic d : (Lcom/google/android/gms/internal/ads/nu1;)Lcom/google/android/gms/internal/ads/dv1$b;
    //   341: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   346: pop
    //   347: aload_0
    //   348: aload #4
    //   350: getstatic java/lang/Boolean.FALSE : Ljava/lang/Boolean;
    //   353: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   358: pop
    //   359: ldc com/google/android/gms/internal/ads/dv1
    //   361: monitorexit
    //   362: return
    //   363: new java/security/GeneralSecurityException
    //   366: astore_0
    //   367: aload_0
    //   368: ldc_w 'Private and public key type must be different.'
    //   371: invokespecial <init> : (Ljava/lang/String;)V
    //   374: aload_0
    //   375: athrow
    //   376: astore_0
    //   377: ldc com/google/android/gms/internal/ads/dv1
    //   379: monitorexit
    //   380: aload_0
    //   381: athrow
    // Exception table:
    //   from	to	target	type
    //   3	76	376	finally
    //   81	93	376	finally
    //   96	239	376	finally
    //   239	269	376	finally
    //   269	306	376	finally
    //   306	347	376	finally
    //   347	359	376	finally
    //   363	376	376	finally
  }
  
  private static void n(String paramString, Class<?> paramClass, boolean paramBoolean) {
    // Byte code:
    //   0: ldc com/google/android/gms/internal/ads/dv1
    //   2: monitorenter
    //   3: getstatic com/google/android/gms/internal/ads/dv1.b : Ljava/util/concurrent/ConcurrentMap;
    //   6: astore_3
    //   7: aload_3
    //   8: aload_0
    //   9: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   14: istore #4
    //   16: iload #4
    //   18: ifne -> 25
    //   21: ldc com/google/android/gms/internal/ads/dv1
    //   23: monitorexit
    //   24: return
    //   25: aload_3
    //   26: aload_0
    //   27: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   32: checkcast com/google/android/gms/internal/ads/dv1$b
    //   35: astore #5
    //   37: aload #5
    //   39: invokeinterface d : ()Ljava/lang/Class;
    //   44: aload_1
    //   45: invokevirtual equals : (Ljava/lang/Object;)Z
    //   48: ifne -> 153
    //   51: getstatic com/google/android/gms/internal/ads/dv1.a : Ljava/util/logging/Logger;
    //   54: astore #6
    //   56: getstatic java/util/logging/Level.WARNING : Ljava/util/logging/Level;
    //   59: astore #7
    //   61: aload_0
    //   62: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   65: astore_3
    //   66: aload_3
    //   67: invokevirtual length : ()I
    //   70: ifeq -> 84
    //   73: ldc_w 'Attempted overwrite of a registered key manager for key type '
    //   76: aload_3
    //   77: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   80: astore_3
    //   81: goto -> 95
    //   84: new java/lang/String
    //   87: dup
    //   88: ldc_w 'Attempted overwrite of a registered key manager for key type '
    //   91: invokespecial <init> : (Ljava/lang/String;)V
    //   94: astore_3
    //   95: aload #6
    //   97: aload #7
    //   99: ldc_w 'com.google.crypto.tink.Registry'
    //   102: ldc_w 'ensureKeyManagerInsertable'
    //   105: aload_3
    //   106: invokevirtual logp : (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   109: new java/security/GeneralSecurityException
    //   112: astore_3
    //   113: aload_3
    //   114: ldc_w 'typeUrl (%s) is already registered with %s, cannot be re-registered with %s'
    //   117: iconst_3
    //   118: anewarray java/lang/Object
    //   121: dup
    //   122: iconst_0
    //   123: aload_0
    //   124: aastore
    //   125: dup
    //   126: iconst_1
    //   127: aload #5
    //   129: invokeinterface d : ()Ljava/lang/Class;
    //   134: invokevirtual getName : ()Ljava/lang/String;
    //   137: aastore
    //   138: dup
    //   139: iconst_2
    //   140: aload_1
    //   141: invokevirtual getName : ()Ljava/lang/String;
    //   144: aastore
    //   145: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   148: invokespecial <init> : (Ljava/lang/String;)V
    //   151: aload_3
    //   152: athrow
    //   153: iload_2
    //   154: ifeq -> 220
    //   157: getstatic com/google/android/gms/internal/ads/dv1.d : Ljava/util/concurrent/ConcurrentMap;
    //   160: aload_0
    //   161: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   166: checkcast java/lang/Boolean
    //   169: invokevirtual booleanValue : ()Z
    //   172: ifne -> 220
    //   175: new java/security/GeneralSecurityException
    //   178: astore_1
    //   179: aload_0
    //   180: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   183: astore_0
    //   184: aload_0
    //   185: invokevirtual length : ()I
    //   188: ifeq -> 202
    //   191: ldc_w 'New keys are already disallowed for key type '
    //   194: aload_0
    //   195: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   198: astore_0
    //   199: goto -> 213
    //   202: new java/lang/String
    //   205: dup
    //   206: ldc_w 'New keys are already disallowed for key type '
    //   209: invokespecial <init> : (Ljava/lang/String;)V
    //   212: astore_0
    //   213: aload_1
    //   214: aload_0
    //   215: invokespecial <init> : (Ljava/lang/String;)V
    //   218: aload_1
    //   219: athrow
    //   220: ldc com/google/android/gms/internal/ads/dv1
    //   222: monitorexit
    //   223: return
    //   224: astore_0
    //   225: ldc com/google/android/gms/internal/ads/dv1
    //   227: monitorexit
    //   228: aload_0
    //   229: athrow
    // Exception table:
    //   from	to	target	type
    //   3	16	224	finally
    //   25	81	224	finally
    //   84	95	224	finally
    //   95	153	224	finally
    //   157	199	224	finally
    //   202	213	224	finally
    //   213	220	224	finally
  }
  
  private static <KeyProtoT extends u52> a o(nu1<KeyProtoT> paramnu1) {
    return new gv1(paramnu1);
  }
  
  public static u52 p(xz1 paramxz1) {
    // Byte code:
    //   0: ldc com/google/android/gms/internal/ads/dv1
    //   2: monitorenter
    //   3: aload_0
    //   4: invokevirtual J : ()Ljava/lang/String;
    //   7: invokestatic s : (Ljava/lang/String;)Lcom/google/android/gms/internal/ads/mu1;
    //   10: astore_1
    //   11: getstatic com/google/android/gms/internal/ads/dv1.d : Ljava/util/concurrent/ConcurrentMap;
    //   14: aload_0
    //   15: invokevirtual J : ()Ljava/lang/String;
    //   18: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   23: checkcast java/lang/Boolean
    //   26: invokevirtual booleanValue : ()Z
    //   29: ifeq -> 48
    //   32: aload_1
    //   33: aload_0
    //   34: invokevirtual K : ()Lcom/google/android/gms/internal/ads/zzejr;
    //   37: invokeinterface c : (Lcom/google/android/gms/internal/ads/zzejr;)Lcom/google/android/gms/internal/ads/u52;
    //   42: astore_0
    //   43: ldc com/google/android/gms/internal/ads/dv1
    //   45: monitorexit
    //   46: aload_0
    //   47: areturn
    //   48: new java/security/GeneralSecurityException
    //   51: astore_1
    //   52: aload_0
    //   53: invokevirtual J : ()Ljava/lang/String;
    //   56: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   59: astore_0
    //   60: aload_0
    //   61: invokevirtual length : ()I
    //   64: ifeq -> 77
    //   67: ldc 'newKey-operation not permitted for key type '
    //   69: aload_0
    //   70: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   73: astore_0
    //   74: goto -> 87
    //   77: new java/lang/String
    //   80: dup
    //   81: ldc 'newKey-operation not permitted for key type '
    //   83: invokespecial <init> : (Ljava/lang/String;)V
    //   86: astore_0
    //   87: aload_1
    //   88: aload_0
    //   89: invokespecial <init> : (Ljava/lang/String;)V
    //   92: aload_1
    //   93: athrow
    //   94: astore_0
    //   95: ldc com/google/android/gms/internal/ads/dv1
    //   97: monitorexit
    //   98: aload_0
    //   99: athrow
    // Exception table:
    //   from	to	target	type
    //   3	43	94	finally
    //   48	74	94	finally
    //   77	87	94	finally
    //   87	94	94	finally
  }
  
  private static b q(String paramString) {
    // Byte code:
    //   0: ldc com/google/android/gms/internal/ads/dv1
    //   2: monitorenter
    //   3: getstatic com/google/android/gms/internal/ads/dv1.b : Ljava/util/concurrent/ConcurrentMap;
    //   6: astore_1
    //   7: aload_1
    //   8: aload_0
    //   9: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   14: ifne -> 62
    //   17: new java/security/GeneralSecurityException
    //   20: astore_1
    //   21: aload_0
    //   22: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   25: astore_0
    //   26: aload_0
    //   27: invokevirtual length : ()I
    //   30: ifeq -> 44
    //   33: ldc_w 'No key manager found for key type '
    //   36: aload_0
    //   37: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   40: astore_0
    //   41: goto -> 55
    //   44: new java/lang/String
    //   47: dup
    //   48: ldc_w 'No key manager found for key type '
    //   51: invokespecial <init> : (Ljava/lang/String;)V
    //   54: astore_0
    //   55: aload_1
    //   56: aload_0
    //   57: invokespecial <init> : (Ljava/lang/String;)V
    //   60: aload_1
    //   61: athrow
    //   62: aload_1
    //   63: aload_0
    //   64: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   69: checkcast com/google/android/gms/internal/ads/dv1$b
    //   72: astore_0
    //   73: ldc com/google/android/gms/internal/ads/dv1
    //   75: monitorexit
    //   76: aload_0
    //   77: areturn
    //   78: astore_0
    //   79: ldc com/google/android/gms/internal/ads/dv1
    //   81: monitorexit
    //   82: aload_0
    //   83: athrow
    // Exception table:
    //   from	to	target	type
    //   3	41	78	finally
    //   44	55	78	finally
    //   55	62	78	finally
    //   62	73	78	finally
  }
  
  @Deprecated
  public static fu1<?> r(String paramString) {
    if (paramString != null) {
      String str;
      ConcurrentMap<String, fu1<?>> concurrentMap = e;
      Locale locale = Locale.US;
      fu1 fu1 = concurrentMap.get(paramString.toLowerCase(locale));
      if (fu1 == null) {
        str = String.format("no catalogue found for %s. ", new Object[] { paramString });
        String str1 = str;
        if (paramString.toLowerCase(locale).startsWith("tinkaead"))
          str1 = String.valueOf(str).concat("Maybe call AeadConfig.register()."); 
        if (!paramString.toLowerCase(locale).startsWith("tinkdeterministicaead")) {
          if (!paramString.toLowerCase(locale).startsWith("tinkstreamingaead")) {
            if (!paramString.toLowerCase(locale).startsWith("tinkhybriddecrypt") && !paramString.toLowerCase(locale).startsWith("tinkhybridencrypt")) {
              if (!paramString.toLowerCase(locale).startsWith("tinkmac")) {
                if (!paramString.toLowerCase(locale).startsWith("tinkpublickeysign") && !paramString.toLowerCase(locale).startsWith("tinkpublickeyverify")) {
                  str = str1;
                  if (paramString.toLowerCase(locale).startsWith("tink"))
                    str = String.valueOf(str1).concat("Maybe call TinkConfig.register()."); 
                } else {
                  str = String.valueOf(str1).concat("Maybe call SignatureConfig.register().");
                } 
              } else {
                str = String.valueOf(str1).concat("Maybe call MacConfig.register().");
              } 
            } else {
              str = String.valueOf(str1).concat("Maybe call HybridConfig.register().");
            } 
          } else {
            str = String.valueOf(str1).concat("Maybe call StreamingAeadConfig.register().");
          } 
        } else {
          str = String.valueOf(str1).concat("Maybe call DeterministicAeadConfig.register().");
        } 
        throw new GeneralSecurityException(str);
      } 
      return (fu1<?>)str;
    } 
    throw new IllegalArgumentException("catalogueName must be non-null.");
  }
  
  private static mu1<?> s(String paramString) {
    return q(paramString).c();
  }
  
  private static interface a {}
  
  private static interface b {
    <P> mu1<P> a(Class<P> param1Class);
    
    Set<Class<?>> b();
    
    mu1<?> c();
    
    Class<?> d();
    
    Class<?> e();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/dv1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */