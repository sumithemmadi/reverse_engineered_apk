package androidx.work.impl.utils;

import androidx.work.WorkerParameters;
import androidx.work.impl.h;

public class g implements Runnable {
  private h b;
  
  private String c;
  
  private WorkerParameters.a d;
  
  public g(h paramh, String paramString, WorkerParameters.a parama) {
    this.b = paramh;
    this.c = paramString;
    this.d = parama;
  }
  
  public void run() {
    this.b.l().g(this.c, this.d);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/impl/utils/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */