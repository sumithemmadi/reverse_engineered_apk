package com.google.android.gms.dynamite;

import android.content.Context;

final class a implements DynamiteModule.a {
  public final DynamiteModule.a.a a(Context paramContext, String paramString, DynamiteModule.a.b paramb) {
    DynamiteModule.a.a a1 = new DynamiteModule.a.a();
    int i = paramb.a(paramContext, paramString, true);
    a1.b = i;
    if (i != 0) {
      a1.c = 1;
    } else {
      i = paramb.b(paramContext, paramString);
      a1.a = i;
      if (i != 0)
        a1.c = -1; 
    } 
    return a1;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/dynamite/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */