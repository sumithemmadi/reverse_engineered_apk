package com.allinone.callerid.mvc.controller.recorder;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.provider.CallLog;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.allinone.callerid.bean.recorder.CustomRecord;
import com.allinone.callerid.main.BaseActivity;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public class CustomAddActivity extends BaseActivity implements View.OnClickListener {
  private int A;
  
  private final String s = "CustomAddActivity";
  
  private com.allinone.callerid.b.z.a t;
  
  private ImageView u;
  
  private TextView v;
  
  private ImageView w;
  
  private ImageView x;
  
  private RecyclerView y;
  
  private int z;
  
  private void Q() {
    (new a(this)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new Void[0]);
  }
  
  private void R() {
    LinearLayoutManager linearLayoutManager = new LinearLayoutManager((Context)this);
    linearLayoutManager.z2(1);
    this.y.setLayoutManager((RecyclerView.o)linearLayoutManager);
    com.allinone.callerid.b.z.a a1 = new com.allinone.callerid.b.z.a((Activity)this, new ArrayList());
    this.t = a1;
    this.y.setAdapter((RecyclerView.Adapter)a1);
    if (this.A == 1) {
      V();
    } else {
      U();
    } 
  }
  
  private void S() {
    this.u.setOnClickListener(this);
    this.w.setOnClickListener(this);
    this.x.setOnClickListener(this);
  }
  
  private void T() {
    Typeface typeface = g1.b();
    this.u = (ImageView)findViewById(2131296522);
    this.v = (TextView)findViewById(2131296523);
    this.w = (ImageView)findViewById(2131296521);
    this.x = (ImageView)findViewById(2131296520);
    this.y = (RecyclerView)findViewById(2131296519);
    this.v.setTypeface(typeface);
  }
  
  private void U() {
    if (androidx.core.content.a.a(getApplicationContext(), "android.permission.READ_CONTACTS") == 0)
      (new c(this)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new Void[0]); 
  }
  
  private void V() {
    if (androidx.core.content.a.a(getApplicationContext(), "android.permission.READ_CALL_LOG") == 0)
      (new b(this)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new Void[0]); 
  }
  
  private void X() {
    (new d(this)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new Void[0]);
  }
  
  public void W() {
    if (this.t.C() != null && this.t.C().size() > 0 && this.t.F() != null) {
      TextView textView = this.v;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(this.t.F().size());
      stringBuilder.append("/");
      stringBuilder.append(this.t.C().size());
      textView.setText(stringBuilder.toString());
    } 
  }
  
  public void onClick(View paramView) {
    switch (paramView.getId()) {
      default:
        return;
      case 2131296522:
        finish();
        overridePendingTransition(2130771968, 2130771969);
      case 2131296521:
        X();
      case 2131296520:
        break;
    } 
    Q();
  }
  
  protected void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(2131492920);
    if (i1.f0(getApplicationContext()).booleanValue() && Build.VERSION.SDK_INT >= 17)
      getWindow().getDecorView().setLayoutDirection(1); 
    this.z = getIntent().getIntExtra("customType", 0);
    this.A = getIntent().getIntExtra("phoneDataType", 0);
    T();
    R();
    S();
  }
  
  protected void onPause() {
    super.onPause();
  }
  
  protected void onResume() {
    super.onResume();
  }
  
  private static class a extends AsyncTask<Void, Void, String> {
    private WeakReference<CustomAddActivity> a;
    
    a(CustomAddActivity param1CustomAddActivity) {
      this.a = new WeakReference<CustomAddActivity>(param1CustomAddActivity);
    }
    
    protected String a(Void... param1VarArgs) {
      CustomAddActivity customAddActivity = this.a.get();
      if (customAddActivity != null && !customAddActivity.isFinishing())
        try {
          if (CustomAddActivity.O(customAddActivity).F() != null && CustomAddActivity.O(customAddActivity).F().size() > 0) {
            for (CustomRecord customRecord : CustomAddActivity.O(customAddActivity).F()) {
              if (customRecord.isSelect()) {
                customRecord.setType(CustomAddActivity.P(customAddActivity));
                customRecord.setSelect(false);
                com.allinone.callerid.f.k.a.c().a(customRecord);
              } 
            } 
            return "addsuccess";
          } 
        } catch (Exception exception) {
          exception.printStackTrace();
        }  
      return null;
    }
    
    protected void b(String param1String) {
      super.onPostExecute(param1String);
      CustomAddActivity customAddActivity = this.a.get();
      if (customAddActivity != null && !customAddActivity.isFinishing() && "addsuccess".equals(param1String)) {
        Toast.makeText((Context)customAddActivity, customAddActivity.getString(2131755270), 0).show();
        customAddActivity.finish();
        customAddActivity.overridePendingTransition(2130771968, 2130771969);
      } 
    }
  }
  
  private static class b extends AsyncTask<Void, Void, ArrayList<CustomRecord>> {
    private WeakReference<CustomAddActivity> a;
    
    b(CustomAddActivity param1CustomAddActivity) {
      this.a = new WeakReference<CustomAddActivity>(param1CustomAddActivity);
    }
    
    protected ArrayList<CustomRecord> a(Void... param1VarArgs) {
      CustomAddActivity customAddActivity = this.a.get();
      if (customAddActivity != null && !customAddActivity.isFinishing())
        try {
          ArrayList<CustomRecord> arrayList = new ArrayList();
          this();
          ContentResolver contentResolver = customAddActivity.getContentResolver();
          Uri uri = CallLog.Calls.CONTENT_URI;
          int i = 0;
          Cursor cursor = contentResolver.query(uri, new String[] { "number", "type", "name", "photo_id" }, null, null, "date DESC");
          if (cursor != null && cursor.getCount() > 0) {
            cursor.moveToFirst();
            ArrayList<String> arrayList1 = new ArrayList();
            this();
            while (i < cursor.getCount()) {
              cursor.moveToPosition(i);
              String str1 = cursor.getString(cursor.getColumnIndex("number"));
              String str2 = cursor.getString(cursor.getColumnIndex("name"));
              cursor.getInt(cursor.getColumnIndex("type"));
              if (Build.VERSION.SDK_INT >= 21) {
                String str = cursor.getString(cursor.getColumnIndex("photo_id"));
              } else {
                uri = null;
              } 
              if (str1 != null && !i1.v0(str1) && !arrayList1.contains(str1)) {
                arrayList1.add(str1);
                CustomRecord customRecord = new CustomRecord();
                this();
                customRecord.setName(str2);
                customRecord.setPhone(str1);
                if (uri != null && !uri.equals(""))
                  customRecord.setContactId((String)uri); 
                arrayList.add(customRecord);
              } 
              i++;
            } 
            cursor.close();
            i = arrayList.size();
            if (i > 0)
              return arrayList; 
          } 
        } catch (Exception exception) {
          exception.printStackTrace();
        }  
      return null;
    }
    
    protected void b(ArrayList<CustomRecord> param1ArrayList) {
      super.onPostExecute(param1ArrayList);
      CustomAddActivity customAddActivity = this.a.get();
      if (customAddActivity != null && !customAddActivity.isFinishing() && param1ArrayList != null && param1ArrayList.size() > 0) {
        CustomAddActivity.O(customAddActivity).A(param1ArrayList, true);
        CustomAddActivity.O(customAddActivity).i();
      } 
    }
  }
  
  private static class c extends AsyncTask<Void, Void, ArrayList<CustomRecord>> {
    private WeakReference<CustomAddActivity> a;
    
    c(CustomAddActivity param1CustomAddActivity) {
      this.a = new WeakReference<CustomAddActivity>(param1CustomAddActivity);
    }
    
    protected ArrayList<CustomRecord> a(Void... param1VarArgs) {
      CustomAddActivity customAddActivity = this.a.get();
      if (customAddActivity != null && !customAddActivity.isFinishing())
        try {
          ArrayList<CustomRecord> arrayList = new ArrayList();
          this();
          ContentResolver contentResolver = customAddActivity.getContentResolver();
          byte b = 0;
          Cursor cursor = contentResolver.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[] { "display_name", "sort_key", "contact_id", "data1", "photo_id" }, null, null, "sort_key");
          if (cursor != null && cursor.getCount() > 0) {
            cursor.moveToFirst();
            while (b < cursor.getCount()) {
              cursor.moveToPosition(b);
              String str1 = cursor.getString(cursor.getColumnIndex("data1"));
              String str2 = cursor.getString(cursor.getColumnIndex("display_name"));
              cursor.getString(cursor.getColumnIndex("photo_id"));
              int i = cursor.getInt(cursor.getColumnIndex("contact_id"));
              CustomRecord customRecord = new CustomRecord();
              this();
              customRecord.setName(str2);
              StringBuilder stringBuilder = new StringBuilder();
              this();
              stringBuilder.append(i);
              stringBuilder.append("");
              customRecord.setContactId(stringBuilder.toString());
              customRecord.setPhone(str1);
              arrayList.add(customRecord);
              b++;
            } 
            if (arrayList.size() > 0)
              return arrayList; 
          } 
          if (cursor != null)
            cursor.close(); 
        } catch (Exception exception) {
          exception.printStackTrace();
        }  
      return null;
    }
    
    protected void b(ArrayList<CustomRecord> param1ArrayList) {
      super.onPostExecute(param1ArrayList);
      CustomAddActivity customAddActivity = this.a.get();
      if (customAddActivity != null && !customAddActivity.isFinishing() && param1ArrayList != null && param1ArrayList.size() > 0) {
        CustomAddActivity.O(customAddActivity).A(param1ArrayList, true);
        CustomAddActivity.O(customAddActivity).i();
      } 
    }
  }
  
  private static class d extends AsyncTask<Void, Void, Void> {
    private WeakReference<CustomAddActivity> a;
    
    d(CustomAddActivity param1CustomAddActivity) {
      this.a = new WeakReference<CustomAddActivity>(param1CustomAddActivity);
    }
    
    protected Void a(Void... param1VarArgs) {
      CustomAddActivity customAddActivity = this.a.get();
      if (customAddActivity != null && !customAddActivity.isFinishing())
        try {
          ArrayList arrayList1 = CustomAddActivity.O(customAddActivity).C();
          ArrayList<CustomRecord> arrayList = CustomAddActivity.O(customAddActivity).F();
          if (arrayList1 != null && arrayList1.size() > 0 && arrayList != null) {
            Iterator<CustomRecord> iterator;
            if (arrayList.size() >= arrayList1.size()) {
              iterator = arrayList1.iterator();
              while (iterator.hasNext())
                ((CustomRecord)iterator.next()).setSelect(false); 
              arrayList.clear();
            } else {
              arrayList.clear();
              for (CustomRecord customRecord : iterator) {
                customRecord.setSelect(true);
                arrayList.add(customRecord);
              } 
            } 
          } 
        } catch (Exception exception) {
          exception.printStackTrace();
        }  
      return null;
    }
    
    protected void b(Void param1Void) {
      super.onPostExecute(param1Void);
      CustomAddActivity customAddActivity = this.a.get();
      if (customAddActivity != null && !customAddActivity.isFinishing()) {
        CustomAddActivity.O(customAddActivity).i();
        customAddActivity.W();
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/mvc/controller/recorder/CustomAddActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */