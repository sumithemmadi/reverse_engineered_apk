package com.google.android.play.core.splitcompat;

import android.content.Context;
import android.util.Log;
import com.google.android.play.core.internal.t;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class d {
  private final long a;
  
  private final Context b;
  
  private File c;
  
  public d(Context paramContext) {
    this.b = paramContext;
    this.a = (paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0)).versionCode;
  }
  
  public static void o(File paramFile) {
    if (paramFile.isDirectory()) {
      File[] arrayOfFile = paramFile.listFiles();
      if (arrayOfFile != null) {
        int i = arrayOfFile.length;
        for (byte b = 0; b < i; b++)
          o(arrayOfFile[b]); 
      } 
    } 
    if (!paramFile.exists() || paramFile.delete())
      return; 
    throw new IOException(String.format("Failed to delete '%s'", new Object[] { paramFile.getAbsolutePath() }));
  }
  
  private final File p() {
    File file = new File(q(), "verified-splits");
    w(file);
    return file;
  }
  
  private final File q() {
    File file = new File(r(), Long.toString(this.a));
    w(file);
    return file;
  }
  
  private final File r() {
    if (this.c == null) {
      Context context = this.b;
      if (context != null) {
        this.c = context.getFilesDir();
      } else {
        throw new IllegalStateException("context must be non-null to populate null filesDir");
      } 
    } 
    File file = new File(this.c, "splitcompat");
    w(file);
    return file;
  }
  
  private final File s() {
    File file = new File(q(), "native-libraries");
    w(file);
    return file;
  }
  
  private final File t(String paramString) {
    File file = u(s(), paramString);
    w(file);
    return file;
  }
  
  private static File u(File paramFile, String paramString) {
    File file = new File(paramFile, paramString);
    if (file.getCanonicalPath().startsWith(paramFile.getCanonicalPath()))
      return file; 
    throw new IllegalArgumentException("split ID cannot be placed in target directory");
  }
  
  private static String v(String paramString) {
    return String.valueOf(paramString).concat(".apk");
  }
  
  private static void w(File paramFile) {
    if (paramFile.exists()) {
      if (paramFile.isDirectory())
        return; 
      throw new IllegalArgumentException("File input must be directory when it exists.");
    } 
    paramFile.mkdirs();
    if (!paramFile.isDirectory()) {
      String str = String.valueOf(paramFile.getAbsolutePath());
      if (str.length() != 0) {
        str = "Unable to create directory: ".concat(str);
      } else {
        str = new String("Unable to create directory: ");
      } 
      throw new IOException(str);
    } 
  }
  
  public final void a() {
    File file = r();
    String[] arrayOfString = file.list();
    if (arrayOfString != null) {
      int i = arrayOfString.length;
      for (byte b = 0; b < i; b++) {
        String str = arrayOfString[b];
        if (!str.equals(Long.toString(this.a))) {
          File file1 = new File(file, str);
          str = String.valueOf(file1);
          long l = this.a;
          StringBuilder stringBuilder = new StringBuilder(str.length() + 118);
          stringBuilder.append("FileStorage: removing directory for different version code (directory = ");
          stringBuilder.append(str);
          stringBuilder.append(", current version code = ");
          stringBuilder.append(l);
          stringBuilder.append(")");
          Log.d("SplitCompat", stringBuilder.toString());
          o(file1);
        } 
      } 
    } 
  }
  
  public final File b(String paramString) {
    return u(g(), v(paramString));
  }
  
  public final File c(String paramString) {
    return u(p(), v(paramString));
  }
  
  public final File d(File paramFile) {
    return u(p(), paramFile.getName());
  }
  
  public final File e(String paramString1, String paramString2) {
    return u(t(paramString1), paramString2);
  }
  
  public final File f() {
    return new File(q(), "lock.tmp");
  }
  
  public final File g() {
    File file = new File(q(), "unverified-splits");
    w(file);
    return file;
  }
  
  public final File h(String paramString) {
    File file2 = new File(q(), "dex");
    w(file2);
    File file1 = u(file2, paramString);
    w(file1);
    return file1;
  }
  
  final Set<r> i() {
    File file = p();
    HashSet<r> hashSet = new HashSet();
    File[] arrayOfFile = file.listFiles();
    if (arrayOfFile != null) {
      int i = arrayOfFile.length;
      for (byte b = 0; b < i; b++) {
        file = arrayOfFile[b];
        if (file.isFile() && file.getName().endsWith(".apk")) {
          String str = file.getName();
          hashSet.add(new r(file, str.substring(0, str.length() - 4)));
        } 
      } 
    } 
    return hashSet;
  }
  
  final List<String> j() {
    ArrayList<String> arrayList = new ArrayList();
    File[] arrayOfFile = s().listFiles();
    if (arrayOfFile != null) {
      int i = arrayOfFile.length;
      for (byte b = 0; b < i; b++) {
        File file = arrayOfFile[b];
        if (file.isDirectory())
          arrayList.add(file.getName()); 
      } 
    } 
    return arrayList;
  }
  
  final void k(String paramString) {
    o(t(paramString));
  }
  
  final void l(File paramFile) {
    t.c(paramFile.getParentFile().getParentFile().equals(s()), "File to remove is not a native library");
    o(paramFile);
  }
  
  final Set<File> m(String paramString) {
    HashSet<File> hashSet = new HashSet();
    File[] arrayOfFile = t(paramString).listFiles();
    if (arrayOfFile != null) {
      int i = arrayOfFile.length;
      for (byte b = 0; b < i; b++) {
        File file = arrayOfFile[b];
        if (file.isFile())
          hashSet.add(file); 
      } 
    } 
    return hashSet;
  }
  
  final void n(String paramString) {
    o(c(paramString));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/play/core/splitcompat/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */