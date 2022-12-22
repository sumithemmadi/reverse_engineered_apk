package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import b.a.j;
import b.h.k.w;
import java.lang.ref.WeakReference;

class AlertController {
  NestedScrollView A;
  
  private int B = 0;
  
  private Drawable C;
  
  private ImageView D;
  
  private TextView E;
  
  private TextView F;
  
  private View G;
  
  ListAdapter H;
  
  int I = -1;
  
  private int J;
  
  private int K;
  
  int L;
  
  int M;
  
  int N;
  
  int O;
  
  private boolean P;
  
  private int Q = 0;
  
  Handler R;
  
  private final View.OnClickListener S = new a(this);
  
  private final Context a;
  
  final d b;
  
  private final Window c;
  
  private final int d;
  
  private CharSequence e;
  
  private CharSequence f;
  
  ListView g;
  
  private View h;
  
  private int i;
  
  private int j;
  
  private int k;
  
  private int l;
  
  private int m;
  
  private boolean n = false;
  
  Button o;
  
  private CharSequence p;
  
  Message q;
  
  private Drawable r;
  
  Button s;
  
  private CharSequence t;
  
  Message u;
  
  private Drawable v;
  
  Button w;
  
  private CharSequence x;
  
  Message y;
  
  private Drawable z;
  
  public AlertController(Context paramContext, d paramd, Window paramWindow) {
    this.a = paramContext;
    this.b = paramd;
    this.c = paramWindow;
    this.R = new g((DialogInterface)paramd);
    TypedArray typedArray = paramContext.obtainStyledAttributes(null, j.AlertDialog, b.a.a.alertDialogStyle, 0);
    this.J = typedArray.getResourceId(j.AlertDialog_android_layout, 0);
    this.K = typedArray.getResourceId(j.AlertDialog_buttonPanelSideLayout, 0);
    this.L = typedArray.getResourceId(j.AlertDialog_listLayout, 0);
    this.M = typedArray.getResourceId(j.AlertDialog_multiChoiceItemLayout, 0);
    this.N = typedArray.getResourceId(j.AlertDialog_singleChoiceItemLayout, 0);
    this.O = typedArray.getResourceId(j.AlertDialog_listItemLayout, 0);
    this.P = typedArray.getBoolean(j.AlertDialog_showTitle, true);
    this.d = typedArray.getDimensionPixelSize(j.AlertDialog_buttonIconDimen, 0);
    typedArray.recycle();
    paramd.f(1);
  }
  
  private static boolean A(Context paramContext) {
    TypedValue typedValue = new TypedValue();
    Resources.Theme theme = paramContext.getTheme();
    int i = b.a.a.alertDialogCenterButtons;
    boolean bool = true;
    theme.resolveAttribute(i, typedValue, true);
    if (typedValue.data == 0)
      bool = false; 
    return bool;
  }
  
  static boolean a(View paramView) {
    if (paramView.onCheckIsTextEditor())
      return true; 
    if (!(paramView instanceof ViewGroup))
      return false; 
    ViewGroup viewGroup = (ViewGroup)paramView;
    int i = viewGroup.getChildCount();
    while (i > 0) {
      int j = i - 1;
      i = j;
      if (a(viewGroup.getChildAt(j)))
        return true; 
    } 
    return false;
  }
  
  private void b(Button paramButton) {
    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams)paramButton.getLayoutParams();
    layoutParams.gravity = 1;
    layoutParams.weight = 0.5F;
    paramButton.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
  }
  
  static void g(View paramView1, View paramView2, View paramView3) {
    boolean bool = false;
    if (paramView2 != null) {
      byte b;
      if (paramView1.canScrollVertically(-1)) {
        b = 0;
      } else {
        b = 4;
      } 
      paramView2.setVisibility(b);
    } 
    if (paramView3 != null) {
      byte b;
      if (paramView1.canScrollVertically(1)) {
        b = bool;
      } else {
        b = 4;
      } 
      paramView3.setVisibility(b);
    } 
  }
  
  private ViewGroup j(View paramView1, View paramView2) {
    if (paramView1 == null) {
      paramView1 = paramView2;
      if (paramView2 instanceof ViewStub)
        paramView1 = ((ViewStub)paramView2).inflate(); 
      return (ViewGroup)paramView1;
    } 
    if (paramView2 != null) {
      ViewParent viewParent = paramView2.getParent();
      if (viewParent instanceof ViewGroup)
        ((ViewGroup)viewParent).removeView(paramView2); 
    } 
    paramView2 = paramView1;
    if (paramView1 instanceof ViewStub)
      paramView2 = ((ViewStub)paramView1).inflate(); 
    return (ViewGroup)paramView2;
  }
  
  private int k() {
    int i = this.K;
    return (i == 0) ? this.J : ((this.Q == 1) ? i : this.J);
  }
  
  private void q(ViewGroup paramViewGroup, View paramView, int paramInt1, int paramInt2) {
    View view1 = this.c.findViewById(b.a.f.scrollIndicatorUp);
    View view2 = this.c.findViewById(b.a.f.scrollIndicatorDown);
    if (Build.VERSION.SDK_INT >= 23) {
      w.H0(paramView, paramInt1, paramInt2);
      if (view1 != null)
        paramViewGroup.removeView(view1); 
      if (view2 != null)
        paramViewGroup.removeView(view2); 
    } else {
      paramView = view1;
      if (view1 != null) {
        paramView = view1;
        if ((paramInt1 & 0x1) == 0) {
          paramViewGroup.removeView(view1);
          paramView = null;
        } 
      } 
      view1 = view2;
      if (view2 != null) {
        view1 = view2;
        if ((paramInt1 & 0x2) == 0) {
          paramViewGroup.removeView(view2);
          view1 = null;
        } 
      } 
      if (paramView != null || view1 != null)
        if (this.f != null) {
          this.A.setOnScrollChangeListener(new b(this, paramView, view1));
          this.A.post(new c(this, paramView, view1));
        } else {
          ListView listView = this.g;
          if (listView != null) {
            listView.setOnScrollListener(new d(this, paramView, view1));
            this.g.post(new e(this, paramView, view1));
          } else {
            if (paramView != null)
              paramViewGroup.removeView(paramView); 
            if (view1 != null)
              paramViewGroup.removeView(view1); 
          } 
        }  
    } 
  }
  
  private void v(ViewGroup paramViewGroup) {
    int i;
    Button button = (Button)paramViewGroup.findViewById(16908313);
    this.o = button;
    button.setOnClickListener(this.S);
    boolean bool = TextUtils.isEmpty(this.p);
    boolean bool1 = true;
    if (bool && this.r == null) {
      this.o.setVisibility(8);
      i = 0;
    } else {
      this.o.setText(this.p);
      Drawable drawable = this.r;
      if (drawable != null) {
        int j = this.d;
        drawable.setBounds(0, 0, j, j);
        this.o.setCompoundDrawables(this.r, null, null, null);
      } 
      this.o.setVisibility(0);
      i = 1;
    } 
    button = (Button)paramViewGroup.findViewById(16908314);
    this.s = button;
    button.setOnClickListener(this.S);
    if (TextUtils.isEmpty(this.t) && this.v == null) {
      this.s.setVisibility(8);
    } else {
      this.s.setText(this.t);
      Drawable drawable = this.v;
      if (drawable != null) {
        int j = this.d;
        drawable.setBounds(0, 0, j, j);
        this.s.setCompoundDrawables(this.v, null, null, null);
      } 
      this.s.setVisibility(0);
      i |= 0x2;
    } 
    button = (Button)paramViewGroup.findViewById(16908315);
    this.w = button;
    button.setOnClickListener(this.S);
    if (TextUtils.isEmpty(this.x) && this.z == null) {
      this.w.setVisibility(8);
    } else {
      this.w.setText(this.x);
      Drawable drawable = this.z;
      if (drawable != null) {
        int j = this.d;
        drawable.setBounds(0, 0, j, j);
        this.w.setCompoundDrawables(this.z, null, null, null);
      } 
      this.w.setVisibility(0);
      i |= 0x4;
    } 
    if (A(this.a))
      if (i == 1) {
        b(this.o);
      } else if (i == 2) {
        b(this.s);
      } else if (i == 4) {
        b(this.w);
      }  
    if (i != 0) {
      i = bool1;
    } else {
      i = 0;
    } 
    if (i == 0)
      paramViewGroup.setVisibility(8); 
  }
  
  private void w(ViewGroup paramViewGroup) {
    NestedScrollView nestedScrollView = (NestedScrollView)this.c.findViewById(b.a.f.scrollView);
    this.A = nestedScrollView;
    nestedScrollView.setFocusable(false);
    this.A.setNestedScrollingEnabled(false);
    TextView textView = (TextView)paramViewGroup.findViewById(16908299);
    this.F = textView;
    if (textView == null)
      return; 
    CharSequence charSequence = this.f;
    if (charSequence != null) {
      textView.setText(charSequence);
    } else {
      textView.setVisibility(8);
      this.A.removeView((View)this.F);
      if (this.g != null) {
        paramViewGroup = (ViewGroup)this.A.getParent();
        int i = paramViewGroup.indexOfChild((View)this.A);
        paramViewGroup.removeViewAt(i);
        paramViewGroup.addView((View)this.g, i, new ViewGroup.LayoutParams(-1, -1));
      } else {
        paramViewGroup.setVisibility(8);
      } 
    } 
  }
  
  private void x(ViewGroup paramViewGroup) {
    View view = this.h;
    boolean bool = false;
    if (view == null)
      if (this.i != 0) {
        view = LayoutInflater.from(this.a).inflate(this.i, paramViewGroup, false);
      } else {
        view = null;
      }  
    if (view != null)
      bool = true; 
    if (!bool || !a(view))
      this.c.setFlags(131072, 131072); 
    if (bool) {
      FrameLayout frameLayout = (FrameLayout)this.c.findViewById(b.a.f.custom);
      frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
      if (this.n)
        frameLayout.setPadding(this.j, this.k, this.l, this.m); 
      if (this.g != null)
        ((LinearLayout.LayoutParams)paramViewGroup.getLayoutParams()).weight = 0.0F; 
    } else {
      paramViewGroup.setVisibility(8);
    } 
  }
  
  private void y(ViewGroup paramViewGroup) {
    if (this.G != null) {
      ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
      paramViewGroup.addView(this.G, 0, layoutParams);
      this.c.findViewById(b.a.f.title_template).setVisibility(8);
    } else {
      Drawable drawable;
      this.D = (ImageView)this.c.findViewById(16908294);
      if ((TextUtils.isEmpty(this.e) ^ true) != 0 && this.P) {
        TextView textView = (TextView)this.c.findViewById(b.a.f.alertTitle);
        this.E = textView;
        textView.setText(this.e);
        int i = this.B;
        if (i != 0) {
          this.D.setImageResource(i);
        } else {
          drawable = this.C;
          if (drawable != null) {
            this.D.setImageDrawable(drawable);
          } else {
            this.E.setPadding(this.D.getPaddingLeft(), this.D.getPaddingTop(), this.D.getPaddingRight(), this.D.getPaddingBottom());
            this.D.setVisibility(8);
          } 
        } 
      } else {
        this.c.findViewById(b.a.f.title_template).setVisibility(8);
        this.D.setVisibility(8);
        drawable.setVisibility(8);
      } 
    } 
  }
  
  private void z() {
    int m;
    boolean bool;
    View view1 = this.c.findViewById(b.a.f.parentPanel);
    int i = b.a.f.topPanel;
    View view2 = view1.findViewById(i);
    int j = b.a.f.contentPanel;
    View view3 = view1.findViewById(j);
    int k = b.a.f.buttonPanel;
    View view4 = view1.findViewById(k);
    ViewGroup viewGroup1 = (ViewGroup)view1.findViewById(b.a.f.customPanel);
    x(viewGroup1);
    View view5 = viewGroup1.findViewById(i);
    View view6 = viewGroup1.findViewById(j);
    View view7 = viewGroup1.findViewById(k);
    ViewGroup viewGroup2 = j(view5, view2);
    ViewGroup viewGroup3 = j(view6, view3);
    ViewGroup viewGroup4 = j(view7, view4);
    w(viewGroup3);
    v(viewGroup4);
    y(viewGroup2);
    i = viewGroup1.getVisibility();
    j = 0;
    if (i != 8) {
      i = 1;
    } else {
      i = 0;
    } 
    if (viewGroup2 != null && viewGroup2.getVisibility() != 8) {
      m = 1;
    } else {
      m = 0;
    } 
    if (viewGroup4 != null && viewGroup4.getVisibility() != 8) {
      bool = true;
    } else {
      bool = false;
    } 
    if (!bool && viewGroup3 != null) {
      View view = viewGroup3.findViewById(b.a.f.textSpacerNoButtons);
      if (view != null)
        view.setVisibility(0); 
    } 
    if (m) {
      View view;
      NestedScrollView nestedScrollView = this.A;
      if (nestedScrollView != null)
        nestedScrollView.setClipToPadding(true); 
      nestedScrollView = null;
      if (this.f != null || this.g != null)
        view = viewGroup2.findViewById(b.a.f.titleDividerNoCustom); 
      if (view != null)
        view.setVisibility(0); 
    } else if (viewGroup3 != null) {
      View view = viewGroup3.findViewById(b.a.f.textSpacerNoTitle);
      if (view != null)
        view.setVisibility(0); 
    } 
    ListView listView = this.g;
    if (listView instanceof RecycleListView)
      ((RecycleListView)listView).setHasDecor(m, bool); 
    if (i == 0) {
      NestedScrollView nestedScrollView;
      listView = this.g;
      if (listView == null)
        nestedScrollView = this.A; 
      if (nestedScrollView != null) {
        i = j;
        if (bool)
          i = 2; 
        q(viewGroup3, (View)nestedScrollView, m | i, 3);
      } 
    } 
    listView = this.g;
    if (listView != null) {
      ListAdapter listAdapter = this.H;
      if (listAdapter != null) {
        listView.setAdapter(listAdapter);
        i = this.I;
        if (i > -1) {
          listView.setItemChecked(i, true);
          listView.setSelection(i);
        } 
      } 
    } 
  }
  
  public Button c(int paramInt) {
    return (paramInt != -3) ? ((paramInt != -2) ? ((paramInt != -1) ? null : this.o) : this.s) : this.w;
  }
  
  public int d(int paramInt) {
    TypedValue typedValue = new TypedValue();
    this.a.getTheme().resolveAttribute(paramInt, typedValue, true);
    return typedValue.resourceId;
  }
  
  public ListView e() {
    return this.g;
  }
  
  public void f() {
    int i = k();
    this.b.setContentView(i);
    z();
  }
  
  public boolean h(int paramInt, KeyEvent paramKeyEvent) {
    boolean bool;
    NestedScrollView nestedScrollView = this.A;
    if (nestedScrollView != null && nestedScrollView.q(paramKeyEvent)) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public boolean i(int paramInt, KeyEvent paramKeyEvent) {
    boolean bool;
    NestedScrollView nestedScrollView = this.A;
    if (nestedScrollView != null && nestedScrollView.q(paramKeyEvent)) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void l(int paramInt, CharSequence paramCharSequence, DialogInterface.OnClickListener paramOnClickListener, Message paramMessage, Drawable paramDrawable) {
    Message message = paramMessage;
    if (paramMessage == null) {
      message = paramMessage;
      if (paramOnClickListener != null)
        message = this.R.obtainMessage(paramInt, paramOnClickListener); 
    } 
    if (paramInt != -3) {
      if (paramInt != -2) {
        if (paramInt == -1) {
          this.p = paramCharSequence;
          this.q = message;
          this.r = paramDrawable;
        } else {
          throw new IllegalArgumentException("Button does not exist");
        } 
      } else {
        this.t = paramCharSequence;
        this.u = message;
        this.v = paramDrawable;
      } 
    } else {
      this.x = paramCharSequence;
      this.y = message;
      this.z = paramDrawable;
    } 
  }
  
  public void m(View paramView) {
    this.G = paramView;
  }
  
  public void n(int paramInt) {
    this.C = null;
    this.B = paramInt;
    ImageView imageView = this.D;
    if (imageView != null)
      if (paramInt != 0) {
        imageView.setVisibility(0);
        this.D.setImageResource(this.B);
      } else {
        imageView.setVisibility(8);
      }  
  }
  
  public void o(Drawable paramDrawable) {
    this.C = paramDrawable;
    this.B = 0;
    ImageView imageView = this.D;
    if (imageView != null)
      if (paramDrawable != null) {
        imageView.setVisibility(0);
        this.D.setImageDrawable(paramDrawable);
      } else {
        imageView.setVisibility(8);
      }  
  }
  
  public void p(CharSequence paramCharSequence) {
    this.f = paramCharSequence;
    TextView textView = this.F;
    if (textView != null)
      textView.setText(paramCharSequence); 
  }
  
  public void r(CharSequence paramCharSequence) {
    this.e = paramCharSequence;
    TextView textView = this.E;
    if (textView != null)
      textView.setText(paramCharSequence); 
  }
  
  public void s(int paramInt) {
    this.h = null;
    this.i = paramInt;
    this.n = false;
  }
  
  public void t(View paramView) {
    this.h = paramView;
    this.i = 0;
    this.n = false;
  }
  
  public void u(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.h = paramView;
    this.i = 0;
    this.n = true;
    this.j = paramInt1;
    this.k = paramInt2;
    this.l = paramInt3;
    this.m = paramInt4;
  }
  
  public static class RecycleListView extends ListView {
    private final int b;
    
    private final int c;
    
    public RecycleListView(Context param1Context) {
      this(param1Context, null);
    }
    
    public RecycleListView(Context param1Context, AttributeSet param1AttributeSet) {
      super(param1Context, param1AttributeSet);
      TypedArray typedArray = param1Context.obtainStyledAttributes(param1AttributeSet, j.RecycleListView);
      this.c = typedArray.getDimensionPixelOffset(j.RecycleListView_paddingBottomNoButtons, -1);
      this.b = typedArray.getDimensionPixelOffset(j.RecycleListView_paddingTopNoTitle, -1);
    }
    
    public void setHasDecor(boolean param1Boolean1, boolean param1Boolean2) {
      if (!param1Boolean2 || !param1Boolean1) {
        int j;
        int m;
        int i = getPaddingLeft();
        if (param1Boolean1) {
          j = getPaddingTop();
        } else {
          j = this.b;
        } 
        int k = getPaddingRight();
        if (param1Boolean2) {
          m = getPaddingBottom();
        } else {
          m = this.c;
        } 
        setPadding(i, j, k, m);
      } 
    }
  }
  
  class a implements View.OnClickListener {
    a(AlertController this$0) {}
    
    public void onClick(View param1View) {
      // Byte code:
      //   0: aload_0
      //   1: getfield b : Landroidx/appcompat/app/AlertController;
      //   4: astore_2
      //   5: aload_1
      //   6: aload_2
      //   7: getfield o : Landroid/widget/Button;
      //   10: if_acmpne -> 30
      //   13: aload_2
      //   14: getfield q : Landroid/os/Message;
      //   17: astore_3
      //   18: aload_3
      //   19: ifnull -> 30
      //   22: aload_3
      //   23: invokestatic obtain : (Landroid/os/Message;)Landroid/os/Message;
      //   26: astore_1
      //   27: goto -> 82
      //   30: aload_1
      //   31: aload_2
      //   32: getfield s : Landroid/widget/Button;
      //   35: if_acmpne -> 55
      //   38: aload_2
      //   39: getfield u : Landroid/os/Message;
      //   42: astore_3
      //   43: aload_3
      //   44: ifnull -> 55
      //   47: aload_3
      //   48: invokestatic obtain : (Landroid/os/Message;)Landroid/os/Message;
      //   51: astore_1
      //   52: goto -> 82
      //   55: aload_1
      //   56: aload_2
      //   57: getfield w : Landroid/widget/Button;
      //   60: if_acmpne -> 80
      //   63: aload_2
      //   64: getfield y : Landroid/os/Message;
      //   67: astore_1
      //   68: aload_1
      //   69: ifnull -> 80
      //   72: aload_1
      //   73: invokestatic obtain : (Landroid/os/Message;)Landroid/os/Message;
      //   76: astore_1
      //   77: goto -> 82
      //   80: aconst_null
      //   81: astore_1
      //   82: aload_1
      //   83: ifnull -> 90
      //   86: aload_1
      //   87: invokevirtual sendToTarget : ()V
      //   90: aload_0
      //   91: getfield b : Landroidx/appcompat/app/AlertController;
      //   94: astore_1
      //   95: aload_1
      //   96: getfield R : Landroid/os/Handler;
      //   99: iconst_1
      //   100: aload_1
      //   101: getfield b : Landroidx/appcompat/app/d;
      //   104: invokevirtual obtainMessage : (ILjava/lang/Object;)Landroid/os/Message;
      //   107: invokevirtual sendToTarget : ()V
      //   110: return
    }
  }
  
  class b implements NestedScrollView.b {
    b(AlertController this$0, View param1View1, View param1View2) {}
    
    public void a(NestedScrollView param1NestedScrollView, int param1Int1, int param1Int2, int param1Int3, int param1Int4) {
      AlertController.g((View)param1NestedScrollView, this.a, this.b);
    }
  }
  
  class c implements Runnable {
    c(AlertController this$0, View param1View1, View param1View2) {}
    
    public void run() {
      AlertController.g((View)this.d.A, this.b, this.c);
    }
  }
  
  class d implements AbsListView.OnScrollListener {
    d(AlertController this$0, View param1View1, View param1View2) {}
    
    public void onScroll(AbsListView param1AbsListView, int param1Int1, int param1Int2, int param1Int3) {
      AlertController.g((View)param1AbsListView, this.a, this.b);
    }
    
    public void onScrollStateChanged(AbsListView param1AbsListView, int param1Int) {}
  }
  
  class e implements Runnable {
    e(AlertController this$0, View param1View1, View param1View2) {}
    
    public void run() {
      AlertController.g((View)this.d.g, this.b, this.c);
    }
  }
  
  public static class f {
    public int A;
    
    public int B;
    
    public int C;
    
    public int D;
    
    public boolean E = false;
    
    public boolean[] F;
    
    public boolean G;
    
    public boolean H;
    
    public int I = -1;
    
    public DialogInterface.OnMultiChoiceClickListener J;
    
    public Cursor K;
    
    public String L;
    
    public String M;
    
    public AdapterView.OnItemSelectedListener N;
    
    public e O;
    
    public boolean P = true;
    
    public final Context a;
    
    public final LayoutInflater b;
    
    public int c = 0;
    
    public Drawable d;
    
    public int e = 0;
    
    public CharSequence f;
    
    public View g;
    
    public CharSequence h;
    
    public CharSequence i;
    
    public Drawable j;
    
    public DialogInterface.OnClickListener k;
    
    public CharSequence l;
    
    public Drawable m;
    
    public DialogInterface.OnClickListener n;
    
    public CharSequence o;
    
    public Drawable p;
    
    public DialogInterface.OnClickListener q;
    
    public boolean r;
    
    public DialogInterface.OnCancelListener s;
    
    public DialogInterface.OnDismissListener t;
    
    public DialogInterface.OnKeyListener u;
    
    public CharSequence[] v;
    
    public ListAdapter w;
    
    public DialogInterface.OnClickListener x;
    
    public int y;
    
    public View z;
    
    public f(Context param1Context) {
      this.a = param1Context;
      this.r = true;
      this.b = (LayoutInflater)param1Context.getSystemService("layout_inflater");
    }
    
    private void b(AlertController param1AlertController) {
      AlertController.h h;
      AlertController.RecycleListView recycleListView = (AlertController.RecycleListView)this.b.inflate(param1AlertController.L, null);
      if (this.G) {
        if (this.K == null) {
          a a = new a(this, this.a, param1AlertController.M, 16908308, this.v, recycleListView);
        } else {
          b b = new b(this, this.a, this.K, false, recycleListView, param1AlertController);
        } 
      } else {
        int i;
        if (this.H) {
          i = param1AlertController.N;
        } else {
          i = param1AlertController.O;
        } 
        if (this.K != null) {
          SimpleCursorAdapter simpleCursorAdapter = new SimpleCursorAdapter(this.a, i, this.K, new String[] { this.L }, new int[] { 16908308 });
        } else {
          ListAdapter listAdapter = this.w;
          if (listAdapter == null)
            h = new AlertController.h(this.a, i, 16908308, this.v); 
        } 
      } 
      e e1 = this.O;
      if (e1 != null)
        e1.a(recycleListView); 
      param1AlertController.H = (ListAdapter)h;
      param1AlertController.I = this.I;
      if (this.x != null) {
        recycleListView.setOnItemClickListener(new c(this, param1AlertController));
      } else if (this.J != null) {
        recycleListView.setOnItemClickListener(new d(this, recycleListView, param1AlertController));
      } 
      AdapterView.OnItemSelectedListener onItemSelectedListener = this.N;
      if (onItemSelectedListener != null)
        recycleListView.setOnItemSelectedListener(onItemSelectedListener); 
      if (this.H) {
        recycleListView.setChoiceMode(1);
      } else if (this.G) {
        recycleListView.setChoiceMode(2);
      } 
      param1AlertController.g = recycleListView;
    }
    
    public void a(AlertController param1AlertController) {
      View view2 = this.g;
      if (view2 != null) {
        param1AlertController.m(view2);
      } else {
        CharSequence charSequence1 = this.f;
        if (charSequence1 != null)
          param1AlertController.r(charSequence1); 
        Drawable drawable = this.d;
        if (drawable != null)
          param1AlertController.o(drawable); 
        int i = this.c;
        if (i != 0)
          param1AlertController.n(i); 
        i = this.e;
        if (i != 0)
          param1AlertController.n(param1AlertController.d(i)); 
      } 
      CharSequence charSequence = this.h;
      if (charSequence != null)
        param1AlertController.p(charSequence); 
      charSequence = this.i;
      if (charSequence != null || this.j != null)
        param1AlertController.l(-1, charSequence, this.k, null, this.j); 
      charSequence = this.l;
      if (charSequence != null || this.m != null)
        param1AlertController.l(-2, charSequence, this.n, null, this.m); 
      charSequence = this.o;
      if (charSequence != null || this.p != null)
        param1AlertController.l(-3, charSequence, this.q, null, this.p); 
      if (this.v != null || this.K != null || this.w != null)
        b(param1AlertController); 
      View view1 = this.z;
      if (view1 != null) {
        if (this.E) {
          param1AlertController.u(view1, this.A, this.B, this.C, this.D);
        } else {
          param1AlertController.t(view1);
        } 
      } else {
        int i = this.y;
        if (i != 0)
          param1AlertController.s(i); 
      } 
    }
    
    class a extends ArrayAdapter<CharSequence> {
      a(AlertController.f this$0, Context param2Context, int param2Int1, int param2Int2, CharSequence[] param2ArrayOfCharSequence, AlertController.RecycleListView param2RecycleListView) {
        super(param2Context, param2Int1, param2Int2, (Object[])param2ArrayOfCharSequence);
      }
      
      public View getView(int param2Int, View param2View, ViewGroup param2ViewGroup) {
        param2View = super.getView(param2Int, param2View, param2ViewGroup);
        boolean[] arrayOfBoolean = this.c.F;
        if (arrayOfBoolean != null && arrayOfBoolean[param2Int])
          this.b.setItemChecked(param2Int, true); 
        return param2View;
      }
    }
    
    class b extends CursorAdapter {
      private final int b;
      
      private final int c;
      
      b(AlertController.f this$0, Context param2Context, Cursor param2Cursor, boolean param2Boolean, AlertController.RecycleListView param2RecycleListView, AlertController param2AlertController) {
        super(param2Context, param2Cursor, param2Boolean);
        Cursor cursor = getCursor();
        this.b = cursor.getColumnIndexOrThrow(this$0.L);
        this.c = cursor.getColumnIndexOrThrow(this$0.M);
      }
      
      public void bindView(View param2View, Context param2Context, Cursor param2Cursor) {
        ((CheckedTextView)param2View.findViewById(16908308)).setText(param2Cursor.getString(this.b));
        AlertController.RecycleListView recycleListView = this.d;
        int i = param2Cursor.getPosition();
        int j = param2Cursor.getInt(this.c);
        boolean bool = true;
        if (j != 1)
          bool = false; 
        recycleListView.setItemChecked(i, bool);
      }
      
      public View newView(Context param2Context, Cursor param2Cursor, ViewGroup param2ViewGroup) {
        return this.f.b.inflate(this.e.M, param2ViewGroup, false);
      }
    }
    
    class c implements AdapterView.OnItemClickListener {
      c(AlertController.f this$0, AlertController param2AlertController) {}
      
      public void onItemClick(AdapterView<?> param2AdapterView, View param2View, int param2Int, long param2Long) {
        this.c.x.onClick((DialogInterface)this.b.b, param2Int);
        if (!this.c.H)
          this.b.b.dismiss(); 
      }
    }
    
    class d implements AdapterView.OnItemClickListener {
      d(AlertController.f this$0, AlertController.RecycleListView param2RecycleListView, AlertController param2AlertController) {}
      
      public void onItemClick(AdapterView<?> param2AdapterView, View param2View, int param2Int, long param2Long) {
        boolean[] arrayOfBoolean = this.d.F;
        if (arrayOfBoolean != null)
          arrayOfBoolean[param2Int] = this.b.isItemChecked(param2Int); 
        this.d.J.onClick((DialogInterface)this.c.b, param2Int, this.b.isItemChecked(param2Int));
      }
    }
    
    public static interface e {
      void a(ListView param2ListView);
    }
  }
  
  class a extends ArrayAdapter<CharSequence> {
    a(AlertController this$0, Context param1Context, int param1Int1, int param1Int2, CharSequence[] param1ArrayOfCharSequence, AlertController.RecycleListView param1RecycleListView) {
      super(param1Context, param1Int1, param1Int2, (Object[])param1ArrayOfCharSequence);
    }
    
    public View getView(int param1Int, View param1View, ViewGroup param1ViewGroup) {
      param1View = super.getView(param1Int, param1View, param1ViewGroup);
      boolean[] arrayOfBoolean = this.c.F;
      if (arrayOfBoolean != null && arrayOfBoolean[param1Int])
        this.b.setItemChecked(param1Int, true); 
      return param1View;
    }
  }
  
  class b extends CursorAdapter {
    private final int b;
    
    private final int c;
    
    b(AlertController this$0, Context param1Context, Cursor param1Cursor, boolean param1Boolean, AlertController.RecycleListView param1RecycleListView, AlertController param1AlertController) {
      super(param1Context, param1Cursor, param1Boolean);
      Cursor cursor = getCursor();
      this.b = cursor.getColumnIndexOrThrow(((AlertController.f)this$0).L);
      this.c = cursor.getColumnIndexOrThrow(((AlertController.f)this$0).M);
    }
    
    public void bindView(View param1View, Context param1Context, Cursor param1Cursor) {
      ((CheckedTextView)param1View.findViewById(16908308)).setText(param1Cursor.getString(this.b));
      AlertController.RecycleListView recycleListView = this.d;
      int i = param1Cursor.getPosition();
      int j = param1Cursor.getInt(this.c);
      boolean bool = true;
      if (j != 1)
        bool = false; 
      recycleListView.setItemChecked(i, bool);
    }
    
    public View newView(Context param1Context, Cursor param1Cursor, ViewGroup param1ViewGroup) {
      return this.f.b.inflate(this.e.M, param1ViewGroup, false);
    }
  }
  
  class c implements AdapterView.OnItemClickListener {
    c(AlertController this$0, AlertController param1AlertController) {}
    
    public void onItemClick(AdapterView<?> param1AdapterView, View param1View, int param1Int, long param1Long) {
      this.c.x.onClick((DialogInterface)this.b.b, param1Int);
      if (!this.c.H)
        this.b.b.dismiss(); 
    }
  }
  
  class d implements AdapterView.OnItemClickListener {
    d(AlertController this$0, AlertController.RecycleListView param1RecycleListView, AlertController param1AlertController) {}
    
    public void onItemClick(AdapterView<?> param1AdapterView, View param1View, int param1Int, long param1Long) {
      boolean[] arrayOfBoolean = this.d.F;
      if (arrayOfBoolean != null)
        arrayOfBoolean[param1Int] = this.b.isItemChecked(param1Int); 
      this.d.J.onClick((DialogInterface)this.c.b, param1Int, this.b.isItemChecked(param1Int));
    }
  }
  
  public static interface e {
    void a(ListView param1ListView);
  }
  
  private static final class g extends Handler {
    private WeakReference<DialogInterface> a;
    
    public g(DialogInterface param1DialogInterface) {
      this.a = new WeakReference<DialogInterface>(param1DialogInterface);
    }
    
    public void handleMessage(Message param1Message) {
      int i = param1Message.what;
      if (i != -3 && i != -2 && i != -1) {
        if (i == 1)
          ((DialogInterface)param1Message.obj).dismiss(); 
      } else {
        ((DialogInterface.OnClickListener)param1Message.obj).onClick(this.a.get(), param1Message.what);
      } 
    }
  }
  
  private static class h extends ArrayAdapter<CharSequence> {
    public h(Context param1Context, int param1Int1, int param1Int2, CharSequence[] param1ArrayOfCharSequence) {
      super(param1Context, param1Int1, param1Int2, (Object[])param1ArrayOfCharSequence);
    }
    
    public long getItemId(int param1Int) {
      return param1Int;
    }
    
    public boolean hasStableIds() {
      return true;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/app/AlertController.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */