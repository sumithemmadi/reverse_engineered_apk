package com.allinone.callerid.b;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.allinone.callerid.bean.CommentContent;
import com.allinone.callerid.customview.ExpandableTextView;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.util.g1;
import java.util.ArrayList;
import java.util.List;

public class g extends RecyclerView.Adapter<RecyclerView.b0> {
  private final Typeface d;
  
  private List<CommentContent> e = new ArrayList<CommentContent>();
  
  private LayoutInflater f;
  
  private b g;
  
  public g(Activity paramActivity, List<CommentContent> paramList) {
    this.e = paramList;
    this.f = LayoutInflater.from((Context)paramActivity);
    this.d = g1.b();
  }
  
  public void C(b paramb) {
    this.g = paramb;
  }
  
  public int d() {
    boolean bool;
    List<CommentContent> list = this.e;
    if (list != null) {
      bool = list.size();
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public int f(int paramInt) {
    return 0;
  }
  
  public void p(RecyclerView.b0 paramb0, int paramInt) {
    if (paramb0 instanceof c) {
      List<CommentContent> list = this.e;
      if (list != null && list.size() > 0) {
        CommentContent commentContent = this.e.get(paramInt);
        paramb0 = paramb0;
        c.M((c)paramb0).setText(commentContent.getContent(), paramInt);
        c.N((c)paramb0).setText(commentContent.getCreate_time());
        if (commentContent.getType_label() != null && !"".equals(commentContent.getType_label())) {
          StringBuilder stringBuilder2 = new StringBuilder();
          stringBuilder2.append("<font color='#ee5164'> ");
          stringBuilder2.append(commentContent.getType_label());
          stringBuilder2.append("</font>");
          String str2 = stringBuilder2.toString();
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append(EZCallApplication.c().getResources().getString(2131755648));
          stringBuilder1.append(str2);
          String str1 = stringBuilder1.toString();
          c.O((c)paramb0).setText((CharSequence)Html.fromHtml(str1));
          c.O((c)paramb0).setVisibility(0);
        } else {
          c.O((c)paramb0).setVisibility(8);
        } 
        String str = ((CommentContent)this.e.get(paramInt)).getAuthor();
        if (str != null && !"".equals(str)) {
          c.P((c)paramb0).setText(str);
          if (str.equals(EZCallApplication.c().getResources().getString(2131755871))) {
            c.Q((c)paramb0).setVisibility(4);
          } else {
            c.Q((c)paramb0).setVisibility(0);
          } 
        } 
        c.Q((c)paramb0).setOnClickListener(new a(this, paramInt));
      } 
    } 
  }
  
  public RecyclerView.b0 r(ViewGroup paramViewGroup, int paramInt) {
    return (paramInt == 0) ? new c(this, this.f.inflate(2131492973, paramViewGroup, false)) : null;
  }
  
  class a implements View.OnClickListener {
    a(g this$0, int param1Int) {}
    
    public void onClick(View param1View) {
      if (g.A(this.c) != null)
        g.A(this.c).a(param1View, this.b); 
    }
  }
  
  public static interface b {
    void a(View param1View, int param1Int);
  }
  
  public class c extends RecyclerView.b0 {
    private ImageView u;
    
    private ExpandableTextView v;
    
    private TextView w;
    
    private TextView x;
    
    private TextView y;
    
    c(g this$0, View param1View) {
      super(param1View);
      this.u = (ImageView)param1View.findViewById(2131297134);
      this.v = (ExpandableTextView)param1View.findViewById(2131297850);
      this.w = (TextView)param1View.findViewById(2131297852);
      this.x = (TextView)param1View.findViewById(2131297853);
      this.y = (TextView)param1View.findViewById(2131298201);
      this.w.setTypeface(g.B(this$0));
      this.x.setTypeface(g.B(this$0));
      this.y.setTypeface(g.B(this$0));
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/b/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */