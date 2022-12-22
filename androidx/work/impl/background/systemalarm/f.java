package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.d;
import androidx.work.impl.l.j;

public class f implements d {
  private static final String b = androidx.work.f.f("SystemAlarmScheduler");
  
  private final Context c;
  
  public f(Context paramContext) {
    this.c = paramContext.getApplicationContext();
  }
  
  private void b(j paramj) {
    androidx.work.f.c().a(b, String.format("Scheduling work with workSpecId %s", new Object[] { paramj.c }), new Throwable[0]);
    Intent intent = b.f(this.c, paramj.c);
    this.c.startService(intent);
  }
  
  public void a(j... paramVarArgs) {
    int i = paramVarArgs.length;
    for (byte b = 0; b < i; b++)
      b(paramVarArgs[b]); 
  }
  
  public void d(String paramString) {
    Intent intent = b.g(this.c, paramString);
    this.c.startService(intent);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/impl/background/systemalarm/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */