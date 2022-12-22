package com.google.android.gms.internal.ads;

final class c72 {
  static String a(zzejr paramzzejr) {
    g72 g72 = new g72(paramzzejr);
    StringBuilder stringBuilder = new StringBuilder(g72.size());
    for (byte b = 0; b < g72.size(); b++) {
      byte b1 = g72.a(b);
      if (b1 != 34) {
        if (b1 != 39) {
          if (b1 != 92) {
            switch (b1) {
              default:
                if (b1 >= 32 && b1 <= 126) {
                  stringBuilder.append((char)b1);
                  break;
                } 
                stringBuilder.append('\\');
                stringBuilder.append((char)((b1 >>> 6 & 0x3) + 48));
                stringBuilder.append((char)((b1 >>> 3 & 0x7) + 48));
                stringBuilder.append((char)((b1 & 0x7) + 48));
                break;
              case 13:
                stringBuilder.append("\\r");
                break;
              case 12:
                stringBuilder.append("\\f");
                break;
              case 11:
                stringBuilder.append("\\v");
                break;
              case 10:
                stringBuilder.append("\\n");
                break;
              case 9:
                stringBuilder.append("\\t");
                break;
              case 8:
                stringBuilder.append("\\b");
                break;
              case 7:
                stringBuilder.append("\\a");
                break;
            } 
          } else {
            stringBuilder.append("\\\\");
          } 
        } else {
          stringBuilder.append("\\'");
        } 
      } else {
        stringBuilder.append("\\\"");
      } 
    } 
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/c72.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */