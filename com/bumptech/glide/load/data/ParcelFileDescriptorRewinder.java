package com.bumptech.glide.load.data;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.IOException;

public final class ParcelFileDescriptorRewinder implements e<ParcelFileDescriptor> {
  private final InternalRewinder a;
  
  public ParcelFileDescriptorRewinder(ParcelFileDescriptor paramParcelFileDescriptor) {
    this.a = new InternalRewinder(paramParcelFileDescriptor);
  }
  
  public static boolean c() {
    boolean bool;
    if (Build.VERSION.SDK_INT >= 21) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void b() {}
  
  public ParcelFileDescriptor d() {
    return this.a.rewind();
  }
  
  private static final class InternalRewinder {
    private final ParcelFileDescriptor a;
    
    InternalRewinder(ParcelFileDescriptor param1ParcelFileDescriptor) {
      this.a = param1ParcelFileDescriptor;
    }
    
    ParcelFileDescriptor rewind() {
      try {
        Os.lseek(this.a.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
        return this.a;
      } catch (ErrnoException errnoException) {
        throw new IOException(errnoException);
      } 
    }
  }
  
  public static final class a implements e.a<ParcelFileDescriptor> {
    public Class<ParcelFileDescriptor> a() {
      return ParcelFileDescriptor.class;
    }
    
    public e<ParcelFileDescriptor> c(ParcelFileDescriptor param1ParcelFileDescriptor) {
      return new ParcelFileDescriptorRewinder(param1ParcelFileDescriptor);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/data/ParcelFileDescriptorRewinder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */