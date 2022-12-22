package com.google.android.gms.dynamite;

import android.content.Context;

final class h implements DynamiteModule.a {
  public final DynamiteModule.a.a a(Context paramContext, String paramString, DynamiteModule.a.b paramb) {
    DynamiteModule.a.a a1 = new DynamiteModule.a.a();
    a1.a = paramb.b(paramContext, paramString);
    int i = paramb.a(paramContext, paramString, true);
    a1.b = i;
    int j = a1.a;
    if (j == 0 && i == 0) {
      a1.c = 0;
    } else if (i >= j) {
      a1.c = 1;
    } else {
      a1.c = -1;
    } 
    return a1;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/dynamite/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */