package com.google.android.datatransport.cct.internal;

import android.util.SparseArray;

public enum QosTier {
  b, c, d, e, f, g;
  
  private static final SparseArray<QosTier> h;
  
  private final int value;
  
  static {
    QosTier qosTier1 = new QosTier("DEFAULT", 0, 0);
    b = qosTier1;
    QosTier qosTier2 = new QosTier("UNMETERED_ONLY", 1, 1);
    c = qosTier2;
    QosTier qosTier3 = new QosTier("UNMETERED_OR_DAILY", 2, 2);
    d = qosTier3;
    QosTier qosTier4 = new QosTier("FAST_IF_RADIO_AWAKE", 3, 3);
    e = qosTier4;
    QosTier qosTier5 = new QosTier("NEVER", 4, 4);
    f = qosTier5;
    QosTier qosTier6 = new QosTier("UNRECOGNIZED", 5, -1);
    g = qosTier6;
    i = new QosTier[] { qosTier1, qosTier2, qosTier3, qosTier4, qosTier5, qosTier6 };
    SparseArray<QosTier> sparseArray = new SparseArray();
    h = sparseArray;
    sparseArray.put(0, qosTier1);
    sparseArray.put(1, qosTier2);
    sparseArray.put(2, qosTier3);
    sparseArray.put(3, qosTier4);
    sparseArray.put(4, qosTier5);
    sparseArray.put(-1, qosTier6);
  }
  
  QosTier(int paramInt1) {
    this.value = paramInt1;
  }
  
  public static QosTier forNumber(int paramInt) {
    return (paramInt != 0) ? ((paramInt != 1) ? ((paramInt != 2) ? ((paramInt != 3) ? ((paramInt != 4) ? null : f) : e) : d) : c) : b;
  }
  
  public final int getNumber() {
    return this.value;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/cct/internal/QosTier.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */