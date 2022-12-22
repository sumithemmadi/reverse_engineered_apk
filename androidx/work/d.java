package androidx.work;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class d {
  private static final String a = f.f("Data");
  
  public static final d b = (new a()).a();
  
  Map<String, Object> c;
  
  d() {}
  
  public d(d paramd) {
    this.c = new HashMap<String, Object>(paramd.c);
  }
  
  d(Map<String, ?> paramMap) {
    this.c = new HashMap<String, Object>(paramMap);
  }
  
  static Boolean[] a(boolean[] paramArrayOfboolean) {
    Boolean[] arrayOfBoolean = new Boolean[paramArrayOfboolean.length];
    for (byte b = 0; b < paramArrayOfboolean.length; b++)
      arrayOfBoolean[b] = Boolean.valueOf(paramArrayOfboolean[b]); 
    return arrayOfBoolean;
  }
  
  static Byte[] b(byte[] paramArrayOfbyte) {
    Byte[] arrayOfByte = new Byte[paramArrayOfbyte.length];
    for (byte b = 0; b < paramArrayOfbyte.length; b++)
      arrayOfByte[b] = Byte.valueOf(paramArrayOfbyte[b]); 
    return arrayOfByte;
  }
  
  static Double[] c(double[] paramArrayOfdouble) {
    Double[] arrayOfDouble = new Double[paramArrayOfdouble.length];
    for (byte b = 0; b < paramArrayOfdouble.length; b++)
      arrayOfDouble[b] = Double.valueOf(paramArrayOfdouble[b]); 
    return arrayOfDouble;
  }
  
  static Float[] d(float[] paramArrayOffloat) {
    Float[] arrayOfFloat = new Float[paramArrayOffloat.length];
    for (byte b = 0; b < paramArrayOffloat.length; b++)
      arrayOfFloat[b] = Float.valueOf(paramArrayOffloat[b]); 
    return arrayOfFloat;
  }
  
  static Integer[] e(int[] paramArrayOfint) {
    Integer[] arrayOfInteger = new Integer[paramArrayOfint.length];
    for (byte b = 0; b < paramArrayOfint.length; b++)
      arrayOfInteger[b] = Integer.valueOf(paramArrayOfint[b]); 
    return arrayOfInteger;
  }
  
  static Long[] f(long[] paramArrayOflong) {
    Long[] arrayOfLong = new Long[paramArrayOflong.length];
    for (byte b = 0; b < paramArrayOflong.length; b++)
      arrayOfLong[b] = Long.valueOf(paramArrayOflong[b]); 
    return arrayOfLong;
  }
  
  public static d g(byte[] paramArrayOfbyte) {
    // Byte code:
    //   0: aload_0
    //   1: arraylength
    //   2: sipush #10240
    //   5: if_icmpgt -> 226
    //   8: new java/util/HashMap
    //   11: dup
    //   12: invokespecial <init> : ()V
    //   15: astore_1
    //   16: new java/io/ByteArrayInputStream
    //   19: dup
    //   20: aload_0
    //   21: invokespecial <init> : ([B)V
    //   24: astore_2
    //   25: new java/io/ObjectInputStream
    //   28: astore_3
    //   29: aload_3
    //   30: aload_2
    //   31: invokespecial <init> : (Ljava/io/InputStream;)V
    //   34: aload_3
    //   35: astore_0
    //   36: aload_3
    //   37: invokevirtual readInt : ()I
    //   40: istore #4
    //   42: iload #4
    //   44: ifle -> 70
    //   47: aload_3
    //   48: astore_0
    //   49: aload_1
    //   50: aload_3
    //   51: invokevirtual readUTF : ()Ljava/lang/String;
    //   54: aload_3
    //   55: invokevirtual readObject : ()Ljava/lang/Object;
    //   58: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   63: pop
    //   64: iinc #4, -1
    //   67: goto -> 42
    //   70: aload_3
    //   71: invokevirtual close : ()V
    //   74: goto -> 88
    //   77: astore_0
    //   78: getstatic androidx/work/d.a : Ljava/lang/String;
    //   81: ldc 'Error in Data#fromByteArray: '
    //   83: aload_0
    //   84: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   87: pop
    //   88: aload_2
    //   89: invokevirtual close : ()V
    //   92: goto -> 174
    //   95: astore #5
    //   97: goto -> 121
    //   100: astore #5
    //   102: goto -> 121
    //   105: astore_3
    //   106: aconst_null
    //   107: astore_0
    //   108: goto -> 184
    //   111: astore_0
    //   112: goto -> 116
    //   115: astore_0
    //   116: aconst_null
    //   117: astore_3
    //   118: aload_0
    //   119: astore #5
    //   121: aload_3
    //   122: astore_0
    //   123: getstatic androidx/work/d.a : Ljava/lang/String;
    //   126: ldc 'Error in Data#fromByteArray: '
    //   128: aload #5
    //   130: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   133: pop
    //   134: aload_3
    //   135: ifnull -> 156
    //   138: aload_3
    //   139: invokevirtual close : ()V
    //   142: goto -> 156
    //   145: astore_0
    //   146: getstatic androidx/work/d.a : Ljava/lang/String;
    //   149: ldc 'Error in Data#fromByteArray: '
    //   151: aload_0
    //   152: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   155: pop
    //   156: aload_2
    //   157: invokevirtual close : ()V
    //   160: goto -> 174
    //   163: astore_0
    //   164: getstatic androidx/work/d.a : Ljava/lang/String;
    //   167: ldc 'Error in Data#fromByteArray: '
    //   169: aload_0
    //   170: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   173: pop
    //   174: new androidx/work/d
    //   177: dup
    //   178: aload_1
    //   179: invokespecial <init> : (Ljava/util/Map;)V
    //   182: areturn
    //   183: astore_3
    //   184: aload_0
    //   185: ifnull -> 206
    //   188: aload_0
    //   189: invokevirtual close : ()V
    //   192: goto -> 206
    //   195: astore_0
    //   196: getstatic androidx/work/d.a : Ljava/lang/String;
    //   199: ldc 'Error in Data#fromByteArray: '
    //   201: aload_0
    //   202: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   205: pop
    //   206: aload_2
    //   207: invokevirtual close : ()V
    //   210: goto -> 224
    //   213: astore_0
    //   214: getstatic androidx/work/d.a : Ljava/lang/String;
    //   217: ldc 'Error in Data#fromByteArray: '
    //   219: aload_0
    //   220: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   223: pop
    //   224: aload_3
    //   225: athrow
    //   226: new java/lang/IllegalStateException
    //   229: dup
    //   230: ldc 'Data cannot occupy more than 10240 bytes when serialized'
    //   232: invokespecial <init> : (Ljava/lang/String;)V
    //   235: astore_0
    //   236: goto -> 241
    //   239: aload_0
    //   240: athrow
    //   241: goto -> 239
    // Exception table:
    //   from	to	target	type
    //   25	34	115	java/io/IOException
    //   25	34	111	java/lang/ClassNotFoundException
    //   25	34	105	finally
    //   36	42	100	java/io/IOException
    //   36	42	95	java/lang/ClassNotFoundException
    //   36	42	183	finally
    //   49	64	100	java/io/IOException
    //   49	64	95	java/lang/ClassNotFoundException
    //   49	64	183	finally
    //   70	74	77	java/io/IOException
    //   88	92	163	java/io/IOException
    //   123	134	183	finally
    //   138	142	145	java/io/IOException
    //   156	160	163	java/io/IOException
    //   188	192	195	java/io/IOException
    //   206	210	213	java/io/IOException
  }
  
  public static byte[] k(d paramd) {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    d d1 = null;
    Map.Entry<String, Object> entry1 = null;
    entry2 = entry1;
    try {
      ObjectOutputStream objectOutputStream = new ObjectOutputStream();
      entry2 = entry1;
      this(byteArrayOutputStream);
      try {
        objectOutputStream.writeInt(paramd.j());
        for (Map.Entry<String, Object> entry2 : paramd.c.entrySet()) {
          objectOutputStream.writeUTF((String)entry2.getKey());
          objectOutputStream.writeObject(entry2.getValue());
        } 
        try {
          objectOutputStream.close();
        } catch (IOException iOException1) {
          Log.e(a, "Error in Data#toByteArray: ", iOException1);
        } 
        try {
          byteArrayOutputStream.close();
        } catch (IOException iOException1) {
          Log.e(a, "Error in Data#toByteArray: ", iOException1);
        } 
        if (byteArrayOutputStream.size() <= 10240)
          return byteArrayOutputStream.toByteArray(); 
        throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
      } catch (IOException iOException1) {
        ObjectOutputStream objectOutputStream1 = objectOutputStream;
      } finally {
        IOException iOException1;
        paramd = null;
      } 
    } catch (IOException iOException) {
      paramd = d1;
    } finally {}
    d d2 = paramd;
    Log.e(a, "Error in Data#toByteArray: ", iOException);
    d2 = paramd;
    byte[] arrayOfByte = byteArrayOutputStream.toByteArray();
    if (paramd != null)
      try {
        paramd.close();
      } catch (IOException iOException1) {
        Log.e(a, "Error in Data#toByteArray: ", iOException1);
      }  
    try {
      byteArrayOutputStream.close();
    } catch (IOException iOException1) {
      Log.e(a, "Error in Data#toByteArray: ", iOException1);
    } 
    return arrayOfByte;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || d.class != paramObject.getClass())
      return false; 
    paramObject = paramObject;
    return this.c.equals(((d)paramObject).c);
  }
  
  public Map<String, Object> h() {
    return Collections.unmodifiableMap(this.c);
  }
  
  public int hashCode() {
    return this.c.hashCode() * 31;
  }
  
  public String i(String paramString) {
    paramString = (String)this.c.get(paramString);
    return (paramString instanceof String) ? paramString : null;
  }
  
  public int j() {
    return this.c.size();
  }
  
  public static final class a {
    private Map<String, Object> a = new HashMap<String, Object>();
    
    public d a() {
      d d = new d(this.a);
      d.k(d);
      return d;
    }
    
    public a b(String param1String, Object param1Object) {
      if (param1Object == null) {
        this.a.put(param1String, null);
      } else {
        Class<?> clazz = param1Object.getClass();
        if (clazz == Boolean.class || clazz == Byte.class || clazz == Integer.class || clazz == Long.class || clazz == Float.class || clazz == Double.class || clazz == String.class || clazz == Boolean[].class || clazz == Byte[].class || clazz == Integer[].class || clazz == Long[].class || clazz == Float[].class || clazz == Double[].class || clazz == String[].class) {
          this.a.put(param1String, param1Object);
          return this;
        } 
        if (clazz == boolean[].class) {
          this.a.put(param1String, d.a((boolean[])param1Object));
        } else if (clazz == byte[].class) {
          this.a.put(param1String, d.b((byte[])param1Object));
        } else if (clazz == int[].class) {
          this.a.put(param1String, d.e((int[])param1Object));
        } else if (clazz == long[].class) {
          this.a.put(param1String, d.f((long[])param1Object));
        } else if (clazz == float[].class) {
          this.a.put(param1String, d.d((float[])param1Object));
        } else if (clazz == double[].class) {
          this.a.put(param1String, d.c((double[])param1Object));
        } else {
          throw new IllegalArgumentException(String.format("Key %s has invalid type %s", new Object[] { param1String, clazz }));
        } 
      } 
      return this;
    }
    
    public a c(d param1d) {
      d(param1d.c);
      return this;
    }
    
    public a d(Map<String, Object> param1Map) {
      for (Map.Entry<String, Object> entry : param1Map.entrySet())
        b((String)entry.getKey(), entry.getValue()); 
      return this;
    }
    
    public a e(String param1String1, String param1String2) {
      this.a.put(param1String1, param1String2);
      return this;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */