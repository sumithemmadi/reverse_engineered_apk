package com.danikula.videocache.q;

import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.slf4j.b;
import org.slf4j.c;

public abstract class e implements a {
  private static final b a = c.i("LruDiskUsage");
  
  private final ExecutorService b = Executors.newSingleThreadExecutor();
  
  private long d(List<File> paramList) {
    Iterator<File> iterator = paramList.iterator();
    long l;
    for (l = 0L; iterator.hasNext(); l += ((File)iterator.next()).length());
    return l;
  }
  
  private void e(File paramFile) {
    d.e(paramFile);
    f(d.a(paramFile.getParentFile()));
  }
  
  private void f(List<File> paramList) {
    long l = d(paramList);
    int i = paramList.size();
    for (File file : paramList) {
      if (!b(file, l, i)) {
        long l1 = file.length();
        if (file.delete()) {
          i--;
          l -= l1;
          b b2 = a;
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Cache file ");
          stringBuilder1.append(file);
          stringBuilder1.append(" is deleted because it exceeds cache limit");
          b2.info(stringBuilder1.toString());
          continue;
        } 
        b b1 = a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Error deleting file ");
        stringBuilder.append(file);
        stringBuilder.append(" for trimming cache");
        b1.error(stringBuilder.toString());
      } 
    } 
  }
  
  public void a(File paramFile) {
    this.b.submit(new a(this, paramFile));
  }
  
  protected abstract boolean b(File paramFile, long paramLong, int paramInt);
  
  private class a implements Callable<Void> {
    private final File a;
    
    public a(e this$0, File param1File) {
      this.a = param1File;
    }
    
    public Void a() {
      e.c(this.b, this.a);
      return null;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/danikula/videocache/q/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */