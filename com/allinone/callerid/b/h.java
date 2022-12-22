package com.allinone.callerid.b;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.allinone.callerid.search.CallLogBean;
import com.allinone.callerid.util.d1;
import java.util.ArrayList;
import java.util.List;

public class h extends BaseAdapter {
  private final int b;
  
  private final int c;
  
  private Activity d;
  
  private List<CallLogBean> e;
  
  private LayoutInflater f;
  
  b g;
  
  public h(Activity paramActivity) {
    this.d = paramActivity;
    this.e = new ArrayList<CallLogBean>();
    this.f = LayoutInflater.from((Context)paramActivity);
    this.b = d1.b((Context)paramActivity, 2130969269, 2131231187);
    this.c = d1.b((Context)paramActivity, 2130969273, 2131231181);
  }
  
  public void a(List<CallLogBean> paramList, boolean paramBoolean) {
    if (paramBoolean)
      this.e.clear(); 
    List<CallLogBean> list = this.e;
    if (list != null && paramList != null)
      list.addAll(paramList); 
  }
  
  public int getCount() {
    return this.e.size();
  }
  
  public Object getItem(int paramInt) {
    return this.e.get(paramInt);
  }
  
  public long getItemId(int paramInt) {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup) {
    // Byte code:
    //   0: aload_2
    //   1: ifnonnull -> 128
    //   4: aload_0
    //   5: getfield f : Landroid/view/LayoutInflater;
    //   8: ldc 2131492974
    //   10: aload_3
    //   11: iconst_0
    //   12: invokevirtual inflate : (ILandroid/view/ViewGroup;Z)Landroid/view/View;
    //   15: astore_2
    //   16: new com/allinone/callerid/b/h$b
    //   19: dup
    //   20: aconst_null
    //   21: invokespecial <init> : (Lcom/allinone/callerid/b/h$a;)V
    //   24: astore_3
    //   25: aload_0
    //   26: aload_3
    //   27: putfield g : Lcom/allinone/callerid/b/h$b;
    //   30: aload_3
    //   31: aload_2
    //   32: ldc 2131297306
    //   34: invokevirtual findViewById : (I)Landroid/view/View;
    //   37: checkcast android/widget/TextView
    //   40: putfield a : Landroid/widget/TextView;
    //   43: aload_0
    //   44: getfield g : Lcom/allinone/callerid/b/h$b;
    //   47: aload_2
    //   48: ldc 2131297333
    //   50: invokevirtual findViewById : (I)Landroid/view/View;
    //   53: checkcast android/widget/TextView
    //   56: putfield b : Landroid/widget/TextView;
    //   59: aload_0
    //   60: getfield g : Lcom/allinone/callerid/b/h$b;
    //   63: getfield a : Landroid/widget/TextView;
    //   66: invokestatic b : ()Landroid/graphics/Typeface;
    //   69: invokevirtual setTypeface : (Landroid/graphics/Typeface;)V
    //   72: aload_0
    //   73: getfield g : Lcom/allinone/callerid/b/h$b;
    //   76: getfield b : Landroid/widget/TextView;
    //   79: invokestatic b : ()Landroid/graphics/Typeface;
    //   82: invokevirtual setTypeface : (Landroid/graphics/Typeface;)V
    //   85: aload_0
    //   86: getfield g : Lcom/allinone/callerid/b/h$b;
    //   89: aload_2
    //   90: ldc 2131297361
    //   92: invokevirtual findViewById : (I)Landroid/view/View;
    //   95: checkcast android/widget/ImageView
    //   98: putfield c : Landroid/widget/ImageView;
    //   101: aload_0
    //   102: getfield g : Lcom/allinone/callerid/b/h$b;
    //   105: aload_2
    //   106: ldc 2131296445
    //   108: invokevirtual findViewById : (I)Landroid/view/View;
    //   111: checkcast android/widget/ImageView
    //   114: putfield d : Landroid/widget/ImageView;
    //   117: aload_2
    //   118: aload_0
    //   119: getfield g : Lcom/allinone/callerid/b/h$b;
    //   122: invokevirtual setTag : (Ljava/lang/Object;)V
    //   125: goto -> 139
    //   128: aload_0
    //   129: aload_2
    //   130: invokevirtual getTag : ()Ljava/lang/Object;
    //   133: checkcast com/allinone/callerid/b/h$b
    //   136: putfield g : Lcom/allinone/callerid/b/h$b;
    //   139: aload_0
    //   140: getfield e : Ljava/util/List;
    //   143: iload_1
    //   144: invokeinterface get : (I)Ljava/lang/Object;
    //   149: checkcast com/allinone/callerid/search/CallLogBean
    //   152: astore #4
    //   154: aload #4
    //   156: invokevirtual n : ()Ljava/lang/String;
    //   159: astore #5
    //   161: aload #5
    //   163: ifnull -> 179
    //   166: aload #5
    //   168: astore_3
    //   169: ldc ''
    //   171: aload #5
    //   173: invokevirtual equals : (Ljava/lang/Object;)Z
    //   176: ifeq -> 192
    //   179: aload_0
    //   180: getfield d : Landroid/app/Activity;
    //   183: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   186: ldc 2131755830
    //   188: invokevirtual getString : (I)Ljava/lang/String;
    //   191: astore_3
    //   192: aload_0
    //   193: getfield g : Lcom/allinone/callerid/b/h$b;
    //   196: getfield a : Landroid/widget/TextView;
    //   199: aload_3
    //   200: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   203: aload_0
    //   204: getfield g : Lcom/allinone/callerid/b/h$b;
    //   207: getfield b : Landroid/widget/TextView;
    //   210: aload #4
    //   212: invokevirtual p : ()Ljava/lang/String;
    //   215: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   218: aload_0
    //   219: getfield g : Lcom/allinone/callerid/b/h$b;
    //   222: getfield d : Landroid/widget/ImageView;
    //   225: new com/allinone/callerid/b/h$a
    //   228: dup
    //   229: aload_0
    //   230: aload #4
    //   232: invokespecial <init> : (Lcom/allinone/callerid/b/h;Lcom/allinone/callerid/search/CallLogBean;)V
    //   235: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   238: aload #4
    //   240: invokevirtual E : ()Ljava/lang/String;
    //   243: ifnull -> 289
    //   246: ldc ''
    //   248: aload #4
    //   250: invokevirtual E : ()Ljava/lang/String;
    //   253: invokevirtual equals : (Ljava/lang/Object;)Z
    //   256: ifne -> 289
    //   259: aload #4
    //   261: invokevirtual E : ()Ljava/lang/String;
    //   264: ldc '1'
    //   266: invokevirtual equals : (Ljava/lang/Object;)Z
    //   269: ifeq -> 289
    //   272: aload_0
    //   273: getfield g : Lcom/allinone/callerid/b/h$b;
    //   276: getfield d : Landroid/widget/ImageView;
    //   279: aload_0
    //   280: getfield c : I
    //   283: invokevirtual setImageResource : (I)V
    //   286: goto -> 303
    //   289: aload_0
    //   290: getfield g : Lcom/allinone/callerid/b/h$b;
    //   293: getfield d : Landroid/widget/ImageView;
    //   296: aload_0
    //   297: getfield b : I
    //   300: invokevirtual setImageResource : (I)V
    //   303: aload #4
    //   305: invokevirtual u : ()Ljava/lang/String;
    //   308: ifnull -> 373
    //   311: aload #4
    //   313: invokevirtual u : ()Ljava/lang/String;
    //   316: ldc ''
    //   318: invokevirtual equals : (Ljava/lang/Object;)Z
    //   321: ifne -> 373
    //   324: aload #4
    //   326: invokevirtual u : ()Ljava/lang/String;
    //   329: invokestatic parseLong : (Ljava/lang/String;)J
    //   332: lconst_0
    //   333: lcmp
    //   334: ifle -> 373
    //   337: aload_0
    //   338: getfield d : Landroid/app/Activity;
    //   341: getstatic android/provider/ContactsContract$Contacts.CONTENT_URI : Landroid/net/Uri;
    //   344: aload #4
    //   346: invokevirtual v : ()I
    //   349: i2l
    //   350: invokestatic withAppendedId : (Landroid/net/Uri;J)Landroid/net/Uri;
    //   353: aload #4
    //   355: invokevirtual a : ()Ljava/lang/String;
    //   358: ldc 2131231148
    //   360: aload_0
    //   361: getfield g : Lcom/allinone/callerid/b/h$b;
    //   364: getfield c : Landroid/widget/ImageView;
    //   367: invokestatic c : (Landroid/app/Activity;Landroid/net/Uri;Ljava/lang/String;ILandroid/widget/ImageView;)V
    //   370: goto -> 385
    //   373: aload_0
    //   374: getfield g : Lcom/allinone/callerid/b/h$b;
    //   377: getfield c : Landroid/widget/ImageView;
    //   380: ldc 2131231148
    //   382: invokevirtual setImageResource : (I)V
    //   385: aload_2
    //   386: areturn
  }
  
  class a implements View.OnClickListener {
    a(h this$0, CallLogBean param1CallLogBean) {}
    
    public void onClick(View param1View) {
      if (this.b.E() != null && !"".equals(this.b.E()))
        if (this.b.E().equals("1")) {
          try {
            int i = this.b.v();
            a a1 = new a();
            this(this);
            com.allinone.callerid.i.a.j.a.b(i, a1);
          } catch (Exception exception) {
            exception.printStackTrace();
          } 
        } else {
          try {
            int i = this.b.v();
            b b = new b();
            this(this);
            com.allinone.callerid.i.a.j.a.a(i, b);
          } catch (Exception exception) {
            exception.printStackTrace();
          } 
        }  
    }
    
    class a implements com.allinone.callerid.i.a.a {
      a(h.a this$0) {}
      
      public void a() {
        this.a.b.U0("0");
        this.a.c.notifyDataSetChanged();
      }
    }
    
    class b implements com.allinone.callerid.i.a.a {
      b(h.a this$0) {}
      
      public void a() {
        this.a.b.U0("1");
        this.a.c.notifyDataSetChanged();
      }
    }
  }
  
  class a implements com.allinone.callerid.i.a.a {
    a(h this$0) {}
    
    public void a() {
      this.a.b.U0("0");
      this.a.c.notifyDataSetChanged();
    }
  }
  
  class b implements com.allinone.callerid.i.a.a {
    b(h this$0) {}
    
    public void a() {
      this.a.b.U0("1");
      this.a.c.notifyDataSetChanged();
    }
  }
  
  private static class b {
    TextView a;
    
    TextView b;
    
    ImageView c;
    
    ImageView d;
    
    private b() {}
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/b/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */