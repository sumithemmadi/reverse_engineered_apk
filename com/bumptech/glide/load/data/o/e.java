package com.bumptech.glide.load.data.o;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.b;
import com.bumptech.glide.load.engine.x.b;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

class e {
  private static final a a = new a();
  
  private final a b;
  
  private final d c;
  
  private final b d;
  
  private final ContentResolver e;
  
  private final List<ImageHeaderParser> f;
  
  e(List<ImageHeaderParser> paramList, a parama, d paramd, b paramb, ContentResolver paramContentResolver) {
    this.b = parama;
    this.c = paramd;
    this.d = paramb;
    this.e = paramContentResolver;
    this.f = paramList;
  }
  
  e(List<ImageHeaderParser> paramList, d paramd, b paramb, ContentResolver paramContentResolver) {
    this(paramList, a, paramd, paramb, paramContentResolver);
  }
  
  private String b(Uri paramUri) {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_0
    //   3: getfield c : Lcom/bumptech/glide/load/data/o/d;
    //   6: aload_1
    //   7: invokeinterface a : (Landroid/net/Uri;)Landroid/database/Cursor;
    //   12: astore_3
    //   13: aload_3
    //   14: ifnull -> 53
    //   17: aload_3
    //   18: astore_2
    //   19: aload_3
    //   20: invokeinterface moveToFirst : ()Z
    //   25: ifeq -> 53
    //   28: aload_3
    //   29: astore_2
    //   30: aload_3
    //   31: iconst_0
    //   32: invokeinterface getString : (I)Ljava/lang/String;
    //   37: astore #4
    //   39: aload_3
    //   40: invokeinterface close : ()V
    //   45: aload #4
    //   47: areturn
    //   48: astore #4
    //   50: goto -> 73
    //   53: aload_3
    //   54: ifnull -> 63
    //   57: aload_3
    //   58: invokeinterface close : ()V
    //   63: aconst_null
    //   64: areturn
    //   65: astore_1
    //   66: goto -> 145
    //   69: astore #4
    //   71: aconst_null
    //   72: astore_3
    //   73: aload_3
    //   74: astore_2
    //   75: ldc 'ThumbStreamOpener'
    //   77: iconst_3
    //   78: invokestatic isLoggable : (Ljava/lang/String;I)Z
    //   81: ifeq -> 132
    //   84: aload_3
    //   85: astore_2
    //   86: new java/lang/StringBuilder
    //   89: astore #5
    //   91: aload_3
    //   92: astore_2
    //   93: aload #5
    //   95: invokespecial <init> : ()V
    //   98: aload_3
    //   99: astore_2
    //   100: aload #5
    //   102: ldc 'Failed to query for thumbnail for Uri: '
    //   104: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   107: pop
    //   108: aload_3
    //   109: astore_2
    //   110: aload #5
    //   112: aload_1
    //   113: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   116: pop
    //   117: aload_3
    //   118: astore_2
    //   119: ldc 'ThumbStreamOpener'
    //   121: aload #5
    //   123: invokevirtual toString : ()Ljava/lang/String;
    //   126: aload #4
    //   128: invokestatic d : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   131: pop
    //   132: aload_3
    //   133: ifnull -> 142
    //   136: aload_3
    //   137: invokeinterface close : ()V
    //   142: aconst_null
    //   143: areturn
    //   144: astore_1
    //   145: aload_2
    //   146: ifnull -> 155
    //   149: aload_2
    //   150: invokeinterface close : ()V
    //   155: aload_1
    //   156: athrow
    // Exception table:
    //   from	to	target	type
    //   2	13	69	java/lang/SecurityException
    //   2	13	65	finally
    //   19	28	48	java/lang/SecurityException
    //   19	28	144	finally
    //   30	39	48	java/lang/SecurityException
    //   30	39	144	finally
    //   75	84	144	finally
    //   86	91	144	finally
    //   93	98	144	finally
    //   100	108	144	finally
    //   110	117	144	finally
    //   119	132	144	finally
  }
  
  private boolean c(File paramFile) {
    boolean bool;
    if (this.b.a(paramFile) && 0L < this.b.c(paramFile)) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  int a(Uri paramUri) {
    InputStream inputStream1 = null;
    InputStream inputStream2 = null;
    InputStream inputStream3 = null;
    try {
      InputStream inputStream = this.e.openInputStream(paramUri);
      inputStream3 = inputStream;
      inputStream1 = inputStream;
      inputStream2 = inputStream;
      int i = b.b(this.f, inputStream, this.d);
      if (inputStream != null)
        try {
          inputStream.close();
        } catch (IOException iOException) {} 
      return i;
    } catch (IOException iOException) {
      inputStream1 = inputStream2;
    } catch (NullPointerException nullPointerException) {
    
    } finally {}
    inputStream3 = inputStream1;
    if (Log.isLoggable("ThumbStreamOpener", 3)) {
      inputStream3 = inputStream1;
      StringBuilder stringBuilder = new StringBuilder();
      inputStream3 = inputStream1;
      this();
      inputStream3 = inputStream1;
      stringBuilder.append("Failed to open uri: ");
      inputStream3 = inputStream1;
      stringBuilder.append(paramUri);
      inputStream3 = inputStream1;
      Log.d("ThumbStreamOpener", stringBuilder.toString(), nullPointerException);
    } 
    if (inputStream1 != null)
      try {
        inputStream1.close();
      } catch (IOException iOException) {} 
    return -1;
  }
  
  public InputStream d(Uri paramUri) {
    String str = b(paramUri);
    if (TextUtils.isEmpty(str))
      return null; 
    File file = this.b.b(str);
    if (!c(file))
      return null; 
    Uri uri = Uri.fromFile(file);
    try {
      return this.e.openInputStream(uri);
    } catch (NullPointerException nullPointerException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("NPE opening uri: ");
      stringBuilder.append(paramUri);
      stringBuilder.append(" -> ");
      stringBuilder.append(uri);
      throw (FileNotFoundException)(new FileNotFoundException(stringBuilder.toString())).initCause(nullPointerException);
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/data/o/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */