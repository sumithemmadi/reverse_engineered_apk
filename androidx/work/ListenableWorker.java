package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.Keep;
import androidx.work.impl.utils.j.a;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

public abstract class ListenableWorker {
  private Context b;
  
  private WorkerParameters c;
  
  private volatile boolean d;
  
  private boolean e;
  
  @SuppressLint({"BanKeepAnnotation"})
  @Keep
  public ListenableWorker(Context paramContext, WorkerParameters paramWorkerParameters) {
    if (paramContext != null) {
      if (paramWorkerParameters != null) {
        this.b = paramContext;
        this.c = paramWorkerParameters;
        return;
      } 
      throw new IllegalArgumentException("WorkerParameters is null");
    } 
    throw new IllegalArgumentException("Application Context is null");
  }
  
  public final Context getApplicationContext() {
    return this.b;
  }
  
  public Executor getBackgroundExecutor() {
    return this.c.a();
  }
  
  public final UUID getId() {
    return this.c.b();
  }
  
  public final d getInputData() {
    return this.c.c();
  }
  
  public final Network getNetwork() {
    return this.c.d();
  }
  
  public final int getRunAttemptCount() {
    return this.c.e();
  }
  
  public final Set<String> getTags() {
    return this.c.f();
  }
  
  public a getTaskExecutor() {
    return this.c.g();
  }
  
  public final List<String> getTriggeredContentAuthorities() {
    return this.c.h();
  }
  
  public final List<Uri> getTriggeredContentUris() {
    return this.c.i();
  }
  
  public m getWorkerFactory() {
    return this.c.j();
  }
  
  public final boolean isStopped() {
    return this.d;
  }
  
  public final boolean isUsed() {
    return this.e;
  }
  
  public void onStopped() {}
  
  public final void setUsed() {
    this.e = true;
  }
  
  public abstract com.google.common.util.concurrent.a<a> startWork();
  
  public final void stop() {
    this.d = true;
    onStopped();
  }
  
  public static abstract class a {
    public static a a() {
      return new a();
    }
    
    public static a b() {
      return new b();
    }
    
    public static a c() {
      return new c();
    }
    
    public static a d(d param1d) {
      return new c(param1d);
    }
    
    public static final class a extends a {
      private final d a;
      
      public a() {
        this(d.b);
      }
      
      public a(d param2d) {
        this.a = param2d;
      }
      
      public d e() {
        return this.a;
      }
      
      public boolean equals(Object param2Object) {
        if (this == param2Object)
          return true; 
        if (param2Object == null || a.class != param2Object.getClass())
          return false; 
        param2Object = param2Object;
        return this.a.equals(((a)param2Object).a);
      }
      
      public int hashCode() {
        return a.class.getName().hashCode() * 31 + this.a.hashCode();
      }
      
      public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Failure {mOutputData=");
        stringBuilder.append(this.a);
        stringBuilder.append('}');
        return stringBuilder.toString();
      }
    }
    
    public static final class b extends a {
      public boolean equals(Object param2Object) {
        boolean bool = true;
        if (this == param2Object)
          return true; 
        if (param2Object == null || b.class != param2Object.getClass())
          bool = false; 
        return bool;
      }
      
      public int hashCode() {
        return b.class.getName().hashCode();
      }
      
      public String toString() {
        return "Retry";
      }
    }
    
    public static final class c extends a {
      private final d a;
      
      public c() {
        this(d.b);
      }
      
      public c(d param2d) {
        this.a = param2d;
      }
      
      public d e() {
        return this.a;
      }
      
      public boolean equals(Object param2Object) {
        if (this == param2Object)
          return true; 
        if (param2Object == null || c.class != param2Object.getClass())
          return false; 
        param2Object = param2Object;
        return this.a.equals(((c)param2Object).a);
      }
      
      public int hashCode() {
        return c.class.getName().hashCode() * 31 + this.a.hashCode();
      }
      
      public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Success {mOutputData=");
        stringBuilder.append(this.a);
        stringBuilder.append('}');
        return stringBuilder.toString();
      }
    }
  }
  
  public static final class a extends a {
    private final d a;
    
    public a() {
      this(d.b);
    }
    
    public a(d param1d) {
      this.a = param1d;
    }
    
    public d e() {
      return this.a;
    }
    
    public boolean equals(Object param1Object) {
      if (this == param1Object)
        return true; 
      if (param1Object == null || a.class != param1Object.getClass())
        return false; 
      param1Object = param1Object;
      return this.a.equals(((a)param1Object).a);
    }
    
    public int hashCode() {
      return a.class.getName().hashCode() * 31 + this.a.hashCode();
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Failure {mOutputData=");
      stringBuilder.append(this.a);
      stringBuilder.append('}');
      return stringBuilder.toString();
    }
  }
  
  public static final class b extends a {
    public boolean equals(Object param1Object) {
      boolean bool = true;
      if (this == param1Object)
        return true; 
      if (param1Object == null || b.class != param1Object.getClass())
        bool = false; 
      return bool;
    }
    
    public int hashCode() {
      return b.class.getName().hashCode();
    }
    
    public String toString() {
      return "Retry";
    }
  }
  
  public static final class c extends a {
    private final d a;
    
    public c() {
      this(d.b);
    }
    
    public c(d param1d) {
      this.a = param1d;
    }
    
    public d e() {
      return this.a;
    }
    
    public boolean equals(Object param1Object) {
      if (this == param1Object)
        return true; 
      if (param1Object == null || c.class != param1Object.getClass())
        return false; 
      param1Object = param1Object;
      return this.a.equals(((c)param1Object).a);
    }
    
    public int hashCode() {
      return c.class.getName().hashCode() * 31 + this.a.hashCode();
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Success {mOutputData=");
      stringBuilder.append(this.a);
      stringBuilder.append('}');
      return stringBuilder.toString();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/ListenableWorker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */