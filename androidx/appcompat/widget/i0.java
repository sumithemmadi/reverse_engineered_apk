package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import b.a.d;
import b.a.f;
import b.a.g;
import b.a.i;

class i0 {
  private final Context a;
  
  private final View b;
  
  private final TextView c;
  
  private final WindowManager.LayoutParams d;
  
  private final Rect e;
  
  private final int[] f;
  
  private final int[] g;
  
  i0(Context paramContext) {
    WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
    this.d = layoutParams;
    this.e = new Rect();
    this.f = new int[2];
    this.g = new int[2];
    this.a = paramContext;
    View view = LayoutInflater.from(paramContext).inflate(g.abc_tooltip, null);
    this.b = view;
    this.c = (TextView)view.findViewById(f.message);
    layoutParams.setTitle(i0.class.getSimpleName());
    layoutParams.packageName = paramContext.getPackageName();
    layoutParams.type = 1002;
    layoutParams.width = -2;
    layoutParams.height = -2;
    layoutParams.format = -3;
    layoutParams.windowAnimations = i.Animation_AppCompat_Tooltip;
    layoutParams.flags = 24;
  }
  
  private void a(View paramView, int paramInt1, int paramInt2, boolean paramBoolean, WindowManager.LayoutParams paramLayoutParams) {
    paramLayoutParams.token = paramView.getApplicationWindowToken();
    int i = this.a.getResources().getDimensionPixelOffset(d.tooltip_precise_anchor_threshold);
    if (paramView.getWidth() < i)
      paramInt1 = paramView.getWidth() / 2; 
    if (paramView.getHeight() >= i) {
      j = this.a.getResources().getDimensionPixelOffset(d.tooltip_precise_anchor_extra_offset);
      i = paramInt2 + j;
      j = paramInt2 - j;
      paramInt2 = i;
      i = j;
    } else {
      paramInt2 = paramView.getHeight();
      i = 0;
    } 
    paramLayoutParams.gravity = 49;
    Resources resources = this.a.getResources();
    if (paramBoolean) {
      j = d.tooltip_y_offset_touch;
    } else {
      j = d.tooltip_y_offset_non_touch;
    } 
    int k = resources.getDimensionPixelOffset(j);
    View view = b(paramView);
    if (view == null) {
      Log.e("TooltipPopup", "Cannot find app view");
      return;
    } 
    view.getWindowVisibleDisplayFrame(this.e);
    Rect rect = this.e;
    if (rect.left < 0 && rect.top < 0) {
      Resources resources1 = this.a.getResources();
      j = resources1.getIdentifier("status_bar_height", "dimen", "android");
      if (j != 0) {
        j = resources1.getDimensionPixelSize(j);
      } else {
        j = 0;
      } 
      DisplayMetrics displayMetrics = resources1.getDisplayMetrics();
      this.e.set(0, j, displayMetrics.widthPixels, displayMetrics.heightPixels);
    } 
    view.getLocationOnScreen(this.g);
    paramView.getLocationOnScreen(this.f);
    int[] arrayOfInt1 = this.f;
    int j = arrayOfInt1[0];
    int[] arrayOfInt2 = this.g;
    arrayOfInt1[0] = j - arrayOfInt2[0];
    arrayOfInt1[1] = arrayOfInt1[1] - arrayOfInt2[1];
    paramLayoutParams.x = arrayOfInt1[0] + paramInt1 - view.getWidth() / 2;
    paramInt1 = View.MeasureSpec.makeMeasureSpec(0, 0);
    this.b.measure(paramInt1, paramInt1);
    paramInt1 = this.b.getMeasuredHeight();
    arrayOfInt1 = this.f;
    i = arrayOfInt1[1] + i - k - paramInt1;
    paramInt2 = arrayOfInt1[1] + paramInt2 + k;
    if (paramBoolean) {
      if (i >= 0) {
        paramLayoutParams.y = i;
      } else {
        paramLayoutParams.y = paramInt2;
      } 
    } else if (paramInt1 + paramInt2 <= this.e.height()) {
      paramLayoutParams.y = paramInt2;
    } else {
      paramLayoutParams.y = i;
    } 
  }
  
  private static View b(View paramView) {
    View view = paramView.getRootView();
    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
    if (layoutParams instanceof WindowManager.LayoutParams && ((WindowManager.LayoutParams)layoutParams).type == 2)
      return view; 
    for (Context context = paramView.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper)context).getBaseContext()) {
      if (context instanceof Activity)
        return ((Activity)context).getWindow().getDecorView(); 
    } 
    return view;
  }
  
  void c() {
    if (!d())
      return; 
    ((WindowManager)this.a.getSystemService("window")).removeView(this.b);
  }
  
  boolean d() {
    boolean bool;
    if (this.b.getParent() != null) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  void e(View paramView, int paramInt1, int paramInt2, boolean paramBoolean, CharSequence paramCharSequence) {
    if (d())
      c(); 
    this.c.setText(paramCharSequence);
    a(paramView, paramInt1, paramInt2, paramBoolean, this.d);
    ((WindowManager)this.a.getSystemService("window")).addView(this.b, (ViewGroup.LayoutParams)this.d);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/widget/i0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */