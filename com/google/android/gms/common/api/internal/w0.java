package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import b.e.a;
import com.google.android.gms.internal.common.h;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public final class w0 extends Fragment implements h {
  private static WeakHashMap<FragmentActivity, WeakReference<w0>> c0 = new WeakHashMap<FragmentActivity, WeakReference<w0>>();
  
  private Map<String, LifecycleCallback> d0 = Collections.synchronizedMap((Map<String, LifecycleCallback>)new a());
  
  private int e0 = 0;
  
  private Bundle f0;
  
  public static w0 R1(FragmentActivity paramFragmentActivity) {
    WeakReference<w0> weakReference = c0.get(paramFragmentActivity);
    if (weakReference != null) {
      w0 w01 = weakReference.get();
      if (w01 != null)
        return w01; 
    } 
    try {
      w0 w02 = (w0)paramFragmentActivity.s().i0("SupportLifecycleFragmentImpl");
      if (w02 != null) {
        w0 w03 = w02;
        if (w02.i0()) {
          w03 = new w0();
          paramFragmentActivity.s().l().e(w03, "SupportLifecycleFragmentImpl").i();
          c0.put(paramFragmentActivity, new WeakReference<w0>(w03));
          return w03;
        } 
        c0.put(paramFragmentActivity, new WeakReference<w0>(w03));
        return w03;
      } 
      w0 w01 = new w0();
      paramFragmentActivity.s().l().e(w01, "SupportLifecycleFragmentImpl").i();
      c0.put(paramFragmentActivity, new WeakReference<w0>(w01));
      return w01;
    } catch (ClassCastException classCastException) {
      throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", classCastException);
    } 
  }
  
  public final void N0() {
    super.N0();
    this.e0 = 3;
    Iterator<LifecycleCallback> iterator = this.d0.values().iterator();
    while (iterator.hasNext())
      ((LifecycleCallback)iterator.next()).h(); 
  }
  
  public final void O0(Bundle paramBundle) {
    super.O0(paramBundle);
    if (paramBundle == null)
      return; 
    for (Map.Entry<String, LifecycleCallback> entry : this.d0.entrySet()) {
      Bundle bundle = new Bundle();
      ((LifecycleCallback)entry.getValue()).i(bundle);
      paramBundle.putBundle((String)entry.getKey(), bundle);
    } 
  }
  
  public final void P0() {
    super.P0();
    this.e0 = 2;
    Iterator<LifecycleCallback> iterator = this.d0.values().iterator();
    while (iterator.hasNext())
      ((LifecycleCallback)iterator.next()).j(); 
  }
  
  public final void Q0() {
    super.Q0();
    this.e0 = 4;
    Iterator<LifecycleCallback> iterator = this.d0.values().iterator();
    while (iterator.hasNext())
      ((LifecycleCallback)iterator.next()).k(); 
  }
  
  public final void b(String paramString, LifecycleCallback paramLifecycleCallback) {
    if (!this.d0.containsKey(paramString)) {
      this.d0.put(paramString, paramLifecycleCallback);
      if (this.e0 > 0)
        (new h(Looper.getMainLooper())).post(new x0(this, paramLifecycleCallback, paramString)); 
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(paramString).length() + 59);
    stringBuilder.append("LifecycleCallback with tag ");
    stringBuilder.append(paramString);
    stringBuilder.append(" already added to this fragment.");
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public final <T extends LifecycleCallback> T d(String paramString, Class<T> paramClass) {
    return paramClass.cast(this.d0.get(paramString));
  }
  
  public final void i(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString) {
    super.i(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    Iterator<LifecycleCallback> iterator = this.d0.values().iterator();
    while (iterator.hasNext())
      ((LifecycleCallback)iterator.next()).a(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString); 
  }
  
  public final void n0(int paramInt1, int paramInt2, Intent paramIntent) {
    super.n0(paramInt1, paramInt2, paramIntent);
    Iterator<LifecycleCallback> iterator = this.d0.values().iterator();
    while (iterator.hasNext())
      ((LifecycleCallback)iterator.next()).e(paramInt1, paramInt2, paramIntent); 
  }
  
  public final void s0(Bundle paramBundle) {
    super.s0(paramBundle);
    this.e0 = 1;
    this.f0 = paramBundle;
    for (Map.Entry<String, LifecycleCallback> entry : this.d0.entrySet()) {
      LifecycleCallback lifecycleCallback = (LifecycleCallback)entry.getValue();
      if (paramBundle != null) {
        Bundle bundle = paramBundle.getBundle((String)entry.getKey());
      } else {
        entry = null;
      } 
      lifecycleCallback.f((Bundle)entry);
    } 
  }
  
  public final void x0() {
    super.x0();
    this.e0 = 5;
    Iterator<LifecycleCallback> iterator = this.d0.values().iterator();
    while (iterator.hasNext())
      ((LifecycleCallback)iterator.next()).g(); 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/api/internal/w0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */