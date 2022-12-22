package com.google.android.gms.auth.api.signin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.signin.internal.i;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.m;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.tasks.g;

public class c extends c<GoogleSignInOptions> {
  private static final b j = new b(null);
  
  private static int k = a.a;
  
  c(Activity paramActivity, GoogleSignInOptions paramGoogleSignInOptions) {
    super(paramActivity, com.google.android.gms.auth.b.a.g, paramGoogleSignInOptions, (m)new com.google.android.gms.common.api.internal.a());
  }
  
  c(Context paramContext, GoogleSignInOptions paramGoogleSignInOptions) {
    super(paramContext, com.google.android.gms.auth.b.a.g, paramGoogleSignInOptions, (m)new com.google.android.gms.common.api.internal.a());
  }
  
  private final int o() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: getstatic com/google/android/gms/auth/api/signin/c.k : I
    //   5: getstatic com/google/android/gms/auth/api/signin/c$a.a : I
    //   8: if_icmpne -> 75
    //   11: aload_0
    //   12: invokevirtual f : ()Landroid/content/Context;
    //   15: astore_1
    //   16: invokestatic n : ()Lcom/google/android/gms/common/b;
    //   19: astore_2
    //   20: aload_2
    //   21: aload_1
    //   22: ldc 12451000
    //   24: invokevirtual h : (Landroid/content/Context;I)I
    //   27: istore_3
    //   28: iload_3
    //   29: ifne -> 41
    //   32: getstatic com/google/android/gms/auth/api/signin/c$a.d : I
    //   35: putstatic com/google/android/gms/auth/api/signin/c.k : I
    //   38: goto -> 75
    //   41: aload_2
    //   42: aload_1
    //   43: iload_3
    //   44: aconst_null
    //   45: invokevirtual b : (Landroid/content/Context;ILjava/lang/String;)Landroid/content/Intent;
    //   48: ifnonnull -> 69
    //   51: aload_1
    //   52: ldc 'com.google.android.gms.auth.api.fallback'
    //   54: invokestatic a : (Landroid/content/Context;Ljava/lang/String;)I
    //   57: ifeq -> 69
    //   60: getstatic com/google/android/gms/auth/api/signin/c$a.c : I
    //   63: putstatic com/google/android/gms/auth/api/signin/c.k : I
    //   66: goto -> 75
    //   69: getstatic com/google/android/gms/auth/api/signin/c$a.b : I
    //   72: putstatic com/google/android/gms/auth/api/signin/c.k : I
    //   75: getstatic com/google/android/gms/auth/api/signin/c.k : I
    //   78: istore_3
    //   79: aload_0
    //   80: monitorexit
    //   81: iload_3
    //   82: ireturn
    //   83: astore_1
    //   84: aload_0
    //   85: monitorexit
    //   86: aload_1
    //   87: athrow
    // Exception table:
    //   from	to	target	type
    //   2	28	83	finally
    //   32	38	83	finally
    //   41	66	83	finally
    //   69	75	83	finally
    //   75	79	83	finally
  }
  
  public Intent l() {
    Context context = f();
    int i = i.a[o() - 1];
    return (i != 1) ? ((i != 2) ? i.g(context, (GoogleSignInOptions)e()) : i.b(context, (GoogleSignInOptions)e())) : i.e(context, (GoogleSignInOptions)e());
  }
  
  public g<Void> m() {
    boolean bool;
    d d = b();
    Context context = f();
    if (o() == a.c) {
      bool = true;
    } else {
      bool = false;
    } 
    return s.b(i.f(d, context, bool));
  }
  
  public g<Void> n() {
    boolean bool;
    d d = b();
    Context context = f();
    if (o() == a.c) {
      bool = true;
    } else {
      bool = false;
    } 
    return s.b(i.c(d, context, bool));
  }
  
  enum a {
    a, b, c, d;
    
    public static int[] a() {
      return (int[])e.clone();
    }
  }
  
  private static final class b implements s.a<d, GoogleSignInAccount> {
    private b() {}
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/auth/api/signin/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */