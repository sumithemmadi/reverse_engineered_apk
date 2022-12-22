package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import com.google.android.datatransport.Priority;
import com.google.auto.value.AutoValue;
import com.google.auto.value.AutoValue.Builder;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@AutoValue
public abstract class SchedulerConfig {
  private long a(int paramInt, long paramLong) {
    long l;
    paramInt--;
    if (paramLong > 1L) {
      l = paramLong;
    } else {
      l = 2L;
    } 
    double d1 = Math.max(1.0D, Math.log(10000.0D) / Math.log((l * paramInt)));
    double d2 = Math.pow(3.0D, paramInt);
    double d3 = paramLong;
    Double.isNaN(d3);
    return (long)(d2 * d3 * d1);
  }
  
  public static a b() {
    return new a();
  }
  
  static SchedulerConfig d(com.google.android.datatransport.h.y.a parama, Map<Priority, b> paramMap) {
    return new c(parama, paramMap);
  }
  
  public static SchedulerConfig f(com.google.android.datatransport.h.y.a parama) {
    return b().a(Priority.b, b.a().b(30000L).d(86400000L).a()).a(Priority.d, b.a().b(1000L).d(86400000L).a()).a(Priority.c, b.a().b(86400000L).d(86400000L).c(i(new Flag[] { Flag.b, Flag.c })).a()).c(parama).b();
  }
  
  private static <T> Set<T> i(T... paramVarArgs) {
    return Collections.unmodifiableSet(new HashSet<T>(Arrays.asList(paramVarArgs)));
  }
  
  private void j(JobInfo.Builder paramBuilder, Set<Flag> paramSet) {
    if (paramSet.contains(Flag.b)) {
      paramBuilder.setRequiredNetworkType(2);
    } else {
      paramBuilder.setRequiredNetworkType(1);
    } 
    if (paramSet.contains(Flag.d))
      paramBuilder.setRequiresCharging(true); 
    if (paramSet.contains(Flag.c))
      paramBuilder.setRequiresDeviceIdle(true); 
  }
  
  public JobInfo.Builder c(JobInfo.Builder paramBuilder, Priority paramPriority, long paramLong, int paramInt) {
    paramBuilder.setMinimumLatency(g(paramPriority, paramLong, paramInt));
    j(paramBuilder, ((b)h().get(paramPriority)).c());
    return paramBuilder;
  }
  
  abstract com.google.android.datatransport.h.y.a e();
  
  public long g(Priority paramPriority, long paramLong, int paramInt) {
    long l = e().a();
    b b = h().get(paramPriority);
    return Math.min(Math.max(a(paramInt, b.b()), paramLong - l), b.d());
  }
  
  abstract Map<Priority, b> h();
  
  public enum Flag {
    b, c, d;
    
    static {
      Flag flag1 = new Flag("NETWORK_UNMETERED", 0);
      b = flag1;
      Flag flag2 = new Flag("DEVICE_IDLE", 1);
      c = flag2;
      Flag flag3 = new Flag("DEVICE_CHARGING", 2);
      d = flag3;
      e = new Flag[] { flag1, flag2, flag3 };
    }
  }
  
  public static class a {
    private com.google.android.datatransport.h.y.a a;
    
    private Map<Priority, SchedulerConfig.b> b = new HashMap<Priority, SchedulerConfig.b>();
    
    public a a(Priority param1Priority, SchedulerConfig.b param1b) {
      this.b.put(param1Priority, param1b);
      return this;
    }
    
    public SchedulerConfig b() {
      if (this.a != null) {
        if (this.b.keySet().size() >= (Priority.values()).length) {
          Map<Priority, SchedulerConfig.b> map = this.b;
          this.b = new HashMap<Priority, SchedulerConfig.b>();
          return SchedulerConfig.d(this.a, map);
        } 
        throw new IllegalStateException("Not all priorities have been configured");
      } 
      throw new NullPointerException("missing required property: clock");
    }
    
    public a c(com.google.android.datatransport.h.y.a param1a) {
      this.a = param1a;
      return this;
    }
  }
  
  @AutoValue
  public static abstract class b {
    public static a a() {
      return (new d.b()).c(Collections.emptySet());
    }
    
    abstract long b();
    
    abstract Set<SchedulerConfig.Flag> c();
    
    abstract long d();
    
    @Builder
    public static abstract class a {
      public abstract SchedulerConfig.b a();
      
      public abstract a b(long param2Long);
      
      public abstract a c(Set<SchedulerConfig.Flag> param2Set);
      
      public abstract a d(long param2Long);
    }
  }
  
  @Builder
  public static abstract class a {
    public abstract SchedulerConfig.b a();
    
    public abstract a b(long param1Long);
    
    public abstract a c(Set<SchedulerConfig.Flag> param1Set);
    
    public abstract a d(long param1Long);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/runtime/scheduling/jobscheduling/SchedulerConfig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */