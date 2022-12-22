package com.allinone.callerid.util;

import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.zip.GZIPOutputStream;

public class i0 {
  private static final byte[] a = new byte[] { 
      65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 
      75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 
      85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 
      101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 
      111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 
      121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 
      56, 57, 43, 47 };
  
  private static final byte[] b = new byte[] { 
      -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, 
      -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, 
      -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
      -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, 
      -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 
      54, 55, 56, 57, 58, 59, 60, 61, -9, -9, 
      -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 
      5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 
      15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 
      25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 
      29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 
      39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 
      49, 50, 51, -9, -9, -9, -9, -9, -9, -9, 
      -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
      -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
      -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
      -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
      -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
      -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
      -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
      -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
      -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
      -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
      -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
      -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
      -9, -9, -9, -9, -9, -9 };
  
  private static final byte[] c = new byte[] { 
      65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 
      75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 
      85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 
      101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 
      111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 
      121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 
      56, 57, 45, 95 };
  
  private static final byte[] d = new byte[] { 
      -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, 
      -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, 
      -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
      -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, 
      -9, -9, -9, -9, -9, 62, -9, -9, 52, 53, 
      54, 55, 56, 57, 58, 59, 60, 61, -9, -9, 
      -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 
      5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 
      15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 
      25, -9, -9, -9, -9, 63, -9, 26, 27, 28, 
      29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 
      39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 
      49, 50, 51, -9, -9, -9, -9, -9, -9, -9, 
      -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
      -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
      -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
      -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
      -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
      -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
      -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
      -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
      -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
      -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
      -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
      -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
      -9, -9, -9, -9, -9, -9 };
  
  private static final byte[] e = new byte[] { 
      45, 48, 49, 50, 51, 52, 53, 54, 55, 56, 
      57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 
      74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 
      84, 85, 86, 87, 88, 89, 90, 95, 97, 98, 
      99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 
      109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 
      119, 120, 121, 122 };
  
  private static final byte[] f = new byte[] { 
      -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, 
      -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, 
      -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
      -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, 
      -9, -9, -9, -9, -9, 0, -9, -9, 1, 2, 
      3, 4, 5, 6, 7, 8, 9, 10, -9, -9, 
      -9, -1, -9, -9, -9, 11, 12, 13, 14, 15, 
      16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 
      26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 
      36, -9, -9, -9, -9, 37, -9, 38, 39, 40, 
      41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 
      51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 
      61, 62, 63, -9, -9, -9, -9, -9, -9, -9, 
      -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
      -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
      -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
      -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
      -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
      -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
      -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
      -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
      -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
      -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
      -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
      -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
      -9, -9, -9, -9, -9, -9, -9 };
  
  public static byte[] d(String paramString) {
    return e(paramString, 0);
  }
  
  public static byte[] e(String paramString, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: ifnull -> 316
    //   4: aload_0
    //   5: ldc 'US-ASCII'
    //   7: invokevirtual getBytes : (Ljava/lang/String;)[B
    //   10: astore_2
    //   11: aload_2
    //   12: astore_0
    //   13: goto -> 22
    //   16: astore_2
    //   17: aload_0
    //   18: invokevirtual getBytes : ()[B
    //   21: astore_0
    //   22: aload_0
    //   23: iconst_0
    //   24: aload_0
    //   25: arraylength
    //   26: iload_1
    //   27: invokestatic f : ([BIII)[B
    //   30: astore_3
    //   31: iload_1
    //   32: iconst_4
    //   33: iand
    //   34: ifeq -> 42
    //   37: iconst_1
    //   38: istore_1
    //   39: goto -> 44
    //   42: iconst_0
    //   43: istore_1
    //   44: aload_3
    //   45: astore #4
    //   47: aload_3
    //   48: ifnull -> 313
    //   51: aload_3
    //   52: astore #4
    //   54: aload_3
    //   55: arraylength
    //   56: iconst_4
    //   57: if_icmplt -> 313
    //   60: aload_3
    //   61: astore #4
    //   63: iload_1
    //   64: ifne -> 313
    //   67: aload_3
    //   68: astore #4
    //   70: ldc 35615
    //   72: aload_3
    //   73: iconst_0
    //   74: baload
    //   75: sipush #255
    //   78: iand
    //   79: aload_3
    //   80: iconst_1
    //   81: baload
    //   82: bipush #8
    //   84: ishl
    //   85: ldc 65280
    //   87: iand
    //   88: ior
    //   89: if_icmpne -> 313
    //   92: sipush #2048
    //   95: newarray byte
    //   97: astore #4
    //   99: aconst_null
    //   100: astore_0
    //   101: aconst_null
    //   102: astore #5
    //   104: new java/io/ByteArrayOutputStream
    //   107: astore #6
    //   109: aload #6
    //   111: invokespecial <init> : ()V
    //   114: new java/io/ByteArrayInputStream
    //   117: astore_0
    //   118: aload_0
    //   119: aload_3
    //   120: invokespecial <init> : ([B)V
    //   123: new java/util/zip/GZIPInputStream
    //   126: astore_2
    //   127: aload_2
    //   128: aload_0
    //   129: invokespecial <init> : (Ljava/io/InputStream;)V
    //   132: aload_2
    //   133: aload #4
    //   135: invokevirtual read : ([B)I
    //   138: istore_1
    //   139: iload_1
    //   140: iflt -> 155
    //   143: aload #6
    //   145: aload #4
    //   147: iconst_0
    //   148: iload_1
    //   149: invokevirtual write : ([BII)V
    //   152: goto -> 132
    //   155: aload #6
    //   157: invokevirtual toByteArray : ()[B
    //   160: astore #7
    //   162: aload_0
    //   163: astore #8
    //   165: aload_2
    //   166: astore #5
    //   168: aload #7
    //   170: astore #4
    //   172: aload #6
    //   174: invokevirtual close : ()V
    //   177: aload #7
    //   179: astore #4
    //   181: aload_2
    //   182: invokevirtual close : ()V
    //   185: aload_0
    //   186: invokevirtual close : ()V
    //   189: goto -> 313
    //   192: astore_3
    //   193: aload_0
    //   194: astore #4
    //   196: aload_3
    //   197: astore_0
    //   198: goto -> 231
    //   201: astore #4
    //   203: goto -> 242
    //   206: astore_3
    //   207: aconst_null
    //   208: astore_2
    //   209: aload_0
    //   210: astore #4
    //   212: aload_3
    //   213: astore_0
    //   214: goto -> 231
    //   217: astore #4
    //   219: aconst_null
    //   220: astore_2
    //   221: goto -> 242
    //   224: astore_0
    //   225: aconst_null
    //   226: astore #4
    //   228: aload #4
    //   230: astore_2
    //   231: aload_0
    //   232: astore_3
    //   233: goto -> 297
    //   236: astore #4
    //   238: aconst_null
    //   239: astore_0
    //   240: aload_0
    //   241: astore_2
    //   242: goto -> 268
    //   245: astore_3
    //   246: aconst_null
    //   247: astore #4
    //   249: aload #4
    //   251: astore_2
    //   252: aload_0
    //   253: astore #6
    //   255: goto -> 297
    //   258: astore #4
    //   260: aconst_null
    //   261: astore_0
    //   262: aload_0
    //   263: astore_2
    //   264: aload #5
    //   266: astore #6
    //   268: aload #4
    //   270: invokevirtual printStackTrace : ()V
    //   273: aload_0
    //   274: astore #8
    //   276: aload_2
    //   277: astore #5
    //   279: aload_3
    //   280: astore #4
    //   282: aload #6
    //   284: invokevirtual close : ()V
    //   287: aload_3
    //   288: astore #4
    //   290: goto -> 181
    //   293: astore_3
    //   294: aload_0
    //   295: astore #4
    //   297: aload #6
    //   299: invokevirtual close : ()V
    //   302: aload_2
    //   303: invokevirtual close : ()V
    //   306: aload #4
    //   308: invokevirtual close : ()V
    //   311: aload_3
    //   312: athrow
    //   313: aload #4
    //   315: areturn
    //   316: new java/lang/NullPointerException
    //   319: dup
    //   320: ldc 'Input string was null.'
    //   322: invokespecial <init> : (Ljava/lang/String;)V
    //   325: astore_0
    //   326: goto -> 331
    //   329: aload_0
    //   330: athrow
    //   331: goto -> 329
    //   334: astore_0
    //   335: aload #8
    //   337: astore_0
    //   338: aload #5
    //   340: astore_2
    //   341: goto -> 181
    //   344: astore_2
    //   345: goto -> 185
    //   348: astore_0
    //   349: goto -> 313
    //   352: astore_0
    //   353: goto -> 302
    //   356: astore_0
    //   357: goto -> 306
    //   360: astore_0
    //   361: goto -> 311
    // Exception table:
    //   from	to	target	type
    //   4	11	16	java/io/UnsupportedEncodingException
    //   104	114	258	java/io/IOException
    //   104	114	245	finally
    //   114	123	236	java/io/IOException
    //   114	123	224	finally
    //   123	132	217	java/io/IOException
    //   123	132	206	finally
    //   132	139	201	java/io/IOException
    //   132	139	192	finally
    //   143	152	201	java/io/IOException
    //   143	152	192	finally
    //   155	162	201	java/io/IOException
    //   155	162	192	finally
    //   172	177	334	java/lang/Exception
    //   181	185	344	java/lang/Exception
    //   185	189	348	java/lang/Exception
    //   268	273	293	finally
    //   282	287	334	java/lang/Exception
    //   297	302	352	java/lang/Exception
    //   302	306	356	java/lang/Exception
    //   306	311	360	java/lang/Exception
  }
  
  public static byte[] f(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3) {
    if (paramArrayOfbyte != null) {
      StringBuilder stringBuilder;
      if (paramInt1 >= 0) {
        int i = paramInt1 + paramInt2;
        if (i <= paramArrayOfbyte.length) {
          if (paramInt2 == 0)
            return new byte[0]; 
          if (paramInt2 >= 4) {
            byte[] arrayOfByte1 = n(paramInt3);
            byte[] arrayOfByte2 = new byte[paramInt2 * 3 / 4];
            byte[] arrayOfByte3 = new byte[4];
            int j = 0;
            paramInt2 = 0;
            int k = paramInt1;
            paramInt1 = paramInt2;
            while (true) {
              paramInt2 = paramInt1;
              if (k < i) {
                byte b = arrayOfByte1[paramArrayOfbyte[k] & 0xFF];
                if (b >= -5) {
                  paramInt2 = j;
                  int m = paramInt1;
                  if (b >= -1) {
                    paramInt2 = j + 1;
                    arrayOfByte3[j] = (byte)paramArrayOfbyte[k];
                    if (paramInt2 > 3) {
                      m = paramInt1 + g(arrayOfByte3, 0, arrayOfByte2, paramInt1, paramInt3);
                      if (paramArrayOfbyte[k] == 61) {
                        paramInt2 = m;
                        break;
                      } 
                      paramInt2 = 0;
                    } else {
                      m = paramInt1;
                    } 
                  } 
                  k++;
                  j = paramInt2;
                  paramInt1 = m;
                  continue;
                } 
                throw new IOException(String.format("Bad Base64 input character decimal %d in array position %d", new Object[] { Integer.valueOf(paramArrayOfbyte[k] & 0xFF), Integer.valueOf(k) }));
              } 
              break;
            } 
            paramArrayOfbyte = new byte[paramInt2];
            System.arraycopy(arrayOfByte2, 0, paramArrayOfbyte, 0, paramInt2);
            return paramArrayOfbyte;
          } 
          stringBuilder = new StringBuilder();
          stringBuilder.append("Base64-encoded string must have at least four characters, but length specified was ");
          stringBuilder.append(paramInt2);
          throw new IllegalArgumentException(stringBuilder.toString());
        } 
      } 
      throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and process %d bytes.", new Object[] { Integer.valueOf(stringBuilder.length), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }));
    } 
    NullPointerException nullPointerException = new NullPointerException("Cannot decode null source array.");
    throw nullPointerException;
  }
  
  private static int g(byte[] paramArrayOfbyte1, int paramInt1, byte[] paramArrayOfbyte2, int paramInt2, int paramInt3) {
    if (paramArrayOfbyte1 != null) {
      if (paramArrayOfbyte2 != null) {
        if (paramInt1 >= 0) {
          int i = paramInt1 + 3;
          if (i < paramArrayOfbyte1.length) {
            if (paramInt2 >= 0) {
              int j = paramInt2 + 2;
              if (j < paramArrayOfbyte2.length) {
                byte[] arrayOfByte = n(paramInt3);
                paramInt3 = paramInt1 + 2;
                if (paramArrayOfbyte1[paramInt3] == 61) {
                  paramInt3 = arrayOfByte[paramArrayOfbyte1[paramInt1]];
                  paramArrayOfbyte2[paramInt2] = (byte)(byte)(((arrayOfByte[paramArrayOfbyte1[paramInt1 + 1]] & 0xFF) << 12 | (paramInt3 & 0xFF) << 18) >>> 16);
                  return 1;
                } 
                if (paramArrayOfbyte1[i] == 61) {
                  j = arrayOfByte[paramArrayOfbyte1[paramInt1]];
                  paramInt1 = arrayOfByte[paramArrayOfbyte1[paramInt1 + 1]];
                  paramInt1 = (arrayOfByte[paramArrayOfbyte1[paramInt3]] & 0xFF) << 6 | (paramInt1 & 0xFF) << 12 | (j & 0xFF) << 18;
                  paramArrayOfbyte2[paramInt2] = (byte)(byte)(paramInt1 >>> 16);
                  paramArrayOfbyte2[paramInt2 + 1] = (byte)(byte)(paramInt1 >>> 8);
                  return 2;
                } 
                byte b = arrayOfByte[paramArrayOfbyte1[paramInt1]];
                paramInt1 = arrayOfByte[paramArrayOfbyte1[paramInt1 + 1]];
                paramInt3 = arrayOfByte[paramArrayOfbyte1[paramInt3]];
                paramInt1 = arrayOfByte[paramArrayOfbyte1[i]] & 0xFF | (paramInt1 & 0xFF) << 12 | (b & 0xFF) << 18 | (paramInt3 & 0xFF) << 6;
                paramArrayOfbyte2[paramInt2] = (byte)(byte)(paramInt1 >> 16);
                paramArrayOfbyte2[paramInt2 + 1] = (byte)(byte)(paramInt1 >> 8);
                paramArrayOfbyte2[j] = (byte)(byte)paramInt1;
                return 3;
              } 
            } 
            throw new IllegalArgumentException(String.format("Destination array with length %d cannot have offset of %d and still store three bytes.", new Object[] { Integer.valueOf(paramArrayOfbyte2.length), Integer.valueOf(paramInt2) }));
          } 
        } 
        throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and still process four bytes.", new Object[] { Integer.valueOf(paramArrayOfbyte1.length), Integer.valueOf(paramInt1) }));
      } 
      throw new NullPointerException("Destination array was null.");
    } 
    throw new NullPointerException("Source array was null.");
  }
  
  private static byte[] h(byte[] paramArrayOfbyte1, int paramInt1, int paramInt2, byte[] paramArrayOfbyte2, int paramInt3, int paramInt4) {
    byte b;
    byte[] arrayOfByte = m(paramInt4);
    int i = 0;
    if (paramInt2 > 0) {
      paramInt4 = paramArrayOfbyte1[paramInt1] << 24 >>> 8;
    } else {
      paramInt4 = 0;
    } 
    if (paramInt2 > 1) {
      b = paramArrayOfbyte1[paramInt1 + 1] << 24 >>> 16;
    } else {
      b = 0;
    } 
    if (paramInt2 > 2)
      i = paramArrayOfbyte1[paramInt1 + 2] << 24 >>> 24; 
    paramInt1 = paramInt4 | b | i;
    if (paramInt2 != 1) {
      if (paramInt2 != 2) {
        if (paramInt2 != 3)
          return paramArrayOfbyte2; 
        paramArrayOfbyte2[paramInt3] = (byte)arrayOfByte[paramInt1 >>> 18];
        paramArrayOfbyte2[paramInt3 + 1] = (byte)arrayOfByte[paramInt1 >>> 12 & 0x3F];
        paramArrayOfbyte2[paramInt3 + 2] = (byte)arrayOfByte[paramInt1 >>> 6 & 0x3F];
        paramArrayOfbyte2[paramInt3 + 3] = (byte)arrayOfByte[paramInt1 & 0x3F];
        return paramArrayOfbyte2;
      } 
      paramArrayOfbyte2[paramInt3] = (byte)arrayOfByte[paramInt1 >>> 18];
      paramArrayOfbyte2[paramInt3 + 1] = (byte)arrayOfByte[paramInt1 >>> 12 & 0x3F];
      paramArrayOfbyte2[paramInt3 + 2] = (byte)arrayOfByte[paramInt1 >>> 6 & 0x3F];
      paramArrayOfbyte2[paramInt3 + 3] = (byte)61;
      return paramArrayOfbyte2;
    } 
    paramArrayOfbyte2[paramInt3] = (byte)arrayOfByte[paramInt1 >>> 18];
    paramArrayOfbyte2[paramInt3 + 1] = (byte)arrayOfByte[paramInt1 >>> 12 & 0x3F];
    paramArrayOfbyte2[paramInt3 + 2] = (byte)61;
    paramArrayOfbyte2[paramInt3 + 3] = (byte)61;
    return paramArrayOfbyte2;
  }
  
  private static byte[] i(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt1, int paramInt2) {
    h(paramArrayOfbyte2, 0, paramInt1, paramArrayOfbyte1, 0, paramInt2);
    return paramArrayOfbyte1;
  }
  
  public static String j(byte[] paramArrayOfbyte) {
    try {
      String str = k(paramArrayOfbyte, 0, paramArrayOfbyte.length, 0);
    } catch (IOException iOException) {
      iOException = null;
    } 
    return (String)iOException;
  }
  
  public static String k(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3) {
    paramArrayOfbyte = l(paramArrayOfbyte, paramInt1, paramInt2, paramInt3);
    try {
      return new String(paramArrayOfbyte, "US-ASCII");
    } catch (UnsupportedEncodingException unsupportedEncodingException) {
      return new String(paramArrayOfbyte);
    } 
  }
  
  public static byte[] l(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3) {
    if (paramArrayOfbyte != null) {
      if (paramInt1 >= 0) {
        if (paramInt2 >= 0) {
          byte[] arrayOfByte;
          if (paramInt1 + paramInt2 <= paramArrayOfbyte.length) {
            GZIPOutputStream gZIPOutputStream;
            boolean bool;
            if ((paramInt3 & 0x2) != 0) {
              a a1;
              byte[] arrayOfByte3;
              a a2;
              GZIPOutputStream gZIPOutputStream1 = null;
              GZIPOutputStream gZIPOutputStream2 = null;
              try {
                GZIPOutputStream gZIPOutputStream3;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                this();
              } catch (IOException iOException2) {
                a2 = null;
              } finally {
                paramArrayOfbyte = null;
                a1 = null;
                a2 = a1;
              } 
              try {
                throw gZIPOutputStream2;
              } finally {
                gZIPOutputStream2 = null;
                arrayOfByte3 = paramArrayOfbyte;
              } 
              byte[] arrayOfByte2 = arrayOfByte3;
              try {
                arrayOfByte2.close();
              } catch (Exception exception) {}
              try {
                a2.close();
              } catch (Exception exception) {}
              try {
                a1.close();
              } catch (Exception exception) {}
            } 
            if ((paramInt3 & 0x8) != 0) {
              bool = true;
            } else {
              bool = false;
            } 
            int i = paramInt2 / 3;
            if (paramInt2 % 3 > 0) {
              j = 4;
            } else {
              j = 0;
            } 
            int j = i * 4 + j;
            int k = j;
            if (bool)
              k = j + j / 76; 
            byte[] arrayOfByte1 = new byte[k];
            byte b = 0;
            j = 0;
            i = 0;
            while (b < paramInt2 - 2) {
              h((byte[])gZIPOutputStream, b + paramInt1, 3, arrayOfByte1, j, paramInt3);
              i += 4;
              if (bool && i >= 76) {
                arrayOfByte1[j + 4] = (byte)10;
                j++;
                i = 0;
              } 
              b += 3;
              j += 4;
            } 
            i = j;
            if (b < paramInt2) {
              h((byte[])gZIPOutputStream, b + paramInt1, paramInt2 - b, arrayOfByte1, j, paramInt3);
              i = j + 4;
            } 
            if (i <= k - 1) {
              arrayOfByte = new byte[i];
              System.arraycopy(arrayOfByte1, 0, arrayOfByte, 0, i);
              return arrayOfByte;
            } 
            return arrayOfByte1;
          } 
          throw new IllegalArgumentException(String.format("Cannot have offset of %d and length of %d with array of length %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(arrayOfByte.length) }));
        } 
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("Cannot have length offset: ");
        stringBuilder1.append(paramInt2);
        throw new IllegalArgumentException(stringBuilder1.toString());
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Cannot have negative offset: ");
      stringBuilder.append(paramInt1);
      throw new IllegalArgumentException(stringBuilder.toString());
    } 
    NullPointerException nullPointerException = new NullPointerException("Cannot serialize a null array.");
    throw nullPointerException;
  }
  
  private static final byte[] m(int paramInt) {
    return ((paramInt & 0x10) == 16) ? c : (((paramInt & 0x20) == 32) ? e : a);
  }
  
  private static final byte[] n(int paramInt) {
    return ((paramInt & 0x10) == 16) ? d : (((paramInt & 0x20) == 32) ? f : b);
  }
  
  public static class a extends FilterOutputStream {
    private boolean b;
    
    private int c;
    
    private byte[] d;
    
    private int e;
    
    private int f;
    
    private boolean g;
    
    private byte[] h;
    
    private boolean i;
    
    private int j;
    
    private byte[] k;
    
    public a(OutputStream param1OutputStream, int param1Int) {
      super(param1OutputStream);
      boolean bool2;
      byte b;
      boolean bool1 = true;
      if ((param1Int & 0x8) != 0) {
        bool2 = true;
      } else {
        bool2 = false;
      } 
      this.g = bool2;
      if ((param1Int & 0x1) != 0) {
        bool2 = bool1;
      } else {
        bool2 = false;
      } 
      this.b = bool2;
      if (bool2) {
        b = 3;
      } else {
        b = 4;
      } 
      this.e = b;
      this.d = new byte[b];
      this.c = 0;
      this.f = 0;
      this.i = false;
      this.h = new byte[4];
      this.j = param1Int;
      this.k = i0.a(param1Int);
    }
    
    public void b() {
      int i = this.c;
      if (i > 0)
        if (this.b) {
          this.out.write(i0.c(this.h, this.d, i, this.j));
          this.c = 0;
        } else {
          throw new IOException("Base64 input not properly padded.");
        }  
    }
    
    public void close() {
      b();
      super.close();
      this.d = null;
      this.out = null;
    }
    
    public void write(int param1Int) {
      if (this.i) {
        this.out.write(param1Int);
        return;
      } 
      if (this.b) {
        byte[] arrayOfByte = this.d;
        int i = this.c;
        int j = i + 1;
        this.c = j;
        arrayOfByte[i] = (byte)(byte)param1Int;
        param1Int = this.e;
        if (j >= param1Int) {
          this.out.write(i0.c(this.h, arrayOfByte, param1Int, this.j));
          param1Int = this.f + 4;
          this.f = param1Int;
          if (this.g && param1Int >= 76) {
            this.out.write(10);
            this.f = 0;
          } 
          this.c = 0;
        } 
      } else {
        byte[] arrayOfByte = this.k;
        int i = param1Int & 0x7F;
        if (arrayOfByte[i] > -5) {
          arrayOfByte = this.d;
          i = this.c;
          int j = i + 1;
          this.c = j;
          arrayOfByte[i] = (byte)(byte)param1Int;
          if (j >= this.e) {
            param1Int = i0.b(arrayOfByte, 0, this.h, 0, this.j);
            this.out.write(this.h, 0, param1Int);
            this.c = 0;
          } 
        } else if (arrayOfByte[i] != -5) {
          throw new IOException("Invalid character in Base64 data.");
        } 
      } 
    }
    
    public void write(byte[] param1ArrayOfbyte, int param1Int1, int param1Int2) {
      if (this.i) {
        this.out.write(param1ArrayOfbyte, param1Int1, param1Int2);
        return;
      } 
      for (byte b = 0; b < param1Int2; b++)
        write(param1ArrayOfbyte[param1Int1 + b]); 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/i0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */