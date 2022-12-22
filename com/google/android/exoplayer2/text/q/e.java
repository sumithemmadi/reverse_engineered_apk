package com.google.android.exoplayer2.text.q;

import android.text.Layout;

final class e {
  private String a;
  
  private int b;
  
  private boolean c;
  
  private int d;
  
  private boolean e;
  
  private int f = -1;
  
  private int g = -1;
  
  private int h = -1;
  
  private int i = -1;
  
  private int j = -1;
  
  private float k;
  
  private String l;
  
  private e m;
  
  private Layout.Alignment n;
  
  private e l(e parame, boolean paramBoolean) {
    if (parame != null) {
      if (!this.c && parame.c)
        q(parame.b); 
      if (this.h == -1)
        this.h = parame.h; 
      if (this.i == -1)
        this.i = parame.i; 
      if (this.a == null)
        this.a = parame.a; 
      if (this.f == -1)
        this.f = parame.f; 
      if (this.g == -1)
        this.g = parame.g; 
      if (this.n == null)
        this.n = parame.n; 
      if (this.j == -1) {
        this.j = parame.j;
        this.k = parame.k;
      } 
      if (paramBoolean && !this.e && parame.e)
        o(parame.d); 
    } 
    return this;
  }
  
  public e a(e parame) {
    return l(parame, true);
  }
  
  public int b() {
    if (this.e)
      return this.d; 
    throw new IllegalStateException("Background color has not been defined.");
  }
  
  public int c() {
    if (this.c)
      return this.b; 
    throw new IllegalStateException("Font color has not been defined.");
  }
  
  public String d() {
    return this.a;
  }
  
  public float e() {
    return this.k;
  }
  
  public int f() {
    return this.j;
  }
  
  public String g() {
    return this.l;
  }
  
  public int h() {
    int i = this.h;
    if (i == -1 && this.i == -1)
      return -1; 
    byte b = 0;
    if (i == 1) {
      i = 1;
    } else {
      i = 0;
    } 
    if (this.i == 1)
      b = 2; 
    return i | b;
  }
  
  public Layout.Alignment i() {
    return this.n;
  }
  
  public boolean j() {
    return this.e;
  }
  
  public boolean k() {
    return this.c;
  }
  
  public boolean m() {
    int i = this.f;
    boolean bool = true;
    if (i != 1)
      bool = false; 
    return bool;
  }
  
  public boolean n() {
    int i = this.g;
    boolean bool = true;
    if (i != 1)
      bool = false; 
    return bool;
  }
  
  public e o(int paramInt) {
    this.d = paramInt;
    this.e = true;
    return this;
  }
  
  public e p(boolean paramBoolean) {
    boolean bool;
    if (this.m == null) {
      bool = true;
    } else {
      bool = false;
    } 
    com.google.android.exoplayer2.util.e.f(bool);
    this.h = paramBoolean;
    return this;
  }
  
  public e q(int paramInt) {
    boolean bool;
    if (this.m == null) {
      bool = true;
    } else {
      bool = false;
    } 
    com.google.android.exoplayer2.util.e.f(bool);
    this.b = paramInt;
    this.c = true;
    return this;
  }
  
  public e r(String paramString) {
    boolean bool;
    if (this.m == null) {
      bool = true;
    } else {
      bool = false;
    } 
    com.google.android.exoplayer2.util.e.f(bool);
    this.a = paramString;
    return this;
  }
  
  public e s(float paramFloat) {
    this.k = paramFloat;
    return this;
  }
  
  public e t(int paramInt) {
    this.j = paramInt;
    return this;
  }
  
  public e u(String paramString) {
    this.l = paramString;
    return this;
  }
  
  public e v(boolean paramBoolean) {
    boolean bool;
    if (this.m == null) {
      bool = true;
    } else {
      bool = false;
    } 
    com.google.android.exoplayer2.util.e.f(bool);
    this.i = paramBoolean;
    return this;
  }
  
  public e w(boolean paramBoolean) {
    boolean bool;
    if (this.m == null) {
      bool = true;
    } else {
      bool = false;
    } 
    com.google.android.exoplayer2.util.e.f(bool);
    this.f = paramBoolean;
    return this;
  }
  
  public e x(Layout.Alignment paramAlignment) {
    this.n = paramAlignment;
    return this;
  }
  
  public e y(boolean paramBoolean) {
    boolean bool;
    if (this.m == null) {
      bool = true;
    } else {
      bool = false;
    } 
    com.google.android.exoplayer2.util.e.f(bool);
    this.g = paramBoolean;
    return this;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/text/q/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */