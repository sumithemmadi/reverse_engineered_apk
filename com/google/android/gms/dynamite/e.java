package com.google.android.gms.dynamite;

import android.content.Context;

final class e implements DynamiteModule.a {
  public final DynamiteModule.a.a a(Context paramContext, String paramString, DynamiteModule.a.b paramb) {
    DynamiteModule.a.a a1 = new DynamiteModule.a.a();
    int i = paramb.b(paramContext, paramString);
    a1.a = i;
    if (i != 0) {
      a1.b = paramb.a(paramContext, paramString, false);
    } else {
      a1.b = paramb.a(paramContext, paramString, true);
    } 
    i = a1.a;
    if (i == 0 && a1.b == 0) {
      a1.c = 0;
    } else if (i >= a1.b) {
      a1.c = -1;
    } else {
      a1.c = 1;
    } 
    return a1;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/dynamite/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */