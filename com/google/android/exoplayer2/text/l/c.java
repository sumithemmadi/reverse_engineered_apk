package com.google.android.exoplayer2.text.l;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.google.android.exoplayer2.b1.e;
import com.google.android.exoplayer2.text.e;
import com.google.android.exoplayer2.text.h;
import com.google.android.exoplayer2.text.i;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.o;
import com.google.android.exoplayer2.util.u;
import com.google.android.exoplayer2.util.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class c extends e {
  private final v g = new v();
  
  private final u h = new u();
  
  private final int i;
  
  private final a[] j;
  
  private a k;
  
  private List<com.google.android.exoplayer2.text.b> l;
  
  private List<com.google.android.exoplayer2.text.b> m;
  
  private b n;
  
  private int o;
  
  public c(int paramInt, List<byte[]> paramList) {
    int i = paramInt;
    if (paramInt == -1)
      i = 1; 
    this.i = i;
    this.j = new a[8];
    for (paramInt = 0; paramInt < 8; paramInt++)
      this.j[paramInt] = new a(); 
    this.k = this.j[0];
    D();
  }
  
  private void A() {
    this.h.q(4);
    int i = this.h.h(4);
    this.h.q(2);
    int j = this.h.h(6);
    this.k.o(i, j);
  }
  
  private void B() {
    int i = this.h.h(2);
    int j = a.h(this.h.h(2), this.h.h(2), this.h.h(2), i);
    int k = this.h.h(2);
    int m = a.g(this.h.h(2), this.h.h(2), this.h.h(2));
    i = k;
    if (this.h.g())
      i = k | 0x4; 
    boolean bool = this.h.g();
    int n = this.h.h(2);
    k = this.h.h(2);
    int i1 = this.h.h(2);
    this.h.q(8);
    this.k.q(j, m, bool, i, n, k, i1);
  }
  
  private void C() {
    StringBuilder stringBuilder;
    b b1 = this.n;
    int i = b1.d;
    if (i != b1.b * 2 - 1) {
      stringBuilder = new StringBuilder();
      stringBuilder.append("DtvCcPacket ended prematurely; size is ");
      stringBuilder.append(this.n.b * 2 - 1);
      stringBuilder.append(", but current index is ");
      stringBuilder.append(this.n.d);
      stringBuilder.append(" (sequence number ");
      stringBuilder.append(this.n.a);
      stringBuilder.append("); ignoring packet");
      o.f("Cea708Decoder", stringBuilder.toString());
      return;
    } 
    this.h.n(((b)stringBuilder).c, i);
    int j = this.h.h(3);
    int k = this.h.h(5);
    i = j;
    if (j == 7) {
      this.h.q(2);
      j = this.h.h(6);
      i = j;
      if (j < 7) {
        stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid extended service number: ");
        stringBuilder.append(j);
        o.f("Cea708Decoder", stringBuilder.toString());
        i = j;
      } 
    } 
    if (k == 0) {
      if (i != 0) {
        stringBuilder = new StringBuilder();
        stringBuilder.append("serviceNumber is non-zero (");
        stringBuilder.append(i);
        stringBuilder.append(") when blockSize is 0");
        o.f("Cea708Decoder", stringBuilder.toString());
      } 
      return;
    } 
    if (i != this.i)
      return; 
    for (i = 0; this.h.b() > 0; i = 1) {
      j = this.h.h(8);
      if (j != 16) {
        if (j <= 31) {
          p(j);
          continue;
        } 
        if (j <= 127) {
          u(j);
        } else if (j <= 159) {
          q(j);
        } else if (j <= 255) {
          v(j);
        } else {
          stringBuilder = new StringBuilder();
          stringBuilder.append("Invalid base command: ");
          stringBuilder.append(j);
          o.f("Cea708Decoder", stringBuilder.toString());
          continue;
        } 
      } else {
        j = this.h.h(8);
        if (j <= 31) {
          r(j);
          continue;
        } 
        if (j <= 127) {
          w(j);
        } else {
          if (j <= 159) {
            s(j);
            continue;
          } 
          if (j <= 255) {
            x(j);
          } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid extended command: ");
            stringBuilder.append(j);
            o.f("Cea708Decoder", stringBuilder.toString());
            continue;
          } 
        } 
      } 
    } 
    if (i != 0)
      this.l = o(); 
  }
  
  private void D() {
    for (byte b1 = 0; b1 < 8; b1++)
      this.j[b1].l(); 
  }
  
  private void n() {
    if (this.n == null)
      return; 
    C();
    this.n = null;
  }
  
  private List<com.google.android.exoplayer2.text.b> o() {
    ArrayList<b> arrayList = new ArrayList();
    for (byte b1 = 0; b1 < 8; b1++) {
      if (!this.j[b1].j() && this.j[b1].k())
        arrayList.add(this.j[b1].c()); 
    } 
    Collections.sort(arrayList);
    return Collections.unmodifiableList((List)arrayList);
  }
  
  private void p(int paramInt) {
    if (paramInt != 0)
      if (paramInt != 3) {
        if (paramInt != 8) {
          StringBuilder stringBuilder;
          switch (paramInt) {
            default:
              if (paramInt >= 17 && paramInt <= 23) {
                StringBuilder stringBuilder1 = new StringBuilder();
                stringBuilder1.append("Currently unsupported COMMAND_EXT1 Command: ");
                stringBuilder1.append(paramInt);
                o.f("Cea708Decoder", stringBuilder1.toString());
                this.h.q(8);
                break;
              } 
              if (paramInt >= 24 && paramInt <= 31) {
                StringBuilder stringBuilder1 = new StringBuilder();
                stringBuilder1.append("Currently unsupported COMMAND_P16 Command: ");
                stringBuilder1.append(paramInt);
                o.f("Cea708Decoder", stringBuilder1.toString());
                this.h.q(16);
                break;
              } 
              stringBuilder = new StringBuilder();
              stringBuilder.append("Invalid C0 command: ");
              stringBuilder.append(paramInt);
              o.f("Cea708Decoder", stringBuilder.toString());
              break;
            case 13:
              this.k.a('\n');
              break;
            case 12:
              D();
              break;
            case 14:
              break;
          } 
        } else {
          this.k.b();
        } 
      } else {
        this.l = o();
      }  
  }
  
  private void q(int paramInt) {
    StringBuilder stringBuilder;
    byte b1 = 1;
    byte b2 = 1;
    byte b3 = 1;
    switch (paramInt) {
      default:
        stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid C1 command: ");
        stringBuilder.append(paramInt);
        o.f("Cea708Decoder", stringBuilder.toString());
        break;
      case 152:
      case 153:
      case 154:
      case 155:
      case 156:
      case 157:
      case 158:
      case 159:
        paramInt -= 152;
        t(paramInt);
        if (this.o != paramInt) {
          this.o = paramInt;
          this.k = this.j[paramInt];
        } 
        break;
      case 151:
        if (!this.k.i()) {
          this.h.q(32);
          break;
        } 
        B();
        break;
      case 146:
        if (!this.k.i()) {
          this.h.q(16);
          break;
        } 
        A();
        break;
      case 145:
        if (!this.k.i()) {
          this.h.q(24);
          break;
        } 
        z();
        break;
      case 144:
        if (!this.k.i()) {
          this.h.q(16);
          break;
        } 
        y();
        break;
      case 143:
        D();
        break;
      case 141:
        this.h.q(8);
        break;
      case 140:
        while (b3 <= 8) {
          if (this.h.g())
            this.j[8 - b3].l(); 
          b3++;
        } 
        break;
      case 139:
        for (paramInt = 1; paramInt <= 8; paramInt++) {
          if (this.h.g()) {
            a a1 = this.j[8 - paramInt];
            a1.p(a1.k() ^ true);
          } 
        } 
        break;
      case 138:
        while (b1 <= 8) {
          if (this.h.g())
            this.j[8 - b1].p(false); 
          b1++;
        } 
        break;
      case 137:
        for (paramInt = 1; paramInt <= 8; paramInt++) {
          if (this.h.g())
            this.j[8 - paramInt].p(true); 
        } 
        break;
      case 136:
        while (b2 <= 8) {
          if (this.h.g())
            this.j[8 - b2].e(); 
          b2++;
        } 
        break;
      case 128:
      case 129:
      case 130:
      case 131:
      case 132:
      case 133:
      case 134:
      case 135:
        paramInt -= 128;
        if (this.o != paramInt) {
          this.o = paramInt;
          this.k = this.j[paramInt];
        } 
        break;
      case 142:
        break;
    } 
  }
  
  private void r(int paramInt) {
    if (paramInt > 7)
      if (paramInt <= 15) {
        this.h.q(8);
      } else if (paramInt <= 23) {
        this.h.q(16);
      } else if (paramInt <= 31) {
        this.h.q(24);
      }  
  }
  
  private void s(int paramInt) {
    if (paramInt <= 135) {
      this.h.q(32);
    } else if (paramInt <= 143) {
      this.h.q(40);
    } else if (paramInt <= 159) {
      this.h.q(2);
      paramInt = this.h.h(6);
      this.h.q(paramInt * 8);
    } 
  }
  
  private void t(int paramInt) {
    a a1 = this.j[paramInt];
    this.h.q(2);
    boolean bool1 = this.h.g();
    boolean bool2 = this.h.g();
    boolean bool3 = this.h.g();
    int i = this.h.h(3);
    boolean bool4 = this.h.g();
    paramInt = this.h.h(7);
    int j = this.h.h(8);
    int k = this.h.h(4);
    int m = this.h.h(4);
    this.h.q(2);
    int n = this.h.h(6);
    this.h.q(2);
    a1.f(bool1, bool2, bool3, i, bool4, paramInt, j, m, n, k, this.h.h(3), this.h.h(3));
  }
  
  private void u(int paramInt) {
    if (paramInt == 127) {
      this.k.a('♫');
    } else {
      this.k.a((char)(paramInt & 0xFF));
    } 
  }
  
  private void v(int paramInt) {
    this.k.a((char)(paramInt & 0xFF));
  }
  
  private void w(int paramInt) {
    if (paramInt != 32) {
      if (paramInt != 33) {
        if (paramInt != 37) {
          if (paramInt != 42) {
            if (paramInt != 44) {
              if (paramInt != 63) {
                if (paramInt != 57) {
                  if (paramInt != 58) {
                    if (paramInt != 60) {
                      if (paramInt != 61) {
                        StringBuilder stringBuilder;
                        switch (paramInt) {
                          default:
                            switch (paramInt) {
                              default:
                                stringBuilder = new StringBuilder();
                                stringBuilder.append("Invalid G2 character: ");
                                stringBuilder.append(paramInt);
                                o.f("Cea708Decoder", stringBuilder.toString());
                                return;
                              case 127:
                                this.k.a('┌');
                                return;
                              case 126:
                                this.k.a('┘');
                                return;
                              case 125:
                                this.k.a('─');
                                return;
                              case 124:
                                this.k.a('└');
                                return;
                              case 123:
                                this.k.a('┐');
                                return;
                              case 122:
                                this.k.a('│');
                                return;
                              case 121:
                                this.k.a('⅞');
                                return;
                              case 120:
                                this.k.a('⅝');
                                return;
                              case 119:
                                this.k.a('⅜');
                                return;
                              case 118:
                                break;
                            } 
                            this.k.a('⅛');
                            return;
                          case 53:
                            this.k.a('•');
                            return;
                          case 52:
                            this.k.a('”');
                            return;
                          case 51:
                            this.k.a('“');
                            return;
                          case 50:
                            this.k.a('’');
                            return;
                          case 49:
                            this.k.a('‘');
                            return;
                          case 48:
                            break;
                        } 
                        this.k.a('█');
                      } else {
                        this.k.a('℠');
                      } 
                    } else {
                      this.k.a('œ');
                    } 
                  } else {
                    this.k.a('š');
                  } 
                } else {
                  this.k.a('™');
                } 
              } else {
                this.k.a('Ÿ');
              } 
            } else {
              this.k.a('Œ');
            } 
          } else {
            this.k.a('Š');
          } 
        } else {
          this.k.a('…');
        } 
      } else {
        this.k.a(' ');
      } 
    } else {
      this.k.a(' ');
    } 
  }
  
  private void x(int paramInt) {
    if (paramInt == 160) {
      this.k.a('㏄');
    } else {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Invalid G3 character: ");
      stringBuilder.append(paramInt);
      o.f("Cea708Decoder", stringBuilder.toString());
      this.k.a('_');
    } 
  }
  
  private void y() {
    int i = this.h.h(4);
    int j = this.h.h(2);
    int k = this.h.h(2);
    boolean bool1 = this.h.g();
    boolean bool2 = this.h.g();
    int m = this.h.h(3);
    int n = this.h.h(3);
    this.k.m(i, j, k, bool1, bool2, m, n);
  }
  
  private void z() {
    int i = this.h.h(2);
    i = a.h(this.h.h(2), this.h.h(2), this.h.h(2), i);
    int j = this.h.h(2);
    int k = a.h(this.h.h(2), this.h.h(2), this.h.h(2), j);
    this.h.q(2);
    j = a.g(this.h.h(2), this.h.h(2), this.h.h(2));
    this.k.n(i, k, j);
  }
  
  protected e f() {
    List<com.google.android.exoplayer2.text.b> list = this.l;
    this.m = list;
    return new f(list);
  }
  
  public void flush() {
    super.flush();
    this.l = null;
    this.m = null;
    this.o = 0;
    this.k = this.j[0];
    D();
    this.n = null;
  }
  
  protected void g(h paramh) {
    byte[] arrayOfByte = ((e)paramh).c.array();
    this.g.K(arrayOfByte, ((e)paramh).c.limit());
    while (this.g.a() >= 3) {
      int i = this.g.z() & 0x7;
      int j = i & 0x3;
      boolean bool = false;
      if ((i & 0x4) == 4) {
        i = 1;
      } else {
        i = 0;
      } 
      byte b2 = (byte)this.g.z();
      byte b3 = (byte)this.g.z();
      if ((j != 2 && j != 3) || i == 0)
        continue; 
      if (j == 3) {
        n();
        j = b2 & 0x3F;
        i = j;
        if (j == 0)
          i = 64; 
        b b4 = new b((b2 & 0xC0) >> 6, i);
        this.n = b4;
        byte[] arrayOfByte1 = b4.c;
        i = b4.d;
        b4.d = i + 1;
        arrayOfByte1[i] = (byte)b3;
      } else {
        if (j == 2)
          bool = true; 
        e.a(bool);
        b b4 = this.n;
        if (b4 == null) {
          o.c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
          continue;
        } 
        byte[] arrayOfByte1 = b4.c;
        j = b4.d;
        i = j + 1;
        b4.d = i;
        arrayOfByte1[j] = (byte)b2;
        b4.d = i + 1;
        arrayOfByte1[i] = (byte)b3;
      } 
      b b1 = this.n;
      if (b1.d == b1.b * 2 - 1)
        n(); 
    } 
  }
  
  protected boolean j() {
    boolean bool;
    if (this.l != this.m) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private static final class a {
    public static final int a = h(2, 2, 2, 0);
    
    public static final int b;
    
    public static final int c;
    
    private static final int[] d = new int[] { 0, 0, 0, 0, 0, 2, 0 };
    
    private static final int[] e = new int[] { 0, 0, 0, 0, 0, 0, 2 };
    
    private static final int[] f = new int[] { 3, 3, 3, 3, 3, 3, 1 };
    
    private static final boolean[] g = new boolean[] { false, false, false, true, true, true, false };
    
    private static final int[] h;
    
    private static final int[] i = new int[] { 0, 1, 2, 3, 4, 3, 4 };
    
    private static final int[] j = new int[] { 0, 0, 0, 0, 0, 3, 3 };
    
    private static final int[] k;
    
    private int A;
    
    private int B;
    
    private int C;
    
    private int D;
    
    private int E;
    
    private int F;
    
    private int G;
    
    private final List<SpannableString> l = new ArrayList<SpannableString>();
    
    private final SpannableStringBuilder m = new SpannableStringBuilder();
    
    private boolean n;
    
    private boolean o;
    
    private int p;
    
    private boolean q;
    
    private int r;
    
    private int s;
    
    private int t;
    
    private int u;
    
    private boolean v;
    
    private int w;
    
    private int x;
    
    private int y;
    
    private int z;
    
    static {
      k = new int[] { i, i, i, i, i, j, j };
    }
    
    public a() {
      l();
    }
    
    public static int g(int param1Int1, int param1Int2, int param1Int3) {
      return h(param1Int1, param1Int2, param1Int3, 0);
    }
    
    public static int h(int param1Int1, int param1Int2, int param1Int3, int param1Int4) {
      // Byte code:
      //   0: iconst_0
      //   1: istore #4
      //   3: iload_0
      //   4: iconst_0
      //   5: iconst_4
      //   6: invokestatic c : (III)I
      //   9: pop
      //   10: iload_1
      //   11: iconst_0
      //   12: iconst_4
      //   13: invokestatic c : (III)I
      //   16: pop
      //   17: iload_2
      //   18: iconst_0
      //   19: iconst_4
      //   20: invokestatic c : (III)I
      //   23: pop
      //   24: iload_3
      //   25: iconst_0
      //   26: iconst_4
      //   27: invokestatic c : (III)I
      //   30: pop
      //   31: iload_3
      //   32: ifeq -> 64
      //   35: iload_3
      //   36: iconst_1
      //   37: if_icmpeq -> 64
      //   40: iload_3
      //   41: iconst_2
      //   42: if_icmpeq -> 58
      //   45: iload_3
      //   46: iconst_3
      //   47: if_icmpeq -> 53
      //   50: goto -> 64
      //   53: iconst_0
      //   54: istore_3
      //   55: goto -> 68
      //   58: bipush #127
      //   60: istore_3
      //   61: goto -> 68
      //   64: sipush #255
      //   67: istore_3
      //   68: iload_0
      //   69: iconst_1
      //   70: if_icmple -> 80
      //   73: sipush #255
      //   76: istore_0
      //   77: goto -> 82
      //   80: iconst_0
      //   81: istore_0
      //   82: iload_1
      //   83: iconst_1
      //   84: if_icmple -> 94
      //   87: sipush #255
      //   90: istore_1
      //   91: goto -> 96
      //   94: iconst_0
      //   95: istore_1
      //   96: iload_2
      //   97: iconst_1
      //   98: if_icmple -> 106
      //   101: sipush #255
      //   104: istore #4
      //   106: iload_3
      //   107: iload_0
      //   108: iload_1
      //   109: iload #4
      //   111: invokestatic argb : (IIII)I
      //   114: ireturn
    }
    
    public void a(char param1Char) {
      if (param1Char == '\n') {
        this.l.add(d());
        this.m.clear();
        if (this.A != -1)
          this.A = 0; 
        if (this.B != -1)
          this.B = 0; 
        if (this.C != -1)
          this.C = 0; 
        if (this.E != -1)
          this.E = 0; 
        while ((this.v && this.l.size() >= this.u) || this.l.size() >= 15)
          this.l.remove(0); 
      } else {
        this.m.append(param1Char);
      } 
    }
    
    public void b() {
      int i = this.m.length();
      if (i > 0)
        this.m.delete(i - 1, i); 
    }
    
    public b c() {
      // Byte code:
      //   0: aload_0
      //   1: invokevirtual j : ()Z
      //   4: ifeq -> 9
      //   7: aconst_null
      //   8: areturn
      //   9: new android/text/SpannableStringBuilder
      //   12: dup
      //   13: invokespecial <init> : ()V
      //   16: astore_1
      //   17: iconst_0
      //   18: istore_2
      //   19: iconst_0
      //   20: istore_3
      //   21: iload_3
      //   22: aload_0
      //   23: getfield l : Ljava/util/List;
      //   26: invokeinterface size : ()I
      //   31: if_icmpge -> 65
      //   34: aload_1
      //   35: aload_0
      //   36: getfield l : Ljava/util/List;
      //   39: iload_3
      //   40: invokeinterface get : (I)Ljava/lang/Object;
      //   45: checkcast java/lang/CharSequence
      //   48: invokevirtual append : (Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;
      //   51: pop
      //   52: aload_1
      //   53: bipush #10
      //   55: invokevirtual append : (C)Landroid/text/SpannableStringBuilder;
      //   58: pop
      //   59: iinc #3, 1
      //   62: goto -> 21
      //   65: aload_1
      //   66: aload_0
      //   67: invokevirtual d : ()Landroid/text/SpannableString;
      //   70: invokevirtual append : (Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;
      //   73: pop
      //   74: aload_0
      //   75: getfield w : I
      //   78: istore_3
      //   79: iload_3
      //   80: ifeq -> 157
      //   83: iload_3
      //   84: iconst_1
      //   85: if_icmpeq -> 149
      //   88: iload_3
      //   89: iconst_2
      //   90: if_icmpeq -> 141
      //   93: iload_3
      //   94: iconst_3
      //   95: if_icmpne -> 101
      //   98: goto -> 157
      //   101: new java/lang/StringBuilder
      //   104: dup
      //   105: invokespecial <init> : ()V
      //   108: astore #4
      //   110: aload #4
      //   112: ldc 'Unexpected justification value: '
      //   114: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   117: pop
      //   118: aload #4
      //   120: aload_0
      //   121: getfield w : I
      //   124: invokevirtual append : (I)Ljava/lang/StringBuilder;
      //   127: pop
      //   128: new java/lang/IllegalArgumentException
      //   131: dup
      //   132: aload #4
      //   134: invokevirtual toString : ()Ljava/lang/String;
      //   137: invokespecial <init> : (Ljava/lang/String;)V
      //   140: athrow
      //   141: getstatic android/text/Layout$Alignment.ALIGN_CENTER : Landroid/text/Layout$Alignment;
      //   144: astore #4
      //   146: goto -> 162
      //   149: getstatic android/text/Layout$Alignment.ALIGN_OPPOSITE : Landroid/text/Layout$Alignment;
      //   152: astore #4
      //   154: goto -> 162
      //   157: getstatic android/text/Layout$Alignment.ALIGN_NORMAL : Landroid/text/Layout$Alignment;
      //   160: astore #4
      //   162: aload_0
      //   163: getfield q : Z
      //   166: ifeq -> 192
      //   169: aload_0
      //   170: getfield s : I
      //   173: i2f
      //   174: ldc 99.0
      //   176: fdiv
      //   177: fstore #5
      //   179: aload_0
      //   180: getfield r : I
      //   183: i2f
      //   184: ldc 99.0
      //   186: fdiv
      //   187: fstore #6
      //   189: goto -> 212
      //   192: aload_0
      //   193: getfield s : I
      //   196: i2f
      //   197: ldc 209.0
      //   199: fdiv
      //   200: fstore #5
      //   202: aload_0
      //   203: getfield r : I
      //   206: i2f
      //   207: ldc 74.0
      //   209: fdiv
      //   210: fstore #6
      //   212: aload_0
      //   213: getfield t : I
      //   216: istore #7
      //   218: iload #7
      //   220: iconst_3
      //   221: irem
      //   222: ifne -> 230
      //   225: iconst_0
      //   226: istore_3
      //   227: goto -> 245
      //   230: iload #7
      //   232: iconst_3
      //   233: irem
      //   234: iconst_1
      //   235: if_icmpne -> 243
      //   238: iconst_1
      //   239: istore_3
      //   240: goto -> 245
      //   243: iconst_2
      //   244: istore_3
      //   245: iload #7
      //   247: iconst_3
      //   248: idiv
      //   249: ifne -> 258
      //   252: iconst_0
      //   253: istore #7
      //   255: goto -> 275
      //   258: iload #7
      //   260: iconst_3
      //   261: idiv
      //   262: iconst_1
      //   263: if_icmpne -> 272
      //   266: iconst_1
      //   267: istore #7
      //   269: goto -> 275
      //   272: iconst_2
      //   273: istore #7
      //   275: aload_0
      //   276: getfield z : I
      //   279: getstatic com/google/android/exoplayer2/text/l/c$a.b : I
      //   282: if_icmpeq -> 287
      //   285: iconst_1
      //   286: istore_2
      //   287: new com/google/android/exoplayer2/text/l/b
      //   290: dup
      //   291: aload_1
      //   292: aload #4
      //   294: fload #6
      //   296: ldc 0.9
      //   298: fmul
      //   299: ldc 0.05
      //   301: fadd
      //   302: iconst_0
      //   303: iload_3
      //   304: fload #5
      //   306: ldc 0.9
      //   308: fmul
      //   309: ldc 0.05
      //   311: fadd
      //   312: iload #7
      //   314: ldc -3.4028235E38
      //   316: iload_2
      //   317: aload_0
      //   318: getfield z : I
      //   321: aload_0
      //   322: getfield p : I
      //   325: invokespecial <init> : (Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;FIIFIFZII)V
      //   328: areturn
    }
    
    public SpannableString d() {
      SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)this.m);
      int i = spannableStringBuilder.length();
      if (i > 0) {
        if (this.A != -1)
          spannableStringBuilder.setSpan(new StyleSpan(2), this.A, i, 33); 
        if (this.B != -1)
          spannableStringBuilder.setSpan(new UnderlineSpan(), this.B, i, 33); 
        if (this.C != -1)
          spannableStringBuilder.setSpan(new ForegroundColorSpan(this.D), this.C, i, 33); 
        if (this.E != -1)
          spannableStringBuilder.setSpan(new BackgroundColorSpan(this.F), this.E, i, 33); 
      } 
      return new SpannableString((CharSequence)spannableStringBuilder);
    }
    
    public void e() {
      this.l.clear();
      this.m.clear();
      this.A = -1;
      this.B = -1;
      this.C = -1;
      this.E = -1;
      this.G = 0;
    }
    
    public void f(boolean param1Boolean1, boolean param1Boolean2, boolean param1Boolean3, int param1Int1, boolean param1Boolean4, int param1Int2, int param1Int3, int param1Int4, int param1Int5, int param1Int6, int param1Int7, int param1Int8) {
      this.n = true;
      this.o = param1Boolean1;
      this.v = param1Boolean2;
      this.p = param1Int1;
      this.q = param1Boolean4;
      this.r = param1Int2;
      this.s = param1Int3;
      this.t = param1Int6;
      param1Int1 = this.u;
      param1Int2 = param1Int4 + 1;
      if (param1Int1 != param1Int2) {
        this.u = param1Int2;
        while ((param1Boolean2 && this.l.size() >= this.u) || this.l.size() >= 15)
          this.l.remove(0); 
      } 
      if (param1Int7 != 0 && this.x != param1Int7) {
        this.x = param1Int7;
        param1Int1 = param1Int7 - 1;
        q(h[param1Int1], c, g[param1Int1], 0, e[param1Int1], f[param1Int1], d[param1Int1]);
      } 
      if (param1Int8 != 0 && this.y != param1Int8) {
        this.y = param1Int8;
        param1Int1 = param1Int8 - 1;
        m(0, 1, 1, false, false, j[param1Int1], i[param1Int1]);
        n(a, k[param1Int1], b);
      } 
    }
    
    public boolean i() {
      return this.n;
    }
    
    public boolean j() {
      return (!i() || (this.l.isEmpty() && this.m.length() == 0));
    }
    
    public boolean k() {
      return this.o;
    }
    
    public void l() {
      e();
      this.n = false;
      this.o = false;
      this.p = 4;
      this.q = false;
      this.r = 0;
      this.s = 0;
      this.t = 0;
      this.u = 15;
      this.v = true;
      this.w = 0;
      this.x = 0;
      this.y = 0;
      int i = b;
      this.z = i;
      this.D = a;
      this.F = i;
    }
    
    public void m(int param1Int1, int param1Int2, int param1Int3, boolean param1Boolean1, boolean param1Boolean2, int param1Int4, int param1Int5) {
      if (this.A != -1) {
        if (!param1Boolean1) {
          this.m.setSpan(new StyleSpan(2), this.A, this.m.length(), 33);
          this.A = -1;
        } 
      } else if (param1Boolean1) {
        this.A = this.m.length();
      } 
      if (this.B != -1) {
        if (!param1Boolean2) {
          this.m.setSpan(new UnderlineSpan(), this.B, this.m.length(), 33);
          this.B = -1;
        } 
      } else if (param1Boolean2) {
        this.B = this.m.length();
      } 
    }
    
    public void n(int param1Int1, int param1Int2, int param1Int3) {
      if (this.C != -1 && this.D != param1Int1)
        this.m.setSpan(new ForegroundColorSpan(this.D), this.C, this.m.length(), 33); 
      if (param1Int1 != a) {
        this.C = this.m.length();
        this.D = param1Int1;
      } 
      if (this.E != -1 && this.F != param1Int2)
        this.m.setSpan(new BackgroundColorSpan(this.F), this.E, this.m.length(), 33); 
      if (param1Int2 != b) {
        this.E = this.m.length();
        this.F = param1Int2;
      } 
    }
    
    public void o(int param1Int1, int param1Int2) {
      if (this.G != param1Int1)
        a('\n'); 
      this.G = param1Int1;
    }
    
    public void p(boolean param1Boolean) {
      this.o = param1Boolean;
    }
    
    public void q(int param1Int1, int param1Int2, boolean param1Boolean, int param1Int3, int param1Int4, int param1Int5, int param1Int6) {
      this.z = param1Int1;
      this.w = param1Int6;
    }
    
    static {
      int i = h(0, 0, 0, 0);
      b = i;
      int j = h(0, 0, 0, 3);
      c = j;
    }
    
    static {
      h = new int[] { i, j, i, i, j, i, i };
    }
  }
  
  private static final class b {
    public final int a;
    
    public final int b;
    
    public final byte[] c;
    
    int d;
    
    public b(int param1Int1, int param1Int2) {
      this.a = param1Int1;
      this.b = param1Int2;
      this.c = new byte[param1Int2 * 2 - 1];
      this.d = 0;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/text/l/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */