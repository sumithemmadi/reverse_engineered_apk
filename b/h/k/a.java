package b.h.k;

import android.os.Build;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import b.h.c;
import b.h.k.f0.c;
import b.h.k.f0.d;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

public class a {
  private static final View.AccessibilityDelegate a = new View.AccessibilityDelegate();
  
  private final View.AccessibilityDelegate b;
  
  private final View.AccessibilityDelegate c;
  
  public a() {
    this(a);
  }
  
  public a(View.AccessibilityDelegate paramAccessibilityDelegate) {
    this.b = paramAccessibilityDelegate;
    this.c = new a(this);
  }
  
  static List<c.a> c(View paramView) {
    List<?> list2 = (List)paramView.getTag(c.tag_accessibility_actions);
    List<?> list1 = list2;
    if (list2 == null)
      list1 = Collections.emptyList(); 
    return (List)list1;
  }
  
  private boolean e(ClickableSpan paramClickableSpan, View paramView) {
    if (paramClickableSpan != null) {
      ClickableSpan[] arrayOfClickableSpan = c.q(paramView.createAccessibilityNodeInfo().getText());
      for (byte b = 0; arrayOfClickableSpan != null && b < arrayOfClickableSpan.length; b++) {
        if (paramClickableSpan.equals(arrayOfClickableSpan[b]))
          return true; 
      } 
    } 
    return false;
  }
  
  private boolean k(int paramInt, View paramView) {
    SparseArray sparseArray = (SparseArray)paramView.getTag(c.tag_accessibility_clickable_spans);
    if (sparseArray != null) {
      WeakReference<ClickableSpan> weakReference = (WeakReference)sparseArray.get(paramInt);
      if (weakReference != null) {
        ClickableSpan clickableSpan = weakReference.get();
        if (e(clickableSpan, paramView)) {
          clickableSpan.onClick(paramView);
          return true;
        } 
      } 
    } 
    return false;
  }
  
  public boolean a(View paramView, AccessibilityEvent paramAccessibilityEvent) {
    return this.b.dispatchPopulateAccessibilityEvent(paramView, paramAccessibilityEvent);
  }
  
  public d b(View paramView) {
    if (Build.VERSION.SDK_INT >= 16) {
      AccessibilityNodeProvider accessibilityNodeProvider = this.b.getAccessibilityNodeProvider(paramView);
      if (accessibilityNodeProvider != null)
        return new d(accessibilityNodeProvider); 
    } 
    return null;
  }
  
  View.AccessibilityDelegate d() {
    return this.c;
  }
  
  public void f(View paramView, AccessibilityEvent paramAccessibilityEvent) {
    this.b.onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
  }
  
  public void g(View paramView, c paramc) {
    this.b.onInitializeAccessibilityNodeInfo(paramView, paramc.G0());
  }
  
  public void h(View paramView, AccessibilityEvent paramAccessibilityEvent) {
    this.b.onPopulateAccessibilityEvent(paramView, paramAccessibilityEvent);
  }
  
  public boolean i(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent) {
    return this.b.onRequestSendAccessibilityEvent(paramViewGroup, paramView, paramAccessibilityEvent);
  }
  
  public boolean j(View paramView, int paramInt, Bundle paramBundle) {
    List<c.a> list = c(paramView);
    boolean bool1 = false;
    byte b = 0;
    while (true) {
      bool2 = bool1;
      if (b < list.size()) {
        c.a a1 = list.get(b);
        if (a1.b() == paramInt) {
          bool2 = a1.d(paramView, paramBundle);
          break;
        } 
        b++;
        continue;
      } 
      break;
    } 
    bool1 = bool2;
    if (!bool2) {
      bool1 = bool2;
      if (Build.VERSION.SDK_INT >= 16)
        bool1 = this.b.performAccessibilityAction(paramView, paramInt, paramBundle); 
    } 
    boolean bool2 = bool1;
    if (!bool1) {
      bool2 = bool1;
      if (paramInt == c.accessibility_action_clickable_span)
        bool2 = k(paramBundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), paramView); 
    } 
    return bool2;
  }
  
  public void l(View paramView, int paramInt) {
    this.b.sendAccessibilityEvent(paramView, paramInt);
  }
  
  public void m(View paramView, AccessibilityEvent paramAccessibilityEvent) {
    this.b.sendAccessibilityEventUnchecked(paramView, paramAccessibilityEvent);
  }
  
  static final class a extends View.AccessibilityDelegate {
    final a a;
    
    a(a param1a) {
      this.a = param1a;
    }
    
    public boolean dispatchPopulateAccessibilityEvent(View param1View, AccessibilityEvent param1AccessibilityEvent) {
      return this.a.a(param1View, param1AccessibilityEvent);
    }
    
    public AccessibilityNodeProvider getAccessibilityNodeProvider(View param1View) {
      d d = this.a.b(param1View);
      if (d != null) {
        AccessibilityNodeProvider accessibilityNodeProvider = (AccessibilityNodeProvider)d.e();
      } else {
        d = null;
      } 
      return (AccessibilityNodeProvider)d;
    }
    
    public void onInitializeAccessibilityEvent(View param1View, AccessibilityEvent param1AccessibilityEvent) {
      this.a.f(param1View, param1AccessibilityEvent);
    }
    
    public void onInitializeAccessibilityNodeInfo(View param1View, AccessibilityNodeInfo param1AccessibilityNodeInfo) {
      c c = c.H0(param1AccessibilityNodeInfo);
      c.w0(w.Y(param1View));
      c.l0(w.T(param1View));
      c.r0(w.p(param1View));
      c.C0(w.L(param1View));
      this.a.g(param1View, c);
      c.f(param1AccessibilityNodeInfo.getText(), param1View);
      List<c.a> list = a.c(param1View);
      for (byte b = 0; b < list.size(); b++)
        c.b(list.get(b)); 
    }
    
    public void onPopulateAccessibilityEvent(View param1View, AccessibilityEvent param1AccessibilityEvent) {
      this.a.h(param1View, param1AccessibilityEvent);
    }
    
    public boolean onRequestSendAccessibilityEvent(ViewGroup param1ViewGroup, View param1View, AccessibilityEvent param1AccessibilityEvent) {
      return this.a.i(param1ViewGroup, param1View, param1AccessibilityEvent);
    }
    
    public boolean performAccessibilityAction(View param1View, int param1Int, Bundle param1Bundle) {
      return this.a.j(param1View, param1Int, param1Bundle);
    }
    
    public void sendAccessibilityEvent(View param1View, int param1Int) {
      this.a.l(param1View, param1Int);
    }
    
    public void sendAccessibilityEventUnchecked(View param1View, AccessibilityEvent param1AccessibilityEvent) {
      this.a.m(param1View, param1AccessibilityEvent);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/h/k/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */