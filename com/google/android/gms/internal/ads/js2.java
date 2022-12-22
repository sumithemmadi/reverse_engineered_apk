package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.dynamic.a;

public abstract class js2 extends ub2 implements ks2 {
  public js2() {
    super("com.google.android.gms.ads.internal.client.IClientApi");
  }
  
  protected final boolean R9(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    te te;
    tk tk;
    xr2 xr23;
    li li;
    t3 t3;
    xr2 xr22;
    rs2 rs22;
    af af;
    pf pf;
    rh rh;
    q3 q3;
    rs2 rs21;
    ur2 ur2;
    switch (paramInt1) {
      default:
        return false;
      case 15:
        te = j0(a.a.i1(paramParcel1.readStrongBinder()), pb.S9(paramParcel1.readStrongBinder()), paramParcel1.readInt());
        paramParcel2.writeNoException();
        tb2.c(paramParcel2, te);
        return true;
      case 14:
        tk = M1(a.a.i1(te.readStrongBinder()), pb.S9(te.readStrongBinder()), te.readInt());
        paramParcel2.writeNoException();
        tb2.c(paramParcel2, tk);
        return true;
      case 13:
        xr23 = i2(a.a.i1(tk.readStrongBinder()), tb2.<zzvs>b((Parcel)tk, zzvs.CREATOR), tk.readString(), pb.S9(tk.readStrongBinder()), tk.readInt());
        paramParcel2.writeNoException();
        tb2.c(paramParcel2, xr23);
        return true;
      case 12:
        li = X4(a.a.i1(xr23.readStrongBinder()), xr23.readString(), pb.S9(xr23.readStrongBinder()), xr23.readInt());
        paramParcel2.writeNoException();
        tb2.c(paramParcel2, li);
        return true;
      case 11:
        t3 = L6(a.a.i1(li.readStrongBinder()), a.a.i1(li.readStrongBinder()), a.a.i1(li.readStrongBinder()));
        paramParcel2.writeNoException();
        tb2.c(paramParcel2, t3);
        return true;
      case 10:
        xr22 = o5(a.a.i1(t3.readStrongBinder()), tb2.<zzvs>b((Parcel)t3, zzvs.CREATOR), t3.readString(), t3.readInt());
        paramParcel2.writeNoException();
        tb2.c(paramParcel2, xr22);
        return true;
      case 9:
        rs22 = o8(a.a.i1(xr22.readStrongBinder()), xr22.readInt());
        paramParcel2.writeNoException();
        tb2.c(paramParcel2, rs22);
        return true;
      case 8:
        af = M5(a.a.i1(rs22.readStrongBinder()));
        paramParcel2.writeNoException();
        tb2.c(paramParcel2, af);
        return true;
      case 7:
        pf = X7(a.a.i1(af.readStrongBinder()));
        paramParcel2.writeNoException();
        tb2.c(paramParcel2, pf);
        return true;
      case 6:
        rh = Y4(a.a.i1(pf.readStrongBinder()), pb.S9(pf.readStrongBinder()), pf.readInt());
        paramParcel2.writeNoException();
        tb2.c(paramParcel2, rh);
        return true;
      case 5:
        q3 = s5(a.a.i1(rh.readStrongBinder()), a.a.i1(rh.readStrongBinder()));
        paramParcel2.writeNoException();
        tb2.c(paramParcel2, q3);
        return true;
      case 4:
        rs21 = W8(a.a.i1(q3.readStrongBinder()));
        paramParcel2.writeNoException();
        tb2.c(paramParcel2, rs21);
        return true;
      case 3:
        ur2 = L3(a.a.i1(rs21.readStrongBinder()), rs21.readString(), pb.S9(rs21.readStrongBinder()), rs21.readInt());
        paramParcel2.writeNoException();
        tb2.c(paramParcel2, ur2);
        return true;
      case 2:
        xr21 = Q9(a.a.i1(ur2.readStrongBinder()), tb2.<zzvs>b((Parcel)ur2, zzvs.CREATOR), ur2.readString(), pb.S9(ur2.readStrongBinder()), ur2.readInt());
        paramParcel2.writeNoException();
        tb2.c(paramParcel2, xr21);
        return true;
      case 1:
        break;
    } 
    xr2 xr21 = a8(a.a.i1(xr21.readStrongBinder()), tb2.<zzvs>b((Parcel)xr21, zzvs.CREATOR), xr21.readString(), pb.S9(xr21.readStrongBinder()), xr21.readInt());
    paramParcel2.writeNoException();
    tb2.c(paramParcel2, xr21);
    return true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/js2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */