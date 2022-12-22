package androidx.work;

import android.net.Network;
import android.net.Uri;
import androidx.work.impl.utils.j.a;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

public final class WorkerParameters {
  private UUID a;
  
  private d b;
  
  private Set<String> c;
  
  private a d;
  
  private int e;
  
  private Executor f;
  
  private a g;
  
  private m h;
  
  public WorkerParameters(UUID paramUUID, d paramd, Collection<String> paramCollection, a parama, int paramInt, Executor paramExecutor, a parama1, m paramm) {
    this.a = paramUUID;
    this.b = paramd;
    this.c = new HashSet<String>(paramCollection);
    this.d = parama;
    this.e = paramInt;
    this.f = paramExecutor;
    this.g = parama1;
    this.h = paramm;
  }
  
  public Executor a() {
    return this.f;
  }
  
  public UUID b() {
    return this.a;
  }
  
  public d c() {
    return this.b;
  }
  
  public Network d() {
    return this.d.c;
  }
  
  public int e() {
    return this.e;
  }
  
  public Set<String> f() {
    return this.c;
  }
  
  public a g() {
    return this.g;
  }
  
  public List<String> h() {
    return this.d.a;
  }
  
  public List<Uri> i() {
    return this.d.b;
  }
  
  public m j() {
    return this.h;
  }
  
  public static class a {
    public List<String> a = Collections.emptyList();
    
    public List<Uri> b = Collections.emptyList();
    
    public Network c;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/WorkerParameters.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */