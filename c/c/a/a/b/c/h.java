package c.c.a.a.b.c;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class h {
  static final Logger a = Logger.getLogger(h.class.getName());
  
  public static void a(InputStream paramInputStream) {
    if (paramInputStream == null)
      return; 
    try {
      paramInputStream.close();
      return;
    } catch (IOException iOException) {
      try {
        a.logp(Level.WARNING, "com.google.common.io.Closeables", "close", "IOException thrown while closing Closeable.", iOException);
        return;
      } catch (IOException iOException1) {
        throw new AssertionError(iOException1);
      } 
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/c/c/a/a/b/c/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */