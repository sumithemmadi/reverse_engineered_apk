package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug.CapturedViewProperty;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import b.a.h;
import b.h.f.a.b;
import b.h.k.b;

public final class i implements b {
  private View A;
  
  private b B;
  
  private MenuItem.OnActionExpandListener C;
  
  private boolean D = false;
  
  private ContextMenu.ContextMenuInfo E;
  
  private final int a;
  
  private final int b;
  
  private final int c;
  
  private final int d;
  
  private CharSequence e;
  
  private CharSequence f;
  
  private Intent g;
  
  private char h;
  
  private int i = 4096;
  
  private char j;
  
  private int k = 4096;
  
  private Drawable l;
  
  private int m = 0;
  
  g n;
  
  private r o;
  
  private Runnable p;
  
  private MenuItem.OnMenuItemClickListener q;
  
  private CharSequence r;
  
  private CharSequence s;
  
  private ColorStateList t = null;
  
  private PorterDuff.Mode u = null;
  
  private boolean v = false;
  
  private boolean w = false;
  
  private boolean x = false;
  
  private int y = 16;
  
  private int z = 0;
  
  i(g paramg, int paramInt1, int paramInt2, int paramInt3, int paramInt4, CharSequence paramCharSequence, int paramInt5) {
    this.n = paramg;
    this.a = paramInt2;
    this.b = paramInt1;
    this.c = paramInt3;
    this.d = paramInt4;
    this.e = paramCharSequence;
    this.z = paramInt5;
  }
  
  private static void d(StringBuilder paramStringBuilder, int paramInt1, int paramInt2, String paramString) {
    if ((paramInt1 & paramInt2) == paramInt2)
      paramStringBuilder.append(paramString); 
  }
  
  private Drawable e(Drawable paramDrawable) {
    // Byte code:
    //   0: aload_1
    //   1: astore_2
    //   2: aload_1
    //   3: ifnull -> 74
    //   6: aload_1
    //   7: astore_2
    //   8: aload_0
    //   9: getfield x : Z
    //   12: ifeq -> 74
    //   15: aload_0
    //   16: getfield v : Z
    //   19: ifne -> 31
    //   22: aload_1
    //   23: astore_2
    //   24: aload_0
    //   25: getfield w : Z
    //   28: ifeq -> 74
    //   31: aload_1
    //   32: invokestatic r : (Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
    //   35: invokevirtual mutate : ()Landroid/graphics/drawable/Drawable;
    //   38: astore_2
    //   39: aload_0
    //   40: getfield v : Z
    //   43: ifeq -> 54
    //   46: aload_2
    //   47: aload_0
    //   48: getfield t : Landroid/content/res/ColorStateList;
    //   51: invokestatic o : (Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V
    //   54: aload_0
    //   55: getfield w : Z
    //   58: ifeq -> 69
    //   61: aload_2
    //   62: aload_0
    //   63: getfield u : Landroid/graphics/PorterDuff$Mode;
    //   66: invokestatic p : (Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V
    //   69: aload_0
    //   70: iconst_0
    //   71: putfield x : Z
    //   74: aload_2
    //   75: areturn
  }
  
  boolean A() {
    boolean bool;
    if (this.n.J() && g() != '\000') {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public boolean B() {
    boolean bool;
    if ((this.z & 0x4) == 4) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public b a(b paramb) {
    b b1 = this.B;
    if (b1 != null)
      b1.h(); 
    this.A = null;
    this.B = paramb;
    this.n.M(true);
    paramb = this.B;
    if (paramb != null)
      paramb.j(new a(this)); 
    return this;
  }
  
  public b b() {
    return this.B;
  }
  
  public void c() {
    this.n.K(this);
  }
  
  public boolean collapseActionView() {
    if ((this.z & 0x8) == 0)
      return false; 
    if (this.A == null)
      return true; 
    MenuItem.OnActionExpandListener onActionExpandListener = this.C;
    return (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse((MenuItem)this)) ? this.n.f(this) : false;
  }
  
  public boolean expandActionView() {
    if (!j())
      return false; 
    MenuItem.OnActionExpandListener onActionExpandListener = this.C;
    return (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand((MenuItem)this)) ? this.n.m(this) : false;
  }
  
  public int f() {
    return this.d;
  }
  
  char g() {
    char c;
    if (this.n.I()) {
      char c1 = this.j;
      c = c1;
    } else {
      char c1 = this.h;
      c = c1;
    } 
    return c;
  }
  
  public ActionProvider getActionProvider() {
    throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
  }
  
  public View getActionView() {
    View view = this.A;
    if (view != null)
      return view; 
    b b1 = this.B;
    if (b1 != null) {
      View view1 = b1.d((MenuItem)this);
      this.A = view1;
      return view1;
    } 
    return null;
  }
  
  public int getAlphabeticModifiers() {
    return this.k;
  }
  
  public char getAlphabeticShortcut() {
    return this.j;
  }
  
  public CharSequence getContentDescription() {
    return this.r;
  }
  
  public int getGroupId() {
    return this.b;
  }
  
  public Drawable getIcon() {
    Drawable drawable = this.l;
    if (drawable != null)
      return e(drawable); 
    if (this.m != 0) {
      drawable = b.a.k.a.a.d(this.n.w(), this.m);
      this.m = 0;
      this.l = drawable;
      return e(drawable);
    } 
    return null;
  }
  
  public ColorStateList getIconTintList() {
    return this.t;
  }
  
  public PorterDuff.Mode getIconTintMode() {
    return this.u;
  }
  
  public Intent getIntent() {
    return this.g;
  }
  
  @CapturedViewProperty
  public int getItemId() {
    return this.a;
  }
  
  public ContextMenu.ContextMenuInfo getMenuInfo() {
    return this.E;
  }
  
  public int getNumericModifiers() {
    return this.i;
  }
  
  public char getNumericShortcut() {
    return this.h;
  }
  
  public int getOrder() {
    return this.c;
  }
  
  public SubMenu getSubMenu() {
    return this.o;
  }
  
  @CapturedViewProperty
  public CharSequence getTitle() {
    return this.e;
  }
  
  public CharSequence getTitleCondensed() {
    CharSequence charSequence1 = this.f;
    if (charSequence1 == null)
      charSequence1 = this.e; 
    CharSequence charSequence2 = charSequence1;
    if (Build.VERSION.SDK_INT < 18) {
      charSequence2 = charSequence1;
      if (charSequence1 != null) {
        charSequence2 = charSequence1;
        if (!(charSequence1 instanceof String))
          charSequence2 = charSequence1.toString(); 
      } 
    } 
    return charSequence2;
  }
  
  public CharSequence getTooltipText() {
    return this.s;
  }
  
  String h() {
    int j;
    char c = g();
    if (c == '\000')
      return ""; 
    Resources resources = this.n.w().getResources();
    StringBuilder stringBuilder = new StringBuilder();
    if (ViewConfiguration.get(this.n.w()).hasPermanentMenuKey())
      stringBuilder.append(resources.getString(h.abc_prepend_shortcut_label)); 
    if (this.n.I()) {
      j = this.k;
    } else {
      j = this.i;
    } 
    d(stringBuilder, j, 65536, resources.getString(h.abc_menu_meta_shortcut_label));
    d(stringBuilder, j, 4096, resources.getString(h.abc_menu_ctrl_shortcut_label));
    d(stringBuilder, j, 2, resources.getString(h.abc_menu_alt_shortcut_label));
    d(stringBuilder, j, 1, resources.getString(h.abc_menu_shift_shortcut_label));
    d(stringBuilder, j, 4, resources.getString(h.abc_menu_sym_shortcut_label));
    d(stringBuilder, j, 8, resources.getString(h.abc_menu_function_shortcut_label));
    if (c != '\b') {
      if (c != '\n') {
        if (c != ' ') {
          stringBuilder.append(c);
        } else {
          stringBuilder.append(resources.getString(h.abc_menu_space_shortcut_label));
        } 
      } else {
        stringBuilder.append(resources.getString(h.abc_menu_enter_shortcut_label));
      } 
    } else {
      stringBuilder.append(resources.getString(h.abc_menu_delete_shortcut_label));
    } 
    return stringBuilder.toString();
  }
  
  public boolean hasSubMenu() {
    boolean bool;
    if (this.o != null) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  CharSequence i(n.a parama) {
    CharSequence charSequence;
    if (parama != null && parama.d()) {
      charSequence = getTitleCondensed();
    } else {
      charSequence = getTitle();
    } 
    return charSequence;
  }
  
  public boolean isActionViewExpanded() {
    return this.D;
  }
  
  public boolean isCheckable() {
    int j = this.y;
    boolean bool = true;
    if ((j & 0x1) != 1)
      bool = false; 
    return bool;
  }
  
  public boolean isChecked() {
    boolean bool;
    if ((this.y & 0x2) == 2) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public boolean isEnabled() {
    boolean bool;
    if ((this.y & 0x10) != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public boolean isVisible() {
    b b1 = this.B;
    boolean bool1 = true;
    boolean bool2 = true;
    if (b1 != null && b1.g()) {
      if ((this.y & 0x8) != 0 || !this.B.b())
        bool2 = false; 
      return bool2;
    } 
    if ((this.y & 0x8) == 0) {
      bool2 = bool1;
    } else {
      bool2 = false;
    } 
    return bool2;
  }
  
  public boolean j() {
    int j = this.z;
    boolean bool1 = false;
    boolean bool2 = bool1;
    if ((j & 0x8) != 0) {
      if (this.A == null) {
        b b1 = this.B;
        if (b1 != null)
          this.A = b1.d((MenuItem)this); 
      } 
      bool2 = bool1;
      if (this.A != null)
        bool2 = true; 
    } 
    return bool2;
  }
  
  public boolean k() {
    MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.q;
    if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick((MenuItem)this))
      return true; 
    g g1 = this.n;
    if (g1.h(g1, (MenuItem)this))
      return true; 
    Runnable runnable = this.p;
    if (runnable != null) {
      runnable.run();
      return true;
    } 
    if (this.g != null)
      try {
        this.n.w().startActivity(this.g);
        return true;
      } catch (ActivityNotFoundException activityNotFoundException) {
        Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", (Throwable)activityNotFoundException);
      }  
    b b1 = this.B;
    return (b1 != null && b1.e());
  }
  
  public boolean l() {
    boolean bool;
    if ((this.y & 0x20) == 32) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public boolean m() {
    boolean bool;
    if ((this.y & 0x4) != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public boolean n() {
    int j = this.z;
    boolean bool = true;
    if ((j & 0x1) != 1)
      bool = false; 
    return bool;
  }
  
  public boolean o() {
    boolean bool;
    if ((this.z & 0x2) == 2) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public b p(int paramInt) {
    Context context = this.n.w();
    q(LayoutInflater.from(context).inflate(paramInt, (ViewGroup)new LinearLayout(context), false));
    return this;
  }
  
  public b q(View paramView) {
    this.A = paramView;
    this.B = null;
    if (paramView != null && paramView.getId() == -1) {
      int j = this.a;
      if (j > 0)
        paramView.setId(j); 
    } 
    this.n.K(this);
    return this;
  }
  
  public void r(boolean paramBoolean) {
    this.D = paramBoolean;
    this.n.M(false);
  }
  
  void s(boolean paramBoolean) {
    int k;
    int j = this.y;
    if (paramBoolean) {
      k = 2;
    } else {
      k = 0;
    } 
    k |= j & 0xFFFFFFFD;
    this.y = k;
    if (j != k)
      this.n.M(false); 
  }
  
  public MenuItem setActionProvider(ActionProvider paramActionProvider) {
    throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
  }
  
  public MenuItem setAlphabeticShortcut(char paramChar) {
    if (this.j == paramChar)
      return (MenuItem)this; 
    this.j = Character.toLowerCase(paramChar);
    this.n.M(false);
    return (MenuItem)this;
  }
  
  public MenuItem setAlphabeticShortcut(char paramChar, int paramInt) {
    if (this.j == paramChar && this.k == paramInt)
      return (MenuItem)this; 
    this.j = Character.toLowerCase(paramChar);
    this.k = KeyEvent.normalizeMetaState(paramInt);
    this.n.M(false);
    return (MenuItem)this;
  }
  
  public MenuItem setCheckable(boolean paramBoolean) {
    int j = this.y;
    int k = paramBoolean | j & 0xFFFFFFFE;
    this.y = k;
    if (j != k)
      this.n.M(false); 
    return (MenuItem)this;
  }
  
  public MenuItem setChecked(boolean paramBoolean) {
    if ((this.y & 0x4) != 0) {
      this.n.X((MenuItem)this);
    } else {
      s(paramBoolean);
    } 
    return (MenuItem)this;
  }
  
  public b setContentDescription(CharSequence paramCharSequence) {
    this.r = paramCharSequence;
    this.n.M(false);
    return this;
  }
  
  public MenuItem setEnabled(boolean paramBoolean) {
    if (paramBoolean) {
      this.y |= 0x10;
    } else {
      this.y &= 0xFFFFFFEF;
    } 
    this.n.M(false);
    return (MenuItem)this;
  }
  
  public MenuItem setIcon(int paramInt) {
    this.l = null;
    this.m = paramInt;
    this.x = true;
    this.n.M(false);
    return (MenuItem)this;
  }
  
  public MenuItem setIcon(Drawable paramDrawable) {
    this.m = 0;
    this.l = paramDrawable;
    this.x = true;
    this.n.M(false);
    return (MenuItem)this;
  }
  
  public MenuItem setIconTintList(ColorStateList paramColorStateList) {
    this.t = paramColorStateList;
    this.v = true;
    this.x = true;
    this.n.M(false);
    return (MenuItem)this;
  }
  
  public MenuItem setIconTintMode(PorterDuff.Mode paramMode) {
    this.u = paramMode;
    this.w = true;
    this.x = true;
    this.n.M(false);
    return (MenuItem)this;
  }
  
  public MenuItem setIntent(Intent paramIntent) {
    this.g = paramIntent;
    return (MenuItem)this;
  }
  
  public MenuItem setNumericShortcut(char paramChar) {
    if (this.h == paramChar)
      return (MenuItem)this; 
    this.h = (char)paramChar;
    this.n.M(false);
    return (MenuItem)this;
  }
  
  public MenuItem setNumericShortcut(char paramChar, int paramInt) {
    if (this.h == paramChar && this.i == paramInt)
      return (MenuItem)this; 
    this.h = (char)paramChar;
    this.i = KeyEvent.normalizeMetaState(paramInt);
    this.n.M(false);
    return (MenuItem)this;
  }
  
  public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener paramOnActionExpandListener) {
    this.C = paramOnActionExpandListener;
    return (MenuItem)this;
  }
  
  public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener) {
    this.q = paramOnMenuItemClickListener;
    return (MenuItem)this;
  }
  
  public MenuItem setShortcut(char paramChar1, char paramChar2) {
    this.h = (char)paramChar1;
    this.j = Character.toLowerCase(paramChar2);
    this.n.M(false);
    return (MenuItem)this;
  }
  
  public MenuItem setShortcut(char paramChar1, char paramChar2, int paramInt1, int paramInt2) {
    this.h = (char)paramChar1;
    this.i = KeyEvent.normalizeMetaState(paramInt1);
    this.j = Character.toLowerCase(paramChar2);
    this.k = KeyEvent.normalizeMetaState(paramInt2);
    this.n.M(false);
    return (MenuItem)this;
  }
  
  public void setShowAsAction(int paramInt) {
    int j = paramInt & 0x3;
    if (j == 0 || j == 1 || j == 2) {
      this.z = paramInt;
      this.n.K(this);
      return;
    } 
    throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
  }
  
  public MenuItem setTitle(int paramInt) {
    return setTitle(this.n.w().getString(paramInt));
  }
  
  public MenuItem setTitle(CharSequence paramCharSequence) {
    this.e = paramCharSequence;
    this.n.M(false);
    r r1 = this.o;
    if (r1 != null)
      r1.setHeaderTitle(paramCharSequence); 
    return (MenuItem)this;
  }
  
  public MenuItem setTitleCondensed(CharSequence paramCharSequence) {
    this.f = paramCharSequence;
    this.n.M(false);
    return (MenuItem)this;
  }
  
  public b setTooltipText(CharSequence paramCharSequence) {
    this.s = paramCharSequence;
    this.n.M(false);
    return this;
  }
  
  public MenuItem setVisible(boolean paramBoolean) {
    if (y(paramBoolean))
      this.n.L(this); 
    return (MenuItem)this;
  }
  
  public void t(boolean paramBoolean) {
    boolean bool;
    int j = this.y;
    if (paramBoolean) {
      bool = true;
    } else {
      bool = false;
    } 
    this.y = bool | j & 0xFFFFFFFB;
  }
  
  public String toString() {
    CharSequence charSequence = this.e;
    if (charSequence != null) {
      charSequence = charSequence.toString();
    } else {
      charSequence = null;
    } 
    return (String)charSequence;
  }
  
  public void u(boolean paramBoolean) {
    if (paramBoolean) {
      this.y |= 0x20;
    } else {
      this.y &= 0xFFFFFFDF;
    } 
  }
  
  void v(ContextMenu.ContextMenuInfo paramContextMenuInfo) {
    this.E = paramContextMenuInfo;
  }
  
  public b w(int paramInt) {
    setShowAsAction(paramInt);
    return this;
  }
  
  public void x(r paramr) {
    this.o = paramr;
    paramr.setHeaderTitle(getTitle());
  }
  
  boolean y(boolean paramBoolean) {
    int k;
    int j = this.y;
    boolean bool = false;
    if (paramBoolean) {
      k = 0;
    } else {
      k = 8;
    } 
    k |= j & 0xFFFFFFF7;
    this.y = k;
    paramBoolean = bool;
    if (j != k)
      paramBoolean = true; 
    return paramBoolean;
  }
  
  public boolean z() {
    return this.n.C();
  }
  
  class a implements b.b {
    a(i this$0) {}
    
    public void onActionProviderVisibilityChanged(boolean param1Boolean) {
      i i1 = this.a;
      i1.n.L(i1);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/view/menu/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */