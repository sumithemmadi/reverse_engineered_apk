package com.allinone.callerid.b.z;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.allinone.callerid.bean.recorder.RecordCall;
import com.allinone.callerid.dialog.n;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.j;
import com.allinone.callerid.util.j0;
import com.allinone.callerid.util.q;
import java.io.File;
import java.util.ArrayList;

public class f extends b<RecordCall> {
  private Typeface f;
  
  private Activity g;
  
  private int h;
  
  private f i;
  
  private AlertDialog j;
  
  public f(Activity paramActivity, ArrayList<RecordCall> paramArrayList) {
    super((Context)paramActivity, paramArrayList);
    this.g = paramActivity;
    this.f = g1.b();
    this.h = j.a((Context)this.g, 8.0F);
    this.i = this;
  }
  
  private void J(Context paramContext, RecordCall paramRecordCall, int paramInt) {
    try {
      AlertDialog.Builder builder1 = new AlertDialog.Builder();
      this(paramContext);
      builder1 = builder1.setMessage(paramContext.getString(2131755010));
      String str2 = paramContext.getResources().getString(2131755117);
      e e = new e();
      this(this, paramInt, paramRecordCall);
      AlertDialog.Builder builder2 = builder1.setPositiveButton(str2, e);
      String str1 = paramContext.getResources().getString(2131755180);
      d d = new d();
      this(this);
      AlertDialog alertDialog = builder2.setNegativeButton(str1, d).create();
      alertDialog.show();
      alertDialog.getButton(-1).setTextColor(paramContext.getResources().getColor(2131099706));
      alertDialog.getButton(-2).setTextColor(paramContext.getResources().getColor(2131099695));
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void K(RecordCall paramRecordCall, int paramInt) {
    try {
      View view = LayoutInflater.from((Context)this.g).inflate(2131493016, null);
      FrameLayout frameLayout1 = (FrameLayout)view.findViewById(2131297416);
      TextView textView1 = (TextView)view.findViewById(2131297415);
      FrameLayout frameLayout2 = (FrameLayout)view.findViewById(2131297418);
      TextView textView2 = (TextView)view.findViewById(2131297417);
      FrameLayout frameLayout3 = (FrameLayout)view.findViewById(2131297414);
      TextView textView3 = (TextView)view.findViewById(2131297413);
      textView1.setTypeface(this.f);
      textView2.setTypeface(this.f);
      textView3.setTypeface(this.f);
      c c = new c();
      this(this, paramRecordCall, paramInt);
      frameLayout1.setOnClickListener(c);
      frameLayout2.setOnClickListener(c);
      frameLayout3.setOnClickListener(c);
      AlertDialog.Builder builder = new AlertDialog.Builder();
      this((Context)this.g);
      AlertDialog alertDialog = builder.setView(view).create();
      this.j = alertDialog;
      alertDialog.show();
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void p(RecyclerView.b0 paramb0, int paramInt) {
    f f1 = (f)paramb0;
    if (f1 != null) {
      RecordCall recordCall = (RecordCall)this.d.get(paramInt);
      f.M(f1).setText(recordCall.getShowName());
      if (recordCall.getPhonestatus() == 111) {
        f.N(f1).setImageResource(2131231081);
      } else {
        f.N(f1).setImageResource(2131231079);
      } 
      f.T(f1).setText(recordCall.getFilesizestring());
      String str = recordCall.getRemark();
      if (str != null) {
        f.U(f1).setText(str);
        f.U(f1).setVisibility(0);
      } else {
        f.U(f1).setVisibility(8);
      } 
      f.V(f1).setText(recordCall.getTimespanstring());
      f.W(f1).setText(recordCall.getRecordtimems());
      if (paramInt == 0) {
        f.X(f1).setVisibility(0);
        f.Y(f1).setVisibility(0);
        f.X(f1).setText(this.g.getString(2131755637));
      } else {
        f.Y(f1).setVisibility(8);
      } 
      f.Z(f1).setOnClickListener(new a(this, recordCall));
      f.Z(f1).setOnLongClickListener(new b(this, recordCall, paramInt));
      if (f.O(f1).getVisibility() == 0)
        f.O(f1).setVisibility(8); 
      if (this.d.size() == 1) {
        LinearLayout linearLayout = f.P(f1);
        paramInt = this.h;
        com.allinone.callerid.util.recorder.f.r((View)linearLayout, paramInt, paramInt, paramInt, paramInt);
        f.P(f1).setBackgroundResource(2131230857);
      } else if (paramInt == 0) {
        LinearLayout linearLayout = f.P(f1);
        paramInt = this.h;
        com.allinone.callerid.util.recorder.f.r((View)linearLayout, paramInt, paramInt, paramInt, 0);
        f.P(f1).setBackgroundResource(2131230860);
      } else if (paramInt == this.d.size() - 1) {
        LinearLayout linearLayout = f.P(f1);
        paramInt = this.h;
        com.allinone.callerid.util.recorder.f.r((View)linearLayout, paramInt, 0, paramInt, paramInt);
        f.P(f1).setBackgroundResource(2131230858);
      } else {
        LinearLayout linearLayout = f.P(f1);
        paramInt = this.h;
        com.allinone.callerid.util.recorder.f.r((View)linearLayout, paramInt, 0, paramInt, 0);
        f.P(f1).setBackgroundResource(2131230859);
      } 
      if (recordCall.getNumbertype() != 101 && recordCall.getHarassstatus() == 121) {
        f.Q(f1).setVisibility(0);
        f.R(f1).setText(i1.D((Context)this.g, recordCall.getPhoneType()));
        f.S(f1).setImageResource(2131231149);
      } else {
        f.Q(f1).setVisibility(4);
        f.S(f1).setImageResource(2131231191);
      } 
    } 
  }
  
  public RecyclerView.b0 r(ViewGroup paramViewGroup, int paramInt) {
    return new f(this, this.e.inflate(2131493179, paramViewGroup, false));
  }
  
  class a implements View.OnClickListener {
    a(f this$0, RecordCall param1RecordCall) {}
    
    public void onClick(View param1View) {
      com.allinone.callerid.util.recorder.f.o(f.I(this.c), this.b.getFilename(), this.b.getFilepath());
    }
  }
  
  class b implements View.OnLongClickListener {
    b(f this$0, RecordCall param1RecordCall, int param1Int) {}
    
    public boolean onLongClick(View param1View) {
      f.D(this.d, this.b, this.c);
      return false;
    }
  }
  
  class c implements View.OnClickListener {
    c(f this$0, RecordCall param1RecordCall, int param1Int) {}
    
    public void onClick(View param1View) {
      int i = param1View.getId();
      if (i != 2131297414) {
        if (i != 2131297416) {
          if (i == 2131297418)
            try {
              n n = new n();
              this((Context)f.I(this.d), 2131820783, f.I(this.d).getResources().getString(2131755733), "", "", 2, this.b.getFilepath());
              n.setCanceledOnTouchOutside(false);
              n.show();
              Window window = n.getWindow();
              WindowManager.LayoutParams layoutParams = window.getAttributes();
              window.setGravity(80);
              WindowManager windowManager = (WindowManager)f.I(this.d).getApplicationContext().getSystemService("window");
              i = windowManager.getDefaultDisplay().getWidth();
              int j = windowManager.getDefaultDisplay().getHeight();
              layoutParams.width = i;
              layoutParams.height = j / 2;
              window.setAttributes(layoutParams);
              q.b().c("recorder_share_count");
            } catch (Exception exception) {
              exception.printStackTrace();
            }  
        } else {
          com.allinone.callerid.util.recorder.f.q(f.I(this.d), this.b, f.F(this.d));
        } 
      } else {
        f f1 = this.d;
        f.G(f1, (Context)f.I(f1), this.b, this.c);
      } 
      if (f.H(this.d) != null)
        f.H(this.d).dismiss(); 
    }
  }
  
  class d implements DialogInterface.OnClickListener {
    d(f this$0) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {}
  }
  
  class e implements DialogInterface.OnClickListener {
    e(f this$0, int param1Int, RecordCall param1RecordCall) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {
      if (this.b < this.d.d.size()) {
        String str = this.c.getFilepath();
        this.d.d.remove(this.b);
        this.d.i();
        (j0.a()).b.execute(new a(this, str));
      } 
      q.b().c("recorder_delete_click");
    }
    
    class a implements Runnable {
      a(f.e this$0, String param2String) {}
      
      public void run() {
        try {
          com.allinone.callerid.f.k.b.d().c(this.b);
          File file = new File();
          this(this.b);
          file.delete();
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      }
    }
  }
  
  class a implements Runnable {
    a(f this$0, String param1String) {}
    
    public void run() {
      try {
        com.allinone.callerid.f.k.b.d().c(this.b);
        File file = new File();
        this(this.b);
        file.delete();
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  private class f extends RecyclerView.b0 {
    private LinearLayout A;
    
    private FrameLayout B;
    
    private TextView C;
    
    private FrameLayout D;
    
    private RelativeLayout E;
    
    private TextView F;
    
    private ImageView G;
    
    private ImageView H;
    
    private LinearLayout I;
    
    private TextView u;
    
    private ImageView v;
    
    private TextView w;
    
    private TextView x;
    
    private TextView y;
    
    private TextView z;
    
    f(f this$0, View param1View) {
      super(param1View);
      this.G = (ImageView)param1View.findViewById(2131297667);
      this.I = (LinearLayout)param1View.findViewById(2131297212);
      this.u = (TextView)param1View.findViewById(2131297675);
      this.v = (ImageView)param1View.findViewById(2131297674);
      this.w = (TextView)param1View.findViewById(2131297668);
      this.x = (TextView)param1View.findViewById(2131297673);
      this.y = (TextView)param1View.findViewById(2131297672);
      this.z = (TextView)param1View.findViewById(2131297676);
      this.A = (LinearLayout)param1View.findViewById(2131297669);
      this.B = (FrameLayout)param1View.findViewById(2131297666);
      this.C = (TextView)param1View.findViewById(2131297679);
      this.D = (FrameLayout)param1View.findViewById(2131297670);
      this.E = (RelativeLayout)param1View.findViewById(2131297677);
      this.F = (TextView)param1View.findViewById(2131297678);
      this.H = (ImageView)param1View.findViewById(2131296948);
      this.u.setTypeface(f.E(this$0));
      this.w.setTypeface(f.E(this$0));
      this.x.setTypeface(f.E(this$0));
      this.y.setTypeface(f.E(this$0));
      this.z.setTypeface(f.E(this$0));
      this.C.setTypeface(f.E(this$0));
      this.F.setTypeface(f.E(this$0));
      if (Build.VERSION.SDK_INT >= 28)
        this.I.setVisibility(8); 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/b/z/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */