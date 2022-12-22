package androidx.work;

public enum NetworkType {
  b, c, d, e, f;
  
  static {
    NetworkType networkType1 = new NetworkType("NOT_REQUIRED", 0);
    b = networkType1;
    NetworkType networkType2 = new NetworkType("CONNECTED", 1);
    c = networkType2;
    NetworkType networkType3 = new NetworkType("UNMETERED", 2);
    d = networkType3;
    NetworkType networkType4 = new NetworkType("NOT_ROAMING", 3);
    e = networkType4;
    NetworkType networkType5 = new NetworkType("METERED", 4);
    f = networkType5;
    g = new NetworkType[] { networkType1, networkType2, networkType3, networkType4, networkType5 };
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/NetworkType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */