package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.List;

public final class WakeLockEvent extends StatsEvent {
  public static final Parcelable.Creator<WakeLockEvent> CREATOR = new f();
  
  private final int b;
  
  private final long c;
  
  private int d;
  
  private final String e;
  
  private final String f;
  
  private final String g;
  
  private final int h;
  
  private final List<String> i;
  
  private final String j;
  
  private final long k;
  
  private int l;
  
  private final String m;
  
  private final float n;
  
  private final long o;
  
  private final boolean p;
  
  private long q;
  
  WakeLockEvent(int paramInt1, long paramLong1, int paramInt2, String paramString1, int paramInt3, List<String> paramList, String paramString2, long paramLong2, int paramInt4, String paramString3, String paramString4, float paramFloat, long paramLong3, String paramString5, boolean paramBoolean) {
    this.b = paramInt1;
    this.c = paramLong1;
    this.d = paramInt2;
    this.e = paramString1;
    this.f = paramString3;
    this.g = paramString5;
    this.h = paramInt3;
    this.q = -1L;
    this.i = paramList;
    this.j = paramString2;
    this.k = paramLong2;
    this.l = paramInt4;
    this.m = paramString4;
    this.n = paramFloat;
    this.o = paramLong3;
    this.p = paramBoolean;
  }
  
  public WakeLockEvent(long paramLong1, int paramInt1, String paramString1, int paramInt2, List<String> paramList, String paramString2, long paramLong2, int paramInt3, String paramString3, String paramString4, float paramFloat, long paramLong3, String paramString5, boolean paramBoolean) {
    this(2, paramLong1, paramInt1, paramString1, paramInt2, paramList, paramString2, paramLong2, paramInt3, paramString3, paramString4, paramFloat, paramLong3, paramString5, paramBoolean);
  }
  
  public final long o0() {
    return this.c;
  }
  
  public final int p0() {
    return this.d;
  }
  
  public final long q0() {
    return this.q;
  }
  
  public final String r0() {
    String str2;
    String str1 = this.e;
    int i = this.h;
    List<String> list = this.i;
    String str3 = "";
    if (list == null) {
      str2 = "";
    } else {
      str2 = TextUtils.join(",", (Iterable)str2);
    } 
    int j = this.l;
    String str4 = this.f;
    String str5 = str4;
    if (str4 == null)
      str5 = ""; 
    String str6 = this.m;
    str4 = str6;
    if (str6 == null)
      str4 = ""; 
    float f = this.n;
    str6 = this.g;
    if (str6 != null)
      str3 = str6; 
    boolean bool = this.p;
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str1).length() + 51 + String.valueOf(str2).length() + String.valueOf(str5).length() + String.valueOf(str4).length() + String.valueOf(str3).length());
    stringBuilder.append("\t");
    stringBuilder.append(str1);
    stringBuilder.append("\t");
    stringBuilder.append(i);
    stringBuilder.append("\t");
    stringBuilder.append(str2);
    stringBuilder.append("\t");
    stringBuilder.append(j);
    stringBuilder.append("\t");
    stringBuilder.append(str5);
    stringBuilder.append("\t");
    stringBuilder.append(str4);
    stringBuilder.append("\t");
    stringBuilder.append(f);
    stringBuilder.append("\t");
    stringBuilder.append(str3);
    stringBuilder.append("\t");
    stringBuilder.append(bool);
    return stringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = a.a(paramParcel);
    a.k(paramParcel, 1, this.b);
    a.n(paramParcel, 2, super.o0());
    a.r(paramParcel, 4, this.e, false);
    a.k(paramParcel, 5, this.h);
    a.t(paramParcel, 6, this.i, false);
    a.n(paramParcel, 8, this.k);
    a.r(paramParcel, 10, this.f, false);
    a.k(paramParcel, 11, super.p0());
    a.r(paramParcel, 12, this.j, false);
    a.r(paramParcel, 13, this.m, false);
    a.k(paramParcel, 14, this.l);
    a.h(paramParcel, 15, this.n);
    a.n(paramParcel, 16, this.o);
    a.r(paramParcel, 17, this.g, false);
    a.c(paramParcel, 18, this.p);
    a.b(paramParcel, paramInt);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/stats/WakeLockEvent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */