package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;

public final class u extends RemoteCreator<q> {
  private static final u c = new u();
  
  private u() {
    super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
  }
  
  public static View c(Context paramContext, int paramInt1, int paramInt2) {
    return c.e(paramContext, paramInt1, paramInt2);
  }
  
  private final View e(Context paramContext, int paramInt1, int paramInt2) {
    try {
      SignInButtonConfig signInButtonConfig = new SignInButtonConfig();
      this(paramInt1, paramInt2, null);
      a a = b.a2(paramContext);
      return (View)b.o1(((q)b(paramContext)).C4(a, signInButtonConfig));
    } catch (Exception exception) {
      StringBuilder stringBuilder = new StringBuilder(64);
      stringBuilder.append("Could not get button with size ");
      stringBuilder.append(paramInt1);
      stringBuilder.append(" and color ");
      stringBuilder.append(paramInt2);
      throw new RemoteCreator.RemoteCreatorException(stringBuilder.toString(), exception);
    } 
  }
  
  public final q d(IBinder paramIBinder) {
    if (paramIBinder == null)
      return null; 
    IInterface iInterface = paramIBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
    return (iInterface instanceof q) ? (q)iInterface : new d0(paramIBinder);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/internal/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */