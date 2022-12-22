package c.a.a;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

public class a {
  private static final String a = "a";
  
  public static void a(Context paramContext, String paramString1, File paramFile, String paramString2) {
    b(paramFile, paramContext.getAssets().open(paramString1), paramString2);
  }
  
  private static void b(File paramFile, InputStream paramInputStream, String paramString) {
    String str = paramFile.getAbsolutePath();
    FileOutputStream fileOutputStream = new FileOutputStream(paramFile);
    byte[] arrayOfByte = new byte[1024];
    while (true) {
      int i = paramInputStream.read(arrayOfByte);
      if (i > 0) {
        fileOutputStream.write(arrayOfByte, 0, i);
        continue;
      } 
      fileOutputStream.close();
      paramInputStream.close();
      Runtime runtime = Runtime.getRuntime();
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("chmod ");
      stringBuilder.append(paramString);
      stringBuilder.append(" ");
      stringBuilder.append(str);
      runtime.exec(stringBuilder.toString()).waitFor();
      return;
    } 
  }
  
  public static boolean c(Context paramContext, String paramString1, String paramString2) {
    String str1 = Build.CPU_ABI;
    String str2 = "armeabi-v7a";
    if (!str1.startsWith("armeabi-v7a"))
      if (str1.startsWith("x86")) {
        str2 = "x86";
      } else {
        str2 = "armeabi";
      }  
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(str2);
    stringBuilder.append(File.separator);
    stringBuilder.append(paramString2);
    str2 = stringBuilder.toString();
    try {
      File file = new File();
      this(paramContext.getDir(paramString1, 0), paramString2);
      if (file.exists()) {
        Log.d(a, "binary has existed");
        return false;
      } 
      a(paramContext, str2, file, "0755");
      return true;
    } catch (Exception exception) {
      paramString2 = a;
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("installBinary failed: ");
      stringBuilder1.append(exception.getMessage());
      Log.e(paramString2, stringBuilder1.toString());
      return false;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/c/a/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */