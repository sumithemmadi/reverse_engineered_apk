package com.google.android.play.core.splitcompat;

import android.os.Build;
import android.util.Log;
import com.google.android.play.core.internal.n0;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public final class l {
  private static final Pattern a = Pattern.compile("lib/([^/]+)/(.*\\.so)$");
  
  private final d c;
  
  l(d paramd) {
    this.c = paramd;
  }
  
  private static void e(r paramr, i parami) {
    try {
      ZipFile zipFile = new ZipFile();
      this(paramr.a());
      try {
        String str = paramr.b();
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        this();
        Enumeration<? extends ZipEntry> enumeration = zipFile.entries();
        while (true) {
          boolean bool = enumeration.hasMoreElements();
          if (bool) {
            ZipEntry zipEntry = enumeration.nextElement();
            String str1 = zipEntry.getName();
            Matcher matcher = a.matcher(str1);
            if (matcher.matches()) {
              String str2 = matcher.group(1);
              String str3 = matcher.group(2);
              Log.d("SplitCompat", String.format("NativeLibraryExtractor: split '%s' has native library '%s' for ABI '%s'", new Object[] { str, str3, str2 }));
              Set<k> set2 = (Set)hashMap.get(str2);
              Set<k> set1 = set2;
              if (set2 == null) {
                set1 = new HashSet();
                super();
                hashMap.put(str2, set1);
              } 
              k k = new k();
              this(zipEntry, str3);
              set1.add(k);
            } 
            continue;
          } 
          HashMap<Object, Object> hashMap1 = new HashMap<Object, Object>();
          this();
          for (String str1 : Build.SUPPORTED_ABIS) {
            if (hashMap.containsKey(str1)) {
              Log.d("SplitCompat", String.format("NativeLibraryExtractor: there are native libraries for supported ABI %s; will use this ABI", new Object[] { str1 }));
              for (k k : hashMap.get(str1)) {
                String str2;
                if (hashMap1.containsKey(k.a)) {
                  str2 = String.format("NativeLibraryExtractor: skipping library %s for ABI %s; already present for a better ABI", new Object[] { k.a, str1 });
                } else {
                  hashMap1.put(((k)str2).a, str2);
                  str2 = String.format("NativeLibraryExtractor: using library %s for ABI %s", new Object[] { ((k)str2).a, str1 });
                } 
                Log.d("SplitCompat", str2);
              } 
            } else {
              Log.d("SplitCompat", String.format("NativeLibraryExtractor: there are no native libraries for supported ABI %s", new Object[] { str1 }));
            } 
          } 
          HashSet<k> hashSet = new HashSet();
          this(hashMap1.values());
          parami.a(zipFile, hashSet);
          zipFile.close();
          return;
        } 
      } catch (IOException null) {
        ZipFile zipFile1 = zipFile;
      } 
    } catch (IOException iOException) {
      parami = null;
    } 
    if (parami != null)
      try {
        parami.close();
      } catch (IOException iOException1) {
        n0.a(iOException, iOException1);
      }  
    throw iOException;
  }
  
  private final void f(r paramr, Set<k> paramSet, j paramj) {
    for (k k : paramSet) {
      File file = this.c.e(paramr.b(), k.a);
      boolean bool = file.exists();
      boolean bool1 = false;
      boolean bool2 = bool1;
      if (bool) {
        bool2 = bool1;
        if (file.length() == k.b.getSize())
          bool2 = true; 
      } 
      paramj.a(k, file, bool2);
    } 
  }
  
  final Set<File> a() {
    Log.d("SplitCompat", "NativeLibraryExtractor: synchronizing native libraries");
    Set<r> set = this.c.i();
    label23: for (String str : this.c.j()) {
      Iterator<r> iterator = set.iterator();
      while (iterator.hasNext()) {
        if (((r)iterator.next()).b().equals(str))
          continue label23; 
      } 
      Log.i("SplitCompat", String.format("NativeLibraryExtractor: extracted split '%s' has no corresponding split; deleting", new Object[] { str }));
      this.c.k(str);
    } 
    HashSet<File> hashSet = new HashSet();
    for (r r : set) {
      HashSet hashSet1 = new HashSet();
      e(r, new g(this, hashSet1, r));
      for (File file : this.c.m(r.b())) {
        if (!hashSet1.contains(file)) {
          Log.i("SplitCompat", String.format("NativeLibraryExtractor: file '%s' found in split '%s' that is not in the split file '%s'; removing", new Object[] { file.getAbsolutePath(), r.b(), r.a().getAbsolutePath() }));
          this.c.l(file);
        } 
      } 
      hashSet.addAll(hashSet1);
    } 
    return hashSet;
  }
  
  final Set<File> b(r paramr) {
    AtomicBoolean atomicBoolean = new AtomicBoolean(true);
    HashSet<File> hashSet = new HashSet();
    e(paramr, new f(this, paramr, hashSet, atomicBoolean));
    return atomicBoolean.get() ? hashSet : null;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/play/core/splitcompat/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */