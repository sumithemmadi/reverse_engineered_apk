package com.fasterxml.jackson.core;

import java.io.IOException;

public class JsonProcessingException extends IOException {
  static final long serialVersionUID = 123L;
  
  protected JsonLocation _location;
  
  protected JsonProcessingException(String paramString) {
    super(paramString);
  }
  
  protected JsonProcessingException(String paramString, JsonLocation paramJsonLocation) {
    this(paramString, paramJsonLocation, null);
  }
  
  protected JsonProcessingException(String paramString, JsonLocation paramJsonLocation, Throwable paramThrowable) {
    super(paramString);
    if (paramThrowable != null)
      initCause(paramThrowable); 
    this._location = paramJsonLocation;
  }
  
  protected JsonProcessingException(String paramString, Throwable paramThrowable) {
    this(paramString, null, paramThrowable);
  }
  
  protected JsonProcessingException(Throwable paramThrowable) {
    this(null, null, paramThrowable);
  }
  
  public void clearLocation() {
    this._location = null;
  }
  
  public JsonLocation getLocation() {
    return this._location;
  }
  
  public String getMessage() {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial getMessage : ()Ljava/lang/String;
    //   4: astore_1
    //   5: aload_1
    //   6: astore_2
    //   7: aload_1
    //   8: ifnonnull -> 14
    //   11: ldc 'N/A'
    //   13: astore_2
    //   14: aload_0
    //   15: invokevirtual getLocation : ()Lcom/fasterxml/jackson/core/JsonLocation;
    //   18: astore_3
    //   19: aload_0
    //   20: invokevirtual getMessageSuffix : ()Ljava/lang/String;
    //   23: astore #4
    //   25: aload_3
    //   26: ifnonnull -> 36
    //   29: aload_2
    //   30: astore_1
    //   31: aload #4
    //   33: ifnull -> 96
    //   36: new java/lang/StringBuilder
    //   39: dup
    //   40: bipush #100
    //   42: invokespecial <init> : (I)V
    //   45: astore_1
    //   46: aload_1
    //   47: aload_2
    //   48: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   51: pop
    //   52: aload #4
    //   54: ifnull -> 64
    //   57: aload_1
    //   58: aload #4
    //   60: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   63: pop
    //   64: aload_3
    //   65: ifnull -> 91
    //   68: aload_1
    //   69: bipush #10
    //   71: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   74: pop
    //   75: aload_1
    //   76: ldc ' at '
    //   78: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   81: pop
    //   82: aload_1
    //   83: aload_3
    //   84: invokevirtual toString : ()Ljava/lang/String;
    //   87: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   90: pop
    //   91: aload_1
    //   92: invokevirtual toString : ()Ljava/lang/String;
    //   95: astore_1
    //   96: aload_1
    //   97: areturn
  }
  
  protected String getMessageSuffix() {
    return null;
  }
  
  public String getOriginalMessage() {
    return super.getMessage();
  }
  
  public Object getProcessor() {
    return null;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(getClass().getName());
    stringBuilder.append(": ");
    stringBuilder.append(getMessage());
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/fasterxml/jackson/core/JsonProcessingException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */