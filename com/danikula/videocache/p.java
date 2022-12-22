package com.danikula.videocache;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import org.slf4j.b;
import org.slf4j.c;

final class p {
  private static final b a = c.i("StorageUtils");
  
  private static File a(Context paramContext, boolean paramBoolean) {
    File file1;
    String str2;
    try {
      str1 = Environment.getExternalStorageState();
    } catch (NullPointerException nullPointerException) {
      str1 = "";
    } 
    if (paramBoolean && "mounted".equals(str1)) {
      str2 = (String)b(paramContext);
    } else {
      str2 = null;
    } 
    String str1 = str2;
    if (str2 == null)
      file1 = paramContext.getCacheDir(); 
    File file2 = file1;
    if (file1 == null) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("/data/data/");
      stringBuilder.append(paramContext.getPackageName());
      stringBuilder.append("/cache/");
      String str = stringBuilder.toString();
      b b1 = a;
      stringBuilder = new StringBuilder();
      stringBuilder.append("Can't define system cache directory! '");
      stringBuilder.append(str);
      stringBuilder.append("%s' will be used.");
      b1.warn(stringBuilder.toString());
      file2 = new File(str);
    } 
    return file2;
  }
  
  private static File b(Context paramContext) {
    File file = new File(new File(new File(new File(Environment.getExternalStorageDirectory(), "Android"), "data"), paramContext.getPackageName()), "cache");
    if (!file.exists() && !file.mkdirs()) {
      a.warn("Unable to create external cache directory");
      return null;
    } 
    return file;
  }
  
  public static File c(Context paramContext) {
    return new File(a(paramContext, true), "video-cache");
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/danikula/videocache/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */