package com.google.android.exoplayer2.text.o;

import android.graphics.PointF;
import android.text.Layout;
import com.google.android.exoplayer2.text.b;
import com.google.android.exoplayer2.text.c;
import com.google.android.exoplayer2.text.e;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.h0;
import com.google.android.exoplayer2.util.o;
import com.google.android.exoplayer2.util.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class a extends c {
  private static final Pattern o = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
  
  private final boolean p;
  
  private final b q;
  
  private Map<String, c> r;
  
  private float s = -3.4028235E38F;
  
  private float t = -3.4028235E38F;
  
  public a(List<byte[]> paramList) {
    super("SsaDecoder");
    if (paramList != null && !paramList.isEmpty()) {
      this.p = true;
      String str = h0.v(paramList.get(0));
      e.a(str.startsWith("Format:"));
      this.q = (b)e.e(b.a(str));
      H(new v(paramList.get(1)));
    } else {
      this.p = false;
      this.q = null;
    } 
  }
  
  private static int C(long paramLong, List<Long> paramList, List<List<b>> paramList1) {
    int i = paramList.size() - 1;
    while (true) {
      if (i >= 0) {
        if (((Long)paramList.get(i)).longValue() == paramLong)
          return i; 
        if (((Long)paramList.get(i)).longValue() < paramLong) {
          i++;
          break;
        } 
        i--;
        continue;
      } 
      i = 0;
      break;
    } 
    paramList.add(i, Long.valueOf(paramLong));
    paramList = new ArrayList<Long>();
    if (i == 0) {
      super();
    } else {
      super((Collection<? extends E>)paramList1.get(i - 1));
    } 
    paramList1.add(i, paramList);
    return i;
  }
  
  private static float D(int paramInt) {
    return (paramInt != 0) ? ((paramInt != 1) ? ((paramInt != 2) ? -3.4028235E38F : 0.95F) : 0.5F) : 0.05F;
  }
  
  private static b E(String paramString, c paramc, c.b paramb, float paramFloat1, float paramFloat2) {
    int i = paramb.e;
    if (i == -1)
      if (paramc != null) {
        i = paramc.b;
      } else {
        i = -1;
      }  
    int j = M(i);
    int k = L(i);
    PointF pointF = paramb.f;
    if (pointF != null && paramFloat2 != -3.4028235E38F && paramFloat1 != -3.4028235E38F) {
      float f = pointF.x / paramFloat1;
      paramFloat1 = pointF.y / paramFloat2;
      paramFloat2 = f;
    } else {
      paramFloat1 = D(j);
      float f = D(k);
      paramFloat2 = paramFloat1;
      paramFloat1 = f;
    } 
    return new b(paramString, N(i), paramFloat1, 0, k, paramFloat2, j, -3.4028235E38F);
  }
  
  private void F(String paramString, b paramb, List<List<b>> paramList, List<Long> paramList1) {
    // Byte code:
    //   0: aload_1
    //   1: ldc 'Dialogue:'
    //   3: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   6: invokestatic a : (Z)V
    //   9: aload_1
    //   10: bipush #9
    //   12: invokevirtual substring : (I)Ljava/lang/String;
    //   15: ldc ','
    //   17: aload_2
    //   18: getfield e : I
    //   21: invokevirtual split : (Ljava/lang/String;I)[Ljava/lang/String;
    //   24: astore #5
    //   26: aload #5
    //   28: arraylength
    //   29: aload_2
    //   30: getfield e : I
    //   33: if_icmpeq -> 67
    //   36: new java/lang/StringBuilder
    //   39: dup
    //   40: invokespecial <init> : ()V
    //   43: astore_2
    //   44: aload_2
    //   45: ldc 'Skipping dialogue line with fewer columns than format: '
    //   47: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   50: pop
    //   51: aload_2
    //   52: aload_1
    //   53: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   56: pop
    //   57: ldc 'SsaDecoder'
    //   59: aload_2
    //   60: invokevirtual toString : ()Ljava/lang/String;
    //   63: invokestatic f : (Ljava/lang/String;Ljava/lang/String;)V
    //   66: return
    //   67: aload #5
    //   69: aload_2
    //   70: getfield a : I
    //   73: aaload
    //   74: invokestatic K : (Ljava/lang/String;)J
    //   77: lstore #6
    //   79: lload #6
    //   81: ldc2_w -9223372036854775807
    //   84: lcmp
    //   85: ifne -> 119
    //   88: new java/lang/StringBuilder
    //   91: dup
    //   92: invokespecial <init> : ()V
    //   95: astore_2
    //   96: aload_2
    //   97: ldc 'Skipping invalid timing: '
    //   99: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   102: pop
    //   103: aload_2
    //   104: aload_1
    //   105: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   108: pop
    //   109: ldc 'SsaDecoder'
    //   111: aload_2
    //   112: invokevirtual toString : ()Ljava/lang/String;
    //   115: invokestatic f : (Ljava/lang/String;Ljava/lang/String;)V
    //   118: return
    //   119: aload #5
    //   121: aload_2
    //   122: getfield b : I
    //   125: aaload
    //   126: invokestatic K : (Ljava/lang/String;)J
    //   129: lstore #8
    //   131: lload #8
    //   133: ldc2_w -9223372036854775807
    //   136: lcmp
    //   137: ifne -> 171
    //   140: new java/lang/StringBuilder
    //   143: dup
    //   144: invokespecial <init> : ()V
    //   147: astore_2
    //   148: aload_2
    //   149: ldc 'Skipping invalid timing: '
    //   151: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   154: pop
    //   155: aload_2
    //   156: aload_1
    //   157: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   160: pop
    //   161: ldc 'SsaDecoder'
    //   163: aload_2
    //   164: invokevirtual toString : ()Ljava/lang/String;
    //   167: invokestatic f : (Ljava/lang/String;Ljava/lang/String;)V
    //   170: return
    //   171: aload_0
    //   172: getfield r : Ljava/util/Map;
    //   175: astore_1
    //   176: aload_1
    //   177: ifnull -> 213
    //   180: aload_2
    //   181: getfield c : I
    //   184: istore #10
    //   186: iload #10
    //   188: iconst_m1
    //   189: if_icmpeq -> 213
    //   192: aload_1
    //   193: aload #5
    //   195: iload #10
    //   197: aaload
    //   198: invokevirtual trim : ()Ljava/lang/String;
    //   201: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   206: checkcast com/google/android/exoplayer2/text/o/c
    //   209: astore_1
    //   210: goto -> 215
    //   213: aconst_null
    //   214: astore_1
    //   215: aload #5
    //   217: aload_2
    //   218: getfield d : I
    //   221: aaload
    //   222: astore #5
    //   224: aload #5
    //   226: invokestatic b : (Ljava/lang/String;)Lcom/google/android/exoplayer2/text/o/c$b;
    //   229: astore_2
    //   230: aload #5
    //   232: invokestatic d : (Ljava/lang/String;)Ljava/lang/String;
    //   235: ldc '\\N'
    //   237: ldc '\\n'
    //   239: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   242: ldc '\\n'
    //   244: ldc '\\n'
    //   246: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   249: aload_1
    //   250: aload_2
    //   251: aload_0
    //   252: getfield s : F
    //   255: aload_0
    //   256: getfield t : F
    //   259: invokestatic E : (Ljava/lang/String;Lcom/google/android/exoplayer2/text/o/c;Lcom/google/android/exoplayer2/text/o/c$b;FF)Lcom/google/android/exoplayer2/text/b;
    //   262: astore_1
    //   263: lload #6
    //   265: aload #4
    //   267: aload_3
    //   268: invokestatic C : (JLjava/util/List;Ljava/util/List;)I
    //   271: istore #10
    //   273: lload #8
    //   275: aload #4
    //   277: aload_3
    //   278: invokestatic C : (JLjava/util/List;Ljava/util/List;)I
    //   281: istore #11
    //   283: iload #10
    //   285: iload #11
    //   287: if_icmpge -> 314
    //   290: aload_3
    //   291: iload #10
    //   293: invokeinterface get : (I)Ljava/lang/Object;
    //   298: checkcast java/util/List
    //   301: aload_1
    //   302: invokeinterface add : (Ljava/lang/Object;)Z
    //   307: pop
    //   308: iinc #10, 1
    //   311: goto -> 283
    //   314: return
  }
  
  private void G(v paramv, List<List<b>> paramList, List<Long> paramList1) {
    if (this.p) {
      b b1 = this.q;
    } else {
      Object object = null;
    } 
    while (true) {
      String str = paramv.m();
      if (str != null) {
        b b1;
        if (str.startsWith("Format:")) {
          b1 = b.a(str);
          continue;
        } 
        if (str.startsWith("Dialogue:")) {
          if (b1 == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Skipping dialogue line before complete format: ");
            stringBuilder.append(str);
            o.f("SsaDecoder", stringBuilder.toString());
            continue;
          } 
          F(str, b1, paramList, paramList1);
        } 
        continue;
      } 
      break;
    } 
  }
  
  private void H(v paramv) {
    while (true) {
      String str = paramv.m();
      if (str != null) {
        if ("[Script Info]".equalsIgnoreCase(str)) {
          I(paramv);
          continue;
        } 
        if ("[V4+ Styles]".equalsIgnoreCase(str)) {
          this.r = J(paramv);
          continue;
        } 
        if ("[V4 Styles]".equalsIgnoreCase(str)) {
          o.e("SsaDecoder", "[V4 Styles] are not supported");
          continue;
        } 
        if ("[Events]".equalsIgnoreCase(str))
          break; 
        continue;
      } 
      break;
    } 
  }
  
  private void I(v paramv) {
    while (true) {
      String str = paramv.m();
      if (str != null && (paramv.a() == 0 || paramv.f() != 91)) {
        String[] arrayOfString = str.split(":");
        if (arrayOfString.length != 2)
          continue; 
        String str1 = h0.u0(arrayOfString[0].trim());
        str1.hashCode();
        if (!str1.equals("playresx")) {
          if (!str1.equals("playresy"))
            continue; 
          try {
            this.t = Float.parseFloat(arrayOfString[1].trim());
          } catch (NumberFormatException numberFormatException) {}
          continue;
        } 
        this.s = Float.parseFloat(numberFormatException[1].trim());
        continue;
      } 
      break;
    } 
  }
  
  private static Map<String, c> J(v paramv) {
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>();
    c.a a1 = null;
    while (true) {
      String str = paramv.m();
      if (str != null && (paramv.a() == 0 || paramv.f() != 91)) {
        if (str.startsWith("Format:")) {
          a1 = c.a.a(str);
          continue;
        } 
        if (str.startsWith("Style:")) {
          if (a1 == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Skipping 'Style:' line before 'Format:' line: ");
            stringBuilder.append(str);
            o.f("SsaDecoder", stringBuilder.toString());
            continue;
          } 
          c c1 = c.b(str, a1);
          if (c1 != null)
            linkedHashMap.put(c1.a, c1); 
        } 
        continue;
      } 
      break;
    } 
    return (Map)linkedHashMap;
  }
  
  private static long K(String paramString) {
    Matcher matcher = o.matcher(paramString.trim());
    return !matcher.matches() ? -9223372036854775807L : (Long.parseLong((String)h0.g(matcher.group(1))) * 60L * 60L * 1000000L + Long.parseLong((String)h0.g(matcher.group(2))) * 60L * 1000000L + Long.parseLong((String)h0.g(matcher.group(3))) * 1000000L + Long.parseLong((String)h0.g(matcher.group(4))) * 10000L);
  }
  
  private static int L(int paramInt) {
    StringBuilder stringBuilder;
    switch (paramInt) {
      default:
        stringBuilder = new StringBuilder();
        stringBuilder.append("Unknown alignment: ");
        stringBuilder.append(paramInt);
        o.f("SsaDecoder", stringBuilder.toString());
        return Integer.MIN_VALUE;
      case 7:
      case 8:
      case 9:
        return 0;
      case 4:
      case 5:
      case 6:
        return 1;
      case 1:
      case 2:
      case 3:
        return 2;
      case -1:
        break;
    } 
    return Integer.MIN_VALUE;
  }
  
  private static int M(int paramInt) {
    StringBuilder stringBuilder;
    switch (paramInt) {
      default:
        stringBuilder = new StringBuilder();
        stringBuilder.append("Unknown alignment: ");
        stringBuilder.append(paramInt);
        o.f("SsaDecoder", stringBuilder.toString());
        return Integer.MIN_VALUE;
      case 3:
      case 6:
      case 9:
        return 2;
      case 2:
      case 5:
      case 8:
        return 1;
      case 1:
      case 4:
      case 7:
        return 0;
      case -1:
        break;
    } 
    return Integer.MIN_VALUE;
  }
  
  private static Layout.Alignment N(int paramInt) {
    StringBuilder stringBuilder;
    switch (paramInt) {
      default:
        stringBuilder = new StringBuilder();
        stringBuilder.append("Unknown alignment: ");
        stringBuilder.append(paramInt);
        o.f("SsaDecoder", stringBuilder.toString());
        return null;
      case 3:
      case 6:
      case 9:
        return Layout.Alignment.ALIGN_OPPOSITE;
      case 2:
      case 5:
      case 8:
        return Layout.Alignment.ALIGN_CENTER;
      case 1:
      case 4:
      case 7:
        return Layout.Alignment.ALIGN_NORMAL;
      case -1:
        break;
    } 
    return null;
  }
  
  protected e z(byte[] paramArrayOfbyte, int paramInt, boolean paramBoolean) {
    ArrayList<List<b>> arrayList = new ArrayList();
    ArrayList<Long> arrayList1 = new ArrayList();
    v v = new v(paramArrayOfbyte, paramInt);
    if (!this.p)
      H(v); 
    G(v, arrayList, arrayList1);
    return new d(arrayList, arrayList1);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/text/o/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */