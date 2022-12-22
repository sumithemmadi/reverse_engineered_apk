package com.bumptech.glide.load.data.o;

import android.net.Uri;

public final class b {
  public static boolean a(Uri paramUri) {
    boolean bool;
    if (b(paramUri) && !e(paramUri)) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public static boolean b(Uri paramUri) {
    boolean bool;
    if (paramUri != null && "content".equals(paramUri.getScheme()) && "media".equals(paramUri.getAuthority())) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public static boolean c(Uri paramUri) {
    boolean bool;
    if (b(paramUri) && e(paramUri)) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public static boolean d(int paramInt1, int paramInt2) {
    boolean bool;
    if (paramInt1 != Integer.MIN_VALUE && paramInt2 != Integer.MIN_VALUE && paramInt1 <= 512 && paramInt2 <= 384) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private static boolean e(Uri paramUri) {
    return paramUri.getPathSegments().contains("video");
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/data/o/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */