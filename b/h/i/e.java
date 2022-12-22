package b.h.i;

import java.util.Locale;

public final class e {
  public static final d a = new e(null, false);
  
  public static final d b = new e(null, true);
  
  public static final d c;
  
  public static final d d;
  
  public static final d e = new e(a.a, false);
  
  public static final d f = f.b;
  
  static int a(int paramInt) {
    return (paramInt != 0) ? ((paramInt != 1 && paramInt != 2) ? 2 : 0) : 1;
  }
  
  static int b(int paramInt) {
    if (paramInt != 0)
      if (paramInt != 1 && paramInt != 2) {
        switch (paramInt) {
          default:
            return 2;
          case 16:
          case 17:
            return 0;
          case 14:
          case 15:
            break;
        } 
        return 1;
      }  
    return 1;
  }
  
  static {
    b b = b.a;
    c = new e(b, false);
    d = new e(b, true);
  }
  
  private static class a implements c {
    static final a a = new a(true);
    
    private final boolean b;
    
    private a(boolean param1Boolean) {
      this.b = param1Boolean;
    }
    
    public int a(CharSequence param1CharSequence, int param1Int1, int param1Int2) {
      boolean bool = false;
      for (int i = param1Int1; i < param1Int2 + param1Int1; i++) {
        int j = e.a(Character.getDirectionality(param1CharSequence.charAt(i)));
        if (j != 0) {
          if (j != 1)
            continue; 
          if (!this.b)
            return 1; 
        } else if (this.b) {
          return 0;
        } 
        bool = true;
        continue;
      } 
      return bool ? this.b : 2;
    }
  }
  
  private static class b implements c {
    static final b a = new b();
    
    public int a(CharSequence param1CharSequence, int param1Int1, int param1Int2) {
      int i = 2;
      for (int j = param1Int1; j < param1Int2 + param1Int1 && i == 2; j++)
        i = e.b(Character.getDirectionality(param1CharSequence.charAt(j))); 
      return i;
    }
  }
  
  private static interface c {
    int a(CharSequence param1CharSequence, int param1Int1, int param1Int2);
  }
  
  private static abstract class d implements d {
    private final e.c a;
    
    d(e.c param1c) {
      this.a = param1c;
    }
    
    private boolean c(CharSequence param1CharSequence, int param1Int1, int param1Int2) {
      param1Int1 = this.a.a(param1CharSequence, param1Int1, param1Int2);
      return (param1Int1 != 0) ? ((param1Int1 != 1) ? b() : false) : true;
    }
    
    public boolean a(CharSequence param1CharSequence, int param1Int1, int param1Int2) {
      if (param1CharSequence != null && param1Int1 >= 0 && param1Int2 >= 0 && param1CharSequence.length() - param1Int2 >= param1Int1)
        return (this.a == null) ? b() : c(param1CharSequence, param1Int1, param1Int2); 
      throw new IllegalArgumentException();
    }
    
    protected abstract boolean b();
  }
  
  private static class e extends d {
    private final boolean b;
    
    e(e.c param1c, boolean param1Boolean) {
      super(param1c);
      this.b = param1Boolean;
    }
    
    protected boolean b() {
      return this.b;
    }
  }
  
  private static class f extends d {
    static final f b = new f();
    
    f() {
      super(null);
    }
    
    protected boolean b() {
      int i = f.b(Locale.getDefault());
      boolean bool = true;
      if (i != 1)
        bool = false; 
      return bool;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/h/i/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */