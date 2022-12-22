package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import androidx.work.f;
import androidx.work.impl.a;
import androidx.work.impl.h;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SystemJobService extends JobService implements a {
  private static final String b = f.f("SystemJobService");
  
  private h c;
  
  private final Map<String, JobParameters> d = new HashMap<String, JobParameters>();
  
  public void c(String paramString, boolean paramBoolean) {
    f.c().a(b, String.format("%s executed on JobScheduler", new Object[] { paramString }), new Throwable[0]);
    synchronized (this.d) {
      JobParameters jobParameters = this.d.remove(paramString);
      if (jobParameters != null)
        jobFinished(jobParameters, paramBoolean); 
      return;
    } 
  }
  
  public void onCreate() {
    super.onCreate();
    try {
      h h1 = h.j(getApplicationContext());
      this.c = h1;
      h1.l().a(this);
    } catch (IllegalStateException illegalStateException) {
      if (Application.class.equals(getApplication().getClass())) {
        f.c().h(b, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
        return;
      } 
    } 
  }
  
  public void onDestroy() {
    super.onDestroy();
    h h1 = this.c;
    if (h1 != null)
      h1.l().e(this); 
  }
  
  public boolean onStartJob(JobParameters paramJobParameters) {
    Map<String, JobParameters> map;
    WorkerParameters.a a1;
    if (this.c == null) {
      f.c().a(b, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
      jobFinished(paramJobParameters, true);
      return false;
    } 
    PersistableBundle persistableBundle = paramJobParameters.getExtras();
    if (persistableBundle == null) {
      f.c().b(b, "No extras in JobParameters.", new Throwable[0]);
      return false;
    } 
    String str = persistableBundle.getString("EXTRA_WORK_SPEC_ID");
    if (TextUtils.isEmpty(str)) {
      f.c().b(b, "WorkSpec id not found!", new Throwable[0]);
      return false;
    } 
    synchronized (this.d) {
      if (this.d.containsKey(str)) {
        f.c().a(b, String.format("Job is already being executed by SystemJobService: %s", new Object[] { str }), new Throwable[0]);
        return false;
      } 
      f.c().a(b, String.format("onStartJob for %s", new Object[] { str }), new Throwable[0]);
      this.d.put(str, paramJobParameters);
      map = null;
      int i = Build.VERSION.SDK_INT;
      if (i >= 24) {
        WorkerParameters.a a2 = new WorkerParameters.a();
        if (paramJobParameters.getTriggeredContentUris() != null)
          a2.b = Arrays.asList(paramJobParameters.getTriggeredContentUris()); 
        if (paramJobParameters.getTriggeredContentAuthorities() != null)
          a2.a = Arrays.asList(paramJobParameters.getTriggeredContentAuthorities()); 
        a1 = a2;
        if (i >= 28) {
          a2.c = paramJobParameters.getNetwork();
          a1 = a2;
        } 
      } 
      this.c.u(str, a1);
      return true;
    } 
  }
  
  public boolean onStopJob(JobParameters paramJobParameters) {
    if (this.c == null) {
      f.c().a(b, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
      return true;
    } 
    PersistableBundle persistableBundle = paramJobParameters.getExtras();
    if (persistableBundle == null) {
      f.c().b(b, "No extras in JobParameters.", new Throwable[0]);
      return false;
    } 
    null = persistableBundle.getString("EXTRA_WORK_SPEC_ID");
    if (TextUtils.isEmpty(null)) {
      f.c().b(b, "WorkSpec id not found!", new Throwable[0]);
      return false;
    } 
    f.c().a(b, String.format("onStopJob for %s", new Object[] { null }), new Throwable[0]);
    synchronized (this.d) {
      this.d.remove(null);
      this.c.v(null);
      return this.c.l().b(null) ^ true;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/impl/background/systemjob/SystemJobService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */