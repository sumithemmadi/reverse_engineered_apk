package com.allinone.callerid.util.recorder;

import android.os.Build;
import com.allinone.callerid.bean.recorder.AudioSourceInfo;
import com.allinone.callerid.f.k.c;
import com.allinone.callerid.util.d0;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class d {
  public static int b() {
    try {
      String str1 = Build.MODEL;
      Locale locale = Locale.ENGLISH;
      str1 = str1.toUpperCase(locale);
      String str3 = Build.MANUFACTURER.toLowerCase(locale);
      String str2 = Build.VERSION.RELEASE;
      int i = Build.VERSION.SDK_INT;
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append("model: ");
        stringBuilder.append(str1);
        d0.a("wbb", stringBuilder.toString());
        stringBuilder = new StringBuilder();
        this();
        stringBuilder.append("carrier: ");
        stringBuilder.append(str3);
        d0.a("wbb", stringBuilder.toString());
        stringBuilder = new StringBuilder();
        this();
        stringBuilder.append("VERSION: ");
        stringBuilder.append(str2);
        d0.a("wbb", stringBuilder.toString());
        stringBuilder = new StringBuilder();
        this();
        stringBuilder.append("sdk: ");
        stringBuilder.append(i);
        d0.a("wbb", stringBuilder.toString());
      } 
      if ("lge".equals(str3) && i == 23)
        return 1; 
      if ("oneplus".equals(str3) && "7.1.1".equals(str2))
        return 4; 
      if ("motorola".equals(str3) && i >= 21 && i < 23)
        return 1; 
      if ("zopo".equals(str3) && i < 21 && i >= 14)
        return 1; 
      if (d())
        return 4; 
      if ("blackberry".equals(str3) && str1.contains("STV100") && i >= 21 && i < 23)
        return 7; 
      if ("htc".equals(str3) && i >= 23 && i <= 24)
        return 7; 
      if ("htc".equals(str3) && str1.contains("M8") && i >= 21 && i < 23)
        return 7; 
      if ("micromax".equals(str3) && str1.contains("CANVAS") && i >= 14 && i <= 23)
        return 7; 
      if ("motorola".equals(str3) && str1.contains("G4") && i >= 23 && i <= 24)
        return 7; 
      if ("samsung".equals(str3) && (f() || e()) && i == 23)
        return 7; 
      if ("samsung".equals(str3) && g() && i == 23)
        return 1; 
      if ("samsung".equals(str3) && i == 24)
        return 7; 
      if ("wiko".equals(str3) && i >= 21 && i <= 24)
        return 7; 
      boolean bool = "huawei".equals(str3);
      return (bool && i >= 23) ? 7 : ((i < 23) ? 4 : 1);
    } catch (Exception exception) {
      return (Build.VERSION.SDK_INT < 23) ? 4 : 1;
    } 
  }
  
  public static void c() {
    (new Thread(new a())).start();
  }
  
  public static boolean d() {
    try {
      if (Build.VERSION.SDK_INT >= 21 && Build.MANUFACTURER.toUpperCase(Locale.ENGLISH).equals("ASUS")) {
        boolean bool = Build.SUPPORTED_ABIS[0].contains("x86");
        if (bool)
          return true; 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    return false;
  }
  
  public static boolean e() {
    String str = Build.MODEL.toUpperCase(Locale.ENGLISH);
    return (str.contains("SM-N910") || str.contains("SM-N915") || str.contains("SCL24") || str.contains("SC-01G"));
  }
  
  public static boolean f() {
    String str = Build.MODEL.toUpperCase(Locale.ENGLISH);
    return (str.contains("SM-G900") || str.contains("SC-04F") || str.contains("SCL23") || str.contains("SM-G87") || str.contains("SM-G800") || str.contains("SM-G906") || str.contains("SM-G903"));
  }
  
  public static boolean g() {
    String str = Build.MODEL.toUpperCase(Locale.ENGLISH);
    return (str.contains("SM-G935AZ") || str.contains("SM-G935A") || str.contains("SM-G935T1") || str.contains("SM-G935R6") || str.contains("SM-G935R7") || str.contains("SM-G935P") || str.contains("SM-G935T") || str.contains("SM-G935R4") || str.contains("SM-G935V") || str.contains("SM-G935U") || str.contains("SM-G930AZ") || str.contains("SM-G930A") || str.contains("SM-G930T1") || str.contains("SM-G930R6") || str.contains("SM-G930R7") || str.contains("SM-G930P") || str.contains("SM-G930T") || str.contains("SM-G930R4") || str.contains("SM-G930V") || str.contains("SM-G930U"));
  }
  
  private static AudioSourceInfo h(String paramString, int paramInt) {
    AudioSourceInfo audioSourceInfo = new AudioSourceInfo();
    audioSourceInfo.setShowname(paramString);
    audioSourceInfo.setAudiosource(paramInt);
    return audioSourceInfo;
  }
  
  public static String i(String paramString) {
    if (Character.isUpperCase(paramString.charAt(0)))
      return paramString; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(Character.toUpperCase(paramString.charAt(0)));
    stringBuilder.append(paramString.substring(1));
    return stringBuilder.toString();
  }
  
  static final class a implements Runnable {
    public void run() {
      List<AudioSourceInfo> list = c.b().c();
      if (list != null && list.size() > 0)
        return; 
      list = new ArrayList();
      String str1 = Build.MODEL;
      String str2 = Build.MANUFACTURER;
      String str3 = Build.VERSION.RELEASE;
      String str4 = d.i(str2);
      int i = d.b();
      b.j(i);
      AudioSourceInfo audioSourceInfo2 = new AudioSourceInfo();
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(str4);
      stringBuilder.append(" ");
      stringBuilder.append(str1);
      stringBuilder.append(" Android ");
      stringBuilder.append(str3);
      audioSourceInfo2.setShowname(stringBuilder.toString());
      audioSourceInfo2.setAudiosource(i);
      audioSourceInfo2.setIsselected(true);
      audioSourceInfo2.setPhonemodel(str1);
      AudioSourceInfo audioSourceInfo6 = d.a("Android 6/7/8 (a)", 1);
      AudioSourceInfo audioSourceInfo7 = d.a("Android 6/7/8 (b)", 7);
      AudioSourceInfo audioSourceInfo4 = d.a("Android 7.1.1/2", 1);
      AudioSourceInfo audioSourceInfo8 = d.a("Android 4/5", 4);
      AudioSourceInfo audioSourceInfo1 = d.a("Samsung Android 7", 7);
      AudioSourceInfo audioSourceInfo5 = d.a("Samsung S6/S7/N5/N7 Android 6", 7);
      AudioSourceInfo audioSourceInfo9 = d.a("Samsung USA S6/S7/N5/N7 Android 6", 1);
      AudioSourceInfo audioSourceInfo3 = d.a("Samsung S5/N4/Edge Android 6", 1);
      AudioSourceInfo audioSourceInfo10 = d.a("Asus ZEN Phone 2 Android 6", 4);
      AudioSourceInfo audioSourceInfo11 = d.a("BlackBerry Android 6", 1);
      AudioSourceInfo audioSourceInfo12 = d.a("HTC M8 Android 5", 7);
      AudioSourceInfo audioSourceInfo13 = d.a("Huawei Android 8", 1);
      AudioSourceInfo audioSourceInfo14 = d.a("Huawei Android 6/7", 1);
      AudioSourceInfo audioSourceInfo15 = d.a("Google Pixel/XL Android 8.1", 1);
      AudioSourceInfo audioSourceInfo16 = d.a("Google Pixel/XL Android 8", 1);
      AudioSourceInfo audioSourceInfo17 = d.a("Google Pixel 2 Android 8/8.1", 1);
      AudioSourceInfo audioSourceInfo18 = d.a("Google Pixel 2 XL Android 8.1", 1);
      AudioSourceInfo audioSourceInfo19 = d.a("Google Pixel 2 XL Android 8", 1);
      AudioSourceInfo audioSourceInfo20 = d.a("LG Android 4/5/6", 4);
      AudioSourceInfo audioSourceInfo21 = d.a("LG Android 6 (b)", 1);
      AudioSourceInfo audioSourceInfo22 = d.a("Micromax Canvas 4/5/6", 7);
      AudioSourceInfo audioSourceInfo23 = d.a("Motorola G4 Android 6/7", 7);
      AudioSourceInfo audioSourceInfo24 = d.a("One Plus Android 7.1/8", 4);
      AudioSourceInfo audioSourceInfo25 = d.a("Wiko Android 5/6", 7);
      list.add(audioSourceInfo2);
      list.add(audioSourceInfo6);
      list.add(audioSourceInfo7);
      list.add(audioSourceInfo4);
      list.add(audioSourceInfo8);
      list.add(audioSourceInfo1);
      list.add(audioSourceInfo5);
      list.add(audioSourceInfo9);
      list.add(audioSourceInfo3);
      list.add(audioSourceInfo10);
      list.add(audioSourceInfo11);
      list.add(audioSourceInfo12);
      list.add(audioSourceInfo13);
      list.add(audioSourceInfo14);
      list.add(audioSourceInfo15);
      list.add(audioSourceInfo16);
      list.add(audioSourceInfo17);
      list.add(audioSourceInfo18);
      list.add(audioSourceInfo19);
      list.add(audioSourceInfo20);
      list.add(audioSourceInfo21);
      list.add(audioSourceInfo22);
      list.add(audioSourceInfo23);
      list.add(audioSourceInfo24);
      list.add(audioSourceInfo25);
      c.b().a(list);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/recorder/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */