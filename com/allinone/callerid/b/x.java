package com.allinone.callerid.b;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.allinone.callerid.util.g1;

public class x extends BaseAdapter {
  private Context b;
  
  private String[] c;
  
  b d;
  
  private ListView e;
  
  public x(Context paramContext, String[] paramArrayOfString, ListView paramListView) {
    this.b = paramContext;
    this.c = paramArrayOfString;
    this.e = paramListView;
  }
  
  public int getCount() {
    return this.c.length;
  }
  
  public Object getItem(int paramInt) {
    return this.c[paramInt];
  }
  
  public long getItemId(int paramInt) {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup) {
    if (paramView == null) {
      paramView = View.inflate(this.b, 2131493174, null);
      b b1 = new b(null);
      this.d = b1;
      b1.a = (TextView)paramView.findViewById(2131297960);
      this.d.a.setTypeface(g1.b());
      this.d.b = (FrameLayout)paramView.findViewById(2131296814);
      paramView.setTag(this.d);
    } else {
      this.d = (b)paramView.getTag();
    } 
    String str = this.c[paramInt];
    this.d.a.setText(str);
    this.d.b.setTag(Integer.valueOf(paramInt));
    this.d.b.setOnClickListener(new a(this, paramInt));
    return paramView;
  }
  
  class a implements View.OnClickListener {
    a(x this$0, int param1Int) {}
    
    public void onClick(View param1View) {
      ListView listView1 = x.a(this.c);
      ListView listView2 = x.a(this.c);
      int i = this.b;
      listView1.performItemClick((View)listView2, i, this.c.getItemId(i));
    }
  }
  
  private static class b {
    TextView a;
    
    FrameLayout b;
    
    private b() {}
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/b/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */