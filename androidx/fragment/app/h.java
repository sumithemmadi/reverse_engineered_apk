package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.core.content.a;
import b.h.j.i;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class h<E> extends e {
  private final Activity b;
  
  private final Context c;
  
  private final Handler d;
  
  private final int e;
  
  final FragmentManager f = new k();
  
  h(Activity paramActivity, Context paramContext, Handler paramHandler, int paramInt) {
    this.b = paramActivity;
    this.c = (Context)i.f(paramContext, "context == null");
    this.d = (Handler)i.f(paramHandler, "handler == null");
    this.e = paramInt;
  }
  
  h(FragmentActivity paramFragmentActivity) {
    this((Activity)paramFragmentActivity, (Context)paramFragmentActivity, new Handler(), 0);
  }
  
  public View e(int paramInt) {
    return null;
  }
  
  public boolean g() {
    return true;
  }
  
  Activity i() {
    return this.b;
  }
  
  Context k() {
    return this.c;
  }
  
  Handler l() {
    return this.d;
  }
  
  public void m(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString) {}
  
  public abstract E n();
  
  public LayoutInflater o() {
    return LayoutInflater.from(this.c);
  }
  
  public boolean p(Fragment paramFragment) {
    return true;
  }
  
  public void q(Fragment paramFragment, @SuppressLint({"UnknownNullness"}) Intent paramIntent, int paramInt, Bundle paramBundle) {
    if (paramInt == -1) {
      a.k(this.c, paramIntent, paramBundle);
      return;
    } 
    throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
  }
  
  public void r() {}
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/fragment/app/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */