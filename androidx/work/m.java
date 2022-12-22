package androidx.work;

import android.content.Context;

public abstract class m {
  private static final String a = f.f("WorkerFactory");
  
  public static m c() {
    return new a();
  }
  
  public abstract ListenableWorker a(Context paramContext, String paramString, WorkerParameters paramWorkerParameters);
  
  public final ListenableWorker b(Context paramContext, String paramString, WorkerParameters paramWorkerParameters) {
    ListenableWorker listenableWorker = a(paramContext, paramString, paramWorkerParameters);
    if (listenableWorker != null)
      return listenableWorker; 
    try {
      Class<? extends ListenableWorker> clazz = Class.forName(paramString).asSubclass(ListenableWorker.class);
      try {
        return clazz.getDeclaredConstructor(new Class[] { Context.class, WorkerParameters.class }).newInstance(new Object[] { paramContext, paramWorkerParameters });
      } catch (Exception exception) {
        f f = f.c();
        String str = a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Could not instantiate ");
        stringBuilder.append(paramString);
        f.b(str, stringBuilder.toString(), new Throwable[] { exception });
        return null;
      } 
    } catch (ClassNotFoundException classNotFoundException) {
      f f = f.c();
      String str = a;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Class not found: ");
      stringBuilder.append(paramString);
      f.b(str, stringBuilder.toString(), new Throwable[0]);
      return null;
    } 
  }
  
  static final class a extends m {
    public ListenableWorker a(Context param1Context, String param1String, WorkerParameters param1WorkerParameters) {
      return null;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */