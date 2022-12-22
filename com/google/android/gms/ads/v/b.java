package com.google.android.gms.ads.v;

import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

final class b extends Thread {
  b(a parama, Map paramMap) {}
  
  public final void run() {
    String str1;
    String str2;
    StringBuilder stringBuilder;
    new d();
    Map map = this.b;
    Uri.Builder builder = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
    for (String str : map.keySet())
      builder.appendQueryParameter(str, (String)map.get(str)); 
    String str3 = builder.build().toString();
    try {
      URL uRL = new URL();
      this(str3);
      HttpURLConnection httpURLConnection = (HttpURLConnection)uRL.openConnection();
      try {
        int i = httpURLConnection.getResponseCode();
        if (i < 200 || i >= 300) {
          int j = String.valueOf(str3).length();
          StringBuilder stringBuilder1 = new StringBuilder();
          this(j + 65);
          stringBuilder1.append("Received non-success response code ");
          stringBuilder1.append(i);
          stringBuilder1.append(" from pinging URL: ");
          stringBuilder1.append(str3);
          Log.w("HttpUrlPinger", stringBuilder1.toString());
        } 
        return;
      } finally {
        httpURLConnection.disconnect();
      } 
    } catch (IndexOutOfBoundsException null) {
      str2 = runtimeException.getMessage();
      stringBuilder = new StringBuilder(String.valueOf(str3).length() + 32 + String.valueOf(str2).length());
      str1 = "Error while parsing ping URL: ";
    } catch (IOException iOException) {
      str2 = iOException.getMessage();
      stringBuilder = new StringBuilder(String.valueOf(str3).length() + 27 + String.valueOf(str2).length());
      str1 = "Error while pinging URL: ";
    } catch (RuntimeException runtimeException) {
      str2 = runtimeException.getMessage();
      stringBuilder = new StringBuilder(String.valueOf(str3).length() + 27 + String.valueOf(str2).length());
      str1 = "Error while pinging URL: ";
    } 
    stringBuilder.append(str1);
    stringBuilder.append(str3);
    stringBuilder.append(". ");
    stringBuilder.append(str2);
    Log.w("HttpUrlPinger", stringBuilder.toString(), runtimeException);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/v/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */