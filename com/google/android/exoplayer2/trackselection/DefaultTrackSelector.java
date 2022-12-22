package com.google.android.exoplayer2.trackselection;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.s0;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.u0;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.h0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public class DefaultTrackSelector extends d {
  private static final int[] d = new int[0];
  
  private final f.b e;
  
  private final AtomicReference<Parameters> f;
  
  private boolean g;
  
  public DefaultTrackSelector(Parameters paramParameters, f.b paramb) {
    this.e = paramb;
    this.f = new AtomicReference<Parameters>(paramParameters);
  }
  
  @Deprecated
  public DefaultTrackSelector(f.b paramb) {
    this(Parameters.i, paramb);
  }
  
  private static f.a A(TrackGroupArray paramTrackGroupArray, int[][] paramArrayOfint, int paramInt, Parameters paramParameters) {
    byte b1;
    boolean bool;
    if (paramParameters.r) {
      b1 = 24;
    } else {
      b1 = 16;
    } 
    if (paramParameters.q && (paramInt & b1) != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    paramInt = 0;
    while (true) {
      TrackGroupArray trackGroupArray = paramTrackGroupArray;
      if (paramInt < trackGroupArray.c) {
        TrackGroup trackGroup = trackGroupArray.a(paramInt);
        int[] arrayOfInt = q(trackGroup, paramArrayOfint[paramInt], bool, b1, paramParameters.l, paramParameters.m, paramParameters.n, paramParameters.o, paramParameters.s, paramParameters.t, paramParameters.u);
        if (arrayOfInt.length > 0)
          return new f.a(trackGroup, arrayOfInt); 
        paramInt++;
        continue;
      } 
      return null;
    } 
  }
  
  private static f.a D(TrackGroupArray paramTrackGroupArray, int[][] paramArrayOfint, Parameters paramParameters) {
    byte b1 = 0;
    TrackGroup trackGroup = null;
    boolean bool1 = false;
    boolean bool2 = false;
    byte b2 = -1;
    byte b3 = -1;
    while (true) {
      f.a a;
      TrackGroupArray trackGroupArray = paramTrackGroupArray;
      if (b1 < trackGroupArray.c) {
        TrackGroup trackGroup1 = trackGroupArray.a(b1);
        List<Integer> list = t(trackGroup1, paramParameters.s, paramParameters.t, paramParameters.u);
        int[] arrayOfInt = paramArrayOfint[b1];
        byte b4 = 0;
        while (true) {
          b4++;
          object = SYNTHETIC_LOCAL_VARIABLE_17;
        } 
        continue;
      } 
      if (trackGroup == null) {
        paramTrackGroupArray = null;
      } else {
        a = new f.a(trackGroup, new int[] { bool1 });
      } 
      return a;
      b1++;
    } 
  }
  
  private static int k(int paramInt1, int paramInt2) {
    byte b1 = -1;
    if (paramInt1 == -1) {
      paramInt1 = b1;
      if (paramInt2 == -1)
        paramInt1 = 0; 
    } else if (paramInt2 == -1) {
      paramInt1 = 1;
    } else {
      paramInt1 -= paramInt2;
    } 
    return paramInt1;
  }
  
  private static int l(int paramInt1, int paramInt2) {
    if (paramInt1 > paramInt2) {
      paramInt1 = 1;
    } else if (paramInt2 > paramInt1) {
      paramInt1 = -1;
    } else {
      paramInt1 = 0;
    } 
    return paramInt1;
  }
  
  private static void m(TrackGroup paramTrackGroup, int[] paramArrayOfint, int paramInt1, String paramString, int paramInt2, int paramInt3, int paramInt4, int paramInt5, List<Integer> paramList) {
    for (int i = paramList.size() - 1; i >= 0; i--) {
      int j = ((Integer)paramList.get(i)).intValue();
      if (!w(paramTrackGroup.a(j), paramString, paramArrayOfint[j], paramInt1, paramInt2, paramInt3, paramInt4, paramInt5))
        paramList.remove(i); 
    } 
  }
  
  private static int n(TrackGroup paramTrackGroup, int[] paramArrayOfint, a parama, int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    byte b1 = 0;
    int i;
    for (i = 0; b1 < paramTrackGroup.b; i = j) {
      int j = i;
      if (v(paramTrackGroup.a(b1), paramArrayOfint[b1], parama, paramInt, paramBoolean1, paramBoolean2, paramBoolean3))
        j = i + 1; 
      b1++;
    } 
    return i;
  }
  
  private static int[] o(TrackGroup paramTrackGroup, int[] paramArrayOfint, int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    a a;
    HashSet<a> hashSet = new HashSet();
    byte b1 = 0;
    Format format = null;
    int i = 0;
    int j = 0;
    while (i < paramTrackGroup.b) {
      a a1;
      Format format1 = paramTrackGroup.a(i);
      a a2 = new a(format1.w, format1.x, format1.j);
      int k = j;
      format1 = format;
      if (hashSet.add(a2)) {
        int m = n(paramTrackGroup, paramArrayOfint, a2, paramInt, paramBoolean1, paramBoolean2, paramBoolean3);
        k = j;
        format1 = format;
        if (m > j) {
          k = m;
          a1 = a2;
        } 
      } 
      i++;
      j = k;
      a = a1;
    } 
    if (j > 1) {
      e.e(a);
      int[] arrayOfInt = new int[j];
      j = 0;
      byte b2 = b1;
      while (b2 < paramTrackGroup.b) {
        i = j;
        if (v(paramTrackGroup.a(b2), paramArrayOfint[b2], a, paramInt, paramBoolean1, paramBoolean2, paramBoolean3)) {
          arrayOfInt[j] = b2;
          i = j + 1;
        } 
        b2++;
        j = i;
      } 
      return arrayOfInt;
    } 
    return d;
  }
  
  private static int p(TrackGroup paramTrackGroup, int[] paramArrayOfint, int paramInt1, String paramString, int paramInt2, int paramInt3, int paramInt4, int paramInt5, List<Integer> paramList) {
    byte b1 = 0;
    int i;
    for (i = 0; b1 < paramList.size(); i = k) {
      int j = ((Integer)paramList.get(b1)).intValue();
      int k = i;
      if (w(paramTrackGroup.a(j), paramString, paramArrayOfint[j], paramInt1, paramInt2, paramInt3, paramInt4, paramInt5))
        k = i + 1; 
      b1++;
    } 
    return i;
  }
  
  private static int[] q(TrackGroup paramTrackGroup, int[] paramArrayOfint, boolean paramBoolean1, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, boolean paramBoolean2) {
    int[] arrayOfInt;
    String str;
    if (paramTrackGroup.b < 2)
      return d; 
    List<Integer> list = t(paramTrackGroup, paramInt6, paramInt7, paramBoolean2);
    if (list.size() < 2)
      return d; 
    if (!paramBoolean1) {
      HashSet<String> hashSet = new HashSet();
      str = null;
      paramInt7 = 0;
      int i;
      for (i = 0; paramInt7 < list.size(); i = paramInt6) {
        String str1 = (paramTrackGroup.a(((Integer)list.get(paramInt7)).intValue())).j;
        String str2 = str;
        paramInt6 = i;
        if (hashSet.add(str1)) {
          int j = p(paramTrackGroup, paramArrayOfint, paramInt1, str1, paramInt2, paramInt3, paramInt4, paramInt5, list);
          str2 = str;
          paramInt6 = i;
          if (j > i) {
            paramInt6 = j;
            str2 = str1;
          } 
        } 
        paramInt7++;
        str = str2;
      } 
    } else {
      str = null;
    } 
    m(paramTrackGroup, paramArrayOfint, paramInt1, str, paramInt2, paramInt3, paramInt4, paramInt5, list);
    if (list.size() < 2) {
      arrayOfInt = d;
    } else {
      arrayOfInt = h0.s0(list);
    } 
    return arrayOfInt;
  }
  
  protected static int r(Format paramFormat, String paramString, boolean paramBoolean) {
    if (!TextUtils.isEmpty(paramString) && paramString.equals(paramFormat.B))
      return 4; 
    paramString = y(paramString);
    String str = y(paramFormat.B);
    boolean bool = false;
    if (str == null || paramString == null) {
      boolean bool1 = bool;
      if (paramBoolean) {
        bool1 = bool;
        if (str == null)
          bool1 = true; 
      } 
      return bool1;
    } 
    return (str.startsWith(paramString) || paramString.startsWith(str)) ? 3 : (h0.o0(str, "-")[0].equals(h0.o0(paramString, "-")[0]) ? 2 : 0);
  }
  
  private static Point s(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    // Byte code:
    //   0: iload_0
    //   1: ifeq -> 43
    //   4: iconst_1
    //   5: istore #5
    //   7: iload_3
    //   8: iload #4
    //   10: if_icmple -> 19
    //   13: iconst_1
    //   14: istore #6
    //   16: goto -> 22
    //   19: iconst_0
    //   20: istore #6
    //   22: iload_1
    //   23: iload_2
    //   24: if_icmple -> 30
    //   27: goto -> 33
    //   30: iconst_0
    //   31: istore #5
    //   33: iload #6
    //   35: iload #5
    //   37: if_icmpeq -> 43
    //   40: goto -> 51
    //   43: iload_1
    //   44: istore #6
    //   46: iload_2
    //   47: istore_1
    //   48: iload #6
    //   50: istore_2
    //   51: iload_3
    //   52: iload_1
    //   53: imul
    //   54: istore #5
    //   56: iload #4
    //   58: iload_2
    //   59: imul
    //   60: istore #6
    //   62: iload #5
    //   64: iload #6
    //   66: if_icmplt -> 84
    //   69: new android/graphics/Point
    //   72: dup
    //   73: iload_2
    //   74: iload #6
    //   76: iload_3
    //   77: invokestatic i : (II)I
    //   80: invokespecial <init> : (II)V
    //   83: areturn
    //   84: new android/graphics/Point
    //   87: dup
    //   88: iload #5
    //   90: iload #4
    //   92: invokestatic i : (II)I
    //   95: iload_1
    //   96: invokespecial <init> : (II)V
    //   99: areturn
  }
  
  private static List<Integer> t(TrackGroup paramTrackGroup, int paramInt1, int paramInt2, boolean paramBoolean) {
    ArrayList<Integer> arrayList = new ArrayList(paramTrackGroup.b);
    byte b1 = 0;
    int i;
    for (i = 0; i < paramTrackGroup.b; i++)
      arrayList.add(Integer.valueOf(i)); 
    if (paramInt1 != Integer.MAX_VALUE && paramInt2 != Integer.MAX_VALUE) {
      for (i = Integer.MAX_VALUE; b1 < paramTrackGroup.b; i = k) {
        Format format = paramTrackGroup.a(b1);
        int j = format.o;
        int k = i;
        if (j > 0) {
          int m = format.p;
          k = i;
          if (m > 0) {
            Point point = s(paramBoolean, paramInt1, paramInt2, j, m);
            j = format.o;
            int n = format.p;
            m = j * n;
            k = i;
            if (j >= (int)(point.x * 0.98F)) {
              k = i;
              if (n >= (int)(point.y * 0.98F)) {
                k = i;
                if (m < i)
                  k = m; 
              } 
            } 
          } 
        } 
        b1++;
      } 
      if (i != Integer.MAX_VALUE)
        for (paramInt1 = arrayList.size() - 1; paramInt1 >= 0; paramInt1--) {
          paramInt2 = paramTrackGroup.a(((Integer)arrayList.get(paramInt1)).intValue()).F();
          if (paramInt2 == -1 || paramInt2 > i)
            arrayList.remove(paramInt1); 
        }  
    } 
    return arrayList;
  }
  
  protected static boolean u(int paramInt, boolean paramBoolean) {
    paramInt = s0.d(paramInt);
    return (paramInt == 4 || (paramBoolean && paramInt == 3));
  }
  
  private static boolean v(Format paramFormat, int paramInt1, a parama, int paramInt2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    // Byte code:
    //   0: iconst_0
    //   1: istore #7
    //   3: iload #7
    //   5: istore #8
    //   7: iload_1
    //   8: iconst_0
    //   9: invokestatic u : (IZ)Z
    //   12: ifeq -> 135
    //   15: aload_0
    //   16: getfield f : I
    //   19: istore_1
    //   20: iload_1
    //   21: iconst_m1
    //   22: if_icmpeq -> 34
    //   25: iload #7
    //   27: istore #8
    //   29: iload_1
    //   30: iload_3
    //   31: if_icmpgt -> 135
    //   34: iload #6
    //   36: ifne -> 65
    //   39: aload_0
    //   40: getfield w : I
    //   43: istore_1
    //   44: iload #7
    //   46: istore #8
    //   48: iload_1
    //   49: iconst_m1
    //   50: if_icmpeq -> 135
    //   53: iload #7
    //   55: istore #8
    //   57: iload_1
    //   58: aload_2
    //   59: getfield a : I
    //   62: if_icmpne -> 135
    //   65: iload #4
    //   67: ifne -> 101
    //   70: aload_0
    //   71: getfield j : Ljava/lang/String;
    //   74: astore #9
    //   76: iload #7
    //   78: istore #8
    //   80: aload #9
    //   82: ifnull -> 135
    //   85: iload #7
    //   87: istore #8
    //   89: aload #9
    //   91: aload_2
    //   92: getfield c : Ljava/lang/String;
    //   95: invokestatic equals : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    //   98: ifeq -> 135
    //   101: iload #5
    //   103: ifne -> 132
    //   106: aload_0
    //   107: getfield x : I
    //   110: istore_1
    //   111: iload #7
    //   113: istore #8
    //   115: iload_1
    //   116: iconst_m1
    //   117: if_icmpeq -> 135
    //   120: iload #7
    //   122: istore #8
    //   124: iload_1
    //   125: aload_2
    //   126: getfield b : I
    //   129: if_icmpne -> 135
    //   132: iconst_1
    //   133: istore #8
    //   135: iload #8
    //   137: ireturn
  }
  
  private static boolean w(Format paramFormat, String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    // Byte code:
    //   0: iconst_0
    //   1: istore #8
    //   3: iload #8
    //   5: istore #9
    //   7: iload_2
    //   8: iconst_0
    //   9: invokestatic u : (IZ)Z
    //   12: ifeq -> 134
    //   15: iload #8
    //   17: istore #9
    //   19: iload_2
    //   20: iload_3
    //   21: iand
    //   22: ifeq -> 134
    //   25: aload_1
    //   26: ifnull -> 44
    //   29: iload #8
    //   31: istore #9
    //   33: aload_0
    //   34: getfield j : Ljava/lang/String;
    //   37: aload_1
    //   38: invokestatic b : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   41: ifeq -> 134
    //   44: aload_0
    //   45: getfield o : I
    //   48: istore_2
    //   49: iload_2
    //   50: iconst_m1
    //   51: if_icmpeq -> 64
    //   54: iload #8
    //   56: istore #9
    //   58: iload_2
    //   59: iload #4
    //   61: if_icmpgt -> 134
    //   64: aload_0
    //   65: getfield p : I
    //   68: istore_2
    //   69: iload_2
    //   70: iconst_m1
    //   71: if_icmpeq -> 84
    //   74: iload #8
    //   76: istore #9
    //   78: iload_2
    //   79: iload #5
    //   81: if_icmpgt -> 134
    //   84: aload_0
    //   85: getfield q : F
    //   88: fstore #10
    //   90: fload #10
    //   92: ldc -1.0
    //   94: fcmpl
    //   95: ifeq -> 111
    //   98: iload #8
    //   100: istore #9
    //   102: fload #10
    //   104: iload #6
    //   106: i2f
    //   107: fcmpg
    //   108: ifgt -> 134
    //   111: aload_0
    //   112: getfield f : I
    //   115: istore_2
    //   116: iload_2
    //   117: iconst_m1
    //   118: if_icmpeq -> 131
    //   121: iload #8
    //   123: istore #9
    //   125: iload_2
    //   126: iload #7
    //   128: if_icmpgt -> 134
    //   131: iconst_1
    //   132: istore #9
    //   134: iload #9
    //   136: ireturn
  }
  
  private static void x(d.a parama, int[][][] paramArrayOfint, u0[] paramArrayOfu0, f[] paramArrayOff, int paramInt) {
    // Byte code:
    //   0: iload #4
    //   2: ifne -> 6
    //   5: return
    //   6: iconst_0
    //   7: istore #5
    //   9: iconst_0
    //   10: istore #6
    //   12: iconst_m1
    //   13: istore #7
    //   15: iconst_m1
    //   16: istore #8
    //   18: iload #6
    //   20: aload_0
    //   21: invokevirtual c : ()I
    //   24: if_icmpge -> 160
    //   27: aload_0
    //   28: iload #6
    //   30: invokevirtual d : (I)I
    //   33: istore #9
    //   35: aload_3
    //   36: iload #6
    //   38: aaload
    //   39: astore #10
    //   41: iload #9
    //   43: iconst_1
    //   44: if_icmpeq -> 61
    //   47: iload #7
    //   49: istore #11
    //   51: iload #8
    //   53: istore #12
    //   55: iload #9
    //   57: iconst_2
    //   58: if_icmpne -> 146
    //   61: iload #7
    //   63: istore #11
    //   65: iload #8
    //   67: istore #12
    //   69: aload #10
    //   71: ifnull -> 146
    //   74: iload #7
    //   76: istore #11
    //   78: iload #8
    //   80: istore #12
    //   82: aload_1
    //   83: iload #6
    //   85: aaload
    //   86: aload_0
    //   87: iload #6
    //   89: invokevirtual e : (I)Lcom/google/android/exoplayer2/source/TrackGroupArray;
    //   92: aload #10
    //   94: invokestatic z : ([[ILcom/google/android/exoplayer2/source/TrackGroupArray;Lcom/google/android/exoplayer2/trackselection/f;)Z
    //   97: ifeq -> 146
    //   100: iload #9
    //   102: iconst_1
    //   103: if_icmpne -> 126
    //   106: iload #8
    //   108: iconst_m1
    //   109: if_icmpeq -> 115
    //   112: goto -> 132
    //   115: iload #6
    //   117: istore #12
    //   119: iload #7
    //   121: istore #11
    //   123: goto -> 146
    //   126: iload #7
    //   128: iconst_m1
    //   129: if_icmpeq -> 138
    //   132: iconst_0
    //   133: istore #6
    //   135: goto -> 163
    //   138: iload #6
    //   140: istore #11
    //   142: iload #8
    //   144: istore #12
    //   146: iinc #6, 1
    //   149: iload #11
    //   151: istore #7
    //   153: iload #12
    //   155: istore #8
    //   157: goto -> 18
    //   160: iconst_1
    //   161: istore #6
    //   163: iload #5
    //   165: istore #12
    //   167: iload #8
    //   169: iconst_m1
    //   170: if_icmpeq -> 186
    //   173: iload #5
    //   175: istore #12
    //   177: iload #7
    //   179: iconst_m1
    //   180: if_icmpeq -> 186
    //   183: iconst_1
    //   184: istore #12
    //   186: iload #6
    //   188: iload #12
    //   190: iand
    //   191: ifeq -> 214
    //   194: new com/google/android/exoplayer2/u0
    //   197: dup
    //   198: iload #4
    //   200: invokespecial <init> : (I)V
    //   203: astore_0
    //   204: aload_2
    //   205: iload #8
    //   207: aload_0
    //   208: aastore
    //   209: aload_2
    //   210: iload #7
    //   212: aload_0
    //   213: aastore
    //   214: return
  }
  
  protected static String y(String paramString) {
    if (!TextUtils.isEmpty(paramString)) {
      String str = paramString;
      return TextUtils.equals(paramString, "und") ? null : str;
    } 
    return null;
  }
  
  private static boolean z(int[][] paramArrayOfint, TrackGroupArray paramTrackGroupArray, f paramf) {
    if (paramf == null)
      return false; 
    int i = paramTrackGroupArray.b(paramf.a());
    for (byte b1 = 0; b1 < paramf.length(); b1++) {
      if (s0.f(paramArrayOfint[i][paramf.f(b1)]) != 32)
        return false; 
    } 
    return true;
  }
  
  protected f.a[] B(d.a parama, int[][][] paramArrayOfint, int[] paramArrayOfint1, Parameters paramParameters) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual c : ()I
    //   4: istore #5
    //   6: iload #5
    //   8: anewarray com/google/android/exoplayer2/trackselection/f$a
    //   11: astore #6
    //   13: iconst_0
    //   14: istore #7
    //   16: iconst_0
    //   17: istore #8
    //   19: iconst_0
    //   20: istore #9
    //   22: iconst_0
    //   23: istore #10
    //   25: iconst_1
    //   26: istore #11
    //   28: iload #9
    //   30: iload #5
    //   32: if_icmpge -> 148
    //   35: iload #8
    //   37: istore #12
    //   39: iload #10
    //   41: istore #13
    //   43: iconst_2
    //   44: aload_1
    //   45: iload #9
    //   47: invokevirtual d : (I)I
    //   50: if_icmpne -> 134
    //   53: iload #8
    //   55: istore #12
    //   57: iload #8
    //   59: ifne -> 105
    //   62: aload #6
    //   64: iload #9
    //   66: aload_0
    //   67: aload_1
    //   68: iload #9
    //   70: invokevirtual e : (I)Lcom/google/android/exoplayer2/source/TrackGroupArray;
    //   73: aload_2
    //   74: iload #9
    //   76: aaload
    //   77: aload_3
    //   78: iload #9
    //   80: iaload
    //   81: aload #4
    //   83: iconst_1
    //   84: invokevirtual G : (Lcom/google/android/exoplayer2/source/TrackGroupArray;[[IILcom/google/android/exoplayer2/trackselection/DefaultTrackSelector$Parameters;Z)Lcom/google/android/exoplayer2/trackselection/f$a;
    //   87: aastore
    //   88: aload #6
    //   90: iload #9
    //   92: aaload
    //   93: ifnull -> 102
    //   96: iconst_1
    //   97: istore #12
    //   99: goto -> 105
    //   102: iconst_0
    //   103: istore #12
    //   105: aload_1
    //   106: iload #9
    //   108: invokevirtual e : (I)Lcom/google/android/exoplayer2/source/TrackGroupArray;
    //   111: getfield c : I
    //   114: ifle -> 124
    //   117: iload #11
    //   119: istore #8
    //   121: goto -> 127
    //   124: iconst_0
    //   125: istore #8
    //   127: iload #10
    //   129: iload #8
    //   131: ior
    //   132: istore #13
    //   134: iinc #9, 1
    //   137: iload #12
    //   139: istore #8
    //   141: iload #13
    //   143: istore #10
    //   145: goto -> 25
    //   148: aconst_null
    //   149: astore #14
    //   151: aload #14
    //   153: astore #15
    //   155: iconst_m1
    //   156: istore #12
    //   158: iconst_0
    //   159: istore #8
    //   161: iload #8
    //   163: iload #5
    //   165: if_icmpge -> 348
    //   168: iconst_1
    //   169: aload_1
    //   170: iload #8
    //   172: invokevirtual d : (I)I
    //   175: if_icmpne -> 342
    //   178: aload_0
    //   179: getfield g : Z
    //   182: ifne -> 199
    //   185: iload #10
    //   187: ifne -> 193
    //   190: goto -> 199
    //   193: iconst_0
    //   194: istore #16
    //   196: goto -> 202
    //   199: iconst_1
    //   200: istore #16
    //   202: aload_1
    //   203: iload #8
    //   205: invokevirtual e : (I)Lcom/google/android/exoplayer2/source/TrackGroupArray;
    //   208: astore #17
    //   210: aload_2
    //   211: iload #8
    //   213: aaload
    //   214: astore #18
    //   216: aload_3
    //   217: iload #8
    //   219: iaload
    //   220: istore #11
    //   222: iload #12
    //   224: istore #13
    //   226: aload #14
    //   228: astore #19
    //   230: iload #8
    //   232: istore #9
    //   234: aload_0
    //   235: aload #17
    //   237: aload #18
    //   239: iload #11
    //   241: aload #4
    //   243: iload #16
    //   245: invokevirtual C : (Lcom/google/android/exoplayer2/source/TrackGroupArray;[[IILcom/google/android/exoplayer2/trackselection/DefaultTrackSelector$Parameters;Z)Landroid/util/Pair;
    //   248: astore #18
    //   250: aload #18
    //   252: ifnull -> 342
    //   255: aload #19
    //   257: ifnull -> 276
    //   260: aload #18
    //   262: getfield second : Ljava/lang/Object;
    //   265: checkcast com/google/android/exoplayer2/trackselection/DefaultTrackSelector$b
    //   268: aload #19
    //   270: invokevirtual a : (Lcom/google/android/exoplayer2/trackselection/DefaultTrackSelector$b;)I
    //   273: ifle -> 342
    //   276: iload #13
    //   278: iconst_m1
    //   279: if_icmpeq -> 288
    //   282: aload #6
    //   284: iload #13
    //   286: aconst_null
    //   287: aastore
    //   288: aload #18
    //   290: getfield first : Ljava/lang/Object;
    //   293: checkcast com/google/android/exoplayer2/trackselection/f$a
    //   296: astore #15
    //   298: aload #6
    //   300: iload #9
    //   302: aload #15
    //   304: aastore
    //   305: aload #15
    //   307: getfield a : Lcom/google/android/exoplayer2/source/TrackGroup;
    //   310: aload #15
    //   312: getfield b : [I
    //   315: iconst_0
    //   316: iaload
    //   317: invokevirtual a : (I)Lcom/google/android/exoplayer2/Format;
    //   320: getfield B : Ljava/lang/String;
    //   323: astore #15
    //   325: aload #18
    //   327: getfield second : Ljava/lang/Object;
    //   330: checkcast com/google/android/exoplayer2/trackselection/DefaultTrackSelector$b
    //   333: astore #14
    //   335: iload #9
    //   337: istore #12
    //   339: goto -> 342
    //   342: iinc #8, 1
    //   345: goto -> 161
    //   348: aload #15
    //   350: astore_3
    //   351: aconst_null
    //   352: astore #15
    //   354: iconst_m1
    //   355: istore #8
    //   357: iload #7
    //   359: istore #12
    //   361: iload #12
    //   363: iload #5
    //   365: if_icmpge -> 556
    //   368: aload_1
    //   369: iload #12
    //   371: invokevirtual d : (I)I
    //   374: istore #10
    //   376: iload #10
    //   378: iconst_1
    //   379: if_icmpeq -> 534
    //   382: iload #10
    //   384: iconst_2
    //   385: if_icmpeq -> 523
    //   388: iload #10
    //   390: iconst_3
    //   391: if_icmpeq -> 420
    //   394: aload #6
    //   396: iload #12
    //   398: aload_0
    //   399: iload #10
    //   401: aload_1
    //   402: iload #12
    //   404: invokevirtual e : (I)Lcom/google/android/exoplayer2/source/TrackGroupArray;
    //   407: aload_2
    //   408: iload #12
    //   410: aaload
    //   411: aload #4
    //   413: invokevirtual E : (ILcom/google/android/exoplayer2/source/TrackGroupArray;[[ILcom/google/android/exoplayer2/trackselection/DefaultTrackSelector$Parameters;)Lcom/google/android/exoplayer2/trackselection/f$a;
    //   416: aastore
    //   417: goto -> 523
    //   420: aload_0
    //   421: aload_1
    //   422: iload #12
    //   424: invokevirtual e : (I)Lcom/google/android/exoplayer2/source/TrackGroupArray;
    //   427: aload_2
    //   428: iload #12
    //   430: aaload
    //   431: aload #4
    //   433: aload_3
    //   434: invokevirtual F : (Lcom/google/android/exoplayer2/source/TrackGroupArray;[[ILcom/google/android/exoplayer2/trackselection/DefaultTrackSelector$Parameters;Ljava/lang/String;)Landroid/util/Pair;
    //   437: astore #19
    //   439: aload #15
    //   441: astore #14
    //   443: iload #8
    //   445: istore #10
    //   447: aload #19
    //   449: ifnull -> 542
    //   452: aload #15
    //   454: ifnull -> 481
    //   457: aload #15
    //   459: astore #14
    //   461: iload #8
    //   463: istore #10
    //   465: aload #19
    //   467: getfield second : Ljava/lang/Object;
    //   470: checkcast com/google/android/exoplayer2/trackselection/DefaultTrackSelector$d
    //   473: aload #15
    //   475: invokevirtual a : (Lcom/google/android/exoplayer2/trackselection/DefaultTrackSelector$d;)I
    //   478: ifle -> 542
    //   481: iload #8
    //   483: iconst_m1
    //   484: if_icmpeq -> 493
    //   487: aload #6
    //   489: iload #8
    //   491: aconst_null
    //   492: aastore
    //   493: aload #6
    //   495: iload #12
    //   497: aload #19
    //   499: getfield first : Ljava/lang/Object;
    //   502: checkcast com/google/android/exoplayer2/trackselection/f$a
    //   505: aastore
    //   506: aload #19
    //   508: getfield second : Ljava/lang/Object;
    //   511: checkcast com/google/android/exoplayer2/trackselection/DefaultTrackSelector$d
    //   514: astore #14
    //   516: iload #12
    //   518: istore #10
    //   520: goto -> 542
    //   523: aload #15
    //   525: astore #14
    //   527: iload #8
    //   529: istore #10
    //   531: goto -> 542
    //   534: iload #8
    //   536: istore #10
    //   538: aload #15
    //   540: astore #14
    //   542: iinc #12, 1
    //   545: aload #14
    //   547: astore #15
    //   549: iload #10
    //   551: istore #8
    //   553: goto -> 361
    //   556: aload #6
    //   558: areturn
  }
  
  protected Pair<f.a, b> C(TrackGroupArray paramTrackGroupArray, int[][] paramArrayOfint, int paramInt, Parameters paramParameters, boolean paramBoolean) {
    // Byte code:
    //   0: aconst_null
    //   1: astore #6
    //   3: aconst_null
    //   4: astore #7
    //   6: iconst_0
    //   7: istore_3
    //   8: iconst_m1
    //   9: istore #8
    //   11: iconst_m1
    //   12: istore #9
    //   14: iload_3
    //   15: aload_1
    //   16: getfield c : I
    //   19: if_icmpge -> 199
    //   22: aload_1
    //   23: iload_3
    //   24: invokevirtual a : (I)Lcom/google/android/exoplayer2/source/TrackGroup;
    //   27: astore #10
    //   29: aload_2
    //   30: iload_3
    //   31: aaload
    //   32: astore #11
    //   34: iconst_0
    //   35: istore #12
    //   37: aload #7
    //   39: astore #13
    //   41: iload #12
    //   43: aload #10
    //   45: getfield b : I
    //   48: if_icmpge -> 189
    //   51: iload #8
    //   53: istore #14
    //   55: iload #9
    //   57: istore #15
    //   59: aload #13
    //   61: astore #7
    //   63: aload #11
    //   65: iload #12
    //   67: iaload
    //   68: aload #4
    //   70: getfield F : Z
    //   73: invokestatic u : (IZ)Z
    //   76: ifeq -> 171
    //   79: new com/google/android/exoplayer2/trackselection/DefaultTrackSelector$b
    //   82: dup
    //   83: aload #10
    //   85: iload #12
    //   87: invokevirtual a : (I)Lcom/google/android/exoplayer2/Format;
    //   90: aload #4
    //   92: aload #11
    //   94: iload #12
    //   96: iaload
    //   97: invokespecial <init> : (Lcom/google/android/exoplayer2/Format;Lcom/google/android/exoplayer2/trackselection/DefaultTrackSelector$Parameters;I)V
    //   100: astore #16
    //   102: aload #16
    //   104: getfield b : Z
    //   107: ifne -> 133
    //   110: aload #4
    //   112: getfield x : Z
    //   115: ifne -> 133
    //   118: iload #8
    //   120: istore #14
    //   122: iload #9
    //   124: istore #15
    //   126: aload #13
    //   128: astore #7
    //   130: goto -> 171
    //   133: aload #13
    //   135: ifnull -> 160
    //   138: iload #8
    //   140: istore #14
    //   142: iload #9
    //   144: istore #15
    //   146: aload #13
    //   148: astore #7
    //   150: aload #16
    //   152: aload #13
    //   154: invokevirtual a : (Lcom/google/android/exoplayer2/trackselection/DefaultTrackSelector$b;)I
    //   157: ifle -> 171
    //   160: iload_3
    //   161: istore #14
    //   163: iload #12
    //   165: istore #15
    //   167: aload #16
    //   169: astore #7
    //   171: iinc #12, 1
    //   174: iload #14
    //   176: istore #8
    //   178: iload #15
    //   180: istore #9
    //   182: aload #7
    //   184: astore #13
    //   186: goto -> 41
    //   189: iinc #3, 1
    //   192: aload #13
    //   194: astore #7
    //   196: goto -> 14
    //   199: iload #8
    //   201: iconst_m1
    //   202: if_icmpne -> 207
    //   205: aconst_null
    //   206: areturn
    //   207: aload_1
    //   208: iload #8
    //   210: invokevirtual a : (I)Lcom/google/android/exoplayer2/source/TrackGroup;
    //   213: astore #13
    //   215: aload #6
    //   217: astore_1
    //   218: aload #4
    //   220: getfield C : Z
    //   223: ifne -> 294
    //   226: aload #6
    //   228: astore_1
    //   229: aload #4
    //   231: getfield B : Z
    //   234: ifne -> 294
    //   237: aload #6
    //   239: astore_1
    //   240: iload #5
    //   242: ifeq -> 294
    //   245: aload #13
    //   247: aload_2
    //   248: iload #8
    //   250: aaload
    //   251: aload #4
    //   253: getfield w : I
    //   256: aload #4
    //   258: getfield y : Z
    //   261: aload #4
    //   263: getfield z : Z
    //   266: aload #4
    //   268: getfield A : Z
    //   271: invokestatic o : (Lcom/google/android/exoplayer2/source/TrackGroup;[IIZZZ)[I
    //   274: astore_2
    //   275: aload #6
    //   277: astore_1
    //   278: aload_2
    //   279: arraylength
    //   280: ifle -> 294
    //   283: new com/google/android/exoplayer2/trackselection/f$a
    //   286: dup
    //   287: aload #13
    //   289: aload_2
    //   290: invokespecial <init> : (Lcom/google/android/exoplayer2/source/TrackGroup;[I)V
    //   293: astore_1
    //   294: aload_1
    //   295: astore_2
    //   296: aload_1
    //   297: ifnonnull -> 318
    //   300: new com/google/android/exoplayer2/trackselection/f$a
    //   303: dup
    //   304: aload #13
    //   306: iconst_1
    //   307: newarray int
    //   309: dup
    //   310: iconst_0
    //   311: iload #9
    //   313: iastore
    //   314: invokespecial <init> : (Lcom/google/android/exoplayer2/source/TrackGroup;[I)V
    //   317: astore_2
    //   318: aload_2
    //   319: aload #7
    //   321: invokestatic e : (Ljava/lang/Object;)Ljava/lang/Object;
    //   324: invokestatic create : (Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;
    //   327: areturn
  }
  
  protected f.a E(int paramInt, TrackGroupArray paramTrackGroupArray, int[][] paramArrayOfint, Parameters paramParameters) {
    f.a a;
    TrackGroupArray trackGroupArray = null;
    TrackGroup trackGroup = null;
    byte b1 = 0;
    int i = 0;
    int j = 0;
    while (b1 < paramTrackGroupArray.c) {
      TrackGroup trackGroup1 = paramTrackGroupArray.a(b1);
      int[] arrayOfInt = paramArrayOfint[b1];
      paramInt = 0;
      while (paramInt < trackGroup1.b) {
        TrackGroup trackGroup2 = trackGroup;
        int k = i;
        int m = j;
        if (u(arrayOfInt[paramInt], paramParameters.F)) {
          if (((trackGroup1.a(paramInt)).d & 0x1) != 0) {
            n = 1;
          } else {
            n = 0;
          } 
          if (n) {
            m = 2;
          } else {
            m = 1;
          } 
          int n = m;
          if (u(arrayOfInt[paramInt], false))
            n = m + 1000; 
          trackGroup2 = trackGroup;
          k = i;
          m = j;
          if (n > j) {
            trackGroup2 = trackGroup1;
            k = paramInt;
            m = n;
          } 
        } 
        paramInt++;
        trackGroup = trackGroup2;
        i = k;
        j = m;
      } 
      b1++;
    } 
    if (trackGroup == null) {
      paramTrackGroupArray = trackGroupArray;
    } else {
      a = new f.a(trackGroup, new int[] { i });
    } 
    return a;
  }
  
  protected Pair<f.a, d> F(TrackGroupArray paramTrackGroupArray, int[][] paramArrayOfint, Parameters paramParameters, String paramString) {
    Pair<f.a, d> pair;
    Object object1;
    TrackGroupArray trackGroupArray = null;
    byte b1 = -1;
    Object object2 = null;
    Object object3 = object2;
    for (byte b2 = 0; b2 < paramTrackGroupArray.c; b2++) {
      TrackGroup trackGroup = paramTrackGroupArray.a(b2);
      int[] arrayOfInt = paramArrayOfint[b2];
      byte b3 = 0;
      while (true) {
        b3++;
        object1 = SYNTHETIC_LOCAL_VARIABLE_14;
        object2 = SYNTHETIC_LOCAL_VARIABLE_15;
        object3 = SYNTHETIC_LOCAL_VARIABLE_16;
      } 
      continue;
    } 
    if (object2 == null) {
      paramTrackGroupArray = trackGroupArray;
    } else {
      pair = Pair.create(new f.a((TrackGroup)object2, new int[] { object1 }), e.e(object3));
    } 
    return pair;
  }
  
  protected f.a G(TrackGroupArray paramTrackGroupArray, int[][] paramArrayOfint, int paramInt, Parameters paramParameters, boolean paramBoolean) {
    f.a a1;
    if (!paramParameters.C && !paramParameters.B && paramBoolean) {
      a1 = A(paramTrackGroupArray, paramArrayOfint, paramInt, paramParameters);
    } else {
      a1 = null;
    } 
    f.a a2 = a1;
    if (a1 == null)
      a2 = D(paramTrackGroupArray, paramArrayOfint, paramParameters); 
    return a2;
  }
  
  protected final Pair<u0[], f[]> h(d.a parama, int[][][] paramArrayOfint, int[] paramArrayOfint1) {
    Parameters parameters = this.f.get();
    int i = parama.c();
    f.a[] arrayOfA = B(parama, paramArrayOfint, paramArrayOfint1, parameters);
    byte b1 = 0;
    while (true) {
      paramArrayOfint1 = null;
      if (b1 < i) {
        if (parameters.d(b1)) {
          arrayOfA[b1] = null;
        } else {
          TrackGroupArray trackGroupArray = parama.e(b1);
          if (parameters.f(b1, trackGroupArray)) {
            f.a a1;
            SelectionOverride selectionOverride = parameters.e(b1, trackGroupArray);
            if (selectionOverride != null)
              a1 = new f.a(trackGroupArray.a(selectionOverride.b), selectionOverride.c, selectionOverride.e, Integer.valueOf(selectionOverride.f)); 
            arrayOfA[b1] = a1;
          } 
        } 
        b1++;
        continue;
      } 
      f[] arrayOfF = this.e.a(arrayOfA, a());
      u0[] arrayOfU0 = new u0[i];
      for (b1 = 0; b1 < i; b1++) {
        boolean bool;
        if (!parameters.d(b1) && (parama.d(b1) == 6 || arrayOfF[b1] != null)) {
          bool = true;
        } else {
          bool = false;
        } 
        if (bool) {
          u0 u0 = u0.a;
        } else {
          paramArrayOfint1 = null;
        } 
        arrayOfU0[b1] = (u0)paramArrayOfint1;
      } 
      x(parama, paramArrayOfint, arrayOfU0, arrayOfF, parameters.G);
      return Pair.create(arrayOfU0, arrayOfF);
    } 
  }
  
  public static final class Parameters extends TrackSelectionParameters {
    public static final Parcelable.Creator<Parameters> CREATOR;
    
    public static final Parameters i;
    
    @Deprecated
    public static final Parameters j;
    
    @Deprecated
    public static final Parameters k;
    
    public final boolean A;
    
    public final boolean B;
    
    public final boolean C;
    
    @Deprecated
    public final boolean D;
    
    @Deprecated
    public final boolean E;
    
    public final boolean F;
    
    public final int G;
    
    private final SparseArray<Map<TrackGroupArray, DefaultTrackSelector.SelectionOverride>> H;
    
    private final SparseBooleanArray I;
    
    public final int l;
    
    public final int m;
    
    public final int n;
    
    public final int o;
    
    public final boolean p;
    
    public final boolean q;
    
    public final boolean r;
    
    public final int s;
    
    public final int t;
    
    public final boolean u;
    
    public final int v;
    
    public final int w;
    
    public final boolean x;
    
    public final boolean y;
    
    public final boolean z;
    
    static {
      Parameters parameters = (new DefaultTrackSelector.c()).b();
      i = parameters;
      j = parameters;
      k = parameters;
      CREATOR = new a();
    }
    
    Parameters(int param1Int1, int param1Int2, int param1Int3, int param1Int4, boolean param1Boolean1, boolean param1Boolean2, boolean param1Boolean3, int param1Int5, int param1Int6, boolean param1Boolean4, String param1String1, int param1Int7, int param1Int8, boolean param1Boolean5, boolean param1Boolean6, boolean param1Boolean7, boolean param1Boolean8, String param1String2, int param1Int9, boolean param1Boolean9, int param1Int10, boolean param1Boolean10, boolean param1Boolean11, boolean param1Boolean12, int param1Int11, SparseArray<Map<TrackGroupArray, DefaultTrackSelector.SelectionOverride>> param1SparseArray, SparseBooleanArray param1SparseBooleanArray) {
      super(param1String1, param1String2, param1Int9, param1Boolean9, param1Int10);
      this.l = param1Int1;
      this.m = param1Int2;
      this.n = param1Int3;
      this.o = param1Int4;
      this.p = param1Boolean1;
      this.q = param1Boolean2;
      this.r = param1Boolean3;
      this.s = param1Int5;
      this.t = param1Int6;
      this.u = param1Boolean4;
      this.v = param1Int7;
      this.w = param1Int8;
      this.x = param1Boolean5;
      this.y = param1Boolean6;
      this.z = param1Boolean7;
      this.A = param1Boolean8;
      this.B = param1Boolean10;
      this.C = param1Boolean11;
      this.F = param1Boolean12;
      this.G = param1Int11;
      this.D = param1Boolean2;
      this.E = param1Boolean3;
      this.H = param1SparseArray;
      this.I = param1SparseBooleanArray;
    }
    
    Parameters(Parcel param1Parcel) {
      super(param1Parcel);
      this.l = param1Parcel.readInt();
      this.m = param1Parcel.readInt();
      this.n = param1Parcel.readInt();
      this.o = param1Parcel.readInt();
      this.p = h0.i0(param1Parcel);
      boolean bool1 = h0.i0(param1Parcel);
      this.q = bool1;
      boolean bool2 = h0.i0(param1Parcel);
      this.r = bool2;
      this.s = param1Parcel.readInt();
      this.t = param1Parcel.readInt();
      this.u = h0.i0(param1Parcel);
      this.v = param1Parcel.readInt();
      this.w = param1Parcel.readInt();
      this.x = h0.i0(param1Parcel);
      this.y = h0.i0(param1Parcel);
      this.z = h0.i0(param1Parcel);
      this.A = h0.i0(param1Parcel);
      this.B = h0.i0(param1Parcel);
      this.C = h0.i0(param1Parcel);
      this.F = h0.i0(param1Parcel);
      this.G = param1Parcel.readInt();
      this.H = g(param1Parcel);
      this.I = (SparseBooleanArray)h0.g(param1Parcel.readSparseBooleanArray());
      this.D = bool1;
      this.E = bool2;
    }
    
    private static boolean a(SparseBooleanArray param1SparseBooleanArray1, SparseBooleanArray param1SparseBooleanArray2) {
      int i = param1SparseBooleanArray1.size();
      if (param1SparseBooleanArray2.size() != i)
        return false; 
      for (byte b = 0; b < i; b++) {
        if (param1SparseBooleanArray2.indexOfKey(param1SparseBooleanArray1.keyAt(b)) < 0)
          return false; 
      } 
      return true;
    }
    
    private static boolean b(SparseArray<Map<TrackGroupArray, DefaultTrackSelector.SelectionOverride>> param1SparseArray1, SparseArray<Map<TrackGroupArray, DefaultTrackSelector.SelectionOverride>> param1SparseArray2) {
      int i = param1SparseArray1.size();
      if (param1SparseArray2.size() != i)
        return false; 
      for (byte b = 0; b < i; b++) {
        int j = param1SparseArray2.indexOfKey(param1SparseArray1.keyAt(b));
        if (j < 0 || !c((Map<TrackGroupArray, DefaultTrackSelector.SelectionOverride>)param1SparseArray1.valueAt(b), (Map<TrackGroupArray, DefaultTrackSelector.SelectionOverride>)param1SparseArray2.valueAt(j)))
          return false; 
      } 
      return true;
    }
    
    private static boolean c(Map<TrackGroupArray, DefaultTrackSelector.SelectionOverride> param1Map1, Map<TrackGroupArray, DefaultTrackSelector.SelectionOverride> param1Map2) {
      int i = param1Map1.size();
      if (param1Map2.size() != i)
        return false; 
      for (Map.Entry<TrackGroupArray, DefaultTrackSelector.SelectionOverride> entry : param1Map1.entrySet()) {
        TrackGroupArray trackGroupArray = (TrackGroupArray)entry.getKey();
        if (!param1Map2.containsKey(trackGroupArray) || !h0.b(entry.getValue(), param1Map2.get(trackGroupArray)))
          return false; 
      } 
      return true;
    }
    
    private static SparseArray<Map<TrackGroupArray, DefaultTrackSelector.SelectionOverride>> g(Parcel param1Parcel) {
      int i = param1Parcel.readInt();
      SparseArray<Map<TrackGroupArray, DefaultTrackSelector.SelectionOverride>> sparseArray = new SparseArray(i);
      for (byte b = 0; b < i; b++) {
        int j = param1Parcel.readInt();
        int k = param1Parcel.readInt();
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>(k);
        for (byte b1 = 0; b1 < k; b1++)
          hashMap.put(e.e(param1Parcel.readParcelable(TrackGroupArray.class.getClassLoader())), param1Parcel.readParcelable(DefaultTrackSelector.SelectionOverride.class.getClassLoader())); 
        sparseArray.put(j, hashMap);
      } 
      return sparseArray;
    }
    
    private static void h(Parcel param1Parcel, SparseArray<Map<TrackGroupArray, DefaultTrackSelector.SelectionOverride>> param1SparseArray) {
      int i = param1SparseArray.size();
      param1Parcel.writeInt(i);
      for (byte b = 0; b < i; b++) {
        int j = param1SparseArray.keyAt(b);
        Map map = (Map)param1SparseArray.valueAt(b);
        int k = map.size();
        param1Parcel.writeInt(j);
        param1Parcel.writeInt(k);
        for (Map.Entry entry : map.entrySet()) {
          param1Parcel.writeParcelable((Parcelable)entry.getKey(), 0);
          param1Parcel.writeParcelable((Parcelable)entry.getValue(), 0);
        } 
      } 
    }
    
    public final boolean d(int param1Int) {
      return this.I.get(param1Int);
    }
    
    public int describeContents() {
      return 0;
    }
    
    public final DefaultTrackSelector.SelectionOverride e(int param1Int, TrackGroupArray param1TrackGroupArray) {
      Map map = (Map)this.H.get(param1Int);
      if (map != null) {
        DefaultTrackSelector.SelectionOverride selectionOverride = (DefaultTrackSelector.SelectionOverride)map.get(param1TrackGroupArray);
      } else {
        param1TrackGroupArray = null;
      } 
      return (DefaultTrackSelector.SelectionOverride)param1TrackGroupArray;
    }
    
    public boolean equals(Object param1Object) {
      boolean bool = true;
      if (this == param1Object)
        return true; 
      if (param1Object == null || Parameters.class != param1Object.getClass())
        return false; 
      Parameters parameters = (Parameters)param1Object;
      if (!super.equals(param1Object) || this.l != parameters.l || this.m != parameters.m || this.n != parameters.n || this.o != parameters.o || this.p != parameters.p || this.q != parameters.q || this.r != parameters.r || this.u != parameters.u || this.s != parameters.s || this.t != parameters.t || this.v != parameters.v || this.w != parameters.w || this.x != parameters.x || this.y != parameters.y || this.z != parameters.z || this.A != parameters.A || this.B != parameters.B || this.C != parameters.C || this.F != parameters.F || this.G != parameters.G || !a(this.I, parameters.I) || !b(this.H, parameters.H))
        bool = false; 
      return bool;
    }
    
    public final boolean f(int param1Int, TrackGroupArray param1TrackGroupArray) {
      boolean bool;
      Map map = (Map)this.H.get(param1Int);
      if (map != null && map.containsKey(param1TrackGroupArray)) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    public int hashCode() {
      return (((((((((((((((((((super.hashCode() * 31 + this.l) * 31 + this.m) * 31 + this.n) * 31 + this.o) * 31 + this.p) * 31 + this.q) * 31 + this.r) * 31 + this.u) * 31 + this.s) * 31 + this.t) * 31 + this.v) * 31 + this.w) * 31 + this.x) * 31 + this.y) * 31 + this.z) * 31 + this.A) * 31 + this.B) * 31 + this.C) * 31 + this.F) * 31 + this.G;
    }
    
    public void writeToParcel(Parcel param1Parcel, int param1Int) {
      super.writeToParcel(param1Parcel, param1Int);
      param1Parcel.writeInt(this.l);
      param1Parcel.writeInt(this.m);
      param1Parcel.writeInt(this.n);
      param1Parcel.writeInt(this.o);
      h0.x0(param1Parcel, this.p);
      h0.x0(param1Parcel, this.q);
      h0.x0(param1Parcel, this.r);
      param1Parcel.writeInt(this.s);
      param1Parcel.writeInt(this.t);
      h0.x0(param1Parcel, this.u);
      param1Parcel.writeInt(this.v);
      param1Parcel.writeInt(this.w);
      h0.x0(param1Parcel, this.x);
      h0.x0(param1Parcel, this.y);
      h0.x0(param1Parcel, this.z);
      h0.x0(param1Parcel, this.A);
      h0.x0(param1Parcel, this.B);
      h0.x0(param1Parcel, this.C);
      h0.x0(param1Parcel, this.F);
      param1Parcel.writeInt(this.G);
      h(param1Parcel, this.H);
      param1Parcel.writeSparseBooleanArray(this.I);
    }
    
    static final class a implements Parcelable.Creator<Parameters> {
      public DefaultTrackSelector.Parameters a(Parcel param2Parcel) {
        return new DefaultTrackSelector.Parameters(param2Parcel);
      }
      
      public DefaultTrackSelector.Parameters[] b(int param2Int) {
        return new DefaultTrackSelector.Parameters[param2Int];
      }
    }
  }
  
  static final class a implements Parcelable.Creator<Parameters> {
    public DefaultTrackSelector.Parameters a(Parcel param1Parcel) {
      return new DefaultTrackSelector.Parameters(param1Parcel);
    }
    
    public DefaultTrackSelector.Parameters[] b(int param1Int) {
      return new DefaultTrackSelector.Parameters[param1Int];
    }
  }
  
  public static final class SelectionOverride implements Parcelable {
    public static final Parcelable.Creator<SelectionOverride> CREATOR = new a();
    
    public final int b;
    
    public final int[] c;
    
    public final int d;
    
    public final int e;
    
    public final int f;
    
    public SelectionOverride(int param1Int, int... param1VarArgs) {
      this(param1Int, param1VarArgs, 2, 0);
    }
    
    public SelectionOverride(int param1Int1, int[] param1ArrayOfint, int param1Int2, int param1Int3) {
      this.b = param1Int1;
      int[] arrayOfInt = Arrays.copyOf(param1ArrayOfint, param1ArrayOfint.length);
      this.c = arrayOfInt;
      this.d = param1ArrayOfint.length;
      this.e = param1Int2;
      this.f = param1Int3;
      Arrays.sort(arrayOfInt);
    }
    
    SelectionOverride(Parcel param1Parcel) {
      this.b = param1Parcel.readInt();
      byte b = param1Parcel.readByte();
      this.d = b;
      int[] arrayOfInt = new int[b];
      this.c = arrayOfInt;
      param1Parcel.readIntArray(arrayOfInt);
      this.e = param1Parcel.readInt();
      this.f = param1Parcel.readInt();
    }
    
    public boolean a(int param1Int) {
      int[] arrayOfInt = this.c;
      int i = arrayOfInt.length;
      for (byte b = 0; b < i; b++) {
        if (arrayOfInt[b] == param1Int)
          return true; 
      } 
      return false;
    }
    
    public int describeContents() {
      return 0;
    }
    
    public boolean equals(Object param1Object) {
      boolean bool = true;
      if (this == param1Object)
        return true; 
      if (param1Object == null || SelectionOverride.class != param1Object.getClass())
        return false; 
      param1Object = param1Object;
      if (this.b != ((SelectionOverride)param1Object).b || !Arrays.equals(this.c, ((SelectionOverride)param1Object).c) || this.e != ((SelectionOverride)param1Object).e || this.f != ((SelectionOverride)param1Object).f)
        bool = false; 
      return bool;
    }
    
    public int hashCode() {
      return ((this.b * 31 + Arrays.hashCode(this.c)) * 31 + this.e) * 31 + this.f;
    }
    
    public void writeToParcel(Parcel param1Parcel, int param1Int) {
      param1Parcel.writeInt(this.b);
      param1Parcel.writeInt(this.c.length);
      param1Parcel.writeIntArray(this.c);
      param1Parcel.writeInt(this.e);
      param1Parcel.writeInt(this.f);
    }
    
    static final class a implements Parcelable.Creator<SelectionOverride> {
      public DefaultTrackSelector.SelectionOverride a(Parcel param2Parcel) {
        return new DefaultTrackSelector.SelectionOverride(param2Parcel);
      }
      
      public DefaultTrackSelector.SelectionOverride[] b(int param2Int) {
        return new DefaultTrackSelector.SelectionOverride[param2Int];
      }
    }
  }
  
  static final class a implements Parcelable.Creator<SelectionOverride> {
    public DefaultTrackSelector.SelectionOverride a(Parcel param1Parcel) {
      return new DefaultTrackSelector.SelectionOverride(param1Parcel);
    }
    
    public DefaultTrackSelector.SelectionOverride[] b(int param1Int) {
      return new DefaultTrackSelector.SelectionOverride[param1Int];
    }
  }
  
  private static final class a {
    public final int a;
    
    public final int b;
    
    public final String c;
    
    public a(int param1Int1, int param1Int2, String param1String) {
      this.a = param1Int1;
      this.b = param1Int2;
      this.c = param1String;
    }
    
    public boolean equals(Object param1Object) {
      boolean bool = true;
      if (this == param1Object)
        return true; 
      if (param1Object == null || a.class != param1Object.getClass())
        return false; 
      param1Object = param1Object;
      if (this.a != ((a)param1Object).a || this.b != ((a)param1Object).b || !TextUtils.equals(this.c, ((a)param1Object).c))
        bool = false; 
      return bool;
    }
    
    public int hashCode() {
      byte b;
      int i = this.a;
      int j = this.b;
      String str = this.c;
      if (str != null) {
        b = str.hashCode();
      } else {
        b = 0;
      } 
      return (i * 31 + j) * 31 + b;
    }
  }
  
  protected static final class b implements Comparable<b> {
    public final boolean b;
    
    private final String c;
    
    private final DefaultTrackSelector.Parameters d;
    
    private final boolean e;
    
    private final int f;
    
    private final int g;
    
    private final int h;
    
    private final boolean i;
    
    private final int j;
    
    private final int k;
    
    private final int l;
    
    public b(Format param1Format, DefaultTrackSelector.Parameters param1Parameters, int param1Int) {
      // Byte code:
      //   0: aload_0
      //   1: invokespecial <init> : ()V
      //   4: aload_0
      //   5: aload_2
      //   6: putfield d : Lcom/google/android/exoplayer2/trackselection/DefaultTrackSelector$Parameters;
      //   9: aload_0
      //   10: aload_1
      //   11: getfield B : Ljava/lang/String;
      //   14: invokestatic y : (Ljava/lang/String;)Ljava/lang/String;
      //   17: putfield c : Ljava/lang/String;
      //   20: iconst_0
      //   21: istore #4
      //   23: aload_0
      //   24: iload_3
      //   25: iconst_0
      //   26: invokestatic u : (IZ)Z
      //   29: putfield e : Z
      //   32: aload_0
      //   33: aload_1
      //   34: aload_2
      //   35: getfield d : Ljava/lang/String;
      //   38: iconst_0
      //   39: invokestatic r : (Lcom/google/android/exoplayer2/Format;Ljava/lang/String;Z)I
      //   42: putfield f : I
      //   45: aload_1
      //   46: getfield d : I
      //   49: istore_3
      //   50: iconst_1
      //   51: istore #5
      //   53: iload_3
      //   54: iconst_1
      //   55: iand
      //   56: ifeq -> 65
      //   59: iconst_1
      //   60: istore #6
      //   62: goto -> 68
      //   65: iconst_0
      //   66: istore #6
      //   68: aload_0
      //   69: iload #6
      //   71: putfield i : Z
      //   74: aload_1
      //   75: getfield w : I
      //   78: istore_3
      //   79: aload_0
      //   80: iload_3
      //   81: putfield j : I
      //   84: aload_0
      //   85: aload_1
      //   86: getfield x : I
      //   89: putfield k : I
      //   92: aload_1
      //   93: getfield f : I
      //   96: istore #7
      //   98: aload_0
      //   99: iload #7
      //   101: putfield l : I
      //   104: iload #7
      //   106: iconst_m1
      //   107: if_icmpeq -> 119
      //   110: iload #7
      //   112: aload_2
      //   113: getfield w : I
      //   116: if_icmpgt -> 143
      //   119: iload #5
      //   121: istore #6
      //   123: iload_3
      //   124: iconst_m1
      //   125: if_icmpeq -> 146
      //   128: iload_3
      //   129: aload_2
      //   130: getfield v : I
      //   133: if_icmpgt -> 143
      //   136: iload #5
      //   138: istore #6
      //   140: goto -> 146
      //   143: iconst_0
      //   144: istore #6
      //   146: aload_0
      //   147: iload #6
      //   149: putfield b : Z
      //   152: invokestatic M : ()[Ljava/lang/String;
      //   155: astore_2
      //   156: ldc 2147483647
      //   158: istore #8
      //   160: iconst_0
      //   161: istore_3
      //   162: iload #4
      //   164: istore #7
      //   166: iload #8
      //   168: istore #9
      //   170: iload_3
      //   171: aload_2
      //   172: arraylength
      //   173: if_icmpge -> 203
      //   176: aload_1
      //   177: aload_2
      //   178: iload_3
      //   179: aaload
      //   180: iconst_0
      //   181: invokestatic r : (Lcom/google/android/exoplayer2/Format;Ljava/lang/String;Z)I
      //   184: istore #7
      //   186: iload #7
      //   188: ifle -> 197
      //   191: iload_3
      //   192: istore #9
      //   194: goto -> 203
      //   197: iinc #3, 1
      //   200: goto -> 162
      //   203: aload_0
      //   204: iload #9
      //   206: putfield g : I
      //   209: aload_0
      //   210: iload #7
      //   212: putfield h : I
      //   215: return
    }
    
    public int a(b param1b) {
      boolean bool1 = this.e;
      boolean bool2 = param1b.e;
      int i = 1;
      int j = 1;
      int k = 1;
      byte b1 = 1;
      int m = 1;
      if (bool1 != bool2) {
        if (bool1) {
          j = m;
        } else {
          j = -1;
        } 
        return j;
      } 
      m = this.f;
      int n = param1b.f;
      if (m != n)
        return DefaultTrackSelector.i(m, n); 
      bool1 = this.b;
      if (bool1 != param1b.b) {
        if (bool1) {
          j = i;
        } else {
          j = -1;
        } 
        return j;
      } 
      if (this.d.B) {
        i = DefaultTrackSelector.j(this.l, param1b.l);
        if (i != 0) {
          if (i > 0)
            j = -1; 
          return j;
        } 
      } 
      bool1 = this.i;
      if (bool1 != param1b.i) {
        if (bool1) {
          j = k;
        } else {
          j = -1;
        } 
        return j;
      } 
      j = this.g;
      k = param1b.g;
      if (j != k)
        return -DefaultTrackSelector.i(j, k); 
      k = this.h;
      j = param1b.h;
      if (k != j)
        return DefaultTrackSelector.i(k, j); 
      if (!this.b || !this.e)
        b1 = -1; 
      j = this.j;
      k = param1b.j;
      if (j != k) {
        j = DefaultTrackSelector.i(j, k);
        return b1 * j;
      } 
      k = this.k;
      j = param1b.k;
      if (k != j) {
        j = DefaultTrackSelector.i(k, j);
        return b1 * j;
      } 
      if (h0.b(this.c, param1b.c)) {
        j = DefaultTrackSelector.i(this.l, param1b.l);
        return b1 * j;
      } 
      return 0;
    }
  }
  
  public static final class c extends TrackSelectionParameters.b {
    private final SparseBooleanArray A;
    
    private int f;
    
    private int g;
    
    private int h;
    
    private int i;
    
    private boolean j;
    
    private boolean k;
    
    private boolean l;
    
    private int m;
    
    private int n;
    
    private boolean o;
    
    private int p;
    
    private int q;
    
    private boolean r;
    
    private boolean s;
    
    private boolean t;
    
    private boolean u;
    
    private boolean v;
    
    private boolean w;
    
    private boolean x;
    
    private int y;
    
    private final SparseArray<Map<TrackGroupArray, DefaultTrackSelector.SelectionOverride>> z;
    
    @Deprecated
    public c() {
      c();
      this.z = new SparseArray();
      this.A = new SparseBooleanArray();
    }
    
    private void c() {
      this.f = Integer.MAX_VALUE;
      this.g = Integer.MAX_VALUE;
      this.h = Integer.MAX_VALUE;
      this.i = Integer.MAX_VALUE;
      this.j = true;
      this.k = false;
      this.l = true;
      this.m = Integer.MAX_VALUE;
      this.n = Integer.MAX_VALUE;
      this.o = true;
      this.p = Integer.MAX_VALUE;
      this.q = Integer.MAX_VALUE;
      this.r = true;
      this.s = false;
      this.t = false;
      this.u = false;
      this.v = false;
      this.w = false;
      this.x = true;
      this.y = 0;
    }
    
    public DefaultTrackSelector.Parameters b() {
      return new DefaultTrackSelector.Parameters(this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.a, this.p, this.q, this.r, this.s, this.t, this.u, this.b, this.c, this.d, this.e, this.v, this.w, this.x, this.y, this.z, this.A);
    }
  }
  
  protected static final class d implements Comparable<d> {
    public final boolean b;
    
    private final boolean c;
    
    private final boolean d;
    
    private final boolean e;
    
    private final int f;
    
    private final int g;
    
    private final int h;
    
    private final boolean i;
    
    public d(Format param1Format, DefaultTrackSelector.Parameters param1Parameters, int param1Int, String param1String) {
      // Byte code:
      //   0: aload_0
      //   1: invokespecial <init> : ()V
      //   4: iconst_0
      //   5: istore #5
      //   7: aload_0
      //   8: iload_3
      //   9: iconst_0
      //   10: invokestatic u : (IZ)Z
      //   13: putfield c : Z
      //   16: aload_1
      //   17: getfield d : I
      //   20: aload_2
      //   21: getfield h : I
      //   24: iconst_m1
      //   25: ixor
      //   26: iand
      //   27: istore_3
      //   28: iload_3
      //   29: iconst_1
      //   30: iand
      //   31: ifeq -> 40
      //   34: iconst_1
      //   35: istore #6
      //   37: goto -> 43
      //   40: iconst_0
      //   41: istore #6
      //   43: aload_0
      //   44: iload #6
      //   46: putfield d : Z
      //   49: iload_3
      //   50: iconst_2
      //   51: iand
      //   52: ifeq -> 60
      //   55: iconst_1
      //   56: istore_3
      //   57: goto -> 62
      //   60: iconst_0
      //   61: istore_3
      //   62: aload_1
      //   63: aload_2
      //   64: getfield e : Ljava/lang/String;
      //   67: aload_2
      //   68: getfield g : Z
      //   71: invokestatic r : (Lcom/google/android/exoplayer2/Format;Ljava/lang/String;Z)I
      //   74: istore #7
      //   76: aload_0
      //   77: iload #7
      //   79: putfield f : I
      //   82: aload_1
      //   83: getfield e : I
      //   86: aload_2
      //   87: getfield f : I
      //   90: iand
      //   91: invokestatic bitCount : (I)I
      //   94: istore #8
      //   96: aload_0
      //   97: iload #8
      //   99: putfield g : I
      //   102: aload_1
      //   103: getfield e : I
      //   106: sipush #1088
      //   109: iand
      //   110: ifeq -> 119
      //   113: iconst_1
      //   114: istore #9
      //   116: goto -> 122
      //   119: iconst_0
      //   120: istore #9
      //   122: aload_0
      //   123: iload #9
      //   125: putfield i : Z
      //   128: iload #7
      //   130: ifle -> 137
      //   133: iload_3
      //   134: ifeq -> 146
      //   137: iload #7
      //   139: ifne -> 152
      //   142: iload_3
      //   143: ifeq -> 152
      //   146: iconst_1
      //   147: istore #9
      //   149: goto -> 155
      //   152: iconst_0
      //   153: istore #9
      //   155: aload_0
      //   156: iload #9
      //   158: putfield e : Z
      //   161: aload #4
      //   163: invokestatic y : (Ljava/lang/String;)Ljava/lang/String;
      //   166: ifnonnull -> 175
      //   169: iconst_1
      //   170: istore #9
      //   172: goto -> 178
      //   175: iconst_0
      //   176: istore #9
      //   178: aload_1
      //   179: aload #4
      //   181: iload #9
      //   183: invokestatic r : (Lcom/google/android/exoplayer2/Format;Ljava/lang/String;Z)I
      //   186: istore #10
      //   188: aload_0
      //   189: iload #10
      //   191: putfield h : I
      //   194: iload #7
      //   196: ifgt -> 233
      //   199: aload_2
      //   200: getfield e : Ljava/lang/String;
      //   203: ifnonnull -> 211
      //   206: iload #8
      //   208: ifgt -> 233
      //   211: iload #6
      //   213: ifne -> 233
      //   216: iload #5
      //   218: istore #6
      //   220: iload_3
      //   221: ifeq -> 236
      //   224: iload #5
      //   226: istore #6
      //   228: iload #10
      //   230: ifle -> 236
      //   233: iconst_1
      //   234: istore #6
      //   236: aload_0
      //   237: iload #6
      //   239: putfield b : Z
      //   242: return
    }
    
    public int a(d param1d) {
      boolean bool1 = this.c;
      boolean bool2 = param1d.c;
      int i = 1;
      int j = 1;
      int k = 1;
      int m = 1;
      if (bool1 != bool2) {
        if (bool1) {
          k = m;
        } else {
          k = -1;
        } 
        return k;
      } 
      int n = this.f;
      m = param1d.f;
      if (n != m)
        return DefaultTrackSelector.i(n, m); 
      m = this.g;
      n = param1d.g;
      if (m != n)
        return DefaultTrackSelector.i(m, n); 
      bool2 = this.d;
      if (bool2 != param1d.d) {
        if (bool2) {
          k = i;
        } else {
          k = -1;
        } 
        return k;
      } 
      bool2 = this.e;
      if (bool2 != param1d.e) {
        if (bool2) {
          k = j;
        } else {
          k = -1;
        } 
        return k;
      } 
      i = this.h;
      j = param1d.h;
      if (i != j)
        return DefaultTrackSelector.i(i, j); 
      if (m == 0) {
        bool2 = this.i;
        if (bool2 != param1d.i) {
          if (bool2)
            k = -1; 
          return k;
        } 
      } 
      return 0;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/trackselection/DefaultTrackSelector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */