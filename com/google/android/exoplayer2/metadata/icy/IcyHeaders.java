package com.google.android.exoplayer2.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.h0;
import java.util.List;
import java.util.Map;

public final class IcyHeaders implements Metadata.Entry {
  public static final Parcelable.Creator<IcyHeaders> CREATOR = new a();
  
  public final int b;
  
  public final String c;
  
  public final String d;
  
  public final String e;
  
  public final boolean f;
  
  public final int g;
  
  public IcyHeaders(int paramInt1, String paramString1, String paramString2, String paramString3, boolean paramBoolean, int paramInt2) {
    boolean bool;
    if (paramInt2 == -1 || paramInt2 > 0) {
      bool = true;
    } else {
      bool = false;
    } 
    e.a(bool);
    this.b = paramInt1;
    this.c = paramString1;
    this.d = paramString2;
    this.e = paramString3;
    this.f = paramBoolean;
    this.g = paramInt2;
  }
  
  IcyHeaders(Parcel paramParcel) {
    this.b = paramParcel.readInt();
    this.c = paramParcel.readString();
    this.d = paramParcel.readString();
    this.e = paramParcel.readString();
    this.f = h0.i0(paramParcel);
    this.g = paramParcel.readInt();
  }
  
  public static IcyHeaders a(Map<String, List<String>> paramMap) {
    // Byte code:
    //   0: aload_0
    //   1: ldc 'icy-br'
    //   3: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   8: checkcast java/util/List
    //   11: astore_1
    //   12: iconst_m1
    //   13: istore_2
    //   14: iconst_1
    //   15: istore_3
    //   16: aload_1
    //   17: ifnull -> 149
    //   20: aload_1
    //   21: iconst_0
    //   22: invokeinterface get : (I)Ljava/lang/Object;
    //   27: checkcast java/lang/String
    //   30: astore_1
    //   31: aload_1
    //   32: invokestatic parseInt : (Ljava/lang/String;)I
    //   35: istore #4
    //   37: iload #4
    //   39: sipush #1000
    //   42: imul
    //   43: istore #5
    //   45: iload #5
    //   47: ifle -> 56
    //   50: iconst_1
    //   51: istore #4
    //   53: goto -> 97
    //   56: new java/lang/StringBuilder
    //   59: astore #6
    //   61: aload #6
    //   63: invokespecial <init> : ()V
    //   66: aload #6
    //   68: ldc 'Invalid bitrate: '
    //   70: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   73: pop
    //   74: aload #6
    //   76: aload_1
    //   77: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   80: pop
    //   81: ldc 'IcyHeaders'
    //   83: aload #6
    //   85: invokevirtual toString : ()Ljava/lang/String;
    //   88: invokestatic f : (Ljava/lang/String;Ljava/lang/String;)V
    //   91: iconst_0
    //   92: istore #4
    //   94: iconst_m1
    //   95: istore #5
    //   97: goto -> 155
    //   100: astore #6
    //   102: iconst_m1
    //   103: istore #4
    //   105: new java/lang/StringBuilder
    //   108: dup
    //   109: invokespecial <init> : ()V
    //   112: astore #6
    //   114: aload #6
    //   116: ldc 'Invalid bitrate header: '
    //   118: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   121: pop
    //   122: aload #6
    //   124: aload_1
    //   125: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   128: pop
    //   129: ldc 'IcyHeaders'
    //   131: aload #6
    //   133: invokevirtual toString : ()Ljava/lang/String;
    //   136: invokestatic f : (Ljava/lang/String;Ljava/lang/String;)V
    //   139: iload #4
    //   141: istore #5
    //   143: iconst_0
    //   144: istore #4
    //   146: goto -> 155
    //   149: iconst_0
    //   150: istore #4
    //   152: iconst_m1
    //   153: istore #5
    //   155: aload_0
    //   156: ldc 'icy-genre'
    //   158: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   163: checkcast java/util/List
    //   166: astore_1
    //   167: aconst_null
    //   168: astore #7
    //   170: aload_1
    //   171: ifnull -> 191
    //   174: aload_1
    //   175: iconst_0
    //   176: invokeinterface get : (I)Ljava/lang/Object;
    //   181: checkcast java/lang/String
    //   184: astore_1
    //   185: iconst_1
    //   186: istore #4
    //   188: goto -> 193
    //   191: aconst_null
    //   192: astore_1
    //   193: aload_0
    //   194: ldc 'icy-name'
    //   196: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   201: checkcast java/util/List
    //   204: astore #6
    //   206: aload #6
    //   208: ifnull -> 230
    //   211: aload #6
    //   213: iconst_0
    //   214: invokeinterface get : (I)Ljava/lang/Object;
    //   219: checkcast java/lang/String
    //   222: astore #6
    //   224: iconst_1
    //   225: istore #4
    //   227: goto -> 233
    //   230: aconst_null
    //   231: astore #6
    //   233: aload_0
    //   234: ldc 'icy-url'
    //   236: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   241: checkcast java/util/List
    //   244: astore #8
    //   246: aload #8
    //   248: ifnull -> 270
    //   251: aload #8
    //   253: iconst_0
    //   254: invokeinterface get : (I)Ljava/lang/Object;
    //   259: checkcast java/lang/String
    //   262: astore #8
    //   264: iconst_1
    //   265: istore #4
    //   267: goto -> 273
    //   270: aconst_null
    //   271: astore #8
    //   273: aload_0
    //   274: ldc 'icy-pub'
    //   276: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   281: checkcast java/util/List
    //   284: astore #9
    //   286: aload #9
    //   288: ifnull -> 315
    //   291: aload #9
    //   293: iconst_0
    //   294: invokeinterface get : (I)Ljava/lang/Object;
    //   299: checkcast java/lang/String
    //   302: ldc '1'
    //   304: invokevirtual equals : (Ljava/lang/Object;)Z
    //   307: istore #10
    //   309: iconst_1
    //   310: istore #4
    //   312: goto -> 318
    //   315: iconst_0
    //   316: istore #10
    //   318: aload_0
    //   319: ldc 'icy-metaint'
    //   321: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   326: checkcast java/util/List
    //   329: astore_0
    //   330: iload #4
    //   332: istore #11
    //   334: iload_2
    //   335: istore #12
    //   337: aload_0
    //   338: ifnull -> 463
    //   341: aload_0
    //   342: iconst_0
    //   343: invokeinterface get : (I)Ljava/lang/Object;
    //   348: checkcast java/lang/String
    //   351: astore_0
    //   352: aload_0
    //   353: invokestatic parseInt : (Ljava/lang/String;)I
    //   356: istore #12
    //   358: iload #12
    //   360: ifle -> 372
    //   363: iload #12
    //   365: istore_2
    //   366: iload_3
    //   367: istore #4
    //   369: goto -> 407
    //   372: new java/lang/StringBuilder
    //   375: astore #9
    //   377: aload #9
    //   379: invokespecial <init> : ()V
    //   382: aload #9
    //   384: ldc 'Invalid metadata interval: '
    //   386: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   389: pop
    //   390: aload #9
    //   392: aload_0
    //   393: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   396: pop
    //   397: ldc 'IcyHeaders'
    //   399: aload #9
    //   401: invokevirtual toString : ()Ljava/lang/String;
    //   404: invokestatic f : (Ljava/lang/String;Ljava/lang/String;)V
    //   407: iload #4
    //   409: istore #11
    //   411: iload_2
    //   412: istore #12
    //   414: goto -> 463
    //   417: astore #9
    //   419: iload #12
    //   421: istore_2
    //   422: new java/lang/StringBuilder
    //   425: dup
    //   426: invokespecial <init> : ()V
    //   429: astore #9
    //   431: aload #9
    //   433: ldc 'Invalid metadata interval: '
    //   435: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   438: pop
    //   439: aload #9
    //   441: aload_0
    //   442: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   445: pop
    //   446: ldc 'IcyHeaders'
    //   448: aload #9
    //   450: invokevirtual toString : ()Ljava/lang/String;
    //   453: invokestatic f : (Ljava/lang/String;Ljava/lang/String;)V
    //   456: iload_2
    //   457: istore #12
    //   459: iload #4
    //   461: istore #11
    //   463: aload #7
    //   465: astore_0
    //   466: iload #11
    //   468: ifeq -> 490
    //   471: new com/google/android/exoplayer2/metadata/icy/IcyHeaders
    //   474: dup
    //   475: iload #5
    //   477: aload_1
    //   478: aload #6
    //   480: aload #8
    //   482: iload #10
    //   484: iload #12
    //   486: invokespecial <init> : (ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V
    //   489: astore_0
    //   490: aload_0
    //   491: areturn
    //   492: astore #6
    //   494: iload #5
    //   496: istore #4
    //   498: goto -> 105
    //   501: astore #9
    //   503: goto -> 422
    // Exception table:
    //   from	to	target	type
    //   31	37	100	java/lang/NumberFormatException
    //   56	91	492	java/lang/NumberFormatException
    //   352	358	501	java/lang/NumberFormatException
    //   372	407	417	java/lang/NumberFormatException
  }
  
  public int describeContents() {
    return 0;
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = true;
    if (this == paramObject)
      return true; 
    if (paramObject == null || IcyHeaders.class != paramObject.getClass())
      return false; 
    paramObject = paramObject;
    if (this.b != ((IcyHeaders)paramObject).b || !h0.b(this.c, ((IcyHeaders)paramObject).c) || !h0.b(this.d, ((IcyHeaders)paramObject).d) || !h0.b(this.e, ((IcyHeaders)paramObject).e) || this.f != ((IcyHeaders)paramObject).f || this.g != ((IcyHeaders)paramObject).g)
      bool = false; 
    return bool;
  }
  
  public int hashCode() {
    byte b1;
    byte b2;
    int i = this.b;
    String str = this.c;
    int j = 0;
    if (str != null) {
      b1 = str.hashCode();
    } else {
      b1 = 0;
    } 
    str = this.d;
    if (str != null) {
      b2 = str.hashCode();
    } else {
      b2 = 0;
    } 
    str = this.e;
    if (str != null)
      j = str.hashCode(); 
    return (((((527 + i) * 31 + b1) * 31 + b2) * 31 + j) * 31 + this.f) * 31 + this.g;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("IcyHeaders: name=\"");
    stringBuilder.append(this.d);
    stringBuilder.append("\", genre=\"");
    stringBuilder.append(this.c);
    stringBuilder.append("\", bitrate=");
    stringBuilder.append(this.b);
    stringBuilder.append(", metadataInterval=");
    stringBuilder.append(this.g);
    return stringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeInt(this.b);
    paramParcel.writeString(this.c);
    paramParcel.writeString(this.d);
    paramParcel.writeString(this.e);
    h0.x0(paramParcel, this.f);
    paramParcel.writeInt(this.g);
  }
  
  static final class a implements Parcelable.Creator<IcyHeaders> {
    public IcyHeaders a(Parcel param1Parcel) {
      return new IcyHeaders(param1Parcel);
    }
    
    public IcyHeaders[] b(int param1Int) {
      return new IcyHeaders[param1Int];
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/metadata/icy/IcyHeaders.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */