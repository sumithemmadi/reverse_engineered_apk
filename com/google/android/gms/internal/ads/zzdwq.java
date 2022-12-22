package com.google.android.gms.internal.ads;

public enum zzdwq {
  A, B, C, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z;
  
  private final String zzcm;
  
  static {
    zzdwq zzdwq1 = new zzdwq("JAVA_VERSION", 0, "java.version");
    b = zzdwq1;
    zzdwq zzdwq2 = new zzdwq("JAVA_VENDOR", 1, "java.vendor");
    c = zzdwq2;
    zzdwq zzdwq3 = new zzdwq("JAVA_VENDOR_URL", 2, "java.vendor.url");
    d = zzdwq3;
    zzdwq zzdwq4 = new zzdwq("JAVA_HOME", 3, "java.home");
    e = zzdwq4;
    zzdwq zzdwq5 = new zzdwq("JAVA_VM_SPECIFICATION_VERSION", 4, "java.vm.specification.version");
    f = zzdwq5;
    zzdwq zzdwq6 = new zzdwq("JAVA_VM_SPECIFICATION_VENDOR", 5, "java.vm.specification.vendor");
    g = zzdwq6;
    zzdwq zzdwq7 = new zzdwq("JAVA_VM_SPECIFICATION_NAME", 6, "java.vm.specification.name");
    h = zzdwq7;
    zzdwq zzdwq8 = new zzdwq("JAVA_VM_VERSION", 7, "java.vm.version");
    i = zzdwq8;
    zzdwq zzdwq9 = new zzdwq("JAVA_VM_VENDOR", 8, "java.vm.vendor");
    j = zzdwq9;
    zzdwq zzdwq10 = new zzdwq("JAVA_VM_NAME", 9, "java.vm.name");
    k = zzdwq10;
    zzdwq zzdwq11 = new zzdwq("JAVA_SPECIFICATION_VERSION", 10, "java.specification.version");
    l = zzdwq11;
    zzdwq zzdwq12 = new zzdwq("JAVA_SPECIFICATION_VENDOR", 11, "java.specification.vendor");
    m = zzdwq12;
    zzdwq zzdwq13 = new zzdwq("JAVA_SPECIFICATION_NAME", 12, "java.specification.name");
    n = zzdwq13;
    zzdwq zzdwq14 = new zzdwq("JAVA_CLASS_VERSION", 13, "java.class.version");
    o = zzdwq14;
    zzdwq zzdwq15 = new zzdwq("JAVA_CLASS_PATH", 14, "java.class.path");
    p = zzdwq15;
    zzdwq zzdwq16 = new zzdwq("JAVA_LIBRARY_PATH", 15, "java.library.path");
    q = zzdwq16;
    zzdwq zzdwq17 = new zzdwq("JAVA_IO_TMPDIR", 16, "java.io.tmpdir");
    r = zzdwq17;
    zzdwq zzdwq18 = new zzdwq("JAVA_COMPILER", 17, "java.compiler");
    s = zzdwq18;
    zzdwq zzdwq19 = new zzdwq("JAVA_EXT_DIRS", 18, "java.ext.dirs");
    t = zzdwq19;
    zzdwq zzdwq20 = new zzdwq("OS_NAME", 19, "os.name");
    u = zzdwq20;
    zzdwq zzdwq21 = new zzdwq("OS_ARCH", 20, "os.arch");
    v = zzdwq21;
    zzdwq zzdwq22 = new zzdwq("OS_VERSION", 21, "os.version");
    w = zzdwq22;
    zzdwq zzdwq23 = new zzdwq("FILE_SEPARATOR", 22, "file.separator");
    x = zzdwq23;
    zzdwq zzdwq24 = new zzdwq("PATH_SEPARATOR", 23, "path.separator");
    y = zzdwq24;
    zzdwq zzdwq25 = new zzdwq("LINE_SEPARATOR", 24, "line.separator");
    z = zzdwq25;
    zzdwq zzdwq26 = new zzdwq("USER_NAME", 25, "user.name");
    A = zzdwq26;
    zzdwq zzdwq27 = new zzdwq("USER_HOME", 26, "user.home");
    B = zzdwq27;
    zzdwq zzdwq28 = new zzdwq("USER_DIR", 27, "user.dir");
    C = zzdwq28;
    D = new zzdwq[] { 
        zzdwq1, zzdwq2, zzdwq3, zzdwq4, zzdwq5, zzdwq6, zzdwq7, zzdwq8, zzdwq9, zzdwq10, 
        zzdwq11, zzdwq12, zzdwq13, zzdwq14, zzdwq15, zzdwq16, zzdwq17, zzdwq18, zzdwq19, zzdwq20, 
        zzdwq21, zzdwq22, zzdwq23, zzdwq24, zzdwq25, zzdwq26, zzdwq27, zzdwq28 };
  }
  
  zzdwq(String paramString1) {
    this.zzcm = paramString1;
  }
  
  public final String toString() {
    String str1 = this.zzcm;
    String str2 = System.getProperty(str1);
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str1).length() + 1 + String.valueOf(str2).length());
    stringBuilder.append(str1);
    stringBuilder.append("=");
    stringBuilder.append(str2);
    return stringBuilder.toString();
  }
  
  public final String value() {
    return System.getProperty(this.zzcm);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzdwq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */