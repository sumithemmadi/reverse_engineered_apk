package androidx.core.net;

public class ParseException extends RuntimeException {
  public final String response;
  
  ParseException(String paramString) {
    super(paramString);
    this.response = paramString;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/core/net/ParseException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */