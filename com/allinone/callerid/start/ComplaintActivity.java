package com.allinone.callerid.start;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.allinone.callerid.main.BaseActivity;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i1;

public class ComplaintActivity extends BaseActivity {
  private final String s = "ComplaintActivity";
  
  private ProgressBar t;
  
  private WebView u;
  
  private String v = "function deletead(){\n \n$('header').hide();\n \n$('div.left-nav').hide();\n \n$('div.header').hide();\n\n$('footer').hide();\n};deletead()";
  
  @SuppressLint({"NewApi", "SetJavaScriptEnabled"})
  public void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    try {
      setContentView(2131492916);
      if (i1.f0(getApplicationContext()).booleanValue() && Build.VERSION.SDK_INT >= 17)
        getWindow().getDecorView().setLayoutDirection(1); 
      TextView textView = (TextView)findViewById(2131298188);
      ImageView imageView = (ImageView)findViewById(2131296850);
      if (i1.f0(getApplicationContext()).booleanValue())
        imageView.setImageResource(2131231059); 
      a a = new a();
      this(this);
      imageView.setOnClickListener(a);
      textView.setTypeface(g1.b());
      this.t = (ProgressBar)findViewById(2131297382);
      WebView webView2 = (WebView)findViewById(2131298286);
      this.u = webView2;
      WebSettings webSettings = webView2.getSettings();
      webSettings.setJavaScriptCanOpenWindowsAutomatically(true);
      webSettings.setJavaScriptEnabled(true);
      webSettings.setUseWideViewPort(true);
      webSettings.setLoadWithOverviewMode(true);
      webSettings.setCacheMode(2);
      WebView webView1 = this.u;
      b b = new b();
      this(this);
      webView1.setWebChromeClient(b);
      WebView webView3 = this.u;
      c c = new c();
      this(this);
      webView3.setWebViewClient(c);
      this.u.loadUrl("https://www.show-caller.com/complaint.html");
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  protected void onDestroy() {
    super.onDestroy();
    try {
      WebView webView = this.u;
      if (webView != null) {
        webView.removeAllViews();
        this.u.destroy();
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent) {
    if (paramInt == 4)
      try {
        WebView webView = this.u;
        if (webView != null && webView.canGoBack()) {
          this.u.goBack();
          return true;
        } 
        finish();
        overridePendingTransition(2130771968, 2130771969);
        return true;
      } catch (Exception exception) {
        exception.printStackTrace();
      }  
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onPause() {
    super.onPause();
  }
  
  protected void onResume() {
    super.onResume();
  }
  
  class a implements View.OnClickListener {
    a(ComplaintActivity this$0) {}
    
    public void onClick(View param1View) {
      this.b.finish();
      this.b.overridePendingTransition(2130771968, 2130771969);
    }
  }
  
  class b extends WebChromeClient {
    b(ComplaintActivity this$0) {}
    
    public void onProgressChanged(WebView param1WebView, int param1Int) {
      super.onProgressChanged(param1WebView, param1Int);
    }
  }
  
  class c extends WebViewClient {
    c(ComplaintActivity this$0) {}
    
    public void onPageFinished(WebView param1WebView, String param1String) {
      super.onPageFinished(param1WebView, param1String);
      param1WebView = ComplaintActivity.P(this.a);
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("javascript:");
      stringBuilder.append(ComplaintActivity.O(this.a));
      param1WebView.loadUrl(stringBuilder.toString());
      ComplaintActivity.Q(this.a).setVisibility(8);
      ComplaintActivity.P(this.a).setVisibility(0);
    }
    
    public void onPageStarted(WebView param1WebView, String param1String, Bitmap param1Bitmap) {
      super.onPageStarted(param1WebView, param1String, param1Bitmap);
      ComplaintActivity.P(this.a).setVisibility(4);
      ComplaintActivity.Q(this.a).setVisibility(0);
    }
    
    public boolean shouldOverrideUrlLoading(WebView param1WebView, String param1String) {
      param1WebView.loadUrl(param1String);
      return true;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/start/ComplaintActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */