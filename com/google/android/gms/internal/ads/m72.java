package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

final class m72 {
  private static final Logger a = Logger.getLogger(m72.class.getName());
  
  private static final Unsafe b;
  
  private static final Class<?> c = z22.b();
  
  private static final boolean d;
  
  private static final boolean e;
  
  private static final d f;
  
  private static final boolean g = q();
  
  private static final boolean h = p();
  
  private static final long i;
  
  private static final long j = y(boolean[].class);
  
  private static final long k = A(boolean[].class);
  
  private static final long l = y(int[].class);
  
  private static final long m = A(int[].class);
  
  private static final long n = y(long[].class);
  
  private static final long o = A(long[].class);
  
  private static final long p = y(float[].class);
  
  private static final long q = A(float[].class);
  
  private static final long r = y(double[].class);
  
  private static final long s = A(double[].class);
  
  private static final long t = y(Object[].class);
  
  private static final long u = A(Object[].class);
  
  private static final long v;
  
  private static final int w;
  
  static final boolean x;
  
  static {
    Field field = r();
    if (field == null || b == null) {
      l2 = -1L;
    } else {
      l2 = b.a.objectFieldOffset(field);
    } 
    v = l2;
    w = (int)(0x7L & l1);
    if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    x = bool2;
  }
  
  private static int A(Class<?> paramClass) {
    return h ? f.a.arrayIndexScale(paramClass) : -1;
  }
  
  static long B(Object paramObject, long paramLong) {
    return f.h(paramObject, paramLong);
  }
  
  private static boolean C(Class<?> paramClass) {
    if (!z22.a())
      return false; 
    try {
      Class<?> clazz = c;
      Class<boolean> clazz1 = boolean.class;
      clazz.getMethod("peekLong", new Class[] { paramClass, clazz1 });
      clazz.getMethod("pokeLong", new Class[] { paramClass, long.class, clazz1 });
      Class<int> clazz2 = int.class;
      clazz.getMethod("pokeInt", new Class[] { paramClass, clazz2, clazz1 });
      clazz.getMethod("peekInt", new Class[] { paramClass, clazz1 });
      clazz.getMethod("pokeByte", new Class[] { paramClass, byte.class });
      clazz.getMethod("peekByte", new Class[] { paramClass });
      clazz.getMethod("pokeByteArray", new Class[] { paramClass, byte[].class, clazz2, clazz2 });
      return true;
    } finally {
      paramClass = null;
    } 
  }
  
  static boolean D(Object paramObject, long paramLong) {
    return f.i(paramObject, paramLong);
  }
  
  static float E(Object paramObject, long paramLong) {
    return f.j(paramObject, paramLong);
  }
  
  static double F(Object paramObject, long paramLong) {
    return f.k(paramObject, paramLong);
  }
  
  static Object G(Object paramObject, long paramLong) {
    return f.a.getObject(paramObject, paramLong);
  }
  
  private static byte H(Object paramObject, long paramLong) {
    return (byte)(z(paramObject, 0xFFFFFFFFFFFFFFFCL & paramLong) >>> (int)(((paramLong ^ 0xFFFFFFFFFFFFFFFFL) & 0x3L) << 3L));
  }
  
  private static byte I(Object paramObject, long paramLong) {
    return (byte)(z(paramObject, 0xFFFFFFFFFFFFFFFCL & paramLong) >>> (int)((paramLong & 0x3L) << 3L));
  }
  
  private static boolean J(Object paramObject, long paramLong) {
    return (H(paramObject, paramLong) != 0);
  }
  
  private static boolean K(Object paramObject, long paramLong) {
    return (I(paramObject, paramLong) != 0);
  }
  
  static byte a(byte[] paramArrayOfbyte, long paramLong) {
    return f.l(paramArrayOfbyte, i + paramLong);
  }
  
  private static void b(Object paramObject, long paramLong, byte paramByte) {
    long l = 0xFFFFFFFFFFFFFFFCL & paramLong;
    int i = z(paramObject, l);
    int j = (((int)paramLong ^ 0xFFFFFFFF) & 0x3) << 3;
    k(paramObject, l, (0xFF & paramByte) << j | i & (255 << j ^ 0xFFFFFFFF));
  }
  
  static void c(Object paramObject, long paramLong, double paramDouble) {
    f.a(paramObject, paramLong, paramDouble);
  }
  
  static void d(Object paramObject, long paramLong, float paramFloat) {
    f.b(paramObject, paramLong, paramFloat);
  }
  
  static void e(Object paramObject, long paramLong1, long paramLong2) {
    f.c(paramObject, paramLong1, paramLong2);
  }
  
  static void f(Object paramObject1, long paramLong, Object paramObject2) {
    f.a.putObject(paramObject1, paramLong, paramObject2);
  }
  
  static void g(Object paramObject, long paramLong, boolean paramBoolean) {
    f.d(paramObject, paramLong, paramBoolean);
  }
  
  static void h(byte[] paramArrayOfbyte, long paramLong, byte paramByte) {
    f.f(paramArrayOfbyte, i + paramLong, paramByte);
  }
  
  private static Field i(Class<?> paramClass, String paramString) {
    try {
      Field field = paramClass.getDeclaredField(paramString);
    } finally {
      paramClass = null;
    } 
  }
  
  private static void j(Object paramObject, long paramLong, byte paramByte) {
    long l = 0xFFFFFFFFFFFFFFFCL & paramLong;
    int i = z(paramObject, l);
    int j = ((int)paramLong & 0x3) << 3;
    k(paramObject, l, (0xFF & paramByte) << j | i & (255 << j ^ 0xFFFFFFFF));
  }
  
  static void k(Object paramObject, long paramLong, int paramInt) {
    f.e(paramObject, paramLong, paramInt);
  }
  
  private static void l(Object paramObject, long paramLong, boolean paramBoolean) {
    b(paramObject, paramLong, (byte)paramBoolean);
  }
  
  static boolean m() {
    return h;
  }
  
  static boolean n() {
    return g;
  }
  
  static Unsafe o() {
    Exception exception;
    try {
      o72 o72 = new o72();
      this();
      Unsafe unsafe = AccessController.<Unsafe>doPrivileged(o72);
    } finally {
      exception = null;
    } 
  }
  
  private static boolean p() {
    Unsafe unsafe = b;
    if (unsafe == null)
      return false; 
    try {
      Class<?> clazz1 = unsafe.getClass();
      clazz1.getMethod("objectFieldOffset", new Class[] { Field.class });
      clazz1.getMethod("arrayBaseOffset", new Class[] { Class.class });
      clazz1.getMethod("arrayIndexScale", new Class[] { Class.class });
      Class<long> clazz = long.class;
      clazz1.getMethod("getInt", new Class[] { Object.class, clazz });
      clazz1.getMethod("putInt", new Class[] { Object.class, clazz, int.class });
      clazz1.getMethod("getLong", new Class[] { Object.class, clazz });
      clazz1.getMethod("putLong", new Class[] { Object.class, clazz, clazz });
      clazz1.getMethod("getObject", new Class[] { Object.class, clazz });
      clazz1.getMethod("putObject", new Class[] { Object.class, clazz, Object.class });
      if (z22.a())
        return true; 
      return true;
    } finally {
      Exception exception = null;
      Logger logger = a;
      Level level = Level.WARNING;
      String str = String.valueOf(exception);
      StringBuilder stringBuilder = new StringBuilder(str.length() + 71);
      stringBuilder.append("platform method missing - proto runtime falling back to safer methods: ");
      stringBuilder.append(str);
      logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", stringBuilder.toString());
    } 
  }
  
  private static boolean q() {
    Unsafe unsafe = b;
    if (unsafe == null)
      return false; 
    try {
      Class<?> clazz1 = unsafe.getClass();
      clazz1.getMethod("objectFieldOffset", new Class[] { Field.class });
      Class<long> clazz = long.class;
      clazz1.getMethod("getLong", new Class[] { Object.class, clazz });
      if (r() == null)
        return false; 
      if (z22.a())
        return true; 
      return true;
    } finally {
      Exception exception = null;
      Logger logger = a;
      Level level = Level.WARNING;
      String str = String.valueOf(exception);
      StringBuilder stringBuilder = new StringBuilder(str.length() + 71);
      stringBuilder.append("platform method missing - proto runtime falling back to safer methods: ");
      stringBuilder.append(str);
      logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", stringBuilder.toString());
    } 
  }
  
  private static Field r() {
    if (z22.a()) {
      Field field1 = i(Buffer.class, "effectiveDirectAddress");
      if (field1 != null)
        return field1; 
    } 
    Field field = i(Buffer.class, "address");
    return (field != null && field.getType() == long.class) ? field : null;
  }
  
  private static void t(Object paramObject, long paramLong, boolean paramBoolean) {
    j(paramObject, paramLong, (byte)paramBoolean);
  }
  
  static <T> T x(Class<T> paramClass) {
    try {
      return (T)b.allocateInstance(paramClass);
    } catch (InstantiationException instantiationException) {
      throw new IllegalStateException(instantiationException);
    } 
  }
  
  private static int y(Class<?> paramClass) {
    return h ? f.a.arrayBaseOffset(paramClass) : -1;
  }
  
  static int z(Object paramObject, long paramLong) {
    return f.g(paramObject, paramLong);
  }
  
  static {
    b b;
    long l2;
  }
  
  static {
    Unsafe unsafe = o();
    b = unsafe;
  }
  
  static {
    boolean bool1 = C(long.class);
    d = bool1;
    boolean bool2 = C(int.class);
    e = bool2;
    c c = null;
    if (unsafe != null)
      if (z22.a()) {
        if (bool1) {
          c = new c(unsafe);
        } else if (bool2) {
          a a = new a(unsafe);
        } 
      } else {
        b = new b(unsafe);
      }  
    f = b;
  }
  
  static {
    long l1 = y(byte[].class);
    i = l1;
  }
  
  private static final class a extends d {
    a(Unsafe param1Unsafe) {
      super(param1Unsafe);
    }
    
    public final void a(Object param1Object, long param1Long, double param1Double) {
      c(param1Object, param1Long, Double.doubleToLongBits(param1Double));
    }
    
    public final void b(Object param1Object, long param1Long, float param1Float) {
      e(param1Object, param1Long, Float.floatToIntBits(param1Float));
    }
    
    public final void d(Object param1Object, long param1Long, boolean param1Boolean) {
      if (m72.x) {
        m72.v(param1Object, param1Long, param1Boolean);
        return;
      } 
      m72.w(param1Object, param1Long, param1Boolean);
    }
    
    public final void f(Object param1Object, long param1Long, byte param1Byte) {
      if (m72.x) {
        m72.s(param1Object, param1Long, param1Byte);
        return;
      } 
      m72.u(param1Object, param1Long, param1Byte);
    }
    
    public final boolean i(Object param1Object, long param1Long) {
      return m72.x ? m72.N(param1Object, param1Long) : m72.O(param1Object, param1Long);
    }
    
    public final float j(Object param1Object, long param1Long) {
      return Float.intBitsToFloat(g(param1Object, param1Long));
    }
    
    public final double k(Object param1Object, long param1Long) {
      return Double.longBitsToDouble(h(param1Object, param1Long));
    }
    
    public final byte l(Object param1Object, long param1Long) {
      return m72.x ? m72.L(param1Object, param1Long) : m72.M(param1Object, param1Long);
    }
  }
  
  private static final class b extends d {
    b(Unsafe param1Unsafe) {
      super(param1Unsafe);
    }
    
    public final void a(Object param1Object, long param1Long, double param1Double) {
      this.a.putDouble(param1Object, param1Long, param1Double);
    }
    
    public final void b(Object param1Object, long param1Long, float param1Float) {
      this.a.putFloat(param1Object, param1Long, param1Float);
    }
    
    public final void d(Object param1Object, long param1Long, boolean param1Boolean) {
      this.a.putBoolean(param1Object, param1Long, param1Boolean);
    }
    
    public final void f(Object param1Object, long param1Long, byte param1Byte) {
      this.a.putByte(param1Object, param1Long, param1Byte);
    }
    
    public final boolean i(Object param1Object, long param1Long) {
      return this.a.getBoolean(param1Object, param1Long);
    }
    
    public final float j(Object param1Object, long param1Long) {
      return this.a.getFloat(param1Object, param1Long);
    }
    
    public final double k(Object param1Object, long param1Long) {
      return this.a.getDouble(param1Object, param1Long);
    }
    
    public final byte l(Object param1Object, long param1Long) {
      return this.a.getByte(param1Object, param1Long);
    }
  }
  
  private static final class c extends d {
    c(Unsafe param1Unsafe) {
      super(param1Unsafe);
    }
    
    public final void a(Object param1Object, long param1Long, double param1Double) {
      c(param1Object, param1Long, Double.doubleToLongBits(param1Double));
    }
    
    public final void b(Object param1Object, long param1Long, float param1Float) {
      e(param1Object, param1Long, Float.floatToIntBits(param1Float));
    }
    
    public final void d(Object param1Object, long param1Long, boolean param1Boolean) {
      if (m72.x) {
        m72.v(param1Object, param1Long, param1Boolean);
        return;
      } 
      m72.w(param1Object, param1Long, param1Boolean);
    }
    
    public final void f(Object param1Object, long param1Long, byte param1Byte) {
      if (m72.x) {
        m72.s(param1Object, param1Long, param1Byte);
        return;
      } 
      m72.u(param1Object, param1Long, param1Byte);
    }
    
    public final boolean i(Object param1Object, long param1Long) {
      return m72.x ? m72.N(param1Object, param1Long) : m72.O(param1Object, param1Long);
    }
    
    public final float j(Object param1Object, long param1Long) {
      return Float.intBitsToFloat(g(param1Object, param1Long));
    }
    
    public final double k(Object param1Object, long param1Long) {
      return Double.longBitsToDouble(h(param1Object, param1Long));
    }
    
    public final byte l(Object param1Object, long param1Long) {
      return m72.x ? m72.L(param1Object, param1Long) : m72.M(param1Object, param1Long);
    }
  }
  
  private static abstract class d {
    Unsafe a;
    
    d(Unsafe param1Unsafe) {
      this.a = param1Unsafe;
    }
    
    public abstract void a(Object param1Object, long param1Long, double param1Double);
    
    public abstract void b(Object param1Object, long param1Long, float param1Float);
    
    public final void c(Object param1Object, long param1Long1, long param1Long2) {
      this.a.putLong(param1Object, param1Long1, param1Long2);
    }
    
    public abstract void d(Object param1Object, long param1Long, boolean param1Boolean);
    
    public final void e(Object param1Object, long param1Long, int param1Int) {
      this.a.putInt(param1Object, param1Long, param1Int);
    }
    
    public abstract void f(Object param1Object, long param1Long, byte param1Byte);
    
    public final int g(Object param1Object, long param1Long) {
      return this.a.getInt(param1Object, param1Long);
    }
    
    public final long h(Object param1Object, long param1Long) {
      return this.a.getLong(param1Object, param1Long);
    }
    
    public abstract boolean i(Object param1Object, long param1Long);
    
    public abstract float j(Object param1Object, long param1Long);
    
    public abstract double k(Object param1Object, long param1Long);
    
    public abstract byte l(Object param1Object, long param1Long);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/m72.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */