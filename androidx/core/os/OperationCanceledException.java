package androidx.core.os;

import b.h.j.d;

public class OperationCanceledException extends RuntimeException {
  public OperationCanceledException() {
    this(null);
  }
  
  public OperationCanceledException(String paramString) {
    super(d.c(paramString, "The operation has been canceled."));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/core/os/OperationCanceledException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */