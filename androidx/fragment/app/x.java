package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

final class x extends Writer {
  private final String b;
  
  private StringBuilder c = new StringBuilder(128);
  
  x(String paramString) {
    this.b = paramString;
  }
  
  private void b() {
    if (this.c.length() > 0) {
      Log.d(this.b, this.c.toString());
      StringBuilder stringBuilder = this.c;
      stringBuilder.delete(0, stringBuilder.length());
    } 
  }
  
  public void close() {
    b();
  }
  
  public void flush() {
    b();
  }
  
  public void write(char[] paramArrayOfchar, int paramInt1, int paramInt2) {
    for (byte b = 0; b < paramInt2; b++) {
      char c = paramArrayOfchar[paramInt1 + b];
      if (c == '\n') {
        b();
      } else {
        this.c.append(c);
      } 
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/fragment/app/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */