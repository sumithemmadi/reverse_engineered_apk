package com.google.android.exoplayer2.util;

import android.annotation.TargetApi;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.upstream.j;
import com.google.android.exoplayer2.w0;
import java.io.Closeable;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public final class h0 {
  public static final int a;
  
  public static final String b;
  
  public static final String c;
  
  public static final String d;
  
  public static final String e;
  
  public static final byte[] f = new byte[0];
  
  private static final Pattern g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
  
  private static final Pattern h = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
  
  private static final Pattern i = Pattern.compile("%([A-Fa-f0-9]{2})");
  
  private static HashMap<String, String> j;
  
  private static final String[] k = new String[] { 
      "alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", 
      "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", 
      "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", 
      "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", 
      "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", 
      "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", 
      "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", 
      "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", 
      "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn" };
  
  private static final String[] l = new String[] { 
      "i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", 
      "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn" };
  
  private static final int[] m = new int[] { 
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
  
  private static final int[] n = new int[] { 
      0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 
      54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 
      108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 
      90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 
      216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 
      158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 
      180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 
      213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 
      183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 
      129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 
      59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 
      13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 
      111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 
      135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 
      173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 
      235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 
      105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 
      95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 
      5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 
      51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 
      118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 
      48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 
      26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 
      188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 
      222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 
      232, 239, 250, 253, 244, 243 };
  
  public static String A(Context paramContext) {
    if (paramContext != null) {
      TelephonyManager telephonyManager = (TelephonyManager)paramContext.getSystemService("phone");
      if (telephonyManager != null) {
        String str = telephonyManager.getNetworkCountryIso();
        if (!TextUtils.isEmpty(str))
          return w0(str); 
      } 
    } 
    return w0(Locale.getDefault().getCountry());
  }
  
  public static String B(Locale paramLocale) {
    String str;
    if (a >= 21) {
      str = C(paramLocale);
    } else {
      str = str.toString();
    } 
    return str;
  }
  
  @TargetApi(21)
  private static String C(Locale paramLocale) {
    return paramLocale.toLanguageTag();
  }
  
  public static Looper D() {
    Looper looper = Looper.myLooper();
    if (looper == null)
      looper = Looper.getMainLooper(); 
    return looper;
  }
  
  public static long E(long paramLong, float paramFloat) {
    if (paramFloat == 1.0F)
      return paramLong; 
    double d1 = paramLong;
    double d2 = paramFloat;
    Double.isNaN(d1);
    Double.isNaN(d2);
    return Math.round(d1 * d2);
  }
  
  private static int F(NetworkInfo paramNetworkInfo) {
    switch (paramNetworkInfo.getSubtype()) {
      default:
        return 6;
      case 20:
        return 9;
      case 18:
        return 2;
      case 13:
        return 5;
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
      case 11:
      case 12:
      case 14:
      case 15:
      case 17:
        return 4;
      case 1:
      case 2:
        break;
    } 
    return 3;
  }
  
  public static int G(Context paramContext) {
    int i = 0;
    if (paramContext == null)
      return 0; 
    ConnectivityManager connectivityManager = (ConnectivityManager)paramContext.getSystemService("connectivity");
    if (connectivityManager == null)
      return 0; 
    try {
      NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
      byte b = 1;
      i = b;
      if (networkInfo != null)
        if (!networkInfo.isConnected()) {
          i = b;
        } else {
          i = networkInfo.getType();
          if (i != 0)
            if (i != 1) {
              if (i != 4 && i != 5)
                return (i != 6) ? ((i != 9) ? 8 : 7) : 5; 
            } else {
              return 2;
            }  
          return F(networkInfo);
        }  
    } catch (SecurityException securityException) {}
    return i;
  }
  
  public static int H(int paramInt) {
    return (paramInt != 8) ? ((paramInt != 16) ? ((paramInt != 24) ? ((paramInt != 32) ? 0 : 805306368) : 536870912) : 2) : 3;
  }
  
  public static int I(int paramInt1, int paramInt2) {
    if (paramInt1 != 2) {
      int i = paramInt2;
      if (paramInt1 != 3) {
        if (paramInt1 != 4)
          if (paramInt1 != 268435456) {
            if (paramInt1 != 536870912) {
              if (paramInt1 != 805306368)
                throw new IllegalArgumentException(); 
            } else {
              return paramInt2 * 3;
            } 
          } else {
            return paramInt2 * 2;
          }  
        i = paramInt2 * 4;
      } 
      return i;
    } 
    return paramInt2 * 2;
  }
  
  public static long J(long paramLong, float paramFloat) {
    if (paramFloat == 1.0F)
      return paramLong; 
    double d1 = paramLong;
    double d2 = paramFloat;
    Double.isNaN(d1);
    Double.isNaN(d2);
    return Math.round(d1 / d2);
  }
  
  public static int K(int paramInt) {
    if (paramInt != 13) {
      switch (paramInt) {
        default:
          return 3;
        case 6:
          return 2;
        case 5:
        case 7:
        case 8:
        case 9:
        case 10:
          return 5;
        case 4:
          return 4;
        case 3:
          return 8;
        case 2:
          break;
      } 
      return 0;
    } 
    return 1;
  }
  
  public static String L(StringBuilder paramStringBuilder, Formatter paramFormatter, long paramLong) {
    String str;
    long l1 = paramLong;
    if (paramLong == -9223372036854775807L)
      l1 = 0L; 
    long l2 = (l1 + 500L) / 1000L;
    l1 = l2 % 60L;
    paramLong = l2 / 60L % 60L;
    l2 /= 3600L;
    paramStringBuilder.setLength(0);
    if (l2 > 0L) {
      str = paramFormatter.format("%d:%02d:%02d", new Object[] { Long.valueOf(l2), Long.valueOf(paramLong), Long.valueOf(l1) }).toString();
    } else {
      str = paramFormatter.format("%02d:%02d", new Object[] { Long.valueOf(paramLong), Long.valueOf(l1) }).toString();
    } 
    return str;
  }
  
  public static String[] M() {
    String[] arrayOfString = N();
    for (byte b = 0; b < arrayOfString.length; b++)
      arrayOfString[b] = c0(arrayOfString[b]); 
    return arrayOfString;
  }
  
  private static String[] N() {
    String[] arrayOfString;
    Configuration configuration = Resources.getSystem().getConfiguration();
    if (a >= 24) {
      arrayOfString = O(configuration);
    } else {
      arrayOfString = new String[] { B(((Configuration)arrayOfString).locale) };
    } 
    return arrayOfString;
  }
  
  @TargetApi(24)
  private static String[] O(Configuration paramConfiguration) {
    return n0(paramConfiguration.getLocales().toLanguageTags(), ",");
  }
  
  public static String P(int paramInt) {
    switch (paramInt) {
      default:
        if (paramInt >= 10000) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("custom (");
          stringBuilder.append(paramInt);
          stringBuilder.append(")");
          return stringBuilder.toString();
        } 
        break;
      case 6:
        return "none";
      case 5:
        return "camera motion";
      case 4:
        return "metadata";
      case 3:
        return "text";
      case 2:
        return "video";
      case 1:
        return "audio";
      case 0:
        return "default";
    } 
    return "?";
  }
  
  public static String Q(Context paramContext, String paramString) {
    String str;
    try {
      String str1 = paramContext.getPackageName();
      str = (paramContext.getPackageManager().getPackageInfo(str1, 0)).versionName;
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
      str = "?";
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramString);
    stringBuilder.append("/");
    stringBuilder.append(str);
    stringBuilder.append(" (Linux;Android ");
    stringBuilder.append(Build.VERSION.RELEASE);
    stringBuilder.append(") ");
    stringBuilder.append("ExoPlayerLib/2.11.3");
    return stringBuilder.toString();
  }
  
  public static byte[] R(String paramString) {
    return paramString.getBytes(Charset.forName("UTF-8"));
  }
  
  public static boolean S(v paramv1, v paramv2, Inflater paramInflater) {
    if (paramv1.a() <= 0)
      return false; 
    byte[] arrayOfByte1 = paramv2.a;
    byte[] arrayOfByte2 = arrayOfByte1;
    if (arrayOfByte1.length < paramv1.a())
      arrayOfByte2 = new byte[paramv1.a() * 2]; 
    Inflater inflater = paramInflater;
    if (paramInflater == null)
      inflater = new Inflater(); 
    inflater.setInput(paramv1.a, paramv1.c(), paramv1.a());
    int i = 0;
    try {
      while (true) {
        int j = i + inflater.inflate(arrayOfByte2, i, arrayOfByte2.length - i);
        if (inflater.finished()) {
          paramv2.K(arrayOfByte2, j);
          return true;
        } 
        if (inflater.needsDictionary() || inflater.needsInput())
          break; 
        i = j;
        if (j == arrayOfByte2.length) {
          arrayOfByte2 = Arrays.copyOf(arrayOfByte2, arrayOfByte2.length * 2);
          i = j;
        } 
      } 
      return false;
    } catch (DataFormatException dataFormatException) {
      return false;
    } finally {
      inflater.reset();
    } 
  }
  
  public static boolean T(int paramInt) {
    return (paramInt == 536870912 || paramInt == 805306368);
  }
  
  public static boolean U(int paramInt) {
    return (paramInt == 3 || paramInt == 2 || paramInt == 268435456 || paramInt == 536870912 || paramInt == 805306368 || paramInt == 4);
  }
  
  public static boolean V(int paramInt) {
    return (paramInt == 10 || paramInt == 13);
  }
  
  public static boolean W(Uri paramUri) {
    String str = paramUri.getScheme();
    return (TextUtils.isEmpty(str) || "file".equals(str));
  }
  
  public static boolean X(Context paramContext) {
    boolean bool;
    UiModeManager uiModeManager = (UiModeManager)paramContext.getApplicationContext().getSystemService("uimode");
    if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public static int Z(int[] paramArrayOfint, int paramInt) {
    for (byte b = 0; b < paramArrayOfint.length; b++) {
      if (paramArrayOfint[b] == paramInt)
        return b; 
    } 
    return -1;
  }
  
  public static long a(long paramLong1, long paramLong2, long paramLong3) {
    long l = paramLong1 + paramLong2;
    return (((paramLong1 ^ l) & (paramLong2 ^ l)) < 0L) ? paramLong3 : l;
  }
  
  private static String a0(String paramString) {
    byte b = 0;
    while (true) {
      String[] arrayOfString = l;
      if (b < arrayOfString.length) {
        if (paramString.startsWith(arrayOfString[b])) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append(arrayOfString[b + 1]);
          stringBuilder.append(paramString.substring(arrayOfString[b].length()));
          return stringBuilder.toString();
        } 
        b += 2;
        continue;
      } 
      return paramString;
    } 
  }
  
  public static boolean b(Object paramObject1, Object paramObject2) {
    boolean bool;
    if (paramObject1 == null) {
      if (paramObject2 == null) {
        bool = true;
      } else {
        bool = false;
      } 
    } else {
      bool = paramObject1.equals(paramObject2);
    } 
    return bool;
  }
  
  public static ExecutorService b0(String paramString) {
    return Executors.newSingleThreadExecutor(new d(paramString));
  }
  
  public static <T extends Comparable<? super T>> int c(List<? extends Comparable<? super T>> paramList, T paramT, boolean paramBoolean1, boolean paramBoolean2) {
    int i = Collections.binarySearch(paramList, paramT);
    if (i < 0) {
      i ^= 0xFFFFFFFF;
    } else {
      int k = paramList.size();
      while (++i < k && ((Comparable<T>)paramList.get(i)).compareTo(paramT) == 0);
      if (paramBoolean1)
        i--; 
    } 
    int j = i;
    if (paramBoolean2)
      j = Math.min(paramList.size() - 1, i); 
    return j;
  }
  
  public static String c0(String paramString) {
    String str1;
    if (paramString == null)
      return null; 
    null = paramString.replace('_', '-');
    String str2 = paramString;
    if (!null.isEmpty())
      if ("und".equals(null)) {
        str2 = paramString;
      } else {
        str2 = null;
      }  
    String str3 = u0(str2);
    String str4 = o0(str3, "-")[0];
    if (j == null)
      j = t(); 
    null = j.get(str4);
    str2 = str4;
    paramString = str3;
    if (null != null) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(null);
      stringBuilder.append(str3.substring(str4.length()));
      str1 = stringBuilder.toString();
      str2 = null;
    } 
    if (!"no".equals(str2) && !"i".equals(str2)) {
      null = str1;
      return "zh".equals(str2) ? a0(str1) : null;
    } 
    return a0(str1);
  }
  
  public static int d(long[] paramArrayOflong, long paramLong, boolean paramBoolean1, boolean paramBoolean2) {
    int i = Arrays.binarySearch(paramArrayOflong, paramLong);
    int j = i;
    if (i < 0) {
      j = i ^ 0xFFFFFFFF;
    } else {
      while (++j < paramArrayOflong.length && paramArrayOflong[j] == paramLong);
      if (paramBoolean1)
        j--; 
    } 
    i = j;
    if (paramBoolean2)
      i = Math.min(paramArrayOflong.length - 1, j); 
    return i;
  }
  
  public static <T> T[] d0(T[] paramArrayOfT, T paramT) {
    Object[] arrayOfObject = Arrays.copyOf((Object[])paramArrayOfT, paramArrayOfT.length + 1);
    arrayOfObject[paramArrayOfT.length] = paramT;
    return h((T[])arrayOfObject);
  }
  
  public static <T extends Comparable<? super T>> int e(List<? extends Comparable<? super T>> paramList, T paramT, boolean paramBoolean1, boolean paramBoolean2) {
    int i = Collections.binarySearch(paramList, paramT);
    int j = i;
    if (i < 0) {
      j = -(i + 2);
    } else {
      while (--j >= 0 && ((Comparable<T>)paramList.get(j)).compareTo(paramT) == 0);
      if (paramBoolean1)
        j++; 
    } 
    i = j;
    if (paramBoolean2)
      i = Math.max(0, j); 
    return i;
  }
  
  public static <T> T[] e0(T[] paramArrayOfT1, T[] paramArrayOfT2) {
    Object[] arrayOfObject = Arrays.copyOf((Object[])paramArrayOfT1, paramArrayOfT1.length + paramArrayOfT2.length);
    System.arraycopy(paramArrayOfT2, 0, arrayOfObject, paramArrayOfT1.length, paramArrayOfT2.length);
    return (T[])arrayOfObject;
  }
  
  public static int f(long[] paramArrayOflong, long paramLong, boolean paramBoolean1, boolean paramBoolean2) {
    int i = Arrays.binarySearch(paramArrayOflong, paramLong);
    int j = i;
    if (i < 0) {
      j = -(i + 2);
    } else {
      while (--j >= 0 && paramArrayOflong[j] == paramLong);
      if (paramBoolean1)
        j++; 
    } 
    i = j;
    if (paramBoolean2)
      i = Math.max(0, j); 
    return i;
  }
  
  public static <T> T[] f0(T[] paramArrayOfT, int paramInt) {
    boolean bool;
    if (paramInt <= paramArrayOfT.length) {
      bool = true;
    } else {
      bool = false;
    } 
    e.a(bool);
    return Arrays.copyOf(paramArrayOfT, paramInt);
  }
  
  @EnsuresNonNull({"#1"})
  public static <T> T g(T paramT) {
    return paramT;
  }
  
  public static <T> T[] g0(T[] paramArrayOfT, int paramInt1, int paramInt2) {
    boolean bool2;
    boolean bool1 = true;
    if (paramInt1 >= 0) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    e.a(bool2);
    if (paramInt2 <= paramArrayOfT.length) {
      bool2 = bool1;
    } else {
      bool2 = false;
    } 
    e.a(bool2);
    return Arrays.copyOfRange(paramArrayOfT, paramInt1, paramInt2);
  }
  
  @EnsuresNonNull({"#1"})
  public static <T> T[] h(T[] paramArrayOfT) {
    return paramArrayOfT;
  }
  
  public static long h0(String paramString) {
    StringBuilder stringBuilder1;
    Matcher matcher = g.matcher(paramString);
    if (matcher.matches()) {
      paramString = matcher.group(9);
      int i = 0;
      if (paramString != null && !matcher.group(9).equalsIgnoreCase("Z")) {
        int j = Integer.parseInt(matcher.group(12)) * 60 + Integer.parseInt(matcher.group(13));
        i = j;
        if ("-".equals(matcher.group(11)))
          i = j * -1; 
      } 
      GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
      gregorianCalendar.clear();
      gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
      if (!TextUtils.isEmpty(matcher.group(8))) {
        stringBuilder1 = new StringBuilder();
        stringBuilder1.append("0.");
        stringBuilder1.append(matcher.group(8));
        gregorianCalendar.set(14, (new BigDecimal(stringBuilder1.toString())).movePointRight(3).intValue());
      } 
      long l1 = gregorianCalendar.getTimeInMillis();
      long l2 = l1;
      if (i != 0)
        l2 = l1 - (i * 60000); 
      return l2;
    } 
    StringBuilder stringBuilder2 = new StringBuilder();
    stringBuilder2.append("Invalid date/time format: ");
    stringBuilder2.append((String)stringBuilder1);
    throw new ParserException(stringBuilder2.toString());
  }
  
  public static int i(int paramInt1, int paramInt2) {
    return (paramInt1 + paramInt2 - 1) / paramInt2;
  }
  
  public static boolean i0(Parcel paramParcel) {
    boolean bool;
    if (paramParcel.readInt() != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public static void j(j paramj) {
    if (paramj != null)
      try {
        paramj.close();
      } catch (IOException iOException) {} 
  }
  
  public static <T> void j0(List<T> paramList, int paramInt1, int paramInt2) {
    if (paramInt1 >= 0 && paramInt2 <= paramList.size() && paramInt1 <= paramInt2) {
      if (paramInt1 != paramInt2)
        paramList.subList(paramInt1, paramInt2).clear(); 
      return;
    } 
    throw new IllegalArgumentException();
  }
  
  public static void k(Closeable paramCloseable) {
    if (paramCloseable != null)
      try {
        paramCloseable.close();
      } catch (IOException iOException) {} 
  }
  
  public static long k0(long paramLong1, w0 paramw0, long paramLong2, long paramLong3) {
    boolean bool2;
    if (w0.a.equals(paramw0))
      return paramLong1; 
    long l1 = r0(paramLong1, paramw0.f, Long.MIN_VALUE);
    long l2 = a(paramLong1, paramw0.g, Long.MAX_VALUE);
    boolean bool1 = true;
    if (l1 <= paramLong2 && paramLong2 <= l2) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    if (l1 > paramLong3 || paramLong3 > l2)
      bool1 = false; 
    return (bool2 && bool1) ? ((Math.abs(paramLong2 - paramLong1) <= Math.abs(paramLong3 - paramLong1)) ? paramLong2 : paramLong3) : (bool2 ? paramLong2 : (bool1 ? paramLong3 : l1));
  }
  
  public static int l(long paramLong1, long paramLong2) {
    boolean bool;
    if (paramLong1 < paramLong2) {
      bool = true;
    } else if (paramLong1 == paramLong2) {
      bool = false;
    } else {
      bool = true;
    } 
    return bool;
  }
  
  public static long l0(long paramLong1, long paramLong2, long paramLong3) {
    if (paramLong3 >= paramLong2 && paramLong3 % paramLong2 == 0L)
      return paramLong1 / paramLong3 / paramLong2; 
    if (paramLong3 < paramLong2 && paramLong2 % paramLong3 == 0L)
      return paramLong1 * paramLong2 / paramLong3; 
    double d1 = paramLong2;
    double d2 = paramLong3;
    Double.isNaN(d1);
    Double.isNaN(d2);
    d1 /= d2;
    d2 = paramLong1;
    Double.isNaN(d2);
    return (long)(d2 * d1);
  }
  
  public static float m(float paramFloat1, float paramFloat2, float paramFloat3) {
    return Math.max(paramFloat2, Math.min(paramFloat1, paramFloat3));
  }
  
  public static void m0(long[] paramArrayOflong, long paramLong1, long paramLong2) {
    boolean bool1 = false;
    boolean bool2 = false;
    byte b = 0;
    if (paramLong2 >= paramLong1 && paramLong2 % paramLong1 == 0L) {
      paramLong1 = paramLong2 / paramLong1;
      while (b < paramArrayOflong.length) {
        paramArrayOflong[b] = paramArrayOflong[b] / paramLong1;
        b++;
      } 
    } else if (paramLong2 < paramLong1 && paramLong1 % paramLong2 == 0L) {
      paramLong1 /= paramLong2;
      for (b = bool1; b < paramArrayOflong.length; b++)
        paramArrayOflong[b] = paramArrayOflong[b] * paramLong1; 
    } else {
      double d1 = paramLong1;
      double d2 = paramLong2;
      Double.isNaN(d1);
      Double.isNaN(d2);
      d2 = d1 / d2;
      for (b = bool2; b < paramArrayOflong.length; b++) {
        d1 = paramArrayOflong[b];
        Double.isNaN(d1);
        paramArrayOflong[b] = (long)(d1 * d2);
      } 
    } 
  }
  
  public static int n(int paramInt1, int paramInt2, int paramInt3) {
    return Math.max(paramInt2, Math.min(paramInt1, paramInt3));
  }
  
  public static String[] n0(String paramString1, String paramString2) {
    return paramString1.split(paramString2, -1);
  }
  
  public static long o(long paramLong1, long paramLong2, long paramLong3) {
    return Math.max(paramLong2, Math.min(paramLong1, paramLong3));
  }
  
  public static String[] o0(String paramString1, String paramString2) {
    return paramString1.split(paramString2, 2);
  }
  
  public static boolean p(Object[] paramArrayOfObject, Object paramObject) {
    int i = paramArrayOfObject.length;
    for (byte b = 0; b < i; b++) {
      if (b(paramArrayOfObject[b], paramObject))
        return true; 
    } 
    return false;
  }
  
  public static String[] p0(String paramString) {
    return TextUtils.isEmpty(paramString) ? new String[0] : n0(paramString.trim(), "(\\s*,\\s*)");
  }
  
  public static int q(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3) {
    while (paramInt1 < paramInt2) {
      paramInt3 = m[(paramInt3 >>> 24 ^ paramArrayOfbyte[paramInt1] & 0xFF) & 0xFF] ^ paramInt3 << 8;
      paramInt1++;
    } 
    return paramInt3;
  }
  
  public static ComponentName q0(Context paramContext, Intent paramIntent) {
    return (a >= 26) ? paramContext.startForegroundService(paramIntent) : paramContext.startService(paramIntent);
  }
  
  public static int r(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3) {
    while (paramInt1 < paramInt2) {
      paramInt3 = n[paramInt3 ^ paramArrayOfbyte[paramInt1] & 0xFF];
      paramInt1++;
    } 
    return paramInt3;
  }
  
  public static long r0(long paramLong1, long paramLong2, long paramLong3) {
    long l = paramLong1 - paramLong2;
    return (((paramLong1 ^ l) & (paramLong2 ^ paramLong1)) < 0L) ? paramLong3 : l;
  }
  
  public static Handler s(Looper paramLooper, Handler.Callback paramCallback) {
    return new Handler(paramLooper, paramCallback);
  }
  
  public static int[] s0(List<Integer> paramList) {
    if (paramList == null)
      return null; 
    int i = paramList.size();
    int[] arrayOfInt = new int[i];
    for (byte b = 0; b < i; b++)
      arrayOfInt[b] = ((Integer)paramList.get(b)).intValue(); 
    return arrayOfInt;
  }
  
  private static HashMap<String, String> t() {
    String[] arrayOfString = Locale.getISOLanguages();
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>(arrayOfString.length + k.length);
    int i = arrayOfString.length;
    byte b1 = 0;
    byte b2 = 0;
    while (true) {
      byte b = b1;
      if (b2 < i) {
        String str = arrayOfString[b2];
        try {
          Locale locale = new Locale();
          this(str);
          String str1 = locale.getISO3Language();
          if (!TextUtils.isEmpty(str1))
            hashMap.put(str1, str); 
        } catch (MissingResourceException missingResourceException) {}
        b2++;
        continue;
      } 
      while (true) {
        arrayOfString = k;
        if (b < arrayOfString.length) {
          hashMap.put(arrayOfString[b], arrayOfString[b + 1]);
          b += 2;
          continue;
        } 
        return (HashMap)hashMap;
      } 
      break;
    } 
  }
  
  public static long t0(int paramInt1, int paramInt2) {
    long l = v0(paramInt1);
    return v0(paramInt2) | l << 32L;
  }
  
  public static String u(String paramString, Object... paramVarArgs) {
    return String.format(Locale.US, paramString, paramVarArgs);
  }
  
  public static String u0(String paramString) {
    if (paramString != null)
      paramString = paramString.toLowerCase(Locale.US); 
    return paramString;
  }
  
  public static String v(byte[] paramArrayOfbyte) {
    return new String(paramArrayOfbyte, Charset.forName("UTF-8"));
  }
  
  public static long v0(int paramInt) {
    return paramInt & 0xFFFFFFFFL;
  }
  
  public static String w(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    return new String(paramArrayOfbyte, paramInt1, paramInt2, Charset.forName("UTF-8"));
  }
  
  public static String w0(String paramString) {
    if (paramString != null)
      paramString = paramString.toUpperCase(Locale.US); 
    return paramString;
  }
  
  public static int x(int paramInt) {
    switch (paramInt) {
      default:
        return 0;
      case 8:
        paramInt = a;
        return (paramInt >= 23) ? 6396 : ((paramInt >= 21) ? 6396 : 0);
      case 7:
        return 1276;
      case 6:
        return 252;
      case 5:
        return 220;
      case 4:
        return 204;
      case 3:
        return 28;
      case 2:
        return 12;
      case 1:
        break;
    } 
    return 4;
  }
  
  public static void x0(Parcel paramParcel, boolean paramBoolean) {
    paramParcel.writeInt(paramBoolean);
  }
  
  public static String y(String paramString, int paramInt) {
    String[] arrayOfString = p0(paramString);
    int i = arrayOfString.length;
    paramString = null;
    if (i == 0)
      return null; 
    StringBuilder stringBuilder = new StringBuilder();
    int j = arrayOfString.length;
    for (i = 0; i < j; i++) {
      String str = arrayOfString[i];
      if (paramInt == r.j(str)) {
        if (stringBuilder.length() > 0)
          stringBuilder.append(","); 
        stringBuilder.append(str);
      } 
    } 
    if (stringBuilder.length() > 0)
      paramString = stringBuilder.toString(); 
    return paramString;
  }
  
  public static String z(Object[] paramArrayOfObject) {
    StringBuilder stringBuilder = new StringBuilder();
    for (byte b = 0; b < paramArrayOfObject.length; b++) {
      stringBuilder.append(paramArrayOfObject[b].getClass().getSimpleName());
      if (b < paramArrayOfObject.length - 1)
        stringBuilder.append(", "); 
    } 
    return stringBuilder.toString();
  }
  
  static {
    int i = Build.VERSION.SDK_INT;
    a = i;
    String str1 = Build.DEVICE;
    b = str1;
    String str2 = Build.MANUFACTURER;
    c = str2;
    String str3 = Build.MODEL;
    d = str3;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(str1);
    stringBuilder.append(", ");
    stringBuilder.append(str3);
    stringBuilder.append(", ");
    stringBuilder.append(str2);
    stringBuilder.append(", ");
    stringBuilder.append(i);
    e = stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/util/h0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */