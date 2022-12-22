package com.google.android.datatransport.h;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

abstract class i {
  static Executor a() {
    return new k(Executors.newSingleThreadExecutor());
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/h/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */