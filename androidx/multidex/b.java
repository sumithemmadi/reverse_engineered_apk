package androidx.multidex;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

final class b {
  static long a(RandomAccessFile paramRandomAccessFile, a parama) {
    CRC32 cRC32 = new CRC32();
    long l = parama.b;
    paramRandomAccessFile.seek(parama.a);
    int i = (int)Math.min(16384L, l);
    byte[] arrayOfByte = new byte[16384];
    for (i = paramRandomAccessFile.read(arrayOfByte, 0, i); i != -1; i = paramRandomAccessFile.read(arrayOfByte, 0, (int)Math.min(16384L, l))) {
      cRC32.update(arrayOfByte, 0, i);
      l -= i;
      if (l == 0L)
        break; 
    } 
    return cRC32.getValue();
  }
  
  static a b(RandomAccessFile paramRandomAccessFile) {
    long l1 = paramRandomAccessFile.length() - 22L;
    long l2 = 0L;
    if (l1 >= 0L) {
      long l = l1 - 65536L;
      if (l >= 0L)
        l2 = l; 
      int i = Integer.reverseBytes(101010256);
      while (true) {
        paramRandomAccessFile.seek(l1);
        if (paramRandomAccessFile.readInt() == i) {
          paramRandomAccessFile.skipBytes(2);
          paramRandomAccessFile.skipBytes(2);
          paramRandomAccessFile.skipBytes(2);
          paramRandomAccessFile.skipBytes(2);
          a a = new a();
          a.b = Integer.reverseBytes(paramRandomAccessFile.readInt()) & 0xFFFFFFFFL;
          a.a = Integer.reverseBytes(paramRandomAccessFile.readInt()) & 0xFFFFFFFFL;
          return a;
        } 
        l1--;
        if (l1 >= l2)
          continue; 
        throw new ZipException("End Of Central Directory signature not found");
      } 
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("File too short to be a zip file: ");
    stringBuilder.append(paramRandomAccessFile.length());
    ZipException zipException = new ZipException(stringBuilder.toString());
    throw zipException;
  }
  
  static long c(File paramFile) {
    RandomAccessFile randomAccessFile = new RandomAccessFile(paramFile, "r");
    try {
      return a(randomAccessFile, b(randomAccessFile));
    } finally {
      randomAccessFile.close();
    } 
  }
  
  static class a {
    long a;
    
    long b;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/multidex/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */