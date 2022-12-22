package com.bumptech.glide.load.i.y;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.e;
import com.bumptech.glide.load.i.n;
import com.bumptech.glide.load.i.o;
import com.bumptech.glide.load.i.r;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;

public final class d<DataT> implements n<Uri, DataT> {
  private final Context a;
  
  private final n<File, DataT> b;
  
  private final n<Uri, DataT> c;
  
  private final Class<DataT> d;
  
  d(Context paramContext, n<File, DataT> paramn, n<Uri, DataT> paramn1, Class<DataT> paramClass) {
    this.a = paramContext.getApplicationContext();
    this.b = paramn;
    this.c = paramn1;
    this.d = paramClass;
  }
  
  public n.a<DataT> c(Uri paramUri, int paramInt1, int paramInt2, e parame) {
    return new n.a((com.bumptech.glide.load.c)new com.bumptech.glide.o.d(paramUri), new d<DataT>(this.a, this.b, this.c, paramUri, paramInt1, paramInt2, parame, this.d));
  }
  
  public boolean d(Uri paramUri) {
    boolean bool;
    if (Build.VERSION.SDK_INT >= 29 && com.bumptech.glide.load.data.o.b.b(paramUri)) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private static abstract class a<DataT> implements o<Uri, DataT> {
    private final Context a;
    
    private final Class<DataT> b;
    
    a(Context param1Context, Class<DataT> param1Class) {
      this.a = param1Context;
      this.b = param1Class;
    }
    
    public final n<Uri, DataT> b(r param1r) {
      return new d<DataT>(this.a, param1r.d(File.class, this.b), param1r.d(Uri.class, this.b), this.b);
    }
  }
  
  public static final class b extends a<ParcelFileDescriptor> {
    public b(Context param1Context) {
      super(param1Context, ParcelFileDescriptor.class);
    }
  }
  
  public static final class c extends a<InputStream> {
    public c(Context param1Context) {
      super(param1Context, InputStream.class);
    }
  }
  
  private static final class d<DataT> implements com.bumptech.glide.load.data.d<DataT> {
    private static final String[] b = new String[] { "_data" };
    
    private final Context c;
    
    private final n<File, DataT> d;
    
    private final n<Uri, DataT> e;
    
    private final Uri f;
    
    private final int g;
    
    private final int h;
    
    private final e i;
    
    private final Class<DataT> j;
    
    private volatile boolean k;
    
    private volatile com.bumptech.glide.load.data.d<DataT> l;
    
    d(Context param1Context, n<File, DataT> param1n, n<Uri, DataT> param1n1, Uri param1Uri, int param1Int1, int param1Int2, e param1e, Class<DataT> param1Class) {
      this.c = param1Context.getApplicationContext();
      this.d = param1n;
      this.e = param1n1;
      this.f = param1Uri;
      this.g = param1Int1;
      this.h = param1Int2;
      this.i = param1e;
      this.j = param1Class;
    }
    
    private n.a<DataT> c() {
      Uri uri;
      if (Environment.isExternalStorageLegacy())
        return this.d.b(h(this.f), this.g, this.h, this.i); 
      if (g()) {
        uri = MediaStore.setRequireOriginal(this.f);
      } else {
        uri = this.f;
      } 
      return this.e.b(uri, this.g, this.h, this.i);
    }
    
    private com.bumptech.glide.load.data.d<DataT> f() {
      n.a<DataT> a = c();
      if (a != null) {
        com.bumptech.glide.load.data.d d1 = a.c;
      } else {
        a = null;
      } 
      return (com.bumptech.glide.load.data.d<DataT>)a;
    }
    
    private boolean g() {
      boolean bool;
      if (this.c.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    private File h(Uri param1Uri) {
      Cursor cursor = null;
      try {
        File file;
        Cursor cursor1 = this.c.getContentResolver().query(param1Uri, b, null, null, null);
        if (cursor1 != null) {
          cursor = cursor1;
          if (cursor1.moveToFirst()) {
            cursor = cursor1;
            String str = cursor1.getString(cursor1.getColumnIndexOrThrow("_data"));
            cursor = cursor1;
            if (!TextUtils.isEmpty(str)) {
              cursor = cursor1;
              file = new File(str);
              return file;
            } 
            cursor = cursor1;
            FileNotFoundException fileNotFoundException1 = new FileNotFoundException();
            cursor = cursor1;
            StringBuilder stringBuilder1 = new StringBuilder();
            cursor = cursor1;
            this();
            cursor = cursor1;
            stringBuilder1.append("File path was empty in media store for: ");
            cursor = cursor1;
            stringBuilder1.append(file);
            cursor = cursor1;
            this(stringBuilder1.toString());
            cursor = cursor1;
            throw fileNotFoundException1;
          } 
        } 
        cursor = cursor1;
        FileNotFoundException fileNotFoundException = new FileNotFoundException();
        cursor = cursor1;
        StringBuilder stringBuilder = new StringBuilder();
        cursor = cursor1;
        this();
        cursor = cursor1;
        stringBuilder.append("Failed to media store entry for: ");
        cursor = cursor1;
        stringBuilder.append(file);
        cursor = cursor1;
        this(stringBuilder.toString());
        cursor = cursor1;
        throw fileNotFoundException;
      } finally {
        if (cursor != null)
          cursor.close(); 
      } 
    }
    
    public Class<DataT> a() {
      return this.j;
    }
    
    public void b() {
      com.bumptech.glide.load.data.d<DataT> d1 = this.l;
      if (d1 != null)
        d1.b(); 
    }
    
    public void cancel() {
      this.k = true;
      com.bumptech.glide.load.data.d<DataT> d1 = this.l;
      if (d1 != null)
        d1.cancel(); 
    }
    
    public DataSource d() {
      return DataSource.b;
    }
    
    public void e(Priority param1Priority, com.bumptech.glide.load.data.d.a<? super DataT> param1a) {
      try {
        IllegalArgumentException illegalArgumentException;
        StringBuilder stringBuilder;
        com.bumptech.glide.load.data.d<DataT> d1 = f();
        if (d1 == null) {
          illegalArgumentException = new IllegalArgumentException();
          stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("Failed to build fetcher for: ");
          stringBuilder.append(this.f);
          this(stringBuilder.toString());
          param1a.c(illegalArgumentException);
          return;
        } 
        this.l = (com.bumptech.glide.load.data.d<DataT>)stringBuilder;
        if (this.k) {
          cancel();
        } else {
          stringBuilder.e((Priority)illegalArgumentException, param1a);
        } 
      } catch (FileNotFoundException fileNotFoundException) {
        param1a.c(fileNotFoundException);
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/i/y/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */