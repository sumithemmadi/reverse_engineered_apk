package com.fasterxml.jackson.core;

public enum JsonToken {
  b, c, d, e, f, g, h, i, j, k, l, m, n;
  
  final int _id;
  
  final boolean _isBoolean;
  
  final boolean _isNumber;
  
  final boolean _isScalar;
  
  final boolean _isStructEnd;
  
  final boolean _isStructStart;
  
  final String _serialized;
  
  final byte[] _serializedBytes;
  
  final char[] _serializedChars;
  
  static {
    JsonToken jsonToken1 = new JsonToken("NOT_AVAILABLE", 0, null, -1);
    b = jsonToken1;
    JsonToken jsonToken2 = new JsonToken("START_OBJECT", 1, "{", 1);
    c = jsonToken2;
    JsonToken jsonToken3 = new JsonToken("END_OBJECT", 2, "}", 2);
    d = jsonToken3;
    JsonToken jsonToken4 = new JsonToken("START_ARRAY", 3, "[", 3);
    e = jsonToken4;
    JsonToken jsonToken5 = new JsonToken("END_ARRAY", 4, "]", 4);
    f = jsonToken5;
    JsonToken jsonToken6 = new JsonToken("FIELD_NAME", 5, null, 5);
    g = jsonToken6;
    JsonToken jsonToken7 = new JsonToken("VALUE_EMBEDDED_OBJECT", 6, null, 12);
    h = jsonToken7;
    JsonToken jsonToken8 = new JsonToken("VALUE_STRING", 7, null, 6);
    i = jsonToken8;
    JsonToken jsonToken9 = new JsonToken("VALUE_NUMBER_INT", 8, null, 7);
    j = jsonToken9;
    JsonToken jsonToken10 = new JsonToken("VALUE_NUMBER_FLOAT", 9, null, 8);
    k = jsonToken10;
    JsonToken jsonToken11 = new JsonToken("VALUE_TRUE", 10, "true", 9);
    l = jsonToken11;
    JsonToken jsonToken12 = new JsonToken("VALUE_FALSE", 11, "false", 10);
    m = jsonToken12;
    JsonToken jsonToken13 = new JsonToken("VALUE_NULL", 12, "null", 11);
    n = jsonToken13;
    o = new JsonToken[] { 
        jsonToken1, jsonToken2, jsonToken3, jsonToken4, jsonToken5, jsonToken6, jsonToken7, jsonToken8, jsonToken9, jsonToken10, 
        jsonToken11, jsonToken12, jsonToken13 };
  }
  
  JsonToken(String paramString1, int paramInt1) {
    boolean bool2;
    boolean bool3;
    boolean bool1 = false;
    if (paramString1 == null) {
      this._serialized = null;
      this._serializedChars = null;
      this._serializedBytes = null;
    } else {
      this._serialized = paramString1;
      char[] arrayOfChar = paramString1.toCharArray();
      this._serializedChars = arrayOfChar;
      int i = arrayOfChar.length;
      this._serializedBytes = new byte[i];
      for (this$enum$index = 0; this$enum$index < i; this$enum$index++)
        this._serializedBytes[this$enum$index] = (byte)(byte)this._serializedChars[this$enum$index]; 
    } 
    this._id = paramInt1;
    if (paramInt1 == 10 || paramInt1 == 9) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    this._isBoolean = bool2;
    if (paramInt1 == 7 || paramInt1 == 8) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    this._isNumber = bool2;
    if (paramInt1 == 1 || paramInt1 == 3) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    this._isStructStart = bool2;
    if (paramInt1 == 2 || paramInt1 == 4) {
      bool3 = true;
    } else {
      bool3 = false;
    } 
    this._isStructEnd = bool3;
    boolean bool4 = bool1;
    if (!bool2) {
      bool4 = bool1;
      if (!bool3) {
        bool4 = bool1;
        if (paramInt1 != 5) {
          bool4 = bool1;
          if (paramInt1 != -1)
            bool4 = true; 
        } 
      } 
    } 
    this._isScalar = bool4;
  }
  
  public final byte[] asByteArray() {
    return this._serializedBytes;
  }
  
  public final char[] asCharArray() {
    return this._serializedChars;
  }
  
  public final String asString() {
    return this._serialized;
  }
  
  public final int id() {
    return this._id;
  }
  
  public final boolean isBoolean() {
    return this._isBoolean;
  }
  
  public final boolean isNumeric() {
    return this._isNumber;
  }
  
  public final boolean isScalarValue() {
    return this._isScalar;
  }
  
  public final boolean isStructEnd() {
    return this._isStructEnd;
  }
  
  public final boolean isStructStart() {
    return this._isStructStart;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/fasterxml/jackson/core/JsonToken.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */