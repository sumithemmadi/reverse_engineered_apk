package com.allinone.callerid.util;

import android.content.Context;
import com.allinone.callerid.bean.CustomBlock;
import com.allinone.callerid.bean.EZBlackList;
import com.allinone.callerid.main.EZCallApplication;
import java.util.ArrayList;
import java.util.List;
import org.xutils.DbManager;

public class m {
  private Context a;
  
  private DbManager b;
  
  private DbManager c;
  
  public m(Context paramContext) {
    this.a = paramContext;
    try {
      this.b = k.a().b();
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    try {
      this.c = l.a().b();
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void a() {
    try {
      List list = this.b.selector(EZBlackList.class).findAll();
      if (list != null && list.size() > 0)
        this.b.delete(list); 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void b() {
    try {
      List list = this.c.selector(CustomBlock.class).where("number", "!=", "").findAll();
      if (list != null && list.size() > 0)
        this.c.delete(list); 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void c(String paramString) {
    try {
      EZBlackList eZBlackList = (EZBlackList)this.b.selector(EZBlackList.class).where("number", "=", paramString).findFirst();
      if (eZBlackList != null)
        this.b.delete(eZBlackList); 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void d(String paramString) {
    String str = i1.g((Context)EZCallApplication.c(), paramString, p.d((Context)EZCallApplication.c()).getCountry_code());
    try {
      List list = this.b.selector(EZBlackList.class).where("number", "=", paramString).or("number", "=", str).findAll();
      if (list != null && list.size() > 0)
        this.b.delete(list); 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void e(String paramString) {
    try {
      List list = this.c.selector(CustomBlock.class).where("number", "=", paramString).findAll();
      if (list != null && list.size() > 0)
        this.c.delete(list); 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public List<CustomBlock> f() {
    List<CustomBlock> list = new ArrayList();
    try {
      List<CustomBlock> list1 = this.c.selector(CustomBlock.class).orderBy("_id", true).findAll();
      list = list1;
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    return list;
  }
  
  public List<CustomBlock> g(int paramInt) {
    List<CustomBlock> list = new ArrayList();
    try {
      List<CustomBlock> list1 = this.c.selector(CustomBlock.class).where("type", "=", String.valueOf(paramInt)).findAll();
      list = list1;
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    return list;
  }
  
  public List<EZBlackList> h() {
    try {
      ArrayList<EZBlackList> arrayList = new ArrayList();
      this();
      List<EZBlackList> list = this.b.selector(EZBlackList.class).orderBy("_id", true).findAll();
      if (list != null && list.size() > 0)
        for (byte b = 0; b < list.size(); b++) {
          EZBlackList eZBlackList = list.get(b);
          if (eZBlackList.getIs_myblock() != null && "true".equals(eZBlackList.getIs_myblock()))
            arrayList.add(eZBlackList); 
        }  
      return arrayList;
    } catch (Exception exception) {
      exception.printStackTrace();
      return null;
    } 
  }
  
  public Boolean i(String paramString1, String paramString2) {
    try {
      if ((CustomBlock)this.c.selector(CustomBlock.class).where("number", "=", paramString1).and("type", "=", paramString2).findFirst() != null)
        return Boolean.TRUE; 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    return Boolean.FALSE;
  }
  
  public Boolean j(String paramString) {
    Boolean bool1;
    String str = i1.g((Context)EZCallApplication.c(), paramString, p.d((Context)EZCallApplication.c()).getCountry_code());
    Boolean bool2 = Boolean.FALSE;
    try {
      EZBlackList eZBlackList = (EZBlackList)this.b.selector(EZBlackList.class).where("number", "=", paramString).or("number", "=", str).findFirst();
      bool1 = bool2;
      if (eZBlackList != null) {
        bool1 = bool2;
        if (eZBlackList.getIs_myblock() != null) {
          bool1 = bool2;
          if ("true".equals(eZBlackList.getIs_myblock()))
            bool1 = Boolean.TRUE; 
        } 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
      bool1 = bool2;
    } 
    return bool1;
  }
  
  public Boolean k(String paramString) {
    try {
      List list = this.c.selector(CustomBlock.class).where("type", "=", paramString).findAll();
      if (list != null && list.size() > 0)
        return Boolean.TRUE; 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    return Boolean.FALSE;
  }
  
  public void l(EZBlackList paramEZBlackList) {
    try {
      this.b.save(paramEZBlackList);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void m(String paramString, int paramInt) {
    CustomBlock customBlock = new CustomBlock();
    customBlock.setNumber(paramString);
    customBlock.setType(paramInt);
    try {
      List list = this.c.selector(CustomBlock.class).where("number", "=", customBlock.getNumber()).and("type", "=", Integer.valueOf(customBlock.getType())).findAll();
      if (list == null || list.size() == 0)
        this.c.save(customBlock); 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void n(EZBlackList paramEZBlackList) {
    try {
      this.b.update(paramEZBlackList, new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */