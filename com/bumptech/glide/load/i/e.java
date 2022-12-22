package com.bumptech.glide.load.i;

import android.util.Base64;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.o.d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class e<Model, Data> implements n<Model, Data> {
  private final a<Data> a;
  
  public e(a<Data> parama) {
    this.a = parama;
  }
  
  public boolean a(Model paramModel) {
    return paramModel.toString().startsWith("data:image");
  }
  
  public n.a<Data> b(Model paramModel, int paramInt1, int paramInt2, com.bumptech.glide.load.e parame) {
    return new n.a<Data>((com.bumptech.glide.load.c)new d(paramModel), new b<Data>(paramModel.toString(), this.a));
  }
  
  public static interface a<Data> {
    Class<Data> a();
    
    void b(Data param1Data);
    
    Data c(String param1String);
  }
  
  private static final class b<Data> implements d<Data> {
    private final String b;
    
    private final e.a<Data> c;
    
    private Data d;
    
    b(String param1String, e.a<Data> param1a) {
      this.b = param1String;
      this.c = param1a;
    }
    
    public Class<Data> a() {
      return this.c.a();
    }
    
    public void b() {
      try {
        this.c.b(this.d);
      } catch (IOException iOException) {}
    }
    
    public void cancel() {}
    
    public DataSource d() {
      return DataSource.b;
    }
    
    public void e(Priority param1Priority, d.a<? super Data> param1a) {
      try {
        param1Priority = (Priority)this.c.c(this.b);
        this.d = (Data)param1Priority;
        param1a.f(param1Priority);
      } catch (IllegalArgumentException illegalArgumentException) {
        param1a.c(illegalArgumentException);
      } 
    }
  }
  
  public static final class c<Model> implements o<Model, InputStream> {
    private final e.a<InputStream> a = new a(this);
    
    public n<Model, InputStream> b(r param1r) {
      return new e<Model, InputStream>(this.a);
    }
    
    class a implements e.a<InputStream> {
      a(e.c this$0) {}
      
      public Class<InputStream> a() {
        return InputStream.class;
      }
      
      public void d(InputStream param2InputStream) {
        param2InputStream.close();
      }
      
      public InputStream e(String param2String) {
        if (param2String.startsWith("data:image")) {
          int i = param2String.indexOf(',');
          if (i != -1) {
            if (param2String.substring(0, i).endsWith(";base64"))
              return new ByteArrayInputStream(Base64.decode(param2String.substring(i + 1), 0)); 
            throw new IllegalArgumentException("Not a base64 image data URL.");
          } 
          throw new IllegalArgumentException("Missing comma in data URL.");
        } 
        throw new IllegalArgumentException("Not a valid image data URL.");
      }
    }
  }
  
  class a implements a<InputStream> {
    a(e this$0) {}
    
    public Class<InputStream> a() {
      return InputStream.class;
    }
    
    public void d(InputStream param1InputStream) {
      param1InputStream.close();
    }
    
    public InputStream e(String param1String) {
      if (param1String.startsWith("data:image")) {
        int i = param1String.indexOf(',');
        if (i != -1) {
          if (param1String.substring(0, i).endsWith(";base64"))
            return new ByteArrayInputStream(Base64.decode(param1String.substring(i + 1), 0)); 
          throw new IllegalArgumentException("Not a base64 image data URL.");
        } 
        throw new IllegalArgumentException("Missing comma in data URL.");
      } 
      throw new IllegalArgumentException("Not a valid image data URL.");
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/i/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */