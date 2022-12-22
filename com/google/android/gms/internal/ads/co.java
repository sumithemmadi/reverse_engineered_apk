package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

@TargetApi(14)
public final class co extends Thread implements SurfaceTexture.OnFrameAvailableListener, zn {
  private static final float[] b = new float[] { 
      -1.0F, -1.0F, -1.0F, 1.0F, -1.0F, -1.0F, -1.0F, 1.0F, -1.0F, 1.0F, 
      1.0F, -1.0F };
  
  private EGLSurface A;
  
  private volatile boolean B;
  
  private volatile boolean C;
  
  private final xn c;
  
  private final float[] d;
  
  private final float[] e;
  
  private final float[] f;
  
  private final float[] g;
  
  private final float[] h;
  
  private final float[] i;
  
  private final float[] j;
  
  private float k;
  
  private float l;
  
  private float m;
  
  private int n;
  
  private int o;
  
  private SurfaceTexture p;
  
  private SurfaceTexture q;
  
  private int r;
  
  private int s;
  
  private int t;
  
  private FloatBuffer u;
  
  private final CountDownLatch v;
  
  private final Object w;
  
  private EGL10 x;
  
  private EGLDisplay y;
  
  private EGLContext z;
  
  public co(Context paramContext) {
    super("SphericalVideoProcessor");
    float[] arrayOfFloat = b;
    FloatBuffer floatBuffer = ByteBuffer.allocateDirect(arrayOfFloat.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
    this.u = floatBuffer;
    floatBuffer.put(arrayOfFloat).position(0);
    this.d = new float[9];
    this.e = new float[9];
    this.f = new float[9];
    this.g = new float[9];
    this.h = new float[9];
    this.i = new float[9];
    this.j = new float[9];
    this.k = Float.NaN;
    xn xn1 = new xn(paramContext);
    this.c = xn1;
    xn1.c(this);
    this.v = new CountDownLatch(1);
    this.w = new Object();
  }
  
  private static void c(float[] paramArrayOffloat, float paramFloat) {
    paramArrayOffloat[0] = 1.0F;
    paramArrayOffloat[1] = 0.0F;
    paramArrayOffloat[2] = 0.0F;
    paramArrayOffloat[3] = 0.0F;
    double d = paramFloat;
    paramArrayOffloat[4] = (float)Math.cos(d);
    paramArrayOffloat[5] = (float)-Math.sin(d);
    paramArrayOffloat[6] = 0.0F;
    paramArrayOffloat[7] = (float)Math.sin(d);
    paramArrayOffloat[8] = (float)Math.cos(d);
  }
  
  private static void d(float[] paramArrayOffloat1, float[] paramArrayOffloat2, float[] paramArrayOffloat3) {
    paramArrayOffloat1[0] = paramArrayOffloat2[0] * paramArrayOffloat3[0] + paramArrayOffloat2[1] * paramArrayOffloat3[3] + paramArrayOffloat2[2] * paramArrayOffloat3[6];
    paramArrayOffloat1[1] = paramArrayOffloat2[0] * paramArrayOffloat3[1] + paramArrayOffloat2[1] * paramArrayOffloat3[4] + paramArrayOffloat2[2] * paramArrayOffloat3[7];
    paramArrayOffloat1[2] = paramArrayOffloat2[0] * paramArrayOffloat3[2] + paramArrayOffloat2[1] * paramArrayOffloat3[5] + paramArrayOffloat2[2] * paramArrayOffloat3[8];
    paramArrayOffloat1[3] = paramArrayOffloat2[3] * paramArrayOffloat3[0] + paramArrayOffloat2[4] * paramArrayOffloat3[3] + paramArrayOffloat2[5] * paramArrayOffloat3[6];
    paramArrayOffloat1[4] = paramArrayOffloat2[3] * paramArrayOffloat3[1] + paramArrayOffloat2[4] * paramArrayOffloat3[4] + paramArrayOffloat2[5] * paramArrayOffloat3[7];
    paramArrayOffloat1[5] = paramArrayOffloat2[3] * paramArrayOffloat3[2] + paramArrayOffloat2[4] * paramArrayOffloat3[5] + paramArrayOffloat2[5] * paramArrayOffloat3[8];
    paramArrayOffloat1[6] = paramArrayOffloat2[6] * paramArrayOffloat3[0] + paramArrayOffloat2[7] * paramArrayOffloat3[3] + paramArrayOffloat2[8] * paramArrayOffloat3[6];
    paramArrayOffloat1[7] = paramArrayOffloat2[6] * paramArrayOffloat3[1] + paramArrayOffloat2[7] * paramArrayOffloat3[4] + paramArrayOffloat2[8] * paramArrayOffloat3[7];
    paramArrayOffloat1[8] = paramArrayOffloat2[6] * paramArrayOffloat3[2] + paramArrayOffloat2[7] * paramArrayOffloat3[5] + paramArrayOffloat2[8] * paramArrayOffloat3[8];
  }
  
  private final boolean g() {
    boolean bool1;
    int j;
    EGLSurface eGLSurface = this.A;
    boolean bool2 = false;
    boolean bool4 = bool2;
    if (eGLSurface != null) {
      EGLSurface eGLSurface1 = EGL10.EGL_NO_SURFACE;
      bool4 = bool2;
      if (eGLSurface != eGLSurface1) {
        bool2 = this.x.eglMakeCurrent(this.y, eGLSurface1, eGLSurface1, EGL10.EGL_NO_CONTEXT);
        j = this.x.eglDestroySurface(this.y, this.A) | bool2 | false;
        this.A = null;
      } 
    } 
    EGLContext eGLContext = this.z;
    int i = j;
    if (eGLContext != null) {
      bool1 = j | this.x.eglDestroyContext(this.y, eGLContext);
      this.z = null;
    } 
    EGLDisplay eGLDisplay = this.y;
    boolean bool3 = bool1;
    if (eGLDisplay != null) {
      bool3 = bool1 | this.x.eglTerminate(eGLDisplay);
      this.y = null;
    } 
    return bool3;
  }
  
  private static void i(float[] paramArrayOffloat, float paramFloat) {
    double d = paramFloat;
    paramArrayOffloat[0] = (float)Math.cos(d);
    paramArrayOffloat[1] = (float)-Math.sin(d);
    paramArrayOffloat[2] = 0.0F;
    paramArrayOffloat[3] = (float)Math.sin(d);
    paramArrayOffloat[4] = (float)Math.cos(d);
    paramArrayOffloat[5] = 0.0F;
    paramArrayOffloat[6] = 0.0F;
    paramArrayOffloat[7] = 0.0F;
    paramArrayOffloat[8] = 1.0F;
  }
  
  private static int j(int paramInt, String paramString) {
    int i = GLES20.glCreateShader(paramInt);
    k("createShader");
    int j = i;
    if (i != 0) {
      GLES20.glShaderSource(i, paramString);
      k("shaderSource");
      GLES20.glCompileShader(i);
      k("compileShader");
      int[] arrayOfInt = new int[1];
      GLES20.glGetShaderiv(i, 35713, arrayOfInt, 0);
      k("getShaderiv");
      j = i;
      if (arrayOfInt[0] == 0) {
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Could not compile shader ");
        stringBuilder.append(paramInt);
        stringBuilder.append(":");
        Log.e("SphericalVideoRenderer", stringBuilder.toString());
        Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(i));
        GLES20.glDeleteShader(i);
        k("deleteShader");
        j = 0;
      } 
    } 
    return j;
  }
  
  private static void k(String paramString) {
    int i = GLES20.glGetError();
    if (i != 0) {
      StringBuilder stringBuilder = new StringBuilder(String.valueOf(paramString).length() + 21);
      stringBuilder.append(paramString);
      stringBuilder.append(": glError ");
      stringBuilder.append(i);
      Log.e("SphericalVideoRenderer", stringBuilder.toString());
    } 
  }
  
  public final void a() {
    synchronized (this.w) {
      this.w.notifyAll();
      return;
    } 
  }
  
  public final void b(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2) {
    this.o = paramInt1;
    this.n = paramInt2;
    this.q = paramSurfaceTexture;
  }
  
  public final void e() {
    synchronized (this.w) {
      this.C = true;
      this.q = null;
      this.w.notifyAll();
      return;
    } 
  }
  
  public final SurfaceTexture f() {
    if (this.q == null)
      return null; 
    try {
      this.v.await();
    } catch (InterruptedException interruptedException) {}
    return this.p;
  }
  
  public final void h(float paramFloat1, float paramFloat2) {
    float f;
    int i = this.o;
    int j = this.n;
    if (i > j) {
      paramFloat1 = paramFloat1 * 1.7453293F / i;
      paramFloat2 *= 1.7453293F;
      f = i;
    } else {
      paramFloat1 = paramFloat1 * 1.7453293F / j;
      paramFloat2 *= 1.7453293F;
      f = j;
    } 
    paramFloat2 /= f;
    this.l -= paramFloat1;
    paramFloat1 = this.m - paramFloat2;
    this.m = paramFloat1;
    if (paramFloat1 < -1.5707964F)
      this.m = -1.5707964F; 
    if (this.m > 1.5707964F)
      this.m = 1.5707964F; 
  }
  
  public final void l(int paramInt1, int paramInt2) {
    synchronized (this.w) {
      this.o = paramInt1;
      this.n = paramInt2;
      this.B = true;
      this.w.notifyAll();
      return;
    } 
  }
  
  public final void onFrameAvailable(SurfaceTexture paramSurfaceTexture) {
    this.t++;
    synchronized (this.w) {
      this.w.notifyAll();
      return;
    } 
  }
  
  public final void run() {
    // Byte code:
    //   0: aload_0
    //   1: getfield q : Landroid/graphics/SurfaceTexture;
    //   4: ifnonnull -> 21
    //   7: ldc_w 'SphericalVideoProcessor started with no output texture.'
    //   10: invokestatic g : (Ljava/lang/String;)V
    //   13: aload_0
    //   14: getfield v : Ljava/util/concurrent/CountDownLatch;
    //   17: invokevirtual countDown : ()V
    //   20: return
    //   21: invokestatic getEGL : ()Ljavax/microedition/khronos/egl/EGL;
    //   24: checkcast javax/microedition/khronos/egl/EGL10
    //   27: astore_1
    //   28: aload_0
    //   29: aload_1
    //   30: putfield x : Ljavax/microedition/khronos/egl/EGL10;
    //   33: aload_1
    //   34: getstatic javax/microedition/khronos/egl/EGL10.EGL_DEFAULT_DISPLAY : Ljava/lang/Object;
    //   37: invokeinterface eglGetDisplay : (Ljava/lang/Object;)Ljavax/microedition/khronos/egl/EGLDisplay;
    //   42: astore_2
    //   43: aload_0
    //   44: aload_2
    //   45: putfield y : Ljavax/microedition/khronos/egl/EGLDisplay;
    //   48: aload_2
    //   49: getstatic javax/microedition/khronos/egl/EGL10.EGL_NO_DISPLAY : Ljavax/microedition/khronos/egl/EGLDisplay;
    //   52: if_acmpne -> 60
    //   55: iconst_0
    //   56: istore_3
    //   57: goto -> 322
    //   60: iconst_2
    //   61: newarray int
    //   63: astore_1
    //   64: aload_0
    //   65: getfield x : Ljavax/microedition/khronos/egl/EGL10;
    //   68: aload_2
    //   69: aload_1
    //   70: invokeinterface eglInitialize : (Ljavax/microedition/khronos/egl/EGLDisplay;[I)Z
    //   75: ifne -> 81
    //   78: goto -> 55
    //   81: iconst_1
    //   82: newarray int
    //   84: astore_1
    //   85: iconst_1
    //   86: anewarray javax/microedition/khronos/egl/EGLConfig
    //   89: astore_2
    //   90: aload_0
    //   91: getfield x : Ljavax/microedition/khronos/egl/EGL10;
    //   94: aload_0
    //   95: getfield y : Ljavax/microedition/khronos/egl/EGLDisplay;
    //   98: bipush #11
    //   100: newarray int
    //   102: dup
    //   103: iconst_0
    //   104: sipush #12352
    //   107: iastore
    //   108: dup
    //   109: iconst_1
    //   110: iconst_4
    //   111: iastore
    //   112: dup
    //   113: iconst_2
    //   114: sipush #12324
    //   117: iastore
    //   118: dup
    //   119: iconst_3
    //   120: bipush #8
    //   122: iastore
    //   123: dup
    //   124: iconst_4
    //   125: sipush #12323
    //   128: iastore
    //   129: dup
    //   130: iconst_5
    //   131: bipush #8
    //   133: iastore
    //   134: dup
    //   135: bipush #6
    //   137: sipush #12322
    //   140: iastore
    //   141: dup
    //   142: bipush #7
    //   144: bipush #8
    //   146: iastore
    //   147: dup
    //   148: bipush #8
    //   150: sipush #12325
    //   153: iastore
    //   154: dup
    //   155: bipush #9
    //   157: bipush #16
    //   159: iastore
    //   160: dup
    //   161: bipush #10
    //   163: sipush #12344
    //   166: iastore
    //   167: aload_2
    //   168: iconst_1
    //   169: aload_1
    //   170: invokeinterface eglChooseConfig : (Ljavax/microedition/khronos/egl/EGLDisplay;[I[Ljavax/microedition/khronos/egl/EGLConfig;I[I)Z
    //   175: ifeq -> 191
    //   178: aload_1
    //   179: iconst_0
    //   180: iaload
    //   181: ifle -> 191
    //   184: aload_2
    //   185: iconst_0
    //   186: aaload
    //   187: astore_1
    //   188: goto -> 193
    //   191: aconst_null
    //   192: astore_1
    //   193: aload_1
    //   194: ifnonnull -> 200
    //   197: goto -> 55
    //   200: aload_0
    //   201: getfield x : Ljavax/microedition/khronos/egl/EGL10;
    //   204: aload_0
    //   205: getfield y : Ljavax/microedition/khronos/egl/EGLDisplay;
    //   208: aload_1
    //   209: getstatic javax/microedition/khronos/egl/EGL10.EGL_NO_CONTEXT : Ljavax/microedition/khronos/egl/EGLContext;
    //   212: iconst_3
    //   213: newarray int
    //   215: dup
    //   216: iconst_0
    //   217: sipush #12440
    //   220: iastore
    //   221: dup
    //   222: iconst_1
    //   223: iconst_2
    //   224: iastore
    //   225: dup
    //   226: iconst_2
    //   227: sipush #12344
    //   230: iastore
    //   231: invokeinterface eglCreateContext : (Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;Ljavax/microedition/khronos/egl/EGLContext;[I)Ljavax/microedition/khronos/egl/EGLContext;
    //   236: astore_2
    //   237: aload_0
    //   238: aload_2
    //   239: putfield z : Ljavax/microedition/khronos/egl/EGLContext;
    //   242: aload_2
    //   243: ifnull -> 55
    //   246: aload_2
    //   247: getstatic javax/microedition/khronos/egl/EGL10.EGL_NO_CONTEXT : Ljavax/microedition/khronos/egl/EGLContext;
    //   250: if_acmpne -> 256
    //   253: goto -> 55
    //   256: aload_0
    //   257: getfield x : Ljavax/microedition/khronos/egl/EGL10;
    //   260: aload_0
    //   261: getfield y : Ljavax/microedition/khronos/egl/EGLDisplay;
    //   264: aload_1
    //   265: aload_0
    //   266: getfield q : Landroid/graphics/SurfaceTexture;
    //   269: aconst_null
    //   270: invokeinterface eglCreateWindowSurface : (Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;Ljava/lang/Object;[I)Ljavax/microedition/khronos/egl/EGLSurface;
    //   275: astore_1
    //   276: aload_0
    //   277: aload_1
    //   278: putfield A : Ljavax/microedition/khronos/egl/EGLSurface;
    //   281: aload_1
    //   282: ifnull -> 55
    //   285: aload_1
    //   286: getstatic javax/microedition/khronos/egl/EGL10.EGL_NO_SURFACE : Ljavax/microedition/khronos/egl/EGLSurface;
    //   289: if_acmpne -> 295
    //   292: goto -> 55
    //   295: aload_0
    //   296: getfield x : Ljavax/microedition/khronos/egl/EGL10;
    //   299: aload_0
    //   300: getfield y : Ljavax/microedition/khronos/egl/EGLDisplay;
    //   303: aload_1
    //   304: aload_1
    //   305: aload_0
    //   306: getfield z : Ljavax/microedition/khronos/egl/EGLContext;
    //   309: invokeinterface eglMakeCurrent : (Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLSurface;Ljavax/microedition/khronos/egl/EGLSurface;Ljavax/microedition/khronos/egl/EGLContext;)Z
    //   314: ifne -> 320
    //   317: goto -> 55
    //   320: iconst_1
    //   321: istore_3
    //   322: getstatic com/google/android/gms/internal/ads/m0.f1 : Lcom/google/android/gms/internal/ads/x;
    //   325: astore_1
    //   326: invokestatic e : ()Lcom/google/android/gms/internal/ads/i0;
    //   329: aload_1
    //   330: invokevirtual c : (Lcom/google/android/gms/internal/ads/x;)Ljava/lang/Object;
    //   333: checkcast java/lang/String
    //   336: aload_1
    //   337: invokevirtual m : ()Ljava/lang/Object;
    //   340: invokevirtual equals : (Ljava/lang/Object;)Z
    //   343: ifne -> 360
    //   346: invokestatic e : ()Lcom/google/android/gms/internal/ads/i0;
    //   349: aload_1
    //   350: invokevirtual c : (Lcom/google/android/gms/internal/ads/x;)Ljava/lang/Object;
    //   353: checkcast java/lang/String
    //   356: astore_1
    //   357: goto -> 364
    //   360: ldc_w 'attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}'
    //   363: astore_1
    //   364: ldc_w 35633
    //   367: aload_1
    //   368: invokestatic j : (ILjava/lang/String;)I
    //   371: istore #4
    //   373: iload #4
    //   375: ifne -> 384
    //   378: iconst_0
    //   379: istore #5
    //   381: goto -> 576
    //   384: getstatic com/google/android/gms/internal/ads/m0.g1 : Lcom/google/android/gms/internal/ads/x;
    //   387: astore_1
    //   388: invokestatic e : ()Lcom/google/android/gms/internal/ads/i0;
    //   391: aload_1
    //   392: invokevirtual c : (Lcom/google/android/gms/internal/ads/x;)Ljava/lang/Object;
    //   395: checkcast java/lang/String
    //   398: aload_1
    //   399: invokevirtual m : ()Ljava/lang/Object;
    //   402: invokevirtual equals : (Ljava/lang/Object;)Z
    //   405: ifne -> 422
    //   408: invokestatic e : ()Lcom/google/android/gms/internal/ads/i0;
    //   411: aload_1
    //   412: invokevirtual c : (Lcom/google/android/gms/internal/ads/x;)Ljava/lang/Object;
    //   415: checkcast java/lang/String
    //   418: astore_1
    //   419: goto -> 426
    //   422: ldc_w '#extension GL_OES_EGL_image_external : require\\n#define INV_PI 0.3183\\nprecision highp float;varying vec3 pos;uniform samplerExternalOES uSplr;uniform mat3 uVMat;uniform float uFOVx;uniform float uFOVy;void main() {  vec3 ray = vec3(pos.x * tan(uFOVx), pos.y * tan(uFOVy), -1);  ray = (uVMat * ray).xyz;  ray = normalize(ray);  vec2 texCrd = vec2(    0.5 + atan(ray.x, - ray.z) * INV_PI * 0.5, acos(ray.y) * INV_PI);  gl_FragColor = vec4(texture2D(uSplr, texCrd).xyz, 1.0);}'
    //   425: astore_1
    //   426: ldc_w 35632
    //   429: aload_1
    //   430: invokestatic j : (ILjava/lang/String;)I
    //   433: istore #6
    //   435: iload #6
    //   437: ifne -> 443
    //   440: goto -> 378
    //   443: invokestatic glCreateProgram : ()I
    //   446: istore #7
    //   448: ldc_w 'createProgram'
    //   451: invokestatic k : (Ljava/lang/String;)V
    //   454: iload #7
    //   456: istore #5
    //   458: iload #7
    //   460: ifeq -> 576
    //   463: iload #7
    //   465: iload #4
    //   467: invokestatic glAttachShader : (II)V
    //   470: ldc_w 'attachShader'
    //   473: invokestatic k : (Ljava/lang/String;)V
    //   476: iload #7
    //   478: iload #6
    //   480: invokestatic glAttachShader : (II)V
    //   483: ldc_w 'attachShader'
    //   486: invokestatic k : (Ljava/lang/String;)V
    //   489: iload #7
    //   491: invokestatic glLinkProgram : (I)V
    //   494: ldc_w 'linkProgram'
    //   497: invokestatic k : (Ljava/lang/String;)V
    //   500: iconst_1
    //   501: newarray int
    //   503: astore_1
    //   504: iload #7
    //   506: ldc_w 35714
    //   509: aload_1
    //   510: iconst_0
    //   511: invokestatic glGetProgramiv : (II[II)V
    //   514: ldc_w 'getProgramiv'
    //   517: invokestatic k : (Ljava/lang/String;)V
    //   520: aload_1
    //   521: iconst_0
    //   522: iaload
    //   523: iconst_1
    //   524: if_icmpeq -> 561
    //   527: ldc 'SphericalVideoRenderer'
    //   529: ldc_w 'Could not link program: '
    //   532: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)I
    //   535: pop
    //   536: ldc 'SphericalVideoRenderer'
    //   538: iload #7
    //   540: invokestatic glGetProgramInfoLog : (I)Ljava/lang/String;
    //   543: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)I
    //   546: pop
    //   547: iload #7
    //   549: invokestatic glDeleteProgram : (I)V
    //   552: ldc_w 'deleteProgram'
    //   555: invokestatic k : (Ljava/lang/String;)V
    //   558: goto -> 378
    //   561: iload #7
    //   563: invokestatic glValidateProgram : (I)V
    //   566: ldc_w 'validateProgram'
    //   569: invokestatic k : (Ljava/lang/String;)V
    //   572: iload #7
    //   574: istore #5
    //   576: aload_0
    //   577: iload #5
    //   579: putfield r : I
    //   582: iload #5
    //   584: invokestatic glUseProgram : (I)V
    //   587: ldc_w 'useProgram'
    //   590: invokestatic k : (Ljava/lang/String;)V
    //   593: aload_0
    //   594: getfield r : I
    //   597: ldc_w 'aPosition'
    //   600: invokestatic glGetAttribLocation : (ILjava/lang/String;)I
    //   603: istore #5
    //   605: iload #5
    //   607: iconst_3
    //   608: sipush #5126
    //   611: iconst_0
    //   612: bipush #12
    //   614: aload_0
    //   615: getfield u : Ljava/nio/FloatBuffer;
    //   618: invokestatic glVertexAttribPointer : (IIIZILjava/nio/Buffer;)V
    //   621: ldc_w 'vertexAttribPointer'
    //   624: invokestatic k : (Ljava/lang/String;)V
    //   627: iload #5
    //   629: invokestatic glEnableVertexAttribArray : (I)V
    //   632: ldc_w 'enableVertexAttribArray'
    //   635: invokestatic k : (Ljava/lang/String;)V
    //   638: iconst_1
    //   639: newarray int
    //   641: astore_1
    //   642: iconst_1
    //   643: aload_1
    //   644: iconst_0
    //   645: invokestatic glGenTextures : (I[II)V
    //   648: ldc_w 'genTextures'
    //   651: invokestatic k : (Ljava/lang/String;)V
    //   654: aload_1
    //   655: iconst_0
    //   656: iaload
    //   657: istore #7
    //   659: ldc_w 36197
    //   662: iload #7
    //   664: invokestatic glBindTexture : (II)V
    //   667: ldc_w 'bindTextures'
    //   670: invokestatic k : (Ljava/lang/String;)V
    //   673: ldc_w 36197
    //   676: sipush #10240
    //   679: sipush #9729
    //   682: invokestatic glTexParameteri : (III)V
    //   685: ldc_w 'texParameteri'
    //   688: invokestatic k : (Ljava/lang/String;)V
    //   691: ldc_w 36197
    //   694: sipush #10241
    //   697: sipush #9729
    //   700: invokestatic glTexParameteri : (III)V
    //   703: ldc_w 'texParameteri'
    //   706: invokestatic k : (Ljava/lang/String;)V
    //   709: ldc_w 36197
    //   712: sipush #10242
    //   715: ldc_w 33071
    //   718: invokestatic glTexParameteri : (III)V
    //   721: ldc_w 'texParameteri'
    //   724: invokestatic k : (Ljava/lang/String;)V
    //   727: ldc_w 36197
    //   730: sipush #10243
    //   733: ldc_w 33071
    //   736: invokestatic glTexParameteri : (III)V
    //   739: ldc_w 'texParameteri'
    //   742: invokestatic k : (Ljava/lang/String;)V
    //   745: aload_0
    //   746: getfield r : I
    //   749: ldc_w 'uVMat'
    //   752: invokestatic glGetUniformLocation : (ILjava/lang/String;)I
    //   755: istore #5
    //   757: aload_0
    //   758: iload #5
    //   760: putfield s : I
    //   763: iload #5
    //   765: iconst_1
    //   766: iconst_0
    //   767: bipush #9
    //   769: newarray float
    //   771: dup
    //   772: iconst_0
    //   773: fconst_1
    //   774: fastore
    //   775: dup
    //   776: iconst_1
    //   777: fconst_0
    //   778: fastore
    //   779: dup
    //   780: iconst_2
    //   781: fconst_0
    //   782: fastore
    //   783: dup
    //   784: iconst_3
    //   785: fconst_0
    //   786: fastore
    //   787: dup
    //   788: iconst_4
    //   789: fconst_1
    //   790: fastore
    //   791: dup
    //   792: iconst_5
    //   793: fconst_0
    //   794: fastore
    //   795: dup
    //   796: bipush #6
    //   798: fconst_0
    //   799: fastore
    //   800: dup
    //   801: bipush #7
    //   803: fconst_0
    //   804: fastore
    //   805: dup
    //   806: bipush #8
    //   808: fconst_1
    //   809: fastore
    //   810: iconst_0
    //   811: invokestatic glUniformMatrix3fv : (IIZ[FI)V
    //   814: aload_0
    //   815: getfield r : I
    //   818: ifeq -> 827
    //   821: iconst_1
    //   822: istore #5
    //   824: goto -> 830
    //   827: iconst_0
    //   828: istore #5
    //   830: iload_3
    //   831: ifeq -> 1527
    //   834: iload #5
    //   836: ifne -> 842
    //   839: goto -> 1527
    //   842: new android/graphics/SurfaceTexture
    //   845: dup
    //   846: iload #7
    //   848: invokespecial <init> : (I)V
    //   851: astore_1
    //   852: aload_0
    //   853: aload_1
    //   854: putfield p : Landroid/graphics/SurfaceTexture;
    //   857: aload_1
    //   858: aload_0
    //   859: invokevirtual setOnFrameAvailableListener : (Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;)V
    //   862: aload_0
    //   863: getfield v : Ljava/util/concurrent/CountDownLatch;
    //   866: invokevirtual countDown : ()V
    //   869: aload_0
    //   870: getfield c : Lcom/google/android/gms/internal/ads/xn;
    //   873: invokevirtual a : ()V
    //   876: aload_0
    //   877: iconst_1
    //   878: putfield B : Z
    //   881: aload_0
    //   882: getfield C : Z
    //   885: ifne -> 1396
    //   888: aload_0
    //   889: getfield t : I
    //   892: ifle -> 915
    //   895: aload_0
    //   896: getfield p : Landroid/graphics/SurfaceTexture;
    //   899: invokevirtual updateTexImage : ()V
    //   902: aload_0
    //   903: aload_0
    //   904: getfield t : I
    //   907: iconst_1
    //   908: isub
    //   909: putfield t : I
    //   912: goto -> 888
    //   915: aload_0
    //   916: getfield c : Lcom/google/android/gms/internal/ads/xn;
    //   919: aload_0
    //   920: getfield d : [F
    //   923: invokevirtual d : ([F)Z
    //   926: ifeq -> 1091
    //   929: aload_0
    //   930: getfield k : F
    //   933: invokestatic isNaN : (F)Z
    //   936: ifeq -> 1072
    //   939: aload_0
    //   940: getfield d : [F
    //   943: astore_1
    //   944: iconst_3
    //   945: newarray float
    //   947: astore_2
    //   948: aload_2
    //   949: iconst_0
    //   950: fconst_0
    //   951: fastore
    //   952: aload_2
    //   953: iconst_1
    //   954: fconst_1
    //   955: fastore
    //   956: aload_2
    //   957: iconst_2
    //   958: fconst_0
    //   959: fastore
    //   960: iconst_3
    //   961: newarray float
    //   963: astore #8
    //   965: aload #8
    //   967: iconst_0
    //   968: aload_1
    //   969: iconst_0
    //   970: faload
    //   971: aload_2
    //   972: iconst_0
    //   973: faload
    //   974: fmul
    //   975: aload_1
    //   976: iconst_1
    //   977: faload
    //   978: aload_2
    //   979: iconst_1
    //   980: faload
    //   981: fmul
    //   982: fadd
    //   983: aload_1
    //   984: iconst_2
    //   985: faload
    //   986: aload_2
    //   987: iconst_2
    //   988: faload
    //   989: fmul
    //   990: fadd
    //   991: fastore
    //   992: aload #8
    //   994: iconst_1
    //   995: aload_1
    //   996: iconst_3
    //   997: faload
    //   998: aload_2
    //   999: iconst_0
    //   1000: faload
    //   1001: fmul
    //   1002: aload_1
    //   1003: iconst_4
    //   1004: faload
    //   1005: aload_2
    //   1006: iconst_1
    //   1007: faload
    //   1008: fmul
    //   1009: fadd
    //   1010: aload_1
    //   1011: iconst_5
    //   1012: faload
    //   1013: aload_2
    //   1014: iconst_2
    //   1015: faload
    //   1016: fmul
    //   1017: fadd
    //   1018: fastore
    //   1019: aload #8
    //   1021: iconst_2
    //   1022: aload_1
    //   1023: bipush #6
    //   1025: faload
    //   1026: aload_2
    //   1027: iconst_0
    //   1028: faload
    //   1029: fmul
    //   1030: aload_1
    //   1031: bipush #7
    //   1033: faload
    //   1034: aload_2
    //   1035: iconst_1
    //   1036: faload
    //   1037: fmul
    //   1038: fadd
    //   1039: aload_1
    //   1040: bipush #8
    //   1042: faload
    //   1043: aload_2
    //   1044: iconst_2
    //   1045: faload
    //   1046: fmul
    //   1047: fadd
    //   1048: fastore
    //   1049: aload_0
    //   1050: aload #8
    //   1052: iconst_1
    //   1053: faload
    //   1054: f2d
    //   1055: aload #8
    //   1057: iconst_0
    //   1058: faload
    //   1059: f2d
    //   1060: invokestatic atan2 : (DD)D
    //   1063: d2f
    //   1064: ldc_w 1.5707964
    //   1067: fsub
    //   1068: fneg
    //   1069: putfield k : F
    //   1072: aload_0
    //   1073: getfield i : [F
    //   1076: aload_0
    //   1077: getfield k : F
    //   1080: aload_0
    //   1081: getfield l : F
    //   1084: fadd
    //   1085: invokestatic i : ([FF)V
    //   1088: goto -> 1112
    //   1091: aload_0
    //   1092: getfield d : [F
    //   1095: ldc_w -1.5707964
    //   1098: invokestatic c : ([FF)V
    //   1101: aload_0
    //   1102: getfield i : [F
    //   1105: aload_0
    //   1106: getfield l : F
    //   1109: invokestatic i : ([FF)V
    //   1112: aload_0
    //   1113: getfield e : [F
    //   1116: ldc_w 1.5707964
    //   1119: invokestatic c : ([FF)V
    //   1122: aload_0
    //   1123: getfield f : [F
    //   1126: aload_0
    //   1127: getfield i : [F
    //   1130: aload_0
    //   1131: getfield e : [F
    //   1134: invokestatic d : ([F[F[F)V
    //   1137: aload_0
    //   1138: getfield g : [F
    //   1141: aload_0
    //   1142: getfield d : [F
    //   1145: aload_0
    //   1146: getfield f : [F
    //   1149: invokestatic d : ([F[F[F)V
    //   1152: aload_0
    //   1153: getfield h : [F
    //   1156: aload_0
    //   1157: getfield m : F
    //   1160: invokestatic c : ([FF)V
    //   1163: aload_0
    //   1164: getfield j : [F
    //   1167: aload_0
    //   1168: getfield h : [F
    //   1171: aload_0
    //   1172: getfield g : [F
    //   1175: invokestatic d : ([F[F[F)V
    //   1178: aload_0
    //   1179: getfield s : I
    //   1182: iconst_1
    //   1183: iconst_0
    //   1184: aload_0
    //   1185: getfield j : [F
    //   1188: iconst_0
    //   1189: invokestatic glUniformMatrix3fv : (IIZ[FI)V
    //   1192: iconst_5
    //   1193: iconst_0
    //   1194: iconst_4
    //   1195: invokestatic glDrawArrays : (III)V
    //   1198: ldc_w 'drawArrays'
    //   1201: invokestatic k : (Ljava/lang/String;)V
    //   1204: invokestatic glFinish : ()V
    //   1207: aload_0
    //   1208: getfield x : Ljavax/microedition/khronos/egl/EGL10;
    //   1211: aload_0
    //   1212: getfield y : Ljavax/microedition/khronos/egl/EGLDisplay;
    //   1215: aload_0
    //   1216: getfield A : Ljavax/microedition/khronos/egl/EGLSurface;
    //   1219: invokeinterface eglSwapBuffers : (Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLSurface;)Z
    //   1224: pop
    //   1225: aload_0
    //   1226: getfield B : Z
    //   1229: ifeq -> 1351
    //   1232: iconst_0
    //   1233: iconst_0
    //   1234: aload_0
    //   1235: getfield o : I
    //   1238: aload_0
    //   1239: getfield n : I
    //   1242: invokestatic glViewport : (IIII)V
    //   1245: ldc_w 'viewport'
    //   1248: invokestatic k : (Ljava/lang/String;)V
    //   1251: aload_0
    //   1252: getfield r : I
    //   1255: ldc_w 'uFOVx'
    //   1258: invokestatic glGetUniformLocation : (ILjava/lang/String;)I
    //   1261: istore_3
    //   1262: aload_0
    //   1263: getfield r : I
    //   1266: ldc_w 'uFOVy'
    //   1269: invokestatic glGetUniformLocation : (ILjava/lang/String;)I
    //   1272: istore #4
    //   1274: aload_0
    //   1275: getfield o : I
    //   1278: istore #7
    //   1280: aload_0
    //   1281: getfield n : I
    //   1284: istore #5
    //   1286: iload #7
    //   1288: iload #5
    //   1290: if_icmple -> 1323
    //   1293: iload_3
    //   1294: ldc_w 0.87266463
    //   1297: invokestatic glUniform1f : (IF)V
    //   1300: iload #4
    //   1302: aload_0
    //   1303: getfield n : I
    //   1306: i2f
    //   1307: ldc_w 0.87266463
    //   1310: fmul
    //   1311: aload_0
    //   1312: getfield o : I
    //   1315: i2f
    //   1316: fdiv
    //   1317: invokestatic glUniform1f : (IF)V
    //   1320: goto -> 1346
    //   1323: iload_3
    //   1324: iload #7
    //   1326: i2f
    //   1327: ldc_w 0.87266463
    //   1330: fmul
    //   1331: iload #5
    //   1333: i2f
    //   1334: fdiv
    //   1335: invokestatic glUniform1f : (IF)V
    //   1338: iload #4
    //   1340: ldc_w 0.87266463
    //   1343: invokestatic glUniform1f : (IF)V
    //   1346: aload_0
    //   1347: iconst_0
    //   1348: putfield B : Z
    //   1351: aload_0
    //   1352: getfield w : Ljava/lang/Object;
    //   1355: astore_2
    //   1356: aload_2
    //   1357: monitorenter
    //   1358: aload_0
    //   1359: getfield C : Z
    //   1362: ifne -> 1386
    //   1365: aload_0
    //   1366: getfield B : Z
    //   1369: ifne -> 1386
    //   1372: aload_0
    //   1373: getfield t : I
    //   1376: ifne -> 1386
    //   1379: aload_0
    //   1380: getfield w : Ljava/lang/Object;
    //   1383: invokevirtual wait : ()V
    //   1386: aload_2
    //   1387: monitorexit
    //   1388: goto -> 881
    //   1391: astore_1
    //   1392: aload_2
    //   1393: monitorexit
    //   1394: aload_1
    //   1395: athrow
    //   1396: aload_0
    //   1397: getfield c : Lcom/google/android/gms/internal/ads/xn;
    //   1400: invokevirtual b : ()V
    //   1403: aload_0
    //   1404: getfield p : Landroid/graphics/SurfaceTexture;
    //   1407: aconst_null
    //   1408: invokevirtual setOnFrameAvailableListener : (Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;)V
    //   1411: aload_0
    //   1412: aconst_null
    //   1413: putfield p : Landroid/graphics/SurfaceTexture;
    //   1416: aload_0
    //   1417: invokespecial g : ()Z
    //   1420: pop
    //   1421: return
    //   1422: astore_1
    //   1423: ldc_w 'SphericalVideoProcessor died.'
    //   1426: aload_1
    //   1427: invokestatic c : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1430: invokestatic g : ()Lcom/google/android/gms/internal/ads/fl;
    //   1433: aload_1
    //   1434: ldc_w 'SphericalVideoProcessor.run.2'
    //   1437: invokevirtual e : (Ljava/lang/Throwable;Ljava/lang/String;)V
    //   1440: aload_0
    //   1441: getfield c : Lcom/google/android/gms/internal/ads/xn;
    //   1444: invokevirtual b : ()V
    //   1447: aload_0
    //   1448: getfield p : Landroid/graphics/SurfaceTexture;
    //   1451: aconst_null
    //   1452: invokevirtual setOnFrameAvailableListener : (Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;)V
    //   1455: aload_0
    //   1456: aconst_null
    //   1457: putfield p : Landroid/graphics/SurfaceTexture;
    //   1460: aload_0
    //   1461: invokespecial g : ()Z
    //   1464: pop
    //   1465: return
    //   1466: astore_1
    //   1467: ldc_w 'SphericalVideoProcessor halted unexpectedly.'
    //   1470: invokestatic i : (Ljava/lang/String;)V
    //   1473: aload_0
    //   1474: getfield c : Lcom/google/android/gms/internal/ads/xn;
    //   1477: invokevirtual b : ()V
    //   1480: aload_0
    //   1481: getfield p : Landroid/graphics/SurfaceTexture;
    //   1484: aconst_null
    //   1485: invokevirtual setOnFrameAvailableListener : (Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;)V
    //   1488: aload_0
    //   1489: aconst_null
    //   1490: putfield p : Landroid/graphics/SurfaceTexture;
    //   1493: aload_0
    //   1494: invokespecial g : ()Z
    //   1497: pop
    //   1498: return
    //   1499: astore_1
    //   1500: aload_0
    //   1501: getfield c : Lcom/google/android/gms/internal/ads/xn;
    //   1504: invokevirtual b : ()V
    //   1507: aload_0
    //   1508: getfield p : Landroid/graphics/SurfaceTexture;
    //   1511: aconst_null
    //   1512: invokevirtual setOnFrameAvailableListener : (Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;)V
    //   1515: aload_0
    //   1516: aconst_null
    //   1517: putfield p : Landroid/graphics/SurfaceTexture;
    //   1520: aload_0
    //   1521: invokespecial g : ()Z
    //   1524: pop
    //   1525: aload_1
    //   1526: athrow
    //   1527: aload_0
    //   1528: getfield x : Ljavax/microedition/khronos/egl/EGL10;
    //   1531: invokeinterface eglGetError : ()I
    //   1536: invokestatic getEGLErrorString : (I)Ljava/lang/String;
    //   1539: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   1542: astore_1
    //   1543: aload_1
    //   1544: invokevirtual length : ()I
    //   1547: ifeq -> 1561
    //   1550: ldc_w 'EGL initialization failed: '
    //   1553: aload_1
    //   1554: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   1557: astore_1
    //   1558: goto -> 1572
    //   1561: new java/lang/String
    //   1564: dup
    //   1565: ldc_w 'EGL initialization failed: '
    //   1568: invokespecial <init> : (Ljava/lang/String;)V
    //   1571: astore_1
    //   1572: aload_1
    //   1573: invokestatic g : (Ljava/lang/String;)V
    //   1576: invokestatic g : ()Lcom/google/android/gms/internal/ads/fl;
    //   1579: new java/lang/Throwable
    //   1582: dup
    //   1583: aload_1
    //   1584: invokespecial <init> : (Ljava/lang/String;)V
    //   1587: ldc_w 'SphericalVideoProcessor.run.1'
    //   1590: invokevirtual e : (Ljava/lang/Throwable;Ljava/lang/String;)V
    //   1593: aload_0
    //   1594: invokespecial g : ()Z
    //   1597: pop
    //   1598: aload_0
    //   1599: getfield v : Ljava/util/concurrent/CountDownLatch;
    //   1602: invokevirtual countDown : ()V
    //   1605: return
    //   1606: astore_1
    //   1607: goto -> 881
    // Exception table:
    //   from	to	target	type
    //   876	881	1466	java/lang/IllegalStateException
    //   876	881	1422	finally
    //   881	888	1466	java/lang/IllegalStateException
    //   881	888	1422	finally
    //   888	912	1466	java/lang/IllegalStateException
    //   888	912	1422	finally
    //   915	948	1466	java/lang/IllegalStateException
    //   915	948	1422	finally
    //   960	965	1466	java/lang/IllegalStateException
    //   960	965	1422	finally
    //   1049	1072	1466	java/lang/IllegalStateException
    //   1049	1072	1422	finally
    //   1072	1088	1466	java/lang/IllegalStateException
    //   1072	1088	1422	finally
    //   1091	1112	1466	java/lang/IllegalStateException
    //   1091	1112	1422	finally
    //   1112	1286	1466	java/lang/IllegalStateException
    //   1112	1286	1422	finally
    //   1293	1320	1466	java/lang/IllegalStateException
    //   1293	1320	1422	finally
    //   1323	1346	1466	java/lang/IllegalStateException
    //   1323	1346	1422	finally
    //   1346	1351	1466	java/lang/IllegalStateException
    //   1346	1351	1422	finally
    //   1351	1358	1606	java/lang/InterruptedException
    //   1351	1358	1466	java/lang/IllegalStateException
    //   1351	1358	1422	finally
    //   1358	1386	1391	finally
    //   1386	1388	1391	finally
    //   1392	1394	1391	finally
    //   1394	1396	1606	java/lang/InterruptedException
    //   1394	1396	1466	java/lang/IllegalStateException
    //   1394	1396	1422	finally
    //   1423	1440	1499	finally
    //   1467	1473	1499	finally
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/co.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */