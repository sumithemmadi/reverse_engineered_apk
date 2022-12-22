package com.google.android.datatransport.cct.internal;

import android.util.SparseArray;
import com.google.auto.value.AutoValue;
import com.google.auto.value.AutoValue.Builder;

@AutoValue
public abstract class NetworkConnectionInfo {
  public static a a() {
    return new i.b();
  }
  
  public abstract MobileSubtype b();
  
  public abstract NetworkType c();
  
  public enum MobileSubtype {
    b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v;
    
    private static final SparseArray<MobileSubtype> w;
    
    private final int value;
    
    static {
      MobileSubtype mobileSubtype1 = new MobileSubtype("UNKNOWN_MOBILE_SUBTYPE", 0, 0);
      b = mobileSubtype1;
      MobileSubtype mobileSubtype2 = new MobileSubtype("GPRS", 1, 1);
      c = mobileSubtype2;
      MobileSubtype mobileSubtype3 = new MobileSubtype("EDGE", 2, 2);
      d = mobileSubtype3;
      MobileSubtype mobileSubtype4 = new MobileSubtype("UMTS", 3, 3);
      e = mobileSubtype4;
      MobileSubtype mobileSubtype5 = new MobileSubtype("CDMA", 4, 4);
      f = mobileSubtype5;
      MobileSubtype mobileSubtype6 = new MobileSubtype("EVDO_0", 5, 5);
      g = mobileSubtype6;
      MobileSubtype mobileSubtype7 = new MobileSubtype("EVDO_A", 6, 6);
      h = mobileSubtype7;
      MobileSubtype mobileSubtype8 = new MobileSubtype("RTT", 7, 7);
      i = mobileSubtype8;
      MobileSubtype mobileSubtype9 = new MobileSubtype("HSDPA", 8, 8);
      j = mobileSubtype9;
      MobileSubtype mobileSubtype10 = new MobileSubtype("HSUPA", 9, 9);
      k = mobileSubtype10;
      MobileSubtype mobileSubtype11 = new MobileSubtype("HSPA", 10, 10);
      l = mobileSubtype11;
      MobileSubtype mobileSubtype12 = new MobileSubtype("IDEN", 11, 11);
      m = mobileSubtype12;
      MobileSubtype mobileSubtype13 = new MobileSubtype("EVDO_B", 12, 12);
      n = mobileSubtype13;
      MobileSubtype mobileSubtype14 = new MobileSubtype("LTE", 13, 13);
      o = mobileSubtype14;
      MobileSubtype mobileSubtype15 = new MobileSubtype("EHRPD", 14, 14);
      p = mobileSubtype15;
      MobileSubtype mobileSubtype16 = new MobileSubtype("HSPAP", 15, 15);
      q = mobileSubtype16;
      MobileSubtype mobileSubtype17 = new MobileSubtype("GSM", 16, 16);
      r = mobileSubtype17;
      MobileSubtype mobileSubtype18 = new MobileSubtype("TD_SCDMA", 17, 17);
      s = mobileSubtype18;
      MobileSubtype mobileSubtype19 = new MobileSubtype("IWLAN", 18, 18);
      t = mobileSubtype19;
      MobileSubtype mobileSubtype20 = new MobileSubtype("LTE_CA", 19, 19);
      u = mobileSubtype20;
      MobileSubtype mobileSubtype21 = new MobileSubtype("COMBINED", 20, 100);
      v = mobileSubtype21;
      x = new MobileSubtype[] { 
          mobileSubtype1, mobileSubtype2, mobileSubtype3, mobileSubtype4, mobileSubtype5, mobileSubtype6, mobileSubtype7, mobileSubtype8, mobileSubtype9, mobileSubtype10, 
          mobileSubtype11, mobileSubtype12, mobileSubtype13, mobileSubtype14, mobileSubtype15, mobileSubtype16, mobileSubtype17, mobileSubtype18, mobileSubtype19, mobileSubtype20, 
          mobileSubtype21 };
      SparseArray<MobileSubtype> sparseArray = new SparseArray();
      w = sparseArray;
      sparseArray.put(0, mobileSubtype1);
      sparseArray.put(1, mobileSubtype2);
      sparseArray.put(2, mobileSubtype3);
      sparseArray.put(3, mobileSubtype4);
      sparseArray.put(4, mobileSubtype5);
      sparseArray.put(5, mobileSubtype6);
      sparseArray.put(6, mobileSubtype7);
      sparseArray.put(7, mobileSubtype8);
      sparseArray.put(8, mobileSubtype9);
      sparseArray.put(9, mobileSubtype10);
      sparseArray.put(10, mobileSubtype11);
      sparseArray.put(11, mobileSubtype12);
      sparseArray.put(12, mobileSubtype13);
      sparseArray.put(13, mobileSubtype14);
      sparseArray.put(14, mobileSubtype15);
      sparseArray.put(15, mobileSubtype16);
      sparseArray.put(16, mobileSubtype17);
      sparseArray.put(17, mobileSubtype18);
      sparseArray.put(18, mobileSubtype19);
      sparseArray.put(19, mobileSubtype20);
    }
    
    MobileSubtype(int param1Int1) {
      this.value = param1Int1;
    }
    
    public static MobileSubtype forNumber(int param1Int) {
      return (MobileSubtype)w.get(param1Int);
    }
    
    public int getValue() {
      return this.value;
    }
  }
  
  public enum NetworkType {
    b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t;
    
    private static final SparseArray<NetworkType> u;
    
    private final int value;
    
    static {
      NetworkType networkType1 = new NetworkType("MOBILE", 0, 0);
      b = networkType1;
      NetworkType networkType2 = new NetworkType("WIFI", 1, 1);
      c = networkType2;
      NetworkType networkType3 = new NetworkType("MOBILE_MMS", 2, 2);
      d = networkType3;
      NetworkType networkType4 = new NetworkType("MOBILE_SUPL", 3, 3);
      e = networkType4;
      NetworkType networkType5 = new NetworkType("MOBILE_DUN", 4, 4);
      f = networkType5;
      NetworkType networkType6 = new NetworkType("MOBILE_HIPRI", 5, 5);
      g = networkType6;
      NetworkType networkType7 = new NetworkType("WIMAX", 6, 6);
      h = networkType7;
      NetworkType networkType8 = new NetworkType("BLUETOOTH", 7, 7);
      i = networkType8;
      NetworkType networkType9 = new NetworkType("DUMMY", 8, 8);
      j = networkType9;
      NetworkType networkType10 = new NetworkType("ETHERNET", 9, 9);
      k = networkType10;
      NetworkType networkType11 = new NetworkType("MOBILE_FOTA", 10, 10);
      l = networkType11;
      NetworkType networkType12 = new NetworkType("MOBILE_IMS", 11, 11);
      m = networkType12;
      NetworkType networkType13 = new NetworkType("MOBILE_CBS", 12, 12);
      n = networkType13;
      NetworkType networkType14 = new NetworkType("WIFI_P2P", 13, 13);
      o = networkType14;
      NetworkType networkType15 = new NetworkType("MOBILE_IA", 14, 14);
      p = networkType15;
      NetworkType networkType16 = new NetworkType("MOBILE_EMERGENCY", 15, 15);
      q = networkType16;
      NetworkType networkType17 = new NetworkType("PROXY", 16, 16);
      r = networkType17;
      NetworkType networkType18 = new NetworkType("VPN", 17, 17);
      s = networkType18;
      NetworkType networkType19 = new NetworkType("NONE", 18, -1);
      t = networkType19;
      v = new NetworkType[] { 
          networkType1, networkType2, networkType3, networkType4, networkType5, networkType6, networkType7, networkType8, networkType9, networkType10, 
          networkType11, networkType12, networkType13, networkType14, networkType15, networkType16, networkType17, networkType18, networkType19 };
      SparseArray<NetworkType> sparseArray = new SparseArray();
      u = sparseArray;
      sparseArray.put(0, networkType1);
      sparseArray.put(1, networkType2);
      sparseArray.put(2, networkType3);
      sparseArray.put(3, networkType4);
      sparseArray.put(4, networkType5);
      sparseArray.put(5, networkType6);
      sparseArray.put(6, networkType7);
      sparseArray.put(7, networkType8);
      sparseArray.put(8, networkType9);
      sparseArray.put(9, networkType10);
      sparseArray.put(10, networkType11);
      sparseArray.put(11, networkType12);
      sparseArray.put(12, networkType13);
      sparseArray.put(13, networkType14);
      sparseArray.put(14, networkType15);
      sparseArray.put(15, networkType16);
      sparseArray.put(16, networkType17);
      sparseArray.put(17, networkType18);
      sparseArray.put(-1, networkType19);
    }
    
    NetworkType(int param1Int1) {
      this.value = param1Int1;
    }
    
    public static NetworkType forNumber(int param1Int) {
      return (NetworkType)u.get(param1Int);
    }
    
    public int getValue() {
      return this.value;
    }
  }
  
  @Builder
  public static abstract class a {
    public abstract NetworkConnectionInfo a();
    
    public abstract a b(NetworkConnectionInfo.MobileSubtype param1MobileSubtype);
    
    public abstract a c(NetworkConnectionInfo.NetworkType param1NetworkType);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/cct/internal/NetworkConnectionInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */