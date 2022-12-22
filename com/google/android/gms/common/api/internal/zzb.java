package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import b.e.a;
import com.google.android.gms.internal.common.h;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public final class zzb extends Fragment implements h {
  private static WeakHashMap<Activity, WeakReference<zzb>> b = new WeakHashMap<Activity, WeakReference<zzb>>();
  
  private Map<String, LifecycleCallback> c = Collections.synchronizedMap((Map<String, LifecycleCallback>)new a());
  
  private int d = 0;
  
  private Bundle e;
  
  public static zzb c(Activity paramActivity) {
    WeakReference<zzb> weakReference = b.get(paramActivity);
    if (weakReference != null) {
      zzb zzb1 = weakReference.get();
      if (zzb1 != null)
        return zzb1; 
    } 
    try {
      zzb zzb2 = (zzb)paramActivity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
      if (zzb2 != null) {
        zzb zzb3 = zzb2;
        if (zzb2.isRemoving()) {
          zzb3 = new zzb();
          paramActivity.getFragmentManager().beginTransaction().add(zzb3, "LifecycleFragmentImpl").commitAllowingStateLoss();
          b.put(paramActivity, new WeakReference<zzb>(zzb3));
          return zzb3;
        } 
        b.put(paramActivity, new WeakReference<zzb>(zzb3));
        return zzb3;
      } 
      zzb zzb1 = new zzb();
      paramActivity.getFragmentManager().beginTransaction().add(zzb1, "LifecycleFragmentImpl").commitAllowingStateLoss();
      b.put(paramActivity, new WeakReference<zzb>(zzb1));
      return zzb1;
    } catch (ClassCastException classCastException) {
      throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", classCastException);
    } 
  }
  
  public final void b(String paramString, LifecycleCallback paramLifecycleCallback) {
    if (!this.c.containsKey(paramString)) {
      this.c.put(paramString, paramLifecycleCallback);
      if (this.d > 0)
        (new h(Looper.getMainLooper())).post(new v0(this, paramLifecycleCallback, paramString)); 
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(paramString).length() + 59);
    stringBuilder.append("LifecycleCallback with tag ");
    stringBuilder.append(paramString);
    stringBuilder.append(" already added to this fragment.");
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public final <T extends LifecycleCallback> T d(String paramString, Class<T> paramClass) {
    return paramClass.cast(this.c.get(paramString));
  }
  
  public final void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString) {
    super.dump(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    Iterator<LifecycleCallback> iterator = this.c.values().iterator();
    while (iterator.hasNext())
      ((LifecycleCallback)iterator.next()).a(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString); 
  }
  
  public final Activity e() {
    return getActivity();
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    Iterator<LifecycleCallback> iterator = this.c.values().iterator();
    while (iterator.hasNext())
      ((LifecycleCallback)iterator.next()).e(paramInt1, paramInt2, paramIntent); 
  }
  
  public final void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    this.d = 1;
    this.e = paramBundle;
    for (Map.Entry<String, LifecycleCallback> entry : this.c.entrySet()) {
      LifecycleCallback lifecycleCallback = (LifecycleCallback)entry.getValue();
      if (paramBundle != null) {
        Bundle bundle = paramBundle.getBundle((String)entry.getKey());
      } else {
        entry = null;
      } 
      lifecycleCallback.f((Bundle)entry);
    } 
  }
  
  public final void onDestroy() {
    super.onDestroy();
    this.d = 5;
    Iterator<LifecycleCallback> iterator = this.c.values().iterator();
    while (iterator.hasNext())
      ((LifecycleCallback)iterator.next()).g(); 
  }
  
  public final void onResume() {
    super.onResume();
    this.d = 3;
    Iterator<LifecycleCallback> iterator = this.c.values().iterator();
    while (iterator.hasNext())
      ((LifecycleCallback)iterator.next()).h(); 
  }
  
  public final void onSaveInstanceState(Bundle paramBundle) {
    super.onSaveInstanceState(paramBundle);
    if (paramBundle == null)
      return; 
    for (Map.Entry<String, LifecycleCallback> entry : this.c.entrySet()) {
      Bundle bundle = new Bundle();
      ((LifecycleCallback)entry.getValue()).i(bundle);
      paramBundle.putBundle((String)entry.getKey(), bundle);
    } 
  }
  
  public final void onStart() {
    super.onStart();
    this.d = 2;
    Iterator<LifecycleCallback> iterator = this.c.values().iterator();
    while (iterator.hasNext())
      ((LifecycleCallback)iterator.next()).j(); 
  }
  
  public final void onStop() {
    super.onStop();
    this.d = 4;
    Iterator<LifecycleCallback> iterator = this.c.values().iterator();
    while (iterator.hasNext())
      ((LifecycleCallback)iterator.next()).k(); 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/api/internal/zzb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */