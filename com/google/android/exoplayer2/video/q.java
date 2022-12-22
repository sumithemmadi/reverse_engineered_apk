package com.google.android.exoplayer2.video;

import android.os.Handler;
import android.view.Surface;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.b1.d;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.h0;

public interface q {
  void d(String paramString, long paramLong1, long paramLong2);
  
  void k(Surface paramSurface);
  
  void onVideoSizeChanged(int paramInt1, int paramInt2, int paramInt3, float paramFloat);
  
  void p(int paramInt, long paramLong);
  
  void s(Format paramFormat);
  
  void t(d paramd);
  
  void y(d paramd);
  
  public static final class a {
    private final Handler a;
    
    private final q b;
    
    public a(Handler param1Handler, q param1q) {
      if (param1q != null) {
        param1Handler = (Handler)e.e(param1Handler);
      } else {
        param1Handler = null;
      } 
      this.a = param1Handler;
      this.b = param1q;
    }
    
    public void a(String param1String, long param1Long1, long param1Long2) {
      Handler handler = this.a;
      if (handler != null)
        handler.post(new d(this, param1String, param1Long1, param1Long2)); 
    }
    
    public void b(d param1d) {
      param1d.a();
      Handler handler = this.a;
      if (handler != null)
        handler.post(new f(this, param1d)); 
    }
    
    public void c(int param1Int, long param1Long) {
      Handler handler = this.a;
      if (handler != null)
        handler.post(new c(this, param1Int, param1Long)); 
    }
    
    public void d(d param1d) {
      Handler handler = this.a;
      if (handler != null)
        handler.post(new b(this, param1d)); 
    }
    
    public void e(Format param1Format) {
      Handler handler = this.a;
      if (handler != null)
        handler.post(new a(this, param1Format)); 
    }
    
    public void t(Surface param1Surface) {
      Handler handler = this.a;
      if (handler != null)
        handler.post(new e(this, param1Surface)); 
    }
    
    public void u(int param1Int1, int param1Int2, int param1Int3, float param1Float) {
      Handler handler = this.a;
      if (handler != null)
        handler.post(new g(this, param1Int1, param1Int2, param1Int3, param1Float)); 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/video/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */