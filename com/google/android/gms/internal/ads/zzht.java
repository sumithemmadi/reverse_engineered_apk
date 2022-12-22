package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaFormat;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class zzht implements Parcelable {
  public static final Parcelable.Creator<zzht> CREATOR = new mc2();
  
  private final int A;
  
  private int B;
  
  private final String b;
  
  public final int c;
  
  public final String d;
  
  private final zzmh e;
  
  public final String f;
  
  public final String g;
  
  public final int h;
  
  public final List<byte[]> i;
  
  public final zzjo j;
  
  public final int k;
  
  public final int l;
  
  public final float m;
  
  public final int n;
  
  public final float o;
  
  private final int p;
  
  private final byte[] q;
  
  private final zzpy r;
  
  public final int s;
  
  public final int t;
  
  public final int u;
  
  private final int v;
  
  private final int w;
  
  public final long x;
  
  public final int y;
  
  public final String z;
  
  zzht(Parcel paramParcel) {
    byte[] arrayOfByte;
    this.b = paramParcel.readString();
    this.f = paramParcel.readString();
    this.g = paramParcel.readString();
    this.d = paramParcel.readString();
    this.c = paramParcel.readInt();
    this.h = paramParcel.readInt();
    this.k = paramParcel.readInt();
    this.l = paramParcel.readInt();
    this.m = paramParcel.readFloat();
    this.n = paramParcel.readInt();
    this.o = paramParcel.readFloat();
    int i = paramParcel.readInt();
    boolean bool = false;
    if (i != 0) {
      i = 1;
    } else {
      i = 0;
    } 
    if (i != 0) {
      arrayOfByte = paramParcel.createByteArray();
    } else {
      arrayOfByte = null;
    } 
    this.q = arrayOfByte;
    this.p = paramParcel.readInt();
    this.r = (zzpy)paramParcel.readParcelable(zzpy.class.getClassLoader());
    this.s = paramParcel.readInt();
    this.t = paramParcel.readInt();
    this.u = paramParcel.readInt();
    this.v = paramParcel.readInt();
    this.w = paramParcel.readInt();
    this.y = paramParcel.readInt();
    this.z = paramParcel.readString();
    this.A = paramParcel.readInt();
    this.x = paramParcel.readLong();
    int j = paramParcel.readInt();
    this.i = (List)new ArrayList<byte>(j);
    for (i = bool; i < j; i++)
      this.i.add(paramParcel.createByteArray()); 
    this.j = (zzjo)paramParcel.readParcelable(zzjo.class.getClassLoader());
    this.e = (zzmh)paramParcel.readParcelable(zzmh.class.getClassLoader());
  }
  
  private zzht(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, int paramInt5, float paramFloat2, byte[] paramArrayOfbyte, int paramInt6, zzpy paramzzpy, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12, String paramString5, int paramInt13, long paramLong, List<byte[]> paramList, zzjo paramzzjo, zzmh paramzzmh) {
    this.b = paramString1;
    this.f = paramString2;
    this.g = paramString3;
    this.d = paramString4;
    this.c = paramInt1;
    this.h = paramInt2;
    this.k = paramInt3;
    this.l = paramInt4;
    this.m = paramFloat1;
    this.n = paramInt5;
    this.o = paramFloat2;
    this.q = paramArrayOfbyte;
    this.p = paramInt6;
    this.r = paramzzpy;
    this.s = paramInt7;
    this.t = paramInt8;
    this.u = paramInt9;
    this.v = paramInt10;
    this.w = paramInt11;
    this.y = paramInt12;
    this.z = paramString5;
    this.A = paramInt13;
    this.x = paramLong;
    if (paramList == null)
      paramList = Collections.emptyList(); 
    this.i = paramList;
    this.j = paramzzjo;
    this.e = paramzzmh;
  }
  
  public static zzht c(String paramString1, String paramString2, long paramLong) {
    return new zzht(null, null, paramString2, null, -1, -1, -1, -1, -1.0F, -1, -1.0F, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, null, null);
  }
  
  public static zzht d(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, List<byte[]> paramList, int paramInt5, float paramFloat2, byte[] paramArrayOfbyte, int paramInt6, zzpy paramzzpy, zzjo paramzzjo) {
    return new zzht(paramString1, null, paramString2, null, -1, paramInt2, paramInt3, paramInt4, -1.0F, paramInt5, paramFloat2, paramArrayOfbyte, paramInt6, paramzzpy, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, paramList, paramzzjo, null);
  }
  
  public static zzht e(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, List<byte[]> paramList, zzjo paramzzjo, int paramInt6, String paramString4) {
    return new zzht(paramString1, null, paramString2, null, -1, paramInt2, -1, -1, -1.0F, -1, -1.0F, null, -1, null, paramInt3, paramInt4, paramInt5, -1, -1, paramInt6, paramString4, -1, Long.MAX_VALUE, paramList, paramzzjo, null);
  }
  
  public static zzht f(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, int paramInt3, int paramInt4, List<byte[]> paramList, zzjo paramzzjo, int paramInt5, String paramString4) {
    return e(paramString1, paramString2, null, -1, -1, paramInt3, paramInt4, -1, null, paramzzjo, 0, paramString4);
  }
  
  public static zzht g(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, String paramString4, int paramInt3, zzjo paramzzjo, long paramLong, List<byte[]> paramList) {
    return new zzht(paramString1, null, paramString2, null, -1, -1, -1, -1, -1.0F, -1, -1.0F, null, -1, null, -1, -1, -1, -1, -1, paramInt2, paramString4, -1, paramLong, paramList, paramzzjo, null);
  }
  
  public static zzht h(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, String paramString4, zzjo paramzzjo) {
    return g(paramString1, paramString2, null, -1, paramInt2, paramString4, -1, paramzzjo, Long.MAX_VALUE, (List)Collections.emptyList());
  }
  
  public static zzht i(String paramString1, String paramString2, String paramString3, int paramInt, zzjo paramzzjo) {
    return new zzht(paramString1, null, paramString2, null, -1, -1, -1, -1, -1.0F, -1, -1.0F, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, paramzzjo, null);
  }
  
  public static zzht j(String paramString1, String paramString2, String paramString3, int paramInt, List<byte[]> paramList, String paramString4, zzjo paramzzjo) {
    return new zzht(paramString1, null, paramString2, null, -1, -1, -1, -1, -1.0F, -1, -1.0F, null, -1, null, -1, -1, -1, -1, -1, 0, paramString4, -1, Long.MAX_VALUE, paramList, paramzzjo, null);
  }
  
  @TargetApi(16)
  private static void k(MediaFormat paramMediaFormat, String paramString, int paramInt) {
    if (paramInt != -1)
      paramMediaFormat.setInteger(paramString, paramInt); 
  }
  
  public final zzht a(zzjo paramzzjo) {
    return new zzht(this.b, this.f, this.g, this.d, this.c, this.h, this.k, this.l, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.y, this.z, this.A, this.x, this.i, paramzzjo, this.e);
  }
  
  public final zzht b(zzmh paramzzmh) {
    return new zzht(this.b, this.f, this.g, this.d, this.c, this.h, this.k, this.l, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.y, this.z, this.A, this.x, this.i, this.j, paramzzmh);
  }
  
  public final int describeContents() {
    return 0;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject != null && zzht.class == paramObject.getClass()) {
      paramObject = paramObject;
      if (this.c == ((zzht)paramObject).c && this.h == ((zzht)paramObject).h && this.k == ((zzht)paramObject).k && this.l == ((zzht)paramObject).l && this.m == ((zzht)paramObject).m && this.n == ((zzht)paramObject).n && this.o == ((zzht)paramObject).o && this.p == ((zzht)paramObject).p && this.s == ((zzht)paramObject).s && this.t == ((zzht)paramObject).t && this.u == ((zzht)paramObject).u && this.v == ((zzht)paramObject).v && this.w == ((zzht)paramObject).w && this.x == ((zzht)paramObject).x && this.y == ((zzht)paramObject).y && wj2.g(this.b, ((zzht)paramObject).b) && wj2.g(this.z, ((zzht)paramObject).z) && this.A == ((zzht)paramObject).A && wj2.g(this.f, ((zzht)paramObject).f) && wj2.g(this.g, ((zzht)paramObject).g) && wj2.g(this.d, ((zzht)paramObject).d) && wj2.g(this.j, ((zzht)paramObject).j) && wj2.g(this.e, ((zzht)paramObject).e) && wj2.g(this.r, ((zzht)paramObject).r) && Arrays.equals(this.q, ((zzht)paramObject).q) && this.i.size() == ((zzht)paramObject).i.size()) {
        for (byte b = 0; b < this.i.size(); b++) {
          if (!Arrays.equals(this.i.get(b), ((zzht)paramObject).i.get(b)))
            return false; 
        } 
        return true;
      } 
    } 
    return false;
  }
  
  public final int hashCode() {
    if (this.B == 0) {
      int j;
      int k;
      int m;
      int n;
      int i6;
      int i8;
      String str = this.b;
      int i = 0;
      if (str == null) {
        j = 0;
      } else {
        j = str.hashCode();
      } 
      str = this.f;
      if (str == null) {
        k = 0;
      } else {
        k = str.hashCode();
      } 
      str = this.g;
      if (str == null) {
        m = 0;
      } else {
        m = str.hashCode();
      } 
      str = this.d;
      if (str == null) {
        n = 0;
      } else {
        n = str.hashCode();
      } 
      int i1 = this.c;
      int i2 = this.k;
      int i3 = this.l;
      int i4 = this.s;
      int i5 = this.t;
      str = this.z;
      if (str == null) {
        i6 = 0;
      } else {
        i6 = str.hashCode();
      } 
      int i7 = this.A;
      zzjo zzjo1 = this.j;
      if (zzjo1 == null) {
        i8 = 0;
      } else {
        i8 = zzjo1.hashCode();
      } 
      zzmh zzmh1 = this.e;
      if (zzmh1 != null)
        i = zzmh1.hashCode(); 
      this.B = ((((((((((((j + 527) * 31 + k) * 31 + m) * 31 + n) * 31 + i1) * 31 + i2) * 31 + i3) * 31 + i4) * 31 + i5) * 31 + i6) * 31 + i7) * 31 + i8) * 31 + i;
    } 
    return this.B;
  }
  
  public final zzht m(int paramInt1, int paramInt2) {
    return new zzht(this.b, this.f, this.g, this.d, this.c, this.h, this.k, this.l, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, paramInt1, paramInt2, this.y, this.z, this.A, this.x, this.i, this.j, this.e);
  }
  
  public final zzht n(long paramLong) {
    return new zzht(this.b, this.f, this.g, this.d, this.c, this.h, this.k, this.l, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.y, this.z, this.A, paramLong, this.i, this.j, this.e);
  }
  
  public final int o() {
    int i = this.k;
    if (i != -1) {
      int j = this.l;
      if (j != -1)
        return i * j; 
    } 
    return -1;
  }
  
  @SuppressLint({"InlinedApi"})
  @TargetApi(16)
  public final MediaFormat p() {
    MediaFormat mediaFormat = new MediaFormat();
    mediaFormat.setString("mime", this.g);
    String str = this.z;
    if (str != null)
      mediaFormat.setString("language", str); 
    k(mediaFormat, "max-input-size", this.h);
    k(mediaFormat, "width", this.k);
    k(mediaFormat, "height", this.l);
    float f = this.m;
    if (f != -1.0F)
      mediaFormat.setFloat("frame-rate", f); 
    k(mediaFormat, "rotation-degrees", this.n);
    k(mediaFormat, "channel-count", this.s);
    k(mediaFormat, "sample-rate", this.t);
    k(mediaFormat, "encoder-delay", this.v);
    k(mediaFormat, "encoder-padding", this.w);
    for (byte b = 0; b < this.i.size(); b++) {
      StringBuilder stringBuilder = new StringBuilder(15);
      stringBuilder.append("csd-");
      stringBuilder.append(b);
      mediaFormat.setByteBuffer(stringBuilder.toString(), ByteBuffer.wrap(this.i.get(b)));
    } 
    zzpy zzpy1 = this.r;
    if (zzpy1 != null) {
      k(mediaFormat, "color-transfer", zzpy1.d);
      k(mediaFormat, "color-standard", zzpy1.b);
      k(mediaFormat, "color-range", zzpy1.c);
      byte[] arrayOfByte = zzpy1.e;
      if (arrayOfByte != null)
        mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(arrayOfByte)); 
    } 
    return mediaFormat;
  }
  
  public final zzht r(int paramInt) {
    return new zzht(this.b, this.f, this.g, this.d, this.c, paramInt, this.k, this.l, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.y, this.z, this.A, this.x, this.i, this.j, this.e);
  }
  
  public final String toString() {
    String str1 = this.b;
    String str2 = this.f;
    String str3 = this.g;
    int i = this.c;
    String str4 = this.z;
    int j = this.k;
    int k = this.l;
    float f = this.m;
    int m = this.s;
    int n = this.t;
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str1).length() + 100 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
    stringBuilder.append("Format(");
    stringBuilder.append(str1);
    stringBuilder.append(", ");
    stringBuilder.append(str2);
    stringBuilder.append(", ");
    stringBuilder.append(str3);
    stringBuilder.append(", ");
    stringBuilder.append(i);
    stringBuilder.append(", ");
    stringBuilder.append(str4);
    stringBuilder.append(", [");
    stringBuilder.append(j);
    stringBuilder.append(", ");
    stringBuilder.append(k);
    stringBuilder.append(", ");
    stringBuilder.append(f);
    stringBuilder.append("], [");
    stringBuilder.append(m);
    stringBuilder.append(", ");
    stringBuilder.append(n);
    stringBuilder.append("])");
    return stringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeString(this.b);
    paramParcel.writeString(this.f);
    paramParcel.writeString(this.g);
    paramParcel.writeString(this.d);
    paramParcel.writeInt(this.c);
    paramParcel.writeInt(this.h);
    paramParcel.writeInt(this.k);
    paramParcel.writeInt(this.l);
    paramParcel.writeFloat(this.m);
    paramParcel.writeInt(this.n);
    paramParcel.writeFloat(this.o);
    if (this.q != null) {
      i = 1;
    } else {
      i = 0;
    } 
    paramParcel.writeInt(i);
    byte[] arrayOfByte = this.q;
    if (arrayOfByte != null)
      paramParcel.writeByteArray(arrayOfByte); 
    paramParcel.writeInt(this.p);
    paramParcel.writeParcelable(this.r, paramInt);
    paramParcel.writeInt(this.s);
    paramParcel.writeInt(this.t);
    paramParcel.writeInt(this.u);
    paramParcel.writeInt(this.v);
    paramParcel.writeInt(this.w);
    paramParcel.writeInt(this.y);
    paramParcel.writeString(this.z);
    paramParcel.writeInt(this.A);
    paramParcel.writeLong(this.x);
    int i = this.i.size();
    paramParcel.writeInt(i);
    for (paramInt = 0; paramInt < i; paramInt++)
      paramParcel.writeByteArray(this.i.get(paramInt)); 
    paramParcel.writeParcelable(this.j, 0);
    paramParcel.writeParcelable(this.e, 0);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzht.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */