package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.d;
import androidx.constraintlayout.solver.widgets.g;
import androidx.constraintlayout.solver.widgets.h;
import java.util.Arrays;
import java.util.HashMap;

public abstract class ConstraintHelper extends View {
  protected int[] b = new int[32];
  
  protected int c;
  
  protected Context d;
  
  protected g e;
  
  protected boolean f = false;
  
  protected String g;
  
  protected String h;
  
  private View[] i = null;
  
  private HashMap<Integer, String> j = new HashMap<Integer, String>();
  
  public ConstraintHelper(Context paramContext) {
    super(paramContext);
    this.d = paramContext;
    n(null);
  }
  
  public ConstraintHelper(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    this.d = paramContext;
    n(paramAttributeSet);
  }
  
  public ConstraintHelper(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    this.d = paramContext;
    n(paramAttributeSet);
  }
  
  private void e(String paramString) {
    if (paramString != null && paramString.length() != 0) {
      if (this.d == null)
        return; 
      paramString = paramString.trim();
      if (getParent() instanceof ConstraintLayout)
        ConstraintLayout constraintLayout = (ConstraintLayout)getParent(); 
      int i = l(paramString);
      if (i != 0) {
        this.j.put(Integer.valueOf(i), paramString);
        f(i);
      } else {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Could not find id of \"");
        stringBuilder.append(paramString);
        stringBuilder.append("\"");
        Log.w("ConstraintHelper", stringBuilder.toString());
      } 
    } 
  }
  
  private void f(int paramInt) {
    if (paramInt == getId())
      return; 
    int i = this.c;
    int[] arrayOfInt = this.b;
    if (i + 1 > arrayOfInt.length)
      this.b = Arrays.copyOf(arrayOfInt, arrayOfInt.length * 2); 
    arrayOfInt = this.b;
    i = this.c;
    arrayOfInt[i] = paramInt;
    this.c = i + 1;
  }
  
  private void g(String paramString) {
    if (paramString != null && paramString.length() != 0) {
      ConstraintLayout constraintLayout;
      if (this.d == null)
        return; 
      String str = paramString.trim();
      paramString = null;
      if (getParent() instanceof ConstraintLayout)
        constraintLayout = (ConstraintLayout)getParent(); 
      if (constraintLayout == null) {
        Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
        return;
      } 
      int i = constraintLayout.getChildCount();
      for (byte b = 0; b < i; b++) {
        View view = constraintLayout.getChildAt(b);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams && str.equals(((ConstraintLayout.LayoutParams)layoutParams).V))
          if (view.getId() == -1) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("to use ConstraintTag view ");
            stringBuilder.append(view.getClass().getSimpleName());
            stringBuilder.append(" must have an ID");
            Log.w("ConstraintHelper", stringBuilder.toString());
          } else {
            f(view.getId());
          }  
      } 
    } 
  }
  
  private int[] j(View paramView, String paramString) {
    String[] arrayOfString = paramString.split(",");
    paramView.getContext();
    int[] arrayOfInt2 = new int[arrayOfString.length];
    byte b = 0;
    int i;
    for (i = 0; b < arrayOfString.length; i = k) {
      int j = l(arrayOfString[b].trim());
      int k = i;
      if (j != 0) {
        arrayOfInt2[i] = j;
        k = i + 1;
      } 
      b++;
    } 
    int[] arrayOfInt1 = arrayOfInt2;
    if (i != arrayOfString.length)
      arrayOfInt1 = Arrays.copyOf(arrayOfInt2, i); 
    return arrayOfInt1;
  }
  
  private int k(ConstraintLayout paramConstraintLayout, String paramString) {
    if (paramString != null && paramConstraintLayout != null) {
      Resources resources = this.d.getResources();
      if (resources == null)
        return 0; 
      int i = paramConstraintLayout.getChildCount();
      for (byte b = 0; b < i; b++) {
        View view = paramConstraintLayout.getChildAt(b);
        if (view.getId() != -1) {
          String str = null;
          try {
            String str1 = resources.getResourceEntryName(view.getId());
            str = str1;
          } catch (android.content.res.Resources.NotFoundException notFoundException) {}
          if (paramString.equals(str))
            return view.getId(); 
        } 
      } 
    } 
    return 0;
  }
  
  private int l(String paramString) {
    ConstraintLayout constraintLayout;
    if (getParent() instanceof ConstraintLayout) {
      constraintLayout = (ConstraintLayout)getParent();
    } else {
      constraintLayout = null;
    } 
    boolean bool = isInEditMode();
    int i = 0;
    int j = i;
    if (bool) {
      j = i;
      if (constraintLayout != null) {
        Object object = constraintLayout.g(0, paramString);
        j = i;
        if (object instanceof Integer)
          j = ((Integer)object).intValue(); 
      } 
    } 
    i = j;
    if (j == 0) {
      i = j;
      if (constraintLayout != null)
        i = k(constraintLayout, paramString); 
    } 
    j = i;
    if (i == 0)
      try {
        j = d.class.getField(paramString).getInt(null);
      } catch (Exception exception) {
        j = i;
      }  
    i = j;
    if (j == 0)
      i = this.d.getResources().getIdentifier(paramString, "id", this.d.getPackageName()); 
    return i;
  }
  
  public int[] getReferencedIds() {
    return Arrays.copyOf(this.b, this.c);
  }
  
  protected void h() {
    ViewParent viewParent = getParent();
    if (viewParent != null && viewParent instanceof ConstraintLayout)
      i((ConstraintLayout)viewParent); 
  }
  
  protected void i(ConstraintLayout paramConstraintLayout) {
    float f;
    int i = getVisibility();
    if (Build.VERSION.SDK_INT >= 21) {
      f = getElevation();
    } else {
      f = 0.0F;
    } 
    for (byte b = 0; b < this.c; b++) {
      View view = paramConstraintLayout.o(this.b[b]);
      if (view != null) {
        view.setVisibility(i);
        if (f > 0.0F && Build.VERSION.SDK_INT >= 21)
          view.setTranslationZ(view.getTranslationZ() + f); 
      } 
    } 
  }
  
  protected View[] m(ConstraintLayout paramConstraintLayout) {
    View[] arrayOfView = this.i;
    if (arrayOfView == null || arrayOfView.length != this.c)
      this.i = new View[this.c]; 
    for (byte b = 0; b < this.c; b++) {
      int i = this.b[b];
      this.i[b] = paramConstraintLayout.o(i);
    } 
    return this.i;
  }
  
  protected void n(AttributeSet paramAttributeSet) {
    if (paramAttributeSet != null) {
      TypedArray typedArray = getContext().obtainStyledAttributes(paramAttributeSet, e.ConstraintLayout_Layout);
      int i = typedArray.getIndexCount();
      for (byte b = 0; b < i; b++) {
        int j = typedArray.getIndex(b);
        if (j == e.ConstraintLayout_Layout_constraint_referenced_ids) {
          String str = typedArray.getString(j);
          this.g = str;
          setIds(str);
        } else if (j == e.ConstraintLayout_Layout_constraint_referenced_tags) {
          String str = typedArray.getString(j);
          this.h = str;
          setReferenceTags(str);
        } 
      } 
      typedArray.recycle();
    } 
  }
  
  public void o(b.a parama, h paramh, ConstraintLayout.LayoutParams paramLayoutParams, SparseArray<ConstraintWidget> paramSparseArray) {
    b.b b = parama.d;
    int[] arrayOfInt = b.f0;
    if (arrayOfInt != null) {
      setReferencedIds(arrayOfInt);
    } else {
      String str = b.g0;
      if (str != null && str.length() > 0) {
        b.b b1 = parama.d;
        b1.f0 = j(this, b1.g0);
      } 
    } 
    paramh.b();
    if (parama.d.f0 != null) {
      byte b1 = 0;
      while (true) {
        arrayOfInt = parama.d.f0;
        if (b1 < arrayOfInt.length) {
          ConstraintWidget constraintWidget = (ConstraintWidget)paramSparseArray.get(arrayOfInt[b1]);
          if (constraintWidget != null)
            paramh.a(constraintWidget); 
          b1++;
          continue;
        } 
        break;
      } 
    } 
  }
  
  protected void onAttachedToWindow() {
    super.onAttachedToWindow();
    String str = this.g;
    if (str != null)
      setIds(str); 
    str = this.h;
    if (str != null)
      setReferenceTags(str); 
  }
  
  public void onDraw(Canvas paramCanvas) {}
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    if (this.f) {
      super.onMeasure(paramInt1, paramInt2);
    } else {
      setMeasuredDimension(0, 0);
    } 
  }
  
  public void p(ConstraintWidget paramConstraintWidget, boolean paramBoolean) {}
  
  public void q(ConstraintLayout paramConstraintLayout) {}
  
  public void r(ConstraintLayout paramConstraintLayout) {}
  
  public void s(ConstraintLayout paramConstraintLayout) {}
  
  protected void setIds(String paramString) {
    this.g = paramString;
    if (paramString == null)
      return; 
    int i = 0;
    this.c = 0;
    while (true) {
      int j = paramString.indexOf(',', i);
      if (j == -1) {
        e(paramString.substring(i));
        return;
      } 
      e(paramString.substring(i, j));
      i = j + 1;
    } 
  }
  
  protected void setReferenceTags(String paramString) {
    this.h = paramString;
    if (paramString == null)
      return; 
    int i = 0;
    this.c = 0;
    while (true) {
      int j = paramString.indexOf(',', i);
      if (j == -1) {
        g(paramString.substring(i));
        return;
      } 
      g(paramString.substring(i, j));
      i = j + 1;
    } 
  }
  
  public void setReferencedIds(int[] paramArrayOfint) {
    this.g = null;
    byte b = 0;
    this.c = 0;
    while (b < paramArrayOfint.length) {
      f(paramArrayOfint[b]);
      b++;
    } 
  }
  
  public void setTag(int paramInt, Object paramObject) {
    super.setTag(paramInt, paramObject);
    if (paramObject == null && this.g == null)
      f(paramInt); 
  }
  
  public void t(d paramd, g paramg, SparseArray<ConstraintWidget> paramSparseArray) {
    paramg.b();
    for (byte b = 0; b < this.c; b++)
      paramg.a((ConstraintWidget)paramSparseArray.get(this.b[b])); 
  }
  
  public void u(ConstraintLayout paramConstraintLayout) {
    if (isInEditMode())
      setIds(this.g); 
    g g1 = this.e;
    if (g1 == null)
      return; 
    g1.b();
    for (byte b = 0; b < this.c; b++) {
      int i = this.b[b];
      View view2 = paramConstraintLayout.o(i);
      View view1 = view2;
      if (view2 == null) {
        String str = this.j.get(Integer.valueOf(i));
        i = k(paramConstraintLayout, str);
        view1 = view2;
        if (i != 0) {
          this.b[b] = i;
          this.j.put(Integer.valueOf(i), str);
          view1 = paramConstraintLayout.o(i);
        } 
      } 
      if (view1 != null)
        this.e.a(paramConstraintLayout.p(view1)); 
    } 
    this.e.c(paramConstraintLayout.d);
  }
  
  public void v() {
    if (this.e == null)
      return; 
    ViewGroup.LayoutParams layoutParams = getLayoutParams();
    if (layoutParams instanceof ConstraintLayout.LayoutParams)
      ((ConstraintLayout.LayoutParams)layoutParams).n0 = (ConstraintWidget)this.e; 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/constraintlayout/widget/ConstraintHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */