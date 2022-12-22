package com.google.android.gms.internal.ads;

import android.os.Build;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;

public final class wj2 {
  public static final int a;
  
  public static final String b;
  
  public static final String c;
  
  public static final String d;
  
  public static final String e;
  
  private static final Pattern f = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
  
  private static final Pattern g = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
  
  private static final Pattern h = Pattern.compile("%([A-Fa-f0-9]{2})");
  
  private static final int[] i = new int[] { 
      0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 
      797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 
      1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 
      1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, 
      -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, 
      -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, 
      -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 
      771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 
      2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 
      1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, 
      -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, 
      -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, 
      -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 
      1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 
      1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 
      1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, 
      -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, 
      -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, 
      -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, 
      -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 
      2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 
      404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 
      613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, 
      -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, 
      -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, 
      -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108 };
  
  public static float a(float paramFloat1, float paramFloat2, float paramFloat3) {
    return Math.max(0.1F, Math.min(paramFloat1, 8.0F));
  }
  
  public static int b(long[] paramArrayOflong, long paramLong, boolean paramBoolean1, boolean paramBoolean2) {
    int i = Arrays.binarySearch(paramArrayOflong, paramLong);
    int j = i;
    if (i < 0) {
      j = -(i + 2);
    } else {
      while (true) {
        i = j - 1;
        if (i >= 0) {
          j = i;
          if (paramArrayOflong[i] != paramLong)
            break; 
          continue;
        } 
        break;
      } 
      j = i + 1;
    } 
    i = j;
    if (paramBoolean2)
      i = Math.max(0, j); 
    return i;
  }
  
  public static long c(long paramLong1, long paramLong2, long paramLong3) {
    if (paramLong3 >= paramLong2 && paramLong3 % paramLong2 == 0L)
      return paramLong1 / paramLong3 / paramLong2; 
    if (paramLong3 < paramLong2 && paramLong2 % paramLong3 == 0L)
      return paramLong1 * paramLong2 / paramLong3; 
    double d1 = paramLong2;
    double d2 = paramLong3;
    Double.isNaN(d1);
    Double.isNaN(d2);
    d2 = d1 / d2;
    d1 = paramLong1;
    Double.isNaN(d1);
    return (long)(d1 * d2);
  }
  
  public static String d(Object[] paramArrayOfObject) {
    StringBuilder stringBuilder = new StringBuilder();
    for (byte b = 0; b < paramArrayOfObject.length; b++) {
      stringBuilder.append(paramArrayOfObject[b].getClass().getSimpleName());
      if (b < paramArrayOfObject.length - 1)
        stringBuilder.append(", "); 
    } 
    return stringBuilder.toString();
  }
  
  public static void e(ti2 paramti2) {
    if (paramti2 != null)
      try {
        paramti2.close();
      } catch (IOException iOException) {} 
  }
  
  public static void f(long[] paramArrayOflong, long paramLong1, long paramLong2) {
    boolean bool1 = false;
    boolean bool2 = false;
    byte b = 0;
    if (paramLong2 >= 1000000L && paramLong2 % 1000000L == 0L) {
      paramLong1 = paramLong2 / 1000000L;
      while (b < paramArrayOflong.length) {
        paramArrayOflong[b] = paramArrayOflong[b] / paramLong1;
        b++;
      } 
      return;
    } 
    if (paramLong2 < 1000000L && 1000000L % paramLong2 == 0L) {
      paramLong1 = 1000000L / paramLong2;
      for (b = bool1; b < paramArrayOflong.length; b++)
        paramArrayOflong[b] = paramArrayOflong[b] * paramLong1; 
      return;
    } 
    double d = paramLong2;
    Double.isNaN(d);
    d = 1000000.0D / d;
    for (b = bool2; b < paramArrayOflong.length; b++) {
      double d1 = paramArrayOflong[b];
      Double.isNaN(d1);
      paramArrayOflong[b] = (long)(d1 * d);
    } 
  }
  
  public static boolean g(Object paramObject1, Object paramObject2) {
    return (paramObject1 == null) ? ((paramObject2 == null)) : paramObject1.equals(paramObject2);
  }
  
  public static int h(long[] paramArrayOflong, long paramLong, boolean paramBoolean1, boolean paramBoolean2) {
    int i = Arrays.binarySearch(paramArrayOflong, paramLong);
    int j = i;
    if (i < 0) {
      j = i ^ 0xFFFFFFFF;
    } else {
      while (true) {
        i = j + 1;
        if (i < paramArrayOflong.length) {
          j = i;
          if (paramArrayOflong[i] != paramLong)
            break; 
          continue;
        } 
        break;
      } 
      if (paramBoolean1) {
        j = i - 1;
      } else {
        j = i;
      } 
    } 
    return paramBoolean2 ? Math.min(paramArrayOflong.length - 1, j) : j;
  }
  
  public static ExecutorService i(String paramString) {
    return Executors.newSingleThreadExecutor(new zj2(paramString));
  }
  
  public static byte[] j(String paramString) {
    return paramString.getBytes(Charset.defaultCharset());
  }
  
  public static int k(String paramString) {
    boolean bool;
    int i = paramString.length();
    byte b = 0;
    if (i <= 4) {
      bool = true;
    } else {
      bool = false;
    } 
    jj2.a(bool);
    int j = 0;
    while (b < i) {
      j = j << 8 | paramString.charAt(b);
      b++;
    } 
    return j;
  }
  
  public static byte[] l(String paramString) {
    int i = paramString.length() / 2;
    byte[] arrayOfByte = new byte[i];
    for (byte b = 0; b < i; b++) {
      int j = b << 1;
      arrayOfByte[b] = (byte)(byte)((Character.digit(paramString.charAt(j), 16) << 4) + Character.digit(paramString.charAt(j + 1), 16));
    } 
    return arrayOfByte;
  }
  
  public static int m(int paramInt) {
    return (paramInt != 8) ? ((paramInt != 16) ? ((paramInt != 24) ? ((paramInt != 32) ? 0 : 1073741824) : Integer.MIN_VALUE) : 2) : 3;
  }
  
  public static int n(int paramInt) {
    if (paramInt != 0) {
      if (paramInt != 1) {
        if (paramInt != 2) {
          if (paramInt != 3) {
            if (paramInt == 4)
              return 131072; 
            throw new IllegalStateException();
          } 
          return 131072;
        } 
        return 13107200;
      } 
      return 3538944;
    } 
    return 16777216;
  }
  
  public static int o(int paramInt1, int paramInt2, int paramInt3) {
    return Math.max(paramInt2, Math.min(paramInt1, paramInt3));
  }
  
  public static int p(int paramInt1, int paramInt2) {
    return (paramInt1 + paramInt2 - 1) / paramInt2;
  }
  
  public static int q(int paramInt1, int paramInt2) {
    if (paramInt1 != Integer.MIN_VALUE) {
      if (paramInt1 != 1073741824) {
        if (paramInt1 != 2) {
          if (paramInt1 == 3)
            return paramInt2; 
          throw new IllegalArgumentException();
        } 
        return paramInt2 << 1;
      } 
      return paramInt2 << 2;
    } 
    return paramInt2 * 3;
  }
  
  static {
    int i = Build.VERSION.SDK_INT;
    int j = i;
    if (i == 25) {
      j = i;
      if (Build.VERSION.CODENAME.charAt(0) == 'O')
        j = 26; 
    } 
    a = j;
    String str1 = Build.DEVICE;
    b = str1;
    String str2 = Build.MANUFACTURER;
    c = str2;
    String str3 = Build.MODEL;
    d = str3;
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str1).length() + 17 + String.valueOf(str3).length() + String.valueOf(str2).length());
    stringBuilder.append(str1);
    stringBuilder.append(", ");
    stringBuilder.append(str3);
    stringBuilder.append(", ");
    stringBuilder.append(str2);
    stringBuilder.append(", ");
    stringBuilder.append(j);
    e = stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/wj2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */