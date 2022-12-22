package com.allinone.callerid.b.z;

import android.app.Activity;
import android.content.ContentUris;
import android.content.Context;
import android.graphics.Typeface;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.allinone.callerid.bean.recorder.CustomRecord;
import com.allinone.callerid.mvc.controller.recorder.CustomAddActivity;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.u;
import java.util.ArrayList;

public class a extends b<CustomRecord> {
  private Activity f;
  
  private CustomAddActivity g;
  
  private ArrayList<CustomRecord> h = new ArrayList<CustomRecord>();
  
  public a(Activity paramActivity, ArrayList<CustomRecord> paramArrayList) {
    super((Context)paramActivity, paramArrayList);
    this.f = paramActivity;
    this.g = (CustomAddActivity)paramActivity;
  }
  
  public ArrayList<CustomRecord> F() {
    return this.h;
  }
  
  public void p(RecyclerView.b0 paramb0, int paramInt) {
    b b1 = (b)paramb0;
    if (b1 != null) {
      CustomRecord customRecord = (CustomRecord)this.d.get(paramInt);
      String str = customRecord.getName();
      if (str != null && !str.equals("")) {
        b.M(b1).setText(str);
        b.M(b1).setVisibility(0);
      } else {
        b.M(b1).setVisibility(8);
      } 
      b.N(b1).setText(customRecord.getPhone());
      b.O(b1).setImageResource(2131231148);
      b.Q(b1).setOnClickListener(new a(this, customRecord, b1));
      if (customRecord.isSelect()) {
        customRecord.setSelect(true);
        b.O(b1).setVisibility(8);
        b.P(b1).setVisibility(0);
        b.Q(b1).setBackgroundResource(2131099744);
      } else {
        customRecord.setSelect(false);
        b.O(b1).setVisibility(0);
        b.P(b1).setVisibility(8);
        b.O(b1).setImageResource(2131231148);
        if (customRecord.getContactId() != null && !"".equals(customRecord.getContactId()))
          u.c(this.f, ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, Long.parseLong(customRecord.getContactId())), "", 2131231148, b.O(b1)); 
        b.Q(b1).setBackgroundResource(2131099942);
      } 
    } 
  }
  
  public RecyclerView.b0 r(ViewGroup paramViewGroup, int paramInt) {
    return new b(LayoutInflater.from((Context)this.g).inflate(2131493051, paramViewGroup, false));
  }
  
  class a implements View.OnClickListener {
    a(a this$0, CustomRecord param1CustomRecord, a.b param1b) {}
    
    public void onClick(View param1View) {
      if (this.b.isSelect()) {
        this.b.setSelect(false);
        a.b.O(this.c).setVisibility(0);
        a.b.P(this.c).setVisibility(8);
        a.b.Q(this.c).setBackgroundResource(2131099942);
        a.D(this.d).remove(this.b);
      } else {
        this.b.setSelect(true);
        a.b.O(this.c).setVisibility(8);
        a.b.P(this.c).setVisibility(0);
        a.b.Q(this.c).setBackgroundResource(2131099744);
        a.D(this.d).add(this.b);
      } 
      a.E(this.d).W();
    }
  }
  
  private static class b extends RecyclerView.b0 {
    private FrameLayout u;
    
    private LinearLayout v;
    
    private ImageView w;
    
    private ImageView x;
    
    private TextView y;
    
    private TextView z;
    
    b(View param1View) {
      super(param1View);
      Typeface typeface = g1.b();
      this.u = (FrameLayout)param1View.findViewById(2131296534);
      this.v = (LinearLayout)param1View.findViewById(2131296537);
      this.w = (ImageView)param1View.findViewById(2131296535);
      this.x = (ImageView)param1View.findViewById(2131296536);
      this.y = (TextView)param1View.findViewById(2131296538);
      this.z = (TextView)param1View.findViewById(2131296539);
      this.y.setTypeface(typeface);
      this.z.setTypeface(typeface);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/b/z/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */