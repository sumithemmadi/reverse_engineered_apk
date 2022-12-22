package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.internal.a;
import com.google.android.gms.common.api.internal.b;
import com.google.android.gms.common.api.internal.d;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.common.api.internal.f0;
import com.google.android.gms.common.api.internal.m;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.common.api.internal.y;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.t;

public class c<O extends a.d> implements e<O> {
  private final Context a;
  
  private final a<O> b;
  
  private final O c;
  
  private final b<O> d;
  
  private final Looper e;
  
  private final int f;
  
  private final d g;
  
  private final m h;
  
  protected final f i;
  
  public c(Activity paramActivity, a<O> parama, O paramO, a parama1) {
    t.k(paramActivity, "Null activity is not permitted.");
    t.k(parama, "Api must not be null.");
    t.k(parama1, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
    Context context = paramActivity.getApplicationContext();
    this.a = context;
    this.b = parama;
    this.c = paramO;
    this.e = parama1.c;
    b<O> b1 = b.b(parama, (a.d)paramO);
    this.d = b1;
    this.g = (d)new y(this);
    f f1 = f.h(context);
    this.i = f1;
    this.f = f1.k();
    this.h = parama1.b;
    if (!(paramActivity instanceof GoogleApiActivity))
      p.q(paramActivity, f1, b1); 
    f1.d(this);
  }
  
  @Deprecated
  public c(Activity paramActivity, a<O> parama, O paramO, m paramm) {
    this(paramActivity, parama, paramO, (new a.a()).c(paramm).b(paramActivity.getMainLooper()).a());
  }
  
  public c(Context paramContext, a<O> parama, O paramO, a parama1) {
    t.k(paramContext, "Null context is not permitted.");
    t.k(parama, "Api must not be null.");
    t.k(parama1, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
    paramContext = paramContext.getApplicationContext();
    this.a = paramContext;
    this.b = parama;
    this.c = paramO;
    this.e = parama1.c;
    this.d = b.b(parama, (a.d)paramO);
    this.g = (d)new y(this);
    f f1 = f.h(paramContext);
    this.i = f1;
    this.f = f1.k();
    this.h = parama1.b;
    f1.d(this);
  }
  
  @Deprecated
  public c(Context paramContext, a<O> parama, O paramO, m paramm) {
    this(paramContext, parama, paramO, (new a.a()).c(paramm).a());
  }
  
  private final <A extends a.b, T extends d<? extends i, A>> T j(int paramInt, T paramT) {
    paramT.m();
    this.i.e(this, paramInt, (d)paramT);
    return paramT;
  }
  
  public b<O> a() {
    return this.d;
  }
  
  public d b() {
    return this.g;
  }
  
  protected e.a c() {
    // Byte code:
    //   0: new com/google/android/gms/common/internal/e$a
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_1
    //   8: aload_0
    //   9: getfield c : Lcom/google/android/gms/common/api/a$d;
    //   12: astore_2
    //   13: aload_2
    //   14: instanceof com/google/android/gms/common/api/a$d$b
    //   17: ifeq -> 42
    //   20: aload_2
    //   21: checkcast com/google/android/gms/common/api/a$d$b
    //   24: invokeinterface S : ()Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;
    //   29: astore_2
    //   30: aload_2
    //   31: ifnull -> 42
    //   34: aload_2
    //   35: invokevirtual U : ()Landroid/accounts/Account;
    //   38: astore_2
    //   39: goto -> 69
    //   42: aload_0
    //   43: getfield c : Lcom/google/android/gms/common/api/a$d;
    //   46: astore_2
    //   47: aload_2
    //   48: instanceof com/google/android/gms/common/api/a$d$a
    //   51: ifeq -> 67
    //   54: aload_2
    //   55: checkcast com/google/android/gms/common/api/a$d$a
    //   58: invokeinterface U : ()Landroid/accounts/Account;
    //   63: astore_2
    //   64: goto -> 69
    //   67: aconst_null
    //   68: astore_2
    //   69: aload_1
    //   70: aload_2
    //   71: invokevirtual c : (Landroid/accounts/Account;)Lcom/google/android/gms/common/internal/e$a;
    //   74: astore_1
    //   75: aload_0
    //   76: getfield c : Lcom/google/android/gms/common/api/a$d;
    //   79: astore_2
    //   80: aload_2
    //   81: instanceof com/google/android/gms/common/api/a$d$b
    //   84: ifeq -> 109
    //   87: aload_2
    //   88: checkcast com/google/android/gms/common/api/a$d$b
    //   91: invokeinterface S : ()Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;
    //   96: astore_2
    //   97: aload_2
    //   98: ifnull -> 109
    //   101: aload_2
    //   102: invokevirtual v0 : ()Ljava/util/Set;
    //   105: astore_2
    //   106: goto -> 113
    //   109: invokestatic emptySet : ()Ljava/util/Set;
    //   112: astore_2
    //   113: aload_1
    //   114: aload_2
    //   115: invokevirtual a : (Ljava/util/Collection;)Lcom/google/android/gms/common/internal/e$a;
    //   118: aload_0
    //   119: getfield a : Landroid/content/Context;
    //   122: invokevirtual getClass : ()Ljava/lang/Class;
    //   125: invokevirtual getName : ()Ljava/lang/String;
    //   128: invokevirtual d : (Ljava/lang/String;)Lcom/google/android/gms/common/internal/e$a;
    //   131: aload_0
    //   132: getfield a : Landroid/content/Context;
    //   135: invokevirtual getPackageName : ()Ljava/lang/String;
    //   138: invokevirtual e : (Ljava/lang/String;)Lcom/google/android/gms/common/internal/e$a;
    //   141: areturn
  }
  
  public <A extends a.b, T extends d<? extends i, A>> T d(T paramT) {
    return j(1, paramT);
  }
  
  public O e() {
    return this.c;
  }
  
  public Context f() {
    return this.a;
  }
  
  public final int g() {
    return this.f;
  }
  
  public Looper h() {
    return this.e;
  }
  
  public a.f i(Looper paramLooper, f.a<O> parama) {
    e e1 = c().b();
    return this.b.c().a(this.a, paramLooper, e1, this.c, (d.a)parama, (d.b)parama);
  }
  
  public f0 k(Context paramContext, Handler paramHandler) {
    return new f0(paramContext, paramHandler, c().b());
  }
  
  public static class a {
    public static final a a = (new a()).a();
    
    public final m b;
    
    public final Looper c;
    
    private a(m param1m, Account param1Account, Looper param1Looper) {
      this.b = param1m;
      this.c = param1Looper;
    }
    
    public static class a {
      private m a;
      
      private Looper b;
      
      public c.a a() {
        if (this.a == null)
          this.a = (m)new a(); 
        if (this.b == null)
          this.b = Looper.getMainLooper(); 
        return new c.a(this.a, null, this.b, null);
      }
      
      public a b(Looper param2Looper) {
        t.k(param2Looper, "Looper must not be null.");
        this.b = param2Looper;
        return this;
      }
      
      public a c(m param2m) {
        t.k(param2m, "StatusExceptionMapper must not be null.");
        this.a = param2m;
        return this;
      }
    }
  }
  
  public static class a {
    private m a;
    
    private Looper b;
    
    public c.a a() {
      if (this.a == null)
        this.a = (m)new a(); 
      if (this.b == null)
        this.b = Looper.getMainLooper(); 
      return new c.a(this.a, null, this.b, null);
    }
    
    public a b(Looper param1Looper) {
      t.k(param1Looper, "Looper must not be null.");
      this.b = param1Looper;
      return this;
    }
    
    public a c(m param1m) {
      t.k(param1m, "StatusExceptionMapper must not be null.");
      this.a = param1m;
      return this;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/api/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */