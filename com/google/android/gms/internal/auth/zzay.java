package com.google.android.gms.internal.auth;

public enum zzay {
  A,
  B,
  C,
  D,
  E,
  F,
  G,
  H,
  I,
  J,
  K,
  L,
  M,
  N,
  O,
  P,
  Q,
  R,
  S,
  T,
  U,
  V,
  W,
  X,
  Y,
  Z,
  a0,
  b("ClientLoginDisabled"),
  b0("ClientLoginDisabled"),
  c("DeviceManagementRequiredOrSyncDisabled"),
  d("SocketTimeout"),
  e("Ok"),
  f("UNKNOWN_ERR"),
  g("NetworkError"),
  h("ServiceUnavailable"),
  i("InternalError"),
  j("BadAuthentication"),
  k("EmptyConsumerPackageOrSig"),
  l("InvalidSecondFactor"),
  m("PostSignInFlowRequired"),
  n("NeedsBrowser"),
  o("Unknown"),
  p("NotVerified"),
  q("TermsNotAgreed"),
  r("AccountDisabled"),
  s("CaptchaRequired"),
  t("AccountDeleted"),
  u("ServiceDisabled"),
  v("NeedPermission"),
  w("NeedRemoteConsent"),
  x("INVALID_SCOPE"),
  y("UserCancel"),
  z("PermissionDenied");
  
  private final String zzek;
  
  static {
    A = new zzay("INVALID_AUDIENCE", 25, "INVALID_AUDIENCE");
    B = new zzay("UNREGISTERED_ON_API_CONSOLE", 26, "UNREGISTERED_ON_API_CONSOLE");
    C = new zzay("THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED", 27, "ThirdPartyDeviceManagementRequired");
    D = new zzay("DM_INTERNAL_ERROR", 28, "DeviceManagementInternalError");
    E = new zzay("DM_SYNC_DISABLED", 29, "DeviceManagementSyncDisabled");
    F = new zzay("DM_ADMIN_BLOCKED", 30, "DeviceManagementAdminBlocked");
    G = new zzay("DM_ADMIN_PENDING_APPROVAL", 31, "DeviceManagementAdminPendingApproval");
    H = new zzay("DM_STALE_SYNC_REQUIRED", 32, "DeviceManagementStaleSyncRequired");
    I = new zzay("DM_DEACTIVATED", 33, "DeviceManagementDeactivated");
    J = new zzay("DM_SCREENLOCK_REQUIRED", 34, "DeviceManagementScreenlockRequired");
    K = new zzay("DM_REQUIRED", 35, "DeviceManagementRequired");
    L = new zzay("ALREADY_HAS_GMAIL", 36, "ALREADY_HAS_GMAIL");
    M = new zzay("BAD_PASSWORD", 37, "WeakPassword");
    N = new zzay("BAD_REQUEST", 38, "BadRequest");
    O = new zzay("BAD_USERNAME", 39, "BadUsername");
    P = new zzay("DELETED_GMAIL", 40, "DeletedGmail");
    Q = new zzay("EXISTING_USERNAME", 41, "ExistingUsername");
    R = new zzay("LOGIN_FAIL", 42, "LoginFail");
    S = new zzay("NOT_LOGGED_IN", 43, "NotLoggedIn");
    T = new zzay("NO_GMAIL", 44, "NoGmail");
    U = new zzay("REQUEST_DENIED", 45, "RequestDenied");
    V = new zzay("SERVER_ERROR", 46, "ServerError");
    W = new zzay("USERNAME_UNAVAILABLE", 47, "UsernameUnavailable");
    X = new zzay("GPLUS_OTHER", 48, "GPlusOther");
    Y = new zzay("GPLUS_NICKNAME", 49, "GPlusNickname");
    Z = new zzay("GPLUS_INVALID_CHAR", 50, "GPlusInvalidChar");
    a0 = new zzay("GPLUS_INTERSTITIAL", 51, "GPlusInterstitial");
    b0 = new zzay("GPLUS_PROFILE_ERROR", 52, "ProfileUpgradeError");
    c0 = new zzay[] { 
        b, c, d, e, f, g, h, i, j, k, 
        l, m, n, o, p, q, r, s, t, u, 
        v, w, x, y, z, A, B, C, D, E, 
        F, G, H, I, J, K, L, M, N, O, 
        P, Q, R, S, T, U, V, W, X, Y, 
        Z, a0, b0 };
  }
  
  zzay(String paramString1) {
    this.zzek = paramString1;
  }
  
  public static boolean zza(zzay paramzzay) {
    return (j.equals(paramzzay) || s.equals(paramzzay) || v.equals(paramzzay) || w.equals(paramzzay) || n.equals(paramzzay) || y.equals(paramzzay) || c.equals(paramzzay) || D.equals(paramzzay) || E.equals(paramzzay) || F.equals(paramzzay) || G.equals(paramzzay) || H.equals(paramzzay) || I.equals(paramzzay) || K.equals(paramzzay) || C.equals(paramzzay) || J.equals(paramzzay));
  }
  
  public static final zzay zzc(String paramString) {
    zzay[] arrayOfZzay = values();
    int i = arrayOfZzay.length;
    zzay zzay1 = null;
    for (byte b = 0; b < i; b++) {
      zzay zzay2 = arrayOfZzay[b];
      if (zzay2.zzek.equals(paramString))
        zzay1 = zzay2; 
    } 
    return zzay1;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/auth/zzay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */