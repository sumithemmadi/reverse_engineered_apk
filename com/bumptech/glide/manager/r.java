package com.bumptech.glide.manager;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.c;
import com.bumptech.glide.i;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class r extends Fragment {
  private final a c0;
  
  private final p d0 = new a(this);
  
  private final Set<r> e0 = new HashSet<r>();
  
  private r f0;
  
  private i g0;
  
  private Fragment h0;
  
  public r() {
    this(new a());
  }
  
  @SuppressLint({"ValidFragment"})
  public r(a parama) {
    this.c0 = parama;
  }
  
  private void Q1(r paramr) {
    this.e0.add(paramr);
  }
  
  private Fragment T1() {
    Fragment fragment = H();
    if (fragment == null)
      fragment = this.h0; 
    return fragment;
  }
  
  private static FragmentManager W1(Fragment paramFragment) {
    while (paramFragment.H() != null)
      paramFragment = paramFragment.H(); 
    return paramFragment.B();
  }
  
  private boolean X1(Fragment paramFragment) {
    Fragment fragment = T1();
    while (true) {
      Fragment fragment1 = paramFragment.H();
      if (fragment1 != null) {
        if (fragment1.equals(fragment))
          return true; 
        paramFragment = paramFragment.H();
        continue;
      } 
      return false;
    } 
  }
  
  private void Y1(Context paramContext, FragmentManager paramFragmentManager) {
    c2();
    r r1 = c.c(paramContext).k().k(paramFragmentManager);
    this.f0 = r1;
    if (!equals(r1))
      this.f0.Q1(this); 
  }
  
  private void Z1(r paramr) {
    this.e0.remove(paramr);
  }
  
  private void c2() {
    r r1 = this.f0;
    if (r1 != null) {
      r1.Z1(this);
      this.f0 = null;
    } 
  }
  
  public void A0() {
    super.A0();
    this.h0 = null;
    c2();
  }
  
  public void P0() {
    super.P0();
    this.c0.d();
  }
  
  public void Q0() {
    super.Q0();
    this.c0.e();
  }
  
  Set<r> R1() {
    r r1 = this.f0;
    if (r1 == null)
      return Collections.emptySet(); 
    if (equals(r1))
      return Collections.unmodifiableSet(this.e0); 
    HashSet<r> hashSet = new HashSet();
    for (r r2 : this.f0.R1()) {
      if (X1(r2.T1()))
        hashSet.add(r2); 
    } 
    return Collections.unmodifiableSet(hashSet);
  }
  
  a S1() {
    return this.c0;
  }
  
  public i U1() {
    return this.g0;
  }
  
  public p V1() {
    return this.d0;
  }
  
  void a2(Fragment paramFragment) {
    this.h0 = paramFragment;
    if (paramFragment != null && paramFragment.t() != null) {
      FragmentManager fragmentManager = W1(paramFragment);
      if (fragmentManager == null)
        return; 
      Y1(paramFragment.t(), fragmentManager);
    } 
  }
  
  public void b2(i parami) {
    this.g0 = parami;
  }
  
  public void p0(Context paramContext) {
    super.p0(paramContext);
    FragmentManager fragmentManager = W1(this);
    if (fragmentManager == null) {
      if (Log.isLoggable("SupportRMFragment", 5))
        Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached"); 
      return;
    } 
    try {
      Y1(t(), fragmentManager);
    } catch (IllegalStateException illegalStateException) {
      if (Log.isLoggable("SupportRMFragment", 5))
        Log.w("SupportRMFragment", "Unable to register fragment with root", illegalStateException); 
    } 
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(super.toString());
    stringBuilder.append("{parent=");
    stringBuilder.append(T1());
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
  
  public void x0() {
    super.x0();
    this.c0.c();
    c2();
  }
  
  private class a implements p {
    a(r this$0) {}
    
    public Set<i> a() {
      Set<r> set = this.a.R1();
      HashSet<i> hashSet = new HashSet(set.size());
      for (r r1 : set) {
        if (r1.U1() != null)
          hashSet.add(r1.U1()); 
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


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/manager/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */