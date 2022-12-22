package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

public final class xl2 {
  private final int a;
  
  private final int b;
  
  private final int c;
  
  private final yl2 d = new bm2();
  
  public xl2(int paramInt) {
    this.b = paramInt;
    this.a = 6;
    this.c = 0;
  }
  
  private final String b(String paramString) {
    String[] arrayOfString = paramString.split("\n");
    if (arrayOfString.length == 0)
      return ""; 
    zl2 zl2 = new zl2();
    PriorityQueue<hm2> priorityQueue = new PriorityQueue(this.b, new am2(this));
    for (byte b = 0; b < arrayOfString.length; b++) {
      String[] arrayOfString1 = cm2.b(arrayOfString[b], false);
      if (arrayOfString1.length != 0)
        em2.d(arrayOfString1, this.b, this.a, priorityQueue); 
    } 
    Iterator<hm2> iterator = priorityQueue.iterator();
    while (iterator.hasNext()) {
      hm2 hm2 = iterator.next();
      try {
        zl2.a(this.d.a(hm2.b));
      } catch (IOException iOException) {
        cm.c("Error while writing hash to byteStream", iOException);
        break;
      } 
    } 
    return zl2.toString();
  }
  
  public final String a(ArrayList<String> paramArrayList) {
    StringBuilder stringBuilder = new StringBuilder();
    int i = paramArrayList.size();
    byte b = 0;
    while (b < i) {
      String str = (String)paramArrayList.get(b);
      b++;
      stringBuilder.append(((String)str).toLowerCase(Locale.US));
      stringBuilder.append('\n');
    } 
    return b(stringBuilder.toString());
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/xl2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */