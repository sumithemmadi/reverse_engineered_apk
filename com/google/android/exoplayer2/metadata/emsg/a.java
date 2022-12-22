package com.google.android.exoplayer2.metadata.emsg;

import com.google.android.exoplayer2.b1.e;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.b;
import com.google.android.exoplayer2.metadata.d;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.v;
import java.nio.ByteBuffer;
import java.util.Arrays;

public final class a implements b {
  public Metadata a(d paramd) {
    ByteBuffer byteBuffer = (ByteBuffer)e.e(((e)paramd).c);
    return new Metadata(new Metadata.Entry[] { b(new v(byteBuffer.array(), byteBuffer.limit())) });
  }
  
  public EventMessage b(v paramv) {
    return new EventMessage((String)e.e(paramv.t()), (String)e.e(paramv.t()), paramv.B(), paramv.B(), Arrays.copyOfRange(paramv.a, paramv.c(), paramv.d()));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/metadata/emsg/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */