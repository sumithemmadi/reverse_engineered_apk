package com.bumptech.glide.load;

public enum EncodeStrategy {
  b, c, d;
  
  static {
    EncodeStrategy encodeStrategy1 = new EncodeStrategy("SOURCE", 0);
    b = encodeStrategy1;
    EncodeStrategy encodeStrategy2 = new EncodeStrategy("TRANSFORMED", 1);
    c = encodeStrategy2;
    EncodeStrategy encodeStrategy3 = new EncodeStrategy("NONE", 2);
    d = encodeStrategy3;
    e = new EncodeStrategy[] { encodeStrategy1, encodeStrategy2, encodeStrategy3 };
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/EncodeStrategy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */