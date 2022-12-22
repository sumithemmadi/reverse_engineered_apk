package com.bumptech.glide.load.i;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class f<Data> implements n<File, Data> {
  private final d<Data> a;
  
  public f(d<Data> paramd) {
    this.a = paramd;
  }
  
  public n.a<Data> c(File paramFile, int paramInt1, int paramInt2, com.bumptech.glide.load.e parame) {
    return new n.a<Data>((com.bumptech.glide.load.c)new com.bumptech.glide.o.d(paramFile), new c<Data>(paramFile, this.a));
  }
  
  public boolean d(File paramFile) {
    return true;
  }
  
  public static class a<Data> implements o<File, Data> {
    private final f.d<Data> a;
    
    public a(f.d<Data> param1d) {
      this.a = param1d;
    }
    
    public final n<File, Data> b(r param1r) {
      return new f<Data>(this.a);
    }
  }
  
  public static class b extends a<ParcelFileDescriptor> {
    public b() {
      super(new a());
    }
    
    class a implements f.d<ParcelFileDescriptor> {
      public Class<ParcelFileDescriptor> a() {
        return ParcelFileDescriptor.class;
      }
      
      public void d(ParcelFileDescriptor param2ParcelFileDescriptor) {
        param2ParcelFileDescriptor.close();
      }
      
      public ParcelFileDescriptor e(File param2File) {
        return ParcelFileDescriptor.open(param2File, 268435456);
      }
    }
  }
  
  class a implements d<ParcelFileDescriptor> {
    public Class<ParcelFileDescriptor> a() {
      return ParcelFileDescriptor.class;
    }
    
    public void d(ParcelFileDescriptor param1ParcelFileDescriptor) {
      param1ParcelFileDescriptor.close();
    }
    
    public ParcelFileDescriptor e(File param1File) {
      return ParcelFileDescriptor.open(param1File, 268435456);
    }
  }
  
  private static final class c<Data> implements com.bumptech.glide.load.data.d<Data> {
    private final File b;
    
    private final f.d<Data> c;
    
    private Data d;
    
    c(File param1File, f.d<Data> param1d) {
      this.b = param1File;
      this.c = param1d;
    }
    
    public Class<Data> a() {
      return this.c.a();
    }
    
    public void b() {
      Data data = this.d;
      if (data != null)
        try {
          this.c.b(data);
        } catch (IOException iOException) {} 
    }
    
    public void cancel() {}
    
    public DataSource d() {
      return DataSource.b;
    }
    
    public void e(Priority param1Priority, com.bumptech.glide.load.data.d.a<? super Data> param1a) {
      try {
        param1Priority = (Priority)this.c.c(this.b);
        this.d = (Data)param1Priority;
        param1a.f(param1Priority);
      } catch (FileNotFoundException fileNotFoundException) {
        if (Log.isLoggable("FileLoader", 3))
          Log.d("FileLoader", "Failed to open file", fileNotFoundException); 
        param1a.c(fileNotFoundException);
      } 
    }
  }
  
  public static interface d<Data> {
    Class<Data> a();
    
    void b(Data param1Data);
    
    Data c(File param1File);
  }
  
  public static class e extends a<InputStream> {
    public e() {
      super(new a());
    }
    
    class a implements f.d<InputStream> {
      public Class<InputStream> a() {
        return InputStream.class;
      }
      
      public void d(InputStream param2InputStream) {
        param2InputStream.close();
      }
      
      public InputStream e(File param2File) {
        return new FileInputStream(param2File);
      }
    }
  }
  
  class a implements d<InputStream> {
    public Class<InputStream> a() {
      return InputStream.class;
    }
    
    public void d(InputStream param1InputStream) {
      param1InputStream.close();
    }
    
    public InputStream e(File param1File) {
      return new FileInputStream(param1File);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/i/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */