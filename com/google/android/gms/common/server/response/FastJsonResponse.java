package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.server.converter.zab;
import com.google.android.gms.common.util.c;
import com.google.android.gms.common.util.l;
import com.google.android.gms.common.util.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class FastJsonResponse {
  private static void f(StringBuilder paramStringBuilder, Field paramField, Object paramObject) {
    int i = paramField.c;
    if (i == 11) {
      paramStringBuilder.append(((FastJsonResponse)paramField.i.cast(paramObject)).toString());
      return;
    } 
    if (i == 7) {
      paramStringBuilder.append("\"");
      paramStringBuilder.append(l.a((String)paramObject));
      paramStringBuilder.append("\"");
      return;
    } 
    paramStringBuilder.append(paramObject);
  }
  
  protected static <O, I> I g(Field<I, O> paramField, Object paramObject) {
    return (I)((Field.v0(paramField) != null) ? (Object)paramField.j((O)paramObject) : paramObject);
  }
  
  public abstract Map<String, Field<?, ?>> a();
  
  protected Object b(Field paramField) {
    StringBuilder stringBuilder;
    String str = paramField.g;
    if (paramField.i != null) {
      boolean bool;
      if (c(str) == null) {
        bool = true;
      } else {
        bool = false;
      } 
      t.o(bool, "Concrete field shouldn't be value object: %s", new Object[] { paramField.g });
      try {
        char c = Character.toUpperCase(str.charAt(0));
        String str1 = str.substring(1);
        int i = String.valueOf(str1).length();
        stringBuilder = new StringBuilder();
        this(i + 4);
        stringBuilder.append("get");
        stringBuilder.append(c);
        stringBuilder.append(str1);
        str1 = stringBuilder.toString();
        return getClass().getMethod(str1, new Class[0]).invoke(this, new Object[0]);
      } catch (Exception exception) {
        throw new RuntimeException(exception);
      } 
    } 
    return c((String)stringBuilder);
  }
  
  protected abstract Object c(String paramString);
  
  protected boolean d(Field paramField) {
    if (paramField.e == 11) {
      if (paramField.f)
        throw new UnsupportedOperationException("Concrete type arrays not supported"); 
      throw new UnsupportedOperationException("Concrete types not supported");
    } 
    return e(paramField.g);
  }
  
  protected abstract boolean e(String paramString);
  
  public String toString() {
    Map<String, Field<?, ?>> map = a();
    StringBuilder stringBuilder = new StringBuilder(100);
    for (String str : map.keySet()) {
      Field<Object, ?> field = (Field)map.get(str);
      if (d(field)) {
        ArrayList arrayList = (ArrayList)g(field, b(field));
        if (stringBuilder.length() == 0) {
          stringBuilder.append("{");
        } else {
          stringBuilder.append(",");
        } 
        stringBuilder.append("\"");
        stringBuilder.append(str);
        stringBuilder.append("\":");
        if (arrayList == null) {
          stringBuilder.append("null");
          continue;
        } 
        switch (field.e) {
          default:
            if (field.d) {
              ArrayList<ArrayList> arrayList1 = arrayList;
              stringBuilder.append("[");
              byte b = 0;
              int i = arrayList1.size();
              while (b < i) {
                if (b > 0)
                  stringBuilder.append(","); 
                arrayList = arrayList1.get(b);
                if (arrayList != null)
                  f(stringBuilder, field, arrayList); 
                b++;
              } 
              stringBuilder.append("]");
              continue;
            } 
            break;
          case 10:
            m.a(stringBuilder, (HashMap)arrayList);
            continue;
          case 9:
            stringBuilder.append("\"");
            stringBuilder.append(c.b((byte[])arrayList));
            stringBuilder.append("\"");
            continue;
          case 8:
            stringBuilder.append("\"");
            stringBuilder.append(c.a((byte[])arrayList));
            stringBuilder.append("\"");
            continue;
        } 
        f(stringBuilder, field, arrayList);
      } 
    } 
    if (stringBuilder.length() > 0) {
      stringBuilder.append("}");
    } else {
      stringBuilder.append("{}");
    } 
    return stringBuilder.toString();
  }
  
  public static class Field<I, O> extends AbstractSafeParcelable {
    public static final a CREATOR = new a();
    
    private final int b;
    
    protected final int c;
    
    protected final boolean d;
    
    protected final int e;
    
    protected final boolean f;
    
    protected final String g;
    
    protected final int h;
    
    protected final Class<? extends FastJsonResponse> i;
    
    private final String j;
    
    private zaj k;
    
    private FastJsonResponse.a<I, O> l;
    
    Field(int param1Int1, int param1Int2, boolean param1Boolean1, int param1Int3, boolean param1Boolean2, String param1String1, int param1Int4, String param1String2, zab param1zab) {
      this.b = param1Int1;
      this.c = param1Int2;
      this.d = param1Boolean1;
      this.e = param1Int3;
      this.f = param1Boolean2;
      this.g = param1String1;
      this.h = param1Int4;
      if (param1String2 == null) {
        this.i = null;
        this.j = null;
      } else {
        this.i = (Class)SafeParcelResponse.class;
        this.j = param1String2;
      } 
      if (param1zab == null) {
        this.l = null;
        return;
      } 
      this.l = param1zab.p0();
    }
    
    private Field(int param1Int1, boolean param1Boolean1, int param1Int2, boolean param1Boolean2, String param1String, int param1Int3, Class<? extends FastJsonResponse> param1Class, FastJsonResponse.a<I, O> param1a) {
      this.b = 1;
      this.c = param1Int1;
      this.d = param1Boolean1;
      this.e = param1Int2;
      this.f = param1Boolean2;
      this.g = param1String;
      this.h = param1Int3;
      this.i = param1Class;
      if (param1Class == null) {
        this.j = null;
      } else {
        this.j = param1Class.getCanonicalName();
      } 
      this.l = param1a;
    }
    
    public static Field<byte[], byte[]> o0(String param1String, int param1Int) {
      return (Field)new Field<byte, byte>(8, false, 8, false, param1String, param1Int, null, null);
    }
    
    public static <T extends FastJsonResponse> Field<T, T> p0(String param1String, int param1Int, Class<T> param1Class) {
      return new Field<T, T>(11, false, 11, false, param1String, param1Int, param1Class, null);
    }
    
    public static <T extends FastJsonResponse> Field<ArrayList<T>, ArrayList<T>> q0(String param1String, int param1Int, Class<T> param1Class) {
      return new Field<ArrayList<T>, ArrayList<T>>(11, true, 11, true, param1String, param1Int, param1Class, null);
    }
    
    public static Field<Integer, Integer> r0(String param1String, int param1Int) {
      return new Field<Integer, Integer>(0, false, 0, false, param1String, param1Int, null, null);
    }
    
    public static Field<String, String> s0(String param1String, int param1Int) {
      return new Field<String, String>(7, false, 7, false, param1String, param1Int, null, null);
    }
    
    public static Field<ArrayList<String>, ArrayList<String>> t0(String param1String, int param1Int) {
      return new Field<ArrayList<String>, ArrayList<String>>(7, true, 7, true, param1String, param1Int, null, null);
    }
    
    private final String x0() {
      String str1 = this.j;
      String str2 = str1;
      if (str1 == null)
        str2 = null; 
      return str2;
    }
    
    private final zab z0() {
      FastJsonResponse.a<I, O> a1 = this.l;
      return (a1 == null) ? null : zab.o0(a1);
    }
    
    public final Map<String, Field<?, ?>> A0() {
      t.j(this.j);
      t.j(this.k);
      return this.k.q0(this.j);
    }
    
    public final I j(O param1O) {
      return this.l.j(param1O);
    }
    
    public String toString() {
      r.a a1 = r.c(this).a("versionCode", Integer.valueOf(this.b)).a("typeIn", Integer.valueOf(this.c)).a("typeInArray", Boolean.valueOf(this.d)).a("typeOut", Integer.valueOf(this.e)).a("typeOutArray", Boolean.valueOf(this.f)).a("outputFieldName", this.g).a("safeParcelFieldId", Integer.valueOf(this.h)).a("concreteTypeName", x0());
      Class<? extends FastJsonResponse> clazz = this.i;
      if (clazz != null)
        a1.a("concreteType.class", clazz.getCanonicalName()); 
      FastJsonResponse.a<I, O> a2 = this.l;
      if (a2 != null)
        a1.a("converterName", a2.getClass().getCanonicalName()); 
      return a1.toString();
    }
    
    public int u0() {
      return this.h;
    }
    
    public final void w0(zaj param1zaj) {
      this.k = param1zaj;
    }
    
    public void writeToParcel(Parcel param1Parcel, int param1Int) {
      int i = com.google.android.gms.common.internal.safeparcel.a.a(param1Parcel);
      com.google.android.gms.common.internal.safeparcel.a.k(param1Parcel, 1, this.b);
      com.google.android.gms.common.internal.safeparcel.a.k(param1Parcel, 2, this.c);
      com.google.android.gms.common.internal.safeparcel.a.c(param1Parcel, 3, this.d);
      com.google.android.gms.common.internal.safeparcel.a.k(param1Parcel, 4, this.e);
      com.google.android.gms.common.internal.safeparcel.a.c(param1Parcel, 5, this.f);
      com.google.android.gms.common.internal.safeparcel.a.r(param1Parcel, 6, this.g, false);
      com.google.android.gms.common.internal.safeparcel.a.k(param1Parcel, 7, u0());
      com.google.android.gms.common.internal.safeparcel.a.r(param1Parcel, 8, x0(), false);
      com.google.android.gms.common.internal.safeparcel.a.q(param1Parcel, 9, (Parcelable)z0(), param1Int, false);
      com.google.android.gms.common.internal.safeparcel.a.b(param1Parcel, i);
    }
    
    public final boolean y0() {
      return (this.l != null);
    }
  }
  
  public static interface a<I, O> {
    I j(O param1O);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/server/response/FastJsonResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */