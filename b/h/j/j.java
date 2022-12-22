package b.h.j;

import java.io.PrintWriter;

public final class j {
  private static final Object a = new Object();
  
  private static char[] b = new char[24];
  
  private static int a(int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3) {
    return (paramInt1 > 99 || (paramBoolean && paramInt3 >= 3)) ? (paramInt2 + 3) : ((paramInt1 > 9 || (paramBoolean && paramInt3 >= 2)) ? (paramInt2 + 2) : ((paramBoolean || paramInt1 > 0) ? (paramInt2 + 1) : 0));
  }
  
  public static void b(long paramLong1, long paramLong2, PrintWriter paramPrintWriter) {
    if (paramLong1 == 0L) {
      paramPrintWriter.print("--");
      return;
    } 
    d(paramLong1 - paramLong2, paramPrintWriter, 0);
  }
  
  public static void c(long paramLong, PrintWriter paramPrintWriter) {
    d(paramLong, paramPrintWriter, 0);
  }
  
  public static void d(long paramLong, PrintWriter paramPrintWriter, int paramInt) {
    synchronized (a) {
      paramInt = e(paramLong, paramInt);
      String str = new String();
      this(b, 0, paramInt);
      paramPrintWriter.print(str);
      return;
    } 
  }
  
  private static int e(long paramLong, int paramInt) {
    boolean bool1;
    boolean bool2;
    int i1;
    boolean bool3;
    byte b;
    if (b.length < paramInt)
      b = new char[paramInt]; 
    char[] arrayOfChar = b;
    if (paramLong == 0L) {
      while (paramInt - 1 > 0)
        arrayOfChar[0] = (char)' '; 
      arrayOfChar[0] = (char)'0';
      return 1;
    } 
    if (paramLong > 0L) {
      i = 43;
    } else {
      i = 45;
      paramLong = -paramLong;
    } 
    int k = (int)(paramLong % 1000L);
    int m = (int)Math.floor((paramLong / 1000L));
    if (m > 86400) {
      n = m / 86400;
      m -= 86400 * n;
    } else {
      n = 0;
    } 
    if (m > 3600) {
      bool1 = m / 3600;
      m -= bool1 * 3600;
    } else {
      bool1 = false;
    } 
    if (m > 60) {
      bool2 = m / 60;
      i1 = m - bool2 * 60;
    } else {
      bool2 = false;
      i1 = m;
    } 
    if (paramInt != 0) {
      m = a(n, 1, false, 0);
      if (m > 0) {
        bool3 = true;
      } else {
        bool3 = false;
      } 
      m += a(bool1, 1, bool3, 2);
      if (m > 0) {
        bool3 = true;
      } else {
        bool3 = false;
      } 
      m += a(bool2, 1, bool3, 2);
      if (m > 0) {
        bool3 = true;
      } else {
        bool3 = false;
      } 
      int i2 = m + a(i1, 1, bool3, 2);
      if (i2 > 0) {
        m = 3;
      } else {
        m = 0;
      } 
      i2 += a(k, 2, true, m) + 1;
      m = 0;
      while (true) {
        b = m;
        if (i2 < paramInt) {
          arrayOfChar[m] = (char)' ';
          m++;
          i2++;
          continue;
        } 
        break;
      } 
    } else {
      b = 0;
    } 
    arrayOfChar[b] = (char)i;
    int i = b + 1;
    if (paramInt != 0) {
      paramInt = 1;
    } else {
      paramInt = 0;
    } 
    int n = f(arrayOfChar, n, 'd', i, false, 0);
    if (n != i) {
      bool3 = true;
    } else {
      bool3 = false;
    } 
    if (paramInt != 0) {
      m = 2;
    } else {
      m = 0;
    } 
    n = f(arrayOfChar, bool1, 'h', n, bool3, m);
    if (n != i) {
      bool3 = true;
    } else {
      bool3 = false;
    } 
    if (paramInt != 0) {
      m = 2;
    } else {
      m = 0;
    } 
    n = f(arrayOfChar, bool2, 'm', n, bool3, m);
    if (n != i) {
      bool3 = true;
    } else {
      bool3 = false;
    } 
    if (paramInt != 0) {
      m = 2;
    } else {
      m = 0;
    } 
    m = f(arrayOfChar, i1, 's', n, bool3, m);
    if (paramInt != 0 && m != i) {
      paramInt = 3;
    } else {
      paramInt = 0;
    } 
    paramInt = f(arrayOfChar, k, 'm', m, true, paramInt);
    arrayOfChar[paramInt] = (char)'s';
    return paramInt + 1;
  }
  
  private static int f(char[] paramArrayOfchar, int paramInt1, char paramChar, int paramInt2, boolean paramBoolean, int paramInt3) {
    // Byte code:
    //   0: iload #4
    //   2: ifne -> 12
    //   5: iload_3
    //   6: istore #6
    //   8: iload_1
    //   9: ifle -> 149
    //   12: iload #4
    //   14: ifeq -> 23
    //   17: iload #5
    //   19: iconst_3
    //   20: if_icmpge -> 29
    //   23: iload_1
    //   24: bipush #99
    //   26: if_icmple -> 61
    //   29: iload_1
    //   30: bipush #100
    //   32: idiv
    //   33: istore #7
    //   35: aload_0
    //   36: iload_3
    //   37: iload #7
    //   39: bipush #48
    //   41: iadd
    //   42: i2c
    //   43: i2c
    //   44: castore
    //   45: iload_3
    //   46: iconst_1
    //   47: iadd
    //   48: istore #6
    //   50: iload_1
    //   51: iload #7
    //   53: bipush #100
    //   55: imul
    //   56: isub
    //   57: istore_1
    //   58: goto -> 64
    //   61: iload_3
    //   62: istore #6
    //   64: iload #4
    //   66: ifeq -> 75
    //   69: iload #5
    //   71: iconst_2
    //   72: if_icmpge -> 94
    //   75: iload_1
    //   76: bipush #9
    //   78: if_icmpgt -> 94
    //   81: iload #6
    //   83: istore #7
    //   85: iload_1
    //   86: istore #5
    //   88: iload_3
    //   89: iload #6
    //   91: if_icmpeq -> 123
    //   94: iload_1
    //   95: bipush #10
    //   97: idiv
    //   98: istore_3
    //   99: aload_0
    //   100: iload #6
    //   102: iload_3
    //   103: bipush #48
    //   105: iadd
    //   106: i2c
    //   107: i2c
    //   108: castore
    //   109: iload #6
    //   111: iconst_1
    //   112: iadd
    //   113: istore #7
    //   115: iload_1
    //   116: iload_3
    //   117: bipush #10
    //   119: imul
    //   120: isub
    //   121: istore #5
    //   123: aload_0
    //   124: iload #7
    //   126: iload #5
    //   128: bipush #48
    //   130: iadd
    //   131: i2c
    //   132: i2c
    //   133: castore
    //   134: iload #7
    //   136: iconst_1
    //   137: iadd
    //   138: istore_1
    //   139: aload_0
    //   140: iload_1
    //   141: iload_2
    //   142: i2c
    //   143: castore
    //   144: iload_1
    //   145: iconst_1
    //   146: iadd
    //   147: istore #6
    //   149: iload #6
    //   151: ireturn
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/h/j/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */