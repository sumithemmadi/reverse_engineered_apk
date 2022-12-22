package com.danikula.videocache.q;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import org.slf4j.c;

class d {
  private static final org.slf4j.b a = c.i("Files");
  
  static List<File> a(File paramFile) {
    LinkedList linkedList = new LinkedList();
    File[] arrayOfFile = paramFile.listFiles();
    List<File> list = linkedList;
    if (arrayOfFile != null) {
      list = Arrays.asList(arrayOfFile);
      Collections.sort(list, new b(null));
    } 
    return list;
  }
  
  static void b(File paramFile) {
    if (paramFile.exists()) {
      if (!paramFile.isDirectory()) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("File ");
        stringBuilder.append(paramFile);
        stringBuilder.append(" is not directory!");
        throw new IOException(stringBuilder.toString());
      } 
    } else if (!paramFile.mkdirs()) {
      throw new IOException(String.format("Directory %s can't be created", new Object[] { paramFile.getAbsolutePath() }));
    } 
  }
  
  static void c(File paramFile) {
    long l = paramFile.length();
    if (l == 0L) {
      d(paramFile);
      return;
    } 
    RandomAccessFile randomAccessFile = new RandomAccessFile(paramFile, "rwd");
    l--;
    randomAccessFile.seek(l);
    byte b1 = randomAccessFile.readByte();
    randomAccessFile.seek(l);
    randomAccessFile.write(b1);
    randomAccessFile.close();
  }
  
  private static void d(File paramFile) {
    if (paramFile.delete() && paramFile.createNewFile())
      return; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Error recreate zero-size file ");
    stringBuilder.append(paramFile);
    throw new IOException(stringBuilder.toString());
  }
  
  static void e(File paramFile) {
    if (paramFile.exists()) {
      long l = System.currentTimeMillis();
      if (!paramFile.setLastModified(l)) {
        c(paramFile);
        if (paramFile.lastModified() < l)
          a.warn("Last modified date {} is not set for file {}", new Date(paramFile.lastModified()), paramFile.getAbsolutePath()); 
      } 
    } 
  }
  
  private static final class b implements Comparator<File> {
    private b() {}
    
    private int b(long param1Long1, long param1Long2) {
      boolean bool;
      if (param1Long1 < param1Long2) {
        bool = true;
      } else if (param1Long1 == param1Long2) {
        bool = false;
      } else {
        bool = true;
      } 
      return bool;
    }
    
    public int a(File param1File1, File param1File2) {
      return b(param1File1.lastModified(), param1File2.lastModified());
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/danikula/videocache/q/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */