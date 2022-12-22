package com.fasterxml.jackson.core.exc;

import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.b;
import com.fasterxml.jackson.core.util.RequestPayload;

public class InputCoercionException extends StreamReadException {
  private static final long serialVersionUID = 1L;
  
  protected final JsonToken _inputType;
  
  protected final Class<?> _targetType;
  
  public InputCoercionException(b paramb, String paramString, JsonToken paramJsonToken, Class<?> paramClass) {
    super(paramb, paramString);
    this._inputType = paramJsonToken;
    this._targetType = paramClass;
  }
  
  public JsonToken getInputType() {
    return this._inputType;
  }
  
  public Class<?> getTargetType() {
    return this._targetType;
  }
  
  public InputCoercionException withParser(b paramb) {
    return this;
  }
  
  public InputCoercionException withRequestPayload(RequestPayload paramRequestPayload) {
    this._requestPayload = paramRequestPayload;
    return this;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/fasterxml/jackson/core/exc/InputCoercionException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */