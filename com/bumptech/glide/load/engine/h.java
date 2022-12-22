package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;

public abstract class h {
  public static final h a = new a();
  
  public static final h b = new b();
  
  public static final h c = new c();
  
  public static final h d = new d();
  
  public static final h e = new e();
  
  public abstract boolean a();
  
  public abstract boolean b();
  
  public abstract boolean c(DataSource paramDataSource);
  
  public abstract boolean d(boolean paramBoolean, DataSource paramDataSource, EncodeStrategy paramEncodeStrategy);
  
  class a extends h {
    public boolean a() {
      return true;
    }
    
    public boolean b() {
      return true;
    }
    
    public boolean c(DataSource param1DataSource) {
      boolean bool;
      if (param1DataSource == DataSource.c) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    public boolean d(boolean param1Boolean, DataSource param1DataSource, EncodeStrategy param1EncodeStrategy) {
      if (param1DataSource != DataSource.e && param1DataSource != DataSource.f) {
        param1Boolean = true;
      } else {
        param1Boolean = false;
      } 
      return param1Boolean;
    }
  }
  
  class b extends h {
    public boolean a() {
      return false;
    }
    
    public boolean b() {
      return false;
    }
    
    public boolean c(DataSource param1DataSource) {
      return false;
    }
    
    public boolean d(boolean param1Boolean, DataSource param1DataSource, EncodeStrategy param1EncodeStrategy) {
      return false;
    }
  }
  
  class c extends h {
    public boolean a() {
      return true;
    }
    
    public boolean b() {
      return false;
    }
    
    public boolean c(DataSource param1DataSource) {
      boolean bool;
      if (param1DataSource != DataSource.d && param1DataSource != DataSource.f) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    public boolean d(boolean param1Boolean, DataSource param1DataSource, EncodeStrategy param1EncodeStrategy) {
      return false;
    }
  }
  
  class d extends h {
    public boolean a() {
      return false;
    }
    
    public boolean b() {
      return true;
    }
    
    public boolean c(DataSource param1DataSource) {
      return false;
    }
    
    public boolean d(boolean param1Boolean, DataSource param1DataSource, EncodeStrategy param1EncodeStrategy) {
      if (param1DataSource != DataSource.e && param1DataSource != DataSource.f) {
        param1Boolean = true;
      } else {
        param1Boolean = false;
      } 
      return param1Boolean;
    }
  }
  
  class e extends h {
    public boolean a() {
      return true;
    }
    
    public boolean b() {
      return true;
    }
    
    public boolean c(DataSource param1DataSource) {
      boolean bool;
      if (param1DataSource == DataSource.c) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    public boolean d(boolean param1Boolean, DataSource param1DataSource, EncodeStrategy param1EncodeStrategy) {
      if (((param1Boolean && param1DataSource == DataSource.d) || param1DataSource == DataSource.b) && param1EncodeStrategy == EncodeStrategy.c) {
        param1Boolean = true;
      } else {
        param1Boolean = false;
      } 
      return param1Boolean;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/engine/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */