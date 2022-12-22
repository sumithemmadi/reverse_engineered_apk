package com.google.android.datatransport.cct.internal;

import com.google.auto.value.AutoValue;
import com.google.auto.value.AutoValue.Builder;

@AutoValue
public abstract class ClientInfo {
  public static a a() {
    return new e.b();
  }
  
  public abstract a b();
  
  public abstract ClientType c();
  
  public enum ClientType {
    b, c;
    
    private final int value;
    
    static {
      ClientType clientType1 = new ClientType("UNKNOWN", 0, 0);
      b = clientType1;
      ClientType clientType2 = new ClientType("ANDROID_FIREBASE", 1, 23);
      c = clientType2;
      d = new ClientType[] { clientType1, clientType2 };
    }
    
    ClientType(int param1Int1) {
      this.value = param1Int1;
    }
  }
  
  @Builder
  public static abstract class a {
    public abstract ClientInfo a();
    
    public abstract a b(a param1a);
    
    public abstract a c(ClientInfo.ClientType param1ClientType);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/cct/internal/ClientInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */