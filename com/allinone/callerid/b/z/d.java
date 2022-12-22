package com.allinone.callerid.b.z;

import android.app.Activity;
import android.content.ContentUris;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.allinone.callerid.bean.recorder.CustomRecord;
import com.allinone.callerid.mvc.controller.recorder.CustomActivity;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.u;
import java.util.ArrayList;

public class d extends b<CustomRecord> {
  private Activity f;
  
  private CustomActivity g;
  
  private ArrayList<CustomRecord> h = new ArrayList<CustomRecord>();
  
  public d(Activity paramActivity, ArrayList<CustomRecord> paramArrayList) {
    super((Context)paramActivity, paramArrayList);
    this.f = paramActivity;
    this.g = (CustomActivity)paramActivity;
  }
  
  public ArrayList<CustomRecord> G() {
    return this.h;
  }
  
  public void p(RecyclerView.b0 paramb0, int paramInt) {
    c c = (c)paramb0;
    if (c != null) {
      CustomRecord customRecord = (CustomRecord)this.d.get(paramInt);
      String str = customRecord.getName();
      if (str != null && !str.equals("")) {
        c.M(c).setText(str);
        c.M(c).setVisibility(0);
      } else {
        c.M(c).setVisibility(8);
      } 
      c.N(c).setText(customRecord.getPhone());
      c.Q(c).setOnClickListener(new a(this, customRecord, c));
      c.Q(c).setOnLongClickListener(new b(this, customRecord, c));
      if (customRecord.isSelect()) {
        customRecord.setSelect(true);
        c.O(c).setVisibility(8);
        c.P(c).setVisibility(0);
        c.Q(c).setBackgroundResource(2131099744);
      } else {
        customRecord.setSelect(false);
        c.O(c).setVisibility(0);
        c.P(c).setVisibility(8);
        c.O(c).setImageResource(2131231148);
        if (customRecord.getContactId() != null && !"".equals(customRecord.getContactId()))
          u.c(this.f, ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, Long.parseLong(customRecord.getContactId())), "", 2131231148, c.O(c)); 
        c.Q(c).setBackgroundResource(2131099942);
      } 
    } 
  }
  
  public RecyclerView.b0 r(ViewGroup paramViewGroup, int paramInt) {
    return new c(LayoutInflater.from((Context)this.g).inflate(2131493051, paramViewGroup, false));
  }
  
  class a implements View.OnClickListener {
    a(d this$0, CustomRecord param1CustomRecord, d.c param1c) {}
    
    public void onClick(View param1View) {
      if ((d.D(this.d)).I) {
        if (this.b.isSelect()) {
          this.b.setSelect(false);
          d.c.O(this.c).setVisibility(0);
          d.c.P(this.c).setVisibility(8);
          d.c.Q(this.c).setBackgroundResource(2131099942);
          d.E(this.d).remove(this.b);
        } else {
          this.b.setSelect(true);
          d.c.O(this.c).setVisibility(8);
          d.c.P(this.c).setVisibility(0);
          d.c.Q(this.c).setBackgroundResource(2131099744);
          d.E(this.d).add(this.b);
        } 
        d.D(this.d).Y();
      } else {
        (new androidx.appcompat.app.a.a((Context)d.F(this.d))).p(2131755117).g(2131755010).m(2131755117, new b(this)).i(2131755180, new a(this)).s();
      } 
    }
    
    class a implements DialogInterface.OnClickListener {
      a(d.a this$0) {}
      
      public void onClick(DialogInterface param2DialogInterface, int param2Int) {
        param2DialogInterface.dismiss();
      }
    }
    
    class b implements DialogInterface.OnClickListener {
      b(d.a this$0) {}
      
      public void onClick(DialogInterface param2DialogInterface, int param2Int) {
        d.a a1 = this.b;
        a1.d.d.remove(a1.b);
        com.allinone.callerid.f.k.a.c().b(this.b.b.getPhone());
        this.b.d.i();
        Toast.makeText((Context)d.F(this.b.d), d.F(this.b.d).getString(2131755292), 0).show();
        param2DialogInterface.dismiss();
      }
    }
  }
  
  class a implements DialogInterface.OnClickListener {
    a(d this$0) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {
      param1DialogInterface.dismiss();
    }
  }
  
  class b implements DialogInterface.OnClickListener {
    b(d this$0) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {
      d.a a1 = this.b;
      a1.d.d.remove(a1.b);
      com.allinone.callerid.f.k.a.c().b(this.b.b.getPhone());
      this.b.d.i();
      Toast.makeText((Context)d.F(this.b.d), d.F(this.b.d).getString(2131755292), 0).show();
      param1DialogInterface.dismiss();
    }
  }
  
  class b implements View.OnLongClickListener {
    b(d this$0, CustomRecord param1CustomRecord, d.c param1c) {}
    
    public boolean onLongClick(View param1View) {
      if (!(d.D(this.d)).I) {
        this.b.setSelect(true);
        d.c.O(this.c).setImageResource(2131231410);
        d.c.Q(this.c).setBackgroundResource(2131099744);
        (d.D(this.d)).I = true;
        d.E(this.d).add(this.b);
        d.D(this.d).Y();
        if (d0.a)
          d0.a("wbb", "改为选中状态"); 
        d.D(this.d).b0();
      } 
      return true;
    }
  }
  
  private static class c extends RecyclerView.b0 {
    private FrameLayout u;
    
    private LinearLayout v;
    
    private ImageView w;
    
    private ImageView x;
    
    private TextView y;
    
    private TextView z;
    
    c(View param1View) {
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


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/b/z/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */