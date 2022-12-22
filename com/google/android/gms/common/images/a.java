package com.google.android.gms.common.images;

import android.net.Uri;
import com.google.android.gms.common.internal.r;

final class a {
  public final Uri a;
  
  public a(Uri paramUri) {
    this.a = paramUri;
  }
  
  public final boolean equals(Object paramObject) {
    return !(paramObject instanceof a) ? false : ((this == paramObject) ? true : r.a(((a)paramObject).a, this.a));
  }
  
  public final int hashCode() {
    return r.b(new Object[] { this.a });
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/images/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */