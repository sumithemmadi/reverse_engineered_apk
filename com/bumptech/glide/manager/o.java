package com.bumptech.glide.manager;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.bumptech.glide.f;
import com.bumptech.glide.i;
import com.bumptech.glide.load.resource.bitmap.q;
import com.bumptech.glide.p.k;
import java.util.HashMap;
import java.util.Map;

public class o implements Handler.Callback {
  private static final b b = new a();
  
  private volatile i c;
  
  final Map<FragmentManager, RequestManagerFragment> d = new HashMap<FragmentManager, RequestManagerFragment>();
  
  final Map<FragmentManager, r> e = new HashMap<FragmentManager, r>();
  
  private final Handler f;
  
  private final b g;
  
  private final b.e.a<View, Fragment> h = new b.e.a();
  
  private final b.e.a<View, Fragment> i = new b.e.a();
  
  private final Bundle j = new Bundle();
  
  private final k k;
  
  public o(b paramb, f paramf) {
    if (paramb == null)
      paramb = b; 
    this.g = paramb;
    this.f = new Handler(Looper.getMainLooper(), this);
    this.k = b(paramf);
  }
  
  @TargetApi(17)
  private static void a(Activity paramActivity) {
    if (Build.VERSION.SDK_INT < 17 || !paramActivity.isDestroyed())
      return; 
    throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
  }
  
  private static k b(f paramf) {
    j j;
    if (!q.b || !q.a)
      return new g(); 
    if (paramf.a(d.d.class)) {
      i i1 = new i();
    } else {
      j = new j();
    } 
    return j;
  }
  
  private static Activity c(Context paramContext) {
    return (paramContext instanceof Activity) ? (Activity)paramContext : ((paramContext instanceof ContextWrapper) ? c(((ContextWrapper)paramContext).getBaseContext()) : null);
  }
  
  @Deprecated
  private i d(Context paramContext, FragmentManager paramFragmentManager, Fragment paramFragment, boolean paramBoolean) {
    RequestManagerFragment requestManagerFragment = j(paramFragmentManager, paramFragment);
    i i2 = requestManagerFragment.e();
    i i1 = i2;
    if (i2 == null) {
      c c = c.c(paramContext);
      i1 = this.g.a(c, requestManagerFragment.c(), requestManagerFragment.f(), paramContext);
      if (paramBoolean)
        i1.onStart(); 
      requestManagerFragment.k(i1);
    } 
    return i1;
  }
  
  private i h(Context paramContext) {
    // Byte code:
    //   0: aload_0
    //   1: getfield c : Lcom/bumptech/glide/i;
    //   4: ifnonnull -> 78
    //   7: aload_0
    //   8: monitorenter
    //   9: aload_0
    //   10: getfield c : Lcom/bumptech/glide/i;
    //   13: ifnonnull -> 68
    //   16: aload_1
    //   17: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   20: invokestatic c : (Landroid/content/Context;)Lcom/bumptech/glide/c;
    //   23: astore_2
    //   24: aload_0
    //   25: getfield g : Lcom/bumptech/glide/manager/o$b;
    //   28: astore_3
    //   29: new com/bumptech/glide/manager/b
    //   32: astore #4
    //   34: aload #4
    //   36: invokespecial <init> : ()V
    //   39: new com/bumptech/glide/manager/h
    //   42: astore #5
    //   44: aload #5
    //   46: invokespecial <init> : ()V
    //   49: aload_0
    //   50: aload_3
    //   51: aload_2
    //   52: aload #4
    //   54: aload #5
    //   56: aload_1
    //   57: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   60: invokeinterface a : (Lcom/bumptech/glide/c;Lcom/bumptech/glide/manager/l;Lcom/bumptech/glide/manager/p;Landroid/content/Context;)Lcom/bumptech/glide/i;
    //   65: putfield c : Lcom/bumptech/glide/i;
    //   68: aload_0
    //   69: monitorexit
    //   70: goto -> 78
    //   73: astore_1
    //   74: aload_0
    //   75: monitorexit
    //   76: aload_1
    //   77: athrow
    //   78: aload_0
    //   79: getfield c : Lcom/bumptech/glide/i;
    //   82: areturn
    // Exception table:
    //   from	to	target	type
    //   9	68	73	finally
    //   68	70	73	finally
    //   74	76	73	finally
  }
  
  private RequestManagerFragment j(FragmentManager paramFragmentManager, Fragment paramFragment) {
    RequestManagerFragment requestManagerFragment1 = (RequestManagerFragment)paramFragmentManager.findFragmentByTag("com.bumptech.glide.manager");
    RequestManagerFragment requestManagerFragment2 = requestManagerFragment1;
    if (requestManagerFragment1 == null) {
      requestManagerFragment1 = this.d.get(paramFragmentManager);
      requestManagerFragment2 = requestManagerFragment1;
      if (requestManagerFragment1 == null) {
        requestManagerFragment2 = new RequestManagerFragment();
        requestManagerFragment2.j(paramFragment);
        this.d.put(paramFragmentManager, requestManagerFragment2);
        paramFragmentManager.beginTransaction().add(requestManagerFragment2, "com.bumptech.glide.manager").commitAllowingStateLoss();
        this.f.obtainMessage(1, paramFragmentManager).sendToTarget();
      } 
    } 
    return requestManagerFragment2;
  }
  
  private r l(FragmentManager paramFragmentManager, Fragment paramFragment) {
    r r1 = (r)paramFragmentManager.i0("com.bumptech.glide.manager");
    r r2 = r1;
    if (r1 == null) {
      r1 = this.e.get(paramFragmentManager);
      r2 = r1;
      if (r1 == null) {
        r2 = new r();
        r2.a2(paramFragment);
        this.e.put(paramFragmentManager, r2);
        paramFragmentManager.l().e(r2, "com.bumptech.glide.manager").i();
        this.f.obtainMessage(2, paramFragmentManager).sendToTarget();
      } 
    } 
    return r2;
  }
  
  private static boolean m(Context paramContext) {
    Activity activity = c(paramContext);
    return (activity == null || !activity.isFinishing());
  }
  
  private i n(Context paramContext, FragmentManager paramFragmentManager, Fragment paramFragment, boolean paramBoolean) {
    r r = l(paramFragmentManager, paramFragment);
    i i2 = r.U1();
    i i1 = i2;
    if (i2 == null) {
      c c = c.c(paramContext);
      i1 = this.g.a(c, r.S1(), r.V1(), paramContext);
      if (paramBoolean)
        i1.onStart(); 
      r.b2(i1);
    } 
    return i1;
  }
  
  public i e(Activity paramActivity) {
    if (k.p())
      return f(paramActivity.getApplicationContext()); 
    if (paramActivity instanceof FragmentActivity)
      return g((FragmentActivity)paramActivity); 
    a(paramActivity);
    this.k.a(paramActivity);
    return d((Context)paramActivity, paramActivity.getFragmentManager(), null, m((Context)paramActivity));
  }
  
  public i f(Context paramContext) {
    if (paramContext != null) {
      if (k.q() && !(paramContext instanceof android.app.Application)) {
        if (paramContext instanceof FragmentActivity)
          return g((FragmentActivity)paramContext); 
        if (paramContext instanceof Activity)
          return e((Activity)paramContext); 
        if (paramContext instanceof ContextWrapper) {
          ContextWrapper contextWrapper = (ContextWrapper)paramContext;
          if (contextWrapper.getBaseContext().getApplicationContext() != null)
            return f(contextWrapper.getBaseContext()); 
        } 
      } 
      return h(paramContext);
    } 
    throw new IllegalArgumentException("You cannot start a load on a null Context");
  }
  
  public i g(FragmentActivity paramFragmentActivity) {
    if (k.p())
      return f(paramFragmentActivity.getApplicationContext()); 
    a((Activity)paramFragmentActivity);
    this.k.a((Activity)paramFragmentActivity);
    return n((Context)paramFragmentActivity, paramFragmentActivity.s(), null, m((Context)paramFragmentActivity));
  }
  
  public boolean handleMessage(Message paramMessage) {
    FragmentManager fragmentManager1;
    FragmentManager fragmentManager;
    int j = paramMessage.what;
    StringBuilder stringBuilder = null;
    boolean bool = true;
    if (j != 1) {
      if (j != 2) {
        bool = false;
        paramMessage = null;
      } else {
        fragmentManager1 = (FragmentManager)paramMessage.obj;
        stringBuilder = (StringBuilder)this.e.remove(fragmentManager1);
      } 
    } else {
      fragmentManager = (FragmentManager)((Message)fragmentManager1).obj;
      stringBuilder = (StringBuilder)this.d.remove(fragmentManager);
    } 
    if (bool && stringBuilder == null && Log.isLoggable("RMRetriever", 5)) {
      stringBuilder = new StringBuilder();
      stringBuilder.append("Failed to remove expected request manager fragment, manager: ");
      stringBuilder.append(fragmentManager);
      Log.w("RMRetriever", stringBuilder.toString());
    } 
    return bool;
  }
  
  @Deprecated
  RequestManagerFragment i(Activity paramActivity) {
    return j(paramActivity.getFragmentManager(), null);
  }
  
  r k(FragmentManager paramFragmentManager) {
    return l(paramFragmentManager, null);
  }
  
  class a implements b {
    public i a(c param1c, l param1l, p param1p, Context param1Context) {
      return new i(param1c, param1l, param1p, param1Context);
    }
  }
  
  public static interface b {
    i a(c param1c, l param1l, p param1p, Context param1Context);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/manager/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */