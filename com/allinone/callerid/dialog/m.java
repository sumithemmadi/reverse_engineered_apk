package com.allinone.callerid.dialog;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.allinone.callerid.bean.EZSimpleContact;
import com.allinone.callerid.bean.WeekInfo;
import com.allinone.callerid.customview.BaseEditText;
import com.allinone.callerid.model.EZCountryCode;
import com.allinone.callerid.search.CallLogBean;
import com.allinone.callerid.util.g1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class m {
  private static androidx.appcompat.app.a a;
  
  private static androidx.appcompat.app.a b;
  
  private static androidx.appcompat.app.a c;
  
  public static void e(Context paramContext, ArrayList<WeekInfo> paramArrayList, com.allinone.callerid.i.a.k.c paramc) {
    try {
      View view = LayoutInflater.from(paramContext).inflate(2131493026, null);
      RecyclerView recyclerView = (RecyclerView)view.findViewById(2131296582);
      TextView textView1 = (TextView)view.findViewById(2131298187);
      TextView textView2 = (TextView)view.findViewById(2131296580);
      TextView textView3 = (TextView)view.findViewById(2131296581);
      Typeface typeface = g1.b();
      textView2.setTypeface(typeface);
      textView3.setTypeface(typeface);
      textView1.setTypeface(typeface);
      LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
      this(paramContext);
      linearLayoutManager.z2(1);
      recyclerView.setLayoutManager((RecyclerView.o)linearLayoutManager);
      recyclerView.setHasFixedSize(true);
      com.allinone.callerid.b.a0.a a3 = new com.allinone.callerid.b.a0.a();
      this(paramContext, recyclerView);
      recyclerView.setAdapter((RecyclerView.Adapter)a3);
      androidx.appcompat.app.a.a a2 = new androidx.appcompat.app.a.a();
      this(paramContext);
      androidx.appcompat.app.a a1 = a2.r(view).d(true).s();
      d d = new d();
      this(a1);
      textView2.setOnClickListener(d);
      e e = new e();
      this(a3, paramc, a1);
      textView3.setOnClickListener(e);
      f f = new f();
      this(paramArrayList, a3);
      view.post(f);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private static List<EZCountryCode> f(String paramString, List<EZCountryCode> paramList) {
    ArrayList<EZCountryCode> arrayList = new ArrayList();
    for (byte b = 0; b < paramList.size(); b++) {
      String str3;
      EZCountryCode eZCountryCode = paramList.get(b);
      String str1 = eZCountryCode.country_name.toLowerCase();
      String str2 = eZCountryCode.country_code;
      if (paramString.startsWith("+")) {
        str3 = paramString.substring(1);
      } else {
        str3 = paramString;
      } 
      if ((str1.startsWith(paramString.toLowerCase()) || str2.startsWith(str3)) && !arrayList.contains(eZCountryCode))
        arrayList.add(eZCountryCode); 
    } 
    if (arrayList.size() > 0)
      Collections.sort(arrayList, new a()); 
    return arrayList;
  }
  
  public static void g(Activity paramActivity, com.allinone.callerid.i.a.f.b paramb) {
    try {
      ArrayList arrayList = new ArrayList();
      this();
      View view = LayoutInflater.from((Context)paramActivity).inflate(2131493078, null);
      ListView listView = (ListView)view.findViewById(2131297144);
      TextView textView = (TextView)view.findViewById(2131298008);
      com.allinone.callerid.b.a a2 = new com.allinone.callerid.b.a();
      this(paramActivity, arrayList, listView);
      listView.setAdapter((ListAdapter)a2);
      ViewGroup.LayoutParams layoutParams = listView.getLayoutParams();
      int k = paramActivity.getWindowManager().getDefaultDisplay().getHeight();
      double d = k;
      Double.isNaN(d);
      k = (int)(d * 0.75D);
      layoutParams.height = k;
      listView.setLayoutParams(layoutParams);
      i i = new i();
      this(arrayList, paramb);
      listView.setOnItemClickListener(i);
      androidx.appcompat.app.a.a a1 = new androidx.appcompat.app.a.a();
      this((Context)paramActivity);
      a = a1.h(paramActivity.getResources().getString(2131755080)).r(view).d(true).s();
      j j = new j();
      this(arrayList, textView, listView, a2);
      view.post(j);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static void h(Activity paramActivity, com.allinone.callerid.i.a.f.f paramf) {
    try {
      ArrayList arrayList = new ArrayList();
      this();
      View view = LayoutInflater.from((Context)paramActivity).inflate(2131493077, null);
      ListView listView = (ListView)view.findViewById(2131297143);
      TextView textView = (TextView)view.findViewById(2131298009);
      com.allinone.callerid.b.b b = new com.allinone.callerid.b.b();
      this(paramActivity, arrayList, listView);
      listView.setAdapter((ListAdapter)b);
      ViewGroup.LayoutParams layoutParams = listView.getLayoutParams();
      int i = paramActivity.getWindowManager().getDefaultDisplay().getHeight();
      double d = i;
      Double.isNaN(d);
      i = (int)(d * 0.75D);
      layoutParams.height = i;
      listView.setLayoutParams(layoutParams);
      b b1 = new b();
      this(arrayList, paramf);
      listView.setOnItemClickListener(b1);
      androidx.appcompat.app.a.a a1 = new androidx.appcompat.app.a.a();
      this((Context)paramActivity);
      b = a1.h(paramActivity.getResources().getString(2131755078)).r(view).d(true).s();
      c c = new c();
      this(arrayList, b, textView, listView);
      view.post(c);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static void i(Activity paramActivity, List<EZCountryCode> paramList, com.allinone.callerid.i.a.b paramb) {
    try {
      View view = LayoutInflater.from((Context)paramActivity).inflate(2131492982, null);
      ListView listView = (ListView)view.findViewById(2131296448);
      BaseEditText baseEditText = (BaseEditText)view.findViewById(2131296660);
      ArrayList arrayList = new ArrayList();
      this((Collection)paramList);
      com.allinone.callerid.b.k k = new com.allinone.callerid.b.k();
      this((Context)paramActivity, arrayList, listView);
      listView.setAdapter((ListAdapter)k);
      k k1 = new k();
      this(paramList, k);
      baseEditText.addTextChangedListener(k1);
      ViewGroup.LayoutParams layoutParams = listView.getLayoutParams();
      int i = paramActivity.getWindowManager().getDefaultDisplay().getHeight();
      double d = i;
      Double.isNaN(d);
      i = (int)(d * 0.75D);
      layoutParams.height = i;
      listView.setLayoutParams(layoutParams);
      l l = new l();
      this(arrayList, paramb);
      listView.setOnItemClickListener(l);
      androidx.appcompat.app.a.a a1 = new androidx.appcompat.app.a.a();
      this((Context)paramActivity);
      c = a1.r(view).d(true).s();
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static boolean j(Activity paramActivity) {
    if (Build.VERSION.SDK_INT >= 24 && !com.allinone.callerid.util.k1.a.j()) {
      try {
        androidx.appcompat.app.a.a a3 = new androidx.appcompat.app.a.a();
        this((Context)paramActivity);
        androidx.appcompat.app.a.a a4 = a3.p(2131755024).g(2131755669);
        h h = new h();
        this(paramActivity);
        androidx.appcompat.app.a.a a2 = a4.m(2131755089, h);
        g g = new g();
        this();
        androidx.appcompat.app.a a1 = a2.i(2131755017, g).a();
        a1.setCanceledOnTouchOutside(false);
        a1.show();
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
      return false;
    } 
    return true;
  }
  
  static final class a implements Comparator<EZCountryCode> {
    public int a(EZCountryCode param1EZCountryCode1, EZCountryCode param1EZCountryCode2) {
      return Integer.parseInt(param1EZCountryCode1.getCountry_code()) - Integer.parseInt(param1EZCountryCode2.getCountry_code());
    }
  }
  
  static final class b implements AdapterView.OnItemClickListener {
    b(ArrayList param1ArrayList, com.allinone.callerid.i.a.f.f param1f) {}
    
    public void onItemClick(AdapterView<?> param1AdapterView, View param1View, int param1Int, long param1Long) {
      EZSimpleContact eZSimpleContact = this.b.get(param1Int);
      this.c.a(eZSimpleContact);
      if (m.d() != null)
        m.d().dismiss(); 
    }
  }
  
  static final class c implements Runnable {
    c(ArrayList param1ArrayList, com.allinone.callerid.b.b param1b, TextView param1TextView, ListView param1ListView) {}
    
    public void run() {
      com.allinone.callerid.i.a.f.g.a(new a(this));
    }
    
    class a implements com.allinone.callerid.i.a.f.k {
      a(m.c this$0) {}
      
      public void a(ArrayList<EZSimpleContact> param2ArrayList) {
        if (param2ArrayList.size() > 0) {
          this.a.b.addAll(param2ArrayList);
          this.a.c.notifyDataSetChanged();
        } else {
          this.a.d.setVisibility(0);
          this.a.e.setVisibility(8);
        } 
      }
    }
  }
  
  class a implements com.allinone.callerid.i.a.f.k {
    a(m this$0) {}
    
    public void a(ArrayList<EZSimpleContact> param1ArrayList) {
      if (param1ArrayList.size() > 0) {
        this.a.b.addAll(param1ArrayList);
        this.a.c.notifyDataSetChanged();
      } else {
        this.a.d.setVisibility(0);
        this.a.e.setVisibility(8);
      } 
    }
  }
  
  static final class d implements View.OnClickListener {
    d(androidx.appcompat.app.a param1a) {}
    
    public void onClick(View param1View) {
      androidx.appcompat.app.a a1 = this.b;
      if (a1 != null)
        a1.dismiss(); 
    }
  }
  
  static final class e implements View.OnClickListener {
    e(com.allinone.callerid.b.a0.a param1a, com.allinone.callerid.i.a.k.c param1c, androidx.appcompat.app.a param1a1) {}
    
    public void onClick(View param1View) {
      com.allinone.callerid.b.a0.a a1 = this.b;
      if (a1 != null && !a1.O()) {
        ArrayList arrayList = this.b.C();
        com.allinone.callerid.i.a.k.c c1 = this.c;
        if (c1 != null)
          c1.a(arrayList); 
        com.allinone.callerid.i.a.k.d.a(arrayList);
        androidx.appcompat.app.a a2 = this.d;
        if (a2 != null)
          a2.dismiss(); 
      } 
    }
  }
  
  static final class f implements Runnable {
    f(ArrayList param1ArrayList, com.allinone.callerid.b.a0.a param1a) {}
    
    public void run() {
      ArrayList arrayList = this.b;
      if (arrayList != null && arrayList.size() > 0) {
        this.c.A(this.b, true);
        this.c.i();
      } else {
        com.allinone.callerid.i.a.k.d.b(new a(this));
      } 
    }
    
    class a implements com.allinone.callerid.i.a.k.c {
      a(m.f this$0) {}
      
      public void a(ArrayList<WeekInfo> param2ArrayList) {
        com.allinone.callerid.b.a0.a a1 = this.a.c;
        if (a1 != null) {
          a1.A(param2ArrayList, true);
          this.a.c.i();
        } 
      }
    }
  }
  
  class a implements com.allinone.callerid.i.a.k.c {
    a(m this$0) {}
    
    public void a(ArrayList<WeekInfo> param1ArrayList) {
      com.allinone.callerid.b.a0.a a1 = this.a.c;
      if (a1 != null) {
        a1.A(param1ArrayList, true);
        this.a.c.i();
      } 
    }
  }
  
  static final class g implements DialogInterface.OnClickListener {
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {
      param1DialogInterface.dismiss();
    }
  }
  
  static final class h implements DialogInterface.OnClickListener {
    h(Activity param1Activity) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {
      com.allinone.callerid.util.k1.b.c((Context)this.b);
      param1DialogInterface.dismiss();
    }
  }
  
  static final class i implements AdapterView.OnItemClickListener {
    i(ArrayList param1ArrayList, com.allinone.callerid.i.a.f.b param1b) {}
    
    public void onItemClick(AdapterView<?> param1AdapterView, View param1View, int param1Int, long param1Long) {
      CallLogBean callLogBean = this.b.get(param1Int);
      this.c.a(callLogBean);
      if (m.a() != null)
        m.a().dismiss(); 
    }
  }
  
  static final class j implements Runnable {
    j(ArrayList param1ArrayList, TextView param1TextView, ListView param1ListView, com.allinone.callerid.b.a param1a) {}
    
    public void run() {
      com.allinone.callerid.i.a.f.c.a(new a(this));
    }
    
    class a implements com.allinone.callerid.i.a.f.j {
      a(m.j this$0) {}
      
      public void a(ArrayList<CallLogBean> param2ArrayList) {
        if (param2ArrayList.size() > 0) {
          this.a.b.addAll(param2ArrayList);
          this.a.c.setVisibility(8);
          this.a.d.setVisibility(0);
          this.a.e.notifyDataSetChanged();
        } else {
          this.a.c.setVisibility(0);
          this.a.d.setVisibility(8);
        } 
      }
    }
  }
  
  class a implements com.allinone.callerid.i.a.f.j {
    a(m this$0) {}
    
    public void a(ArrayList<CallLogBean> param1ArrayList) {
      if (param1ArrayList.size() > 0) {
        this.a.b.addAll(param1ArrayList);
        this.a.c.setVisibility(8);
        this.a.d.setVisibility(0);
        this.a.e.notifyDataSetChanged();
      } else {
        this.a.c.setVisibility(0);
        this.a.d.setVisibility(8);
      } 
    }
  }
  
  static final class k implements TextWatcher {
    k(List param1List, com.allinone.callerid.b.k param1k) {}
    
    public void afterTextChanged(Editable param1Editable) {}
    
    public void beforeTextChanged(CharSequence param1CharSequence, int param1Int1, int param1Int2, int param1Int3) {}
    
    public void onTextChanged(CharSequence param1CharSequence, int param1Int1, int param1Int2, int param1Int3) {
      ArrayList arrayList = new ArrayList();
      if (param1CharSequence != null && !"".equals(param1CharSequence.toString())) {
        if (param1CharSequence.length() > 0) {
          List list = m.b(param1CharSequence.toString(), this.b);
          this.c.b(list);
        } else {
          arrayList.clear();
          this.c.b(this.b);
        } 
      } else {
        arrayList.clear();
        this.c.b(this.b);
      } 
    }
  }
  
  static final class l implements AdapterView.OnItemClickListener {
    l(List param1List, com.allinone.callerid.i.a.b param1b) {}
    
    public void onItemClick(AdapterView<?> param1AdapterView, View param1View, int param1Int, long param1Long) {
      EZCountryCode eZCountryCode = this.b.get(param1Int);
      this.c.a(eZCountryCode);
      if (m.c() != null)
        m.c().dismiss(); 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/dialog/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */