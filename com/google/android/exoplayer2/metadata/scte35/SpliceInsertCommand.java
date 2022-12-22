package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.e0;
import com.google.android.exoplayer2.util.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SpliceInsertCommand extends SpliceCommand {
  public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new a();
  
  public final long b;
  
  public final boolean c;
  
  public final boolean d;
  
  public final boolean e;
  
  public final boolean f;
  
  public final long g;
  
  public final long h;
  
  public final List<b> i;
  
  public final boolean j;
  
  public final long k;
  
  public final int l;
  
  public final int m;
  
  public final int n;
  
  private SpliceInsertCommand(long paramLong1, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, long paramLong2, long paramLong3, List<b> paramList, boolean paramBoolean5, long paramLong4, int paramInt1, int paramInt2, int paramInt3) {
    this.b = paramLong1;
    this.c = paramBoolean1;
    this.d = paramBoolean2;
    this.e = paramBoolean3;
    this.f = paramBoolean4;
    this.g = paramLong2;
    this.h = paramLong3;
    this.i = Collections.unmodifiableList(paramList);
    this.j = paramBoolean5;
    this.k = paramLong4;
    this.l = paramInt1;
    this.m = paramInt2;
    this.n = paramInt3;
  }
  
  private SpliceInsertCommand(Parcel paramParcel) {
    this.b = paramParcel.readLong();
    byte b = paramParcel.readByte();
    boolean bool1 = false;
    if (b == 1) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    this.c = bool2;
    if (paramParcel.readByte() == 1) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    this.d = bool2;
    if (paramParcel.readByte() == 1) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    this.e = bool2;
    if (paramParcel.readByte() == 1) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    this.f = bool2;
    this.g = paramParcel.readLong();
    this.h = paramParcel.readLong();
    int i = paramParcel.readInt();
    ArrayList<b> arrayList = new ArrayList(i);
    for (b = 0; b < i; b++)
      arrayList.add(b.a(paramParcel)); 
    this.i = Collections.unmodifiableList(arrayList);
    boolean bool2 = bool1;
    if (paramParcel.readByte() == 1)
      bool2 = true; 
    this.j = bool2;
    this.k = paramParcel.readLong();
    this.l = paramParcel.readInt();
    this.m = paramParcel.readInt();
    this.n = paramParcel.readInt();
  }
  
  static SpliceInsertCommand a(v paramv, long paramLong, e0 parame0) {
    boolean bool1;
    boolean bool2;
    boolean bool3;
    boolean bool4;
    boolean bool5;
    boolean bool6;
    long l2;
    boolean bool7;
    boolean bool8;
    long l1 = paramv.B();
    if ((paramv.z() & 0x80) != 0) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    List<?> list = Collections.emptyList();
    if (!bool1) {
      bool2 = paramv.z();
      if ((bool2 & 0x80) != 0) {
        bool3 = true;
      } else {
        bool3 = false;
      } 
      if ((bool2 & 0x40) != 0) {
        bool4 = true;
      } else {
        bool4 = false;
      } 
      if ((bool2 & 0x20) != 0) {
        bool5 = true;
      } else {
        bool5 = false;
      } 
      if ((bool2 & 0x10) != 0) {
        bool6 = true;
      } else {
        bool6 = false;
      } 
      if (bool4 && !bool6) {
        l2 = TimeSignalCommand.b(paramv, paramLong);
      } else {
        l2 = -9223372036854775807L;
      } 
      if (!bool4) {
        int i = paramv.z();
        list = new ArrayList(i);
        for (bool2 = false; bool2 < i; bool2++) {
          long l;
          int j = paramv.z();
          if (!bool6) {
            l = TimeSignalCommand.b(paramv, paramLong);
          } else {
            l = -9223372036854775807L;
          } 
          list.add(new b(j, l, parame0.b(l), null));
        } 
      } 
      if (bool5) {
        paramLong = paramv.z();
        if ((0x80L & paramLong) != 0L) {
          bool8 = true;
        } else {
          bool8 = false;
        } 
        paramLong = ((paramLong & 0x1L) << 32L | paramv.B()) * 1000L / 90L;
      } else {
        bool8 = false;
        paramLong = -9223372036854775807L;
      } 
      bool2 = paramv.F();
      bool5 = paramv.z();
      bool7 = paramv.z();
      boolean bool = bool6;
      bool6 = bool3;
      bool3 = bool;
    } else {
      bool6 = false;
      bool3 = false;
      l2 = -9223372036854775807L;
      bool8 = false;
      paramLong = -9223372036854775807L;
      bool2 = false;
      bool5 = false;
      bool7 = false;
      bool4 = false;
    } 
    return new SpliceInsertCommand(l1, bool1, bool6, bool4, bool3, l2, parame0.b(l2), (List)list, bool8, paramLong, bool2, bool5, bool7);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeLong(this.b);
    paramParcel.writeByte((byte)this.c);
    paramParcel.writeByte((byte)this.d);
    paramParcel.writeByte((byte)this.e);
    paramParcel.writeByte((byte)this.f);
    paramParcel.writeLong(this.g);
    paramParcel.writeLong(this.h);
    int i = this.i.size();
    paramParcel.writeInt(i);
    for (paramInt = 0; paramInt < i; paramInt++)
      ((b)this.i.get(paramInt)).b(paramParcel); 
    paramParcel.writeByte((byte)this.j);
    paramParcel.writeLong(this.k);
    paramParcel.writeInt(this.l);
    paramParcel.writeInt(this.m);
    paramParcel.writeInt(this.n);
  }
  
  static final class a implements Parcelable.Creator<SpliceInsertCommand> {
    public SpliceInsertCommand a(Parcel param1Parcel) {
      return new SpliceInsertCommand(param1Parcel, null);
    }
    
    public SpliceInsertCommand[] b(int param1Int) {
      return new SpliceInsertCommand[param1Int];
    }
  }
  
  public static final class b {
    public final int a;
    
    public final long b;
    
    public final long c;
    
    private b(int param1Int, long param1Long1, long param1Long2) {
      this.a = param1Int;
      this.b = param1Long1;
      this.c = param1Long2;
    }
    
    public static b a(Parcel param1Parcel) {
      return new b(param1Parcel.readInt(), param1Parcel.readLong(), param1Parcel.readLong());
    }
    
    public void b(Parcel param1Parcel) {
      param1Parcel.writeInt(this.a);
      param1Parcel.writeLong(this.b);
      param1Parcel.writeLong(this.c);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/metadata/scte35/SpliceInsertCommand.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */