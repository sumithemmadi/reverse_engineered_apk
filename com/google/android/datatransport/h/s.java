package com.google.android.datatransport.h;

import android.content.Context;
import com.google.android.datatransport.h.x.j.c;
import java.io.Closeable;

abstract class s implements Closeable {
  abstract c b();
  
  abstract r c();
  
  public void close() {
    b().close();
  }
  
  static interface a {
    s a();
    
    a b(Context param1Context);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/h/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */