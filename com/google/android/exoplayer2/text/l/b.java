package com.google.android.exoplayer2.text.l;

import android.text.Layout;
import com.google.android.exoplayer2.text.b;

final class b extends b implements Comparable<b> {
  public final int q;
  
  public b(CharSequence paramCharSequence, Layout.Alignment paramAlignment, float paramFloat1, int paramInt1, int paramInt2, float paramFloat2, int paramInt3, float paramFloat3, boolean paramBoolean, int paramInt4, int paramInt5) {
    super(paramCharSequence, paramAlignment, paramFloat1, paramInt1, paramInt2, paramFloat2, paramInt3, paramFloat3, paramBoolean, paramInt4);
    this.q = paramInt5;
  }
  
  public int a(b paramb) {
    int i = paramb.q;
    int j = this.q;
    return (i < j) ? -1 : ((i > j) ? 1 : 0);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/text/l/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */