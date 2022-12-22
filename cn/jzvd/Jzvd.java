package cn.jzvd;

import android.content.Context;
import android.media.AudioManager;
import android.provider.Settings;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedList;
import java.util.Timer;
import java.util.TimerTask;

public abstract class Jzvd extends FrameLayout implements View.OnClickListener, SeekBar.OnSeekBarChangeListener, View.OnTouchListener {
  public static Jzvd b;
  
  public static LinkedList<ViewGroup> c = new LinkedList<ViewGroup>();
  
  public static boolean d = true;
  
  public static int e = 6;
  
  public static int f = 1;
  
  public static boolean g = false;
  
  public static boolean h = false;
  
  public static int i = 2;
  
  public static long j = 0L;
  
  public static int k = 0;
  
  public static AudioManager.OnAudioFocusChangeListener l = new a();
  
  public ImageView A;
  
  public TextView B;
  
  public TextView C;
  
  public ViewGroup D;
  
  public ViewGroup E;
  
  public ViewGroup F;
  
  public JZTextureView G;
  
  protected Timer H;
  
  protected int I;
  
  protected int J;
  
  protected AudioManager K;
  
  protected b L;
  
  protected boolean M;
  
  protected float N;
  
  protected float O;
  
  protected boolean P;
  
  protected boolean Q;
  
  protected boolean R;
  
  protected long S;
  
  protected int T;
  
  protected float U;
  
  protected long V;
  
  public boolean W = false;
  
  public int m = -1;
  
  public int n = -1;
  
  public t o;
  
  public int p = 0;
  
  public int q = 0;
  
  public Class r;
  
  public u s;
  
  public int t = -1;
  
  public int u = 0;
  
  protected long v = 0L;
  
  public int w = -1;
  
  public long x = 0L;
  
  public ImageView y;
  
  public SeekBar z;
  
  public Jzvd(Context paramContext) {
    super(paramContext);
    p(paramContext);
  }
  
  public Jzvd(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    p(paramContext);
  }
  
  public static void D() {
    Log.d("JZVD", "releaseAllVideos");
    Jzvd jzvd = b;
    if (jzvd != null) {
      jzvd.E();
      b = null;
    } 
  }
  
  public static boolean b() {
    Log.i("JZVD", "backPress");
    if (c.size() != 0) {
      Jzvd jzvd = b;
      if (jzvd != null) {
        jzvd.o();
        return true;
      } 
    } 
    if (c.size() == 0) {
      Jzvd jzvd = b;
      if (jzvd != null && jzvd.n != 0) {
        jzvd.f();
        return true;
      } 
    } 
    return false;
  }
  
  public static void l() {
    Jzvd jzvd = b;
    if (jzvd != null) {
      int i = jzvd.m;
      if (i == 6 || i == 0 || i == 7) {
        D();
        return;
      } 
      k = i;
      jzvd.z();
      b.s.pause();
    } 
  }
  
  public static void m() {
    Jzvd jzvd = b;
    if (jzvd != null && jzvd.m == 5) {
      if (k == 5) {
        jzvd.z();
        b.s.pause();
      } else {
        jzvd.A();
        b.s.start();
      } 
      k = 0;
    } 
  }
  
  public static void setCurrentJzvd(Jzvd paramJzvd) {
    Jzvd jzvd = b;
    if (jzvd != null)
      jzvd.E(); 
    b = paramJzvd;
  }
  
  public static void setTextureViewRotation(int paramInt) {
    Jzvd jzvd = b;
    if (jzvd != null) {
      JZTextureView jZTextureView = jzvd.G;
      if (jZTextureView != null)
        jZTextureView.setRotation(paramInt); 
    } 
  }
  
  public static void setVideoImageDisplayType(int paramInt) {
    i = paramInt;
    Jzvd jzvd = b;
    if (jzvd != null) {
      JZTextureView jZTextureView = jzvd.G;
      if (jZTextureView != null)
        jZTextureView.requestLayout(); 
    } 
  }
  
  public void A() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("onStatePlaying  [");
    stringBuilder.append(hashCode());
    stringBuilder.append("] ");
    Log.i("JZVD", stringBuilder.toString());
    if (this.m == 3) {
      long l = this.x;
      if (l != 0L) {
        this.s.seekTo(l);
        this.x = 0L;
      } else {
        l = v.b(getContext(), this.o.c());
        if (l != 0L)
          this.s.seekTo(l); 
      } 
    } 
    this.m = 4;
    K();
  }
  
  public void B() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("onStatePreparing  [");
    stringBuilder.append(hashCode());
    stringBuilder.append("] ");
    Log.i("JZVD", stringBuilder.toString());
    this.m = 1;
    F();
  }
  
  public void C(int paramInt1, int paramInt2) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("onVideoSizeChanged  [");
    stringBuilder.append(hashCode());
    stringBuilder.append("] ");
    Log.i("JZVD", stringBuilder.toString());
    JZTextureView jZTextureView = this.G;
    if (jZTextureView != null) {
      int i = this.u;
      if (i != 0)
        jZTextureView.setRotation(i); 
      this.G.setVideoSize(paramInt1, paramInt2);
    } 
  }
  
  public void E() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("reset  [");
    stringBuilder.append(hashCode());
    stringBuilder.append("] ");
    Log.i("JZVD", stringBuilder.toString());
    int i = this.m;
    if (i == 4 || i == 5) {
      long l = getCurrentPositionWhenPlaying();
      v.g(getContext(), this.o.c(), l);
    } 
    c();
    h();
    i();
    j();
    y();
    this.D.removeAllViews();
    u.SAVED_SURFACE = null;
    ((AudioManager)getApplicationContext().getSystemService("audio")).abandonAudioFocus(l);
    u u1 = this.s;
    if (u1 != null)
      u1.release(); 
  }
  
  public void F() {
    this.z.setProgress(0);
    this.z.setSecondaryProgress(0);
    this.B.setText(v.l(0L));
    this.C.setText(v.l(0L));
  }
  
  public void G(int paramInt) {}
  
  public void H(float paramFloat, String paramString1, long paramLong1, String paramString2, long paramLong2) {}
  
  public void I(float paramFloat, int paramInt) {}
  
  public void J() {}
  
  public void K() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("startProgressTimer:  [");
    stringBuilder.append(hashCode());
    stringBuilder.append("] ");
    Log.i("JZVD", stringBuilder.toString());
    c();
    this.H = new Timer();
    b b1 = new b(this);
    this.L = b1;
    this.H.schedule(b1, 0L, 300L);
  }
  
  public void L() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("startVideo [");
    stringBuilder.append(hashCode());
    stringBuilder.append("] ");
    Log.d("JZVD", stringBuilder.toString());
    setCurrentJzvd(this);
    try {
      this.s = this.r.getConstructor(new Class[] { Jzvd.class }).newInstance(new Object[] { this });
    } catch (NoSuchMethodException noSuchMethodException) {
      noSuchMethodException.printStackTrace();
    } catch (IllegalAccessException illegalAccessException) {
      illegalAccessException.printStackTrace();
    } catch (InstantiationException instantiationException) {
      instantiationException.printStackTrace();
    } catch (InvocationTargetException invocationTargetException) {
      invocationTargetException.printStackTrace();
    } 
    a();
    AudioManager audioManager = (AudioManager)getApplicationContext().getSystemService("audio");
    this.K = audioManager;
    audioManager.requestAudioFocus(l, 3, 2);
    B();
  }
  
  public void a() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("addTextureView [");
    stringBuilder.append(hashCode());
    stringBuilder.append("] ");
    Log.d("JZVD", stringBuilder.toString());
    JZTextureView jZTextureView = this.G;
    if (jZTextureView != null)
      this.D.removeView((View)jZTextureView); 
    jZTextureView = new JZTextureView(getContext().getApplicationContext());
    this.G = jZTextureView;
    jZTextureView.setSurfaceTextureListener(this.s);
    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
    this.D.addView((View)this.G, (ViewGroup.LayoutParams)layoutParams);
  }
  
  public void c() {
    Timer timer = this.H;
    if (timer != null)
      timer.cancel(); 
    b b1 = this.L;
    if (b1 != null)
      b1.cancel(); 
  }
  
  public void d() {
    try {
      this.s.setVolume(1.0F, 1.0F);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void e(int paramInt, long paramLong) {
    this.m = 2;
    this.x = paramLong;
    this.o.a = paramInt;
    this.s.setSurface(null);
    this.s.release();
    this.s.prepare();
  }
  
  public void f() {
    v.j(getContext());
    v.i(getContext(), f);
    v.k(getContext());
    ((ViewGroup)v.h(getContext()).getWindow().getDecorView()).removeView((View)this);
    u u1 = this.s;
    if (u1 != null)
      u1.release(); 
    b = null;
  }
  
  public void g(ViewGroup paramViewGroup) {
    try {
      Jzvd jzvd = getClass().getConstructor(new Class[] { Context.class }).newInstance(new Object[] { getContext() });
      jzvd.setId(getId());
      paramViewGroup.addView((View)jzvd);
      jzvd.setUp(this.o.a(), 0, this.r);
    } catch (IllegalAccessException illegalAccessException) {
      illegalAccessException.printStackTrace();
    } catch (InstantiationException instantiationException) {
      instantiationException.printStackTrace();
    } catch (InvocationTargetException invocationTargetException) {
      invocationTargetException.printStackTrace();
    } catch (NoSuchMethodException noSuchMethodException) {
      noSuchMethodException.printStackTrace();
    } 
  }
  
  public Context getApplicationContext() {
    Context context = getContext();
    if (context != null) {
      Context context1 = context.getApplicationContext();
      if (context1 != null)
        return context1; 
    } 
    return context;
  }
  
  public long getCurrentPositionWhenPlaying() {
    int i = this.m;
    long l = 0L;
    if (i == 4 || i == 5)
      try {
        return this.s.getCurrentPosition();
      } catch (IllegalStateException illegalStateException) {
        illegalStateException.printStackTrace();
        return 0L;
      }  
    return l;
  }
  
  public long getDuration() {
    try {
      return this.s.getDuration();
    } catch (IllegalStateException illegalStateException) {
      illegalStateException.printStackTrace();
      return 0L;
    } 
  }
  
  public abstract int getLayoutId();
  
  public void h() {}
  
  public void i() {}
  
  public void j() {}
  
  public void k() {
    try {
      this.s.setVolume(0.0F, 0.0F);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void n() {
    ViewGroup viewGroup = (ViewGroup)getParent();
    viewGroup.removeView((View)this);
    g(viewGroup);
    c.add(viewGroup);
    ((ViewGroup)v.h(getContext()).getWindow().getDecorView()).addView((View)this, (ViewGroup.LayoutParams)new FrameLayout.LayoutParams(-1, -1));
    setScreenFullscreen();
    v.d(getContext());
    v.i(getContext(), e);
    v.e(getContext());
  }
  
  public void o() {
    this.v = System.currentTimeMillis();
    ((ViewGroup)v.h(getContext()).getWindow().getDecorView()).removeView((View)this);
    ((ViewGroup)c.getLast()).removeAllViews();
    ((ViewGroup)c.getLast()).addView((View)this, (ViewGroup.LayoutParams)new FrameLayout.LayoutParams(-1, -1));
    c.pop();
    setScreenNormal();
    v.j(getContext());
    v.i(getContext(), f);
    v.k(getContext());
  }
  
  public void onClick(View paramView) {
    int i = paramView.getId();
    if (i == y.start) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("onClick start [");
      stringBuilder.append(hashCode());
      stringBuilder.append("] ");
      Log.i("JZVD", stringBuilder.toString());
      t t1 = this.o;
      if (t1 == null || t1.b.isEmpty() || this.o.c() == null) {
        Toast.makeText(getContext(), getResources().getString(a0.no_url), 0).show();
        return;
      } 
      i = this.m;
      if (i == 0) {
        if (!this.o.c().toString().startsWith("file") && !this.o.c().toString().startsWith("/") && !v.f(getContext()) && !h) {
          J();
          return;
        } 
        L();
      } else if (i == 4) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("pauseVideo [");
        stringBuilder1.append(hashCode());
        stringBuilder1.append("] ");
        Log.d("JZVD", stringBuilder1.toString());
        this.s.pause();
        z();
      } else if (i == 5) {
        this.s.start();
        A();
      } else if (i == 6) {
        L();
      } 
    } else if (i == y.fullscreen) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("onClick fullscreen [");
      stringBuilder.append(hashCode());
      stringBuilder.append("] ");
      Log.i("JZVD", stringBuilder.toString());
      if (this.m == 6)
        return; 
      if (this.n == 1) {
        b();
      } else {
        stringBuilder = new StringBuilder();
        stringBuilder.append("toFullscreenActivity [");
        stringBuilder.append(hashCode());
        stringBuilder.append("] ");
        Log.d("JZVD", stringBuilder.toString());
        n();
      } 
    } 
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    int i = this.n;
    if (i == 1 || i == 2) {
      super.onMeasure(paramInt1, paramInt2);
      return;
    } 
    if (this.p != 0 && this.q != 0) {
      paramInt2 = View.MeasureSpec.getSize(paramInt1);
      paramInt1 = (int)(paramInt2 * this.q / this.p);
      setMeasuredDimension(paramInt2, paramInt1);
      paramInt2 = View.MeasureSpec.makeMeasureSpec(paramInt2, 1073741824);
      paramInt1 = View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824);
      getChildAt(0).measure(paramInt2, paramInt1);
    } else {
      super.onMeasure(paramInt1, paramInt2);
    } 
  }
  
  public void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean) {
    if (paramBoolean) {
      long l = getDuration();
      this.B.setText(v.l(paramInt * l / 100L));
    } 
  }
  
  public void onStartTrackingTouch(SeekBar paramSeekBar) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("bottomProgress onStartTrackingTouch [");
    stringBuilder.append(hashCode());
    stringBuilder.append("] ");
    Log.i("JZVD", stringBuilder.toString());
    c();
    for (ViewParent viewParent = getParent(); viewParent != null; viewParent = viewParent.getParent())
      viewParent.requestDisallowInterceptTouchEvent(true); 
  }
  
  public void onStopTrackingTouch(SeekBar paramSeekBar) {
    StringBuilder stringBuilder2 = new StringBuilder();
    stringBuilder2.append("bottomProgress onStopTrackingTouch [");
    stringBuilder2.append(hashCode());
    stringBuilder2.append("] ");
    Log.i("JZVD", stringBuilder2.toString());
    K();
    for (ViewParent viewParent = getParent(); viewParent != null; viewParent = viewParent.getParent())
      viewParent.requestDisallowInterceptTouchEvent(false); 
    int i = this.m;
    if (i != 4 && i != 5)
      return; 
    long l = paramSeekBar.getProgress() * getDuration() / 100L;
    this.w = paramSeekBar.getProgress();
    this.s.seekTo(l);
    StringBuilder stringBuilder1 = new StringBuilder();
    stringBuilder1.append("seekTo ");
    stringBuilder1.append(l);
    stringBuilder1.append(" [");
    stringBuilder1.append(hashCode());
    stringBuilder1.append("] ");
    Log.i("JZVD", stringBuilder1.toString());
  }
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent) {
    float f1 = paramMotionEvent.getX();
    float f2 = paramMotionEvent.getY();
    if (paramView.getId() == y.surface_container) {
      int i = paramMotionEvent.getAction();
      if (i != 0) {
        if (i != 1) {
          if (i == 2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("onTouch surfaceContainer actionMove [");
            stringBuilder.append(hashCode());
            stringBuilder.append("] ");
            Log.i("JZVD", stringBuilder.toString());
            f1 -= this.N;
            f2 -= this.O;
            float f3 = Math.abs(f1);
            float f4 = Math.abs(f2);
            if (this.n == 1 && !this.Q && !this.P && !this.R && (f3 > 80.0F || f4 > 80.0F)) {
              c();
              if (f3 >= 80.0F) {
                if (this.m != 7) {
                  this.Q = true;
                  this.S = getCurrentPositionWhenPlaying();
                } 
              } else if (this.N < this.I * 0.5F) {
                this.R = true;
                f3 = (v.c(getContext()).getAttributes()).screenBrightness;
                if (f3 < 0.0F) {
                  try {
                    this.U = Settings.System.getInt(getContext().getContentResolver(), "screen_brightness");
                    stringBuilder = new StringBuilder();
                    this();
                    stringBuilder.append("current system brightness: ");
                    stringBuilder.append(this.U);
                    Log.i("JZVD", stringBuilder.toString());
                  } catch (android.provider.Settings.SettingNotFoundException settingNotFoundException) {
                    settingNotFoundException.printStackTrace();
                  } 
                } else {
                  this.U = f3 * 255.0F;
                  stringBuilder = new StringBuilder();
                  stringBuilder.append("current activity brightness: ");
                  stringBuilder.append(this.U);
                  Log.i("JZVD", stringBuilder.toString());
                } 
              } else {
                this.P = true;
                this.T = this.K.getStreamVolume(3);
              } 
            } 
            if (this.Q) {
              long l1 = getDuration();
              long l2 = (int)((float)this.S + (float)l1 * f1 / this.I);
              this.V = l2;
              if (l2 > l1)
                this.V = l1; 
              String str1 = v.l(this.V);
              String str2 = v.l(l1);
              H(f1, str1, this.V, str2, l1);
            } 
            f1 = f2;
            if (this.P) {
              f1 = -f2;
              i = this.K.getStreamMaxVolume(3);
              int j = (int)(i * f1 * 3.0F / this.J);
              this.K.setStreamVolume(3, this.T + j, 0);
              i = (int)((this.T * 100 / i) + f1 * 3.0F * 100.0F / this.J);
              I(-f1, i);
            } 
            if (this.R) {
              f2 = -f1;
              i = (int)(f2 * 255.0F * 3.0F / this.J);
              WindowManager.LayoutParams layoutParams = v.c(getContext()).getAttributes();
              f3 = this.U;
              f1 = i;
              if ((f3 + f1) / 255.0F >= 1.0F) {
                layoutParams.screenBrightness = 1.0F;
              } else if ((f3 + f1) / 255.0F <= 0.0F) {
                layoutParams.screenBrightness = 0.01F;
              } else {
                layoutParams.screenBrightness = (f3 + f1) / 255.0F;
              } 
              v.c(getContext()).setAttributes(layoutParams);
              G((int)(this.U * 100.0F / 255.0F + f2 * 3.0F * 100.0F / this.J));
            } 
          } 
        } else {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("onTouch surfaceContainer actionUp [");
          stringBuilder.append(hashCode());
          stringBuilder.append("] ");
          Log.i("JZVD", stringBuilder.toString());
          this.M = false;
          i();
          j();
          h();
          if (this.Q) {
            this.s.seekTo(this.V);
            long l1 = getDuration();
            long l3 = this.V;
            long l2 = l1;
            if (l1 == 0L)
              l2 = 1L; 
            i = (int)(l3 * 100L / l2);
            this.z.setProgress(i);
          } 
          K();
        } 
      } else {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onTouch surfaceContainer actionDown [");
        stringBuilder.append(hashCode());
        stringBuilder.append("] ");
        Log.i("JZVD", stringBuilder.toString());
        this.M = true;
        this.N = f1;
        this.O = f2;
        this.P = false;
        this.Q = false;
        this.R = false;
      } 
    } 
    return false;
  }
  
  public void p(Context paramContext) {
    View.inflate(paramContext, getLayoutId(), (ViewGroup)this);
    this.y = (ImageView)findViewById(y.start);
    this.A = (ImageView)findViewById(y.fullscreen);
    this.z = (SeekBar)findViewById(y.bottom_seek_progress);
    this.B = (TextView)findViewById(y.current);
    this.C = (TextView)findViewById(y.total);
    this.F = (ViewGroup)findViewById(y.layout_bottom);
    this.D = (ViewGroup)findViewById(y.surface_container);
    this.E = (ViewGroup)findViewById(y.layout_top);
    this.y.setOnClickListener(this);
    this.A.setOnClickListener(this);
    this.z.setOnSeekBarChangeListener(this);
    this.F.setOnClickListener(this);
    this.D.setOnClickListener(this);
    this.I = (getContext().getResources().getDisplayMetrics()).widthPixels;
    this.J = (getContext().getResources().getDisplayMetrics()).heightPixels;
    this.m = -1;
  }
  
  public void q() {
    Runtime.getRuntime().gc();
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("onAutoCompletion  [");
    stringBuilder.append(hashCode());
    stringBuilder.append("] ");
    Log.i("JZVD", stringBuilder.toString());
    c();
    h();
    i();
    j();
    w();
    this.s.release();
    v.g(getContext(), this.o.c(), 0L);
  }
  
  public void r(int paramInt1, int paramInt2) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("onError ");
    stringBuilder.append(paramInt1);
    stringBuilder.append(" - ");
    stringBuilder.append(paramInt2);
    stringBuilder.append(" [");
    stringBuilder.append(hashCode());
    stringBuilder.append("] ");
    Log.e("JZVD", stringBuilder.toString());
    if (paramInt1 != 38 && paramInt2 != -38 && paramInt1 != -38 && paramInt2 != 38 && paramInt2 != -19) {
      x();
      this.s.release();
    } 
  }
  
  public void s(int paramInt1, int paramInt2) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("onInfo what - ");
    stringBuilder.append(paramInt1);
    stringBuilder.append(" extra - ");
    stringBuilder.append(paramInt2);
    Log.d("JZVD", stringBuilder.toString());
    if (paramInt1 == 3) {
      paramInt1 = this.m;
      if (paramInt1 == 3 || paramInt1 == 2)
        A(); 
    } 
  }
  
  public void setBufferProgress(int paramInt) {
    if (paramInt != 0)
      this.z.setSecondaryProgress(paramInt); 
  }
  
  public void setMediaInterface(Class paramClass) {
    E();
    this.r = paramClass;
  }
  
  public void setScreen(int paramInt) {
    if (paramInt != 0) {
      if (paramInt != 1) {
        if (paramInt == 2)
          setScreenTiny(); 
      } else {
        setScreenFullscreen();
      } 
    } else {
      setScreenNormal();
    } 
  }
  
  public void setScreenFullscreen() {
    this.n = 1;
  }
  
  public void setScreenNormal() {
    this.n = 0;
  }
  
  public void setScreenTiny() {
    this.n = 2;
  }
  
  public void setState(int paramInt) {
    setState(paramInt, 0, 0);
  }
  
  public void setState(int paramInt1, int paramInt2, int paramInt3) {
    if (paramInt1 != 0) {
      if (paramInt1 != 1) {
        if (paramInt1 != 2) {
          if (paramInt1 != 4) {
            if (paramInt1 != 5) {
              if (paramInt1 != 6) {
                if (paramInt1 == 7)
                  x(); 
              } else {
                w();
              } 
            } else {
              z();
            } 
          } else {
            A();
          } 
        } else {
          e(paramInt2, paramInt3);
        } 
      } else {
        B();
      } 
    } else {
      y();
    } 
  }
  
  public void setUp(t paramt, int paramInt) {
    setUp(paramt, paramInt, JZMediaSystem.class);
  }
  
  public void setUp(t paramt, int paramInt, Class paramClass) {
    if (System.currentTimeMillis() - this.v < 200L)
      return; 
    this.o = paramt;
    this.n = paramInt;
    y();
    this.r = paramClass;
  }
  
  public void setUp(String paramString1, String paramString2) {
    setUp(new t(paramString1, paramString2), 0);
  }
  
  public void setUp(String paramString1, String paramString2, int paramInt) {
    setUp(new t(paramString1, paramString2), paramInt);
  }
  
  public void setUp(String paramString1, String paramString2, int paramInt, Class paramClass) {
    setUp(new t(paramString1, paramString2), paramInt, paramClass);
  }
  
  public void t() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("onPrepared  [");
    stringBuilder.append(hashCode());
    stringBuilder.append("] ");
    Log.i("JZVD", stringBuilder.toString());
    this.m = 3;
    if (!this.W) {
      this.s.start();
      this.W = false;
    } 
    if (this.o.c().toString().toLowerCase().contains("mp3") || this.o.c().toString().toLowerCase().contains("wav"))
      A(); 
  }
  
  public void u(int paramInt, long paramLong1, long paramLong2) {
    if (!this.M) {
      int i = this.w;
      if (i != -1) {
        if (i > paramInt)
          return; 
        this.w = -1;
      } else if (paramInt != 0) {
        this.z.setProgress(paramInt);
      } 
    } 
    if (paramLong1 != 0L)
      this.B.setText(v.l(paramLong1)); 
    this.C.setText(v.l(paramLong2));
  }
  
  public void v() {}
  
  public void w() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("onStateAutoComplete  [");
    stringBuilder.append(hashCode());
    stringBuilder.append("] ");
    Log.i("JZVD", stringBuilder.toString());
    this.m = 6;
    c();
    this.z.setProgress(100);
    this.B.setText(this.C.getText());
  }
  
  public void x() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("onStateError  [");
    stringBuilder.append(hashCode());
    stringBuilder.append("] ");
    Log.i("JZVD", stringBuilder.toString());
    this.m = 7;
    c();
  }
  
  public void y() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("onStateNormal  [");
    stringBuilder.append(hashCode());
    stringBuilder.append("] ");
    Log.i("JZVD", stringBuilder.toString());
    this.m = 0;
    c();
    u u1 = this.s;
    if (u1 != null)
      u1.release(); 
  }
  
  public void z() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("onStatePause  [");
    stringBuilder.append(hashCode());
    stringBuilder.append("] ");
    Log.i("JZVD", stringBuilder.toString());
    this.m = 5;
    K();
  }
  
  static final class a implements AudioManager.OnAudioFocusChangeListener {
    public void onAudioFocusChange(int param1Int) {
      if (param1Int != -2) {
        if (param1Int == -1) {
          Jzvd.D();
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("AUDIOFOCUS_LOSS [");
          stringBuilder.append(hashCode());
          stringBuilder.append("]");
          Log.d("JZVD", stringBuilder.toString());
        } 
      } else {
        try {
          Jzvd jzvd = Jzvd.b;
          if (jzvd != null && jzvd.m == 4)
            jzvd.y.performClick(); 
        } catch (IllegalStateException illegalStateException) {
          illegalStateException.printStackTrace();
        } 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AUDIOFOCUS_LOSS_TRANSIENT [");
        stringBuilder.append(hashCode());
        stringBuilder.append("]");
        Log.d("JZVD", stringBuilder.toString());
      } 
    }
  }
  
  public class b extends TimerTask {
    public b(Jzvd this$0) {}
    
    public void run() {
      Jzvd jzvd = this.b;
      int i = jzvd.m;
      if (i == 4 || i == 5)
        jzvd.post(new n(this)); 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/cn/jzvd/Jzvd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */