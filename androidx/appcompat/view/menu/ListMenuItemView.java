package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.widget.e0;
import b.a.a;
import b.a.f;
import b.a.g;
import b.a.j;
import b.h.k.w;

public class ListMenuItemView extends LinearLayout implements n.a, AbsListView.SelectionBoundsAdjuster {
  private i b;
  
  private ImageView c;
  
  private RadioButton d;
  
  private TextView e;
  
  private CheckBox f;
  
  private TextView g;
  
  private ImageView h;
  
  private ImageView i;
  
  private LinearLayout j;
  
  private Drawable k;
  
  private int l;
  
  private Context m;
  
  private boolean n;
  
  private Drawable o;
  
  private boolean p;
  
  private LayoutInflater q;
  
  private boolean r;
  
  public ListMenuItemView(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, a.listMenuViewStyle);
  }
  
  public ListMenuItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet);
    e0 e0 = e0.v(getContext(), paramAttributeSet, j.MenuView, paramInt, 0);
    this.k = e0.g(j.MenuView_android_itemBackground);
    this.l = e0.n(j.MenuView_android_itemTextAppearance, -1);
    this.n = e0.a(j.MenuView_preserveIconSpacing, false);
    this.m = paramContext;
    this.o = e0.g(j.MenuView_subMenuArrow);
    Resources.Theme theme = paramContext.getTheme();
    paramInt = a.dropDownListViewStyle;
    TypedArray typedArray = theme.obtainStyledAttributes(null, new int[] { 16843049 }, paramInt, 0);
    this.p = typedArray.hasValue(0);
    e0.w();
    typedArray.recycle();
  }
  
  private void a(View paramView) {
    b(paramView, -1);
  }
  
  private void b(View paramView, int paramInt) {
    LinearLayout linearLayout = this.j;
    if (linearLayout != null) {
      linearLayout.addView(paramView, paramInt);
    } else {
      addView(paramView, paramInt);
    } 
  }
  
  private void c() {
    CheckBox checkBox = (CheckBox)getInflater().inflate(g.abc_list_menu_item_checkbox, (ViewGroup)this, false);
    this.f = checkBox;
    a((View)checkBox);
  }
  
  private void f() {
    ImageView imageView = (ImageView)getInflater().inflate(g.abc_list_menu_item_icon, (ViewGroup)this, false);
    this.c = imageView;
    b((View)imageView, 0);
  }
  
  private void g() {
    RadioButton radioButton = (RadioButton)getInflater().inflate(g.abc_list_menu_item_radio, (ViewGroup)this, false);
    this.d = radioButton;
    a((View)radioButton);
  }
  
  private LayoutInflater getInflater() {
    if (this.q == null)
      this.q = LayoutInflater.from(getContext()); 
    return this.q;
  }
  
  private void setSubMenuArrowVisible(boolean paramBoolean) {
    ImageView imageView = this.h;
    if (imageView != null) {
      byte b;
      if (paramBoolean) {
        b = 0;
      } else {
        b = 8;
      } 
      imageView.setVisibility(b);
    } 
  }
  
  public void adjustListItemSelectionBounds(Rect paramRect) {
    ImageView imageView = this.i;
    if (imageView != null && imageView.getVisibility() == 0) {
      LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams)this.i.getLayoutParams();
      paramRect.top += this.i.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    } 
  }
  
  public boolean d() {
    return false;
  }
  
  public void e(i parami, int paramInt) {
    this.b = parami;
    if (parami.isVisible()) {
      paramInt = 0;
    } else {
      paramInt = 8;
    } 
    setVisibility(paramInt);
    setTitle(parami.i(this));
    setCheckable(parami.isCheckable());
    setShortcut(parami.A(), parami.g());
    setIcon(parami.getIcon());
    setEnabled(parami.isEnabled());
    setSubMenuArrowVisible(parami.hasSubMenu());
    setContentDescription(parami.getContentDescription());
  }
  
  public i getItemData() {
    return this.b;
  }
  
  protected void onFinishInflate() {
    super.onFinishInflate();
    w.u0((View)this, this.k);
    TextView textView = (TextView)findViewById(f.title);
    this.e = textView;
    int j = this.l;
    if (j != -1)
      textView.setTextAppearance(this.m, j); 
    this.g = (TextView)findViewById(f.shortcut);
    ImageView imageView = (ImageView)findViewById(f.submenuarrow);
    this.h = imageView;
    if (imageView != null)
      imageView.setImageDrawable(this.o); 
    this.i = (ImageView)findViewById(f.group_divider);
    this.j = (LinearLayout)findViewById(f.content);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    if (this.c != null && this.n) {
      ViewGroup.LayoutParams layoutParams = getLayoutParams();
      LinearLayout.LayoutParams layoutParams1 = (LinearLayout.LayoutParams)this.c.getLayoutParams();
      int j = layoutParams.height;
      if (j > 0 && layoutParams1.width <= 0)
        layoutParams1.width = j; 
    } 
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public void setCheckable(boolean paramBoolean) {
    CheckBox checkBox;
    RadioButton radioButton;
    if (!paramBoolean && this.d == null && this.f == null)
      return; 
    if (this.b.m()) {
      if (this.d == null)
        g(); 
      RadioButton radioButton1 = this.d;
      CheckBox checkBox1 = this.f;
    } else {
      if (this.f == null)
        c(); 
      checkBox = this.f;
      radioButton = this.d;
    } 
    if (paramBoolean) {
      checkBox.setChecked(this.b.isChecked());
      if (checkBox.getVisibility() != 0)
        checkBox.setVisibility(0); 
      if (radioButton != null && radioButton.getVisibility() != 8)
        radioButton.setVisibility(8); 
    } else {
      CheckBox checkBox1 = this.f;
      if (checkBox1 != null)
        checkBox1.setVisibility(8); 
      RadioButton radioButton1 = this.d;
      if (radioButton1 != null)
        radioButton1.setVisibility(8); 
    } 
  }
  
  public void setChecked(boolean paramBoolean) {
    CheckBox checkBox;
    if (this.b.m()) {
      if (this.d == null)
        g(); 
      RadioButton radioButton = this.d;
    } else {
      if (this.f == null)
        c(); 
      checkBox = this.f;
    } 
    checkBox.setChecked(paramBoolean);
  }
  
  public void setForceShowIcon(boolean paramBoolean) {
    this.r = paramBoolean;
    this.n = paramBoolean;
  }
  
  public void setGroupDividerEnabled(boolean paramBoolean) {
    ImageView imageView = this.i;
    if (imageView != null) {
      byte b;
      if (!this.p && paramBoolean) {
        b = 0;
      } else {
        b = 8;
      } 
      imageView.setVisibility(b);
    } 
  }
  
  public void setIcon(Drawable paramDrawable) {
    boolean bool;
    if (this.b.z() || this.r) {
      bool = true;
    } else {
      bool = false;
    } 
    if (!bool && !this.n)
      return; 
    ImageView imageView = this.c;
    if (imageView == null && paramDrawable == null && !this.n)
      return; 
    if (imageView == null)
      f(); 
    if (paramDrawable != null || this.n) {
      imageView = this.c;
      if (!bool)
        paramDrawable = null; 
      imageView.setImageDrawable(paramDrawable);
      if (this.c.getVisibility() != 0)
        this.c.setVisibility(0); 
      return;
    } 
    this.c.setVisibility(8);
  }
  
  public void setShortcut(boolean paramBoolean, char paramChar) {
    if (paramBoolean && this.b.A()) {
      paramChar = Character.MIN_VALUE;
    } else {
      paramChar = '\b';
    } 
    if (paramChar == '\000')
      this.g.setText(this.b.h()); 
    if (this.g.getVisibility() != paramChar)
      this.g.setVisibility(paramChar); 
  }
  
  public void setTitle(CharSequence paramCharSequence) {
    if (paramCharSequence != null) {
      this.e.setText(paramCharSequence);
      if (this.e.getVisibility() != 0)
        this.e.setVisibility(0); 
    } else if (this.e.getVisibility() != 8) {
      this.e.setVisibility(8);
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/view/menu/ListMenuItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */