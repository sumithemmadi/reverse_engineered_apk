package com.allinone.callerid.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.widget.ImageView;
import com.allinone.callerid.main.a;
import com.bumptech.glide.h;

public class u {
  public static void a(Activity paramActivity, Object paramObject, int paramInt, ImageView paramImageView) {
    if (Build.VERSION.SDK_INT >= 17) {
      if (paramActivity != null && !paramActivity.isDestroyed())
        a.a(paramActivity).F(paramObject).b1(paramInt).M0().C0(paramImageView); 
    } else {
      try {
        a.a(paramActivity).F(paramObject).b1(paramInt).M0().C0(paramImageView);
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    } 
  }
  
  public static void b(Context paramContext, Object paramObject, int paramInt, ImageView paramImageView) {
    if (paramContext != null)
      try {
        a.b(paramContext).F(paramObject).b1(paramInt).M0().C0(paramImageView);
      } catch (Exception exception) {
        exception.printStackTrace();
      }  
  }
  
  public static void c(Activity paramActivity, Uri paramUri, String paramString, int paramInt, ImageView paramImageView) {
    if (Build.VERSION.SDK_INT >= 17) {
      if (paramActivity != null)
        try {
          if (!paramActivity.isDestroyed())
            if (paramString != null && !"".equals(paramString)) {
              a.a(paramActivity).E(paramUri).S0((h)a.a(paramActivity).G(paramString).b1(paramInt).M0()).b1(paramInt).M0().C0(paramImageView);
            } else {
              a.a(paramActivity).E(paramUri).b1(paramInt).M0().C0(paramImageView);
            }  
        } catch (Exception exception) {
          exception.printStackTrace();
        }  
    } else {
      if (paramString != null) {
        try {
          if (!"".equals(paramString)) {
            a.a((Activity)exception).E(paramUri).S0((h)a.a((Activity)exception).G(paramString).b1(paramInt).M0()).b1(paramInt).M0().C0(paramImageView);
            return;
          } 
          a.a((Activity)exception).E(paramUri).b1(paramInt).M0().C0(paramImageView);
        } catch (Exception exception1) {
          exception1.printStackTrace();
        } 
        return;
      } 
      a.a((Activity)exception1).E(paramUri).b1(paramInt).M0().C0(paramImageView);
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */