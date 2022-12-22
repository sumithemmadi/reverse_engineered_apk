package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import b.m.c;

class i implements LayoutInflater.Factory2 {
  final FragmentManager b;
  
  i(FragmentManager paramFragmentManager) {
    this.b = paramFragmentManager;
  }
  
  public View onCreateView(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet) {
    Fragment fragment;
    boolean bool1;
    if (FragmentContainerView.class.getName().equals(paramString))
      return (View)new FragmentContainerView(paramContext, paramAttributeSet, this.b); 
    boolean bool = "fragment".equals(paramString);
    paramString = null;
    if (!bool)
      return null; 
    String str1 = paramAttributeSet.getAttributeValue(null, "class");
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, c.Fragment);
    String str2 = str1;
    if (str1 == null)
      str2 = typedArray.getString(c.Fragment_android_name); 
    int j = typedArray.getResourceId(c.Fragment_android_id, -1);
    String str3 = typedArray.getString(c.Fragment_android_tag);
    typedArray.recycle();
    if (str2 == null || !g.b(paramContext.getClassLoader(), str2))
      return null; 
    if (paramView != null) {
      bool1 = paramView.getId();
    } else {
      bool1 = false;
    } 
    if (bool1 != -1 || j != -1 || str3 != null) {
      StringBuilder stringBuilder2;
      p p;
      if (j != -1)
        fragment1 = this.b.h0(j); 
      Fragment fragment2 = fragment1;
      if (fragment1 == null) {
        fragment2 = fragment1;
        if (str3 != null)
          fragment2 = this.b.i0(str3); 
      } 
      Fragment fragment1 = fragment2;
      if (fragment2 == null) {
        fragment1 = fragment2;
        if (bool1 != -1)
          fragment1 = this.b.h0(bool1); 
      } 
      if (fragment1 == null) {
        boolean bool2;
        fragment1 = this.b.r0().a(paramContext.getClassLoader(), str2);
        fragment1.p = true;
        if (j != 0) {
          bool2 = j;
        } else {
          bool2 = bool1;
        } 
        fragment1.y = bool2;
        fragment1.z = bool1;
        fragment1.A = str3;
        fragment1.q = true;
        FragmentManager fragmentManager = this.b;
        fragment1.u = fragmentManager;
        fragment1.v = fragmentManager.u0();
        fragment1.E0(this.b.u0().k(), paramAttributeSet, fragment1.d);
        p p1 = this.b.g(fragment1);
        fragment = fragment1;
        p = p1;
        if (FragmentManager.G0(2)) {
          StringBuilder stringBuilder3 = new StringBuilder();
          stringBuilder3.append("Fragment ");
          stringBuilder3.append(fragment1);
          stringBuilder3.append(" has been inflated via the <fragment> tag: id=0x");
          stringBuilder3.append(Integer.toHexString(j));
          Log.v("FragmentManager", stringBuilder3.toString());
          fragment = fragment1;
          p p2 = p1;
        } 
      } else if (!fragment1.q) {
        fragment1.q = true;
        FragmentManager fragmentManager = this.b;
        fragment1.u = fragmentManager;
        fragment1.v = fragmentManager.u0();
        fragment1.E0(this.b.u0().k(), (AttributeSet)fragment, fragment1.d);
        p p1 = this.b.v(fragment1);
        fragment = fragment1;
        p = p1;
        if (FragmentManager.G0(2)) {
          StringBuilder stringBuilder3 = new StringBuilder();
          stringBuilder3.append("Retained Fragment ");
          stringBuilder3.append(fragment1);
          stringBuilder3.append(" has been re-attached via the <fragment> tag: id=0x");
          stringBuilder3.append(Integer.toHexString(j));
          Log.v("FragmentManager", stringBuilder3.toString());
          p = p1;
          fragment = fragment1;
        } 
      } else {
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append(fragment.getPositionDescription());
        stringBuilder2.append(": Duplicate id 0x");
        stringBuilder2.append(Integer.toHexString(j));
        stringBuilder2.append(", tag ");
        stringBuilder2.append(str3);
        stringBuilder2.append(", or parent id 0x");
        stringBuilder2.append(Integer.toHexString(bool1));
        stringBuilder2.append(" with another fragment for ");
        stringBuilder2.append(str2);
        throw new IllegalArgumentException(stringBuilder2.toString());
      } 
      fragment.I = (ViewGroup)stringBuilder2;
      p.m();
      p.j();
      View view = fragment.J;
      if (view != null) {
        if (j != 0)
          view.setId(j); 
        if (fragment.J.getTag() == null)
          fragment.J.setTag(str3); 
        fragment.J.addOnAttachStateChangeListener(new a(this, p));
        return fragment.J;
      } 
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("Fragment ");
      stringBuilder1.append(str2);
      stringBuilder1.append(" did not create a view.");
      throw new IllegalStateException(stringBuilder1.toString());
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(fragment.getPositionDescription());
    stringBuilder.append(": Must specify unique android:id, android:tag, or have a parent with an id for ");
    stringBuilder.append(str2);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public View onCreateView(String paramString, Context paramContext, AttributeSet paramAttributeSet) {
    return onCreateView(null, paramString, paramContext, paramAttributeSet);
  }
  
  class a implements View.OnAttachStateChangeListener {
    a(i this$0, p param1p) {}
    
    public void onViewAttachedToWindow(View param1View) {
      Fragment fragment = this.b.k();
      this.b.m();
      SpecialEffectsController.n((ViewGroup)fragment.J.getParent(), this.c.b).j();
    }
    
    public void onViewDetachedFromWindow(View param1View) {}
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/fragment/app/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */