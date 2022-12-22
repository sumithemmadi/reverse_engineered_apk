package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;

class a extends VersionedParcel {
  private final SparseIntArray d = new SparseIntArray();
  
  private final Parcel e;
  
  private final int f;
  
  private final int g;
  
  private final String h;
  
  private int i = -1;
  
  private int j = 0;
  
  private int k = -1;
  
  a(Parcel paramParcel) {
    this(paramParcel, paramParcel.dataPosition(), paramParcel.dataSize(), "", new b.e.a(), new b.e.a(), new b.e.a());
  }
  
  private a(Parcel paramParcel, int paramInt1, int paramInt2, String paramString, b.e.a<String, Method> parama1, b.e.a<String, Method> parama2, b.e.a<String, Class> parama) {
    super(parama1, parama2, parama);
    this.e = paramParcel;
    this.f = paramInt1;
    this.g = paramInt2;
    this.j = paramInt1;
    this.h = paramString;
  }
  
  public void A(byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte != null) {
      this.e.writeInt(paramArrayOfbyte.length);
      this.e.writeByteArray(paramArrayOfbyte);
    } else {
      this.e.writeInt(-1);
    } 
  }
  
  protected void C(CharSequence paramCharSequence) {
    TextUtils.writeToParcel(paramCharSequence, this.e, 0);
  }
  
  public void E(int paramInt) {
    this.e.writeInt(paramInt);
  }
  
  public void G(Parcelable paramParcelable) {
    this.e.writeParcelable(paramParcelable, 0);
  }
  
  public void I(String paramString) {
    this.e.writeString(paramString);
  }
  
  public void a() {
    int i = this.i;
    if (i >= 0) {
      i = this.d.get(i);
      int j = this.e.dataPosition();
      this.e.setDataPosition(i);
      this.e.writeInt(j - i);
      this.e.setDataPosition(j);
    } 
  }
  
  protected VersionedParcel b() {
    Parcel parcel = this.e;
    int i = parcel.dataPosition();
    int j = this.j;
    int k = j;
    if (j == this.f)
      k = this.g; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.h);
    stringBuilder.append("  ");
    return new a(parcel, i, k, stringBuilder.toString(), this.a, this.b, this.c);
  }
  
  public boolean g() {
    boolean bool;
    if (this.e.readInt() != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public byte[] i() {
    int i = this.e.readInt();
    if (i < 0)
      return null; 
    byte[] arrayOfByte = new byte[i];
    this.e.readByteArray(arrayOfByte);
    return arrayOfByte;
  }
  
  protected CharSequence k() {
    return (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.e);
  }
  
  public boolean m(int paramInt) {
    while (true) {
      int i = this.j;
      int j = this.g;
      boolean bool = true;
      if (i < j) {
        i = this.k;
        if (i == paramInt)
          return true; 
        if (String.valueOf(i).compareTo(String.valueOf(paramInt)) > 0)
          return false; 
        this.e.setDataPosition(this.j);
        i = this.e.readInt();
        this.k = this.e.readInt();
        this.j += i;
        continue;
      } 
      if (this.k != paramInt)
        bool = false; 
      return bool;
    } 
  }
  
  public int o() {
    return this.e.readInt();
  }
  
  public <T extends Parcelable> T q() {
    return (T)this.e.readParcelable(a.class.getClassLoader());
  }
  
  public String s() {
    return this.e.readString();
  }
  
  public void w(int paramInt) {
    a();
    this.i = paramInt;
    this.d.put(paramInt, this.e.dataPosition());
    E(0);
    E(paramInt);
  }
  
  public void y(boolean paramBoolean) {
    this.e.writeInt(paramBoolean);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/versionedparcelable/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */