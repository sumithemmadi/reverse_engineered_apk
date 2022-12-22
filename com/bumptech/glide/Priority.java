package com.bumptech.glide;

public enum Priority {
  b, c, d, e;
  
  static {
    Priority priority1 = new Priority("IMMEDIATE", 0);
    b = priority1;
    Priority priority2 = new Priority("HIGH", 1);
    c = priority2;
    Priority priority3 = new Priority("NORMAL", 2);
    d = priority3;
    Priority priority4 = new Priority("LOW", 3);
    e = priority4;
    f = new Priority[] { priority1, priority2, priority3, priority4 };
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/Priority.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */