package com.google.android.gms.internal.ads;

import android.app.DownloadManager;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.util.h1;

final class ie implements DialogInterface.OnClickListener {
  ie(je paramje, String paramString1, String paramString2) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt) {
    DownloadManager downloadManager = (DownloadManager)je.i(this.d).getSystemService("download");
    try {
      String str1 = this.b;
      String str2 = this.c;
      DownloadManager.Request request = new DownloadManager.Request();
      this(Uri.parse(str1));
      request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
      q.c();
      h1.j(request);
      downloadManager.enqueue(request);
      return;
    } catch (IllegalStateException illegalStateException) {
      this.d.e("Could not store picture.");
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ie.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */