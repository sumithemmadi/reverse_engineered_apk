package com.allinone.callerid.util.t9;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import b.h.j.h;
import com.allinone.callerid.search.CallLogBean;
import f.a.a.c;
import f.a.a.e.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;

public final class d {
  private static final a a;
  
  private static final f.a.a.e.b b;
  
  private static final h<Set<String>> c = new h(4);
  
  private static final Comparator<CallLogBean> d;
  
  static {
    a = new a();
    d = new b();
  }
  
  public static String c(String paramString) {
    return e.a(paramString, a);
  }
  
  public static List<CallLogBean> d(List<CallLogBean> paramList, String paramString) {
    ArrayList<CallLogBean> arrayList = new ArrayList();
    if (paramList != null && paramList.size() > 0) {
      for (CallLogBean callLogBean : paramList) {
        T9MatchInfo t9MatchInfo2 = c.c(callLogBean.g0, paramString);
        T9MatchInfo t9MatchInfo1 = c.f(callLogBean.p(), paramString);
        if (t9MatchInfo2.a() || t9MatchInfo1.a()) {
          new CallLogBean();
          callLogBean.d0 = t9MatchInfo2;
          callLogBean.e0 = t9MatchInfo1;
          arrayList.add(callLogBean);
        } 
      } 
      Collections.sort(arrayList, d);
    } 
    return arrayList;
  }
  
  public static SpannableStringBuilder e(SpannableStringBuilder paramSpannableStringBuilder, T9MatchInfo paramT9MatchInfo, String paramString, int paramInt) {
    paramSpannableStringBuilder.clear();
    if (!TextUtils.isEmpty(paramString)) {
      paramSpannableStringBuilder.append(paramString);
      int i = paramString.length();
      while (paramT9MatchInfo != null) {
        int j = paramT9MatchInfo.f();
        int k = paramT9MatchInfo.b() + j;
        if (paramT9MatchInfo.a() && j < i && k <= i)
          paramSpannableStringBuilder.setSpan(new ForegroundColorSpan(paramInt), j, k, 33); 
        paramT9MatchInfo = paramT9MatchInfo.c();
      } 
    } 
    return paramSpannableStringBuilder;
  }
  
  static {
    f.a.a.e.b b1 = new f.a.a.e.b();
    b = b1;
    b1.e(f.a.a.e.a.a);
    b1.f(c.b);
    b1.g(f.a.a.e.d.b);
  }
  
  static final class a implements a {
    public String[] a(char param1Char) {
      Set set1 = (Set)d.a().b();
      Set set2 = set1;
      if (set1 == null)
        set2 = new HashSet(); 
      try {
        String[] arrayOfString = c.c(param1Char, d.b());
        if (arrayOfString == null) {
          set2.clear();
          d.a().c(set2);
          return null;
        } 
        set2.addAll(Arrays.asList(arrayOfString));
        arrayOfString = (String[])set2.toArray((Object[])new String[set2.size()]);
        set2.clear();
        d.a().c(set2);
        return arrayOfString;
      } catch (BadHanyuPinyinOutputFormatCombination badHanyuPinyinOutputFormatCombination) {
        badHanyuPinyinOutputFormatCombination.printStackTrace();
        set2.clear();
        d.a().c(set2);
        return null;
      } finally {}
      set2.clear();
      d.a().c(set2);
      throw set1;
    }
  }
  
  static final class b implements Comparator<CallLogBean> {
    private int b(T9MatchInfo param1T9MatchInfo) {
      int i = 0;
      while (param1T9MatchInfo != null) {
        i += param1T9MatchInfo.b();
        param1T9MatchInfo = param1T9MatchInfo.c();
      } 
      return i;
    }
    
    public int a(CallLogBean param1CallLogBean1, CallLogBean param1CallLogBean2) {
      T9MatchInfo t9MatchInfo1 = param1CallLogBean1.d0;
      T9MatchInfo t9MatchInfo2 = param1CallLogBean2.d0;
      if (t9MatchInfo1.a()) {
        if (t9MatchInfo2.a()) {
          int i = t9MatchInfo1.f();
          int j = t9MatchInfo2.f();
          if (i < j)
            return -1; 
          if (i > j)
            return 1; 
          i = b(t9MatchInfo1);
          j = b(t9MatchInfo2);
          int k = param1CallLogBean1.n().length() - i - param1CallLogBean2.n().length() - j;
          if (k != 0)
            return (i < j) ? 1 : ((i > j) ? -1 : k); 
          if (i != j) {
            if (param1CallLogBean1.n().length() > param1CallLogBean2.n().length())
              return 1; 
            if (param1CallLogBean1.n().length() < param1CallLogBean2.n().length())
              return -1; 
          } 
          return param1CallLogBean1.n().compareToIgnoreCase(param1CallLogBean2.n());
        } 
        return -1;
      } 
      if (t9MatchInfo2.a())
        return 1; 
      t9MatchInfo2 = param1CallLogBean1.e0;
      t9MatchInfo1 = param1CallLogBean2.e0;
      if (t9MatchInfo2.a()) {
        if (t9MatchInfo1.a()) {
          int i = t9MatchInfo2.f();
          int j = t9MatchInfo1.f();
          return (i < j) ? -1 : ((i > j) ? 1 : param1CallLogBean1.p().compareToIgnoreCase(param1CallLogBean2.p()));
        } 
        return -1;
      } 
      return t9MatchInfo1.a() ? 1 : 0;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/t9/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */