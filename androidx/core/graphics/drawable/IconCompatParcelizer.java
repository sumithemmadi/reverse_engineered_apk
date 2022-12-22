package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.VersionedParcel;

public class IconCompatParcelizer {
  public static IconCompat read(VersionedParcel paramVersionedParcel) {
    IconCompat iconCompat = new IconCompat();
    iconCompat.b = paramVersionedParcel.p(iconCompat.b, 1);
    iconCompat.d = paramVersionedParcel.j(iconCompat.d, 2);
    iconCompat.e = paramVersionedParcel.r(iconCompat.e, 3);
    iconCompat.f = paramVersionedParcel.p(iconCompat.f, 4);
    iconCompat.g = paramVersionedParcel.p(iconCompat.g, 5);
    iconCompat.h = (ColorStateList)paramVersionedParcel.r((Parcelable)iconCompat.h, 6);
    iconCompat.j = paramVersionedParcel.t(iconCompat.j, 7);
    iconCompat.k = paramVersionedParcel.t(iconCompat.k, 8);
    iconCompat.n();
    return iconCompat;
  }
  
  public static void write(IconCompat paramIconCompat, VersionedParcel paramVersionedParcel) {
    paramVersionedParcel.x(true, true);
    paramIconCompat.o(paramVersionedParcel.f());
    int i = paramIconCompat.b;
    if (-1 != i)
      paramVersionedParcel.F(i, 1); 
    byte[] arrayOfByte = paramIconCompat.d;
    if (arrayOfByte != null)
      paramVersionedParcel.B(arrayOfByte, 2); 
    Parcelable parcelable = paramIconCompat.e;
    if (parcelable != null)
      paramVersionedParcel.H(parcelable, 3); 
    i = paramIconCompat.f;
    if (i != 0)
      paramVersionedParcel.F(i, 4); 
    i = paramIconCompat.g;
    if (i != 0)
      paramVersionedParcel.F(i, 5); 
    ColorStateList colorStateList = paramIconCompat.h;
    if (colorStateList != null)
      paramVersionedParcel.H((Parcelable)colorStateList, 6); 
    String str2 = paramIconCompat.j;
    if (str2 != null)
      paramVersionedParcel.J(str2, 7); 
    String str1 = paramIconCompat.k;
    if (str1 != null)
      paramVersionedParcel.J(str1, 8); 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/core/graphics/drawable/IconCompatParcelizer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */