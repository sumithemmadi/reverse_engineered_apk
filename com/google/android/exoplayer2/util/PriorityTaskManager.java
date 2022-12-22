package com.google.android.exoplayer2.util;

import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;

public final class PriorityTaskManager {
  private final Object a = new Object();
  
  private final PriorityQueue<Integer> b = new PriorityQueue<Integer>(10, Collections.reverseOrder());
  
  private int c = Integer.MIN_VALUE;
  
  public void a(int paramInt) {
    synchronized (this.a) {
      this.b.add(Integer.valueOf(paramInt));
      this.c = Math.max(this.c, paramInt);
      return;
    } 
  }
  
  public void b(int paramInt) {
    synchronized (this.a) {
      this.b.remove(Integer.valueOf(paramInt));
      if (this.b.isEmpty()) {
        paramInt = Integer.MIN_VALUE;
      } else {
        paramInt = ((Integer)h0.<Integer>g(this.b.peek())).intValue();
      } 
      this.c = paramInt;
      this.a.notifyAll();
      return;
    } 
  }
  
  public static class PriorityTooLowException extends IOException {
    public PriorityTooLowException(int param1Int1, int param1Int2) {
      super(stringBuilder.toString());
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/util/PriorityTaskManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */