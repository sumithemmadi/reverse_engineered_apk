package com.google.android.play.core.splitcompat;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

final class h implements j {
  h(Set paramSet, r paramr, ZipFile paramZipFile) {}
  
  public final void a(k paramk, File paramFile, boolean paramBoolean) {
    this.a.add(paramFile);
    if (!paramBoolean) {
      Log.i("SplitCompat", String.format("NativeLibraryExtractor: split '%s' has native library '%s' that does not exist; extracting from '%s!%s' to '%s'", new Object[] { this.b.b(), paramk.a, this.b.a().getAbsolutePath(), paramk.b.getName(), paramFile.getAbsolutePath() }));
      ZipFile zipFile = this.c;
      ZipEntry zipEntry = paramk.b;
      int i = l.b;
      byte[] arrayOfByte = new byte[4096];
      InputStream inputStream = zipFile.getInputStream(zipEntry);
      try {
        FileOutputStream fileOutputStream = new FileOutputStream();
        this(paramFile);
      } finally {
        if (inputStream != null)
          try {
            inputStream.close();
          } finally {
            inputStream = null;
          }  
      } 
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/play/core/splitcompat/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */