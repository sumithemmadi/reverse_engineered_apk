package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SpliceScheduleCommand extends SpliceCommand {
  public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new a();
  
  public final List<c> b;
  
  private SpliceScheduleCommand(Parcel paramParcel) {
    int i = paramParcel.readInt();
    ArrayList<c> arrayList = new ArrayList(i);
    for (byte b = 0; b < i; b++)
      arrayList.add(c.a(paramParcel)); 
    this.b = Collections.unmodifiableList(arrayList);
  }
  
  private SpliceScheduleCommand(List<c> paramList) {
    this.b = Collections.unmodifiableList(paramList);
  }
  
  static SpliceScheduleCommand a(v paramv) {
    int i = paramv.z();
    ArrayList<c> arrayList = new ArrayList(i);
    for (byte b = 0; b < i; b++)
      arrayList.add(c.b(paramv)); 
    return new SpliceScheduleCommand(arrayList);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = this.b.size();
    paramParcel.writeInt(i);
    for (paramInt = 0; paramInt < i; paramInt++)
      c.c(this.b.get(paramInt), paramParcel); 
  }
  
  static final class a implements Parcelable.Creator<SpliceScheduleCommand> {
    public SpliceScheduleCommand a(Parcel param1Parcel) {
      return new SpliceScheduleCommand(param1Parcel, null);
    }
    
    public SpliceScheduleCommand[] b(int param1Int) {
      return new SpliceScheduleCommand[param1Int];
    }
  }
  
  public static final class b {
    public final int a;
    
    public final long b;
    
    private b(int param1Int, long param1Long) {
      this.a = param1Int;
      this.b = param1Long;
    }
    
    private static b c(Parcel param1Parcel) {
      return new b(param1Parcel.readInt(), param1Parcel.readLong());
    }
    
    private void d(Parcel param1Parcel) {
      param1Parcel.writeInt(this.a);
      param1Parcel.writeLong(this.b);
    }
  }
  
  public static final class c {
    public final long a;
    
    public final boolean b;
    
    public final boolean c;
    
    public final boolean d;
    
    public final long e;
    
    public final List<SpliceScheduleCommand.b> f;
    
    public final boolean g;
    
    public final long h;
    
    public final int i;
    
    public final int j;
    
    public final int k;
    
    private c(long param1Long1, boolean param1Boolean1, boolean param1Boolean2, boolean param1Boolean3, List<SpliceScheduleCommand.b> param1List, long param1Long2, boolean param1Boolean4, long param1Long3, int param1Int1, int param1Int2, int param1Int3) {
      this.a = param1Long1;
      this.b = param1Boolean1;
      this.c = param1Boolean2;
      this.d = param1Boolean3;
      this.f = Collections.unmodifiableList(param1List);
      this.e = param1Long2;
      this.g = param1Boolean4;
      this.h = param1Long3;
      this.i = param1Int1;
      this.j = param1Int2;
      this.k = param1Int3;
    }
    
    private c(Parcel param1Parcel) {
      this.a = param1Parcel.readLong();
      byte b = param1Parcel.readByte();
      boolean bool1 = false;
      if (b == 1) {
        bool2 = true;
      } else {
        bool2 = false;
      } 
      this.b = bool2;
      if (param1Parcel.readByte() == 1) {
        bool2 = true;
      } else {
        bool2 = false;
      } 
      this.c = bool2;
      if (param1Parcel.readByte() == 1) {
        bool2 = true;
      } else {
        bool2 = false;
      } 
      this.d = bool2;
      int i = param1Parcel.readInt();
      ArrayList<SpliceScheduleCommand.b> arrayList = new ArrayList(i);
      for (b = 0; b < i; b++)
        arrayList.add(SpliceScheduleCommand.b.a(param1Parcel)); 
      this.f = Collections.unmodifiableList(arrayList);
      this.e = param1Parcel.readLong();
      boolean bool2 = bool1;
      if (param1Parcel.readByte() == 1)
        bool2 = true; 
      this.g = bool2;
      this.h = param1Parcel.readLong();
      this.i = param1Parcel.readInt();
      this.j = param1Parcel.readInt();
      this.k = param1Parcel.readInt();
    }
    
    private static c d(Parcel param1Parcel) {
      return new c(param1Parcel);
    }
    
    private static c e(v param1v) {
      boolean bool1;
      boolean bool2;
      boolean bool3;
      boolean bool4;
      long l2;
      boolean bool5;
      boolean bool6;
      long l3;
      boolean bool7;
      long l1 = param1v.B();
      if ((param1v.z() & 0x80) != 0) {
        bool1 = true;
      } else {
        bool1 = false;
      } 
      ArrayList<SpliceScheduleCommand.b> arrayList = new ArrayList();
      if (!bool1) {
        bool2 = param1v.z();
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
          bool2 = true;
        } else {
          bool2 = false;
        } 
        if (bool4) {
          l2 = param1v.B();
        } else {
          l2 = -9223372036854775807L;
        } 
        if (!bool4) {
          int i = param1v.z();
          arrayList = new ArrayList(i);
          for (byte b = 0; b < i; b++)
            arrayList.add(new SpliceScheduleCommand.b(param1v.z(), param1v.B(), null)); 
        } 
        if (bool2 != 0) {
          l3 = param1v.z();
          if ((0x80L & l3) != 0L) {
            bool7 = true;
          } else {
            bool7 = false;
          } 
          l3 = ((l3 & 0x1L) << 32L | param1v.B()) * 1000L / 90L;
        } else {
          bool7 = false;
          l3 = -9223372036854775807L;
        } 
        bool5 = param1v.F();
        bool6 = param1v.z();
        bool2 = param1v.z();
      } else {
        bool3 = false;
        l2 = -9223372036854775807L;
        bool7 = false;
        l3 = -9223372036854775807L;
        bool5 = false;
        bool6 = false;
        bool2 = false;
        bool4 = false;
      } 
      return new c(l1, bool1, bool3, bool4, arrayList, l2, bool7, l3, bool5, bool6, bool2);
    }
    
    private void f(Parcel param1Parcel) {
      param1Parcel.writeLong(this.a);
      param1Parcel.writeByte((byte)this.b);
      param1Parcel.writeByte((byte)this.c);
      param1Parcel.writeByte((byte)this.d);
      int i = this.f.size();
      param1Parcel.writeInt(i);
      for (byte b = 0; b < i; b++)
        SpliceScheduleCommand.b.b(this.f.get(b), param1Parcel); 
      param1Parcel.writeLong(this.e);
      param1Parcel.writeByte((byte)this.g);
      param1Parcel.writeLong(this.h);
      param1Parcel.writeInt(this.i);
      param1Parcel.writeInt(this.j);
      param1Parcel.writeInt(this.k);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/metadata/scte35/SpliceScheduleCommand.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */