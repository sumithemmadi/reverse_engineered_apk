package com.allinone.callerid.util;

import android.content.Context;
import android.os.Build;
import com.allinone.callerid.bean.ParserIpBean;
import com.allinone.callerid.i.a.n.c;
import java.util.HashMap;

public class g0 {
  public static void A(Context paramContext) {
    q.b().c("request_offline_db_new");
    String str = p.d(paramContext).getIso_code();
    if (str != null && str.equals("US/USA"))
      q.b().c("request_offline_db_new_us"); 
    if (str != null && str.equals("IN/IND"))
      q.b().c("request_offline_db_new_in"); 
    if (str != null && str.equals("IQ/IRQ"))
      q.b().c("request_offline_db_new_iq"); 
    if (str != null && str.equals("EG/EGY"))
      q.b().c("request_offline_db_new_eg"); 
    if (str != null && str.equals("ID/IDN"))
      q.b().c("request_offline_db_new_id"); 
  }
  
  public static void B(Context paramContext) {
    String str = p.d(paramContext).getIso_code();
    if (str != null && str.equals("US/USA"))
      q.b().c("request_offline_parser_new_us"); 
    if (str != null && str.equals("IN/IND"))
      q.b().c("request_offline_parser_new_in"); 
    if (str != null && str.equals("IQ/IRQ"))
      q.b().c("request_offline_parser_new_iq"); 
    if (str != null && str.equals("EG/EGY"))
      q.b().c("request_offline_parser_new_eg"); 
  }
  
  public static void C(Context paramContext) {
    q.b().c("search_buyu_count");
    String str = p.d(paramContext).getIso_code();
    if (str != null && str.equals("IN/IND"))
      q.b().c("search_buyu_count_in"); 
    if (str != null && str.equals("EG/EGY"))
      q.b().c("search_buyu_count_eg"); 
    if (str != null && str.equals("IQ/IRQ"))
      q.b().c("search_buyu_count_iq"); 
    if (str != null && str.equals("ID/IDN"))
      q.b().c("search_buyu_count_id"); 
  }
  
  public static void D(Context paramContext) {
    q.b().c("search_buyu_count_ok");
    String str = p.d(paramContext).getIso_code();
    if (str != null && str.equals("IN/IND"))
      q.b().c("search_buyu_count_in_ok"); 
    if (str != null && str.equals("EG/EGY"))
      q.b().c("search_buyu_count_eg_ok"); 
    if (str != null && str.equals("IQ/IRQ"))
      q.b().c("search_buyu_count_iq_ok"); 
    if (str != null && str.equals("ID/IDN"))
      q.b().c("search_buyu_count_id_ok"); 
  }
  
  public static void E(Context paramContext) {
    q.b().c("search_soft_comments_ok");
    String str = p.d(paramContext).getIso_code();
    if (str != null && str.equals("US/USA"))
      q.b().c("us_comments_ok"); 
    if (str != null && str.equals("IN/IND"))
      q.b().c("in_comments_ok"); 
    if (str != null && str.equals("IQ/IRQ"))
      q.b().c("irq_comments_ok"); 
    if (str != null && str.equals("EG/EGY"))
      q.b().c("egy_comments_ok"); 
    if (str != null && str.equals("ID/IDN"))
      q.b().c("idn_comments_ok"); 
  }
  
  public static void F(Context paramContext) {
    String str = p.d(paramContext).getIso_code();
    if (str != null && str.equals("IN/IND")) {
      q.b().c("search_in_140_number");
      q.b().c("search_in_140_number");
    } 
  }
  
  public static void G(Context paramContext) {
    String str = p.d(paramContext).getIso_code();
    if (str != null && str.equals("IN/IND")) {
      q.b().c("search_in_140_number_ok");
      q.b().c("search_in_140_number_ok");
    } 
  }
  
  public static void H(Context paramContext) {
    String str = p.d(paramContext).getIso_code();
    if (str != null && str.equals("US/USA"))
      q.b().c("us_location_ok"); 
    if (str != null && str.equals("IN/IND"))
      q.b().c("in_location_ok"); 
    if (str != null && str.equals("IQ/IRQ"))
      q.b().c("irq_location_ok"); 
    if (str != null && str.equals("EG/EGY"))
      q.b().c("egy_location_ok"); 
    if (str != null && str.equals("ID/IDN"))
      q.b().c("idn_location_ok"); 
    if (str != null && str.equals("GB/GBR"))
      q.b().c("gbr_location_ok"); 
    if (str != null && str.equals("AU/AUS"))
      q.b().c("aus_location_ok"); 
    if (str != null && str.equals("DE/DEU"))
      q.b().c("deu_location_ok"); 
    if (str != null && str.equals("BR/BRA"))
      q.b().c("bra_location_ok"); 
    if (str != null && str.equals("NG/NGA"))
      q.b().c("nga_location_ok"); 
    if (str != null && str.equals("TR/TUR"))
      q.b().c("tur_location_ok"); 
    if (str != null && str.equals("PK/PAK"))
      q.b().c("pak_location_ok"); 
    if (str != null && str.equals("BD/BGD"))
      q.b().c("bgd_location_ok"); 
  }
  
  public static void I(Context paramContext) {
    String str = p.d(paramContext).getIso_code();
    if (str != null && str.equals("US/USA"))
      q.b().c("us_unknown_name_ok"); 
    if (str != null && str.equals("IN/IND"))
      q.b().c("in_unknown_name_ok"); 
    if (str != null && str.equals("IQ/IRQ"))
      q.b().c("irq_unknown_name_ok"); 
    if (str != null && str.equals("EG/EGY"))
      q.b().c("egy_unknown_name_ok"); 
    if (str != null && str.equals("ID/IDN"))
      q.b().c("idn_unknown_name_ok"); 
    if (str != null && str.equals("GB/GBR"))
      q.b().c("gbr_unknown_name_ok"); 
    if (str != null && str.equals("AU/AUS"))
      q.b().c("aus_unknown_name_ok"); 
    if (str != null && str.equals("DE/DEU"))
      q.b().c("deu_unknown_name_ok"); 
    if (str != null && str.equals("BR/BRA"))
      q.b().c("bra_unknown_name_ok"); 
    if (str != null && str.equals("NG/NGA"))
      q.b().c("nga_unknown_name_ok"); 
    if (str != null && str.equals("TR/TUR"))
      q.b().c("tur_unknown_name_ok"); 
    if (str != null && str.equals("PK/PAK"))
      q.b().c("pak_unknown_name_ok"); 
    if (str != null && str.equals("BD/BGD"))
      q.b().c("bgd_unknown_name_ok"); 
  }
  
  public static void J(Context paramContext) {
    String str = p.d(paramContext).getIso_code();
    if (str != null && str.equals("US/USA"))
      q.b().c("us_search_ok"); 
    if (str != null && str.equals("IN/IND"))
      q.b().c("in_search_ok"); 
    if (str != null && str.equals("IQ/IRQ"))
      q.b().c("irq_search_ok"); 
    if (str != null && str.equals("EG/EGY"))
      q.b().c("egy_search_ok"); 
    if (str != null && str.equals("ID/IDN"))
      q.b().c("idn_search_ok"); 
    if (str != null && str.equals("GB/GBR"))
      q.b().c("gbr_search_ok"); 
    if (str != null && str.equals("AU/AUS"))
      q.b().c("aus_search_ok"); 
    if (str != null && str.equals("DE/DEU"))
      q.b().c("deu_search_ok"); 
    if (str != null && str.equals("BR/BRA"))
      q.b().c("bra_search_ok"); 
    if (str != null && str.equals("NG/NGA"))
      q.b().c("nga_search_ok"); 
    if (str != null && str.equals("TR/TUR"))
      q.b().c("tur_search_ok"); 
    if (str != null && str.equals("PK/PAK"))
      q.b().c("pak_search_ok"); 
    if (str != null && str.equals("BD/BGD"))
      q.b().c("bgd_search_ok"); 
  }
  
  public static void K(Context paramContext) {
    q.b().c("search_offline_db_new");
    String str = p.d(paramContext).getIso_code();
    if (str != null && str.equals("US/USA"))
      q.b().c("search_offline_db_us_new"); 
    if (str != null && str.equals("IN/IND"))
      q.b().c("search_offline_db_in_new"); 
    if (str != null && str.equals("IQ/IRQ"))
      q.b().c("search_offline_db_iq_new"); 
    if (str != null && str.equals("EG/EGY"))
      q.b().c("search_offline_db_eg_new"); 
    if (str != null && str.equals("ID/IDN"))
      q.b().c("search_offline_db_id_new"); 
  }
  
  public static void L(Context paramContext) {
    ParserIpBean parserIpBean = c.a().b();
    if (parserIpBean != null && parserIpBean.getCountry() != null && !"".equals(parserIpBean.getCountry())) {
      String str = parserIpBean.getCountry();
      if (str != null && "in".equals(str)) {
        str = parserIpBean.getState();
        if (str != null && !"".equals(str)) {
          byte b = -1;
          switch (str.hashCode()) {
            case 3483:
              if (!str.equals("mh"))
                break; 
              b = 2;
              break;
            case 3414:
              if (!str.equals("ka"))
                break; 
              b = 1;
              break;
            case 3208:
              if (!str.equals("dl"))
                break; 
              b = 0;
              break;
          } 
          switch (b) {
            default:
              return;
            case 2:
              q.b().c("search_offline_db_in_mh_new");
            case 1:
              q.b().c("search_offline_db_in_ka_new");
            case 0:
              break;
          } 
          q.b().c("search_offline_db_in_dl_new");
        } 
      } 
    } 
  }
  
  public static void M(Context paramContext) {
    q.b().c("search_offline_db_success_new");
    String str = p.d(paramContext).getIso_code();
    if (str != null && str.equals("US/USA"))
      q.b().c("search_offline_db_success_us_new"); 
    if (str != null && str.equals("IN/IND"))
      q.b().c("search_offline_db_success_in_new"); 
    if (str != null && str.equals("IQ/IRQ"))
      q.b().c("search_offline_db_success_iq_new"); 
    if (str != null && str.equals("EG/EGY"))
      q.b().c("search_offline_db_success_eg_new"); 
    if (str != null && str.equals("ID/IDN"))
      q.b().c("search_offline_db_success_id_new"); 
  }
  
  public static void N(Context paramContext) {
    ParserIpBean parserIpBean = c.a().b();
    if (parserIpBean != null && parserIpBean.getCountry() != null && !"".equals(parserIpBean.getCountry())) {
      String str = parserIpBean.getCountry();
      if (str != null && "in".equals(str)) {
        str = parserIpBean.getState();
        if (str != null && !"".equals(str)) {
          byte b = -1;
          switch (str.hashCode()) {
            case 3483:
              if (!str.equals("mh"))
                break; 
              b = 2;
              break;
            case 3414:
              if (!str.equals("ka"))
                break; 
              b = 1;
              break;
            case 3208:
              if (!str.equals("dl"))
                break; 
              b = 0;
              break;
          } 
          switch (b) {
            default:
              return;
            case 2:
              q.b().c("search_offline_db_success_in_mh_new");
            case 1:
              q.b().c("search_offline_db_success_in_ka_new");
            case 0:
              break;
          } 
          q.b().c("search_offline_db_success_in_dl_new");
        } 
      } 
    } 
  }
  
  public static void O(Context paramContext) {
    String str = p.d(paramContext).getIso_code();
    if (str != null && str.equals("US/USA"))
      q.b().c("us_unknown_spam_ok"); 
    if (str != null && str.equals("IN/IND"))
      q.b().c("in_unknown_sapm_ok"); 
    if (str != null && str.equals("IQ/IRQ"))
      q.b().c("irq_unknown_sapm_ok"); 
    if (str != null && str.equals("EG/EGY"))
      q.b().c("egy_unknown_sapm_ok"); 
    if (str != null && str.equals("ID/IDN"))
      q.b().c("idn_unknown_sapm_ok"); 
    if (str != null && str.equals("GB/GBR"))
      q.b().c("gbr_unknown_sapm_ok"); 
    if (str != null && str.equals("AU/AUS"))
      q.b().c("aus_unknown_sapm_ok"); 
    if (str != null && str.equals("DE/DEU"))
      q.b().c("deu_unknown_sapm_ok"); 
    if (str != null && str.equals("BR/BRA"))
      q.b().c("bra_unknown_sapm_ok"); 
    if (str != null && str.equals("NG/NGA"))
      q.b().c("nga_unknown_sapm_ok"); 
    if (str != null && str.equals("TR/TUR"))
      q.b().c("tur_unknown_sapm_ok"); 
    if (str != null && str.equals("PK/PAK"))
      q.b().c("pak_unknown_sapm_ok"); 
    if (str != null && str.equals("BD/BGD"))
      q.b().c("bgd_unknown_sapm_ok"); 
  }
  
  public static void P(Context paramContext) {
    q.b().c("incoming_unknown_offhook");
    String str = p.d(paramContext).getIso_code();
    if (str != null && str.equals("IN/IND"))
      q.b().c("incoming_unkonwn_answer_in"); 
    if (str != null && str.equals("US/USA"))
      q.b().c("incoming_unkonwn_answer_us"); 
    if (str != null && str.equals("BR/BRA"))
      q.b().c("incoming_unkonwn_answer_br"); 
    if (str != null && str.equals("DE/DEU"))
      q.b().c("incoming_unkonwn_answer_de"); 
    if (str != null && str.equals("AU/AUS"))
      q.b().c("incoming_unkonwn_answer_au"); 
    if (str != null && str.equals("IQ/IRQ"))
      q.b().c("incoming_unkonwn_answer_iq"); 
  }
  
  public static void Q(Context paramContext) {
    String str = p.d(paramContext).getIso_code();
    if (str != null && str.equals("US/USA"))
      q.b().c("incoming_us_unkonwn"); 
    if (str != null && str.equals("IN/IND"))
      q.b().c("incoming_in_unkonwn"); 
    if (str != null && str.equals("IQ/IRQ"))
      q.b().c("incoming_irq_unkonwn"); 
    if (str != null && str.equals("EG/EGY"))
      q.b().c("incoming_egy_unkonwn"); 
    if (str != null && str.equals("ID/IDN"))
      q.b().c("incoming_idn_unkonwn"); 
    if (str != null && str.equals("GB/GBR"))
      q.b().c("incoming_gbr_unkonwn"); 
    if (str != null && str.equals("AU/AUS"))
      q.b().c("incoming_aus_unkonwn"); 
    if (str != null && str.equals("DE/DEU"))
      q.b().c("incoming_deu_unkonwn"); 
    if (str != null && str.equals("BR/BRA"))
      q.b().c("incoming_bra_unkonwn"); 
    if (str != null && str.equals("NG/NGA"))
      q.b().c("incoming_nga_unkonwn"); 
    if (str != null && str.equals("TR/TUR"))
      q.b().c("incoming_tur_unkonwn"); 
    if (str != null && str.equals("PK/PAK"))
      q.b().c("incoming_pak_unkonwn"); 
    if (str != null && str.equals("BD/BGD"))
      q.b().c("incoming_bgd_unkonwn"); 
    if (str != null && str.equals("KE/KEN"))
      q.b().c("incoming_ken_unkonwn"); 
    if (str != null && str.equals("CL/CHL"))
      q.b().c("incoming_chl_unkonwn"); 
    if (str != null && str.equals("IT/ITA"))
      q.b().c("incoming_ita_unkonwn"); 
    if (str != null && str.equals("ZA/ZAF"))
      q.b().c("incoming_zaf_unkonwn"); 
    if (str != null && str.equals("PH/PHL"))
      q.b().c("incoming_phl_unkonwn"); 
    if (str != null && str.equals("RU/RUS"))
      q.b().c("incoming_rus_unkonwn"); 
    if (str != null && str.equals("ET/ETH"))
      q.b().c("incoming_eth_unkonwn"); 
  }
  
  public static void R(Context paramContext) {
    q.b().c("incoming_unkonwn_missed");
    String str = p.d(paramContext).getIso_code();
    if (str != null && str.equals("IN/IND"))
      q.b().c("incoming_unkonwn_missed_in"); 
    if (str != null && str.equals("US/USA"))
      q.b().c("incoming_unkonwn_missed_us"); 
    if (str != null && str.equals("BR/BRA"))
      q.b().c("incoming_unkonwn_missed_br"); 
    if (str != null && str.equals("DE/DEU"))
      q.b().c("incoming_unkonwn_missed_de"); 
    if (str != null && str.equals("AU/AUS"))
      q.b().c("incoming_unkonwn_missed_au"); 
    if (str != null && str.equals("IQ/IRQ"))
      q.b().c("incoming_unkonwn_missed_iq"); 
  }
  
  public static void S(Context paramContext) {
    String str = p.d(paramContext).getIso_code();
    if (str != null && str.equals("US/USA"))
      q.b().c("outgoing_us_unkonwn"); 
    if (str != null && str.equals("IN/IND"))
      q.b().c("outgoing_in_unkonwn"); 
    if (str != null && str.equals("IQ/IRQ"))
      q.b().c("outgoing_irq_unkonwn"); 
    if (str != null && str.equals("EG/EGY"))
      q.b().c("outgoing_egy_unkonwn"); 
    if (str != null && str.equals("ID/IDN"))
      q.b().c("outgoing_idn_unkonwn"); 
    if (str != null && str.equals("GB/GBR"))
      q.b().c("outgoing_gbr_unkonwn"); 
    if (str != null && str.equals("AU/AUS"))
      q.b().c("outgoing_aus_unkonwn"); 
    if (str != null && str.equals("DE/DEU"))
      q.b().c("outgoing_deu_unkonwn"); 
    if (str != null && str.equals("BR/BRA"))
      q.b().c("outgoing_bra_unkonwn"); 
    if (str != null && str.equals("NG/NGA"))
      q.b().c("outgoing_nga_unkonwn"); 
    if (str != null && str.equals("TR/TUR"))
      q.b().c("outgoing_tur_unkonwn"); 
    if (str != null && str.equals("PK/PAK"))
      q.b().c("outgoing_pak_unkonwn"); 
    if (str != null && str.equals("BD/BGD"))
      q.b().c("outgoing_bgd_unkonwn"); 
    if (str != null && str.equals("KE/KEN"))
      q.b().c("outgoing_ken_unkonwn"); 
    if (str != null && str.equals("CL/CHL"))
      q.b().c("outgoing_chl_unkonwn"); 
    if (str != null && str.equals("IT/ITA"))
      q.b().c("outgoing_ita_unkonwn"); 
    if (str != null && str.equals("ZA/ZAF"))
      q.b().c("outgoing_zaf_unkonwn"); 
    if (str != null && str.equals("PH/PHL"))
      q.b().c("outgoing_phl_unkonwn"); 
    if (str != null && str.equals("RU/RUS"))
      q.b().c("outgoing_rus_unkonwn"); 
    if (str != null && str.equals("ET/ETH"))
      q.b().c("outgoing_eth_unkonwn"); 
  }
  
  public static void a(String paramString) {
    (new HashMap<String, String>()).put("DownloadError", paramString);
  }
  
  public static void b(Context paramContext) {
    String str = p.d(paramContext).getIso_code();
    if (str != null && "US/USA".equals(str))
      q.b().c(h1.w); 
  }
  
  public static void c(Context paramContext) {
    try {
      if (h0.a().equals("samsung") && Build.VERSION.SDK_INT >= 24) {
        q.b().c("is_samsung_device");
        boolean bool = i1.o0(paramContext, "com.samsung.android.sm_cn");
        if (bool) {
          q.b().c("is_has_smart_manager_cn");
          if (d0.a)
            d0.a("tony", "sm_cn"); 
        } else if (i1.o0(paramContext, "com.samsung.android.sm")) {
          q.b().c("is_has_smart_manager");
          if (d0.a)
            d0.a("tony", "sm"); 
        } 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static void d(String paramString) {
    (new HashMap<String, String>()).put("PlayError", paramString);
  }
  
  public static void e(String paramString) {
    (new HashMap<String, String>()).put("Error", paramString);
  }
  
  public static void f(Context paramContext) {
    q.b().c("search_offline_parser_new");
    String str = p.d(paramContext).getIso_code();
    if (str != null && str.equals("US/USA"))
      q.b().c("search_offline_parser_us_new"); 
    if (str != null && str.equals("IN/IND"))
      q.b().c("search_offline_parser_in_new"); 
    if (str != null && str.equals("IQ/IRQ"))
      q.b().c("search_offline_parser_iq_new"); 
    if (str != null && str.equals("EG/EGY"))
      q.b().c("search_offline_parser_eg_new"); 
  }
  
  public static void g(Context paramContext) {
    q.b().c("search_offline_parser_loc_success_new");
    String str = p.d(paramContext).getIso_code();
    if (str != null && str.equals("US/USA"))
      q.b().c("search_offline_parser_loc_success_us_new"); 
    if (str != null && str.equals("IN/IND"))
      q.b().c("search_offline_parser_loc_success_in_new"); 
    if (str != null && str.equals("IQ/IRQ"))
      q.b().c("search_offline_parser_loc_success_iq_new"); 
    if (str != null && str.equals("EG/EGY"))
      q.b().c("search_offline_parser_loc_success_eg_new"); 
  }
  
  public static void h(Context paramContext) {
    q.b().c("search_offline_parser_success_new");
    String str = p.d(paramContext).getIso_code();
    if (str != null && str.equals("US/USA"))
      q.b().c("search_offline_parser_success_us_new"); 
    if (str != null && str.equals("IN/IND"))
      q.b().c("search_offline_parser_success_in_new"); 
    if (str != null && str.equals("IQ/IRQ"))
      q.b().c("search_offline_parser_success_iq_new"); 
    if (str != null && str.equals("EG/EGY"))
      q.b().c("search_offline_parser_success_eg_new"); 
  }
  
  public static void i(Context paramContext) {
    String str = p.d(paramContext).getIso_code();
    if (str != null && str.equals("US/USA"))
      q.b().c("incoming_us_contact"); 
    if (str != null && str.equals("IN/IND"))
      q.b().c("incoming_in_contact"); 
    if (str != null && str.equals("IQ/IRQ"))
      q.b().c("incoming_irq_contact"); 
    if (str != null && str.equals("EG/EGY"))
      q.b().c("incoming_egy_contact"); 
    if (str != null && str.equals("ID/IDN"))
      q.b().c("incoming_idn_contact"); 
    if (str != null && str.equals("GB/GBR"))
      q.b().c("incoming_gbr_contact"); 
    if (str != null && str.equals("AU/AUS"))
      q.b().c("incoming_aus_contact"); 
    if (str != null && str.equals("DE/DEU"))
      q.b().c("incoming_deu_contact"); 
    if (str != null && str.equals("BR/BRA"))
      q.b().c("incoming_bra_contact"); 
    if (str != null && str.equals("NG/NGA"))
      q.b().c("incoming_nga_contact"); 
    if (str != null && str.equals("TR/TUR"))
      q.b().c("incoming_tur_contact"); 
    if (str != null && str.equals("PK/PAK"))
      q.b().c("incoming_pak_contact"); 
    if (str != null && str.equals("BD/BGD"))
      q.b().c("incoming_bgd_contact"); 
    if (str != null && str.equals("KE/KEN"))
      q.b().c("incoming_ken_contact"); 
    if (str != null && str.equals("CL/CHL"))
      q.b().c("incoming_chl_contact"); 
    if (str != null && str.equals("IT/ITA"))
      q.b().c("incoming_ita_contact"); 
    if (str != null && str.equals("ZA/ZAF"))
      q.b().c("incoming_zaf_contact"); 
    if (str != null && str.equals("PH/PHL"))
      q.b().c("incoming_phl_contact"); 
    if (str != null && str.equals("RU/RUS"))
      q.b().c("incoming_rus_contact"); 
    if (str != null && str.equals("ET/ETH"))
      q.b().c("incoming_eth_contact"); 
  }
  
  public static void j(Context paramContext) {
    String str = p.d(paramContext).getIso_code();
    if (str != null && str.equals("US/USA"))
      q.b().c("outgoing_us_contact"); 
    if (str != null && str.equals("IN/IND"))
      q.b().c("outgoing_in_contact"); 
    if (str != null && str.equals("IQ/IRQ"))
      q.b().c("outgoing_irq_contact"); 
    if (str != null && str.equals("EG/EGY"))
      q.b().c("outgoing_egy_contact"); 
    if (str != null && str.equals("ID/IDN"))
      q.b().c("outgoing_idn_contact"); 
    if (str != null && str.equals("GB/GBR"))
      q.b().c("outgoing_gbr_contact"); 
    if (str != null && str.equals("AU/AUS"))
      q.b().c("outgoing_aus_contact"); 
    if (str != null && str.equals("DE/DEU"))
      q.b().c("outgoing_deu_contact"); 
    if (str != null && str.equals("BR/BRA"))
      q.b().c("outgoing_bra_contact"); 
    if (str != null && str.equals("NG/NGA"))
      q.b().c("outgoing_nga_contact"); 
    if (str != null && str.equals("TR/TUR"))
      q.b().c("outgoing_tur_contact"); 
    if (str != null && str.equals("PK/PAK"))
      q.b().c("outgoing_pak_contact"); 
    if (str != null && str.equals("BD/BGD"))
      q.b().c("outgoing_bgd_contact"); 
    if (str != null && str.equals("KE/KEN"))
      q.b().c("outgoing_ken_contact"); 
    if (str != null && str.equals("CL/CHL"))
      q.b().c("outgoing_chl_contact"); 
    if (str != null && str.equals("IT/ITA"))
      q.b().c("outgoing_ita_contact"); 
    if (str != null && str.equals("ZA/ZAF"))
      q.b().c("outgoing_zaf_contact"); 
    if (str != null && str.equals("PH/PHL"))
      q.b().c("outgoing_phl_contact"); 
    if (str != null && str.equals("RU/RUS"))
      q.b().c("outgoing_rus_contact"); 
    if (str != null && str.equals("ET/ETH"))
      q.b().c("outgoing_eth_contact"); 
  }
  
  public static void k(Context paramContext) {
    ParserIpBean parserIpBean = c.a().b();
    if (parserIpBean != null && parserIpBean.getCountry() != null && !"".equals(parserIpBean.getCountry())) {
      String str = parserIpBean.getCountry();
      if (str != null && "in".equals(str)) {
        String str1 = parserIpBean.getState();
        if (str1 != null && !"".equals(str1)) {
          byte b = -1;
          switch (str1.hashCode()) {
            case 3483:
              if (!str1.equals("mh"))
                break; 
              b = 2;
              break;
            case 3414:
              if (!str1.equals("ka"))
                break; 
              b = 1;
              break;
            case 3208:
              if (!str1.equals("dl"))
                break; 
              b = 0;
              break;
          } 
          switch (b) {
            default:
              return;
            case 2:
              q.b().c("download_offline_db_mh_new");
            case 1:
              q.b().c("download_offline_db_ka_new");
            case 0:
              break;
          } 
          q.b().c("download_offline_db_dl_new");
        } 
      } 
    } 
  }
  
  public static void l(Context paramContext) {
    q.b().c("download_offline_db_new");
    String str = p.d(paramContext).getIso_code();
    if (str != null && str.equals("US/USA"))
      q.b().c("download_offline_db_new_us"); 
    if (str != null && str.equals("IN/IND"))
      q.b().c("download_offline_db_new_in"); 
    if (str != null && str.equals("IQ/IRQ"))
      q.b().c("download_offline_db_new_iq"); 
    if (str != null && str.equals("EG/EGY"))
      q.b().c("download_offline_db_new_eg"); 
    if (str != null && str.equals("ID/IDN"))
      q.b().c("download_offline_db_new_id"); 
  }
  
  public static void m(Context paramContext) {
    q.b().c("download_offline_db_ok_new");
    String str = p.d(paramContext).getIso_code();
    if (str != null && str.equals("US/USA"))
      q.b().c("download_offline_db_ok_us_new"); 
    if (str != null && str.equals("IN/IND"))
      q.b().c("download_offline_db_ok_in_new"); 
    if (str != null && str.equals("IQ/IRQ"))
      q.b().c("download_offline_db_ok_iq_new"); 
    if (str != null && str.equals("EG/EGY"))
      q.b().c("download_offline_db_ok_eg_new"); 
    if (str != null && str.equals("ID/IDN"))
      q.b().c("download_offline_db_ok_id_new"); 
  }
  
  public static void n(Context paramContext) {
    q.b().c("download_offline_db_ok_first_new");
    String str = p.d(paramContext).getIso_code();
    if (str != null && str.equals("US/USA"))
      q.b().c("download_offline_db_ok_us_first_new"); 
    if (str != null && str.equals("IN/IND"))
      q.b().c("download_offline_db_ok_in_first_new"); 
    if (str != null && str.equals("IQ/IRQ"))
      q.b().c("download_offline_db_ok_iq_first_new"); 
    if (str != null && str.equals("EG/EGY"))
      q.b().c("download_offline_db_ok_eg_first_new"); 
    if (str != null && str.equals("ID/IDN"))
      q.b().c("download_offline_db_ok_id_first_new"); 
  }
  
  public static void o(Context paramContext) {
    String str = p.d(paramContext).getIso_code();
    if (str != null && str.equals("US/USA"))
      q.b().c("download_offline_parser_new_us"); 
    if (str != null && str.equals("IN/IND"))
      q.b().c("download_offline_parser_new_in"); 
    if (str != null && str.equals("IQ/IRQ"))
      q.b().c("download_offline_parser_new_iq"); 
    if (str != null && str.equals("EG/EGY"))
      q.b().c("download_offline_parser_new_eg"); 
  }
  
  public static void p(Context paramContext) {
    String str = p.d(paramContext).getIso_code();
    if (str != null && str.equals("US/USA"))
      q.b().c("download_offline_parser_ok_us_new"); 
    if (str != null && str.equals("IN/IND"))
      q.b().c("download_offline_parser_ok_in_new"); 
    if (str != null && str.equals("IQ/IRQ"))
      q.b().c("download_offline_parser_ok_iq_new"); 
    if (str != null && str.equals("EG/EGY"))
      q.b().c("download_offline_parser_ok_eg_new"); 
  }
  
  public static void q(Context paramContext) {
    ParserIpBean parserIpBean = c.a().b();
    if (parserIpBean != null && parserIpBean.getCountry() != null && !"".equals(parserIpBean.getCountry())) {
      String str = parserIpBean.getCountry();
      if (str != null && "in".equals(str)) {
        String str1 = parserIpBean.getState();
        if (str1 != null && !"".equals(str1)) {
          byte b = -1;
          switch (str1.hashCode()) {
            case 3483:
              if (!str1.equals("mh"))
                break; 
              b = 2;
              break;
            case 3414:
              if (!str1.equals("ka"))
                break; 
              b = 1;
              break;
            case 3208:
              if (!str1.equals("dl"))
                break; 
              b = 0;
              break;
          } 
          switch (b) {
            default:
              return;
            case 2:
              q.b().c("download_offline_db_ok_mh_new");
            case 1:
              q.b().c("download_offline_db_ok_ka_new");
            case 0:
              break;
          } 
          q.b().c("download_offline_db_ok_dl_new");
        } 
      } 
    } 
  }
  
  public static void r(Context paramContext) {
    String str = p.d(paramContext).getIso_code();
    if (str != null && str.equals("US/USA"))
      q.b().c("first_enter_us"); 
    if (str != null && str.equals("IN/IND")) {
      q.b().c("first_enter_in");
      if (e.d(paramContext))
        q.b().c("first_enter_in_wifi"); 
    } 
    if (str != null && str.equals("ID/IDN"))
      q.b().c("first_enter_idn"); 
    if (str != null && str.equals("IQ/IRQ")) {
      q.b().c("first_enter_irq");
      if (e.d(paramContext))
        q.b().c("first_enter_irq_wifi"); 
    } 
    if (str != null && str.equals("EG/EGY")) {
      q.b().c("first_enter_egy");
      if (e.d(paramContext))
        q.b().c("first_enter_egy_wifi"); 
    } 
  }
  
  public static void s(Context paramContext) {
    q.b().c("is_numbergeographical_new");
    String str = p.d(paramContext).getIso_code();
    if (str != null && str.equals("US/USA"))
      q.b().c("is_numbergeographical_us_new"); 
    if (str != null && str.equals("IN/IND"))
      q.b().c("is_numbergeographical_in_new"); 
  }
  
  public static void t(Context paramContext) {
    q.b().c("is_numbergeographical_searchok");
    String str = p.d(paramContext).getIso_code();
    if (str != null && str.equals("US/USA"))
      q.b().c("is_numbergeographical_searchok_us"); 
    if (str != null && str.equals("IN/IND"))
      q.b().c("is_numbergeographical_searchok_in"); 
  }
  
  public static void u(Context paramContext) {
    String str = p.d(paramContext).getIso_code();
    if (str != null && str.equals("US/USA"))
      q.b().c("is_spam_answered"); 
  }
  
  public static void v(Context paramContext) {
    String str = p.d(paramContext).getIso_code();
    if (str != null && str.equals("US/USA"))
      q.b().c("is_spam_content_show"); 
  }
  
  public static void w(Context paramContext) {
    String str = p.d(paramContext).getIso_code();
    if (str != null && str.equals("US/USA"))
      q.b().c("us_is_connected"); 
    if (str != null && str.equals("IN/IND"))
      q.b().c("in_is_connected"); 
    if (str != null && str.equals("IQ/IRQ"))
      q.b().c("irq_is_connected"); 
    if (str != null && str.equals("EG/EGY"))
      q.b().c("egy_is_connected"); 
    if (str != null && str.equals("ID/IDN"))
      q.b().c("idn_is_connected"); 
    if (str != null && str.equals("GB/GBR"))
      q.b().c("gbr_is_connected"); 
    if (str != null && str.equals("AU/AUS"))
      q.b().c("aus_is_connected"); 
    if (str != null && str.equals("DE/DEU"))
      q.b().c("deu_is_connected"); 
    if (str != null && str.equals("BR/BRA"))
      q.b().c("bra_is_connected"); 
    if (str != null && str.equals("NG/NGA"))
      q.b().c("nga_is_connected"); 
    if (str != null && str.equals("TR/TUR"))
      q.b().c("tur_is_connected"); 
    if (str != null && str.equals("PK/PAK"))
      q.b().c("pak_is_connected"); 
    if (str != null && str.equals("BD/BGD"))
      q.b().c("bgd_is_connected"); 
  }
  
  public static void x(Context paramContext) {
    String str = p.d(paramContext).getIso_code();
    if (str != null && str.equals("US/USA"))
      q.b().c("us_not_connected"); 
    if (str != null && str.equals("IN/IND"))
      q.b().c("in_not_connected"); 
    if (str != null && str.equals("IQ/IRQ"))
      q.b().c("irq_not_connected"); 
    if (str != null && str.equals("EG/EGY"))
      q.b().c("egy_not_connected"); 
    if (str != null && str.equals("ID/IDN"))
      q.b().c("idn_not_connected"); 
    if (str != null && str.equals("GB/GBR"))
      q.b().c("gbr_not_connected"); 
    if (str != null && str.equals("AU/AUS"))
      q.b().c("aus_not_connected"); 
    if (str != null && str.equals("DE/DEU"))
      q.b().c("deu_not_connected"); 
    if (str != null && str.equals("BR/BRA"))
      q.b().c("bra_not_connected"); 
    if (str != null && str.equals("NG/NGA"))
      q.b().c("nga_not_connected"); 
    if (str != null && str.equals("TR/TUR"))
      q.b().c("tur_not_connected"); 
    if (str != null && str.equals("PK/PAK"))
      q.b().c("pak_not_connected"); 
    if (str != null && str.equals("BD/BGD"))
      q.b().c("bgd_not_connected"); 
  }
  
  public static void y(Context paramContext) {
    String str = p.d(paramContext).getIso_code();
    if (str != null && str.equals("IN/IND"))
      q.b().c("one_block_show_in"); 
    if (str != null && str.equals("US/USA"))
      q.b().c("one_block_show_us"); 
    if (str != null && str.equals("EG/EGY"))
      q.b().c("one_block_show_eg"); 
    if (str != null && str.equals("ID/IDN"))
      q.b().c("one_block_show_id"); 
    if (str != null && str.equals("GB/GBR"))
      q.b().c("one_block_show_gb"); 
    if (str != null && str.equals("IQ/IRQ"))
      q.b().c("one_block_show_iq"); 
  }
  
  public static void z(Context paramContext) {
    ParserIpBean parserIpBean = c.a().b();
    if (parserIpBean != null && parserIpBean.getCountry() != null && !"".equals(parserIpBean.getCountry())) {
      String str = parserIpBean.getCountry();
      if (str != null && "in".equals(str)) {
        String str1 = parserIpBean.getState();
        if (str1 != null && !"".equals(str1)) {
          byte b = -1;
          switch (str1.hashCode()) {
            case 3483:
              if (!str1.equals("mh"))
                break; 
              b = 2;
              break;
            case 3414:
              if (!str1.equals("ka"))
                break; 
              b = 1;
              break;
            case 3208:
              if (!str1.equals("dl"))
                break; 
              b = 0;
              break;
          } 
          switch (b) {
            default:
              return;
            case 2:
              q.b().c("request_offline_db_mh_new");
            case 1:
              q.b().c("request_offline_db_ka_new");
            case 0:
              break;
          } 
          q.b().c("request_offline_db_dl_new");
        } 
      } 
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/g0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */