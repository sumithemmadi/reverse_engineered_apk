package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.util.h0;
import java.util.ArrayList;
import java.util.Map;

public abstract class g implements j {
  private final boolean b;
  
  private final ArrayList<x> c;
  
  private int d;
  
  private l e;
  
  protected g(boolean paramBoolean) {
    this.b = paramBoolean;
    this.c = new ArrayList<x>(1);
  }
  
  protected final void a(int paramInt) {
    l l1 = (l)h0.g(this.e);
    for (byte b = 0; b < this.d; b++)
      ((x)this.c.get(b)).f(this, l1, this.b, paramInt); 
  }
  
  protected final void b() {
    l l1 = (l)h0.g(this.e);
    for (byte b = 0; b < this.d; b++)
      ((x)this.c.get(b)).a(this, l1, this.b); 
    this.e = null;
  }
  
  protected final void c(l paraml) {
    for (byte b = 0; b < this.d; b++)
      ((x)this.c.get(b)).h(this, paraml, this.b); 
  }
  
  protected final void d(l paraml) {
    this.e = paraml;
    for (byte b = 0; b < this.d; b++)
      ((x)this.c.get(b)).b(this, paraml, this.b); 
  }
  
  public final void f0(x paramx) {
    if (!this.c.contains(paramx)) {
      this.c.add(paramx);
      this.d++;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/upstream/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */