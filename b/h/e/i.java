package b.h.e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import androidx.core.content.d.c;
import b.h.h.f;
import java.io.IOException;
import java.io.InputStream;

public class i extends j {
  public Typeface b(Context paramContext, c.b paramb, Resources paramResources, int paramInt) {
    Exception exception2 = null;
    try {
      c.c[] arrayOfC = paramb.a();
      int k = arrayOfC.length;
      boolean bool = false;
      paramContext = null;
      char c = Character.MIN_VALUE;
      while (true) {
        FontFamily.Builder builder;
        boolean bool1 = true;
        if (c < k) {
          c.c c1 = arrayOfC[c];
          try {
            Font.Builder builder1 = new Font.Builder();
            this(paramResources, c1.b());
            builder1 = builder1.setWeight(c1.e());
            if (!c1.f())
              bool1 = false; 
            Font font = builder1.setSlant(bool1).setTtcIndex(c1.c()).setFontVariationSettings(c1.d()).build();
            if (paramContext == null) {
              FontFamily.Builder builder2 = new FontFamily.Builder();
              this(font);
              builder = builder2;
            } else {
              builder.addFont(font);
            } 
          } catch (IOException iOException) {}
          c++;
          continue;
        } 
        if (builder == null)
          return null; 
        FontStyle fontStyle = new FontStyle();
        if ((paramInt & 0x1) != 0) {
          c = 'ʼ';
        } else {
          c = 'Ɛ';
        } 
        bool1 = bool;
        if ((paramInt & 0x2) != 0)
          bool1 = true; 
        this(c, bool1);
        Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder();
        this(builder.build());
        return customFallbackBuilder.setStyle(fontStyle).build();
      } 
    } catch (Exception exception1) {
      exception1 = exception2;
    } 
    return (Typeface)exception1;
  }
  
  public Typeface c(Context paramContext, CancellationSignal paramCancellationSignal, f.b[] paramArrayOfb, int paramInt) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual getContentResolver : ()Landroid/content/ContentResolver;
    //   4: astore #5
    //   6: aload_3
    //   7: arraylength
    //   8: istore #6
    //   10: iconst_0
    //   11: istore #7
    //   13: aconst_null
    //   14: astore_1
    //   15: iconst_0
    //   16: istore #8
    //   18: iconst_1
    //   19: istore #9
    //   21: iload #8
    //   23: iload #6
    //   25: if_icmpge -> 190
    //   28: aload_3
    //   29: iload #8
    //   31: aaload
    //   32: astore #10
    //   34: aload_1
    //   35: astore #11
    //   37: aload #5
    //   39: aload #10
    //   41: invokevirtual d : ()Landroid/net/Uri;
    //   44: ldc 'r'
    //   46: aload_2
    //   47: invokevirtual openFileDescriptor : (Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;
    //   50: astore #12
    //   52: aload #12
    //   54: ifnonnull -> 79
    //   57: aload_1
    //   58: astore #11
    //   60: aload #12
    //   62: ifnull -> 181
    //   65: aload_1
    //   66: astore #11
    //   68: aload #12
    //   70: invokevirtual close : ()V
    //   73: aload_1
    //   74: astore #11
    //   76: goto -> 181
    //   79: new android/graphics/fonts/Font$Builder
    //   82: astore #11
    //   84: aload #11
    //   86: aload #12
    //   88: invokespecial <init> : (Landroid/os/ParcelFileDescriptor;)V
    //   91: aload #11
    //   93: aload #10
    //   95: invokevirtual e : ()I
    //   98: invokevirtual setWeight : (I)Landroid/graphics/fonts/Font$Builder;
    //   101: astore #11
    //   103: aload #10
    //   105: invokevirtual f : ()Z
    //   108: ifeq -> 114
    //   111: goto -> 117
    //   114: iconst_0
    //   115: istore #9
    //   117: aload #11
    //   119: iload #9
    //   121: invokevirtual setSlant : (I)Landroid/graphics/fonts/Font$Builder;
    //   124: aload #10
    //   126: invokevirtual c : ()I
    //   129: invokevirtual setTtcIndex : (I)Landroid/graphics/fonts/Font$Builder;
    //   132: invokevirtual build : ()Landroid/graphics/fonts/Font;
    //   135: astore #11
    //   137: aload_1
    //   138: ifnonnull -> 158
    //   141: new android/graphics/fonts/FontFamily$Builder
    //   144: dup
    //   145: aload #11
    //   147: invokespecial <init> : (Landroid/graphics/fonts/Font;)V
    //   150: astore #11
    //   152: aload #11
    //   154: astore_1
    //   155: goto -> 65
    //   158: aload_1
    //   159: aload #11
    //   161: invokevirtual addFont : (Landroid/graphics/fonts/Font;)Landroid/graphics/fonts/FontFamily$Builder;
    //   164: pop
    //   165: goto -> 65
    //   168: astore #10
    //   170: aload #12
    //   172: invokevirtual close : ()V
    //   175: aload_1
    //   176: astore #11
    //   178: aload #10
    //   180: athrow
    //   181: iinc #8, 1
    //   184: aload #11
    //   186: astore_1
    //   187: goto -> 18
    //   190: aload_1
    //   191: ifnonnull -> 196
    //   194: aconst_null
    //   195: areturn
    //   196: new android/graphics/fonts/FontStyle
    //   199: astore_3
    //   200: iload #4
    //   202: iconst_1
    //   203: iand
    //   204: ifeq -> 215
    //   207: sipush #700
    //   210: istore #8
    //   212: goto -> 220
    //   215: sipush #400
    //   218: istore #8
    //   220: iload #7
    //   222: istore #9
    //   224: iload #4
    //   226: iconst_2
    //   227: iand
    //   228: ifeq -> 234
    //   231: iconst_1
    //   232: istore #9
    //   234: aload_3
    //   235: iload #8
    //   237: iload #9
    //   239: invokespecial <init> : (II)V
    //   242: new android/graphics/Typeface$CustomFallbackBuilder
    //   245: astore_2
    //   246: aload_2
    //   247: aload_1
    //   248: invokevirtual build : ()Landroid/graphics/fonts/FontFamily;
    //   251: invokespecial <init> : (Landroid/graphics/fonts/FontFamily;)V
    //   254: aload_2
    //   255: aload_3
    //   256: invokevirtual setStyle : (Landroid/graphics/fonts/FontStyle;)Landroid/graphics/Typeface$CustomFallbackBuilder;
    //   259: invokevirtual build : ()Landroid/graphics/Typeface;
    //   262: astore_1
    //   263: aload_1
    //   264: areturn
    //   265: astore_1
    //   266: aconst_null
    //   267: areturn
    //   268: astore_1
    //   269: goto -> 181
    //   272: astore #11
    //   274: goto -> 175
    // Exception table:
    //   from	to	target	type
    //   6	10	265	java/lang/Exception
    //   37	52	268	java/io/IOException
    //   37	52	265	java/lang/Exception
    //   68	73	268	java/io/IOException
    //   68	73	265	java/lang/Exception
    //   79	111	168	finally
    //   117	137	168	finally
    //   141	152	168	finally
    //   158	165	168	finally
    //   170	175	272	finally
    //   178	181	268	java/io/IOException
    //   178	181	265	java/lang/Exception
    //   196	200	265	java/lang/Exception
    //   234	263	265	java/lang/Exception
  }
  
  protected Typeface d(Context paramContext, InputStream paramInputStream) {
    throw new RuntimeException("Do not use this function in API 29 or later.");
  }
  
  public Typeface e(Context paramContext, Resources paramResources, int paramInt1, String paramString, int paramInt2) {
    try {
      Font.Builder builder = new Font.Builder();
      this(paramResources, paramInt1);
      Font font = builder.build();
      FontFamily.Builder builder1 = new FontFamily.Builder();
      this(font);
      FontFamily fontFamily = builder1.build();
      Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder();
      this(fontFamily);
      return customFallbackBuilder.setStyle(font.getStyle()).build();
    } catch (Exception exception) {
      return null;
    } 
  }
  
  protected f.b h(f.b[] paramArrayOfb, int paramInt) {
    throw new RuntimeException("Do not use this function in API 29 or later.");
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/h/e/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */