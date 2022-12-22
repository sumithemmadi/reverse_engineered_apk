package com.google.android.gms.internal.ads;

import java.util.PriorityQueue;

public final class em2 {
  private static long a(long paramLong, int paramInt) {
    return (paramInt == 0) ? 1L : ((paramInt == 1) ? paramLong : ((paramInt % 2 == 0) ? (a(paramLong * paramLong % 1073807359L, paramInt / 2) % 1073807359L) : (paramLong * a(paramLong * paramLong % 1073807359L, paramInt / 2) % 1073807359L % 1073807359L)));
  }
  
  private static String b(String[] paramArrayOfString, int paramInt1, int paramInt2) {
    int i = paramArrayOfString.length;
    paramInt2 += paramInt1;
    if (i < paramInt2) {
      cm.g("Unable to construct shingle");
      return "";
    } 
    StringBuilder stringBuilder = new StringBuilder();
    while (true) {
      i = paramInt2 - 1;
      if (paramInt1 < i) {
        stringBuilder.append(paramArrayOfString[paramInt1]);
        stringBuilder.append(' ');
        paramInt1++;
        continue;
      } 
      stringBuilder.append(paramArrayOfString[i]);
      return stringBuilder.toString();
    } 
  }
  
  private static void c(int paramInt1, long paramLong, String paramString, int paramInt2, PriorityQueue<hm2> paramPriorityQueue) {
    hm2 hm2 = new hm2(paramLong, paramString, paramInt2);
    if (paramPriorityQueue.size() == paramInt1 && (((hm2)paramPriorityQueue.peek()).c > hm2.c || ((hm2)paramPriorityQueue.peek()).a > hm2.a))
      return; 
    if (paramPriorityQueue.contains(hm2))
      return; 
    paramPriorityQueue.add(hm2);
    if (paramPriorityQueue.size() > paramInt1)
      paramPriorityQueue.poll(); 
  }
  
  public static void d(String[] paramArrayOfString, int paramInt1, int paramInt2, PriorityQueue<hm2> paramPriorityQueue) {
    if (paramArrayOfString.length < paramInt2) {
      c(paramInt1, e(paramArrayOfString, 0, paramArrayOfString.length), b(paramArrayOfString, 0, paramArrayOfString.length), paramArrayOfString.length, paramPriorityQueue);
      return;
    } 
    long l1 = e(paramArrayOfString, 0, paramInt2);
    c(paramInt1, l1, b(paramArrayOfString, 0, paramInt2), paramInt2, paramPriorityQueue);
    long l2 = a(16785407L, paramInt2 - 1);
    for (byte b = 1; b < paramArrayOfString.length - paramInt2 + 1; b++) {
      int i = cm2.a(paramArrayOfString[b - 1]);
      int j = cm2.a(paramArrayOfString[b + paramInt2 - 1]);
      l1 = ((l1 + 1073807359L - (i + 2147483647L) % 1073807359L * l2 % 1073807359L) % 1073807359L * 16785407L % 1073807359L + (j + 2147483647L) % 1073807359L) % 1073807359L;
      c(paramInt1, l1, b(paramArrayOfString, b, paramInt2), paramArrayOfString.length, paramPriorityQueue);
    } 
  }
  
  private static long e(String[] paramArrayOfString, int paramInt1, int paramInt2) {
    long l = (cm2.a(paramArrayOfString[0]) + 2147483647L) % 1073807359L;
    for (paramInt1 = 1; paramInt1 < paramInt2; paramInt1++)
      l = (l * 16785407L % 1073807359L + (cm2.a(paramArrayOfString[paramInt1]) + 2147483647L) % 1073807359L) % 1073807359L; 
    return l;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/em2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */