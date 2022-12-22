package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.e.a;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.f;
import androidx.lifecycle.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public abstract class c {
  private Random a = new Random();
  
  private final Map<Integer, String> b = new HashMap<Integer, String>();
  
  private final Map<String, Integer> c = new HashMap<String, Integer>();
  
  private final Map<String, c> d = new HashMap<String, c>();
  
  ArrayList<String> e = new ArrayList<String>();
  
  final transient Map<String, b<?>> f = new HashMap<String, b<?>>();
  
  final Map<String, Object> g = new HashMap<String, Object>();
  
  final Bundle h = new Bundle();
  
  private void a(int paramInt, String paramString) {
    this.b.put(Integer.valueOf(paramInt), paramString);
    this.c.put(paramString, Integer.valueOf(paramInt));
  }
  
  private <O> void d(String paramString, int paramInt, Intent paramIntent, b<O> paramb) {
    if (paramb != null) {
      a<O> a = paramb.a;
      if (a != null) {
        a.a((O)paramb.b.c(paramInt, paramIntent));
        return;
      } 
    } 
    this.g.remove(paramString);
    this.h.putParcelable(paramString, new ActivityResult(paramInt, paramIntent));
  }
  
  private int e() {
    int i = this.a.nextInt(2147418112);
    while (true) {
      i += 65536;
      if (this.b.containsKey(Integer.valueOf(i))) {
        i = this.a.nextInt(2147418112);
        continue;
      } 
      return i;
    } 
  }
  
  private int j(String paramString) {
    Integer integer = this.c.get(paramString);
    if (integer != null)
      return integer.intValue(); 
    int i = e();
    a(i, paramString);
    return i;
  }
  
  public final boolean b(int paramInt1, int paramInt2, Intent paramIntent) {
    String str = this.b.get(Integer.valueOf(paramInt1));
    if (str == null)
      return false; 
    this.e.remove(str);
    d(str, paramInt2, paramIntent, this.f.get(str));
    return true;
  }
  
  public final <O> boolean c(int paramInt, @SuppressLint({"UnknownNullness"}) O paramO) {
    String str = this.b.get(Integer.valueOf(paramInt));
    if (str == null)
      return false; 
    this.e.remove(str);
    b b = this.f.get(str);
    if (b != null) {
      a<O> a = b.a;
      if (a == null) {
        this.h.remove(str);
        this.g.put(str, paramO);
        return true;
      } 
      a.a(paramO);
      return true;
    } 
    this.h.remove(str);
    this.g.put(str, paramO);
    return true;
  }
  
  public abstract <I, O> void f(int paramInt, a<I, O> parama, @SuppressLint({"UnknownNullness"}) I paramI, androidx.core.app.c paramc);
  
  public final void g(Bundle paramBundle) {
    if (paramBundle == null)
      return; 
    ArrayList<Integer> arrayList = paramBundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
    ArrayList<String> arrayList1 = paramBundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
    if (arrayList1 != null && arrayList != null) {
      int i = arrayList1.size();
      for (byte b = 0; b < i; b++)
        a(((Integer)arrayList.get(b)).intValue(), arrayList1.get(b)); 
      this.e = paramBundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
      this.a = (Random)paramBundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
      this.h.putAll(paramBundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
    } 
  }
  
  public final void h(Bundle paramBundle) {
    paramBundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(this.b.keySet()));
    paramBundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(this.b.values()));
    paramBundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<String>(this.e));
    paramBundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle)this.h.clone());
    paramBundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", this.a);
  }
  
  public final <I, O> b<I> i(String paramString, a<I, O> parama, a<O> parama1) {
    int i = j(paramString);
    this.f.put(paramString, new b(parama1, parama));
    if (this.g.containsKey(paramString)) {
      Object object = this.g.get(paramString);
      this.g.remove(paramString);
      parama1.a((O)object);
    } 
    ActivityResult activityResult = (ActivityResult)this.h.getParcelable(paramString);
    if (activityResult != null) {
      this.h.remove(paramString);
      parama1.a((O)parama.c(activityResult.b(), activityResult.a()));
    } 
    return new a(this, paramString, i, parama);
  }
  
  final void k(String paramString) {
    if (!this.e.contains(paramString)) {
      Integer integer = this.c.remove(paramString);
      if (integer != null)
        this.b.remove(integer); 
    } 
    this.f.remove(paramString);
    if (this.g.containsKey(paramString)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Dropping pending result for request ");
      stringBuilder.append(paramString);
      stringBuilder.append(": ");
      stringBuilder.append(this.g.get(paramString));
      Log.w("ActivityResultRegistry", stringBuilder.toString());
      this.g.remove(paramString);
    } 
    if (this.h.containsKey(paramString)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Dropping pending result for request ");
      stringBuilder.append(paramString);
      stringBuilder.append(": ");
      stringBuilder.append(this.h.getParcelable(paramString));
      Log.w("ActivityResultRegistry", stringBuilder.toString());
      this.h.remove(paramString);
    } 
    c c1 = this.d.get(paramString);
    if (c1 != null) {
      c1.a();
      this.d.remove(paramString);
    } 
  }
  
  class a extends b<I> {
    a(c this$0, String param1String, int param1Int, a param1a) {}
    
    public void b(I param1I, androidx.core.app.c param1c) {
      this.d.e.add(this.a);
      this.d.f(this.b, this.c, param1I, param1c);
    }
    
    public void c() {
      this.d.k(this.a);
    }
  }
  
  private static class b<O> {
    final a<O> a;
    
    final a<?, O> b;
    
    b(a<O> param1a, a<?, O> param1a1) {
      this.a = param1a;
      this.b = param1a1;
    }
  }
  
  private static class c {
    final Lifecycle a;
    
    private final ArrayList<f> b;
    
    void a() {
      for (f f : this.b)
        this.a.c((g)f); 
      this.b.clear();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/activity/result/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */