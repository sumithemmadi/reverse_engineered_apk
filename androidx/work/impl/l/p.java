package androidx.work.impl.l;

import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.WorkInfo;
import androidx.work.c;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Iterator;

public class p {
  public static int a(BackoffPolicy paramBackoffPolicy) {
    int i = a.b[paramBackoffPolicy.ordinal()];
    if (i != 1) {
      if (i == 2)
        return 1; 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Could not convert ");
      stringBuilder.append(paramBackoffPolicy);
      stringBuilder.append(" to int");
      throw new IllegalArgumentException(stringBuilder.toString());
    } 
    return 0;
  }
  
  public static c b(byte[] paramArrayOfbyte) {
    // Byte code:
    //   0: new androidx/work/c
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_1
    //   8: aload_0
    //   9: ifnonnull -> 14
    //   12: aload_1
    //   13: areturn
    //   14: new java/io/ByteArrayInputStream
    //   17: dup
    //   18: aload_0
    //   19: invokespecial <init> : ([B)V
    //   22: astore_2
    //   23: new java/io/ObjectInputStream
    //   26: astore_3
    //   27: aload_3
    //   28: aload_2
    //   29: invokespecial <init> : (Ljava/io/InputStream;)V
    //   32: aload_3
    //   33: astore_0
    //   34: aload_3
    //   35: invokevirtual readInt : ()I
    //   38: istore #4
    //   40: iload #4
    //   42: ifle -> 68
    //   45: aload_3
    //   46: astore_0
    //   47: aload_1
    //   48: aload_3
    //   49: invokevirtual readUTF : ()Ljava/lang/String;
    //   52: invokestatic parse : (Ljava/lang/String;)Landroid/net/Uri;
    //   55: aload_3
    //   56: invokevirtual readBoolean : ()Z
    //   59: invokevirtual a : (Landroid/net/Uri;Z)V
    //   62: iinc #4, -1
    //   65: goto -> 40
    //   68: aload_3
    //   69: invokevirtual close : ()V
    //   72: goto -> 80
    //   75: astore_0
    //   76: aload_0
    //   77: invokevirtual printStackTrace : ()V
    //   80: aload_2
    //   81: invokevirtual close : ()V
    //   84: goto -> 137
    //   87: astore #5
    //   89: goto -> 102
    //   92: astore_3
    //   93: aconst_null
    //   94: astore_0
    //   95: goto -> 140
    //   98: astore #5
    //   100: aconst_null
    //   101: astore_3
    //   102: aload_3
    //   103: astore_0
    //   104: aload #5
    //   106: invokevirtual printStackTrace : ()V
    //   109: aload_3
    //   110: ifnull -> 125
    //   113: aload_3
    //   114: invokevirtual close : ()V
    //   117: goto -> 125
    //   120: astore_0
    //   121: aload_0
    //   122: invokevirtual printStackTrace : ()V
    //   125: aload_2
    //   126: invokevirtual close : ()V
    //   129: goto -> 137
    //   132: astore_0
    //   133: aload_0
    //   134: invokevirtual printStackTrace : ()V
    //   137: aload_1
    //   138: areturn
    //   139: astore_3
    //   140: aload_0
    //   141: ifnull -> 156
    //   144: aload_0
    //   145: invokevirtual close : ()V
    //   148: goto -> 156
    //   151: astore_0
    //   152: aload_0
    //   153: invokevirtual printStackTrace : ()V
    //   156: aload_2
    //   157: invokevirtual close : ()V
    //   160: goto -> 168
    //   163: astore_0
    //   164: aload_0
    //   165: invokevirtual printStackTrace : ()V
    //   168: goto -> 173
    //   171: aload_3
    //   172: athrow
    //   173: goto -> 171
    // Exception table:
    //   from	to	target	type
    //   23	32	98	java/io/IOException
    //   23	32	92	finally
    //   34	40	87	java/io/IOException
    //   34	40	139	finally
    //   47	62	87	java/io/IOException
    //   47	62	139	finally
    //   68	72	75	java/io/IOException
    //   80	84	132	java/io/IOException
    //   104	109	139	finally
    //   113	117	120	java/io/IOException
    //   125	129	132	java/io/IOException
    //   144	148	151	java/io/IOException
    //   156	160	163	java/io/IOException
  }
  
  public static byte[] c(c paramc) {
    int i = paramc.c();
    c c1 = null;
    Iterator<c.a> iterator1 = null;
    if (i == 0)
      return null; 
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    Iterator<c.a> iterator2 = iterator1;
    try {
      ObjectOutputStream objectOutputStream = new ObjectOutputStream();
      iterator2 = iterator1;
      this(byteArrayOutputStream);
      try {
        objectOutputStream.writeInt(paramc.c());
        for (c.a a : paramc.b()) {
          objectOutputStream.writeUTF(a.a().toString());
          objectOutputStream.writeBoolean(a.b());
        } 
        try {
          objectOutputStream.close();
        } catch (IOException iOException1) {
          iOException1.printStackTrace();
        } 
      } catch (IOException iOException1) {
        ObjectOutputStream objectOutputStream1 = objectOutputStream;
      } finally {
        IOException iOException1;
        paramc = null;
      } 
    } catch (IOException iOException) {
      paramc = c1;
    } finally {}
    c c2 = paramc;
    iOException.printStackTrace();
    if (paramc != null)
      try {
        paramc.close();
      } catch (IOException iOException1) {
        iOException1.printStackTrace();
      }  
    byteArrayOutputStream.close();
    return byteArrayOutputStream.toByteArray();
  }
  
  public static BackoffPolicy d(int paramInt) {
    if (paramInt != 0) {
      if (paramInt == 1)
        return BackoffPolicy.c; 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Could not convert ");
      stringBuilder.append(paramInt);
      stringBuilder.append(" to BackoffPolicy");
      throw new IllegalArgumentException(stringBuilder.toString());
    } 
    return BackoffPolicy.b;
  }
  
  public static NetworkType e(int paramInt) {
    if (paramInt != 0) {
      if (paramInt != 1) {
        if (paramInt != 2) {
          if (paramInt != 3) {
            if (paramInt == 4)
              return NetworkType.f; 
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Could not convert ");
            stringBuilder.append(paramInt);
            stringBuilder.append(" to NetworkType");
            throw new IllegalArgumentException(stringBuilder.toString());
          } 
          return NetworkType.e;
        } 
        return NetworkType.d;
      } 
      return NetworkType.c;
    } 
    return NetworkType.b;
  }
  
  public static WorkInfo.State f(int paramInt) {
    if (paramInt != 0) {
      if (paramInt != 1) {
        if (paramInt != 2) {
          if (paramInt != 3) {
            if (paramInt != 4) {
              if (paramInt == 5)
                return WorkInfo.State.g; 
              StringBuilder stringBuilder = new StringBuilder();
              stringBuilder.append("Could not convert ");
              stringBuilder.append(paramInt);
              stringBuilder.append(" to State");
              throw new IllegalArgumentException(stringBuilder.toString());
            } 
            return WorkInfo.State.f;
          } 
          return WorkInfo.State.e;
        } 
        return WorkInfo.State.d;
      } 
      return WorkInfo.State.c;
    } 
    return WorkInfo.State.b;
  }
  
  public static int g(NetworkType paramNetworkType) {
    int i = a.c[paramNetworkType.ordinal()];
    if (i != 1) {
      if (i != 2) {
        if (i != 3) {
          if (i != 4) {
            if (i == 5)
              return 4; 
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Could not convert ");
            stringBuilder.append(paramNetworkType);
            stringBuilder.append(" to int");
            throw new IllegalArgumentException(stringBuilder.toString());
          } 
          return 3;
        } 
        return 2;
      } 
      return 1;
    } 
    return 0;
  }
  
  public static int h(WorkInfo.State paramState) {
    StringBuilder stringBuilder;
    switch (a.a[paramState.ordinal()]) {
      default:
        stringBuilder = new StringBuilder();
        stringBuilder.append("Could not convert ");
        stringBuilder.append(paramState);
        stringBuilder.append(" to int");
        throw new IllegalArgumentException(stringBuilder.toString());
      case 6:
        return 5;
      case 5:
        return 4;
      case 4:
        return 3;
      case 3:
        return 2;
      case 2:
        return 1;
      case 1:
        break;
    } 
    return 0;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/impl/l/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */