package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;

final class fh2 {
  private final ne2[] a;
  
  private final pe2 b;
  
  private ne2 c;
  
  public fh2(ne2[] paramArrayOfne2, pe2 parampe2) {
    this.a = paramArrayOfne2;
    this.b = parampe2;
  }
  
  public final void a() {
    ne2 ne21 = this.c;
    if (ne21 != null) {
      ne21.a();
      this.c = null;
    } 
  }
  
  public final ne2 b(le2 paramle2, Uri paramUri) {
    ne2 ne22 = this.c;
    if (ne22 != null)
      return ne22; 
    for (ne2 ne23 : this.a) {
      try {
        if (ne23.g(paramle2)) {
          this.c = ne23;
          paramle2.b();
          break;
        } 
      } catch (EOFException eOFException) {
      
      } finally {
        paramle2.b();
      } 
    } 
    ne2 ne21 = this.c;
    if (ne21 != null) {
      ne21.e(this.b);
      return this.c;
    } 
    String str = wj2.d((Object[])this.a);
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 58);
    stringBuilder.append("None of the available extractors (");
    stringBuilder.append(str);
    stringBuilder.append(") could read the stream.");
    zznt zznt = new zznt(stringBuilder.toString(), paramUri);
    throw zznt;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/fh2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */