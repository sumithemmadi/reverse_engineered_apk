package com.google.android.exoplayer2.text.s;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.h0;
import com.google.android.exoplayer2.util.o;
import com.google.android.exoplayer2.util.v;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class f {
  public static final Pattern a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
  
  private static final Pattern b = Pattern.compile("(\\S+?):(\\S+)");
  
  private final StringBuilder c = new StringBuilder();
  
  private static void a(String paramString, SpannableStringBuilder paramSpannableStringBuilder) {
    StringBuilder stringBuilder;
    paramString.hashCode();
    int i = paramString.hashCode();
    byte b = -1;
    switch (i) {
      case 3374865:
        if (!paramString.equals("nbsp"))
          break; 
        b = 3;
        break;
      case 96708:
        if (!paramString.equals("amp"))
          break; 
        b = 2;
        break;
      case 3464:
        if (!paramString.equals("lt"))
          break; 
        b = 1;
        break;
      case 3309:
        if (!paramString.equals("gt"))
          break; 
        b = 0;
        break;
    } 
    switch (b) {
      default:
        stringBuilder = new StringBuilder();
        stringBuilder.append("ignoring unsupported entity: '&");
        stringBuilder.append(paramString);
        stringBuilder.append(";'");
        o.f("WebvttCueParser", stringBuilder.toString());
        return;
      case 3:
        stringBuilder.append(' ');
        return;
      case 2:
        stringBuilder.append('&');
        return;
      case 1:
        stringBuilder.append('<');
        return;
      case 0:
        break;
    } 
    stringBuilder.append('>');
  }
  
  private static void b(String paramString, a parama, SpannableStringBuilder paramSpannableStringBuilder, List<d> paramList, List<b> paramList1) {
    int i = parama.c;
    int j = paramSpannableStringBuilder.length();
    String str = parama.b;
    str.hashCode();
    int k = str.hashCode();
    boolean bool = false;
    byte b = -1;
    switch (k) {
      case 3314158:
        if (!str.equals("lang"))
          break; 
        b = 6;
        break;
      case 118:
        if (!str.equals("v"))
          break; 
        b = 5;
        break;
      case 117:
        if (!str.equals("u"))
          break; 
        b = 4;
        break;
      case 105:
        if (!str.equals("i"))
          break; 
        b = 3;
        break;
      case 99:
        if (!str.equals("c"))
          break; 
        b = 2;
        break;
      case 98:
        if (!str.equals("b"))
          break; 
        b = 1;
        break;
      case 0:
        if (!str.equals(""))
          break; 
        b = 0;
        break;
    } 
    switch (b) {
      default:
        return;
      case 4:
        paramSpannableStringBuilder.setSpan(new UnderlineSpan(), i, j, 33);
        break;
      case 3:
        paramSpannableStringBuilder.setSpan(new StyleSpan(2), i, j, 33);
        break;
      case 1:
        paramSpannableStringBuilder.setSpan(new StyleSpan(1), i, j, 33);
        break;
      case 0:
      case 2:
      case 5:
      case 6:
        break;
    } 
    paramList1.clear();
    e(paramList, paramString, parama, paramList1);
    k = paramList1.size();
    for (b = bool; b < k; b++)
      c(paramSpannableStringBuilder, ((b)paramList1.get(b)).c, i, j); 
  }
  
  private static void c(SpannableStringBuilder paramSpannableStringBuilder, d paramd, int paramInt1, int paramInt2) {
    if (paramd == null)
      return; 
    if (paramd.g() != -1)
      paramSpannableStringBuilder.setSpan(new StyleSpan(paramd.g()), paramInt1, paramInt2, 33); 
    if (paramd.k())
      paramSpannableStringBuilder.setSpan(new StrikethroughSpan(), paramInt1, paramInt2, 33); 
    if (paramd.l())
      paramSpannableStringBuilder.setSpan(new UnderlineSpan(), paramInt1, paramInt2, 33); 
    if (paramd.j())
      paramSpannableStringBuilder.setSpan(new ForegroundColorSpan(paramd.b()), paramInt1, paramInt2, 33); 
    if (paramd.i())
      paramSpannableStringBuilder.setSpan(new BackgroundColorSpan(paramd.a()), paramInt1, paramInt2, 33); 
    if (paramd.c() != null)
      paramSpannableStringBuilder.setSpan(new TypefaceSpan(paramd.c()), paramInt1, paramInt2, 33); 
    Layout.Alignment alignment = paramd.h();
    if (alignment != null)
      paramSpannableStringBuilder.setSpan(new AlignmentSpan.Standard(alignment), paramInt1, paramInt2, 33); 
    int i = paramd.e();
    if (i != 1) {
      if (i != 2) {
        if (i == 3)
          paramSpannableStringBuilder.setSpan(new RelativeSizeSpan(paramd.d() / 100.0F), paramInt1, paramInt2, 33); 
      } else {
        paramSpannableStringBuilder.setSpan(new RelativeSizeSpan(paramd.d()), paramInt1, paramInt2, 33);
      } 
    } else {
      paramSpannableStringBuilder.setSpan(new AbsoluteSizeSpan((int)paramd.d(), true), paramInt1, paramInt2, 33);
    } 
  }
  
  private static int d(String paramString, int paramInt) {
    paramInt = paramString.indexOf('>', paramInt);
    if (paramInt == -1) {
      paramInt = paramString.length();
    } else {
      paramInt++;
    } 
    return paramInt;
  }
  
  private static void e(List<d> paramList, String paramString, a parama, List<b> paramList1) {
    int i = paramList.size();
    for (byte b = 0; b < i; b++) {
      d d = paramList.get(b);
      int j = d.f(paramString, parama.b, parama.e, parama.d);
      if (j > 0)
        paramList1.add(new b(j, d)); 
    } 
    Collections.sort(paramList1);
  }
  
  private static String f(String paramString) {
    paramString = paramString.trim();
    e.a(paramString.isEmpty() ^ true);
    return h0.o0(paramString, "[ \\.]")[0];
  }
  
  private static boolean g(String paramString) {
    paramString.hashCode();
    int i = paramString.hashCode();
    byte b = -1;
    switch (i) {
      case 3314158:
        if (!paramString.equals("lang"))
          break; 
        b = 5;
        break;
      case 118:
        if (!paramString.equals("v"))
          break; 
        b = 4;
        break;
      case 117:
        if (!paramString.equals("u"))
          break; 
        b = 3;
        break;
      case 105:
        if (!paramString.equals("i"))
          break; 
        b = 2;
        break;
      case 99:
        if (!paramString.equals("c"))
          break; 
        b = 1;
        break;
      case 98:
        if (!paramString.equals("b"))
          break; 
        b = 0;
        break;
    } 
    switch (b) {
      default:
        return false;
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
        break;
    } 
    return true;
  }
  
  private static boolean i(String paramString, Matcher paramMatcher, v paramv, e.b paramb, StringBuilder paramStringBuilder, List<d> paramList) {
    String str;
    try {
      paramb.n(h.d(paramMatcher.group(1))).h(h.d(paramMatcher.group(2)));
      j(paramMatcher.group(3), paramb);
      paramStringBuilder.setLength(0);
      for (str = paramv.m(); !TextUtils.isEmpty(str); str = paramv.m()) {
        if (paramStringBuilder.length() > 0)
          paramStringBuilder.append("\n"); 
        paramStringBuilder.append(str.trim());
      } 
      k(paramString, paramStringBuilder.toString(), paramb, paramList);
      return true;
    } catch (NumberFormatException numberFormatException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Skipping cue with bad header: ");
      stringBuilder.append(str.group());
      o.f("WebvttCueParser", stringBuilder.toString());
      return false;
    } 
  }
  
  static void j(String paramString, e.b paramb) {
    Matcher matcher = b.matcher(paramString);
    while (matcher.find()) {
      String str1 = matcher.group(1);
      String str2 = matcher.group(2);
      try {
        if ("line".equals(str1)) {
          l(str2, paramb);
          continue;
        } 
        if ("align".equals(str1)) {
          paramb.p(o(str2));
          continue;
        } 
        if ("position".equals(str1)) {
          n(str2, paramb);
          continue;
        } 
        if ("size".equals(str1)) {
          paramb.q(h.c(str2));
          continue;
        } 
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append("Unknown cue setting ");
        stringBuilder.append(str1);
        stringBuilder.append(":");
        stringBuilder.append(str2);
        o.f("WebvttCueParser", stringBuilder.toString());
      } catch (NumberFormatException numberFormatException) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Skipping bad cue setting: ");
        stringBuilder.append(matcher.group());
        o.f("WebvttCueParser", stringBuilder.toString());
      } 
    } 
  }
  
  static void k(String paramString1, String paramString2, e.b paramb, List<d> paramList) {
    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
    ArrayDeque<a> arrayDeque = new ArrayDeque();
    ArrayList<b> arrayList = new ArrayList();
    int i;
    label70: for (i = 0; i < paramString2.length(); i = j) {
      char c = paramString2.charAt(i);
      if (c != '&') {
        a a;
        if (c != '<') {
          spannableStringBuilder.append(c);
          i++;
          continue;
        } 
        int m = i + 1;
        if (m >= paramString2.length()) {
          i = m;
          continue;
        } 
        char c1 = paramString2.charAt(m);
        byte b1 = 1;
        if (c1 == '/') {
          c1 = '\001';
        } else {
          c1 = Character.MIN_VALUE;
        } 
        int n = d(paramString2, m);
        int i1 = n - 2;
        if (paramString2.charAt(i1) == '/') {
          m = 1;
        } else {
          m = 0;
        } 
        if (c1 != '\000')
          b1 = 2; 
        if (m == 0)
          i1 = n - 1; 
        String str1 = paramString2.substring(i + b1, i1);
        if (str1.trim().isEmpty()) {
          i = n;
          continue;
        } 
        String str2 = f(str1);
        if (!g(str2)) {
          i = n;
          continue;
        } 
        if (c1 != '\000')
          while (true) {
            if (arrayDeque.isEmpty()) {
              i = n;
              continue label70;
            } 
            a = arrayDeque.pop();
            b(paramString1, a, spannableStringBuilder, paramList, arrayList);
            if (a.b.equals(str2))
              i = n; 
          }  
        i = n;
        if (m == 0) {
          arrayDeque.push(a.a((String)a, spannableStringBuilder.length()));
          i = n;
        } 
        continue;
      } 
      int j = i + 1;
      i = paramString2.indexOf(';', j);
      int k = paramString2.indexOf(' ', j);
      if (i == -1) {
        i = k;
      } else if (k != -1) {
        i = Math.min(i, k);
      } 
      if (i != -1) {
        a(paramString2.substring(j, i), spannableStringBuilder);
        if (i == k)
          spannableStringBuilder.append(" "); 
        i++;
        continue;
      } 
      spannableStringBuilder.append(c);
    } 
    while (!arrayDeque.isEmpty())
      b(paramString1, arrayDeque.pop(), spannableStringBuilder, paramList, arrayList); 
    b(paramString1, a.b(), spannableStringBuilder, paramList, arrayList);
    paramb.o((CharSequence)spannableStringBuilder);
  }
  
  private static void l(String paramString, e.b paramb) {
    int i = paramString.indexOf(',');
    String str = paramString;
    if (i != -1) {
      paramb.j(m(paramString.substring(i + 1)));
      str = paramString.substring(0, i);
    } 
    if (str.endsWith("%")) {
      paramb.i(h.c(str)).k(0);
    } else {
      int j = Integer.parseInt(str);
      i = j;
      if (j < 0)
        i = j - 1; 
      paramb.i(i).k(1);
    } 
  }
  
  private static int m(String paramString) {
    StringBuilder stringBuilder;
    paramString.hashCode();
    int i = paramString.hashCode();
    byte b = -1;
    switch (i) {
      case 109757538:
        if (!paramString.equals("start"))
          break; 
        b = 3;
        break;
      case 100571:
        if (!paramString.equals("end"))
          break; 
        b = 2;
        break;
      case -1074341483:
        if (!paramString.equals("middle"))
          break; 
        b = 1;
        break;
      case -1364013995:
        if (!paramString.equals("center"))
          break; 
        b = 0;
        break;
    } 
    switch (b) {
      default:
        stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid anchor value: ");
        stringBuilder.append(paramString);
        o.f("WebvttCueParser", stringBuilder.toString());
        return Integer.MIN_VALUE;
      case 3:
        return 0;
      case 2:
        return 2;
      case 0:
      case 1:
        break;
    } 
    return 1;
  }
  
  private static void n(String paramString, e.b paramb) {
    int i = paramString.indexOf(',');
    String str = paramString;
    if (i != -1) {
      paramb.m(m(paramString.substring(i + 1)));
      str = paramString.substring(0, i);
    } 
    paramb.l(h.c(str));
  }
  
  private static int o(String paramString) {
    StringBuilder stringBuilder;
    paramString.hashCode();
    int i = paramString.hashCode();
    byte b = -1;
    switch (i) {
      case 109757538:
        if (!paramString.equals("start"))
          break; 
        b = 5;
        break;
      case 108511772:
        if (!paramString.equals("right"))
          break; 
        b = 4;
        break;
      case 3317767:
        if (!paramString.equals("left"))
          break; 
        b = 3;
        break;
      case 100571:
        if (!paramString.equals("end"))
          break; 
        b = 2;
        break;
      case -1074341483:
        if (!paramString.equals("middle"))
          break; 
        b = 1;
        break;
      case -1364013995:
        if (!paramString.equals("center"))
          break; 
        b = 0;
        break;
    } 
    switch (b) {
      default:
        stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid alignment value: ");
        stringBuilder.append(paramString);
        o.f("WebvttCueParser", stringBuilder.toString());
        return 2;
      case 5:
        return 1;
      case 4:
        return 5;
      case 3:
        return 4;
      case 2:
        return 3;
      case 0:
      case 1:
        break;
    } 
    return 2;
  }
  
  public boolean h(v paramv, e.b paramb, List<d> paramList) {
    String str1 = paramv.m();
    if (str1 == null)
      return false; 
    Pattern pattern = a;
    Matcher matcher2 = pattern.matcher(str1);
    if (matcher2.matches())
      return i(null, matcher2, paramv, paramb, this.c, paramList); 
    String str2 = paramv.m();
    if (str2 == null)
      return false; 
    Matcher matcher1 = pattern.matcher(str2);
    return matcher1.matches() ? i(str1.trim(), matcher1, paramv, paramb, this.c, paramList) : false;
  }
  
  private static final class a {
    private static final String[] a = new String[0];
    
    public final String b;
    
    public final int c;
    
    public final String d;
    
    public final String[] e;
    
    private a(String param1String1, int param1Int, String param1String2, String[] param1ArrayOfString) {
      this.c = param1Int;
      this.b = param1String1;
      this.d = param1String2;
      this.e = param1ArrayOfString;
    }
    
    public static a a(String param1String, int param1Int) {
      String str1 = param1String.trim();
      e.a(str1.isEmpty() ^ true);
      int i = str1.indexOf(" ");
      if (i == -1) {
        param1String = "";
      } else {
        param1String = str1.substring(i).trim();
        str1 = str1.substring(0, i);
      } 
      String[] arrayOfString = h0.n0(str1, "\\.");
      String str2 = arrayOfString[0];
      if (arrayOfString.length > 1) {
        arrayOfString = (String[])h0.g0((Object[])arrayOfString, 1, arrayOfString.length);
      } else {
        arrayOfString = a;
      } 
      return new a(str2, param1Int, param1String, arrayOfString);
    }
    
    public static a b() {
      return new a("", 0, "", new String[0]);
    }
  }
  
  private static final class b implements Comparable<b> {
    public final int b;
    
    public final d c;
    
    public b(int param1Int, d param1d) {
      this.b = param1Int;
      this.c = param1d;
    }
    
    public int a(b param1b) {
      return this.b - param1b.b;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/text/s/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */