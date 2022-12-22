package com.bumptech.glide.load.j.e;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.load.e;
import com.bumptech.glide.load.engine.s;
import com.bumptech.glide.load.f;
import java.util.List;

public class d implements f<Uri, Drawable> {
  private final Context a;
  
  public d(Context paramContext) {
    this.a = paramContext.getApplicationContext();
  }
  
  private Context d(Uri paramUri, String paramString) {
    if (paramString.equals(this.a.getPackageName()))
      return this.a; 
    try {
      return this.a.createPackageContext(paramString, 0);
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
      if (paramString.contains(this.a.getPackageName()))
        return this.a; 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Failed to obtain context or unrecognized Uri format for: ");
      stringBuilder.append(paramUri);
      throw new IllegalArgumentException(stringBuilder.toString(), nameNotFoundException);
    } 
  }
  
  private int e(Uri paramUri) {
    List<String> list = paramUri.getPathSegments();
    try {
      return Integer.parseInt(list.get(0));
    } catch (NumberFormatException numberFormatException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Unrecognized Uri format: ");
      stringBuilder.append(paramUri);
      throw new IllegalArgumentException(stringBuilder.toString(), numberFormatException);
    } 
  }
  
  private int f(Context paramContext, Uri paramUri) {
    List<String> list = paramUri.getPathSegments();
    String str2 = paramUri.getAuthority();
    String str3 = list.get(0);
    String str1 = list.get(1);
    int i = paramContext.getResources().getIdentifier(str1, str3, str2);
    int j = i;
    if (i == 0)
      j = Resources.getSystem().getIdentifier(str1, str3, "android"); 
    if (j != 0)
      return j; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Failed to find resource id for: ");
    stringBuilder.append(paramUri);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  private int g(Context paramContext, Uri paramUri) {
    List list = paramUri.getPathSegments();
    if (list.size() == 2)
      return f(paramContext, paramUri); 
    if (list.size() == 1)
      return e(paramUri); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Unrecognized Uri format: ");
    stringBuilder.append(paramUri);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public s<Drawable> c(Uri paramUri, int paramInt1, int paramInt2, e parame) {
    Context context = d(paramUri, paramUri.getAuthority());
    paramInt1 = g(context, paramUri);
    return c.e(a.b(this.a, context, paramInt1));
  }
  
  public boolean h(Uri paramUri, e parame) {
    return paramUri.getScheme().equals("android.resource");
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/j/e/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */