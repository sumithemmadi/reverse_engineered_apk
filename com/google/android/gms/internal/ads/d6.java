package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.b1;
import com.google.android.gms.ads.internal.util.q0;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class d6 {
  public static final x6<tq> a = g6.a;
  
  public static final x6<tq> b = f6.a;
  
  public static final x6<tq> c = i6.a;
  
  public static final x6<tq> d = h6.a;
  
  public static final x6<tq> e = new m6();
  
  public static final x6<tq> f = new o6();
  
  public static final x6<tq> g = k6.a;
  
  public static final x6<Object> h = new n6();
  
  public static final x6<tq> i = new q6();
  
  public static final x6<tq> j = j6.a;
  
  public static final x6<tq> k = new p6();
  
  public static final x6<tq> l = new t6();
  
  public static final x6<eo> m = new rp();
  
  public static final x6<eo> n = new pp();
  
  public static final x6<tq> o = new e6();
  
  public static final f7 p = new f7();
  
  public static final x6<tq> q = new s6();
  
  public static final x6<tq> r = new v6();
  
  public static final x6<tq> s = new u6();
  
  public static final x6<tq> t = new l6();
  
  public static <T extends ur & ds & fs> String a(T paramT, String paramString) {
    Uri uri2;
    Uri uri1 = Uri.parse(paramString);
    try {
      p12 p12 = ((ds)paramT).c();
      uri2 = uri1;
      if (p12 != null) {
        uri2 = uri1;
        if (p12.f(uri1))
          uri2 = p12.b(uri1, paramT.getContext(), ((fs)paramT).getView(), paramT.a()); 
      } 
    } catch (zzeh zzeh) {
      paramString = String.valueOf(paramString);
      if (paramString.length() != 0) {
        paramString = "Unable to append parameter to URL: ".concat(paramString);
      } else {
        paramString = new String("Unable to append parameter to URL: ");
      } 
      cm.i(paramString);
      uri2 = uri1;
    } 
    return qk.b(uri2, paramT.getContext());
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/d6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */