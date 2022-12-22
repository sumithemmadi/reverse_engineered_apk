package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class ux implements wz {
  private static Logger a = Logger.getLogger(ux.class.getName());
  
  private ThreadLocal<ByteBuffer> b = new w00(this);
  
  public final a50 a(l82 paraml82, z30 paramz30) {
    long l = paraml82.K();
    ((ByteBuffer)this.b.get()).rewind().limit(8);
    while (true) {
      StringBuilder stringBuilder;
      Logger logger;
      byte[] arrayOfByte;
      String str2;
      int i = paraml82.read(this.b.get());
      if (i != 8) {
        if (i >= 0)
          continue; 
        paraml82.D(l);
        throw new EOFException();
      } 
      ((ByteBuffer)this.b.get()).rewind();
      l = x10.b(this.b.get());
      Level level = null;
      if (l < 8L && l > 1L) {
        logger = a;
        level = Level.SEVERE;
        stringBuilder = new StringBuilder(80);
        stringBuilder.append("Plausibility check failed: size < 8 (size = ");
        stringBuilder.append(l);
        stringBuilder.append("). Stop parsing!");
        logger.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", stringBuilder.toString());
        return null;
      } 
      String str1 = x10.g(this.b.get());
      if (l == 1L) {
        ((ByteBuffer)this.b.get()).limit(16);
        stringBuilder.read(this.b.get());
        ((ByteBuffer)this.b.get()).position(8);
        l = x10.d(this.b.get()) - 16L;
      } else if (l == 0L) {
        l = stringBuilder.size() - stringBuilder.K();
      } else {
        l -= 8L;
      } 
      long l1 = l;
      if ("uuid".equals(str1)) {
        ((ByteBuffer)this.b.get()).limit(((ByteBuffer)this.b.get()).limit() + 16);
        stringBuilder.read(this.b.get());
        arrayOfByte = new byte[16];
        for (i = ((ByteBuffer)this.b.get()).position() - 16; i < ((ByteBuffer)this.b.get()).position(); i++)
          arrayOfByte[i - ((ByteBuffer)this.b.get()).position() - 16] = ((ByteBuffer)this.b.get()).get(i); 
        l1 = l - 16L;
      } 
      if (logger instanceof a50) {
        str2 = ((a50)logger).l();
      } else {
        str2 = "";
      } 
      a50 a50 = b(str1, arrayOfByte, str2);
      a50.d((z30)logger);
      ((ByteBuffer)this.b.get()).rewind();
      a50.c((l82)stringBuilder, this.b.get(), l1, this);
      return a50;
    } 
  }
  
  public abstract a50 b(String paramString1, byte[] paramArrayOfbyte, String paramString2);
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ux.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */