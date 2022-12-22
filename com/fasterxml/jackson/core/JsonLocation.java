package com.fasterxml.jackson.core;

import java.io.Serializable;
import java.nio.charset.Charset;

public class JsonLocation implements Serializable {
  public static final JsonLocation b = new JsonLocation(null, -1L, -1L, -1, -1);
  
  private static final long serialVersionUID = 1L;
  
  protected final int _columnNr;
  
  protected final int _lineNr;
  
  protected final long _totalBytes;
  
  protected final long _totalChars;
  
  final transient Object c;
  
  public JsonLocation(Object paramObject, long paramLong, int paramInt1, int paramInt2) {
    this(paramObject, -1L, paramLong, paramInt1, paramInt2);
  }
  
  public JsonLocation(Object paramObject, long paramLong1, long paramLong2, int paramInt1, int paramInt2) {
    this.c = paramObject;
    this._totalBytes = paramLong1;
    this._totalChars = paramLong2;
    this._lineNr = paramInt1;
    this._columnNr = paramInt2;
  }
  
  private int a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append('"');
    paramStringBuilder.append(paramString);
    paramStringBuilder.append('"');
    return paramString.length();
  }
  
  protected StringBuilder _appendSourceDesc(StringBuilder paramStringBuilder) {
    Class<?> clazz;
    int j;
    Object object = this.c;
    if (object == null) {
      paramStringBuilder.append("UNKNOWN");
      return paramStringBuilder;
    } 
    if (object instanceof Class) {
      clazz = (Class)object;
    } else {
      clazz = object.getClass();
    } 
    String str2 = clazz.getName();
    if (str2.startsWith("java.")) {
      str1 = clazz.getSimpleName();
    } else if (object instanceof byte[]) {
      str1 = "byte[]";
    } else {
      str1 = str2;
      if (object instanceof char[])
        str1 = "char[]"; 
    } 
    paramStringBuilder.append('(');
    paramStringBuilder.append(str1);
    paramStringBuilder.append(')');
    boolean bool = object instanceof CharSequence;
    int i = 0;
    String str1 = " chars";
    if (bool) {
      CharSequence charSequence = (CharSequence)object;
      i = charSequence.length();
      j = a(paramStringBuilder, charSequence.subSequence(0, Math.min(i, 500)).toString());
    } else if (object instanceof char[]) {
      char[] arrayOfChar = (char[])object;
      i = arrayOfChar.length;
      j = a(paramStringBuilder, new String(arrayOfChar, 0, Math.min(i, 500)));
    } else {
      if (object instanceof byte[]) {
        byte[] arrayOfByte = (byte[])object;
        i = Math.min(arrayOfByte.length, 500);
        a(paramStringBuilder, new String(arrayOfByte, 0, i, Charset.forName("UTF-8")));
        i = arrayOfByte.length - i;
        str1 = " bytes";
      } 
      if (i > 0) {
        paramStringBuilder.append("[truncated ");
        paramStringBuilder.append(i);
        paramStringBuilder.append(str1);
        paramStringBuilder.append(']');
      } 
    } 
    i -= j;
    if (i > 0) {
      paramStringBuilder.append("[truncated ");
      paramStringBuilder.append(i);
      paramStringBuilder.append(str1);
      paramStringBuilder.append(']');
    } 
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = true;
    if (paramObject == this)
      return true; 
    if (paramObject == null)
      return false; 
    if (!(paramObject instanceof JsonLocation))
      return false; 
    paramObject = paramObject;
    Object object = this.c;
    if (object == null) {
      if (((JsonLocation)paramObject).c != null)
        return false; 
    } else if (!object.equals(((JsonLocation)paramObject).c)) {
      return false;
    } 
    if (this._lineNr != ((JsonLocation)paramObject)._lineNr || this._columnNr != ((JsonLocation)paramObject)._columnNr || this._totalChars != ((JsonLocation)paramObject)._totalChars || getByteOffset() != paramObject.getByteOffset())
      bool = false; 
    return bool;
  }
  
  public long getByteOffset() {
    return this._totalBytes;
  }
  
  public long getCharOffset() {
    return this._totalChars;
  }
  
  public int getColumnNr() {
    return this._columnNr;
  }
  
  public int getLineNr() {
    return this._lineNr;
  }
  
  public Object getSourceRef() {
    return this.c;
  }
  
  public int hashCode() {
    int i;
    Object object = this.c;
    if (object == null) {
      i = 1;
    } else {
      i = object.hashCode();
    } 
    return ((i ^ this._lineNr) + this._columnNr ^ (int)this._totalChars) + (int)this._totalBytes;
  }
  
  public String sourceDescription() {
    return _appendSourceDesc(new StringBuilder(100)).toString();
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder(80);
    stringBuilder.append("[Source: ");
    _appendSourceDesc(stringBuilder);
    stringBuilder.append("; line: ");
    stringBuilder.append(this._lineNr);
    stringBuilder.append(", column: ");
    stringBuilder.append(this._columnNr);
    stringBuilder.append(']');
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/fasterxml/jackson/core/JsonLocation.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */