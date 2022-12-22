package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import java.io.InputStream;

public class m extends b<InputStream> {
  public m(AssetManager paramAssetManager, String paramString) {
    super(paramAssetManager, paramString);
  }
  
  public Class<InputStream> a() {
    return InputStream.class;
  }
  
  protected void g(InputStream paramInputStream) {
    paramInputStream.close();
  }
  
  protected InputStream h(AssetManager paramAssetManager, String paramString) {
    return paramAssetManager.open(paramString);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/data/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */