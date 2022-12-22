package androidx.activity.result.e;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;

public abstract class a<I, O> {
  public abstract Intent a(Context paramContext, @SuppressLint({"UnknownNullness"}) I paramI);
  
  public a<O> b(Context paramContext, @SuppressLint({"UnknownNullness"}) I paramI) {
    return null;
  }
  
  @SuppressLint({"UnknownNullness"})
  public abstract O c(int paramInt, Intent paramIntent);
  
  public static final class a<T> {
    @SuppressLint({"UnknownNullness"})
    private final T a;
    
    public a(@SuppressLint({"UnknownNullness"}) T param1T) {
      this.a = param1T;
    }
    
    @SuppressLint({"UnknownNullness"})
    public T a() {
      return this.a;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/activity/result/e/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */