package com.bumptech.glide.load.j.g;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.b;
import com.bumptech.glide.load.e;
import com.bumptech.glide.load.engine.s;
import com.bumptech.glide.load.engine.x.b;
import com.bumptech.glide.load.f;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public class j implements f<InputStream, c> {
  private final List<ImageHeaderParser> a;
  
  private final f<ByteBuffer, c> b;
  
  private final b c;
  
  public j(List<ImageHeaderParser> paramList, f<ByteBuffer, c> paramf, b paramb) {
    this.a = paramList;
    this.b = paramf;
    this.c = paramb;
  }
  
  private static byte[] e(InputStream paramInputStream) {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
    try {
      byte[] arrayOfByte = new byte[16384];
      while (true) {
        int i = paramInputStream.read(arrayOfByte);
        if (i != -1) {
          byteArrayOutputStream.write(arrayOfByte, 0, i);
          continue;
        } 
        byteArrayOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
      } 
    } catch (IOException iOException) {
      if (Log.isLoggable("StreamGifDecoder", 5))
        Log.w("StreamGifDecoder", "Error reading data from stream", iOException); 
      return null;
    } 
  }
  
  public s<c> c(InputStream paramInputStream, int paramInt1, int paramInt2, e parame) {
    byte[] arrayOfByte = e(paramInputStream);
    if (arrayOfByte == null)
      return null; 
    ByteBuffer byteBuffer = ByteBuffer.wrap(arrayOfByte);
    return this.b.b(byteBuffer, paramInt1, paramInt2, parame);
  }
  
  public boolean d(InputStream paramInputStream, e parame) {
    boolean bool;
    if (!((Boolean)parame.c(i.b)).booleanValue() && b.e(this.a, paramInputStream, this.c) == ImageHeaderParser.ImageType.GIF) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/j/g/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */