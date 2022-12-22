package c.a.a;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.IOException;

public class b {
  private static final String a = "b";
  
  public static void b(Context paramContext, Class<?> paramClass, int paramInt) {
    (new Thread(new a(paramContext, paramClass, paramInt))).start();
  }
  
  private static void c(Context paramContext, Class<?> paramClass, int paramInt) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramContext.getDir("bin", 0).getAbsolutePath());
    stringBuilder.append(File.separator);
    stringBuilder.append("daemon");
    String str = stringBuilder.toString();
    stringBuilder = new StringBuilder();
    stringBuilder.append(str);
    stringBuilder.append(" -p ");
    stringBuilder.append(paramContext.getPackageName());
    stringBuilder.append(" -s ");
    stringBuilder.append(paramClass.getName());
    stringBuilder.append(" -t ");
    stringBuilder.append(paramInt);
    try {
      Runtime.getRuntime().exec(stringBuilder.toString()).waitFor();
    } catch (IOException iOException) {
      String str1 = a;
      stringBuilder = new StringBuilder();
      stringBuilder.append("start daemon error: ");
      stringBuilder.append(iOException.getMessage());
      Log.e(str1, stringBuilder.toString());
    } catch (InterruptedException interruptedException) {}
  }
  
  static final class a implements Runnable {
    a(Context param1Context, Class param1Class, int param1Int) {}
    
    public void run() {
      a.c(this.b, "bin", "daemon");
      b.a(this.b, this.c, this.d);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/c/a/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */