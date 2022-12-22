package com.bumptech.glide.load.i;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.c;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.e;
import com.bumptech.glide.o.d;
import java.io.File;
import java.io.FileNotFoundException;

public final class k implements n<Uri, File> {
  private final Context a;
  
  public k(Context paramContext) {
    this.a = paramContext;
  }
  
  public n.a<File> c(Uri paramUri, int paramInt1, int paramInt2, e parame) {
    return new n.a<File>((c)new d(paramUri), new b(this.a, paramUri));
  }
  
  public boolean d(Uri paramUri) {
    return com.bumptech.glide.load.data.o.b.b(paramUri);
  }
  
  public static final class a implements o<Uri, File> {
    private final Context a;
    
    public a(Context param1Context) {
      this.a = param1Context;
    }
    
    public n<Uri, File> b(r param1r) {
      return new k(this.a);
    }
  }
  
  private static class b implements d<File> {
    private static final String[] b = new String[] { "_data" };
    
    private final Context c;
    
    private final Uri d;
    
    b(Context param1Context, Uri param1Uri) {
      this.c = param1Context;
      this.d = param1Uri;
    }
    
    public Class<File> a() {
      return File.class;
    }
    
    public void b() {}
    
    public void cancel() {}
    
    public DataSource d() {
      return DataSource.b;
    }
    
    public void e(Priority param1Priority, d.a<? super File> param1a) {
      StringBuilder stringBuilder;
      Cursor cursor = this.c.getContentResolver().query(this.d, b, null, null, null);
      param1Priority = null;
      Priority priority = null;
      if (cursor != null) {
        param1Priority = priority;
        try {
          if (cursor.moveToFirst())
            String str = cursor.getString(cursor.getColumnIndexOrThrow("_data")); 
        } finally {
          cursor.close();
        } 
      } 
      if (TextUtils.isEmpty((CharSequence)param1Priority)) {
        stringBuilder = new StringBuilder();
        stringBuilder.append("Failed to find file path for: ");
        stringBuilder.append(this.d);
        param1a.c(new FileNotFoundException(stringBuilder.toString()));
      } else {
        param1a.f(new File((String)stringBuilder));
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/i/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */