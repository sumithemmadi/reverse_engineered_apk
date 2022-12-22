package b.h.k.f0;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class c {
  private static int a;
  
  private final AccessibilityNodeInfo b;
  
  public int c = -1;
  
  private int d = -1;
  
  private c(AccessibilityNodeInfo paramAccessibilityNodeInfo) {
    this.b = paramAccessibilityNodeInfo;
  }
  
  private int A(ClickableSpan paramClickableSpan, SparseArray<WeakReference<ClickableSpan>> paramSparseArray) {
    if (paramSparseArray != null)
      for (byte b = 0; b < paramSparseArray.size(); b++) {
        if (paramClickableSpan.equals(((WeakReference<ClickableSpan>)paramSparseArray.valueAt(b)).get()))
          return paramSparseArray.keyAt(b); 
      }  
    int i = a;
    a = i + 1;
    return i;
  }
  
  public static c H0(AccessibilityNodeInfo paramAccessibilityNodeInfo) {
    return new c(paramAccessibilityNodeInfo);
  }
  
  public static c O() {
    return H0(AccessibilityNodeInfo.obtain());
  }
  
  public static c P(View paramView) {
    return H0(AccessibilityNodeInfo.obtain(paramView));
  }
  
  public static c Q(c paramc) {
    return H0(AccessibilityNodeInfo.obtain(paramc.b));
  }
  
  private void U(View paramView) {
    SparseArray<WeakReference<ClickableSpan>> sparseArray = w(paramView);
    if (sparseArray != null) {
      byte b3;
      ArrayList<Integer> arrayList = new ArrayList();
      byte b1 = 0;
      byte b2 = 0;
      while (true) {
        b3 = b1;
        if (b2 < sparseArray.size()) {
          if (((WeakReference)sparseArray.valueAt(b2)).get() == null)
            arrayList.add(Integer.valueOf(b2)); 
          b2++;
          continue;
        } 
        break;
      } 
      while (b3 < arrayList.size()) {
        sparseArray.remove(((Integer)arrayList.get(b3)).intValue());
        b3++;
      } 
    } 
  }
  
  private void W(int paramInt, boolean paramBoolean) {
    Bundle bundle = s();
    if (bundle != null) {
      boolean bool;
      int i = bundle.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0);
      if (paramBoolean) {
        bool = paramInt;
      } else {
        bool = false;
      } 
      bundle.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", bool | i & (paramInt ^ 0xFFFFFFFF));
    } 
  }
  
  private void e(ClickableSpan paramClickableSpan, Spanned paramSpanned, int paramInt) {
    h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(paramSpanned.getSpanStart(paramClickableSpan)));
    h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(paramSpanned.getSpanEnd(paramClickableSpan)));
    h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(paramSpanned.getSpanFlags(paramClickableSpan)));
    h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(paramInt));
  }
  
  private void g() {
    if (Build.VERSION.SDK_INT >= 19) {
      this.b.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
      this.b.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
      this.b.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
      this.b.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    } 
  }
  
  private List<Integer> h(String paramString) {
    if (Build.VERSION.SDK_INT < 19)
      return new ArrayList<Integer>(); 
    ArrayList<Integer> arrayList1 = this.b.getExtras().getIntegerArrayList(paramString);
    ArrayList<Integer> arrayList2 = arrayList1;
    if (arrayList1 == null) {
      arrayList2 = new ArrayList();
      this.b.getExtras().putIntegerArrayList(paramString, arrayList2);
    } 
    return arrayList2;
  }
  
  private static String j(int paramInt) {
    if (paramInt != 1) {
      if (paramInt != 2) {
        switch (paramInt) {
          default:
            switch (paramInt) {
              default:
                switch (paramInt) {
                  default:
                    return "ACTION_UNKNOWN";
                  case 16908362:
                    return "ACTION_PRESS_AND_HOLD";
                  case 16908361:
                    return "ACTION_PAGE_RIGHT";
                  case 16908360:
                    return "ACTION_PAGE_LEFT";
                  case 16908359:
                    return "ACTION_PAGE_DOWN";
                  case 16908358:
                    return "ACTION_PAGE_UP";
                  case 16908357:
                    return "ACTION_HIDE_TOOLTIP";
                  case 16908356:
                    break;
                } 
                return "ACTION_SHOW_TOOLTIP";
              case 16908349:
                return "ACTION_SET_PROGRESS";
              case 16908348:
                return "ACTION_CONTEXT_CLICK";
              case 16908347:
                return "ACTION_SCROLL_RIGHT";
              case 16908346:
                return "ACTION_SCROLL_DOWN";
              case 16908345:
                return "ACTION_SCROLL_LEFT";
              case 16908344:
                return "ACTION_SCROLL_UP";
              case 16908343:
                return "ACTION_SCROLL_TO_POSITION";
              case 16908342:
                break;
            } 
            return "ACTION_SHOW_ON_SCREEN";
          case 16908372:
            return "ACTION_IME_ENTER";
          case 16908354:
            return "ACTION_MOVE_WINDOW";
          case 2097152:
            return "ACTION_SET_TEXT";
          case 524288:
            return "ACTION_COLLAPSE";
          case 262144:
            return "ACTION_EXPAND";
          case 131072:
            return "ACTION_SET_SELECTION";
          case 65536:
            return "ACTION_CUT";
          case 32768:
            return "ACTION_PASTE";
          case 16384:
            return "ACTION_COPY";
          case 8192:
            return "ACTION_SCROLL_BACKWARD";
          case 4096:
            return "ACTION_SCROLL_FORWARD";
          case 2048:
            return "ACTION_PREVIOUS_HTML_ELEMENT";
          case 1024:
            return "ACTION_NEXT_HTML_ELEMENT";
          case 512:
            return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
          case 256:
            return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
          case 128:
            return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
          case 64:
            return "ACTION_ACCESSIBILITY_FOCUS";
          case 32:
            return "ACTION_LONG_CLICK";
          case 16:
            return "ACTION_CLICK";
          case 8:
            return "ACTION_CLEAR_SELECTION";
          case 4:
            break;
        } 
        return "ACTION_SELECT";
      } 
      return "ACTION_CLEAR_FOCUS";
    } 
    return "ACTION_FOCUS";
  }
  
  private boolean l(int paramInt) {
    Bundle bundle = s();
    boolean bool = false;
    if (bundle == null)
      return false; 
    if ((bundle.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & paramInt) == paramInt)
      bool = true; 
    return bool;
  }
  
  public static ClickableSpan[] q(CharSequence paramCharSequence) {
    return (paramCharSequence instanceof Spanned) ? (ClickableSpan[])((Spanned)paramCharSequence).getSpans(0, paramCharSequence.length(), ClickableSpan.class) : null;
  }
  
  private SparseArray<WeakReference<ClickableSpan>> u(View paramView) {
    SparseArray<WeakReference<ClickableSpan>> sparseArray1 = w(paramView);
    SparseArray<WeakReference<ClickableSpan>> sparseArray2 = sparseArray1;
    if (sparseArray1 == null) {
      sparseArray2 = new SparseArray();
      paramView.setTag(b.h.c.tag_accessibility_clickable_spans, sparseArray2);
    } 
    return sparseArray2;
  }
  
  private SparseArray<WeakReference<ClickableSpan>> w(View paramView) {
    return (SparseArray<WeakReference<ClickableSpan>>)paramView.getTag(b.h.c.tag_accessibility_clickable_spans);
  }
  
  private boolean z() {
    return h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty() ^ true;
  }
  
  public void A0(View paramView) {
    this.d = -1;
    this.b.setSource(paramView);
  }
  
  public boolean B() {
    return (Build.VERSION.SDK_INT >= 16) ? this.b.isAccessibilityFocused() : false;
  }
  
  public void B0(View paramView, int paramInt) {
    this.d = paramInt;
    if (Build.VERSION.SDK_INT >= 16)
      this.b.setSource(paramView, paramInt); 
  }
  
  public boolean C() {
    return this.b.isCheckable();
  }
  
  public void C0(CharSequence paramCharSequence) {
    if (androidx.core.os.a.a()) {
      this.b.setStateDescription(paramCharSequence);
    } else if (Build.VERSION.SDK_INT >= 19) {
      this.b.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", paramCharSequence);
    } 
  }
  
  public boolean D() {
    return this.b.isChecked();
  }
  
  public void D0(CharSequence paramCharSequence) {
    this.b.setText(paramCharSequence);
  }
  
  public boolean E() {
    return this.b.isClickable();
  }
  
  public void E0(View paramView) {
    if (Build.VERSION.SDK_INT >= 22)
      this.b.setTraversalAfter(paramView); 
  }
  
  public boolean F() {
    return this.b.isEnabled();
  }
  
  public void F0(boolean paramBoolean) {
    if (Build.VERSION.SDK_INT >= 16)
      this.b.setVisibleToUser(paramBoolean); 
  }
  
  public boolean G() {
    return this.b.isFocusable();
  }
  
  public AccessibilityNodeInfo G0() {
    return this.b;
  }
  
  public boolean H() {
    return this.b.isFocused();
  }
  
  public boolean I() {
    return this.b.isLongClickable();
  }
  
  public boolean J() {
    return this.b.isPassword();
  }
  
  public boolean K() {
    return this.b.isScrollable();
  }
  
  public boolean L() {
    return this.b.isSelected();
  }
  
  public boolean M() {
    return (Build.VERSION.SDK_INT >= 26) ? this.b.isShowingHintText() : l(4);
  }
  
  public boolean N() {
    return (Build.VERSION.SDK_INT >= 16) ? this.b.isVisibleToUser() : false;
  }
  
  public boolean R(int paramInt, Bundle paramBundle) {
    return (Build.VERSION.SDK_INT >= 16) ? this.b.performAction(paramInt, paramBundle) : false;
  }
  
  public void S() {
    this.b.recycle();
  }
  
  public boolean T(a parama) {
    return (Build.VERSION.SDK_INT >= 21) ? this.b.removeAction((AccessibilityNodeInfo.AccessibilityAction)parama.N) : false;
  }
  
  public void V(boolean paramBoolean) {
    if (Build.VERSION.SDK_INT >= 16)
      this.b.setAccessibilityFocused(paramBoolean); 
  }
  
  @Deprecated
  public void X(Rect paramRect) {
    this.b.setBoundsInParent(paramRect);
  }
  
  public void Y(Rect paramRect) {
    this.b.setBoundsInScreen(paramRect);
  }
  
  public void Z(boolean paramBoolean) {
    if (Build.VERSION.SDK_INT >= 19)
      this.b.setCanOpenPopup(paramBoolean); 
  }
  
  public void a(int paramInt) {
    this.b.addAction(paramInt);
  }
  
  public void a0(boolean paramBoolean) {
    this.b.setCheckable(paramBoolean);
  }
  
  public void b(a parama) {
    if (Build.VERSION.SDK_INT >= 21)
      this.b.addAction((AccessibilityNodeInfo.AccessibilityAction)parama.N); 
  }
  
  public void b0(boolean paramBoolean) {
    this.b.setChecked(paramBoolean);
  }
  
  public void c(View paramView) {
    this.b.addChild(paramView);
  }
  
  public void c0(CharSequence paramCharSequence) {
    this.b.setClassName(paramCharSequence);
  }
  
  public void d(View paramView, int paramInt) {
    if (Build.VERSION.SDK_INT >= 16)
      this.b.addChild(paramView, paramInt); 
  }
  
  public void d0(boolean paramBoolean) {
    this.b.setClickable(paramBoolean);
  }
  
  public void e0(Object paramObject) {
    if (Build.VERSION.SDK_INT >= 19) {
      AccessibilityNodeInfo accessibilityNodeInfo = this.b;
      if (paramObject == null) {
        paramObject = null;
      } else {
        paramObject = ((b)paramObject).a;
      } 
      accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo)paramObject);
    } 
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null)
      return false; 
    if (!(paramObject instanceof c))
      return false; 
    paramObject = paramObject;
    AccessibilityNodeInfo accessibilityNodeInfo = this.b;
    if (accessibilityNodeInfo == null) {
      if (((c)paramObject).b != null)
        return false; 
    } else if (!accessibilityNodeInfo.equals(((c)paramObject).b)) {
      return false;
    } 
    return (this.d != ((c)paramObject).d) ? false : (!(this.c != ((c)paramObject).c));
  }
  
  public void f(CharSequence paramCharSequence, View paramView) {
    int i = Build.VERSION.SDK_INT;
    if (i >= 19 && i < 26) {
      g();
      U(paramView);
      ClickableSpan[] arrayOfClickableSpan = q(paramCharSequence);
      if (arrayOfClickableSpan != null && arrayOfClickableSpan.length > 0) {
        s().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", b.h.c.accessibility_action_clickable_span);
        SparseArray<WeakReference<ClickableSpan>> sparseArray = u(paramView);
        for (i = 0; i < arrayOfClickableSpan.length; i++) {
          int j = A(arrayOfClickableSpan[i], sparseArray);
          sparseArray.put(j, new WeakReference<ClickableSpan>(arrayOfClickableSpan[i]));
          e(arrayOfClickableSpan[i], (Spanned)paramCharSequence, j);
        } 
      } 
    } 
  }
  
  public void f0(Object paramObject) {
    if (Build.VERSION.SDK_INT >= 19) {
      AccessibilityNodeInfo accessibilityNodeInfo = this.b;
      if (paramObject == null) {
        paramObject = null;
      } else {
        paramObject = ((c)paramObject).a;
      } 
      accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo)paramObject);
    } 
  }
  
  public void g0(CharSequence paramCharSequence) {
    this.b.setContentDescription(paramCharSequence);
  }
  
  public void h0(boolean paramBoolean) {
    this.b.setEnabled(paramBoolean);
  }
  
  public int hashCode() {
    int i;
    AccessibilityNodeInfo accessibilityNodeInfo = this.b;
    if (accessibilityNodeInfo == null) {
      i = 0;
    } else {
      i = accessibilityNodeInfo.hashCode();
    } 
    return i;
  }
  
  public List<a> i() {
    List list;
    if (Build.VERSION.SDK_INT >= 21) {
      list = this.b.getActionList();
    } else {
      list = null;
    } 
    if (list != null) {
      ArrayList<a> arrayList = new ArrayList();
      int i = list.size();
      for (byte b = 0; b < i; b++)
        arrayList.add(new a(list.get(b))); 
      return arrayList;
    } 
    return Collections.emptyList();
  }
  
  public void i0(CharSequence paramCharSequence) {
    if (Build.VERSION.SDK_INT >= 21)
      this.b.setError(paramCharSequence); 
  }
  
  public void j0(boolean paramBoolean) {
    this.b.setFocusable(paramBoolean);
  }
  
  public int k() {
    return this.b.getActions();
  }
  
  public void k0(boolean paramBoolean) {
    this.b.setFocused(paramBoolean);
  }
  
  public void l0(boolean paramBoolean) {
    if (Build.VERSION.SDK_INT >= 28) {
      this.b.setHeading(paramBoolean);
    } else {
      W(2, paramBoolean);
    } 
  }
  
  @Deprecated
  public void m(Rect paramRect) {
    this.b.getBoundsInParent(paramRect);
  }
  
  public void m0(CharSequence paramCharSequence) {
    int i = Build.VERSION.SDK_INT;
    if (i >= 26) {
      this.b.setHintText(paramCharSequence);
    } else if (i >= 19) {
      this.b.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", paramCharSequence);
    } 
  }
  
  public void n(Rect paramRect) {
    this.b.getBoundsInScreen(paramRect);
  }
  
  public void n0(boolean paramBoolean) {
    this.b.setLongClickable(paramBoolean);
  }
  
  public int o() {
    return this.b.getChildCount();
  }
  
  public void o0(int paramInt) {
    if (Build.VERSION.SDK_INT >= 21)
      this.b.setMaxTextLength(paramInt); 
  }
  
  public CharSequence p() {
    return this.b.getClassName();
  }
  
  public void p0(int paramInt) {
    if (Build.VERSION.SDK_INT >= 16)
      this.b.setMovementGranularities(paramInt); 
  }
  
  public void q0(CharSequence paramCharSequence) {
    this.b.setPackageName(paramCharSequence);
  }
  
  public CharSequence r() {
    return this.b.getContentDescription();
  }
  
  public void r0(CharSequence paramCharSequence) {
    int i = Build.VERSION.SDK_INT;
    if (i >= 28) {
      this.b.setPaneTitle(paramCharSequence);
    } else if (i >= 19) {
      this.b.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", paramCharSequence);
    } 
  }
  
  public Bundle s() {
    return (Build.VERSION.SDK_INT >= 19) ? this.b.getExtras() : new Bundle();
  }
  
  public void s0(View paramView) {
    this.c = -1;
    this.b.setParent(paramView);
  }
  
  public int t() {
    return (Build.VERSION.SDK_INT >= 16) ? this.b.getMovementGranularities() : 0;
  }
  
  public void t0(View paramView, int paramInt) {
    this.c = paramInt;
    if (Build.VERSION.SDK_INT >= 16)
      this.b.setParent(paramView, paramInt); 
  }
  
  public String toString() {
    StringBuilder stringBuilder1 = new StringBuilder();
    stringBuilder1.append(super.toString());
    Rect rect = new Rect();
    m(rect);
    StringBuilder stringBuilder3 = new StringBuilder();
    stringBuilder3.append("; boundsInParent: ");
    stringBuilder3.append(rect);
    stringBuilder1.append(stringBuilder3.toString());
    n(rect);
    stringBuilder3 = new StringBuilder();
    stringBuilder3.append("; boundsInScreen: ");
    stringBuilder3.append(rect);
    stringBuilder1.append(stringBuilder3.toString());
    stringBuilder1.append("; packageName: ");
    stringBuilder1.append(v());
    stringBuilder1.append("; className: ");
    stringBuilder1.append(p());
    stringBuilder1.append("; text: ");
    stringBuilder1.append(x());
    stringBuilder1.append("; contentDescription: ");
    stringBuilder1.append(r());
    stringBuilder1.append("; viewId: ");
    stringBuilder1.append(y());
    stringBuilder1.append("; checkable: ");
    stringBuilder1.append(C());
    stringBuilder1.append("; checked: ");
    stringBuilder1.append(D());
    stringBuilder1.append("; focusable: ");
    stringBuilder1.append(G());
    stringBuilder1.append("; focused: ");
    stringBuilder1.append(H());
    stringBuilder1.append("; selected: ");
    stringBuilder1.append(L());
    stringBuilder1.append("; clickable: ");
    stringBuilder1.append(E());
    stringBuilder1.append("; longClickable: ");
    stringBuilder1.append(I());
    stringBuilder1.append("; enabled: ");
    stringBuilder1.append(F());
    stringBuilder1.append("; password: ");
    stringBuilder1.append(J());
    StringBuilder stringBuilder2 = new StringBuilder();
    stringBuilder2.append("; scrollable: ");
    stringBuilder2.append(K());
    stringBuilder1.append(stringBuilder2.toString());
    stringBuilder1.append("; [");
    if (Build.VERSION.SDK_INT >= 21) {
      List<a> list = i();
      for (byte b = 0; b < list.size(); b++) {
        a a = list.get(b);
        String str2 = j(a.b());
        String str1 = str2;
        if (str2.equals("ACTION_UNKNOWN")) {
          str1 = str2;
          if (a.c() != null)
            str1 = a.c().toString(); 
        } 
        stringBuilder1.append(str1);
        if (b != list.size() - 1)
          stringBuilder1.append(", "); 
      } 
    } else {
      int i = k();
      while (i != 0) {
        int j = 1 << Integer.numberOfTrailingZeros(i);
        int k = i & (j ^ 0xFFFFFFFF);
        stringBuilder1.append(j(j));
        i = k;
        if (k != 0) {
          stringBuilder1.append(", ");
          i = k;
        } 
      } 
    } 
    stringBuilder1.append("]");
    return stringBuilder1.toString();
  }
  
  public void u0(d paramd) {
    if (Build.VERSION.SDK_INT >= 19)
      this.b.setRangeInfo((AccessibilityNodeInfo.RangeInfo)paramd.a); 
  }
  
  public CharSequence v() {
    return this.b.getPackageName();
  }
  
  public void v0(CharSequence paramCharSequence) {
    if (Build.VERSION.SDK_INT >= 19)
      this.b.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", paramCharSequence); 
  }
  
  public void w0(boolean paramBoolean) {
    if (Build.VERSION.SDK_INT >= 28) {
      this.b.setScreenReaderFocusable(paramBoolean);
    } else {
      W(1, paramBoolean);
    } 
  }
  
  public CharSequence x() {
    if (z()) {
      List<Integer> list1 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
      List<Integer> list2 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
      List<Integer> list3 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
      List<Integer> list4 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
      CharSequence charSequence = this.b.getText();
      int i = this.b.getText().length();
      byte b = 0;
      SpannableString spannableString = new SpannableString(TextUtils.substring(charSequence, 0, i));
      while (b < list1.size()) {
        spannableString.setSpan(new a(((Integer)list4.get(b)).intValue(), this, s().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer)list1.get(b)).intValue(), ((Integer)list2.get(b)).intValue(), ((Integer)list3.get(b)).intValue());
        b++;
      } 
      return (CharSequence)spannableString;
    } 
    return this.b.getText();
  }
  
  public void x0(boolean paramBoolean) {
    this.b.setScrollable(paramBoolean);
  }
  
  public String y() {
    return (Build.VERSION.SDK_INT >= 18) ? this.b.getViewIdResourceName() : null;
  }
  
  public void y0(boolean paramBoolean) {
    this.b.setSelected(paramBoolean);
  }
  
  public void z0(boolean paramBoolean) {
    if (Build.VERSION.SDK_INT >= 26) {
      this.b.setShowingHintText(paramBoolean);
    } else {
      W(4, paramBoolean);
    } 
  }
  
  public static class a {
    public static final a A;
    
    public static final a B;
    
    public static final a C;
    
    public static final a D;
    
    public static final a E;
    
    public static final a F;
    
    public static final a G;
    
    public static final a H;
    
    public static final a I;
    
    public static final a J;
    
    public static final a K;
    
    public static final a L;
    
    public static final a M;
    
    public static final a a = new a(1, null);
    
    public static final a b = new a(2, null);
    
    public static final a c = new a(4, null);
    
    public static final a d = new a(8, null);
    
    public static final a e = new a(16, null);
    
    public static final a f = new a(32, null);
    
    public static final a g = new a(64, null);
    
    public static final a h = new a(128, null);
    
    public static final a i = new a(256, null, (Class)f.b.class);
    
    public static final a j = new a(512, null, (Class)f.b.class);
    
    public static final a k = new a(1024, null, (Class)f.c.class);
    
    public static final a l = new a(2048, null, (Class)f.c.class);
    
    public static final a m = new a(4096, null);
    
    public static final a n = new a(8192, null);
    
    public static final a o = new a(16384, null);
    
    public static final a p = new a(32768, null);
    
    public static final a q = new a(65536, null);
    
    public static final a r = new a(131072, null, (Class)f.g.class);
    
    public static final a s = new a(262144, null);
    
    public static final a t = new a(524288, null);
    
    public static final a u = new a(1048576, null);
    
    public static final a v = new a(2097152, null, (Class)f.h.class);
    
    public static final a w;
    
    public static final a x;
    
    public static final a y;
    
    public static final a z;
    
    final Object N;
    
    private final int O;
    
    private final Class<? extends f.a> P;
    
    protected final f Q;
    
    static {
      int i = Build.VERSION.SDK_INT;
      if (i >= 23) {
        accessibilityAction2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN;
      } else {
        accessibilityAction2 = null;
      } 
      w = new a(accessibilityAction2, 16908342, null, null, null);
      if (i >= 23) {
        accessibilityAction2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION;
      } else {
        accessibilityAction2 = null;
      } 
      x = new a(accessibilityAction2, 16908343, null, null, (Class)f.e.class);
      if (i >= 23) {
        accessibilityAction2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP;
      } else {
        accessibilityAction2 = null;
      } 
      y = new a(accessibilityAction2, 16908344, null, null, null);
      if (i >= 23) {
        accessibilityAction2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT;
      } else {
        accessibilityAction2 = null;
      } 
      z = new a(accessibilityAction2, 16908345, null, null, null);
      if (i >= 23) {
        accessibilityAction2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN;
      } else {
        accessibilityAction2 = null;
      } 
      A = new a(accessibilityAction2, 16908346, null, null, null);
      if (i >= 23) {
        accessibilityAction2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT;
      } else {
        accessibilityAction2 = null;
      } 
      B = new a(accessibilityAction2, 16908347, null, null, null);
      if (i >= 29) {
        accessibilityAction2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
      } else {
        accessibilityAction2 = null;
      } 
      C = new a(accessibilityAction2, 16908358, null, null, null);
      if (i >= 29) {
        accessibilityAction2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
      } else {
        accessibilityAction2 = null;
      } 
      D = new a(accessibilityAction2, 16908359, null, null, null);
      if (i >= 29) {
        accessibilityAction2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
      } else {
        accessibilityAction2 = null;
      } 
      E = new a(accessibilityAction2, 16908360, null, null, null);
      if (i >= 29) {
        accessibilityAction2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
      } else {
        accessibilityAction2 = null;
      } 
      F = new a(accessibilityAction2, 16908361, null, null, null);
      if (i >= 23) {
        accessibilityAction2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK;
      } else {
        accessibilityAction2 = null;
      } 
      G = new a(accessibilityAction2, 16908348, null, null, null);
      if (i >= 24) {
        accessibilityAction2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
      } else {
        accessibilityAction2 = null;
      } 
      H = new a(accessibilityAction2, 16908349, null, null, (Class)f.f.class);
      if (i >= 26) {
        accessibilityAction2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
      } else {
        accessibilityAction2 = null;
      } 
      I = new a(accessibilityAction2, 16908354, null, null, (Class)f.d.class);
      if (i >= 28) {
        accessibilityAction2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
      } else {
        accessibilityAction2 = null;
      } 
      J = new a(accessibilityAction2, 16908356, null, null, null);
      if (i >= 28) {
        accessibilityAction2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
      } else {
        accessibilityAction2 = null;
      } 
      K = new a(accessibilityAction2, 16908357, null, null, null);
      if (i >= 30) {
        accessibilityAction2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
      } else {
        accessibilityAction2 = null;
      } 
      L = new a(accessibilityAction2, 16908362, null, null, null);
      AccessibilityNodeInfo.AccessibilityAction accessibilityAction2 = accessibilityAction1;
      if (i >= 30)
        accessibilityAction2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER; 
      M = new a(accessibilityAction2, 16908372, null, null, null);
    }
    
    public a(int param1Int, CharSequence param1CharSequence) {
      this(null, param1Int, param1CharSequence, null, null);
    }
    
    public a(int param1Int, CharSequence param1CharSequence, f param1f) {
      this(null, param1Int, param1CharSequence, param1f, null);
    }
    
    private a(int param1Int, CharSequence param1CharSequence, Class<? extends f.a> param1Class) {
      this(null, param1Int, param1CharSequence, null, param1Class);
    }
    
    a(Object param1Object) {
      this(param1Object, 0, null, null, null);
    }
    
    a(Object param1Object, int param1Int, CharSequence param1CharSequence, f param1f, Class<? extends f.a> param1Class) {
      this.O = param1Int;
      this.Q = param1f;
      if (Build.VERSION.SDK_INT >= 21 && param1Object == null) {
        this.N = new AccessibilityNodeInfo.AccessibilityAction(param1Int, param1CharSequence);
      } else {
        this.N = param1Object;
      } 
      this.P = param1Class;
    }
    
    public a a(CharSequence param1CharSequence, f param1f) {
      return new a(null, this.O, param1CharSequence, param1f, this.P);
    }
    
    public int b() {
      return (Build.VERSION.SDK_INT >= 21) ? ((AccessibilityNodeInfo.AccessibilityAction)this.N).getId() : 0;
    }
    
    public CharSequence c() {
      return (Build.VERSION.SDK_INT >= 21) ? ((AccessibilityNodeInfo.AccessibilityAction)this.N).getLabel() : null;
    }
    
    public boolean d(View param1View, Bundle param1Bundle) {
      if (this.Q != null) {
        f.a a1 = null;
        Object object = null;
        Class<? extends f.a> clazz = this.P;
        if (clazz != null) {
          Exception exception1;
          String str;
          try {
            a1 = clazz.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            try {
              a1.a(param1Bundle);
            } catch (Exception exception2) {
              f.a a2 = a1;
              exception = exception2;
            } 
          } catch (Exception exception) {
            exception1 = exception2;
          } 
          Class<? extends f.a> clazz1 = this.P;
          if (clazz1 == null) {
            str = "null";
          } else {
            str = str.getName();
          } 
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Failed to execute command with argument class ViewCommandArgument: ");
          stringBuilder.append(str);
          Log.e("A11yActionCompat", stringBuilder.toString(), exception);
          exception = exception1;
        } 
        return this.Q.a(param1View, (f.a)exception);
      } 
      return false;
    }
    
    public boolean equals(Object param1Object) {
      if (param1Object == null)
        return false; 
      if (!(param1Object instanceof a))
        return false; 
      param1Object = param1Object;
      Object object = this.N;
      if (object == null) {
        if (((a)param1Object).N != null)
          return false; 
      } else if (!object.equals(((a)param1Object).N)) {
        return false;
      } 
      return true;
    }
    
    public int hashCode() {
      boolean bool;
      Object object = this.N;
      if (object != null) {
        bool = object.hashCode();
      } else {
        bool = false;
      } 
      return bool;
    }
    
    static {
      AccessibilityNodeInfo.AccessibilityAction accessibilityAction1 = null;
    }
  }
  
  public static class b {
    final Object a;
    
    b(Object param1Object) {
      this.a = param1Object;
    }
    
    public static b a(int param1Int1, int param1Int2, boolean param1Boolean) {
      return (Build.VERSION.SDK_INT >= 19) ? new b(AccessibilityNodeInfo.CollectionInfo.obtain(param1Int1, param1Int2, param1Boolean)) : new b(null);
    }
    
    public static b b(int param1Int1, int param1Int2, boolean param1Boolean, int param1Int3) {
      int i = Build.VERSION.SDK_INT;
      return (i >= 21) ? new b(AccessibilityNodeInfo.CollectionInfo.obtain(param1Int1, param1Int2, param1Boolean, param1Int3)) : ((i >= 19) ? new b(AccessibilityNodeInfo.CollectionInfo.obtain(param1Int1, param1Int2, param1Boolean)) : new b(null));
    }
  }
  
  public static class c {
    final Object a;
    
    c(Object param1Object) {
      this.a = param1Object;
    }
    
    public static c a(int param1Int1, int param1Int2, int param1Int3, int param1Int4, boolean param1Boolean1, boolean param1Boolean2) {
      int i = Build.VERSION.SDK_INT;
      return (i >= 21) ? new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(param1Int1, param1Int2, param1Int3, param1Int4, param1Boolean1, param1Boolean2)) : ((i >= 19) ? new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(param1Int1, param1Int2, param1Int3, param1Int4, param1Boolean1)) : new c(null));
    }
  }
  
  public static class d {
    final Object a;
    
    d(Object param1Object) {
      this.a = param1Object;
    }
    
    public static d a(int param1Int, float param1Float1, float param1Float2, float param1Float3) {
      return (Build.VERSION.SDK_INT >= 19) ? new d(AccessibilityNodeInfo.RangeInfo.obtain(param1Int, param1Float1, param1Float2, param1Float3)) : new d(null);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/h/k/f0/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */