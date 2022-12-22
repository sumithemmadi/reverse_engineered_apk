package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
final class BackStackState implements Parcelable {
  public static final Parcelable.Creator<BackStackState> CREATOR = new a();
  
  final int[] b;
  
  final ArrayList<String> c;
  
  final int[] d;
  
  final int[] e;
  
  final int f;
  
  final String g;
  
  final int h;
  
  final int i;
  
  final CharSequence j;
  
  final int k;
  
  final CharSequence l;
  
  final ArrayList<String> m;
  
  final ArrayList<String> n;
  
  final boolean o;
  
  public BackStackState(Parcel paramParcel) {
    boolean bool;
    this.b = paramParcel.createIntArray();
    this.c = paramParcel.createStringArrayList();
    this.d = paramParcel.createIntArray();
    this.e = paramParcel.createIntArray();
    this.f = paramParcel.readInt();
    this.g = paramParcel.readString();
    this.h = paramParcel.readInt();
    this.i = paramParcel.readInt();
    this.j = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel);
    this.k = paramParcel.readInt();
    this.l = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel);
    this.m = paramParcel.createStringArrayList();
    this.n = paramParcel.createStringArrayList();
    if (paramParcel.readInt() != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    this.o = bool;
  }
  
  public BackStackState(a parama) {
    int i = parama.c.size();
    this.b = new int[i * 5];
    if (parama.i) {
      this.c = new ArrayList<String>(i);
      this.d = new int[i];
      this.e = new int[i];
      byte b = 0;
      for (int j = 0; b < i; j++) {
        s.a a1 = parama.c.get(b);
        int[] arrayOfInt2 = this.b;
        int k = j + 1;
        arrayOfInt2[j] = a1.a;
        ArrayList<String> arrayList = this.c;
        Fragment fragment = a1.b;
        if (fragment != null) {
          String str = fragment.h;
        } else {
          fragment = null;
        } 
        arrayList.add(fragment);
        int[] arrayOfInt1 = this.b;
        j = k + 1;
        arrayOfInt1[k] = a1.c;
        k = j + 1;
        arrayOfInt1[j] = a1.d;
        j = k + 1;
        arrayOfInt1[k] = a1.e;
        arrayOfInt1[j] = a1.f;
        this.d[b] = a1.g.ordinal();
        this.e[b] = a1.h.ordinal();
        b++;
      } 
      this.f = parama.h;
      this.g = parama.k;
      this.h = parama.v;
      this.i = parama.l;
      this.j = parama.m;
      this.k = parama.n;
      this.l = parama.o;
      this.m = parama.p;
      this.n = parama.q;
      this.o = parama.r;
      return;
    } 
    IllegalStateException illegalStateException = new IllegalStateException("Not on back stack");
    throw illegalStateException;
  }
  
  public a a(FragmentManager paramFragmentManager) {
    a a = new a(paramFragmentManager);
    int i = 0;
    byte b = 0;
    while (i < this.b.length) {
      s.a a1 = new s.a();
      int[] arrayOfInt2 = this.b;
      int j = i + 1;
      a1.a = arrayOfInt2[i];
      if (FragmentManager.G0(2)) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Instantiate ");
        stringBuilder.append(a);
        stringBuilder.append(" op #");
        stringBuilder.append(b);
        stringBuilder.append(" base fragment #");
        stringBuilder.append(this.b[j]);
        Log.v("FragmentManager", stringBuilder.toString());
      } 
      String str = this.c.get(b);
      if (str != null) {
        a1.b = paramFragmentManager.g0(str);
      } else {
        a1.b = null;
      } 
      a1.g = Lifecycle.State.values()[this.d[b]];
      a1.h = Lifecycle.State.values()[this.e[b]];
      int[] arrayOfInt1 = this.b;
      i = j + 1;
      j = arrayOfInt1[j];
      a1.c = j;
      int k = i + 1;
      int m = arrayOfInt1[i];
      a1.d = m;
      i = k + 1;
      int n = arrayOfInt1[k];
      a1.e = n;
      k = arrayOfInt1[i];
      a1.f = k;
      a.d = j;
      a.e = m;
      a.f = n;
      a.g = k;
      a.f(a1);
      b++;
      i++;
    } 
    a.h = this.f;
    a.k = this.g;
    a.v = this.h;
    a.i = true;
    a.l = this.i;
    a.m = this.j;
    a.n = this.k;
    a.o = this.l;
    a.p = this.m;
    a.q = this.n;
    a.r = this.o;
    a.t(1);
    return a;
  }
  
  public int describeContents() {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeIntArray(this.b);
    paramParcel.writeStringList(this.c);
    paramParcel.writeIntArray(this.d);
    paramParcel.writeIntArray(this.e);
    paramParcel.writeInt(this.f);
    paramParcel.writeString(this.g);
    paramParcel.writeInt(this.h);
    paramParcel.writeInt(this.i);
    TextUtils.writeToParcel(this.j, paramParcel, 0);
    paramParcel.writeInt(this.k);
    TextUtils.writeToParcel(this.l, paramParcel, 0);
    paramParcel.writeStringList(this.m);
    paramParcel.writeStringList(this.n);
    paramParcel.writeInt(this.o);
  }
  
  class a implements Parcelable.Creator<BackStackState> {
    public BackStackState a(Parcel param1Parcel) {
      return new BackStackState(param1Parcel);
    }
    
    public BackStackState[] b(int param1Int) {
      return new BackStackState[param1Int];
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/fragment/app/BackStackState.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */