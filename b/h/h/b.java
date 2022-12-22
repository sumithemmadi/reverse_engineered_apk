package b.h.h;

import android.os.Handler;
import android.os.Looper;

class b {
  static Handler a() {
    Handler handler;
    if (Looper.myLooper() == null) {
      handler = new Handler(Looper.getMainLooper());
    } else {
      handler = new Handler();
    } 
    return handler;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/h/h/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */