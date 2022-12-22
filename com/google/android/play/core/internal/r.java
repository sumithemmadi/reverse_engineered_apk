package com.google.android.play.core.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import com.google.android.play.core.splitcompat.d;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class r {
  private final d a;
  
  private final Context b;
  
  private final q c;
  
  private PackageInfo d;
  
  private final t e;
  
  public r(Context paramContext, d paramd, t paramt, byte[] paramArrayOfbyte) {
    this.a = paramd;
    this.e = paramt;
    this.b = paramContext;
    this.c = q1;
  }
  
  private final PackageInfo d() {
    if (this.d == null)
      try {
        this.d = this.b.getPackageManager().getPackageInfo(this.b.getPackageName(), 64);
      } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
        return null;
      }  
    return this.d;
  }
  
  private static X509Certificate e(Signature paramSignature) {
    try {
      CertificateFactory certificateFactory = CertificateFactory.getInstance("X509");
      ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream();
      this(paramSignature.toByteArray());
      return (X509Certificate)certificateFactory.generateCertificate(byteArrayInputStream);
    } catch (CertificateException certificateException) {
      Log.e("SplitCompat", "Cannot decode certificate.", certificateException);
      return null;
    } 
  }
  
  public final boolean a(File[] paramArrayOfFile) {
    X509Certificate x509Certificate;
    PackageInfo packageInfo = d();
    ArrayList<X509Certificate> arrayList1 = null;
    ArrayList<X509Certificate> arrayList2 = arrayList1;
    if (packageInfo != null)
      if (packageInfo.signatures == null) {
        arrayList2 = arrayList1;
      } else {
        arrayList1 = new ArrayList();
        Signature[] arrayOfSignature = packageInfo.signatures;
        int j = arrayOfSignature.length;
        byte b = 0;
        while (true) {
          arrayList2 = arrayList1;
          if (b < j) {
            x509Certificate = e(arrayOfSignature[b]);
            if (x509Certificate != null)
              arrayList1.add(x509Certificate); 
            b++;
            continue;
          } 
          break;
        } 
      }  
    if (x509Certificate == null || x509Certificate.isEmpty()) {
      Log.e("SplitCompat", "No app certificates found.");
      return false;
    } 
    int i = paramArrayOfFile.length;
    label56: while (true) {
      int j = i - 1;
      if (j >= 0) {
        File file = paramArrayOfFile[j];
        try {
          X509Certificate x509Certificate1;
          String str = file.getAbsolutePath();
          try {
            String str1;
            X509Certificate[][] arrayOfX509Certificate = v0.g(str);
            if (arrayOfX509Certificate == null || arrayOfX509Certificate.length == 0 || (arrayOfX509Certificate[0]).length == 0) {
              i = String.valueOf(str).length();
              StringBuilder stringBuilder = new StringBuilder();
              this(i + 32);
              stringBuilder.append("Downloaded split ");
              stringBuilder.append(str);
              stringBuilder.append(" is not signed.");
              str1 = stringBuilder.toString();
            } else if (x509Certificate.isEmpty()) {
              str1 = "No certificates found for app.";
            } else {
              Iterator<X509Certificate> iterator = x509Certificate.iterator();
              label54: while (true) {
                i = j;
                if (iterator.hasNext()) {
                  x509Certificate1 = iterator.next();
                  int k = arrayOfX509Certificate.length;
                  i = 0;
                  while (i < k) {
                    if (!arrayOfX509Certificate[i][0].equals(x509Certificate1)) {
                      i++;
                      continue;
                    } 
                    continue label54;
                  } 
                  Log.i("SplitCompat", "There's an app certificate that doesn't sign the split.");
                  Log.e("SplitCompat", "Split verification failure.");
                  return false;
                } 
                continue label56;
              } 
              break;
            } 
            Log.e("SplitCompat", str1);
            continue;
          } catch (Exception exception) {
            i = String.valueOf(x509Certificate1).length();
            StringBuilder stringBuilder = new StringBuilder();
            this(i + 32);
            stringBuilder.append("Downloaded split ");
            stringBuilder.append((String)x509Certificate1);
            stringBuilder.append(" is not signed.");
            Log.e("SplitCompat", stringBuilder.toString(), exception);
            continue;
          } 
        } catch (Exception exception) {
          Log.e("SplitCompat", "Split verification error.", exception);
          return false;
        } 
      } 
      return true;
    } 
  }
  
  public final boolean b(File[] paramArrayOfFile) {
    long l;
    PackageInfo packageInfo = d();
    if (Build.VERSION.SDK_INT >= 28) {
      l = packageInfo.getLongVersionCode();
    } else {
      l = packageInfo.versionCode;
    } 
    AssetManager assetManager = d0.<AssetManager>c(AssetManager.class);
    int i = paramArrayOfFile.length;
    while (--i >= 0) {
      this.c.a(assetManager, paramArrayOfFile[i]);
      if (l != this.c.b())
        return false; 
    } 
    return true;
  }
  
  public final boolean c(List<Intent> paramList) {
    Iterator<Intent> iterator = paramList.iterator();
    while (iterator.hasNext()) {
      String str = ((Intent)iterator.next()).getStringExtra("split_id");
      if (!this.a.c(str).exists())
        return false; 
    } 
    return true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/play/core/internal/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */