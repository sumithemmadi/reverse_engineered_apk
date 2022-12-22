package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager.widget.a;

@Deprecated
public abstract class n extends a {
  private final FragmentManager c;
  
  private final int d;
  
  private s e = null;
  
  private Fragment f = null;
  
  private boolean g;
  
  @Deprecated
  public n(FragmentManager paramFragmentManager) {
    this(paramFragmentManager, 0);
  }
  
  public n(FragmentManager paramFragmentManager, int paramInt) {
    this.c = paramFragmentManager;
    this.d = paramInt;
  }
  
  private static String x(int paramInt, long paramLong) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("android:switcher:");
    stringBuilder.append(paramInt);
    stringBuilder.append(":");
    stringBuilder.append(paramLong);
    return stringBuilder.toString();
  }
  
  public void b(ViewGroup paramViewGroup, int paramInt, Object paramObject) {
    Fragment fragment = (Fragment)paramObject;
    if (this.e == null)
      this.e = this.c.l(); 
    this.e.l(fragment);
    if (fragment.equals(this.f))
      this.f = null; 
  }
  
  public void d(ViewGroup paramViewGroup) {
    s s1 = this.e;
    if (s1 != null) {
      if (!this.g)
        try {
          this.g = true;
          s1.k();
        } finally {
          this.g = false;
        }  
      this.e = null;
    } 
  }
  
  public Object j(ViewGroup paramViewGroup, int paramInt) {
    Fragment fragment1;
    if (this.e == null)
      this.e = this.c.l(); 
    long l = w(paramInt);
    String str = x(paramViewGroup.getId(), l);
    Fragment fragment2 = this.c.i0(str);
    if (fragment2 != null) {
      this.e.g(fragment2);
      fragment1 = fragment2;
    } else {
      fragment2 = v(paramInt);
      this.e.c(fragment1.getId(), fragment2, x(fragment1.getId(), l));
      fragment1 = fragment2;
    } 
    if (fragment1 != this.f) {
      fragment1.F1(false);
      if (this.d == 1) {
        this.e.r(fragment1, Lifecycle.State.e);
      } else {
        fragment1.L1(false);
      } 
    } 
    return fragment1;
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
  
  public void n(Parcelable paramParcelable, ClassLoader paramClassLoader) {}
  
  public Parcelable o() {
    return null;
  }
  
  public void q(ViewGroup paramViewGroup, int paramInt, Object paramObject) {
    Fragment fragment = (Fragment)paramObject;
    paramObject = this.f;
    if (fragment != paramObject) {
      if (paramObject != null) {
        paramObject.F1(false);
        if (this.d == 1) {
          if (this.e == null)
            this.e = this.c.l(); 
          this.e.r(this.f, Lifecycle.State.e);
        } else {
          this.f.L1(false);
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
      this.f = fragment;
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
  
  public long w(int paramInt) {
    return paramInt;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/fragment/app/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */