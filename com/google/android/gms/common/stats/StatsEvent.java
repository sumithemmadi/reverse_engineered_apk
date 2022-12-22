package com.google.android.gms.common.stats;

import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public abstract class StatsEvent extends AbstractSafeParcelable implements ReflectedParcelable {
  public abstract long o0();
  
  public abstract int p0();
  
  public abstract long q0();
  
  public abstract String r0();
  
  public String toString() {
    long l1 = o0();
    int i = p0();
    long l2 = q0();
    String str = r0();
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 53);
    stringBuilder.append(l1);
    stringBuilder.append("\t");
    stringBuilder.append(i);
    stringBuilder.append("\t");
    stringBuilder.append(l2);
    stringBuilder.append(str);
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/stats/StatsEvent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */