package com.google.android.exoplayer2.metadata.icy;

import com.google.android.exoplayer2.b1.e;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.b;
import com.google.android.exoplayer2.metadata.d;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.h0;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class a implements b {
  private static final Pattern a = Pattern.compile("(.+?)='(.*?)';", 32);
  
  private final CharsetDecoder b = Charset.forName("UTF-8").newDecoder();
  
  private final CharsetDecoder c = Charset.forName("ISO-8859-1").newDecoder();
  
  private String b(ByteBuffer paramByteBuffer) {
    try {
      return this.b.decode(paramByteBuffer).toString();
    } catch (CharacterCodingException null) {
      this.b.reset();
    } finally {
      this.b.reset();
      paramByteBuffer.rewind();
    } 
  }
  
  public Metadata a(d paramd) {
    String str2;
    ByteBuffer byteBuffer = (ByteBuffer)e.e(((e)paramd).c);
    String str1 = b(byteBuffer);
    byte[] arrayOfByte = new byte[byteBuffer.limit()];
    byteBuffer.get(arrayOfByte);
    byteBuffer = null;
    if (str1 == null)
      return new Metadata(new Metadata.Entry[] { new IcyInfo(arrayOfByte, null, null) }); 
    Matcher matcher = a.matcher(str1);
    str1 = null;
    int i;
    for (i = 0; matcher.find(i); i = matcher.end()) {
      String str3 = h0.u0(matcher.group(1));
      String str4 = matcher.group(2);
      str3.hashCode();
      if (!str3.equals("streamurl")) {
        if (str3.equals("streamtitle"))
          str2 = str4; 
      } else {
        str1 = str4;
      } 
    } 
    return new Metadata(new Metadata.Entry[] { new IcyInfo(arrayOfByte, str2, str1) });
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/metadata/icy/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */