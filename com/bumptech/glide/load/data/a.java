package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileNotFoundException;

public final class a extends l<AssetFileDescriptor> {
  public a(ContentResolver paramContentResolver, Uri paramUri) {
    super(paramContentResolver, paramUri);
  }
  
  public Class<AssetFileDescriptor> a() {
    return AssetFileDescriptor.class;
  }
  
  protected void g(AssetFileDescriptor paramAssetFileDescriptor) {
    paramAssetFileDescriptor.close();
  }
  
  protected AssetFileDescriptor h(Uri paramUri, ContentResolver paramContentResolver) {
    AssetFileDescriptor assetFileDescriptor = paramContentResolver.openAssetFileDescriptor(paramUri, "r");
    if (assetFileDescriptor != null)
      return assetFileDescriptor; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("FileDescriptor is null for: ");
    stringBuilder.append(paramUri);
    throw new FileNotFoundException(stringBuilder.toString());
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/data/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */