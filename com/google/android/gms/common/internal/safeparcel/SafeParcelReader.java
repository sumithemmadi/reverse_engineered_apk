package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class SafeParcelReader {
  public static float A(Parcel paramParcel, int paramInt) {
    L(paramParcel, paramInt, 4);
    return paramParcel.readFloat();
  }
  
  public static Float B(Parcel paramParcel, int paramInt) {
    int i = I(paramParcel, paramInt);
    if (i == 0)
      return null; 
    M(paramParcel, paramInt, i, 4);
    return Float.valueOf(paramParcel.readFloat());
  }
  
  public static int C(Parcel paramParcel) {
    return paramParcel.readInt();
  }
  
  public static IBinder D(Parcel paramParcel, int paramInt) {
    paramInt = I(paramParcel, paramInt);
    int i = paramParcel.dataPosition();
    if (paramInt == 0)
      return null; 
    IBinder iBinder = paramParcel.readStrongBinder();
    paramParcel.setDataPosition(i + paramInt);
    return iBinder;
  }
  
  public static int E(Parcel paramParcel, int paramInt) {
    L(paramParcel, paramInt, 4);
    return paramParcel.readInt();
  }
  
  public static Integer F(Parcel paramParcel, int paramInt) {
    int i = I(paramParcel, paramInt);
    if (i == 0)
      return null; 
    M(paramParcel, paramInt, i, 4);
    return Integer.valueOf(paramParcel.readInt());
  }
  
  public static long G(Parcel paramParcel, int paramInt) {
    L(paramParcel, paramInt, 8);
    return paramParcel.readLong();
  }
  
  public static Long H(Parcel paramParcel, int paramInt) {
    int i = I(paramParcel, paramInt);
    if (i == 0)
      return null; 
    M(paramParcel, paramInt, i, 8);
    return Long.valueOf(paramParcel.readLong());
  }
  
  public static int I(Parcel paramParcel, int paramInt) {
    return ((paramInt & 0xFFFF0000) != -65536) ? (paramInt >> 16 & 0xFFFF) : paramParcel.readInt();
  }
  
  public static void J(Parcel paramParcel, int paramInt) {
    paramInt = I(paramParcel, paramInt);
    paramParcel.setDataPosition(paramParcel.dataPosition() + paramInt);
  }
  
  public static int K(Parcel paramParcel) {
    int i = C(paramParcel);
    int j = I(paramParcel, i);
    int k = paramParcel.dataPosition();
    if (v(i) != 20293) {
      String str = String.valueOf(Integer.toHexString(i));
      if (str.length() != 0) {
        str = "Expected object header. Got 0x".concat(str);
      } else {
        str = new String("Expected object header. Got 0x");
      } 
      throw new ParseException(str, paramParcel);
    } 
    j += k;
    if (j >= k && j <= paramParcel.dataSize())
      return j; 
    StringBuilder stringBuilder = new StringBuilder(54);
    stringBuilder.append("Size read is invalid start=");
    stringBuilder.append(k);
    stringBuilder.append(" end=");
    stringBuilder.append(j);
    throw new ParseException(stringBuilder.toString(), paramParcel);
  }
  
  private static void L(Parcel paramParcel, int paramInt1, int paramInt2) {
    paramInt1 = I(paramParcel, paramInt1);
    if (paramInt1 == paramInt2)
      return; 
    String str = Integer.toHexString(paramInt1);
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 46);
    stringBuilder.append("Expected size ");
    stringBuilder.append(paramInt2);
    stringBuilder.append(" got ");
    stringBuilder.append(paramInt1);
    stringBuilder.append(" (0x");
    stringBuilder.append(str);
    stringBuilder.append(")");
    throw new ParseException(stringBuilder.toString(), paramParcel);
  }
  
  private static void M(Parcel paramParcel, int paramInt1, int paramInt2, int paramInt3) {
    if (paramInt2 == paramInt3)
      return; 
    String str = Integer.toHexString(paramInt2);
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 46);
    stringBuilder.append("Expected size ");
    stringBuilder.append(paramInt3);
    stringBuilder.append(" got ");
    stringBuilder.append(paramInt2);
    stringBuilder.append(" (0x");
    stringBuilder.append(str);
    stringBuilder.append(")");
    throw new ParseException(stringBuilder.toString(), paramParcel);
  }
  
  public static BigDecimal a(Parcel paramParcel, int paramInt) {
    int i = I(paramParcel, paramInt);
    paramInt = paramParcel.dataPosition();
    if (i == 0)
      return null; 
    byte[] arrayOfByte = paramParcel.createByteArray();
    int j = paramParcel.readInt();
    paramParcel.setDataPosition(paramInt + i);
    return new BigDecimal(new BigInteger(arrayOfByte), j);
  }
  
  public static BigDecimal[] b(Parcel paramParcel, int paramInt) {
    int i = I(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    if (i == 0)
      return null; 
    int k = paramParcel.readInt();
    BigDecimal[] arrayOfBigDecimal = new BigDecimal[k];
    for (paramInt = 0; paramInt < k; paramInt++) {
      byte[] arrayOfByte = paramParcel.createByteArray();
      int m = paramParcel.readInt();
      arrayOfBigDecimal[paramInt] = new BigDecimal(new BigInteger(arrayOfByte), m);
    } 
    paramParcel.setDataPosition(j + i);
    return arrayOfBigDecimal;
  }
  
  public static BigInteger c(Parcel paramParcel, int paramInt) {
    paramInt = I(paramParcel, paramInt);
    int i = paramParcel.dataPosition();
    if (paramInt == 0)
      return null; 
    byte[] arrayOfByte = paramParcel.createByteArray();
    paramParcel.setDataPosition(i + paramInt);
    return new BigInteger(arrayOfByte);
  }
  
  public static BigInteger[] d(Parcel paramParcel, int paramInt) {
    int i = I(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    if (i == 0)
      return null; 
    int k = paramParcel.readInt();
    BigInteger[] arrayOfBigInteger = new BigInteger[k];
    for (paramInt = 0; paramInt < k; paramInt++)
      arrayOfBigInteger[paramInt] = new BigInteger(paramParcel.createByteArray()); 
    paramParcel.setDataPosition(j + i);
    return arrayOfBigInteger;
  }
  
  public static boolean[] e(Parcel paramParcel, int paramInt) {
    paramInt = I(paramParcel, paramInt);
    int i = paramParcel.dataPosition();
    if (paramInt == 0)
      return null; 
    boolean[] arrayOfBoolean = paramParcel.createBooleanArray();
    paramParcel.setDataPosition(i + paramInt);
    return arrayOfBoolean;
  }
  
  public static Bundle f(Parcel paramParcel, int paramInt) {
    paramInt = I(paramParcel, paramInt);
    int i = paramParcel.dataPosition();
    if (paramInt == 0)
      return null; 
    Bundle bundle = paramParcel.readBundle();
    paramParcel.setDataPosition(i + paramInt);
    return bundle;
  }
  
  public static byte[] g(Parcel paramParcel, int paramInt) {
    paramInt = I(paramParcel, paramInt);
    int i = paramParcel.dataPosition();
    if (paramInt == 0)
      return null; 
    byte[] arrayOfByte = paramParcel.createByteArray();
    paramParcel.setDataPosition(i + paramInt);
    return arrayOfByte;
  }
  
  public static double[] h(Parcel paramParcel, int paramInt) {
    paramInt = I(paramParcel, paramInt);
    int i = paramParcel.dataPosition();
    if (paramInt == 0)
      return null; 
    double[] arrayOfDouble = paramParcel.createDoubleArray();
    paramParcel.setDataPosition(i + paramInt);
    return arrayOfDouble;
  }
  
  public static float[] i(Parcel paramParcel, int paramInt) {
    int i = I(paramParcel, paramInt);
    paramInt = paramParcel.dataPosition();
    if (i == 0)
      return null; 
    float[] arrayOfFloat = paramParcel.createFloatArray();
    paramParcel.setDataPosition(paramInt + i);
    return arrayOfFloat;
  }
  
  public static int[] j(Parcel paramParcel, int paramInt) {
    paramInt = I(paramParcel, paramInt);
    int i = paramParcel.dataPosition();
    if (paramInt == 0)
      return null; 
    int[] arrayOfInt = paramParcel.createIntArray();
    paramParcel.setDataPosition(i + paramInt);
    return arrayOfInt;
  }
  
  public static ArrayList<Integer> k(Parcel paramParcel, int paramInt) {
    int i = I(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    if (i == 0)
      return null; 
    ArrayList<Integer> arrayList = new ArrayList();
    int k = paramParcel.readInt();
    for (paramInt = 0; paramInt < k; paramInt++)
      arrayList.add(Integer.valueOf(paramParcel.readInt())); 
    paramParcel.setDataPosition(j + i);
    return arrayList;
  }
  
  public static long[] l(Parcel paramParcel, int paramInt) {
    int i = I(paramParcel, paramInt);
    paramInt = paramParcel.dataPosition();
    if (i == 0)
      return null; 
    long[] arrayOfLong = paramParcel.createLongArray();
    paramParcel.setDataPosition(paramInt + i);
    return arrayOfLong;
  }
  
  public static Parcel m(Parcel paramParcel, int paramInt) {
    paramInt = I(paramParcel, paramInt);
    int i = paramParcel.dataPosition();
    if (paramInt == 0)
      return null; 
    Parcel parcel = Parcel.obtain();
    parcel.appendFrom(paramParcel, i, paramInt);
    paramParcel.setDataPosition(i + paramInt);
    return parcel;
  }
  
  public static Parcel[] n(Parcel paramParcel, int paramInt) {
    int i = I(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    if (i == 0)
      return null; 
    int k = paramParcel.readInt();
    Parcel[] arrayOfParcel = new Parcel[k];
    for (paramInt = 0; paramInt < k; paramInt++) {
      int m = paramParcel.readInt();
      if (m != 0) {
        int n = paramParcel.dataPosition();
        Parcel parcel = Parcel.obtain();
        parcel.appendFrom(paramParcel, n, m);
        arrayOfParcel[paramInt] = parcel;
        paramParcel.setDataPosition(n + m);
      } else {
        arrayOfParcel[paramInt] = null;
      } 
    } 
    paramParcel.setDataPosition(j + i);
    return arrayOfParcel;
  }
  
  public static <T extends Parcelable> T o(Parcel paramParcel, int paramInt, Parcelable.Creator<T> paramCreator) {
    paramInt = I(paramParcel, paramInt);
    int i = paramParcel.dataPosition();
    if (paramInt == 0)
      return null; 
    Parcelable parcelable = (Parcelable)paramCreator.createFromParcel(paramParcel);
    paramParcel.setDataPosition(i + paramInt);
    return (T)parcelable;
  }
  
  public static String p(Parcel paramParcel, int paramInt) {
    int i = I(paramParcel, paramInt);
    paramInt = paramParcel.dataPosition();
    if (i == 0)
      return null; 
    String str = paramParcel.readString();
    paramParcel.setDataPosition(paramInt + i);
    return str;
  }
  
  public static String[] q(Parcel paramParcel, int paramInt) {
    int i = I(paramParcel, paramInt);
    paramInt = paramParcel.dataPosition();
    if (i == 0)
      return null; 
    String[] arrayOfString = paramParcel.createStringArray();
    paramParcel.setDataPosition(paramInt + i);
    return arrayOfString;
  }
  
  public static ArrayList<String> r(Parcel paramParcel, int paramInt) {
    int i = I(paramParcel, paramInt);
    paramInt = paramParcel.dataPosition();
    if (i == 0)
      return null; 
    ArrayList<String> arrayList = paramParcel.createStringArrayList();
    paramParcel.setDataPosition(paramInt + i);
    return arrayList;
  }
  
  public static <T> T[] s(Parcel paramParcel, int paramInt, Parcelable.Creator<T> paramCreator) {
    paramInt = I(paramParcel, paramInt);
    int i = paramParcel.dataPosition();
    if (paramInt == 0)
      return null; 
    Object[] arrayOfObject = paramParcel.createTypedArray(paramCreator);
    paramParcel.setDataPosition(i + paramInt);
    return (T[])arrayOfObject;
  }
  
  public static <T> ArrayList<T> t(Parcel paramParcel, int paramInt, Parcelable.Creator<T> paramCreator) {
    int i = I(paramParcel, paramInt);
    paramInt = paramParcel.dataPosition();
    if (i == 0)
      return null; 
    ArrayList<T> arrayList = paramParcel.createTypedArrayList(paramCreator);
    paramParcel.setDataPosition(paramInt + i);
    return arrayList;
  }
  
  public static void u(Parcel paramParcel, int paramInt) {
    if (paramParcel.dataPosition() == paramInt)
      return; 
    StringBuilder stringBuilder = new StringBuilder(37);
    stringBuilder.append("Overread allowed size end=");
    stringBuilder.append(paramInt);
    throw new ParseException(stringBuilder.toString(), paramParcel);
  }
  
  public static int v(int paramInt) {
    return paramInt & 0xFFFF;
  }
  
  public static boolean w(Parcel paramParcel, int paramInt) {
    L(paramParcel, paramInt, 4);
    return (paramParcel.readInt() != 0);
  }
  
  public static Boolean x(Parcel paramParcel, int paramInt) {
    boolean bool;
    int i = I(paramParcel, paramInt);
    if (i == 0)
      return null; 
    M(paramParcel, paramInt, i, 4);
    if (paramParcel.readInt() != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return Boolean.valueOf(bool);
  }
  
  public static double y(Parcel paramParcel, int paramInt) {
    L(paramParcel, paramInt, 8);
    return paramParcel.readDouble();
  }
  
  public static Double z(Parcel paramParcel, int paramInt) {
    int i = I(paramParcel, paramInt);
    if (i == 0)
      return null; 
    M(paramParcel, paramInt, i, 8);
    return Double.valueOf(paramParcel.readDouble());
  }
  
  public static class ParseException extends RuntimeException {
    public ParseException(String param1String, Parcel param1Parcel) {
      super(stringBuilder.toString());
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/internal/safeparcel/SafeParcelReader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */