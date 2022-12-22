package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class CombineContinuationsWorker extends Worker {
  public CombineContinuationsWorker(Context paramContext, WorkerParameters paramWorkerParameters) {
    super(paramContext, paramWorkerParameters);
  }
  
  public ListenableWorker.a doWork() {
    return ListenableWorker.a.d(getInputData());
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/impl/workers/CombineContinuationsWorker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */