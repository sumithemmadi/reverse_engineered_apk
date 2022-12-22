package com.google.android.exoplayer2.text.s;

import android.text.TextUtils;
import com.google.android.exoplayer2.util.h;
import com.google.android.exoplayer2.util.h0;
import com.google.android.exoplayer2.util.v;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class a {
  private static final Pattern a = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
  
  private final v b = new v();
  
  private final StringBuilder c = new StringBuilder();
  
  private void a(d paramd, String paramString) {
    if ("".equals(paramString))
      return; 
    int i = paramString.indexOf('[');
    String str = paramString;
    if (i != -1) {
      Matcher matcher = a.matcher(paramString.substring(i));
      if (matcher.matches())
        paramd.v(matcher.group(1)); 
      str = paramString.substring(0, i);
    } 
    String[] arrayOfString = h0.n0(str, "\\.");
    str = arrayOfString[0];
    i = str.indexOf('#');
    if (i != -1) {
      paramd.u(str.substring(0, i));
      paramd.t(str.substring(i + 1));
    } else {
      paramd.u(str);
    } 
    if (arrayOfString.length > 1)
      paramd.s((String[])h0.g0((Object[])arrayOfString, 1, arrayOfString.length)); 
  }
  
  private static boolean b(v paramv) {
    int i = paramv.c();
    int j = paramv.d();
    byte[] arrayOfByte = paramv.a;
    if (i + 2 <= j) {
      int k = i + 1;
      if (arrayOfByte[i] == 47) {
        i = k + 1;
        if (arrayOfByte[k] == 42)
          while (true) {
            k = i + 1;
            if (k < j) {
              if ((char)arrayOfByte[i] == '*' && (char)arrayOfByte[k] == '/') {
                i = k + 1;
                j = i;
                continue;
              } 
              i = k;
              continue;
            } 
            paramv.N(j - paramv.c());
            return true;
          }  
      } 
    } 
    return false;
  }
  
  private static boolean c(v paramv) {
    char c = j(paramv, paramv.c());
    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ')
      return false; 
    paramv.N(1);
    return true;
  }
  
  private static String e(v paramv, StringBuilder paramStringBuilder) {
    boolean bool = false;
    paramStringBuilder.setLength(0);
    int i = paramv.c();
    int j = paramv.d();
    while (i < j && !bool) {
      char c = (char)paramv.a[i];
      if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_') {
        i++;
        paramStringBuilder.append(c);
        continue;
      } 
      bool = true;
    } 
    paramv.N(i - paramv.c());
    return paramStringBuilder.toString();
  }
  
  static String f(v paramv, StringBuilder paramStringBuilder) {
    m(paramv);
    if (paramv.a() == 0)
      return null; 
    String str = e(paramv, paramStringBuilder);
    if (!"".equals(str))
      return str; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("");
    stringBuilder.append((char)paramv.z());
    return stringBuilder.toString();
  }
  
  private static String g(v paramv, StringBuilder paramStringBuilder) {
    StringBuilder stringBuilder = new StringBuilder();
    boolean bool = false;
    while (!bool) {
      int i = paramv.c();
      String str = f(paramv, paramStringBuilder);
      if (str == null)
        return null; 
      if ("}".equals(str) || ";".equals(str)) {
        paramv.M(i);
        bool = true;
        continue;
      } 
      stringBuilder.append(str);
    } 
    return stringBuilder.toString();
  }
  
  private static String h(v paramv, StringBuilder paramStringBuilder) {
    m(paramv);
    if (paramv.a() < 5)
      return null; 
    if (!"::cue".equals(paramv.w(5)))
      return null; 
    int i = paramv.c();
    String str = f(paramv, paramStringBuilder);
    if (str == null)
      return null; 
    if ("{".equals(str)) {
      paramv.M(i);
      return "";
    } 
    if ("(".equals(str)) {
      str = k(paramv);
    } else {
      str = null;
    } 
    return !")".equals(f(paramv, paramStringBuilder)) ? null : str;
  }
  
  private static void i(v paramv, d paramd, StringBuilder paramStringBuilder) {
    m(paramv);
    String str1 = e(paramv, paramStringBuilder);
    if ("".equals(str1))
      return; 
    if (!":".equals(f(paramv, paramStringBuilder)))
      return; 
    m(paramv);
    String str2 = g(paramv, paramStringBuilder);
    if (str2 != null && !"".equals(str2)) {
      int i = paramv.c();
      String str = f(paramv, paramStringBuilder);
      if (!";".equals(str))
        if ("}".equals(str)) {
          paramv.M(i);
        } else {
          return;
        }  
      if ("color".equals(str1)) {
        paramd.p(h.c(str2));
      } else if ("background-color".equals(str1)) {
        paramd.n(h.c(str2));
      } else if ("text-decoration".equals(str1)) {
        if ("underline".equals(str2))
          paramd.w(true); 
      } else if ("font-family".equals(str1)) {
        paramd.q(str2);
      } else if ("font-weight".equals(str1)) {
        if ("bold".equals(str2))
          paramd.o(true); 
      } else if ("font-style".equals(str1) && "italic".equals(str2)) {
        paramd.r(true);
      } 
    } 
  }
  
  private static char j(v paramv, int paramInt) {
    return (char)paramv.a[paramInt];
  }
  
  private static String k(v paramv) {
    int i = paramv.c();
    int j = paramv.d();
    boolean bool = false;
    while (i < j && !bool) {
      if ((char)paramv.a[i] == ')') {
        bool = true;
      } else {
        bool = false;
      } 
      i++;
    } 
    return paramv.w(i - 1 - paramv.c()).trim();
  }
  
  static void l(v paramv) {
    do {
    
    } while (!TextUtils.isEmpty(paramv.m()));
  }
  
  static void m(v paramv) {
    label13: while (true) {
      boolean bool = true;
      while (paramv.a() > 0 && bool) {
        if (!c(paramv)) {
          if (b(paramv))
            continue label13; 
          bool = false;
          continue;
        } 
        continue label13;
      } 
      break;
    } 
  }
  
  public List<d> d(v paramv) {
    this.c.setLength(0);
    int i = paramv.c();
    l(paramv);
    this.b.K(paramv.a, paramv.c());
    this.b.M(i);
    ArrayList<d> arrayList = new ArrayList();
    while (true) {
      String str = h(this.b, this.c);
      if (str != null) {
        if (!"{".equals(f(this.b, this.c)))
          return arrayList; 
        d d = new d();
        a(d, str);
        str = null;
        i = 0;
        while (i == 0) {
          int j = this.b.c();
          str = f(this.b, this.c);
          if (str == null || "}".equals(str)) {
            i = 1;
          } else {
            i = 0;
          } 
          if (i == 0) {
            this.b.M(j);
            i(this.b, d, this.c);
          } 
        } 
        if ("}".equals(str))
          arrayList.add(d); 
        continue;
      } 
      return arrayList;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/text/s/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */