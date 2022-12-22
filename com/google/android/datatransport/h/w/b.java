package com.google.android.datatransport.h.w;

public final class b {
  public static <TInput, TResult, TException extends Throwable> TResult a(int paramInt, TInput paramTInput, a<TInput, TResult, TException> parama, c<TInput, TResult> paramc) throws TException {
    int i = paramInt;
    TInput tInput = paramTInput;
    if (paramInt < 1)
      return parama.a(paramTInput); 
    while (true) {
      paramTInput = (TInput)parama.a(tInput);
      tInput = paramc.a(tInput, (TResult)paramTInput);
      if (tInput != null) {
        paramInt = i - 1;
        i = paramInt;
        if (paramInt < 1)
          break; 
        continue;
      } 
      break;
    } 
    return (TResult)paramTInput;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/h/w/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */