package com.allinone.callerid.b;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.allinone.callerid.bean.EZSimpleContact;
import java.util.List;

public class b extends BaseAdapter {
  private Activity b;
  
  private List<EZSimpleContact> c;
  
  private LayoutInflater d;
  
  private ListView e;
  
  c f;
  
  public b(Activity paramActivity, List<EZSimpleContact> paramList, ListView paramListView) {
    this.b = paramActivity;
    this.c = paramList;
    this.d = LayoutInflater.from((Context)paramActivity);
    this.e = paramListView;
  }
  
  public int getCount() {
    return this.c.size();
  }
  
  public Object getItem(int paramInt) {
    return this.c.get(paramInt);
  }
  
  public long getItemId(int paramInt) {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup) {
    // Byte code:
    //   0: aload_2
    //   1: ifnonnull -> 160
    //   4: aload_0
    //   5: getfield d : Landroid/view/LayoutInflater;
    //   8: ldc 2131492966
    //   10: aload_3
    //   11: iconst_0
    //   12: invokevirtual inflate : (ILandroid/view/ViewGroup;Z)Landroid/view/View;
    //   15: astore_2
    //   16: new com/allinone/callerid/b/b$c
    //   19: dup
    //   20: aconst_null
    //   21: invokespecial <init> : (Lcom/allinone/callerid/b/b$a;)V
    //   24: astore_3
    //   25: aload_0
    //   26: aload_3
    //   27: putfield f : Lcom/allinone/callerid/b/b$c;
    //   30: aload_3
    //   31: aload_2
    //   32: ldc 2131297306
    //   34: invokevirtual findViewById : (I)Landroid/view/View;
    //   37: checkcast android/widget/TextView
    //   40: putfield a : Landroid/widget/TextView;
    //   43: aload_0
    //   44: getfield f : Lcom/allinone/callerid/b/b$c;
    //   47: aload_2
    //   48: ldc 2131297333
    //   50: invokevirtual findViewById : (I)Landroid/view/View;
    //   53: checkcast android/widget/TextView
    //   56: putfield b : Landroid/widget/TextView;
    //   59: aload_0
    //   60: getfield f : Lcom/allinone/callerid/b/b$c;
    //   63: aload_2
    //   64: ldc 2131297361
    //   66: invokevirtual findViewById : (I)Landroid/view/View;
    //   69: checkcast android/widget/ImageView
    //   72: putfield c : Landroid/widget/ImageView;
    //   75: aload_0
    //   76: getfield f : Lcom/allinone/callerid/b/b$c;
    //   79: getfield a : Landroid/widget/TextView;
    //   82: invokestatic b : ()Landroid/graphics/Typeface;
    //   85: invokevirtual setTypeface : (Landroid/graphics/Typeface;)V
    //   88: aload_0
    //   89: getfield f : Lcom/allinone/callerid/b/b$c;
    //   92: getfield b : Landroid/widget/TextView;
    //   95: invokestatic b : ()Landroid/graphics/Typeface;
    //   98: invokevirtual setTypeface : (Landroid/graphics/Typeface;)V
    //   101: aload_0
    //   102: getfield f : Lcom/allinone/callerid/b/b$c;
    //   105: aload_2
    //   106: ldc 2131297469
    //   108: invokevirtual findViewById : (I)Landroid/view/View;
    //   111: checkcast android/widget/FrameLayout
    //   114: putfield d : Landroid/widget/FrameLayout;
    //   117: aload_0
    //   118: getfield f : Lcom/allinone/callerid/b/b$c;
    //   121: getfield d : Landroid/widget/FrameLayout;
    //   124: iload_1
    //   125: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   128: invokevirtual setTag : (Ljava/lang/Object;)V
    //   131: aload_0
    //   132: getfield f : Lcom/allinone/callerid/b/b$c;
    //   135: getfield d : Landroid/widget/FrameLayout;
    //   138: new com/allinone/callerid/b/b$a
    //   141: dup
    //   142: aload_0
    //   143: invokespecial <init> : (Lcom/allinone/callerid/b/b;)V
    //   146: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   149: aload_2
    //   150: aload_0
    //   151: getfield f : Lcom/allinone/callerid/b/b$c;
    //   154: invokevirtual setTag : (Ljava/lang/Object;)V
    //   157: goto -> 171
    //   160: aload_0
    //   161: aload_2
    //   162: invokevirtual getTag : ()Ljava/lang/Object;
    //   165: checkcast com/allinone/callerid/b/b$c
    //   168: putfield f : Lcom/allinone/callerid/b/b$c;
    //   171: aload_0
    //   172: getfield c : Ljava/util/List;
    //   175: iload_1
    //   176: invokeinterface get : (I)Ljava/lang/Object;
    //   181: checkcast com/allinone/callerid/bean/EZSimpleContact
    //   184: astore #4
    //   186: aload #4
    //   188: invokevirtual getName : ()Ljava/lang/String;
    //   191: astore #5
    //   193: aload #5
    //   195: ifnull -> 211
    //   198: aload #5
    //   200: astore_3
    //   201: ldc ''
    //   203: aload #5
    //   205: invokevirtual equals : (Ljava/lang/Object;)Z
    //   208: ifeq -> 224
    //   211: aload_0
    //   212: getfield b : Landroid/app/Activity;
    //   215: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   218: ldc 2131755830
    //   220: invokevirtual getString : (I)Ljava/lang/String;
    //   223: astore_3
    //   224: aload_0
    //   225: getfield f : Lcom/allinone/callerid/b/b$c;
    //   228: getfield a : Landroid/widget/TextView;
    //   231: aload_3
    //   232: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   235: aload_0
    //   236: getfield f : Lcom/allinone/callerid/b/b$c;
    //   239: getfield b : Landroid/widget/TextView;
    //   242: aload #4
    //   244: invokevirtual getNumber : ()Ljava/lang/String;
    //   247: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   250: aload_0
    //   251: getfield f : Lcom/allinone/callerid/b/b$c;
    //   254: getfield d : Landroid/widget/FrameLayout;
    //   257: new com/allinone/callerid/b/b$b
    //   260: dup
    //   261: aload_0
    //   262: iload_1
    //   263: invokespecial <init> : (Lcom/allinone/callerid/b/b;I)V
    //   266: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   269: aload_0
    //   270: getfield b : Landroid/app/Activity;
    //   273: getstatic android/provider/ContactsContract$Contacts.CONTENT_URI : Landroid/net/Uri;
    //   276: aload #4
    //   278: invokevirtual getId : ()I
    //   281: i2l
    //   282: invokestatic withAppendedId : (Landroid/net/Uri;J)Landroid/net/Uri;
    //   285: ldc ''
    //   287: ldc 2131231148
    //   289: aload_0
    //   290: getfield f : Lcom/allinone/callerid/b/b$c;
    //   293: getfield c : Landroid/widget/ImageView;
    //   296: invokestatic c : (Landroid/app/Activity;Landroid/net/Uri;Ljava/lang/String;ILandroid/widget/ImageView;)V
    //   299: goto -> 307
    //   302: astore_3
    //   303: aload_3
    //   304: invokevirtual printStackTrace : ()V
    //   307: aload_2
    //   308: areturn
    // Exception table:
    //   from	to	target	type
    //   269	299	302	java/lang/Exception
  }
  
  class a implements View.OnClickListener {
    a(b this$0) {}
    
    public void onClick(View param1View) {
      int i = ((Integer)param1View.getTag()).intValue();
      b.a(this.b).performItemClick((View)b.a(this.b), i, this.b.getItemId(i));
    }
  }
  
  class b implements View.OnClickListener {
    b(b this$0, int param1Int) {}
    
    public void onClick(View param1View) {
      AdapterView.OnItemClickListener onItemClickListener = b.a(this.c).getOnItemClickListener();
      ListView listView = b.a(this.c);
      int i = this.b;
      onItemClickListener.onItemClick((AdapterView)listView, param1View, i, this.c.getItemId(i));
    }
  }
  
  private static class c {
    TextView a;
    
    TextView b;
    
    ImageView c;
    
    FrameLayout d;
    
    private c() {}
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */