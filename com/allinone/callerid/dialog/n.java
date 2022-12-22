package com.allinone.callerid.dialog;

import android.app.Dialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.core.content.FileProvider;
import com.allinone.callerid.b.u;
import com.allinone.callerid.bean.ShareAppInfo;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.q;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class n extends Dialog {
  private Context b;
  
  private GridView c;
  
  private List<ShareAppInfo> d;
  
  private String e;
  
  private String f;
  
  private String g;
  
  private int h;
  
  private String i;
  
  public n(Context paramContext, int paramInt1, String paramString1, String paramString2, String paramString3, int paramInt2, String paramString4) {
    super(paramContext, paramInt1);
    this.b = paramContext;
    this.e = paramString1;
    this.f = paramString2;
    this.g = paramString3;
    this.h = paramInt2;
    this.i = paramString4;
  }
  
  private void g() {
    try {
      ArrayList<ShareAppInfo> arrayList = new ArrayList();
      this();
      this.d = arrayList;
      PackageManager packageManager = this.b.getPackageManager();
      List<ResolveInfo> list = h(this.b);
      if (list != null)
        for (ResolveInfo resolveInfo : list) {
          ShareAppInfo shareAppInfo = new ShareAppInfo();
          this();
          if (!resolveInfo.activityInfo.packageName.equals("com.allinone.callerid")) {
            shareAppInfo.setAppPkgName(resolveInfo.activityInfo.packageName);
            shareAppInfo.setAppLauncherClassName(resolveInfo.activityInfo.name);
            shareAppInfo.setAppName(resolveInfo.loadLabel(packageManager).toString());
            shareAppInfo.setAppIcon(resolveInfo.loadIcon(packageManager));
            if (d0.a) {
              StringBuilder stringBuilder = new StringBuilder();
              this();
              stringBuilder.append("packageName:");
              stringBuilder.append(resolveInfo.activityInfo.packageName);
              d0.a("tony", stringBuilder.toString());
            } 
            String str = resolveInfo.activityInfo.packageName;
            byte b = -1;
            switch (str.hashCode()) {
              case 908140028:
                if (str.equals("com.facebook.orca"))
                  b = 3; 
                break;
              case 714499313:
                if (str.equals("com.facebook.katana"))
                  b = 0; 
                break;
              case 10619783:
                if (str.equals("com.twitter.android"))
                  b = 1; 
                break;
              case -695601689:
                if (str.equals("com.android.mms"))
                  b = 5; 
                break;
              case -1430093937:
                if (str.equals("com.google.android.apps.messaging"))
                  b = 4; 
                break;
              case -1547699361:
                if (str.equals("com.whatsapp"))
                  b = 2; 
                break;
            } 
            if (b != 0) {
              if (b != 1) {
                if (b != 2) {
                  if (b != 3) {
                    if (b != 4) {
                      if (b != 5) {
                        this.d.add(shareAppInfo);
                        continue;
                      } 
                      this.d.add(0, shareAppInfo);
                      continue;
                    } 
                    this.d.add(0, shareAppInfo);
                    continue;
                  } 
                  this.d.add(0, shareAppInfo);
                  continue;
                } 
                this.d.add(0, shareAppInfo);
                continue;
              } 
              this.d.add(0, shareAppInfo);
              continue;
            } 
            this.d.add(0, shareAppInfo);
          } 
        }  
      u u = new u();
      this(this.b, this.d);
      this.c.setAdapter((ListAdapter)u);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private List<ResolveInfo> h(Context paramContext) {
    new ArrayList();
    Intent intent = new Intent("android.intent.action.SEND", null);
    intent.addCategory("android.intent.category.DEFAULT");
    int i = this.h;
    if (i != 0) {
      if (i != 1) {
        if (i == 2)
          intent.setType("audio/*"); 
      } else {
        intent.setType("image/*");
      } 
    } else {
      intent.setType("text/plain");
    } 
    return paramContext.getPackageManager().queryIntentActivities(intent, 0);
  }
  
  protected void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(2131493170);
    this.c = (GridView)findViewById(2131297234);
    TextView textView = (TextView)findViewById(2131298126);
    textView.setText(this.e);
    textView.setTypeface(g1.b());
    this.c.setOnItemClickListener(new a(this));
    g();
  }
  
  class a implements AdapterView.OnItemClickListener {
    a(n this$0) {}
    
    public void onItemClick(AdapterView<?> param1AdapterView, View param1View, int param1Int, long param1Long) {
      try {
        boolean bool;
        q.b().c("custom_share_total_click");
        String str = ((ShareAppInfo)n.a(this.b).get(param1Int)).getAppPkgName();
        byte b = -1;
        switch (str.hashCode()) {
          case 908140028:
            if (str.equals("com.facebook.orca"))
              b = 3; 
            break;
          case 714499313:
            if (str.equals("com.facebook.katana"))
              b = 0; 
            break;
          case 10619783:
            if (str.equals("com.twitter.android"))
              b = 1; 
            break;
          case -695601689:
            if (str.equals("com.android.mms"))
              b = 5; 
            break;
          case -1430093937:
            if (str.equals("com.google.android.apps.messaging"))
              b = 4; 
            break;
          case -1547699361:
            bool = str.equals("com.whatsapp");
            if (bool)
              b = 2; 
            break;
        } 
        if (b != 0) {
          if (b != 1) {
            if (b != 2) {
              if (b != 3) {
                if (b != 4) {
                  if (b == 5)
                    q.b().c("sms_share_click"); 
                } else {
                  q.b().c("sms_share_click");
                } 
              } else {
                q.b().c("facebook_messenger_share_click");
              } 
            } else {
              q.b().c("whatsapp_share_click");
            } 
          } else {
            q.b().c("twitter_share_click");
          } 
        } else {
          q.b().c("facebook_share_click");
        } 
        Intent intent = new Intent();
        this("android.intent.action.SEND");
        ComponentName componentName = new ComponentName();
        this(((ShareAppInfo)n.a(this.b).get(param1Int)).getAppPkgName(), ((ShareAppInfo)n.a(this.b).get(param1Int)).getAppLauncherClassName());
        intent.setComponent(componentName);
        param1Int = n.b(this.b);
        if (param1Int != 0) {
          if (param1Int != 1) {
            if (param1Int == 2) {
              intent.setType("audio/*");
              if (Build.VERSION.SDK_INT >= 24) {
                Context context = this.b.getContext();
                String str1 = i1.M(n.c(this.b));
                File file = new File();
                this(n.d(this.b));
                intent.putExtra("android.intent.extra.STREAM", (Parcelable)FileProvider.e(context, str1, file));
              } else {
                File file = new File();
                this(n.d(this.b));
                intent.putExtra("android.intent.extra.STREAM", (Parcelable)Uri.fromFile(file));
              } 
            } 
          } else {
            intent.setType("image/*");
            if (Build.VERSION.SDK_INT >= 24) {
              Context context = this.b.getContext();
              String str1 = i1.M(n.c(this.b));
              File file = new File();
              this(n.d(this.b));
              intent.putExtra("android.intent.extra.STREAM", (Parcelable)FileProvider.e(context, str1, file));
            } else {
              File file = new File();
              this(n.d(this.b));
              intent.putExtra("android.intent.extra.STREAM", (Parcelable)Uri.fromFile(file));
            } 
          } 
        } else {
          intent.setType("text/plain");
        } 
        intent.putExtra("android.intent.extra.SUBJECT", n.e(this.b));
        intent.putExtra("android.intent.extra.TEXT", n.f(this.b));
        intent.setFlags(268435456);
        n.c(this.b).startActivity(intent);
        this.b.dismiss();
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/dialog/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */