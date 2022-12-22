package com.allinone.callerid.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class n0 {
  private static Pattern a = Pattern.compile("\\d+");
  
  public static String a(String paramString) {
    Matcher matcher = a.matcher(paramString);
    if (matcher.find())
      paramString = matcher.group(); 
    return paramString;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/n0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */