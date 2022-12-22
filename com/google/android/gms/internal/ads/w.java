package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Map;

public abstract class w<T> implements Comparable<w<T>> {
  private final ic.a b;
  
  private final int c;
  
  private final String d;
  
  private final int e;
  
  private final Object f;
  
  private q7 g;
  
  private Integer h;
  
  private v3 i;
  
  private boolean j;
  
  private boolean k;
  
  private boolean l;
  
  private boolean m;
  
  private boolean n;
  
  private n8 o;
  
  private hh2 p;
  
  private w1 q;
  
  public w(int paramInt, String paramString, q7 paramq7) {
    ic.a a1;
    if (ic.a.a) {
      a1 = new ic.a();
    } else {
      a1 = null;
    } 
    this.b = a1;
    this.f = new Object();
    this.j = true;
    boolean bool = false;
    this.k = false;
    this.l = false;
    this.m = false;
    this.n = false;
    this.p = null;
    this.c = paramInt;
    this.d = paramString;
    this.g = paramq7;
    this.o = new cl2();
    paramInt = bool;
    if (!TextUtils.isEmpty(paramString)) {
      Uri uri = Uri.parse(paramString);
      paramInt = bool;
      if (uri != null) {
        String str = uri.getHost();
        paramInt = bool;
        if (str != null)
          paramInt = str.hashCode(); 
      } 
    } 
    this.e = paramInt;
  }
  
  public final hh2 A() {
    return this.p;
  }
  
  public byte[] B() {
    return null;
  }
  
  public final boolean C() {
    return this.j;
  }
  
  public final int D() {
    return this.o.b();
  }
  
  public final n8 E() {
    return this.o;
  }
  
  public final void F() {
    synchronized (this.f) {
      this.l = true;
      return;
    } 
  }
  
  public final boolean G() {
    synchronized (this.f) {
      return this.l;
    } 
  }
  
  final void H() {
    synchronized (this.f) {
      w1 w11 = this.q;
      if (w11 != null)
        w11.a(this); 
      return;
    } 
  }
  
  public Map<String, String> a() {
    return Collections.emptyMap();
  }
  
  public final int e() {
    return this.c;
  }
  
  public final String f() {
    return this.d;
  }
  
  public final boolean i() {
    synchronized (this.f) {
      return false;
    } 
  }
  
  public final w<?> k(v3 paramv3) {
    this.i = paramv3;
    return this;
  }
  
  public final w<?> l(hh2 paramhh2) {
    this.p = paramhh2;
    return this;
  }
  
  protected abstract v4<T> m(kt2 paramkt2);
  
  final void n(w1 paramw1) {
    synchronized (this.f) {
      this.q = paramw1;
      return;
    } 
  }
  
  final void q(v4<?> paramv4) {
    synchronized (this.f) {
      w1 w11 = this.q;
      if (w11 != null)
        w11.b(this, paramv4); 
      return;
    } 
  }
  
  protected abstract void r(T paramT);
  
  public final void t(zzap paramzzap) {
    synchronized (this.f) {
      q7 q71 = this.g;
      if (q71 != null)
        q71.a(paramzzap); 
      return;
    } 
  }
  
  public String toString() {
    String str1 = String.valueOf(Integer.toHexString(this.e));
    if (str1.length() != 0) {
      str1 = "0x".concat(str1);
    } else {
      str1 = new String("0x");
    } 
    i();
    String str2 = this.d;
    String str3 = String.valueOf(zzac.c);
    String str4 = String.valueOf(this.h);
    StringBuilder stringBuilder = new StringBuilder("[ ] ".length() + 3 + String.valueOf(str2).length() + String.valueOf(str1).length() + str3.length() + str4.length());
    stringBuilder.append("[ ] ");
    stringBuilder.append(str2);
    stringBuilder.append(" ");
    stringBuilder.append(str1);
    stringBuilder.append(" ");
    stringBuilder.append(str3);
    stringBuilder.append(" ");
    stringBuilder.append(str4);
    return stringBuilder.toString();
  }
  
  public final void u(String paramString) {
    if (ic.a.a)
      this.b.a(paramString, Thread.currentThread().getId()); 
  }
  
  public final int v() {
    return this.e;
  }
  
  final void w(int paramInt) {
    v3 v31 = this.i;
    if (v31 != null)
      v31.b(this, paramInt); 
  }
  
  final void x(String paramString) {
    v3 v31 = this.i;
    if (v31 != null)
      v31.d(this); 
    if (ic.a.a) {
      long l = Thread.currentThread().getId();
      if (Looper.myLooper() != Looper.getMainLooper()) {
        (new Handler(Looper.getMainLooper())).post(new b(this, paramString, l));
        return;
      } 
      this.b.a(paramString, l);
      this.b.b(toString());
    } 
  }
  
  public final w<?> y(int paramInt) {
    this.h = Integer.valueOf(paramInt);
    return this;
  }
  
  public final String z() {
    String str1 = this.d;
    int i = this.c;
    String str2 = str1;
    if (i != 0)
      if (i == -1) {
        str2 = str1;
      } else {
        str2 = Integer.toString(i);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str1).length());
        stringBuilder.append(str2);
        stringBuilder.append('-');
        stringBuilder.append(str1);
        str2 = stringBuilder.toString();
      }  
    return str2;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */