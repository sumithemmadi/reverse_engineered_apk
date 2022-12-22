package com.allinone.callerid.mvc.controller.block;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import com.allinone.callerid.customview.DeletableEditText;
import com.allinone.callerid.main.BaseActivity;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.h1;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.m;
import com.allinone.callerid.util.q;

public class AddCustomNumActivity extends BaseActivity {
  private final String s = "AddCustomNumActivity";
  
  private TextView t;
  
  private DeletableEditText u;
  
  private FrameLayout v;
  
  private int w;
  
  private String x;
  
  private m y;
  
  private void Y() {
    ImageView imageView = (ImageView)findViewById(2131296850);
    TextView textView1 = (TextView)findViewById(2131297878);
    Spinner spinner = (Spinner)findViewById(2131297646);
    this.t = (TextView)findViewById(2131298168);
    this.u = (DeletableEditText)findViewById(2131296659);
    TextView textView2 = (TextView)findViewById(2131297810);
    FrameLayout frameLayout = (FrameLayout)findViewById(2131296717);
    this.v = frameLayout;
    frameLayout.setVisibility(8);
    ArrayAdapter arrayAdapter = new ArrayAdapter((Context)this, 17367048, (Object[])getResources().getStringArray(2130903040));
    arrayAdapter.setDropDownViewResource(17367049);
    spinner.setAdapter((SpinnerAdapter)arrayAdapter);
    Typeface typeface = g1.b();
    textView1.setTypeface(typeface);
    this.t.setTypeface(typeface);
    this.u.setTypeface(typeface);
    textView2.setTypeface(typeface);
    if (i1.f0(getApplicationContext()).booleanValue())
      imageView.setImageResource(2131231059); 
    imageView.setOnClickListener(new b(this));
    spinner.setOnItemSelectedListener(new c(this));
    this.u.addTextChangedListener(new d(this));
    this.v.setOnClickListener(new e(this));
  }
  
  protected void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(2131492898);
    if (i1.f0(getApplicationContext()).booleanValue() && Build.VERSION.SDK_INT >= 17)
      getWindow().getDecorView().setLayoutDirection(1); 
    getWindow().getDecorView().post(new a(this));
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent) {
    if (paramInt == 4) {
      finish();
      overridePendingTransition(2130771968, 2130771969);
      return true;
    } 
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onPause() {
    super.onPause();
  }
  
  protected void onResume() {
    super.onResume();
  }
  
  class a implements Runnable {
    a(AddCustomNumActivity this$0) {}
    
    public void run() {
      AddCustomNumActivity addCustomNumActivity = this.b;
      AddCustomNumActivity.P(addCustomNumActivity, new m(addCustomNumActivity.getApplicationContext()));
      AddCustomNumActivity.Q(this.b);
    }
  }
  
  class b implements View.OnClickListener {
    b(AddCustomNumActivity this$0) {}
    
    public void onClick(View param1View) {
      this.b.finish();
      this.b.overridePendingTransition(2130771968, 2130771969);
    }
  }
  
  class c implements AdapterView.OnItemSelectedListener {
    c(AddCustomNumActivity this$0) {}
    
    public void onItemSelected(AdapterView<?> param1AdapterView, View param1View, int param1Int, long param1Long) {
      AddCustomNumActivity.S(this.b, param1Int);
      if (param1Int == 3) {
        AddCustomNumActivity.T(this.b).setVisibility(8);
        AddCustomNumActivity.U(this.b).setVisibility(8);
        AddCustomNumActivity.V(this.b).setVisibility(0);
      } else {
        AddCustomNumActivity.T(this.b).setVisibility(0);
        AddCustomNumActivity.U(this.b).setVisibility(0);
        AddCustomNumActivity.V(this.b).setVisibility(8);
      } 
    }
    
    public void onNothingSelected(AdapterView<?> param1AdapterView) {}
  }
  
  class d implements TextWatcher {
    d(AddCustomNumActivity this$0) {}
    
    public void afterTextChanged(Editable param1Editable) {}
    
    public void beforeTextChanged(CharSequence param1CharSequence, int param1Int1, int param1Int2, int param1Int3) {
      AddCustomNumActivity.V(this.b).setVisibility(8);
    }
    
    public void onTextChanged(CharSequence param1CharSequence, int param1Int1, int param1Int2, int param1Int3) {
      if (!AddCustomNumActivity.U(this.b).getText().equals("") && param1CharSequence.length() > 0) {
        AddCustomNumActivity.V(this.b).setVisibility(0);
      } else {
        AddCustomNumActivity.V(this.b).setVisibility(8);
      } 
    }
  }
  
  class e implements View.OnClickListener {
    e(AddCustomNumActivity this$0) {}
    
    public void onClick(View param1View) {
      if (AddCustomNumActivity.R(this.b) < 3) {
        AddCustomNumActivity addCustomNumActivity = this.b;
        AddCustomNumActivity.X(addCustomNumActivity, AddCustomNumActivity.U(addCustomNumActivity).getText().toString());
      } else {
        AddCustomNumActivity.X(this.b, "foreign");
      } 
      if (!AddCustomNumActivity.W(this.b).equals(""))
        if (!AddCustomNumActivity.O(this.b).i(AddCustomNumActivity.W(this.b), String.valueOf(AddCustomNumActivity.R(this.b))).booleanValue()) {
          AddCustomNumActivity.O(this.b).m(AddCustomNumActivity.W(this.b), AddCustomNumActivity.R(this.b));
          int i = AddCustomNumActivity.R(this.b);
          if (i != 0) {
            if (i != 1) {
              if (i != 2) {
                if (i == 3)
                  q.b().c(h1.u); 
              } else {
                q.b().c(h1.t);
              } 
            } else {
              q.b().c(h1.s);
            } 
          } else {
            q.b().c(h1.r);
          } 
          Intent intent = new Intent();
          intent.setClass((Context)this.b, MyBlockListActivity.class);
          this.b.startActivity(intent);
          this.b.overridePendingTransition(2130771968, 2130771969);
          this.b.finish();
        } else {
          Toast.makeText((Context)this.b, 2131755562, 0).show();
        }  
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/mvc/controller/block/AddCustomNumActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */