package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.util.b;
import com.google.android.gms.common.util.c;
import com.google.android.gms.common.util.l;
import com.google.android.gms.common.util.m;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class SafeParcelResponse extends FastSafeParcelableJsonResponse {
  public static final Parcelable.Creator<SafeParcelResponse> CREATOR = new e();
  
  private final int b;
  
  private final Parcel c;
  
  private final int d;
  
  private final zaj e;
  
  private final String f;
  
  private int g;
  
  private int h;
  
  SafeParcelResponse(int paramInt, Parcel paramParcel, zaj paramzaj) {
    this.b = paramInt;
    this.c = (Parcel)t.j(paramParcel);
    this.d = 2;
    this.e = paramzaj;
    if (paramzaj == null) {
      this.f = null;
    } else {
      this.f = paramzaj.p0();
    } 
    this.g = 2;
  }
  
  private static void h(StringBuilder paramStringBuilder, int paramInt, Object paramObject) {
    switch (paramInt) {
      default:
        paramStringBuilder = new StringBuilder(26);
        paramStringBuilder.append("Unknown type = ");
        paramStringBuilder.append(paramInt);
        throw new IllegalArgumentException(paramStringBuilder.toString());
      case 11:
        throw new IllegalArgumentException("Method does not accept concrete type.");
      case 10:
        m.a(paramStringBuilder, (HashMap)paramObject);
        return;
      case 9:
        paramStringBuilder.append("\"");
        paramStringBuilder.append(c.b((byte[])paramObject));
        paramStringBuilder.append("\"");
        return;
      case 8:
        paramStringBuilder.append("\"");
        paramStringBuilder.append(c.a((byte[])paramObject));
        paramStringBuilder.append("\"");
        return;
      case 7:
        paramStringBuilder.append("\"");
        paramStringBuilder.append(l.a(paramObject.toString()));
        paramStringBuilder.append("\"");
        return;
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
        break;
    } 
    paramStringBuilder.append(paramObject);
  }
  
  private final void i(StringBuilder paramStringBuilder, Map<String, FastJsonResponse.Field<?, ?>> paramMap, Parcel paramParcel) {
    SparseArray sparseArray = new SparseArray();
    for (Map.Entry<String, FastJsonResponse.Field<?, ?>> entry : paramMap.entrySet())
      sparseArray.put(((FastJsonResponse.Field)entry.getValue()).u0(), entry); 
    paramStringBuilder.append('{');
    int i = SafeParcelReader.K(paramParcel);
    int j = 0;
    while (paramParcel.dataPosition() < i) {
      int k = SafeParcelReader.C(paramParcel);
      Map.Entry entry = (Map.Entry)sparseArray.get(SafeParcelReader.v(k));
      if (entry != null) {
        if (j)
          paramStringBuilder.append(","); 
        String str = (String)entry.getKey();
        FastJsonResponse.Field<?, ?> field = (FastJsonResponse.Field)entry.getValue();
        paramStringBuilder.append("\"");
        paramStringBuilder.append(str);
        paramStringBuilder.append("\":");
        if (field.y0()) {
          Bundle bundle;
          HashMap<Object, Object> hashMap;
          switch (field.e) {
            default:
              j = field.e;
              paramStringBuilder = new StringBuilder(36);
              paramStringBuilder.append("Unknown field out type = ");
              paramStringBuilder.append(j);
              throw new IllegalArgumentException(paramStringBuilder.toString());
            case 11:
              throw new IllegalArgumentException("Method does not accept concrete type.");
            case 10:
              bundle = SafeParcelReader.f(paramParcel, k);
              hashMap = new HashMap<Object, Object>();
              for (String str1 : bundle.keySet())
                hashMap.put(str1, bundle.getString(str1)); 
              j(paramStringBuilder, field, FastJsonResponse.g(field, hashMap));
              break;
            case 8:
            case 9:
              j(paramStringBuilder, field, FastJsonResponse.g(field, SafeParcelReader.g(paramParcel, k)));
              break;
            case 7:
              j(paramStringBuilder, field, FastJsonResponse.g(field, SafeParcelReader.p(paramParcel, k)));
              break;
            case 6:
              j(paramStringBuilder, field, FastJsonResponse.g(field, Boolean.valueOf(SafeParcelReader.w(paramParcel, k))));
              break;
            case 5:
              j(paramStringBuilder, field, FastJsonResponse.g(field, SafeParcelReader.a(paramParcel, k)));
              break;
            case 4:
              j(paramStringBuilder, field, FastJsonResponse.g(field, Double.valueOf(SafeParcelReader.y(paramParcel, k))));
              break;
            case 3:
              j(paramStringBuilder, field, FastJsonResponse.g(field, Float.valueOf(SafeParcelReader.A(paramParcel, k))));
              break;
            case 2:
              j(paramStringBuilder, field, FastJsonResponse.g(field, Long.valueOf(SafeParcelReader.G(paramParcel, k))));
              break;
            case 1:
              j(paramStringBuilder, field, FastJsonResponse.g(field, SafeParcelReader.c(paramParcel, k)));
              break;
            case 0:
              j(paramStringBuilder, field, FastJsonResponse.g(field, Integer.valueOf(SafeParcelReader.E(paramParcel, k))));
              break;
          } 
        } else if (field.f) {
          Parcel[] arrayOfParcel;
          paramStringBuilder.append("[");
          switch (field.e) {
            default:
              throw new IllegalStateException("Unknown field type out.");
            case 11:
              arrayOfParcel = SafeParcelReader.n(paramParcel, k);
              k = arrayOfParcel.length;
              for (j = 0; j < k; j++) {
                if (j > 0)
                  paramStringBuilder.append(","); 
                arrayOfParcel[j].setDataPosition(0);
                i(paramStringBuilder, field.A0(), arrayOfParcel[j]);
              } 
              break;
            case 8:
            case 9:
            case 10:
              throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
            case 7:
              b.i(paramStringBuilder, SafeParcelReader.q(paramParcel, k));
              break;
            case 6:
              b.h(paramStringBuilder, SafeParcelReader.e(paramParcel, k));
              break;
            case 5:
              b.g(paramStringBuilder, (Object[])SafeParcelReader.b(paramParcel, k));
              break;
            case 4:
              b.c(paramStringBuilder, SafeParcelReader.h(paramParcel, k));
              break;
            case 3:
              b.d(paramStringBuilder, SafeParcelReader.i(paramParcel, k));
              break;
            case 2:
              b.f(paramStringBuilder, SafeParcelReader.l(paramParcel, k));
              break;
            case 1:
              b.g(paramStringBuilder, (Object[])SafeParcelReader.d(paramParcel, k));
              break;
            case 0:
              b.e(paramStringBuilder, SafeParcelReader.j(paramParcel, k));
              break;
          } 
          paramStringBuilder.append("]");
        } else {
          Bundle bundle;
          byte[] arrayOfByte;
          String str1;
          Parcel parcel;
          Set set;
          Iterator<String> iterator;
          switch (field.e) {
            default:
              throw new IllegalStateException("Unknown field type out");
            case 11:
              parcel = SafeParcelReader.m(paramParcel, k);
              parcel.setDataPosition(0);
              i(paramStringBuilder, field.A0(), parcel);
              break;
            case 10:
              bundle = SafeParcelReader.f(paramParcel, k);
              set = bundle.keySet();
              set.size();
              paramStringBuilder.append("{");
              iterator = set.iterator();
              for (j = 1; iterator.hasNext(); j = 0) {
                String str2 = iterator.next();
                if (j == 0)
                  paramStringBuilder.append(","); 
                paramStringBuilder.append("\"");
                paramStringBuilder.append(str2);
                paramStringBuilder.append("\"");
                paramStringBuilder.append(":");
                paramStringBuilder.append("\"");
                paramStringBuilder.append(l.a(bundle.getString(str2)));
                paramStringBuilder.append("\"");
              } 
              paramStringBuilder.append("}");
              break;
            case 9:
              arrayOfByte = SafeParcelReader.g(paramParcel, k);
              paramStringBuilder.append("\"");
              paramStringBuilder.append(c.b(arrayOfByte));
              paramStringBuilder.append("\"");
              break;
            case 8:
              arrayOfByte = SafeParcelReader.g(paramParcel, k);
              paramStringBuilder.append("\"");
              paramStringBuilder.append(c.a(arrayOfByte));
              paramStringBuilder.append("\"");
              break;
            case 7:
              str1 = SafeParcelReader.p(paramParcel, k);
              paramStringBuilder.append("\"");
              paramStringBuilder.append(l.a(str1));
              paramStringBuilder.append("\"");
              break;
            case 6:
              paramStringBuilder.append(SafeParcelReader.w(paramParcel, k));
              break;
            case 5:
              paramStringBuilder.append(SafeParcelReader.a(paramParcel, k));
              break;
            case 4:
              paramStringBuilder.append(SafeParcelReader.y(paramParcel, k));
              break;
            case 3:
              paramStringBuilder.append(SafeParcelReader.A(paramParcel, k));
              break;
            case 2:
              paramStringBuilder.append(SafeParcelReader.G(paramParcel, k));
              break;
            case 1:
              paramStringBuilder.append(SafeParcelReader.c(paramParcel, k));
              break;
            case 0:
              paramStringBuilder.append(SafeParcelReader.E(paramParcel, k));
              break;
          } 
        } 
        j = 1;
      } 
    } 
    if (paramParcel.dataPosition() == i) {
      paramStringBuilder.append('}');
      return;
    } 
    paramStringBuilder = new StringBuilder(37);
    paramStringBuilder.append("Overread allowed size end=");
    paramStringBuilder.append(i);
    SafeParcelReader.ParseException parseException = new SafeParcelReader.ParseException(paramStringBuilder.toString(), paramParcel);
    throw parseException;
  }
  
  private final void j(StringBuilder paramStringBuilder, FastJsonResponse.Field<?, ?> paramField, Object paramObject) {
    if (paramField.d) {
      paramObject = paramObject;
      paramStringBuilder.append("[");
      int i = paramObject.size();
      for (byte b = 0; b < i; b++) {
        if (b != 0)
          paramStringBuilder.append(","); 
        h(paramStringBuilder, paramField.c, paramObject.get(b));
      } 
      paramStringBuilder.append("]");
      return;
    } 
    h(paramStringBuilder, paramField.c, paramObject);
  }
  
  private final Parcel k() {
    int i = this.g;
    if (i != 0) {
      if (i != 1)
        return this.c; 
    } else {
      this.h = a.a(this.c);
    } 
    a.b(this.c, this.h);
    this.g = 2;
    return this.c;
  }
  
  public Map<String, FastJsonResponse.Field<?, ?>> a() {
    zaj zaj1 = this.e;
    return (zaj1 == null) ? null : zaj1.q0(this.f);
  }
  
  public Object c(String paramString) {
    throw new UnsupportedOperationException("Converting to JSON does not require this method.");
  }
  
  public boolean e(String paramString) {
    throw new UnsupportedOperationException("Converting to JSON does not require this method.");
  }
  
  public String toString() {
    t.k(this.e, "Cannot convert to JSON on client side.");
    Parcel parcel = k();
    parcel.setDataPosition(0);
    StringBuilder stringBuilder = new StringBuilder(100);
    i(stringBuilder, this.e.q0(this.f), parcel);
    return stringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    StringBuilder stringBuilder;
    Parcelable parcelable;
    int i = a.a(paramParcel);
    a.k(paramParcel, 1, this.b);
    a.p(paramParcel, 2, k(), false);
    int j = this.d;
    if (j != 0) {
      if (j != 1) {
        if (j == 2) {
          parcelable = (Parcelable)this.e;
        } else {
          paramInt = this.d;
          stringBuilder = new StringBuilder(34);
          stringBuilder.append("Invalid creation type: ");
          stringBuilder.append(paramInt);
          throw new IllegalStateException(stringBuilder.toString());
        } 
      } else {
        parcelable = (Parcelable)this.e;
      } 
    } else {
      parcelable = null;
    } 
    a.q((Parcel)stringBuilder, 3, parcelable, paramInt, false);
    a.b((Parcel)stringBuilder, i);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/server/response/SafeParcelResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */