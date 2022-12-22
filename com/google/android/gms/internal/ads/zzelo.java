package com.google.android.gms.internal.ads;

import java.io.IOException;

public class zzelo extends IOException {
  private u52 zzirf = null;
  
  public zzelo(String paramString) {
    super(paramString);
  }
  
  static zzelo zzbja() {
    return new zzelo("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
  }
  
  static zzelo zzbjb() {
    return new zzelo("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
  }
  
  static zzelo zzbjc() {
    return new zzelo("CodedInputStream encountered a malformed varint.");
  }
  
  static zzelo zzbjd() {
    return new zzelo("Protocol message contained an invalid tag (zero).");
  }
  
  static zzelo zzbje() {
    return new zzelo("Protocol message end-group tag did not match expected tag.");
  }
  
  static zzeln zzbjf() {
    return new zzeln("Protocol message tag had invalid wire type.");
  }
  
  static zzelo zzbjg() {
    return new zzelo("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
  }
  
  static zzelo zzbjh() {
    return new zzelo("Failed to parse the message.");
  }
  
  static zzelo zzbji() {
    return new zzelo("Protocol message had invalid UTF-8.");
  }
  
  public final zzelo zzl(u52 paramu52) {
    this.zzirf = paramu52;
    return this;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzelo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */