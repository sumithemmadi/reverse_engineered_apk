package com.google.android.gms.internal.ads;

public enum zzarm {
  b, c, d, e;
  
  private final String zzdre;
  
  static {
    zzarm zzarm1 = new zzarm("BEGIN_TO_RENDER", 0, "beginToRender");
    b = zzarm1;
    zzarm zzarm2 = new zzarm("DEFINED_BY_JAVASCRIPT", 1, "definedByJavascript");
    c = zzarm2;
    zzarm zzarm3 = new zzarm("ONE_PIXEL", 2, "onePixel");
    d = zzarm3;
    zzarm zzarm4 = new zzarm("UNSPECIFIED", 3, "unspecified");
    e = zzarm4;
    f = new zzarm[] { zzarm1, zzarm2, zzarm3, zzarm4 };
  }
  
  zzarm(String paramString1) {
    this.zzdre = paramString1;
  }
  
  public final String toString() {
    return this.zzdre;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzarm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */