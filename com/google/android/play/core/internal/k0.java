package com.google.android.play.core.internal;

final class k0 extends h0 {
  private final j0 a = new j0();
  
  public final void a(Throwable paramThrowable1, Throwable paramThrowable2) {
    if (paramThrowable2 != paramThrowable1) {
      if (paramThrowable2 != null) {
        this.a.a(paramThrowable1).add(paramThrowable2);
        return;
      } 
      throw new NullPointerException("The suppressed exception cannot be null.");
    } 
    throw new IllegalArgumentException("Self suppression is not allowed.", paramThrowable2);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/play/core/internal/k0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */