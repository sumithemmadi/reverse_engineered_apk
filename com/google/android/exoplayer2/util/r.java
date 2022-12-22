package com.google.android.exoplayer2.util;

import android.text.TextUtils;
import java.util.ArrayList;

public final class r {
  private static final ArrayList<a> a = new ArrayList<a>();
  
  public static boolean a(String paramString) {
    if (paramString == null)
      return false; 
    byte b = -1;
    switch (paramString.hashCode()) {
      case 1504831518:
        if (!paramString.equals("audio/mpeg"))
          break; 
        b = 3;
        break;
      case -53558318:
        if (!paramString.equals("audio/mp4a-latm"))
          break; 
        b = 2;
        break;
      case -432837259:
        if (!paramString.equals("audio/mpeg-L2"))
          break; 
        b = 1;
        break;
      case -432837260:
        if (!paramString.equals("audio/mpeg-L1"))
          break; 
        b = 0;
        break;
    } 
    switch (b) {
      default:
        return false;
      case 0:
      case 1:
      case 2:
      case 3:
        break;
    } 
    return true;
  }
  
  public static String b(String paramString) {
    if (paramString == null)
      return null; 
    String[] arrayOfString = h0.p0(paramString);
    int i = arrayOfString.length;
    for (byte b = 0; b < i; b++) {
      paramString = e(arrayOfString[b]);
      if (paramString != null && l(paramString))
        return paramString; 
    } 
    return null;
  }
  
  private static String c(String paramString) {
    int i = a.size();
    for (byte b = 0; b < i; b++) {
      a a = a.get(b);
      if (paramString.startsWith(a.b))
        return a.a; 
    } 
    return null;
  }
  
  public static int d(String paramString) {
    paramString.hashCode();
    int i = paramString.hashCode();
    byte b = -1;
    switch (i) {
      case 1556697186:
        if (!paramString.equals("audio/true-hd"))
          break; 
        b = 7;
        break;
      case 1505942594:
        if (!paramString.equals("audio/vnd.dts.hd"))
          break; 
        b = 6;
        break;
      case 1504831518:
        if (!paramString.equals("audio/mpeg"))
          break; 
        b = 5;
        break;
      case 1504578661:
        if (!paramString.equals("audio/eac3"))
          break; 
        b = 4;
        break;
      case 187078297:
        if (!paramString.equals("audio/ac4"))
          break; 
        b = 3;
        break;
      case 187078296:
        if (!paramString.equals("audio/ac3"))
          break; 
        b = 2;
        break;
      case -1095064472:
        if (!paramString.equals("audio/vnd.dts"))
          break; 
        b = 1;
        break;
      case -2123537834:
        if (!paramString.equals("audio/eac3-joc"))
          break; 
        b = 0;
        break;
    } 
    switch (b) {
      default:
        return 0;
      case 7:
        return 14;
      case 6:
        return 8;
      case 5:
        return 9;
      case 4:
        return 6;
      case 3:
        return 17;
      case 2:
        return 5;
      case 1:
        return 7;
      case 0:
        break;
    } 
    return 18;
  }
  
  public static String e(String paramString) {
    String str1 = null;
    if (paramString == null)
      return null; 
    String str2 = h0.u0(paramString.trim());
    if (str2.startsWith("avc1") || str2.startsWith("avc3"))
      return "video/avc"; 
    if (str2.startsWith("hev1") || str2.startsWith("hvc1"))
      return "video/hevc"; 
    if (str2.startsWith("dvav") || str2.startsWith("dva1") || str2.startsWith("dvhe") || str2.startsWith("dvh1"))
      return "video/dolby-vision"; 
    if (str2.startsWith("av01"))
      return "video/av01"; 
    if (str2.startsWith("vp9") || str2.startsWith("vp09"))
      return "video/x-vnd.on2.vp9"; 
    if (str2.startsWith("vp8") || str2.startsWith("vp08"))
      return "video/x-vnd.on2.vp8"; 
    if (str2.startsWith("mp4a")) {
      String str;
      paramString = str1;
      if (str2.startsWith("mp4a.")) {
        str2 = str2.substring(5);
        paramString = str1;
        if (str2.length() >= 2)
          try {
            paramString = f(Integer.parseInt(h0.w0(str2.substring(0, 2)), 16));
          } catch (NumberFormatException numberFormatException) {
            str = str1;
          }  
      } 
      str1 = str;
      if (str == null)
        str1 = "audio/mp4a-latm"; 
      return str1;
    } 
    return (str2.startsWith("ac-3") || str2.startsWith("dac3")) ? "audio/ac3" : ((str2.startsWith("ec-3") || str2.startsWith("dec3")) ? "audio/eac3" : (str2.startsWith("ec+3") ? "audio/eac3-joc" : ((str2.startsWith("ac-4") || str2.startsWith("dac4")) ? "audio/ac4" : ((str2.startsWith("dtsc") || str2.startsWith("dtse")) ? "audio/vnd.dts" : ((str2.startsWith("dtsh") || str2.startsWith("dtsl")) ? "audio/vnd.dts.hd" : (str2.startsWith("opus") ? "audio/opus" : (str2.startsWith("vorbis") ? "audio/vorbis" : (str2.startsWith("flac") ? "audio/flac" : c(str2)))))))));
  }
  
  public static String f(int paramInt) {
    if (paramInt != 32) {
      if (paramInt != 33) {
        if (paramInt != 35) {
          if (paramInt != 64)
            if (paramInt != 163) {
              if (paramInt != 177) {
                if (paramInt != 165) {
                  if (paramInt != 166) {
                    switch (paramInt) {
                      default:
                        switch (paramInt) {
                          default:
                            return null;
                          case 174:
                            return "audio/ac4";
                          case 173:
                            return "audio/opus";
                          case 170:
                          case 171:
                            return "audio/vnd.dts.hd";
                          case 169:
                          case 172:
                            break;
                        } 
                        return "audio/vnd.dts";
                      case 106:
                        return "video/mpeg";
                      case 105:
                      case 107:
                        return "audio/mpeg";
                      case 96:
                      case 97:
                      case 98:
                      case 99:
                      case 100:
                      case 101:
                        return "video/mpeg2";
                      case 102:
                      case 103:
                      case 104:
                        break;
                    } 
                  } else {
                    return "audio/eac3";
                  } 
                } else {
                  return "audio/ac3";
                } 
              } else {
                return "video/x-vnd.on2.vp9";
              } 
            } else {
              return "video/wvc1";
            }  
          return "audio/mp4a-latm";
        } 
        return "video/hevc";
      } 
      return "video/avc";
    } 
    return "video/mp4v-es";
  }
  
  private static String g(String paramString) {
    if (paramString == null)
      return null; 
    int i = paramString.indexOf('/');
    return (i == -1) ? null : paramString.substring(0, i);
  }
  
  public static int h(String paramString) {
    return TextUtils.isEmpty(paramString) ? -1 : (l(paramString) ? 1 : (n(paramString) ? 2 : ((m(paramString) || "application/cea-608".equals(paramString) || "application/cea-708".equals(paramString) || "application/x-mp4-cea-608".equals(paramString) || "application/x-subrip".equals(paramString) || "application/ttml+xml".equals(paramString) || "application/x-quicktime-tx3g".equals(paramString) || "application/x-mp4-vtt".equals(paramString) || "application/x-rawcc".equals(paramString) || "application/vobsub".equals(paramString) || "application/pgs".equals(paramString) || "application/dvbsubs".equals(paramString)) ? 3 : (("application/id3".equals(paramString) || "application/x-emsg".equals(paramString) || "application/x-scte35".equals(paramString)) ? 4 : ("application/x-camera-motion".equals(paramString) ? 5 : i(paramString))))));
  }
  
  private static int i(String paramString) {
    int i = a.size();
    for (byte b = 0; b < i; b++) {
      a a = a.get(b);
      if (paramString.equals(a.a))
        return a.c; 
    } 
    return -1;
  }
  
  public static int j(String paramString) {
    return h(e(paramString));
  }
  
  public static String k(String paramString) {
    if (paramString == null)
      return null; 
    String[] arrayOfString = h0.p0(paramString);
    int i = arrayOfString.length;
    for (byte b = 0; b < i; b++) {
      String str = e(arrayOfString[b]);
      if (str != null && n(str))
        return str; 
    } 
    return null;
  }
  
  public static boolean l(String paramString) {
    return "audio".equals(g(paramString));
  }
  
  public static boolean m(String paramString) {
    return "text".equals(g(paramString));
  }
  
  public static boolean n(String paramString) {
    return "video".equals(g(paramString));
  }
  
  private static final class a {
    public final String a;
    
    public final String b;
    
    public final int c;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/util/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */