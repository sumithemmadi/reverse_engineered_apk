package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;

public class h extends b<ParcelFileDescriptor> {
  public h(AssetManager paramAssetManager, String paramString) {
    super(paramAssetManager, paramString);
  }
  
  public Class<ParcelFileDescriptor> a() {
    return ParcelFileDescriptor.class;
  }
  
  protected void g(ParcelFileDescriptor paramParcelFileDescriptor) {
    paramParcelFileDescriptor.close();
  }
  
  protected ParcelFileDescriptor h(AssetManager paramAssetManager, String paramString) {
    return paramAssetManager.openFd(paramString).getParcelFileDescriptor();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/data/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */