package com.google.android.gms.internal.ads;

final class ir1 {
  static void a(Object paramObject1, Object paramObject2) {
    if (paramObject1 != null) {
      if (paramObject2 != null)
        return; 
      paramObject2 = String.valueOf(paramObject1);
      paramObject1 = new StringBuilder(paramObject2.length() + 26);
      paramObject1.append("null value in entry: ");
      paramObject1.append((String)paramObject2);
      paramObject1.append("=null");
      throw new NullPointerException(paramObject1.toString());
    } 
    paramObject1 = String.valueOf(paramObject2);
    paramObject2 = new StringBuilder(paramObject1.length() + 24);
    paramObject2.append("null key in entry: null=");
    paramObject2.append((String)paramObject1);
    throw new NullPointerException(paramObject2.toString());
  }
  
  static int b(int paramInt, String paramString) {
    if (paramInt >= 0)
      return paramInt; 
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(paramString).length() + 40);
    stringBuilder.append(paramString);
    stringBuilder.append(" cannot be negative but was: ");
    stringBuilder.append(paramInt);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ir1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */