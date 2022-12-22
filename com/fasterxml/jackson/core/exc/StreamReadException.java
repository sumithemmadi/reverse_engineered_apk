package com.fasterxml.jackson.core.exc;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.b;
import com.fasterxml.jackson.core.util.RequestPayload;

public abstract class StreamReadException extends JsonProcessingException {
  static final long serialVersionUID = 1L;
  
  protected RequestPayload _requestPayload;
  
  protected transient b b;
  
  public StreamReadException(b paramb, String paramString) {}
  
  public StreamReadException(b paramb, String paramString, JsonLocation paramJsonLocation) {
    super(paramString, paramJsonLocation, null);
  }
  
  public StreamReadException(b paramb, String paramString, Throwable paramThrowable) {}
  
  protected StreamReadException(String paramString, JsonLocation paramJsonLocation, Throwable paramThrowable) {
    super(paramString);
    if (paramThrowable != null)
      initCause(paramThrowable); 
    this._location = paramJsonLocation;
  }
  
  public String getMessage() {
    String str1 = super.getMessage();
    String str2 = str1;
    if (this._requestPayload != null) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(str1);
      stringBuilder.append("\nRequest payload : ");
      stringBuilder.append(this._requestPayload.toString());
      str2 = stringBuilder.toString();
    } 
    return str2;
  }
  
  public b getProcessor() {
    return this.b;
  }
  
  public RequestPayload getRequestPayload() {
    return this._requestPayload;
  }
  
  public String getRequestPayloadAsString() {
    RequestPayload requestPayload = this._requestPayload;
    if (requestPayload != null) {
      String str = requestPayload.toString();
    } else {
      requestPayload = null;
    } 
    return (String)requestPayload;
  }
  
  public abstract StreamReadException withParser(b paramb);
  
  public abstract StreamReadException withRequestPayload(RequestPayload paramRequestPayload);
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/fasterxml/jackson/core/exc/StreamReadException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */