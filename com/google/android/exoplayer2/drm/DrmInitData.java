package com.google.android.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.h0;
import com.google.android.exoplayer2.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

public final class DrmInitData implements Comparator<DrmInitData.SchemeData>, Parcelable {
  public static final Parcelable.Creator<DrmInitData> CREATOR = new a();
  
  private final SchemeData[] b;
  
  private int c;
  
  public final String d;
  
  public final int e;
  
  DrmInitData(Parcel paramParcel) {
    this.d = paramParcel.readString();
    SchemeData[] arrayOfSchemeData = (SchemeData[])h0.g(paramParcel.createTypedArray(SchemeData.CREATOR));
    this.b = arrayOfSchemeData;
    this.e = arrayOfSchemeData.length;
  }
  
  public DrmInitData(String paramString, List<SchemeData> paramList) {
    this(paramString, false, paramList.<SchemeData>toArray(new SchemeData[0]));
  }
  
  private DrmInitData(String paramString, boolean paramBoolean, SchemeData... paramVarArgs) {
    this.d = paramString;
    SchemeData[] arrayOfSchemeData = paramVarArgs;
    if (paramBoolean)
      arrayOfSchemeData = (SchemeData[])paramVarArgs.clone(); 
    this.b = arrayOfSchemeData;
    this.e = arrayOfSchemeData.length;
    Arrays.sort(arrayOfSchemeData, this);
  }
  
  public DrmInitData(String paramString, SchemeData... paramVarArgs) {
    this(paramString, true, paramVarArgs);
  }
  
  public DrmInitData(List<SchemeData> paramList) {
    this(null, false, paramList.<SchemeData>toArray(new SchemeData[0]));
  }
  
  public DrmInitData(SchemeData... paramVarArgs) {
    this((String)null, paramVarArgs);
  }
  
  private static boolean b(ArrayList<SchemeData> paramArrayList, int paramInt, UUID paramUUID) {
    for (byte b = 0; b < paramInt; b++) {
      if (SchemeData.a(paramArrayList.get(b)).equals(paramUUID))
        return true; 
    } 
    return false;
  }
  
  public static DrmInitData d(DrmInitData paramDrmInitData1, DrmInitData paramDrmInitData2) {
    String str;
    ArrayList<SchemeData> arrayList = new ArrayList();
    byte b = 0;
    DrmInitData drmInitData1 = null;
    if (paramDrmInitData1 != null) {
      String str1 = paramDrmInitData1.d;
      SchemeData[] arrayOfSchemeData = paramDrmInitData1.b;
      int i = arrayOfSchemeData.length;
      byte b1 = 0;
      while (true) {
        String str2 = str1;
        if (b1 < i) {
          SchemeData schemeData = arrayOfSchemeData[b1];
          if (schemeData.c())
            arrayList.add(schemeData); 
          b1++;
          continue;
        } 
        break;
      } 
    } else {
      paramDrmInitData1 = null;
    } 
    DrmInitData drmInitData2 = paramDrmInitData1;
    if (paramDrmInitData2 != null) {
      String str1;
      DrmInitData drmInitData = paramDrmInitData1;
      if (paramDrmInitData1 == null)
        str1 = paramDrmInitData2.d; 
      int j = arrayList.size();
      SchemeData[] arrayOfSchemeData = paramDrmInitData2.b;
      int i = arrayOfSchemeData.length;
      byte b1 = b;
      while (true) {
        str = str1;
        if (b1 < i) {
          SchemeData schemeData = arrayOfSchemeData[b1];
          if (schemeData.c() && !b(arrayList, j, SchemeData.a(schemeData)))
            arrayList.add(schemeData); 
          b1++;
          continue;
        } 
        break;
      } 
    } 
    if (arrayList.isEmpty()) {
      paramDrmInitData1 = drmInitData1;
    } else {
      paramDrmInitData1 = new DrmInitData(str, arrayList);
    } 
    return paramDrmInitData1;
  }
  
  public int a(SchemeData paramSchemeData1, SchemeData paramSchemeData2) {
    int i;
    UUID uUID = v.a;
    if (uUID.equals(SchemeData.a(paramSchemeData1))) {
      if (uUID.equals(SchemeData.a(paramSchemeData2))) {
        i = 0;
      } else {
        i = 1;
      } 
    } else {
      i = SchemeData.a(paramSchemeData1).compareTo(SchemeData.a(paramSchemeData2));
    } 
    return i;
  }
  
  public DrmInitData c(String paramString) {
    return h0.b(this.d, paramString) ? this : new DrmInitData(paramString, false, this.b);
  }
  
  public int describeContents() {
    return 0;
  }
  
  public SchemeData e(int paramInt) {
    return this.b[paramInt];
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = true;
    if (this == paramObject)
      return true; 
    if (paramObject == null || DrmInitData.class != paramObject.getClass())
      return false; 
    paramObject = paramObject;
    if (!h0.b(this.d, ((DrmInitData)paramObject).d) || !Arrays.equals((Object[])this.b, (Object[])((DrmInitData)paramObject).b))
      bool = false; 
    return bool;
  }
  
  public DrmInitData f(DrmInitData paramDrmInitData) {
    // Byte code:
    //   0: aload_0
    //   1: getfield d : Ljava/lang/String;
    //   4: astore_2
    //   5: aload_2
    //   6: ifnull -> 35
    //   9: aload_1
    //   10: getfield d : Ljava/lang/String;
    //   13: astore_3
    //   14: aload_3
    //   15: ifnull -> 35
    //   18: aload_2
    //   19: aload_3
    //   20: invokestatic equals : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    //   23: ifeq -> 29
    //   26: goto -> 35
    //   29: iconst_0
    //   30: istore #4
    //   32: goto -> 38
    //   35: iconst_1
    //   36: istore #4
    //   38: iload #4
    //   40: invokestatic f : (Z)V
    //   43: aload_0
    //   44: getfield d : Ljava/lang/String;
    //   47: astore_2
    //   48: aload_2
    //   49: ifnull -> 55
    //   52: goto -> 60
    //   55: aload_1
    //   56: getfield d : Ljava/lang/String;
    //   59: astore_2
    //   60: new com/google/android/exoplayer2/drm/DrmInitData
    //   63: dup
    //   64: aload_2
    //   65: aload_0
    //   66: getfield b : [Lcom/google/android/exoplayer2/drm/DrmInitData$SchemeData;
    //   69: aload_1
    //   70: getfield b : [Lcom/google/android/exoplayer2/drm/DrmInitData$SchemeData;
    //   73: invokestatic e0 : ([Ljava/lang/Object;[Ljava/lang/Object;)[Ljava/lang/Object;
    //   76: checkcast [Lcom/google/android/exoplayer2/drm/DrmInitData$SchemeData;
    //   79: invokespecial <init> : (Ljava/lang/String;[Lcom/google/android/exoplayer2/drm/DrmInitData$SchemeData;)V
    //   82: areturn
  }
  
  public int hashCode() {
    if (this.c == 0) {
      int i;
      String str = this.d;
      if (str == null) {
        i = 0;
      } else {
        i = str.hashCode();
      } 
      this.c = i * 31 + Arrays.hashCode((Object[])this.b);
    } 
    return this.c;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeString(this.d);
    paramParcel.writeTypedArray((Parcelable[])this.b, 0);
  }
  
  public static final class SchemeData implements Parcelable {
    public static final Parcelable.Creator<SchemeData> CREATOR = new a();
    
    private int b;
    
    private final UUID c;
    
    public final String d;
    
    public final String e;
    
    public final byte[] f;
    
    SchemeData(Parcel param1Parcel) {
      this.c = new UUID(param1Parcel.readLong(), param1Parcel.readLong());
      this.d = param1Parcel.readString();
      this.e = (String)h0.g(param1Parcel.readString());
      this.f = param1Parcel.createByteArray();
    }
    
    public SchemeData(UUID param1UUID, String param1String1, String param1String2, byte[] param1ArrayOfbyte) {
      this.c = (UUID)e.e(param1UUID);
      this.d = param1String1;
      this.e = (String)e.e(param1String2);
      this.f = param1ArrayOfbyte;
    }
    
    public SchemeData(UUID param1UUID, String param1String, byte[] param1ArrayOfbyte) {
      this(param1UUID, null, param1String, param1ArrayOfbyte);
    }
    
    public SchemeData b(byte[] param1ArrayOfbyte) {
      return new SchemeData(this.c, this.d, this.e, param1ArrayOfbyte);
    }
    
    public boolean c() {
      boolean bool;
      if (this.f != null) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    public boolean d(UUID param1UUID) {
      return (v.a.equals(this.c) || param1UUID.equals(this.c));
    }
    
    public int describeContents() {
      return 0;
    }
    
    public boolean equals(Object param1Object) {
      boolean bool = param1Object instanceof SchemeData;
      boolean bool1 = false;
      if (!bool)
        return false; 
      if (param1Object == this)
        return true; 
      param1Object = param1Object;
      bool = bool1;
      if (h0.b(this.d, ((SchemeData)param1Object).d)) {
        bool = bool1;
        if (h0.b(this.e, ((SchemeData)param1Object).e)) {
          bool = bool1;
          if (h0.b(this.c, ((SchemeData)param1Object).c)) {
            bool = bool1;
            if (Arrays.equals(this.f, ((SchemeData)param1Object).f))
              bool = true; 
          } 
        } 
      } 
      return bool;
    }
    
    public int hashCode() {
      if (this.b == 0) {
        int j;
        int i = this.c.hashCode();
        String str = this.d;
        if (str == null) {
          j = 0;
        } else {
          j = str.hashCode();
        } 
        this.b = ((i * 31 + j) * 31 + this.e.hashCode()) * 31 + Arrays.hashCode(this.f);
      } 
      return this.b;
    }
    
    public void writeToParcel(Parcel param1Parcel, int param1Int) {
      param1Parcel.writeLong(this.c.getMostSignificantBits());
      param1Parcel.writeLong(this.c.getLeastSignificantBits());
      param1Parcel.writeString(this.d);
      param1Parcel.writeString(this.e);
      param1Parcel.writeByteArray(this.f);
    }
    
    static final class a implements Parcelable.Creator<SchemeData> {
      public DrmInitData.SchemeData a(Parcel param2Parcel) {
        return new DrmInitData.SchemeData(param2Parcel);
      }
      
      public DrmInitData.SchemeData[] b(int param2Int) {
        return new DrmInitData.SchemeData[param2Int];
      }
    }
  }
  
  static final class a implements Parcelable.Creator<SchemeData> {
    public DrmInitData.SchemeData a(Parcel param1Parcel) {
      return new DrmInitData.SchemeData(param1Parcel);
    }
    
    public DrmInitData.SchemeData[] b(int param1Int) {
      return new DrmInitData.SchemeData[param1Int];
    }
  }
  
  static final class a implements Parcelable.Creator<DrmInitData> {
    public DrmInitData a(Parcel param1Parcel) {
      return new DrmInitData(param1Parcel);
    }
    
    public DrmInitData[] b(int param1Int) {
      return new DrmInitData[param1Int];
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/drm/DrmInitData.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */