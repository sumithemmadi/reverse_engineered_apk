package androidx.multidex;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

final class MultiDexExtractor implements Closeable {
  private final File b;
  
  private final long c;
  
  private final File d;
  
  private final RandomAccessFile e;
  
  private final FileChannel f;
  
  private final FileLock g;
  
  MultiDexExtractor(File paramFile1, File paramFile2) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("MultiDexExtractor(");
    stringBuilder.append(paramFile1.getPath());
    stringBuilder.append(", ");
    stringBuilder.append(paramFile2.getPath());
    stringBuilder.append(")");
    Log.i("MultiDex", stringBuilder.toString());
    this.b = paramFile1;
    this.d = paramFile2;
    this.c = h(paramFile1);
    paramFile1 = new File(paramFile2, "MultiDex.lock");
    RandomAccessFile randomAccessFile = new RandomAccessFile(paramFile1, "rw");
    this.e = randomAccessFile;
    try {
      FileChannel fileChannel = randomAccessFile.getChannel();
      this.f = fileChannel;
      try {
        StringBuilder stringBuilder1 = new StringBuilder();
        this();
        stringBuilder1.append("Blocking on lock ");
        stringBuilder1.append(paramFile1.getPath());
        Log.i("MultiDex", stringBuilder1.toString());
        this.g = fileChannel.lock();
        stringBuilder1 = new StringBuilder();
        this();
        stringBuilder1.append(paramFile1.getPath());
        stringBuilder1.append(" locked");
        Log.i("MultiDex", stringBuilder1.toString());
        return;
      } catch (IOException iOException) {
      
      } catch (RuntimeException runtimeException) {
      
      } catch (Error null) {}
      c(this.f);
      throw error;
    } catch (IOException iOException) {
    
    } catch (RuntimeException runtimeException) {
    
    } catch (Error error) {}
    c(this.e);
    throw error;
  }
  
  private void b() {
    File[] arrayOfFile = this.d.listFiles(new a(this));
    if (arrayOfFile == null) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Failed to list secondary dex dir content (");
      stringBuilder.append(this.d.getPath());
      stringBuilder.append(").");
      Log.w("MultiDex", stringBuilder.toString());
      return;
    } 
    int i = arrayOfFile.length;
    for (byte b = 0; b < i; b++) {
      File file = arrayOfFile[b];
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Trying to delete old file ");
      stringBuilder.append(file.getPath());
      stringBuilder.append(" of size ");
      stringBuilder.append(file.length());
      Log.i("MultiDex", stringBuilder.toString());
      if (!file.delete()) {
        stringBuilder = new StringBuilder();
        stringBuilder.append("Failed to delete old file ");
        stringBuilder.append(file.getPath());
        Log.w("MultiDex", stringBuilder.toString());
      } else {
        stringBuilder = new StringBuilder();
        stringBuilder.append("Deleted old file ");
        stringBuilder.append(file.getPath());
        Log.i("MultiDex", stringBuilder.toString());
      } 
    } 
  }
  
  private static void c(Closeable paramCloseable) {
    try {
      paramCloseable.close();
    } catch (IOException iOException) {
      Log.w("MultiDex", "Failed to close resource", iOException);
    } 
  }
  
  private static void d(ZipFile paramZipFile, ZipEntry paramZipEntry, File paramFile, String paramString) {
    InputStream inputStream = paramZipFile.getInputStream(paramZipEntry);
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("tmp-");
    stringBuilder.append(paramString);
    File file = File.createTempFile(stringBuilder.toString(), ".zip", paramFile.getParentFile());
    stringBuilder = new StringBuilder();
    stringBuilder.append("Extracting ");
    stringBuilder.append(file.getPath());
    Log.i("MultiDex", stringBuilder.toString());
    try {
      StringBuilder stringBuilder1;
      ZipOutputStream zipOutputStream = new ZipOutputStream();
      BufferedOutputStream bufferedOutputStream = new BufferedOutputStream();
      FileOutputStream fileOutputStream = new FileOutputStream();
      this(file);
      this(fileOutputStream);
    } finally {
      c(inputStream);
      file.delete();
    } 
  }
  
  private static SharedPreferences e(Context paramContext) {
    byte b;
    if (Build.VERSION.SDK_INT < 11) {
      b = 0;
    } else {
      b = 4;
    } 
    return paramContext.getSharedPreferences("multidex.version", b);
  }
  
  private static long g(File paramFile) {
    long l1 = paramFile.lastModified();
    long l2 = l1;
    if (l1 == -1L)
      l2 = l1 - 1L; 
    return l2;
  }
  
  private static long h(File paramFile) {
    long l1 = b.c(paramFile);
    long l2 = l1;
    if (l1 == -1L)
      l2 = l1 - 1L; 
    return l2;
  }
  
  private static boolean j(Context paramContext, File paramFile, long paramLong, String paramString) {
    SharedPreferences sharedPreferences = e(paramContext);
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramString);
    stringBuilder.append("timestamp");
    if (sharedPreferences.getLong(stringBuilder.toString(), -1L) == g(paramFile)) {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(paramString);
      stringBuilder1.append("crc");
      return (sharedPreferences.getLong(stringBuilder1.toString(), -1L) != paramLong);
    } 
    return true;
  }
  
  private List<ExtractedDex> o(Context paramContext, String paramString) {
    Log.i("MultiDex", "loading existing secondary dex files");
    StringBuilder stringBuilder2 = new StringBuilder();
    stringBuilder2.append(this.b.getName());
    stringBuilder2.append(".classes");
    String str2 = stringBuilder2.toString();
    SharedPreferences sharedPreferences = e(paramContext);
    StringBuilder stringBuilder1 = new StringBuilder();
    stringBuilder1.append(paramString);
    stringBuilder1.append("dex.number");
    int i = sharedPreferences.getInt(stringBuilder1.toString(), 1);
    ArrayList<ExtractedDex> arrayList = new ArrayList(i - 1);
    byte b = 2;
    String str1 = str2;
    while (b <= i) {
      StringBuilder stringBuilder4 = new StringBuilder();
      stringBuilder4.append(str1);
      stringBuilder4.append(b);
      stringBuilder4.append(".zip");
      String str = stringBuilder4.toString();
      ExtractedDex extractedDex = new ExtractedDex(this.d, str);
      if (extractedDex.isFile()) {
        extractedDex.crc = h(extractedDex);
        StringBuilder stringBuilder6 = new StringBuilder();
        stringBuilder6.append(paramString);
        stringBuilder6.append("dex.crc.");
        stringBuilder6.append(b);
        long l1 = sharedPreferences.getLong(stringBuilder6.toString(), -1L);
        stringBuilder6 = new StringBuilder();
        stringBuilder6.append(paramString);
        stringBuilder6.append("dex.time.");
        stringBuilder6.append(b);
        long l2 = sharedPreferences.getLong(stringBuilder6.toString(), -1L);
        long l3 = extractedDex.lastModified();
        if (l2 == l3 && l1 == extractedDex.crc) {
          arrayList.add(extractedDex);
          b++;
          continue;
        } 
        StringBuilder stringBuilder5 = new StringBuilder();
        stringBuilder5.append("Invalid extracted dex: ");
        stringBuilder5.append(extractedDex);
        stringBuilder5.append(" (key \"");
        stringBuilder5.append(paramString);
        stringBuilder5.append("\"), expected modification time: ");
        stringBuilder5.append(l2);
        stringBuilder5.append(", modification time: ");
        stringBuilder5.append(l3);
        stringBuilder5.append(", expected crc: ");
        stringBuilder5.append(l1);
        stringBuilder5.append(", file crc: ");
        stringBuilder5.append(extractedDex.crc);
        throw new IOException(stringBuilder5.toString());
      } 
      StringBuilder stringBuilder3 = new StringBuilder();
      stringBuilder3.append("Missing extracted secondary dex file '");
      stringBuilder3.append(extractedDex.getPath());
      stringBuilder3.append("'");
      throw new IOException(stringBuilder3.toString());
    } 
    return arrayList;
  }
  
  private List<ExtractedDex> p() {
    null = new StringBuilder();
    null.append(this.b.getName());
    null.append(".classes");
    String str = null.toString();
    b();
    ArrayList<ExtractedDex> arrayList = new ArrayList();
    ZipFile zipFile = new ZipFile(this.b);
    try {
      null = new StringBuilder();
      this();
      null.append("classes");
      null.append(2);
      null.append(".dex");
      ZipEntry zipEntry = zipFile.getEntry(null.toString());
      byte b = 2;
      while (zipEntry != null) {
        StringBuilder stringBuilder3 = new StringBuilder();
        this();
        stringBuilder3.append(str);
        stringBuilder3.append(b);
        stringBuilder3.append(".zip");
        String str1 = stringBuilder3.toString();
        ExtractedDex extractedDex = new ExtractedDex();
        this(this.d, str1);
        arrayList.add(extractedDex);
        StringBuilder stringBuilder2 = new StringBuilder();
        this();
        stringBuilder2.append("Extraction is needed for file ");
        stringBuilder2.append(extractedDex);
        Log.i("MultiDex", stringBuilder2.toString());
        byte b1 = 0;
        boolean bool = false;
        while (b1 < 3 && !bool) {
          String str2;
          d(zipFile, zipEntry, extractedDex, str);
          try {
            extractedDex.crc = h(extractedDex);
            bool = true;
          } catch (IOException iOException1) {
            StringBuilder stringBuilder4 = new StringBuilder();
            this();
            stringBuilder4.append("Failed to read crc from ");
            stringBuilder4.append(extractedDex.getAbsolutePath());
            Log.w("MultiDex", stringBuilder4.toString(), iOException1);
            bool = false;
          } 
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("Extraction ");
          if (bool) {
            str2 = "succeeded";
          } else {
            str2 = "failed";
          } 
          stringBuilder.append(str2);
          stringBuilder.append(" '");
          stringBuilder.append(extractedDex.getAbsolutePath());
          stringBuilder.append("': length ");
          stringBuilder.append(extractedDex.length());
          stringBuilder.append(" - crc: ");
          stringBuilder.append(extractedDex.crc);
          Log.i("MultiDex", stringBuilder.toString());
          if (!bool) {
            extractedDex.delete();
            if (extractedDex.exists()) {
              StringBuilder stringBuilder4 = new StringBuilder();
              this();
              stringBuilder4.append("Failed to delete corrupted secondary dex '");
              stringBuilder4.append(extractedDex.getPath());
              stringBuilder4.append("'");
              Log.w("MultiDex", stringBuilder4.toString());
            } 
          } 
          b1++;
        } 
        if (bool) {
          b++;
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("classes");
          stringBuilder.append(b);
          stringBuilder.append(".dex");
          ZipEntry zipEntry1 = zipFile.getEntry(stringBuilder.toString());
          continue;
        } 
        IOException iOException = new IOException();
        StringBuilder stringBuilder1 = new StringBuilder();
        this();
        stringBuilder1.append("Could not create zip file ");
        stringBuilder1.append(extractedDex.getAbsolutePath());
        stringBuilder1.append(" for secondary dex (");
        stringBuilder1.append(b);
        stringBuilder1.append(")");
        this(stringBuilder1.toString());
        throw iOException;
      } 
      return arrayList;
    } finally {
      try {
        zipFile.close();
      } catch (IOException iOException) {
        Log.w("MultiDex", "Failed to close resource", iOException);
      } 
    } 
  }
  
  private static void q(Context paramContext, String paramString, long paramLong1, long paramLong2, List<ExtractedDex> paramList) {
    SharedPreferences.Editor editor = e(paramContext).edit();
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramString);
    stringBuilder.append("timestamp");
    editor.putLong(stringBuilder.toString(), paramLong1);
    stringBuilder = new StringBuilder();
    stringBuilder.append(paramString);
    stringBuilder.append("crc");
    editor.putLong(stringBuilder.toString(), paramLong2);
    stringBuilder = new StringBuilder();
    stringBuilder.append(paramString);
    stringBuilder.append("dex.number");
    editor.putInt(stringBuilder.toString(), paramList.size() + 1);
    Iterator<ExtractedDex> iterator = paramList.iterator();
    for (byte b = 2; iterator.hasNext(); b++) {
      ExtractedDex extractedDex = iterator.next();
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(paramString);
      stringBuilder1.append("dex.crc.");
      stringBuilder1.append(b);
      editor.putLong(stringBuilder1.toString(), extractedDex.crc);
      stringBuilder1 = new StringBuilder();
      stringBuilder1.append(paramString);
      stringBuilder1.append("dex.time.");
      stringBuilder1.append(b);
      editor.putLong(stringBuilder1.toString(), extractedDex.lastModified());
    } 
    editor.commit();
  }
  
  public void close() {
    this.g.release();
    this.f.close();
    this.e.close();
  }
  
  List<? extends File> l(Context paramContext, String paramString, boolean paramBoolean) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("MultiDexExtractor.load(");
    stringBuilder.append(this.b.getPath());
    stringBuilder.append(", ");
    stringBuilder.append(paramBoolean);
    stringBuilder.append(", ");
    stringBuilder.append(paramString);
    stringBuilder.append(")");
    Log.i("MultiDex", stringBuilder.toString());
    if (this.g.isValid()) {
      List<ExtractedDex> list;
      if (!paramBoolean && !j(paramContext, this.b, this.c, paramString)) {
        try {
          List<ExtractedDex> list1 = o(paramContext, paramString);
          list = list1;
        } catch (IOException iOException) {
          Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", iOException);
          List<ExtractedDex> list1 = p();
          q((Context)list, paramString, g(this.b), this.c, list1);
          list = list1;
        } 
      } else {
        if (paramBoolean) {
          Log.i("MultiDex", "Forced extraction must be performed.");
        } else {
          Log.i("MultiDex", "Detected that extraction must be performed.");
        } 
        List<ExtractedDex> list1 = p();
        q((Context)list, paramString, g(this.b), this.c, list1);
        list = list1;
      } 
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("load found ");
      stringBuilder1.append(list.size());
      stringBuilder1.append(" secondary dex files");
      Log.i("MultiDex", stringBuilder1.toString());
      return (List)list;
    } 
    throw new IllegalStateException("MultiDexExtractor was closed");
  }
  
  private static class ExtractedDex extends File {
    public long crc = -1L;
    
    public ExtractedDex(File param1File, String param1String) {
      super(param1File, param1String);
    }
  }
  
  class a implements FileFilter {
    a(MultiDexExtractor this$0) {}
    
    public boolean accept(File param1File) {
      return param1File.getName().equals("MultiDex.lock") ^ true;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/multidex/MultiDexExtractor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */