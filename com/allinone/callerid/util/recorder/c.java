package com.allinone.callerid.util.recorder;

import android.text.TextUtils;
import com.allinone.callerid.main.EZCallApplication;
import java.io.File;

public class c {
  public static final String a;
  
  private static final String b;
  
  private static final String c;
  
  static {
    StringBuilder stringBuilder1 = new StringBuilder();
    stringBuilder1.append(EZCallApplication.c().getExternalFilesDir(""));
    stringBuilder1.append("/ShowCallRecording/");
    String str = stringBuilder1.toString();
    a = str;
    StringBuilder stringBuilder2 = new StringBuilder();
    stringBuilder2.append(str);
    stringBuilder2.append("pcm/");
    b = stringBuilder2.toString();
    stringBuilder2 = new StringBuilder();
    stringBuilder2.append(str);
    stringBuilder2.append("pcmagcns/");
    c = stringBuilder2.toString();
  }
  
  public static File a() {
    String str = a;
    File file1 = new File(str);
    File file2 = file1;
    if (!file1.exists())
      if (file1.mkdirs()) {
        file2 = file1;
      } else {
        file2 = new File(str);
      }  
    return file2;
  }
  
  public static String b(String paramString) {
    if (!TextUtils.isEmpty(paramString)) {
      String str = paramString;
      if (!paramString.endsWith(".pcm")) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(paramString);
        stringBuilder1.append(".pcm");
        str = stringBuilder1.toString();
      } 
      paramString = c;
      File file = new File(paramString);
      if (!file.exists())
        file.mkdirs(); 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(paramString);
      stringBuilder.append(str);
      return stringBuilder.toString();
    } 
    throw new NullPointerException("fileName isEmpty");
  }
  
  public static String c(String paramString) {
    if (!TextUtils.isEmpty(paramString)) {
      String str = paramString;
      if (!paramString.endsWith(".pcm")) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(paramString);
        stringBuilder1.append(".pcm");
        str = stringBuilder1.toString();
      } 
      paramString = b;
      File file = new File(paramString);
      if (!file.exists())
        file.mkdirs(); 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(paramString);
      stringBuilder.append(str);
      return stringBuilder.toString();
    } 
    throw new NullPointerException("fileName isEmpty");
  }
  
  public static void d() {
    try {
      String str1 = b;
      String str2 = c;
      File file = new File();
      this(str1);
      if (file.exists())
        file.delete(); 
      file = new File();
      this(str2);
      if (file.exists())
        file.delete(); 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/recorder/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */