package com.google.android.datatransport.h;

import com.google.android.datatransport.Priority;
import java.util.Arrays;

final class c extends m {
  private final String a;
  
  private final byte[] b;
  
  private final Priority c;
  
  private c(String paramString, byte[] paramArrayOfbyte, Priority paramPriority) {
    this.a = paramString;
    this.b = paramArrayOfbyte;
    this.c = paramPriority;
  }
  
  public String b() {
    return this.a;
  }
  
  public byte[] c() {
    return this.b;
  }
  
  public Priority d() {
    return this.c;
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = true;
    if (paramObject == this)
      return true; 
    if (paramObject instanceof m) {
      m m1 = (m)paramObject;
      if (this.a.equals(m1.b())) {
        byte[] arrayOfByte = this.b;
        if (m1 instanceof c) {
          paramObject = ((c)m1).b;
        } else {
          paramObject = m1.c();
        } 
        if (Arrays.equals(arrayOfByte, (byte[])paramObject) && this.c.equals(m1.d()))
          return bool; 
      } 
      return false;
    } 
    return false;
  }
  
  public int hashCode() {
    return ((this.a.hashCode() ^ 0xF4243) * 1000003 ^ Arrays.hashCode(this.b)) * 1000003 ^ this.c.hashCode();
  }
  
  static final class b extends m.a {
    private String a;
    
    private byte[] b;
    
    private Priority c;
    
    public m a() {
      String str1 = this.a;
      String str2 = "";
      if (str1 == null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("");
        stringBuilder1.append(" backendName");
        str2 = stringBuilder1.toString();
      } 
      str1 = str2;
      if (this.c == null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(str2);
        stringBuilder1.append(" priority");
        str1 = stringBuilder1.toString();
      } 
      if (str1.isEmpty())
        return new c(this.a, this.b, this.c, null); 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Missing required properties:");
      stringBuilder.append(str1);
      throw new IllegalStateException(stringBuilder.toString());
    }
    
    public m.a b(String param1String) {
      if (param1String != null) {
        this.a = param1String;
        return this;
      } 
      throw new NullPointerException("Null backendName");
    }
    
    public m.a c(byte[] param1ArrayOfbyte) {
      this.b = param1ArrayOfbyte;
      return this;
    }
    
    public m.a d(Priority param1Priority) {
      if (param1Priority != null) {
        this.c = param1Priority;
        return this;
      } 
      throw new NullPointerException("Null priority");
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/h/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */