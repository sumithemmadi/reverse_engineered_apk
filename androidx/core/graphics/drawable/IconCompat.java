package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

public class IconCompat extends CustomVersionedParcelable {
  static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
  
  public int b = -1;
  
  Object c;
  
  public byte[] d = null;
  
  public Parcelable e = null;
  
  public int f = 0;
  
  public int g = 0;
  
  public ColorStateList h = null;
  
  PorterDuff.Mode i = a;
  
  public String j = null;
  
  public String k;
  
  public IconCompat() {}
  
  private IconCompat(int paramInt) {
    this.b = paramInt;
  }
  
  static Bitmap a(Bitmap paramBitmap, boolean paramBoolean) {
    int i = (int)(Math.min(paramBitmap.getWidth(), paramBitmap.getHeight()) * 0.6666667F);
    Bitmap bitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
    Canvas canvas = new Canvas(bitmap);
    Paint paint = new Paint(3);
    float f1 = i;
    float f2 = 0.5F * f1;
    float f3 = 0.9166667F * f2;
    if (paramBoolean) {
      float f = 0.010416667F * f1;
      paint.setColor(0);
      paint.setShadowLayer(f, 0.0F, f1 * 0.020833334F, 1023410176);
      canvas.drawCircle(f2, f2, f3, paint);
      paint.setShadowLayer(f, 0.0F, 0.0F, 503316480);
      canvas.drawCircle(f2, f2, f3, paint);
      paint.clearShadowLayer();
    } 
    paint.setColor(-16777216);
    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
    BitmapShader bitmapShader = new BitmapShader(paramBitmap, tileMode, tileMode);
    Matrix matrix = new Matrix();
    matrix.setTranslate((-(paramBitmap.getWidth() - i) / 2), (-(paramBitmap.getHeight() - i) / 2));
    bitmapShader.setLocalMatrix(matrix);
    paint.setShader((Shader)bitmapShader);
    canvas.drawCircle(f2, f2, f3, paint);
    canvas.setBitmap(null);
    return bitmap;
  }
  
  public static IconCompat b(Bitmap paramBitmap) {
    if (paramBitmap != null) {
      IconCompat iconCompat = new IconCompat(1);
      iconCompat.c = paramBitmap;
      return iconCompat;
    } 
    throw new IllegalArgumentException("Bitmap must not be null.");
  }
  
  public static IconCompat c(Resources paramResources, String paramString, int paramInt) {
    if (paramString != null) {
      if (paramInt != 0) {
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f = paramInt;
        if (paramResources != null) {
          try {
            iconCompat.c = paramResources.getResourceName(paramInt);
          } catch (android.content.res.Resources.NotFoundException notFoundException) {
            throw new IllegalArgumentException("Icon resource cannot be found");
          } 
        } else {
          iconCompat.c = paramString;
        } 
        iconCompat.k = paramString;
        return iconCompat;
      } 
      throw new IllegalArgumentException("Drawable resource ID must not be 0");
    } 
    throw new IllegalArgumentException("Package must not be null.");
  }
  
  private static int f(Icon paramIcon) {
    if (Build.VERSION.SDK_INT >= 28)
      return paramIcon.getResId(); 
    try {
      return ((Integer)paramIcon.getClass().getMethod("getResId", new Class[0]).invoke(paramIcon, new Object[0])).intValue();
    } catch (IllegalAccessException illegalAccessException) {
      Log.e("IconCompat", "Unable to get icon resource", illegalAccessException);
      return 0;
    } catch (InvocationTargetException invocationTargetException) {
      Log.e("IconCompat", "Unable to get icon resource", invocationTargetException);
      return 0;
    } catch (NoSuchMethodException noSuchMethodException) {
      Log.e("IconCompat", "Unable to get icon resource", noSuchMethodException);
      return 0;
    } 
  }
  
  private static String h(Icon paramIcon) {
    if (Build.VERSION.SDK_INT >= 28)
      return paramIcon.getResPackage(); 
    try {
      return (String)paramIcon.getClass().getMethod("getResPackage", new Class[0]).invoke(paramIcon, new Object[0]);
    } catch (IllegalAccessException illegalAccessException) {
      Log.e("IconCompat", "Unable to get icon package", illegalAccessException);
      return null;
    } catch (InvocationTargetException invocationTargetException) {
      Log.e("IconCompat", "Unable to get icon package", invocationTargetException);
      return null;
    } catch (NoSuchMethodException noSuchMethodException) {
      Log.e("IconCompat", "Unable to get icon package", noSuchMethodException);
      return null;
    } 
  }
  
  private static int j(Icon paramIcon) {
    if (Build.VERSION.SDK_INT >= 28)
      return paramIcon.getType(); 
    try {
      return ((Integer)paramIcon.getClass().getMethod("getType", new Class[0]).invoke(paramIcon, new Object[0])).intValue();
    } catch (IllegalAccessException illegalAccessException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Unable to get icon type ");
      stringBuilder.append(paramIcon);
      Log.e("IconCompat", stringBuilder.toString(), illegalAccessException);
      return -1;
    } catch (InvocationTargetException invocationTargetException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Unable to get icon type ");
      stringBuilder.append(paramIcon);
      Log.e("IconCompat", stringBuilder.toString(), invocationTargetException);
      return -1;
    } catch (NoSuchMethodException noSuchMethodException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Unable to get icon type ");
      stringBuilder.append(paramIcon);
      Log.e("IconCompat", stringBuilder.toString(), noSuchMethodException);
      return -1;
    } 
  }
  
  private static Uri l(Icon paramIcon) {
    if (Build.VERSION.SDK_INT >= 28)
      return paramIcon.getUri(); 
    try {
      return (Uri)paramIcon.getClass().getMethod("getUri", new Class[0]).invoke(paramIcon, new Object[0]);
    } catch (IllegalAccessException illegalAccessException) {
      Log.e("IconCompat", "Unable to get icon uri", illegalAccessException);
      return null;
    } catch (InvocationTargetException invocationTargetException) {
      Log.e("IconCompat", "Unable to get icon uri", invocationTargetException);
      return null;
    } catch (NoSuchMethodException noSuchMethodException) {
      Log.e("IconCompat", "Unable to get icon uri", noSuchMethodException);
      return null;
    } 
  }
  
  private static String r(int paramInt) {
    switch (paramInt) {
      default:
        return "UNKNOWN";
      case 6:
        return "URI_MASKABLE";
      case 5:
        return "BITMAP_MASKABLE";
      case 4:
        return "URI";
      case 3:
        return "DATA";
      case 2:
        return "RESOURCE";
      case 1:
        break;
    } 
    return "BITMAP";
  }
  
  public Bitmap d() {
    int i = this.b;
    if (i == -1 && Build.VERSION.SDK_INT >= 23) {
      Object object = this.c;
      return (object instanceof Bitmap) ? (Bitmap)object : null;
    } 
    if (i == 1)
      return (Bitmap)this.c; 
    if (i == 5)
      return a((Bitmap)this.c, true); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("called getBitmap() on ");
    stringBuilder.append(this);
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  public int e() {
    int i = this.b;
    if (i == -1 && Build.VERSION.SDK_INT >= 23)
      return f((Icon)this.c); 
    if (i == 2)
      return this.f; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("called getResId() on ");
    stringBuilder.append(this);
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  public String g() {
    int i = this.b;
    if (i == -1 && Build.VERSION.SDK_INT >= 23)
      return h((Icon)this.c); 
    if (i == 2)
      return TextUtils.isEmpty(this.k) ? ((String)this.c).split(":", -1)[0] : this.k; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("called getResPackage() on ");
    stringBuilder.append(this);
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  public int i() {
    int i = this.b;
    int j = i;
    if (i == -1) {
      j = i;
      if (Build.VERSION.SDK_INT >= 23)
        j = j((Icon)this.c); 
    } 
    return j;
  }
  
  public Uri k() {
    int i = this.b;
    if (i == -1 && Build.VERSION.SDK_INT >= 23)
      return l((Icon)this.c); 
    if (i == 4 || i == 6)
      return Uri.parse((String)this.c); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("called getUri() on ");
    stringBuilder.append(this);
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  public InputStream m(Context paramContext) {
    Uri uri = k();
    String str = uri.getScheme();
    if ("content".equals(str) || "file".equals(str)) {
      try {
        return paramContext.getContentResolver().openInputStream(uri);
      } catch (Exception exception) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unable to load image from URI: ");
        stringBuilder.append(uri);
        Log.w("IconCompat", stringBuilder.toString(), exception);
      } 
      return null;
    } 
    try {
      File file = new File();
      this((String)this.c);
      return new FileInputStream(file);
    } catch (FileNotFoundException fileNotFoundException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Unable to load image from path: ");
      stringBuilder.append(uri);
      Log.w("IconCompat", stringBuilder.toString(), fileNotFoundException);
    } 
    return null;
  }
  
  public void n() {
    String str;
    this.i = PorterDuff.Mode.valueOf(this.j);
    switch (this.b) {
      default:
        return;
      case 3:
        this.c = this.d;
      case 2:
      case 4:
      case 6:
        str = new String(this.d, Charset.forName("UTF-16"));
        this.c = str;
        if (this.b == 2 && this.k == null)
          this.k = str.split(":", -1)[0]; 
      case 1:
      case 5:
        parcelable = this.e;
        if (parcelable != null) {
          this.c = parcelable;
        } else {
          byte[] arrayOfByte = this.d;
          this.c = arrayOfByte;
          this.b = 3;
          this.f = 0;
          this.g = arrayOfByte.length;
        } 
      case -1:
        break;
    } 
    Parcelable parcelable = this.e;
    if (parcelable != null)
      this.c = parcelable; 
    throw new IllegalArgumentException("Invalid icon");
  }
  
  public void o(boolean paramBoolean) {
    this.j = this.i.name();
    switch (this.b) {
      default:
        return;
      case 4:
      case 6:
        this.d = this.c.toString().getBytes(Charset.forName("UTF-16"));
      case 3:
        this.d = (byte[])this.c;
      case 2:
        this.d = ((String)this.c).getBytes(Charset.forName("UTF-16"));
      case 1:
      case 5:
        if (paramBoolean) {
          Bitmap bitmap = (Bitmap)this.c;
          ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
          bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
          this.d = byteArrayOutputStream.toByteArray();
        } else {
          this.e = (Parcelable)this.c;
        } 
      case -1:
        break;
    } 
    if (!paramBoolean)
      this.e = (Parcelable)this.c; 
    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
  }
  
  @Deprecated
  public Icon p() {
    return q(null);
  }
  
  public Icon q(Context paramContext) {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : I
    //   4: tableswitch default -> 52, -1 -> 341, 0 -> 52, 1 -> 295, 2 -> 280, 3 -> 258, 4 -> 244, 5 -> 204, 6 -> 63
    //   52: new java/lang/IllegalArgumentException
    //   55: dup
    //   56: ldc_w 'Unknown type'
    //   59: invokespecial <init> : (Ljava/lang/String;)V
    //   62: athrow
    //   63: getstatic android/os/Build$VERSION.SDK_INT : I
    //   66: istore_2
    //   67: iload_2
    //   68: bipush #30
    //   70: if_icmplt -> 84
    //   73: aload_0
    //   74: invokevirtual k : ()Landroid/net/Uri;
    //   77: invokestatic createWithAdaptiveBitmapContentUri : (Landroid/net/Uri;)Landroid/graphics/drawable/Icon;
    //   80: astore_1
    //   81: goto -> 306
    //   84: aload_1
    //   85: ifnull -> 167
    //   88: aload_0
    //   89: aload_1
    //   90: invokevirtual m : (Landroid/content/Context;)Ljava/io/InputStream;
    //   93: astore_1
    //   94: aload_1
    //   95: ifnull -> 130
    //   98: iload_2
    //   99: bipush #26
    //   101: if_icmplt -> 115
    //   104: aload_1
    //   105: invokestatic decodeStream : (Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   108: invokestatic createWithAdaptiveBitmap : (Landroid/graphics/Bitmap;)Landroid/graphics/drawable/Icon;
    //   111: astore_1
    //   112: goto -> 306
    //   115: aload_1
    //   116: invokestatic decodeStream : (Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   119: iconst_0
    //   120: invokestatic a : (Landroid/graphics/Bitmap;Z)Landroid/graphics/Bitmap;
    //   123: invokestatic createWithBitmap : (Landroid/graphics/Bitmap;)Landroid/graphics/drawable/Icon;
    //   126: astore_1
    //   127: goto -> 306
    //   130: new java/lang/StringBuilder
    //   133: dup
    //   134: invokespecial <init> : ()V
    //   137: astore_1
    //   138: aload_1
    //   139: ldc_w 'Cannot load adaptive icon from uri: '
    //   142: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   145: pop
    //   146: aload_1
    //   147: aload_0
    //   148: invokevirtual k : ()Landroid/net/Uri;
    //   151: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   154: pop
    //   155: new java/lang/IllegalStateException
    //   158: dup
    //   159: aload_1
    //   160: invokevirtual toString : ()Ljava/lang/String;
    //   163: invokespecial <init> : (Ljava/lang/String;)V
    //   166: athrow
    //   167: new java/lang/StringBuilder
    //   170: dup
    //   171: invokespecial <init> : ()V
    //   174: astore_1
    //   175: aload_1
    //   176: ldc_w 'Context is required to resolve the file uri of the icon: '
    //   179: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   182: pop
    //   183: aload_1
    //   184: aload_0
    //   185: invokevirtual k : ()Landroid/net/Uri;
    //   188: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   191: pop
    //   192: new java/lang/IllegalArgumentException
    //   195: dup
    //   196: aload_1
    //   197: invokevirtual toString : ()Ljava/lang/String;
    //   200: invokespecial <init> : (Ljava/lang/String;)V
    //   203: athrow
    //   204: getstatic android/os/Build$VERSION.SDK_INT : I
    //   207: bipush #26
    //   209: if_icmplt -> 226
    //   212: aload_0
    //   213: getfield c : Ljava/lang/Object;
    //   216: checkcast android/graphics/Bitmap
    //   219: invokestatic createWithAdaptiveBitmap : (Landroid/graphics/Bitmap;)Landroid/graphics/drawable/Icon;
    //   222: astore_1
    //   223: goto -> 306
    //   226: aload_0
    //   227: getfield c : Ljava/lang/Object;
    //   230: checkcast android/graphics/Bitmap
    //   233: iconst_0
    //   234: invokestatic a : (Landroid/graphics/Bitmap;Z)Landroid/graphics/Bitmap;
    //   237: invokestatic createWithBitmap : (Landroid/graphics/Bitmap;)Landroid/graphics/drawable/Icon;
    //   240: astore_1
    //   241: goto -> 306
    //   244: aload_0
    //   245: getfield c : Ljava/lang/Object;
    //   248: checkcast java/lang/String
    //   251: invokestatic createWithContentUri : (Ljava/lang/String;)Landroid/graphics/drawable/Icon;
    //   254: astore_1
    //   255: goto -> 306
    //   258: aload_0
    //   259: getfield c : Ljava/lang/Object;
    //   262: checkcast [B
    //   265: aload_0
    //   266: getfield f : I
    //   269: aload_0
    //   270: getfield g : I
    //   273: invokestatic createWithData : ([BII)Landroid/graphics/drawable/Icon;
    //   276: astore_1
    //   277: goto -> 306
    //   280: aload_0
    //   281: invokevirtual g : ()Ljava/lang/String;
    //   284: aload_0
    //   285: getfield f : I
    //   288: invokestatic createWithResource : (Ljava/lang/String;I)Landroid/graphics/drawable/Icon;
    //   291: astore_1
    //   292: goto -> 306
    //   295: aload_0
    //   296: getfield c : Ljava/lang/Object;
    //   299: checkcast android/graphics/Bitmap
    //   302: invokestatic createWithBitmap : (Landroid/graphics/Bitmap;)Landroid/graphics/drawable/Icon;
    //   305: astore_1
    //   306: aload_0
    //   307: getfield h : Landroid/content/res/ColorStateList;
    //   310: astore_3
    //   311: aload_3
    //   312: ifnull -> 321
    //   315: aload_1
    //   316: aload_3
    //   317: invokevirtual setTintList : (Landroid/content/res/ColorStateList;)Landroid/graphics/drawable/Icon;
    //   320: pop
    //   321: aload_0
    //   322: getfield i : Landroid/graphics/PorterDuff$Mode;
    //   325: astore_3
    //   326: aload_3
    //   327: getstatic androidx/core/graphics/drawable/IconCompat.a : Landroid/graphics/PorterDuff$Mode;
    //   330: if_acmpeq -> 339
    //   333: aload_1
    //   334: aload_3
    //   335: invokevirtual setTintMode : (Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/drawable/Icon;
    //   338: pop
    //   339: aload_1
    //   340: areturn
    //   341: aload_0
    //   342: getfield c : Ljava/lang/Object;
    //   345: checkcast android/graphics/drawable/Icon
    //   348: areturn
  }
  
  public String toString() {
    if (this.b == -1)
      return String.valueOf(this.c); 
    StringBuilder stringBuilder = new StringBuilder("Icon(typ=");
    stringBuilder.append(r(this.b));
    switch (this.b) {
      case 4:
      case 6:
        stringBuilder.append(" uri=");
        stringBuilder.append(this.c);
        break;
      case 3:
        stringBuilder.append(" len=");
        stringBuilder.append(this.f);
        if (this.g != 0) {
          stringBuilder.append(" off=");
          stringBuilder.append(this.g);
        } 
        break;
      case 2:
        stringBuilder.append(" pkg=");
        stringBuilder.append(this.k);
        stringBuilder.append(" id=");
        stringBuilder.append(String.format("0x%08x", new Object[] { Integer.valueOf(e()) }));
        break;
      case 1:
      case 5:
        stringBuilder.append(" size=");
        stringBuilder.append(((Bitmap)this.c).getWidth());
        stringBuilder.append("x");
        stringBuilder.append(((Bitmap)this.c).getHeight());
        break;
    } 
    if (this.h != null) {
      stringBuilder.append(" tint=");
      stringBuilder.append(this.h);
    } 
    if (this.i != a) {
      stringBuilder.append(" mode=");
      stringBuilder.append(this.i);
    } 
    stringBuilder.append(")");
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/core/graphics/drawable/IconCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */