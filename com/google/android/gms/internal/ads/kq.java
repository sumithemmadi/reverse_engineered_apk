package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.a;
import com.google.android.gms.ads.internal.overlay.f;

@TargetApi(11)
public final class kq extends WebChromeClient {
  private final tq a;
  
  public kq(tq paramtq) {
    this.a = paramtq;
  }
  
  private static Context a(WebView paramWebView) {
    if (!(paramWebView instanceof tq))
      return paramWebView.getContext(); 
    tq tq1 = (tq)paramWebView;
    Activity activity = tq1.a();
    return (Context)((activity != null) ? activity : tq1.getContext());
  }
  
  private final boolean b(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4, JsResult paramJsResult, JsPromptResult paramJsPromptResult, boolean paramBoolean) {
    try {
      StringBuilder stringBuilder;
      oq oq;
      TextView textView;
      tq tq1 = this.a;
      if (tq1 != null && tq1.N() != null && this.a.N().t0() != null) {
        a a = this.a.N().t0();
        if (a != null && !a.d()) {
          int i = String.valueOf(paramString1).length();
          int j = String.valueOf(paramString3).length();
          stringBuilder = new StringBuilder();
          this(i + 11 + j);
          stringBuilder.append("window.");
          stringBuilder.append(paramString1);
          stringBuilder.append("('");
          stringBuilder.append(paramString3);
          stringBuilder.append("')");
          a.b(stringBuilder.toString());
          return false;
        } 
      } 
      AlertDialog.Builder builder = new AlertDialog.Builder();
      this((Context)stringBuilder);
      builder.setTitle(paramString2);
      if (paramBoolean) {
        LinearLayout linearLayout = new LinearLayout();
        this((Context)stringBuilder);
        linearLayout.setOrientation(1);
        textView = new TextView();
        this((Context)stringBuilder);
        textView.setText(paramString3);
        EditText editText = new EditText();
        this((Context)stringBuilder);
        editText.setText(paramString4);
        linearLayout.addView((View)textView);
        linearLayout.addView((View)editText);
        AlertDialog.Builder builder1 = builder.setView((View)linearLayout);
        qq qq = new qq();
        this(paramJsPromptResult, editText);
        builder1 = builder1.setPositiveButton(17039370, qq);
        sq sq = new sq();
        this(paramJsPromptResult);
        builder1 = builder1.setNegativeButton(17039360, sq);
        oq = new oq();
        this(paramJsPromptResult);
        builder1.setOnCancelListener(oq).create().show();
      } else {
        AlertDialog.Builder builder1 = oq.setMessage(paramString3);
        pq pq = new pq();
        this((JsResult)textView);
        builder1 = builder1.setPositiveButton(17039370, pq);
        mq mq = new mq();
        this((JsResult)textView);
        builder1 = builder1.setNegativeButton(17039360, mq);
        nq nq = new nq();
        this((JsResult)textView);
        builder1.setOnCancelListener(nq).create().show();
      } 
    } catch (android.view.WindowManager.BadTokenException badTokenException) {
      cm.d("Fail to display Dialog.", (Throwable)badTokenException);
    } 
    return true;
  }
  
  public final void onCloseWindow(WebView paramWebView) {
    if (!(paramWebView instanceof tq)) {
      cm.i("Tried to close a WebView that wasn't an AdWebView.");
      return;
    } 
    f f = ((tq)paramWebView).z0();
    if (f == null) {
      cm.i("Tried to close an AdWebView not associated with an overlay.");
      return;
    } 
    f.T9();
  }
  
  public final boolean onConsoleMessage(ConsoleMessage paramConsoleMessage) {
    String str1 = paramConsoleMessage.message();
    String str2 = paramConsoleMessage.sourceId();
    int i = paramConsoleMessage.lineNumber();
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str1).length() + 19 + String.valueOf(str2).length());
    stringBuilder.append("JS: ");
    stringBuilder.append(str1);
    stringBuilder.append(" (");
    stringBuilder.append(str2);
    stringBuilder.append(":");
    stringBuilder.append(i);
    stringBuilder.append(")");
    str1 = stringBuilder.toString();
    if (str1.contains("Application Cache"))
      return super.onConsoleMessage(paramConsoleMessage); 
    i = uq.a[paramConsoleMessage.messageLevel().ordinal()];
    if (i != 1) {
      if (i != 2) {
        if (i != 3 && i != 4) {
          if (i != 5) {
            cm.h(str1);
          } else {
            cm.e(str1);
          } 
        } else {
          cm.h(str1);
        } 
      } else {
        cm.i(str1);
      } 
    } else {
      cm.g(str1);
    } 
    return super.onConsoleMessage(paramConsoleMessage);
  }
  
  public final boolean onCreateWindow(WebView paramWebView, boolean paramBoolean1, boolean paramBoolean2, Message paramMessage) {
    WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport)paramMessage.obj;
    paramWebView = new WebView(paramWebView.getContext());
    if (this.a.Z() != null)
      paramWebView.setWebViewClient(this.a.Z()); 
    webViewTransport.setWebView(paramWebView);
    paramMessage.sendToTarget();
    return true;
  }
  
  public final void onExceededDatabaseQuota(String paramString1, String paramString2, long paramLong1, long paramLong2, long paramLong3, WebStorage.QuotaUpdater paramQuotaUpdater) {
    long l = 5242880L - paramLong3;
    if (l <= 0L) {
      paramQuotaUpdater.updateQuota(paramLong1);
      return;
    } 
    if (paramLong1 == 0L) {
      if (paramLong2 > l || paramLong2 > 1048576L)
        paramLong2 = 0L; 
    } else {
      if (paramLong2 == 0L) {
        paramLong3 = Math.min(paramLong1 + Math.min(131072L, l), 1048576L);
      } else {
        paramLong3 = paramLong1;
        if (paramLong2 <= Math.min(1048576L - paramLong1, l))
          paramLong3 = paramLong1 + paramLong2; 
      } 
      paramLong2 = paramLong3;
    } 
    paramQuotaUpdater.updateQuota(paramLong2);
  }
  
  public final void onGeolocationPermissionsShowPrompt(String paramString, GeolocationPermissions.Callback paramCallback) {
    // Byte code:
    //   0: aload_2
    //   1: ifnull -> 67
    //   4: invokestatic c : ()Lcom/google/android/gms/ads/internal/util/h1;
    //   7: pop
    //   8: aload_0
    //   9: getfield a : Lcom/google/android/gms/internal/ads/tq;
    //   12: invokeinterface getContext : ()Landroid/content/Context;
    //   17: ldc_w 'android.permission.ACCESS_FINE_LOCATION'
    //   20: invokestatic q0 : (Landroid/content/Context;Ljava/lang/String;)Z
    //   23: ifne -> 56
    //   26: invokestatic c : ()Lcom/google/android/gms/ads/internal/util/h1;
    //   29: pop
    //   30: aload_0
    //   31: getfield a : Lcom/google/android/gms/internal/ads/tq;
    //   34: invokeinterface getContext : ()Landroid/content/Context;
    //   39: ldc_w 'android.permission.ACCESS_COARSE_LOCATION'
    //   42: invokestatic q0 : (Landroid/content/Context;Ljava/lang/String;)Z
    //   45: ifeq -> 51
    //   48: goto -> 56
    //   51: iconst_0
    //   52: istore_3
    //   53: goto -> 58
    //   56: iconst_1
    //   57: istore_3
    //   58: aload_2
    //   59: aload_1
    //   60: iload_3
    //   61: iconst_1
    //   62: invokeinterface invoke : (Ljava/lang/String;ZZ)V
    //   67: return
  }
  
  public final void onHideCustomView() {
    f f = this.a.z0();
    if (f == null) {
      cm.i("Could not get ad overlay when hiding custom view.");
      return;
    } 
    f.ba();
  }
  
  public final boolean onJsAlert(WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult) {
    return b(a(paramWebView), "alert", paramString1, paramString2, null, paramJsResult, null, false);
  }
  
  public final boolean onJsBeforeUnload(WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult) {
    return b(a(paramWebView), "onBeforeUnload", paramString1, paramString2, null, paramJsResult, null, false);
  }
  
  public final boolean onJsConfirm(WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult) {
    return b(a(paramWebView), "confirm", paramString1, paramString2, null, paramJsResult, null, false);
  }
  
  public final boolean onJsPrompt(WebView paramWebView, String paramString1, String paramString2, String paramString3, JsPromptResult paramJsPromptResult) {
    return b(a(paramWebView), "prompt", paramString1, paramString2, paramString3, null, paramJsPromptResult, true);
  }
  
  public final void onReachedMaxAppCacheSize(long paramLong1, long paramLong2, WebStorage.QuotaUpdater paramQuotaUpdater) {
    paramLong1 += 131072L;
    if (5242880L - paramLong2 < paramLong1) {
      paramQuotaUpdater.updateQuota(0L);
      return;
    } 
    paramQuotaUpdater.updateQuota(paramLong1);
  }
  
  @Deprecated
  public final void onShowCustomView(View paramView, int paramInt, WebChromeClient.CustomViewCallback paramCustomViewCallback) {
    f f = this.a.z0();
    if (f == null) {
      cm.i("Could not get ad overlay when showing custom view.");
      paramCustomViewCallback.onCustomViewHidden();
      return;
    } 
    f.W9(paramView, paramCustomViewCallback);
    f.U9(paramInt);
  }
  
  public final void onShowCustomView(View paramView, WebChromeClient.CustomViewCallback paramCustomViewCallback) {
    onShowCustomView(paramView, -1, paramCustomViewCallback);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/kq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */