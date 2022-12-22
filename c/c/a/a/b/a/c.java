package c.c.a.a.b.a;

import android.os.Parcel;

public class c {
  private static final ClassLoader a = c.class.getClassLoader();
  
  public static void a(Parcel paramParcel, boolean paramBoolean) {
    paramParcel.writeInt(1);
  }
  
  public static boolean b(Parcel paramParcel) {
    return (paramParcel.readInt() != 0);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/c/c/a/a/b/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */