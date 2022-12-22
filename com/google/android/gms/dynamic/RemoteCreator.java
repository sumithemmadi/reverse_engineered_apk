package com.google.android.gms.dynamic;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.e;
import com.google.android.gms.common.internal.t;

public abstract class RemoteCreator<T> {
  private final String a;
  
  private T b;
  
  protected RemoteCreator(String paramString) {
    this.a = paramString;
  }
  
  protected abstract T a(IBinder paramIBinder);
  
  protected final T b(Context paramContext) {
    if (this.b == null) {
      t.j(paramContext);
      paramContext = e.d(paramContext);
      if (paramContext != null) {
        ClassLoader classLoader = paramContext.getClassLoader();
        try {
          this.b = a((IBinder)classLoader.loadClass(this.a).newInstance());
        } catch (ClassNotFoundException classNotFoundException) {
          throw new RemoteCreatorException("Could not load creator class.", classNotFoundException);
        } catch (InstantiationException instantiationException) {
          throw new RemoteCreatorException("Could not instantiate creator.", instantiationException);
        } catch (IllegalAccessException illegalAccessException) {
          throw new RemoteCreatorException("Could not access creator.", illegalAccessException);
        } 
      } else {
        throw new RemoteCreatorException("Could not get remote context.");
      } 
    } 
    return this.b;
  }
  
  public static class RemoteCreatorException extends Exception {
    public RemoteCreatorException(String param1String) {
      super(param1String);
    }
    
    public RemoteCreatorException(String param1String, Throwable param1Throwable) {
      super(param1String, param1Throwable);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/dynamic/RemoteCreator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */