package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager.widget.a;
import java.util.ArrayList;

@Deprecated
public abstract class q extends a {
  private final FragmentManager c;
  
  private final int d;
  
  private s e = null;
  
  private ArrayList<Fragment.SavedState> f = new ArrayList<Fragment.SavedState>();
  
  private ArrayList<Fragment> g = new ArrayList<Fragment>();
  
  private Fragment h = null;
  
  private boolean i;
  
  @Deprecated
  public q(FragmentManager paramFragmentManager) {
    this(paramFragmentManager, 0);
  }
  
  public q(FragmentManager paramFragmentManager, int paramInt) {
    this.c = paramFragmentManager;
    this.d = paramInt;
  }
  
  public void b(ViewGroup paramViewGroup, int paramInt, Object paramObject) {
    paramObject = paramObject;
    if (this.e == null)
      this.e = this.c.l(); 
    while (this.f.size() <= paramInt)
      this.f.add(null); 
    ArrayList<Fragment.SavedState> arrayList = this.f;
    if (paramObject.b0()) {
      Fragment.SavedState savedState = this.c.i1((Fragment)paramObject);
    } else {
      paramViewGroup = null;
    } 
    arrayList.set(paramInt, paramViewGroup);
    this.g.set(paramInt, null);
    this.e.o((Fragment)paramObject);
    if (paramObject.equals(this.h))
      this.h = null; 
  }
  
  public void d(ViewGroup paramViewGroup) {
    s s1 = this.e;
    if (s1 != null) {
      if (!this.i)
        try {
          this.i = true;
          s1.k();
        } finally {
          this.i = false;
        }  
      this.e = null;
    } 
  }
  
  public Object j(ViewGroup paramViewGroup, int paramInt) {
    if (this.g.size() > paramInt) {
      Fragment fragment1 = this.g.get(paramInt);
      if (fragment1 != null)
        return fragment1; 
    } 
    if (this.e == null)
      this.e = this.c.l(); 
    Fragment fragment = v(paramInt);
    if (this.f.size() > paramInt) {
      Fragment.SavedState savedState = this.f.get(paramInt);
      if (savedState != null)
        fragment.E1(savedState); 
    } 
    while (this.g.size() <= paramInt)
      this.g.add(null); 
    fragment.F1(false);
    if (this.d == 0)
      fragment.L1(false); 
    this.g.set(paramInt, fragment);
    this.e.b(paramViewGroup.getId(), fragment);
    if (this.d == 1)
      this.e.r(fragment, Lifecycle.State.e); 
    return fragment;
  }
  
  public boolean k(View paramView, Object paramObject) {
    boolean bool;
    if (((Fragment)paramObject).W() == paramView) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void n(Parcelable paramParcelable, ClassLoader paramClassLoader) {
    if (paramParcelable != null) {
      Bundle bundle = (Bundle)paramParcelable;
      bundle.setClassLoader(paramClassLoader);
      Parcelable[] arrayOfParcelable = bundle.getParcelableArray("states");
      this.f.clear();
      this.g.clear();
      if (arrayOfParcelable != null)
        for (byte b = 0; b < arrayOfParcelable.length; b++)
          this.f.add((Fragment.SavedState)arrayOfParcelable[b]);  
      for (String str : bundle.keySet()) {
        if (str.startsWith("f")) {
          int i = Integer.parseInt(str.substring(1));
          Fragment fragment = this.c.p0(bundle, str);
          if (fragment != null) {
            while (this.g.size() <= i)
              this.g.add(null); 
            fragment.F1(false);
            this.g.set(i, fragment);
            continue;
          } 
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Bad fragment at key ");
          stringBuilder.append(str);
          Log.w("FragmentStatePagerAdapt", stringBuilder.toString());
        } 
      } 
    } 
  }
  
  public Parcelable o() {
    Bundle bundle;
    if (this.f.size() > 0) {
      bundle = new Bundle();
      Fragment.SavedState[] arrayOfSavedState = new Fragment.SavedState[this.f.size()];
      this.f.toArray(arrayOfSavedState);
      bundle.putParcelableArray("states", (Parcelable[])arrayOfSavedState);
    } else {
      bundle = null;
    } 
    byte b = 0;
    while (b < this.g.size()) {
      Fragment fragment = this.g.get(b);
      Bundle bundle1 = bundle;
      if (fragment != null) {
        bundle1 = bundle;
        if (fragment.b0()) {
          bundle1 = bundle;
          if (bundle == null)
            bundle1 = new Bundle(); 
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("f");
          stringBuilder.append(b);
          String str = stringBuilder.toString();
          this.c.a1(bundle1, str, fragment);
        } 
      } 
      b++;
      bundle = bundle1;
    } 
    return (Parcelable)bundle;
  }
  
  public void q(ViewGroup paramViewGroup, int paramInt, Object paramObject) {
    Fragment fragment = (Fragment)paramObject;
    paramObject = this.h;
    if (fragment != paramObject) {
      if (paramObject != null) {
        paramObject.F1(false);
        if (this.d == 1) {
          if (this.e == null)
            this.e = this.c.l(); 
          this.e.r(this.h, Lifecycle.State.e);
        } else {
          this.h.L1(false);
        } 
      } 
      fragment.F1(true);
      if (this.d == 1) {
        if (this.e == null)
          this.e = this.c.l(); 
        this.e.r(fragment, Lifecycle.State.f);
      } else {
        fragment.L1(true);
      } 
      this.h = fragment;
    } 
  }
  
  public void t(ViewGroup paramViewGroup) {
    if (paramViewGroup.getId() != -1)
      return; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("ViewPager with adapter ");
    stringBuilder.append(this);
    stringBuilder.append(" requires a view id");
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  public abstract Fragment v(int paramInt);
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/fragment/app/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */