package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;

public class i extends l<ParcelFileDescriptor> {
  public i(ContentResolver paramContentResolver, Uri paramUri) {
    super(paramContentResolver, paramUri);
  }
  
  public Class<ParcelFileDescriptor> a() {
    return ParcelFileDescriptor.class;
  }
  
  protected void g(ParcelFileDescriptor paramParcelFileDescriptor) {
    paramParcelFileDescriptor.close();
  }
  
  protected ParcelFileDescriptor h(Uri paramUri, ContentResolver paramContentResolver) {
    AssetFileDescriptor assetFileDescriptor = paramContentResolver.openAssetFileDescriptor(paramUri, "r");
    if (assetFileDescriptor != null)
      return assetFileDescriptor.getParcelFileDescriptor(); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("FileDescriptor is null for: ");
    stringBuilder.append(paramUri);
    throw new FileNotFoundException(stringBuilder.toString());
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/data/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */