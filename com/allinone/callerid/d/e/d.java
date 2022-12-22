package com.allinone.callerid.d.e;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.p;
import com.allinone.callerid.util.t;
import com.allinone.callerid.util.w;
import com.yanzhenjie.nohttp.BasicRequest;
import com.yanzhenjie.nohttp.Binary;
import com.yanzhenjie.nohttp.ByteArrayBinary;
import com.yanzhenjie.nohttp.RequestMethod;
import com.yanzhenjie.nohttp.rest.Request;
import com.yanzhenjie.nohttp.rest.Response;
import com.yanzhenjie.nohttp.rest.StringRequest;
import com.yanzhenjie.nohttp.rest.SyncRequestExecutor;
import java.util.HashMap;
import org.json.JSONObject;

public class d {
  public static void a(String paramString1, String paramString2, Uri paramUri, a parama) {
    (new b(paramString1, paramString2, paramUri, parama)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[0]);
  }
  
  public static interface a {
    void a(boolean param1Boolean1, boolean param1Boolean2);
  }
  
  private static class b extends AsyncTask<String, String, Boolean> {
    private d.a a;
    
    private String b;
    
    private String c;
    
    private Uri d;
    
    private String e;
    
    private String f;
    
    private boolean g;
    
    b(String param1String1, String param1String2, Uri param1Uri, d.a param1a) {
      this.a = param1a;
      this.b = param1String1;
      this.c = param1String2;
      this.d = param1Uri;
    }
    
    protected Boolean a(String... param1VarArgs) {
      if (this.d != null)
        try {
          EZCallApplication eZCallApplication = EZCallApplication.c();
          Cursor cursor = eZCallApplication.getContentResolver().query(this.d, null, null, null, null);
          if (cursor != null && cursor.moveToFirst()) {
            this.e = cursor.getString(cursor.getColumnIndex("_data"));
            String[] arrayOfString = cursor.getString(cursor.getColumnIndex("mime_type")).split("/");
            if (arrayOfString.length > 0)
              this.f = arrayOfString[1]; 
            if (d0.a) {
              StringBuilder stringBuilder = new StringBuilder();
              this();
              stringBuilder.append("video_path:");
              stringBuilder.append(this.e);
              stringBuilder.append("\n");
              stringBuilder.append("data_format:");
              stringBuilder.append(this.f);
              d0.a("callscreen", stringBuilder.toString());
            } 
          } 
          if (cursor != null)
            cursor.close(); 
          String str = this.e;
          if (str != null && !"".equals(str)) {
            byte[] arrayOfByte = com.allinone.callerid.d.f.a.g(this.e);
            if (arrayOfByte != null && arrayOfByte.length > 0) {
              if (d0.a) {
                StringBuilder stringBuilder = new StringBuilder();
                this();
                stringBuilder.append("videoByte:");
                stringBuilder.append(arrayOfByte.length / 1048576);
                stringBuilder.append("M");
                d0.a("callscreen", stringBuilder.toString());
              } 
              if (arrayOfByte.length / 1048576 < 20) {
                boolean bool = d0.a;
                if (bool) {
                  HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
                  this();
                  hashMap.put("default_cc", p.d((Context)eZCallApplication).getCountry_code());
                  hashMap.put("language", i1.G());
                  hashMap.put("uid", i1.T((Context)eZCallApplication));
                  hashMap.put("version", i1.W((Context)eZCallApplication));
                  hashMap.put("stamp", i1.Q((Context)eZCallApplication, i1.T((Context)eZCallApplication)));
                  hashMap.put("data_format", this.f);
                  hashMap.put("data_title", this.b);
                  hashMap.put("data_author", this.c);
                  if (d0.a) {
                    StringBuilder stringBuilder = new StringBuilder();
                    this();
                    stringBuilder.append("params: ");
                    stringBuilder.append(hashMap.toString());
                    d0.a("callscreen", stringBuilder.toString());
                  } 
                } 
                StringRequest stringRequest2 = new StringRequest();
                this("https://app.show-caller.com/caller_screen_v2/v1/useuplscr.php", RequestMethod.POST);
                BasicRequest basicRequest = ((Request)stringRequest2.add("default_cc", p.d((Context)eZCallApplication).getCountry_code())).add("language", i1.G()).add("uid", i1.T((Context)eZCallApplication)).add("version", i1.W((Context)eZCallApplication)).add("stamp", i1.Q((Context)eZCallApplication, i1.T((Context)eZCallApplication))).add("data_format", this.f).add("data_title", this.b).add("data_author", this.c);
                ByteArrayBinary byteArrayBinary = new ByteArrayBinary();
                this(arrayOfByte, this.e);
                StringRequest stringRequest1 = (StringRequest)basicRequest.add("data_file", (Binary)byteArrayBinary);
                Response response = SyncRequestExecutor.INSTANCE.execute((Request)stringRequest1);
                if (response.isSucceed()) {
                  String str1 = (String)response.get();
                  if (d0.a) {
                    StringBuilder stringBuilder = new StringBuilder();
                    this();
                    stringBuilder.append("str: ");
                    stringBuilder.append(str1);
                    d0.a("callscreen", stringBuilder.toString());
                  } 
                  str1 = w.b(str1);
                  if (d0.a) {
                    StringBuilder stringBuilder = new StringBuilder();
                    this();
                    stringBuilder.append("result: ");
                    stringBuilder.append(str1);
                    d0.a("callscreen", stringBuilder.toString());
                  } 
                  if (str1 != null && !"".equals(str1)) {
                    JSONObject jSONObject = new JSONObject();
                    this(str1);
                    int i = jSONObject.getInt("status");
                    if (i == 1)
                      return Boolean.TRUE; 
                    if (i == -20)
                      t.a(); 
                  } 
                } 
              } else {
                this.g = true;
              } 
            } 
          } 
        } catch (Exception exception) {
          exception.printStackTrace();
        }  
      return Boolean.FALSE;
    }
    
    protected void b(Boolean param1Boolean) {
      super.onPostExecute(param1Boolean);
      d.a a1 = this.a;
      if (a1 != null)
        a1.a(param1Boolean.booleanValue(), this.g); 
    }
    
    protected void c(String... param1VarArgs) {
      super.onProgressUpdate((Object[])param1VarArgs);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/d/e/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */