package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class k42<MessageType extends k42<MessageType, BuilderType>, BuilderType extends k42.b<MessageType, BuilderType>> extends w22<MessageType, BuilderType> {
  private static Map<Object, k42<?, ?>> zziqm = new ConcurrentHashMap<Object, k42<?, ?>>();
  
  protected j72 zziqk = j72.h();
  
  private int zziql = -1;
  
  protected static <T extends k42<?, ?>> void A(Class<T> paramClass, T paramT) {
    zziqm.put(paramClass, (k42<?, ?>)paramT);
  }
  
  protected static final <T extends k42<T, ?>> boolean B(T paramT, boolean paramBoolean) {
    byte b = ((Byte)paramT.x(e.a, null, null)).byteValue();
    if (b == 1)
      return true; 
    if (b == 0)
      return false; 
    boolean bool = i62.b().<T>a(paramT).a(paramT);
    if (paramBoolean) {
      Object object;
      int i = e.b;
      if (bool) {
        T t = paramT;
      } else {
        object = null;
      } 
      paramT.x(i, object, null);
    } 
    return bool;
  }
  
  private static <T extends k42<T, ?>> T C(T paramT, zzejr paramzzejr, y32 paramy32) {
    try {
      o32 o32 = paramzzejr.zzbgk();
      paramT = r(paramT, o32, paramy32);
      try {
        o32.x(0);
        return paramT;
      } catch (zzelo zzelo) {
        throw zzelo.zzl(paramT);
      } 
    } catch (zzelo zzelo) {
      throw zzelo;
    } 
  }
  
  protected static q42 F() {
    return n42.f();
  }
  
  protected static v42 G() {
    return j52.f();
  }
  
  protected static <E> u42<E> H() {
    return h62.c();
  }
  
  static <T extends k42<?, ?>> T I(Class<T> paramClass) {
    k42<?, ?> k421 = zziqm.get(paramClass);
    k42<?, ?> k422 = k421;
    if (k421 == null)
      try {
        Class.forName(paramClass.getName(), true, paramClass.getClassLoader());
        k422 = zziqm.get(paramClass);
      } catch (ClassNotFoundException classNotFoundException) {
        throw new IllegalStateException("Class initialization cannot fail.", classNotFoundException);
      }  
    k421 = k422;
    if (k422 == null) {
      k421 = (k42)((k42)m72.<k42>x((Class<k42>)classNotFoundException)).x(e.f, null, null);
      if (k421 != null) {
        zziqm.put(classNotFoundException, k421);
      } else {
        throw new IllegalStateException();
      } 
    } 
    return (T)k421;
  }
  
  private static <T extends k42<T, ?>> T n(T paramT) {
    if (paramT == null || paramT.isInitialized())
      return paramT; 
    throw (new zzelo((new zzeoc(paramT)).getMessage())).zzl(paramT);
  }
  
  protected static <T extends k42<T, ?>> T p(T paramT, zzejr paramzzejr) {
    return n(n(C(paramT, paramzzejr, y32.b())));
  }
  
  protected static <T extends k42<T, ?>> T q(T paramT, zzejr paramzzejr, y32 paramy32) {
    return n(C(paramT, paramzzejr, paramy32));
  }
  
  private static <T extends k42<T, ?>> T r(T paramT, o32 paramo32, y32 paramy32) {
    k42 k421 = (k42)paramT.x(e.d, null, null);
    try {
      o62<k42> o62 = i62.b().a(k421);
      o62.d(k421, u32.N(paramo32), paramy32);
      o62.e(k421);
      return (T)k421;
    } catch (IOException iOException) {
      if (iOException.getCause() instanceof zzelo)
        throw (zzelo)iOException.getCause(); 
      throw (new zzelo(iOException.getMessage())).zzl(k421);
    } catch (RuntimeException runtimeException) {
      if (runtimeException.getCause() instanceof zzelo)
        throw (zzelo)runtimeException.getCause(); 
      throw runtimeException;
    } 
  }
  
  protected static <T extends k42<T, ?>> T s(T paramT, byte[] paramArrayOfbyte) {
    return n(t(paramT, paramArrayOfbyte, 0, paramArrayOfbyte.length, y32.b()));
  }
  
  private static <T extends k42<T, ?>> T t(T paramT, byte[] paramArrayOfbyte, int paramInt1, int paramInt2, y32 paramy32) {
    k42 k421 = (k42)paramT.x(e.d, null, null);
    try {
      o62<k42> o62 = i62.b().a(k421);
      b32 b32 = new b32();
      this(paramy32);
      o62.h(k421, paramArrayOfbyte, 0, paramInt2, b32);
      o62.e(k421);
      if (k421.zzilm == 0)
        return (T)k421; 
      RuntimeException runtimeException = new RuntimeException();
      this();
      throw runtimeException;
    } catch (IOException iOException) {
      if (iOException.getCause() instanceof zzelo)
        throw (zzelo)iOException.getCause(); 
      throw (new zzelo(iOException.getMessage())).zzl(k421);
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw zzelo.zzbja().zzl(k421);
    } 
  }
  
  protected static <T extends k42<T, ?>> T u(T paramT, byte[] paramArrayOfbyte, y32 paramy32) {
    return n(t(paramT, paramArrayOfbyte, 0, paramArrayOfbyte.length, paramy32));
  }
  
  protected static q42 v(q42 paramq42) {
    int i = paramq42.size();
    if (i == 0) {
      i = 10;
    } else {
      i <<= 1;
    } 
    return paramq42.F(i);
  }
  
  protected static <E> u42<E> w(u42<E> paramu42) {
    int i = paramu42.size();
    if (i == 0) {
      i = 10;
    } else {
      i <<= 1;
    } 
    return paramu42.a0(i);
  }
  
  protected static Object y(u52 paramu52, String paramString, Object[] paramArrayOfObject) {
    return new k62(paramu52, paramString, paramArrayOfObject);
  }
  
  static Object z(Method paramMethod, Object paramObject, Object... paramVarArgs) {
    try {
      return paramMethod.invoke(paramObject, paramVarArgs);
    } catch (IllegalAccessException illegalAccessException) {
      throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", illegalAccessException);
    } catch (InvocationTargetException invocationTargetException) {
      Throwable throwable = invocationTargetException.getCause();
      if (!(throwable instanceof RuntimeException)) {
        if (throwable instanceof Error)
          throw (Error)throwable; 
        throw new RuntimeException("Unexpected exception thrown by generated accessor method.", throwable);
      } 
      throw (RuntimeException)throwable;
    } 
  }
  
  protected final <MessageType extends k42<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> BuilderType D() {
    return (BuilderType)x(e.e, null, null);
  }
  
  public final BuilderType E() {
    b b = (b)x(e.e, null, null);
    b.r(this);
    return (BuilderType)b;
  }
  
  public final int b() {
    if (this.zziql == -1)
      this.zziql = i62.b().<k42>a(this).f(this); 
    return this.zziql;
  }
  
  final int e() {
    return this.zziql;
  }
  
  public boolean equals(Object paramObject) {
    return (this == paramObject) ? true : ((paramObject == null) ? false : ((getClass() != paramObject.getClass()) ? false : i62.b().<k42>a(this).g(this, (k42)paramObject)));
  }
  
  public int hashCode() {
    int i = this.zzilm;
    if (i != 0)
      return i; 
    i = i62.b().<k42>a(this).j(this);
    this.zzilm = i;
    return i;
  }
  
  public final void i(zzekl paramzzekl) {
    i62.b().<k42>a(this).b(this, x32.P(paramzzekl));
  }
  
  public final boolean isInitialized() {
    return B(this, true);
  }
  
  final void m(int paramInt) {
    this.zziql = paramInt;
  }
  
  public String toString() {
    return v52.a(this, super.toString());
  }
  
  protected abstract Object x(int paramInt, Object paramObject1, Object paramObject2);
  
  protected static final class a<T extends k42<T, ?>> extends x22<T> {
    private final T b;
    
    public a(T param1T) {
      this.b = param1T;
    }
  }
  
  public static class b<MessageType extends k42<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends v22<MessageType, BuilderType> {
    private final MessageType b;
    
    protected MessageType c;
    
    protected boolean d;
    
    protected b(MessageType param1MessageType) {
      this.b = param1MessageType;
      this.c = (MessageType)param1MessageType.x(k42.e.d, null, null);
      this.d = false;
    }
    
    private static void q(MessageType param1MessageType1, MessageType param1MessageType2) {
      i62.b().<MessageType>a(param1MessageType1).c(param1MessageType1, param1MessageType2);
    }
    
    private final BuilderType s(byte[] param1ArrayOfbyte, int param1Int1, int param1Int2, y32 param1y32) {
      if (this.d) {
        t();
        this.d = false;
      } 
      try {
        o62<MessageType> o62 = i62.b().a(this.c);
        MessageType messageType = this.c;
        b32 b32 = new b32();
        this(param1y32);
        o62.h(messageType, param1ArrayOfbyte, 0, param1Int2, b32);
        return (BuilderType)this;
      } catch (zzelo zzelo) {
        throw zzelo;
      } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
        throw zzelo.zzbja();
      } catch (IOException iOException) {
        throw new RuntimeException("Reading from byte array should not throw IOException.", iOException);
      } 
    }
    
    public final BuilderType r(MessageType param1MessageType) {
      if (this.d) {
        t();
        this.d = false;
      } 
      q(this.c, param1MessageType);
      return (BuilderType)this;
    }
    
    protected void t() {
      k42 k421 = (k42)this.c.x(k42.e.d, null, null);
      q((MessageType)k421, this.c);
      this.c = (MessageType)k421;
    }
    
    public MessageType v() {
      if (this.d)
        return this.c; 
      MessageType messageType = this.c;
      i62.b().<MessageType>a(messageType).e(messageType);
      this.d = true;
      return this.c;
    }
    
    public final MessageType w() {
      k42 k421 = (k42)d();
      if (k421.isInitialized())
        return (MessageType)k421; 
      throw new zzeoc(k421);
    }
  }
  
  static final class c implements f42<c> {
    public final t52 d(t52 param1t52, u52 param1u52) {
      throw new NoSuchMethodError();
    }
    
    public final zzeos g() {
      throw new NoSuchMethodError();
    }
    
    public final zzeov h() {
      throw new NoSuchMethodError();
    }
    
    public final boolean j() {
      throw new NoSuchMethodError();
    }
    
    public final boolean o() {
      throw new NoSuchMethodError();
    }
    
    public final y52 p(y52 param1y521, y52 param1y522) {
      throw new NoSuchMethodError();
    }
    
    public final int zzv() {
      throw new NoSuchMethodError();
    }
  }
  
  public static abstract class d<MessageType extends d<MessageType, BuilderType>, BuilderType> extends k42<MessageType, BuilderType> implements w52 {
    protected e42<k42.c> zziqr = e42.o();
    
    final e42<k42.c> J() {
      if (this.zziqr.b())
        this.zziqr = (e42<k42.c>)this.zziqr.clone(); 
      return this.zziqr;
    }
  }
  
  public enum e {
    a, b, c, d, e, f, g;
    
    public static int[] a() {
      return (int[])h.clone();
    }
  }
  
  public static final class f<ContainingType extends u52, Type> extends z32<ContainingType, Type> {}
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/k42.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */