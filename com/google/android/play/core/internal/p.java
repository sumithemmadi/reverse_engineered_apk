package com.google.android.play.core.internal;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.play.core.splitcompat.a;
import com.google.android.play.core.splitcompat.d;
import com.google.android.play.core.splitcompat.q;
import com.google.android.play.core.splitinstall.d;
import com.google.android.play.core.splitinstall.f;
import java.util.List;
import java.util.concurrent.Executor;

public final class p implements f {
  private final Context a;
  
  private final d b;
  
  private final r c;
  
  private final Executor d;
  
  private final q e;
  
  public p(Context paramContext, Executor paramExecutor, r paramr, d paramd, q paramq) {
    this.a = paramContext;
    this.b = paramd;
    this.c = paramr;
    this.d = paramExecutor;
    this.e = paramq;
  }
  
  private final Integer e(List<Intent> paramList) {
    // Byte code:
    //   0: new java/io/RandomAccessFile
    //   3: astore_2
    //   4: aload_2
    //   5: aload_0
    //   6: getfield b : Lcom/google/android/play/core/splitcompat/d;
    //   9: invokevirtual f : ()Ljava/io/File;
    //   12: ldc 'rw'
    //   14: invokespecial <init> : (Ljava/io/File;Ljava/lang/String;)V
    //   17: aload_2
    //   18: invokevirtual getChannel : ()Ljava/nio/channels/FileChannel;
    //   21: astore_3
    //   22: aconst_null
    //   23: astore_2
    //   24: aload_3
    //   25: invokevirtual tryLock : ()Ljava/nio/channels/FileLock;
    //   28: astore #4
    //   30: goto -> 42
    //   33: astore_1
    //   34: goto -> 457
    //   37: astore #4
    //   39: aconst_null
    //   40: astore #4
    //   42: aload #4
    //   44: ifnull -> 476
    //   47: iconst_0
    //   48: istore #5
    //   50: ldc 'SplitCompat'
    //   52: ldc 'Copying splits.'
    //   54: invokestatic i : (Ljava/lang/String;Ljava/lang/String;)I
    //   57: pop
    //   58: aload_1
    //   59: invokeinterface iterator : ()Ljava/util/Iterator;
    //   64: astore_2
    //   65: aload_2
    //   66: invokeinterface hasNext : ()Z
    //   71: ifeq -> 274
    //   74: aload_2
    //   75: invokeinterface next : ()Ljava/lang/Object;
    //   80: checkcast android/content/Intent
    //   83: astore #6
    //   85: aload #6
    //   87: ldc 'split_id'
    //   89: invokevirtual getStringExtra : (Ljava/lang/String;)Ljava/lang/String;
    //   92: astore_1
    //   93: aload_0
    //   94: getfield a : Landroid/content/Context;
    //   97: invokevirtual getContentResolver : ()Landroid/content/ContentResolver;
    //   100: aload #6
    //   102: invokevirtual getData : ()Landroid/net/Uri;
    //   105: ldc 'r'
    //   107: invokevirtual openAssetFileDescriptor : (Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
    //   110: astore #6
    //   112: aload_0
    //   113: getfield b : Lcom/google/android/play/core/splitcompat/d;
    //   116: aload_1
    //   117: invokevirtual b : (Ljava/lang/String;)Ljava/io/File;
    //   120: astore #7
    //   122: aload #7
    //   124: invokevirtual exists : ()Z
    //   127: ifeq -> 147
    //   130: aload #7
    //   132: invokevirtual length : ()J
    //   135: aload #6
    //   137: invokevirtual getLength : ()J
    //   140: lcmp
    //   141: ifeq -> 147
    //   144: goto -> 155
    //   147: aload #7
    //   149: invokevirtual exists : ()Z
    //   152: ifne -> 65
    //   155: aload_0
    //   156: getfield b : Lcom/google/android/play/core/splitcompat/d;
    //   159: aload_1
    //   160: invokevirtual c : (Ljava/lang/String;)Ljava/io/File;
    //   163: invokevirtual exists : ()Z
    //   166: ifne -> 65
    //   169: new java/io/BufferedInputStream
    //   172: astore_1
    //   173: aload_1
    //   174: aload #6
    //   176: invokevirtual createInputStream : ()Ljava/io/FileInputStream;
    //   179: invokespecial <init> : (Ljava/io/InputStream;)V
    //   182: new java/io/FileOutputStream
    //   185: astore #6
    //   187: aload #6
    //   189: aload #7
    //   191: invokespecial <init> : (Ljava/io/File;)V
    //   194: sipush #4096
    //   197: newarray byte
    //   199: astore #7
    //   201: aload_1
    //   202: aload #7
    //   204: invokevirtual read : ([B)I
    //   207: istore #8
    //   209: iload #8
    //   211: ifle -> 227
    //   214: aload #6
    //   216: aload #7
    //   218: iconst_0
    //   219: iload #8
    //   221: invokevirtual write : ([BII)V
    //   224: goto -> 201
    //   227: aload #6
    //   229: invokevirtual close : ()V
    //   232: aload_1
    //   233: invokevirtual close : ()V
    //   236: goto -> 65
    //   239: astore_2
    //   240: aload #6
    //   242: invokevirtual close : ()V
    //   245: goto -> 256
    //   248: astore #6
    //   250: aload_2
    //   251: aload #6
    //   253: invokestatic a : (Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    //   256: aload_2
    //   257: athrow
    //   258: astore_2
    //   259: aload_1
    //   260: invokevirtual close : ()V
    //   263: goto -> 272
    //   266: astore_1
    //   267: aload_2
    //   268: aload_1
    //   269: invokestatic a : (Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    //   272: aload_2
    //   273: athrow
    //   274: ldc 'SplitCompat'
    //   276: ldc 'Splits copied.'
    //   278: invokestatic i : (Ljava/lang/String;Ljava/lang/String;)I
    //   281: pop
    //   282: aload_0
    //   283: getfield b : Lcom/google/android/play/core/splitcompat/d;
    //   286: invokevirtual g : ()Ljava/io/File;
    //   289: invokevirtual listFiles : ()[Ljava/io/File;
    //   292: astore_1
    //   293: aload_0
    //   294: getfield c : Lcom/google/android/play/core/internal/r;
    //   297: aload_1
    //   298: invokevirtual a : ([Ljava/io/File;)Z
    //   301: ifeq -> 397
    //   304: aload_0
    //   305: getfield c : Lcom/google/android/play/core/internal/r;
    //   308: aload_1
    //   309: invokevirtual b : ([Ljava/io/File;)Z
    //   312: istore #9
    //   314: iload #9
    //   316: ifeq -> 397
    //   319: aload_0
    //   320: getfield b : Lcom/google/android/play/core/splitcompat/d;
    //   323: invokevirtual g : ()Ljava/io/File;
    //   326: invokevirtual listFiles : ()[Ljava/io/File;
    //   329: astore_1
    //   330: aload_1
    //   331: invokestatic sort : ([Ljava/lang/Object;)V
    //   334: aload_1
    //   335: arraylength
    //   336: istore #8
    //   338: iinc #8, -1
    //   341: iload #8
    //   343: iflt -> 367
    //   346: aload_1
    //   347: iload #8
    //   349: aaload
    //   350: astore_2
    //   351: aload_2
    //   352: aload_0
    //   353: getfield b : Lcom/google/android/play/core/splitcompat/d;
    //   356: aload_2
    //   357: invokevirtual d : (Ljava/io/File;)Ljava/io/File;
    //   360: invokevirtual renameTo : (Ljava/io/File;)Z
    //   363: pop
    //   364: goto -> 338
    //   367: ldc 'SplitCompat'
    //   369: ldc 'Splits verified.'
    //   371: invokestatic i : (Ljava/lang/String;Ljava/lang/String;)I
    //   374: pop
    //   375: iload #5
    //   377: istore #8
    //   379: goto -> 443
    //   382: astore_2
    //   383: ldc 'Cannot write verified split.'
    //   385: astore_1
    //   386: ldc 'SplitCompat'
    //   388: aload_1
    //   389: aload_2
    //   390: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   393: pop
    //   394: goto -> 439
    //   397: ldc 'SplitCompat'
    //   399: ldc 'Split verification failed.'
    //   401: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)I
    //   404: pop
    //   405: goto -> 418
    //   408: astore_1
    //   409: ldc 'SplitCompat'
    //   411: ldc 'Error verifying splits.'
    //   413: aload_1
    //   414: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   417: pop
    //   418: bipush #-11
    //   420: istore #8
    //   422: goto -> 443
    //   425: astore_2
    //   426: ldc 'Cannot access directory for unverified splits.'
    //   428: astore_1
    //   429: goto -> 386
    //   432: astore_2
    //   433: ldc 'Error copying splits.'
    //   435: astore_1
    //   436: goto -> 386
    //   439: bipush #-13
    //   441: istore #8
    //   443: iload #8
    //   445: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   448: astore_2
    //   449: aload #4
    //   451: invokevirtual release : ()V
    //   454: goto -> 476
    //   457: aload_3
    //   458: ifnull -> 474
    //   461: aload_3
    //   462: invokevirtual close : ()V
    //   465: goto -> 474
    //   468: astore_2
    //   469: aload_1
    //   470: aload_2
    //   471: invokestatic a : (Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    //   474: aload_1
    //   475: athrow
    //   476: aload_3
    //   477: ifnull -> 484
    //   480: aload_3
    //   481: invokevirtual close : ()V
    //   484: aload_2
    //   485: areturn
    //   486: astore_1
    //   487: ldc 'SplitCompat'
    //   489: ldc_w 'Error locking files.'
    //   492: aload_1
    //   493: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   496: pop
    //   497: bipush #-13
    //   499: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   502: areturn
    // Exception table:
    //   from	to	target	type
    //   0	22	486	java/lang/Exception
    //   24	30	37	java/nio/channels/OverlappingFileLockException
    //   24	30	33	finally
    //   50	65	432	java/lang/Exception
    //   50	65	33	finally
    //   65	144	432	java/lang/Exception
    //   65	144	33	finally
    //   147	155	432	java/lang/Exception
    //   147	155	33	finally
    //   155	182	432	java/lang/Exception
    //   155	182	33	finally
    //   182	194	258	finally
    //   194	201	239	finally
    //   201	209	239	finally
    //   214	224	239	finally
    //   227	232	258	finally
    //   232	236	432	java/lang/Exception
    //   232	236	33	finally
    //   240	245	248	finally
    //   250	256	258	finally
    //   256	258	258	finally
    //   259	263	266	finally
    //   267	272	432	java/lang/Exception
    //   267	272	33	finally
    //   272	274	432	java/lang/Exception
    //   272	274	33	finally
    //   274	282	432	java/lang/Exception
    //   274	282	33	finally
    //   282	293	425	java/io/IOException
    //   282	293	33	finally
    //   293	314	408	java/lang/Exception
    //   293	314	33	finally
    //   319	338	382	java/io/IOException
    //   319	338	33	finally
    //   351	364	382	java/io/IOException
    //   351	364	33	finally
    //   367	375	33	finally
    //   386	394	33	finally
    //   397	405	33	finally
    //   409	418	33	finally
    //   443	454	33	finally
    //   461	465	468	finally
    //   469	474	486	java/lang/Exception
    //   474	476	486	java/lang/Exception
    //   480	484	486	java/lang/Exception
  }
  
  public final void a(List<Intent> paramList, d paramd) {
    if (a.b()) {
      this.d.execute(new o(this, paramList, paramd));
      return;
    } 
    throw new IllegalStateException("Ingestion should only be called in SplitCompat mode.");
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/play/core/internal/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */