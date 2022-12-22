package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.b;

public class JsonEOFException extends JsonParseException {
  private static final long serialVersionUID = 1L;
  
  protected final JsonToken _token;
  
  public JsonEOFException(b paramb, JsonToken paramJsonToken, String paramString) {
    super(paramb, paramString);
    this._token = paramJsonToken;
  }
  
  public JsonToken getTokenBeingDecoded() {
    return this._token;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/fasterxml/jackson/core/io/JsonEOFException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */