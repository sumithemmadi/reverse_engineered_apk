package com.fasterxml.jackson.core;

public class JsonGenerationException extends JsonProcessingException {
  private static final long serialVersionUID = 123L;
  
  protected transient a b;
  
  @Deprecated
  public JsonGenerationException(String paramString) {
    super(paramString, (JsonLocation)null);
  }
  
  public JsonGenerationException(String paramString, a parama) {
    super(paramString, (JsonLocation)null);
  }
  
  @Deprecated
  public JsonGenerationException(String paramString, Throwable paramThrowable) {
    super(paramString, null, paramThrowable);
  }
  
  public JsonGenerationException(String paramString, Throwable paramThrowable, a parama) {
    super(paramString, null, paramThrowable);
  }
  
  @Deprecated
  public JsonGenerationException(Throwable paramThrowable) {
    super(paramThrowable);
  }
  
  public JsonGenerationException(Throwable paramThrowable, a parama) {
    super(paramThrowable);
  }
  
  public a getProcessor() {
    return this.b;
  }
  
  public JsonGenerationException withGenerator(a parama) {
    return this;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/fasterxml/jackson/core/JsonGenerationException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */