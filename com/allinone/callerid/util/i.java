package com.allinone.callerid.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.format.DateFormat;
import android.text.format.DateUtils;
import android.text.format.Time;
import com.allinone.callerid.main.EZCallApplication;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class i {
  public static boolean a(long paramLong, String paramString) {
    try {
      Calendar calendar1 = Calendar.getInstance();
      Date date1 = new Date();
      this(System.currentTimeMillis());
      calendar1.setTime(date1);
      calendar1.setTimeZone(TimeZone.getTimeZone(paramString));
      Calendar calendar2 = Calendar.getInstance();
      Date date2 = new Date();
      this(paramLong);
      calendar2.setTime(date2);
      calendar2.setTimeZone(TimeZone.getTimeZone(paramString));
      if (calendar2.get(1) == calendar1.get(1)) {
        int j = calendar2.get(6);
        int k = calendar1.get(6);
        if (j - k == -1)
          return true; 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    return false;
  }
  
  public static String b(Date paramDate) {
    // Byte code:
    //   0: ldc '24'
    //   2: invokestatic c : ()Lcom/allinone/callerid/main/EZCallApplication;
    //   5: invokevirtual getContentResolver : ()Landroid/content/ContentResolver;
    //   8: ldc 'time_12_24'
    //   10: invokestatic getString : (Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;
    //   13: invokevirtual equals : (Ljava/lang/Object;)Z
    //   16: istore_1
    //   17: ldc 'night'
    //   19: astore_2
    //   20: iload_1
    //   21: ifeq -> 163
    //   24: new java/text/SimpleDateFormat
    //   27: dup
    //   28: ldc 'HH'
    //   30: invokestatic y : ()Ljava/util/Locale;
    //   33: invokespecial <init> : (Ljava/lang/String;Ljava/util/Locale;)V
    //   36: aload_0
    //   37: invokevirtual format : (Ljava/util/Date;)Ljava/lang/String;
    //   40: invokestatic valueOf : (Ljava/lang/String;)Ljava/lang/Integer;
    //   43: invokevirtual intValue : ()I
    //   46: istore_3
    //   47: getstatic com/allinone/callerid/util/d0.a : Z
    //   50: ifeq -> 87
    //   53: new java/lang/StringBuilder
    //   56: dup
    //   57: invokespecial <init> : ()V
    //   60: astore #4
    //   62: aload #4
    //   64: ldc 'hour:'
    //   66: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   69: pop
    //   70: aload #4
    //   72: iload_3
    //   73: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   76: pop
    //   77: ldc 'comment'
    //   79: aload #4
    //   81: invokevirtual toString : ()Ljava/lang/String;
    //   84: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)V
    //   87: iload_3
    //   88: iflt -> 103
    //   91: iload_3
    //   92: bipush #9
    //   94: if_icmpge -> 103
    //   97: ldc 'morning'
    //   99: astore_2
    //   100: goto -> 428
    //   103: iload_3
    //   104: bipush #17
    //   106: if_icmplt -> 118
    //   109: iload_3
    //   110: bipush #24
    //   112: if_icmpge -> 118
    //   115: goto -> 428
    //   118: invokestatic getInstance : ()Ljava/util/Calendar;
    //   121: astore_2
    //   122: aload_2
    //   123: aload_0
    //   124: invokevirtual setTime : (Ljava/util/Date;)V
    //   127: aload_2
    //   128: bipush #7
    //   130: invokevirtual get : (I)I
    //   133: iconst_1
    //   134: if_icmpeq -> 157
    //   137: aload_2
    //   138: bipush #7
    //   140: invokevirtual get : (I)I
    //   143: bipush #7
    //   145: if_icmpne -> 151
    //   148: goto -> 157
    //   151: ldc 'worktime'
    //   153: astore_2
    //   154: goto -> 428
    //   157: ldc 'weekends'
    //   159: astore_2
    //   160: goto -> 428
    //   163: new java/text/SimpleDateFormat
    //   166: dup
    //   167: ldc 'a'
    //   169: invokestatic y : ()Ljava/util/Locale;
    //   172: invokespecial <init> : (Ljava/lang/String;Ljava/util/Locale;)V
    //   175: aload_0
    //   176: invokevirtual format : (Ljava/util/Date;)Ljava/lang/String;
    //   179: astore #4
    //   181: new java/text/SimpleDateFormat
    //   184: dup
    //   185: ldc 'hh'
    //   187: invokestatic y : ()Ljava/util/Locale;
    //   190: invokespecial <init> : (Ljava/lang/String;Ljava/util/Locale;)V
    //   193: aload_0
    //   194: invokevirtual format : (Ljava/util/Date;)Ljava/lang/String;
    //   197: invokestatic valueOf : (Ljava/lang/String;)Ljava/lang/Integer;
    //   200: invokevirtual intValue : ()I
    //   203: istore_3
    //   204: getstatic com/allinone/callerid/util/d0.a : Z
    //   207: ifeq -> 244
    //   210: new java/lang/StringBuilder
    //   213: dup
    //   214: invokespecial <init> : ()V
    //   217: astore #5
    //   219: aload #5
    //   221: ldc 'hour:'
    //   223: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   226: pop
    //   227: aload #5
    //   229: iload_3
    //   230: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   233: pop
    //   234: ldc 'comment'
    //   236: aload #5
    //   238: invokevirtual toString : ()Ljava/lang/String;
    //   241: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)V
    //   244: aload #4
    //   246: ifnull -> 308
    //   249: ldc 'AM'
    //   251: aload #4
    //   253: invokevirtual equals : (Ljava/lang/Object;)Z
    //   256: ifeq -> 308
    //   259: iload_3
    //   260: iflt -> 275
    //   263: iload_3
    //   264: bipush #9
    //   266: if_icmpge -> 275
    //   269: ldc 'morning'
    //   271: astore_0
    //   272: goto -> 387
    //   275: invokestatic getInstance : ()Ljava/util/Calendar;
    //   278: astore_2
    //   279: aload_2
    //   280: aload_0
    //   281: invokevirtual setTime : (Ljava/util/Date;)V
    //   284: aload_2
    //   285: bipush #7
    //   287: invokevirtual get : (I)I
    //   290: iconst_1
    //   291: if_icmpeq -> 378
    //   294: aload_2
    //   295: bipush #7
    //   297: invokevirtual get : (I)I
    //   300: bipush #7
    //   302: if_icmpne -> 372
    //   305: goto -> 378
    //   308: aload #4
    //   310: ifnull -> 384
    //   313: ldc 'PM'
    //   315: aload #4
    //   317: invokevirtual equals : (Ljava/lang/Object;)Z
    //   320: ifeq -> 384
    //   323: iload_3
    //   324: iconst_5
    //   325: if_icmplt -> 339
    //   328: iload_3
    //   329: bipush #12
    //   331: if_icmpge -> 339
    //   334: aload_2
    //   335: astore_0
    //   336: goto -> 387
    //   339: invokestatic getInstance : ()Ljava/util/Calendar;
    //   342: astore_2
    //   343: aload_2
    //   344: aload_0
    //   345: invokevirtual setTime : (Ljava/util/Date;)V
    //   348: aload_2
    //   349: bipush #7
    //   351: invokevirtual get : (I)I
    //   354: iconst_1
    //   355: if_icmpeq -> 378
    //   358: aload_2
    //   359: bipush #7
    //   361: invokevirtual get : (I)I
    //   364: bipush #7
    //   366: if_icmpne -> 372
    //   369: goto -> 378
    //   372: ldc 'worktime'
    //   374: astore_0
    //   375: goto -> 387
    //   378: ldc 'weekends'
    //   380: astore_0
    //   381: goto -> 387
    //   384: ldc ''
    //   386: astore_0
    //   387: aload_0
    //   388: astore_2
    //   389: getstatic com/allinone/callerid/util/d0.a : Z
    //   392: ifeq -> 428
    //   395: new java/lang/StringBuilder
    //   398: dup
    //   399: invokespecial <init> : ()V
    //   402: astore_2
    //   403: aload_2
    //   404: ldc 'amOrpm:'
    //   406: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   409: pop
    //   410: aload_2
    //   411: aload #4
    //   413: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   416: pop
    //   417: ldc 'comment'
    //   419: aload_2
    //   420: invokevirtual toString : ()Ljava/lang/String;
    //   423: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)V
    //   426: aload_0
    //   427: astore_2
    //   428: aload_2
    //   429: areturn
  }
  
  public static String c(Date paramDate) {
    return DateUtils.isToday(paramDate.getTime()) ? EZCallApplication.c().getResources().getString(2131755803) : DateFormat.getDateInstance(2, new Locale((EZCallApplication.c()).f)).format(paramDate);
  }
  
  @SuppressLint({"SimpleDateFormat"})
  public static String d(long paramLong) {
    return (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH)).format(new Date(paramLong));
  }
  
  public static String e(Date paramDate) {
    SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat(EZCallApplication.c().getResources().getString(2131755367), i1.y());
    SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(EZCallApplication.c().getResources().getString(2131755368), i1.y());
    SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("yyyy", Locale.ENGLISH);
    if (paramDate == null)
      return null; 
    long l = (new Date()).getTime() - paramDate.getTime();
    if (l > 32140800000L)
      return simpleDateFormat2.format(paramDate); 
    if (!simpleDateFormat3.format(paramDate).equals(simpleDateFormat3.format(new Date())))
      return simpleDateFormat2.format(paramDate); 
    if (l > 604800000L)
      return simpleDateFormat1.format(paramDate); 
    if (l > 86400000L && l <= 604800000L) {
      l /= 86400000L;
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(l);
      stringBuilder1.append(" ");
      stringBuilder1.append(EZCallApplication.c().getResources().getString(2131755275));
      return stringBuilder1.toString();
    } 
    if (l > 3600000L) {
      l /= 3600000L;
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(l);
      stringBuilder1.append(" ");
      stringBuilder1.append(EZCallApplication.c().getResources().getString(2131755412));
      return stringBuilder1.toString();
    } 
    if (l > 60000L) {
      l /= 60000L;
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(l);
      stringBuilder1.append(" ");
      stringBuilder1.append(EZCallApplication.c().getResources().getString(2131755463));
      return stringBuilder1.toString();
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("1 ");
    stringBuilder.append(EZCallApplication.c().getResources().getString(2131755463));
    return stringBuilder.toString();
  }
  
  public static String f(long paramLong) {
    return (new SimpleDateFormat("yyyy-MM-dd", i1.y())).format(new Date(paramLong));
  }
  
  public static String g(long paramLong) {
    return (new SimpleDateFormat("yyyyMMddHHmmss", Locale.ENGLISH)).format(new Date(paramLong));
  }
  
  public static String h(Date paramDate) {
    return SimpleDateFormat.getTimeInstance(3).format(paramDate);
  }
  
  public static String i(Date paramDate) {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm", i1.y());
    return (paramDate == null) ? "" : simpleDateFormat.format(paramDate);
  }
  
  public static String j(Date paramDate) {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd HH:mm", i1.y());
    return (paramDate == null) ? "" : simpleDateFormat.format(paramDate);
  }
  
  public static String k(Date paramDate) {
    return DateFormat.getDateInstance(2, new Locale((EZCallApplication.c()).f)).format(paramDate);
  }
  
  public static String l(int paramInt1, int paramInt2) {
    Calendar calendar = Calendar.getInstance();
    calendar.set(11, paramInt1);
    calendar.set(12, paramInt2);
    return SimpleDateFormat.getTimeInstance(3).format(calendar.getTime());
  }
  
  public static String m(Date paramDate) {
    return SimpleDateFormat.getTimeInstance(3, new Locale((EZCallApplication.c()).f)).format(paramDate);
  }
  
  public static String n(Date paramDate) {
    return SimpleDateFormat.getDateTimeInstance(2, 3, new Locale((EZCallApplication.c()).f)).format(paramDate);
  }
  
  public static String o(int paramInt) {
    switch (paramInt) {
      default:
        return null;
      case 7:
        return Week.h.getName();
      case 6:
        return Week.g.getName();
      case 5:
        return Week.f.getName();
      case 4:
        return Week.e.getName();
      case 3:
        return Week.d.getName();
      case 2:
        return Week.c.getName();
      case 1:
        break;
    } 
    return Week.b.getName();
  }
  
  public static boolean p(Context paramContext) {
    return DateFormat.is24HourFormat(paramContext);
  }
  
  public static boolean q(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    long l = System.currentTimeMillis();
    Time time1 = new Time();
    time1.set(l);
    Time time2 = new Time();
    time2.set(l);
    time2.hour = paramInt1;
    time2.minute = paramInt2;
    Time time3 = new Time();
    time3.set(l);
    time3.hour = paramInt3;
    time3.minute = paramInt4;
    boolean bool = time2.before(time3);
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = true;
    if (!bool) {
      time2.set(time2.toMillis(true) - 86400000L);
      bool = bool2;
      if (!time1.before(time2)) {
        bool = bool2;
        if (!time1.after(time3))
          bool = true; 
      } 
      time3 = new Time();
      time3.set(time2.toMillis(true) + 86400000L);
      if (!time1.before(time3))
        bool = bool3; 
    } else {
      bool = bool1;
      if (!time1.before(time2)) {
        bool = bool1;
        if (!time1.after(time3))
          bool = true; 
      } 
    } 
    return bool;
  }
  
  public static boolean r(Date paramDate1, Date paramDate2) {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
    return simpleDateFormat.format(paramDate1).equals(simpleDateFormat.format(paramDate2));
  }
  
  public static boolean s(Date paramDate1, Date paramDate2, String paramString) {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
    simpleDateFormat.setTimeZone(TimeZone.getTimeZone(paramString));
    return simpleDateFormat.format(paramDate1).equals(simpleDateFormat.format(paramDate2));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */