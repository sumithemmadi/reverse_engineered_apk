package androidx.recyclerview.widget;

import java.util.List;

class h {
  final a a;
  
  h(a parama) {
    this.a = parama;
  }
  
  private int a(List<a.b> paramList) {
    int i = paramList.size() - 1;
    for (boolean bool = false; i >= 0; bool = bool1) {
      boolean bool1;
      if (((a.b)paramList.get(i)).a == 8) {
        bool1 = bool;
        if (bool)
          return i; 
      } else {
        bool1 = true;
      } 
      i--;
    } 
    return -1;
  }
  
  private void c(List<a.b> paramList, int paramInt1, a.b paramb1, int paramInt2, a.b paramb2) {
    int i = paramb1.d;
    int j = paramb2.b;
    if (i < j) {
      k = -1;
    } else {
      k = 0;
    } 
    int m = paramb1.b;
    int n = k;
    if (m < j)
      n = k + 1; 
    if (j <= m)
      paramb1.b = m + paramb2.d; 
    int k = paramb2.b;
    if (k <= i)
      paramb1.d = i + paramb2.d; 
    paramb2.b = k + n;
    paramList.set(paramInt1, paramb2);
    paramList.set(paramInt2, paramb1);
  }
  
  private void d(List<a.b> paramList, int paramInt1, int paramInt2) {
    a.b b1 = paramList.get(paramInt1);
    a.b b2 = paramList.get(paramInt2);
    int i = b2.a;
    if (i != 1) {
      if (i != 2) {
        if (i == 4)
          f(paramList, paramInt1, b1, paramInt2, b2); 
      } else {
        e(paramList, paramInt1, b1, paramInt2, b2);
      } 
    } else {
      c(paramList, paramInt1, b1, paramInt2, b2);
    } 
  }
  
  void b(List<a.b> paramList) {
    while (true) {
      int i = a(paramList);
      if (i != -1) {
        d(paramList, i, i + 1);
        continue;
      } 
      break;
    } 
  }
  
  void e(List<a.b> paramList, int paramInt1, a.b paramb1, int paramInt2, a.b paramb2) {
    int i = paramb1.b;
    int j = paramb1.d;
    boolean bool = false;
    if (i < j) {
      if (paramb2.b == i && paramb2.d == j - i) {
        i = 0;
      } else {
        i = 0;
        int m = paramb2.b;
      } 
    } else if (paramb2.b == j + 1 && paramb2.d == i - j) {
      i = 1;
    } else {
      i = 1;
      int m = paramb2.b;
    } 
    bool = true;
    int k = paramb2.b;
  }
  
  void f(List<a.b> paramList, int paramInt1, a.b paramb1, int paramInt2, a.b paramb2) {
    // Byte code:
    //   0: aload_3
    //   1: getfield d : I
    //   4: istore #6
    //   6: aload #5
    //   8: getfield b : I
    //   11: istore #7
    //   13: aconst_null
    //   14: astore #8
    //   16: iload #6
    //   18: iload #7
    //   20: if_icmpge -> 35
    //   23: aload #5
    //   25: iload #7
    //   27: iconst_1
    //   28: isub
    //   29: putfield b : I
    //   32: goto -> 86
    //   35: aload #5
    //   37: getfield d : I
    //   40: istore #9
    //   42: iload #6
    //   44: iload #7
    //   46: iload #9
    //   48: iadd
    //   49: if_icmpge -> 86
    //   52: aload #5
    //   54: iload #9
    //   56: iconst_1
    //   57: isub
    //   58: putfield d : I
    //   61: aload_0
    //   62: getfield a : Landroidx/recyclerview/widget/h$a;
    //   65: iconst_4
    //   66: aload_3
    //   67: getfield b : I
    //   70: iconst_1
    //   71: aload #5
    //   73: getfield c : Ljava/lang/Object;
    //   76: invokeinterface b : (IIILjava/lang/Object;)Landroidx/recyclerview/widget/a$b;
    //   81: astore #10
    //   83: goto -> 89
    //   86: aconst_null
    //   87: astore #10
    //   89: aload_3
    //   90: getfield b : I
    //   93: istore #7
    //   95: aload #5
    //   97: getfield b : I
    //   100: istore #9
    //   102: iload #7
    //   104: iload #9
    //   106: if_icmpgt -> 121
    //   109: aload #5
    //   111: iload #9
    //   113: iconst_1
    //   114: iadd
    //   115: putfield b : I
    //   118: goto -> 184
    //   121: aload #5
    //   123: getfield d : I
    //   126: istore #6
    //   128: iload #7
    //   130: iload #9
    //   132: iload #6
    //   134: iadd
    //   135: if_icmpge -> 184
    //   138: iload #9
    //   140: iload #6
    //   142: iadd
    //   143: iload #7
    //   145: isub
    //   146: istore #6
    //   148: aload_0
    //   149: getfield a : Landroidx/recyclerview/widget/h$a;
    //   152: iconst_4
    //   153: iload #7
    //   155: iconst_1
    //   156: iadd
    //   157: iload #6
    //   159: aload #5
    //   161: getfield c : Ljava/lang/Object;
    //   164: invokeinterface b : (IIILjava/lang/Object;)Landroidx/recyclerview/widget/a$b;
    //   169: astore #8
    //   171: aload #5
    //   173: aload #5
    //   175: getfield d : I
    //   178: iload #6
    //   180: isub
    //   181: putfield d : I
    //   184: aload_1
    //   185: iload #4
    //   187: aload_3
    //   188: invokeinterface set : (ILjava/lang/Object;)Ljava/lang/Object;
    //   193: pop
    //   194: aload #5
    //   196: getfield d : I
    //   199: ifle -> 215
    //   202: aload_1
    //   203: iload_2
    //   204: aload #5
    //   206: invokeinterface set : (ILjava/lang/Object;)Ljava/lang/Object;
    //   211: pop
    //   212: goto -> 234
    //   215: aload_1
    //   216: iload_2
    //   217: invokeinterface remove : (I)Ljava/lang/Object;
    //   222: pop
    //   223: aload_0
    //   224: getfield a : Landroidx/recyclerview/widget/h$a;
    //   227: aload #5
    //   229: invokeinterface a : (Landroidx/recyclerview/widget/a$b;)V
    //   234: aload #10
    //   236: ifnull -> 248
    //   239: aload_1
    //   240: iload_2
    //   241: aload #10
    //   243: invokeinterface add : (ILjava/lang/Object;)V
    //   248: aload #8
    //   250: ifnull -> 262
    //   253: aload_1
    //   254: iload_2
    //   255: aload #8
    //   257: invokeinterface add : (ILjava/lang/Object;)V
    //   262: return
  }
  
  static interface a {
    void a(a.b param1b);
    
    a.b b(int param1Int1, int param1Int2, int param1Int3, Object param1Object);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/recyclerview/widget/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */