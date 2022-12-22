package com.allinone.callerid.b;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.allinone.callerid.bean.ShareAppInfo;
import java.util.List;

public class u extends BaseAdapter {
  private List<ShareAppInfo> b;
  
  private Context c;
  
  public u(Context paramContext, List<ShareAppInfo> paramList) {
    this.c = paramContext;
    this.b = paramList;
  }
  
  public int getCount() {
    return this.b.size();
  }
  
  public Object getItem(int paramInt) {
    return Integer.valueOf(paramInt);
  }
  
  public long getItemId(int paramInt) {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup) {
    View view = paramView;
    if (paramView == null) {
      view = View.inflate(this.c, 2131493169, null);
      ImageView imageView2 = (ImageView)view.findViewById(2131297052);
      ImageView imageView1 = (ImageView)view.findViewById(2131297093);
      TextView textView = (TextView)view.findViewById(2131298125);
      imageView2.setBackgroundDrawable(((ShareAppInfo)this.b.get(paramInt)).getAppIcon());
      textView.setText(((ShareAppInfo)this.b.get(paramInt)).getAppName());
      String str = ((ShareAppInfo)this.b.get(paramInt)).getAppPkgName();
      str.hashCode();
      paramInt = -1;
      switch (str.hashCode()) {
        case 908140028:
          if (!str.equals("com.facebook.orca"))
            break; 
          paramInt = 5;
          break;
        case 714499313:
          if (!str.equals("com.facebook.katana"))
            break; 
          paramInt = 4;
          break;
        case 10619783:
          if (!str.equals("com.twitter.android"))
            break; 
          paramInt = 3;
          break;
        case -695601689:
          if (!str.equals("com.android.mms"))
            break; 
          paramInt = 2;
          break;
        case -1430093937:
          if (!str.equals("com.google.android.apps.messaging"))
            break; 
          paramInt = 1;
          break;
        case -1547699361:
          if (!str.equals("com.whatsapp"))
            break; 
          paramInt = 0;
          break;
      } 
      switch (paramInt) {
        default:
          imageView1.setVisibility(8);
          return view;
        case 5:
          imageView1.setVisibility(0);
          return view;
        case 4:
          imageView1.setVisibility(0);
          return view;
        case 3:
          imageView1.setVisibility(0);
          return view;
        case 2:
          imageView1.setVisibility(0);
          return view;
        case 1:
          imageView1.setVisibility(0);
          return view;
        case 0:
          break;
      } 
      imageView1.setVisibility(0);
    } 
    return view;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/b/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */