package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.e0;
import androidx.appcompat.widget.j0;
import androidx.appcompat.widget.k0;
import androidx.lifecycle.Lifecycle;
import b.h.k.a0;
import b.h.k.b0;
import b.h.k.c0;
import b.h.k.e0;
import b.h.k.w;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

class AppCompatDelegateImpl extends c implements g.a, LayoutInflater.Factory2 {
  private static final b.e.g<String, Integer> e = new b.e.g();
  
  private static final boolean f;
  
  private static final int[] g = new int[] { 16842836 };
  
  private static final boolean h = "robolectric".equals(Build.FINGERPRINT) ^ true;
  
  private static final boolean i;
  
  private static boolean j;
  
  private boolean A = true;
  
  private boolean B;
  
  ViewGroup C;
  
  private TextView D;
  
  private View E;
  
  private boolean F;
  
  private boolean G;
  
  boolean H;
  
  boolean I;
  
  boolean J;
  
  boolean K;
  
  boolean L;
  
  private boolean M;
  
  private PanelFeatureState[] N;
  
  private PanelFeatureState O;
  
  private boolean P;
  
  private boolean Q;
  
  private boolean R;
  
  private boolean S;
  
  boolean T;
  
  private int U = -100;
  
  private int V;
  
  private boolean W;
  
  private boolean X;
  
  private p Y;
  
  private p Z;
  
  boolean a0;
  
  int b0;
  
  private final Runnable c0 = new b(this);
  
  private boolean d0;
  
  private Rect e0;
  
  private Rect f0;
  
  private e g0;
  
  private f h0;
  
  final Object k;
  
  final Context l;
  
  Window m;
  
  private n n;
  
  final b o;
  
  ActionBar p;
  
  MenuInflater q;
  
  private CharSequence r;
  
  private androidx.appcompat.widget.o s;
  
  private h t;
  
  private t u;
  
  b.a.o.b v;
  
  ActionBarContextView w;
  
  PopupWindow x;
  
  Runnable y;
  
  a0 z = null;
  
  static {
    if (i >= 17)
      bool1 = true; 
    i = bool1;
    if (bool2 && !j) {
      Thread.setDefaultUncaughtExceptionHandler(new a(Thread.getDefaultUncaughtExceptionHandler()));
      j = true;
    } 
  }
  
  AppCompatDelegateImpl(Activity paramActivity, b paramb) {
    this((Context)paramActivity, null, paramb, paramActivity);
  }
  
  AppCompatDelegateImpl(Dialog paramDialog, b paramb) {
    this(paramDialog.getContext(), paramDialog.getWindow(), paramb, paramDialog);
  }
  
  private AppCompatDelegateImpl(Context paramContext, Window paramWindow, b paramb, Object paramObject) {
    this.l = paramContext;
    this.o = paramb;
    this.k = paramObject;
    if (this.U == -100 && paramObject instanceof Dialog) {
      AppCompatActivity appCompatActivity = K0();
      if (appCompatActivity != null)
        this.U = appCompatActivity.B().m(); 
    } 
    if (this.U == -100) {
      b.e.g<String, Integer> g1 = e;
      Integer integer = (Integer)g1.get(paramObject.getClass().getName());
      if (integer != null) {
        this.U = integer.intValue();
        g1.remove(paramObject.getClass().getName());
      } 
    } 
    if (paramWindow != null)
      K(paramWindow); 
    androidx.appcompat.widget.f.h();
  }
  
  private boolean B0(PanelFeatureState paramPanelFeatureState, int paramInt1, KeyEvent paramKeyEvent, int paramInt2) {
    // Byte code:
    //   0: aload_3
    //   1: invokevirtual isSystem : ()Z
    //   4: istore #5
    //   6: iconst_0
    //   7: istore #6
    //   9: iload #5
    //   11: ifeq -> 16
    //   14: iconst_0
    //   15: ireturn
    //   16: aload_1
    //   17: getfield m : Z
    //   20: ifne -> 36
    //   23: iload #6
    //   25: istore #5
    //   27: aload_0
    //   28: aload_1
    //   29: aload_3
    //   30: invokespecial C0 : (Landroidx/appcompat/app/AppCompatDelegateImpl$PanelFeatureState;Landroid/view/KeyEvent;)Z
    //   33: ifeq -> 62
    //   36: aload_1
    //   37: getfield j : Landroidx/appcompat/view/menu/g;
    //   40: astore #7
    //   42: iload #6
    //   44: istore #5
    //   46: aload #7
    //   48: ifnull -> 62
    //   51: aload #7
    //   53: iload_2
    //   54: aload_3
    //   55: iload #4
    //   57: invokevirtual performShortcut : (ILandroid/view/KeyEvent;I)Z
    //   60: istore #5
    //   62: iload #5
    //   64: ifeq -> 87
    //   67: iload #4
    //   69: iconst_1
    //   70: iand
    //   71: ifne -> 87
    //   74: aload_0
    //   75: getfield s : Landroidx/appcompat/widget/o;
    //   78: ifnonnull -> 87
    //   81: aload_0
    //   82: aload_1
    //   83: iconst_1
    //   84: invokevirtual Q : (Landroidx/appcompat/app/AppCompatDelegateImpl$PanelFeatureState;Z)V
    //   87: iload #5
    //   89: ireturn
  }
  
  private boolean C0(PanelFeatureState paramPanelFeatureState, KeyEvent paramKeyEvent) {
    androidx.appcompat.widget.o o1;
    if (this.T)
      return false; 
    if (paramPanelFeatureState.m)
      return true; 
    PanelFeatureState panelFeatureState = this.O;
    if (panelFeatureState != null && panelFeatureState != paramPanelFeatureState)
      Q(panelFeatureState, false); 
    Window.Callback callback = h0();
    if (callback != null)
      paramPanelFeatureState.i = callback.onCreatePanelView(paramPanelFeatureState.a); 
    int i = paramPanelFeatureState.a;
    if (i == 0 || i == 108) {
      i = 1;
    } else {
      i = 0;
    } 
    if (i != 0) {
      androidx.appcompat.widget.o o2 = this.s;
      if (o2 != null)
        o2.setMenuPrepared(); 
    } 
    if (paramPanelFeatureState.i == null) {
      androidx.appcompat.widget.o o2;
      boolean bool;
      if (i != 0)
        A0(); 
      g g1 = paramPanelFeatureState.j;
      if (g1 == null || paramPanelFeatureState.r) {
        if (g1 == null && (!l0(paramPanelFeatureState) || paramPanelFeatureState.j == null))
          return false; 
        if (i != 0 && this.s != null) {
          if (this.t == null)
            this.t = new h(this); 
          this.s.setMenu((Menu)paramPanelFeatureState.j, this.t);
        } 
        paramPanelFeatureState.j.h0();
        if (!callback.onCreatePanelMenu(paramPanelFeatureState.a, (Menu)paramPanelFeatureState.j)) {
          paramPanelFeatureState.c(null);
          if (i != 0) {
            o1 = this.s;
            if (o1 != null)
              o1.setMenu(null, this.t); 
          } 
          return false;
        } 
        ((PanelFeatureState)o1).r = false;
      } 
      ((PanelFeatureState)o1).j.h0();
      Bundle bundle = ((PanelFeatureState)o1).s;
      if (bundle != null) {
        ((PanelFeatureState)o1).j.R(bundle);
        ((PanelFeatureState)o1).s = null;
      } 
      if (!callback.onPreparePanel(0, ((PanelFeatureState)o1).i, (Menu)((PanelFeatureState)o1).j)) {
        if (i != 0) {
          o2 = this.s;
          if (o2 != null)
            o2.setMenu(null, this.t); 
        } 
        ((PanelFeatureState)o1).j.g0();
        return false;
      } 
      if (o2 != null) {
        i = o2.getDeviceId();
      } else {
        i = -1;
      } 
      if (KeyCharacterMap.load(i).getKeyboardType() != 1) {
        bool = true;
      } else {
        bool = false;
      } 
      ((PanelFeatureState)o1).p = bool;
      ((PanelFeatureState)o1).j.setQwertyMode(bool);
      ((PanelFeatureState)o1).j.g0();
    } 
    ((PanelFeatureState)o1).m = true;
    ((PanelFeatureState)o1).n = false;
    this.O = (PanelFeatureState)o1;
    return true;
  }
  
  private void D0(boolean paramBoolean) {
    androidx.appcompat.widget.o o1 = this.s;
    if (o1 != null && o1.b() && (!ViewConfiguration.get(this.l).hasPermanentMenuKey() || this.s.c())) {
      Window.Callback callback = h0();
      if (!this.s.a() || !paramBoolean) {
        if (callback != null && !this.T) {
          if (this.a0 && (this.b0 & 0x1) != 0) {
            this.m.getDecorView().removeCallbacks(this.c0);
            this.c0.run();
          } 
          PanelFeatureState panelFeatureState1 = f0(0, true);
          g g1 = panelFeatureState1.j;
          if (g1 != null && !panelFeatureState1.r && callback.onPreparePanel(0, panelFeatureState1.i, (Menu)g1)) {
            callback.onMenuOpened(108, (Menu)panelFeatureState1.j);
            this.s.e();
          } 
        } 
        return;
      } 
      this.s.d();
      if (!this.T)
        callback.onPanelClosed(108, (Menu)(f0(0, true)).j); 
      return;
    } 
    PanelFeatureState panelFeatureState = f0(0, true);
    panelFeatureState.q = true;
    Q(panelFeatureState, false);
    z0(panelFeatureState, null);
  }
  
  private int E0(int paramInt) {
    if (paramInt == 8) {
      Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
      return 108;
    } 
    int i = paramInt;
    if (paramInt == 9) {
      Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
      i = 109;
    } 
    return i;
  }
  
  private boolean G0(ViewParent paramViewParent) {
    if (paramViewParent == null)
      return false; 
    View view = this.m.getDecorView();
    while (true) {
      if (paramViewParent == null)
        return true; 
      if (paramViewParent == view || !(paramViewParent instanceof View) || w.U((View)paramViewParent))
        break; 
      paramViewParent = paramViewParent.getParent();
    } 
    return false;
  }
  
  private boolean I(boolean paramBoolean) {
    if (this.T)
      return false; 
    int i = L();
    paramBoolean = L0(p0(this.l, i), paramBoolean);
    if (i == 0) {
      e0(this.l).e();
    } else {
      p p1 = this.Y;
      if (p1 != null)
        p1.a(); 
    } 
    if (i == 3) {
      d0(this.l).e();
    } else {
      p p1 = this.Z;
      if (p1 != null)
        p1.a(); 
    } 
    return paramBoolean;
  }
  
  private void J() {
    ContentFrameLayout contentFrameLayout = (ContentFrameLayout)this.C.findViewById(16908290);
    View view = this.m.getDecorView();
    contentFrameLayout.setDecorPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
    TypedArray typedArray = this.l.obtainStyledAttributes(b.a.j.AppCompatTheme);
    typedArray.getValue(b.a.j.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
    typedArray.getValue(b.a.j.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
    int i = b.a.j.AppCompatTheme_windowFixedWidthMajor;
    if (typedArray.hasValue(i))
      typedArray.getValue(i, contentFrameLayout.getFixedWidthMajor()); 
    i = b.a.j.AppCompatTheme_windowFixedWidthMinor;
    if (typedArray.hasValue(i))
      typedArray.getValue(i, contentFrameLayout.getFixedWidthMinor()); 
    i = b.a.j.AppCompatTheme_windowFixedHeightMajor;
    if (typedArray.hasValue(i))
      typedArray.getValue(i, contentFrameLayout.getFixedHeightMajor()); 
    i = b.a.j.AppCompatTheme_windowFixedHeightMinor;
    if (typedArray.hasValue(i))
      typedArray.getValue(i, contentFrameLayout.getFixedHeightMinor()); 
    typedArray.recycle();
    contentFrameLayout.requestLayout();
  }
  
  private void J0() {
    if (!this.B)
      return; 
    throw new AndroidRuntimeException("Window feature must be requested before adding content");
  }
  
  private void K(Window paramWindow) {
    if (this.m == null) {
      Window.Callback callback = paramWindow.getCallback();
      if (!(callback instanceof n)) {
        n n1 = new n(this, callback);
        this.n = n1;
        paramWindow.setCallback((Window.Callback)n1);
        e0 e0 = e0.u(this.l, null, g);
        Drawable drawable = e0.h(0);
        if (drawable != null)
          paramWindow.setBackgroundDrawable(drawable); 
        e0.w();
        this.m = paramWindow;
        return;
      } 
      throw new IllegalStateException("AppCompat has already installed itself into the Window");
    } 
    throw new IllegalStateException("AppCompat has already installed itself into the Window");
  }
  
  private AppCompatActivity K0() {
    Context context = this.l;
    while (context != null) {
      if (context instanceof AppCompatActivity)
        return (AppCompatActivity)context; 
      if (context instanceof ContextWrapper)
        context = ((ContextWrapper)context).getBaseContext(); 
    } 
    return null;
  }
  
  private int L() {
    int i = this.U;
    if (i == -100)
      i = c.l(); 
    return i;
  }
  
  private boolean L0(int paramInt, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: getfield l : Landroid/content/Context;
    //   5: iload_1
    //   6: aconst_null
    //   7: invokespecial R : (Landroid/content/Context;ILandroid/content/res/Configuration;)Landroid/content/res/Configuration;
    //   10: astore_3
    //   11: aload_0
    //   12: invokespecial n0 : ()Z
    //   15: istore #4
    //   17: aload_0
    //   18: getfield l : Landroid/content/Context;
    //   21: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   24: invokevirtual getConfiguration : ()Landroid/content/res/Configuration;
    //   27: getfield uiMode : I
    //   30: bipush #48
    //   32: iand
    //   33: istore #5
    //   35: aload_3
    //   36: getfield uiMode : I
    //   39: bipush #48
    //   41: iand
    //   42: istore #6
    //   44: iconst_1
    //   45: istore #7
    //   47: iload #5
    //   49: iload #6
    //   51: if_icmpeq -> 120
    //   54: iload_2
    //   55: ifeq -> 120
    //   58: iload #4
    //   60: ifne -> 120
    //   63: aload_0
    //   64: getfield Q : Z
    //   67: ifeq -> 120
    //   70: getstatic androidx/appcompat/app/AppCompatDelegateImpl.h : Z
    //   73: ifne -> 83
    //   76: aload_0
    //   77: getfield R : Z
    //   80: ifeq -> 120
    //   83: aload_0
    //   84: getfield k : Ljava/lang/Object;
    //   87: astore_3
    //   88: aload_3
    //   89: instanceof android/app/Activity
    //   92: ifeq -> 120
    //   95: aload_3
    //   96: checkcast android/app/Activity
    //   99: invokevirtual isChild : ()Z
    //   102: ifne -> 120
    //   105: aload_0
    //   106: getfield k : Ljava/lang/Object;
    //   109: checkcast android/app/Activity
    //   112: invokestatic n : (Landroid/app/Activity;)V
    //   115: iconst_1
    //   116: istore_2
    //   117: goto -> 122
    //   120: iconst_0
    //   121: istore_2
    //   122: iload_2
    //   123: ifne -> 148
    //   126: iload #5
    //   128: iload #6
    //   130: if_icmpeq -> 148
    //   133: aload_0
    //   134: iload #6
    //   136: iload #4
    //   138: aconst_null
    //   139: invokespecial M0 : (IZLandroid/content/res/Configuration;)V
    //   142: iload #7
    //   144: istore_2
    //   145: goto -> 148
    //   148: iload_2
    //   149: ifeq -> 172
    //   152: aload_0
    //   153: getfield k : Ljava/lang/Object;
    //   156: astore_3
    //   157: aload_3
    //   158: instanceof androidx/appcompat/app/AppCompatActivity
    //   161: ifeq -> 172
    //   164: aload_3
    //   165: checkcast androidx/appcompat/app/AppCompatActivity
    //   168: iload_1
    //   169: invokevirtual F : (I)V
    //   172: iload_2
    //   173: ireturn
  }
  
  private void M0(int paramInt, boolean paramBoolean, Configuration paramConfiguration) {
    Resources resources = this.l.getResources();
    Configuration configuration = new Configuration(resources.getConfiguration());
    if (paramConfiguration != null)
      configuration.updateFrom(paramConfiguration); 
    configuration.uiMode = paramInt | (resources.getConfiguration()).uiMode & 0xFFFFFFCF;
    resources.updateConfiguration(configuration, null);
    paramInt = Build.VERSION.SDK_INT;
    if (paramInt < 26)
      g.a(resources); 
    int i = this.V;
    if (i != 0) {
      this.l.setTheme(i);
      if (paramInt >= 23)
        this.l.getTheme().applyStyle(this.V, true); 
    } 
    if (paramBoolean) {
      Object object = this.k;
      if (object instanceof Activity) {
        object = object;
        if (object instanceof androidx.lifecycle.h) {
          if (((androidx.lifecycle.h)object).a().b().isAtLeast(Lifecycle.State.e))
            object.onConfigurationChanged(configuration); 
        } else if (this.S) {
          object.onConfigurationChanged(configuration);
        } 
      } 
    } 
  }
  
  private void O() {
    p p1 = this.Y;
    if (p1 != null)
      p1.a(); 
    p1 = this.Z;
    if (p1 != null)
      p1.a(); 
  }
  
  private void O0(View paramView) {
    int i;
    if ((w.O(paramView) & 0x2000) != 0) {
      i = 1;
    } else {
      i = 0;
    } 
    if (i) {
      i = androidx.core.content.a.d(this.l, b.a.c.abc_decor_view_status_guard_light);
    } else {
      i = androidx.core.content.a.d(this.l, b.a.c.abc_decor_view_status_guard);
    } 
    paramView.setBackgroundColor(i);
  }
  
  private Configuration R(Context paramContext, int paramInt, Configuration paramConfiguration) {
    if (paramInt != 1) {
      if (paramInt != 2) {
        paramInt = (paramContext.getApplicationContext().getResources().getConfiguration()).uiMode & 0x30;
      } else {
        paramInt = 32;
      } 
    } else {
      paramInt = 16;
    } 
    Configuration configuration = new Configuration();
    configuration.fontScale = 0.0F;
    if (paramConfiguration != null)
      configuration.setTo(paramConfiguration); 
    configuration.uiMode = paramInt | configuration.uiMode & 0xFFFFFFCF;
    return configuration;
  }
  
  private ViewGroup S() {
    StringBuilder stringBuilder;
    TypedArray typedArray = this.l.obtainStyledAttributes(b.a.j.AppCompatTheme);
    int i = b.a.j.AppCompatTheme_windowActionBar;
    if (typedArray.hasValue(i)) {
      ViewGroup viewGroup;
      if (typedArray.getBoolean(b.a.j.AppCompatTheme_windowNoTitle, false)) {
        B(1);
      } else if (typedArray.getBoolean(i, false)) {
        B(108);
      } 
      if (typedArray.getBoolean(b.a.j.AppCompatTheme_windowActionBarOverlay, false))
        B(109); 
      if (typedArray.getBoolean(b.a.j.AppCompatTheme_windowActionModeOverlay, false))
        B(10); 
      this.K = typedArray.getBoolean(b.a.j.AppCompatTheme_android_windowIsFloating, false);
      typedArray.recycle();
      Z();
      this.m.getDecorView();
      LayoutInflater layoutInflater = LayoutInflater.from(this.l);
      if (!this.L) {
        if (this.K) {
          viewGroup = (ViewGroup)layoutInflater.inflate(b.a.g.abc_dialog_title_material, null);
          this.I = false;
          this.H = false;
        } else if (this.H) {
          Context context;
          TypedValue typedValue = new TypedValue();
          this.l.getTheme().resolveAttribute(b.a.a.actionBarTheme, typedValue, true);
          if (typedValue.resourceId != 0) {
            b.a.o.d d = new b.a.o.d(this.l, typedValue.resourceId);
          } else {
            context = this.l;
          } 
          ViewGroup viewGroup1 = (ViewGroup)LayoutInflater.from(context).inflate(b.a.g.abc_screen_toolbar, null);
          androidx.appcompat.widget.o o1 = (androidx.appcompat.widget.o)viewGroup1.findViewById(b.a.f.decor_content_parent);
          this.s = o1;
          o1.setWindowCallback(h0());
          if (this.I)
            this.s.f(109); 
          if (this.F)
            this.s.f(2); 
          viewGroup = viewGroup1;
          if (this.G) {
            this.s.f(5);
            viewGroup = viewGroup1;
          } 
        } else {
          layoutInflater = null;
        } 
      } else if (this.J) {
        viewGroup = (ViewGroup)layoutInflater.inflate(b.a.g.abc_screen_simple_overlay_action_mode, null);
      } else {
        viewGroup = (ViewGroup)viewGroup.inflate(b.a.g.abc_screen_simple, null);
      } 
      if (viewGroup != null) {
        if (Build.VERSION.SDK_INT >= 21) {
          w.E0((View)viewGroup, new c(this));
        } else if (viewGroup instanceof androidx.appcompat.widget.s) {
          ((androidx.appcompat.widget.s)viewGroup).setOnFitSystemWindowsListener(new d(this));
        } 
        if (this.s == null)
          this.D = (TextView)viewGroup.findViewById(b.a.f.title); 
        k0.c((View)viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout)viewGroup.findViewById(b.a.f.action_bar_activity_content);
        ViewGroup viewGroup1 = (ViewGroup)this.m.findViewById(16908290);
        if (viewGroup1 != null) {
          while (viewGroup1.getChildCount() > 0) {
            View view = viewGroup1.getChildAt(0);
            viewGroup1.removeViewAt(0);
            contentFrameLayout.addView(view);
          } 
          viewGroup1.setId(-1);
          contentFrameLayout.setId(16908290);
          if (viewGroup1 instanceof FrameLayout)
            ((FrameLayout)viewGroup1).setForeground(null); 
        } 
        this.m.setContentView((View)viewGroup);
        contentFrameLayout.setAttachListener(new e(this));
        return viewGroup;
      } 
      stringBuilder = new StringBuilder();
      stringBuilder.append("AppCompat does not support the current theme features: { windowActionBar: ");
      stringBuilder.append(this.H);
      stringBuilder.append(", windowActionBarOverlay: ");
      stringBuilder.append(this.I);
      stringBuilder.append(", android:windowIsFloating: ");
      stringBuilder.append(this.K);
      stringBuilder.append(", windowActionModeOverlay: ");
      stringBuilder.append(this.J);
      stringBuilder.append(", windowNoTitle: ");
      stringBuilder.append(this.L);
      stringBuilder.append(" }");
      throw new IllegalArgumentException(stringBuilder.toString());
    } 
    stringBuilder.recycle();
    IllegalStateException illegalStateException = new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    throw illegalStateException;
  }
  
  private void Y() {
    if (!this.B) {
      this.C = S();
      CharSequence charSequence = g0();
      if (!TextUtils.isEmpty(charSequence)) {
        androidx.appcompat.widget.o o1 = this.s;
        if (o1 != null) {
          o1.setWindowTitle(charSequence);
        } else if (A0() != null) {
          A0().s(charSequence);
        } else {
          TextView textView = this.D;
          if (textView != null)
            textView.setText(charSequence); 
        } 
      } 
      J();
      y0(this.C);
      this.B = true;
      PanelFeatureState panelFeatureState = f0(0, false);
      if (!this.T && (panelFeatureState == null || panelFeatureState.j == null))
        m0(108); 
    } 
  }
  
  private void Z() {
    if (this.m == null) {
      Object object = this.k;
      if (object instanceof Activity)
        K(((Activity)object).getWindow()); 
    } 
    if (this.m != null)
      return; 
    throw new IllegalStateException("We have not been given a Window");
  }
  
  private static Configuration b0(Configuration paramConfiguration1, Configuration paramConfiguration2) {
    Configuration configuration = new Configuration();
    configuration.fontScale = 0.0F;
    if (paramConfiguration2 != null && paramConfiguration1.diff(paramConfiguration2) != 0) {
      float f1 = paramConfiguration1.fontScale;
      float f2 = paramConfiguration2.fontScale;
      if (f1 != f2)
        configuration.fontScale = f2; 
      int i = paramConfiguration1.mcc;
      int j = paramConfiguration2.mcc;
      if (i != j)
        configuration.mcc = j; 
      i = paramConfiguration1.mnc;
      j = paramConfiguration2.mnc;
      if (i != j)
        configuration.mnc = j; 
      i = Build.VERSION.SDK_INT;
      if (i >= 24) {
        l.a(paramConfiguration1, paramConfiguration2, configuration);
      } else if (!b.h.j.d.a(paramConfiguration1.locale, paramConfiguration2.locale)) {
        configuration.locale = paramConfiguration2.locale;
      } 
      int k = paramConfiguration1.touchscreen;
      j = paramConfiguration2.touchscreen;
      if (k != j)
        configuration.touchscreen = j; 
      j = paramConfiguration1.keyboard;
      k = paramConfiguration2.keyboard;
      if (j != k)
        configuration.keyboard = k; 
      j = paramConfiguration1.keyboardHidden;
      k = paramConfiguration2.keyboardHidden;
      if (j != k)
        configuration.keyboardHidden = k; 
      k = paramConfiguration1.navigation;
      j = paramConfiguration2.navigation;
      if (k != j)
        configuration.navigation = j; 
      j = paramConfiguration1.navigationHidden;
      k = paramConfiguration2.navigationHidden;
      if (j != k)
        configuration.navigationHidden = k; 
      k = paramConfiguration1.orientation;
      j = paramConfiguration2.orientation;
      if (k != j)
        configuration.orientation = j; 
      k = paramConfiguration1.screenLayout;
      j = paramConfiguration2.screenLayout;
      if ((k & 0xF) != (j & 0xF))
        configuration.screenLayout |= j & 0xF; 
      k = paramConfiguration1.screenLayout;
      j = paramConfiguration2.screenLayout;
      if ((k & 0xC0) != (j & 0xC0))
        configuration.screenLayout |= j & 0xC0; 
      k = paramConfiguration1.screenLayout;
      j = paramConfiguration2.screenLayout;
      if ((k & 0x30) != (j & 0x30))
        configuration.screenLayout |= j & 0x30; 
      k = paramConfiguration1.screenLayout;
      j = paramConfiguration2.screenLayout;
      if ((k & 0x300) != (j & 0x300))
        configuration.screenLayout |= j & 0x300; 
      if (i >= 26)
        m.a(paramConfiguration1, paramConfiguration2, configuration); 
      k = paramConfiguration1.uiMode;
      j = paramConfiguration2.uiMode;
      if ((k & 0xF) != (j & 0xF))
        configuration.uiMode |= j & 0xF; 
      j = paramConfiguration1.uiMode;
      k = paramConfiguration2.uiMode;
      if ((j & 0x30) != (k & 0x30))
        configuration.uiMode |= k & 0x30; 
      j = paramConfiguration1.screenWidthDp;
      k = paramConfiguration2.screenWidthDp;
      if (j != k)
        configuration.screenWidthDp = k; 
      k = paramConfiguration1.screenHeightDp;
      j = paramConfiguration2.screenHeightDp;
      if (k != j)
        configuration.screenHeightDp = j; 
      k = paramConfiguration1.smallestScreenWidthDp;
      j = paramConfiguration2.smallestScreenWidthDp;
      if (k != j)
        configuration.smallestScreenWidthDp = j; 
      if (i >= 17)
        j.b(paramConfiguration1, paramConfiguration2, configuration); 
    } 
    return configuration;
  }
  
  private p d0(Context paramContext) {
    if (this.Z == null)
      this.Z = new o(this, paramContext); 
    return this.Z;
  }
  
  private p e0(Context paramContext) {
    if (this.Y == null)
      this.Y = new q(this, i.a(paramContext)); 
    return this.Y;
  }
  
  private void i0() {
    Y();
    if (this.H && this.p == null) {
      Object object = this.k;
      if (object instanceof Activity) {
        this.p = new j((Activity)this.k, this.I);
      } else if (object instanceof Dialog) {
        this.p = new j((Dialog)this.k);
      } 
      object = this.p;
      if (object != null)
        object.q(this.d0); 
    } 
  }
  
  private boolean j0(PanelFeatureState paramPanelFeatureState) {
    View view = paramPanelFeatureState.i;
    boolean bool = true;
    if (view != null) {
      paramPanelFeatureState.h = view;
      return true;
    } 
    if (paramPanelFeatureState.j == null)
      return false; 
    if (this.u == null)
      this.u = new t(this); 
    view = (View)paramPanelFeatureState.a(this.u);
    paramPanelFeatureState.h = view;
    if (view == null)
      bool = false; 
    return bool;
  }
  
  private boolean k0(PanelFeatureState paramPanelFeatureState) {
    paramPanelFeatureState.d(c0());
    paramPanelFeatureState.g = (ViewGroup)new s(this, paramPanelFeatureState.l);
    paramPanelFeatureState.c = 81;
    return true;
  }
  
  private boolean l0(PanelFeatureState paramPanelFeatureState) {
    // Byte code:
    //   0: aload_0
    //   1: getfield l : Landroid/content/Context;
    //   4: astore_2
    //   5: aload_1
    //   6: getfield a : I
    //   9: istore_3
    //   10: iload_3
    //   11: ifeq -> 23
    //   14: aload_2
    //   15: astore #4
    //   17: iload_3
    //   18: bipush #108
    //   20: if_icmpne -> 202
    //   23: aload_2
    //   24: astore #4
    //   26: aload_0
    //   27: getfield s : Landroidx/appcompat/widget/o;
    //   30: ifnull -> 202
    //   33: new android/util/TypedValue
    //   36: dup
    //   37: invokespecial <init> : ()V
    //   40: astore #5
    //   42: aload_2
    //   43: invokevirtual getTheme : ()Landroid/content/res/Resources$Theme;
    //   46: astore #6
    //   48: aload #6
    //   50: getstatic b/a/a.actionBarTheme : I
    //   53: aload #5
    //   55: iconst_1
    //   56: invokevirtual resolveAttribute : (ILandroid/util/TypedValue;Z)Z
    //   59: pop
    //   60: aconst_null
    //   61: astore #4
    //   63: aload #5
    //   65: getfield resourceId : I
    //   68: ifeq -> 113
    //   71: aload_2
    //   72: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   75: invokevirtual newTheme : ()Landroid/content/res/Resources$Theme;
    //   78: astore #4
    //   80: aload #4
    //   82: aload #6
    //   84: invokevirtual setTo : (Landroid/content/res/Resources$Theme;)V
    //   87: aload #4
    //   89: aload #5
    //   91: getfield resourceId : I
    //   94: iconst_1
    //   95: invokevirtual applyStyle : (IZ)V
    //   98: aload #4
    //   100: getstatic b/a/a.actionBarWidgetTheme : I
    //   103: aload #5
    //   105: iconst_1
    //   106: invokevirtual resolveAttribute : (ILandroid/util/TypedValue;Z)Z
    //   109: pop
    //   110: goto -> 125
    //   113: aload #6
    //   115: getstatic b/a/a.actionBarWidgetTheme : I
    //   118: aload #5
    //   120: iconst_1
    //   121: invokevirtual resolveAttribute : (ILandroid/util/TypedValue;Z)Z
    //   124: pop
    //   125: aload #4
    //   127: astore #7
    //   129: aload #5
    //   131: getfield resourceId : I
    //   134: ifeq -> 173
    //   137: aload #4
    //   139: astore #7
    //   141: aload #4
    //   143: ifnonnull -> 162
    //   146: aload_2
    //   147: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   150: invokevirtual newTheme : ()Landroid/content/res/Resources$Theme;
    //   153: astore #7
    //   155: aload #7
    //   157: aload #6
    //   159: invokevirtual setTo : (Landroid/content/res/Resources$Theme;)V
    //   162: aload #7
    //   164: aload #5
    //   166: getfield resourceId : I
    //   169: iconst_1
    //   170: invokevirtual applyStyle : (IZ)V
    //   173: aload_2
    //   174: astore #4
    //   176: aload #7
    //   178: ifnull -> 202
    //   181: new b/a/o/d
    //   184: dup
    //   185: aload_2
    //   186: iconst_0
    //   187: invokespecial <init> : (Landroid/content/Context;I)V
    //   190: astore #4
    //   192: aload #4
    //   194: invokevirtual getTheme : ()Landroid/content/res/Resources$Theme;
    //   197: aload #7
    //   199: invokevirtual setTo : (Landroid/content/res/Resources$Theme;)V
    //   202: new androidx/appcompat/view/menu/g
    //   205: dup
    //   206: aload #4
    //   208: invokespecial <init> : (Landroid/content/Context;)V
    //   211: astore #4
    //   213: aload #4
    //   215: aload_0
    //   216: invokevirtual V : (Landroidx/appcompat/view/menu/g$a;)V
    //   219: aload_1
    //   220: aload #4
    //   222: invokevirtual c : (Landroidx/appcompat/view/menu/g;)V
    //   225: iconst_1
    //   226: ireturn
  }
  
  private void m0(int paramInt) {
    this.b0 = 1 << paramInt | this.b0;
    if (!this.a0) {
      w.j0(this.m.getDecorView(), this.c0);
      this.a0 = true;
    } 
  }
  
  private boolean n0() {
    if (!this.X && this.k instanceof Activity) {
      PackageManager packageManager = this.l.getPackageManager();
      if (packageManager == null)
        return false; 
      try {
        boolean bool;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
          i = 269221888;
        } else if (i >= 24) {
          i = 786432;
        } else {
          i = 0;
        } 
        ComponentName componentName = new ComponentName();
        this(this.l, this.k.getClass());
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i);
        if (activityInfo != null && (activityInfo.configChanges & 0x200) != 0) {
          bool = true;
        } else {
          bool = false;
        } 
        this.W = bool;
      } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
        Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", (Throwable)nameNotFoundException);
        this.W = false;
      } 
    } 
    this.X = true;
    return this.W;
  }
  
  private boolean s0(int paramInt, KeyEvent paramKeyEvent) {
    if (paramKeyEvent.getRepeatCount() == 0) {
      PanelFeatureState panelFeatureState = f0(paramInt, true);
      if (!panelFeatureState.o)
        return C0(panelFeatureState, paramKeyEvent); 
    } 
    return false;
  }
  
  private boolean v0(int paramInt, KeyEvent paramKeyEvent) {
    // Byte code:
    //   0: aload_0
    //   1: getfield v : Lb/a/o/b;
    //   4: ifnull -> 9
    //   7: iconst_0
    //   8: ireturn
    //   9: iconst_1
    //   10: istore_3
    //   11: aload_0
    //   12: iload_1
    //   13: iconst_1
    //   14: invokevirtual f0 : (IZ)Landroidx/appcompat/app/AppCompatDelegateImpl$PanelFeatureState;
    //   17: astore #4
    //   19: iload_1
    //   20: ifne -> 114
    //   23: aload_0
    //   24: getfield s : Landroidx/appcompat/widget/o;
    //   27: astore #5
    //   29: aload #5
    //   31: ifnull -> 114
    //   34: aload #5
    //   36: invokeinterface b : ()Z
    //   41: ifeq -> 114
    //   44: aload_0
    //   45: getfield l : Landroid/content/Context;
    //   48: invokestatic get : (Landroid/content/Context;)Landroid/view/ViewConfiguration;
    //   51: invokevirtual hasPermanentMenuKey : ()Z
    //   54: ifne -> 114
    //   57: aload_0
    //   58: getfield s : Landroidx/appcompat/widget/o;
    //   61: invokeinterface a : ()Z
    //   66: ifne -> 100
    //   69: aload_0
    //   70: getfield T : Z
    //   73: ifne -> 192
    //   76: aload_0
    //   77: aload #4
    //   79: aload_2
    //   80: invokespecial C0 : (Landroidx/appcompat/app/AppCompatDelegateImpl$PanelFeatureState;Landroid/view/KeyEvent;)Z
    //   83: ifeq -> 192
    //   86: aload_0
    //   87: getfield s : Landroidx/appcompat/widget/o;
    //   90: invokeinterface e : ()Z
    //   95: istore #6
    //   97: goto -> 205
    //   100: aload_0
    //   101: getfield s : Landroidx/appcompat/widget/o;
    //   104: invokeinterface d : ()Z
    //   109: istore #6
    //   111: goto -> 205
    //   114: aload #4
    //   116: getfield o : Z
    //   119: istore #6
    //   121: iload #6
    //   123: ifne -> 198
    //   126: aload #4
    //   128: getfield n : Z
    //   131: ifeq -> 137
    //   134: goto -> 198
    //   137: aload #4
    //   139: getfield m : Z
    //   142: ifeq -> 192
    //   145: aload #4
    //   147: getfield r : Z
    //   150: ifeq -> 171
    //   153: aload #4
    //   155: iconst_0
    //   156: putfield m : Z
    //   159: aload_0
    //   160: aload #4
    //   162: aload_2
    //   163: invokespecial C0 : (Landroidx/appcompat/app/AppCompatDelegateImpl$PanelFeatureState;Landroid/view/KeyEvent;)Z
    //   166: istore #6
    //   168: goto -> 174
    //   171: iconst_1
    //   172: istore #6
    //   174: iload #6
    //   176: ifeq -> 192
    //   179: aload_0
    //   180: aload #4
    //   182: aload_2
    //   183: invokespecial z0 : (Landroidx/appcompat/app/AppCompatDelegateImpl$PanelFeatureState;Landroid/view/KeyEvent;)V
    //   186: iload_3
    //   187: istore #6
    //   189: goto -> 205
    //   192: iconst_0
    //   193: istore #6
    //   195: goto -> 205
    //   198: aload_0
    //   199: aload #4
    //   201: iconst_1
    //   202: invokevirtual Q : (Landroidx/appcompat/app/AppCompatDelegateImpl$PanelFeatureState;Z)V
    //   205: iload #6
    //   207: ifeq -> 249
    //   210: aload_0
    //   211: getfield l : Landroid/content/Context;
    //   214: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   217: ldc_w 'audio'
    //   220: invokevirtual getSystemService : (Ljava/lang/String;)Ljava/lang/Object;
    //   223: checkcast android/media/AudioManager
    //   226: astore_2
    //   227: aload_2
    //   228: ifnull -> 239
    //   231: aload_2
    //   232: iconst_0
    //   233: invokevirtual playSoundEffect : (I)V
    //   236: goto -> 249
    //   239: ldc_w 'AppCompatDelegate'
    //   242: ldc_w 'Couldn't get audio manager'
    //   245: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   248: pop
    //   249: iload #6
    //   251: ireturn
  }
  
  private void z0(PanelFeatureState paramPanelFeatureState, KeyEvent paramKeyEvent) {
    // Byte code:
    //   0: aload_1
    //   1: getfield o : Z
    //   4: ifne -> 407
    //   7: aload_0
    //   8: getfield T : Z
    //   11: ifeq -> 17
    //   14: goto -> 407
    //   17: aload_1
    //   18: getfield a : I
    //   21: ifne -> 56
    //   24: aload_0
    //   25: getfield l : Landroid/content/Context;
    //   28: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   31: invokevirtual getConfiguration : ()Landroid/content/res/Configuration;
    //   34: getfield screenLayout : I
    //   37: bipush #15
    //   39: iand
    //   40: iconst_4
    //   41: if_icmpne -> 49
    //   44: iconst_1
    //   45: istore_3
    //   46: goto -> 51
    //   49: iconst_0
    //   50: istore_3
    //   51: iload_3
    //   52: ifeq -> 56
    //   55: return
    //   56: aload_0
    //   57: invokevirtual h0 : ()Landroid/view/Window$Callback;
    //   60: astore #4
    //   62: aload #4
    //   64: ifnull -> 92
    //   67: aload #4
    //   69: aload_1
    //   70: getfield a : I
    //   73: aload_1
    //   74: getfield j : Landroidx/appcompat/view/menu/g;
    //   77: invokeinterface onMenuOpened : (ILandroid/view/Menu;)Z
    //   82: ifne -> 92
    //   85: aload_0
    //   86: aload_1
    //   87: iconst_1
    //   88: invokevirtual Q : (Landroidx/appcompat/app/AppCompatDelegateImpl$PanelFeatureState;Z)V
    //   91: return
    //   92: aload_0
    //   93: getfield l : Landroid/content/Context;
    //   96: ldc_w 'window'
    //   99: invokevirtual getSystemService : (Ljava/lang/String;)Ljava/lang/Object;
    //   102: checkcast android/view/WindowManager
    //   105: astore #5
    //   107: aload #5
    //   109: ifnonnull -> 113
    //   112: return
    //   113: aload_0
    //   114: aload_1
    //   115: aload_2
    //   116: invokespecial C0 : (Landroidx/appcompat/app/AppCompatDelegateImpl$PanelFeatureState;Landroid/view/KeyEvent;)Z
    //   119: ifne -> 123
    //   122: return
    //   123: aload_1
    //   124: getfield g : Landroid/view/ViewGroup;
    //   127: astore_2
    //   128: aload_2
    //   129: ifnull -> 173
    //   132: aload_1
    //   133: getfield q : Z
    //   136: ifeq -> 142
    //   139: goto -> 173
    //   142: aload_1
    //   143: getfield i : Landroid/view/View;
    //   146: astore_2
    //   147: aload_2
    //   148: ifnull -> 333
    //   151: aload_2
    //   152: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   155: astore_2
    //   156: aload_2
    //   157: ifnull -> 333
    //   160: aload_2
    //   161: getfield width : I
    //   164: iconst_m1
    //   165: if_icmpne -> 333
    //   168: iconst_m1
    //   169: istore_3
    //   170: goto -> 336
    //   173: aload_2
    //   174: ifnonnull -> 193
    //   177: aload_0
    //   178: aload_1
    //   179: invokespecial k0 : (Landroidx/appcompat/app/AppCompatDelegateImpl$PanelFeatureState;)Z
    //   182: ifeq -> 192
    //   185: aload_1
    //   186: getfield g : Landroid/view/ViewGroup;
    //   189: ifnonnull -> 214
    //   192: return
    //   193: aload_1
    //   194: getfield q : Z
    //   197: ifeq -> 214
    //   200: aload_2
    //   201: invokevirtual getChildCount : ()I
    //   204: ifle -> 214
    //   207: aload_1
    //   208: getfield g : Landroid/view/ViewGroup;
    //   211: invokevirtual removeAllViews : ()V
    //   214: aload_0
    //   215: aload_1
    //   216: invokespecial j0 : (Landroidx/appcompat/app/AppCompatDelegateImpl$PanelFeatureState;)Z
    //   219: ifeq -> 402
    //   222: aload_1
    //   223: invokevirtual b : ()Z
    //   226: ifne -> 232
    //   229: goto -> 402
    //   232: aload_1
    //   233: getfield h : Landroid/view/View;
    //   236: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   239: astore #4
    //   241: aload #4
    //   243: astore_2
    //   244: aload #4
    //   246: ifnonnull -> 261
    //   249: new android/view/ViewGroup$LayoutParams
    //   252: dup
    //   253: bipush #-2
    //   255: bipush #-2
    //   257: invokespecial <init> : (II)V
    //   260: astore_2
    //   261: aload_1
    //   262: getfield b : I
    //   265: istore_3
    //   266: aload_1
    //   267: getfield g : Landroid/view/ViewGroup;
    //   270: iload_3
    //   271: invokevirtual setBackgroundResource : (I)V
    //   274: aload_1
    //   275: getfield h : Landroid/view/View;
    //   278: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   281: astore #4
    //   283: aload #4
    //   285: instanceof android/view/ViewGroup
    //   288: ifeq -> 303
    //   291: aload #4
    //   293: checkcast android/view/ViewGroup
    //   296: aload_1
    //   297: getfield h : Landroid/view/View;
    //   300: invokevirtual removeView : (Landroid/view/View;)V
    //   303: aload_1
    //   304: getfield g : Landroid/view/ViewGroup;
    //   307: aload_1
    //   308: getfield h : Landroid/view/View;
    //   311: aload_2
    //   312: invokevirtual addView : (Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    //   315: aload_1
    //   316: getfield h : Landroid/view/View;
    //   319: invokevirtual hasFocus : ()Z
    //   322: ifne -> 333
    //   325: aload_1
    //   326: getfield h : Landroid/view/View;
    //   329: invokevirtual requestFocus : ()Z
    //   332: pop
    //   333: bipush #-2
    //   335: istore_3
    //   336: aload_1
    //   337: iconst_0
    //   338: putfield n : Z
    //   341: new android/view/WindowManager$LayoutParams
    //   344: dup
    //   345: iload_3
    //   346: bipush #-2
    //   348: aload_1
    //   349: getfield d : I
    //   352: aload_1
    //   353: getfield e : I
    //   356: sipush #1002
    //   359: ldc_w 8519680
    //   362: bipush #-3
    //   364: invokespecial <init> : (IIIIIII)V
    //   367: astore_2
    //   368: aload_2
    //   369: aload_1
    //   370: getfield c : I
    //   373: putfield gravity : I
    //   376: aload_2
    //   377: aload_1
    //   378: getfield f : I
    //   381: putfield windowAnimations : I
    //   384: aload #5
    //   386: aload_1
    //   387: getfield g : Landroid/view/ViewGroup;
    //   390: aload_2
    //   391: invokeinterface addView : (Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    //   396: aload_1
    //   397: iconst_1
    //   398: putfield o : Z
    //   401: return
    //   402: aload_1
    //   403: iconst_1
    //   404: putfield q : Z
    //   407: return
  }
  
  final ActionBar A0() {
    return this.p;
  }
  
  public boolean B(int paramInt) {
    paramInt = E0(paramInt);
    if (this.L && paramInt == 108)
      return false; 
    if (this.H && paramInt == 1)
      this.H = false; 
    if (paramInt != 1) {
      if (paramInt != 2) {
        if (paramInt != 5) {
          if (paramInt != 10) {
            if (paramInt != 108) {
              if (paramInt != 109)
                return this.m.requestFeature(paramInt); 
              J0();
              this.I = true;
              return true;
            } 
            J0();
            this.H = true;
            return true;
          } 
          J0();
          this.J = true;
          return true;
        } 
        J0();
        this.G = true;
        return true;
      } 
      J0();
      this.F = true;
      return true;
    } 
    J0();
    this.L = true;
    return true;
  }
  
  public void C(int paramInt) {
    Y();
    ViewGroup viewGroup = (ViewGroup)this.C.findViewById(16908290);
    viewGroup.removeAllViews();
    LayoutInflater.from(this.l).inflate(paramInt, viewGroup);
    this.n.a().onContentChanged();
  }
  
  public void D(View paramView) {
    Y();
    ViewGroup viewGroup = (ViewGroup)this.C.findViewById(16908290);
    viewGroup.removeAllViews();
    viewGroup.addView(paramView);
    this.n.a().onContentChanged();
  }
  
  public void E(View paramView, ViewGroup.LayoutParams paramLayoutParams) {
    Y();
    ViewGroup viewGroup = (ViewGroup)this.C.findViewById(16908290);
    viewGroup.removeAllViews();
    viewGroup.addView(paramView, paramLayoutParams);
    this.n.a().onContentChanged();
  }
  
  final boolean F0() {
    if (this.B) {
      ViewGroup viewGroup = this.C;
      if (viewGroup != null && w.V((View)viewGroup))
        return true; 
    } 
    return false;
  }
  
  public void G(int paramInt) {
    this.V = paramInt;
  }
  
  public final void H(CharSequence paramCharSequence) {
    this.r = paramCharSequence;
    androidx.appcompat.widget.o o1 = this.s;
    if (o1 != null) {
      o1.setWindowTitle(paramCharSequence);
    } else if (A0() != null) {
      A0().s(paramCharSequence);
    } else {
      TextView textView = this.D;
      if (textView != null)
        textView.setText(paramCharSequence); 
    } 
  }
  
  public b.a.o.b H0(b.a.o.b.a parama) {
    if (parama != null) {
      b.a.o.b b1 = this.v;
      if (b1 != null)
        b1.c(); 
      parama = new i(this, parama);
      ActionBar actionBar = o();
      if (actionBar != null) {
        b.a.o.b b2 = actionBar.t(parama);
        this.v = b2;
        if (b2 != null) {
          b b3 = this.o;
          if (b3 != null)
            b3.d(b2); 
        } 
      } 
      if (this.v == null)
        this.v = I0(parama); 
      return this.v;
    } 
    throw new IllegalArgumentException("ActionMode callback can not be null.");
  }
  
  b.a.o.b I0(b.a.o.b.a parama) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual X : ()V
    //   4: aload_0
    //   5: getfield v : Lb/a/o/b;
    //   8: astore_2
    //   9: aload_2
    //   10: ifnull -> 17
    //   13: aload_2
    //   14: invokevirtual c : ()V
    //   17: aload_1
    //   18: astore_2
    //   19: aload_1
    //   20: instanceof androidx/appcompat/app/AppCompatDelegateImpl$i
    //   23: ifne -> 36
    //   26: new androidx/appcompat/app/AppCompatDelegateImpl$i
    //   29: dup
    //   30: aload_0
    //   31: aload_1
    //   32: invokespecial <init> : (Landroidx/appcompat/app/AppCompatDelegateImpl;Lb/a/o/b$a;)V
    //   35: astore_2
    //   36: aload_0
    //   37: getfield o : Landroidx/appcompat/app/b;
    //   40: astore_1
    //   41: aload_1
    //   42: ifnull -> 63
    //   45: aload_0
    //   46: getfield T : Z
    //   49: ifne -> 63
    //   52: aload_1
    //   53: aload_2
    //   54: invokeinterface i : (Lb/a/o/b$a;)Lb/a/o/b;
    //   59: astore_1
    //   60: goto -> 65
    //   63: aconst_null
    //   64: astore_1
    //   65: aload_1
    //   66: ifnull -> 77
    //   69: aload_0
    //   70: aload_1
    //   71: putfield v : Lb/a/o/b;
    //   74: goto -> 568
    //   77: aload_0
    //   78: getfield w : Landroidx/appcompat/widget/ActionBarContextView;
    //   81: astore_1
    //   82: iconst_1
    //   83: istore_3
    //   84: aload_1
    //   85: ifnonnull -> 351
    //   88: aload_0
    //   89: getfield K : Z
    //   92: ifeq -> 311
    //   95: new android/util/TypedValue
    //   98: dup
    //   99: invokespecial <init> : ()V
    //   102: astore #4
    //   104: aload_0
    //   105: getfield l : Landroid/content/Context;
    //   108: invokevirtual getTheme : ()Landroid/content/res/Resources$Theme;
    //   111: astore_1
    //   112: aload_1
    //   113: getstatic b/a/a.actionBarTheme : I
    //   116: aload #4
    //   118: iconst_1
    //   119: invokevirtual resolveAttribute : (ILandroid/util/TypedValue;Z)Z
    //   122: pop
    //   123: aload #4
    //   125: getfield resourceId : I
    //   128: ifeq -> 185
    //   131: aload_0
    //   132: getfield l : Landroid/content/Context;
    //   135: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   138: invokevirtual newTheme : ()Landroid/content/res/Resources$Theme;
    //   141: astore #5
    //   143: aload #5
    //   145: aload_1
    //   146: invokevirtual setTo : (Landroid/content/res/Resources$Theme;)V
    //   149: aload #5
    //   151: aload #4
    //   153: getfield resourceId : I
    //   156: iconst_1
    //   157: invokevirtual applyStyle : (IZ)V
    //   160: new b/a/o/d
    //   163: dup
    //   164: aload_0
    //   165: getfield l : Landroid/content/Context;
    //   168: iconst_0
    //   169: invokespecial <init> : (Landroid/content/Context;I)V
    //   172: astore_1
    //   173: aload_1
    //   174: invokevirtual getTheme : ()Landroid/content/res/Resources$Theme;
    //   177: aload #5
    //   179: invokevirtual setTo : (Landroid/content/res/Resources$Theme;)V
    //   182: goto -> 190
    //   185: aload_0
    //   186: getfield l : Landroid/content/Context;
    //   189: astore_1
    //   190: aload_0
    //   191: new androidx/appcompat/widget/ActionBarContextView
    //   194: dup
    //   195: aload_1
    //   196: invokespecial <init> : (Landroid/content/Context;)V
    //   199: putfield w : Landroidx/appcompat/widget/ActionBarContextView;
    //   202: new android/widget/PopupWindow
    //   205: dup
    //   206: aload_1
    //   207: aconst_null
    //   208: getstatic b/a/a.actionModePopupWindowStyle : I
    //   211: invokespecial <init> : (Landroid/content/Context;Landroid/util/AttributeSet;I)V
    //   214: astore #5
    //   216: aload_0
    //   217: aload #5
    //   219: putfield x : Landroid/widget/PopupWindow;
    //   222: aload #5
    //   224: iconst_2
    //   225: invokestatic b : (Landroid/widget/PopupWindow;I)V
    //   228: aload_0
    //   229: getfield x : Landroid/widget/PopupWindow;
    //   232: aload_0
    //   233: getfield w : Landroidx/appcompat/widget/ActionBarContextView;
    //   236: invokevirtual setContentView : (Landroid/view/View;)V
    //   239: aload_0
    //   240: getfield x : Landroid/widget/PopupWindow;
    //   243: iconst_m1
    //   244: invokevirtual setWidth : (I)V
    //   247: aload_1
    //   248: invokevirtual getTheme : ()Landroid/content/res/Resources$Theme;
    //   251: getstatic b/a/a.actionBarSize : I
    //   254: aload #4
    //   256: iconst_1
    //   257: invokevirtual resolveAttribute : (ILandroid/util/TypedValue;Z)Z
    //   260: pop
    //   261: aload #4
    //   263: getfield data : I
    //   266: aload_1
    //   267: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   270: invokevirtual getDisplayMetrics : ()Landroid/util/DisplayMetrics;
    //   273: invokestatic complexToDimensionPixelSize : (ILandroid/util/DisplayMetrics;)I
    //   276: istore #6
    //   278: aload_0
    //   279: getfield w : Landroidx/appcompat/widget/ActionBarContextView;
    //   282: iload #6
    //   284: invokevirtual setContentHeight : (I)V
    //   287: aload_0
    //   288: getfield x : Landroid/widget/PopupWindow;
    //   291: bipush #-2
    //   293: invokevirtual setHeight : (I)V
    //   296: aload_0
    //   297: new androidx/appcompat/app/AppCompatDelegateImpl$f
    //   300: dup
    //   301: aload_0
    //   302: invokespecial <init> : (Landroidx/appcompat/app/AppCompatDelegateImpl;)V
    //   305: putfield y : Ljava/lang/Runnable;
    //   308: goto -> 351
    //   311: aload_0
    //   312: getfield C : Landroid/view/ViewGroup;
    //   315: getstatic b/a/f.action_mode_bar_stub : I
    //   318: invokevirtual findViewById : (I)Landroid/view/View;
    //   321: checkcast androidx/appcompat/widget/ViewStubCompat
    //   324: astore_1
    //   325: aload_1
    //   326: ifnull -> 351
    //   329: aload_1
    //   330: aload_0
    //   331: invokevirtual c0 : ()Landroid/content/Context;
    //   334: invokestatic from : (Landroid/content/Context;)Landroid/view/LayoutInflater;
    //   337: invokevirtual setLayoutInflater : (Landroid/view/LayoutInflater;)V
    //   340: aload_0
    //   341: aload_1
    //   342: invokevirtual a : ()Landroid/view/View;
    //   345: checkcast androidx/appcompat/widget/ActionBarContextView
    //   348: putfield w : Landroidx/appcompat/widget/ActionBarContextView;
    //   351: aload_0
    //   352: getfield w : Landroidx/appcompat/widget/ActionBarContextView;
    //   355: ifnull -> 568
    //   358: aload_0
    //   359: invokevirtual X : ()V
    //   362: aload_0
    //   363: getfield w : Landroidx/appcompat/widget/ActionBarContextView;
    //   366: invokevirtual k : ()V
    //   369: aload_0
    //   370: getfield w : Landroidx/appcompat/widget/ActionBarContextView;
    //   373: invokevirtual getContext : ()Landroid/content/Context;
    //   376: astore #4
    //   378: aload_0
    //   379: getfield w : Landroidx/appcompat/widget/ActionBarContextView;
    //   382: astore_1
    //   383: aload_0
    //   384: getfield x : Landroid/widget/PopupWindow;
    //   387: ifnonnull -> 393
    //   390: goto -> 395
    //   393: iconst_0
    //   394: istore_3
    //   395: new b/a/o/e
    //   398: dup
    //   399: aload #4
    //   401: aload_1
    //   402: aload_2
    //   403: iload_3
    //   404: invokespecial <init> : (Landroid/content/Context;Landroidx/appcompat/widget/ActionBarContextView;Lb/a/o/b$a;Z)V
    //   407: astore_1
    //   408: aload_2
    //   409: aload_1
    //   410: aload_1
    //   411: invokevirtual e : ()Landroid/view/Menu;
    //   414: invokeinterface b : (Lb/a/o/b;Landroid/view/Menu;)Z
    //   419: ifeq -> 563
    //   422: aload_1
    //   423: invokevirtual k : ()V
    //   426: aload_0
    //   427: getfield w : Landroidx/appcompat/widget/ActionBarContextView;
    //   430: aload_1
    //   431: invokevirtual h : (Lb/a/o/b;)V
    //   434: aload_0
    //   435: aload_1
    //   436: putfield v : Lb/a/o/b;
    //   439: aload_0
    //   440: invokevirtual F0 : ()Z
    //   443: ifeq -> 487
    //   446: aload_0
    //   447: getfield w : Landroidx/appcompat/widget/ActionBarContextView;
    //   450: fconst_0
    //   451: invokevirtual setAlpha : (F)V
    //   454: aload_0
    //   455: getfield w : Landroidx/appcompat/widget/ActionBarContextView;
    //   458: invokestatic d : (Landroid/view/View;)Lb/h/k/a0;
    //   461: fconst_1
    //   462: invokevirtual a : (F)Lb/h/k/a0;
    //   465: astore_1
    //   466: aload_0
    //   467: aload_1
    //   468: putfield z : Lb/h/k/a0;
    //   471: aload_1
    //   472: new androidx/appcompat/app/AppCompatDelegateImpl$g
    //   475: dup
    //   476: aload_0
    //   477: invokespecial <init> : (Landroidx/appcompat/app/AppCompatDelegateImpl;)V
    //   480: invokevirtual f : (Lb/h/k/b0;)Lb/h/k/a0;
    //   483: pop
    //   484: goto -> 538
    //   487: aload_0
    //   488: getfield w : Landroidx/appcompat/widget/ActionBarContextView;
    //   491: fconst_1
    //   492: invokevirtual setAlpha : (F)V
    //   495: aload_0
    //   496: getfield w : Landroidx/appcompat/widget/ActionBarContextView;
    //   499: iconst_0
    //   500: invokevirtual setVisibility : (I)V
    //   503: aload_0
    //   504: getfield w : Landroidx/appcompat/widget/ActionBarContextView;
    //   507: bipush #32
    //   509: invokevirtual sendAccessibilityEvent : (I)V
    //   512: aload_0
    //   513: getfield w : Landroidx/appcompat/widget/ActionBarContextView;
    //   516: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   519: instanceof android/view/View
    //   522: ifeq -> 538
    //   525: aload_0
    //   526: getfield w : Landroidx/appcompat/widget/ActionBarContextView;
    //   529: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   532: checkcast android/view/View
    //   535: invokestatic o0 : (Landroid/view/View;)V
    //   538: aload_0
    //   539: getfield x : Landroid/widget/PopupWindow;
    //   542: ifnull -> 568
    //   545: aload_0
    //   546: getfield m : Landroid/view/Window;
    //   549: invokevirtual getDecorView : ()Landroid/view/View;
    //   552: aload_0
    //   553: getfield y : Ljava/lang/Runnable;
    //   556: invokevirtual post : (Ljava/lang/Runnable;)Z
    //   559: pop
    //   560: goto -> 568
    //   563: aload_0
    //   564: aconst_null
    //   565: putfield v : Lb/a/o/b;
    //   568: aload_0
    //   569: getfield v : Lb/a/o/b;
    //   572: astore_2
    //   573: aload_2
    //   574: ifnull -> 593
    //   577: aload_0
    //   578: getfield o : Landroidx/appcompat/app/b;
    //   581: astore_1
    //   582: aload_1
    //   583: ifnull -> 593
    //   586: aload_1
    //   587: aload_2
    //   588: invokeinterface d : (Lb/a/o/b;)V
    //   593: aload_0
    //   594: getfield v : Lb/a/o/b;
    //   597: areturn
    //   598: astore_1
    //   599: goto -> 63
    // Exception table:
    //   from	to	target	type
    //   52	60	598	java/lang/AbstractMethodError
  }
  
  void M(int paramInt, PanelFeatureState paramPanelFeatureState, Menu paramMenu) {
    g g1;
    PanelFeatureState panelFeatureState = paramPanelFeatureState;
    Menu menu = paramMenu;
    if (paramMenu == null) {
      PanelFeatureState panelFeatureState1 = paramPanelFeatureState;
      if (paramPanelFeatureState == null) {
        panelFeatureState1 = paramPanelFeatureState;
        if (paramInt >= 0) {
          PanelFeatureState[] arrayOfPanelFeatureState = this.N;
          panelFeatureState1 = paramPanelFeatureState;
          if (paramInt < arrayOfPanelFeatureState.length)
            panelFeatureState1 = arrayOfPanelFeatureState[paramInt]; 
        } 
      } 
      panelFeatureState = panelFeatureState1;
      menu = paramMenu;
      if (panelFeatureState1 != null) {
        g1 = panelFeatureState1.j;
        panelFeatureState = panelFeatureState1;
      } 
    } 
    if (panelFeatureState != null && !panelFeatureState.o)
      return; 
    if (!this.T)
      this.n.a().onPanelClosed(paramInt, (Menu)g1); 
  }
  
  void N(g paramg) {
    if (this.M)
      return; 
    this.M = true;
    this.s.g();
    Window.Callback callback = h0();
    if (callback != null && !this.T)
      callback.onPanelClosed(108, (Menu)paramg); 
    this.M = false;
  }
  
  final int N0(e0 parame0, Rect paramRect) {
    int i;
    boolean bool2;
    int j;
    boolean bool1 = false;
    if (parame0 != null) {
      i = parame0.i();
    } else if (paramRect != null) {
      i = paramRect.top;
    } else {
      i = 0;
    } 
    ActionBarContextView actionBarContextView = this.w;
    if (actionBarContextView != null && actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
      boolean bool3;
      ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)this.w.getLayoutParams();
      boolean bool = this.w.isShown();
      int k = 1;
      bool2 = true;
      if (bool) {
        int i2;
        if (this.e0 == null) {
          this.e0 = new Rect();
          this.f0 = new Rect();
        } 
        Rect rect1 = this.e0;
        Rect rect2 = this.f0;
        if (parame0 == null) {
          rect1.set(paramRect);
        } else {
          rect1.set(parame0.g(), parame0.i(), parame0.h(), parame0.f());
        } 
        k0.a((View)this.C, rect1, rect2);
        int m = rect1.top;
        int i1 = rect1.left;
        bool3 = rect1.right;
        parame0 = w.K((View)this.C);
        if (parame0 == null) {
          k = 0;
        } else {
          k = parame0.g();
        } 
        if (parame0 == null) {
          i2 = 0;
        } else {
          i2 = parame0.h();
        } 
        if (marginLayoutParams.topMargin != m || marginLayoutParams.leftMargin != i1 || marginLayoutParams.rightMargin != bool3) {
          marginLayoutParams.topMargin = m;
          marginLayoutParams.leftMargin = i1;
          marginLayoutParams.rightMargin = bool3;
          bool3 = true;
        } else {
          bool3 = false;
        } 
        if (m > 0 && this.E == null) {
          View view2 = new View(this.l);
          this.E = view2;
          view2.setVisibility(8);
          FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
          layoutParams.leftMargin = k;
          layoutParams.rightMargin = i2;
          this.C.addView(this.E, -1, (ViewGroup.LayoutParams)layoutParams);
        } else {
          View view2 = this.E;
          if (view2 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams1 = (ViewGroup.MarginLayoutParams)view2.getLayoutParams();
            m = marginLayoutParams1.height;
            i1 = marginLayoutParams.topMargin;
            if (m != i1 || marginLayoutParams1.leftMargin != k || marginLayoutParams1.rightMargin != i2) {
              marginLayoutParams1.height = i1;
              marginLayoutParams1.leftMargin = k;
              marginLayoutParams1.rightMargin = i2;
              this.E.setLayoutParams((ViewGroup.LayoutParams)marginLayoutParams1);
            } 
          } 
        } 
        View view1 = this.E;
        if (view1 != null) {
          i2 = bool2;
        } else {
          i2 = 0;
        } 
        if (i2 != 0 && view1.getVisibility() != 0)
          O0(this.E); 
        k = i;
        if (!this.J) {
          k = i;
          if (i2 != 0)
            k = 0; 
        } 
        i = k;
        k = bool3;
        bool3 = i2;
      } else if (marginLayoutParams.topMargin != 0) {
        marginLayoutParams.topMargin = 0;
        bool3 = false;
      } else {
        bool3 = false;
        k = 0;
      } 
      j = i;
      bool2 = bool3;
      if (k != 0) {
        this.w.setLayoutParams((ViewGroup.LayoutParams)marginLayoutParams);
        j = i;
        bool2 = bool3;
      } 
    } else {
      bool2 = false;
      j = i;
    } 
    View view = this.E;
    if (view != null) {
      if (bool2) {
        i = bool1;
      } else {
        i = 8;
      } 
      view.setVisibility(i);
    } 
    return j;
  }
  
  void P(int paramInt) {
    Q(f0(paramInt, true), true);
  }
  
  void Q(PanelFeatureState paramPanelFeatureState, boolean paramBoolean) {
    if (paramBoolean && paramPanelFeatureState.a == 0) {
      androidx.appcompat.widget.o o1 = this.s;
      if (o1 != null && o1.a()) {
        N(paramPanelFeatureState.j);
        return;
      } 
    } 
    WindowManager windowManager = (WindowManager)this.l.getSystemService("window");
    if (windowManager != null && paramPanelFeatureState.o) {
      ViewGroup viewGroup = paramPanelFeatureState.g;
      if (viewGroup != null) {
        windowManager.removeView((View)viewGroup);
        if (paramBoolean)
          M(paramPanelFeatureState.a, paramPanelFeatureState, null); 
      } 
    } 
    paramPanelFeatureState.m = false;
    paramPanelFeatureState.n = false;
    paramPanelFeatureState.o = false;
    paramPanelFeatureState.h = null;
    paramPanelFeatureState.q = true;
    if (this.O == paramPanelFeatureState)
      this.O = null; 
  }
  
  public View T(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet) {
    e e1 = this.g0;
    boolean bool1 = false;
    if (e1 == null) {
      String str = this.l.obtainStyledAttributes(b.a.j.AppCompatTheme).getString(b.a.j.AppCompatTheme_viewInflaterClass);
      if (str == null) {
        this.g0 = new e();
      } else {
        try {
          this.g0 = Class.forName(str).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } finally {
          Exception exception = null;
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Failed to instantiate custom view inflater ");
          stringBuilder.append(str);
          stringBuilder.append(". Falling back to default.");
          Log.i("AppCompatDelegate", stringBuilder.toString(), exception);
        } 
      } 
    } 
    boolean bool2 = f;
    if (bool2) {
      if (this.h0 == null)
        this.h0 = new f(); 
      if (this.h0.a(paramAttributeSet)) {
        bool1 = true;
      } else if (paramAttributeSet instanceof XmlPullParser) {
        if (((XmlPullParser)paramAttributeSet).getDepth() > 1)
          bool1 = true; 
      } else {
        bool1 = G0((ViewParent)paramView);
      } 
    } else {
      bool1 = false;
    } 
    return this.g0.q(paramView, paramString, paramContext, paramAttributeSet, bool1, bool2, true, j0.b());
  }
  
  void U() {
    androidx.appcompat.widget.o o1 = this.s;
    if (o1 != null)
      o1.g(); 
    if (this.x != null) {
      this.m.getDecorView().removeCallbacks(this.y);
      if (this.x.isShowing())
        try {
          this.x.dismiss();
        } catch (IllegalArgumentException illegalArgumentException) {} 
      this.x = null;
    } 
    X();
    PanelFeatureState panelFeatureState = f0(0, false);
    if (panelFeatureState != null) {
      g g1 = panelFeatureState.j;
      if (g1 != null)
        g1.close(); 
    } 
  }
  
  boolean V(KeyEvent paramKeyEvent) {
    Object object = this.k;
    boolean bool = object instanceof b.h.k.f.a;
    boolean bool1 = true;
    if (bool || object instanceof d) {
      object = this.m.getDecorView();
      if (object != null && b.h.k.f.d((View)object, paramKeyEvent))
        return true; 
    } 
    if (paramKeyEvent.getKeyCode() == 82 && this.n.a().dispatchKeyEvent(paramKeyEvent))
      return true; 
    int i = paramKeyEvent.getKeyCode();
    if (paramKeyEvent.getAction() != 0)
      bool1 = false; 
    if (bool1) {
      bool = r0(i, paramKeyEvent);
    } else {
      bool = u0(i, paramKeyEvent);
    } 
    return bool;
  }
  
  void W(int paramInt) {
    PanelFeatureState panelFeatureState = f0(paramInt, true);
    if (panelFeatureState.j != null) {
      Bundle bundle = new Bundle();
      panelFeatureState.j.T(bundle);
      if (bundle.size() > 0)
        panelFeatureState.s = bundle; 
      panelFeatureState.j.h0();
      panelFeatureState.j.clear();
    } 
    panelFeatureState.r = true;
    panelFeatureState.q = true;
    if ((paramInt == 108 || paramInt == 0) && this.s != null) {
      panelFeatureState = f0(0, false);
      if (panelFeatureState != null) {
        panelFeatureState.m = false;
        C0(panelFeatureState, null);
      } 
    } 
  }
  
  void X() {
    a0 a01 = this.z;
    if (a01 != null)
      a01.b(); 
  }
  
  public boolean a(g paramg, MenuItem paramMenuItem) {
    Window.Callback callback = h0();
    if (callback != null && !this.T) {
      PanelFeatureState panelFeatureState = a0((Menu)paramg.F());
      if (panelFeatureState != null)
        return callback.onMenuItemSelected(panelFeatureState.a, paramMenuItem); 
    } 
    return false;
  }
  
  PanelFeatureState a0(Menu paramMenu) {
    byte b2;
    PanelFeatureState[] arrayOfPanelFeatureState = this.N;
    byte b1 = 0;
    if (arrayOfPanelFeatureState != null) {
      b2 = arrayOfPanelFeatureState.length;
    } else {
      b2 = 0;
    } 
    while (b1 < b2) {
      PanelFeatureState panelFeatureState = arrayOfPanelFeatureState[b1];
      if (panelFeatureState != null && panelFeatureState.j == paramMenu)
        return panelFeatureState; 
      b1++;
    } 
    return null;
  }
  
  public void b(g paramg) {
    D0(true);
  }
  
  final Context c0() {
    Context context;
    ActionBar actionBar1 = o();
    if (actionBar1 != null) {
      Context context1 = actionBar1.j();
    } else {
      actionBar1 = null;
    } 
    ActionBar actionBar2 = actionBar1;
    if (actionBar1 == null)
      context = this.l; 
    return context;
  }
  
  public void d(View paramView, ViewGroup.LayoutParams paramLayoutParams) {
    Y();
    ((ViewGroup)this.C.findViewById(16908290)).addView(paramView, paramLayoutParams);
    this.n.a().onContentChanged();
  }
  
  public boolean e() {
    return I(true);
  }
  
  protected PanelFeatureState f0(int paramInt, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: getfield N : [Landroidx/appcompat/app/AppCompatDelegateImpl$PanelFeatureState;
    //   4: astore_3
    //   5: aload_3
    //   6: ifnull -> 18
    //   9: aload_3
    //   10: astore #4
    //   12: aload_3
    //   13: arraylength
    //   14: iload_1
    //   15: if_icmpgt -> 46
    //   18: iload_1
    //   19: iconst_1
    //   20: iadd
    //   21: anewarray androidx/appcompat/app/AppCompatDelegateImpl$PanelFeatureState
    //   24: astore #4
    //   26: aload_3
    //   27: ifnull -> 40
    //   30: aload_3
    //   31: iconst_0
    //   32: aload #4
    //   34: iconst_0
    //   35: aload_3
    //   36: arraylength
    //   37: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   40: aload_0
    //   41: aload #4
    //   43: putfield N : [Landroidx/appcompat/app/AppCompatDelegateImpl$PanelFeatureState;
    //   46: aload #4
    //   48: iload_1
    //   49: aaload
    //   50: astore #5
    //   52: aload #5
    //   54: astore_3
    //   55: aload #5
    //   57: ifnonnull -> 74
    //   60: new androidx/appcompat/app/AppCompatDelegateImpl$PanelFeatureState
    //   63: dup
    //   64: iload_1
    //   65: invokespecial <init> : (I)V
    //   68: astore_3
    //   69: aload #4
    //   71: iload_1
    //   72: aload_3
    //   73: aastore
    //   74: aload_3
    //   75: areturn
  }
  
  final CharSequence g0() {
    Object object = this.k;
    return (object instanceof Activity) ? ((Activity)object).getTitle() : this.r;
  }
  
  public Context h(Context paramContext) {
    int i = 1;
    this.Q = true;
    int j = p0(paramContext, L());
    boolean bool = i;
    Configuration configuration1 = null;
    if (bool && paramContext instanceof ContextThemeWrapper) {
      Configuration configuration = R(paramContext, j, null);
      try {
        r.a((ContextThemeWrapper)paramContext, configuration);
        return paramContext;
      } catch (IllegalStateException illegalStateException) {}
    } 
    if (paramContext instanceof b.a.o.d) {
      Configuration configuration = R(paramContext, j, null);
      try {
        ((b.a.o.d)paramContext).a(configuration);
        return paramContext;
      } catch (IllegalStateException illegalStateException) {}
    } 
    if (!h)
      return super.h(paramContext); 
    Configuration configuration2 = configuration1;
    if (Build.VERSION.SDK_INT >= 17) {
      configuration2 = new Configuration();
      configuration2.uiMode = -1;
      configuration2.fontScale = 0.0F;
      Configuration configuration3 = j.a(paramContext, configuration2).getResources().getConfiguration();
      Configuration configuration4 = paramContext.getResources().getConfiguration();
      configuration3.uiMode = configuration4.uiMode;
      configuration2 = configuration1;
      if (!configuration3.equals(configuration4))
        configuration2 = b0(configuration3, configuration4); 
    } 
    configuration1 = R(paramContext, j, configuration2);
    b.a.o.d d = new b.a.o.d(paramContext, b.a.i.Theme_AppCompat_Empty);
    d.a(configuration1);
    j = 0;
    try {
      Resources.Theme theme = paramContext.getTheme();
      if (theme == null)
        i = 0; 
    } catch (NullPointerException nullPointerException) {
      i = j;
    } 
    if (i != 0)
      androidx.core.content.d.f.b.a(d.getTheme()); 
    return super.h((Context)d);
  }
  
  final Window.Callback h0() {
    return this.m.getCallback();
  }
  
  public <T extends View> T k(int paramInt) {
    Y();
    return (T)this.m.findViewById(paramInt);
  }
  
  public int m() {
    return this.U;
  }
  
  public MenuInflater n() {
    if (this.q == null) {
      Context context;
      i0();
      ActionBar actionBar = this.p;
      if (actionBar != null) {
        context = actionBar.j();
      } else {
        context = this.l;
      } 
      this.q = (MenuInflater)new b.a.o.g(context);
    } 
    return this.q;
  }
  
  public ActionBar o() {
    i0();
    return this.p;
  }
  
  public boolean o0() {
    return this.A;
  }
  
  public final View onCreateView(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet) {
    return T(paramView, paramString, paramContext, paramAttributeSet);
  }
  
  public View onCreateView(String paramString, Context paramContext, AttributeSet paramAttributeSet) {
    return onCreateView(null, paramString, paramContext, paramAttributeSet);
  }
  
  public void p() {
    LayoutInflater layoutInflater = LayoutInflater.from(this.l);
    if (layoutInflater.getFactory() == null) {
      b.h.k.g.b(layoutInflater, this);
    } else if (!(layoutInflater.getFactory2() instanceof AppCompatDelegateImpl)) {
      Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
    } 
  }
  
  int p0(Context paramContext, int paramInt) {
    if (paramInt != -100) {
      if (paramInt != -1)
        if (paramInt != 0) {
          if (paramInt != 1 && paramInt != 2) {
            if (paramInt == 3)
              return d0(paramContext).c(); 
            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
          } 
        } else {
          return (Build.VERSION.SDK_INT >= 23 && ((UiModeManager)paramContext.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) ? -1 : e0(paramContext).c();
        }  
      return paramInt;
    } 
    return -1;
  }
  
  public void q() {
    ActionBar actionBar = o();
    if (actionBar != null && actionBar.k())
      return; 
    m0(0);
  }
  
  boolean q0() {
    b.a.o.b b1 = this.v;
    if (b1 != null) {
      b1.c();
      return true;
    } 
    ActionBar actionBar = o();
    return (actionBar != null && actionBar.g());
  }
  
  public void r(Configuration paramConfiguration) {
    if (this.H && this.B) {
      ActionBar actionBar = o();
      if (actionBar != null)
        actionBar.l(paramConfiguration); 
    } 
    androidx.appcompat.widget.f.b().g(this.l);
    I(false);
  }
  
  boolean r0(int paramInt, KeyEvent paramKeyEvent) {
    boolean bool = true;
    if (paramInt != 4) {
      if (paramInt == 82) {
        s0(0, paramKeyEvent);
        return true;
      } 
    } else {
      if ((paramKeyEvent.getFlags() & 0x80) == 0)
        bool = false; 
      this.P = bool;
    } 
    return false;
  }
  
  public void s(Bundle paramBundle) {
    this.Q = true;
    I(false);
    Z();
    Object object = this.k;
    if (object instanceof Activity) {
      Object object1;
      paramBundle = null;
      try {
        object = androidx.core.app.g.c((Activity)object);
        object1 = object;
      } catch (IllegalArgumentException illegalArgumentException) {}
      if (object1 != null) {
        object1 = A0();
        if (object1 == null) {
          this.d0 = true;
        } else {
          object1.q(true);
        } 
      } 
      c.c(this);
    } 
    this.R = true;
  }
  
  public void t() {
    // Byte code:
    //   0: aload_0
    //   1: getfield k : Ljava/lang/Object;
    //   4: instanceof android/app/Activity
    //   7: ifeq -> 14
    //   10: aload_0
    //   11: invokestatic z : (Landroidx/appcompat/app/c;)V
    //   14: aload_0
    //   15: getfield a0 : Z
    //   18: ifeq -> 36
    //   21: aload_0
    //   22: getfield m : Landroid/view/Window;
    //   25: invokevirtual getDecorView : ()Landroid/view/View;
    //   28: aload_0
    //   29: getfield c0 : Ljava/lang/Runnable;
    //   32: invokevirtual removeCallbacks : (Ljava/lang/Runnable;)Z
    //   35: pop
    //   36: aload_0
    //   37: iconst_0
    //   38: putfield S : Z
    //   41: aload_0
    //   42: iconst_1
    //   43: putfield T : Z
    //   46: aload_0
    //   47: getfield U : I
    //   50: bipush #-100
    //   52: if_icmpeq -> 104
    //   55: aload_0
    //   56: getfield k : Ljava/lang/Object;
    //   59: astore_1
    //   60: aload_1
    //   61: instanceof android/app/Activity
    //   64: ifeq -> 104
    //   67: aload_1
    //   68: checkcast android/app/Activity
    //   71: invokevirtual isChangingConfigurations : ()Z
    //   74: ifeq -> 104
    //   77: getstatic androidx/appcompat/app/AppCompatDelegateImpl.e : Lb/e/g;
    //   80: aload_0
    //   81: getfield k : Ljava/lang/Object;
    //   84: invokevirtual getClass : ()Ljava/lang/Class;
    //   87: invokevirtual getName : ()Ljava/lang/String;
    //   90: aload_0
    //   91: getfield U : I
    //   94: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   97: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   100: pop
    //   101: goto -> 121
    //   104: getstatic androidx/appcompat/app/AppCompatDelegateImpl.e : Lb/e/g;
    //   107: aload_0
    //   108: getfield k : Ljava/lang/Object;
    //   111: invokevirtual getClass : ()Ljava/lang/Class;
    //   114: invokevirtual getName : ()Ljava/lang/String;
    //   117: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   120: pop
    //   121: aload_0
    //   122: getfield p : Landroidx/appcompat/app/ActionBar;
    //   125: astore_1
    //   126: aload_1
    //   127: ifnull -> 134
    //   130: aload_1
    //   131: invokevirtual m : ()V
    //   134: aload_0
    //   135: invokespecial O : ()V
    //   138: return
  }
  
  boolean t0(int paramInt, KeyEvent paramKeyEvent) {
    PanelFeatureState panelFeatureState1;
    ActionBar actionBar = o();
    if (actionBar != null && actionBar.n(paramInt, paramKeyEvent))
      return true; 
    PanelFeatureState panelFeatureState2 = this.O;
    if (panelFeatureState2 != null && B0(panelFeatureState2, paramKeyEvent.getKeyCode(), paramKeyEvent, 1)) {
      panelFeatureState1 = this.O;
      if (panelFeatureState1 != null)
        panelFeatureState1.n = true; 
      return true;
    } 
    if (this.O == null) {
      panelFeatureState2 = f0(0, true);
      C0(panelFeatureState2, (KeyEvent)panelFeatureState1);
      boolean bool = B0(panelFeatureState2, panelFeatureState1.getKeyCode(), (KeyEvent)panelFeatureState1, 1);
      panelFeatureState2.m = false;
      if (bool)
        return true; 
    } 
    return false;
  }
  
  public void u(Bundle paramBundle) {
    Y();
  }
  
  boolean u0(int paramInt, KeyEvent paramKeyEvent) {
    if (paramInt != 4) {
      if (paramInt == 82) {
        v0(0, paramKeyEvent);
        return true;
      } 
    } else {
      boolean bool = this.P;
      this.P = false;
      PanelFeatureState panelFeatureState = f0(0, false);
      if (panelFeatureState != null && panelFeatureState.o) {
        if (!bool)
          Q(panelFeatureState, true); 
        return true;
      } 
      if (q0())
        return true; 
    } 
    return false;
  }
  
  public void v() {
    ActionBar actionBar = o();
    if (actionBar != null)
      actionBar.r(true); 
  }
  
  public void w(Bundle paramBundle) {}
  
  void w0(int paramInt) {
    if (paramInt == 108) {
      ActionBar actionBar = o();
      if (actionBar != null)
        actionBar.h(true); 
    } 
  }
  
  public void x() {
    this.S = true;
    e();
  }
  
  void x0(int paramInt) {
    if (paramInt == 108) {
      ActionBar actionBar = o();
      if (actionBar != null)
        actionBar.h(false); 
    } else if (paramInt == 0) {
      PanelFeatureState panelFeatureState = f0(paramInt, true);
      if (panelFeatureState.o)
        Q(panelFeatureState, false); 
    } 
  }
  
  public void y() {
    this.S = false;
    ActionBar actionBar = o();
    if (actionBar != null)
      actionBar.r(false); 
  }
  
  void y0(ViewGroup paramViewGroup) {}
  
  static {
    boolean bool2;
  }
  
  static {
    int i = Build.VERSION.SDK_INT;
    boolean bool1 = false;
    if (i < 21) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    f = bool2;
  }
  
  protected static final class PanelFeatureState {
    int a;
    
    int b;
    
    int c;
    
    int d;
    
    int e;
    
    int f;
    
    ViewGroup g;
    
    View h;
    
    View i;
    
    g j;
    
    androidx.appcompat.view.menu.e k;
    
    Context l;
    
    boolean m;
    
    boolean n;
    
    boolean o;
    
    public boolean p;
    
    boolean q;
    
    boolean r;
    
    Bundle s;
    
    PanelFeatureState(int param1Int) {
      this.a = param1Int;
      this.q = false;
    }
    
    androidx.appcompat.view.menu.n a(androidx.appcompat.view.menu.m.a param1a) {
      if (this.j == null)
        return null; 
      if (this.k == null) {
        androidx.appcompat.view.menu.e e1 = new androidx.appcompat.view.menu.e(this.l, b.a.g.abc_list_menu_item_layout);
        this.k = e1;
        e1.g(param1a);
        this.j.b((androidx.appcompat.view.menu.m)this.k);
      } 
      return this.k.l(this.g);
    }
    
    public boolean b() {
      View view = this.h;
      boolean bool = false;
      if (view == null)
        return false; 
      if (this.i != null)
        return true; 
      if (this.k.a().getCount() > 0)
        bool = true; 
      return bool;
    }
    
    void c(g param1g) {
      g g1 = this.j;
      if (param1g == g1)
        return; 
      if (g1 != null)
        g1.Q((androidx.appcompat.view.menu.m)this.k); 
      this.j = param1g;
      if (param1g != null) {
        androidx.appcompat.view.menu.e e1 = this.k;
        if (e1 != null)
          param1g.b((androidx.appcompat.view.menu.m)e1); 
      } 
    }
    
    void d(Context param1Context) {
      TypedValue typedValue = new TypedValue();
      Resources.Theme theme = param1Context.getResources().newTheme();
      theme.setTo(param1Context.getTheme());
      theme.resolveAttribute(b.a.a.actionBarPopupTheme, typedValue, true);
      int i = typedValue.resourceId;
      if (i != 0)
        theme.applyStyle(i, true); 
      theme.resolveAttribute(b.a.a.panelMenuListTheme, typedValue, true);
      i = typedValue.resourceId;
      if (i != 0) {
        theme.applyStyle(i, true);
      } else {
        theme.applyStyle(b.a.i.Theme_AppCompat_CompactMenu, true);
      } 
      b.a.o.d d = new b.a.o.d(param1Context, 0);
      d.getTheme().setTo(theme);
      this.l = (Context)d;
      TypedArray typedArray = d.obtainStyledAttributes(b.a.j.AppCompatTheme);
      this.b = typedArray.getResourceId(b.a.j.AppCompatTheme_panelBackground, 0);
      this.f = typedArray.getResourceId(b.a.j.AppCompatTheme_android_windowAnimationStyle, 0);
      typedArray.recycle();
    }
    
    @SuppressLint({"BanParcelableUsage"})
    private static class SavedState implements Parcelable {
      public static final Parcelable.Creator<SavedState> CREATOR = (Parcelable.Creator<SavedState>)new a();
      
      int b;
      
      boolean c;
      
      Bundle d;
      
      static SavedState a(Parcel param2Parcel, ClassLoader param2ClassLoader) {
        SavedState savedState = new SavedState();
        savedState.b = param2Parcel.readInt();
        int i = param2Parcel.readInt();
        boolean bool = true;
        if (i != 1)
          bool = false; 
        savedState.c = bool;
        if (bool)
          savedState.d = param2Parcel.readBundle(param2ClassLoader); 
        return savedState;
      }
      
      public int describeContents() {
        return 0;
      }
      
      public void writeToParcel(Parcel param2Parcel, int param2Int) {
        param2Parcel.writeInt(this.b);
        param2Parcel.writeInt(this.c);
        if (this.c)
          param2Parcel.writeBundle(this.d); 
      }
      
      class a implements Parcelable.ClassLoaderCreator<SavedState> {
        public AppCompatDelegateImpl.PanelFeatureState.SavedState a(Parcel param3Parcel) {
          return AppCompatDelegateImpl.PanelFeatureState.SavedState.a(param3Parcel, null);
        }
        
        public AppCompatDelegateImpl.PanelFeatureState.SavedState b(Parcel param3Parcel, ClassLoader param3ClassLoader) {
          return AppCompatDelegateImpl.PanelFeatureState.SavedState.a(param3Parcel, param3ClassLoader);
        }
        
        public AppCompatDelegateImpl.PanelFeatureState.SavedState[] c(int param3Int) {
          return new AppCompatDelegateImpl.PanelFeatureState.SavedState[param3Int];
        }
      }
    }
    
    class a implements Parcelable.ClassLoaderCreator<SavedState> {
      public AppCompatDelegateImpl.PanelFeatureState.SavedState a(Parcel param2Parcel) {
        return AppCompatDelegateImpl.PanelFeatureState.SavedState.a(param2Parcel, null);
      }
      
      public AppCompatDelegateImpl.PanelFeatureState.SavedState b(Parcel param2Parcel, ClassLoader param2ClassLoader) {
        return AppCompatDelegateImpl.PanelFeatureState.SavedState.a(param2Parcel, param2ClassLoader);
      }
      
      public AppCompatDelegateImpl.PanelFeatureState.SavedState[] c(int param2Int) {
        return new AppCompatDelegateImpl.PanelFeatureState.SavedState[param2Int];
      }
    }
  }
  
  @SuppressLint({"BanParcelableUsage"})
  private static class SavedState implements Parcelable {
    public static final Parcelable.Creator<SavedState> CREATOR = (Parcelable.Creator<SavedState>)new a();
    
    int b;
    
    boolean c;
    
    Bundle d;
    
    static SavedState a(Parcel param1Parcel, ClassLoader param1ClassLoader) {
      SavedState savedState = new SavedState();
      savedState.b = param1Parcel.readInt();
      int i = param1Parcel.readInt();
      boolean bool = true;
      if (i != 1)
        bool = false; 
      savedState.c = bool;
      if (bool)
        savedState.d = param1Parcel.readBundle(param1ClassLoader); 
      return savedState;
    }
    
    public int describeContents() {
      return 0;
    }
    
    public void writeToParcel(Parcel param1Parcel, int param1Int) {
      param1Parcel.writeInt(this.b);
      param1Parcel.writeInt(this.c);
      if (this.c)
        param1Parcel.writeBundle(this.d); 
    }
    
    class a implements Parcelable.ClassLoaderCreator<SavedState> {
      public AppCompatDelegateImpl.PanelFeatureState.SavedState a(Parcel param3Parcel) {
        return AppCompatDelegateImpl.PanelFeatureState.SavedState.a(param3Parcel, null);
      }
      
      public AppCompatDelegateImpl.PanelFeatureState.SavedState b(Parcel param3Parcel, ClassLoader param3ClassLoader) {
        return AppCompatDelegateImpl.PanelFeatureState.SavedState.a(param3Parcel, param3ClassLoader);
      }
      
      public AppCompatDelegateImpl.PanelFeatureState.SavedState[] c(int param3Int) {
        return new AppCompatDelegateImpl.PanelFeatureState.SavedState[param3Int];
      }
    }
  }
  
  class a implements Parcelable.ClassLoaderCreator<PanelFeatureState.SavedState> {
    public AppCompatDelegateImpl.PanelFeatureState.SavedState a(Parcel param1Parcel) {
      return AppCompatDelegateImpl.PanelFeatureState.SavedState.a(param1Parcel, null);
    }
    
    public AppCompatDelegateImpl.PanelFeatureState.SavedState b(Parcel param1Parcel, ClassLoader param1ClassLoader) {
      return AppCompatDelegateImpl.PanelFeatureState.SavedState.a(param1Parcel, param1ClassLoader);
    }
    
    public AppCompatDelegateImpl.PanelFeatureState.SavedState[] c(int param1Int) {
      return new AppCompatDelegateImpl.PanelFeatureState.SavedState[param1Int];
    }
  }
  
  class a implements Thread.UncaughtExceptionHandler {
    a(AppCompatDelegateImpl this$0) {}
    
    private boolean a(Throwable param1Throwable) {
      boolean bool = param1Throwable instanceof Resources.NotFoundException;
      boolean bool1 = false;
      null = bool1;
      if (bool) {
        String str = param1Throwable.getMessage();
        null = bool1;
        if (str != null) {
          if (!str.contains("drawable")) {
            null = bool1;
            return str.contains("Drawable") ? true : null;
          } 
        } else {
          return null;
        } 
      } else {
        return null;
      } 
      return true;
    }
    
    public void uncaughtException(Thread param1Thread, Throwable param1Throwable) {
      if (a(param1Throwable)) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(param1Throwable.getMessage());
        stringBuilder.append(". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
        Resources.NotFoundException notFoundException = new Resources.NotFoundException(stringBuilder.toString());
        notFoundException.initCause(param1Throwable.getCause());
        notFoundException.setStackTrace(param1Throwable.getStackTrace());
        this.a.uncaughtException(param1Thread, (Throwable)notFoundException);
      } else {
        this.a.uncaughtException(param1Thread, param1Throwable);
      } 
    }
  }
  
  class b implements Runnable {
    b(AppCompatDelegateImpl this$0) {}
    
    public void run() {
      AppCompatDelegateImpl appCompatDelegateImpl = this.b;
      if ((appCompatDelegateImpl.b0 & 0x1) != 0)
        appCompatDelegateImpl.W(0); 
      appCompatDelegateImpl = this.b;
      if ((appCompatDelegateImpl.b0 & 0x1000) != 0)
        appCompatDelegateImpl.W(108); 
      appCompatDelegateImpl = this.b;
      appCompatDelegateImpl.a0 = false;
      appCompatDelegateImpl.b0 = 0;
    }
  }
  
  class c implements b.h.k.q {
    c(AppCompatDelegateImpl this$0) {}
    
    public e0 a(View param1View, e0 param1e0) {
      int i = param1e0.i();
      int j = this.a.N0(param1e0, null);
      e0 e01 = param1e0;
      if (i != j)
        e01 = param1e0.n(param1e0.g(), j, param1e0.h(), param1e0.f()); 
      return w.c0(param1View, e01);
    }
  }
  
  class d implements androidx.appcompat.widget.s.a {
    d(AppCompatDelegateImpl this$0) {}
    
    public void a(Rect param1Rect) {
      param1Rect.top = this.a.N0(null, param1Rect);
    }
  }
  
  class e implements ContentFrameLayout.a {
    e(AppCompatDelegateImpl this$0) {}
    
    public void a() {}
    
    public void onDetachedFromWindow() {
      this.a.U();
    }
  }
  
  class f implements Runnable {
    f(AppCompatDelegateImpl this$0) {}
    
    public void run() {
      AppCompatDelegateImpl appCompatDelegateImpl = this.b;
      appCompatDelegateImpl.x.showAtLocation((View)appCompatDelegateImpl.w, 55, 0, 0);
      this.b.X();
      if (this.b.F0()) {
        this.b.w.setAlpha(0.0F);
        appCompatDelegateImpl = this.b;
        appCompatDelegateImpl.z = w.d((View)appCompatDelegateImpl.w).a(1.0F);
        this.b.z.f((b0)new a(this));
      } else {
        this.b.w.setAlpha(1.0F);
        this.b.w.setVisibility(0);
      } 
    }
    
    class a extends c0 {
      a(AppCompatDelegateImpl.f this$0) {}
      
      public void b(View param2View) {
        this.a.b.w.setAlpha(1.0F);
        this.a.b.z.f(null);
        this.a.b.z = null;
      }
      
      public void c(View param2View) {
        this.a.b.w.setVisibility(0);
      }
    }
  }
  
  class a extends c0 {
    a(AppCompatDelegateImpl this$0) {}
    
    public void b(View param1View) {
      this.a.b.w.setAlpha(1.0F);
      this.a.b.z.f(null);
      this.a.b.z = null;
    }
    
    public void c(View param1View) {
      this.a.b.w.setVisibility(0);
    }
  }
  
  class g extends c0 {
    g(AppCompatDelegateImpl this$0) {}
    
    public void b(View param1View) {
      this.a.w.setAlpha(1.0F);
      this.a.z.f(null);
      this.a.z = null;
    }
    
    public void c(View param1View) {
      this.a.w.setVisibility(0);
      this.a.w.sendAccessibilityEvent(32);
      if (this.a.w.getParent() instanceof View)
        w.o0((View)this.a.w.getParent()); 
    }
  }
  
  private final class h implements androidx.appcompat.view.menu.m.a {
    h(AppCompatDelegateImpl this$0) {}
    
    public void b(g param1g, boolean param1Boolean) {
      this.b.N(param1g);
    }
    
    public boolean c(g param1g) {
      Window.Callback callback = this.b.h0();
      if (callback != null)
        callback.onMenuOpened(108, (Menu)param1g); 
      return true;
    }
  }
  
  class i implements b.a.o.b.a {
    private b.a.o.b.a a;
    
    public i(AppCompatDelegateImpl this$0, b.a.o.b.a param1a) {
      this.a = param1a;
    }
    
    public void a(b.a.o.b param1b) {
      this.a.a(param1b);
      AppCompatDelegateImpl appCompatDelegateImpl2 = this.b;
      if (appCompatDelegateImpl2.x != null)
        appCompatDelegateImpl2.m.getDecorView().removeCallbacks(this.b.y); 
      appCompatDelegateImpl2 = this.b;
      if (appCompatDelegateImpl2.w != null) {
        appCompatDelegateImpl2.X();
        appCompatDelegateImpl2 = this.b;
        appCompatDelegateImpl2.z = w.d((View)appCompatDelegateImpl2.w).a(0.0F);
        this.b.z.f((b0)new a(this));
      } 
      AppCompatDelegateImpl appCompatDelegateImpl3 = this.b;
      b b1 = appCompatDelegateImpl3.o;
      if (b1 != null)
        b1.e(appCompatDelegateImpl3.v); 
      AppCompatDelegateImpl appCompatDelegateImpl1 = this.b;
      appCompatDelegateImpl1.v = null;
      w.o0((View)appCompatDelegateImpl1.C);
    }
    
    public boolean b(b.a.o.b param1b, Menu param1Menu) {
      return this.a.b(param1b, param1Menu);
    }
    
    public boolean c(b.a.o.b param1b, Menu param1Menu) {
      w.o0((View)this.b.C);
      return this.a.c(param1b, param1Menu);
    }
    
    public boolean d(b.a.o.b param1b, MenuItem param1MenuItem) {
      return this.a.d(param1b, param1MenuItem);
    }
    
    class a extends c0 {
      a(AppCompatDelegateImpl.i this$0) {}
      
      public void b(View param2View) {
        this.a.b.w.setVisibility(8);
        AppCompatDelegateImpl appCompatDelegateImpl = this.a.b;
        PopupWindow popupWindow = appCompatDelegateImpl.x;
        if (popupWindow != null) {
          popupWindow.dismiss();
        } else if (appCompatDelegateImpl.w.getParent() instanceof View) {
          w.o0((View)this.a.b.w.getParent());
        } 
        this.a.b.w.k();
        this.a.b.z.f(null);
        appCompatDelegateImpl = this.a.b;
        appCompatDelegateImpl.z = null;
        w.o0((View)appCompatDelegateImpl.C);
      }
    }
  }
  
  class a extends c0 {
    a(AppCompatDelegateImpl this$0) {}
    
    public void b(View param1View) {
      this.a.b.w.setVisibility(8);
      AppCompatDelegateImpl appCompatDelegateImpl = this.a.b;
      PopupWindow popupWindow = appCompatDelegateImpl.x;
      if (popupWindow != null) {
        popupWindow.dismiss();
      } else if (appCompatDelegateImpl.w.getParent() instanceof View) {
        w.o0((View)this.a.b.w.getParent());
      } 
      this.a.b.w.k();
      this.a.b.z.f(null);
      appCompatDelegateImpl = this.a.b;
      appCompatDelegateImpl.z = null;
      w.o0((View)appCompatDelegateImpl.C);
    }
  }
  
  static class j {
    static Context a(Context param1Context, Configuration param1Configuration) {
      return param1Context.createConfigurationContext(param1Configuration);
    }
    
    static void b(Configuration param1Configuration1, Configuration param1Configuration2, Configuration param1Configuration3) {
      int i = param1Configuration1.densityDpi;
      int k = param1Configuration2.densityDpi;
      if (i != k)
        param1Configuration3.densityDpi = k; 
    }
  }
  
  static class k {
    static boolean a(PowerManager param1PowerManager) {
      return param1PowerManager.isPowerSaveMode();
    }
  }
  
  static class l {
    static void a(Configuration param1Configuration1, Configuration param1Configuration2, Configuration param1Configuration3) {
      LocaleList localeList1 = param1Configuration1.getLocales();
      LocaleList localeList2 = param1Configuration2.getLocales();
      if (!localeList1.equals(localeList2)) {
        param1Configuration3.setLocales(localeList2);
        param1Configuration3.locale = param1Configuration2.locale;
      } 
    }
  }
  
  static class m {
    static void a(Configuration param1Configuration1, Configuration param1Configuration2, Configuration param1Configuration3) {
      int i = param1Configuration1.colorMode;
      int j = param1Configuration2.colorMode;
      if ((i & 0x3) != (j & 0x3))
        param1Configuration3.colorMode |= j & 0x3; 
      j = param1Configuration1.colorMode;
      i = param1Configuration2.colorMode;
      if ((j & 0xC) != (i & 0xC))
        param1Configuration3.colorMode |= i & 0xC; 
    }
  }
  
  class n extends b.a.o.i {
    n(AppCompatDelegateImpl this$0, Window.Callback param1Callback) {
      super(param1Callback);
    }
    
    final ActionMode b(ActionMode.Callback param1Callback) {
      b.a.o.f.a a = new b.a.o.f.a(this.c.l, param1Callback);
      b.a.o.b b = this.c.H0((b.a.o.b.a)a);
      return (b != null) ? a.e(b) : null;
    }
    
    public boolean dispatchKeyEvent(KeyEvent param1KeyEvent) {
      return (this.c.V(param1KeyEvent) || super.dispatchKeyEvent(param1KeyEvent));
    }
    
    public boolean dispatchKeyShortcutEvent(KeyEvent param1KeyEvent) {
      return (super.dispatchKeyShortcutEvent(param1KeyEvent) || this.c.t0(param1KeyEvent.getKeyCode(), param1KeyEvent));
    }
    
    public void onContentChanged() {}
    
    public boolean onCreatePanelMenu(int param1Int, Menu param1Menu) {
      return (param1Int == 0 && !(param1Menu instanceof g)) ? false : super.onCreatePanelMenu(param1Int, param1Menu);
    }
    
    public boolean onMenuOpened(int param1Int, Menu param1Menu) {
      super.onMenuOpened(param1Int, param1Menu);
      this.c.w0(param1Int);
      return true;
    }
    
    public void onPanelClosed(int param1Int, Menu param1Menu) {
      super.onPanelClosed(param1Int, param1Menu);
      this.c.x0(param1Int);
    }
    
    public boolean onPreparePanel(int param1Int, View param1View, Menu param1Menu) {
      g g;
      if (param1Menu instanceof g) {
        g = (g)param1Menu;
      } else {
        g = null;
      } 
      if (param1Int == 0 && g == null)
        return false; 
      if (g != null)
        g.e0(true); 
      boolean bool = super.onPreparePanel(param1Int, param1View, param1Menu);
      if (g != null)
        g.e0(false); 
      return bool;
    }
    
    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> param1List, Menu param1Menu, int param1Int) {
      AppCompatDelegateImpl.PanelFeatureState panelFeatureState = this.c.f0(0, true);
      if (panelFeatureState != null) {
        g g = panelFeatureState.j;
        if (g != null) {
          super.onProvideKeyboardShortcuts(param1List, (Menu)g, param1Int);
          return;
        } 
      } 
      super.onProvideKeyboardShortcuts(param1List, param1Menu, param1Int);
    }
    
    public ActionMode onWindowStartingActionMode(ActionMode.Callback param1Callback) {
      return (Build.VERSION.SDK_INT >= 23) ? null : (this.c.o0() ? b(param1Callback) : super.onWindowStartingActionMode(param1Callback));
    }
    
    public ActionMode onWindowStartingActionMode(ActionMode.Callback param1Callback, int param1Int) {
      return (!this.c.o0() || param1Int != 0) ? super.onWindowStartingActionMode(param1Callback, param1Int) : b(param1Callback);
    }
  }
  
  private class o extends p {
    private final PowerManager c;
    
    o(AppCompatDelegateImpl this$0, Context param1Context) {
      super(this$0);
      this.c = (PowerManager)param1Context.getApplicationContext().getSystemService("power");
    }
    
    IntentFilter b() {
      if (Build.VERSION.SDK_INT >= 21) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        return intentFilter;
      } 
      return null;
    }
    
    public int c() {
      int i = Build.VERSION.SDK_INT;
      byte b1 = 1;
      byte b2 = b1;
      if (i >= 21) {
        b2 = b1;
        if (AppCompatDelegateImpl.k.a(this.c))
          b2 = 2; 
      } 
      return b2;
    }
    
    public void d() {
      this.d.e();
    }
  }
  
  abstract class p {
    private BroadcastReceiver a;
    
    p(AppCompatDelegateImpl this$0) {}
    
    void a() {
      BroadcastReceiver broadcastReceiver = this.a;
      if (broadcastReceiver != null) {
        try {
          this.b.l.unregisterReceiver(broadcastReceiver);
        } catch (IllegalArgumentException illegalArgumentException) {}
        this.a = null;
      } 
    }
    
    abstract IntentFilter b();
    
    abstract int c();
    
    abstract void d();
    
    void e() {
      a();
      IntentFilter intentFilter = b();
      if (intentFilter != null && intentFilter.countActions() != 0) {
        if (this.a == null)
          this.a = new a(this); 
        this.b.l.registerReceiver(this.a, intentFilter);
      } 
    }
    
    class a extends BroadcastReceiver {
      a(AppCompatDelegateImpl.p this$0) {}
      
      public void onReceive(Context param2Context, Intent param2Intent) {
        this.a.d();
      }
    }
  }
  
  class a extends BroadcastReceiver {
    a(AppCompatDelegateImpl this$0) {}
    
    public void onReceive(Context param1Context, Intent param1Intent) {
      this.a.d();
    }
  }
  
  private class q extends p {
    private final i c;
    
    q(AppCompatDelegateImpl this$0, i param1i) {
      super(this$0);
      this.c = param1i;
    }
    
    IntentFilter b() {
      IntentFilter intentFilter = new IntentFilter();
      intentFilter.addAction("android.intent.action.TIME_SET");
      intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
      intentFilter.addAction("android.intent.action.TIME_TICK");
      return intentFilter;
    }
    
    public int c() {
      boolean bool;
      if (this.c.d()) {
        bool = true;
      } else {
        bool = true;
      } 
      return bool;
    }
    
    public void d() {
      this.d.e();
    }
  }
  
  private static class r {
    static void a(ContextThemeWrapper param1ContextThemeWrapper, Configuration param1Configuration) {
      param1ContextThemeWrapper.applyOverrideConfiguration(param1Configuration);
    }
  }
  
  private class s extends ContentFrameLayout {
    public s(AppCompatDelegateImpl this$0, Context param1Context) {
      super(param1Context);
    }
    
    private boolean b(int param1Int1, int param1Int2) {
      return (param1Int1 < -5 || param1Int2 < -5 || param1Int1 > getWidth() + 5 || param1Int2 > getHeight() + 5);
    }
    
    public boolean dispatchKeyEvent(KeyEvent param1KeyEvent) {
      return (this.j.V(param1KeyEvent) || super.dispatchKeyEvent(param1KeyEvent));
    }
    
    public boolean onInterceptTouchEvent(MotionEvent param1MotionEvent) {
      if (param1MotionEvent.getAction() == 0 && b((int)param1MotionEvent.getX(), (int)param1MotionEvent.getY())) {
        this.j.P(0);
        return true;
      } 
      return super.onInterceptTouchEvent(param1MotionEvent);
    }
    
    public void setBackgroundResource(int param1Int) {
      setBackgroundDrawable(b.a.k.a.a.d(getContext(), param1Int));
    }
  }
  
  private final class t implements androidx.appcompat.view.menu.m.a {
    t(AppCompatDelegateImpl this$0) {}
    
    public void b(g param1g, boolean param1Boolean) {
      boolean bool;
      g g1 = param1g.F();
      if (g1 != param1g) {
        bool = true;
      } else {
        bool = false;
      } 
      AppCompatDelegateImpl appCompatDelegateImpl = this.b;
      if (bool)
        param1g = g1; 
      AppCompatDelegateImpl.PanelFeatureState panelFeatureState = appCompatDelegateImpl.a0((Menu)param1g);
      if (panelFeatureState != null)
        if (bool) {
          this.b.M(panelFeatureState.a, panelFeatureState, (Menu)g1);
          this.b.Q(panelFeatureState, true);
        } else {
          this.b.Q(panelFeatureState, param1Boolean);
        }  
    }
    
    public boolean c(g param1g) {
      if (param1g == param1g.F()) {
        AppCompatDelegateImpl appCompatDelegateImpl = this.b;
        if (appCompatDelegateImpl.H) {
          Window.Callback callback = appCompatDelegateImpl.h0();
          if (callback != null && !this.b.T)
            callback.onMenuOpened(108, (Menu)param1g); 
        } 
      } 
      return true;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/app/AppCompatDelegateImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */