package com.fasterxml.jackson.core.util;

import java.io.IOException;
import java.io.Serializable;

public class RequestPayload implements Serializable {
  private static final long serialVersionUID = 1L;
  
  protected String _charset;
  
  protected byte[] _payloadAsBytes;
  
  protected CharSequence _payloadAsText;
  
  public RequestPayload(CharSequence paramCharSequence) {
    if (paramCharSequence != null) {
      this._payloadAsText = paramCharSequence;
      return;
    } 
    throw new IllegalArgumentException();
  }
  
  public RequestPayload(byte[] paramArrayOfbyte, String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_1
    //   5: ifnull -> 35
    //   8: aload_0
    //   9: aload_1
    //   10: putfield _payloadAsBytes : [B
    //   13: aload_2
    //   14: ifnull -> 26
    //   17: aload_2
    //   18: astore_1
    //   19: aload_2
    //   20: invokevirtual isEmpty : ()Z
    //   23: ifeq -> 29
    //   26: ldc 'UTF-8'
    //   28: astore_1
    //   29: aload_0
    //   30: aload_1
    //   31: putfield _charset : Ljava/lang/String;
    //   34: return
    //   35: new java/lang/IllegalArgumentException
    //   38: dup
    //   39: invokespecial <init> : ()V
    //   42: athrow
  }
  
  public Object getRawPayload() {
    byte[] arrayOfByte = this._payloadAsBytes;
    return (arrayOfByte != null) ? arrayOfByte : this._payloadAsText;
  }
  
  public String toString() {
    if (this._payloadAsBytes != null)
      try {
        return new String(this._payloadAsBytes, this._charset);
      } catch (IOException iOException) {
        throw new RuntimeException(iOException);
      }  
    return this._payloadAsText.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/fasterxml/jackson/core/util/RequestPayload.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */