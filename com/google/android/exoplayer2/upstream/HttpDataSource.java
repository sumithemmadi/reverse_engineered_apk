package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.util.x;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface HttpDataSource extends j {
  public static final x<String> a = c.a;
  
  public static class HttpDataSourceException extends IOException {
    public final l dataSpec;
    
    public final int type;
    
    public HttpDataSourceException(l param1l, int param1Int) {
      this.dataSpec = param1l;
      this.type = param1Int;
    }
    
    public HttpDataSourceException(IOException param1IOException, l param1l, int param1Int) {
      super(param1IOException);
      this.dataSpec = param1l;
      this.type = param1Int;
    }
    
    public HttpDataSourceException(String param1String, l param1l, int param1Int) {
      super(param1String);
      this.dataSpec = param1l;
      this.type = param1Int;
    }
    
    public HttpDataSourceException(String param1String, IOException param1IOException, l param1l, int param1Int) {
      super(param1String, param1IOException);
      this.dataSpec = param1l;
      this.type = param1Int;
    }
  }
  
  public static final class InvalidContentTypeException extends HttpDataSourceException {
    public final String contentType;
    
    public InvalidContentTypeException(String param1String, l param1l) {
      super(stringBuilder.toString(), param1l, 1);
      this.contentType = param1String;
    }
  }
  
  public static final class InvalidResponseCodeException extends HttpDataSourceException {
    public final Map<String, List<String>> headerFields;
    
    public final int responseCode;
    
    public final String responseMessage;
    
    public InvalidResponseCodeException(int param1Int, String param1String, Map<String, List<String>> param1Map, l param1l) {
      super(stringBuilder.toString(), param1l, 1);
      this.responseCode = param1Int;
      this.responseMessage = param1String;
      this.headerFields = param1Map;
    }
    
    @Deprecated
    public InvalidResponseCodeException(int param1Int, Map<String, List<String>> param1Map, l param1l) {
      this(param1Int, null, param1Map, param1l);
    }
  }
  
  public static abstract class a implements j.a {
    private final HttpDataSource.b a = new HttpDataSource.b();
    
    public final HttpDataSource b() {
      return c(this.a);
    }
    
    protected abstract HttpDataSource c(HttpDataSource.b param1b);
  }
  
  public static final class b {
    private final Map<String, String> a = new HashMap<String, String>();
    
    private Map<String, String> b;
    
    public Map<String, String> a() {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: getfield b : Ljava/util/Map;
      //   6: ifnonnull -> 29
      //   9: new java/util/HashMap
      //   12: astore_1
      //   13: aload_1
      //   14: aload_0
      //   15: getfield a : Ljava/util/Map;
      //   18: invokespecial <init> : (Ljava/util/Map;)V
      //   21: aload_0
      //   22: aload_1
      //   23: invokestatic unmodifiableMap : (Ljava/util/Map;)Ljava/util/Map;
      //   26: putfield b : Ljava/util/Map;
      //   29: aload_0
      //   30: getfield b : Ljava/util/Map;
      //   33: astore_1
      //   34: aload_0
      //   35: monitorexit
      //   36: aload_1
      //   37: areturn
      //   38: astore_1
      //   39: aload_0
      //   40: monitorexit
      //   41: aload_1
      //   42: athrow
      // Exception table:
      //   from	to	target	type
      //   2	29	38	finally
      //   29	34	38	finally
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/upstream/HttpDataSource.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */