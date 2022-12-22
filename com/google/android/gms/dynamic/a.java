package com.google.android.gms.dynamic;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.common.b;

public interface a extends IInterface {
  public static class a extends com.google.android.gms.internal.common.a implements a {
    public a() {
      super("com.google.android.gms.dynamic.IObjectWrapper");
    }
    
    public static a i1(IBinder param1IBinder) {
      if (param1IBinder == null)
        return null; 
      IInterface iInterface = param1IBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
      return (iInterface instanceof a) ? (a)iInterface : new a(param1IBinder);
    }
    
    public static final class a extends b implements a {
      a(IBinder param2IBinder) {
        super(param2IBinder, "com.google.android.gms.dynamic.IObjectWrapper");
      }
    }
  }
  
  public static final class a extends b implements a {
    a(IBinder param1IBinder) {
      super(param1IBinder, "com.google.android.gms.dynamic.IObjectWrapper");
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/dynamic/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */