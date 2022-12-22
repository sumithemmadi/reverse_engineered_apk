package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioManager;

@TargetApi(14)
public final class fo implements AudioManager.OnAudioFocusChangeListener {
  private final AudioManager a;
  
  private final ho b;
  
  private boolean c;
  
  private boolean d;
  
  private boolean e;
  
  private float f = 1.0F;
  
  public fo(Context paramContext, ho paramho) {
    this.a = (AudioManager)paramContext.getSystemService("audio");
    this.b = paramho;
  }
  
  private final void f() {
    boolean bool;
    boolean bool1 = this.d;
    boolean bool2 = false;
    boolean bool3 = false;
    if (bool1 && !this.e && this.f > 0.0F) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool) {
      bool1 = this.c;
      if (!bool1) {
        AudioManager audioManager = this.a;
        if (audioManager != null && !bool1) {
          bool2 = bool3;
          if (audioManager.requestAudioFocus(this, 3, 2) == 1)
            bool2 = true; 
          this.c = bool2;
        } 
        this.b.a();
        return;
      } 
    } 
    if (!bool) {
      bool3 = this.c;
      if (bool3) {
        AudioManager audioManager = this.a;
        if (audioManager != null && bool3) {
          if (audioManager.abandonAudioFocus(this) == 0)
            bool2 = true; 
          this.c = bool2;
        } 
        this.b.a();
      } 
    } 
  }
  
  public final float a() {
    float f;
    if (this.e) {
      f = 0.0F;
    } else {
      f = this.f;
    } 
    return this.c ? f : 0.0F;
  }
  
  public final void b(boolean paramBoolean) {
    this.e = paramBoolean;
    f();
  }
  
  public final void c(float paramFloat) {
    this.f = paramFloat;
    f();
  }
  
  public final void d() {
    this.d = true;
    f();
  }
  
  public final void e() {
    this.d = false;
    f();
  }
  
  public final void onAudioFocusChange(int paramInt) {
    boolean bool;
    if (paramInt > 0) {
      bool = true;
    } else {
      bool = false;
    } 
    this.c = bool;
    this.b.a();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/fo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */