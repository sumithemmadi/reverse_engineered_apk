package com.google.android.datatransport.h;

import com.google.android.datatransport.b;
import java.util.Arrays;

public final class g {
  private final b a;
  
  private final byte[] b;
  
  public g(b paramb, byte[] paramArrayOfbyte) {
    if (paramb != null) {
      if (paramArrayOfbyte != null) {
        this.a = paramb;
        this.b = paramArrayOfbyte;
        return;
      } 
      throw new NullPointerException("bytes is null");
    } 
    throw new NullPointerException("encoding is null");
  }
  
  public byte[] a() {
    return this.b;
  }
  
  public b b() {
    return this.a;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof g))
      return false; 
    paramObject = paramObject;
    return !this.a.equals(((g)paramObject).a) ? false : Arrays.equals(this.b, ((g)paramObject).b);
  }
  
  public int hashCode() {
    return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ Arrays.hashCode(this.b);
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("EncodedPayload{encoding=");
    stringBuilder.append(this.a);
    stringBuilder.append(", bytes=[...]}");
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/h/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */