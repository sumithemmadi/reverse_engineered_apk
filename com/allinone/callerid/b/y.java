package com.allinone.callerid.b;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.allinone.callerid.b.z.b;
import com.allinone.callerid.bean.SubType;
import com.allinone.callerid.util.g1;
import java.util.ArrayList;

public class y extends b<SubType> {
  private Context f;
  
  private Typeface g;
  
  private boolean h;
  
  private int i;
  
  private b j;
  
  public y(Context paramContext, ArrayList<SubType> paramArrayList) {
    super(paramContext, paramArrayList);
    this.f = paramContext;
    this.g = g1.b();
    this.h = false;
  }
  
  public void K(b paramb) {
    this.j = paramb;
  }
  
  public void p(RecyclerView.b0 paramb0, int paramInt) {
    c c = (c)paramb0;
    if (c != null) {
      SubType subType = this.d.get(paramInt);
      c.M(c).setText(subType.getSubtype());
      if (subType.getCount() != 0) {
        c.N(c).setVisibility(0);
        TextView textView = c.N(c);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(subType.getCount());
        stringBuilder.append("");
        textView.setText(stringBuilder.toString());
      } else {
        c.N(c).setVisibility(8);
      } 
      if (subType.isIs_has_bg()) {
        c.O(c).setProgress(100);
        c.P(c).setBackgroundResource(2131231428);
        c.M(c).setTextColor(this.f.getResources().getColor(2131099942));
      } else {
        c.O(c).setProgress(0);
        c.P(c).setBackgroundResource(2131231429);
        c.M(c).setTextColor(this.f.getResources().getColor(2131099899));
      } 
      c.P(c).setOnClickListener(new a(this, c, subType));
    } 
  }
  
  public RecyclerView.b0 r(ViewGroup paramViewGroup, int paramInt) {
    return new c(this.e.inflate(2131493180, paramViewGroup, false), null);
  }
  
  class a implements View.OnClickListener {
    a(y this$0, y.c param1c, SubType param1SubType) {}
    
    public void onClick(View param1View) {
      if (!y.D(this.d)) {
        y.E(this.d, true);
        if (y.c.O(this.b).getProgress() == 0) {
          y.c.M(this.b).setTextColor(y.F(this.d).getResources().getColor(2131099942));
        } else {
          y.c.M(this.b).setTextColor(y.F(this.d).getResources().getColor(2131099899));
        } 
        ViewGroup.LayoutParams layoutParams = y.c.O(this.b).getLayoutParams();
        layoutParams.width = param1View.getWidth();
        y.c.O(this.b).setLayoutParams(layoutParams);
        (new a(this)).start();
      } 
    }
    
    class a extends Thread {
      a(y.a this$0) {}
      
      public void run() {
        super.run();
        int i = y.c.O(this.b.b).getProgress();
        byte b = 0;
        if (i == 0) {
          y.H(this.b.d, 0);
          while (b < 25) {
            y y = this.b.d;
            y.H(y, y.G(y) + 4);
            try {
              Thread.sleep(10L);
            } catch (InterruptedException interruptedException) {
              interruptedException.printStackTrace();
            } 
            y.c.O(this.b.b).setProgress(y.G(this.b.d));
            b++;
          } 
          if (y.I(this.b.d) != null)
            y.I(this.b.d).a(this.b.c, true); 
        } else {
          y.H(this.b.d, 100);
          for (b = 0; b < 25; b++) {
            y y = this.b.d;
            y.H(y, y.G(y) - 4);
            try {
              Thread.sleep(10L);
            } catch (InterruptedException interruptedException) {
              interruptedException.printStackTrace();
            } 
            y.c.O(this.b.b).setProgress(y.G(this.b.d));
          } 
          if (y.I(this.b.d) != null)
            y.I(this.b.d).a(this.b.c, false); 
        } 
      }
    }
  }
  
  class a extends Thread {
    a(y this$0) {}
    
    public void run() {
      super.run();
      int i = y.c.O(this.b.b).getProgress();
      byte b = 0;
      if (i == 0) {
        y.H(this.b.d, 0);
        while (b < 25) {
          y y = this.b.d;
          y.H(y, y.G(y) + 4);
          try {
            Thread.sleep(10L);
          } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
          } 
          y.c.O(this.b.b).setProgress(y.G(this.b.d));
          b++;
        } 
        if (y.I(this.b.d) != null)
          y.I(this.b.d).a(this.b.c, true); 
      } else {
        y.H(this.b.d, 100);
        for (b = 0; b < 25; b++) {
          y y = this.b.d;
          y.H(y, y.G(y) - 4);
          try {
            Thread.sleep(10L);
          } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
          } 
          y.c.O(this.b.b).setProgress(y.G(this.b.d));
        } 
        if (y.I(this.b.d) != null)
          y.I(this.b.d).a(this.b.c, false); 
      } 
    }
  }
  
  public static interface b {
    void a(SubType param1SubType, boolean param1Boolean);
  }
  
  private class c extends RecyclerView.b0 {
    private TextView u;
    
    private TextView v;
    
    private RelativeLayout w;
    
    private ProgressBar x;
    
    private c(y this$0, View param1View) {
      super(param1View);
      TextView textView = (TextView)param1View.findViewById(2131298234);
      this.u = textView;
      textView.setTypeface(y.J(y.this));
      this.w = (RelativeLayout)param1View.findViewById(2131297472);
      this.x = (ProgressBar)param1View.findViewById(2131297303);
      this.v = (TextView)param1View.findViewById(2131297244);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/b/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */