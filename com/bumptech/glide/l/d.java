package com.bumptech.glide.l;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

public class d {
  private final byte[] a = new byte[256];
  
  private ByteBuffer b;
  
  private c c;
  
  private int d = 0;
  
  private boolean b() {
    boolean bool;
    if (this.c.b != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private int d() {
    boolean bool;
    try {
      byte b = this.b.get();
      bool = b & 0xFF;
    } catch (Exception exception) {
      this.c.b = 1;
      bool = false;
    } 
    return bool;
  }
  
  private void e() {
    boolean bool2;
    this.c.d.a = n();
    this.c.d.b = n();
    this.c.d.c = n();
    this.c.d.d = n();
    int i = d();
    boolean bool1 = false;
    if ((i & 0x80) != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    int j = (int)Math.pow(2.0D, ((i & 0x7) + 1));
    b b = this.c.d;
    if ((i & 0x40) != 0)
      bool1 = true; 
    b.e = bool1;
    if (bool2) {
      b.k = g(j);
    } else {
      b.k = null;
    } 
    this.c.d.j = this.b.position();
    r();
    if (b())
      return; 
    c c1 = this.c;
    c1.c++;
    c1.e.add(c1.d);
  }
  
  private void f() {
    int i = d();
    this.d = i;
    if (i > 0) {
      int j = 0;
      i = 0;
      while (true) {
        int k = i;
        try {
          i = this.d;
          if (j < i) {
            i -= j;
            k = i;
            this.b.get(this.a, j, i);
            j += i;
            continue;
          } 
          break;
        } catch (Exception exception) {
          if (Log.isLoggable("GifHeaderParser", 3)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error Reading Block n: ");
            stringBuilder.append(j);
            stringBuilder.append(" count: ");
            stringBuilder.append(k);
            stringBuilder.append(" blockSize: ");
            stringBuilder.append(this.d);
            Log.d("GifHeaderParser", stringBuilder.toString(), exception);
          } 
          this.c.b = 1;
        } 
        return;
      } 
    } 
  }
  
  private int[] g(int paramInt) {
    byte[] arrayOfByte = new byte[paramInt * 3];
    int[] arrayOfInt1 = null;
    int[] arrayOfInt2 = arrayOfInt1;
    try {
      this.b.get(arrayOfByte);
      arrayOfInt2 = arrayOfInt1;
      arrayOfInt1 = new int[256];
      byte b = 0;
      int i = 0;
      while (true) {
        arrayOfInt2 = arrayOfInt1;
        if (b < paramInt) {
          int j = i + 1;
          i = arrayOfByte[i];
          int k = j + 1;
          arrayOfInt1[b] = (i & 0xFF) << 16 | 0xFF000000 | (arrayOfByte[j] & 0xFF) << 8 | arrayOfByte[k] & 0xFF;
          i = k + 1;
          b++;
          continue;
        } 
        break;
      } 
    } catch (BufferUnderflowException bufferUnderflowException) {
      if (Log.isLoggable("GifHeaderParser", 3))
        Log.d("GifHeaderParser", "Format Error Reading Color Table", bufferUnderflowException); 
      this.c.b = 1;
    } 
    return arrayOfInt2;
  }
  
  private void h() {
    i(2147483647);
  }
  
  private void i(int paramInt) {
    boolean bool = false;
    while (!bool && !b() && this.c.c <= paramInt) {
      int i = d();
      if (i != 33) {
        if (i != 44) {
          if (i != 59) {
            this.c.b = 1;
            continue;
          } 
          bool = true;
          continue;
        } 
        c c1 = this.c;
        if (c1.d == null)
          c1.d = new b(); 
        e();
        continue;
      } 
      i = d();
      if (i != 1) {
        if (i != 249) {
          if (i != 254) {
            if (i != 255) {
              q();
              continue;
            } 
            f();
            StringBuilder stringBuilder = new StringBuilder();
            for (i = 0; i < 11; i++)
              stringBuilder.append((char)this.a[i]); 
            if (stringBuilder.toString().equals("NETSCAPE2.0")) {
              m();
              continue;
            } 
            q();
            continue;
          } 
          q();
          continue;
        } 
        this.c.d = new b();
        j();
        continue;
      } 
      q();
    } 
  }
  
  private void j() {
    d();
    int i = d();
    b b = this.c.d;
    int j = (i & 0x1C) >> 2;
    b.g = j;
    boolean bool = true;
    if (j == 0)
      b.g = 1; 
    if ((i & 0x1) == 0)
      bool = false; 
    b.f = bool;
    i = n();
    j = i;
    if (i < 2)
      j = 10; 
    b = this.c.d;
    b.i = j * 10;
    b.h = d();
    d();
  }
  
  private void k() {
    StringBuilder stringBuilder = new StringBuilder();
    for (byte b = 0; b < 6; b++)
      stringBuilder.append((char)d()); 
    if (!stringBuilder.toString().startsWith("GIF")) {
      this.c.b = 1;
      return;
    } 
    l();
    if (this.c.h && !b()) {
      c c1 = this.c;
      c1.a = g(c1.i);
      c1 = this.c;
      c1.l = c1.a[c1.j];
    } 
  }
  
  private void l() {
    boolean bool;
    this.c.f = n();
    this.c.g = n();
    int i = d();
    c c1 = this.c;
    if ((i & 0x80) != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    c1.h = bool;
    c1.i = (int)Math.pow(2.0D, ((i & 0x7) + 1));
    this.c.j = d();
    this.c.k = d();
  }
  
  private void m() {
    do {
      f();
      byte[] arrayOfByte = this.a;
      if (arrayOfByte[0] != 1)
        continue; 
      byte b1 = arrayOfByte[1];
      byte b2 = arrayOfByte[2];
      this.c.m = (b2 & 0xFF) << 8 | b1 & 0xFF;
    } while (this.d > 0 && !b());
  }
  
  private int n() {
    return this.b.getShort();
  }
  
  private void o() {
    this.b = null;
    Arrays.fill(this.a, (byte)0);
    this.c = new c();
    this.d = 0;
  }
  
  private void q() {
    int i;
    do {
      i = d();
      int j = Math.min(this.b.position() + i, this.b.limit());
      this.b.position(j);
    } while (i > 0);
  }
  
  private void r() {
    d();
    q();
  }
  
  public void a() {
    this.b = null;
    this.c = null;
  }
  
  public c c() {
    if (this.b != null) {
      if (b())
        return this.c; 
      k();
      if (!b()) {
        h();
        c c1 = this.c;
        if (c1.c < 0)
          c1.b = 1; 
      } 
      return this.c;
    } 
    throw new IllegalStateException("You must call setData() before parseHeader()");
  }
  
  public d p(ByteBuffer paramByteBuffer) {
    o();
    paramByteBuffer = paramByteBuffer.asReadOnlyBuffer();
    this.b = paramByteBuffer;
    paramByteBuffer.position(0);
    this.b.order(ByteOrder.LITTLE_ENDIAN);
    return this;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/l/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */