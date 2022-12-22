package com.allinone.callerid.search;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.allinone.callerid.customview.SortToken;
import com.allinone.callerid.util.t9.T9MatchInfo;
import java.util.Date;

public class CallLogBean implements Parcelable {
  public static final Parcelable.Creator<CallLogBean> CREATOR = new a();
  
  public String A;
  
  private String B;
  
  private String C;
  
  private boolean D;
  
  private boolean E;
  
  private String F;
  
  private String G;
  
  private String H;
  
  private String I;
  
  private String J;
  
  private String K;
  
  private String L;
  
  private String M;
  
  private String N;
  
  private String O;
  
  private String P;
  
  private String Q;
  
  private int R;
  
  private String S;
  
  private String T;
  
  private String U;
  
  private String V;
  
  private Date W;
  
  private String X;
  
  private Uri Y;
  
  public String Z;
  
  public String a0;
  
  private int b;
  
  public String b0;
  
  private String c;
  
  public boolean c0;
  
  private String d;
  
  public T9MatchInfo d0;
  
  private String e;
  
  public T9MatchInfo e0;
  
  private String f;
  
  public SortToken f0;
  
  private int g;
  
  public String g0;
  
  private int h;
  
  public String h0;
  
  private boolean i;
  
  public boolean i0;
  
  private String j;
  
  private boolean j0;
  
  private String k;
  
  private boolean l;
  
  private boolean m;
  
  private boolean n;
  
  private String o;
  
  private int p;
  
  private String q;
  
  public String r;
  
  public String s;
  
  private String t;
  
  private String u;
  
  private String v;
  
  private String w;
  
  private long x;
  
  private boolean y;
  
  public String z;
  
  public CallLogBean() {
    this.i = false;
    this.D = true;
    this.O = "";
    this.f0 = new SortToken();
  }
  
  protected CallLogBean(Parcel paramParcel) {
    Date date;
    boolean bool1 = false;
    this.i = false;
    this.D = true;
    this.O = "";
    this.f0 = new SortToken();
    this.b = paramParcel.readInt();
    this.c = paramParcel.readString();
    this.d = paramParcel.readString();
    this.e = paramParcel.readString();
    this.f = paramParcel.readString();
    this.g = paramParcel.readInt();
    this.h = paramParcel.readInt();
    if (paramParcel.readByte() != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    this.i = bool2;
    this.j = paramParcel.readString();
    this.k = paramParcel.readString();
    if (paramParcel.readByte() != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    this.l = bool2;
    if (paramParcel.readByte() != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    this.m = bool2;
    if (paramParcel.readByte() != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    this.n = bool2;
    this.o = paramParcel.readString();
    this.p = paramParcel.readInt();
    this.q = paramParcel.readString();
    this.r = paramParcel.readString();
    this.s = paramParcel.readString();
    this.t = paramParcel.readString();
    this.u = paramParcel.readString();
    this.v = paramParcel.readString();
    this.w = paramParcel.readString();
    this.x = paramParcel.readLong();
    if (paramParcel.readByte() != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    this.y = bool2;
    this.z = paramParcel.readString();
    this.A = paramParcel.readString();
    this.B = paramParcel.readString();
    this.C = paramParcel.readString();
    if (paramParcel.readByte() != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    this.D = bool2;
    if (paramParcel.readByte() != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    this.E = bool2;
    this.F = paramParcel.readString();
    this.G = paramParcel.readString();
    this.H = paramParcel.readString();
    this.I = paramParcel.readString();
    this.J = paramParcel.readString();
    this.K = paramParcel.readString();
    this.L = paramParcel.readString();
    this.M = paramParcel.readString();
    this.N = paramParcel.readString();
    this.O = paramParcel.readString();
    this.P = paramParcel.readString();
    this.Q = paramParcel.readString();
    this.R = paramParcel.readInt();
    this.S = paramParcel.readString();
    this.T = paramParcel.readString();
    this.U = paramParcel.readString();
    this.V = paramParcel.readString();
    long l = paramParcel.readLong();
    if (l == -1L) {
      date = null;
    } else {
      date = new Date(l);
    } 
    this.W = date;
    this.X = paramParcel.readString();
    this.Y = (Uri)paramParcel.readParcelable(Uri.class.getClassLoader());
    this.Z = paramParcel.readString();
    this.a0 = paramParcel.readString();
    this.b0 = paramParcel.readString();
    if (paramParcel.readByte() != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    this.c0 = bool2;
    this.d0 = (T9MatchInfo)paramParcel.readParcelable(T9MatchInfo.class.getClassLoader());
    this.e0 = (T9MatchInfo)paramParcel.readParcelable(T9MatchInfo.class.getClassLoader());
    this.f0 = (SortToken)paramParcel.readParcelable(SortToken.class.getClassLoader());
    this.g0 = paramParcel.readString();
    this.h0 = paramParcel.readString();
    if (paramParcel.readByte() != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    this.i0 = bool2;
    boolean bool2 = bool1;
    if (paramParcel.readByte() != 0)
      bool2 = true; 
    this.j0 = bool2;
  }
  
  public void A0(String paramString) {
    this.e = paramString;
  }
  
  public String B() {
    return this.I;
  }
  
  public void B0(String paramString) {
    this.c = paramString;
  }
  
  public String C() {
    return this.j;
  }
  
  public void C0(String paramString) {
    this.u = paramString;
  }
  
  public String D() {
    return this.r;
  }
  
  public void D0(String paramString) {
    this.d = paramString;
  }
  
  public String E() {
    return this.N;
  }
  
  public void E0(String paramString) {
    this.X = paramString;
  }
  
  public String F() {
    return this.z;
  }
  
  public void F0(String paramString) {
    this.q = paramString;
  }
  
  public String G() {
    return this.A;
  }
  
  public void G0(String paramString) {
    this.H = paramString;
  }
  
  public String H() {
    return this.B;
  }
  
  public void H0(String paramString) {
    this.Z = paramString;
  }
  
  public String I() {
    return this.O;
  }
  
  public void I0(int paramInt) {
    this.h = paramInt;
  }
  
  public String J() {
    return this.F;
  }
  
  public void J0(String paramString) {
    this.b0 = paramString;
  }
  
  public String K() {
    return this.o;
  }
  
  public void K0(String paramString) {
    this.L = paramString;
  }
  
  public String L() {
    return this.k;
  }
  
  public void L0(String paramString) {
    this.M = paramString;
  }
  
  public int M() {
    return this.g;
  }
  
  public void M0(long paramLong) {
    this.x = paramLong;
  }
  
  public String N() {
    return this.J;
  }
  
  public void N0(String paramString) {
    this.I = paramString;
  }
  
  public String O() {
    return this.K;
  }
  
  public void O0(boolean paramBoolean) {
    this.l = paramBoolean;
  }
  
  public String P() {
    return this.U;
  }
  
  public void P0(boolean paramBoolean) {
    this.j0 = paramBoolean;
  }
  
  public void Q0(boolean paramBoolean) {
    this.i = paramBoolean;
  }
  
  public boolean R() {
    return this.D;
  }
  
  public void R0(String paramString) {
    this.j = paramString;
  }
  
  public boolean S() {
    return this.c0;
  }
  
  public void S0(String paramString) {
    this.s = paramString;
  }
  
  public boolean T() {
    return this.n;
  }
  
  public void T0(String paramString) {
    this.r = paramString;
  }
  
  public boolean U() {
    return this.l;
  }
  
  public void U0(String paramString) {
    this.N = paramString;
  }
  
  public void V0(String paramString) {
    this.z = paramString;
  }
  
  public void W0(String paramString) {
    this.A = paramString;
  }
  
  public boolean X() {
    return this.j0;
  }
  
  public void X0(String paramString) {
    this.B = paramString;
  }
  
  public boolean Y() {
    return this.i;
  }
  
  public void Y0(String paramString) {
    this.O = paramString;
  }
  
  public void Z0(String paramString) {
    this.F = paramString;
  }
  
  public String a() {
    return this.S;
  }
  
  public void a0(String paramString) {
    this.P = paramString;
  }
  
  public void a1(String paramString) {
    this.o = paramString;
  }
  
  public Date b() {
    return this.W;
  }
  
  public void b0(String paramString) {
    this.S = paramString;
  }
  
  public void b1(String paramString) {
    this.k = paramString;
  }
  
  public String c() {
    return this.Q;
  }
  
  public void c1(int paramInt) {
    this.g = paramInt;
  }
  
  public String d() {
    return this.h0;
  }
  
  public void d0(Date paramDate) {
    this.W = paramDate;
  }
  
  public void d1(String paramString) {
    this.J = paramString;
  }
  
  public int describeContents() {
    return 0;
  }
  
  public String e() {
    return this.a0;
  }
  
  public void e0(String paramString) {
    this.Q = paramString;
  }
  
  public void e1(String paramString) {
    this.K = paramString;
  }
  
  public int f() {
    return this.p;
  }
  
  public void f1(String paramString) {
    this.t = paramString;
  }
  
  public String g() {
    return this.f;
  }
  
  public void g0(String paramString) {
    this.h0 = paramString;
  }
  
  public void g1(boolean paramBoolean) {
    this.E = paramBoolean;
  }
  
  public String h() {
    return this.V;
  }
  
  public void h0(boolean paramBoolean) {
    this.D = paramBoolean;
  }
  
  public void h1(String paramString) {
    this.U = paramString;
  }
  
  public String i() {
    return this.G;
  }
  
  public void i0(boolean paramBoolean) {
    this.c0 = paramBoolean;
  }
  
  public int j() {
    return this.b;
  }
  
  public void j0(boolean paramBoolean) {
    this.i0 = paramBoolean;
  }
  
  public String k() {
    return this.C;
  }
  
  public void k0(String paramString) {
    this.a0 = paramString;
  }
  
  public String m() {
    return this.e;
  }
  
  public String n() {
    return this.c;
  }
  
  public void n0(String paramString) {
    this.v = paramString;
  }
  
  public String o() {
    return this.u;
  }
  
  public void o0(boolean paramBoolean) {
    this.n = paramBoolean;
  }
  
  public String p() {
    return this.d;
  }
  
  public void p0(int paramInt) {
    this.p = paramInt;
  }
  
  public void q0(String paramString) {
    this.w = paramString;
  }
  
  public String r() {
    return this.X;
  }
  
  public void r0(String paramString) {
    this.f = paramString;
  }
  
  public String s() {
    return this.q;
  }
  
  public void s0(String paramString) {
    this.V = paramString;
  }
  
  public String t() {
    return this.H;
  }
  
  public void t0(boolean paramBoolean) {
    this.m = paramBoolean;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("CallLogBean{id=");
    stringBuilder.append(this.b);
    stringBuilder.append(", name='");
    stringBuilder.append(this.c);
    stringBuilder.append('\'');
    stringBuilder.append(", number='");
    stringBuilder.append(this.d);
    stringBuilder.append('\'');
    stringBuilder.append(", multiple_number='");
    stringBuilder.append(this.e);
    stringBuilder.append('\'');
    stringBuilder.append(", date='");
    stringBuilder.append(this.f);
    stringBuilder.append('\'');
    stringBuilder.append(", type=");
    stringBuilder.append(this.g);
    stringBuilder.append(", raw_contact_id=");
    stringBuilder.append(this.h);
    stringBuilder.append(", isShowRecord=");
    stringBuilder.append(this.i);
    stringBuilder.append(", slotId='");
    stringBuilder.append(this.j);
    stringBuilder.append('\'');
    stringBuilder.append(", tempSlotId='");
    stringBuilder.append(this.k);
    stringBuilder.append('\'');
    stringBuilder.append(", isSearched=");
    stringBuilder.append(this.l);
    stringBuilder.append(", isExistPhoto=");
    stringBuilder.append(this.m);
    stringBuilder.append(", isContact=");
    stringBuilder.append(this.n);
    stringBuilder.append(", tempId='");
    stringBuilder.append(this.o);
    stringBuilder.append('\'');
    stringBuilder.append(", count=");
    stringBuilder.append(this.p);
    stringBuilder.append(", old_tel_number='");
    stringBuilder.append(this.q);
    stringBuilder.append('\'');
    stringBuilder.append(", sortLetters='");
    stringBuilder.append(this.r);
    stringBuilder.append('\'');
    stringBuilder.append(", sortKey='");
    stringBuilder.append(this.s);
    stringBuilder.append('\'');
    stringBuilder.append(", type_tags='");
    stringBuilder.append(this.t);
    stringBuilder.append('\'');
    stringBuilder.append(", name_tags='");
    stringBuilder.append(this.u);
    stringBuilder.append('\'');
    stringBuilder.append(", comment_tags='");
    stringBuilder.append(this.v);
    stringBuilder.append('\'');
    stringBuilder.append(", country='");
    stringBuilder.append(this.w);
    stringBuilder.append('\'');
    stringBuilder.append(", search_time=");
    stringBuilder.append(this.x);
    stringBuilder.append(", showad=");
    stringBuilder.append(this.y);
    stringBuilder.append(", subtype='");
    stringBuilder.append(this.z);
    stringBuilder.append('\'');
    stringBuilder.append(", subtype_cc='");
    stringBuilder.append(this.A);
    stringBuilder.append('\'');
    stringBuilder.append(", subtype_pdt='");
    stringBuilder.append(this.B);
    stringBuilder.append('\'');
    stringBuilder.append(", keyword='");
    stringBuilder.append(this.C);
    stringBuilder.append('\'');
    stringBuilder.append(", isCanSearch=");
    stringBuilder.append(this.D);
    stringBuilder.append(", isUnkonwnNumber=");
    stringBuilder.append(this.E);
    stringBuilder.append(", tel_number='");
    stringBuilder.append(this.F);
    stringBuilder.append('\'');
    stringBuilder.append(", format_tel_number='");
    stringBuilder.append(this.G);
    stringBuilder.append('\'');
    stringBuilder.append(", operator='");
    stringBuilder.append(this.H);
    stringBuilder.append('\'');
    stringBuilder.append(", search_type='");
    stringBuilder.append(this.I);
    stringBuilder.append('\'');
    stringBuilder.append(", type_label='");
    stringBuilder.append(this.J);
    stringBuilder.append('\'');
    stringBuilder.append(", type_label_id='");
    stringBuilder.append(this.K);
    stringBuilder.append('\'');
    stringBuilder.append(", report_count='");
    stringBuilder.append(this.L);
    stringBuilder.append('\'');
    stringBuilder.append(", search_name='");
    stringBuilder.append(this.M);
    stringBuilder.append('\'');
    stringBuilder.append(", starred='");
    stringBuilder.append(this.N);
    stringBuilder.append('\'');
    stringBuilder.append(", t_p='");
    stringBuilder.append(this.O);
    stringBuilder.append('\'');
    stringBuilder.append(", address='");
    stringBuilder.append(this.P);
    stringBuilder.append('\'');
    stringBuilder.append(", belong_area='");
    stringBuilder.append(this.Q);
    stringBuilder.append('\'');
    stringBuilder.append(", faild_error_log=");
    stringBuilder.append(this.R);
    stringBuilder.append(", avatar='");
    stringBuilder.append(this.S);
    stringBuilder.append('\'');
    stringBuilder.append(", fb_avatar='");
    stringBuilder.append(this.T);
    stringBuilder.append('\'');
    stringBuilder.append(", website='");
    stringBuilder.append(this.U);
    stringBuilder.append('\'');
    stringBuilder.append(", duration='");
    stringBuilder.append(this.V);
    stringBuilder.append('\'');
    stringBuilder.append(", befor_date=");
    stringBuilder.append(this.W);
    stringBuilder.append(", numberlabel='");
    stringBuilder.append(this.X);
    stringBuilder.append('\'');
    stringBuilder.append(", lookuri=");
    stringBuilder.append(this.Y);
    stringBuilder.append(", photo_id='");
    stringBuilder.append(this.Z);
    stringBuilder.append('\'');
    stringBuilder.append(", comment_count='");
    stringBuilder.append(this.a0);
    stringBuilder.append('\'');
    stringBuilder.append(", recorder_count='");
    stringBuilder.append(this.b0);
    stringBuilder.append('\'');
    stringBuilder.append(", can_search_commentcount=");
    stringBuilder.append(this.c0);
    stringBuilder.append(", nameMatchInfo=");
    stringBuilder.append(this.d0);
    stringBuilder.append(", phoneNumberMatchInfo=");
    stringBuilder.append(this.e0);
    stringBuilder.append(", sortToken=");
    stringBuilder.append(this.f0);
    stringBuilder.append(", t9Key='");
    stringBuilder.append(this.g0);
    stringBuilder.append('\'');
    stringBuilder.append(", cached_formatted_number='");
    stringBuilder.append(this.h0);
    stringBuilder.append('\'');
    stringBuilder.append(", can_show_progress=");
    stringBuilder.append(this.i0);
    stringBuilder.append(", isSelect=");
    stringBuilder.append(this.j0);
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
  
  public String u() {
    return this.Z;
  }
  
  public void u0(int paramInt) {
    this.R = paramInt;
  }
  
  public int v() {
    return this.h;
  }
  
  public void v0(String paramString) {
    this.T = paramString;
  }
  
  public String w() {
    return this.b0;
  }
  
  public void w0(String paramString) {
    this.G = paramString;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    long l;
    paramParcel.writeInt(this.b);
    paramParcel.writeString(this.c);
    paramParcel.writeString(this.d);
    paramParcel.writeString(this.e);
    paramParcel.writeString(this.f);
    paramParcel.writeInt(this.g);
    paramParcel.writeInt(this.h);
    paramParcel.writeByte(this.i);
    paramParcel.writeString(this.j);
    paramParcel.writeString(this.k);
    paramParcel.writeByte(this.l);
    paramParcel.writeByte(this.m);
    paramParcel.writeByte(this.n);
    paramParcel.writeString(this.o);
    paramParcel.writeInt(this.p);
    paramParcel.writeString(this.q);
    paramParcel.writeString(this.r);
    paramParcel.writeString(this.s);
    paramParcel.writeString(this.t);
    paramParcel.writeString(this.u);
    paramParcel.writeString(this.v);
    paramParcel.writeString(this.w);
    paramParcel.writeLong(this.x);
    paramParcel.writeByte(this.y);
    paramParcel.writeString(this.z);
    paramParcel.writeString(this.A);
    paramParcel.writeString(this.B);
    paramParcel.writeString(this.C);
    paramParcel.writeByte(this.D);
    paramParcel.writeByte(this.E);
    paramParcel.writeString(this.F);
    paramParcel.writeString(this.G);
    paramParcel.writeString(this.H);
    paramParcel.writeString(this.I);
    paramParcel.writeString(this.J);
    paramParcel.writeString(this.K);
    paramParcel.writeString(this.L);
    paramParcel.writeString(this.M);
    paramParcel.writeString(this.N);
    paramParcel.writeString(this.O);
    paramParcel.writeString(this.P);
    paramParcel.writeString(this.Q);
    paramParcel.writeInt(this.R);
    paramParcel.writeString(this.S);
    paramParcel.writeString(this.T);
    paramParcel.writeString(this.U);
    paramParcel.writeString(this.V);
    Date date = this.W;
    if (date != null) {
      l = date.getTime();
    } else {
      l = -1L;
    } 
    paramParcel.writeLong(l);
    paramParcel.writeString(this.X);
    paramParcel.writeParcelable((Parcelable)this.Y, paramInt);
    paramParcel.writeString(this.Z);
    paramParcel.writeString(this.a0);
    paramParcel.writeString(this.b0);
    paramParcel.writeByte(this.c0);
    paramParcel.writeParcelable((Parcelable)this.d0, paramInt);
    paramParcel.writeParcelable((Parcelable)this.e0, paramInt);
    paramParcel.writeParcelable((Parcelable)this.f0, paramInt);
    paramParcel.writeString(this.g0);
    paramParcel.writeString(this.h0);
    paramParcel.writeByte(this.i0);
    paramParcel.writeByte(this.j0);
  }
  
  public String x() {
    return this.L;
  }
  
  public void x0(int paramInt) {
    this.b = paramInt;
  }
  
  public String y() {
    return this.M;
  }
  
  public void y0(String paramString) {
    this.C = paramString;
  }
  
  public long z() {
    return this.x;
  }
  
  public void z0(Uri paramUri) {
    this.Y = paramUri;
  }
  
  static final class a implements Parcelable.Creator<CallLogBean> {
    public CallLogBean a(Parcel param1Parcel) {
      return new CallLogBean(param1Parcel);
    }
    
    public CallLogBean[] b(int param1Int) {
      return new CallLogBean[param1Int];
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/search/CallLogBean.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */