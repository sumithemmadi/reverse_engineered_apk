package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.b1;
import com.google.android.gms.ads.internal.util.q;
import com.google.android.gms.common.internal.t;

public final class z9 extends vm<u8> {
  private final Object c = new Object();
  
  private q<u8> d;
  
  private boolean e;
  
  private int f;
  
  public z9(q<u8> paramq) {
    this.d = paramq;
    this.e = false;
    this.f = 0;
  }
  
  private final void j() {
    synchronized (this.c) {
      boolean bool;
      if (this.f >= 0) {
        bool = true;
      } else {
        bool = false;
      } 
      t.m(bool);
      if (this.e && this.f == 0) {
        b1.m("No reference is left (including root). Cleaning up engine.");
        ea ea = new ea();
        this(this);
        tm tm = new tm();
        this();
        d(ea, tm);
      } else {
        b1.m("There are still references to the engine. Not destroying.");
      } 
      return;
    } 
  }
  
  public final v9 g() {
    v9 v9 = new v9(this);
    synchronized (this.c) {
      boolean bool;
      ca ca = new ca();
      this(this, v9);
      ba ba = new ba();
      this(this, v9);
      d(ca, ba);
      if (this.f >= 0) {
        bool = true;
      } else {
        bool = false;
      } 
      t.m(bool);
      this.f++;
      return v9;
    } 
  }
  
  protected final void h() {
    synchronized (this.c) {
      boolean bool;
      if (this.f > 0) {
        bool = true;
      } else {
        bool = false;
      } 
      t.m(bool);
      b1.m("Releasing 1 reference for JS Engine");
      this.f--;
      j();
      return;
    } 
  }
  
  public final void i() {
    synchronized (this.c) {
      boolean bool;
      if (this.f >= 0) {
        bool = true;
      } else {
        bool = false;
      } 
      t.m(bool);
      b1.m("Releasing root reference. JS Engine will be destroyed once other references are released.");
      this.e = true;
      j();
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/z9.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */