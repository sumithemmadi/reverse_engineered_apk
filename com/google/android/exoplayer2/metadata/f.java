package com.google.android.exoplayer2.metadata;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.s0;
import com.google.android.exoplayer2.u;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.h0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class f extends u implements Handler.Callback {
  private final c m;
  
  private final e n;
  
  private final Handler o;
  
  private final d p;
  
  private final Metadata[] q;
  
  private final long[] r;
  
  private int s;
  
  private int t;
  
  private b u;
  
  private boolean v;
  
  private long w;
  
  public f(e parame, Looper paramLooper) {
    this(parame, paramLooper, c.a);
  }
  
  public f(e parame, Looper paramLooper, c paramc) {
    super(4);
    Handler handler;
    this.n = (e)e.e(parame);
    if (paramLooper == null) {
      parame = null;
    } else {
      handler = h0.s(paramLooper, this);
    } 
    this.o = handler;
    this.m = (c)e.e(paramc);
    this.p = new d();
    this.q = new Metadata[5];
    this.r = new long[5];
  }
  
  private void O(Metadata paramMetadata, List<Metadata.Entry> paramList) {
    for (byte b1 = 0; b1 < paramMetadata.d(); b1++) {
      Format format = paramMetadata.c(b1).A();
      if (format != null && this.m.b(format)) {
        b b2 = this.m.a(format);
        byte[] arrayOfByte = (byte[])e.e(paramMetadata.c(b1).l0());
        this.p.clear();
        this.p.l(arrayOfByte.length);
        ((ByteBuffer)h0.g(this.p.c)).put(arrayOfByte);
        this.p.m();
        Metadata metadata = b2.a(this.p);
        if (metadata != null)
          O(metadata, paramList); 
      } else {
        paramList.add(paramMetadata.c(b1));
      } 
    } 
  }
  
  private void P() {
    Arrays.fill((Object[])this.q, (Object)null);
    this.s = 0;
    this.t = 0;
  }
  
  private void Q(Metadata paramMetadata) {
    Handler handler = this.o;
    if (handler != null) {
      handler.obtainMessage(0, paramMetadata).sendToTarget();
    } else {
      R(paramMetadata);
    } 
  }
  
  private void R(Metadata paramMetadata) {
    this.n.n(paramMetadata);
  }
  
  protected void E() {
    P();
    this.u = null;
  }
  
  protected void G(long paramLong, boolean paramBoolean) {
    P();
    this.v = false;
  }
  
  protected void K(Format[] paramArrayOfFormat, long paramLong) {
    this.u = this.m.a(paramArrayOfFormat[0]);
  }
  
  public int b(Format paramFormat) {
    if (this.m.b(paramFormat)) {
      byte b1;
      if (u.N(null, paramFormat.m)) {
        b1 = 4;
      } else {
        b1 = 2;
      } 
      return s0.a(b1);
    } 
    return s0.a(0);
  }
  
  public boolean handleMessage(Message paramMessage) {
    if (paramMessage.what == 0) {
      R((Metadata)paramMessage.obj);
      return true;
    } 
    throw new IllegalStateException();
  }
  
  public boolean m() {
    return true;
  }
  
  public boolean o() {
    return this.v;
  }
  
  public void w(long paramLong1, long paramLong2) {
    if (!this.v && this.t < 5) {
      Metadata metadata;
      this.p.clear();
      f0 f0 = h();
      int i = L(f0, this.p, false);
      if (i == -4) {
        if (this.p.isEndOfStream()) {
          this.v = true;
        } else if (!this.p.isDecodeOnly()) {
          d d1 = this.p;
          d1.g = this.w;
          d1.m();
          Metadata metadata1 = ((b)h0.g(this.u)).a(this.p);
          if (metadata1 != null) {
            ArrayList<Metadata.Entry> arrayList = new ArrayList(metadata1.d());
            O(metadata1, arrayList);
            if (!arrayList.isEmpty()) {
              metadata = new Metadata(arrayList);
              int j = this.s;
              i = this.t;
              j = (j + i) % 5;
              this.q[j] = metadata;
              this.r[j] = this.p.d;
              this.t = i + 1;
            } 
          } 
        } 
      } else if (i == -5) {
        this.w = ((Format)e.e(((f0)metadata).c)).n;
      } 
    } 
    if (this.t > 0) {
      long[] arrayOfLong = this.r;
      int i = this.s;
      if (arrayOfLong[i] <= paramLong1) {
        Q((Metadata)h0.g(this.q[i]));
        Metadata[] arrayOfMetadata = this.q;
        i = this.s;
        arrayOfMetadata[i] = null;
        this.s = (i + 1) % 5;
        this.t--;
      } 
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/metadata/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */