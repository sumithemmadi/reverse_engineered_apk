package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class LifecycleCallback {
  protected final h b;
  
  protected LifecycleCallback(h paramh) {
    this.b = paramh;
  }
  
  public static h c(Activity paramActivity) {
    return d(new g(paramActivity));
  }
  
  protected static h d(g paramg) {
    if (paramg.c())
      return w0.R1(paramg.b()); 
    if (paramg.d())
      return zzb.c(paramg.a()); 
    throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
  }
  
  @Keep
  private static h getChimeraLifecycleFragmentImpl(g paramg) {
    throw new IllegalStateException("Method not available in SDK.");
  }
  
  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString) {}
  
  public Activity b() {
    return this.b.e();
  }
  
  public void e(int paramInt1, int paramInt2, Intent paramIntent) {}
  
  public void f(Bundle paramBundle) {}
  
  public void g() {}
  
  public void h() {}
  
  public void i(Bundle paramBundle) {}
  
  public void j() {}
  
  public void k() {}
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/api/internal/LifecycleCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */