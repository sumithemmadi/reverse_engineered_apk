package com.google.android.exoplayer2.text;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.s0;
import com.google.android.exoplayer2.u;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.h0;
import com.google.android.exoplayer2.util.r;
import java.util.Collections;
import java.util.List;

public final class k extends u implements Handler.Callback {
  private final Handler m;
  
  private final j n;
  
  private final g o;
  
  private final f0 p;
  
  private boolean q;
  
  private boolean r;
  
  private int s;
  
  private Format t;
  
  private f u;
  
  private h v;
  
  private i w;
  
  private i x;
  
  private int y;
  
  public k(j paramj, Looper paramLooper) {
    this(paramj, paramLooper, g.a);
  }
  
  public k(j paramj, Looper paramLooper, g paramg) {
    super(3);
    Handler handler;
    this.n = (j)e.e(paramj);
    if (paramLooper == null) {
      paramj = null;
    } else {
      handler = h0.s(paramLooper, this);
    } 
    this.m = handler;
    this.o = paramg;
    this.p = new f0();
  }
  
  private void O() {
    U(Collections.emptyList());
  }
  
  private long P() {
    int m = this.y;
    return (m == -1 || m >= this.w.i()) ? Long.MAX_VALUE : this.w.e(this.y);
  }
  
  private void Q(List<b> paramList) {
    this.n.h(paramList);
  }
  
  private void R() {
    this.v = null;
    this.y = -1;
    i i1 = this.w;
    if (i1 != null) {
      i1.release();
      this.w = null;
    } 
    i1 = this.x;
    if (i1 != null) {
      i1.release();
      this.x = null;
    } 
  }
  
  private void S() {
    R();
    this.u.a();
    this.u = null;
    this.s = 0;
  }
  
  private void T() {
    S();
    this.u = this.o.a(this.t);
  }
  
  private void U(List<b> paramList) {
    Handler handler = this.m;
    if (handler != null) {
      handler.obtainMessage(0, paramList).sendToTarget();
    } else {
      Q(paramList);
    } 
  }
  
  protected void E() {
    this.t = null;
    O();
    S();
  }
  
  protected void G(long paramLong, boolean paramBoolean) {
    O();
    this.q = false;
    this.r = false;
    if (this.s != 0) {
      T();
    } else {
      R();
      this.u.flush();
    } 
  }
  
  protected void K(Format[] paramArrayOfFormat, long paramLong) {
    Format format = paramArrayOfFormat[0];
    this.t = format;
    if (this.u != null) {
      this.s = 1;
    } else {
      this.u = this.o.a(format);
    } 
  }
  
  public int b(Format paramFormat) {
    if (this.o.b(paramFormat)) {
      byte b;
      if (u.N(null, paramFormat.m)) {
        b = 4;
      } else {
        b = 2;
      } 
      return s0.a(b);
    } 
    return r.m(paramFormat.j) ? s0.a(1) : s0.a(0);
  }
  
  public boolean handleMessage(Message paramMessage) {
    if (paramMessage.what == 0) {
      Q((List<b>)paramMessage.obj);
      return true;
    } 
    throw new IllegalStateException();
  }
  
  public boolean m() {
    return true;
  }
  
  public boolean o() {
    return this.r;
  }
  
  public void w(long paramLong1, long paramLong2) {
    int m;
    if (this.r)
      return; 
    if (this.x == null) {
      this.u.b(paramLong1);
      try {
        this.x = (i)this.u.c();
      } catch (SubtitleDecoderException subtitleDecoderException) {
        throw f(subtitleDecoderException, this.t);
      } 
    } 
    if (getState() != 2)
      return; 
    if (this.w != null) {
      paramLong2 = P();
      for (m = 0; paramLong2 <= paramLong1; m = 1) {
        this.y++;
        paramLong2 = P();
      } 
    } else {
      m = 0;
    } 
    i i1 = this.x;
    int n = m;
    if (i1 != null)
      if (i1.isEndOfStream()) {
        n = m;
        if (!m) {
          n = m;
          if (P() == Long.MAX_VALUE)
            if (this.s == 2) {
              T();
              n = m;
            } else {
              R();
              this.r = true;
              n = m;
            }  
        } 
      } else {
        n = m;
        if (this.x.timeUs <= paramLong1) {
          i1 = this.w;
          if (i1 != null)
            i1.release(); 
          i1 = this.x;
          this.w = i1;
          this.x = null;
          this.y = i1.a(paramLong1);
          n = 1;
        } 
      }  
    if (n)
      U(this.w.f(paramLong1)); 
    if (this.s == 2)
      return; 
    try {
      while (!this.q) {
        if (this.v == null) {
          h h1 = (h)this.u.d();
          this.v = h1;
          if (h1 == null)
            return; 
        } 
        if (this.s == 1) {
          this.v.setFlags(4);
          this.u.e(this.v);
          this.v = null;
          this.s = 2;
          return;
        } 
        m = L(this.p, this.v, false);
        if (m == -4) {
          if (this.v.isEndOfStream()) {
            this.q = true;
          } else {
            h h1 = this.v;
            h1.g = this.p.c.n;
            h1.m();
          } 
          this.u.e(this.v);
          this.v = null;
          continue;
        } 
        if (m == -3)
          break; 
      } 
      return;
    } catch (SubtitleDecoderException subtitleDecoderException) {
      ExoPlaybackException exoPlaybackException = f(subtitleDecoderException, this.t);
      throw exoPlaybackException;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/text/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */