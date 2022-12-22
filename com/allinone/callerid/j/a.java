package com.allinone.callerid.j;

import com.allinone.callerid.util.w;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.builder.GetBuilder;
import com.zhy.http.okhttp.builder.PostFormBuilder;
import java.util.Map;

public class a {
  public static String a(String paramString, Map<String, String> paramMap) {
    return ((GetBuilder)OkHttpUtils.get().url(paramString)).params(paramMap).build().execute().body().string();
  }
  
  public static String b(String paramString, Map<String, String> paramMap) {
    paramString = ((PostFormBuilder)OkHttpUtils.post().url(paramString)).params(paramMap).build().execute().body().string();
    if (!"".equals(paramString))
      try {
        return w.b(paramString);
      } finally {
        paramString = null;
      }  
    return "";
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/j/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */