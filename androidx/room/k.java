package androidx.room;

import b.r.a.d;
import b.r.a.e;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class k implements e, d {
  static final TreeMap<Integer, k> b = new TreeMap<Integer, k>();
  
  private volatile String c;
  
  final long[] d;
  
  final double[] e;
  
  final String[] f;
  
  final byte[][] g;
  
  private final int[] h;
  
  final int i;
  
  int j;
  
  private k(int paramInt) {
    this.i = paramInt;
    this.h = new int[++paramInt];
    this.d = new long[paramInt];
    this.e = new double[paramInt];
    this.f = new String[paramInt];
    this.g = new byte[paramInt][];
  }
  
  public static k d(String paramString, int paramInt) {
    TreeMap<Integer, k> treeMap;
    k k1;
    synchronized (b) {
      Map.Entry<Integer, k> entry = treeMap.ceilingEntry(Integer.valueOf(paramInt));
      if (entry != null) {
        treeMap.remove(entry.getKey());
        k k2 = entry.getValue();
        k2.e(paramString, paramInt);
        return k2;
      } 
      k1 = new k(paramInt);
      k1.e(paramString, paramInt);
      return k1;
    } 
  }
  
  private static void g() {
    TreeMap<Integer, k> treeMap = b;
    if (treeMap.size() > 15) {
      int i = treeMap.size() - 10;
      Iterator iterator = treeMap.descendingKeySet().iterator();
      while (i > 0) {
        iterator.next();
        iterator.remove();
        i--;
      } 
    } 
  }
  
  public void I(int paramInt, long paramLong) {
    this.h[paramInt] = 2;
    this.d[paramInt] = paramLong;
  }
  
  public void O(int paramInt, byte[] paramArrayOfbyte) {
    this.h[paramInt] = 5;
    this.g[paramInt] = paramArrayOfbyte;
  }
  
  public void Y(int paramInt) {
    this.h[paramInt] = 1;
  }
  
  public String b() {
    return this.c;
  }
  
  public void c(d paramd) {
    for (byte b = 1; b <= this.j; b++) {
      int i = this.h[b];
      if (i != 1) {
        if (i != 2) {
          if (i != 3) {
            if (i != 4) {
              if (i == 5)
                paramd.O(b, this.g[b]); 
            } else {
              paramd.n(b, this.f[b]);
            } 
          } else {
            paramd.w(b, this.e[b]);
          } 
        } else {
          paramd.I(b, this.d[b]);
        } 
      } else {
        paramd.Y(b);
      } 
    } 
  }
  
  public void close() {}
  
  void e(String paramString, int paramInt) {
    this.c = paramString;
    this.j = paramInt;
  }
  
  public void h() {
    synchronized (b) {
      null.put(Integer.valueOf(this.i), this);
      g();
      return;
    } 
  }
  
  public void n(int paramInt, String paramString) {
    this.h[paramInt] = 4;
    this.f[paramInt] = paramString;
  }
  
  public void w(int paramInt, double paramDouble) {
    this.h[paramInt] = 3;
    this.e[paramInt] = paramDouble;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/room/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */