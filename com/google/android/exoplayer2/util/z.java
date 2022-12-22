package com.google.android.exoplayer2.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class z {
  private static final Comparator<b> a = b.b;
  
  private static final Comparator<b> b = c.b;
  
  private final int c;
  
  private final ArrayList<b> d;
  
  private final b[] e;
  
  private int f;
  
  private int g;
  
  private int h;
  
  private int i;
  
  public z(int paramInt) {
    this.c = paramInt;
    this.e = new b[5];
    this.d = new ArrayList<b>();
    this.f = -1;
  }
  
  private void b() {
    if (this.f != 1) {
      Collections.sort(this.d, a);
      this.f = 1;
    } 
  }
  
  private void c() {
    if (this.f != 0) {
      Collections.sort(this.d, b);
      this.f = 0;
    } 
  }
  
  public void a(int paramInt, float paramFloat) {
    b b1;
    b();
    int i = this.i;
    if (i > 0) {
      b[] arrayOfB = this.e;
      this.i = --i;
      b1 = arrayOfB[i];
    } else {
      b1 = new b(null);
    } 
    i = this.g;
    this.g = i + 1;
    b1.a = i;
    b1.b = paramInt;
    b1.c = paramFloat;
    this.d.add(b1);
    this.h += paramInt;
    while (true) {
      i = this.h;
      paramInt = this.c;
      if (i > paramInt) {
        paramInt = i - paramInt;
        b b2 = this.d.get(0);
        i = b2.b;
        if (i <= paramInt) {
          this.h -= i;
          this.d.remove(0);
          paramInt = this.i;
          if (paramInt < 5) {
            b[] arrayOfB = this.e;
            this.i = paramInt + 1;
            arrayOfB[paramInt] = b2;
          } 
          continue;
        } 
        b2.b = i - paramInt;
        this.h -= paramInt;
        continue;
      } 
      break;
    } 
  }
  
  public float d(float paramFloat) {
    c();
    float f = this.h;
    byte b1 = 0;
    int i = 0;
    while (b1 < this.d.size()) {
      b b2 = this.d.get(b1);
      i += b2.b;
      if (i >= paramFloat * f)
        return b2.c; 
      b1++;
    } 
    if (this.d.isEmpty()) {
      paramFloat = Float.NaN;
    } else {
      ArrayList<b> arrayList = this.d;
      paramFloat = ((b)arrayList.get(arrayList.size() - 1)).c;
    } 
    return paramFloat;
  }
  
  public void g() {
    this.d.clear();
    this.f = -1;
    this.g = 0;
    this.h = 0;
  }
  
  private static class b {
    public int a;
    
    public int b;
    
    public float c;
    
    private b() {}
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/util/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */