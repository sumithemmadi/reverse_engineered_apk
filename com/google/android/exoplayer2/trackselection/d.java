package com.google.android.exoplayer2.trackselection;

import android.util.Pair;
import com.google.android.exoplayer2.s0;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.v;
import com.google.android.exoplayer2.t0;
import com.google.android.exoplayer2.u0;
import com.google.android.exoplayer2.util.h0;
import com.google.android.exoplayer2.util.r;
import com.google.android.exoplayer2.y0;

public abstract class d extends h {
  private a c;
  
  private static int e(t0[] paramArrayOft0, TrackGroup paramTrackGroup, int[] paramArrayOfint, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: arraylength
    //   2: istore #4
    //   4: iconst_0
    //   5: istore #5
    //   7: iconst_0
    //   8: istore #6
    //   10: iconst_1
    //   11: istore #7
    //   13: iload #5
    //   15: aload_0
    //   16: arraylength
    //   17: if_icmpge -> 192
    //   20: aload_0
    //   21: iload #5
    //   23: aaload
    //   24: astore #8
    //   26: iconst_0
    //   27: istore #9
    //   29: iconst_0
    //   30: istore #10
    //   32: iload #9
    //   34: aload_1
    //   35: getfield b : I
    //   38: if_icmpge -> 70
    //   41: iload #10
    //   43: aload #8
    //   45: aload_1
    //   46: iload #9
    //   48: invokevirtual a : (I)Lcom/google/android/exoplayer2/Format;
    //   51: invokeinterface b : (Lcom/google/android/exoplayer2/Format;)I
    //   56: invokestatic d : (I)I
    //   59: invokestatic max : (II)I
    //   62: istore #10
    //   64: iinc #9, 1
    //   67: goto -> 32
    //   70: aload_2
    //   71: iload #5
    //   73: iaload
    //   74: ifne -> 83
    //   77: iconst_1
    //   78: istore #9
    //   80: goto -> 86
    //   83: iconst_0
    //   84: istore #9
    //   86: iload #10
    //   88: iload #6
    //   90: if_icmpgt -> 162
    //   93: iload #4
    //   95: istore #11
    //   97: iload #6
    //   99: istore #12
    //   101: iload #7
    //   103: istore #13
    //   105: iload #10
    //   107: iload #6
    //   109: if_icmpne -> 174
    //   112: iload #4
    //   114: istore #11
    //   116: iload #6
    //   118: istore #12
    //   120: iload #7
    //   122: istore #13
    //   124: iload_3
    //   125: ifeq -> 174
    //   128: iload #4
    //   130: istore #11
    //   132: iload #6
    //   134: istore #12
    //   136: iload #7
    //   138: istore #13
    //   140: iload #7
    //   142: ifne -> 174
    //   145: iload #4
    //   147: istore #11
    //   149: iload #6
    //   151: istore #12
    //   153: iload #7
    //   155: istore #13
    //   157: iload #9
    //   159: ifeq -> 174
    //   162: iload #5
    //   164: istore #11
    //   166: iload #9
    //   168: istore #13
    //   170: iload #10
    //   172: istore #12
    //   174: iinc #5, 1
    //   177: iload #11
    //   179: istore #4
    //   181: iload #12
    //   183: istore #6
    //   185: iload #13
    //   187: istore #7
    //   189: goto -> 13
    //   192: iload #4
    //   194: ireturn
  }
  
  private static int[] f(t0 paramt0, TrackGroup paramTrackGroup) {
    int[] arrayOfInt = new int[paramTrackGroup.b];
    for (byte b = 0; b < paramTrackGroup.b; b++)
      arrayOfInt[b] = paramt0.b(paramTrackGroup.a(b)); 
    return arrayOfInt;
  }
  
  private static int[] g(t0[] paramArrayOft0) {
    int i = paramArrayOft0.length;
    int[] arrayOfInt = new int[i];
    for (byte b = 0; b < i; b++)
      arrayOfInt[b] = paramArrayOft0[b].d(); 
    return arrayOfInt;
  }
  
  public final void c(Object paramObject) {
    this.c = (a)paramObject;
  }
  
  public final i d(t0[] paramArrayOft0, TrackGroupArray paramTrackGroupArray, v.a parama, y0 paramy0) {
    int[] arrayOfInt3 = new int[paramArrayOft0.length + 1];
    int i = paramArrayOft0.length + 1;
    TrackGroup[][] arrayOfTrackGroup = new TrackGroup[i][];
    int[][][] arrayOfInt = new int[paramArrayOft0.length + 1][][];
    int j = 0;
    int k;
    for (k = 0; k < i; k++) {
      int m = paramTrackGroupArray.c;
      arrayOfTrackGroup[k] = new TrackGroup[m];
      arrayOfInt[k] = new int[m][];
    } 
    int[] arrayOfInt2 = g(paramArrayOft0);
    for (k = 0; k < paramTrackGroupArray.c; k++) {
      int[] arrayOfInt4;
      boolean bool;
      TrackGroup trackGroup = paramTrackGroupArray.a(k);
      if (r.h((trackGroup.a(0)).j) == 4) {
        bool = true;
      } else {
        bool = false;
      } 
      i = e(paramArrayOft0, trackGroup, arrayOfInt3, bool);
      if (i == paramArrayOft0.length) {
        arrayOfInt4 = new int[trackGroup.b];
      } else {
        arrayOfInt4 = f(paramArrayOft0[i], trackGroup);
      } 
      int m = arrayOfInt3[i];
      arrayOfTrackGroup[i][m] = trackGroup;
      arrayOfInt[i][m] = arrayOfInt4;
      arrayOfInt3[i] = arrayOfInt3[i] + 1;
    } 
    TrackGroupArray[] arrayOfTrackGroupArray = new TrackGroupArray[paramArrayOft0.length];
    int[] arrayOfInt1 = new int[paramArrayOft0.length];
    for (k = j; k < paramArrayOft0.length; k++) {
      j = arrayOfInt3[k];
      arrayOfTrackGroupArray[k] = new TrackGroupArray((TrackGroup[])h0.f0((Object[])arrayOfTrackGroup[k], j));
      arrayOfInt[k] = (int[][])h0.f0((Object[])arrayOfInt[k], j);
      arrayOfInt1[k] = paramArrayOft0[k].n();
    } 
    k = arrayOfInt3[paramArrayOft0.length];
    a a1 = new a(arrayOfInt1, arrayOfTrackGroupArray, arrayOfInt2, arrayOfInt, new TrackGroupArray((TrackGroup[])h0.f0((Object[])arrayOfTrackGroup[paramArrayOft0.length], k)));
    Pair<u0[], f[]> pair = h(a1, arrayOfInt, arrayOfInt2);
    return new i((u0[])pair.first, (f[])pair.second, a1);
  }
  
  protected abstract Pair<u0[], f[]> h(a parama, int[][][] paramArrayOfint, int[] paramArrayOfint1);
  
  public static final class a {
    @Deprecated
    public final int a;
    
    private final int b;
    
    private final int[] c;
    
    private final TrackGroupArray[] d;
    
    private final int[] e;
    
    private final int[][][] f;
    
    private final TrackGroupArray g;
    
    a(int[] param1ArrayOfint1, TrackGroupArray[] param1ArrayOfTrackGroupArray, int[] param1ArrayOfint2, int[][][] param1ArrayOfint, TrackGroupArray param1TrackGroupArray) {
      this.c = param1ArrayOfint1;
      this.d = param1ArrayOfTrackGroupArray;
      this.f = param1ArrayOfint;
      this.e = param1ArrayOfint2;
      this.g = param1TrackGroupArray;
      int i = param1ArrayOfint1.length;
      this.b = i;
      this.a = i;
    }
    
    public int a(int param1Int1, int param1Int2, boolean param1Boolean) {
      // Byte code:
      //   0: aload_0
      //   1: getfield d : [Lcom/google/android/exoplayer2/source/TrackGroupArray;
      //   4: iload_1
      //   5: aaload
      //   6: iload_2
      //   7: invokevirtual a : (I)Lcom/google/android/exoplayer2/source/TrackGroup;
      //   10: getfield b : I
      //   13: istore #4
      //   15: iload #4
      //   17: newarray int
      //   19: astore #5
      //   21: iconst_0
      //   22: istore #6
      //   24: iconst_0
      //   25: istore #7
      //   27: iload #6
      //   29: iload #4
      //   31: if_icmpge -> 91
      //   34: aload_0
      //   35: iload_1
      //   36: iload_2
      //   37: iload #6
      //   39: invokevirtual f : (III)I
      //   42: istore #8
      //   44: iload #8
      //   46: iconst_4
      //   47: if_icmpeq -> 68
      //   50: iload #7
      //   52: istore #9
      //   54: iload_3
      //   55: ifeq -> 81
      //   58: iload #7
      //   60: istore #9
      //   62: iload #8
      //   64: iconst_3
      //   65: if_icmpne -> 81
      //   68: aload #5
      //   70: iload #7
      //   72: iload #6
      //   74: iastore
      //   75: iload #7
      //   77: iconst_1
      //   78: iadd
      //   79: istore #9
      //   81: iinc #6, 1
      //   84: iload #9
      //   86: istore #7
      //   88: goto -> 27
      //   91: aload_0
      //   92: iload_1
      //   93: iload_2
      //   94: aload #5
      //   96: iload #7
      //   98: invokestatic copyOf : ([II)[I
      //   101: invokevirtual b : (II[I)I
      //   104: ireturn
    }
    
    public int b(int param1Int1, int param1Int2, int[] param1ArrayOfint) {
      byte b1 = 0;
      String str = null;
      int i = 0;
      byte b2 = 0;
      int j = 16;
      while (b1 < param1ArrayOfint.length) {
        int k = param1ArrayOfint[b1];
        String str1 = (this.d[param1Int1].a(param1Int2).a(k)).j;
        if (!b2) {
          str = str1;
        } else {
          i |= h0.b(str, str1) ^ true;
        } 
        j = Math.min(j, s0.c(this.f[param1Int1][param1Int2][b1]));
        b1++;
        b2++;
      } 
      param1Int2 = j;
      if (i != 0)
        param1Int2 = Math.min(j, this.e[param1Int1]); 
      return param1Int2;
    }
    
    public int c() {
      return this.b;
    }
    
    public int d(int param1Int) {
      return this.c[param1Int];
    }
    
    public TrackGroupArray e(int param1Int) {
      return this.d[param1Int];
    }
    
    public int f(int param1Int1, int param1Int2, int param1Int3) {
      return s0.d(this.f[param1Int1][param1Int2][param1Int3]);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/trackselection/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */