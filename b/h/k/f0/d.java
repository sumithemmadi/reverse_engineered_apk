package b.h.k.f0;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

public class d {
  private final Object a;
  
  public d() {
    int i = Build.VERSION.SDK_INT;
    if (i >= 26) {
      this.a = new c(this);
    } else if (i >= 19) {
      this.a = new b(this);
    } else if (i >= 16) {
      this.a = new a(this);
    } else {
      this.a = null;
    } 
  }
  
  public d(Object paramObject) {
    this.a = paramObject;
  }
  
  public void a(int paramInt, c paramc, String paramString, Bundle paramBundle) {}
  
  public c b(int paramInt) {
    return null;
  }
  
  public List<c> c(String paramString, int paramInt) {
    return null;
  }
  
  public c d(int paramInt) {
    return null;
  }
  
  public Object e() {
    return this.a;
  }
  
  public boolean f(int paramInt1, int paramInt2, Bundle paramBundle) {
    return false;
  }
  
  static class a extends AccessibilityNodeProvider {
    final d a;
    
    a(d param1d) {
      this.a = param1d;
    }
    
    public AccessibilityNodeInfo createAccessibilityNodeInfo(int param1Int) {
      c c = this.a.b(param1Int);
      return (c == null) ? null : c.G0();
    }
    
    public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String param1String, int param1Int) {
      List<c> list = this.a.c(param1String, param1Int);
      if (list == null)
        return null; 
      ArrayList<AccessibilityNodeInfo> arrayList = new ArrayList();
      int i = list.size();
      for (param1Int = 0; param1Int < i; param1Int++)
        arrayList.add(((c)list.get(param1Int)).G0()); 
      return arrayList;
    }
    
    public boolean performAction(int param1Int1, int param1Int2, Bundle param1Bundle) {
      return this.a.f(param1Int1, param1Int2, param1Bundle);
    }
  }
  
  static class b extends a {
    b(d param1d) {
      super(param1d);
    }
    
    public AccessibilityNodeInfo findFocus(int param1Int) {
      c c = this.a.d(param1Int);
      return (c == null) ? null : c.G0();
    }
  }
  
  static class c extends b {
    c(d param1d) {
      super(param1d);
    }
    
    public void addExtraDataToAccessibilityNodeInfo(int param1Int, AccessibilityNodeInfo param1AccessibilityNodeInfo, String param1String, Bundle param1Bundle) {
      this.a.a(param1Int, c.H0(param1AccessibilityNodeInfo), param1String, param1Bundle);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/h/k/f0/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */