package com.google.android.exoplayer2.text.o;

import android.graphics.PointF;
import android.text.TextUtils;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.h0;
import com.google.android.exoplayer2.util.o;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class c {
  public final String a;
  
  public final int b;
  
  private c(String paramString, int paramInt) {
    this.a = paramString;
    this.b = paramInt;
  }
  
  public static c b(String paramString, a parama) {
    e.a(paramString.startsWith("Style:"));
    String[] arrayOfString = TextUtils.split(paramString.substring(6), ",");
    int i = arrayOfString.length;
    int j = parama.c;
    if (i != j) {
      o.f("SsaStyle", h0.u("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", new Object[] { Integer.valueOf(j), Integer.valueOf(arrayOfString.length), paramString }));
      return null;
    } 
    try {
      return new c(arrayOfString[parama.a].trim(), d(arrayOfString[parama.b]));
    } catch (RuntimeException runtimeException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Skipping malformed 'Style:' line: '");
      stringBuilder.append(paramString);
      stringBuilder.append("'");
      o.g("SsaStyle", stringBuilder.toString(), runtimeException);
      return null;
    } 
  }
  
  private static boolean c(int paramInt) {
    switch (paramInt) {
      default:
        return false;
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
        break;
    } 
    return true;
  }
  
  private static int d(String paramString) {
    try {
      int i = Integer.parseInt(paramString.trim());
      boolean bool = c(i);
      if (bool)
        return i; 
    } catch (NumberFormatException numberFormatException) {}
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Ignoring unknown alignment: ");
    stringBuilder.append(paramString);
    o.f("SsaStyle", stringBuilder.toString());
    return -1;
  }
  
  static final class a {
    public final int a;
    
    public final int b;
    
    public final int c;
    
    private a(int param1Int1, int param1Int2, int param1Int3) {
      this.a = param1Int1;
      this.b = param1Int2;
      this.c = param1Int3;
    }
    
    public static a a(String param1String) {
      String[] arrayOfString = TextUtils.split(param1String.substring(7), ",");
      byte b = 0;
      byte b1 = -1;
      byte b2 = -1;
      while (b < arrayOfString.length) {
        param1String = h0.u0(arrayOfString[b].trim());
        param1String.hashCode();
        if (!param1String.equals("name")) {
          if (param1String.equals("alignment"))
            b2 = b; 
        } else {
          b1 = b;
        } 
        b++;
      } 
      if (b1 != -1) {
        a a1 = new a(b1, b2, arrayOfString.length);
      } else {
        param1String = null;
      } 
      return (a)param1String;
    }
  }
  
  static final class b {
    private static final Pattern a = Pattern.compile("\\{([^}]*)\\}");
    
    private static final Pattern b = Pattern.compile(h0.u("\\\\pos\\((%1$s),(%1$s)\\)", new Object[] { "\\s*\\d+(?:\\.\\d+)?\\s*" }));
    
    private static final Pattern c = Pattern.compile(h0.u("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", new Object[] { "\\s*\\d+(?:\\.\\d+)?\\s*" }));
    
    private static final Pattern d = Pattern.compile("\\\\an(\\d+)");
    
    public final int e;
    
    public final PointF f;
    
    private b(int param1Int, PointF param1PointF) {
      this.e = param1Int;
      this.f = param1PointF;
    }
    
    private static int a(String param1String) {
      byte b1;
      Matcher matcher = d.matcher(param1String);
      if (matcher.find()) {
        b1 = c.a(matcher.group(1));
      } else {
        b1 = -1;
      } 
      return b1;
    }
    
    public static b b(String param1String) {
      Matcher matcher = a.matcher(param1String);
      param1String = null;
      int i = -1;
      while (true) {
        String str;
        if (matcher.find()) {
          String str2;
          String str1 = matcher.group(1);
          try {
            PointF pointF = c(str1);
            str2 = param1String;
            if (pointF != null)
              PointF pointF1 = pointF; 
          } catch (RuntimeException runtimeException) {
            str2 = param1String;
          } 
          try {
            int j = a(str1);
            param1String = str2;
            if (j != -1) {
              i = j;
              param1String = str2;
            } 
          } catch (RuntimeException runtimeException) {
            str = str2;
          } 
          continue;
        } 
        return new b(i, (PointF)str);
      } 
    }
    
    private static PointF c(String param1String) {
      String str;
      StringBuilder stringBuilder;
      Matcher matcher1 = b.matcher(param1String);
      Matcher matcher2 = c.matcher(param1String);
      boolean bool1 = matcher1.find();
      boolean bool2 = matcher2.find();
      if (bool1) {
        if (bool2) {
          stringBuilder = new StringBuilder();
          stringBuilder.append("Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='");
          stringBuilder.append(param1String);
          stringBuilder.append("'");
          o.e("SsaStyle.Overrides", stringBuilder.toString());
        } 
        param1String = matcher1.group(1);
        str = matcher1.group(2);
      } else {
        if (bool2) {
          param1String = stringBuilder.group(1);
          str = stringBuilder.group(2);
          return new PointF(Float.parseFloat(((String)e.e(param1String)).trim()), Float.parseFloat(((String)e.e(str)).trim()));
        } 
        return null;
      } 
      return new PointF(Float.parseFloat(((String)e.e(param1String)).trim()), Float.parseFloat(((String)e.e(str)).trim()));
    }
    
    public static String d(String param1String) {
      return a.matcher(param1String).replaceAll("");
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/text/o/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */