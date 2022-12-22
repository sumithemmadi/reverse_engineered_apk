package com.google.android.exoplayer2.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.e0;
import com.google.android.exoplayer2.l0;
import com.google.android.exoplayer2.m0;
import com.google.android.exoplayer2.n0;
import com.google.android.exoplayer2.o0;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.g;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.h0;
import com.google.android.exoplayer2.util.y;
import com.google.android.exoplayer2.v;
import com.google.android.exoplayer2.w;
import com.google.android.exoplayer2.x;
import com.google.android.exoplayer2.y0;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

public class PlayerControlView extends FrameLayout {
  private final String A;
  
  private final Drawable B;
  
  private final Drawable C;
  
  private final float D;
  
  private final float E;
  
  private final String F;
  
  private final String G;
  
  private o0 H;
  
  private w I;
  
  private c J;
  
  private m0 K;
  
  private boolean L;
  
  private boolean M;
  
  private boolean N;
  
  private boolean O;
  
  private int P;
  
  private int Q;
  
  private int R;
  
  private int S;
  
  private int T;
  
  private boolean U;
  
  private long V;
  
  private long[] W;
  
  private boolean[] a0;
  
  private final b b;
  
  private long[] b0;
  
  private final CopyOnWriteArrayList<d> c;
  
  private boolean[] c0;
  
  private final View d;
  
  private long d0;
  
  private final View e;
  
  private final View f;
  
  private final View g;
  
  private final View h;
  
  private final View i;
  
  private final ImageView j;
  
  private final ImageView k;
  
  private final View l;
  
  private final TextView m;
  
  private final TextView n;
  
  private final m o;
  
  private final StringBuilder p;
  
  private final Formatter q;
  
  private final y0.b r;
  
  private final y0.c s;
  
  private final Runnable t;
  
  private final Runnable u;
  
  private final Drawable v;
  
  private final Drawable w;
  
  private final Drawable x;
  
  private final String y;
  
  private final String z;
  
  static {
    e0.a("goog.exo.ui");
  }
  
  public PlayerControlView(Context paramContext) {
    this(paramContext, null);
  }
  
  public PlayerControlView(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public PlayerControlView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    this(paramContext, paramAttributeSet, paramInt, paramAttributeSet);
  }
  
  public PlayerControlView(Context paramContext, AttributeSet paramAttributeSet1, int paramInt, AttributeSet paramAttributeSet2) {
    super(paramContext, paramAttributeSet1, paramInt);
    int i = i.exo_player_control_view;
    this.P = 5000;
    this.Q = 15000;
    this.R = 5000;
    this.T = 0;
    this.S = 200;
    this.V = -9223372036854775807L;
    this.U = false;
    paramInt = i;
    if (paramAttributeSet2 != null) {
      TypedArray typedArray = paramContext.getTheme().obtainStyledAttributes(paramAttributeSet2, k.PlayerControlView, 0, 0);
      try {
        this.P = typedArray.getInt(k.PlayerControlView_rewind_increment, this.P);
        this.Q = typedArray.getInt(k.PlayerControlView_fastforward_increment, this.Q);
        this.R = typedArray.getInt(k.PlayerControlView_show_timeout, this.R);
        paramInt = typedArray.getResourceId(k.PlayerControlView_controller_layout_id, i);
        this.T = G(typedArray, this.T);
        this.U = typedArray.getBoolean(k.PlayerControlView_show_shuffle_button, this.U);
        setTimeBarMinUpdateInterval(typedArray.getInt(k.PlayerControlView_time_bar_min_update_interval, this.S));
      } finally {
        typedArray.recycle();
      } 
    } 
    this.c = new CopyOnWriteArrayList<d>();
    this.r = new y0.b();
    this.s = new y0.c();
    StringBuilder stringBuilder = new StringBuilder();
    this.p = stringBuilder;
    this.q = new Formatter(stringBuilder, Locale.getDefault());
    this.W = new long[0];
    this.a0 = new boolean[0];
    this.b0 = new long[0];
    this.c0 = new boolean[0];
    b b1 = new b(null);
    this.b = b1;
    this.I = (w)new x();
    this.t = new c(this);
    this.u = new a(this);
    LayoutInflater.from(paramContext).inflate(paramInt, (ViewGroup)this);
    setDescendantFocusability(262144);
    paramInt = g.exo_progress;
    m m2 = (m)findViewById(paramInt);
    View view2 = findViewById(g.exo_progress_placeholder);
    if (m2 != null) {
      this.o = m2;
    } else if (view2 != null) {
      m2 = new DefaultTimeBar(paramContext, null, 0, paramAttributeSet2);
      m2.setId(paramInt);
      m2.setLayoutParams(view2.getLayoutParams());
      ViewGroup viewGroup = (ViewGroup)view2.getParent();
      paramInt = viewGroup.indexOfChild(view2);
      viewGroup.removeView(view2);
      viewGroup.addView((View)m2, paramInt);
      this.o = m2;
    } else {
      this.o = null;
    } 
    this.m = (TextView)findViewById(g.exo_duration);
    this.n = (TextView)findViewById(g.exo_position);
    m m1 = this.o;
    if (m1 != null)
      m1.a(b1); 
    View view1 = findViewById(g.exo_play);
    this.f = view1;
    if (view1 != null)
      view1.setOnClickListener(b1); 
    view1 = findViewById(g.exo_pause);
    this.g = view1;
    if (view1 != null)
      view1.setOnClickListener(b1); 
    view1 = findViewById(g.exo_prev);
    this.d = view1;
    if (view1 != null)
      view1.setOnClickListener(b1); 
    view1 = findViewById(g.exo_next);
    this.e = view1;
    if (view1 != null)
      view1.setOnClickListener(b1); 
    view1 = findViewById(g.exo_rew);
    this.i = view1;
    if (view1 != null)
      view1.setOnClickListener(b1); 
    view1 = findViewById(g.exo_ffwd);
    this.h = view1;
    if (view1 != null)
      view1.setOnClickListener(b1); 
    ImageView imageView = (ImageView)findViewById(g.exo_repeat_toggle);
    this.j = imageView;
    if (imageView != null)
      imageView.setOnClickListener(b1); 
    imageView = (ImageView)findViewById(g.exo_shuffle);
    this.k = imageView;
    if (imageView != null)
      imageView.setOnClickListener(b1); 
    this.l = findViewById(g.exo_vr);
    setShowVrButton(false);
    Resources resources = paramContext.getResources();
    this.D = resources.getInteger(h.exo_media_button_opacity_percentage_enabled) / 100.0F;
    this.E = resources.getInteger(h.exo_media_button_opacity_percentage_disabled) / 100.0F;
    this.v = resources.getDrawable(f.exo_controls_repeat_off);
    this.w = resources.getDrawable(f.exo_controls_repeat_one);
    this.x = resources.getDrawable(f.exo_controls_repeat_all);
    this.B = resources.getDrawable(f.exo_controls_shuffle_on);
    this.C = resources.getDrawable(f.exo_controls_shuffle_off);
    this.y = resources.getString(j.exo_controls_repeat_off_description);
    this.z = resources.getString(j.exo_controls_repeat_one_description);
    this.A = resources.getString(j.exo_controls_repeat_all_description);
    this.F = resources.getString(j.exo_controls_shuffle_on_description);
    this.G = resources.getString(j.exo_controls_shuffle_off_description);
  }
  
  private static boolean D(y0 paramy0, y0.c paramc) {
    if (paramy0.p() > 100)
      return false; 
    int i = paramy0.p();
    for (byte b1 = 0; b1 < i; b1++) {
      if ((paramy0.n(b1, paramc)).m == -9223372036854775807L)
        return false; 
    } 
    return true;
  }
  
  private void F(o0 paramo0) {
    if (paramo0.e0()) {
      int i = this.Q;
      if (i > 0)
        S(paramo0, i); 
    } 
  }
  
  private static int G(TypedArray paramTypedArray, int paramInt) {
    return paramTypedArray.getInt(k.PlayerControlView_repeat_toggle_modes, paramInt);
  }
  
  private void I() {
    removeCallbacks(this.u);
    if (this.R > 0) {
      long l = SystemClock.uptimeMillis();
      int i = this.R;
      this.V = l + i;
      if (this.L)
        postDelayed(this.u, i); 
    } else {
      this.V = -9223372036854775807L;
    } 
  }
  
  @SuppressLint({"InlinedApi"})
  private static boolean J(int paramInt) {
    return (paramInt == 90 || paramInt == 89 || paramInt == 85 || paramInt == 126 || paramInt == 127 || paramInt == 87 || paramInt == 88);
  }
  
  private void M(o0 paramo0) {
    y0 y0 = paramo0.t0();
    if (!y0.q() && !paramo0.Y()) {
      int i = paramo0.i0();
      int j = paramo0.p0();
      if (j != -1) {
        R(paramo0, j, -9223372036854775807L);
      } else if ((y0.n(i, this.s)).h) {
        R(paramo0, i, -9223372036854775807L);
      } 
    } 
  }
  
  private void N(o0 paramo0) {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface t0 : ()Lcom/google/android/exoplayer2/y0;
    //   6: astore_2
    //   7: aload_2
    //   8: invokevirtual q : ()Z
    //   11: ifne -> 111
    //   14: aload_1
    //   15: invokeinterface Y : ()Z
    //   20: ifeq -> 26
    //   23: goto -> 111
    //   26: aload_1
    //   27: invokeinterface i0 : ()I
    //   32: istore_3
    //   33: aload_2
    //   34: iload_3
    //   35: aload_0
    //   36: getfield s : Lcom/google/android/exoplayer2/y0$c;
    //   39: invokevirtual n : (ILcom/google/android/exoplayer2/y0$c;)Lcom/google/android/exoplayer2/y0$c;
    //   42: pop
    //   43: aload_1
    //   44: invokeinterface m0 : ()I
    //   49: istore #4
    //   51: iload #4
    //   53: iconst_m1
    //   54: if_icmpeq -> 103
    //   57: aload_1
    //   58: invokeinterface getCurrentPosition : ()J
    //   63: ldc2_w 3000
    //   66: lcmp
    //   67: ifle -> 89
    //   70: aload_0
    //   71: getfield s : Lcom/google/android/exoplayer2/y0$c;
    //   74: astore_2
    //   75: aload_2
    //   76: getfield h : Z
    //   79: ifeq -> 103
    //   82: aload_2
    //   83: getfield g : Z
    //   86: ifne -> 103
    //   89: aload_0
    //   90: aload_1
    //   91: iload #4
    //   93: ldc2_w -9223372036854775807
    //   96: invokespecial R : (Lcom/google/android/exoplayer2/o0;IJ)Z
    //   99: pop
    //   100: goto -> 111
    //   103: aload_0
    //   104: aload_1
    //   105: iload_3
    //   106: lconst_0
    //   107: invokespecial R : (Lcom/google/android/exoplayer2/o0;IJ)Z
    //   110: pop
    //   111: return
  }
  
  private void P() {
    boolean bool = V();
    if (!bool) {
      View view = this.f;
      if (view != null) {
        view.requestFocus();
        return;
      } 
    } 
    if (bool) {
      View view = this.g;
      if (view != null)
        view.requestFocus(); 
    } 
  }
  
  private void Q(o0 paramo0) {
    if (paramo0.e0()) {
      int i = this.P;
      if (i > 0)
        S(paramo0, -i); 
    } 
  }
  
  private boolean R(o0 paramo0, int paramInt, long paramLong) {
    return this.I.b(paramo0, paramInt, paramLong);
  }
  
  private void S(o0 paramo0, long paramLong) {
    long l1 = paramo0.getCurrentPosition() + paramLong;
    long l2 = paramo0.getDuration();
    paramLong = l1;
    if (l2 != -9223372036854775807L)
      paramLong = Math.min(l1, l2); 
    paramLong = Math.max(paramLong, 0L);
    R(paramo0, paramo0.i0(), paramLong);
  }
  
  private void T(o0 paramo0, long paramLong) {
    int i;
    y0 y0 = paramo0.t0();
    if (this.N && !y0.q()) {
      int j = y0.p();
      for (i = 0;; i++) {
        long l = y0.n(i, this.s).c();
        if (paramLong < l)
          break; 
        if (i == j - 1) {
          paramLong = l;
          break;
        } 
        paramLong -= l;
      } 
    } else {
      i = paramo0.i0();
    } 
    if (!R(paramo0, i, paramLong))
      a0(); 
  }
  
  private void U(boolean paramBoolean, View paramView) {
    float f;
    if (paramView == null)
      return; 
    paramView.setEnabled(paramBoolean);
    if (paramBoolean) {
      f = this.D;
    } else {
      f = this.E;
    } 
    paramView.setAlpha(f);
    paramView.setVisibility(0);
  }
  
  private boolean V() {
    o0 o01 = this.H;
    boolean bool = true;
    if (o01 == null || o01.V() == 4 || this.H.V() == 1 || !this.H.b0())
      bool = false; 
    return bool;
  }
  
  private void X() {
    Z();
    Y();
    b0();
    c0();
    d0();
  }
  
  private void Y() {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual K : ()Z
    //   4: ifeq -> 259
    //   7: aload_0
    //   8: getfield L : Z
    //   11: ifne -> 17
    //   14: goto -> 259
    //   17: aload_0
    //   18: getfield H : Lcom/google/android/exoplayer2/o0;
    //   21: astore_1
    //   22: iconst_0
    //   23: istore_2
    //   24: iconst_0
    //   25: istore_3
    //   26: aload_1
    //   27: ifnull -> 189
    //   30: aload_1
    //   31: invokeinterface t0 : ()Lcom/google/android/exoplayer2/y0;
    //   36: astore #4
    //   38: aload #4
    //   40: invokevirtual q : ()Z
    //   43: ifne -> 189
    //   46: aload_1
    //   47: invokeinterface Y : ()Z
    //   52: ifne -> 189
    //   55: aload #4
    //   57: aload_1
    //   58: invokeinterface i0 : ()I
    //   63: aload_0
    //   64: getfield s : Lcom/google/android/exoplayer2/y0$c;
    //   67: invokevirtual n : (ILcom/google/android/exoplayer2/y0$c;)Lcom/google/android/exoplayer2/y0$c;
    //   70: pop
    //   71: aload_0
    //   72: getfield s : Lcom/google/android/exoplayer2/y0$c;
    //   75: astore #4
    //   77: aload #4
    //   79: getfield g : Z
    //   82: istore_2
    //   83: iload_2
    //   84: ifne -> 113
    //   87: aload #4
    //   89: getfield h : Z
    //   92: ifeq -> 113
    //   95: aload_1
    //   96: invokeinterface hasPrevious : ()Z
    //   101: ifeq -> 107
    //   104: goto -> 113
    //   107: iconst_0
    //   108: istore #5
    //   110: goto -> 116
    //   113: iconst_1
    //   114: istore #5
    //   116: iload_2
    //   117: ifeq -> 133
    //   120: aload_0
    //   121: getfield P : I
    //   124: ifle -> 133
    //   127: iconst_1
    //   128: istore #6
    //   130: goto -> 136
    //   133: iconst_0
    //   134: istore #6
    //   136: iload_2
    //   137: ifeq -> 153
    //   140: aload_0
    //   141: getfield Q : I
    //   144: ifle -> 153
    //   147: iconst_1
    //   148: istore #7
    //   150: goto -> 156
    //   153: iconst_0
    //   154: istore #7
    //   156: aload_0
    //   157: getfield s : Lcom/google/android/exoplayer2/y0$c;
    //   160: getfield h : Z
    //   163: ifne -> 175
    //   166: aload_1
    //   167: invokeinterface hasNext : ()Z
    //   172: ifeq -> 177
    //   175: iconst_1
    //   176: istore_3
    //   177: iload_3
    //   178: istore #8
    //   180: iload #5
    //   182: istore_3
    //   183: iload_2
    //   184: istore #5
    //   186: goto -> 203
    //   189: iconst_0
    //   190: istore #8
    //   192: iconst_0
    //   193: istore #5
    //   195: iconst_0
    //   196: istore #6
    //   198: iconst_0
    //   199: istore #7
    //   201: iload_2
    //   202: istore_3
    //   203: aload_0
    //   204: iload_3
    //   205: aload_0
    //   206: getfield d : Landroid/view/View;
    //   209: invokespecial U : (ZLandroid/view/View;)V
    //   212: aload_0
    //   213: iload #6
    //   215: aload_0
    //   216: getfield i : Landroid/view/View;
    //   219: invokespecial U : (ZLandroid/view/View;)V
    //   222: aload_0
    //   223: iload #7
    //   225: aload_0
    //   226: getfield h : Landroid/view/View;
    //   229: invokespecial U : (ZLandroid/view/View;)V
    //   232: aload_0
    //   233: iload #8
    //   235: aload_0
    //   236: getfield e : Landroid/view/View;
    //   239: invokespecial U : (ZLandroid/view/View;)V
    //   242: aload_0
    //   243: getfield o : Lcom/google/android/exoplayer2/ui/m;
    //   246: astore_1
    //   247: aload_1
    //   248: ifnull -> 259
    //   251: aload_1
    //   252: iload #5
    //   254: invokeinterface setEnabled : (Z)V
    //   259: return
  }
  
  private void Z() {
    if (K() && this.L) {
      int i;
      boolean bool = V();
      View view = this.f;
      byte b1 = 8;
      byte b2 = 1;
      if (view != null) {
        if (bool && view.isFocused()) {
          i = 1;
        } else {
          i = 0;
        } 
        int k = i | 0x0;
        view = this.f;
        if (bool) {
          i = 8;
        } else {
          i = 0;
        } 
        view.setVisibility(i);
        i = k;
      } else {
        i = 0;
      } 
      view = this.g;
      int j = i;
      if (view != null) {
        if (!bool && view.isFocused()) {
          j = b2;
        } else {
          j = 0;
        } 
        j = i | j;
        view = this.g;
        i = b1;
        if (bool)
          i = 0; 
        view.setVisibility(i);
      } 
      if (j != 0)
        P(); 
    } 
  }
  
  private void a0() {
    if (K() && this.L) {
      long l2;
      int i;
      o0 o01 = this.H;
      long l1 = 0L;
      if (o01 != null) {
        l1 = this.d0 + o01.l0();
        l2 = this.d0 + o01.w0();
      } else {
        l2 = 0L;
      } 
      TextView textView = this.n;
      if (textView != null && !this.O)
        textView.setText(h0.L(this.p, this.q, l1)); 
      m m1 = this.o;
      if (m1 != null) {
        m1.setPosition(l1);
        this.o.setBufferedPosition(l2);
      } 
      c c1 = this.J;
      if (c1 != null)
        c1.a(l1, l2); 
      removeCallbacks(this.t);
      if (o01 == null) {
        i = 1;
      } else {
        i = o01.V();
      } 
      long l3 = 1000L;
      if (o01 != null && o01.isPlaying()) {
        m m2 = this.o;
        if (m2 != null) {
          l2 = m2.getPreferredUpdateDelay();
        } else {
          l2 = 1000L;
        } 
        l2 = Math.min(l2, 1000L - l1 % 1000L);
        float f = (o01.W()).b;
        l1 = l3;
        if (f > 0.0F)
          l1 = (long)((float)l2 / f); 
        l1 = h0.o(l1, this.S, 1000L);
        postDelayed(this.t, l1);
      } else if (i != 4 && i != 1) {
        postDelayed(this.t, 1000L);
      } 
    } 
  }
  
  private void b0() {
    if (K() && this.L) {
      ImageView imageView = this.j;
      if (imageView != null) {
        if (this.T == 0) {
          imageView.setVisibility(8);
          return;
        } 
        o0 o01 = this.H;
        if (o01 == null) {
          U(false, (View)imageView);
          this.j.setImageDrawable(this.v);
          this.j.setContentDescription(this.y);
          return;
        } 
        U(true, (View)imageView);
        int i = o01.s0();
        if (i != 0) {
          if (i != 1) {
            if (i == 2) {
              this.j.setImageDrawable(this.x);
              this.j.setContentDescription(this.A);
            } 
          } else {
            this.j.setImageDrawable(this.w);
            this.j.setContentDescription(this.z);
          } 
        } else {
          this.j.setImageDrawable(this.v);
          this.j.setContentDescription(this.y);
        } 
        this.j.setVisibility(0);
      } 
    } 
  }
  
  private void c0() {
    if (K() && this.L) {
      ImageView imageView = this.k;
      if (imageView != null) {
        o0 o01 = this.H;
        if (!this.U) {
          imageView.setVisibility(8);
        } else if (o01 == null) {
          U(false, (View)imageView);
          this.k.setImageDrawable(this.C);
          this.k.setContentDescription(this.G);
        } else {
          Drawable drawable;
          String str;
          U(true, (View)imageView);
          ImageView imageView1 = this.k;
          if (o01.v0()) {
            drawable = this.B;
          } else {
            drawable = this.C;
          } 
          imageView1.setImageDrawable(drawable);
          imageView1 = this.k;
          if (o01.v0()) {
            str = this.F;
          } else {
            str = this.G;
          } 
          imageView1.setContentDescription(str);
        } 
      } 
    } 
  }
  
  private void d0() {
    boolean bool;
    byte b1;
    o0 o01 = this.H;
    if (o01 == null)
      return; 
    if (this.M && D(o01.t0(), this.s)) {
      bool = true;
    } else {
      bool = false;
    } 
    this.N = bool;
    long l = 0L;
    this.d0 = 0L;
    y0 y0 = o01.t0();
    if (!y0.q()) {
      int j;
      int k;
      int i = o01.i0();
      bool = this.N;
      if (bool) {
        j = 0;
      } else {
        j = i;
      } 
      if (bool) {
        k = y0.p() - 1;
      } else {
        k = i;
      } 
      l = 0L;
      b1 = 0;
      while (j <= k) {
        if (j == i)
          this.d0 = v.b(l); 
        y0.n(j, this.s);
        y0.c c1 = this.s;
        if (c1.m == -9223372036854775807L) {
          e.f(this.N ^ true);
          break;
        } 
        int n = c1.j;
        while (true) {
          long[] arrayOfLong;
          c1 = this.s;
          if (n <= c1.k) {
            Object object;
            y0.f(n, this.r);
            int i1 = this.r.c();
            byte b2 = 0;
            while (b2 < i1) {
              long l1 = this.r.f(b2);
              long l2 = l1;
              if (l1 == Long.MIN_VALUE) {
                l2 = this.r.d;
                if (l2 == -9223372036854775807L) {
                  Object object2 = object;
                  continue;
                } 
              } 
              l2 += this.r.l();
              Object object1 = object;
              if (l2 >= 0L) {
                arrayOfLong = this.W;
                if (object == arrayOfLong.length) {
                  int i3;
                  if (arrayOfLong.length == 0) {
                    i3 = 1;
                  } else {
                    i3 = arrayOfLong.length * 2;
                  } 
                  this.W = Arrays.copyOf(arrayOfLong, i3);
                  this.a0 = Arrays.copyOf(this.a0, i3);
                } 
                this.W[object] = v.b(l + l2);
                this.a0[object] = this.r.m(b2);
                int i2 = object + 1;
              } 
              continue;
              b2++;
              object = SYNTHETIC_LOCAL_VARIABLE_17;
            } 
            n++;
            continue;
          } 
          l += ((y0.c)arrayOfLong).m;
          j++;
        } 
      } 
    } else {
      b1 = 0;
    } 
    l = v.b(l);
    TextView textView = this.m;
    if (textView != null)
      textView.setText(h0.L(this.p, this.q, l)); 
    m m1 = this.o;
    if (m1 != null) {
      m1.setDuration(l);
      int j = this.b0.length;
      int i = b1 + j;
      long[] arrayOfLong = this.W;
      if (i > arrayOfLong.length) {
        this.W = Arrays.copyOf(arrayOfLong, i);
        this.a0 = Arrays.copyOf(this.a0, i);
      } 
      System.arraycopy(this.b0, 0, this.W, b1, j);
      System.arraycopy(this.c0, 0, this.a0, b1, j);
      this.o.setAdGroupTimesMs(this.W, this.a0, i);
    } 
    a0();
  }
  
  public void C(d paramd) {
    this.c.add(paramd);
  }
  
  public boolean E(KeyEvent paramKeyEvent) {
    int i = paramKeyEvent.getKeyCode();
    o0 o01 = this.H;
    if (o01 == null || !J(i))
      return false; 
    if (paramKeyEvent.getAction() == 0)
      if (i == 90) {
        F(o01);
      } else if (i == 89) {
        Q(o01);
      } else if (paramKeyEvent.getRepeatCount() == 0) {
        if (i != 85) {
          if (i != 87) {
            if (i != 88) {
              if (i != 126) {
                if (i == 127)
                  this.I.d(o01, false); 
              } else {
                this.I.d(o01, true);
              } 
            } else {
              N(o01);
            } 
          } else {
            M(o01);
          } 
        } else {
          this.I.d(o01, o01.b0() ^ true);
        } 
      }  
    return true;
  }
  
  public void H() {
    if (K()) {
      setVisibility(8);
      Iterator<d> iterator = this.c.iterator();
      while (iterator.hasNext())
        ((d)iterator.next()).a(getVisibility()); 
      removeCallbacks(this.t);
      removeCallbacks(this.u);
      this.V = -9223372036854775807L;
    } 
  }
  
  public boolean K() {
    boolean bool;
    if (getVisibility() == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void O(d paramd) {
    this.c.remove(paramd);
  }
  
  public void W() {
    if (!K()) {
      setVisibility(0);
      Iterator<d> iterator = this.c.iterator();
      while (iterator.hasNext())
        ((d)iterator.next()).a(getVisibility()); 
      X();
      P();
    } 
    I();
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent) {
    return (E(paramKeyEvent) || super.dispatchKeyEvent(paramKeyEvent));
  }
  
  public final boolean dispatchTouchEvent(MotionEvent paramMotionEvent) {
    if (paramMotionEvent.getAction() == 0) {
      removeCallbacks(this.u);
    } else if (paramMotionEvent.getAction() == 1) {
      I();
    } 
    return super.dispatchTouchEvent(paramMotionEvent);
  }
  
  public o0 getPlayer() {
    return this.H;
  }
  
  public int getRepeatToggleModes() {
    return this.T;
  }
  
  public boolean getShowShuffleButton() {
    return this.U;
  }
  
  public int getShowTimeoutMs() {
    return this.R;
  }
  
  public boolean getShowVrButton() {
    boolean bool;
    View view = this.l;
    if (view != null && view.getVisibility() == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void onAttachedToWindow() {
    super.onAttachedToWindow();
    this.L = true;
    long l = this.V;
    if (l != -9223372036854775807L) {
      l -= SystemClock.uptimeMillis();
      if (l <= 0L) {
        H();
      } else {
        postDelayed(this.u, l);
      } 
    } else if (K()) {
      I();
    } 
    X();
  }
  
  public void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    this.L = false;
    removeCallbacks(this.t);
    removeCallbacks(this.u);
  }
  
  public void setControlDispatcher(w paramw) {
    x x;
    w w1 = paramw;
    if (paramw == null)
      x = new x(); 
    this.I = (w)x;
  }
  
  public void setExtraAdGroupMarkers(long[] paramArrayOflong, boolean[] paramArrayOfboolean) {
    boolean bool = false;
    if (paramArrayOflong == null) {
      this.b0 = new long[0];
      this.c0 = new boolean[0];
    } else {
      paramArrayOfboolean = (boolean[])e.e(paramArrayOfboolean);
      if (paramArrayOflong.length == paramArrayOfboolean.length)
        bool = true; 
      e.a(bool);
      this.b0 = paramArrayOflong;
      this.c0 = paramArrayOfboolean;
    } 
    d0();
  }
  
  public void setFastForwardIncrementMs(int paramInt) {
    this.Q = paramInt;
    Y();
  }
  
  public void setPlaybackPreparer(m0 paramm0) {
    this.K = paramm0;
  }
  
  public void setPlayer(o0 paramo0) {
    Looper looper1 = Looper.myLooper();
    Looper looper2 = Looper.getMainLooper();
    boolean bool1 = true;
    if (looper1 == looper2) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    e.f(bool2);
    boolean bool2 = bool1;
    if (paramo0 != null)
      if (paramo0.u0() == Looper.getMainLooper()) {
        bool2 = bool1;
      } else {
        bool2 = false;
      }  
    e.a(bool2);
    o0 o01 = this.H;
    if (o01 == paramo0)
      return; 
    if (o01 != null)
      o01.h0(this.b); 
    this.H = paramo0;
    if (paramo0 != null)
      paramo0.f0(this.b); 
    X();
  }
  
  public void setProgressUpdateListener(c paramc) {
    this.J = paramc;
  }
  
  public void setRepeatToggleModes(int paramInt) {
    this.T = paramInt;
    o0 o01 = this.H;
    if (o01 != null) {
      int i = o01.s0();
      if (paramInt == 0 && i != 0) {
        this.I.a(this.H, 0);
      } else if (paramInt == 1 && i == 2) {
        this.I.a(this.H, 1);
      } else if (paramInt == 2 && i == 1) {
        this.I.a(this.H, 2);
      } 
    } 
    b0();
  }
  
  public void setRewindIncrementMs(int paramInt) {
    this.P = paramInt;
    Y();
  }
  
  public void setShowMultiWindowTimeBar(boolean paramBoolean) {
    this.M = paramBoolean;
    d0();
  }
  
  public void setShowShuffleButton(boolean paramBoolean) {
    this.U = paramBoolean;
    c0();
  }
  
  public void setShowTimeoutMs(int paramInt) {
    this.R = paramInt;
    if (K())
      I(); 
  }
  
  public void setShowVrButton(boolean paramBoolean) {
    View view = this.l;
    if (view != null) {
      byte b1;
      if (paramBoolean) {
        b1 = 0;
      } else {
        b1 = 8;
      } 
      view.setVisibility(b1);
    } 
  }
  
  public void setTimeBarMinUpdateInterval(int paramInt) {
    this.S = h0.n(paramInt, 16, 1000);
  }
  
  public void setVrButtonListener(View.OnClickListener paramOnClickListener) {
    View view = this.l;
    if (view != null)
      view.setOnClickListener(paramOnClickListener); 
  }
  
  private final class b implements o0.a, m.a, View.OnClickListener {
    private b(PlayerControlView this$0) {}
    
    public void a(m param1m, long param1Long) {
      if (PlayerControlView.l(this.b) != null)
        PlayerControlView.l(this.b).setText(h0.L(PlayerControlView.v(this.b), PlayerControlView.w(this.b), param1Long)); 
    }
    
    public void b(m param1m, long param1Long, boolean param1Boolean) {
      PlayerControlView.b(this.b, false);
      if (!param1Boolean && PlayerControlView.x(this.b) != null) {
        PlayerControlView playerControlView = this.b;
        PlayerControlView.y(playerControlView, PlayerControlView.x(playerControlView), param1Long);
      } 
    }
    
    public void c(m param1m, long param1Long) {
      PlayerControlView.b(this.b, true);
      if (PlayerControlView.l(this.b) != null)
        PlayerControlView.l(this.b).setText(h0.L(PlayerControlView.v(this.b), PlayerControlView.w(this.b), param1Long)); 
    }
    
    public void onClick(View param1View) {
      o0 o0 = PlayerControlView.x(this.b);
      if (o0 == null)
        return; 
      if (PlayerControlView.e(this.b) == param1View) {
        PlayerControlView.f(this.b, o0);
      } else if (PlayerControlView.g(this.b) == param1View) {
        PlayerControlView.h(this.b, o0);
      } else if (PlayerControlView.i(this.b) == param1View) {
        PlayerControlView.j(this.b, o0);
      } else if (PlayerControlView.k(this.b) == param1View) {
        PlayerControlView.m(this.b, o0);
      } else if (PlayerControlView.n(this.b) == param1View) {
        if (o0.V() == 1) {
          if (PlayerControlView.o(this.b) != null)
            PlayerControlView.o(this.b).a(); 
        } else if (o0.V() == 4) {
          PlayerControlView.p(this.b, o0, o0.i0(), -9223372036854775807L);
        } 
        PlayerControlView.q(this.b).d(o0, true);
      } else if (PlayerControlView.r(this.b) == param1View) {
        PlayerControlView.q(this.b).d(o0, false);
      } else if (PlayerControlView.s(this.b) == param1View) {
        PlayerControlView.q(this.b).a(o0, y.a(o0.s0(), PlayerControlView.t(this.b)));
      } else if (PlayerControlView.u(this.b) == param1View) {
        PlayerControlView.q(this.b).c(o0, o0.v0() ^ true);
      } 
    }
    
    public void onIsPlayingChanged(boolean param1Boolean) {
      PlayerControlView.A(this.b);
    }
    
    public void onPlayerStateChanged(boolean param1Boolean, int param1Int) {
      PlayerControlView.z(this.b);
      PlayerControlView.A(this.b);
    }
    
    public void onPositionDiscontinuity(int param1Int) {
      PlayerControlView.a(this.b);
      PlayerControlView.d(this.b);
    }
    
    public void onRepeatModeChanged(int param1Int) {
      PlayerControlView.B(this.b);
      PlayerControlView.a(this.b);
    }
    
    public void onShuffleModeEnabledChanged(boolean param1Boolean) {
      PlayerControlView.c(this.b);
      PlayerControlView.a(this.b);
    }
    
    public void onTimelineChanged(y0 param1y0, int param1Int) {
      PlayerControlView.a(this.b);
      PlayerControlView.d(this.b);
    }
  }
  
  public static interface c {
    void a(long param1Long1, long param1Long2);
  }
  
  public static interface d {
    void a(int param1Int);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/ui/PlayerControlView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */