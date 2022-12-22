package com.allinone.callerid.util;

import android.content.Context;
import com.allinone.callerid.main.EZCallApplication;

public class b1 {
  public static long A() {
    return f0.c("ShowcallerMain", "incoming_time", 0L);
  }
  
  public static boolean A0() {
    return f0.a("ShowcallerMain", "under_min_version", false);
  }
  
  public static void A1(long paramLong) {
    f0.h("ShowcallerMain", "last_collect_time", paramLong);
  }
  
  public static int A2() {
    return f0.b("ShowcallerMain", "current_theme", 0);
  }
  
  public static boolean B() {
    return f0.a("ShowcallerMain", "init_overlay", true);
  }
  
  public static String B0() {
    return f0.e("ShowcallerMain", "wake_date_time", "0");
  }
  
  public static void B1(long paramLong) {
    f0.h("ShowcallerMain", "last_download_time", paramLong);
  }
  
  public static Boolean B2() {
    return Boolean.valueOf(f0.a("ShowcallerMain", "use_new_call_end", false));
  }
  
  public static long C() {
    return f0.c("ShowcallerMain", "install_app_time", 0L);
  }
  
  public static int C0() {
    return f0.b("ShowcallerMain", "xuanfu_position", j.a((Context)EZCallApplication.c(), 190.0F));
  }
  
  public static void C1(long paramLong) {
    f0.h("ShowcallerMain", "last_search_time", paramLong);
  }
  
  public static void C2(Boolean paramBoolean) {
    f0.f("ShowcallerMain", "blocknotice", paramBoolean.booleanValue());
  }
  
  public static boolean D() {
    return f0.a("ShowcallerMain", "block_hangup", false);
  }
  
  public static boolean D0() {
    return f0.a("ShowcallerMain", "xuan_fu_yin_dao", true);
  }
  
  public static void D1(long paramLong) {
    f0.h("ShowcallerMain", "launch_app_time", paramLong);
  }
  
  public static void D2(Boolean paramBoolean) {
    f0.f("ShowcallerMain", "can_show_recommend_new_new", paramBoolean.booleanValue());
  }
  
  public static boolean E() {
    return f0.a("ShowcallerMain", "caller_dialer", false);
  }
  
  public static void E0(long paramLong) {
    f0.h("ShowcallerMain", "answer_time", paramLong);
  }
  
  public static void E1(long paramLong) {
    f0.h("ShowcallerMain", "launch_app_time", paramLong);
  }
  
  public static void E2(Boolean paramBoolean) {
    f0.f("ShowcallerMain", "can_show_self", paramBoolean.booleanValue());
  }
  
  public static boolean F() {
    return f0.a("ShowcallerMain", "is_can_animation", true);
  }
  
  public static void F0(boolean paramBoolean) {
    f0.f("ShowcallerMain", "battery_optimize_info", paramBoolean);
  }
  
  public static void F1(String paramString) {
    f0.i("ShowcallerMain", "local_ip", paramString);
  }
  
  public static void F2(Boolean paramBoolean) {
    f0.f("ShowcallerMain", "can_show_share_tip", paramBoolean.booleanValue());
  }
  
  public static boolean G() {
    return f0.a("ShowcallerMain", "is_custm_block", false);
  }
  
  public static void G0(long paramLong) {
    f0.h("ShowcallerMain", "buyu_enabled_time", paramLong);
  }
  
  public static void G1(int paramInt) {
    f0.g("ShowcallerMain", "position", paramInt);
  }
  
  public static void G2(Boolean paramBoolean) {
    f0.f("ShowcallerMain", "can_show_speaker", paramBoolean.booleanValue());
  }
  
  public static boolean H() {
    return f0.a("ShowcallerMain", "isdeaultsim", false);
  }
  
  public static void H0(boolean paramBoolean) {
    f0.f("ShowcallerMain", "buyu_token_max", paramBoolean);
  }
  
  public static void H1(long paramLong) {
    f0.h("ShowcallerMain", "mid_time", paramLong);
  }
  
  public static void H2(Boolean paramBoolean) {
    f0.f("ShowcallerMain", "incominghangup", paramBoolean.booleanValue());
  }
  
  public static boolean I() {
    return f0.a("ShowcallerMain", "is_first_close_rate", true);
  }
  
  public static void I0(boolean paramBoolean) {
    f0.f("ShowcallerMain", "can_coll_wiki", paramBoolean);
  }
  
  public static void I1(long paramLong) {
    f0.h("ShowcallerMain", "min_update_time", paramLong);
  }
  
  public static void I2(Boolean paramBoolean) {
    f0.f("ShowcallerMain", "is_auto_block", paramBoolean.booleanValue());
  }
  
  public static boolean J() {
    return f0.a("ShowcallerMain", "is_first_install", true);
  }
  
  public static void J0(boolean paramBoolean) {
    f0.f("ShowcallerMain", "can_open_alive", paramBoolean);
  }
  
  public static void J1(long paramLong) {
    f0.h("ShowcallerMain", "admob_missed", paramLong);
  }
  
  public static void J2(Boolean paramBoolean) {
    f0.f("ShowcallerMain", "is_block_and_end", paramBoolean.booleanValue());
  }
  
  public static boolean K() {
    return f0.a("ShowcallerMain", "set_first_install_time", true);
  }
  
  public static void K0(boolean paramBoolean) {
    f0.f("ShowcallerMain", "can_show_premium", paramBoolean);
  }
  
  public static void K1(long paramLong) {
    f0.h("ShowcallerMain", "missed_awaketime", paramLong);
  }
  
  public static void K2(Boolean paramBoolean) {
    f0.f("ShowcallerMain", "is_block_and_end", paramBoolean.booleanValue());
  }
  
  public static boolean L() {
    return f0.a("ShowcallerMain", "is_short_cut", true);
  }
  
  public static void L0(boolean paramBoolean) {
    f0.f("ShowcallerMain", "can_show_spam", paramBoolean);
  }
  
  public static void L1(int paramInt) {
    f0.g("ShowcallerMain", "missed_unknowncount", paramInt);
  }
  
  public static void L2(Boolean paramBoolean) {
    f0.f("ShowcallerMain", "is_can_show_circle_point", paramBoolean.booleanValue());
  }
  
  public static boolean M() {
    return f0.a("ShowcallerMain", "show_create_shortcut", false);
  }
  
  public static void M0(long paramLong) {
    f0.h("ShowcallerMain", "update_time", paramLong);
  }
  
  public static void M1(long paramLong) {
    f0.h("ShowcallerMain", "offline_time", paramLong);
  }
  
  public static void M2(Boolean paramBoolean) {
    f0.f("ShowcallerMain", "is_can_start_collect_job", paramBoolean.booleanValue());
  }
  
  public static boolean N() {
    return f0.a("ShowcallerMain", "is_show_one_block", false);
  }
  
  public static void N0(String paramString) {
    f0.i("ShowcallerMain", "choose_cc", paramString);
  }
  
  public static void N1(long paramLong) {
    f0.h("ShowcallerMain", "parser_ip_time", paramLong);
  }
  
  public static void N2(Boolean paramBoolean) {
    f0.f("ShowcallerMain", "missednotice", paramBoolean.booleanValue());
  }
  
  public static boolean O() {
    return f0.a("ShowcallerMain", "private_block_tip", true);
  }
  
  public static void O0(String paramString) {
    f0.i("ShowcallerMain", "choose_country", paramString);
  }
  
  public static void O1(int paramInt) {
    f0.g("ShowcallerMain", "report_count", paramInt);
  }
  
  public static void O2(Boolean paramBoolean) {
    f0.f("ShowcallerMain", "new_call_end_failed", paramBoolean.booleanValue());
  }
  
  public static boolean P() {
    return f0.a("ShowcallerMain", "is_show_quick_contact", true);
  }
  
  public static void P0(String paramString) {
    f0.i("ShowcallerMain", "choose_iso", paramString);
  }
  
  public static void P1(int paramInt) {
    f0.g("ShowcallerMain", "search_number_count", paramInt);
  }
  
  public static void P2(Boolean paramBoolean) {
    f0.f("ShowcallerMain", "new_call_end_failed", paramBoolean.booleanValue());
  }
  
  public static boolean Q() {
    return f0.a("ShowcallerMain", "is_show_red", true);
  }
  
  public static void Q0(long paramLong) {
    f0.h("ShowcallerMain", "click_time", paramLong);
  }
  
  public static void Q1(long paramLong) {
    f0.h("ShowcallerMain", "share_show_time", paramLong);
  }
  
  public static void Q2() {
    f0.h("ShowcallerMain", "OfflineDownloadTime", System.currentTimeMillis());
  }
  
  public static boolean R() {
    return f0.a("ShowcallerMain", "is_show_shortcut", true);
  }
  
  public static void R0(int paramInt) {
    f0.g("ShowcallerMain", "close_recommend_dialog_count_new_new", paramInt);
  }
  
  public static void R1(boolean paramBoolean) {
    f0.f("ShowcallerMain", "copy_number", paramBoolean);
  }
  
  public static void R2(Boolean paramBoolean) {
    f0.f("ShowcallerMain", "old_call_end_usable", paramBoolean.booleanValue());
  }
  
  public static boolean S() {
    return f0.a("ShowcallerMain", "is_spam", false);
  }
  
  public static void S0(String paramString) {
    f0.i("ShowcallerMain", "current_uuid", paramString);
  }
  
  public static void S1(boolean paramBoolean) {
    f0.f("ShowcallerMain", "copy_dialog", paramBoolean);
  }
  
  public static void S2(Boolean paramBoolean) {
    f0.f("ShowcallerMain", "outgoinghangup", paramBoolean.booleanValue());
  }
  
  public static boolean T() {
    return f0.a("ShowcallerMain", "is_spam_or_name", false);
  }
  
  public static void T0(String paramString) {
    f0.i("ShowcallerMain", "show_current_version", paramString);
  }
  
  public static void T1(boolean paramBoolean) {
    f0.f("ShowcallerMain", "show_miss_dia", paramBoolean);
  }
  
  public static void T2(int paramInt) {
    f0.g("ShowcallerMain", "current_theme", paramInt);
  }
  
  public static long U() {
    return f0.c("ShowcallerMain", "last_calllog_time", 0L);
  }
  
  public static void U0(int paramInt) {
    f0.g("ShowcallerMain", "default_slotid", paramInt);
  }
  
  public static void U1(boolean paramBoolean) {
    f0.f("ShowcallerMain", "show_new_tui", paramBoolean);
  }
  
  public static void U2(Boolean paramBoolean) {
    f0.f("ShowcallerMain", "use_new_call_end", paramBoolean.booleanValue());
  }
  
  public static long V() {
    return f0.c("ShowcallerMain", "last_collect_time", 0L);
  }
  
  public static void V0(boolean paramBoolean) {
    f0.f("ShowcallerMain", "download_full_dose", paramBoolean);
  }
  
  public static void V1(boolean paramBoolean) {
    f0.f("ShowcallerMain", "show_notifi", paramBoolean);
  }
  
  public static void V2(Boolean paramBoolean) {
    f0.f("ShowcallerMain", "use_new_call_end", paramBoolean.booleanValue());
  }
  
  public static long W() {
    return f0.c("ShowcallerMain", "last_download_time", 0L);
  }
  
  public static void W0(boolean paramBoolean) {
    f0.f("ShowcallerMain", "enable_keep_alive", paramBoolean);
  }
  
  public static void W1(long paramLong) {
    f0.h("ShowcallerMain", "show_overlay_time", paramLong);
  }
  
  public static long X() {
    return f0.c("ShowcallerMain", "last_search_time", System.currentTimeMillis());
  }
  
  public static void X0(boolean paramBoolean) {
    f0.f("ShowcallerMain", "enable_stay_alive", paramBoolean);
  }
  
  public static void X1(boolean paramBoolean) {
    f0.f("ShowcallerMain", "rate_us", paramBoolean);
  }
  
  public static long Y() {
    return f0.c("ShowcallerMain", "launch_app_time", 0L);
  }
  
  public static void Y0(boolean paramBoolean) {
    f0.f("ShowcallerMain", "enalbe_block", paramBoolean);
  }
  
  public static void Y1(long paramLong) {
    f0.h("ShowcallerMain", "rate_time", paramLong);
  }
  
  public static String Z() {
    return f0.e("ShowcallerMain", "local_ip", "");
  }
  
  public static void Z0(boolean paramBoolean) {
    f0.f("ShowcallerMain", "enalbe_unknow_block", paramBoolean);
  }
  
  public static void Z1(long paramLong) {
    f0.h("ShowcallerMain", "show_recommend_dialog_time_new_new", paramLong);
  }
  
  public static long a() {
    return f0.c("ShowcallerMain", "answer_time", 0L);
  }
  
  public static int a0() {
    return f0.b("ShowcallerMain", "position", -1);
  }
  
  public static void a1(boolean paramBoolean) {
    f0.f("ShowcallerMain", "enalbe_unknow_number", paramBoolean);
  }
  
  public static void a2(boolean paramBoolean) {
    f0.f("ShowcallerMain", "show_tip_vest", paramBoolean);
  }
  
  public static boolean b() {
    return f0.a("ShowcallerMain", "battery_optimize_info", true);
  }
  
  public static long b0() {
    return f0.c("ShowcallerMain", "mid_time", 0L);
  }
  
  public static void b1(long paramLong) {
    f0.h("ShowcallerMain", "fbtime", paramLong);
  }
  
  public static void b2(boolean paramBoolean) {
    f0.f("ShowcallerMain", "show_xuan_fu", paramBoolean);
  }
  
  public static long c() {
    return f0.c("ShowcallerMain", "buyu_enabled_time", 0L);
  }
  
  public static long c0() {
    return f0.c("ShowcallerMain", "min_update_time", 0L);
  }
  
  public static void c1(long paramLong) {
    f0.h("ShowcallerMain", "first_install_time", paramLong);
  }
  
  public static void c2(boolean paramBoolean) {
    f0.f("ShowcallerMain", "show_xuan_fu_c", paramBoolean);
  }
  
  public static boolean d() {
    return f0.a("ShowcallerMain", "buyu_token_max", false);
  }
  
  public static long d0() {
    return f0.c("ShowcallerMain", "admob_missed", 0L);
  }
  
  public static void d1(long paramLong) {
    f0.h("ShowcallerMain", "addcontant_g", paramLong);
  }
  
  public static void d2(int paramInt) {
    f0.g("ShowcallerMain", "spam_counts", paramInt);
  }
  
  public static boolean e() {
    return f0.a("ShowcallerMain", "can_coll_wiki", true);
  }
  
  public static long e0() {
    return f0.c("ShowcallerMain", "missed_awaketime", 0L);
  }
  
  public static void e1(long paramLong) {
    f0.h("ShowcallerMain", "incoming_time", paramLong);
  }
  
  public static void e2(int paramInt) {
    f0.g("ShowcallerMain", "xuanfu_style", paramInt);
  }
  
  public static boolean f() {
    return f0.a("ShowcallerMain", "can_open_alive", true);
  }
  
  public static int f0() {
    return f0.b("ShowcallerMain", "missed_unknowncount", 0);
  }
  
  public static void f1(boolean paramBoolean) {
    f0.f("ShowcallerMain", "init_overlay", paramBoolean);
  }
  
  public static void f2(String paramString) {
    f0.i("ShowcallerMain", "switchl", paramString);
  }
  
  public static boolean g() {
    return f0.a("ShowcallerMain", "can_show_premium", true);
  }
  
  public static long g0() {
    return f0.c("ShowcallerMain", "offline_time", 0L);
  }
  
  public static void g1(long paramLong) {
    f0.h("ShowcallerMain", "install_app_time", paramLong);
  }
  
  public static void g2(boolean paramBoolean) {
    f0.f("ShowcallerMain", "theme_system_default", paramBoolean);
  }
  
  public static boolean h() {
    return f0.a("ShowcallerMain", "can_show_spam", true);
  }
  
  public static long h0() {
    return f0.c("ShowcallerMain", "parser_ip_time", 0L);
  }
  
  public static void h1(boolean paramBoolean) {
    f0.f("ShowcallerMain", "block_hangup", paramBoolean);
  }
  
  public static void h2(boolean paramBoolean) {
    f0.f("ShowcallerMain", "under_min_version", paramBoolean);
  }
  
  public static long i() {
    return f0.c("ShowcallerMain", "update_time", 0L);
  }
  
  public static int i0() {
    return f0.b("ShowcallerMain", "report_count", 0);
  }
  
  public static void i1(boolean paramBoolean) {
    f0.f("ShowcallerMain", "block_hangup", paramBoolean);
  }
  
  public static void i2(String paramString) {
    f0.i("ShowcallerMain", "wake_date_time", paramString);
  }
  
  public static String j() {
    return f0.e("ShowcallerMain", "choose_cc", "");
  }
  
  public static int j0() {
    return f0.b("ShowcallerMain", "search_number_count", 0);
  }
  
  public static void j1(boolean paramBoolean) {
    f0.f("ShowcallerMain", "caller_dialer", paramBoolean);
  }
  
  public static void j2(String paramString) {
    f0.i("ShowcallerMain", "wake_date_time", paramString);
  }
  
  public static String k() {
    return f0.e("ShowcallerMain", "choose_country", "");
  }
  
  public static long k0() {
    return f0.c("ShowcallerMain", "share_show_time", 0L);
  }
  
  public static void k1(boolean paramBoolean) {
    f0.f("ShowcallerMain", "is_can_animation", paramBoolean);
  }
  
  public static void k2(int paramInt) {
    f0.g("ShowcallerMain", "xuanfu_position", paramInt);
  }
  
  public static String l() {
    return f0.e("ShowcallerMain", "choose_iso", "");
  }
  
  public static boolean l0() {
    return f0.a("ShowcallerMain", "copy_number", true);
  }
  
  public static void l1(boolean paramBoolean) {
    f0.f("ShowcallerMain", "is_custm_block", paramBoolean);
  }
  
  public static void l2(boolean paramBoolean) {
    f0.f("ShowcallerMain", "xuan_fu_yin_dao", paramBoolean);
  }
  
  public static long m() {
    return f0.c("ShowcallerMain", "click_time", 0L);
  }
  
  public static boolean m0() {
    return f0.a("ShowcallerMain", "copy_dialog", true);
  }
  
  public static void m1(boolean paramBoolean) {
    f0.f("ShowcallerMain", "isdeaultsim", paramBoolean);
  }
  
  public static Boolean m2() {
    return Boolean.valueOf(f0.a("ShowcallerMain", "blocknotice", true));
  }
  
  public static int n() {
    return f0.b("ShowcallerMain", "close_recommend_dialog_count_new_new", 0);
  }
  
  public static boolean n0() {
    return f0.a("ShowcallerMain", "show_miss_dia", true);
  }
  
  public static void n1(boolean paramBoolean) {
    f0.f("ShowcallerMain", "is_first_close_rate", paramBoolean);
  }
  
  public static Boolean n2() {
    return Boolean.valueOf(f0.a("ShowcallerMain", "can_show_self", true));
  }
  
  public static String o() {
    return f0.e("ShowcallerMain", "current_uuid", "");
  }
  
  public static boolean o0() {
    return f0.a("ShowcallerMain", "show_new_tui", true);
  }
  
  public static void o1(boolean paramBoolean) {
    f0.f("ShowcallerMain", "is_first_install", paramBoolean);
  }
  
  public static Boolean o2() {
    return Boolean.valueOf(f0.a("ShowcallerMain", "can_show_share_tip", true));
  }
  
  public static String p() {
    return f0.e("ShowcallerMain", "show_current_version", "");
  }
  
  public static boolean p0() {
    return f0.a("ShowcallerMain", "show_notifi", true);
  }
  
  public static void p1(boolean paramBoolean) {
    f0.f("ShowcallerMain", "set_first_install_time", paramBoolean);
  }
  
  public static Boolean p2() {
    return Boolean.valueOf(f0.a("ShowcallerMain", "can_show_speaker", true));
  }
  
  public static int q() {
    return f0.b("ShowcallerMain", "default_slotid", -1);
  }
  
  public static long q0() {
    return f0.c("ShowcallerMain", "show_overlay_time", 0L);
  }
  
  public static void q1(boolean paramBoolean) {
    f0.f("ShowcallerMain", "is_short_cut", paramBoolean);
  }
  
  public static Boolean q2() {
    return Boolean.valueOf(f0.a("ShowcallerMain", "incominghangup", true));
  }
  
  public static boolean r() {
    return f0.a("ShowcallerMain", "download_full_dose", false);
  }
  
  public static boolean r0() {
    return f0.a("ShowcallerMain", "rate_us", true);
  }
  
  public static void r1(boolean paramBoolean) {
    f0.f("ShowcallerMain", "show_create_shortcut", paramBoolean);
  }
  
  public static Boolean r2() {
    return Boolean.valueOf(f0.a("ShowcallerMain", "is_auto_block", false));
  }
  
  public static boolean s() {
    return f0.a("ShowcallerMain", "enable_keep_alive", true);
  }
  
  public static long s0() {
    return f0.c("ShowcallerMain", "rate_time", 0L);
  }
  
  public static void s1(boolean paramBoolean) {
    f0.f("ShowcallerMain", "is_show_one_block", paramBoolean);
  }
  
  public static Boolean s2() {
    return Boolean.valueOf(f0.a("ShowcallerMain", "is_block_and_end", false));
  }
  
  public static boolean t() {
    return f0.a("ShowcallerMain", "enable_stay_alive", true);
  }
  
  public static boolean t0() {
    return f0.a("ShowcallerMain", "show_tip_vest", true);
  }
  
  public static void t1(boolean paramBoolean) {
    f0.f("ShowcallerMain", "private_block_tip", paramBoolean);
  }
  
  public static Boolean t2() {
    return Boolean.valueOf(f0.a("ShowcallerMain", "is_can_show_circle_point", true));
  }
  
  public static boolean u() {
    return f0.a("ShowcallerMain", "enalbe_block", true);
  }
  
  public static boolean u0() {
    return f0.a("ShowcallerMain", "show_xuan_fu", true);
  }
  
  public static void u1(boolean paramBoolean) {
    f0.f("ShowcallerMain", "is_show_quick_contact", paramBoolean);
  }
  
  public static Boolean u2() {
    return Boolean.valueOf(f0.a("ShowcallerMain", "is_can_start_collect_job", true));
  }
  
  public static boolean v() {
    return f0.a("ShowcallerMain", "enalbe_unknow_block", false);
  }
  
  public static boolean v0() {
    return f0.a("ShowcallerMain", "show_xuan_fu_c", true);
  }
  
  public static void v1(boolean paramBoolean) {
    f0.f("ShowcallerMain", "is_show_red", paramBoolean);
  }
  
  public static Boolean v2() {
    return Boolean.valueOf(f0.a("ShowcallerMain", "missednotice", true));
  }
  
  public static boolean w() {
    return f0.a("ShowcallerMain", "enalbe_unknow_number", false);
  }
  
  public static int w0() {
    return f0.b("ShowcallerMain", "spam_counts", 0);
  }
  
  public static void w1(boolean paramBoolean) {
    f0.f("ShowcallerMain", "is_show_shortcut", paramBoolean);
  }
  
  public static Boolean w2() {
    return Boolean.valueOf(f0.a("ShowcallerMain", "new_call_end_failed", false));
  }
  
  public static long x() {
    return f0.c("ShowcallerMain", "fbtime", 0L);
  }
  
  public static int x0() {
    return f0.b("ShowcallerMain", "xuanfu_style", 0);
  }
  
  public static void x1(boolean paramBoolean) {
    f0.f("ShowcallerMain", "is_spam", paramBoolean);
  }
  
  public static long x2() {
    return f0.c("ShowcallerMain", "OfflineDownloadTime", 0L);
  }
  
  public static long y() {
    return f0.c("ShowcallerMain", "first_install_time", 0L);
  }
  
  public static String y0() {
    return f0.e("ShowcallerMain", "switchl", i1.G());
  }
  
  public static void y1(boolean paramBoolean) {
    f0.f("ShowcallerMain", "is_spam_or_name", paramBoolean);
  }
  
  public static Boolean y2() {
    return Boolean.valueOf(f0.a("ShowcallerMain", "old_call_end_usable", true));
  }
  
  public static long z() {
    return f0.c("ShowcallerMain", "addcontant_g", 0L);
  }
  
  public static boolean z0() {
    return f0.a("ShowcallerMain", "theme_system_default", false);
  }
  
  public static void z1(long paramLong) {
    f0.h("ShowcallerMain", "last_calllog_time", paramLong);
  }
  
  public static Boolean z2() {
    return Boolean.valueOf(f0.a("ShowcallerMain", "outgoinghangup", true));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/b1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */