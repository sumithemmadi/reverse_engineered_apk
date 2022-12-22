package com.bumptech.glide.load;

public enum DecodeFormat {
  b, c;
  
  public static final DecodeFormat d;
  
  static {
    DecodeFormat decodeFormat1 = new DecodeFormat("PREFER_ARGB_8888", 0);
    b = decodeFormat1;
    DecodeFormat decodeFormat2 = new DecodeFormat("PREFER_RGB_565", 1);
    c = decodeFormat2;
    e = new DecodeFormat[] { decodeFormat1, decodeFormat2 };
    d = decodeFormat1;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/DecodeFormat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */