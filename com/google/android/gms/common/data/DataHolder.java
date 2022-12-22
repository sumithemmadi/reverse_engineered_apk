package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.t;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;

@KeepName
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
  public static final Parcelable.Creator<DataHolder> CREATOR = new c();
  
  private static final a b = new b(new String[0], null);
  
  private final int c;
  
  private final String[] d;
  
  private Bundle e;
  
  private final CursorWindow[] f;
  
  private final int g;
  
  private final Bundle h;
  
  private int[] i;
  
  private int j;
  
  private boolean k = false;
  
  private boolean l = true;
  
  DataHolder(int paramInt1, String[] paramArrayOfString, CursorWindow[] paramArrayOfCursorWindow, int paramInt2, Bundle paramBundle) {
    this.c = paramInt1;
    this.d = paramArrayOfString;
    this.f = paramArrayOfCursorWindow;
    this.g = paramInt2;
    this.h = paramBundle;
  }
  
  public final void close() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield k : Z
    //   6: ifne -> 39
    //   9: aload_0
    //   10: iconst_1
    //   11: putfield k : Z
    //   14: iconst_0
    //   15: istore_1
    //   16: aload_0
    //   17: getfield f : [Landroid/database/CursorWindow;
    //   20: astore_2
    //   21: iload_1
    //   22: aload_2
    //   23: arraylength
    //   24: if_icmpge -> 39
    //   27: aload_2
    //   28: iload_1
    //   29: aaload
    //   30: invokevirtual close : ()V
    //   33: iinc #1, 1
    //   36: goto -> 16
    //   39: aload_0
    //   40: monitorexit
    //   41: return
    //   42: astore_2
    //   43: aload_0
    //   44: monitorexit
    //   45: goto -> 50
    //   48: aload_2
    //   49: athrow
    //   50: goto -> 48
    // Exception table:
    //   from	to	target	type
    //   2	14	42	finally
    //   16	33	42	finally
    //   39	41	42	finally
    //   43	45	42	finally
  }
  
  protected final void finalize() {
    try {
      if (this.l && this.f.length > 0 && !q0()) {
        close();
        String str = toString();
        int i = String.valueOf(str).length();
        StringBuilder stringBuilder = new StringBuilder();
        this(i + 178);
        stringBuilder.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
        stringBuilder.append(str);
        stringBuilder.append(")");
        Log.e("DataBuffer", stringBuilder.toString());
      } 
      return;
    } finally {
      super.finalize();
    } 
  }
  
  public final Bundle o0() {
    return this.h;
  }
  
  public final int p0() {
    return this.g;
  }
  
  public final boolean q0() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield k : Z
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
    //   2	9	11	finally
    //   12	14	11	finally
  }
  
  public final void r0() {
    this.e = new Bundle();
    byte b = 0;
    int i = 0;
    while (true) {
      String[] arrayOfString = this.d;
      if (i < arrayOfString.length) {
        this.e.putInt(arrayOfString[i], i);
        i++;
        continue;
      } 
      this.i = new int[this.f.length];
      i = 0;
      while (true) {
        CursorWindow[] arrayOfCursorWindow = this.f;
        if (b < arrayOfCursorWindow.length) {
          this.i[b] = i;
          int j = arrayOfCursorWindow[b].getStartPosition();
          i += this.f[b].getNumRows() - i - j;
          b++;
          continue;
        } 
        this.j = i;
        return;
      } 
      break;
    } 
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = com.google.android.gms.common.internal.safeparcel.a.a(paramParcel);
    com.google.android.gms.common.internal.safeparcel.a.s(paramParcel, 1, this.d, false);
    com.google.android.gms.common.internal.safeparcel.a.u(paramParcel, 2, (Parcelable[])this.f, paramInt, false);
    com.google.android.gms.common.internal.safeparcel.a.k(paramParcel, 3, p0());
    com.google.android.gms.common.internal.safeparcel.a.e(paramParcel, 4, o0(), false);
    com.google.android.gms.common.internal.safeparcel.a.k(paramParcel, 1000, this.c);
    com.google.android.gms.common.internal.safeparcel.a.b(paramParcel, i);
    if ((paramInt & 0x1) != 0)
      close(); 
  }
  
  public static class a {
    private final String[] a;
    
    private final ArrayList<HashMap<String, Object>> b;
    
    private final String c;
    
    private final HashMap<Object, Integer> d;
    
    private boolean e;
    
    private String f;
    
    private a(String[] param1ArrayOfString, String param1String) {
      this.a = (String[])t.j(param1ArrayOfString);
      this.b = new ArrayList<HashMap<String, Object>>();
      this.c = param1String;
      this.d = new HashMap<Object, Integer>();
      this.e = false;
      this.f = null;
    }
  }
  
  public static final class zaa extends RuntimeException {
    public zaa(String param1String) {
      super(param1String);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/data/DataHolder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */