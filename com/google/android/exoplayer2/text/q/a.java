package com.google.android.exoplayer2.text.q;

import android.text.Layout;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.text.c;
import com.google.android.exoplayer2.text.e;
import com.google.android.exoplayer2.util.h;
import com.google.android.exoplayer2.util.h0;
import com.google.android.exoplayer2.util.i0;
import com.google.android.exoplayer2.util.o;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

public final class a extends c {
  private static final Pattern o = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
  
  private static final Pattern p = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
  
  private static final Pattern q = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
  
  private static final Pattern r = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
  
  private static final Pattern s = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
  
  private static final Pattern t = Pattern.compile("^(\\d+) (\\d+)$");
  
  private static final b u = new b(30.0F, 1, 1);
  
  private static final a v = new a(32, 15);
  
  private final XmlPullParserFactory w;
  
  public a() {
    super("TtmlDecoder");
    try {
      XmlPullParserFactory xmlPullParserFactory = XmlPullParserFactory.newInstance();
      this.w = xmlPullParserFactory;
      xmlPullParserFactory.setNamespaceAware(true);
      return;
    } catch (XmlPullParserException xmlPullParserException) {
      throw new RuntimeException("Couldn't create XmlPullParserFactory instance", xmlPullParserException);
    } 
  }
  
  private e C(e parame) {
    e e1 = parame;
    if (parame == null)
      e1 = new e(); 
    return e1;
  }
  
  private static boolean D(String paramString) {
    return (paramString.equals("tt") || paramString.equals("head") || paramString.equals("body") || paramString.equals("div") || paramString.equals("p") || paramString.equals("span") || paramString.equals("br") || paramString.equals("style") || paramString.equals("styling") || paramString.equals("layout") || paramString.equals("region") || paramString.equals("metadata") || paramString.equals("image") || paramString.equals("data") || paramString.equals("information"));
  }
  
  private a E(XmlPullParser paramXmlPullParser, a parama) {
    StringBuilder stringBuilder;
    String str = paramXmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
    if (str == null)
      return parama; 
    Matcher matcher = t.matcher(str);
    if (!matcher.matches()) {
      stringBuilder = new StringBuilder();
      stringBuilder.append("Ignoring malformed cell resolution: ");
      stringBuilder.append(str);
      o.f("TtmlDecoder", stringBuilder.toString());
      return parama;
    } 
    try {
      int i = Integer.parseInt(stringBuilder.group(1));
      int j = Integer.parseInt(stringBuilder.group(2));
      if (i != 0 && j != 0)
        return new a(i, j); 
      SubtitleDecoderException subtitleDecoderException = new SubtitleDecoderException();
      StringBuilder stringBuilder1 = new StringBuilder();
      this();
      stringBuilder1.append("Invalid cell resolution ");
      stringBuilder1.append(i);
      stringBuilder1.append(" ");
      stringBuilder1.append(j);
      this(stringBuilder1.toString());
      throw subtitleDecoderException;
    } catch (NumberFormatException numberFormatException) {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("Ignoring malformed cell resolution: ");
      stringBuilder1.append(str);
      o.f("TtmlDecoder", stringBuilder1.toString());
      return parama;
    } 
  }
  
  private static void F(String paramString, e parame) {
    Matcher matcher;
    String[] arrayOfString = h0.n0(paramString, "\\s+");
    if (arrayOfString.length == 1) {
      matcher = q.matcher(paramString);
    } else if (matcher.length == 2) {
      matcher = q.matcher((CharSequence)matcher[1]);
      o.f("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
    } else {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("Invalid number of entries for fontSize: ");
      stringBuilder1.append(matcher.length);
      stringBuilder1.append(".");
      throw new SubtitleDecoderException(stringBuilder1.toString());
    } 
    if (matcher.matches()) {
      StringBuilder stringBuilder1;
      paramString = matcher.group(3);
      paramString.hashCode();
      byte b1 = -1;
      switch (paramString.hashCode()) {
        case 3592:
          if (!paramString.equals("px"))
            break; 
          b1 = 2;
          break;
        case 3240:
          if (!paramString.equals("em"))
            break; 
          b1 = 1;
          break;
        case 37:
          if (!paramString.equals("%"))
            break; 
          b1 = 0;
          break;
      } 
      switch (b1) {
        default:
          stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Invalid unit for fontSize: '");
          stringBuilder1.append(paramString);
          stringBuilder1.append("'.");
          throw new SubtitleDecoderException(stringBuilder1.toString());
        case 2:
          stringBuilder1.t(1);
          break;
        case 1:
          stringBuilder1.t(2);
          break;
        case 0:
          stringBuilder1.t(3);
          break;
      } 
      stringBuilder1.s(Float.valueOf(matcher.group(1)).floatValue());
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Invalid expression for fontSize: '");
    stringBuilder.append(paramString);
    stringBuilder.append("'.");
    throw new SubtitleDecoderException(stringBuilder.toString());
  }
  
  private b G(XmlPullParser paramXmlPullParser) {
    byte b2;
    String str2 = paramXmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
    if (str2 != null) {
      b2 = Integer.parseInt(str2);
    } else {
      b2 = 30;
    } 
    float f = 1.0F;
    str2 = paramXmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
    if (str2 != null) {
      String[] arrayOfString = h0.n0(str2, " ");
      if (arrayOfString.length == 2) {
        f = Integer.parseInt(arrayOfString[0]) / Integer.parseInt(arrayOfString[1]);
      } else {
        throw new SubtitleDecoderException("frameRateMultiplier doesn't have 2 parts");
      } 
    } 
    b b1 = u;
    int i = b1.b;
    String str3 = paramXmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
    if (str3 != null)
      i = Integer.parseInt(str3); 
    int j = b1.c;
    String str1 = paramXmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
    if (str1 != null)
      j = Integer.parseInt(str1); 
    return new b(b2 * f, i, j);
  }
  
  private Map<String, e> H(XmlPullParser paramXmlPullParser, Map<String, e> paramMap, a parama, c paramc, Map<String, c> paramMap1, Map<String, String> paramMap2) {
    while (true) {
      paramXmlPullParser.next();
      if (i0.e(paramXmlPullParser, "style")) {
        String str = i0.a(paramXmlPullParser, "style");
        e e = L(paramXmlPullParser, new e());
        if (str != null) {
          String[] arrayOfString = M(str);
          int i = arrayOfString.length;
          for (byte b1 = 0; b1 < i; b1++)
            e.a(paramMap.get(arrayOfString[b1])); 
        } 
        if (e.g() != null)
          paramMap.put(e.g(), e); 
      } else if (i0.e(paramXmlPullParser, "region")) {
        c c1 = K(paramXmlPullParser, parama, paramc);
        if (c1 != null)
          paramMap1.put(c1.a, c1); 
      } else if (i0.e(paramXmlPullParser, "metadata")) {
        I(paramXmlPullParser, paramMap2);
      } 
      if (i0.c(paramXmlPullParser, "head"))
        return paramMap; 
    } 
  }
  
  private void I(XmlPullParser paramXmlPullParser, Map<String, String> paramMap) {
    do {
      paramXmlPullParser.next();
      if (!i0.e(paramXmlPullParser, "image"))
        continue; 
      String str = i0.a(paramXmlPullParser, "id");
      if (str == null)
        continue; 
      paramMap.put(str, paramXmlPullParser.nextText());
    } while (!i0.c(paramXmlPullParser, "metadata"));
  }
  
  private b J(XmlPullParser paramXmlPullParser, b paramb, Map<String, c> paramMap, b paramb1) {
    String[] arrayOfString;
    long l4;
    long l5;
    int i = paramXmlPullParser.getAttributeCount();
    e e = L(paramXmlPullParser, null);
    String str1 = null;
    String str2 = str1;
    String str3 = "";
    byte b1 = 0;
    long l1 = -9223372036854775807L;
    long l2 = -9223372036854775807L;
    long l3;
    for (l3 = -9223372036854775807L; b1 < i; l3 = l5) {
      String[] arrayOfString1;
      byte b2;
      String str6;
      long l;
      String str4 = paramXmlPullParser.getAttributeName(b1);
      String str5 = paramXmlPullParser.getAttributeValue(b1);
      str4.hashCode();
      switch (str4.hashCode()) {
        default:
          b2 = -1;
          break;
        case 1292595405:
          if (str4.equals("backgroundImage")) {
            b2 = 5;
            break;
          } 
        case 109780401:
          if (str4.equals("style")) {
            b2 = 4;
            break;
          } 
        case 93616297:
          if (str4.equals("begin")) {
            b2 = 3;
            break;
          } 
        case 100571:
          if (str4.equals("end")) {
            b2 = 2;
            break;
          } 
        case 99841:
          if (str4.equals("dur")) {
            b2 = 1;
            break;
          } 
        case -934795532:
          if (str4.equals("region")) {
            b2 = 0;
            break;
          } 
      } 
      switch (b2) {
        default:
          l4 = l1;
          str6 = str1;
          str4 = str2;
          l = l2;
          l5 = l3;
          break;
        case 5:
          l4 = l1;
          str6 = str1;
          str4 = str2;
          l = l2;
          l5 = l3;
          if (str5.startsWith("#")) {
            str4 = str5.substring(1);
            l4 = l1;
            str6 = str1;
            l = l2;
            l5 = l3;
          } 
          break;
        case 4:
          arrayOfString1 = M(str5);
          l4 = l1;
          str6 = str1;
          str4 = str2;
          l = l2;
          l5 = l3;
          if (arrayOfString1.length > 0) {
            String[] arrayOfString2 = arrayOfString1;
            l4 = l1;
            str4 = str2;
            l = l2;
            l5 = l3;
          } 
          break;
        case 3:
          l4 = N((String)arrayOfString1, paramb1);
          l5 = l3;
          l = l2;
          str4 = str2;
          str6 = str1;
          break;
        case 2:
          l = N((String)arrayOfString1, paramb1);
          l4 = l1;
          str6 = str1;
          str4 = str2;
          l5 = l3;
          break;
        case 1:
          l5 = N((String)arrayOfString1, paramb1);
          l4 = l1;
          str6 = str1;
          str4 = str2;
          l = l2;
          break;
        case 0:
          l4 = l1;
          str6 = str1;
          str4 = str2;
          l = l2;
          l5 = l3;
          if (paramMap.containsKey(arrayOfString1)) {
            arrayOfString = arrayOfString1;
            l5 = l3;
            l = l2;
            str4 = str2;
            str6 = str1;
            l4 = l1;
          } 
          break;
      } 
      b1++;
      l1 = l4;
      str1 = str6;
      str2 = str4;
      l2 = l;
    } 
    if (paramb != null) {
      long l = paramb.d;
      l4 = l1;
      l5 = l2;
      if (l != -9223372036854775807L) {
        long l6 = l1;
        if (l1 != -9223372036854775807L)
          l6 = l1 + l; 
        l4 = l6;
        l5 = l2;
        if (l2 != -9223372036854775807L) {
          l5 = l2 + l;
          l4 = l6;
        } 
      } 
    } else {
      l5 = l2;
      l4 = l1;
    } 
    if (l5 == -9223372036854775807L) {
      if (l3 != -9223372036854775807L) {
        l1 = l4 + l3;
      } else {
        if (paramb != null) {
          l1 = paramb.e;
          if (l1 != -9223372036854775807L)
            return b.c(paramXmlPullParser.getName(), l4, l1, e, (String[])str1, (String)arrayOfString, str2); 
        } 
        l1 = l5;
      } 
      return b.c(paramXmlPullParser.getName(), l4, l1, e, (String[])str1, (String)arrayOfString, str2);
    } 
    l1 = l5;
  }
  
  private c K(XmlPullParser paramXmlPullParser, a parama, c paramc) {
    // Byte code:
    //   0: aload_1
    //   1: ldc_w 'id'
    //   4: invokestatic a : (Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;
    //   7: astore #4
    //   9: aload #4
    //   11: ifnonnull -> 16
    //   14: aconst_null
    //   15: areturn
    //   16: aload_1
    //   17: ldc_w 'origin'
    //   20: invokestatic a : (Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;
    //   23: astore #5
    //   25: aload #5
    //   27: ifnull -> 699
    //   30: getstatic com/google/android/exoplayer2/text/q/a.r : Ljava/util/regex/Pattern;
    //   33: astore #6
    //   35: aload #6
    //   37: aload #5
    //   39: invokevirtual matcher : (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   42: astore #7
    //   44: getstatic com/google/android/exoplayer2/text/q/a.s : Ljava/util/regex/Pattern;
    //   47: astore #8
    //   49: aload #8
    //   51: aload #5
    //   53: invokevirtual matcher : (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   56: astore #9
    //   58: aload #7
    //   60: invokevirtual matches : ()Z
    //   63: ifeq -> 138
    //   66: aload #7
    //   68: iconst_1
    //   69: invokevirtual group : (I)Ljava/lang/String;
    //   72: invokestatic parseFloat : (Ljava/lang/String;)F
    //   75: ldc_w 100.0
    //   78: fdiv
    //   79: fstore #10
    //   81: aload #7
    //   83: iconst_2
    //   84: invokevirtual group : (I)Ljava/lang/String;
    //   87: invokestatic parseFloat : (Ljava/lang/String;)F
    //   90: fstore #11
    //   92: fload #11
    //   94: ldc_w 100.0
    //   97: fdiv
    //   98: fstore #11
    //   100: goto -> 236
    //   103: astore_1
    //   104: new java/lang/StringBuilder
    //   107: dup
    //   108: invokespecial <init> : ()V
    //   111: astore_1
    //   112: aload_1
    //   113: ldc_w 'Ignoring region with malformed origin: '
    //   116: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   119: pop
    //   120: aload_1
    //   121: aload #5
    //   123: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   126: pop
    //   127: ldc 'TtmlDecoder'
    //   129: aload_1
    //   130: invokevirtual toString : ()Ljava/lang/String;
    //   133: invokestatic f : (Ljava/lang/String;Ljava/lang/String;)V
    //   136: aconst_null
    //   137: areturn
    //   138: aload #9
    //   140: invokevirtual matches : ()Z
    //   143: ifeq -> 665
    //   146: aload_3
    //   147: ifnonnull -> 184
    //   150: new java/lang/StringBuilder
    //   153: dup
    //   154: invokespecial <init> : ()V
    //   157: astore_1
    //   158: aload_1
    //   159: ldc_w 'Ignoring region with missing tts:extent: '
    //   162: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   165: pop
    //   166: aload_1
    //   167: aload #5
    //   169: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   172: pop
    //   173: ldc 'TtmlDecoder'
    //   175: aload_1
    //   176: invokevirtual toString : ()Ljava/lang/String;
    //   179: invokestatic f : (Ljava/lang/String;Ljava/lang/String;)V
    //   182: aconst_null
    //   183: areturn
    //   184: aload #9
    //   186: iconst_1
    //   187: invokevirtual group : (I)Ljava/lang/String;
    //   190: invokestatic parseInt : (Ljava/lang/String;)I
    //   193: istore #12
    //   195: aload #9
    //   197: iconst_2
    //   198: invokevirtual group : (I)Ljava/lang/String;
    //   201: invokestatic parseInt : (Ljava/lang/String;)I
    //   204: istore #13
    //   206: iload #12
    //   208: i2f
    //   209: aload_3
    //   210: getfield a : I
    //   213: i2f
    //   214: fdiv
    //   215: fstore #10
    //   217: iload #13
    //   219: i2f
    //   220: fstore #11
    //   222: aload_3
    //   223: getfield b : I
    //   226: istore #12
    //   228: fload #11
    //   230: iload #12
    //   232: i2f
    //   233: fdiv
    //   234: fstore #11
    //   236: aload_1
    //   237: ldc_w 'extent'
    //   240: invokestatic a : (Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;
    //   243: astore #7
    //   245: aload #7
    //   247: ifnull -> 620
    //   250: aload #6
    //   252: aload #7
    //   254: invokevirtual matcher : (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   257: astore #6
    //   259: aload #8
    //   261: aload #7
    //   263: invokevirtual matcher : (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   266: astore #8
    //   268: aload #6
    //   270: invokevirtual matches : ()Z
    //   273: ifeq -> 348
    //   276: aload #6
    //   278: iconst_1
    //   279: invokevirtual group : (I)Ljava/lang/String;
    //   282: invokestatic parseFloat : (Ljava/lang/String;)F
    //   285: ldc_w 100.0
    //   288: fdiv
    //   289: fstore #14
    //   291: aload #6
    //   293: iconst_2
    //   294: invokevirtual group : (I)Ljava/lang/String;
    //   297: invokestatic parseFloat : (Ljava/lang/String;)F
    //   300: fstore #15
    //   302: fload #15
    //   304: ldc_w 100.0
    //   307: fdiv
    //   308: fstore #15
    //   310: goto -> 446
    //   313: astore_1
    //   314: new java/lang/StringBuilder
    //   317: dup
    //   318: invokespecial <init> : ()V
    //   321: astore_1
    //   322: aload_1
    //   323: ldc_w 'Ignoring region with malformed extent: '
    //   326: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   329: pop
    //   330: aload_1
    //   331: aload #5
    //   333: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   336: pop
    //   337: ldc 'TtmlDecoder'
    //   339: aload_1
    //   340: invokevirtual toString : ()Ljava/lang/String;
    //   343: invokestatic f : (Ljava/lang/String;Ljava/lang/String;)V
    //   346: aconst_null
    //   347: areturn
    //   348: aload #8
    //   350: invokevirtual matches : ()Z
    //   353: ifeq -> 586
    //   356: aload_3
    //   357: ifnonnull -> 394
    //   360: new java/lang/StringBuilder
    //   363: dup
    //   364: invokespecial <init> : ()V
    //   367: astore_1
    //   368: aload_1
    //   369: ldc_w 'Ignoring region with missing tts:extent: '
    //   372: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   375: pop
    //   376: aload_1
    //   377: aload #5
    //   379: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   382: pop
    //   383: ldc 'TtmlDecoder'
    //   385: aload_1
    //   386: invokevirtual toString : ()Ljava/lang/String;
    //   389: invokestatic f : (Ljava/lang/String;Ljava/lang/String;)V
    //   392: aconst_null
    //   393: areturn
    //   394: aload #8
    //   396: iconst_1
    //   397: invokevirtual group : (I)Ljava/lang/String;
    //   400: invokestatic parseInt : (Ljava/lang/String;)I
    //   403: istore #13
    //   405: aload #8
    //   407: iconst_2
    //   408: invokevirtual group : (I)Ljava/lang/String;
    //   411: invokestatic parseInt : (Ljava/lang/String;)I
    //   414: istore #12
    //   416: iload #13
    //   418: i2f
    //   419: aload_3
    //   420: getfield a : I
    //   423: i2f
    //   424: fdiv
    //   425: fstore #14
    //   427: iload #12
    //   429: i2f
    //   430: fstore #15
    //   432: aload_3
    //   433: getfield b : I
    //   436: istore #12
    //   438: fload #15
    //   440: iload #12
    //   442: i2f
    //   443: fdiv
    //   444: fstore #15
    //   446: aload_1
    //   447: ldc_w 'displayAlign'
    //   450: invokestatic a : (Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;
    //   453: astore_1
    //   454: aload_1
    //   455: ifnull -> 519
    //   458: aload_1
    //   459: invokestatic u0 : (Ljava/lang/String;)Ljava/lang/String;
    //   462: astore_1
    //   463: aload_1
    //   464: invokevirtual hashCode : ()I
    //   467: pop
    //   468: aload_1
    //   469: ldc_w 'center'
    //   472: invokevirtual equals : (Ljava/lang/Object;)Z
    //   475: ifne -> 504
    //   478: aload_1
    //   479: ldc_w 'after'
    //   482: invokevirtual equals : (Ljava/lang/Object;)Z
    //   485: ifne -> 491
    //   488: goto -> 519
    //   491: fload #11
    //   493: fload #15
    //   495: fadd
    //   496: fstore #11
    //   498: iconst_2
    //   499: istore #12
    //   501: goto -> 522
    //   504: fload #11
    //   506: fload #15
    //   508: fconst_2
    //   509: fdiv
    //   510: fadd
    //   511: fstore #11
    //   513: iconst_1
    //   514: istore #12
    //   516: goto -> 522
    //   519: iconst_0
    //   520: istore #12
    //   522: new com/google/android/exoplayer2/text/q/c
    //   525: dup
    //   526: aload #4
    //   528: fload #10
    //   530: fload #11
    //   532: iconst_0
    //   533: iload #12
    //   535: fload #14
    //   537: fload #15
    //   539: iconst_1
    //   540: fconst_1
    //   541: aload_2
    //   542: getfield b : I
    //   545: i2f
    //   546: fdiv
    //   547: invokespecial <init> : (Ljava/lang/String;FFIIFFIF)V
    //   550: areturn
    //   551: astore_1
    //   552: new java/lang/StringBuilder
    //   555: dup
    //   556: invokespecial <init> : ()V
    //   559: astore_1
    //   560: aload_1
    //   561: ldc_w 'Ignoring region with malformed extent: '
    //   564: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   567: pop
    //   568: aload_1
    //   569: aload #5
    //   571: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   574: pop
    //   575: ldc 'TtmlDecoder'
    //   577: aload_1
    //   578: invokevirtual toString : ()Ljava/lang/String;
    //   581: invokestatic f : (Ljava/lang/String;Ljava/lang/String;)V
    //   584: aconst_null
    //   585: areturn
    //   586: new java/lang/StringBuilder
    //   589: dup
    //   590: invokespecial <init> : ()V
    //   593: astore_1
    //   594: aload_1
    //   595: ldc_w 'Ignoring region with unsupported extent: '
    //   598: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   601: pop
    //   602: aload_1
    //   603: aload #5
    //   605: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   608: pop
    //   609: ldc 'TtmlDecoder'
    //   611: aload_1
    //   612: invokevirtual toString : ()Ljava/lang/String;
    //   615: invokestatic f : (Ljava/lang/String;Ljava/lang/String;)V
    //   618: aconst_null
    //   619: areturn
    //   620: ldc 'TtmlDecoder'
    //   622: ldc_w 'Ignoring region without an extent'
    //   625: invokestatic f : (Ljava/lang/String;Ljava/lang/String;)V
    //   628: aconst_null
    //   629: areturn
    //   630: astore_1
    //   631: new java/lang/StringBuilder
    //   634: dup
    //   635: invokespecial <init> : ()V
    //   638: astore_1
    //   639: aload_1
    //   640: ldc_w 'Ignoring region with malformed origin: '
    //   643: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   646: pop
    //   647: aload_1
    //   648: aload #5
    //   650: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   653: pop
    //   654: ldc 'TtmlDecoder'
    //   656: aload_1
    //   657: invokevirtual toString : ()Ljava/lang/String;
    //   660: invokestatic f : (Ljava/lang/String;Ljava/lang/String;)V
    //   663: aconst_null
    //   664: areturn
    //   665: new java/lang/StringBuilder
    //   668: dup
    //   669: invokespecial <init> : ()V
    //   672: astore_1
    //   673: aload_1
    //   674: ldc_w 'Ignoring region with unsupported origin: '
    //   677: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   680: pop
    //   681: aload_1
    //   682: aload #5
    //   684: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   687: pop
    //   688: ldc 'TtmlDecoder'
    //   690: aload_1
    //   691: invokevirtual toString : ()Ljava/lang/String;
    //   694: invokestatic f : (Ljava/lang/String;Ljava/lang/String;)V
    //   697: aconst_null
    //   698: areturn
    //   699: ldc 'TtmlDecoder'
    //   701: ldc_w 'Ignoring region without an origin'
    //   704: invokestatic f : (Ljava/lang/String;Ljava/lang/String;)V
    //   707: aconst_null
    //   708: areturn
    // Exception table:
    //   from	to	target	type
    //   66	92	103	java/lang/NumberFormatException
    //   184	217	630	java/lang/NumberFormatException
    //   222	228	630	java/lang/NumberFormatException
    //   276	302	313	java/lang/NumberFormatException
    //   394	427	551	java/lang/NumberFormatException
    //   432	438	551	java/lang/NumberFormatException
  }
  
  private e L(XmlPullParser paramXmlPullParser, e parame) {
    StringBuilder stringBuilder;
    int i = paramXmlPullParser.getAttributeCount();
    byte b1 = 0;
    for (e e1 = parame; b1 < i; e1 = parame) {
      e e6;
      StringBuilder stringBuilder4;
      e e5;
      StringBuilder stringBuilder3;
      e e4;
      String str2;
      StringBuilder stringBuilder2;
      e e3;
      String str1;
      StringBuilder stringBuilder1;
      e e2;
      String str4 = paramXmlPullParser.getAttributeValue(b1);
      String str3 = paramXmlPullParser.getAttributeName(b1);
      str3.hashCode();
      int j = str3.hashCode();
      byte b2 = 4;
      byte b3 = 3;
      switch (j) {
        default:
          j = -1;
          break;
        case 1287124693:
          if (str3.equals("backgroundColor")) {
            j = 8;
            break;
          } 
        case 365601008:
          if (str3.equals("fontSize")) {
            j = 7;
            break;
          } 
        case 94842723:
          if (str3.equals("color")) {
            j = 6;
            break;
          } 
        case 3355:
          if (str3.equals("id")) {
            j = 5;
            break;
          } 
        case -734428249:
          if (str3.equals("fontWeight")) {
            j = 4;
            break;
          } 
        case -879295043:
          if (str3.equals("textDecoration")) {
            j = 3;
            break;
          } 
        case -1065511464:
          if (str3.equals("textAlign")) {
            j = 2;
            break;
          } 
        case -1224696685:
          if (str3.equals("fontFamily")) {
            j = 1;
            break;
          } 
        case -1550943582:
          if (str3.equals("fontStyle")) {
            j = 0;
            break;
          } 
      } 
      switch (j) {
        default:
          e6 = e1;
          break;
        case 8:
          e6 = C(e1);
          try {
            e6.o(h.d(str4));
          } catch (IllegalArgumentException illegalArgumentException) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Failed parsing background value: ");
            stringBuilder.append(str4);
            o.f("TtmlDecoder", stringBuilder.toString());
          } 
          break;
        case 7:
          stringBuilder4 = stringBuilder;
          try {
            e e8 = C((e)stringBuilder);
            e e7 = e8;
            F(str4, e8);
            e7 = e8;
          } catch (SubtitleDecoderException subtitleDecoderException) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Failed parsing fontSize value: ");
            stringBuilder.append(str4);
            o.f("TtmlDecoder", stringBuilder.toString());
          } 
          break;
        case 6:
          e5 = C((e)stringBuilder);
          try {
            e5.q(h.d(str4));
          } catch (IllegalArgumentException illegalArgumentException) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Failed parsing color value: ");
            stringBuilder.append(str4);
            o.f("TtmlDecoder", stringBuilder.toString());
          } 
          break;
        case 5:
          stringBuilder3 = stringBuilder;
          if ("style".equals(paramXmlPullParser.getName()))
            e e7 = C((e)stringBuilder).u(str4); 
          break;
        case 4:
          e4 = C((e)stringBuilder).p("bold".equalsIgnoreCase(str4));
          break;
        case 3:
          str2 = h0.u0(str4);
          str2.hashCode();
          switch (str2.hashCode()) {
            default:
              j = -1;
              break;
            case 1679736913:
              j = b3;
            case 913457136:
              if (str2.equals("nolinethrough")) {
                j = 2;
                break;
              } 
            case -1026963764:
              if (str2.equals("underline")) {
                j = 1;
                break;
              } 
            case -1461280213:
              if (str2.equals("nounderline")) {
                j = 0;
                break;
              } 
          } 
          switch (j) {
            default:
              stringBuilder2 = stringBuilder;
              break;
            case 3:
              e3 = C((e)stringBuilder).w(true);
              break;
            case 2:
              e3 = C((e)stringBuilder).w(false);
              break;
            case 1:
              e3 = C((e)stringBuilder).y(true);
              break;
            case 0:
              break;
          } 
          e3 = C((e)stringBuilder).y(false);
          break;
        case 2:
          str1 = h0.u0(str4);
          str1.hashCode();
          switch (str1.hashCode()) {
            default:
              j = -1;
              break;
            case 109757538:
              j = b2;
            case 108511772:
              if (str1.equals("right")) {
                j = 3;
                break;
              } 
            case 3317767:
              if (str1.equals("left")) {
                j = 2;
                break;
              } 
            case 100571:
              if (str1.equals("end")) {
                j = 1;
                break;
              } 
            case -1364013995:
              if (str1.equals("center")) {
                j = 0;
                break;
              } 
          } 
          switch (j) {
            default:
              stringBuilder1 = stringBuilder;
              break;
            case 4:
              e2 = C((e)stringBuilder).x(Layout.Alignment.ALIGN_NORMAL);
              break;
            case 3:
              e2 = C((e)stringBuilder).x(Layout.Alignment.ALIGN_OPPOSITE);
              break;
            case 2:
              e2 = C((e)stringBuilder).x(Layout.Alignment.ALIGN_NORMAL);
              break;
            case 1:
              e2 = C((e)stringBuilder).x(Layout.Alignment.ALIGN_OPPOSITE);
              break;
            case 0:
              break;
          } 
          e2 = C((e)stringBuilder).x(Layout.Alignment.ALIGN_CENTER);
          break;
        case 1:
          e2 = C((e)stringBuilder).r(str4);
          break;
        case 0:
          e2 = C((e)stringBuilder).v("italic".equalsIgnoreCase(str4));
          break;
      } 
      continue;
      b1++;
    } 
    return (e)stringBuilder;
  }
  
  private String[] M(String paramString) {
    String[] arrayOfString;
    paramString = paramString.trim();
    if (paramString.isEmpty()) {
      arrayOfString = new String[0];
    } else {
      arrayOfString = h0.n0((String)arrayOfString, "\\s+");
    } 
    return arrayOfString;
  }
  
  private static long N(String paramString, b paramb) {
    // Byte code:
    //   0: getstatic com/google/android/exoplayer2/text/q/a.o : Ljava/util/regex/Pattern;
    //   3: aload_0
    //   4: invokevirtual matcher : (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   7: astore_2
    //   8: aload_2
    //   9: invokevirtual matches : ()Z
    //   12: istore_3
    //   13: iconst_4
    //   14: istore #4
    //   16: iload_3
    //   17: ifeq -> 220
    //   20: aload_2
    //   21: iconst_1
    //   22: invokevirtual group : (I)Ljava/lang/String;
    //   25: invokestatic parseLong : (Ljava/lang/String;)J
    //   28: ldc2_w 3600
    //   31: lmul
    //   32: l2d
    //   33: dstore #5
    //   35: aload_2
    //   36: iconst_2
    //   37: invokevirtual group : (I)Ljava/lang/String;
    //   40: invokestatic parseLong : (Ljava/lang/String;)J
    //   43: ldc2_w 60
    //   46: lmul
    //   47: l2d
    //   48: dstore #7
    //   50: dload #5
    //   52: invokestatic isNaN : (D)Z
    //   55: pop
    //   56: dload #7
    //   58: invokestatic isNaN : (D)Z
    //   61: pop
    //   62: aload_2
    //   63: iconst_3
    //   64: invokevirtual group : (I)Ljava/lang/String;
    //   67: invokestatic parseLong : (Ljava/lang/String;)J
    //   70: l2d
    //   71: dstore #9
    //   73: dload #9
    //   75: invokestatic isNaN : (D)Z
    //   78: pop
    //   79: aload_2
    //   80: iconst_4
    //   81: invokevirtual group : (I)Ljava/lang/String;
    //   84: astore_0
    //   85: dconst_0
    //   86: dstore #11
    //   88: aload_0
    //   89: ifnull -> 101
    //   92: aload_0
    //   93: invokestatic parseDouble : (Ljava/lang/String;)D
    //   96: dstore #13
    //   98: goto -> 104
    //   101: dconst_0
    //   102: dstore #13
    //   104: aload_2
    //   105: iconst_5
    //   106: invokevirtual group : (I)Ljava/lang/String;
    //   109: astore_0
    //   110: aload_0
    //   111: ifnull -> 130
    //   114: aload_0
    //   115: invokestatic parseLong : (Ljava/lang/String;)J
    //   118: l2f
    //   119: aload_1
    //   120: getfield a : F
    //   123: fdiv
    //   124: f2d
    //   125: dstore #15
    //   127: goto -> 133
    //   130: dconst_0
    //   131: dstore #15
    //   133: aload_2
    //   134: bipush #6
    //   136: invokevirtual group : (I)Ljava/lang/String;
    //   139: astore_0
    //   140: aload_0
    //   141: ifnull -> 197
    //   144: aload_0
    //   145: invokestatic parseLong : (Ljava/lang/String;)J
    //   148: l2d
    //   149: dstore #17
    //   151: aload_1
    //   152: getfield b : I
    //   155: i2d
    //   156: dstore #11
    //   158: dload #17
    //   160: invokestatic isNaN : (D)Z
    //   163: pop
    //   164: dload #11
    //   166: invokestatic isNaN : (D)Z
    //   169: pop
    //   170: dload #17
    //   172: dload #11
    //   174: ddiv
    //   175: dstore #17
    //   177: aload_1
    //   178: getfield a : F
    //   181: f2d
    //   182: dstore #11
    //   184: dload #11
    //   186: invokestatic isNaN : (D)Z
    //   189: pop
    //   190: dload #17
    //   192: dload #11
    //   194: ddiv
    //   195: dstore #11
    //   197: dload #5
    //   199: dload #7
    //   201: dadd
    //   202: dload #9
    //   204: dadd
    //   205: dload #13
    //   207: dadd
    //   208: dload #15
    //   210: dadd
    //   211: dload #11
    //   213: dadd
    //   214: ldc2_w 1000000.0
    //   217: dmul
    //   218: d2l
    //   219: lreturn
    //   220: getstatic com/google/android/exoplayer2/text/q/a.p : Ljava/util/regex/Pattern;
    //   223: aload_0
    //   224: invokevirtual matcher : (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   227: astore_2
    //   228: aload_2
    //   229: invokevirtual matches : ()Z
    //   232: ifeq -> 525
    //   235: aload_2
    //   236: iconst_1
    //   237: invokevirtual group : (I)Ljava/lang/String;
    //   240: invokestatic parseDouble : (Ljava/lang/String;)D
    //   243: dstore #15
    //   245: aload_2
    //   246: iconst_2
    //   247: invokevirtual group : (I)Ljava/lang/String;
    //   250: astore_0
    //   251: aload_0
    //   252: invokevirtual hashCode : ()I
    //   255: pop
    //   256: aload_0
    //   257: invokevirtual hashCode : ()I
    //   260: lookupswitch default -> 312, 102 -> 388, 104 -> 369, 109 -> 350, 116 -> 331, 3494 -> 318
    //   312: iconst_m1
    //   313: istore #4
    //   315: goto -> 404
    //   318: aload_0
    //   319: ldc_w 'ms'
    //   322: invokevirtual equals : (Ljava/lang/Object;)Z
    //   325: ifne -> 404
    //   328: goto -> 312
    //   331: aload_0
    //   332: ldc_w 't'
    //   335: invokevirtual equals : (Ljava/lang/Object;)Z
    //   338: ifne -> 344
    //   341: goto -> 312
    //   344: iconst_3
    //   345: istore #4
    //   347: goto -> 404
    //   350: aload_0
    //   351: ldc_w 'm'
    //   354: invokevirtual equals : (Ljava/lang/Object;)Z
    //   357: ifne -> 363
    //   360: goto -> 312
    //   363: iconst_2
    //   364: istore #4
    //   366: goto -> 404
    //   369: aload_0
    //   370: ldc_w 'h'
    //   373: invokevirtual equals : (Ljava/lang/Object;)Z
    //   376: ifne -> 382
    //   379: goto -> 312
    //   382: iconst_1
    //   383: istore #4
    //   385: goto -> 404
    //   388: aload_0
    //   389: ldc_w 'f'
    //   392: invokevirtual equals : (Ljava/lang/Object;)Z
    //   395: ifne -> 401
    //   398: goto -> 312
    //   401: iconst_0
    //   402: istore #4
    //   404: iload #4
    //   406: tableswitch default -> 440, 0 -> 501, 1 -> 486, 2 -> 478, 3 -> 462, 4 -> 447
    //   440: dload #15
    //   442: dstore #13
    //   444: goto -> 517
    //   447: ldc2_w 1000.0
    //   450: dstore #13
    //   452: dload #15
    //   454: dload #13
    //   456: ddiv
    //   457: dstore #13
    //   459: goto -> 517
    //   462: aload_1
    //   463: getfield c : I
    //   466: i2d
    //   467: dstore #13
    //   469: dload #13
    //   471: invokestatic isNaN : (D)Z
    //   474: pop
    //   475: goto -> 452
    //   478: ldc2_w 60.0
    //   481: dstore #13
    //   483: goto -> 491
    //   486: ldc2_w 3600.0
    //   489: dstore #13
    //   491: dload #15
    //   493: dload #13
    //   495: dmul
    //   496: dstore #13
    //   498: goto -> 517
    //   501: aload_1
    //   502: getfield a : F
    //   505: f2d
    //   506: dstore #13
    //   508: dload #13
    //   510: invokestatic isNaN : (D)Z
    //   513: pop
    //   514: goto -> 452
    //   517: dload #13
    //   519: ldc2_w 1000000.0
    //   522: dmul
    //   523: d2l
    //   524: lreturn
    //   525: new java/lang/StringBuilder
    //   528: dup
    //   529: invokespecial <init> : ()V
    //   532: astore_1
    //   533: aload_1
    //   534: ldc_w 'Malformed time expression: '
    //   537: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   540: pop
    //   541: aload_1
    //   542: aload_0
    //   543: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   546: pop
    //   547: new com/google/android/exoplayer2/text/SubtitleDecoderException
    //   550: dup
    //   551: aload_1
    //   552: invokevirtual toString : ()Ljava/lang/String;
    //   555: invokespecial <init> : (Ljava/lang/String;)V
    //   558: astore_0
    //   559: goto -> 564
    //   562: aload_0
    //   563: athrow
    //   564: goto -> 562
  }
  
  private c O(XmlPullParser paramXmlPullParser) {
    StringBuilder stringBuilder;
    String str = i0.a(paramXmlPullParser, "extent");
    if (str == null)
      return null; 
    Matcher matcher = s.matcher(str);
    if (!matcher.matches()) {
      stringBuilder = new StringBuilder();
      stringBuilder.append("Ignoring non-pixel tts extent: ");
      stringBuilder.append(str);
      o.f("TtmlDecoder", stringBuilder.toString());
      return null;
    } 
    try {
      return new c(Integer.parseInt(stringBuilder.group(1)), Integer.parseInt(stringBuilder.group(2)));
    } catch (NumberFormatException numberFormatException) {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("Ignoring malformed tts extent: ");
      stringBuilder1.append(str);
      o.f("TtmlDecoder", stringBuilder1.toString());
      return null;
    } 
  }
  
  protected e z(byte[] paramArrayOfbyte, int paramInt, boolean paramBoolean) {
    try {
      f f;
      XmlPullParser xmlPullParser = this.w.newPullParser();
      HashMap<Object, Object> hashMap1 = new HashMap<Object, Object>();
      this();
      HashMap<Object, Object> hashMap2 = new HashMap<Object, Object>();
      this();
      HashMap<Object, Object> hashMap3 = new HashMap<Object, Object>();
      this();
      c c1 = new c();
      c c2 = null;
      this(null);
      hashMap2.put("", c1);
      ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream();
      this(paramArrayOfbyte, 0, paramInt);
      xmlPullParser.setInput(byteArrayInputStream, null);
      ArrayDeque<b> arrayDeque = new ArrayDeque();
      this();
      int i = xmlPullParser.getEventType();
      b b1 = u;
      a a1 = v;
      paramArrayOfbyte = null;
      int j;
      for (j = 0;; j = paramInt) {
        c c3;
        b b2;
        a a2;
        if (i != 1) {
          b b3 = arrayDeque.peek();
          if (j == 0) {
            String str = xmlPullParser.getName();
            if (i == 2) {
              StringBuilder stringBuilder;
              if ("tt".equals(str)) {
                b1 = G(xmlPullParser);
                a1 = E(xmlPullParser, v);
                c2 = O(xmlPullParser);
              } 
              paramBoolean = D(str);
              if (!paramBoolean) {
                stringBuilder = new StringBuilder();
                this();
                stringBuilder.append("Ignoring unsupported tag: ");
                stringBuilder.append(xmlPullParser.getName());
                o.e("TtmlDecoder", stringBuilder.toString());
                paramInt = j + 1;
              } else {
                if ("head".equals(str)) {
                  H(xmlPullParser, (Map)hashMap1, a1, c2, (Map)hashMap2, (Map)hashMap3);
                  paramInt = j;
                } else {
                  c c4;
                  b b4;
                  a a3;
                  try {
                    b b5 = J(xmlPullParser, (b)stringBuilder, (Map)hashMap2, b1);
                    arrayDeque.push(b5);
                    paramInt = j;
                    if (stringBuilder != null) {
                      stringBuilder.a(b5);
                      paramInt = j;
                    } 
                    c4 = c2;
                    b4 = b1;
                    a3 = a1;
                  } catch (SubtitleDecoderException subtitleDecoderException) {
                    o.g("TtmlDecoder", "Suppressing parser error", (Throwable)subtitleDecoderException);
                    paramInt = j + 1;
                    c4 = c2;
                    b4 = b1;
                    a3 = a1;
                  } 
                  a1 = a3;
                  b1 = b4;
                  c2 = c4;
                } 
                c3 = c2;
                b2 = b1;
                a2 = a1;
              } 
              continue;
            } 
            if (i == 4) {
              c3.a(b.d(xmlPullParser.getText()));
              c3 = c2;
              b2 = b1;
              a2 = a1;
              paramInt = j;
            } else {
              c3 = c2;
              b2 = b1;
              a2 = a1;
              paramInt = j;
              if (i == 3) {
                if (xmlPullParser.getName().equals("tt")) {
                  f = new f();
                  this(arrayDeque.peek(), (Map)hashMap1, (Map)hashMap2, (Map)hashMap3);
                } 
                arrayDeque.pop();
                paramInt = j;
                continue;
              } 
            } 
          } else if (i == 2) {
            paramInt = j + 1;
            c3 = c2;
            b2 = b1;
            a2 = a1;
          } else {
            c3 = c2;
            b2 = b1;
            a2 = a1;
            paramInt = j;
            if (i == 3) {
              paramInt = j - 1;
              a2 = a1;
              b2 = b1;
              c3 = c2;
            } 
          } 
        } else {
          break;
        } 
        a1 = a2;
        b1 = b2;
        c2 = c3;
        xmlPullParser.next();
        i = xmlPullParser.getEventType();
      } 
      return f;
    } catch (XmlPullParserException xmlPullParserException) {
      SubtitleDecoderException subtitleDecoderException = new SubtitleDecoderException("Unable to decode source", (Throwable)xmlPullParserException);
      throw subtitleDecoderException;
    } catch (IOException iOException) {
      throw new IllegalStateException("Unexpected error when reading input.", iOException);
    } 
  }
  
  private static final class a {
    final int a;
    
    final int b;
    
    a(int param1Int1, int param1Int2) {
      this.a = param1Int1;
      this.b = param1Int2;
    }
  }
  
  private static final class b {
    final float a;
    
    final int b;
    
    final int c;
    
    b(float param1Float, int param1Int1, int param1Int2) {
      this.a = param1Float;
      this.b = param1Int1;
      this.c = param1Int2;
    }
  }
  
  private static final class c {
    final int a;
    
    final int b;
    
    c(int param1Int1, int param1Int2) {
      this.a = param1Int1;
      this.b = param1Int2;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/text/q/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */