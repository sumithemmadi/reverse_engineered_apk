package com.google.android.exoplayer2.text.p;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import com.google.android.exoplayer2.text.b;
import com.google.android.exoplayer2.text.c;
import com.google.android.exoplayer2.text.e;
import com.google.android.exoplayer2.util.o;
import com.google.android.exoplayer2.util.p;
import com.google.android.exoplayer2.util.v;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class a extends c {
  private static final Pattern o = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+),(\\d+))\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+),(\\d+))\\s*");
  
  private static final Pattern p = Pattern.compile("\\{\\\\.*?\\}");
  
  private final StringBuilder q = new StringBuilder();
  
  private final ArrayList<String> r = new ArrayList<String>();
  
  public a() {
    super("SubripDecoder");
  }
  
  private b C(Spanned paramSpanned, String paramString) {
    byte b;
    boolean bool;
    if (paramString == null)
      return new b((CharSequence)paramSpanned); 
    switch (paramString.hashCode()) {
      default:
        b = -1;
        break;
      case -685620462:
        if (paramString.equals("{\\an9}")) {
          b = 5;
          break;
        } 
      case -685620493:
        if (paramString.equals("{\\an8}")) {
          b = 8;
          break;
        } 
      case -685620524:
        if (paramString.equals("{\\an7}")) {
          b = 2;
          break;
        } 
      case -685620555:
        if (paramString.equals("{\\an6}")) {
          b = 4;
          break;
        } 
      case -685620586:
        if (paramString.equals("{\\an5}")) {
          b = 7;
          break;
        } 
      case -685620617:
        if (paramString.equals("{\\an4}")) {
          b = 1;
          break;
        } 
      case -685620648:
        if (paramString.equals("{\\an3}")) {
          b = 3;
          break;
        } 
      case -685620679:
        if (paramString.equals("{\\an2}")) {
          b = 6;
          break;
        } 
      case -685620710:
        if (paramString.equals("{\\an1}")) {
          b = 0;
          break;
        } 
    } 
    if (b != 0 && b != 1 && b != 2) {
      if (b != 3 && b != 4 && b != 5) {
        bool = true;
      } else {
        bool = true;
      } 
    } else {
      bool = false;
    } 
    switch (paramString.hashCode()) {
      default:
        b = -1;
        break;
      case -685620462:
        if (paramString.equals("{\\an9}")) {
          b = 5;
          break;
        } 
      case -685620493:
        if (paramString.equals("{\\an8}")) {
          b = 4;
          break;
        } 
      case -685620524:
        if (paramString.equals("{\\an7}")) {
          b = 3;
          break;
        } 
      case -685620555:
        if (paramString.equals("{\\an6}")) {
          b = 8;
          break;
        } 
      case -685620586:
        if (paramString.equals("{\\an5}")) {
          b = 7;
          break;
        } 
      case -685620617:
        if (paramString.equals("{\\an4}")) {
          b = 6;
          break;
        } 
      case -685620648:
        if (paramString.equals("{\\an3}")) {
          b = 2;
          break;
        } 
      case -685620679:
        if (paramString.equals("{\\an2}")) {
          b = 1;
          break;
        } 
      case -685620710:
        if (paramString.equals("{\\an1}")) {
          b = 0;
          break;
        } 
    } 
    if (b != 0 && b != 1 && b != 2) {
      if (b != 3 && b != 4 && b != 5) {
        b = 1;
      } else {
        b = 0;
      } 
    } else {
      b = 2;
    } 
    return new b((CharSequence)paramSpanned, null, D(b), 0, b, D(bool), bool, -3.4028235E38F);
  }
  
  static float D(int paramInt) {
    if (paramInt != 0) {
      if (paramInt != 1) {
        if (paramInt == 2)
          return 0.92F; 
        throw new IllegalArgumentException();
      } 
      return 0.5F;
    } 
    return 0.08F;
  }
  
  private static long E(Matcher paramMatcher, int paramInt) {
    return (Long.parseLong(paramMatcher.group(paramInt + 1)) * 60L * 60L * 1000L + Long.parseLong(paramMatcher.group(paramInt + 2)) * 60L * 1000L + Long.parseLong(paramMatcher.group(paramInt + 3)) * 1000L + Long.parseLong(paramMatcher.group(paramInt + 4))) * 1000L;
  }
  
  private String F(String paramString, ArrayList<String> paramArrayList) {
    String str = paramString.trim();
    StringBuilder stringBuilder = new StringBuilder(str);
    Matcher matcher = p.matcher(str);
    int i;
    for (i = 0; matcher.find(); i += k) {
      str = matcher.group();
      paramArrayList.add(str);
      int j = matcher.start() - i;
      int k = str.length();
      stringBuilder.replace(j, j + k, "");
    } 
    return stringBuilder.toString();
  }
  
  protected e z(byte[] paramArrayOfbyte, int paramInt, boolean paramBoolean) {
    ArrayList<b> arrayList = new ArrayList();
    p p = new p();
    v v = new v(paramArrayOfbyte, paramInt);
    while (true) {
      String str = v.m();
      if (str != null) {
        String str1;
        if (str.length() == 0)
          continue; 
        try {
          Integer.parseInt(str);
          str = v.m();
          if (str == null) {
            o.f("SubripDecoder", "Unexpected end");
            break;
          } 
          Matcher matcher = o.matcher(str);
          if (matcher.matches()) {
            p.a(E(matcher, 1));
            p.a(E(matcher, 6));
            StringBuilder stringBuilder1 = this.q;
            paramInt = 0;
            stringBuilder1.setLength(0);
            this.r.clear();
            for (str1 = v.m(); !TextUtils.isEmpty(str1); str1 = v.m()) {
              if (this.q.length() > 0)
                this.q.append("<br>"); 
              this.q.append(F(str1, this.r));
            } 
            Spanned spanned = Html.fromHtml(this.q.toString());
            matcher = null;
            while (true) {
              Matcher matcher1 = matcher;
              if (paramInt < this.r.size()) {
                str1 = this.r.get(paramInt);
                if (str1.matches("\\{\\\\an[1-9]\\}"))
                  break; 
                paramInt++;
                continue;
              } 
              break;
            } 
            arrayList.add(C(spanned, str1));
            arrayList.add(b.b);
            continue;
          } 
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Skipping invalid timing: ");
          stringBuilder.append(str1);
          o.f("SubripDecoder", stringBuilder.toString());
        } catch (NumberFormatException numberFormatException) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Skipping invalid index: ");
          stringBuilder.append(str1);
          o.f("SubripDecoder", stringBuilder.toString());
        } 
        continue;
      } 
      break;
    } 
    b[] arrayOfB = new b[arrayList.size()];
    arrayList.toArray(arrayOfB);
    return new b(arrayOfB, p.d());
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/text/p/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */