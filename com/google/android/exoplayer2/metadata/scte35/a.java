package com.google.android.exoplayer2.metadata.scte35;

import com.google.android.exoplayer2.b1.e;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.b;
import com.google.android.exoplayer2.metadata.d;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.e0;
import com.google.android.exoplayer2.util.u;
import com.google.android.exoplayer2.util.v;
import java.nio.ByteBuffer;

public final class a implements b {
  private final v a = new v();
  
  private final u b = new u();
  
  private e0 c;
  
  public Metadata a(d paramd) {
    SpliceNullCommand spliceNullCommand;
    Metadata metadata;
    ByteBuffer byteBuffer = (ByteBuffer)e.e(((e)paramd).c);
    e0 e01 = this.c;
    if (e01 == null || paramd.g != e01.e()) {
      e01 = new e0(((e)paramd).d);
      this.c = e01;
      e01.a(((e)paramd).d - paramd.g);
    } 
    byte[] arrayOfByte = byteBuffer.array();
    int i = byteBuffer.limit();
    this.a.K(arrayOfByte, i);
    this.b.n(arrayOfByte, i);
    this.b.q(39);
    long l = this.b.h(1) << 32L | this.b.h(32);
    this.b.q(20);
    int j = this.b.h(12);
    i = this.b.h(8);
    arrayOfByte = null;
    this.a.N(14);
    if (i != 0) {
      if (i != 255) {
        if (i != 4) {
          if (i != 5) {
            if (i == 6)
              TimeSignalCommand timeSignalCommand = TimeSignalCommand.a(this.a, l, this.c); 
          } else {
            SpliceInsertCommand spliceInsertCommand = SpliceInsertCommand.a(this.a, l, this.c);
          } 
        } else {
          SpliceScheduleCommand spliceScheduleCommand = SpliceScheduleCommand.a(this.a);
        } 
      } else {
        PrivateCommand privateCommand = PrivateCommand.a(this.a, j, l);
      } 
    } else {
      spliceNullCommand = new SpliceNullCommand();
    } 
    if (spliceNullCommand == null) {
      metadata = new Metadata(new Metadata.Entry[0]);
    } else {
      metadata = new Metadata(new Metadata.Entry[] { (Metadata.Entry)metadata });
    } 
    return metadata;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/metadata/scte35/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */