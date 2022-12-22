package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

public final class p {
  private static p a;
  
  private b b;
  
  private GoogleSignInAccount c;
  
  private GoogleSignInOptions d;
  
  private p(Context paramContext) {
    b b1 = b.b(paramContext);
    this.b = b1;
    this.c = b1.c();
    this.d = this.b.d();
  }
  
  public static p c(Context paramContext) {
    // Byte code:
    //   0: ldc com/google/android/gms/auth/api/signin/internal/p
    //   2: monitorenter
    //   3: aload_0
    //   4: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   7: invokestatic d : (Landroid/content/Context;)Lcom/google/android/gms/auth/api/signin/internal/p;
    //   10: astore_0
    //   11: ldc com/google/android/gms/auth/api/signin/internal/p
    //   13: monitorexit
    //   14: aload_0
    //   15: areturn
    //   16: astore_0
    //   17: ldc com/google/android/gms/auth/api/signin/internal/p
    //   19: monitorexit
    //   20: aload_0
    //   21: athrow
    // Exception table:
    //   from	to	target	type
    //   3	11	16	finally
  }
  
  private static p d(Context paramContext) {
    // Byte code:
    //   0: ldc com/google/android/gms/auth/api/signin/internal/p
    //   2: monitorenter
    //   3: getstatic com/google/android/gms/auth/api/signin/internal/p.a : Lcom/google/android/gms/auth/api/signin/internal/p;
    //   6: astore_1
    //   7: aload_1
    //   8: ifnull -> 16
    //   11: ldc com/google/android/gms/auth/api/signin/internal/p
    //   13: monitorexit
    //   14: aload_1
    //   15: areturn
    //   16: new com/google/android/gms/auth/api/signin/internal/p
    //   19: astore_1
    //   20: aload_1
    //   21: aload_0
    //   22: invokespecial <init> : (Landroid/content/Context;)V
    //   25: aload_1
    //   26: putstatic com/google/android/gms/auth/api/signin/internal/p.a : Lcom/google/android/gms/auth/api/signin/internal/p;
    //   29: ldc com/google/android/gms/auth/api/signin/internal/p
    //   31: monitorexit
    //   32: aload_1
    //   33: areturn
    //   34: astore_0
    //   35: ldc com/google/android/gms/auth/api/signin/internal/p
    //   37: monitorexit
    //   38: aload_0
    //   39: athrow
    // Exception table:
    //   from	to	target	type
    //   3	7	34	finally
    //   16	29	34	finally
  }
  
  public final void a() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield b : Lcom/google/android/gms/auth/api/signin/internal/b;
    //   6: invokevirtual a : ()V
    //   9: aload_0
    //   10: aconst_null
    //   11: putfield c : Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;
    //   14: aload_0
    //   15: aconst_null
    //   16: putfield d : Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;
    //   19: aload_0
    //   20: monitorexit
    //   21: return
    //   22: astore_1
    //   23: aload_0
    //   24: monitorexit
    //   25: aload_1
    //   26: athrow
    // Exception table:
    //   from	to	target	type
    //   2	19	22	finally
  }
  
  public final void b(GoogleSignInOptions paramGoogleSignInOptions, GoogleSignInAccount paramGoogleSignInAccount) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield b : Lcom/google/android/gms/auth/api/signin/internal/b;
    //   6: aload_2
    //   7: aload_1
    //   8: invokevirtual f : (Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)V
    //   11: aload_0
    //   12: aload_2
    //   13: putfield c : Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;
    //   16: aload_0
    //   17: aload_1
    //   18: putfield d : Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;
    //   21: aload_0
    //   22: monitorexit
    //   23: return
    //   24: astore_1
    //   25: aload_0
    //   26: monitorexit
    //   27: aload_1
    //   28: athrow
    // Exception table:
    //   from	to	target	type
    //   2	21	24	finally
  }
  
  public final GoogleSignInAccount e() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield c : Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;
    //   6: astore_1
    //   7: aload_0
    //   8: monitorexit
    //   9: aload_1
    //   10: areturn
    //   11: astore_1
    //   12: aload_0
    //   13: monitorexit
    //   14: aload_1
    //   15: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	11	finally
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/auth/api/signin/internal/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */