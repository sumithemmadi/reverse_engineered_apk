package com.danikula.videocache;

public class o {
  public final String a;
  
  public final long b;
  
  public final String c;
  
  public o(String paramString1, long paramLong, String paramString2) {
    this.a = paramString1;
    this.b = paramLong;
    this.c = paramString2;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("SourceInfo{url='");
    stringBuilder.append(this.a);
    stringBuilder.append('\'');
    stringBuilder.append(", length=");
    stringBuilder.append(this.b);
    stringBuilder.append(", mime='");
    stringBuilder.append(this.c);
    stringBuilder.append('\'');
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/danikula/videocache/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */