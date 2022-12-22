package b.h.i;

import android.text.SpannableStringBuilder;
import java.util.Locale;

public final class a {
  static final d a;
  
  private static final String b = Character.toString('‎');
  
  private static final String c = Character.toString('‏');
  
  static final a d;
  
  static final a e;
  
  private final boolean f;
  
  private final int g;
  
  private final d h;
  
  static {
    d = new a(false, 2, d1);
    e = new a(true, 2, d1);
  }
  
  a(boolean paramBoolean, int paramInt, d paramd) {
    this.f = paramBoolean;
    this.g = paramInt;
    this.h = paramd;
  }
  
  private static int a(CharSequence paramCharSequence) {
    return (new b(paramCharSequence, false)).d();
  }
  
  private static int b(CharSequence paramCharSequence) {
    return (new b(paramCharSequence, false)).e();
  }
  
  public static a c() {
    return (new a()).a();
  }
  
  static boolean e(Locale paramLocale) {
    int i = f.b(paramLocale);
    boolean bool = true;
    if (i != 1)
      bool = false; 
    return bool;
  }
  
  private String f(CharSequence paramCharSequence, d paramd) {
    boolean bool = paramd.a(paramCharSequence, 0, paramCharSequence.length());
    return (!this.f && (bool || b(paramCharSequence) == 1)) ? b : ((this.f && (!bool || b(paramCharSequence) == -1)) ? c : "");
  }
  
  private String g(CharSequence paramCharSequence, d paramd) {
    boolean bool = paramd.a(paramCharSequence, 0, paramCharSequence.length());
    return (!this.f && (bool || a(paramCharSequence) == 1)) ? b : ((this.f && (!bool || a(paramCharSequence) == -1)) ? c : "");
  }
  
  public boolean d() {
    boolean bool;
    if ((this.g & 0x2) != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public CharSequence h(CharSequence paramCharSequence) {
    return i(paramCharSequence, this.h, true);
  }
  
  public CharSequence i(CharSequence paramCharSequence, d paramd, boolean paramBoolean) {
    if (paramCharSequence == null)
      return null; 
    boolean bool = paramd.a(paramCharSequence, 0, paramCharSequence.length());
    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
    if (d() && paramBoolean) {
      if (bool) {
        paramd = e.b;
      } else {
        paramd = e.a;
      } 
      spannableStringBuilder.append(g(paramCharSequence, paramd));
    } 
    if (bool != this.f) {
      char c;
      if (bool) {
        char c1 = '‫';
        c = c1;
      } else {
        char c1 = '‪';
        c = c1;
      } 
      spannableStringBuilder.append(c);
      spannableStringBuilder.append(paramCharSequence);
      spannableStringBuilder.append('‬');
    } else {
      spannableStringBuilder.append(paramCharSequence);
    } 
    if (paramBoolean) {
      if (bool) {
        paramd = e.b;
      } else {
        paramd = e.a;
      } 
      spannableStringBuilder.append(f(paramCharSequence, paramd));
    } 
    return (CharSequence)spannableStringBuilder;
  }
  
  public String j(String paramString) {
    return k(paramString, this.h, true);
  }
  
  public String k(String paramString, d paramd, boolean paramBoolean) {
    return (paramString == null) ? null : i(paramString, paramd, paramBoolean).toString();
  }
  
  static {
    d d1 = e.c;
    a = d1;
  }
  
  public static final class a {
    private boolean a;
    
    private int b;
    
    private d c;
    
    public a() {
      c(a.e(Locale.getDefault()));
    }
    
    private static a b(boolean param1Boolean) {
      a a1;
      if (param1Boolean) {
        a1 = a.e;
      } else {
        a1 = a.d;
      } 
      return a1;
    }
    
    private void c(boolean param1Boolean) {
      this.a = param1Boolean;
      this.c = a.a;
      this.b = 2;
    }
    
    public a a() {
      return (this.b == 2 && this.c == a.a) ? b(this.a) : new a(this.a, this.b, this.c);
    }
  }
  
  private static class b {
    private static final byte[] a = new byte[1792];
    
    private final CharSequence b;
    
    private final boolean c;
    
    private final int d;
    
    private int e;
    
    private char f;
    
    static {
      for (byte b1 = 0; b1 < '܀'; b1++)
        a[b1] = Character.getDirectionality(b1); 
    }
    
    b(CharSequence param1CharSequence, boolean param1Boolean) {
      this.b = param1CharSequence;
      this.c = param1Boolean;
      this.d = param1CharSequence.length();
    }
    
    private static byte c(char param1Char) {
      byte b1;
      if (param1Char < '܀') {
        byte b2 = a[param1Char];
        b1 = b2;
      } else {
        byte b2 = Character.getDirectionality(param1Char);
        b1 = b2;
      } 
      return b1;
    }
    
    private byte f() {
      int i = this.e;
      while (true) {
        int j = this.e;
        if (j > 0) {
          CharSequence charSequence = this.b;
          this.e = --j;
          j = charSequence.charAt(j);
          this.f = (char)j;
          if (j == 38)
            return 12; 
          if (j == 59)
            break; 
          continue;
        } 
        break;
      } 
      this.e = i;
      this.f = (char)';';
      return 13;
    }
    
    private byte g() {
      while (true) {
        int i = this.e;
        if (i < this.d) {
          CharSequence charSequence = this.b;
          this.e = i + 1;
          i = charSequence.charAt(i);
          this.f = (char)i;
          if (i != 59)
            continue; 
        } 
        break;
      } 
      return 12;
    }
    
    private byte h() {
      int i = this.e;
      label20: while (true) {
        int j = this.e;
        if (j > 0) {
          CharSequence charSequence = this.b;
          this.e = --j;
          j = charSequence.charAt(j);
          this.f = (char)j;
          if (j == 60)
            return 12; 
          if (j == 62)
            break; 
          if (j == 34 || j == 39)
            while (true) {
              int k = this.e;
              if (k > 0) {
                charSequence = this.b;
                this.e = --k;
                k = charSequence.charAt(k);
                this.f = (char)k;
                if (k != j)
                  continue; 
                continue label20;
              } 
              continue label20;
            }  
          continue;
        } 
        break;
      } 
      this.e = i;
      this.f = (char)'>';
      return 13;
    }
    
    private byte i() {
      int i = this.e;
      label18: while (true) {
        int j = this.e;
        if (j < this.d) {
          CharSequence charSequence = this.b;
          this.e = j + 1;
          j = charSequence.charAt(j);
          this.f = (char)j;
          if (j == 62)
            return 12; 
          if (j == 34 || j == 39) {
            while (true) {
              int k = this.e;
              if (k < this.d) {
                charSequence = this.b;
                this.e = k + 1;
                k = charSequence.charAt(k);
                this.f = (char)k;
                if (k != j)
                  continue; 
                continue label18;
              } 
              continue label18;
            } 
            break;
          } 
          continue;
        } 
        this.e = i;
        this.f = (char)'<';
        return 13;
      } 
    }
    
    byte a() {
      char c = this.b.charAt(this.e - 1);
      this.f = c;
      if (Character.isLowSurrogate(c)) {
        int i = Character.codePointBefore(this.b, this.e);
        this.e -= Character.charCount(i);
        return Character.getDirectionality(i);
      } 
      this.e--;
      byte b1 = c(this.f);
      byte b2 = b1;
      if (this.c) {
        char c1 = this.f;
        if (c1 == '>') {
          b1 = h();
          b2 = b1;
        } else {
          b2 = b1;
          if (c1 == ';') {
            b1 = f();
            b2 = b1;
          } 
        } 
      } 
      return b2;
    }
    
    byte b() {
      char c = this.b.charAt(this.e);
      this.f = c;
      if (Character.isHighSurrogate(c)) {
        int i = Character.codePointAt(this.b, this.e);
        this.e += Character.charCount(i);
        return Character.getDirectionality(i);
      } 
      this.e++;
      byte b1 = c(this.f);
      byte b2 = b1;
      if (this.c) {
        byte b3;
        char c1 = this.f;
        if (c1 == '<') {
          b3 = i();
          b2 = b3;
        } else {
          b2 = b1;
          if (b3 == 38) {
            b3 = g();
            b2 = b3;
          } 
        } 
      } 
      return b2;
    }
    
    int d() {
      this.e = 0;
      byte b1 = 0;
      byte b2 = 0;
      byte b3 = 0;
      while (this.e < this.d && !b1) {
        byte b4 = b();
        if (b4 != 0) {
          if (b4 != 1 && b4 != 2) {
            if (b4 != 9) {
              switch (b4) {
                case 18:
                  b3--;
                  b2 = 0;
                  continue;
                case 16:
                case 17:
                  b3++;
                  b2 = 1;
                  continue;
                case 14:
                case 15:
                  b3++;
                  b2 = -1;
                  continue;
              } 
            } else {
              continue;
            } 
          } else if (b3 == 0) {
            return 1;
          } 
        } else if (b3 == 0) {
          return -1;
        } 
        b1 = b3;
      } 
      if (b1 == 0)
        return 0; 
      if (b2 != 0)
        return b2; 
      while (this.e > 0) {
        switch (a()) {
          default:
            continue;
          case 18:
            b3++;
            continue;
          case 16:
          case 17:
            if (b1 == b3)
              return 1; 
            break;
          case 14:
          case 15:
            if (b1 == b3)
              return -1; 
            break;
        } 
        b3--;
      } 
      return 0;
    }
    
    int e() {
      this.e = this.d;
      byte b1 = 0;
      for (byte b2 = 0; this.e > 0; b2 = b1) {
        byte b3 = a();
        if (b3 != 0) {
          if (b3 != 1 && b3 != 2) {
            if (b3 != 9) {
              switch (b3) {
                default:
                  if (!b2)
                    break; 
                  continue;
                case 18:
                  b1++;
                  continue;
                case 16:
                case 17:
                  if (b2 == b1)
                    return 1; 
                  b1--;
                  continue;
                case 14:
                case 15:
                  if (b2 == b1)
                    return -1; 
                  b1--;
                  continue;
              } 
            } else {
              continue;
            } 
            continue;
          } 
          if (b1 == 0)
            return 1; 
          if (b2 == 0)
            continue; 
          continue;
        } 
        if (b1 == 0)
          return -1; 
        if (b2 == 0)
          continue; 
        continue;
      } 
      return 0;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/h/i/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */