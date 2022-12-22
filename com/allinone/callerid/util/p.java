package com.allinone.callerid.util;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.model.EZCountryCode;
import com.tencent.mmkv.MMKV;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class p {
  static {
  
  }
  
  public static List<EZCountryCode> a(Context paramContext) {
    ArrayList<EZCountryCode> arrayList = new ArrayList();
    JSONArray jSONArray = new JSONArray(f(paramContext, null));
    for (byte b = 0; b < jSONArray.length(); b++) {
      EZCountryCode eZCountryCode = new EZCountryCode();
      JSONObject jSONObject = jSONArray.getJSONObject(b);
      eZCountryCode.setCountry_name(jSONObject.getString("COUNTRY"));
      eZCountryCode.setCountry_code(jSONObject.getString("COUNTRY CODE"));
      eZCountryCode.setIso_code(jSONObject.getString("ISO CODES"));
      arrayList.add(eZCountryCode);
    } 
    return arrayList;
  }
  
  public static String b(Context paramContext) {
    String str;
    try {
      str = ((TelephonyManager)paramContext.getSystemService("phone")).getSimCountryIso().toUpperCase();
    } catch (Exception exception) {
      exception.printStackTrace();
      str = "";
    } 
    return str;
  }
  
  public static String c(Context paramContext, String paramString) {
    String str;
    try {
      String str1 = g(paramContext);
      JSONObject jSONObject = new JSONObject();
      this(str1);
      str = jSONObject.getString(paramString);
    } catch (JSONException jSONException) {
      jSONException.printStackTrace();
      str = "";
    } 
    return str;
  }
  
  public static EZCountryCode d(Context paramContext) {
    Context context = null;
    try {
      if (MMKV.o() == null) {
        String str = f0.a;
        a a = new a();
        this();
        MMKV.p(str, a);
      } 
    } finally {
      paramContext = null;
      paramContext.printStackTrace();
    } 
    if (paramContext != null) {
      EZCountryCode eZCountryCode1 = new EZCountryCode();
      try {
        eZCountryCode1.setCountry_code(paramContext.f("country_code", ""));
        eZCountryCode1.setIso_code(paramContext.f("country_iso", ""));
        eZCountryCode1.setCountry_name(paramContext.f("country_name", ""));
      } finally {
        paramContext = null;
        eZCountryCode1.setCountry_code("");
        eZCountryCode1.setIso_code("");
        eZCountryCode1.setCountry_name("");
      } 
      return eZCountryCode1;
    } 
    EZCountryCode eZCountryCode = new EZCountryCode();
    eZCountryCode.setCountry_code("");
    eZCountryCode.setIso_code("");
    eZCountryCode.setCountry_name("");
    return eZCountryCode;
  }
  
  public static String e(Context paramContext) {
    // Byte code:
    //   0: invokestatic c : ()Lcom/allinone/callerid/main/EZCallApplication;
    //   3: ldc 'android.permission.READ_PHONE_NUMBERS'
    //   5: invokestatic a : (Landroid/content/Context;Ljava/lang/String;)I
    //   8: ifne -> 47
    //   11: aload_0
    //   12: ldc 'android.permission.READ_PHONE_STATE'
    //   14: invokestatic a : (Landroid/content/Context;Ljava/lang/String;)I
    //   17: ifne -> 47
    //   20: aload_0
    //   21: ldc 'phone'
    //   23: invokevirtual getSystemService : (Ljava/lang/String;)Ljava/lang/Object;
    //   26: checkcast android/telephony/TelephonyManager
    //   29: astore_0
    //   30: aload_0
    //   31: ifnull -> 47
    //   34: aload_0
    //   35: invokevirtual getLine1Number : ()Ljava/lang/String;
    //   38: astore_0
    //   39: goto -> 50
    //   42: astore_0
    //   43: aload_0
    //   44: invokevirtual printStackTrace : ()V
    //   47: ldc ''
    //   49: astore_0
    //   50: aload_0
    //   51: ifnull -> 65
    //   54: ldc ''
    //   56: aload_0
    //   57: invokevirtual equals : (Ljava/lang/Object;)Z
    //   60: ifne -> 65
    //   63: aload_0
    //   64: areturn
    //   65: ldc 'author unknown'
    //   67: areturn
    // Exception table:
    //   from	to	target	type
    //   0	30	42	java/lang/Exception
    //   34	39	42	java/lang/Exception
  }
  
  public static String f(Context paramContext, String paramString) {
    String str = "";
    paramString = str;
    try {
      BufferedReader bufferedReader = new BufferedReader();
      paramString = str;
      InputStreamReader inputStreamReader = new InputStreamReader();
      paramString = str;
      this(paramContext.getResources().openRawResource(2131689472));
      paramString = str;
      this(inputStreamReader);
      String str1 = str;
      while (true) {
        paramString = str1;
        str = bufferedReader.readLine();
        paramString = str1;
        if (str != null) {
          paramString = str1;
          StringBuilder stringBuilder = new StringBuilder();
          paramString = str1;
          this();
          paramString = str1;
          stringBuilder.append(str1);
          paramString = str1;
          stringBuilder.append(str);
          paramString = str1;
          str1 = stringBuilder.toString();
          continue;
        } 
        break;
      } 
    } catch (Exception exception) {}
    return paramString;
  }
  
  public static String g(Context paramContext) {
    String str1 = "";
    String str2 = str1;
    try {
      BufferedReader bufferedReader = new BufferedReader();
      str2 = str1;
      InputStreamReader inputStreamReader = new InputStreamReader();
      str2 = str1;
      this(paramContext.getResources().openRawResource(2131689473));
      str2 = str1;
      this(inputStreamReader);
      String str = str1;
      while (true) {
        str2 = str;
        str1 = bufferedReader.readLine();
        str2 = str;
        if (str1 != null) {
          str2 = str;
          StringBuilder stringBuilder = new StringBuilder();
          str2 = str;
          this();
          str2 = str;
          stringBuilder.append(str);
          str2 = str;
          stringBuilder.append(str1);
          str2 = str;
          str = stringBuilder.toString();
          continue;
        } 
        break;
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    return str2;
  }
  
  public static void h(Context paramContext, EZCountryCode paramEZCountryCode) {
    try {
      if (MMKV.o() == null) {
        String str = f0.a;
        b b = new b();
        this();
        MMKV.p(str, b);
      } 
    } finally {
      paramContext = null;
    } 
  }
  
  static final class a implements MMKV.b {
    public void a(String param1String) {
      try {
        com.getkeepsafe.relinker.b.a((Context)EZCallApplication.c(), param1String);
      } finally {
        param1String = null;
      } 
    }
  }
  
  static final class b implements MMKV.b {
    public void a(String param1String) {
      try {
        com.getkeepsafe.relinker.b.a((Context)EZCallApplication.c(), param1String);
      } finally {
        param1String = null;
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */