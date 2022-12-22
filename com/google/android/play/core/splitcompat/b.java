package com.google.android.play.core.splitcompat;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;
import com.google.android.play.core.internal.d0;
import java.io.File;
import java.util.Set;

public final class b {
  private final d a;
  
  public b(d paramd) {
    this.a = paramd;
  }
  
  public static final int b(AssetManager paramAssetManager, File paramFile) {
    int i = ((Integer)d0.a(paramAssetManager, "addAssetPath", Integer.class, String.class, paramFile.getPath())).intValue();
    StringBuilder stringBuilder = new StringBuilder(39);
    stringBuilder.append("addAssetPath completed with ");
    stringBuilder.append(i);
    Log.d("SplitCompat", stringBuilder.toString());
    return i;
  }
  
  public final void a(Context paramContext, Set<File> paramSet) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: invokevirtual getAssets : ()Landroid/content/res/AssetManager;
    //   6: astore_1
    //   7: aload_2
    //   8: invokeinterface iterator : ()Ljava/util/Iterator;
    //   13: astore_2
    //   14: aload_2
    //   15: invokeinterface hasNext : ()Z
    //   20: ifeq -> 40
    //   23: aload_1
    //   24: aload_2
    //   25: invokeinterface next : ()Ljava/lang/Object;
    //   30: checkcast java/io/File
    //   33: invokestatic b : (Landroid/content/res/AssetManager;Ljava/io/File;)I
    //   36: pop
    //   37: goto -> 14
    //   40: aload_0
    //   41: monitorexit
    //   42: return
    //   43: astore_1
    //   44: aload_0
    //   45: monitorexit
    //   46: goto -> 51
    //   49: aload_1
    //   50: athrow
    //   51: goto -> 49
    // Exception table:
    //   from	to	target	type
    //   2	14	43	finally
    //   14	37	43	finally
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/play/core/splitcompat/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */