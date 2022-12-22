package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.r;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

final class l extends r {
  private static final s.a c = new a();
  
  private final HashMap<String, Fragment> d = new HashMap<String, Fragment>();
  
  private final HashMap<String, l> e = new HashMap<String, l>();
  
  private final HashMap<String, t> f = new HashMap<String, t>();
  
  private final boolean g;
  
  private boolean h = false;
  
  private boolean i = false;
  
  private boolean j = false;
  
  l(boolean paramBoolean) {
    this.g = paramBoolean;
  }
  
  static l i(t paramt) {
    return (l)(new s(paramt, c)).a(l.class);
  }
  
  protected void d() {
    if (FragmentManager.G0(3)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("onCleared called for ");
      stringBuilder.append(this);
      Log.d("FragmentManager", stringBuilder.toString());
    } 
    this.h = true;
  }
  
  void e(Fragment paramFragment) {
    if (this.j) {
      if (FragmentManager.G0(2))
        Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved"); 
      return;
    } 
    if (this.d.containsKey(paramFragment.h))
      return; 
    this.d.put(paramFragment.h, paramFragment);
    if (FragmentManager.G0(2)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Updating retained Fragments: Added ");
      stringBuilder.append(paramFragment);
      Log.v("FragmentManager", stringBuilder.toString());
    } 
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = true;
    if (this == paramObject)
      return true; 
    if (paramObject == null || l.class != paramObject.getClass())
      return false; 
    paramObject = paramObject;
    if (!this.d.equals(((l)paramObject).d) || !this.e.equals(((l)paramObject).e) || !this.f.equals(((l)paramObject).f))
      bool = false; 
    return bool;
  }
  
  void f(Fragment paramFragment) {
    if (FragmentManager.G0(3)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Clearing non-config state for ");
      stringBuilder.append(paramFragment);
      Log.d("FragmentManager", stringBuilder.toString());
    } 
    l l1 = this.e.get(paramFragment.h);
    if (l1 != null) {
      l1.d();
      this.e.remove(paramFragment.h);
    } 
    t t = this.f.get(paramFragment.h);
    if (t != null) {
      t.a();
      this.f.remove(paramFragment.h);
    } 
  }
  
  Fragment g(String paramString) {
    return this.d.get(paramString);
  }
  
  l h(Fragment paramFragment) {
    l l1 = this.e.get(paramFragment.h);
    l l2 = l1;
    if (l1 == null) {
      l2 = new l(this.g);
      this.e.put(paramFragment.h, l2);
    } 
    return l2;
  }
  
  public int hashCode() {
    return (this.d.hashCode() * 31 + this.e.hashCode()) * 31 + this.f.hashCode();
  }
  
  Collection<Fragment> j() {
    return new ArrayList<Fragment>(this.d.values());
  }
  
  t k(Fragment paramFragment) {
    t t1 = this.f.get(paramFragment.h);
    t t2 = t1;
    if (t1 == null) {
      t2 = new t();
      this.f.put(paramFragment.h, t2);
    } 
    return t2;
  }
  
  boolean l() {
    return this.h;
  }
  
  void m(Fragment paramFragment) {
    boolean bool;
    if (this.j) {
      if (FragmentManager.G0(2))
        Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved"); 
      return;
    } 
    if (this.d.remove(paramFragment.h) != null) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool && FragmentManager.G0(2)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Updating retained Fragments: Removed ");
      stringBuilder.append(paramFragment);
      Log.v("FragmentManager", stringBuilder.toString());
    } 
  }
  
  void n(boolean paramBoolean) {
    this.j = paramBoolean;
  }
  
  boolean o(Fragment paramFragment) {
    return !this.d.containsKey(paramFragment.h) ? true : (this.g ? this.h : (this.i ^ true));
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder("FragmentManagerViewModel{");
    stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    stringBuilder.append("} Fragments (");
    Iterator<String> iterator = this.d.values().iterator();
    while (iterator.hasNext()) {
      stringBuilder.append(iterator.next());
      if (iterator.hasNext())
        stringBuilder.append(", "); 
    } 
    stringBuilder.append(") Child Non Config (");
    iterator = this.e.keySet().iterator();
    while (iterator.hasNext()) {
      stringBuilder.append(iterator.next());
      if (iterator.hasNext())
        stringBuilder.append(", "); 
    } 
    stringBuilder.append(") ViewModelStores (");
    iterator = this.f.keySet().iterator();
    while (iterator.hasNext()) {
      stringBuilder.append(iterator.next());
      if (iterator.hasNext())
        stringBuilder.append(", "); 
    } 
    stringBuilder.append(')');
    return stringBuilder.toString();
  }
  
  class a implements s.a {
    public <T extends r> T a(Class<T> param1Class) {
      return (T)new l(true);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/fragment/app/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */