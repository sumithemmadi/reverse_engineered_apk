package com.google.android.play.core.splitcompat;

import java.io.File;

final class r {
  private final File a;
  
  private final String b;
  
  r() {}
  
  r(File paramFile, String paramString) {
    this();
    if (paramFile != null) {
      this.a = paramFile;
      if (paramString != null) {
        this.b = paramString;
        return;
      } 
      throw new NullPointerException("Null splitId");
    } 
    throw new NullPointerException("Null splitFile");
  }
  
  File a() {
    return this.a;
  }
  
  String b() {
    return this.b;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof r) {
      paramObject = paramObject;
      if (this.a.equals(paramObject.a()) && this.b.equals(paramObject.b()))
        return true; 
    } 
    return false;
  }
  
  public int hashCode() {
    return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode();
  }
  
  public String toString() {
    String str1 = String.valueOf(this.a);
    String str2 = this.b;
    StringBuilder stringBuilder = new StringBuilder(str1.length() + 35 + str2.length());
    stringBuilder.append("SplitFileInfo{splitFile=");
    stringBuilder.append(str1);
    stringBuilder.append(", splitId=");
    stringBuilder.append(str2);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/play/core/splitcompat/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */