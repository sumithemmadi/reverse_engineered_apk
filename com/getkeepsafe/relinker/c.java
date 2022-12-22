package com.getkeepsafe.relinker;

import android.content.Context;
import android.util.Log;
import com.getkeepsafe.relinker.f.i;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public class c {
  protected final Set<String> a = new HashSet<String>();
  
  protected final b.b b;
  
  protected final b.a c;
  
  protected boolean d;
  
  protected boolean e;
  
  protected b.d f;
  
  protected c() {
    this(new d(), new a());
  }
  
  protected c(b.b paramb, b.a parama) {
    if (paramb != null) {
      if (parama != null) {
        this.b = paramb;
        this.c = parama;
        return;
      } 
      throw new IllegalArgumentException("Cannot pass null library installer");
    } 
    throw new IllegalArgumentException("Cannot pass null library loader");
  }
  
  private void g(Context paramContext, String paramString1, String paramString2) {
    File file;
    if (this.a.contains(paramString1) && !this.d) {
      i("%s already loaded previously!", new Object[] { paramString1 });
      return;
    } 
    try {
      this.b.a(paramString1);
      this.a.add(paramString1);
      i("%s (%s) was loaded normally!", new Object[] { paramString1, paramString2 });
      return;
    } catch (UnsatisfiedLinkError unsatisfiedLinkError) {
      i("Loading the library normally failed: %s", new Object[] { Log.getStackTraceString(unsatisfiedLinkError) });
      i("%s (%s) was not loaded normally, re-linking...", new Object[] { paramString1, paramString2 });
      file = d(paramContext, paramString1, paramString2);
      if (!file.exists() || this.d) {
        if (this.d)
          i("Forcing a re-link of %s (%s)...", new Object[] { paramString1, paramString2 }); 
        b(paramContext, paramString1, paramString2);
        this.c.a(paramContext, this.b.d(), this.b.b(paramString1), file, this);
      } 
      try {
        boolean bool = this.e;
        if (bool) {
          String str1;
          List list = null;
          try {
            i i = new i();
            this(file);
          } finally {
            paramContext = null;
          } 
          str1.close();
          throw paramContext;
        } 
      } catch (IOException iOException) {}
    } 
    this.b.e(file.getAbsolutePath());
    this.a.add(paramString1);
    i("%s (%s) was re-linked!", new Object[] { paramString1, paramString2 });
  }
  
  protected void b(Context paramContext, String paramString1, String paramString2) {
    File file2 = c(paramContext);
    File file1 = d(paramContext, paramString1, paramString2);
    File[] arrayOfFile = file2.listFiles(new b(this, this.b.b(paramString1)));
    if (arrayOfFile == null)
      return; 
    int i = arrayOfFile.length;
    for (byte b1 = 0; b1 < i; b1++) {
      File file = arrayOfFile[b1];
      if (this.d || !file.getAbsolutePath().equals(file1.getAbsolutePath()))
        file.delete(); 
    } 
  }
  
  protected File c(Context paramContext) {
    return paramContext.getDir("lib", 0);
  }
  
  protected File d(Context paramContext, String paramString1, String paramString2) {
    paramString1 = this.b.b(paramString1);
    if (e.a(paramString2))
      return new File(c(paramContext), paramString1); 
    File file = c(paramContext);
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramString1);
    stringBuilder.append(".");
    stringBuilder.append(paramString2);
    return new File(file, stringBuilder.toString());
  }
  
  public void e(Context paramContext, String paramString) {
    f(paramContext, paramString, null, null);
  }
  
  public void f(Context paramContext, String paramString1, String paramString2, b.c paramc) {
    if (paramContext != null) {
      if (!e.a(paramString1)) {
        i("Beginning load of %s...", new Object[] { paramString1 });
        if (paramc == null) {
          g(paramContext, paramString1, paramString2);
        } else {
          (new Thread(new a(this, paramContext, paramString1, paramString2, paramc))).start();
        } 
        return;
      } 
      throw new IllegalArgumentException("Given library is either null or empty");
    } 
    throw new IllegalArgumentException("Given context is null");
  }
  
  public void h(String paramString) {
    b.d d1 = this.f;
    if (d1 != null)
      d1.a(paramString); 
  }
  
  public void i(String paramString, Object... paramVarArgs) {
    h(String.format(Locale.US, paramString, paramVarArgs));
  }
  
  class a implements Runnable {
    a(c this$0, Context param1Context, String param1String1, String param1String2, b.c param1c) {}
    
    public void run() {
      try {
        c.a(this.f, this.b, this.c, this.d);
        this.e.a();
      } catch (UnsatisfiedLinkError unsatisfiedLinkError) {
        this.e.b(unsatisfiedLinkError);
      } catch (MissingLibraryException missingLibraryException) {
        this.e.b(missingLibraryException);
      } 
    }
  }
  
  class b implements FilenameFilter {
    b(c this$0, String param1String) {}
    
    public boolean accept(File param1File, String param1String) {
      return param1String.startsWith(this.a);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/getkeepsafe/relinker/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */