package com.google.android.exoplayer2;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import com.google.android.exoplayer2.audio.i;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.h0;
import com.google.android.exoplayer2.util.o;

final class s {
  private final AudioManager a;
  
  private final a b;
  
  private final b c;
  
  private i d;
  
  private int e;
  
  private int f;
  
  private float g = 1.0F;
  
  private AudioFocusRequest h;
  
  private boolean i;
  
  public s(Context paramContext, Handler paramHandler, b paramb) {
    this.a = (AudioManager)paramContext.getApplicationContext().getSystemService("audio");
    this.c = paramb;
    this.b = new a(this, paramHandler);
    this.e = 0;
  }
  
  private void a() {
    b(false);
  }
  
  private void b(boolean paramBoolean) {
    int j = this.f;
    if (j == 0 && this.e == 0)
      return; 
    if (j != 1 || this.e == -1 || paramBoolean) {
      if (h0.a >= 26) {
        d();
      } else {
        c();
      } 
      this.e = 0;
    } 
  }
  
  private void c() {
    this.a.abandonAudioFocus(this.b);
  }
  
  private void d() {
    AudioFocusRequest audioFocusRequest = this.h;
    if (audioFocusRequest != null)
      this.a.abandonAudioFocusRequest(audioFocusRequest); 
  }
  
  private void g(int paramInt) {
    float f;
    if (paramInt != -3) {
      if (paramInt != -2) {
        if (paramInt != -1) {
          if (paramInt != 1) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unknown focus change type: ");
            stringBuilder.append(paramInt);
            o.f("AudioFocusManager", stringBuilder.toString());
            return;
          } 
          this.e = 1;
        } else {
          this.e = -1;
        } 
      } else {
        this.e = 2;
      } 
    } else if (o()) {
      this.e = 2;
    } else {
      this.e = 3;
    } 
    paramInt = this.e;
    if (paramInt != -1) {
      if (paramInt != 0)
        if (paramInt != 1) {
          if (paramInt != 2) {
            if (paramInt != 3) {
              StringBuilder stringBuilder = new StringBuilder();
              stringBuilder.append("Unknown audio focus state: ");
              stringBuilder.append(this.e);
              throw new IllegalStateException(stringBuilder.toString());
            } 
          } else {
            this.c.g(0);
          } 
        } else {
          this.c.g(1);
        }  
    } else {
      this.c.g(-1);
      b(true);
    } 
    if (this.e == 3) {
      f = 0.2F;
    } else {
      f = 1.0F;
    } 
    if (this.g != f) {
      this.g = f;
      this.c.f(f);
    } 
  }
  
  private int h(boolean paramBoolean) {
    byte b1;
    if (paramBoolean) {
      b1 = 1;
    } else {
      b1 = -1;
    } 
    return b1;
  }
  
  private int l() {
    int j = this.f;
    boolean bool = true;
    if (j == 0) {
      if (this.e != 0)
        b(true); 
      return 1;
    } 
    if (this.e == 0) {
      if (h0.a >= 26) {
        j = n();
      } else {
        j = m();
      } 
      if (j == 1) {
        j = 1;
      } else {
        j = 0;
      } 
      this.e = j;
    } 
    int k = this.e;
    if (k == 0)
      return -1; 
    j = bool;
    if (k == 2)
      j = 0; 
    return j;
  }
  
  private int m() {
    return this.a.requestAudioFocus(this.b, h0.K(((i)e.e(this.d)).d), this.f);
  }
  
  private int n() {
    AudioFocusRequest audioFocusRequest = this.h;
    if (audioFocusRequest == null || this.i) {
      AudioFocusRequest.Builder builder;
      if (audioFocusRequest == null) {
        builder = new AudioFocusRequest.Builder(this.f);
      } else {
        builder = new AudioFocusRequest.Builder(this.h);
      } 
      boolean bool = o();
      this.h = builder.setAudioAttributes(((i)e.e(this.d)).a()).setWillPauseWhenDucked(bool).setOnAudioFocusChangeListener(this.b).build();
      this.i = false;
    } 
    return this.a.requestAudioFocus(this.h);
  }
  
  private boolean o() {
    i i1 = this.d;
    boolean bool = true;
    if (i1 == null || i1.b != 1)
      bool = false; 
    return bool;
  }
  
  public float f() {
    return this.g;
  }
  
  public int i(boolean paramBoolean) {
    byte b1;
    if (paramBoolean) {
      b1 = l();
    } else {
      b1 = -1;
    } 
    return b1;
  }
  
  public int j(boolean paramBoolean, int paramInt) {
    if (!paramBoolean) {
      a();
      return -1;
    } 
    if (paramInt == 1) {
      paramInt = h(paramBoolean);
    } else {
      paramInt = l();
    } 
    return paramInt;
  }
  
  public void k() {
    b(true);
  }
  
  private class a implements AudioManager.OnAudioFocusChangeListener {
    private final Handler a;
    
    public a(s this$0, Handler param1Handler) {
      this.a = param1Handler;
    }
    
    public void onAudioFocusChange(int param1Int) {
      this.a.post(new a(this, param1Int));
    }
  }
  
  public static interface b {
    void f(float param1Float);
    
    void g(int param1Int);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */