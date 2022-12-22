package com.allinone.callerid.b;

import android.content.Context;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.allinone.callerid.util.c0;

public class f extends BaseAdapter {
  private Context b;
  
  private String[] c;
  
  private String d;
  
  private LayoutInflater e;
  
  public f(Context paramContext, String[] paramArrayOfString, String paramString) {
    this.b = paramContext;
    this.c = paramArrayOfString;
    this.d = paramString;
    this.e = LayoutInflater.from(paramContext);
  }
  
  public int getCount() {
    return this.c.length;
  }
  
  public Object getItem(int paramInt) {
    return null;
  }
  
  public long getItemId(int paramInt) {
    return 0L;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup) {
    a a;
    if (paramView == null) {
      paramView = this.e.inflate(2131493123, paramViewGroup, false);
      a = new a(paramView);
      paramView.setTag(a);
    } else {
      a = (a)paramView.getTag();
    } 
    if (this.d != null) {
      SpannableString spannableString = c0.a(this.b, this.c[paramInt].replaceAll(" ", ""), this.d);
      a.a(a).setText((CharSequence)spannableString);
    } else {
      a.a(a).setText(this.c[paramInt].replace(" ", ""));
    } 
    return paramView;
  }
  
  public static class a {
    private TextView a;
    
    public a(View param1View) {
      this.a = (TextView)param1View.findViewById(2131298021);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/b/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */