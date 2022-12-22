package com.allinone.callerid.util;

import android.content.Context;
import java.util.HashMap;
import org.json.JSONObject;

public class z {
  private b a;
  
  public void b(Context paramContext) {
    (j0.a()).b.execute(new a(this, paramContext));
  }
  
  public void c(b paramb) {
    this.a = paramb;
  }
  
  class a implements Runnable {
    a(z this$0, Context param1Context) {}
    
    public void run() {
      try {
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        this();
        hashMap.put("id", i1.M(this.b));
        hashMap.put("version", i1.W(this.b));
        hashMap.put("is_android", "1");
        String str = com.allinone.callerid.j.a.a("https://info.show-caller.com/gonglue_xilie/ping.php", hashMap);
        if (d0.a) {
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("result:");
          stringBuilder.append(str);
          d0.a("tony", stringBuilder.toString());
        } 
        JSONObject jSONObject = new JSONObject();
        this(str);
        int i = jSONObject.getInt("status");
        int j = jSONObject.getInt("in_control");
        if (i == 1 && j == 0) {
          com.allinone.callerid.model.a a1 = new com.allinone.callerid.model.a();
          this();
          a1.d(jSONObject.getString("update_url"));
          a1.c(jSONObject.getString("min_version_in_maintenance"));
          if (z.a(this.c) != null)
            z.a(this.c).a(a1); 
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  public static interface b {
    void a(com.allinone.callerid.model.a param1a);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */