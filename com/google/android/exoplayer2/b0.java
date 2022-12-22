package com.google.android.exoplayer2;

import android.content.Context;
import android.os.Looper;
import com.google.android.exoplayer2.a1.a;
import com.google.android.exoplayer2.drm.k;
import com.google.android.exoplayer2.drm.o;
import com.google.android.exoplayer2.trackselection.h;
import com.google.android.exoplayer2.upstream.f;
import com.google.android.exoplayer2.upstream.n;
import com.google.android.exoplayer2.util.f;
import com.google.android.exoplayer2.util.h0;

@Deprecated
public final class b0 {
  @Deprecated
  public static x0 a(Context paramContext, v0 paramv0, h paramh, g0 paramg0) {
    return b(paramContext, paramv0, paramh, paramg0, null, h0.D());
  }
  
  @Deprecated
  public static x0 b(Context paramContext, v0 paramv0, h paramh, g0 paramg0, k<o> paramk, Looper paramLooper) {
    return c(paramContext, paramv0, paramh, paramg0, paramk, new a(f.a), paramLooper);
  }
  
  @Deprecated
  public static x0 c(Context paramContext, v0 paramv0, h paramh, g0 paramg0, k<o> paramk, a parama, Looper paramLooper) {
    return d(paramContext, paramv0, paramh, paramg0, paramk, (f)n.l(paramContext), parama, paramLooper);
  }
  
  @Deprecated
  public static x0 d(Context paramContext, v0 paramv0, h paramh, g0 paramg0, k<o> paramk, f paramf, a parama, Looper paramLooper) {
    return new x0(paramContext, paramv0, paramh, paramg0, paramk, paramf, parama, f.a, paramLooper);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/b0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */