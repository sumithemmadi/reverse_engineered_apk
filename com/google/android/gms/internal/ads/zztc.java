package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import java.io.InputStream;

public final class zztc extends AbstractSafeParcelable {
  public static final Parcelable.Creator<zztc> CREATOR = new jn2();
  
  private ParcelFileDescriptor b;
  
  private final boolean c;
  
  private final boolean d;
  
  private final long e;
  
  private final boolean f;
  
  public zztc() {
    this(null, false, false, 0L, false);
  }
  
  public zztc(ParcelFileDescriptor paramParcelFileDescriptor, boolean paramBoolean1, boolean paramBoolean2, long paramLong, boolean paramBoolean3) {
    this.b = paramParcelFileDescriptor;
    this.c = paramBoolean1;
    this.d = paramBoolean2;
    this.e = paramLong;
    this.f = paramBoolean3;
  }
  
  private final ParcelFileDescriptor q0() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield b : Landroid/os/ParcelFileDescriptor;
    //   6: astore_1
    //   7: aload_0
    //   8: monitorexit
    //   9: aload_1
    //   10: areturn
    //   11: astore_1
    //   12: aload_0
    //   13: monitorexit
    //   14: aload_1
    //   15: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	11	finally
  }
  
  public final boolean o0() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield b : Landroid/os/ParcelFileDescriptor;
    //   6: astore_1
    //   7: aload_1
    //   8: ifnull -> 17
    //   11: iconst_1
    //   12: istore_2
    //   13: aload_0
    //   14: monitorexit
    //   15: iload_2
    //   16: ireturn
    //   17: iconst_0
    //   18: istore_2
    //   19: goto -> 13
    //   22: astore_1
    //   23: aload_0
    //   24: monitorexit
    //   25: goto -> 30
    //   28: aload_1
    //   29: athrow
    //   30: goto -> 28
    // Exception table:
    //   from	to	target	type
    //   2	7	22	finally
  }
  
  public final InputStream p0() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield b : Landroid/os/ParcelFileDescriptor;
    //   6: astore_1
    //   7: aload_1
    //   8: ifnonnull -> 15
    //   11: aload_0
    //   12: monitorexit
    //   13: aconst_null
    //   14: areturn
    //   15: new android/os/ParcelFileDescriptor$AutoCloseInputStream
    //   18: astore_1
    //   19: aload_1
    //   20: aload_0
    //   21: getfield b : Landroid/os/ParcelFileDescriptor;
    //   24: invokespecial <init> : (Landroid/os/ParcelFileDescriptor;)V
    //   27: aload_0
    //   28: aconst_null
    //   29: putfield b : Landroid/os/ParcelFileDescriptor;
    //   32: aload_0
    //   33: monitorexit
    //   34: aload_1
    //   35: areturn
    //   36: astore_1
    //   37: aload_0
    //   38: monitorexit
    //   39: aload_1
    //   40: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	36	finally
    //   15	32	36	finally
  }
  
  public final boolean r0() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield c : Z
    //   6: istore_1
    //   7: aload_0
    //   8: monitorexit
    //   9: iload_1
    //   10: ireturn
    //   11: astore_2
    //   12: aload_0
    //   13: monitorexit
    //   14: aload_2
    //   15: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	11	finally
  }
  
  public final boolean s0() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield d : Z
    //   6: istore_1
    //   7: aload_0
    //   8: monitorexit
    //   9: iload_1
    //   10: ireturn
    //   11: astore_2
    //   12: aload_0
    //   13: monitorexit
    //   14: aload_2
    //   15: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	11	finally
  }
  
  public final long t0() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield e : J
    //   6: lstore_1
    //   7: aload_0
    //   8: monitorexit
    //   9: lload_1
    //   10: lreturn
    //   11: astore_3
    //   12: aload_0
    //   13: monitorexit
    //   14: aload_3
    //   15: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	11	finally
  }
  
  public final boolean u0() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield f : Z
    //   6: istore_1
    //   7: aload_0
    //   8: monitorexit
    //   9: iload_1
    //   10: ireturn
    //   11: astore_2
    //   12: aload_0
    //   13: monitorexit
    //   14: aload_2
    //   15: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	11	finally
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = a.a(paramParcel);
    a.q(paramParcel, 2, (Parcelable)q0(), paramInt, false);
    a.c(paramParcel, 3, r0());
    a.c(paramParcel, 4, s0());
    a.n(paramParcel, 5, t0());
    a.c(paramParcel, 6, u0());
    a.b(paramParcel, i);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zztc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */