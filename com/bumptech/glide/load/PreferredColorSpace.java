package com.bumptech.glide.load;

public enum PreferredColorSpace {
  b, c;
  
  static {
    PreferredColorSpace preferredColorSpace1 = new PreferredColorSpace("SRGB", 0);
    b = preferredColorSpace1;
    PreferredColorSpace preferredColorSpace2 = new PreferredColorSpace("DISPLAY_P3", 1);
    c = preferredColorSpace2;
    d = new PreferredColorSpace[] { preferredColorSpace1, preferredColorSpace2 };
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/PreferredColorSpace.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */