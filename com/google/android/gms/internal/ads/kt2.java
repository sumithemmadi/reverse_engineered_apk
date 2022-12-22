package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class kt2 {
  public final int a;
  
  public final byte[] b;
  
  public final Map<String, String> c;
  
  public final List<yp2> d;
  
  public final boolean e;
  
  private final long f;
  
  private kt2(int paramInt, byte[] paramArrayOfbyte, Map<String, String> paramMap, List<yp2> paramList, boolean paramBoolean, long paramLong) {
    this.a = paramInt;
    this.b = paramArrayOfbyte;
    this.c = paramMap;
    if (paramList == null) {
      this.d = null;
    } else {
      this.d = Collections.unmodifiableList(paramList);
    } 
    this.e = paramBoolean;
    this.f = paramLong;
  }
  
  @Deprecated
  public kt2(int paramInt, byte[] paramArrayOfbyte, Map<String, String> paramMap, boolean paramBoolean, long paramLong) {
    this(paramInt, paramArrayOfbyte, paramMap, (List<yp2>)entry, paramBoolean, paramLong);
  }
  
  public kt2(int paramInt, byte[] paramArrayOfbyte, boolean paramBoolean, long paramLong, List<yp2> paramList) {
    this(paramInt, paramArrayOfbyte, (Map<String, String>)yp2, paramList, paramBoolean, paramLong);
  }
  
  @Deprecated
  public kt2(byte[] paramArrayOfbyte, Map<String, String> paramMap) {
    this(200, paramArrayOfbyte, paramMap, false, 0L);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/kt2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */