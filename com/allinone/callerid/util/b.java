package com.allinone.callerid.util;

import android.content.Context;
import java.util.Locale;

public class b {
  private static boolean a(String paramString) {
    paramString.hashCode();
    int i = paramString.hashCode();
    boolean bool = false;
    byte b1 = -1;
    switch (i) {
      case 2648:
        if (!paramString.equals("SK"))
          break; 
        b1 = 27;
        break;
      case 2646:
        if (!paramString.equals("SI"))
          break; 
        b1 = 26;
        break;
      case 2642:
        if (!paramString.equals("SE"))
          break; 
        b1 = 25;
        break;
      case 2621:
        if (!paramString.equals("RO"))
          break; 
        b1 = 24;
        break;
      case 2564:
        if (!paramString.equals("PT"))
          break; 
        b1 = 23;
        break;
      case 2556:
        if (!paramString.equals("PL"))
          break; 
        b1 = 22;
        break;
      case 2494:
        if (!paramString.equals("NL"))
          break; 
        b1 = 21;
        break;
      case 2471:
        if (!paramString.equals("MT"))
          break; 
        b1 = 20;
        break;
      case 2442:
        if (!paramString.equals("LV"))
          break; 
        b1 = 19;
        break;
      case 2441:
        if (!paramString.equals("LU"))
          break; 
        b1 = 18;
        break;
      case 2440:
        if (!paramString.equals("LT"))
          break; 
        b1 = 17;
        break;
      case 2347:
        if (!paramString.equals("IT"))
          break; 
        b1 = 16;
        break;
      case 2332:
        if (!paramString.equals("IE"))
          break; 
        b1 = 15;
        break;
      case 2317:
        if (!paramString.equals("HU"))
          break; 
        b1 = 14;
        break;
      case 2314:
        if (!paramString.equals("HR"))
          break; 
        b1 = 13;
        break;
      case 2283:
        if (!paramString.equals("GR"))
          break; 
        b1 = 12;
        break;
      case 2267:
        if (!paramString.equals("GB"))
          break; 
        b1 = 11;
        break;
      case 2252:
        if (!paramString.equals("FR"))
          break; 
        b1 = 10;
        break;
      case 2243:
        if (!paramString.equals("FI"))
          break; 
        b1 = 9;
        break;
      case 2222:
        if (!paramString.equals("ES"))
          break; 
        b1 = 8;
        break;
      case 2208:
        if (!paramString.equals("EE"))
          break; 
        b1 = 7;
        break;
      case 2183:
        if (!paramString.equals("DK"))
          break; 
        b1 = 6;
        break;
      case 2177:
        if (!paramString.equals("DE"))
          break; 
        b1 = 5;
        break;
      case 2167:
        if (!paramString.equals("CZ"))
          break; 
        b1 = 4;
        break;
      case 2166:
        if (!paramString.equals("CY"))
          break; 
        b1 = 3;
        break;
      case 2117:
        if (!paramString.equals("BG"))
          break; 
        b1 = 2;
        break;
      case 2115:
        if (!paramString.equals("BE"))
          break; 
        b1 = 1;
        break;
      case 2099:
        if (!paramString.equals("AT"))
          break; 
        b1 = 0;
        break;
    } 
    switch (b1) {
      default:
        return bool;
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
      case 11:
      case 12:
      case 13:
      case 14:
      case 15:
      case 16:
      case 17:
      case 18:
      case 19:
      case 20:
      case 21:
      case 22:
      case 23:
      case 24:
      case 25:
      case 26:
      case 27:
        break;
    } 
    bool = true;
  }
  
  public static boolean b(Context paramContext) {
    boolean bool;
    String str = p.b(paramContext);
    StringBuilder stringBuilder2 = new StringBuilder();
    stringBuilder2.append("countryISO=");
    stringBuilder2.append(str);
    d0.a("country", stringBuilder2.toString());
    if (str != null && !"".equals(str)) {
      bool = a(str);
    } else {
      str = Locale.getDefault().getCountry();
      stringBuilder2 = new StringBuilder();
      stringBuilder2.append("locale=");
      stringBuilder2.append(str);
      d0.a("country", stringBuilder2.toString());
      if (str != null && !"".equals(str)) {
        bool = a(str);
      } else {
        String str1 = i1.K(paramContext);
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append("networkCountry=");
        stringBuilder2.append(str1);
        d0.a("country", stringBuilder2.toString());
        if (str1 != null && !"".equals(str1)) {
          bool = a(str1);
        } else {
          bool = false;
        } 
      } 
    } 
    StringBuilder stringBuilder1 = new StringBuilder();
    stringBuilder1.append("isEU=");
    stringBuilder1.append(bool);
    d0.a("country", stringBuilder1.toString());
    return bool;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */