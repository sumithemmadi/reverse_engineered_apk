package com.allinone.callerid.i.a.s;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import com.allinone.callerid.mvc.controller.MainActivity;
import com.allinone.callerid.util.b1;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.q;

public class d {
  private static void a(boolean paramBoolean, MainActivity paramMainActivity, String paramString) {
    AlertDialog.Builder builder = (new AlertDialog.Builder((Context)paramMainActivity)).setTitle(paramMainActivity.getResources().getString(2131755837)).setMessage(paramMainActivity.getResources().getString(2131755464)).setPositiveButton(paramMainActivity.getResources().getString(2131755836), null);
    if (paramBoolean)
      builder.setNegativeButton(paramMainActivity.getResources().getString(2131755180), new c()); 
    AlertDialog alertDialog = builder.create();
    if (!paramBoolean) {
      alertDialog.setCanceledOnTouchOutside(false);
      alertDialog.setOnKeyListener(new d(paramMainActivity));
    } 
    alertDialog.show();
    alertDialog.getButton(-1).setOnClickListener(new e(paramBoolean, alertDialog, paramString, paramMainActivity));
    alertDialog.getButton(-1).setTextColor(paramMainActivity.getResources().getColor(2131099706));
    alertDialog.getButton(-2).setTextColor(paramMainActivity.getResources().getColor(2131099695));
    q.b().c("forced_update_dialog_show");
  }
  
  public static void b(MainActivity paramMainActivity, String paramString) {
    AlertDialog alertDialog = (new AlertDialog.Builder((Context)paramMainActivity)).setTitle(paramMainActivity.getResources().getString(2131755837)).setMessage(paramMainActivity.getResources().getString(2131755835)).setPositiveButton(paramMainActivity.getResources().getString(2131755836), new b(paramMainActivity, paramString)).setNegativeButton(paramMainActivity.getResources().getString(2131755834), new a()).create();
    alertDialog.show();
    alertDialog.getButton(-1).setTextColor(paramMainActivity.getResources().getColor(2131099706));
    alertDialog.getButton(-2).setTextColor(paramMainActivity.getResources().getColor(2131099695));
  }
  
  public static void c(com.allinone.callerid.model.a parama, MainActivity paramMainActivity) {
    if (parama != null) {
      String str1 = parama.b();
      String str2 = parama.a();
      if (!str1.equals("")) {
        if (d0.a) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("minVersion:");
          stringBuilder.append(str2);
          d0.a("tony", stringBuilder.toString());
        } 
        if (i1.S(str2)) {
          if (b1.c0() == 0L)
            b1.I1(System.currentTimeMillis()); 
          if (System.currentTimeMillis() - b1.c0() < 604800000L) {
            try {
              a(true, paramMainActivity, str1);
            } catch (Exception exception) {
              exception.printStackTrace();
            } 
          } else {
            b1.h2(true);
            try {
              a(false, paramMainActivity, str1);
            } catch (Exception exception) {
              exception.printStackTrace();
            } 
          } 
        } else {
          b1.h2(false);
          long l1 = b1.i();
          long l2 = System.currentTimeMillis();
          if (l1 == 0L) {
            try {
              b(paramMainActivity, str1);
            } catch (Exception exception) {
              exception.printStackTrace();
            } 
            b1.M0(l2);
          } else if (l2 - l1 > 43200000L) {
            try {
              b(paramMainActivity, str1);
            } catch (Exception exception) {
              exception.printStackTrace();
            } 
            b1.M0(l2);
          } 
        } 
      } else {
        b1.h2(false);
      } 
    } 
  }
  
  static final class a implements DialogInterface.OnClickListener {
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {}
  }
  
  static final class b implements DialogInterface.OnClickListener {
    b(MainActivity param1MainActivity, String param1String) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {
      if (this.b.getResources().getString(2131755093).equals("GooglePlay")) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.c));
        this.b.startActivity(intent);
      } else {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.show-caller.com/download/com.allinone.callerid.apk"));
        this.b.startActivity(intent);
      } 
    }
  }
  
  static final class c implements DialogInterface.OnClickListener {
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {}
  }
  
  static final class d implements DialogInterface.OnKeyListener {
    d(MainActivity param1MainActivity) {}
    
    public boolean onKey(DialogInterface param1DialogInterface, int param1Int, KeyEvent param1KeyEvent) {
      if (param1Int == 4 && param1KeyEvent.getRepeatCount() == 0) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setFlags(268435456);
        intent.addCategory("android.intent.category.HOME");
        this.b.startActivity(intent);
        return true;
      } 
      return false;
    }
  }
  
  static final class e implements View.OnClickListener {
    e(boolean param1Boolean, AlertDialog param1AlertDialog, String param1String, MainActivity param1MainActivity) {}
    
    public void onClick(View param1View) {
      if (this.b)
        this.c.dismiss(); 
      q.b().c("forced_update_dialog_click");
      Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.d));
      this.e.startActivity(intent);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/i/a/s/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */