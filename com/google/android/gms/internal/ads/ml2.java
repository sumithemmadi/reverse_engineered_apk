package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import java.util.ArrayList;

public final class ml2 {
  private final int a;
  
  private final int b;
  
  private final int c;
  
  private final boolean d;
  
  private final xl2 e;
  
  private final jm2 f;
  
  private final Object g = new Object();
  
  private ArrayList<String> h = new ArrayList<String>();
  
  private ArrayList<String> i = new ArrayList<String>();
  
  private ArrayList<vl2> j = new ArrayList<vl2>();
  
  private int k = 0;
  
  private int l = 0;
  
  private int m = 0;
  
  private int n;
  
  private String o = "";
  
  private String p = "";
  
  private String q = "";
  
  public ml2(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, boolean paramBoolean) {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
    this.d = paramBoolean;
    this.e = new xl2(paramInt4);
    this.f = new jm2(paramInt5, paramInt6, paramInt7);
  }
  
  private static String b(ArrayList<String> paramArrayList, int paramInt) {
    if (paramArrayList.isEmpty())
      return ""; 
    StringBuilder stringBuilder = new StringBuilder();
    int i = paramArrayList.size();
    paramInt = 0;
    while (paramInt < i) {
      String str1 = (String)paramArrayList.get(paramInt);
      paramInt++;
      stringBuilder.append(str1);
      stringBuilder.append(' ');
      if (stringBuilder.length() > 100)
        break; 
    } 
    stringBuilder.deleteCharAt(stringBuilder.length() - 1);
    String str = stringBuilder.toString();
    return (str.length() < 100) ? str : str.substring(0, 100);
  }
  
  private final void f(String paramString, boolean paramBoolean, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    if (paramString == null || paramString.length() < this.c)
      return; 
    synchronized (this.g) {
      this.h.add(paramString);
      this.k += paramString.length();
      if (paramBoolean) {
        this.i.add(paramString);
        ArrayList<vl2> arrayList = this.j;
        vl2 vl2 = new vl2();
        this(paramFloat1, paramFloat2, paramFloat3, paramFloat4, this.i.size() - 1);
        arrayList.add(vl2);
      } 
      return;
    } 
  }
  
  private final int g(int paramInt1, int paramInt2) {
    return this.d ? this.b : (paramInt1 * this.a + paramInt2 * this.b);
  }
  
  public final int a() {
    return this.n;
  }
  
  public final void c(String paramString, boolean paramBoolean, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    f(paramString, paramBoolean, paramFloat1, paramFloat2, paramFloat3, paramFloat4);
    synchronized (this.g) {
      if (this.m < 0)
        cm.e("ActivityContent: negative number of WebViews."); 
      p();
      return;
    } 
  }
  
  public final void d(String paramString, boolean paramBoolean, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    f(paramString, paramBoolean, paramFloat1, paramFloat2, paramFloat3, paramFloat4);
  }
  
  public final void e(int paramInt) {
    this.l = paramInt;
  }
  
  public final boolean equals(Object paramObject) {
    if (!(paramObject instanceof ml2))
      return false; 
    if (paramObject == this)
      return true; 
    paramObject = ((ml2)paramObject).o;
    return (paramObject != null && paramObject.equals(this.o));
  }
  
  public final boolean h() {
    synchronized (this.g) {
      boolean bool;
      if (this.m == 0) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    } 
  }
  
  public final int hashCode() {
    return this.o.hashCode();
  }
  
  public final String i() {
    return this.o;
  }
  
  public final String j() {
    return this.p;
  }
  
  public final String k() {
    return this.q;
  }
  
  public final void l() {
    synchronized (this.g) {
      this.n -= 100;
      return;
    } 
  }
  
  public final void m() {
    synchronized (this.g) {
      this.m--;
      return;
    } 
  }
  
  public final void n() {
    synchronized (this.g) {
      this.m++;
      return;
    } 
  }
  
  public final void o() {
    synchronized (this.g) {
      int i = g(this.k, this.l);
      if (i > this.n)
        this.n = i; 
      return;
    } 
  }
  
  public final void p() {
    synchronized (this.g) {
      int i = g(this.k, this.l);
      if (i > this.n) {
        this.n = i;
        if (!q.g().r().u()) {
          this.o = this.e.a(this.h);
          this.p = this.e.a(this.i);
        } 
        if (!q.g().r().l())
          this.q = this.f.a(this.i, this.j); 
      } 
      return;
    } 
  }
  
  final int q() {
    return this.k;
  }
  
  public final String toString() {
    int i = this.l;
    int j = this.n;
    int k = this.k;
    String str1 = b(this.h, 100);
    String str2 = b(this.i, 100);
    String str3 = this.o;
    String str4 = this.p;
    String str5 = this.q;
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str1).length() + 165 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length() + String.valueOf(str5).length());
    stringBuilder.append("ActivityContent fetchId: ");
    stringBuilder.append(i);
    stringBuilder.append(" score:");
    stringBuilder.append(j);
    stringBuilder.append(" total_length:");
    stringBuilder.append(k);
    stringBuilder.append("\n text: ");
    stringBuilder.append(str1);
    stringBuilder.append("\n viewableText");
    stringBuilder.append(str2);
    stringBuilder.append("\n signture: ");
    stringBuilder.append(str3);
    stringBuilder.append("\n viewableSignture: ");
    stringBuilder.append(str4);
    stringBuilder.append("\n viewableSignatureForVertical: ");
    stringBuilder.append(str5);
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ml2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */