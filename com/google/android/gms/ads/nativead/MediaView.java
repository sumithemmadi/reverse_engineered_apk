package com.google.android.gms.ads.nativead;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.ads.m;
import com.google.android.gms.internal.ads.b3;
import com.google.android.gms.internal.ads.z2;

public class MediaView extends FrameLayout {
  private m b;
  
  private boolean c;
  
  private z2 d;
  
  private ImageView.ScaleType e;
  
  private boolean f;
  
  private b3 g;
  
  public MediaView(Context paramContext) {
    super(paramContext);
  }
  
  public MediaView(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
  }
  
  public MediaView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  protected final void a(z2 paramz2) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: putfield d : Lcom/google/android/gms/internal/ads/z2;
    //   7: aload_0
    //   8: getfield c : Z
    //   11: ifeq -> 24
    //   14: aload_1
    //   15: aload_0
    //   16: getfield b : Lcom/google/android/gms/ads/m;
    //   19: invokeinterface a : (Lcom/google/android/gms/ads/m;)V
    //   24: aload_0
    //   25: monitorexit
    //   26: return
    //   27: astore_1
    //   28: aload_0
    //   29: monitorexit
    //   30: aload_1
    //   31: athrow
    // Exception table:
    //   from	to	target	type
    //   2	24	27	finally
  }
  
  protected final void b(b3 paramb3) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: putfield g : Lcom/google/android/gms/internal/ads/b3;
    //   7: aload_0
    //   8: getfield f : Z
    //   11: ifeq -> 24
    //   14: aload_1
    //   15: aload_0
    //   16: getfield e : Landroid/widget/ImageView$ScaleType;
    //   19: invokeinterface a : (Landroid/widget/ImageView$ScaleType;)V
    //   24: aload_0
    //   25: monitorexit
    //   26: return
    //   27: astore_1
    //   28: aload_0
    //   29: monitorexit
    //   30: aload_1
    //   31: athrow
    // Exception table:
    //   from	to	target	type
    //   2	24	27	finally
  }
  
  public void setImageScaleType(ImageView.ScaleType paramScaleType) {
    this.f = true;
    this.e = paramScaleType;
    b3 b31 = this.g;
    if (b31 != null)
      b31.a(paramScaleType); 
  }
  
  public void setMediaContent(m paramm) {
    this.c = true;
    this.b = paramm;
    z2 z21 = this.d;
    if (z21 != null)
      z21.a(paramm); 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/nativead/MediaView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */