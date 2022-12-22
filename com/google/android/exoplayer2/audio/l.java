package com.google.android.exoplayer2.audio;

import android.os.Handler;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.b1.d;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.h0;

public interface l {
  void a(int paramInt);
  
  void b(d paramd);
  
  void c(d paramd);
  
  void m(String paramString, long paramLong1, long paramLong2);
  
  void v(Format paramFormat);
  
  void x(int paramInt, long paramLong1, long paramLong2);
  
  public static final class a {
    private final Handler a;
    
    private final l b;
    
    public a(Handler param1Handler, l param1l) {
      if (param1l != null) {
        param1Handler = (Handler)e.e(param1Handler);
      } else {
        param1Handler = null;
      } 
      this.a = param1Handler;
      this.b = param1l;
    }
    
    public void a(int param1Int) {
      Handler handler = this.a;
      if (handler != null)
        handler.post(new c(this, param1Int)); 
    }
    
    public void b(int param1Int, long param1Long1, long param1Long2) {
      Handler handler = this.a;
      if (handler != null)
        handler.post(new b(this, param1Int, param1Long1, param1Long2)); 
    }
    
    public void c(String param1String, long param1Long1, long param1Long2) {
      Handler handler = this.a;
      if (handler != null)
        handler.post(new d(this, param1String, param1Long1, param1Long2)); 
    }
    
    public void d(d param1d) {
      param1d.a();
      Handler handler = this.a;
      if (handler != null)
        handler.post(new f(this, param1d)); 
    }
    
    public void e(d param1d) {
      Handler handler = this.a;
      if (handler != null)
        handler.post(new e(this, param1d)); 
    }
    
    public void f(Format param1Format) {
      Handler handler = this.a;
      if (handler != null)
        handler.post(new a(this, param1Format)); 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/audio/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */