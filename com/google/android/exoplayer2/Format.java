package com.google.android.exoplayer2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.m;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.h0;
import com.google.android.exoplayer2.video.ColorInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class Format implements Parcelable {
  public static final Parcelable.Creator<Format> CREATOR = new a();
  
  public final int A;
  
  public final String B;
  
  public final int C;
  
  public final Class<? extends m> D;
  
  private int E;
  
  public final String b;
  
  public final String c;
  
  public final int d;
  
  public final int e;
  
  public final int f;
  
  public final String g;
  
  public final Metadata h;
  
  public final String i;
  
  public final String j;
  
  public final int k;
  
  public final List<byte[]> l;
  
  public final DrmInitData m;
  
  public final long n;
  
  public final int o;
  
  public final int p;
  
  public final float q;
  
  public final int r;
  
  public final float s;
  
  public final int t;
  
  public final byte[] u;
  
  public final ColorInfo v;
  
  public final int w;
  
  public final int x;
  
  public final int y;
  
  public final int z;
  
  Format(Parcel paramParcel) {
    byte[] arrayOfByte;
    this.b = paramParcel.readString();
    this.c = paramParcel.readString();
    this.d = paramParcel.readInt();
    this.e = paramParcel.readInt();
    this.f = paramParcel.readInt();
    this.g = paramParcel.readString();
    this.h = (Metadata)paramParcel.readParcelable(Metadata.class.getClassLoader());
    this.i = paramParcel.readString();
    this.j = paramParcel.readString();
    this.k = paramParcel.readInt();
    int i = paramParcel.readInt();
    this.l = (List)new ArrayList<byte>(i);
    for (byte b = 0; b < i; b++)
      this.l.add(paramParcel.createByteArray()); 
    this.m = (DrmInitData)paramParcel.readParcelable(DrmInitData.class.getClassLoader());
    this.n = paramParcel.readLong();
    this.o = paramParcel.readInt();
    this.p = paramParcel.readInt();
    this.q = paramParcel.readFloat();
    this.r = paramParcel.readInt();
    this.s = paramParcel.readFloat();
    if (h0.i0(paramParcel)) {
      arrayOfByte = paramParcel.createByteArray();
    } else {
      arrayOfByte = null;
    } 
    this.u = arrayOfByte;
    this.t = paramParcel.readInt();
    this.v = (ColorInfo)paramParcel.readParcelable(ColorInfo.class.getClassLoader());
    this.w = paramParcel.readInt();
    this.x = paramParcel.readInt();
    this.y = paramParcel.readInt();
    this.z = paramParcel.readInt();
    this.A = paramParcel.readInt();
    this.B = paramParcel.readString();
    this.C = paramParcel.readInt();
    this.D = null;
  }
  
  Format(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, String paramString3, Metadata paramMetadata, String paramString4, String paramString5, int paramInt4, List<byte[]> paramList, DrmInitData paramDrmInitData, long paramLong, int paramInt5, int paramInt6, float paramFloat1, int paramInt7, float paramFloat2, byte[] paramArrayOfbyte, int paramInt8, ColorInfo paramColorInfo, int paramInt9, int paramInt10, int paramInt11, int paramInt12, int paramInt13, String paramString6, int paramInt14, Class<? extends m> paramClass) {
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramInt1;
    this.e = paramInt2;
    this.f = paramInt3;
    this.g = paramString3;
    this.h = paramMetadata;
    this.i = paramString4;
    this.j = paramString5;
    this.k = paramInt4;
    if (paramList == null)
      paramList = Collections.emptyList(); 
    this.l = paramList;
    this.m = paramDrmInitData;
    this.n = paramLong;
    this.o = paramInt5;
    this.p = paramInt6;
    this.q = paramFloat1;
    paramInt2 = 0;
    paramInt1 = paramInt7;
    if (paramInt7 == -1)
      paramInt1 = 0; 
    this.r = paramInt1;
    if (paramFloat2 == -1.0F)
      paramFloat2 = 1.0F; 
    this.s = paramFloat2;
    this.u = paramArrayOfbyte;
    this.t = paramInt8;
    this.v = paramColorInfo;
    this.w = paramInt9;
    this.x = paramInt10;
    this.y = paramInt11;
    paramInt1 = paramInt12;
    if (paramInt12 == -1)
      paramInt1 = 0; 
    this.z = paramInt1;
    if (paramInt13 == -1) {
      paramInt1 = paramInt2;
    } else {
      paramInt1 = paramInt13;
    } 
    this.A = paramInt1;
    this.B = h0.c0(paramString6);
    this.C = paramInt14;
    this.D = paramClass;
  }
  
  public static Format B(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, String paramString4, DrmInitData paramDrmInitData, long paramLong) {
    return z(paramString1, paramString2, paramString3, paramInt1, paramInt2, paramString4, -1, paramDrmInitData, paramLong, (List)Collections.emptyList());
  }
  
  public static Format C(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, Metadata paramMetadata, int paramInt1, int paramInt2, int paramInt3, float paramFloat, List<byte[]> paramList, int paramInt4, int paramInt5) {
    return new Format(paramString1, paramString2, paramInt4, paramInt5, paramInt1, paramString5, paramMetadata, paramString3, paramString4, -1, paramList, null, Long.MAX_VALUE, paramInt2, paramInt3, paramFloat, -1, -1.0F, null, -1, null, -1, -1, -1, -1, -1, null, -1, null);
  }
  
  public static Format D(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, List<byte[]> paramList, int paramInt5, float paramFloat2, DrmInitData paramDrmInitData) {
    return E(paramString1, paramString2, paramString3, paramInt1, paramInt2, paramInt3, paramInt4, paramFloat1, paramList, paramInt5, paramFloat2, null, -1, null, paramDrmInitData);
  }
  
  public static Format E(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, List<byte[]> paramList, int paramInt5, float paramFloat2, byte[] paramArrayOfbyte, int paramInt6, ColorInfo paramColorInfo, DrmInitData paramDrmInitData) {
    return new Format(paramString1, null, 0, 0, paramInt1, paramString3, null, null, paramString2, paramInt2, paramList, paramDrmInitData, Long.MAX_VALUE, paramInt3, paramInt4, paramFloat1, paramInt5, paramFloat2, paramArrayOfbyte, paramInt6, paramColorInfo, -1, -1, -1, -1, -1, null, -1, null);
  }
  
  public static Format m(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, Metadata paramMetadata, int paramInt1, int paramInt2, int paramInt3, List<byte[]> paramList, int paramInt4, int paramInt5, String paramString6) {
    return new Format(paramString1, paramString2, paramInt4, paramInt5, paramInt1, paramString5, paramMetadata, paramString3, paramString4, -1, paramList, null, Long.MAX_VALUE, -1, -1, -1.0F, -1, -1.0F, null, -1, null, paramInt2, paramInt3, -1, -1, -1, paramString6, -1, null);
  }
  
  public static Format n(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, List<byte[]> paramList, DrmInitData paramDrmInitData, int paramInt8, String paramString4, Metadata paramMetadata) {
    return new Format(paramString1, null, paramInt8, 0, paramInt1, paramString3, paramMetadata, null, paramString2, paramInt2, paramList, paramDrmInitData, Long.MAX_VALUE, -1, -1, -1.0F, -1, -1.0F, null, -1, null, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramString4, -1, null);
  }
  
  public static Format o(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, List<byte[]> paramList, DrmInitData paramDrmInitData, int paramInt6, String paramString4) {
    return n(paramString1, paramString2, paramString3, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, -1, -1, paramList, paramDrmInitData, paramInt6, paramString4, null);
  }
  
  public static Format p(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, int paramInt3, int paramInt4, List<byte[]> paramList, DrmInitData paramDrmInitData, int paramInt5, String paramString4) {
    return o(paramString1, paramString2, paramString3, paramInt1, paramInt2, paramInt3, paramInt4, -1, paramList, paramDrmInitData, paramInt5, paramString4);
  }
  
  public static Format r(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt1, int paramInt2, int paramInt3, String paramString6) {
    return new Format(paramString1, paramString2, paramInt2, paramInt3, paramInt1, paramString5, null, paramString3, paramString4, -1, null, null, Long.MAX_VALUE, -1, -1, -1.0F, -1, -1.0F, null, -1, null, -1, -1, -1, -1, -1, paramString6, -1, null);
  }
  
  public static Format s(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, List<byte[]> paramList, String paramString4, DrmInitData paramDrmInitData) {
    return new Format(paramString1, null, paramInt2, 0, paramInt1, paramString3, null, null, paramString2, -1, paramList, paramDrmInitData, Long.MAX_VALUE, -1, -1, -1.0F, -1, -1.0F, null, -1, null, -1, -1, -1, -1, -1, paramString4, -1, null);
  }
  
  public static Format t(String paramString1, String paramString2, long paramLong) {
    return new Format(paramString1, null, 0, 0, -1, null, null, null, paramString2, -1, null, null, paramLong, -1, -1, -1.0F, -1, -1.0F, null, -1, null, -1, -1, -1, -1, -1, null, -1, null);
  }
  
  public static Format u(String paramString1, String paramString2, String paramString3, int paramInt, DrmInitData paramDrmInitData) {
    return new Format(paramString1, null, 0, 0, paramInt, paramString3, null, null, paramString2, -1, null, paramDrmInitData, Long.MAX_VALUE, -1, -1, -1.0F, -1, -1.0F, null, -1, null, -1, -1, -1, -1, -1, null, -1, null);
  }
  
  public static Format v(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt1, int paramInt2, int paramInt3, String paramString6) {
    return w(paramString1, paramString2, paramString3, paramString4, paramString5, paramInt1, paramInt2, paramInt3, paramString6, -1);
  }
  
  public static Format w(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt1, int paramInt2, int paramInt3, String paramString6, int paramInt4) {
    return new Format(paramString1, paramString2, paramInt2, paramInt3, paramInt1, paramString5, null, paramString3, paramString4, -1, null, null, Long.MAX_VALUE, -1, -1, -1.0F, -1, -1.0F, null, -1, null, -1, -1, -1, -1, -1, paramString6, paramInt4, null);
  }
  
  public static Format x(String paramString1, String paramString2, int paramInt, String paramString3) {
    return y(paramString1, paramString2, paramInt, paramString3, null);
  }
  
  public static Format y(String paramString1, String paramString2, int paramInt, String paramString3, DrmInitData paramDrmInitData) {
    return z(paramString1, paramString2, null, -1, paramInt, paramString3, -1, paramDrmInitData, Long.MAX_VALUE, (List)Collections.emptyList());
  }
  
  public static Format z(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, String paramString4, int paramInt3, DrmInitData paramDrmInitData, long paramLong, List<byte[]> paramList) {
    return new Format(paramString1, null, paramInt2, 0, paramInt1, paramString3, null, null, paramString2, -1, paramList, paramDrmInitData, paramLong, -1, -1, -1.0F, -1, -1.0F, null, -1, null, -1, -1, -1, -1, -1, paramString4, paramInt3, null);
  }
  
  public int F() {
    int i = this.o;
    byte b = -1;
    int j = b;
    if (i != -1) {
      j = this.p;
      if (j == -1) {
        j = b;
      } else {
        j = i * j;
      } 
    } 
    return j;
  }
  
  public boolean G(Format paramFormat) {
    if (this.l.size() != paramFormat.l.size())
      return false; 
    for (byte b = 0; b < this.l.size(); b++) {
      if (!Arrays.equals(this.l.get(b), paramFormat.l.get(b)))
        return false; 
    } 
    return true;
  }
  
  public Format a(DrmInitData paramDrmInitData, Metadata paramMetadata) {
    return (paramDrmInitData == this.m && paramMetadata == this.h) ? this : new Format(this.b, this.c, this.d, this.e, this.f, this.g, paramMetadata, this.i, this.j, this.k, this.l, paramDrmInitData, this.n, this.o, this.p, this.q, this.r, this.s, this.u, this.t, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D);
  }
  
  public Format b(int paramInt) {
    return new Format(this.b, this.c, this.d, this.e, paramInt, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.u, this.t, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D);
  }
  
  public Format c(String paramString1, String paramString2, String paramString3, String paramString4, Metadata paramMetadata, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, String paramString5) {
    Metadata metadata = this.h;
    if (metadata != null)
      paramMetadata = metadata.b(paramMetadata); 
    return new Format(paramString1, paramString2, paramInt5, this.e, paramInt1, paramString4, paramMetadata, this.i, paramString3, this.k, this.l, this.m, this.n, paramInt2, paramInt3, this.q, this.r, this.s, this.u, this.t, this.v, paramInt4, this.x, this.y, this.z, this.A, paramString5, this.C, this.D);
  }
  
  public Format d(DrmInitData paramDrmInitData) {
    return a(paramDrmInitData, this.h);
  }
  
  public int describeContents() {
    return 0;
  }
  
  public Format e(Class<? extends m> paramClass) {
    return new Format(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.u, this.t, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, paramClass);
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = true;
    if (this == paramObject)
      return true; 
    if (paramObject == null || Format.class != paramObject.getClass())
      return false; 
    paramObject = paramObject;
    int i = this.E;
    if (i != 0) {
      int j = ((Format)paramObject).E;
      if (j != 0 && i != j)
        return false; 
    } 
    if (this.d != ((Format)paramObject).d || this.e != ((Format)paramObject).e || this.f != ((Format)paramObject).f || this.k != ((Format)paramObject).k || this.n != ((Format)paramObject).n || this.o != ((Format)paramObject).o || this.p != ((Format)paramObject).p || this.r != ((Format)paramObject).r || this.t != ((Format)paramObject).t || this.w != ((Format)paramObject).w || this.x != ((Format)paramObject).x || this.y != ((Format)paramObject).y || this.z != ((Format)paramObject).z || this.A != ((Format)paramObject).A || this.C != ((Format)paramObject).C || Float.compare(this.q, ((Format)paramObject).q) != 0 || Float.compare(this.s, ((Format)paramObject).s) != 0 || !h0.b(this.D, ((Format)paramObject).D) || !h0.b(this.b, ((Format)paramObject).b) || !h0.b(this.c, ((Format)paramObject).c) || !h0.b(this.g, ((Format)paramObject).g) || !h0.b(this.i, ((Format)paramObject).i) || !h0.b(this.j, ((Format)paramObject).j) || !h0.b(this.B, ((Format)paramObject).B) || !Arrays.equals(this.u, ((Format)paramObject).u) || !h0.b(this.h, ((Format)paramObject).h) || !h0.b(this.v, ((Format)paramObject).v) || !h0.b(this.m, ((Format)paramObject).m) || !G((Format)paramObject))
      bool = false; 
    return bool;
  }
  
  public Format f(float paramFloat) {
    return new Format(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, paramFloat, this.r, this.s, this.u, this.t, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D);
  }
  
  public Format g(int paramInt1, int paramInt2) {
    return new Format(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.u, this.t, this.v, this.w, this.x, this.y, paramInt1, paramInt2, this.B, this.C, this.D);
  }
  
  public Format h(Format paramFormat) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: if_acmpne -> 7
    //   5: aload_0
    //   6: areturn
    //   7: aload_0
    //   8: getfield j : Ljava/lang/String;
    //   11: invokestatic h : (Ljava/lang/String;)I
    //   14: istore_2
    //   15: aload_1
    //   16: getfield b : Ljava/lang/String;
    //   19: astore_3
    //   20: aload_1
    //   21: getfield c : Ljava/lang/String;
    //   24: astore #4
    //   26: aload #4
    //   28: ifnull -> 34
    //   31: goto -> 40
    //   34: aload_0
    //   35: getfield c : Ljava/lang/String;
    //   38: astore #4
    //   40: aload_0
    //   41: getfield B : Ljava/lang/String;
    //   44: astore #5
    //   46: iload_2
    //   47: iconst_3
    //   48: if_icmpeq -> 56
    //   51: iload_2
    //   52: iconst_1
    //   53: if_icmpne -> 70
    //   56: aload_1
    //   57: getfield B : Ljava/lang/String;
    //   60: astore #6
    //   62: aload #6
    //   64: ifnull -> 70
    //   67: goto -> 74
    //   70: aload #5
    //   72: astore #6
    //   74: aload_0
    //   75: getfield f : I
    //   78: istore #7
    //   80: iload #7
    //   82: istore #8
    //   84: iload #7
    //   86: iconst_m1
    //   87: if_icmpne -> 96
    //   90: aload_1
    //   91: getfield f : I
    //   94: istore #8
    //   96: aload_0
    //   97: getfield g : Ljava/lang/String;
    //   100: astore #5
    //   102: aload #5
    //   104: ifnonnull -> 134
    //   107: aload_1
    //   108: getfield g : Ljava/lang/String;
    //   111: iload_2
    //   112: invokestatic y : (Ljava/lang/String;I)Ljava/lang/String;
    //   115: astore #9
    //   117: aload #9
    //   119: invokestatic p0 : (Ljava/lang/String;)[Ljava/lang/String;
    //   122: arraylength
    //   123: iconst_1
    //   124: if_icmpne -> 134
    //   127: aload #9
    //   129: astore #5
    //   131: goto -> 134
    //   134: aload_0
    //   135: getfield h : Lcom/google/android/exoplayer2/metadata/Metadata;
    //   138: astore #9
    //   140: aload #9
    //   142: ifnonnull -> 154
    //   145: aload_1
    //   146: getfield h : Lcom/google/android/exoplayer2/metadata/Metadata;
    //   149: astore #9
    //   151: goto -> 165
    //   154: aload #9
    //   156: aload_1
    //   157: getfield h : Lcom/google/android/exoplayer2/metadata/Metadata;
    //   160: invokevirtual b : (Lcom/google/android/exoplayer2/metadata/Metadata;)Lcom/google/android/exoplayer2/metadata/Metadata;
    //   163: astore #9
    //   165: aload_0
    //   166: getfield q : F
    //   169: fstore #10
    //   171: fload #10
    //   173: ldc -1.0
    //   175: fcmpl
    //   176: ifne -> 193
    //   179: iload_2
    //   180: iconst_2
    //   181: if_icmpne -> 193
    //   184: aload_1
    //   185: getfield q : F
    //   188: fstore #10
    //   190: goto -> 193
    //   193: aload_0
    //   194: getfield d : I
    //   197: istore_2
    //   198: aload_1
    //   199: getfield d : I
    //   202: istore #11
    //   204: aload_0
    //   205: getfield e : I
    //   208: istore #12
    //   210: aload_1
    //   211: getfield e : I
    //   214: istore #7
    //   216: aload_1
    //   217: getfield m : Lcom/google/android/exoplayer2/drm/DrmInitData;
    //   220: aload_0
    //   221: getfield m : Lcom/google/android/exoplayer2/drm/DrmInitData;
    //   224: invokestatic d : (Lcom/google/android/exoplayer2/drm/DrmInitData;Lcom/google/android/exoplayer2/drm/DrmInitData;)Lcom/google/android/exoplayer2/drm/DrmInitData;
    //   227: astore_1
    //   228: new com/google/android/exoplayer2/Format
    //   231: dup
    //   232: aload_3
    //   233: aload #4
    //   235: iload_2
    //   236: iload #11
    //   238: ior
    //   239: iload #12
    //   241: iload #7
    //   243: ior
    //   244: iload #8
    //   246: aload #5
    //   248: aload #9
    //   250: aload_0
    //   251: getfield i : Ljava/lang/String;
    //   254: aload_0
    //   255: getfield j : Ljava/lang/String;
    //   258: aload_0
    //   259: getfield k : I
    //   262: aload_0
    //   263: getfield l : Ljava/util/List;
    //   266: aload_1
    //   267: aload_0
    //   268: getfield n : J
    //   271: aload_0
    //   272: getfield o : I
    //   275: aload_0
    //   276: getfield p : I
    //   279: fload #10
    //   281: aload_0
    //   282: getfield r : I
    //   285: aload_0
    //   286: getfield s : F
    //   289: aload_0
    //   290: getfield u : [B
    //   293: aload_0
    //   294: getfield t : I
    //   297: aload_0
    //   298: getfield v : Lcom/google/android/exoplayer2/video/ColorInfo;
    //   301: aload_0
    //   302: getfield w : I
    //   305: aload_0
    //   306: getfield x : I
    //   309: aload_0
    //   310: getfield y : I
    //   313: aload_0
    //   314: getfield z : I
    //   317: aload_0
    //   318: getfield A : I
    //   321: aload #6
    //   323: aload_0
    //   324: getfield C : I
    //   327: aload_0
    //   328: getfield D : Ljava/lang/Class;
    //   331: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Lcom/google/android/exoplayer2/metadata/Metadata;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Lcom/google/android/exoplayer2/drm/DrmInitData;JIIFIF[BILcom/google/android/exoplayer2/video/ColorInfo;IIIIILjava/lang/String;ILjava/lang/Class;)V
    //   334: areturn
  }
  
  public int hashCode() {
    if (this.E == 0) {
      int j;
      byte b;
      int i1;
      int i2;
      int i3;
      int i4;
      int i18;
      String str2 = this.b;
      int i = 0;
      if (str2 == null) {
        j = 0;
      } else {
        j = str2.hashCode();
      } 
      str2 = this.c;
      if (str2 != null) {
        b = str2.hashCode();
      } else {
        b = 0;
      } 
      int k = this.d;
      int m = this.e;
      int n = this.f;
      str2 = this.g;
      if (str2 == null) {
        i1 = 0;
      } else {
        i1 = str2.hashCode();
      } 
      Metadata metadata = this.h;
      if (metadata == null) {
        i2 = 0;
      } else {
        i2 = metadata.hashCode();
      } 
      String str1 = this.i;
      if (str1 == null) {
        i3 = 0;
      } else {
        i3 = str1.hashCode();
      } 
      str1 = this.j;
      if (str1 == null) {
        i4 = 0;
      } else {
        i4 = str1.hashCode();
      } 
      int i5 = this.k;
      int i6 = (int)this.n;
      int i7 = this.o;
      int i8 = this.p;
      int i9 = Float.floatToIntBits(this.q);
      int i10 = this.r;
      int i11 = Float.floatToIntBits(this.s);
      int i12 = this.t;
      int i13 = this.w;
      int i14 = this.x;
      int i15 = this.y;
      int i16 = this.z;
      int i17 = this.A;
      str1 = this.B;
      if (str1 == null) {
        i18 = 0;
      } else {
        i18 = str1.hashCode();
      } 
      int i19 = this.C;
      Class<? extends m> clazz = this.D;
      if (clazz != null)
        i = clazz.hashCode(); 
      this.E = ((((((((((((((((((((((((527 + j) * 31 + b) * 31 + k) * 31 + m) * 31 + n) * 31 + i1) * 31 + i2) * 31 + i3) * 31 + i4) * 31 + i5) * 31 + i6) * 31 + i7) * 31 + i8) * 31 + i9) * 31 + i10) * 31 + i11) * 31 + i12) * 31 + i13) * 31 + i14) * 31 + i15) * 31 + i16) * 31 + i17) * 31 + i18) * 31 + i19) * 31 + i;
    } 
    return this.E;
  }
  
  public Format i(int paramInt) {
    return new Format(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, paramInt, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.u, this.t, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D);
  }
  
  public Format j(Metadata paramMetadata) {
    return a(this.m, paramMetadata);
  }
  
  public Format k(long paramLong) {
    return new Format(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, paramLong, this.o, this.p, this.q, this.r, this.s, this.u, this.t, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D);
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Format(");
    stringBuilder.append(this.b);
    stringBuilder.append(", ");
    stringBuilder.append(this.c);
    stringBuilder.append(", ");
    stringBuilder.append(this.i);
    stringBuilder.append(", ");
    stringBuilder.append(this.j);
    stringBuilder.append(", ");
    stringBuilder.append(this.g);
    stringBuilder.append(", ");
    stringBuilder.append(this.f);
    stringBuilder.append(", ");
    stringBuilder.append(this.B);
    stringBuilder.append(", [");
    stringBuilder.append(this.o);
    stringBuilder.append(", ");
    stringBuilder.append(this.p);
    stringBuilder.append(", ");
    stringBuilder.append(this.q);
    stringBuilder.append("], [");
    stringBuilder.append(this.w);
    stringBuilder.append(", ");
    stringBuilder.append(this.x);
    stringBuilder.append("])");
    return stringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeString(this.b);
    paramParcel.writeString(this.c);
    paramParcel.writeInt(this.d);
    paramParcel.writeInt(this.e);
    paramParcel.writeInt(this.f);
    paramParcel.writeString(this.g);
    Metadata metadata = this.h;
    boolean bool = false;
    paramParcel.writeParcelable((Parcelable)metadata, 0);
    paramParcel.writeString(this.i);
    paramParcel.writeString(this.j);
    paramParcel.writeInt(this.k);
    int i = this.l.size();
    paramParcel.writeInt(i);
    for (byte b = 0; b < i; b++)
      paramParcel.writeByteArray(this.l.get(b)); 
    paramParcel.writeParcelable((Parcelable)this.m, 0);
    paramParcel.writeLong(this.n);
    paramParcel.writeInt(this.o);
    paramParcel.writeInt(this.p);
    paramParcel.writeFloat(this.q);
    paramParcel.writeInt(this.r);
    paramParcel.writeFloat(this.s);
    if (this.u != null)
      bool = true; 
    h0.x0(paramParcel, bool);
    byte[] arrayOfByte = this.u;
    if (arrayOfByte != null)
      paramParcel.writeByteArray(arrayOfByte); 
    paramParcel.writeInt(this.t);
    paramParcel.writeParcelable((Parcelable)this.v, paramInt);
    paramParcel.writeInt(this.w);
    paramParcel.writeInt(this.x);
    paramParcel.writeInt(this.y);
    paramParcel.writeInt(this.z);
    paramParcel.writeInt(this.A);
    paramParcel.writeString(this.B);
    paramParcel.writeInt(this.C);
  }
  
  static final class a implements Parcelable.Creator<Format> {
    public Format a(Parcel param1Parcel) {
      return new Format(param1Parcel);
    }
    
    public Format[] b(int param1Int) {
      return new Format[param1Int];
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/Format.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */