package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.h.h;
import java.util.Arrays;

final class a extends f {
  private final Iterable<h> a;
  
  private final byte[] b;
  
  private a(Iterable<h> paramIterable, byte[] paramArrayOfbyte) {
    this.a = paramIterable;
    this.b = paramArrayOfbyte;
  }
  
  public Iterable<h> b() {
    return this.a;
  }
  
  public byte[] c() {
    return this.b;
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = true;
    if (paramObject == this)
      return true; 
    if (paramObject instanceof f) {
      paramObject = paramObject;
      if (this.a.equals(paramObject.b())) {
        byte[] arrayOfByte = this.b;
        if (paramObject instanceof a) {
          paramObject = ((a)paramObject).b;
        } else {
          paramObject = paramObject.c();
        } 
        if (Arrays.equals(arrayOfByte, (byte[])paramObject))
          return bool; 
      } 
      return false;
    } 
    return false;
  }
  
  public int hashCode() {
    return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ Arrays.hashCode(this.b);
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("BackendRequest{events=");
    stringBuilder.append(this.a);
    stringBuilder.append(", extras=");
    stringBuilder.append(Arrays.toString(this.b));
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
  
  static final class b extends f.a {
    private Iterable<h> a;
    
    private byte[] b;
    
    public f a() {
      Iterable<h> iterable = this.a;
      String str = "";
      if (iterable == null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("");
        stringBuilder1.append(" events");
        str = stringBuilder1.toString();
      } 
      if (str.isEmpty())
        return new a(this.a, this.b, null); 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Missing required properties:");
      stringBuilder.append(str);
      throw new IllegalStateException(stringBuilder.toString());
    }
    
    public f.a b(Iterable<h> param1Iterable) {
      if (param1Iterable != null) {
        this.a = param1Iterable;
        return this;
      } 
      throw new NullPointerException("Null events");
    }
    
    public f.a c(byte[] param1ArrayOfbyte) {
      this.b = param1ArrayOfbyte;
      return this;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/runtime/backends/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */