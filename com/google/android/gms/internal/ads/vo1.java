package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Pattern;

public final class vo1 {
  private final Context a;
  
  private final pn1 b;
  
  public vo1(Context paramContext, pn1 parampn1) {
    this.a = paramContext;
    this.b = parampn1;
  }
  
  public static boolean a(zzgp paramzzgp) {
    int i = uo1.a[paramzzgp.ordinal()];
    return !(i != 1 && i != 2 && i != 3 && i != 4);
  }
  
  private final String b() {
    HashSet hashSet = new HashSet(Arrays.asList((Object[])new String[] { "i686", "armv71" }));
    String str2 = zzdwq.v.value();
    if (!TextUtils.isEmpty(str2) && hashSet.contains(str2))
      return str2; 
    try {
      String[] arrayOfString = (String[])Build.class.getField("SUPPORTED_ABIS").get(null);
      if (arrayOfString != null && arrayOfString.length > 0)
        return arrayOfString[0]; 
    } catch (NoSuchFieldException noSuchFieldException) {
      pn1 pn11 = this.b;
      if (pn11 != null)
        pn11.b(2024, 0L, noSuchFieldException); 
    } catch (IllegalAccessException illegalAccessException) {
      pn1 pn11 = this.b;
      if (pn11 != null)
        pn11.b(2024, 0L, illegalAccessException); 
    } 
    String str1 = Build.CPU_ABI;
    return (str1 != null) ? str1 : Build.CPU_ABI2;
  }
  
  private final zzgp c() {
    pn1 pn11;
    File file = new File(new File((this.a.getApplicationInfo()).dataDir), "lib");
    if (!file.exists()) {
      pn11 = this.b;
      if (pn11 != null)
        pn11.i(5017, "No lib/"); 
      return zzgp.g;
    } 
    File[] arrayOfFile = pn11.listFiles(new cs1(Pattern.compile(".*\\.so$", 2)));
    if (arrayOfFile == null || arrayOfFile.length == 0) {
      pn11 = this.b;
      if (pn11 != null)
        pn11.i(5017, "No .so"); 
      return zzgp.g;
    } 
    try {
      FileInputStream fileInputStream = new FileInputStream();
      this(arrayOfFile[0]);
      try {
        byte[] arrayOfByte = new byte[20];
        if (fileInputStream.read(arrayOfByte) == 20) {
          byte[] arrayOfByte1 = new byte[2];
          arrayOfByte1[0] = (byte)0;
          arrayOfByte1[1] = (byte)0;
          if (arrayOfByte[5] == 2) {
            e(arrayOfByte, null);
            zzgp = zzgp.b;
            return zzgp;
          } 
          zzgp[0] = (byte)arrayOfByte[19];
          zzgp[1] = (byte)arrayOfByte[18];
          short s = ByteBuffer.wrap((byte[])zzgp).getShort();
          if (s != 3) {
            if (s != 40) {
              if (s != 62) {
                if (s != 183) {
                  e(arrayOfByte, null);
                  zzgp = zzgp.b;
                  return zzgp;
                } 
                zzgp = zzgp.e;
                return zzgp;
              } 
              zzgp = zzgp.f;
              return zzgp;
            } 
            zzgp = zzgp.c;
            return zzgp;
          } 
          zzgp zzgp = zzgp.d;
          return zzgp;
        } 
      } finally {
        try {
          fileInputStream.close();
        } finally {
          fileInputStream = null;
        } 
      } 
    } catch (IOException iOException) {
      e(null, iOException.toString());
    } 
    return zzgp.b;
  }
  
  private final void e(byte[] paramArrayOfbyte, String paramString) {
    if (this.b == null)
      return; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("os.arch:");
    stringBuilder.append(zzdwq.v.value());
    stringBuilder.append(";");
    try {
      String[] arrayOfString = (String[])Build.class.getField("SUPPORTED_ABIS").get(null);
      if (arrayOfString != null) {
        stringBuilder.append("supported_abis:");
        stringBuilder.append(Arrays.toString((Object[])arrayOfString));
        stringBuilder.append(";");
      } 
    } catch (NoSuchFieldException|IllegalAccessException noSuchFieldException) {}
    stringBuilder.append("CPU_ABI:");
    stringBuilder.append(Build.CPU_ABI);
    stringBuilder.append(";");
    stringBuilder.append("CPU_ABI2:");
    stringBuilder.append(Build.CPU_ABI2);
    stringBuilder.append(";");
    if (paramArrayOfbyte != null) {
      stringBuilder.append("ELF:");
      stringBuilder.append(Arrays.toString(paramArrayOfbyte));
      stringBuilder.append(";");
    } 
    if (paramString != null) {
      stringBuilder.append("dbg:");
      stringBuilder.append(paramString);
      stringBuilder.append(";");
    } 
    this.b.i(4007, stringBuilder.toString());
  }
  
  public final zzgp d() {
    zzgp zzgp1 = c();
    zzgp zzgp2 = zzgp1;
    if (zzgp1 == zzgp.g) {
      String str = b();
      if (TextUtils.isEmpty(str)) {
        e(null, "Empty dev arch");
        zzgp2 = zzgp.b;
      } else if (zzgp2.equalsIgnoreCase("i686") || zzgp2.equalsIgnoreCase("x86")) {
        zzgp2 = zzgp.d;
      } else if (zzgp2.equalsIgnoreCase("x86_64")) {
        zzgp2 = zzgp.f;
      } else if (zzgp2.equalsIgnoreCase("arm64-v8a")) {
        zzgp2 = zzgp.e;
      } else if (zzgp2.equalsIgnoreCase("armeabi-v7a") || zzgp2.equalsIgnoreCase("armv71")) {
        zzgp2 = zzgp.c;
      } else {
        e(null, (String)zzgp2);
        zzgp2 = zzgp.b;
      } 
    } 
    pn1 pn11 = this.b;
    if (pn11 != null)
      pn11.i(5018, zzgp2.name()); 
    return zzgp2;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/vo1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */