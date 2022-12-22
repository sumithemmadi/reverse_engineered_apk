package com.google.android.exoplayer2.util;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class h {
  private static final Pattern a = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
  
  private static final Pattern b = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
  
  private static final Pattern c = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");
  
  private static final Map<String, Integer> d;
  
  static {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    d = (Map)hashMap;
    hashMap.put("aliceblue", Integer.valueOf(-984833));
    hashMap.put("antiquewhite", Integer.valueOf(-332841));
    Integer integer1 = Integer.valueOf(-16711681);
    hashMap.put("aqua", integer1);
    hashMap.put("aquamarine", Integer.valueOf(-8388652));
    hashMap.put("azure", Integer.valueOf(-983041));
    hashMap.put("beige", Integer.valueOf(-657956));
    hashMap.put("bisque", Integer.valueOf(-6972));
    hashMap.put("black", Integer.valueOf(-16777216));
    hashMap.put("blanchedalmond", Integer.valueOf(-5171));
    hashMap.put("blue", Integer.valueOf(-16776961));
    hashMap.put("blueviolet", Integer.valueOf(-7722014));
    hashMap.put("brown", Integer.valueOf(-5952982));
    hashMap.put("burlywood", Integer.valueOf(-2180985));
    hashMap.put("cadetblue", Integer.valueOf(-10510688));
    hashMap.put("chartreuse", Integer.valueOf(-8388864));
    hashMap.put("chocolate", Integer.valueOf(-2987746));
    hashMap.put("coral", Integer.valueOf(-32944));
    hashMap.put("cornflowerblue", Integer.valueOf(-10185235));
    hashMap.put("cornsilk", Integer.valueOf(-1828));
    hashMap.put("crimson", Integer.valueOf(-2354116));
    hashMap.put("cyan", integer1);
    hashMap.put("darkblue", Integer.valueOf(-16777077));
    hashMap.put("darkcyan", Integer.valueOf(-16741493));
    hashMap.put("darkgoldenrod", Integer.valueOf(-4684277));
    integer1 = Integer.valueOf(-5658199);
    hashMap.put("darkgray", integer1);
    hashMap.put("darkgreen", Integer.valueOf(-16751616));
    hashMap.put("darkgrey", integer1);
    hashMap.put("darkkhaki", Integer.valueOf(-4343957));
    hashMap.put("darkmagenta", Integer.valueOf(-7667573));
    hashMap.put("darkolivegreen", Integer.valueOf(-11179217));
    hashMap.put("darkorange", Integer.valueOf(-29696));
    hashMap.put("darkorchid", Integer.valueOf(-6737204));
    hashMap.put("darkred", Integer.valueOf(-7667712));
    hashMap.put("darksalmon", Integer.valueOf(-1468806));
    hashMap.put("darkseagreen", Integer.valueOf(-7357297));
    hashMap.put("darkslateblue", Integer.valueOf(-12042869));
    integer1 = Integer.valueOf(-13676721);
    hashMap.put("darkslategray", integer1);
    hashMap.put("darkslategrey", integer1);
    hashMap.put("darkturquoise", Integer.valueOf(-16724271));
    hashMap.put("darkviolet", Integer.valueOf(-7077677));
    hashMap.put("deeppink", Integer.valueOf(-60269));
    hashMap.put("deepskyblue", Integer.valueOf(-16728065));
    integer1 = Integer.valueOf(-9868951);
    hashMap.put("dimgray", integer1);
    hashMap.put("dimgrey", integer1);
    hashMap.put("dodgerblue", Integer.valueOf(-14774017));
    hashMap.put("firebrick", Integer.valueOf(-5103070));
    hashMap.put("floralwhite", Integer.valueOf(-1296));
    hashMap.put("forestgreen", Integer.valueOf(-14513374));
    integer1 = Integer.valueOf(-65281);
    hashMap.put("fuchsia", integer1);
    hashMap.put("gainsboro", Integer.valueOf(-2302756));
    hashMap.put("ghostwhite", Integer.valueOf(-460545));
    hashMap.put("gold", Integer.valueOf(-10496));
    hashMap.put("goldenrod", Integer.valueOf(-2448096));
    Integer integer2 = Integer.valueOf(-8355712);
    hashMap.put("gray", integer2);
    hashMap.put("green", Integer.valueOf(-16744448));
    hashMap.put("greenyellow", Integer.valueOf(-5374161));
    hashMap.put("grey", integer2);
    hashMap.put("honeydew", Integer.valueOf(-983056));
    hashMap.put("hotpink", Integer.valueOf(-38476));
    hashMap.put("indianred", Integer.valueOf(-3318692));
    hashMap.put("indigo", Integer.valueOf(-11861886));
    hashMap.put("ivory", Integer.valueOf(-16));
    hashMap.put("khaki", Integer.valueOf(-989556));
    hashMap.put("lavender", Integer.valueOf(-1644806));
    hashMap.put("lavenderblush", Integer.valueOf(-3851));
    hashMap.put("lawngreen", Integer.valueOf(-8586240));
    hashMap.put("lemonchiffon", Integer.valueOf(-1331));
    hashMap.put("lightblue", Integer.valueOf(-5383962));
    hashMap.put("lightcoral", Integer.valueOf(-1015680));
    hashMap.put("lightcyan", Integer.valueOf(-2031617));
    hashMap.put("lightgoldenrodyellow", Integer.valueOf(-329006));
    integer2 = Integer.valueOf(-2894893);
    hashMap.put("lightgray", integer2);
    hashMap.put("lightgreen", Integer.valueOf(-7278960));
    hashMap.put("lightgrey", integer2);
    hashMap.put("lightpink", Integer.valueOf(-18751));
    hashMap.put("lightsalmon", Integer.valueOf(-24454));
    hashMap.put("lightseagreen", Integer.valueOf(-14634326));
    hashMap.put("lightskyblue", Integer.valueOf(-7876870));
    integer2 = Integer.valueOf(-8943463);
    hashMap.put("lightslategray", integer2);
    hashMap.put("lightslategrey", integer2);
    hashMap.put("lightsteelblue", Integer.valueOf(-5192482));
    hashMap.put("lightyellow", Integer.valueOf(-32));
    hashMap.put("lime", Integer.valueOf(-16711936));
    hashMap.put("limegreen", Integer.valueOf(-13447886));
    hashMap.put("linen", Integer.valueOf(-331546));
    hashMap.put("magenta", integer1);
    hashMap.put("maroon", Integer.valueOf(-8388608));
    hashMap.put("mediumaquamarine", Integer.valueOf(-10039894));
    hashMap.put("mediumblue", Integer.valueOf(-16777011));
    hashMap.put("mediumorchid", Integer.valueOf(-4565549));
    hashMap.put("mediumpurple", Integer.valueOf(-7114533));
    hashMap.put("mediumseagreen", Integer.valueOf(-12799119));
    hashMap.put("mediumslateblue", Integer.valueOf(-8689426));
    hashMap.put("mediumspringgreen", Integer.valueOf(-16713062));
    hashMap.put("mediumturquoise", Integer.valueOf(-12004916));
    hashMap.put("mediumvioletred", Integer.valueOf(-3730043));
    hashMap.put("midnightblue", Integer.valueOf(-15132304));
    hashMap.put("mintcream", Integer.valueOf(-655366));
    hashMap.put("mistyrose", Integer.valueOf(-6943));
    hashMap.put("moccasin", Integer.valueOf(-6987));
    hashMap.put("navajowhite", Integer.valueOf(-8531));
    hashMap.put("navy", Integer.valueOf(-16777088));
    hashMap.put("oldlace", Integer.valueOf(-133658));
    hashMap.put("olive", Integer.valueOf(-8355840));
    hashMap.put("olivedrab", Integer.valueOf(-9728477));
    hashMap.put("orange", Integer.valueOf(-23296));
    hashMap.put("orangered", Integer.valueOf(-47872));
    hashMap.put("orchid", Integer.valueOf(-2461482));
    hashMap.put("palegoldenrod", Integer.valueOf(-1120086));
    hashMap.put("palegreen", Integer.valueOf(-6751336));
    hashMap.put("paleturquoise", Integer.valueOf(-5247250));
    hashMap.put("palevioletred", Integer.valueOf(-2396013));
    hashMap.put("papayawhip", Integer.valueOf(-4139));
    hashMap.put("peachpuff", Integer.valueOf(-9543));
    hashMap.put("peru", Integer.valueOf(-3308225));
    hashMap.put("pink", Integer.valueOf(-16181));
    hashMap.put("plum", Integer.valueOf(-2252579));
    hashMap.put("powderblue", Integer.valueOf(-5185306));
    hashMap.put("purple", Integer.valueOf(-8388480));
    hashMap.put("rebeccapurple", Integer.valueOf(-10079335));
    hashMap.put("red", Integer.valueOf(-65536));
    hashMap.put("rosybrown", Integer.valueOf(-4419697));
    hashMap.put("royalblue", Integer.valueOf(-12490271));
    hashMap.put("saddlebrown", Integer.valueOf(-7650029));
    hashMap.put("salmon", Integer.valueOf(-360334));
    hashMap.put("sandybrown", Integer.valueOf(-744352));
    hashMap.put("seagreen", Integer.valueOf(-13726889));
    hashMap.put("seashell", Integer.valueOf(-2578));
    hashMap.put("sienna", Integer.valueOf(-6270419));
    hashMap.put("silver", Integer.valueOf(-4144960));
    hashMap.put("skyblue", Integer.valueOf(-7876885));
    hashMap.put("slateblue", Integer.valueOf(-9807155));
    integer1 = Integer.valueOf(-9404272);
    hashMap.put("slategray", integer1);
    hashMap.put("slategrey", integer1);
    hashMap.put("snow", Integer.valueOf(-1286));
    hashMap.put("springgreen", Integer.valueOf(-16711809));
    hashMap.put("steelblue", Integer.valueOf(-12156236));
    hashMap.put("tan", Integer.valueOf(-2968436));
    hashMap.put("teal", Integer.valueOf(-16744320));
    hashMap.put("thistle", Integer.valueOf(-2572328));
    hashMap.put("tomato", Integer.valueOf(-40121));
    hashMap.put("transparent", Integer.valueOf(0));
    hashMap.put("turquoise", Integer.valueOf(-12525360));
    hashMap.put("violet", Integer.valueOf(-1146130));
    hashMap.put("wheat", Integer.valueOf(-663885));
    hashMap.put("white", Integer.valueOf(-1));
    hashMap.put("whitesmoke", Integer.valueOf(-657931));
    hashMap.put("yellow", Integer.valueOf(-256));
    hashMap.put("yellowgreen", Integer.valueOf(-6632142));
  }
  
  private static int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return paramInt1 << 24 | paramInt2 << 16 | paramInt3 << 8 | paramInt4;
  }
  
  private static int b(String paramString, boolean paramBoolean) {
    e.a(TextUtils.isEmpty(paramString) ^ true);
    String str = paramString.replace(" ", "");
    if (str.charAt(0) == '#') {
      int i = (int)Long.parseLong(str.substring(1), 16);
      if (str.length() == 7) {
        i = 0xFF000000 | i;
      } else {
        if (str.length() == 9)
          return (i & 0xFF) << 24 | i >>> 8; 
        throw new IllegalArgumentException();
      } 
      return i;
    } 
    if (str.startsWith("rgba")) {
      Pattern pattern;
      if (paramBoolean) {
        pattern = c;
      } else {
        pattern = b;
      } 
      Matcher matcher = pattern.matcher(str);
      if (matcher.matches()) {
        int i;
        if (paramBoolean) {
          i = (int)(Float.parseFloat(matcher.group(4)) * 255.0F);
        } else {
          i = Integer.parseInt(matcher.group(4), 10);
        } 
        return a(i, Integer.parseInt(matcher.group(1), 10), Integer.parseInt(matcher.group(2), 10), Integer.parseInt(matcher.group(3), 10));
      } 
    } else if (str.startsWith("rgb")) {
      Matcher matcher = a.matcher(str);
      if (matcher.matches())
        return e(Integer.parseInt(matcher.group(1), 10), Integer.parseInt(matcher.group(2), 10), Integer.parseInt(matcher.group(3), 10)); 
    } else {
      Integer integer = d.get(h0.u0(str));
      if (integer != null)
        return integer.intValue(); 
    } 
    throw new IllegalArgumentException();
  }
  
  public static int c(String paramString) {
    return b(paramString, true);
  }
  
  public static int d(String paramString) {
    return b(paramString, false);
  }
  
  private static int e(int paramInt1, int paramInt2, int paramInt3) {
    return a(255, paramInt1, paramInt2, paramInt3);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/util/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */