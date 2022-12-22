package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.util.b1;
import com.google.android.gms.ads.internal.util.h1;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@TargetApi(14)
public final class zzbam extends zzbav implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, TextureView.SurfaceTextureListener {
  private static final Map<Integer, String> d;
  
  private final eo e;
  
  private final do f;
  
  private final boolean g;
  
  private int h = 0;
  
  private int i = 0;
  
  private MediaPlayer j;
  
  private Uri k;
  
  private int l;
  
  private int m;
  
  private int n;
  
  private int o;
  
  private int p;
  
  private co q;
  
  private boolean r;
  
  private int s;
  
  private mn t;
  
  private Integer u = null;
  
  static {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    d = (Map)hashMap;
    int i = Build.VERSION.SDK_INT;
    if (i >= 17) {
      hashMap.put(Integer.valueOf(-1004), "MEDIA_ERROR_IO");
      hashMap.put(Integer.valueOf(-1007), "MEDIA_ERROR_MALFORMED");
      hashMap.put(Integer.valueOf(-1010), "MEDIA_ERROR_UNSUPPORTED");
      hashMap.put(Integer.valueOf(-110), "MEDIA_ERROR_TIMED_OUT");
      hashMap.put(Integer.valueOf(3), "MEDIA_INFO_VIDEO_RENDERING_START");
    } 
    hashMap.put(Integer.valueOf(100), "MEDIA_ERROR_SERVER_DIED");
    hashMap.put(Integer.valueOf(1), "MEDIA_ERROR_UNKNOWN");
    hashMap.put(Integer.valueOf(1), "MEDIA_INFO_UNKNOWN");
    hashMap.put(Integer.valueOf(700), "MEDIA_INFO_VIDEO_TRACK_LAGGING");
    hashMap.put(Integer.valueOf(701), "MEDIA_INFO_BUFFERING_START");
    hashMap.put(Integer.valueOf(702), "MEDIA_INFO_BUFFERING_END");
    hashMap.put(Integer.valueOf(800), "MEDIA_INFO_BAD_INTERLEAVING");
    hashMap.put(Integer.valueOf(801), "MEDIA_INFO_NOT_SEEKABLE");
    hashMap.put(Integer.valueOf(802), "MEDIA_INFO_METADATA_UPDATE");
    if (i >= 19) {
      hashMap.put(Integer.valueOf(901), "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
      hashMap.put(Integer.valueOf(902), "MEDIA_INFO_SUBTITLE_TIMED_OUT");
    } 
  }
  
  public zzbam(Context paramContext, eo parameo, boolean paramBoolean1, boolean paramBoolean2, bo parambo, do paramdo) {
    super(paramContext);
    setSurfaceTextureListener(this);
    this.e = parameo;
    this.f = paramdo;
    this.r = paramBoolean1;
    this.g = paramBoolean2;
    paramdo.d(this);
  }
  
  private final boolean A() {
    if (this.j != null) {
      int i = this.h;
      if (i != -1 && i != 0 && i != 1)
        return true; 
    } 
    return false;
  }
  
  private final void B(boolean paramBoolean) {
    b1.m("AdMediaPlayerView release");
    co co1 = this.q;
    if (co1 != null) {
      co1.e();
      this.q = null;
    } 
    MediaPlayer mediaPlayer = this.j;
    if (mediaPlayer != null) {
      mediaPlayer.reset();
      this.j.release();
      this.j = null;
      D(0);
      if (paramBoolean) {
        this.i = 0;
        this.i = 0;
      } 
    } 
  }
  
  private final void C(float paramFloat) {
    MediaPlayer mediaPlayer = this.j;
    if (mediaPlayer != null) {
      try {
        mediaPlayer.setVolume(paramFloat, paramFloat);
      } catch (IllegalStateException illegalStateException) {}
      return;
    } 
    cm.i("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
  }
  
  private final void D(int paramInt) {
    if (paramInt == 3) {
      this.f.b();
      this.c.d();
    } else if (this.h == 3) {
      this.f.c();
      this.c.e();
    } 
    this.h = paramInt;
  }
  
  private final void w(MediaPlayer paramMediaPlayer) {
    x<Boolean> x = m0.D1;
    if (((Boolean)er2.e().<Boolean>c(x)).booleanValue() && this.e != null && paramMediaPlayer != null && Build.VERSION.SDK_INT >= 19) {
      MediaPlayer.TrackInfo[] arrayOfTrackInfo = paramMediaPlayer.getTrackInfo();
      if (arrayOfTrackInfo == null)
        return; 
      HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
      int i = arrayOfTrackInfo.length;
      for (byte b = 0; b < i; b++) {
        MediaPlayer.TrackInfo trackInfo = arrayOfTrackInfo[b];
        if (trackInfo != null) {
          MediaFormat mediaFormat;
          int j = trackInfo.getTrackType();
          if (j != 1) {
            if (j == 2) {
              mediaFormat = trackInfo.getFormat();
              if (mediaFormat != null) {
                if (mediaFormat.containsKey("mime"))
                  hashMap.put("audioMime", mediaFormat.getString("mime")); 
                if (Build.VERSION.SDK_INT >= 30 && mediaFormat.containsKey("codecs-string"))
                  hashMap.put("audioCodec", mediaFormat.getString("codecs-string")); 
              } 
            } 
          } else {
            mediaFormat = mediaFormat.getFormat();
            if (mediaFormat != null) {
              if (mediaFormat.containsKey("frame-rate"))
                try {
                  hashMap.put("frameRate", String.valueOf(mediaFormat.getFloat("frame-rate")));
                } catch (ClassCastException classCastException) {
                  hashMap.put("frameRate", String.valueOf(mediaFormat.getInteger("frame-rate")));
                }  
              if (mediaFormat.containsKey("bitrate")) {
                Integer integer = Integer.valueOf(mediaFormat.getInteger("bitrate"));
                this.u = integer;
                hashMap.put("bitRate", String.valueOf(integer));
              } 
              if (mediaFormat.containsKey("width") && mediaFormat.containsKey("height")) {
                int k = mediaFormat.getInteger("width");
                j = mediaFormat.getInteger("height");
                StringBuilder stringBuilder = new StringBuilder(23);
                stringBuilder.append(k);
                stringBuilder.append("x");
                stringBuilder.append(j);
                hashMap.put("resolution", stringBuilder.toString());
              } 
              if (mediaFormat.containsKey("mime"))
                hashMap.put("videoMime", mediaFormat.getString("mime")); 
              if (Build.VERSION.SDK_INT >= 30 && mediaFormat.containsKey("codecs-string"))
                hashMap.put("videoCodec", mediaFormat.getString("codecs-string")); 
            } 
          } 
        } 
      } 
      if (!hashMap.isEmpty())
        this.e.B("onMetadataEvent", (Map)hashMap); 
    } 
  }
  
  private final void y() {
    b1.m("AdMediaPlayerView init MediaPlayer");
    SurfaceTexture surfaceTexture = getSurfaceTexture();
    if (this.k != null && surfaceTexture != null) {
      B(false);
      try {
        q.s();
        MediaPlayer mediaPlayer = new MediaPlayer();
        this();
        this.j = mediaPlayer;
        mediaPlayer.setOnBufferingUpdateListener(this);
        this.j.setOnCompletionListener(this);
        this.j.setOnErrorListener(this);
        this.j.setOnInfoListener(this);
        this.j.setOnPreparedListener(this);
        this.j.setOnVideoSizeChangedListener(this);
        this.n = 0;
        SurfaceTexture surfaceTexture1 = surfaceTexture;
        if (this.r) {
          co co1 = new co();
          this(getContext());
          this.q = co1;
          co1.b(surfaceTexture, getWidth(), getHeight());
          this.q.start();
          surfaceTexture1 = this.q.f();
          if (surfaceTexture1 == null) {
            this.q.e();
            this.q = null;
            surfaceTexture1 = surfaceTexture;
          } 
        } 
        this.j.setDataSource(getContext(), this.k);
        q.t();
        Surface surface = new Surface();
        this(surfaceTexture1);
        this.j.setSurface(surface);
        this.j.setAudioStreamType(3);
        this.j.setScreenOnWhilePlaying(true);
        this.j.prepareAsync();
        D(1);
        return;
      } catch (IOException iOException) {
      
      } catch (IllegalArgumentException illegalArgumentException) {
      
      } catch (IllegalStateException illegalStateException) {}
      String str = String.valueOf(this.k);
      StringBuilder stringBuilder = new StringBuilder(str.length() + 36);
      stringBuilder.append("Failed to initialize MediaPlayer at ");
      stringBuilder.append(str);
      cm.d(stringBuilder.toString(), illegalStateException);
      onError(this.j, 1, 0);
    } 
  }
  
  private final void z() {
    if (!this.g)
      return; 
    if (A() && this.j.getCurrentPosition() > 0 && this.i != 3) {
      b1.m("AdMediaPlayerView nudging MediaPlayer");
      C(0.0F);
      this.j.start();
      int i = this.j.getCurrentPosition();
      long l = q.j().a();
      do {
      
      } while (A() && this.j.getCurrentPosition() == i && q.j().a() - l <= 250L);
      this.j.pause();
      super.a();
    } 
  }
  
  public final void a() {
    C(this.c.a());
  }
  
  public final void c() {
    b1.m("AdMediaPlayerView pause");
    if (A() && this.j.isPlaying()) {
      this.j.pause();
      D(4);
      h1.a.post(new kn(this));
    } 
    this.i = 4;
  }
  
  public final void g() {
    b1.m("AdMediaPlayerView play");
    if (A()) {
      this.j.start();
      D(3);
      this.b.b();
      h1.a.post(new ln(this));
    } 
    this.i = 3;
  }
  
  public final int getCurrentPosition() {
    return A() ? this.j.getCurrentPosition() : 0;
  }
  
  public final int getDuration() {
    return A() ? this.j.getDuration() : -1;
  }
  
  public final long getTotalBytes() {
    return (this.u != null) ? (super.getDuration() * this.u.intValue()) : -1L;
  }
  
  public final int getVideoHeight() {
    MediaPlayer mediaPlayer = this.j;
    return (mediaPlayer != null) ? mediaPlayer.getVideoHeight() : 0;
  }
  
  public final int getVideoWidth() {
    MediaPlayer mediaPlayer = this.j;
    return (mediaPlayer != null) ? mediaPlayer.getVideoWidth() : 0;
  }
  
  public final void h(int paramInt) {
    StringBuilder stringBuilder = new StringBuilder(34);
    stringBuilder.append("AdMediaPlayerView seek ");
    stringBuilder.append(paramInt);
    b1.m(stringBuilder.toString());
    if (A()) {
      this.j.seekTo(paramInt);
      this.s = 0;
      return;
    } 
    this.s = paramInt;
  }
  
  public final void i() {
    b1.m("AdMediaPlayerView stop");
    MediaPlayer mediaPlayer = this.j;
    if (mediaPlayer != null) {
      mediaPlayer.stop();
      this.j.release();
      this.j = null;
      D(0);
      this.i = 0;
    } 
    this.f.a();
  }
  
  public final void j(float paramFloat1, float paramFloat2) {
    co co1 = this.q;
    if (co1 != null)
      co1.h(paramFloat1, paramFloat2); 
  }
  
  public final void k(mn parammn) {
    this.t = parammn;
  }
  
  public final String l() {
    String str;
    if (this.r) {
      str = " spherical";
    } else {
      str = "";
    } 
    return (str.length() != 0) ? "MediaPlayer".concat(str) : new String("MediaPlayer");
  }
  
  public final long m() {
    return (this.u != null) ? (super.getTotalBytes() * this.n / 100L) : -1L;
  }
  
  public final int n() {
    return (Build.VERSION.SDK_INT >= 26 && A()) ? this.j.getMetrics().getInt("android.media.mediaplayer.dropped") : -1;
  }
  
  public final void onBufferingUpdate(MediaPlayer paramMediaPlayer, int paramInt) {
    this.n = paramInt;
  }
  
  public final void onCompletion(MediaPlayer paramMediaPlayer) {
    b1.m("AdMediaPlayerView completion");
    D(5);
    this.i = 5;
    h1.a.post(new en(this));
  }
  
  public final boolean onError(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2) {
    Map<Integer, String> map = d;
    String str1 = map.get(Integer.valueOf(paramInt1));
    String str2 = map.get(Integer.valueOf(paramInt2));
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str1).length() + 38 + String.valueOf(str2).length());
    stringBuilder.append("AdMediaPlayerView MediaPlayer error: ");
    stringBuilder.append(str1);
    stringBuilder.append(":");
    stringBuilder.append(str2);
    cm.i(stringBuilder.toString());
    D(-1);
    this.i = -1;
    h1.a.post(new hn(this, str1, str2));
    return true;
  }
  
  public final boolean onInfo(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2) {
    Map<Integer, String> map = d;
    String str1 = map.get(Integer.valueOf(paramInt1));
    String str2 = map.get(Integer.valueOf(paramInt2));
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str1).length() + 37 + String.valueOf(str2).length());
    stringBuilder.append("AdMediaPlayerView MediaPlayer info: ");
    stringBuilder.append(str1);
    stringBuilder.append(":");
    stringBuilder.append(str2);
    b1.m(stringBuilder.toString());
    return true;
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield l : I
    //   4: iload_1
    //   5: invokestatic getDefaultSize : (II)I
    //   8: istore_3
    //   9: aload_0
    //   10: getfield m : I
    //   13: iload_2
    //   14: invokestatic getDefaultSize : (II)I
    //   17: istore #4
    //   19: iload_3
    //   20: istore #5
    //   22: iload #4
    //   24: istore #6
    //   26: aload_0
    //   27: getfield l : I
    //   30: ifle -> 348
    //   33: iload_3
    //   34: istore #5
    //   36: iload #4
    //   38: istore #6
    //   40: aload_0
    //   41: getfield m : I
    //   44: ifle -> 348
    //   47: iload_3
    //   48: istore #5
    //   50: iload #4
    //   52: istore #6
    //   54: aload_0
    //   55: getfield q : Lcom/google/android/gms/internal/ads/co;
    //   58: ifnonnull -> 348
    //   61: iload_1
    //   62: invokestatic getMode : (I)I
    //   65: istore #7
    //   67: iload_1
    //   68: invokestatic getSize : (I)I
    //   71: istore #4
    //   73: iload_2
    //   74: invokestatic getMode : (I)I
    //   77: istore #5
    //   79: iload_2
    //   80: invokestatic getSize : (I)I
    //   83: istore_2
    //   84: iload #7
    //   86: ldc_w 1073741824
    //   89: if_icmpne -> 154
    //   92: iload #5
    //   94: ldc_w 1073741824
    //   97: if_icmpne -> 154
    //   100: aload_0
    //   101: getfield l : I
    //   104: istore_1
    //   105: aload_0
    //   106: getfield m : I
    //   109: istore #5
    //   111: iload_1
    //   112: iload_2
    //   113: imul
    //   114: iload #4
    //   116: iload #5
    //   118: imul
    //   119: if_icmpge -> 132
    //   122: iload_1
    //   123: iload_2
    //   124: imul
    //   125: iload #5
    //   127: idiv
    //   128: istore_1
    //   129: goto -> 260
    //   132: iload_1
    //   133: iload_2
    //   134: imul
    //   135: iload #4
    //   137: iload #5
    //   139: imul
    //   140: if_icmple -> 249
    //   143: iload #5
    //   145: iload #4
    //   147: imul
    //   148: iload_1
    //   149: idiv
    //   150: istore_1
    //   151: goto -> 191
    //   154: iload #7
    //   156: ldc_w 1073741824
    //   159: if_icmpne -> 201
    //   162: aload_0
    //   163: getfield m : I
    //   166: iload #4
    //   168: imul
    //   169: aload_0
    //   170: getfield l : I
    //   173: idiv
    //   174: istore_1
    //   175: iload #5
    //   177: ldc_w -2147483648
    //   180: if_icmpne -> 191
    //   183: iload_1
    //   184: iload_2
    //   185: if_icmple -> 191
    //   188: goto -> 249
    //   191: iload #4
    //   193: istore #5
    //   195: iload_1
    //   196: istore #6
    //   198: goto -> 348
    //   201: iload #5
    //   203: ldc_w 1073741824
    //   206: if_icmpne -> 269
    //   209: aload_0
    //   210: getfield l : I
    //   213: iload_2
    //   214: imul
    //   215: aload_0
    //   216: getfield m : I
    //   219: idiv
    //   220: istore #6
    //   222: iload #6
    //   224: istore #5
    //   226: iload_2
    //   227: istore_1
    //   228: iload #7
    //   230: ldc_w -2147483648
    //   233: if_icmpne -> 255
    //   236: iload #6
    //   238: istore #5
    //   240: iload_2
    //   241: istore_1
    //   242: iload #6
    //   244: iload #4
    //   246: if_icmple -> 255
    //   249: iload #4
    //   251: istore_1
    //   252: goto -> 260
    //   255: iload_1
    //   256: istore_2
    //   257: iload #5
    //   259: istore_1
    //   260: iload_1
    //   261: istore #5
    //   263: iload_2
    //   264: istore #6
    //   266: goto -> 348
    //   269: aload_0
    //   270: getfield l : I
    //   273: istore #8
    //   275: aload_0
    //   276: getfield m : I
    //   279: istore_3
    //   280: iload #5
    //   282: ldc_w -2147483648
    //   285: if_icmpne -> 304
    //   288: iload_3
    //   289: iload_2
    //   290: if_icmple -> 304
    //   293: iload_2
    //   294: iload #8
    //   296: imul
    //   297: iload_3
    //   298: idiv
    //   299: istore #6
    //   301: goto -> 310
    //   304: iload #8
    //   306: istore #6
    //   308: iload_3
    //   309: istore_2
    //   310: iload #6
    //   312: istore #5
    //   314: iload_2
    //   315: istore_1
    //   316: iload #7
    //   318: ldc_w -2147483648
    //   321: if_icmpne -> 255
    //   324: iload #6
    //   326: istore #5
    //   328: iload_2
    //   329: istore_1
    //   330: iload #6
    //   332: iload #4
    //   334: if_icmple -> 255
    //   337: iload_3
    //   338: iload #4
    //   340: imul
    //   341: iload #8
    //   343: idiv
    //   344: istore_1
    //   345: goto -> 191
    //   348: aload_0
    //   349: iload #5
    //   351: iload #6
    //   353: invokevirtual setMeasuredDimension : (II)V
    //   356: aload_0
    //   357: getfield q : Lcom/google/android/gms/internal/ads/co;
    //   360: astore #9
    //   362: aload #9
    //   364: ifnull -> 376
    //   367: aload #9
    //   369: iload #5
    //   371: iload #6
    //   373: invokevirtual l : (II)V
    //   376: getstatic android/os/Build$VERSION.SDK_INT : I
    //   379: bipush #16
    //   381: if_icmpne -> 430
    //   384: aload_0
    //   385: getfield o : I
    //   388: istore_1
    //   389: iload_1
    //   390: ifle -> 399
    //   393: iload_1
    //   394: iload #5
    //   396: if_icmpne -> 414
    //   399: aload_0
    //   400: getfield p : I
    //   403: istore_1
    //   404: iload_1
    //   405: ifle -> 418
    //   408: iload_1
    //   409: iload #6
    //   411: if_icmpeq -> 418
    //   414: aload_0
    //   415: invokespecial z : ()V
    //   418: aload_0
    //   419: iload #5
    //   421: putfield o : I
    //   424: aload_0
    //   425: iload #6
    //   427: putfield p : I
    //   430: return
  }
  
  public final void onPrepared(MediaPlayer paramMediaPlayer) {
    b1.m("AdMediaPlayerView prepared");
    D(2);
    this.f.f();
    h1.a.post(new fn(this, paramMediaPlayer));
    this.l = paramMediaPlayer.getVideoWidth();
    this.m = paramMediaPlayer.getVideoHeight();
    int i = this.s;
    if (i != 0)
      super.h(i); 
    z();
    i = this.l;
    int j = this.m;
    StringBuilder stringBuilder = new StringBuilder(62);
    stringBuilder.append("AdMediaPlayerView stream dimensions: ");
    stringBuilder.append(i);
    stringBuilder.append(" x ");
    stringBuilder.append(j);
    cm.h(stringBuilder.toString());
    if (this.i == 3)
      super.g(); 
    super.a();
  }
  
  public final void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2) {
    b1.m("AdMediaPlayerView surface created");
    y();
    h1.a.post(new gn(this));
  }
  
  public final boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture) {
    b1.m("AdMediaPlayerView surface destroyed");
    MediaPlayer mediaPlayer = this.j;
    if (mediaPlayer != null && this.s == 0)
      this.s = mediaPlayer.getCurrentPosition(); 
    co co1 = this.q;
    if (co1 != null)
      co1.e(); 
    h1.a.post(new in(this));
    B(true);
    return true;
  }
  
  public final void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2) {
    b1.m("AdMediaPlayerView surface changed");
    int i = this.i;
    boolean bool = true;
    if (i == 3) {
      i = 1;
    } else {
      i = 0;
    } 
    if (this.l != paramInt1 || this.m != paramInt2)
      bool = false; 
    if (this.j != null && i != 0 && bool) {
      i = this.s;
      if (i != 0)
        super.h(i); 
      super.g();
    } 
    co co1 = this.q;
    if (co1 != null)
      co1.l(paramInt1, paramInt2); 
    h1.a.post(new jn(this, paramInt1, paramInt2));
  }
  
  public final void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture) {
    this.f.e(this);
    this.b.a(paramSurfaceTexture, this.t);
  }
  
  public final void onVideoSizeChanged(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2) {
    StringBuilder stringBuilder = new StringBuilder(57);
    stringBuilder.append("AdMediaPlayerView size changed: ");
    stringBuilder.append(paramInt1);
    stringBuilder.append(" x ");
    stringBuilder.append(paramInt2);
    b1.m(stringBuilder.toString());
    this.l = paramMediaPlayer.getVideoWidth();
    paramInt1 = paramMediaPlayer.getVideoHeight();
    this.m = paramInt1;
    if (this.l != 0 && paramInt1 != 0)
      requestLayout(); 
  }
  
  protected final void onWindowVisibilityChanged(int paramInt) {
    StringBuilder stringBuilder = new StringBuilder(58);
    stringBuilder.append("AdMediaPlayerView window visibility changed to ");
    stringBuilder.append(paramInt);
    b1.m(stringBuilder.toString());
    h1.a.post(new dn(this, paramInt));
    super.onWindowVisibilityChanged(paramInt);
  }
  
  public final void setVideoPath(String paramString) {
    Uri uri = Uri.parse(paramString);
    zzth zzth = zzth.p0(uri);
    if (zzth == null || zzth.b != null) {
      if (zzth != null)
        uri = Uri.parse(zzth.b); 
      this.k = uri;
      this.s = 0;
      y();
      requestLayout();
      invalidate();
    } 
  }
  
  public final String toString() {
    String str1 = zzbam.class.getName();
    String str2 = Integer.toHexString(hashCode());
    StringBuilder stringBuilder = new StringBuilder(str1.length() + 1 + String.valueOf(str2).length());
    stringBuilder.append(str1);
    stringBuilder.append("@");
    stringBuilder.append(str2);
    return stringBuilder.toString();
  }
  
  public final long u() {
    return 0L;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzbam.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */