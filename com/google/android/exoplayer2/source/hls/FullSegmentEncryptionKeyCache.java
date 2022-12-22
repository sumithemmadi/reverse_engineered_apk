package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import com.google.android.exoplayer2.util.e;
import java.util.LinkedHashMap;
import java.util.Map;

final class FullSegmentEncryptionKeyCache {
  private final LinkedHashMap<Uri, byte[]> a;
  
  public FullSegmentEncryptionKeyCache(final int maxSize) {
    this.a = new LinkedHashMap<Uri, byte[]>(maxSize + 1, 1.0F, false) {
        protected boolean removeEldestEntry(Map.Entry<Uri, byte[]> param1Entry) {
          boolean bool;
          if (size() > maxSize) {
            bool = true;
          } else {
            bool = false;
          } 
          return bool;
        }
      };
  }
  
  public byte[] a(Uri paramUri) {
    return (paramUri == null) ? null : this.a.get(paramUri);
  }
  
  public byte[] b(Uri paramUri, byte[] paramArrayOfbyte) {
    return (byte[])this.a.put(e.e(paramUri), e.e(paramArrayOfbyte));
  }
  
  public byte[] c(Uri paramUri) {
    return this.a.remove(e.e(paramUri));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/source/hls/FullSegmentEncryptionKeyCache.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */