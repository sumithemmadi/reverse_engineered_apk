package b.o.a;

import android.os.Bundle;
import androidx.lifecycle.h;
import androidx.lifecycle.u;
import androidx.loader.content.b;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class a {
  public static <T extends h & u> a b(T paramT) {
    return new b((h)paramT, ((u)paramT).h());
  }
  
  @Deprecated
  public abstract void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString);
  
  public abstract <D> b<D> c(int paramInt, Bundle paramBundle, a<D> parama);
  
  public abstract void d();
  
  public static interface a<D> {
    void a(b<D> param1b, D param1D);
    
    b<D> b(int param1Int, Bundle param1Bundle);
    
    void c(b<D> param1b);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/o/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */