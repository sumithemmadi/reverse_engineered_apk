package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.util.Log;
import b.e.e;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.base.d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

public final class ImageManager {
  private static final Object a = new Object();
  
  private static HashSet<Uri> b = new HashSet<Uri>();
  
  @KeepName
  private final class ImageReceiver extends ResultReceiver {
    private final Uri b;
    
    private final ArrayList<b> c;
    
    public final void onReceiveResult(int param1Int, Bundle param1Bundle) {
      ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor)param1Bundle.getParcelable("com.google.android.gms.extra.fileDescriptor");
      ImageManager.h(this.d).execute(new ImageManager.b(this.d, this.b, parcelFileDescriptor));
    }
  }
  
  private static final class a extends e<a, Bitmap> {}
  
  private final class b implements Runnable {
    private final Uri b;
    
    private final ParcelFileDescriptor c;
    
    public b(ImageManager this$0, Uri param1Uri, ParcelFileDescriptor param1ParcelFileDescriptor) {
      this.b = param1Uri;
      this.c = param1ParcelFileDescriptor;
    }
    
    public final void run() {
      com.google.android.gms.common.internal.c.b("LoadBitmapFromDiskRunnable can't be executed in the main thread");
      ParcelFileDescriptor parcelFileDescriptor = this.c;
      boolean bool = false;
      Bitmap bitmap = null;
      if (parcelFileDescriptor != null) {
        try {
          Bitmap bitmap1 = BitmapFactory.decodeFileDescriptor(parcelFileDescriptor.getFileDescriptor());
          bitmap = bitmap1;
        } catch (OutOfMemoryError outOfMemoryError) {
          String str = String.valueOf(this.b);
          StringBuilder stringBuilder = new StringBuilder(str.length() + 34);
          stringBuilder.append("OOM while loading bitmap for uri: ");
          stringBuilder.append(str);
          Log.e("ImageManager", stringBuilder.toString(), outOfMemoryError);
          bool = true;
        } 
        try {
          this.c.close();
        } catch (IOException iOException) {
          Log.e("ImageManager", "closed failed", iOException);
        } 
      } else {
        bitmap = null;
        bool = false;
      } 
      CountDownLatch countDownLatch = new CountDownLatch(1);
      ImageManager.i(this.d).post(new ImageManager.c(this.d, this.b, bitmap, bool, countDownLatch));
      try {
        countDownLatch.await();
        return;
      } catch (InterruptedException interruptedException) {
        String str = String.valueOf(this.b);
        StringBuilder stringBuilder = new StringBuilder(str.length() + 32);
        stringBuilder.append("Latch interrupted while posting ");
        stringBuilder.append(str);
        Log.w("ImageManager", stringBuilder.toString());
        return;
      } 
    }
  }
  
  private final class c implements Runnable {
    private final Uri b;
    
    private final Bitmap c;
    
    private final CountDownLatch d;
    
    private boolean e;
    
    public c(ImageManager this$0, Uri param1Uri, Bitmap param1Bitmap, boolean param1Boolean, CountDownLatch param1CountDownLatch) {
      this.b = param1Uri;
      this.c = param1Bitmap;
      this.e = param1Boolean;
      this.d = param1CountDownLatch;
    }
    
    public final void run() {
      boolean bool;
      com.google.android.gms.common.internal.c.a("OnBitmapLoadedRunnable must be executed in the main thread");
      if (this.c != null) {
        bool = true;
      } else {
        bool = false;
      } 
      if (ImageManager.j(this.f) != null)
        if (!this.e) {
          if (bool) {
            ImageManager.j(this.f);
            new a(this.b);
            throw null;
          } 
        } else {
          ImageManager.j(this.f);
          throw null;
        }  
      ImageManager.ImageReceiver imageReceiver = (ImageManager.ImageReceiver)ImageManager.g(this.f).remove(this.b);
      if (imageReceiver != null) {
        ArrayList<b> arrayList = ImageManager.ImageReceiver.a(imageReceiver);
        int i = arrayList.size();
        for (byte b = 0; b < i; b++) {
          b b1 = arrayList.get(b);
          if (bool) {
            b1.a(ImageManager.b(this.f), this.c, false);
          } else {
            ImageManager.f(this.f).put(this.b, Long.valueOf(SystemClock.elapsedRealtime()));
            b1.b(ImageManager.b(this.f), ImageManager.c(this.f), false);
          } 
          ImageManager.a(this.f).remove(b1);
        } 
      } 
      this.d.countDown();
      synchronized (ImageManager.d()) {
        ImageManager.e().remove(this.b);
        return;
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/images/ImageManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */