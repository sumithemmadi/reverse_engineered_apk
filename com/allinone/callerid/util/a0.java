package com.allinone.callerid.util;

public class a0 {
  private static String a(int paramInt) {
    StringBuffer stringBuffer = new StringBuffer();
    for (byte b = 0; b < paramInt; b++)
      stringBuffer.append('\t'); 
    return stringBuffer.toString();
  }
  
  public static String b(String paramString) {
    StringBuffer stringBuffer = new StringBuffer();
    int i = paramString.length();
    byte b = 0;
    int j = 0;
    int k;
    for (k = 0; b < i; k = c1) {
      char c = paramString.charAt(b);
      if (c == '{') {
        k = j + 1;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(c);
        stringBuilder.append("\n");
        stringBuffer.append(stringBuilder.toString());
        stringBuffer.append(a(k));
      } else if (c == '}') {
        k = j - 1;
        stringBuffer.append("\n");
        stringBuffer.append(a(k));
        stringBuffer.append(c);
      } else if (c == ',') {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(c);
        stringBuilder.append("\n");
        stringBuffer.append(stringBuilder.toString());
        stringBuffer.append(a(j));
        k = j;
      } else if (c == ':') {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(c);
        stringBuilder.append(" ");
        stringBuffer.append(stringBuilder.toString());
        k = j;
      } else if (c == '[') {
        k = j + 1;
        if (paramString.charAt(b + 1) == ']') {
          stringBuffer.append(c);
        } else {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append(c);
          stringBuilder.append("\n");
          stringBuffer.append(stringBuilder.toString());
          stringBuffer.append(a(k));
        } 
      } else if (c == ']') {
        j--;
        if (k == 91) {
          stringBuffer.append(c);
          k = j;
        } else {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("\n");
          stringBuilder.append(a(j));
          stringBuilder.append(c);
          stringBuffer.append(stringBuilder.toString());
          k = j;
        } 
      } else {
        stringBuffer.append(c);
        k = j;
      } 
      b++;
      char c1 = c;
      j = k;
    } 
    return stringBuffer.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/a0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */