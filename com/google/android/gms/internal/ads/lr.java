package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.common.util.f;
import java.util.HashMap;
import java.util.Map;

public final class lr extends mt2 {
  private final eo b;
  
  private final Object c = new Object();
  
  private final boolean d;
  
  private final boolean e;
  
  private int f;
  
  private ot2 g;
  
  private boolean h;
  
  private boolean i = true;
  
  private float j;
  
  private float k;
  
  private float l;
  
  private boolean m;
  
  private boolean n;
  
  private z4 o;
  
  public lr(eo parameo, float paramFloat, boolean paramBoolean1, boolean paramBoolean2) {
    this.b = parameo;
    this.j = paramFloat;
    this.d = paramBoolean1;
    this.e = paramBoolean2;
  }
  
  private final void U9(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2) {
    fm.e.execute(new nr(this, paramInt1, paramInt2, paramBoolean1, paramBoolean2));
  }
  
  private final void Z9(String paramString, Map<String, String> paramMap) {
    if (paramMap == null) {
      paramMap = new HashMap<String, String>();
    } else {
      paramMap = new HashMap<String, String>(paramMap);
    } 
    paramMap.put("action", paramString);
    fm.e.execute(new or(this, paramMap));
  }
  
  public final void H3(z4 paramz4) {
    synchronized (this.c) {
      this.o = paramz4;
      return;
    } 
  }
  
  public final boolean K1() {
    boolean bool = K7();
    Object object = this.c;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    if (!bool)
      try {
        if (this.n && this.e) {
          bool = true;
          /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
          return bool;
        } 
      } finally {
        Exception exception;
      }  
    bool = false;
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    return bool;
  }
  
  public final boolean K7() {
    synchronized (this.c) {
      boolean bool;
      if (this.d && this.m) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    } 
  }
  
  public final float P0() {
    synchronized (this.c) {
      return this.k;
    } 
  }
  
  public final void P2(ot2 paramot2) {
    synchronized (this.c) {
      this.g = paramot2;
      return;
    } 
  }
  
  public final void T9(float paramFloat1, float paramFloat2, int paramInt, boolean paramBoolean, float paramFloat3) {
    synchronized (this.c) {
      boolean bool;
      if (paramFloat2 != this.j || paramFloat3 != this.l) {
        bool = true;
      } else {
        bool = false;
      } 
      this.j = paramFloat2;
      this.k = paramFloat1;
      boolean bool1 = this.i;
      this.i = paramBoolean;
      int i = this.f;
      this.f = paramInt;
      paramFloat1 = this.l;
      this.l = paramFloat3;
      if (Math.abs(paramFloat3 - paramFloat1) > 1.0E-4F)
        this.b.getView().invalidate(); 
      if (bool)
        try {
          null = this.o;
          if (null != null)
            null.k4(); 
        } catch (RemoteException null) {
          cm.f("#007 Could not call remote method.", (Throwable)null);
        }  
      U9(i, paramInt, bool1, paramBoolean);
      return;
    } 
  }
  
  public final int V() {
    synchronized (this.c) {
      return this.f;
    } 
  }
  
  public final void V9() {
    synchronized (this.c) {
      boolean bool = this.i;
      int i = this.f;
      this.f = 3;
      U9(i, 3, bool, bool);
      return;
    } 
  }
  
  public final void X9(zzaau paramzzaau) {
    boolean bool1 = paramzzaau.b;
    boolean bool2 = paramzzaau.c;
    boolean bool3 = paramzzaau.d;
    synchronized (this.c) {
      String str1;
      String str2;
      this.m = bool2;
      this.n = bool3;
      if (bool1) {
        null = "1";
      } else {
        null = "0";
      } 
      if (bool2) {
        str1 = "1";
      } else {
        str1 = "0";
      } 
      if (bool3) {
        str2 = "1";
      } else {
        str2 = "0";
      } 
      Z9("initialState", f.d("muteStart", null, "customControlsRequested", str1, "clickToExpandRequested", str2));
      return;
    } 
  }
  
  public final void Y9(float paramFloat) {
    synchronized (this.c) {
      this.k = paramFloat;
      return;
    } 
  }
  
  public final void c1() {
    Z9("play", null);
  }
  
  public final ot2 d5() {
    synchronized (this.c) {
      return this.g;
    } 
  }
  
  public final float getDuration() {
    synchronized (this.c) {
      return this.j;
    } 
  }
  
  public final float k0() {
    synchronized (this.c) {
      return this.l;
    } 
  }
  
  public final void pause() {
    Z9("pause", null);
  }
  
  public final void stop() {
    Z9("stop", null);
  }
  
  public final void v3(boolean paramBoolean) {
    String str;
    if (paramBoolean) {
      str = "mute";
    } else {
      str = "unmute";
    } 
    Z9(str, null);
  }
  
  public final boolean w2() {
    synchronized (this.c) {
      return this.i;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/lr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */