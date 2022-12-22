package androidx.core.app;

import android.app.RemoteInput;

public final class n {
  static RemoteInput a(n paramn) {
    RemoteInput.Builder builder = new RemoteInput.Builder();
    throw null;
  }
  
  static RemoteInput[] b(n[] paramArrayOfn) {
    if (paramArrayOfn == null)
      return null; 
    RemoteInput[] arrayOfRemoteInput = new RemoteInput[paramArrayOfn.length];
    for (byte b = 0; b < paramArrayOfn.length; b++)
      arrayOfRemoteInput[b] = a(paramArrayOfn[b]); 
    return arrayOfRemoteInput;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/core/app/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */