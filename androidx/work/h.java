package androidx.work;

import android.annotation.SuppressLint;

public interface h {
  @SuppressLint({"SyntheticAccessor"})
  public static final b.c a = new b.c(null);
  
  @SuppressLint({"SyntheticAccessor"})
  public static final b.b b = new b.b(null);
  
  public static abstract class b {
    public static final class a extends b {
      private final Throwable a;
      
      public a(Throwable param2Throwable) {
        this.a = param2Throwable;
      }
      
      public Throwable a() {
        return this.a;
      }
      
      public String toString() {
        return String.format("FAILURE (%s)", new Object[] { this.a.getMessage() });
      }
    }
    
    public static final class b extends b {
      private b() {}
      
      public String toString() {
        return "IN_PROGRESS";
      }
    }
    
    public static final class c extends b {
      private c() {}
      
      public String toString() {
        return "SUCCESS";
      }
    }
  }
  
  public static final class a extends b {
    private final Throwable a;
    
    public a(Throwable param1Throwable) {
      this.a = param1Throwable;
    }
    
    public Throwable a() {
      return this.a;
    }
    
    public String toString() {
      return String.format("FAILURE (%s)", new Object[] { this.a.getMessage() });
    }
  }
  
  public static final class b extends b {
    private b() {}
    
    public String toString() {
      return "IN_PROGRESS";
    }
  }
  
  public static final class c extends b {
    private c() {}
    
    public String toString() {
      return "SUCCESS";
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */