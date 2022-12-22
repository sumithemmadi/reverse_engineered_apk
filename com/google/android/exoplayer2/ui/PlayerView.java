package com.google.android.exoplayer2.ui;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.l0;
import com.google.android.exoplayer2.m0;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.n0;
import com.google.android.exoplayer2.o0;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.text.j;
import com.google.android.exoplayer2.trackselection.f;
import com.google.android.exoplayer2.trackselection.g;
import com.google.android.exoplayer2.ui.spherical.SphericalGLSurfaceView;
import com.google.android.exoplayer2.ui.spherical.g;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.h0;
import com.google.android.exoplayer2.util.j;
import com.google.android.exoplayer2.video.VideoDecoderGLSurfaceView;
import com.google.android.exoplayer2.video.o;
import com.google.android.exoplayer2.video.p;
import com.google.android.exoplayer2.w;
import com.google.android.exoplayer2.y0;
import java.util.ArrayList;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

public class PlayerView extends FrameLayout {
  private boolean A;
  
  private final b b;
  
  private final AspectRatioFrameLayout c;
  
  private final View d;
  
  private final View e;
  
  private final ImageView f;
  
  private final SubtitleView g;
  
  private final View h;
  
  private final TextView i;
  
  private final PlayerControlView j;
  
  private final FrameLayout k;
  
  private final FrameLayout l;
  
  private o0 m;
  
  private boolean n;
  
  private PlayerControlView.d o;
  
  private boolean p;
  
  private Drawable q;
  
  private int r;
  
  private boolean s;
  
  private j<? super ExoPlaybackException> t;
  
  private CharSequence u;
  
  private int v;
  
  private boolean w;
  
  private boolean x;
  
  private boolean y;
  
  private int z;
  
  public PlayerView(Context paramContext) {
    this(paramContext, null);
  }
  
  public PlayerView(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public PlayerView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    ImageView imageView1;
    boolean bool1;
    boolean bool2;
    boolean bool3;
    boolean bool4;
    boolean bool5;
    boolean bool6;
    boolean bool7;
    boolean bool8;
    boolean bool9;
    boolean bool10;
    b b1 = new b(null);
    this.b = b1;
    if (isInEditMode()) {
      this.c = null;
      this.d = null;
      this.e = null;
      this.f = null;
      this.g = null;
      this.h = null;
      this.i = null;
      this.j = null;
      this.k = null;
      this.l = null;
      imageView1 = new ImageView(paramContext);
      if (h0.a >= 23) {
        s(getResources(), imageView1);
      } else {
        r(getResources(), imageView1);
      } 
      addView((View)imageView1);
      return;
    } 
    int i = i.exo_player_view;
    if (paramAttributeSet != null) {
      TypedArray typedArray = imageView1.getTheme().obtainStyledAttributes(paramAttributeSet, k.PlayerView, 0, 0);
      try {
        paramInt = k.PlayerView_shutter_background_color;
        bool1 = typedArray.hasValue(paramInt);
        k = typedArray.getColor(paramInt, 0);
        i = typedArray.getResourceId(k.PlayerView_player_layout_id, i);
        bool2 = typedArray.getBoolean(k.PlayerView_use_artwork, true);
        paramInt = typedArray.getResourceId(k.PlayerView_default_artwork, 0);
        bool3 = typedArray.getBoolean(k.PlayerView_use_controller, true);
        bool4 = typedArray.getInt(k.PlayerView_surface_type, 1);
        bool5 = typedArray.getInt(k.PlayerView_resize_mode, 0);
        int m = typedArray.getInt(k.PlayerView_show_timeout, 5000);
        bool6 = typedArray.getBoolean(k.PlayerView_hide_on_touch, true);
        bool7 = typedArray.getBoolean(k.PlayerView_auto_show, true);
        bool8 = typedArray.getInteger(k.PlayerView_show_buffering, 0);
        this.s = typedArray.getBoolean(k.PlayerView_keep_content_on_player_reset, this.s);
        bool9 = typedArray.getBoolean(k.PlayerView_hide_during_ads, true);
        typedArray.recycle();
        bool10 = paramInt;
      } finally {
        typedArray.recycle();
      } 
    } else {
      bool4 = true;
      bool5 = false;
      bool7 = true;
      bool8 = false;
      bool9 = true;
      bool6 = true;
      k = 0;
      bool1 = false;
      bool2 = true;
      bool10 = false;
      bool3 = true;
      paramInt = 5000;
    } 
    LayoutInflater.from((Context)imageView1).inflate(i, (ViewGroup)this);
    setDescendantFocusability(262144);
    AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout)findViewById(g.exo_content_frame);
    this.c = aspectRatioFrameLayout;
    if (aspectRatioFrameLayout != null)
      C(aspectRatioFrameLayout, bool5); 
    View view3 = findViewById(g.exo_shutter);
    this.d = view3;
    if (view3 != null && bool1)
      view3.setBackgroundColor(k); 
    if (aspectRatioFrameLayout != null && bool4) {
      ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
      if (bool4 != 2) {
        if (bool4 != 3) {
          if (bool4 != 4) {
            this.e = (View)new SurfaceView((Context)imageView1);
          } else {
            this.e = (View)new VideoDecoderGLSurfaceView((Context)imageView1);
          } 
        } else {
          SphericalGLSurfaceView sphericalGLSurfaceView = new SphericalGLSurfaceView((Context)imageView1);
          sphericalGLSurfaceView.setSingleTapListener(b1);
          this.e = (View)sphericalGLSurfaceView;
        } 
      } else {
        this.e = (View)new TextureView((Context)imageView1);
      } 
      this.e.setLayoutParams(layoutParams);
      aspectRatioFrameLayout.addView(this.e, 0);
    } else {
      this.e = null;
    } 
    this.k = (FrameLayout)findViewById(g.exo_ad_overlay);
    this.l = (FrameLayout)findViewById(g.exo_overlay);
    ImageView imageView2 = (ImageView)findViewById(g.exo_artwork);
    this.f = imageView2;
    if (bool2 && imageView2 != null) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    this.p = bool1;
    if (bool10)
      this.q = androidx.core.content.a.f(getContext(), bool10); 
    SubtitleView subtitleView = (SubtitleView)findViewById(g.exo_subtitles);
    this.g = subtitleView;
    if (subtitleView != null) {
      subtitleView.setUserDefaultStyle();
      subtitleView.setUserDefaultTextSize();
    } 
    View view2 = findViewById(g.exo_buffering);
    this.h = view2;
    if (view2 != null)
      view2.setVisibility(8); 
    this.r = bool8;
    TextView textView = (TextView)findViewById(g.exo_error_message);
    this.i = textView;
    if (textView != null)
      textView.setVisibility(8); 
    int k = g.exo_controller;
    PlayerControlView playerControlView2 = (PlayerControlView)findViewById(k);
    View view1 = findViewById(g.exo_controller_placeholder);
    if (playerControlView2 != null) {
      this.j = playerControlView2;
    } else if (view1 != null) {
      PlayerControlView playerControlView = new PlayerControlView((Context)imageView1, null, 0, paramAttributeSet);
      this.j = playerControlView;
      playerControlView.setId(k);
      playerControlView.setLayoutParams(view1.getLayoutParams());
      ViewGroup viewGroup = (ViewGroup)view1.getParent();
      k = viewGroup.indexOfChild(view1);
      viewGroup.removeView(view1);
      viewGroup.addView((View)playerControlView, k);
    } else {
      this.j = null;
    } 
    PlayerControlView playerControlView1 = this.j;
    if (playerControlView1 == null)
      paramInt = 0; 
    this.v = paramInt;
    this.y = bool6;
    this.w = bool7;
    this.x = bool9;
    if (bool3 && playerControlView1 != null) {
      bool3 = true;
    } else {
      bool3 = false;
    } 
    this.n = bool3;
    v();
    I();
    playerControlView1 = this.j;
    if (playerControlView1 != null)
      playerControlView1.C(b1); 
  }
  
  @RequiresNonNull({"artworkView"})
  private boolean A(Metadata paramMetadata) {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: iconst_m1
    //   3: istore_3
    //   4: iconst_0
    //   5: istore #4
    //   7: iload #4
    //   9: istore #5
    //   11: iload_2
    //   12: aload_1
    //   13: invokevirtual d : ()I
    //   16: if_icmpge -> 168
    //   19: aload_1
    //   20: iload_2
    //   21: invokevirtual c : (I)Lcom/google/android/exoplayer2/metadata/Metadata$Entry;
    //   24: astore #6
    //   26: aload #6
    //   28: instanceof com/google/android/exoplayer2/metadata/id3/ApicFrame
    //   31: ifeq -> 58
    //   34: aload #6
    //   36: checkcast com/google/android/exoplayer2/metadata/id3/ApicFrame
    //   39: astore #7
    //   41: aload #7
    //   43: getfield f : [B
    //   46: astore #6
    //   48: aload #7
    //   50: getfield e : I
    //   53: istore #8
    //   55: goto -> 94
    //   58: iload_3
    //   59: istore #9
    //   61: iload #4
    //   63: istore #5
    //   65: aload #6
    //   67: instanceof com/google/android/exoplayer2/metadata/flac/PictureFrame
    //   70: ifeq -> 155
    //   73: aload #6
    //   75: checkcast com/google/android/exoplayer2/metadata/flac/PictureFrame
    //   78: astore #7
    //   80: aload #7
    //   82: getfield i : [B
    //   85: astore #6
    //   87: aload #7
    //   89: getfield b : I
    //   92: istore #8
    //   94: iload_3
    //   95: iconst_m1
    //   96: if_icmpeq -> 112
    //   99: iload_3
    //   100: istore #9
    //   102: iload #4
    //   104: istore #5
    //   106: iload #8
    //   108: iconst_3
    //   109: if_icmpne -> 155
    //   112: aload #6
    //   114: iconst_0
    //   115: aload #6
    //   117: arraylength
    //   118: invokestatic decodeByteArray : ([BII)Landroid/graphics/Bitmap;
    //   121: astore #6
    //   123: aload_0
    //   124: new android/graphics/drawable/BitmapDrawable
    //   127: dup
    //   128: aload_0
    //   129: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   132: aload #6
    //   134: invokespecial <init> : (Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V
    //   137: invokespecial B : (Landroid/graphics/drawable/Drawable;)Z
    //   140: istore #5
    //   142: iload #8
    //   144: iconst_3
    //   145: if_icmpne -> 151
    //   148: goto -> 168
    //   151: iload #8
    //   153: istore #9
    //   155: iinc #2, 1
    //   158: iload #9
    //   160: istore_3
    //   161: iload #5
    //   163: istore #4
    //   165: goto -> 7
    //   168: iload #5
    //   170: ireturn
  }
  
  @RequiresNonNull({"artworkView"})
  private boolean B(Drawable paramDrawable) {
    if (paramDrawable != null) {
      int i = paramDrawable.getIntrinsicWidth();
      int k = paramDrawable.getIntrinsicHeight();
      if (i > 0 && k > 0) {
        z(i / k, this.c, (View)this.f);
        this.f.setImageDrawable(paramDrawable);
        this.f.setVisibility(0);
        return true;
      } 
    } 
    return false;
  }
  
  private static void C(AspectRatioFrameLayout paramAspectRatioFrameLayout, int paramInt) {
    paramAspectRatioFrameLayout.setResizeMode(paramInt);
  }
  
  private boolean D() {
    o0 o01 = this.m;
    boolean bool = true;
    if (o01 == null)
      return true; 
    int i = o01.V();
    if (this.w) {
      boolean bool1 = bool;
      if (i != 1) {
        bool1 = bool;
        if (i != 4) {
          if (!this.m.b0())
            return bool; 
        } else {
          return bool1;
        } 
      } else {
        return bool1;
      } 
    } 
    return false;
  }
  
  private void F(boolean paramBoolean) {
    int i;
    if (!M())
      return; 
    PlayerControlView playerControlView = this.j;
    if (paramBoolean) {
      i = 0;
    } else {
      i = this.v;
    } 
    playerControlView.setShowTimeoutMs(i);
    this.j.W();
  }
  
  private boolean G() {
    if (!M() || this.m == null)
      return false; 
    if (!this.j.K()) {
      y(true);
    } else if (this.y) {
      this.j.H();
    } 
    return true;
  }
  
  private void H() {
    // Byte code:
    //   0: aload_0
    //   1: getfield h : Landroid/view/View;
    //   4: ifnull -> 98
    //   7: aload_0
    //   8: getfield m : Lcom/google/android/exoplayer2/o0;
    //   11: astore_1
    //   12: iconst_1
    //   13: istore_2
    //   14: iconst_0
    //   15: istore_3
    //   16: aload_1
    //   17: ifnull -> 69
    //   20: aload_1
    //   21: invokeinterface V : ()I
    //   26: iconst_2
    //   27: if_icmpne -> 69
    //   30: aload_0
    //   31: getfield r : I
    //   34: istore #4
    //   36: iload_2
    //   37: istore #5
    //   39: iload #4
    //   41: iconst_2
    //   42: if_icmpeq -> 72
    //   45: iload #4
    //   47: iconst_1
    //   48: if_icmpne -> 69
    //   51: aload_0
    //   52: getfield m : Lcom/google/android/exoplayer2/o0;
    //   55: invokeinterface b0 : ()Z
    //   60: ifeq -> 69
    //   63: iload_2
    //   64: istore #5
    //   66: goto -> 72
    //   69: iconst_0
    //   70: istore #5
    //   72: aload_0
    //   73: getfield h : Landroid/view/View;
    //   76: astore_1
    //   77: iload #5
    //   79: ifeq -> 88
    //   82: iload_3
    //   83: istore #5
    //   85: goto -> 92
    //   88: bipush #8
    //   90: istore #5
    //   92: aload_1
    //   93: iload #5
    //   95: invokevirtual setVisibility : (I)V
    //   98: return
  }
  
  private void I() {
    PlayerControlView playerControlView = this.j;
    String str = null;
    if (playerControlView == null || !this.n) {
      setContentDescription(null);
      return;
    } 
    if (playerControlView.getVisibility() == 0) {
      if (this.y)
        str = getResources().getString(j.exo_controls_hide); 
      setContentDescription(str);
    } else {
      setContentDescription(getResources().getString(j.exo_controls_show));
    } 
  }
  
  private void J() {
    TextView textView = this.i;
    if (textView != null) {
      CharSequence charSequence = this.u;
      if (charSequence != null) {
        textView.setText(charSequence);
        this.i.setVisibility(0);
        return;
      } 
      o0 o01 = this.m;
      if (o01 != null) {
        ExoPlaybackException exoPlaybackException = o01.d0();
      } else {
        o01 = null;
      } 
      if (o01 != null) {
        j<? super ExoPlaybackException> j1 = this.t;
        if (j1 != null) {
          CharSequence charSequence1 = (CharSequence)(j1.a((Throwable)o01)).second;
          this.i.setText(charSequence1);
          this.i.setVisibility(0);
          return;
        } 
      } 
      this.i.setVisibility(8);
    } 
  }
  
  private void K(boolean paramBoolean) {
    o0 o01 = this.m;
    if (o01 == null || o01.r0().c()) {
      if (!this.s) {
        u();
        q();
      } 
      return;
    } 
    if (paramBoolean && !this.s)
      q(); 
    g g = o01.x0();
    byte b1;
    for (b1 = 0; b1 < g.a; b1++) {
      if (o01.y0(b1) == 2 && g.a(b1) != null) {
        u();
        return;
      } 
    } 
    q();
    if (L()) {
      for (b1 = 0; b1 < g.a; b1++) {
        f f = g.a(b1);
        if (f != null)
          for (byte b2 = 0; b2 < f.length(); b2++) {
            Metadata metadata = (f.d(b2)).h;
            if (metadata != null && A(metadata))
              return; 
          }  
      } 
      if (B(this.q))
        return; 
    } 
    u();
  }
  
  @EnsuresNonNullIf(expression = {"artworkView"}, result = true)
  private boolean L() {
    if (this.p) {
      e.h(this.f);
      return true;
    } 
    return false;
  }
  
  @EnsuresNonNullIf(expression = {"controller"}, result = true)
  private boolean M() {
    if (this.n) {
      e.h(this.j);
      return true;
    } 
    return false;
  }
  
  private static void p(TextureView paramTextureView, int paramInt) {
    Matrix matrix = new Matrix();
    float f1 = paramTextureView.getWidth();
    float f2 = paramTextureView.getHeight();
    if (f1 != 0.0F && f2 != 0.0F && paramInt != 0) {
      float f3 = f1 / 2.0F;
      float f4 = f2 / 2.0F;
      matrix.postRotate(paramInt, f3, f4);
      RectF rectF1 = new RectF(0.0F, 0.0F, f1, f2);
      RectF rectF2 = new RectF();
      matrix.mapRect(rectF2, rectF1);
      matrix.postScale(f1 / rectF2.width(), f2 / rectF2.height(), f3, f4);
    } 
    paramTextureView.setTransform(matrix);
  }
  
  private void q() {
    View view = this.d;
    if (view != null)
      view.setVisibility(0); 
  }
  
  private static void r(Resources paramResources, ImageView paramImageView) {
    paramImageView.setImageDrawable(paramResources.getDrawable(f.exo_edit_mode_logo));
    paramImageView.setBackgroundColor(paramResources.getColor(e.exo_edit_mode_background_color));
  }
  
  @TargetApi(23)
  private static void s(Resources paramResources, ImageView paramImageView) {
    paramImageView.setImageDrawable(paramResources.getDrawable(f.exo_edit_mode_logo, null));
    paramImageView.setBackgroundColor(paramResources.getColor(e.exo_edit_mode_background_color, null));
  }
  
  private void u() {
    ImageView imageView = this.f;
    if (imageView != null) {
      imageView.setImageResource(17170445);
      this.f.setVisibility(4);
    } 
  }
  
  @SuppressLint({"InlinedApi"})
  private boolean w(int paramInt) {
    return (paramInt == 19 || paramInt == 270 || paramInt == 22 || paramInt == 271 || paramInt == 20 || paramInt == 269 || paramInt == 21 || paramInt == 268 || paramInt == 23);
  }
  
  private boolean x() {
    boolean bool;
    o0 o01 = this.m;
    if (o01 != null && o01.Y() && this.m.b0()) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private void y(boolean paramBoolean) {
    if (x() && this.x)
      return; 
    if (M()) {
      boolean bool;
      if (this.j.K() && this.j.getShowTimeoutMs() <= 0) {
        bool = true;
      } else {
        bool = false;
      } 
      boolean bool1 = D();
      if (paramBoolean || bool || bool1)
        F(bool1); 
    } 
  }
  
  public void E() {
    F(D());
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent) {
    o0 o01 = this.m;
    if (o01 != null && o01.Y())
      return super.dispatchKeyEvent(paramKeyEvent); 
    boolean bool = w(paramKeyEvent.getKeyCode());
    boolean bool1 = false;
    if (bool && M() && !this.j.K()) {
      y(true);
    } else if (t(paramKeyEvent) || super.dispatchKeyEvent(paramKeyEvent)) {
      y(true);
    } else {
      boolean bool2 = bool1;
      if (bool) {
        bool2 = bool1;
        if (M()) {
          y(true);
          bool2 = bool1;
        } 
      } 
      return bool2;
    } 
    return true;
  }
  
  public View[] getAdOverlayViews() {
    ArrayList<FrameLayout> arrayList = new ArrayList();
    FrameLayout frameLayout = this.l;
    if (frameLayout != null)
      arrayList.add(frameLayout); 
    frameLayout = this.j;
    if (frameLayout != null)
      arrayList.add(frameLayout); 
    return arrayList.<View>toArray(new View[0]);
  }
  
  public ViewGroup getAdViewGroup() {
    return (ViewGroup)e.i(this.k, "exo_ad_overlay must be present for ad playback");
  }
  
  public boolean getControllerAutoShow() {
    return this.w;
  }
  
  public boolean getControllerHideOnTouch() {
    return this.y;
  }
  
  public int getControllerShowTimeoutMs() {
    return this.v;
  }
  
  public Drawable getDefaultArtwork() {
    return this.q;
  }
  
  public FrameLayout getOverlayFrameLayout() {
    return this.l;
  }
  
  public o0 getPlayer() {
    return this.m;
  }
  
  public int getResizeMode() {
    e.h(this.c);
    return this.c.getResizeMode();
  }
  
  public SubtitleView getSubtitleView() {
    return this.g;
  }
  
  public boolean getUseArtwork() {
    return this.p;
  }
  
  public boolean getUseController() {
    return this.n;
  }
  
  public View getVideoSurfaceView() {
    return this.e;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) {
    if (!M() || this.m == null)
      return false; 
    int i = paramMotionEvent.getAction();
    if (i != 0) {
      if (i != 1)
        return false; 
      if (this.A) {
        this.A = false;
        performClick();
        return true;
      } 
      return false;
    } 
    this.A = true;
    return true;
  }
  
  public boolean onTrackballEvent(MotionEvent paramMotionEvent) {
    if (!M() || this.m == null)
      return false; 
    y(true);
    return true;
  }
  
  public boolean performClick() {
    super.performClick();
    return G();
  }
  
  public void setAspectRatioListener(AspectRatioFrameLayout.b paramb) {
    e.h(this.c);
    this.c.setAspectRatioListener(paramb);
  }
  
  public void setControlDispatcher(w paramw) {
    e.h(this.j);
    this.j.setControlDispatcher(paramw);
  }
  
  public void setControllerAutoShow(boolean paramBoolean) {
    this.w = paramBoolean;
  }
  
  public void setControllerHideDuringAds(boolean paramBoolean) {
    this.x = paramBoolean;
  }
  
  public void setControllerHideOnTouch(boolean paramBoolean) {
    e.h(this.j);
    this.y = paramBoolean;
    I();
  }
  
  public void setControllerShowTimeoutMs(int paramInt) {
    e.h(this.j);
    this.v = paramInt;
    if (this.j.K())
      E(); 
  }
  
  public void setControllerVisibilityListener(PlayerControlView.d paramd) {
    e.h(this.j);
    PlayerControlView.d d1 = this.o;
    if (d1 == paramd)
      return; 
    if (d1 != null)
      this.j.O(d1); 
    this.o = paramd;
    if (paramd != null)
      this.j.C(paramd); 
  }
  
  public void setCustomErrorMessage(CharSequence paramCharSequence) {
    boolean bool;
    if (this.i != null) {
      bool = true;
    } else {
      bool = false;
    } 
    e.f(bool);
    this.u = paramCharSequence;
    J();
  }
  
  @Deprecated
  public void setDefaultArtwork(Bitmap paramBitmap) {
    BitmapDrawable bitmapDrawable;
    if (paramBitmap == null) {
      paramBitmap = null;
    } else {
      bitmapDrawable = new BitmapDrawable(getResources(), paramBitmap);
    } 
    setDefaultArtwork((Drawable)bitmapDrawable);
  }
  
  public void setDefaultArtwork(Drawable paramDrawable) {
    if (this.q != paramDrawable) {
      this.q = paramDrawable;
      K(false);
    } 
  }
  
  public void setErrorMessageProvider(j<? super ExoPlaybackException> paramj) {
    if (this.t != paramj) {
      this.t = paramj;
      J();
    } 
  }
  
  public void setExtraAdGroupMarkers(long[] paramArrayOflong, boolean[] paramArrayOfboolean) {
    e.h(this.j);
    this.j.setExtraAdGroupMarkers(paramArrayOflong, paramArrayOfboolean);
  }
  
  public void setFastForwardIncrementMs(int paramInt) {
    e.h(this.j);
    this.j.setFastForwardIncrementMs(paramInt);
  }
  
  public void setKeepContentOnPlayerReset(boolean paramBoolean) {
    if (this.s != paramBoolean) {
      this.s = paramBoolean;
      K(false);
    } 
  }
  
  public void setPlaybackPreparer(m0 paramm0) {
    e.h(this.j);
    this.j.setPlaybackPreparer(paramm0);
  }
  
  public void setPlayer(o0 paramo0) {
    boolean bool;
    if (Looper.myLooper() == Looper.getMainLooper()) {
      bool = true;
    } else {
      bool = false;
    } 
    e.f(bool);
    if (paramo0 == null || paramo0.u0() == Looper.getMainLooper()) {
      bool = true;
    } else {
      bool = false;
    } 
    e.a(bool);
    o0 o01 = this.m;
    if (o01 == paramo0)
      return; 
    if (o01 != null) {
      o01.h0(this.b);
      o0.c c = o01.k0();
      if (c != null) {
        c.o(this.b);
        View view = this.e;
        if (view instanceof TextureView) {
          c.f((TextureView)view);
        } else if (view instanceof SphericalGLSurfaceView) {
          ((SphericalGLSurfaceView)view).setVideoComponent(null);
        } else if (view instanceof VideoDecoderGLSurfaceView) {
          c.g(null);
        } else if (view instanceof SurfaceView) {
          c.l((SurfaceView)view);
        } 
      } 
      o0.b b1 = o01.z0();
      if (b1 != null)
        b1.i(this.b); 
    } 
    this.m = paramo0;
    if (M())
      this.j.setPlayer(paramo0); 
    SubtitleView subtitleView = this.g;
    if (subtitleView != null)
      subtitleView.setCues(null); 
    H();
    J();
    K(true);
    if (paramo0 != null) {
      o0.c c = paramo0.k0();
      if (c != null) {
        View view = this.e;
        if (view instanceof TextureView) {
          c.n((TextureView)view);
        } else if (view instanceof SphericalGLSurfaceView) {
          ((SphericalGLSurfaceView)view).setVideoComponent(c);
        } else if (view instanceof VideoDecoderGLSurfaceView) {
          c.g(((VideoDecoderGLSurfaceView)view).getVideoDecoderOutputBufferRenderer());
        } else if (view instanceof SurfaceView) {
          c.h((SurfaceView)view);
        } 
        c.j(this.b);
      } 
      o0.b b1 = paramo0.z0();
      if (b1 != null)
        b1.m(this.b); 
      paramo0.f0(this.b);
      y(false);
    } else {
      v();
    } 
  }
  
  public void setRepeatToggleModes(int paramInt) {
    e.h(this.j);
    this.j.setRepeatToggleModes(paramInt);
  }
  
  public void setResizeMode(int paramInt) {
    e.h(this.c);
    this.c.setResizeMode(paramInt);
  }
  
  public void setRewindIncrementMs(int paramInt) {
    e.h(this.j);
    this.j.setRewindIncrementMs(paramInt);
  }
  
  public void setShowBuffering(int paramInt) {
    if (this.r != paramInt) {
      this.r = paramInt;
      H();
    } 
  }
  
  @Deprecated
  public void setShowBuffering(boolean paramBoolean) {
    setShowBuffering(paramBoolean);
  }
  
  public void setShowMultiWindowTimeBar(boolean paramBoolean) {
    e.h(this.j);
    this.j.setShowMultiWindowTimeBar(paramBoolean);
  }
  
  public void setShowShuffleButton(boolean paramBoolean) {
    e.h(this.j);
    this.j.setShowShuffleButton(paramBoolean);
  }
  
  public void setShutterBackgroundColor(int paramInt) {
    View view = this.d;
    if (view != null)
      view.setBackgroundColor(paramInt); 
  }
  
  public void setUseArtwork(boolean paramBoolean) {
    boolean bool;
    if (!paramBoolean || this.f != null) {
      bool = true;
    } else {
      bool = false;
    } 
    e.f(bool);
    if (this.p != paramBoolean) {
      this.p = paramBoolean;
      K(false);
    } 
  }
  
  public void setUseController(boolean paramBoolean) {
    boolean bool;
    if (!paramBoolean || this.j != null) {
      bool = true;
    } else {
      bool = false;
    } 
    e.f(bool);
    if (this.n == paramBoolean)
      return; 
    this.n = paramBoolean;
    if (M()) {
      this.j.setPlayer(this.m);
    } else {
      PlayerControlView playerControlView = this.j;
      if (playerControlView != null) {
        playerControlView.H();
        this.j.setPlayer(null);
      } 
    } 
    I();
  }
  
  public void setVisibility(int paramInt) {
    super.setVisibility(paramInt);
    View view = this.e;
    if (view instanceof SurfaceView)
      view.setVisibility(paramInt); 
  }
  
  public boolean t(KeyEvent paramKeyEvent) {
    boolean bool;
    if (M() && this.j.E(paramKeyEvent)) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void v() {
    PlayerControlView playerControlView = this.j;
    if (playerControlView != null)
      playerControlView.H(); 
  }
  
  protected void z(float paramFloat, AspectRatioFrameLayout paramAspectRatioFrameLayout, View paramView) {
    if (paramAspectRatioFrameLayout != null) {
      if (paramView instanceof SphericalGLSurfaceView)
        paramFloat = 0.0F; 
      paramAspectRatioFrameLayout.setAspectRatio(paramFloat);
    } 
  }
  
  private final class b implements o0.a, j, p, View.OnLayoutChangeListener, g, PlayerControlView.d {
    private b(PlayerView this$0) {}
    
    public void a(int param1Int) {
      PlayerView.f(this.b);
    }
    
    public void h(List<com.google.android.exoplayer2.text.b> param1List) {
      if (PlayerView.a(this.b) != null)
        PlayerView.a(this.b).h(param1List); 
    }
    
    public void onLayoutChange(View param1View, int param1Int1, int param1Int2, int param1Int3, int param1Int4, int param1Int5, int param1Int6, int param1Int7, int param1Int8) {
      PlayerView.j((TextureView)param1View, PlayerView.h(this.b));
    }
    
    public void onPlayerStateChanged(boolean param1Boolean, int param1Int) {
      PlayerView.n(this.b);
      PlayerView.o(this.b);
      if (PlayerView.b(this.b) && PlayerView.c(this.b)) {
        this.b.v();
      } else {
        PlayerView.d(this.b, false);
      } 
    }
    
    public void onPositionDiscontinuity(int param1Int) {
      if (PlayerView.b(this.b) && PlayerView.c(this.b))
        this.b.v(); 
    }
    
    public void onRenderedFirstFrame() {
      if (PlayerView.l(this.b) != null)
        PlayerView.l(this.b).setVisibility(4); 
    }
    
    public boolean onSingleTapUp(MotionEvent param1MotionEvent) {
      return PlayerView.e(this.b);
    }
    
    public void onTracksChanged(TrackGroupArray param1TrackGroupArray, g param1g) {
      PlayerView.m(this.b, false);
    }
    
    public void onVideoSizeChanged(int param1Int1, int param1Int2, int param1Int3, float param1Float) {
      // Byte code:
      //   0: iload_2
      //   1: ifeq -> 24
      //   4: iload_1
      //   5: ifne -> 11
      //   8: goto -> 24
      //   11: iload_1
      //   12: i2f
      //   13: fload #4
      //   15: fmul
      //   16: iload_2
      //   17: i2f
      //   18: fdiv
      //   19: fstore #4
      //   21: goto -> 27
      //   24: fconst_1
      //   25: fstore #4
      //   27: fload #4
      //   29: fstore #5
      //   31: aload_0
      //   32: getfield b : Lcom/google/android/exoplayer2/ui/PlayerView;
      //   35: invokestatic g : (Lcom/google/android/exoplayer2/ui/PlayerView;)Landroid/view/View;
      //   38: instanceof android/view/TextureView
      //   41: ifeq -> 138
      //   44: iload_3
      //   45: bipush #90
      //   47: if_icmpeq -> 61
      //   50: fload #4
      //   52: fstore #5
      //   54: iload_3
      //   55: sipush #270
      //   58: if_icmpne -> 67
      //   61: fconst_1
      //   62: fload #4
      //   64: fdiv
      //   65: fstore #5
      //   67: aload_0
      //   68: getfield b : Lcom/google/android/exoplayer2/ui/PlayerView;
      //   71: invokestatic h : (Lcom/google/android/exoplayer2/ui/PlayerView;)I
      //   74: ifeq -> 88
      //   77: aload_0
      //   78: getfield b : Lcom/google/android/exoplayer2/ui/PlayerView;
      //   81: invokestatic g : (Lcom/google/android/exoplayer2/ui/PlayerView;)Landroid/view/View;
      //   84: aload_0
      //   85: invokevirtual removeOnLayoutChangeListener : (Landroid/view/View$OnLayoutChangeListener;)V
      //   88: aload_0
      //   89: getfield b : Lcom/google/android/exoplayer2/ui/PlayerView;
      //   92: iload_3
      //   93: invokestatic i : (Lcom/google/android/exoplayer2/ui/PlayerView;I)I
      //   96: pop
      //   97: aload_0
      //   98: getfield b : Lcom/google/android/exoplayer2/ui/PlayerView;
      //   101: invokestatic h : (Lcom/google/android/exoplayer2/ui/PlayerView;)I
      //   104: ifeq -> 118
      //   107: aload_0
      //   108: getfield b : Lcom/google/android/exoplayer2/ui/PlayerView;
      //   111: invokestatic g : (Lcom/google/android/exoplayer2/ui/PlayerView;)Landroid/view/View;
      //   114: aload_0
      //   115: invokevirtual addOnLayoutChangeListener : (Landroid/view/View$OnLayoutChangeListener;)V
      //   118: aload_0
      //   119: getfield b : Lcom/google/android/exoplayer2/ui/PlayerView;
      //   122: invokestatic g : (Lcom/google/android/exoplayer2/ui/PlayerView;)Landroid/view/View;
      //   125: checkcast android/view/TextureView
      //   128: aload_0
      //   129: getfield b : Lcom/google/android/exoplayer2/ui/PlayerView;
      //   132: invokestatic h : (Lcom/google/android/exoplayer2/ui/PlayerView;)I
      //   135: invokestatic j : (Landroid/view/TextureView;I)V
      //   138: aload_0
      //   139: getfield b : Lcom/google/android/exoplayer2/ui/PlayerView;
      //   142: astore #6
      //   144: aload #6
      //   146: fload #5
      //   148: aload #6
      //   150: invokestatic k : (Lcom/google/android/exoplayer2/ui/PlayerView;)Lcom/google/android/exoplayer2/ui/AspectRatioFrameLayout;
      //   153: aload_0
      //   154: getfield b : Lcom/google/android/exoplayer2/ui/PlayerView;
      //   157: invokestatic g : (Lcom/google/android/exoplayer2/ui/PlayerView;)Landroid/view/View;
      //   160: invokevirtual z : (FLcom/google/android/exoplayer2/ui/AspectRatioFrameLayout;Landroid/view/View;)V
      //   163: return
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/ui/PlayerView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */