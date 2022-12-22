package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabWidget;
import java.util.ArrayList;

@Deprecated
public class FragmentTabHost extends TabHost implements TabHost.OnTabChangeListener {
  private final ArrayList<a> b = new ArrayList<a>();
  
  private FrameLayout c;
  
  private Context d;
  
  private FragmentManager e;
  
  private int f;
  
  private TabHost.OnTabChangeListener g;
  
  private a h;
  
  private boolean i;
  
  @Deprecated
  public FragmentTabHost(Context paramContext) {
    super(paramContext, null);
    e(paramContext, null);
  }
  
  @Deprecated
  public FragmentTabHost(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    e(paramContext, paramAttributeSet);
  }
  
  private s a(String paramString, s params) {
    a a1 = d(paramString);
    s s1 = params;
    if (this.h != a1) {
      s1 = params;
      if (params == null)
        s1 = this.e.l(); 
      a a2 = this.h;
      if (a2 != null) {
        Fragment fragment = a2.d;
        if (fragment != null)
          s1.l(fragment); 
      } 
      if (a1 != null) {
        Fragment fragment = a1.d;
        if (fragment == null) {
          fragment = this.e.r0().a(this.d.getClassLoader(), a1.b.getName());
          a1.d = fragment;
          fragment.B1(a1.c);
          s1.c(this.f, a1.d, a1.a);
        } else {
          s1.g(fragment);
        } 
      } 
      this.h = a1;
    } 
    return s1;
  }
  
  private void b() {
    if (this.c == null) {
      FrameLayout frameLayout = (FrameLayout)findViewById(this.f);
      this.c = frameLayout;
      if (frameLayout == null) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("No tab content FrameLayout found for id ");
        stringBuilder.append(this.f);
        throw new IllegalStateException(stringBuilder.toString());
      } 
    } 
  }
  
  private void c(Context paramContext) {
    if (findViewById(16908307) == null) {
      LinearLayout linearLayout = new LinearLayout(paramContext);
      linearLayout.setOrientation(1);
      addView((View)linearLayout, (ViewGroup.LayoutParams)new FrameLayout.LayoutParams(-1, -1));
      TabWidget tabWidget = new TabWidget(paramContext);
      tabWidget.setId(16908307);
      tabWidget.setOrientation(0);
      linearLayout.addView((View)tabWidget, (ViewGroup.LayoutParams)new LinearLayout.LayoutParams(-1, -2, 0.0F));
      FrameLayout frameLayout2 = new FrameLayout(paramContext);
      frameLayout2.setId(16908305);
      linearLayout.addView((View)frameLayout2, (ViewGroup.LayoutParams)new LinearLayout.LayoutParams(0, 0, 0.0F));
      FrameLayout frameLayout1 = new FrameLayout(paramContext);
      this.c = frameLayout1;
      frameLayout1.setId(this.f);
      linearLayout.addView((View)frameLayout1, (ViewGroup.LayoutParams)new LinearLayout.LayoutParams(-1, 0, 1.0F));
    } 
  }
  
  private a d(String paramString) {
    int i = this.b.size();
    for (byte b = 0; b < i; b++) {
      a a1 = this.b.get(b);
      if (a1.a.equals(paramString))
        return a1; 
    } 
    return null;
  }
  
  private void e(Context paramContext, AttributeSet paramAttributeSet) {
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, new int[] { 16842995 }, 0, 0);
    this.f = typedArray.getResourceId(0, 0);
    typedArray.recycle();
    super.setOnTabChangedListener(this);
  }
  
  @Deprecated
  protected void onAttachedToWindow() {
    super.onAttachedToWindow();
    String str = getCurrentTabTag();
    int i = this.b.size();
    s s = null;
    byte b = 0;
    while (b < i) {
      a a1 = this.b.get(b);
      Fragment fragment = this.e.i0(a1.a);
      a1.d = fragment;
      s s1 = s;
      if (fragment != null) {
        s1 = s;
        if (!fragment.c0())
          if (a1.a.equals(str)) {
            this.h = a1;
            s1 = s;
          } else {
            s1 = s;
            if (s == null)
              s1 = this.e.l(); 
            s1.l(a1.d);
          }  
      } 
      b++;
      s = s1;
    } 
    this.i = true;
    s = a(str, s);
    if (s != null) {
      s.h();
      this.e.e0();
    } 
  }
  
  @Deprecated
  protected void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    this.i = false;
  }
  
  @Deprecated
  protected void onRestoreInstanceState(@SuppressLint({"UnknownNullness"}) Parcelable paramParcelable) {
    if (!(paramParcelable instanceof SavedState)) {
      super.onRestoreInstanceState(paramParcelable);
      return;
    } 
    SavedState savedState = (SavedState)paramParcelable;
    super.onRestoreInstanceState(savedState.getSuperState());
    setCurrentTabByTag(savedState.b);
  }
  
  @Deprecated
  protected Parcelable onSaveInstanceState() {
    SavedState savedState = new SavedState(super.onSaveInstanceState());
    savedState.b = getCurrentTabTag();
    return (Parcelable)savedState;
  }
  
  @Deprecated
  public void onTabChanged(String paramString) {
    if (this.i) {
      s s = a(paramString, null);
      if (s != null)
        s.h(); 
    } 
    TabHost.OnTabChangeListener onTabChangeListener = this.g;
    if (onTabChangeListener != null)
      onTabChangeListener.onTabChanged(paramString); 
  }
  
  @Deprecated
  public void setOnTabChangedListener(TabHost.OnTabChangeListener paramOnTabChangeListener) {
    this.g = paramOnTabChangeListener;
  }
  
  @Deprecated
  public void setup() {
    throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
  }
  
  @Deprecated
  public void setup(Context paramContext, FragmentManager paramFragmentManager) {
    c(paramContext);
    super.setup();
    this.d = paramContext;
    this.e = paramFragmentManager;
    b();
  }
  
  @Deprecated
  public void setup(Context paramContext, FragmentManager paramFragmentManager, int paramInt) {
    c(paramContext);
    super.setup();
    this.d = paramContext;
    this.e = paramFragmentManager;
    this.f = paramInt;
    b();
    this.c.setId(paramInt);
    if (getId() == -1)
      setId(16908306); 
  }
  
  static class SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<SavedState> CREATOR = new a();
    
    String b;
    
    SavedState(Parcel param1Parcel) {
      super(param1Parcel);
      this.b = param1Parcel.readString();
    }
    
    SavedState(Parcelable param1Parcelable) {
      super(param1Parcelable);
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("FragmentTabHost.SavedState{");
      stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
      stringBuilder.append(" curTab=");
      stringBuilder.append(this.b);
      stringBuilder.append("}");
      return stringBuilder.toString();
    }
    
    public void writeToParcel(Parcel param1Parcel, int param1Int) {
      super.writeToParcel(param1Parcel, param1Int);
      param1Parcel.writeString(this.b);
    }
    
    class a implements Parcelable.Creator<SavedState> {
      public FragmentTabHost.SavedState a(Parcel param2Parcel) {
        return new FragmentTabHost.SavedState(param2Parcel);
      }
      
      public FragmentTabHost.SavedState[] b(int param2Int) {
        return new FragmentTabHost.SavedState[param2Int];
      }
    }
  }
  
  class a implements Parcelable.Creator<SavedState> {
    public FragmentTabHost.SavedState a(Parcel param1Parcel) {
      return new FragmentTabHost.SavedState(param1Parcel);
    }
    
    public FragmentTabHost.SavedState[] b(int param1Int) {
      return new FragmentTabHost.SavedState[param1Int];
    }
  }
  
  static final class a {
    final String a;
    
    final Class<?> b;
    
    final Bundle c;
    
    Fragment d;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/fragment/app/FragmentTabHost.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */