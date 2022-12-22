package androidx.fragment.app;

import android.os.Bundle;
import android.view.View;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

class j {
  private final CopyOnWriteArrayList<a> a = new CopyOnWriteArrayList<a>();
  
  private final FragmentManager b;
  
  j(FragmentManager paramFragmentManager) {
    this.b = paramFragmentManager;
  }
  
  void a(Fragment paramFragment, Bundle paramBundle, boolean paramBoolean) {
    Fragment fragment = this.b.x0();
    if (fragment != null)
      fragment.I().w0().a(paramFragment, paramBundle, true); 
    Iterator<a> iterator = this.a.iterator();
    while (iterator.hasNext()) {
      a a = iterator.next();
      if (paramBoolean && !a.b)
        continue; 
      FragmentManager.l l = a.a;
      throw null;
    } 
  }
  
  void b(Fragment paramFragment, boolean paramBoolean) {
    this.b.u0().k();
    Fragment fragment = this.b.x0();
    if (fragment != null)
      fragment.I().w0().b(paramFragment, true); 
    for (a a : this.a) {
      if (paramBoolean && !a.b)
        continue; 
      FragmentManager.l l = a.a;
      throw null;
    } 
  }
  
  void c(Fragment paramFragment, Bundle paramBundle, boolean paramBoolean) {
    Fragment fragment = this.b.x0();
    if (fragment != null)
      fragment.I().w0().c(paramFragment, paramBundle, true); 
    for (a a : this.a) {
      if (paramBoolean && !a.b)
        continue; 
      FragmentManager.l l = a.a;
      throw null;
    } 
  }
  
  void d(Fragment paramFragment, boolean paramBoolean) {
    Fragment fragment = this.b.x0();
    if (fragment != null)
      fragment.I().w0().d(paramFragment, true); 
    Iterator<a> iterator = this.a.iterator();
    while (iterator.hasNext()) {
      a a = iterator.next();
      if (paramBoolean && !a.b)
        continue; 
      FragmentManager.l l = a.a;
      throw null;
    } 
  }
  
  void e(Fragment paramFragment, boolean paramBoolean) {
    Fragment fragment = this.b.x0();
    if (fragment != null)
      fragment.I().w0().e(paramFragment, true); 
    for (a a : this.a) {
      if (paramBoolean && !a.b)
        continue; 
      FragmentManager.l l = a.a;
      throw null;
    } 
  }
  
  void f(Fragment paramFragment, boolean paramBoolean) {
    Fragment fragment = this.b.x0();
    if (fragment != null)
      fragment.I().w0().f(paramFragment, true); 
    for (a a : this.a) {
      if (paramBoolean && !a.b)
        continue; 
      FragmentManager.l l = a.a;
      throw null;
    } 
  }
  
  void g(Fragment paramFragment, boolean paramBoolean) {
    this.b.u0().k();
    Fragment fragment = this.b.x0();
    if (fragment != null)
      fragment.I().w0().g(paramFragment, true); 
    for (a a : this.a) {
      if (paramBoolean && !a.b)
        continue; 
      FragmentManager.l l = a.a;
      throw null;
    } 
  }
  
  void h(Fragment paramFragment, Bundle paramBundle, boolean paramBoolean) {
    Fragment fragment = this.b.x0();
    if (fragment != null)
      fragment.I().w0().h(paramFragment, paramBundle, true); 
    for (a a : this.a) {
      if (paramBoolean && !a.b)
        continue; 
      FragmentManager.l l = a.a;
      throw null;
    } 
  }
  
  void i(Fragment paramFragment, boolean paramBoolean) {
    Fragment fragment = this.b.x0();
    if (fragment != null)
      fragment.I().w0().i(paramFragment, true); 
    for (a a : this.a) {
      if (paramBoolean && !a.b)
        continue; 
      FragmentManager.l l = a.a;
      throw null;
    } 
  }
  
  void j(Fragment paramFragment, Bundle paramBundle, boolean paramBoolean) {
    Fragment fragment = this.b.x0();
    if (fragment != null)
      fragment.I().w0().j(paramFragment, paramBundle, true); 
    Iterator<a> iterator = this.a.iterator();
    while (iterator.hasNext()) {
      a a = iterator.next();
      if (paramBoolean && !a.b)
        continue; 
      FragmentManager.l l = a.a;
      throw null;
    } 
  }
  
  void k(Fragment paramFragment, boolean paramBoolean) {
    Fragment fragment = this.b.x0();
    if (fragment != null)
      fragment.I().w0().k(paramFragment, true); 
    Iterator<a> iterator = this.a.iterator();
    while (iterator.hasNext()) {
      a a = iterator.next();
      if (paramBoolean && !a.b)
        continue; 
      FragmentManager.l l = a.a;
      throw null;
    } 
  }
  
  void l(Fragment paramFragment, boolean paramBoolean) {
    Fragment fragment = this.b.x0();
    if (fragment != null)
      fragment.I().w0().l(paramFragment, true); 
    for (a a : this.a) {
      if (paramBoolean && !a.b)
        continue; 
      FragmentManager.l l = a.a;
      throw null;
    } 
  }
  
  void m(Fragment paramFragment, View paramView, Bundle paramBundle, boolean paramBoolean) {
    Fragment fragment = this.b.x0();
    if (fragment != null)
      fragment.I().w0().m(paramFragment, paramView, paramBundle, true); 
    Iterator<a> iterator = this.a.iterator();
    while (iterator.hasNext()) {
      a a = iterator.next();
      if (paramBoolean && !a.b)
        continue; 
      FragmentManager.l l = a.a;
      throw null;
    } 
  }
  
  void n(Fragment paramFragment, boolean paramBoolean) {
    Fragment fragment = this.b.x0();
    if (fragment != null)
      fragment.I().w0().n(paramFragment, true); 
    for (a a : this.a) {
      if (paramBoolean && !a.b)
        continue; 
      FragmentManager.l l = a.a;
      throw null;
    } 
  }
  
  private static final class a {
    final FragmentManager.l a;
    
    final boolean b;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/fragment/app/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */