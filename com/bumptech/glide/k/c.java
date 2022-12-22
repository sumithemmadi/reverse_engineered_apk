package com.bumptech.glide.k;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

final class c {
  static final Charset a = Charset.forName("US-ASCII");
  
  static final Charset b = Charset.forName("UTF-8");
  
  static void a(Closeable paramCloseable) {
    if (paramCloseable != null)
      try {
        paramCloseable.close();
      } catch (RuntimeException runtimeException) {
        throw runtimeException;
      } catch (Exception exception) {} 
  }
  
  static void b(File paramFile) {
    File[] arrayOfFile = paramFile.listFiles();
    if (arrayOfFile != null) {
      int i = arrayOfFile.length;
      byte b = 0;
      while (b < i) {
        paramFile = arrayOfFile[b];
        if (paramFile.isDirectory())
          b(paramFile); 
        if (paramFile.delete()) {
          b++;
          continue;
        } 
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("failed to delete file: ");
        stringBuilder1.append(paramFile);
        throw new IOException(stringBuilder1.toString());
      } 
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("not a readable directory: ");
    stringBuilder.append(paramFile);
    IOException iOException = new IOException(stringBuilder.toString());
    throw iOException;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/k/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */