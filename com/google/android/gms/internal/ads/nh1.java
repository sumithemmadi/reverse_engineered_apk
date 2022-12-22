package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.google.android.gms.ads.internal.util.h0;
import com.google.android.gms.ads.nonagon.transaction.omid.a;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

public final class nh1 {
  public final String A;
  
  public final JSONObject B;
  
  public final JSONObject C;
  
  public final String D;
  
  public final boolean E;
  
  public final boolean F;
  
  public final boolean G;
  
  public final boolean H;
  
  public final boolean I;
  
  public final boolean J;
  
  public final boolean K;
  
  public final int L;
  
  public final int M;
  
  public final boolean N;
  
  public final String O;
  
  public final a P;
  
  public final boolean Q;
  
  public final boolean R;
  
  public final int S;
  
  public final String T;
  
  public final int U;
  
  public final String V;
  
  public final boolean W;
  
  public final jf X;
  
  public final boolean Y;
  
  public final zzvu Z;
  
  public final List<String> a;
  
  public final String a0;
  
  public final int b;
  
  public final boolean b0;
  
  public final List<String> c;
  
  public final JSONObject c0;
  
  public final List<String> d;
  
  public final boolean d0;
  
  public final int e;
  
  public final JSONObject e0;
  
  public final List<String> f;
  
  public final String f0;
  
  public final List<String> g;
  
  public final List<String> h;
  
  public final List<String> i;
  
  public final String j;
  
  public final String k;
  
  public final zzavj l;
  
  public final List<String> m;
  
  public final List<String> n;
  
  public final List<String> o;
  
  public final int p;
  
  public final List<qh1> q;
  
  public final uh1 r;
  
  public final List<String> s;
  
  public final List<qh1> t;
  
  public final JSONObject u;
  
  public final String v;
  
  public final String w;
  
  public final String x;
  
  public final String y;
  
  public final zzawu z;
  
  nh1(JsonReader paramJsonReader) {
    zzavj zzavj1;
    uh1 uh11;
    zzawu zzawu1;
    jf jf1;
    zzvu zzvu1;
    List<?> list1 = Collections.emptyList();
    List<?> list2 = Collections.emptyList();
    List<?> list3 = Collections.emptyList();
    List<?> list4 = Collections.emptyList();
    List<?> list5 = Collections.emptyList();
    Collections.emptyList();
    List<?> list6 = Collections.emptyList();
    List<?> list7 = Collections.emptyList();
    List<?> list8 = Collections.emptyList();
    List<?> list9 = Collections.emptyList();
    List<?> list10 = Collections.emptyList();
    List<?> list11 = Collections.emptyList();
    List<?> list12 = Collections.emptyList();
    List<?> list13 = Collections.emptyList();
    JSONObject jSONObject1 = new JSONObject();
    JSONObject jSONObject2 = new JSONObject();
    JSONObject jSONObject3 = new JSONObject();
    JSONObject jSONObject4 = new JSONObject();
    JSONObject jSONObject5 = new JSONObject();
    JSONObject jSONObject6 = new JSONObject();
    paramJsonReader.beginObject();
    String str1 = "";
    String str2 = str1;
    String str3 = str2;
    String str4 = str3;
    String str5 = str4;
    String str6 = str5;
    String str7 = str6;
    String str8 = str7;
    String str9 = str8;
    String str10 = str9;
    String str11 = str10;
    String str12 = str11;
    String str13 = null;
    String str14 = str13;
    String str15 = str14;
    String str16 = str15;
    String str17 = str16;
    String str18 = str17;
    byte b1 = 0;
    int i = 0;
    int j = 0;
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    boolean bool4 = false;
    boolean bool5 = false;
    boolean bool6 = false;
    boolean bool7 = false;
    byte b2 = -1;
    int k = 0;
    boolean bool8 = false;
    boolean bool9 = false;
    boolean bool10 = false;
    int m = 0;
    int n = -1;
    boolean bool11 = false;
    boolean bool12 = true;
    boolean bool13 = false;
    boolean bool14 = false;
    String str19 = str4;
    String str20 = str3;
    String str21 = str2;
    List<?> list14 = list13;
    List<?> list15 = list12;
    list12 = list11;
    list11 = list9;
    list9 = list7;
    list7 = list3;
    while (true) {
      jf jf2;
      byte b;
      if (paramJsonReader.hasNext()) {
        JSONObject jSONObject;
        jf jf3;
        str4 = paramJsonReader.nextName();
        if (str4 == null)
          str4 = ""; 
        switch (str4.hashCode()) {
          default:
            b = -1;
            break;
          case 2072888499:
            if (str4.equals("manual_tracking_urls")) {
              b = 58;
              break;
            } 
          case 2068142375:
            if (str4.equals("rule_line_external_id")) {
              b = 57;
              break;
            } 
          case 1875425491:
            if (str4.equals("is_analytics_logging_enabled")) {
              b = 56;
              break;
            } 
          case 1839650832:
            if (str4.equals("renderers")) {
              b = 55;
              break;
            } 
          case 1799285870:
            if (str4.equals("use_third_party_container_height")) {
              b = 54;
              break;
            } 
          case 1688341040:
            if (str4.equals("video_reward_urls")) {
              b = 53;
              break;
            } 
          case 1686319423:
            if (str4.equals("ad_network_class_name")) {
              b = 52;
              break;
            } 
          case 1638957285:
            if (str4.equals("video_start_urls")) {
              b = 51;
              break;
            } 
          case 1637553475:
            if (str4.equals("bid_response")) {
              b = 50;
              break;
            } 
          case 1321720943:
            if (str4.equals("allow_pub_owned_ad_view")) {
              b = 49;
              break;
            } 
          case 1100650276:
            if (str4.equals("rewards")) {
              b = 48;
              break;
            } 
          case 1010584092:
            if (str4.equals("transaction_id")) {
              b = 47;
              break;
            } 
          case 791122864:
            if (str4.equals("impression_type")) {
              b = 46;
              break;
            } 
          case 754887508:
            if (str4.equals("container_sizes")) {
              b = 45;
              break;
            } 
          case 673261304:
            if (str4.equals("reward_granted_urls")) {
              b = 44;
              break;
            } 
          case 597473788:
            if (str4.equals("debug_dialog_string")) {
              b = 43;
              break;
            } 
          case 549176928:
            if (str4.equals("presentation_error_timeout_ms")) {
              b = 42;
              break;
            } 
          case 418392395:
            if (str4.equals("is_closable_area_disabled")) {
              b = 41;
              break;
            } 
          case 230323073:
            if (str4.equals("ad_load_urls")) {
              b = 40;
              break;
            } 
          case 107433883:
            if (str4.equals("qdata")) {
              b = 39;
              break;
            } 
          case 63195984:
            if (str4.equals("render_test_label")) {
              b = 38;
              break;
            } 
          case 3076010:
            if (str4.equals("data")) {
              b = 37;
              break;
            } 
          case 3355:
            if (str4.equals("id")) {
              b = 36;
              break;
            } 
          case 3107:
            if (str4.equals("ad")) {
              b = 35;
              break;
            } 
          case -29338502:
            if (str4.equals("allow_custom_click_gesture")) {
              b = 34;
              break;
            } 
          case -154616268:
            if (str4.equals("is_offline_ad")) {
              b = 33;
              break;
            } 
          case -213424028:
            if (str4.equals("watermark")) {
              b = 32;
              break;
            } 
          case -369773488:
            if (str4.equals("is_close_button_enabled")) {
              b = 31;
              break;
            } 
          case -388807511:
            if (str4.equals("content_url")) {
              b = 30;
              break;
            } 
          case -397704715:
            if (str4.equals("ad_close_time_ms")) {
              b = 29;
              break;
            } 
          case -404326515:
            if (str4.equals("render_timeout_ms")) {
              b = 28;
              break;
            } 
          case -404433734:
            if (str4.equals("rtb_native_required_assets")) {
              b = 27;
              break;
            } 
          case -437057161:
            if (str4.equals("imp_urls")) {
              b = 26;
              break;
            } 
          case -544216775:
            if (str4.equals("safe_browsing")) {
              b = 25;
              break;
            } 
          case -776859333:
            if (str4.equals("click_urls")) {
              b = 24;
              break;
            } 
          case -982608540:
            if (str4.equals("valid_from_timestamp")) {
              b = 23;
              break;
            } 
          case -1051269058:
            if (str4.equals("active_view")) {
              b = 22;
              break;
            } 
          case -1078050970:
            if (str4.equals("video_complete_urls")) {
              b = 21;
              break;
            } 
          case -1081936678:
            if (str4.equals("allocation_id")) {
              b = 20;
              break;
            } 
          case -1115838944:
            if (str4.equals("fill_urls")) {
              b = 19;
              break;
            } 
          case -1146534047:
            if (str4.equals("is_scroll_aware")) {
              b = 18;
              break;
            } 
          case -1152230954:
            if (str4.equals("ad_type")) {
              b = 17;
              break;
            } 
          case -1168140544:
            if (str4.equals("presentation_error_urls")) {
              b = 16;
              break;
            } 
          case -1234181075:
            if (str4.equals("allow_pub_rendered_attribution")) {
              b = 15;
              break;
            } 
          case -1240082064:
            if (str4.equals("ad_event_value")) {
              b = 14;
              break;
            } 
          case -1289032093:
            if (str4.equals("extras")) {
              b = 13;
              break;
            } 
          case -1303332046:
            if (str4.equals("test_mode_enabled")) {
              b = 12;
              break;
            } 
          case -1306015996:
            if (str4.equals("adapters")) {
              b = 11;
              break;
            } 
          case -1360811658:
            if (str4.equals("ad_sizes")) {
              b = 10;
              break;
            } 
          case -1375413093:
            if (str4.equals("ad_cover")) {
              b = 9;
              break;
            } 
          case -1403779768:
            if (str4.equals("showable_impression_type")) {
              b = 8;
              break;
            } 
          case -1428969291:
            if (str4.equals("enable_omid")) {
              b = 7;
              break;
            } 
          case -1439500848:
            if (str4.equals("orientation")) {
              b = 6;
              break;
            } 
          case -1440104884:
            if (str4.equals("is_custom_close_blocked")) {
              b = 5;
              break;
            } 
          case -1620470467:
            if (str4.equals("backend_query_id")) {
              b = 4;
              break;
            } 
          case -1662989631:
            if (str4.equals("is_interscroller")) {
              b = 3;
              break;
            } 
          case -1812055556:
            if (str4.equals("play_prewarm_options")) {
              b = 2;
              break;
            } 
          case -1965512151:
            if (str4.equals("omid_settings")) {
              b = 1;
              break;
            } 
          case -1980587809:
            if (str4.equals("debug_signals")) {
              b = 0;
              break;
            } 
        } 
        switch (b) {
          default:
            paramJsonReader.skipValue();
            b = b1;
            str4 = str16;
            b1 = b;
            str16 = str4;
            continue;
          case 58:
            list10 = h0.b(paramJsonReader);
            b = b1;
            str4 = str16;
            b1 = b;
            str16 = str4;
            continue;
          case 57:
            str11 = paramJsonReader.nextString();
            b = b1;
            str4 = str16;
            b1 = b;
            str16 = str4;
            continue;
          case 56:
            bool9 = paramJsonReader.nextBoolean();
            b = b1;
            str4 = str16;
            b1 = b;
            str16 = str4;
            continue;
          case 55:
            list1 = h0.b(paramJsonReader);
            str4 = str16;
            b = b1;
            b1 = b;
            str16 = str4;
            continue;
          case 54:
            bool11 = paramJsonReader.nextBoolean();
            b = b1;
            str4 = str16;
            b1 = b;
            str16 = str4;
            continue;
          case 53:
            list6 = h0.b(paramJsonReader);
            b = b1;
            str4 = str16;
            b1 = b;
            str16 = str4;
            continue;
          case 52:
            str12 = paramJsonReader.nextString();
            b = b1;
            str4 = str16;
            b1 = b;
            str16 = str4;
            continue;
          case 51:
            list5 = h0.b(paramJsonReader);
            b = b1;
            str4 = str16;
            b1 = b;
            str16 = str4;
            continue;
          case 50:
            str8 = paramJsonReader.nextString();
            b = b1;
            str4 = str16;
            b1 = b;
            str16 = str4;
            continue;
          case 49:
            bool2 = paramJsonReader.nextBoolean();
            b = b1;
            str4 = str16;
            b1 = b;
            str16 = str4;
            continue;
          case 48:
            zzavj1 = zzavj.o0(h0.m(paramJsonReader));
            b = b1;
            str4 = str16;
            b1 = b;
            str16 = str4;
            continue;
          case 47:
            str1 = paramJsonReader.nextString();
            b = b1;
            str4 = str16;
            b1 = b;
            str16 = str4;
            continue;
          case 46:
            i = paramJsonReader.nextInt();
            if (i == 0 || i == 1) {
              b = b1;
              str4 = str16;
            } else {
              i = 0;
              b = b1;
              str4 = str16;
            } 
            b1 = b;
            str16 = str4;
            continue;
          case 45:
            list12 = qh1.a(paramJsonReader);
            b = b1;
            str4 = str16;
            b1 = b;
            str16 = str4;
            continue;
          case 44:
            h0.b(paramJsonReader);
            b = b1;
            str4 = str16;
            b1 = b;
            str16 = str4;
            continue;
          case 43:
            str7 = paramJsonReader.nextString();
            b = b1;
            str4 = str16;
            b1 = b;
            str16 = str4;
            continue;
          case 42:
            j = paramJsonReader.nextInt();
            b = b1;
            str4 = str16;
            b1 = b;
            str16 = str4;
            continue;
          case 41:
            bool7 = paramJsonReader.nextBoolean();
            b = b1;
            str4 = str16;
            b1 = b;
            str16 = str4;
            continue;
          case 40:
            list4 = h0.b(paramJsonReader);
            b = b1;
            str4 = str16;
            b1 = b;
            str16 = str4;
            continue;
          case 39:
            str5 = paramJsonReader.nextString();
            b = b1;
            str4 = str16;
            b1 = b;
            str16 = str4;
            continue;
          case 38:
            bool4 = paramJsonReader.nextBoolean();
            b = b1;
            str4 = str16;
            b1 = b;
            str16 = str4;
            continue;
          case 37:
            jSONObject1 = h0.l(paramJsonReader);
            b = b1;
            str4 = str16;
            b1 = b;
            str16 = str4;
            continue;
          case 36:
            str19 = paramJsonReader.nextString();
            b = b1;
            str4 = str16;
            b1 = b;
            str16 = str4;
            continue;
          case 35:
            uh11 = new uh1(paramJsonReader);
            b = b1;
            str4 = str16;
            b1 = b;
            str16 = str4;
            continue;
          case 34:
            bool3 = paramJsonReader.nextBoolean();
            b = b1;
            str4 = str16;
            b1 = b;
            str16 = str4;
            continue;
          case 33:
            bool14 = paramJsonReader.nextBoolean();
            b = b1;
            str4 = str16;
            b1 = b;
            str16 = str4;
            continue;
          case 32:
            str9 = paramJsonReader.nextString();
            b = b1;
            str4 = str16;
            b1 = b;
            str16 = str4;
            continue;
          case 31:
            bool12 = paramJsonReader.nextBoolean();
            b = b1;
            str4 = str16;
            b1 = b;
            str16 = str4;
            continue;
          case 30:
            str18 = paramJsonReader.nextString();
            b = b1;
            str4 = str16;
            b1 = b;
            str16 = str4;
            continue;
          case 29:
            n = paramJsonReader.nextInt();
            b = b1;
            str4 = str16;
            b1 = b;
            str16 = str4;
            continue;
          case 28:
            k = paramJsonReader.nextInt();
            b = b1;
            str4 = str16;
            b1 = b;
            str16 = str4;
            continue;
          case 27:
            jSONObject6 = h0.l(paramJsonReader);
            b = b1;
            str4 = str16;
            b1 = b;
            str16 = str4;
            continue;
          case 26:
            list7 = h0.b(paramJsonReader);
            b = b1;
            str4 = str16;
            b1 = b;
            str16 = str4;
            continue;
          case 25:
            zzawu1 = zzawu.o0(h0.l(paramJsonReader));
            b = b1;
            str4 = str16;
            b1 = b;
            str16 = str4;
            continue;
          case 24:
            list2 = h0.b(paramJsonReader);
            b = b1;
            str4 = str16;
            b1 = b;
            str16 = str4;
            continue;
          case 23:
            str21 = paramJsonReader.nextString();
            b = b1;
            str4 = str16;
            b1 = b;
            str16 = str4;
            continue;
          case 22:
            str6 = h0.l(paramJsonReader).toString();
            b = b1;
            str4 = str16;
            b1 = b;
            str16 = str4;
            continue;
          case 21:
            list9 = h0.b(paramJsonReader);
            b = b1;
            str4 = str16;
            b1 = b;
            str16 = str4;
            continue;
          case 20:
            str20 = paramJsonReader.nextString();
            b = b1;
            str4 = str16;
            b1 = b;
            str16 = str4;
            continue;
          case 19:
            list8 = h0.b(paramJsonReader);
            b = b1;
            str4 = str16;
            b1 = b;
            str16 = str4;
            continue;
          case 18:
            bool10 = paramJsonReader.nextBoolean();
            b = b1;
            str4 = str16;
            b1 = b;
            str16 = str4;
            continue;
          case 17:
            str4 = paramJsonReader.nextString();
            if ("banner".equals(str4)) {
              b = 1;
              str4 = str16;
            } else if ("interstitial".equals(str4)) {
              b = 2;
              str4 = str16;
            } else if ("native_express".equals(str4)) {
              b = 3;
              str4 = str16;
            } else if ("native".equals(str4)) {
              b = 4;
              str4 = str16;
            } else if ("rewarded".equals(str4)) {
              b = 5;
              str4 = str16;
            } else if ("app_open_ad".equals(str4)) {
              b = 6;
              str4 = str16;
            } else {
              b = 0;
              str4 = str16;
            } 
            b1 = b;
            str16 = str4;
            continue;
          case 16:
            list11 = h0.b(paramJsonReader);
            b = b1;
            str4 = str16;
            b1 = b;
            str16 = str4;
            continue;
          case 15:
            bool1 = paramJsonReader.nextBoolean();
            b = b1;
            str4 = str16;
            b1 = b;
            str16 = str4;
            continue;
          case 14:
            zzvu1 = zzvu.o0(h0.l(paramJsonReader));
            b = b1;
            str4 = str16;
            b1 = b;
            str16 = str4;
            continue;
          case 13:
            jSONObject3 = h0.l(paramJsonReader);
            b = b1;
            str4 = str16;
            b1 = b;
            str16 = str4;
            continue;
          case 12:
            bool5 = paramJsonReader.nextBoolean();
            b = b1;
            str4 = str16;
            b1 = b;
            str16 = str4;
            continue;
          case 11:
            list15 = h0.b(paramJsonReader);
            b = b1;
            str4 = str16;
            b1 = b;
            str16 = str4;
            continue;
          case 10:
            list14 = qh1.a(paramJsonReader);
            continue;
          case 9:
            jSONObject5 = h0.l(paramJsonReader);
            b = b1;
            str4 = str16;
            b1 = b;
            str16 = str4;
            continue;
          case 8:
            m = paramJsonReader.nextInt();
            b = b1;
            str4 = str16;
            b1 = b;
            str16 = str4;
            continue;
          case 7:
            bool8 = paramJsonReader.nextBoolean();
            b = b1;
            str4 = str16;
            b1 = b;
            str16 = str4;
            continue;
          case 6:
            str4 = paramJsonReader.nextString();
            if ("landscape".equalsIgnoreCase(str4)) {
              b2 = 6;
              b = b1;
              str4 = str16;
            } else if ("portrait".equalsIgnoreCase(str4)) {
              b2 = 7;
              b = b1;
              str4 = str16;
            } else {
              b2 = -1;
              b = b1;
              str4 = str16;
            } 
            b1 = b;
            str16 = str4;
            continue;
          case 5:
            bool6 = paramJsonReader.nextBoolean();
            b = b1;
            str4 = str16;
            b1 = b;
            str16 = str4;
            continue;
          case 4:
            str10 = paramJsonReader.nextString();
            b = b1;
            str4 = str16;
            b1 = b;
            str16 = str4;
            continue;
          case 3:
            bool13 = paramJsonReader.nextBoolean();
            b = b1;
            str4 = str16;
            b1 = b;
            str16 = str4;
            continue;
          case 2:
            jSONObject = h0.l(paramJsonReader);
            if (jSONObject == null) {
              jSONObject = null;
            } else {
              jf2 = new jf(jSONObject.optBoolean("enable_prewarming", false), jSONObject.optString("prefetch_url", ""));
            } 
            b = b1;
            b1 = b;
            jf3 = jf2;
            continue;
          case 1:
            jSONObject4 = h0.l(paramJsonReader);
            b = b1;
            jf2 = jf3;
            b1 = b;
            jf3 = jf2;
            continue;
          case 0:
            break;
        } 
        jSONObject2 = h0.l(paramJsonReader);
        b = b1;
        jf2 = jf3;
      } else {
        break;
      } 
      b1 = b;
      jf1 = jf2;
    } 
    paramJsonReader.endObject();
    this.a = (List)list1;
    this.b = b1;
    this.c = (List)list2;
    this.d = (List)list7;
    this.f = (List)list4;
    this.e = i;
    this.g = (List)list5;
    this.h = (List)list6;
    this.i = (List)list9;
    this.j = str1;
    this.k = str21;
    this.l = zzavj1;
    this.m = (List)list8;
    this.n = (List)list11;
    this.o = (List)list10;
    this.p = j;
    this.q = (List)list12;
    this.r = uh11;
    this.s = (List)list15;
    this.t = (List)list14;
    this.v = str20;
    this.u = jSONObject1;
    this.w = str19;
    this.x = str5;
    this.y = str6;
    this.z = zzawu1;
    this.A = str7;
    this.B = jSONObject2;
    this.C = jSONObject3;
    this.E = bool1;
    this.F = bool2;
    this.G = bool3;
    this.H = bool4;
    this.I = bool5;
    this.J = bool6;
    this.K = bool7;
    this.L = b2;
    this.M = k;
    this.N = bool8;
    this.O = str8;
    this.P = new a(jSONObject4);
    this.Q = bool9;
    this.R = bool10;
    this.S = m;
    this.T = str9;
    this.U = n;
    this.V = str10;
    this.W = bool11;
    this.X = jf1;
    this.Y = bool12;
    this.Z = zzvu1;
    this.a0 = str11;
    this.b0 = bool13;
    this.c0 = jSONObject5;
    this.D = str12;
    this.d0 = bool14;
    this.e0 = jSONObject6;
    this.f0 = str18;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/nh1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */