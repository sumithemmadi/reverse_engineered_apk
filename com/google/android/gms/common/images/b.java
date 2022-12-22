package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.internal.base.d;

public abstract class b {
  protected int a;
  
  final void a(Context paramContext, Bitmap paramBitmap, boolean paramBoolean) {
    c.c(paramBitmap);
    c((Drawable)new BitmapDrawable(paramContext.getResources(), paramBitmap), paramBoolean, false, true);
  }
  
  final void b(Context paramContext, d paramd, boolean paramBoolean) {
    int i = this.a;
    if (i != 0) {
      Drawable drawable = paramContext.getResources().getDrawable(i);
    } else {
      paramContext = null;
    } 
    c((Drawable)paramContext, paramBoolean, false, false);
  }
  
  protected abstract void c(Drawable paramDrawable, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3);
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/images/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */