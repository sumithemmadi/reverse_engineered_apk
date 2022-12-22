package androidx.work.impl;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import androidx.work.a;
import androidx.work.k;

public class WorkManagerInitializer extends ContentProvider {
  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString) {
    return 0;
  }
  
  public String getType(Uri paramUri) {
    return null;
  }
  
  public Uri insert(Uri paramUri, ContentValues paramContentValues) {
    return null;
  }
  
  public boolean onCreate() {
    k.e(getContext(), (new a.a()).a());
    return true;
  }
  
  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2) {
    return null;
  }
  
  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString) {
    return 0;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/impl/WorkManagerInitializer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */