package com.allinone.callerid.b.z;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.allinone.callerid.bean.recorder.AudioSourceInfo;
import com.allinone.callerid.f.k.c;
import com.allinone.callerid.util.g1;
import java.util.ArrayList;
import java.util.Iterator;

public class e extends b<AudioSourceInfo> {
  private Typeface f;
  
  private Context g;
  
  private Activity h;
  
  public e(Context paramContext, ArrayList<AudioSourceInfo> paramArrayList) {
    super(paramContext, paramArrayList);
    this.g = paramContext;
    this.f = g1.b();
    this.h = (Activity)paramContext;
  }
  
  public void p(RecyclerView.b0 paramb0, int paramInt) {
    b b1 = (b)paramb0;
    if (b1 != null) {
      AudioSourceInfo audioSourceInfo = (AudioSourceInfo)this.d.get(paramInt);
      b.M(b1).setText(audioSourceInfo.getShowname());
      b.N(b1).setOnClickListener(new a(this, audioSourceInfo));
      if (audioSourceInfo.isselected()) {
        b.O(b1).setChecked(true);
        b.O(b1).setVisibility(0);
      } else {
        b.O(b1).setChecked(false);
        b.O(b1).setVisibility(8);
      } 
    } 
  }
  
  public RecyclerView.b0 r(ViewGroup paramViewGroup, int paramInt) {
    return new b(this, this.e.inflate(2131493155, paramViewGroup, false));
  }
  
  class a implements View.OnClickListener {
    a(e this$0, AudioSourceInfo param1AudioSourceInfo) {}
    
    public void onClick(View param1View) {
      if (!this.b.isselected())
        (new Thread(new a(this))).start(); 
    }
    
    class a implements Runnable {
      a(e.a this$0) {}
      
      public void run() {
        if (c.b().d(this.b.b.getShowname())) {
          com.allinone.callerid.util.recorder.b.j(this.b.b.getAudiosource());
          Iterator<T> iterator = this.b.c.d.iterator();
          while (iterator.hasNext())
            ((AudioSourceInfo)iterator.next()).setIsselected(false); 
          this.b.b.setIsselected(true);
          e.E(this.b.c).runOnUiThread(new a(this));
        } 
      }
      
      class a implements Runnable {
        a(e.a.a this$0) {}
        
        public void run() {
          this.b.b.c.i();
          Toast.makeText(e.D(this.b.b.c), e.D(this.b.b.c).getString(2131755036), 0).show();
        }
      }
    }
    
    class a implements Runnable {
      a(e.a this$0) {}
      
      public void run() {
        this.b.b.c.i();
        Toast.makeText(e.D(this.b.b.c), e.D(this.b.b.c).getString(2131755036), 0).show();
      }
    }
  }
  
  class a implements Runnable {
    a(e this$0) {}
    
    public void run() {
      if (c.b().d(this.b.b.getShowname())) {
        com.allinone.callerid.util.recorder.b.j(this.b.b.getAudiosource());
        Iterator<T> iterator = this.b.c.d.iterator();
        while (iterator.hasNext())
          ((AudioSourceInfo)iterator.next()).setIsselected(false); 
        this.b.b.setIsselected(true);
        e.E(this.b.c).runOnUiThread(new a(this));
      } 
    }
    
    class a implements Runnable {
      a(e.a.a this$0) {}
      
      public void run() {
        this.b.b.c.i();
        Toast.makeText(e.D(this.b.b.c), e.D(this.b.b.c).getString(2131755036), 0).show();
      }
    }
  }
  
  class a implements Runnable {
    a(e this$0) {}
    
    public void run() {
      this.b.b.c.i();
      Toast.makeText(e.D(this.b.b.c), e.D(this.b.b.c).getString(2131755036), 0).show();
    }
  }
  
  private class b extends RecyclerView.b0 {
    private FrameLayout u;
    
    private TextView v;
    
    private RadioButton w;
    
    b(e this$0, View param1View) {
      super(param1View);
      this.u = (FrameLayout)param1View.findViewById(2131297446);
      this.v = (TextView)param1View.findViewById(2131297447);
      this.w = (RadioButton)param1View.findViewById(2131297448);
      this.v.setTypeface(e.F(this$0));
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/b/z/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */