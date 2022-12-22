package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Map;

final class zzdxq<K, V> extends zzdxh<K, V> {
  private static final zzdxh<Object, Object> f = new zzdxq(null, new Object[0], 0);
  
  private final transient Object g;
  
  private final transient Object[] h;
  
  private final transient int i;
  
  private zzdxq(Object paramObject, Object[] paramArrayOfObject, int paramInt) {
    this.g = paramObject;
    this.h = paramArrayOfObject;
    this.i = paramInt;
  }
  
  private static IllegalArgumentException a(Object paramObject1, Object paramObject2, Object[] paramArrayOfObject, int paramInt) {
    paramObject1 = String.valueOf(paramObject1);
    String str1 = String.valueOf(paramObject2);
    paramObject2 = String.valueOf(paramArrayOfObject[paramInt]);
    String str2 = String.valueOf(paramArrayOfObject[paramInt ^ 0x1]);
    StringBuilder stringBuilder = new StringBuilder(paramObject1.length() + 39 + str1.length() + paramObject2.length() + str2.length());
    stringBuilder.append("Multiple entries with same key: ");
    stringBuilder.append((String)paramObject1);
    stringBuilder.append("=");
    stringBuilder.append(str1);
    stringBuilder.append(" and ");
    stringBuilder.append((String)paramObject2);
    stringBuilder.append("=");
    stringBuilder.append(str2);
    return new IllegalArgumentException(stringBuilder.toString());
  }
  
  static <K, V> zzdxq<K, V> zzc(int paramInt, Object[] paramArrayOfObject) {
    if (paramInt == 0)
      return (zzdxq)f; 
    Object object = null;
    int i = 0;
    int j = 0;
    int k = 0;
    if (paramInt == 1) {
      ir1.a(paramArrayOfObject[0], paramArrayOfObject[1]);
      return new zzdxq<K, V>(null, paramArrayOfObject, 1);
    } 
    xq1.i(paramInt, paramArrayOfObject.length >> 1);
    int m = zzdxg.zzer(paramInt);
    if (paramInt == 1) {
      ir1.a(paramArrayOfObject[0], paramArrayOfObject[1]);
    } else {
      int n = m - 1;
      if (m <= 128) {
        byte[] arrayOfByte = new byte[m];
        Arrays.fill(arrayOfByte, (byte)-1);
        label57: while (true) {
          object = arrayOfByte;
          if (k < paramInt) {
            j = k * 2;
            Object object2 = paramArrayOfObject[j];
            Object object1 = paramArrayOfObject[j ^ 0x1];
            ir1.a(object2, object1);
            i = jr1.a(object2.hashCode());
            while (true) {
              i &= n;
              m = arrayOfByte[i] & 0xFF;
              if (m == 255) {
                arrayOfByte[i] = (byte)(byte)j;
                k++;
                continue label57;
              } 
              if (!paramArrayOfObject[m].equals(object2)) {
                i++;
                continue;
              } 
              throw a(object2, object1, paramArrayOfObject, m);
            } 
          } 
          break;
        } 
      } else if (m <= 32768) {
        short[] arrayOfShort = new short[m];
        Arrays.fill(arrayOfShort, (short)-1);
        k = i;
        label58: while (true) {
          short[] arrayOfShort1 = arrayOfShort;
          if (k < paramInt) {
            j = k * 2;
            Object object2 = paramArrayOfObject[j];
            Object object1 = paramArrayOfObject[j ^ 0x1];
            ir1.a(object2, object1);
            i = jr1.a(object2.hashCode());
            while (true) {
              m = i & n;
              i = arrayOfShort[m] & 0xFFFF;
              if (i == 65535) {
                arrayOfShort[m] = (short)(short)j;
                k++;
                continue label58;
              } 
              if (!paramArrayOfObject[i].equals(object2)) {
                i = m + 1;
                continue;
              } 
              throw a(object2, object1, paramArrayOfObject, i);
            } 
          } 
          break;
        } 
      } else {
        int[] arrayOfInt = new int[m];
        Arrays.fill(arrayOfInt, -1);
        k = j;
        label59: while (true) {
          int[] arrayOfInt1 = arrayOfInt;
          if (k < paramInt) {
            j = k * 2;
            Object object1 = paramArrayOfObject[j];
            object = paramArrayOfObject[j ^ 0x1];
            ir1.a(object1, object);
            i = jr1.a(object1.hashCode());
            while (true) {
              m = i & n;
              i = arrayOfInt[m];
              if (i == -1) {
                arrayOfInt[m] = j;
                k++;
                continue label59;
              } 
              if (!paramArrayOfObject[i].equals(object1)) {
                i = m + 1;
                continue;
              } 
              throw a(object1, object, paramArrayOfObject, i);
            } 
          } 
          break;
        } 
      } 
    } 
    return new zzdxq<K, V>(object, paramArrayOfObject, paramInt);
  }
  
  public final V get(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: getfield g : Ljava/lang/Object;
    //   4: astore_2
    //   5: aload_0
    //   6: getfield h : [Ljava/lang/Object;
    //   9: astore_3
    //   10: aload_0
    //   11: getfield i : I
    //   14: istore #4
    //   16: aload_1
    //   17: ifnonnull -> 22
    //   20: aconst_null
    //   21: areturn
    //   22: iload #4
    //   24: iconst_1
    //   25: if_icmpne -> 44
    //   28: aload_3
    //   29: iconst_0
    //   30: aaload
    //   31: aload_1
    //   32: invokevirtual equals : (Ljava/lang/Object;)Z
    //   35: ifeq -> 42
    //   38: aload_3
    //   39: iconst_1
    //   40: aaload
    //   41: areturn
    //   42: aconst_null
    //   43: areturn
    //   44: aload_2
    //   45: ifnonnull -> 50
    //   48: aconst_null
    //   49: areturn
    //   50: aload_2
    //   51: instanceof [B
    //   54: ifeq -> 128
    //   57: aload_2
    //   58: checkcast [B
    //   61: astore_2
    //   62: aload_2
    //   63: arraylength
    //   64: istore #5
    //   66: aload_1
    //   67: invokevirtual hashCode : ()I
    //   70: invokestatic a : (I)I
    //   73: istore #4
    //   75: iload #4
    //   77: iload #5
    //   79: iconst_1
    //   80: isub
    //   81: iand
    //   82: istore #4
    //   84: aload_2
    //   85: iload #4
    //   87: baload
    //   88: sipush #255
    //   91: iand
    //   92: istore #6
    //   94: iload #6
    //   96: sipush #255
    //   99: if_icmpne -> 104
    //   102: aconst_null
    //   103: areturn
    //   104: aload_3
    //   105: iload #6
    //   107: aaload
    //   108: aload_1
    //   109: invokevirtual equals : (Ljava/lang/Object;)Z
    //   112: ifeq -> 122
    //   115: aload_3
    //   116: iload #6
    //   118: iconst_1
    //   119: ixor
    //   120: aaload
    //   121: areturn
    //   122: iinc #4, 1
    //   125: goto -> 75
    //   128: aload_2
    //   129: instanceof [S
    //   132: ifeq -> 207
    //   135: aload_2
    //   136: checkcast [S
    //   139: astore_2
    //   140: aload_2
    //   141: arraylength
    //   142: istore #5
    //   144: aload_1
    //   145: invokevirtual hashCode : ()I
    //   148: invokestatic a : (I)I
    //   151: istore #4
    //   153: iload #4
    //   155: iload #5
    //   157: iconst_1
    //   158: isub
    //   159: iand
    //   160: istore #6
    //   162: aload_2
    //   163: iload #6
    //   165: saload
    //   166: ldc 65535
    //   168: iand
    //   169: istore #4
    //   171: iload #4
    //   173: ldc 65535
    //   175: if_icmpne -> 180
    //   178: aconst_null
    //   179: areturn
    //   180: aload_3
    //   181: iload #4
    //   183: aaload
    //   184: aload_1
    //   185: invokevirtual equals : (Ljava/lang/Object;)Z
    //   188: ifeq -> 198
    //   191: aload_3
    //   192: iload #4
    //   194: iconst_1
    //   195: ixor
    //   196: aaload
    //   197: areturn
    //   198: iload #6
    //   200: iconst_1
    //   201: iadd
    //   202: istore #4
    //   204: goto -> 153
    //   207: aload_2
    //   208: checkcast [I
    //   211: astore_2
    //   212: aload_2
    //   213: arraylength
    //   214: istore #5
    //   216: aload_1
    //   217: invokevirtual hashCode : ()I
    //   220: invokestatic a : (I)I
    //   223: istore #4
    //   225: iload #4
    //   227: iload #5
    //   229: iconst_1
    //   230: isub
    //   231: iand
    //   232: istore #6
    //   234: aload_2
    //   235: iload #6
    //   237: iaload
    //   238: istore #4
    //   240: iload #4
    //   242: iconst_m1
    //   243: if_icmpne -> 248
    //   246: aconst_null
    //   247: areturn
    //   248: aload_3
    //   249: iload #4
    //   251: aaload
    //   252: aload_1
    //   253: invokevirtual equals : (Ljava/lang/Object;)Z
    //   256: ifeq -> 266
    //   259: aload_3
    //   260: iload #4
    //   262: iconst_1
    //   263: ixor
    //   264: aaload
    //   265: areturn
    //   266: iload #6
    //   268: iconst_1
    //   269: iadd
    //   270: istore #4
    //   272: goto -> 225
  }
  
  public final int size() {
    return this.i;
  }
  
  final zzdxg<Map.Entry<K, V>> zzazp() {
    return new zzdxt<K, V>(this, this.h, 0, this.i);
  }
  
  final zzdxg<K> zzazq() {
    return new zzdxv<K>(this, new zzdxu(this.h, 0, this.i));
  }
  
  final zzdwy<V> zzazr() {
    return new zzdxu(this.h, 1, this.i);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzdxq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */