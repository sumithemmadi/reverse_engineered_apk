package com.google.android.exoplayer2.text.s;

import android.text.Layout;
import android.text.TextUtils;
import com.google.android.exoplayer2.util.h0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public final class d {
  private String a;
  
  private String b;
  
  private List<String> c;
  
  private String d;
  
  private String e;
  
  private int f;
  
  private boolean g;
  
  private int h;
  
  private boolean i;
  
  private int j;
  
  private int k;
  
  private int l;
  
  private int m;
  
  private int n;
  
  private float o;
  
  private Layout.Alignment p;
  
  public d() {
    m();
  }
  
  private static int x(int paramInt1, String paramString1, String paramString2, int paramInt2) {
    if (!paramString1.isEmpty()) {
      int i = -1;
      if (paramInt1 != -1) {
        if (paramString1.equals(paramString2))
          i = paramInt1 + paramInt2; 
        return i;
      } 
    } 
    return paramInt1;
  }
  
  public int a() {
    if (this.i)
      return this.h; 
    throw new IllegalStateException("Background color not defined.");
  }
  
  public int b() {
    if (this.g)
      return this.f; 
    throw new IllegalStateException("Font color not defined");
  }
  
  public String c() {
    return this.e;
  }
  
  public float d() {
    return this.o;
  }
  
  public int e() {
    return this.n;
  }
  
  public int f(String paramString1, String paramString2, String[] paramArrayOfString, String paramString3) {
    if (this.a.isEmpty() && this.b.isEmpty() && this.c.isEmpty() && this.d.isEmpty())
      return TextUtils.isEmpty(paramString2); 
    int i = x(x(x(0, this.a, paramString1, 1073741824), this.b, paramString2, 2), this.d, paramString3, 4);
    return (i == -1 || !Arrays.<String>asList(paramArrayOfString).containsAll(this.c)) ? 0 : (i + this.c.size() * 4);
  }
  
  public int g() {
    int i = this.l;
    if (i == -1 && this.m == -1)
      return -1; 
    byte b = 0;
    if (i == 1) {
      i = 1;
    } else {
      i = 0;
    } 
    if (this.m == 1)
      b = 2; 
    return i | b;
  }
  
  public Layout.Alignment h() {
    return this.p;
  }
  
  public boolean i() {
    return this.i;
  }
  
  public boolean j() {
    return this.g;
  }
  
  public boolean k() {
    int i = this.j;
    boolean bool = true;
    if (i != 1)
      bool = false; 
    return bool;
  }
  
  public boolean l() {
    int i = this.k;
    boolean bool = true;
    if (i != 1)
      bool = false; 
    return bool;
  }
  
  @EnsuresNonNull({"targetId", "targetTag", "targetClasses", "targetVoice"})
  public void m() {
    this.a = "";
    this.b = "";
    this.c = Collections.emptyList();
    this.d = "";
    this.e = null;
    this.g = false;
    this.i = false;
    this.j = -1;
    this.k = -1;
    this.l = -1;
    this.m = -1;
    this.n = -1;
    this.p = null;
  }
  
  public d n(int paramInt) {
    this.h = paramInt;
    this.i = true;
    return this;
  }
  
  public d o(boolean paramBoolean) {
    this.l = paramBoolean;
    return this;
  }
  
  public d p(int paramInt) {
    this.f = paramInt;
    this.g = true;
    return this;
  }
  
  public d q(String paramString) {
    this.e = h0.u0(paramString);
    return this;
  }
  
  public d r(boolean paramBoolean) {
    this.m = paramBoolean;
    return this;
  }
  
  public void s(String[] paramArrayOfString) {
    this.c = Arrays.asList(paramArrayOfString);
  }
  
  public void t(String paramString) {
    this.a = paramString;
  }
  
  public void u(String paramString) {
    this.b = paramString;
  }
  
  public void v(String paramString) {
    this.d = paramString;
  }
  
  public d w(boolean paramBoolean) {
    this.k = paramBoolean;
    return this;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/text/s/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */