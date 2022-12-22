package com.google.android.datatransport.cct.internal;

final class i extends NetworkConnectionInfo {
  private final NetworkConnectionInfo.NetworkType a;
  
  private final NetworkConnectionInfo.MobileSubtype b;
  
  private i(NetworkConnectionInfo.NetworkType paramNetworkType, NetworkConnectionInfo.MobileSubtype paramMobileSubtype) {
    this.a = paramNetworkType;
    this.b = paramMobileSubtype;
  }
  
  public NetworkConnectionInfo.MobileSubtype b() {
    return this.b;
  }
  
  public NetworkConnectionInfo.NetworkType c() {
    return this.a;
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = true;
    if (paramObject == this)
      return true; 
    if (paramObject instanceof NetworkConnectionInfo) {
      paramObject = paramObject;
      NetworkConnectionInfo.NetworkType networkType = this.a;
      if ((networkType == null) ? (paramObject.c() == null) : networkType.equals(paramObject.c())) {
        NetworkConnectionInfo.MobileSubtype mobileSubtype = this.b;
        if ((mobileSubtype == null) ? (paramObject.b() == null) : mobileSubtype.equals(paramObject.b()))
          return bool; 
      } 
      return false;
    } 
    return false;
  }
  
  public int hashCode() {
    int k;
    NetworkConnectionInfo.NetworkType networkType = this.a;
    int j = 0;
    if (networkType == null) {
      k = 0;
    } else {
      k = networkType.hashCode();
    } 
    NetworkConnectionInfo.MobileSubtype mobileSubtype = this.b;
    if (mobileSubtype != null)
      j = mobileSubtype.hashCode(); 
    return (k ^ 0xF4243) * 1000003 ^ j;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("NetworkConnectionInfo{networkType=");
    stringBuilder.append(this.a);
    stringBuilder.append(", mobileSubtype=");
    stringBuilder.append(this.b);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
  
  static final class b extends NetworkConnectionInfo.a {
    private NetworkConnectionInfo.NetworkType a;
    
    private NetworkConnectionInfo.MobileSubtype b;
    
    public NetworkConnectionInfo a() {
      return new i(this.a, this.b, null);
    }
    
    public NetworkConnectionInfo.a b(NetworkConnectionInfo.MobileSubtype param1MobileSubtype) {
      this.b = param1MobileSubtype;
      return this;
    }
    
    public NetworkConnectionInfo.a c(NetworkConnectionInfo.NetworkType param1NetworkType) {
      this.a = param1NetworkType;
      return this;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/cct/internal/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */