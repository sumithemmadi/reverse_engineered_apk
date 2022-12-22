package b.h.e;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import b.h.h.f;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class k {
  public static void a(Closeable paramCloseable) {
    if (paramCloseable != null)
      try {
        paramCloseable.close();
      } catch (IOException iOException) {} 
  }
  
  public static ByteBuffer b(Context paramContext, Resources paramResources, int paramInt) {
    File file = e(paramContext);
    if (file == null)
      return null; 
    try {
      boolean bool = c(file, paramResources, paramInt);
      if (!bool)
        return null; 
      return g(file);
    } finally {
      file.delete();
    } 
  }
  
  public static boolean c(File paramFile, Resources paramResources, int paramInt) {
    try {
      InputStream inputStream = paramResources.openRawResource(paramInt);
    } finally {
      paramResources = null;
    } 
    a((Closeable)paramFile);
    throw paramResources;
  }
  
  public static boolean d(File paramFile, InputStream paramInputStream) {
    StrictMode.ThreadPolicy threadPolicy = StrictMode.allowThreadDiskWrites();
    File file1 = null;
    FileOutputStream fileOutputStream1 = null;
    FileOutputStream fileOutputStream2 = fileOutputStream1;
    try {
      FileOutputStream fileOutputStream = new FileOutputStream();
      fileOutputStream2 = fileOutputStream1;
      this(paramFile, false);
      try {
        byte[] arrayOfByte = new byte[1024];
        while (true) {
          int i = paramInputStream.read(arrayOfByte);
          if (i != -1) {
            fileOutputStream.write(arrayOfByte, 0, i);
            continue;
          } 
          a(fileOutputStream);
          return true;
        } 
      } catch (IOException null) {
      
      } finally {
        paramFile = null;
      } 
    } catch (IOException iOException) {
      paramFile = file1;
    } finally {}
    File file2 = paramFile;
    StringBuilder stringBuilder = new StringBuilder();
    file2 = paramFile;
    this();
    file2 = paramFile;
    stringBuilder.append("Error copying resource contents to temp file: ");
    file2 = paramFile;
    stringBuilder.append(iOException.getMessage());
    file2 = paramFile;
    Log.e("TypefaceCompatUtil", stringBuilder.toString());
    a((Closeable)paramFile);
    StrictMode.setThreadPolicy(threadPolicy);
    return false;
  }
  
  public static File e(Context paramContext) {
    File file = paramContext.getCacheDir();
    if (file == null)
      return null; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(".font");
    stringBuilder.append(Process.myPid());
    stringBuilder.append("-");
    stringBuilder.append(Process.myTid());
    stringBuilder.append("-");
    String str = stringBuilder.toString();
    byte b = 0;
    while (true) {
      if (b < 100) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(str);
        stringBuilder1.append(b);
        File file1 = new File(file, stringBuilder1.toString());
        try {
          boolean bool = file1.createNewFile();
          if (bool)
            return file1; 
        } catch (IOException iOException) {}
        b++;
        continue;
      } 
      return null;
    } 
  }
  
  public static ByteBuffer f(Context paramContext, CancellationSignal paramCancellationSignal, Uri paramUri) {
    ContentResolver contentResolver = paramContext.getContentResolver();
    try {
      ParcelFileDescriptor parcelFileDescriptor = contentResolver.openFileDescriptor(paramUri, "r", paramCancellationSignal);
      if (parcelFileDescriptor == null) {
        if (parcelFileDescriptor != null)
          parcelFileDescriptor.close(); 
        return null;
      } 
      try {
        FileInputStream fileInputStream = new FileInputStream();
        this(parcelFileDescriptor.getFileDescriptor());
      } finally {
        try {
          parcelFileDescriptor.close();
        } finally {}
      } 
    } catch (IOException iOException) {
      return null;
    } 
  }
  
  private static ByteBuffer g(File paramFile) {
    try {
      FileInputStream fileInputStream = new FileInputStream();
      this(paramFile);
      try {
        FileChannel fileChannel = fileInputStream.getChannel();
        long l = fileChannel.size();
        return fileChannel.map(FileChannel.MapMode.READ_ONLY, 0L, l);
      } finally {
        try {
          fileInputStream.close();
        } finally {}
      } 
    } catch (IOException iOException) {
      return null;
    } 
  }
  
  public static Map<Uri, ByteBuffer> h(Context paramContext, f.b[] paramArrayOfb, CancellationSignal paramCancellationSignal) {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    int i = paramArrayOfb.length;
    for (byte b1 = 0; b1 < i; b1++) {
      f.b b2 = paramArrayOfb[b1];
      if (b2.b() == 0) {
        Uri uri = b2.d();
        if (!hashMap.containsKey(uri))
          hashMap.put(uri, f(paramContext, paramCancellationSignal, uri)); 
      } 
    } 
    return (Map)Collections.unmodifiableMap(hashMap);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/h/e/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */