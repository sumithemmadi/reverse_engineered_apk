package com.google.android.datatransport.cct.internal;

final class e extends ClientInfo {
  private final ClientInfo.ClientType a;
  
  private final a b;
  
  private e(ClientInfo.ClientType paramClientType, a parama) {
    this.a = paramClientType;
    this.b = parama;
  }
  
  public a b() {
    return this.b;
  }
  
  public ClientInfo.ClientType c() {
    return this.a;
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = true;
    if (paramObject == this)
      return true; 
    if (paramObject instanceof ClientInfo) {
      paramObject = paramObject;
      ClientInfo.ClientType clientType = this.a;
      if ((clientType == null) ? (paramObject.c() == null) : clientType.equals(paramObject.c())) {
        a a1 = this.b;
        if ((a1 == null) ? (paramObject.b() == null) : a1.equals(paramObject.b()))
          return bool; 
      } 
      return false;
    } 
    return false;
  }
  
  public int hashCode() {
    int j;
    ClientInfo.ClientType clientType = this.a;
    int i = 0;
    if (clientType == null) {
      j = 0;
    } else {
      j = clientType.hashCode();
    } 
    a a1 = this.b;
    if (a1 != null)
      i = a1.hashCode(); 
    return (j ^ 0xF4243) * 1000003 ^ i;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("ClientInfo{clientType=");
    stringBuilder.append(this.a);
    stringBuilder.append(", androidClientInfo=");
    stringBuilder.append(this.b);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
  
  static final class b extends ClientInfo.a {
    private ClientInfo.ClientType a;
    
    private a b;
    
    public ClientInfo a() {
      return new e(this.a, this.b, null);
    }
    
    public ClientInfo.a b(a param1a) {
      this.b = param1a;
      return this;
    }
    
    public ClientInfo.a c(ClientInfo.ClientType param1ClientType) {
      this.a = param1ClientType;
      return this;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/cct/internal/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */