package com.google.android.gms.internal.ads;

public enum zztw$zza$zza implements p42 {
  A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z;
  
  private static final o42<zztw$zza$zza> X;
  
  private final int value;
  
  static {
    zztw$zza$zza zztw$zza$zza1 = new zztw$zza$zza("UNKNOWN_EVENT_TYPE", 0, 0);
    b = zztw$zza$zza1;
    zztw$zza$zza zztw$zza$zza2 = new zztw$zza$zza("AD_REQUEST", 1, 1);
    c = zztw$zza$zza2;
    zztw$zza$zza zztw$zza$zza3 = new zztw$zza$zza("AD_LOADED", 2, 2);
    d = zztw$zza$zza3;
    zztw$zza$zza zztw$zza$zza4 = new zztw$zza$zza("AD_IMPRESSION", 3, 5);
    e = zztw$zza$zza4;
    zztw$zza$zza zztw$zza$zza5 = new zztw$zza$zza("AD_FIRST_CLICK", 4, 6);
    f = zztw$zza$zza5;
    zztw$zza$zza zztw$zza$zza6 = new zztw$zza$zza("AD_SUBSEQUENT_CLICK", 5, 7);
    g = zztw$zza$zza6;
    zztw$zza$zza zztw$zza$zza7 = new zztw$zza$zza("REQUEST_WILL_START", 6, 8);
    h = zztw$zza$zza7;
    zztw$zza$zza zztw$zza$zza8 = new zztw$zza$zza("REQUEST_DID_END", 7, 9);
    i = zztw$zza$zza8;
    zztw$zza$zza zztw$zza$zza9 = new zztw$zza$zza("REQUEST_WILL_UPDATE_SIGNALS", 8, 10);
    j = zztw$zza$zza9;
    zztw$zza$zza zztw$zza$zza10 = new zztw$zza$zza("REQUEST_DID_UPDATE_SIGNALS", 9, 11);
    k = zztw$zza$zza10;
    zztw$zza$zza zztw$zza$zza11 = new zztw$zza$zza("REQUEST_WILL_BUILD_URL", 10, 12);
    l = zztw$zza$zza11;
    zztw$zza$zza zztw$zza$zza12 = new zztw$zza$zza("REQUEST_DID_BUILD_URL", 11, 13);
    m = zztw$zza$zza12;
    zztw$zza$zza zztw$zza$zza13 = new zztw$zza$zza("REQUEST_WILL_MAKE_NETWORK_REQUEST", 12, 14);
    n = zztw$zza$zza13;
    zztw$zza$zza zztw$zza$zza14 = new zztw$zza$zza("REQUEST_DID_RECEIVE_NETWORK_RESPONSE", 13, 15);
    o = zztw$zza$zza14;
    zztw$zza$zza zztw$zza$zza15 = new zztw$zza$zza("REQUEST_WILL_PROCESS_RESPONSE", 14, 16);
    p = zztw$zza$zza15;
    zztw$zza$zza zztw$zza$zza16 = new zztw$zza$zza("REQUEST_DID_PROCESS_RESPONSE", 15, 17);
    q = zztw$zza$zza16;
    zztw$zza$zza zztw$zza$zza17 = new zztw$zza$zza("REQUEST_WILL_RENDER", 16, 18);
    r = zztw$zza$zza17;
    zztw$zza$zza zztw$zza$zza18 = new zztw$zza$zza("REQUEST_DID_RENDER", 17, 19);
    s = zztw$zza$zza18;
    zztw$zza$zza zztw$zza$zza19 = new zztw$zza$zza("AD_FAILED_TO_LOAD", 18, 3);
    t = zztw$zza$zza19;
    zztw$zza$zza zztw$zza$zza20 = new zztw$zza$zza("AD_FAILED_TO_LOAD_NO_FILL", 19, 4);
    u = zztw$zza$zza20;
    zztw$zza$zza zztw$zza$zza21 = new zztw$zza$zza("AD_FAILED_TO_LOAD_INVALID_REQUEST", 20, 100);
    v = zztw$zza$zza21;
    zztw$zza$zza zztw$zza$zza22 = new zztw$zza$zza("AD_FAILED_TO_LOAD_NETWORK_ERROR", 21, 101);
    w = zztw$zza$zza22;
    zztw$zza$zza zztw$zza$zza23 = new zztw$zza$zza("AD_FAILED_TO_LOAD_TIMEOUT", 22, 102);
    x = zztw$zza$zza23;
    zztw$zza$zza zztw$zza$zza24 = new zztw$zza$zza("AD_FAILED_TO_LOAD_CANCELLED", 23, 103);
    y = zztw$zza$zza24;
    zztw$zza$zza zztw$zza$zza25 = new zztw$zza$zza("AD_FAILED_TO_LOAD_NO_ERROR", 24, 104);
    z = zztw$zza$zza25;
    zztw$zza$zza zztw$zza$zza26 = new zztw$zza$zza("AD_FAILED_TO_LOAD_NOT_FOUND", 25, 105);
    A = zztw$zza$zza26;
    zztw$zza$zza zztw$zza$zza27 = new zztw$zza$zza("REQUEST_WILL_UPDATE_GMS_SIGNALS", 26, 1000);
    B = zztw$zza$zza27;
    zztw$zza$zza zztw$zza$zza28 = new zztw$zza$zza("REQUEST_DID_UPDATE_GMS_SIGNALS", 27, 1001);
    C = zztw$zza$zza28;
    zztw$zza$zza zztw$zza$zza29 = new zztw$zza$zza("REQUEST_FAILED_TO_UPDATE_GMS_SIGNALS", 28, 1002);
    D = zztw$zza$zza29;
    zztw$zza$zza zztw$zza$zza30 = new zztw$zza$zza("REQUEST_FAILED_TO_BUILD_URL", 29, 1003);
    E = zztw$zza$zza30;
    zztw$zza$zza zztw$zza$zza31 = new zztw$zza$zza("REQUEST_FAILED_TO_MAKE_NETWORK_REQUEST", 30, 1004);
    F = zztw$zza$zza31;
    zztw$zza$zza zztw$zza$zza32 = new zztw$zza$zza("REQUEST_FAILED_TO_PROCESS_RESPONSE", 31, 1005);
    G = zztw$zza$zza32;
    zztw$zza$zza zztw$zza$zza33 = new zztw$zza$zza("REQUEST_FAILED_TO_UPDATE_SIGNALS", 32, 1006);
    H = zztw$zza$zza33;
    zztw$zza$zza zztw$zza$zza34 = new zztw$zza$zza("REQUEST_FAILED_TO_RENDER", 33, 1007);
    I = zztw$zza$zza34;
    zztw$zza$zza zztw$zza$zza35 = new zztw$zza$zza("REQUEST_IS_PREFETCH", 34, 1100);
    J = zztw$zza$zza35;
    zztw$zza$zza zztw$zza$zza36 = new zztw$zza$zza("REQUEST_SAVED_TO_CACHE", 35, 1101);
    K = zztw$zza$zza36;
    zztw$zza$zza zztw$zza$zza37 = new zztw$zza$zza("REQUEST_LOADED_FROM_CACHE", 36, 1102);
    L = zztw$zza$zza37;
    zztw$zza$zza zztw$zza$zza38 = new zztw$zza$zza("REQUEST_PREFETCH_INTERCEPTED", 37, 1103);
    M = zztw$zza$zza38;
    zztw$zza$zza zztw$zza$zza39 = new zztw$zza$zza("REQUESTED_CACHE_KEY_FROM_SERVICE_SUCCEEDED", 38, 1104);
    N = zztw$zza$zza39;
    zztw$zza$zza zztw$zza$zza40 = new zztw$zza$zza("REQUESTED_CACHE_KEY_FROM_SERVICE_FAILED", 39, 1105);
    O = zztw$zza$zza40;
    zztw$zza$zza zztw$zza$zza41 = new zztw$zza$zza("NOTIFIED_CACHE_HIT_TO_SERVICE_SUCCEEDED", 40, 1106);
    P = zztw$zza$zza41;
    zztw$zza$zza zztw$zza$zza42 = new zztw$zza$zza("NOTIFIED_CACHE_HIT_TO_SERVICE_FAILED", 41, 1107);
    Q = zztw$zza$zza42;
    zztw$zza$zza zztw$zza$zza43 = new zztw$zza$zza("REQUEST_FAILED_TO_LOAD_FROM_CACHE", 42, 1108);
    R = zztw$zza$zza43;
    zztw$zza$zza zztw$zza$zza44 = new zztw$zza$zza("BANNER_SIZE_INVALID", 43, 10000);
    S = zztw$zza$zza44;
    zztw$zza$zza zztw$zza$zza45 = new zztw$zza$zza("BANNER_SIZE_VALID", 44, 10001);
    T = zztw$zza$zza45;
    zztw$zza$zza zztw$zza$zza46 = new zztw$zza$zza("ANDROID_WEBVIEW_CRASH", 45, 10002);
    U = zztw$zza$zza46;
    zztw$zza$zza zztw$zza$zza47 = new zztw$zza$zza("OFFLINE_UPLOAD", 46, 10003);
    V = zztw$zza$zza47;
    zztw$zza$zza zztw$zza$zza48 = new zztw$zza$zza("DELAY_PAGE_LOAD_CANCELLED_AD", 47, 10004);
    W = zztw$zza$zza48;
    Y = new zztw$zza$zza[] { 
        zztw$zza$zza1, zztw$zza$zza2, zztw$zza$zza3, zztw$zza$zza4, zztw$zza$zza5, zztw$zza$zza6, zztw$zza$zza7, zztw$zza$zza8, zztw$zza$zza9, zztw$zza$zza10, 
        zztw$zza$zza11, zztw$zza$zza12, zztw$zza$zza13, zztw$zza$zza14, zztw$zza$zza15, zztw$zza$zza16, zztw$zza$zza17, zztw$zza$zza18, zztw$zza$zza19, zztw$zza$zza20, 
        zztw$zza$zza21, zztw$zza$zza22, zztw$zza$zza23, zztw$zza$zza24, zztw$zza$zza25, zztw$zza$zza26, zztw$zza$zza27, zztw$zza$zza28, zztw$zza$zza29, zztw$zza$zza30, 
        zztw$zza$zza31, zztw$zza$zza32, zztw$zza$zza33, zztw$zza$zza34, zztw$zza$zza35, zztw$zza$zza36, zztw$zza$zza37, zztw$zza$zza38, zztw$zza$zza39, zztw$zza$zza40, 
        zztw$zza$zza41, zztw$zza$zza42, zztw$zza$zza43, zztw$zza$zza44, zztw$zza$zza45, zztw$zza$zza46, zztw$zza$zza47, zztw$zza$zza48 };
    X = new co2();
  }
  
  zztw$zza$zza(int paramInt1) {
    this.value = paramInt1;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("<");
    stringBuilder.append(zztw$zza$zza.class.getName());
    stringBuilder.append('@');
    stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    stringBuilder.append(" number=");
    stringBuilder.append(this.value);
    stringBuilder.append(" name=");
    stringBuilder.append(name());
    stringBuilder.append('>');
    return stringBuilder.toString();
  }
  
  public final int zzv() {
    return this.value;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zztw$zza$zza.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */