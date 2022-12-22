package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.util.RequestPayload;

public class JsonParseException extends StreamReadException {
  private static final long serialVersionUID = 2L;
  
  public JsonParseException(b paramb, String paramString) {
    super(paramb, paramString);
  }
  
  public JsonParseException(b paramb, String paramString, JsonLocation paramJsonLocation) {
    super(paramb, paramString, paramJsonLocation);
  }
  
  public JsonParseException(b paramb, String paramString, JsonLocation paramJsonLocation, Throwable paramThrowable) {
    super(paramString, paramJsonLocation, paramThrowable);
  }
  
  public JsonParseException(b paramb, String paramString, Throwable paramThrowable) {
    super(paramb, paramString, paramThrowable);
  }
  
  @Deprecated
  public JsonParseException(String paramString, JsonLocation paramJsonLocation) {
    super(paramString, paramJsonLocation, null);
  }
  
  @Deprecated
  public JsonParseException(String paramString, JsonLocation paramJsonLocation, Throwable paramThrowable) {
    super(paramString, paramJsonLocation, paramThrowable);
  }
  
  public String getMessage() {
    return super.getMessage();
  }
  
  public b getProcessor() {
    return super.getProcessor();
  }
  
  public RequestPayload getRequestPayload() {
    return super.getRequestPayload();
  }
  
  public String getRequestPayloadAsString() {
    return super.getRequestPayloadAsString();
  }
  
  public JsonParseException withParser(b paramb) {
    return this;
  }
  
  public JsonParseException withRequestPayload(RequestPayload paramRequestPayload) {
    this._requestPayload = paramRequestPayload;
    return this;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/fasterxml/jackson/core/JsonParseException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */