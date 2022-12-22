package com.google.android.exoplayer2.text.l;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.google.android.exoplayer2.text.b;
import com.google.android.exoplayer2.text.e;
import com.google.android.exoplayer2.text.h;
import com.google.android.exoplayer2.text.i;
import com.google.android.exoplayer2.util.o;
import com.google.android.exoplayer2.util.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class a extends e {
  private static final int[] g = new int[] { 11, 1, 3, 12, 14, 5, 7, 9 };
  
  private static final int[] h = new int[] { 0, 4, 8, 12, 16, 20, 24, 28 };
  
  private static final int[] i = new int[] { -1, -16711936, -16776961, -16711681, -65536, -256, -65281 };
  
  private static final int[] j = new int[] { 
      32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 
      225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 
      52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 
      62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 
      72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 
      82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 
      233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 
      102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 
      112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 
      122, 231, 247, 209, 241, 9632 };
  
  private static final int[] k = new int[] { 
      174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 
      232, 226, 234, 238, 244, 251 };
  
  private static final int[] l = new int[] { 
      193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 
      8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 
      202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 
      171, 187 };
  
  private static final int[] m = new int[] { 
      195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 
      125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 
      223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 
      9492, 9496 };
  
  private static final boolean[] n = new boolean[] { 
      false, true, true, false, true, false, false, true, true, false, 
      false, true, false, true, true, false, true, false, false, true, 
      false, true, true, false, false, true, true, false, true, false, 
      false, true, true, false, false, true, false, true, true, false, 
      false, true, true, false, true, false, false, true, false, true, 
      true, false, true, false, false, true, true, false, false, true, 
      false, true, true, false, true, false, false, true, false, true, 
      true, false, false, true, true, false, true, false, false, true, 
      false, true, true, false, true, false, false, true, true, false, 
      false, true, false, true, true, false, false, true, true, false, 
      true, false, false, true, true, false, false, true, false, true, 
      true, false, true, false, false, true, false, true, true, false, 
      false, true, true, false, true, false, false, true, true, false, 
      false, true, false, true, true, false, false, true, true, false, 
      true, false, false, true, false, true, true, false, true, false, 
      false, true, true, false, false, true, false, true, true, false, 
      false, true, true, false, true, false, false, true, true, false, 
      false, true, false, true, true, false, true, false, false, true, 
      false, true, true, false, false, true, true, false, true, false, 
      false, true, false, true, true, false, true, false, false, true, 
      true, false, false, true, false, true, true, false, true, false, 
      false, true, false, true, true, false, false, true, true, false, 
      true, false, false, true, true, false, false, true, false, true, 
      true, false, false, true, true, false, true, false, false, true, 
      false, true, true, false, true, false, false, true, true, false, 
      false, true, false, true, true, false };
  
  private byte A;
  
  private byte B;
  
  private int C;
  
  private boolean D;
  
  private final v o;
  
  private final int p;
  
  private final int q;
  
  private final int r;
  
  private final ArrayList<a> s;
  
  private a t;
  
  private List<b> u;
  
  private List<b> v;
  
  private int w;
  
  private int x;
  
  private boolean y;
  
  private boolean z;
  
  public a(String paramString, int paramInt) {
    byte b;
    this.o = new v();
    this.s = new ArrayList<a>();
    this.t = new a(0, 4);
    this.C = 0;
    if ("application/x-mp4-cea-608".equals(paramString)) {
      b = 2;
    } else {
      b = 3;
    } 
    this.p = b;
    if (paramInt != 1) {
      if (paramInt != 2) {
        if (paramInt != 3) {
          if (paramInt != 4) {
            o.f("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.r = 0;
            this.q = 0;
          } else {
            this.r = 1;
            this.q = 1;
          } 
        } else {
          this.r = 0;
          this.q = 1;
        } 
      } else {
        this.r = 1;
        this.q = 0;
      } 
    } else {
      this.r = 0;
      this.q = 0;
    } 
    L(0);
    K();
    this.D = true;
  }
  
  private static boolean A(byte paramByte1, byte paramByte2) {
    boolean bool;
    if ((paramByte1 & 0xF7) == 17 && (paramByte2 & 0xF0) == 32) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private static boolean B(byte paramByte1, byte paramByte2) {
    boolean bool;
    if ((paramByte1 & 0xF6) == 20 && (paramByte2 & 0xF0) == 32) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private static boolean C(byte paramByte1, byte paramByte2) {
    boolean bool;
    if ((paramByte1 & 0xF0) == 16 && (paramByte2 & 0xC0) == 64) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private static boolean D(byte paramByte) {
    boolean bool;
    if ((paramByte & 0xF0) == 16) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private boolean E(boolean paramBoolean, byte paramByte1, byte paramByte2) {
    if (paramBoolean && D(paramByte1)) {
      if (this.z && this.A == paramByte1 && this.B == paramByte2) {
        this.z = false;
        return true;
      } 
      this.z = true;
      this.A = paramByte1;
      this.B = (byte)paramByte2;
    } else {
      this.z = false;
    } 
    return false;
  }
  
  private static boolean F(byte paramByte) {
    boolean bool;
    if ((paramByte & 0xF7) == 20) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private static boolean G(byte paramByte1, byte paramByte2) {
    boolean bool;
    if ((paramByte1 & 0xF7) == 17 && (paramByte2 & 0xF0) == 48) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private static boolean H(byte paramByte1, byte paramByte2) {
    boolean bool;
    if ((paramByte1 & 0xF7) == 23 && paramByte2 >= 33 && paramByte2 <= 35) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private static boolean I(byte paramByte) {
    boolean bool = true;
    if (1 > paramByte || paramByte > 15)
      bool = false; 
    return bool;
  }
  
  private void J(byte paramByte1, byte paramByte2) {
    if (I(paramByte1))
      this.D = false; 
    if (F(paramByte1)) {
      if (paramByte2 != 32 && paramByte2 != 47)
        switch (paramByte2) {
          default:
            switch (paramByte2) {
              default:
                return;
              case 42:
              case 43:
                this.D = false;
              case 41:
                break;
            } 
            break;
          case 37:
          case 38:
          case 39:
            break;
        }  
      this.D = true;
    } 
  }
  
  private void K() {
    this.t.j(this.w);
    this.s.clear();
    this.s.add(this.t);
  }
  
  private void L(int paramInt) {
    int i = this.w;
    if (i == paramInt)
      return; 
    this.w = paramInt;
    if (paramInt == 3) {
      for (i = 0; i < this.s.size(); i++)
        ((a)this.s.get(i)).l(paramInt); 
      return;
    } 
    K();
    if (i == 3 || paramInt == 1 || paramInt == 0)
      this.u = Collections.emptyList(); 
  }
  
  private void M(int paramInt) {
    this.x = paramInt;
    this.t.m(paramInt);
  }
  
  private boolean N(byte paramByte) {
    boolean bool;
    if (y(paramByte))
      this.C = p(paramByte); 
    if (this.C == this.r) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private static char o(byte paramByte) {
    return (char)j[(paramByte & Byte.MAX_VALUE) - 32];
  }
  
  private static int p(byte paramByte) {
    return paramByte >> 3 & 0x1;
  }
  
  private List<b> q() {
    int i = this.s.size();
    ArrayList<b> arrayList1 = new ArrayList(i);
    boolean bool = false;
    int j = 2;
    byte b = 0;
    while (b < i) {
      b b1 = ((a)this.s.get(b)).g(-2147483648);
      arrayList1.add(b1);
      int k = j;
      if (b1 != null)
        k = Math.min(j, b1.j); 
      b++;
      j = k;
    } 
    ArrayList<b> arrayList2 = new ArrayList(i);
    for (b = bool; b < i; b++) {
      b b1 = arrayList1.get(b);
      if (b1 != null) {
        b b2 = b1;
        if (b1.j != j)
          b2 = ((a)this.s.get(b)).g(j); 
        arrayList2.add(b2);
      } 
    } 
    return arrayList2;
  }
  
  private static char r(byte paramByte) {
    return (char)l[paramByte & 0x1F];
  }
  
  private static char s(byte paramByte) {
    return (char)m[paramByte & 0x1F];
  }
  
  private static char t(byte paramByte1, byte paramByte2) {
    return ((paramByte1 & 0x1) == 0) ? r(paramByte2) : s(paramByte2);
  }
  
  private static char u(byte paramByte) {
    return (char)k[paramByte & 0xF];
  }
  
  private void v(byte paramByte) {
    boolean bool;
    this.t.e(' ');
    if ((paramByte & 0x1) == 1) {
      bool = true;
    } else {
      bool = false;
    } 
    this.t.p(paramByte >> 1 & 0x7, bool);
  }
  
  private void w(byte paramByte) {
    if (paramByte != 32) {
      if (paramByte != 41) {
        int i;
        switch (paramByte) {
          default:
            i = this.w;
            if (i == 0)
              return; 
            if (paramByte != 33) {
              switch (paramByte) {
                default:
                  return;
                case 47:
                  this.u = q();
                  K();
                case 46:
                  K();
                case 45:
                  if (i == 1 && !this.t.i())
                    this.t.k(); 
                case 44:
                  break;
              } 
              this.u = Collections.emptyList();
              int j = this.w;
              if (j == 1 || j == 3)
                K(); 
            } 
            this.t.f();
          case 39:
            L(1);
            M(4);
            return;
          case 38:
            L(1);
            M(3);
            return;
          case 37:
            break;
        } 
        L(1);
        M(2);
        return;
      } 
      L(3);
      return;
    } 
    L(2);
  }
  
  private void x(byte paramByte1, byte paramByte2) {
    int j;
    int k = g[paramByte1 & 0x7];
    boolean bool = false;
    if ((paramByte2 & 0x20) != 0) {
      m = 1;
    } else {
      m = 0;
    } 
    int i = k;
    if (m)
      i = k + 1; 
    if (i != a.b(this.t)) {
      if (this.w != 1 && !this.t.i()) {
        a a2 = new a(this.w, this.x);
        this.t = a2;
        this.s.add(a2);
      } 
      a.c(this.t, i);
    } 
    if ((paramByte2 & 0x10) == 16) {
      i = 1;
    } else {
      i = 0;
    } 
    if ((paramByte2 & 0x1) == 1)
      bool = true; 
    int m = paramByte2 >> 1 & 0x7;
    a a1 = this.t;
    if (i != 0) {
      paramByte2 = 8;
    } else {
      j = m;
    } 
    a1.p(j, bool);
    if (i != 0)
      a.d(this.t, h[m]); 
  }
  
  private static boolean y(byte paramByte) {
    boolean bool;
    if ((paramByte & 0xE0) == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private static boolean z(byte paramByte1, byte paramByte2) {
    boolean bool;
    if ((paramByte1 & 0xF6) == 18 && (paramByte2 & 0xE0) == 32) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void a() {}
  
  protected e f() {
    List<b> list = this.u;
    this.v = list;
    return new f(list);
  }
  
  public void flush() {
    super.flush();
    this.u = null;
    this.v = null;
    L(0);
    M(4);
    K();
    this.y = false;
    this.z = false;
    this.A = (byte)0;
    this.B = (byte)0;
    this.C = 0;
    this.D = true;
  }
  
  protected void g(h paramh) {
    // Byte code:
    //   0: aload_0
    //   1: getfield o : Lcom/google/android/exoplayer2/util/v;
    //   4: aload_1
    //   5: getfield c : Ljava/nio/ByteBuffer;
    //   8: invokevirtual array : ()[B
    //   11: aload_1
    //   12: getfield c : Ljava/nio/ByteBuffer;
    //   15: invokevirtual limit : ()I
    //   18: invokevirtual K : ([BI)V
    //   21: iconst_0
    //   22: istore_2
    //   23: aload_0
    //   24: getfield o : Lcom/google/android/exoplayer2/util/v;
    //   27: invokevirtual a : ()I
    //   30: istore_3
    //   31: aload_0
    //   32: getfield p : I
    //   35: istore #4
    //   37: iload_3
    //   38: iload #4
    //   40: if_icmplt -> 434
    //   43: iload #4
    //   45: iconst_2
    //   46: if_icmpne -> 55
    //   49: bipush #-4
    //   51: istore_3
    //   52: goto -> 64
    //   55: aload_0
    //   56: getfield o : Lcom/google/android/exoplayer2/util/v;
    //   59: invokevirtual z : ()I
    //   62: i2b
    //   63: istore_3
    //   64: aload_0
    //   65: getfield o : Lcom/google/android/exoplayer2/util/v;
    //   68: invokevirtual z : ()I
    //   71: istore #5
    //   73: aload_0
    //   74: getfield o : Lcom/google/android/exoplayer2/util/v;
    //   77: invokevirtual z : ()I
    //   80: istore #4
    //   82: iload_3
    //   83: iconst_2
    //   84: iand
    //   85: ifeq -> 91
    //   88: goto -> 23
    //   91: iload_3
    //   92: iconst_1
    //   93: iand
    //   94: aload_0
    //   95: getfield q : I
    //   98: if_icmpeq -> 104
    //   101: goto -> 23
    //   104: iload #5
    //   106: bipush #127
    //   108: iand
    //   109: i2b
    //   110: istore #6
    //   112: iload #4
    //   114: bipush #127
    //   116: iand
    //   117: i2b
    //   118: istore #7
    //   120: iload #6
    //   122: ifne -> 133
    //   125: iload #7
    //   127: ifne -> 133
    //   130: goto -> 23
    //   133: aload_0
    //   134: getfield y : Z
    //   137: istore #8
    //   139: iload_3
    //   140: iconst_4
    //   141: iand
    //   142: iconst_4
    //   143: if_icmpne -> 170
    //   146: getstatic com/google/android/exoplayer2/text/l/a.n : [Z
    //   149: astore_1
    //   150: aload_1
    //   151: iload #5
    //   153: baload
    //   154: ifeq -> 170
    //   157: aload_1
    //   158: iload #4
    //   160: baload
    //   161: ifeq -> 170
    //   164: iconst_1
    //   165: istore #9
    //   167: goto -> 173
    //   170: iconst_0
    //   171: istore #9
    //   173: aload_0
    //   174: iload #9
    //   176: putfield y : Z
    //   179: aload_0
    //   180: iload #9
    //   182: iload #6
    //   184: iload #7
    //   186: invokespecial E : (ZBB)Z
    //   189: ifeq -> 195
    //   192: goto -> 23
    //   195: aload_0
    //   196: getfield y : Z
    //   199: ifne -> 216
    //   202: iload #8
    //   204: ifeq -> 23
    //   207: aload_0
    //   208: invokespecial K : ()V
    //   211: iconst_1
    //   212: istore_2
    //   213: goto -> 23
    //   216: aload_0
    //   217: iload #6
    //   219: iload #7
    //   221: invokespecial J : (BB)V
    //   224: aload_0
    //   225: getfield D : Z
    //   228: ifne -> 234
    //   231: goto -> 23
    //   234: aload_0
    //   235: iload #6
    //   237: invokespecial N : (B)Z
    //   240: ifne -> 246
    //   243: goto -> 23
    //   246: iload #6
    //   248: invokestatic y : (B)Z
    //   251: ifeq -> 398
    //   254: iload #6
    //   256: iload #7
    //   258: invokestatic G : (BB)Z
    //   261: ifeq -> 279
    //   264: aload_0
    //   265: getfield t : Lcom/google/android/exoplayer2/text/l/a$a;
    //   268: iload #7
    //   270: invokestatic u : (B)C
    //   273: invokevirtual e : (C)V
    //   276: goto -> 211
    //   279: iload #6
    //   281: iload #7
    //   283: invokestatic z : (BB)Z
    //   286: ifeq -> 313
    //   289: aload_0
    //   290: getfield t : Lcom/google/android/exoplayer2/text/l/a$a;
    //   293: invokevirtual f : ()V
    //   296: aload_0
    //   297: getfield t : Lcom/google/android/exoplayer2/text/l/a$a;
    //   300: iload #6
    //   302: iload #7
    //   304: invokestatic t : (BB)C
    //   307: invokevirtual e : (C)V
    //   310: goto -> 211
    //   313: iload #6
    //   315: iload #7
    //   317: invokestatic A : (BB)Z
    //   320: ifeq -> 332
    //   323: aload_0
    //   324: iload #7
    //   326: invokespecial v : (B)V
    //   329: goto -> 211
    //   332: iload #6
    //   334: iload #7
    //   336: invokestatic C : (BB)Z
    //   339: ifeq -> 353
    //   342: aload_0
    //   343: iload #6
    //   345: iload #7
    //   347: invokespecial x : (BB)V
    //   350: goto -> 211
    //   353: iload #6
    //   355: iload #7
    //   357: invokestatic H : (BB)Z
    //   360: ifeq -> 379
    //   363: aload_0
    //   364: getfield t : Lcom/google/android/exoplayer2/text/l/a$a;
    //   367: iload #7
    //   369: bipush #32
    //   371: isub
    //   372: invokestatic a : (Lcom/google/android/exoplayer2/text/l/a$a;I)I
    //   375: pop
    //   376: goto -> 211
    //   379: iload #6
    //   381: iload #7
    //   383: invokestatic B : (BB)Z
    //   386: ifeq -> 211
    //   389: aload_0
    //   390: iload #7
    //   392: invokespecial w : (B)V
    //   395: goto -> 211
    //   398: aload_0
    //   399: getfield t : Lcom/google/android/exoplayer2/text/l/a$a;
    //   402: iload #6
    //   404: invokestatic o : (B)C
    //   407: invokevirtual e : (C)V
    //   410: iload #7
    //   412: sipush #224
    //   415: iand
    //   416: ifeq -> 211
    //   419: aload_0
    //   420: getfield t : Lcom/google/android/exoplayer2/text/l/a$a;
    //   423: iload #7
    //   425: invokestatic o : (B)C
    //   428: invokevirtual e : (C)V
    //   431: goto -> 211
    //   434: iload_2
    //   435: ifeq -> 461
    //   438: aload_0
    //   439: getfield w : I
    //   442: istore_2
    //   443: iload_2
    //   444: iconst_1
    //   445: if_icmpeq -> 453
    //   448: iload_2
    //   449: iconst_3
    //   450: if_icmpne -> 461
    //   453: aload_0
    //   454: aload_0
    //   455: invokespecial q : ()Ljava/util/List;
    //   458: putfield u : Ljava/util/List;
    //   461: return
  }
  
  protected boolean j() {
    boolean bool;
    if (this.u != this.v) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private static class a {
    private final List<a> a = new ArrayList<a>();
    
    private final List<SpannableString> b = new ArrayList<SpannableString>();
    
    private final StringBuilder c = new StringBuilder();
    
    private int d;
    
    private int e;
    
    private int f;
    
    private int g;
    
    private int h;
    
    public a(int param1Int1, int param1Int2) {
      j(param1Int1);
      m(param1Int2);
    }
    
    private SpannableString h() {
      SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.c);
      int i = spannableStringBuilder.length();
      int j = 0;
      int k = -1;
      int m = -1;
      int n = 0;
      int i1 = -1;
      int i2 = -1;
      int i3 = 0;
      while (j < this.a.size()) {
        int i8;
        int i9;
        a a1 = this.a.get(j);
        boolean bool = a1.b;
        int i4 = a1.a;
        int i5 = i2;
        int i6 = i3;
        if (i4 != 8) {
          if (i4 == 7) {
            i5 = 1;
          } else {
            i5 = 0;
          } 
          if (i4 != 7)
            i2 = a.n()[i4]; 
          i6 = i5;
          i5 = i2;
        } 
        i4 = a1.c;
        int i7 = j + 1;
        if (i7 < this.a.size()) {
          i2 = ((a)this.a.get(i7)).c;
        } else {
          i2 = i;
        } 
        if (i4 == i2) {
          j = i7;
          i2 = i5;
          i3 = i6;
          continue;
        } 
        if (k != -1 && !bool) {
          q(spannableStringBuilder, k, i4);
          i8 = -1;
        } else {
          i8 = k;
          if (k == -1) {
            i8 = k;
            if (bool)
              i8 = i4; 
          } 
        } 
        if (m != -1 && i6 == 0) {
          o(spannableStringBuilder, m, i4);
          i9 = -1;
        } else {
          i9 = m;
          if (m == -1) {
            i9 = m;
            if (i6 != 0)
              i9 = i4; 
          } 
        } 
        j = i7;
        k = i8;
        m = i9;
        i2 = i5;
        i3 = i6;
        if (i5 != i1) {
          n(spannableStringBuilder, n, i4, i1);
          i1 = i5;
          j = i7;
          k = i8;
          m = i9;
          n = i4;
          i2 = i5;
          i3 = i6;
        } 
      } 
      if (k != -1 && k != i)
        q(spannableStringBuilder, k, i); 
      if (m != -1 && m != i)
        o(spannableStringBuilder, m, i); 
      if (n != i)
        n(spannableStringBuilder, n, i, i1); 
      return new SpannableString((CharSequence)spannableStringBuilder);
    }
    
    private static void n(SpannableStringBuilder param1SpannableStringBuilder, int param1Int1, int param1Int2, int param1Int3) {
      if (param1Int3 == -1)
        return; 
      param1SpannableStringBuilder.setSpan(new ForegroundColorSpan(param1Int3), param1Int1, param1Int2, 33);
    }
    
    private static void o(SpannableStringBuilder param1SpannableStringBuilder, int param1Int1, int param1Int2) {
      param1SpannableStringBuilder.setSpan(new StyleSpan(2), param1Int1, param1Int2, 33);
    }
    
    private static void q(SpannableStringBuilder param1SpannableStringBuilder, int param1Int1, int param1Int2) {
      param1SpannableStringBuilder.setSpan(new UnderlineSpan(), param1Int1, param1Int2, 33);
    }
    
    public void e(char param1Char) {
      this.c.append(param1Char);
    }
    
    public void f() {
      int i = this.c.length();
      if (i > 0) {
        this.c.delete(i - 1, i);
        int j = this.a.size() - 1;
        while (j >= 0) {
          a a1 = this.a.get(j);
          int k = a1.c;
          if (k == i) {
            a1.c = k - 1;
            j--;
          } 
        } 
      } 
    }
    
    public b g(int param1Int) {
      float f;
      SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
      int i;
      for (i = 0; i < this.b.size(); i++) {
        spannableStringBuilder.append((CharSequence)this.b.get(i));
        spannableStringBuilder.append('\n');
      } 
      spannableStringBuilder.append((CharSequence)h());
      if (spannableStringBuilder.length() == 0)
        return null; 
      i = this.e + this.f;
      int j = 32 - i - spannableStringBuilder.length();
      int k = i - j;
      if (param1Int == Integer.MIN_VALUE)
        if (this.g == 2 && (Math.abs(k) < 3 || j < 0)) {
          param1Int = 1;
        } else if (this.g == 2 && k > 0) {
          param1Int = 2;
        } else {
          param1Int = 0;
        }  
      if (param1Int != 1) {
        if (param1Int == 2)
          i = 32 - j; 
        f = i / 32.0F * 0.8F + 0.1F;
      } else {
        f = 0.5F;
      } 
      if (this.g != 1) {
        j = this.d;
        if (j > 7) {
          j = this.d - 15 - 2;
          i = 2;
          return new b((CharSequence)spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, j, 1, i, f, param1Int, -3.4028235E38F);
        } 
        i = 0;
        return new b((CharSequence)spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, j, 1, i, f, param1Int, -3.4028235E38F);
      } 
      j = this.d - 15 - 2;
      i = 2;
      return new b((CharSequence)spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, j, 1, i, f, param1Int, -3.4028235E38F);
    }
    
    public boolean i() {
      boolean bool;
      if (this.a.isEmpty() && this.b.isEmpty() && this.c.length() == 0) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    public void j(int param1Int) {
      this.g = param1Int;
      this.a.clear();
      this.b.clear();
      this.c.setLength(0);
      this.d = 15;
      this.e = 0;
      this.f = 0;
    }
    
    public void k() {
      this.b.add(h());
      this.c.setLength(0);
      this.a.clear();
      int i = Math.min(this.h, this.d);
      while (this.b.size() >= i)
        this.b.remove(0); 
    }
    
    public void l(int param1Int) {
      this.g = param1Int;
    }
    
    public void m(int param1Int) {
      this.h = param1Int;
    }
    
    public void p(int param1Int, boolean param1Boolean) {
      this.a.add(new a(param1Int, param1Boolean, this.c.length()));
    }
    
    private static class a {
      public final int a;
      
      public final boolean b;
      
      public int c;
      
      public a(int param2Int1, boolean param2Boolean, int param2Int2) {
        this.a = param2Int1;
        this.b = param2Boolean;
        this.c = param2Int2;
      }
    }
  }
  
  private static class a {
    public final int a;
    
    public final boolean b;
    
    public int c;
    
    public a(int param1Int1, boolean param1Boolean, int param1Int2) {
      this.a = param1Int1;
      this.b = param1Boolean;
      this.c = param1Int2;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/text/l/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */