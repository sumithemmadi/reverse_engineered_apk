package com.google.android.exoplayer2.util;

import org.xmlpull.v1.XmlPullParser;

public final class i0 {
  public static String a(XmlPullParser paramXmlPullParser, String paramString) {
    int i = paramXmlPullParser.getAttributeCount();
    for (byte b = 0; b < i; b++) {
      if (paramXmlPullParser.getAttributeName(b).equals(paramString))
        return paramXmlPullParser.getAttributeValue(b); 
    } 
    return null;
  }
  
  public static boolean b(XmlPullParser paramXmlPullParser) {
    boolean bool;
    if (paramXmlPullParser.getEventType() == 3) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public static boolean c(XmlPullParser paramXmlPullParser, String paramString) {
    boolean bool;
    if (b(paramXmlPullParser) && paramXmlPullParser.getName().equals(paramString)) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public static boolean d(XmlPullParser paramXmlPullParser) {
    boolean bool;
    if (paramXmlPullParser.getEventType() == 2) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public static boolean e(XmlPullParser paramXmlPullParser, String paramString) {
    boolean bool;
    if (d(paramXmlPullParser) && paramXmlPullParser.getName().equals(paramString)) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/util/i0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */