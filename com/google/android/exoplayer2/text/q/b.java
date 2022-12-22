package com.google.android.exoplayer2.text.q;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import com.google.android.exoplayer2.util.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

final class b {
  public final String a;
  
  public final String b;
  
  public final boolean c;
  
  public final long d;
  
  public final long e;
  
  public final e f;
  
  private final String[] g;
  
  public final String h;
  
  public final String i;
  
  private final HashMap<String, Integer> j;
  
  private final HashMap<String, Integer> k;
  
  private List<b> l;
  
  private b(String paramString1, String paramString2, long paramLong1, long paramLong2, e parame, String[] paramArrayOfString, String paramString3, String paramString4) {
    boolean bool;
    this.a = paramString1;
    this.b = paramString2;
    this.i = paramString4;
    this.f = parame;
    this.g = paramArrayOfString;
    if (paramString2 != null) {
      bool = true;
    } else {
      bool = false;
    } 
    this.c = bool;
    this.d = paramLong1;
    this.e = paramLong2;
    this.h = (String)e.e(paramString3);
    this.j = new HashMap<String, Integer>();
    this.k = new HashMap<String, Integer>();
  }
  
  private void b(Map<String, e> paramMap, SpannableStringBuilder paramSpannableStringBuilder, int paramInt1, int paramInt2) {
    e e1 = d.d(this.f, this.g, paramMap);
    if (e1 != null)
      d.a(paramSpannableStringBuilder, paramInt1, paramInt2, e1); 
  }
  
  public static b c(String paramString1, long paramLong1, long paramLong2, e parame, String[] paramArrayOfString, String paramString2, String paramString3) {
    return new b(paramString1, null, paramLong1, paramLong2, parame, paramArrayOfString, paramString2, paramString3);
  }
  
  public static b d(String paramString) {
    return new b(null, d.b(paramString), -9223372036854775807L, -9223372036854775807L, null, null, "", null);
  }
  
  private SpannableStringBuilder e(SpannableStringBuilder paramSpannableStringBuilder) {
    int i = paramSpannableStringBuilder.length();
    int j = 0;
    int k = 0;
    while (k < i) {
      int n = i;
      if (paramSpannableStringBuilder.charAt(k) == ' ') {
        int i1 = k + 1;
        for (n = i1; n < paramSpannableStringBuilder.length() && paramSpannableStringBuilder.charAt(n) == ' '; n++);
        i1 = n - i1;
        n = i;
        if (i1 > 0) {
          paramSpannableStringBuilder.delete(k, k + i1);
          n = i - i1;
        } 
      } 
      k++;
      i = n;
    } 
    k = i;
    if (i > 0) {
      k = i;
      if (paramSpannableStringBuilder.charAt(0) == ' ') {
        paramSpannableStringBuilder.delete(0, 1);
        k = i - 1;
      } 
    } 
    int m = 0;
    i = k;
    while (true) {
      int n = i - 1;
      if (m < n) {
        k = i;
        if (paramSpannableStringBuilder.charAt(m) == '\n') {
          n = m + 1;
          k = i;
          if (paramSpannableStringBuilder.charAt(n) == ' ') {
            paramSpannableStringBuilder.delete(n, m + 2);
            k = i - 1;
          } 
        } 
        m++;
        i = k;
        continue;
      } 
      k = i;
      m = j;
      if (i > 0) {
        k = i;
        m = j;
        if (paramSpannableStringBuilder.charAt(n) == ' ') {
          paramSpannableStringBuilder.delete(n, i);
          k = i - 1;
          m = j;
        } 
      } 
      while (true) {
        i = k - 1;
        if (m < i) {
          i = k;
          if (paramSpannableStringBuilder.charAt(m) == ' ') {
            j = m + 1;
            i = k;
            if (paramSpannableStringBuilder.charAt(j) == '\n') {
              paramSpannableStringBuilder.delete(m, j);
              i = k - 1;
            } 
          } 
          m++;
          k = i;
          continue;
        } 
        if (k > 0 && paramSpannableStringBuilder.charAt(i) == '\n')
          paramSpannableStringBuilder.delete(i, k); 
        return paramSpannableStringBuilder;
      } 
      break;
    } 
  }
  
  private void i(TreeSet<Long> paramTreeSet, boolean paramBoolean) {
    boolean bool1 = "p".equals(this.a);
    boolean bool2 = "div".equals(this.a);
    if (paramBoolean || bool1 || (bool2 && this.i != null)) {
      long l = this.d;
      if (l != -9223372036854775807L)
        paramTreeSet.add(Long.valueOf(l)); 
      l = this.e;
      if (l != -9223372036854775807L)
        paramTreeSet.add(Long.valueOf(l)); 
    } 
    if (this.l == null)
      return; 
    for (byte b1 = 0; b1 < this.l.size(); b1++) {
      b b2 = this.l.get(b1);
      if (paramBoolean || bool1) {
        bool2 = true;
      } else {
        bool2 = false;
      } 
      b2.i(paramTreeSet, bool2);
    } 
  }
  
  private static SpannableStringBuilder k(String paramString, Map<String, SpannableStringBuilder> paramMap) {
    if (!paramMap.containsKey(paramString))
      paramMap.put(paramString, new SpannableStringBuilder()); 
    return paramMap.get(paramString);
  }
  
  private void m(long paramLong, String paramString, List<Pair<String, String>> paramList) {
    if (!"".equals(this.h))
      paramString = this.h; 
    if (l(paramLong) && "div".equals(this.a) && this.i != null) {
      paramList.add(new Pair(paramString, this.i));
      return;
    } 
    for (byte b1 = 0; b1 < g(); b1++)
      f(b1).m(paramLong, paramString, paramList); 
  }
  
  private void n(long paramLong, Map<String, e> paramMap, Map<String, SpannableStringBuilder> paramMap1) {
    int i;
    if (!l(paramLong))
      return; 
    Iterator<Map.Entry> iterator = this.k.entrySet().iterator();
    while (true) {
      boolean bool = iterator.hasNext();
      i = 0;
      int j = 0;
      if (bool) {
        Map.Entry entry = iterator.next();
        String str = (String)entry.getKey();
        i = j;
        if (this.j.containsKey(str))
          i = ((Integer)this.j.get(str)).intValue(); 
        j = ((Integer)entry.getValue()).intValue();
        if (i != j)
          b(paramMap, paramMap1.get(str), i, j); 
        continue;
      } 
      break;
    } 
    while (i < g()) {
      f(i).n(paramLong, paramMap, paramMap1);
      i++;
    } 
  }
  
  private void o(long paramLong, boolean paramBoolean, String paramString, Map<String, SpannableStringBuilder> paramMap) {
    this.j.clear();
    this.k.clear();
    if ("metadata".equals(this.a))
      return; 
    if (!"".equals(this.h))
      paramString = this.h; 
    if (this.c && paramBoolean) {
      k(paramString, paramMap).append(this.b);
    } else if ("br".equals(this.a) && paramBoolean) {
      k(paramString, paramMap).append('\n');
    } else if (l(paramLong)) {
      for (Map.Entry<String, SpannableStringBuilder> entry : paramMap.entrySet())
        this.j.put((String)entry.getKey(), Integer.valueOf(((SpannableStringBuilder)entry.getValue()).length())); 
      boolean bool = "p".equals(this.a);
      for (byte b1 = 0; b1 < g(); b1++) {
        boolean bool1;
        b b2 = f(b1);
        if (paramBoolean || bool) {
          bool1 = true;
        } else {
          bool1 = false;
        } 
        b2.o(paramLong, bool1, paramString, paramMap);
      } 
      if (bool)
        d.c(k(paramString, paramMap)); 
      for (Map.Entry<String, SpannableStringBuilder> entry : paramMap.entrySet())
        this.k.put((String)entry.getKey(), Integer.valueOf(((SpannableStringBuilder)entry.getValue()).length())); 
    } 
  }
  
  public void a(b paramb) {
    if (this.l == null)
      this.l = new ArrayList<b>(); 
    this.l.add(paramb);
  }
  
  public b f(int paramInt) {
    List<b> list = this.l;
    if (list != null)
      return list.get(paramInt); 
    throw new IndexOutOfBoundsException();
  }
  
  public int g() {
    int i;
    List<b> list = this.l;
    if (list == null) {
      i = 0;
    } else {
      i = list.size();
    } 
    return i;
  }
  
  public List<com.google.android.exoplayer2.text.b> h(long paramLong, Map<String, e> paramMap, Map<String, c> paramMap1, Map<String, String> paramMap2) {
    ArrayList<Pair<String, String>> arrayList1 = new ArrayList();
    m(paramLong, this.h, arrayList1);
    TreeMap<Object, Object> treeMap = new TreeMap<Object, Object>();
    o(paramLong, false, this.h, (Map)treeMap);
    n(paramLong, paramMap, (Map)treeMap);
    ArrayList<com.google.android.exoplayer2.text.b> arrayList = new ArrayList();
    for (Pair<String, String> pair : arrayList1) {
      String str = paramMap2.get(pair.second);
      if (str == null)
        continue; 
      byte[] arrayOfByte = Base64.decode(str, 0);
      Bitmap bitmap = BitmapFactory.decodeByteArray(arrayOfByte, 0, arrayOfByte.length);
      c c = paramMap1.get(pair.first);
      arrayList.add(new com.google.android.exoplayer2.text.b(bitmap, c.b, 0, c.c, c.e, c.f, c.g));
    } 
    for (Map.Entry<Object, Object> entry : treeMap.entrySet()) {
      c c = paramMap1.get(entry.getKey());
      arrayList.add(new com.google.android.exoplayer2.text.b((CharSequence)e((SpannableStringBuilder)entry.getValue()), null, c.c, c.d, c.e, c.b, -2147483648, c.f, c.h, c.i));
    } 
    return arrayList;
  }
  
  public long[] j() {
    TreeSet<Long> treeSet = new TreeSet();
    byte b1 = 0;
    i(treeSet, false);
    long[] arrayOfLong = new long[treeSet.size()];
    Iterator<Long> iterator = treeSet.iterator();
    while (iterator.hasNext()) {
      arrayOfLong[b1] = ((Long)iterator.next()).longValue();
      b1++;
    } 
    return arrayOfLong;
  }
  
  public boolean l(long paramLong) {
    boolean bool;
    long l = this.d;
    if ((l == -9223372036854775807L && this.e == -9223372036854775807L) || (l <= paramLong && this.e == -9223372036854775807L) || (l == -9223372036854775807L && paramLong < this.e) || (l <= paramLong && paramLong < this.e)) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/text/q/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */