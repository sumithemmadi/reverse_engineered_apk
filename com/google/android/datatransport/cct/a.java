package com.google.android.datatransport.cct;

import com.google.android.datatransport.b;
import com.google.android.datatransport.h.f;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public final class a implements f {
  static final String a;
  
  static final String b;
  
  private static final String c;
  
  private static final Set<b> d = Collections.unmodifiableSet(new HashSet<b>(Arrays.asList(new b[] { b.b("proto"), b.b("json") })));
  
  public static final a e;
  
  public static final a f;
  
  private final String g;
  
  private final String h;
  
  static {
    e = new a(str1, null);
    f = new a(str2, str3);
  }
  
  public a(String paramString1, String paramString2) {
    this.g = paramString1;
    this.h = paramString2;
  }
  
  public static a c(byte[] paramArrayOfbyte) {
    String str = new String(paramArrayOfbyte, Charset.forName("UTF-8"));
    if (str.startsWith("1$")) {
      String[] arrayOfString = str.substring(2).split(Pattern.quote("\\"), 2);
      if (arrayOfString.length == 2) {
        String str1 = arrayOfString[0];
        if (!str1.isEmpty()) {
          String str3 = arrayOfString[1];
          String str2 = str3;
          if (str3.isEmpty())
            str2 = null; 
          return new a(str1, str2);
        } 
        throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
      } 
      throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
    } 
    throw new IllegalArgumentException("Version marker missing from extras");
  }
  
  public Set<b> a() {
    return d;
  }
  
  public byte[] b() {
    String str1 = this.h;
    if (str1 == null && this.g == null)
      return null; 
    String str2 = this.g;
    String str3 = str1;
    if (str1 == null)
      str3 = ""; 
    return String.format("%s%s%s%s", new Object[] { "1$", str2, "\\", str3 }).getBytes(Charset.forName("UTF-8"));
  }
  
  public byte[] d() {
    return b();
  }
  
  public String e() {
    return this.h;
  }
  
  public String f() {
    return this.g;
  }
  
  public String getName() {
    return "cct";
  }
  
  static {
    String str1 = e.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
    a = str1;
    String str2 = e.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
    b = str2;
    String str3 = e.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
    c = str3;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/cct/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */