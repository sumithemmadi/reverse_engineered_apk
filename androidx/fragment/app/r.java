package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

class r {
  private final ArrayList<Fragment> a = new ArrayList<Fragment>();
  
  private final HashMap<String, p> b = new HashMap<String, p>();
  
  private l c;
  
  void a(Fragment paramFragment) {
    if (!this.a.contains(paramFragment))
      synchronized (this.a) {
        this.a.add(paramFragment);
        paramFragment.n = true;
        return;
      }  
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Fragment already added: ");
    stringBuilder.append(paramFragment);
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  void b() {
    this.b.values().removeAll(Collections.singleton(null));
  }
  
  boolean c(String paramString) {
    boolean bool;
    if (this.b.get(paramString) != null) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  void d(int paramInt) {
    for (p p : this.b.values()) {
      if (p != null)
        p.u(paramInt); 
    } 
  }
  
  void e(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramString);
    stringBuilder.append("    ");
    String str = stringBuilder.toString();
    if (!this.b.isEmpty()) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Active Fragments:");
      for (p p : this.b.values()) {
        paramPrintWriter.print(paramString);
        if (p != null) {
          Fragment fragment = p.k();
          paramPrintWriter.println(fragment);
          fragment.i(str, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
          continue;
        } 
        paramPrintWriter.println("null");
      } 
    } 
    int i = this.a.size();
    if (i > 0) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Added Fragments:");
      for (byte b = 0; b < i; b++) {
        Fragment fragment = this.a.get(b);
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  #");
        paramPrintWriter.print(b);
        paramPrintWriter.print(": ");
        paramPrintWriter.println(fragment.toString());
      } 
    } 
  }
  
  Fragment f(String paramString) {
    p p = this.b.get(paramString);
    return (p != null) ? p.k() : null;
  }
  
  Fragment g(int paramInt) {
    for (int i = this.a.size() - 1; i >= 0; i--) {
      Fragment fragment = this.a.get(i);
      if (fragment != null && fragment.y == paramInt)
        return fragment; 
    } 
    for (p p : this.b.values()) {
      if (p != null) {
        Fragment fragment = p.k();
        if (fragment.y == paramInt)
          return fragment; 
      } 
    } 
    return null;
  }
  
  Fragment h(String paramString) {
    if (paramString != null)
      for (int i = this.a.size() - 1; i >= 0; i--) {
        Fragment fragment = this.a.get(i);
        if (fragment != null && paramString.equals(fragment.A))
          return fragment; 
      }  
    if (paramString != null)
      for (p p : this.b.values()) {
        if (p != null) {
          Fragment fragment = p.k();
          if (paramString.equals(fragment.A))
            return fragment; 
        } 
      }  
    return null;
  }
  
  Fragment i(String paramString) {
    for (p p : this.b.values()) {
      if (p != null) {
        Fragment fragment = p.k().l(paramString);
        if (fragment != null)
          return fragment; 
      } 
    } 
    return null;
  }
  
  int j(Fragment paramFragment) {
    int k;
    ViewGroup viewGroup = paramFragment.I;
    if (viewGroup == null)
      return -1; 
    int i = this.a.indexOf(paramFragment);
    int j = i - 1;
    while (true) {
      k = i;
      if (j >= 0) {
        paramFragment = this.a.get(j);
        if (paramFragment.I == viewGroup) {
          View view = paramFragment.J;
          if (view != null)
            return viewGroup.indexOfChild(view) + 1; 
        } 
        j--;
        continue;
      } 
      break;
    } 
    while (++k < this.a.size()) {
      paramFragment = this.a.get(k);
      if (paramFragment.I == viewGroup) {
        View view = paramFragment.J;
        if (view != null)
          return viewGroup.indexOfChild(view); 
      } 
    } 
    return -1;
  }
  
  List<p> k() {
    ArrayList<p> arrayList = new ArrayList();
    for (p p : this.b.values()) {
      if (p != null)
        arrayList.add(p); 
    } 
    return arrayList;
  }
  
  List<Fragment> l() {
    ArrayList<Fragment> arrayList = new ArrayList();
    for (p p : this.b.values()) {
      if (p != null) {
        arrayList.add(p.k());
        continue;
      } 
      arrayList.add(null);
    } 
    return arrayList;
  }
  
  p m(String paramString) {
    return this.b.get(paramString);
  }
  
  List<Fragment> n() {
    if (this.a.isEmpty())
      return Collections.emptyList(); 
    synchronized (this.a) {
      ArrayList<Fragment> arrayList = new ArrayList();
      this((Collection)this.a);
      return arrayList;
    } 
  }
  
  l o() {
    return this.c;
  }
  
  void p(p paramp) {
    Fragment fragment = paramp.k();
    if (c(fragment.h))
      return; 
    this.b.put(fragment.h, paramp);
    if (fragment.E) {
      if (fragment.D) {
        this.c.e(fragment);
      } else {
        this.c.m(fragment);
      } 
      fragment.E = false;
    } 
    if (FragmentManager.G0(2)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Added fragment to active set ");
      stringBuilder.append(fragment);
      Log.v("FragmentManager", stringBuilder.toString());
    } 
  }
  
  void q(p paramp) {
    Fragment fragment = paramp.k();
    if (fragment.D)
      this.c.m(fragment); 
    if ((p)this.b.put(fragment.h, null) == null)
      return; 
    if (FragmentManager.G0(2)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Removed fragment from active set ");
      stringBuilder.append(fragment);
      Log.v("FragmentManager", stringBuilder.toString());
    } 
  }
  
  void r() {
    for (Fragment fragment : this.a) {
      p p = this.b.get(fragment.h);
      if (p != null)
        p.m(); 
    } 
    for (p p : this.b.values()) {
      if (p != null) {
        boolean bool;
        p.m();
        Fragment fragment = p.k();
        if (fragment.o && !fragment.f0()) {
          bool = true;
        } else {
          bool = false;
        } 
        if (bool)
          q(p); 
      } 
    } 
  }
  
  void s(Fragment paramFragment) {
    synchronized (this.a) {
      this.a.remove(paramFragment);
      paramFragment.n = false;
      return;
    } 
  }
  
  void t() {
    this.b.clear();
  }
  
  void u(List<String> paramList) {
    this.a.clear();
    if (paramList != null)
      for (String str : paramList) {
        Fragment fragment = f(str);
        if (fragment != null) {
          if (FragmentManager.G0(2)) {
            StringBuilder stringBuilder1 = new StringBuilder();
            stringBuilder1.append("restoreSaveState: added (");
            stringBuilder1.append(str);
            stringBuilder1.append("): ");
            stringBuilder1.append(fragment);
            Log.v("FragmentManager", stringBuilder1.toString());
          } 
          a(fragment);
          continue;
        } 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("No instantiated fragment for (");
        stringBuilder.append(str);
        stringBuilder.append(")");
        throw new IllegalStateException(stringBuilder.toString());
      }  
  }
  
  ArrayList<FragmentState> v() {
    ArrayList<FragmentState> arrayList = new ArrayList(this.b.size());
    for (p p : this.b.values()) {
      if (p != null) {
        Fragment fragment = p.k();
        FragmentState fragmentState = p.s();
        arrayList.add(fragmentState);
        if (FragmentManager.G0(2)) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Saved state of ");
          stringBuilder.append(fragment);
          stringBuilder.append(": ");
          stringBuilder.append(fragmentState.n);
          Log.v("FragmentManager", stringBuilder.toString());
        } 
      } 
    } 
    return arrayList;
  }
  
  ArrayList<String> w() {
    synchronized (this.a) {
      if (this.a.isEmpty())
        return null; 
      ArrayList<String> arrayList = new ArrayList();
      this(this.a.size());
      for (Fragment fragment : this.a) {
        arrayList.add(fragment.h);
        if (FragmentManager.G0(2)) {
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("saveAllState: adding fragment (");
          stringBuilder.append(fragment.h);
          stringBuilder.append("): ");
          stringBuilder.append(fragment);
          Log.v("FragmentManager", stringBuilder.toString());
        } 
      } 
      return arrayList;
    } 
  }
  
  void x(l paraml) {
    this.c = paraml;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/fragment/app/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */