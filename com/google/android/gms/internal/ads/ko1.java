package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Base64;
import com.google.android.gms.ads.v.a;
import java.nio.ByteBuffer;
import java.util.UUID;

final class ko1 implements lo1 {
  private static final zzcf$zza a = zzcf$zza.A0();
  
  public final zzcf$zza a() {
    return a;
  }
  
  public final zzcf$zza b(Context paramContext) {
    zzcf$zza.a a1 = zzcf$zza.z0();
    a a = new a(paramContext);
    a.f();
    a.a a2 = a.c();
    String str2 = a2.a();
    String str1 = str2;
    if (str2 != null) {
      str1 = str2;
      if (str2.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
        UUID uUID = UUID.fromString(str2);
        byte[] arrayOfByte = new byte[16];
        ByteBuffer byteBuffer = ByteBuffer.wrap(arrayOfByte);
        byteBuffer.putLong(uUID.getMostSignificantBits());
        byteBuffer.putLong(uUID.getLeastSignificantBits());
        str1 = Base64.encodeToString(arrayOfByte, 11);
      } 
    } 
    if (str1 != null) {
      a1.F(str1);
      a1.Y(a2.b());
      a1.W(zzcf$zza.zzc.g);
    } 
    return (zzcf$zza)a1.h();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ko1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */