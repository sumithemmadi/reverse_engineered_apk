package com.google.android.exoplayer2.c1.d0;

import android.util.SparseArray;
import com.google.android.exoplayer2.c1.j;
import com.google.android.exoplayer2.util.e0;
import com.google.android.exoplayer2.util.v;
import java.util.Collections;
import java.util.List;

public interface h0 {
  void a(e0 parame0, j paramj, d paramd);
  
  void b(v paramv, int paramInt);
  
  void c();
  
  public static final class a {
    public final String a;
    
    public final int b;
    
    public final byte[] c;
    
    public a(String param1String, int param1Int, byte[] param1ArrayOfbyte) {
      this.a = param1String;
      this.b = param1Int;
      this.c = param1ArrayOfbyte;
    }
  }
  
  public static final class b {
    public final int a;
    
    public final String b;
    
    public final List<h0.a> c;
    
    public final byte[] d;
    
    public b(int param1Int, String param1String, List<h0.a> param1List, byte[] param1ArrayOfbyte) {
      List<h0.a> list;
      this.a = param1Int;
      this.b = param1String;
      if (param1List == null) {
        list = Collections.emptyList();
      } else {
        list = Collections.unmodifiableList(param1List);
      } 
      this.c = list;
      this.d = param1ArrayOfbyte;
    }
  }
  
  public static interface c {
    h0 a(int param1Int, h0.b param1b);
    
    SparseArray<h0> b();
  }
  
  public static final class d {
    private final String a;
    
    private final int b;
    
    private final int c;
    
    private int d;
    
    private String e;
    
    public d(int param1Int1, int param1Int2) {
      this(-2147483648, param1Int1, param1Int2);
    }
    
    public d(int param1Int1, int param1Int2, int param1Int3) {
      String str;
      if (param1Int1 != Integer.MIN_VALUE) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(param1Int1);
        stringBuilder.append("/");
        str = stringBuilder.toString();
      } else {
        str = "";
      } 
      this.a = str;
      this.b = param1Int2;
      this.c = param1Int3;
      this.d = Integer.MIN_VALUE;
    }
    
    private void d() {
      if (this.d != Integer.MIN_VALUE)
        return; 
      throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
    }
    
    public void a() {
      int i = this.d;
      if (i == Integer.MIN_VALUE) {
        i = this.b;
      } else {
        i += this.c;
      } 
      this.d = i;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(this.a);
      stringBuilder.append(this.d);
      this.e = stringBuilder.toString();
    }
    
    public String b() {
      d();
      return this.e;
    }
    
    public int c() {
      d();
      return this.d;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/c1/d0/h0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */