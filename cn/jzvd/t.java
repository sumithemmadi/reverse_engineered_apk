package cn.jzvd;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class t {
  public int a;
  
  public LinkedHashMap b = new LinkedHashMap<Object, Object>();
  
  public String c = "";
  
  public HashMap<String, String> d = new HashMap<String, String>();
  
  public boolean e = true;
  
  public t(Object paramObject) {
    this.b.put("URL_KEY_DEFAULT", paramObject);
    this.a = 0;
  }
  
  public t(String paramString) {
    this.b.put("URL_KEY_DEFAULT", paramString);
    this.a = 0;
  }
  
  public t(String paramString1, String paramString2) {
    this.b.put("URL_KEY_DEFAULT", paramString1);
    this.c = paramString2;
    this.a = 0;
  }
  
  public t(LinkedHashMap paramLinkedHashMap, String paramString) {
    this.b.clear();
    this.b.putAll(paramLinkedHashMap);
    this.c = paramString;
    this.a = 0;
  }
  
  public t a() {
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>();
    linkedHashMap.putAll(this.b);
    return new t(linkedHashMap, this.c);
  }
  
  public Object b() {
    return d(this.a);
  }
  
  public Object c() {
    return e(this.a);
  }
  
  public String d(int paramInt) {
    Iterator<Object> iterator = this.b.keySet().iterator();
    for (int i = 0; iterator.hasNext(); i++) {
      Object object = iterator.next();
      if (i == paramInt)
        return object.toString(); 
    } 
    return null;
  }
  
  public Object e(int paramInt) {
    Iterator<Object> iterator = this.b.keySet().iterator();
    for (int i = 0; iterator.hasNext(); i++) {
      Object object = iterator.next();
      if (i == paramInt)
        return this.b.get(object); 
    } 
    return null;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/cn/jzvd/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */