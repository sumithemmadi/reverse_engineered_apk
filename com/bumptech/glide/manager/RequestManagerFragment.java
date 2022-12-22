package com.bumptech.glide.manager;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.bumptech.glide.c;
import com.bumptech.glide.i;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Deprecated
public class RequestManagerFragment extends Fragment {
  private final a b;
  
  private final p c = new a(this);
  
  private final Set<RequestManagerFragment> d = new HashSet<RequestManagerFragment>();
  
  private i e;
  
  private RequestManagerFragment f;
  
  private Fragment g;
  
  public RequestManagerFragment() {
    this(new a());
  }
  
  @SuppressLint({"ValidFragment"})
  RequestManagerFragment(a parama) {
    this.b = parama;
  }
  
  private void a(RequestManagerFragment paramRequestManagerFragment) {
    this.d.add(paramRequestManagerFragment);
  }
  
  @TargetApi(17)
  private Fragment d() {
    Fragment fragment;
    if (Build.VERSION.SDK_INT >= 17) {
      fragment = getParentFragment();
    } else {
      fragment = null;
    } 
    if (fragment == null)
      fragment = this.g; 
    return fragment;
  }
  
  @TargetApi(17)
  private boolean g(Fragment paramFragment) {
    Fragment fragment = getParentFragment();
    while (true) {
      Fragment fragment1 = paramFragment.getParentFragment();
      if (fragment1 != null) {
        if (fragment1.equals(fragment))
          return true; 
        paramFragment = paramFragment.getParentFragment();
        continue;
      } 
      return false;
    } 
  }
  
  private void h(Activity paramActivity) {
    l();
    RequestManagerFragment requestManagerFragment = c.c((Context)paramActivity).k().i(paramActivity);
    this.f = requestManagerFragment;
    if (!equals(requestManagerFragment))
      this.f.a(this); 
  }
  
  private void i(RequestManagerFragment paramRequestManagerFragment) {
    this.d.remove(paramRequestManagerFragment);
  }
  
  private void l() {
    RequestManagerFragment requestManagerFragment = this.f;
    if (requestManagerFragment != null) {
      requestManagerFragment.i(this);
      this.f = null;
    } 
  }
  
  @TargetApi(17)
  Set<RequestManagerFragment> b() {
    if (equals(this.f))
      return Collections.unmodifiableSet(this.d); 
    if (this.f == null || Build.VERSION.SDK_INT < 17)
      return Collections.emptySet(); 
    HashSet<RequestManagerFragment> hashSet = new HashSet();
    for (RequestManagerFragment requestManagerFragment : this.f.b()) {
      if (g(requestManagerFragment.getParentFragment()))
        hashSet.add(requestManagerFragment); 
    } 
    return Collections.unmodifiableSet(hashSet);
  }
  
  a c() {
    return this.b;
  }
  
  public i e() {
    return this.e;
  }
  
  public p f() {
    return this.c;
  }
  
  void j(Fragment paramFragment) {
    this.g = paramFragment;
    if (paramFragment != null && paramFragment.getActivity() != null)
      h(paramFragment.getActivity()); 
  }
  
  public void k(i parami) {
    this.e = parami;
  }
  
  public void onAttach(Activity paramActivity) {
    super.onAttach(paramActivity);
    try {
      h(paramActivity);
    } catch (IllegalStateException illegalStateException) {
      if (Log.isLoggable("RMFragment", 5))
        Log.w("RMFragment", "Unable to register fragment with root", illegalStateException); 
    } 
  }
  
  public void onDestroy() {
    super.onDestroy();
    this.b.c();
    l();
  }
  
  public void onDetach() {
    super.onDetach();
    l();
  }
  
  public void onStart() {
    super.onStart();
    this.b.d();
  }
  
  public void onStop() {
    super.onStop();
    this.b.e();
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(super.toString());
    stringBuilder.append("{parent=");
    stringBuilder.append(d());
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
  
  private class a implements p {
    a(RequestManagerFragment this$0) {}
    
    public Set<i> a() {
      Set<RequestManagerFragment> set = this.a.b();
      HashSet<i> hashSet = new HashSet(set.size());
      for (RequestManagerFragment requestManagerFragment : set) {
        if (requestManagerFragment.e() != null)
          hashSet.add(requestManagerFragment.e()); 
      } 
      return hashSet;
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(super.toString());
      stringBuilder.append("{fragment=");
      stringBuilder.append(this.a);
      stringBuilder.append("}");
      return stringBuilder.toString();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/manager/RequestManagerFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */