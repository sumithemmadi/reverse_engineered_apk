package com.bumptech.glide;

public enum MemoryCategory {
  b, c, d;
  
  private final float multiplier;
  
  static {
    MemoryCategory memoryCategory1 = new MemoryCategory("LOW", 0, 0.5F);
    b = memoryCategory1;
    MemoryCategory memoryCategory2 = new MemoryCategory("NORMAL", 1, 1.0F);
    c = memoryCategory2;
    MemoryCategory memoryCategory3 = new MemoryCategory("HIGH", 2, 1.5F);
    d = memoryCategory3;
    e = new MemoryCategory[] { memoryCategory1, memoryCategory2, memoryCategory3 };
  }
  
  MemoryCategory(float paramFloat) {
    this.multiplier = paramFloat;
  }
  
  public float getMultiplier() {
    return this.multiplier;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/MemoryCategory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */