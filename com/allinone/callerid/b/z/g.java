package com.allinone.callerid.b.z;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
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
import com.allinone.callerid.util.d1;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.j;
import com.allinone.callerid.util.j0;
import com.allinone.callerid.util.q;
import java.io.File;
import java.util.ArrayList;

public class g extends b<RecordCall> {
  private Typeface f;
  
  private Activity g;
  
  private int h;
  
  private g i;
  
  private AlertDialog j;
  
  private int k;
  
  private int l;
  
  private int m;
  
  private int n;
  
  private g o;
  
  public g(Activity paramActivity, ArrayList<RecordCall> paramArrayList) {
    super((Context)paramActivity, paramArrayList);
    this.g = paramActivity;
    this.f = g1.b();
    this.h = j.a((Context)this.g, 8.0F);
    this.i = this;
    this.k = d1.b((Context)this.g, 2130968686, 2131230858);
    this.l = d1.b((Context)this.g, 2130968685, 2131230857);
    this.m = d1.b((Context)this.g, 2130968687, 2131230859);
    this.n = d1.b((Context)this.g, 2130968688, 2131230860);
  }
  
  private void K(Context paramContext, RecordCall paramRecordCall, int paramInt) {
    try {
      AlertDialog.Builder builder2 = new AlertDialog.Builder();
      this(paramContext);
      AlertDialog.Builder builder3 = builder2.setMessage(paramContext.getString(2131755010));
      String str2 = paramContext.getResources().getString(2131755117);
      f f = new f();
      this(this, paramInt, paramRecordCall, paramContext);
      AlertDialog.Builder builder1 = builder3.setPositiveButton(str2, f);
      String str1 = paramContext.getResources().getString(2131755180);
      e e = new e();
      this(this);
      AlertDialog alertDialog = builder1.setNegativeButton(str1, e).create();
      alertDialog.show();
      alertDialog.getButton(-1).setTextColor(paramContext.getResources().getColor(2131099706));
      alertDialog.getButton(-2).setTextColor(paramContext.getResources().getColor(2131099695));
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void M(RecordCall paramRecordCall, int paramInt) {
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
      d d = new d();
      this(this, paramRecordCall, paramInt);
      frameLayout1.setOnClickListener(d);
      frameLayout2.setOnClickListener(d);
      frameLayout3.setOnClickListener(d);
      AlertDialog.Builder builder = new AlertDialog.Builder();
      this((Context)this.g);
      AlertDialog alertDialog = builder.setView(view).create();
      this.j = alertDialog;
      alertDialog.show();
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void L(g paramg) {
    this.o = paramg;
  }
  
  public int f(int paramInt) {
    return 0;
  }
  
  public void p(RecyclerView.b0 paramb0, int paramInt) {
    if (paramb0 instanceof h) {
      paramb0 = paramb0;
      if (paramb0 != null)
        try {
          RecordCall recordCall = (RecordCall)this.d.get(paramInt);
          if (recordCall != null) {
            h.M((h)paramb0).setText(recordCall.getShowName());
            if (recordCall.getPhonestatus() == 111) {
              h.N((h)paramb0).setImageResource(2131231081);
            } else {
              h.N((h)paramb0).setImageResource(2131231079);
            } 
            h.S((h)paramb0).setText(recordCall.getFilesizestring());
            String str = recordCall.getRemark();
            if (str != null) {
              h.T((h)paramb0).setText(str);
              h.T((h)paramb0).setVisibility(0);
            } else {
              h.T((h)paramb0).setVisibility(8);
            } 
            h.U((h)paramb0).setText(recordCall.getTimespanstring());
            ArrayList<T> arrayList = this.d;
            if (arrayList != null && arrayList.size() > 1 && paramInt > 0) {
              LinearLayout linearLayout;
              String str2 = ((RecordCall)this.d.get(paramInt - 1)).getRecordtime();
              String str1 = ((RecordCall)this.d.get(paramInt)).getRecordtime();
              if (str2 != null && str2.equals(str1)) {
                h.V((h)paramb0).setVisibility(8);
                h.W((h)paramb0).setVisibility(8);
                if (paramInt == this.d.size() - 1) {
                  linearLayout = h.X((h)paramb0);
                  int i = this.h;
                  com.allinone.callerid.util.recorder.f.r((View)linearLayout, i, 0, i, i);
                  h.X((h)paramb0).setBackgroundResource(this.k);
                } else {
                  str2 = ((RecordCall)this.d.get(paramInt + 1)).getRecordtime();
                  if (str2 != null && str2.equals(linearLayout)) {
                    linearLayout = h.X((h)paramb0);
                    int i = this.h;
                    com.allinone.callerid.util.recorder.f.r((View)linearLayout, i, 0, i, 0);
                    h.X((h)paramb0).setBackgroundResource(this.m);
                  } else {
                    linearLayout = h.X((h)paramb0);
                    int i = this.h;
                    com.allinone.callerid.util.recorder.f.r((View)linearLayout, i, 0, i, 0);
                    h.X((h)paramb0).setBackgroundResource(this.k);
                  } 
                } 
              } else {
                h.V((h)paramb0).setVisibility(0);
                h.W((h)paramb0).setVisibility(0);
                h.V((h)paramb0).setText((CharSequence)linearLayout);
                LinearLayout linearLayout1 = h.X((h)paramb0);
                int i = this.h;
                com.allinone.callerid.util.recorder.f.r((View)linearLayout1, i, i, i, 0);
                if (paramInt == this.d.size() - 1) {
                  if (str2 != null && str2.equals(linearLayout)) {
                    linearLayout = h.X((h)paramb0);
                    i = this.h;
                    com.allinone.callerid.util.recorder.f.r((View)linearLayout, i, 0, i, 0);
                    h.X((h)paramb0).setBackgroundResource(this.k);
                  } else {
                    linearLayout = h.X((h)paramb0);
                    i = this.h;
                    com.allinone.callerid.util.recorder.f.r((View)linearLayout, i, i, i, i);
                    h.X((h)paramb0).setBackgroundResource(this.l);
                  } 
                } else {
                  i = paramInt + 1;
                  if (i < this.d.size()) {
                    str2 = ((RecordCall)this.d.get(i)).getRecordtime();
                    if (str2 != null && str2.equals(linearLayout)) {
                      h.X((h)paramb0).setBackgroundResource(this.n);
                    } else {
                      h.X((h)paramb0).setBackgroundResource(this.l);
                    } 
                  } else {
                    h.X((h)paramb0).setBackgroundResource(this.n);
                  } 
                } 
              } 
            } 
            h.Y((h)paramb0).setText(recordCall.getRecordtimems());
            if (paramInt == 0) {
              h.Z((h)paramb0).setVisibility(0);
              h.V((h)paramb0).setVisibility(0);
              h.W((h)paramb0).setVisibility(0);
              h.V((h)paramb0).setText(recordCall.getRecordtime());
              if (this.d.size() == 1) {
                LinearLayout linearLayout = h.X((h)paramb0);
                int j = this.h;
                com.allinone.callerid.util.recorder.f.r((View)linearLayout, j, j, j, j);
                h.X((h)paramb0).setBackgroundResource(this.l);
              } else {
                LinearLayout linearLayout = h.X((h)paramb0);
                int j = this.h;
                com.allinone.callerid.util.recorder.f.r((View)linearLayout, j, j, j, 0);
                h.X((h)paramb0).setBackgroundResource(this.n);
              } 
              int i = paramInt + 1;
              if (i < this.d.size()) {
                String str2 = ((RecordCall)this.d.get(paramInt)).getRecordtime();
                String str1 = ((RecordCall)this.d.get(i)).getRecordtime();
                if (str1 != null && str1.equals(str2)) {
                  h.X((h)paramb0).setBackgroundResource(this.n);
                } else {
                  h.X((h)paramb0).setBackgroundResource(this.l);
                } 
              } 
            } else {
              h.Z((h)paramb0).setVisibility(8);
            } 
            if (recordCall.getNumbertype() != 101 && recordCall.getHarassstatus() == 121) {
              h.O((h)paramb0).setVisibility(0);
              h.P((h)paramb0).setText(i1.D((Context)this.g, recordCall.getPhoneType()));
              h.Q((h)paramb0).setImageResource(2131231149);
            } else {
              h.O((h)paramb0).setVisibility(4);
              h.Q((h)paramb0).setImageResource(2131231191);
            } 
            FrameLayout frameLayout = h.R((h)paramb0);
            a a = new a();
            this(this, recordCall);
            frameLayout.setOnClickListener(a);
            frameLayout = h.R((h)paramb0);
            b b1 = new b();
            this(this, recordCall, paramInt);
            frameLayout.setOnLongClickListener(b1);
            ImageView imageView = h.Z((h)paramb0);
            c c = new c();
            this(this);
            imageView.setOnClickListener(c);
          } 
        } catch (Exception exception) {
          exception.printStackTrace();
        }  
    } 
  }
  
  public RecyclerView.b0 r(ViewGroup paramViewGroup, int paramInt) {
    return new h(this, this.e.inflate(2131493179, paramViewGroup, false));
  }
  
  class a implements View.OnClickListener {
    a(g this$0, RecordCall param1RecordCall) {}
    
    public void onClick(View param1View) {
      com.allinone.callerid.util.recorder.f.o(g.D(this.c), this.b.getFilename(), this.b.getFilepath());
    }
  }
  
  class b implements View.OnLongClickListener {
    b(g this$0, RecordCall param1RecordCall, int param1Int) {}
    
    public boolean onLongClick(View param1View) {
      g.E(this.d, this.b, this.c);
      return false;
    }
  }
  
  class c implements View.OnClickListener {
    c(g this$0) {}
    
    public void onClick(View param1View) {
      if (g.F(this.b) != null)
        g.F(this.b).a(param1View); 
    }
  }
  
  class d implements View.OnClickListener {
    d(g this$0, RecordCall param1RecordCall, int param1Int) {}
    
    public void onClick(View param1View) {
      int i = param1View.getId();
      if (i != 2131297414) {
        if (i != 2131297416) {
          if (i == 2131297418)
            try {
              n n = new n();
              this((Context)g.D(this.d), 2131820783, g.D(this.d).getResources().getString(2131755733), "", "", 2, this.b.getFilepath());
              n.setCanceledOnTouchOutside(false);
              n.show();
              Window window = n.getWindow();
              WindowManager.LayoutParams layoutParams = window.getAttributes();
              window.setGravity(80);
              WindowManager windowManager = (WindowManager)g.D(this.d).getApplicationContext().getSystemService("window");
              int j = windowManager.getDefaultDisplay().getWidth();
              i = windowManager.getDefaultDisplay().getHeight();
              layoutParams.width = j;
              layoutParams.height = i / 2;
              window.setAttributes(layoutParams);
              q.b().c("recorder_share_count");
            } catch (Exception exception) {
              exception.printStackTrace();
            }  
        } else {
          com.allinone.callerid.util.recorder.f.q(g.D(this.d), this.b, g.H(this.d));
        } 
      } else {
        g g1 = this.d;
        g.I(g1, (Context)g.D(g1), this.b, this.c);
      } 
      if (g.J(this.d) != null)
        g.J(this.d).dismiss(); 
    }
  }
  
  class e implements DialogInterface.OnClickListener {
    e(g this$0) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {}
  }
  
  class f implements DialogInterface.OnClickListener {
    f(g this$0, int param1Int, RecordCall param1RecordCall, Context param1Context) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {
      if (this.b < this.e.d.size()) {
        String str = this.c.getFilepath();
        this.e.d.remove(this.b);
        this.e.i();
        (j0.a()).b.execute(new a(this, str));
        Intent intent = new Intent();
        intent.setAction("com.allinone.callerid.UPDATEVIEW");
        b.p.a.a.b(this.d).d(intent);
        q.b().c("recorder_delete_click");
      } 
    }
    
    class a implements Runnable {
      a(g.f this$0, String param2String) {}
      
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
    a(g this$0, String param1String) {}
    
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
  
  public static interface g {
    void a(View param1View);
  }
  
  private class h extends RecyclerView.b0 {
    private LinearLayout A;
    
    private FrameLayout B;
    
    private TextView C;
    
    private ImageView D;
    
    private FrameLayout E;
    
    private RelativeLayout F;
    
    private TextView G;
    
    private ImageView H;
    
    private LinearLayout I;
    
    private TextView u;
    
    private ImageView v;
    
    private TextView w;
    
    private TextView x;
    
    private TextView y;
    
    private TextView z;
    
    h(g this$0, View param1View) {
      super(param1View);
      this.u = (TextView)param1View.findViewById(2131297675);
      this.I = (LinearLayout)param1View.findViewById(2131297212);
      this.v = (ImageView)param1View.findViewById(2131297674);
      this.w = (TextView)param1View.findViewById(2131297668);
      this.x = (TextView)param1View.findViewById(2131297673);
      this.y = (TextView)param1View.findViewById(2131297672);
      this.z = (TextView)param1View.findViewById(2131297676);
      this.A = (LinearLayout)param1View.findViewById(2131297669);
      this.B = (FrameLayout)param1View.findViewById(2131297666);
      this.C = (TextView)param1View.findViewById(2131297679);
      this.D = (ImageView)param1View.findViewById(2131297667);
      this.E = (FrameLayout)param1View.findViewById(2131297670);
      this.F = (RelativeLayout)param1View.findViewById(2131297677);
      this.G = (TextView)param1View.findViewById(2131297678);
      this.H = (ImageView)param1View.findViewById(2131296948);
      this.u.setTypeface(g.G(this$0));
      this.w.setTypeface(g.G(this$0));
      this.x.setTypeface(g.G(this$0));
      this.y.setTypeface(g.G(this$0));
      this.z.setTypeface(g.G(this$0));
      this.C.setTypeface(g.G(this$0));
      this.G.setTypeface(g.G(this$0));
      if (Build.VERSION.SDK_INT >= 28)
        this.I.setVisibility(8); 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/b/z/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */