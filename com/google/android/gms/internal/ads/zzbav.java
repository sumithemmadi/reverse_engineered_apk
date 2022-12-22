package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.TextureView;

@TargetApi(14)
public abstract class zzbav extends TextureView implements ho {
  protected final vn b = new vn();
  
  protected final fo c;
  
  public zzbav(Context paramContext) {
    super(paramContext);
    this.c = new fo(paramContext, this);
  }
  
  public abstract void a();
  
  public abstract void c();
  
  public abstract void g();
  
  public abstract int getCurrentPosition();
  
  public abstract int getDuration();
  
  public abstract long getTotalBytes();
  
  public abstract int getVideoHeight();
  
  public abstract int getVideoWidth();
  
  public abstract void h(int paramInt);
  
  public abstract void i();
  
  public abstract void j(float paramFloat1, float paramFloat2);
  
  public abstract void k(mn parammn);
  
  public abstract String l();
  
  public abstract long m();
  
  public abstract int n();
  
  public void o(String paramString, String[] paramArrayOfString) {
    setVideoPath(paramString);
  }
  
  public void p(int paramInt) {}
  
  public void q(int paramInt) {}
  
  public void r(int paramInt) {}
  
  public void s(int paramInt) {}
  
  public abstract void setVideoPath(String paramString);
  
  public void t(int paramInt) {}
  
  public abstract long u();
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzbav.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */