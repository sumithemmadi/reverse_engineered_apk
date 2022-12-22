package com.bumptech.glide;

import com.bumptech.glide.request.i.a;
import com.bumptech.glide.request.i.c;

public abstract class j<CHILD extends j<CHILD, TranscodeType>, TranscodeType> implements Cloneable {
  private c<? super TranscodeType> b = a.b();
  
  public final CHILD a() {
    try {
      return (CHILD)super.clone();
    } catch (CloneNotSupportedException cloneNotSupportedException) {
      throw new RuntimeException(cloneNotSupportedException);
    } 
  }
  
  final c<? super TranscodeType> b() {
    return this.b;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */