package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

public class FileProvider extends ContentProvider {
  private static final String[] b = new String[] { "_display_name", "_size" };
  
  private static final File c = new File("/");
  
  private static HashMap<String, a> d = new HashMap<String, a>();
  
  private a e;
  
  private static File a(File paramFile, String... paramVarArgs) {
    int i = paramVarArgs.length;
    byte b = 0;
    while (b < i) {
      String str = paramVarArgs[b];
      File file = paramFile;
      if (str != null)
        file = new File(paramFile, str); 
      b++;
      paramFile = file;
    } 
    return paramFile;
  }
  
  private static Object[] b(Object[] paramArrayOfObject, int paramInt) {
    Object[] arrayOfObject = new Object[paramInt];
    System.arraycopy(paramArrayOfObject, 0, arrayOfObject, 0, paramInt);
    return arrayOfObject;
  }
  
  private static String[] c(String[] paramArrayOfString, int paramInt) {
    String[] arrayOfString = new String[paramInt];
    System.arraycopy(paramArrayOfString, 0, arrayOfString, 0, paramInt);
    return arrayOfString;
  }
  
  private static a d(Context paramContext, String paramString) {
    synchronized (d) {
      a a1 = d.get(paramString);
      a a2 = a1;
      if (a1 == null)
        try {
          a2 = g(paramContext, paramString);
          d.put(paramString, a2);
        } catch (IOException iOException) {
          IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
          this("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", iOException);
          throw illegalArgumentException;
        } catch (XmlPullParserException xmlPullParserException) {
          IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
          this("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", (Throwable)xmlPullParserException);
          throw illegalArgumentException;
        }  
      return a2;
    } 
  }
  
  public static Uri e(Context paramContext, String paramString, File paramFile) {
    return d(paramContext, paramString).b(paramFile);
  }
  
  private static int f(String paramString) {
    int i;
    if ("r".equals(paramString)) {
      i = 268435456;
    } else {
      if ("w".equals(paramString) || "wt".equals(paramString))
        return 738197504; 
      if ("wa".equals(paramString)) {
        i = 704643072;
      } else if ("rw".equals(paramString)) {
        i = 939524096;
      } else if ("rwt".equals(paramString)) {
        i = 1006632960;
      } else {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid mode: ");
        stringBuilder.append(paramString);
        throw new IllegalArgumentException(stringBuilder.toString());
      } 
    } 
    return i;
  }
  
  private static a g(Context paramContext, String paramString) {
    File file;
    b b = new b(paramString);
    ProviderInfo providerInfo = paramContext.getPackageManager().resolveContentProvider(paramString, 128);
    if (providerInfo != null) {
      XmlResourceParser xmlResourceParser = providerInfo.loadXmlMetaData(paramContext.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
      if (xmlResourceParser != null)
        while (true) {
          int i = xmlResourceParser.next();
          if (i != 1) {
            if (i == 2) {
              String str1 = xmlResourceParser.getName();
              providerInfo = null;
              String str2 = xmlResourceParser.getAttributeValue(null, "name");
              String str3 = xmlResourceParser.getAttributeValue(null, "path");
              if ("root-path".equals(str1)) {
                file = c;
              } else if ("files-path".equals(str1)) {
                file = paramContext.getFilesDir();
              } else if ("cache-path".equals(str1)) {
                file = paramContext.getCacheDir();
              } else if ("external-path".equals(str1)) {
                file = Environment.getExternalStorageDirectory();
              } else {
                File[] arrayOfFile;
                if ("external-files-path".equals(str1)) {
                  arrayOfFile = a.h(paramContext, null);
                  ProviderInfo providerInfo1 = providerInfo;
                  if (arrayOfFile.length > 0)
                    file = arrayOfFile[0]; 
                } else if ("external-cache-path".equals(arrayOfFile)) {
                  arrayOfFile = a.g(paramContext);
                  ProviderInfo providerInfo1 = providerInfo;
                  if (arrayOfFile.length > 0)
                    file = arrayOfFile[0]; 
                } else {
                  ProviderInfo providerInfo1 = providerInfo;
                  if (Build.VERSION.SDK_INT >= 21) {
                    providerInfo1 = providerInfo;
                    if ("external-media-path".equals(arrayOfFile)) {
                      arrayOfFile = paramContext.getExternalMediaDirs();
                      providerInfo1 = providerInfo;
                      if (arrayOfFile.length > 0)
                        file = arrayOfFile[0]; 
                    } 
                  } 
                } 
              } 
              if (file != null)
                b.c(str2, a(file, new String[] { str3 })); 
            } 
            continue;
          } 
          return b;
        }  
      throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Couldn't find meta-data for provider with authority ");
    stringBuilder.append((String)file);
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(stringBuilder.toString());
    throw illegalArgumentException;
  }
  
  public void attachInfo(Context paramContext, ProviderInfo paramProviderInfo) {
    super.attachInfo(paramContext, paramProviderInfo);
    if (!paramProviderInfo.exported) {
      if (paramProviderInfo.grantUriPermissions) {
        this.e = d(paramContext, paramProviderInfo.authority.split(";")[0]);
        return;
      } 
      throw new SecurityException("Provider must grant uri permissions");
    } 
    throw new SecurityException("Provider must not be exported");
  }
  
  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString) {
    return this.e.a(paramUri).delete();
  }
  
  public String getType(Uri paramUri) {
    File file = this.e.a(paramUri);
    int i = file.getName().lastIndexOf('.');
    if (i >= 0) {
      String str = file.getName().substring(i + 1);
      str = MimeTypeMap.getSingleton().getMimeTypeFromExtension(str);
      if (str != null)
        return str; 
    } 
    return "application/octet-stream";
  }
  
  public Uri insert(Uri paramUri, ContentValues paramContentValues) {
    throw new UnsupportedOperationException("No external inserts");
  }
  
  public boolean onCreate() {
    return true;
  }
  
  @SuppressLint({"UnknownNullness"})
  public ParcelFileDescriptor openFile(Uri paramUri, String paramString) {
    return ParcelFileDescriptor.open(this.e.a(paramUri), f(paramString));
  }
  
  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield e : Landroidx/core/content/FileProvider$a;
    //   4: aload_1
    //   5: invokeinterface a : (Landroid/net/Uri;)Ljava/io/File;
    //   10: astore #4
    //   12: aload_1
    //   13: ldc_w 'displayName'
    //   16: invokevirtual getQueryParameter : (Ljava/lang/String;)Ljava/lang/String;
    //   19: astore_3
    //   20: aload_2
    //   21: astore_1
    //   22: aload_2
    //   23: ifnonnull -> 30
    //   26: getstatic androidx/core/content/FileProvider.b : [Ljava/lang/String;
    //   29: astore_1
    //   30: aload_1
    //   31: arraylength
    //   32: anewarray java/lang/String
    //   35: astore #6
    //   37: aload_1
    //   38: arraylength
    //   39: anewarray java/lang/Object
    //   42: astore #5
    //   44: aload_1
    //   45: arraylength
    //   46: istore #7
    //   48: iconst_0
    //   49: istore #8
    //   51: iconst_0
    //   52: istore #9
    //   54: iload #8
    //   56: iload #7
    //   58: if_icmpge -> 173
    //   61: aload_1
    //   62: iload #8
    //   64: aaload
    //   65: astore_2
    //   66: ldc '_display_name'
    //   68: aload_2
    //   69: invokevirtual equals : (Ljava/lang/Object;)Z
    //   72: ifeq -> 116
    //   75: aload #6
    //   77: iload #9
    //   79: ldc '_display_name'
    //   81: aastore
    //   82: iload #9
    //   84: iconst_1
    //   85: iadd
    //   86: istore #10
    //   88: aload_3
    //   89: ifnonnull -> 101
    //   92: aload #4
    //   94: invokevirtual getName : ()Ljava/lang/String;
    //   97: astore_2
    //   98: goto -> 103
    //   101: aload_3
    //   102: astore_2
    //   103: aload #5
    //   105: iload #9
    //   107: aload_2
    //   108: aastore
    //   109: iload #10
    //   111: istore #9
    //   113: goto -> 159
    //   116: iload #9
    //   118: istore #10
    //   120: ldc '_size'
    //   122: aload_2
    //   123: invokevirtual equals : (Ljava/lang/Object;)Z
    //   126: ifeq -> 163
    //   129: aload #6
    //   131: iload #9
    //   133: ldc '_size'
    //   135: aastore
    //   136: iload #9
    //   138: iconst_1
    //   139: iadd
    //   140: istore #10
    //   142: aload #5
    //   144: iload #9
    //   146: aload #4
    //   148: invokevirtual length : ()J
    //   151: invokestatic valueOf : (J)Ljava/lang/Long;
    //   154: aastore
    //   155: iload #10
    //   157: istore #9
    //   159: iload #9
    //   161: istore #10
    //   163: iinc #8, 1
    //   166: iload #10
    //   168: istore #9
    //   170: goto -> 54
    //   173: aload #6
    //   175: iload #9
    //   177: invokestatic c : ([Ljava/lang/String;I)[Ljava/lang/String;
    //   180: astore_2
    //   181: aload #5
    //   183: iload #9
    //   185: invokestatic b : ([Ljava/lang/Object;I)[Ljava/lang/Object;
    //   188: astore_1
    //   189: new android/database/MatrixCursor
    //   192: dup
    //   193: aload_2
    //   194: iconst_1
    //   195: invokespecial <init> : ([Ljava/lang/String;I)V
    //   198: astore_2
    //   199: aload_2
    //   200: aload_1
    //   201: invokevirtual addRow : ([Ljava/lang/Object;)V
    //   204: aload_2
    //   205: areturn
  }
  
  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString) {
    throw new UnsupportedOperationException("No external updates");
  }
  
  static interface a {
    File a(Uri param1Uri);
    
    Uri b(File param1File);
  }
  
  static class b implements a {
    private final String a;
    
    private final HashMap<String, File> b = new HashMap<String, File>();
    
    b(String param1String) {
      this.a = param1String;
    }
    
    public File a(Uri param1Uri) {
      File file1;
      String str1 = param1Uri.getEncodedPath();
      int i = str1.indexOf('/', 1);
      String str2 = Uri.decode(str1.substring(1, i));
      str1 = Uri.decode(str1.substring(i + 1));
      File file2 = this.b.get(str2);
      if (file2 != null) {
        file1 = new File(file2, str1);
        try {
          File file = file1.getCanonicalFile();
          if (file.getPath().startsWith(file2.getPath()))
            return file; 
          throw new SecurityException("Resolved path jumped beyond configured root");
        } catch (IOException iOException) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Failed to resolve canonical path for ");
          stringBuilder1.append(file1);
          throw new IllegalArgumentException(stringBuilder1.toString());
        } 
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Unable to find configured root for ");
      stringBuilder.append(file1);
      throw new IllegalArgumentException(stringBuilder.toString());
    }
    
    public Uri b(File param1File) {
      StringBuilder stringBuilder;
      try {
        Map.Entry<String, File> entry;
        StringBuilder stringBuilder1;
        String str = param1File.getCanonicalPath();
        param1File = null;
        for (Map.Entry<String, File> entry1 : this.b.entrySet()) {
          String str1 = ((File)entry1.getValue()).getPath();
          if (str.startsWith(str1) && (param1File == null || str1.length() > ((File)param1File.getValue()).getPath().length()))
            entry = entry1; 
        } 
        if (entry != null) {
          String str2 = ((File)entry.getValue()).getPath();
          if (str2.endsWith("/")) {
            str2 = str.substring(str2.length());
          } else {
            str2 = str.substring(str2.length() + 1);
          } 
          stringBuilder1 = new StringBuilder();
          stringBuilder1.append(Uri.encode(entry.getKey()));
          stringBuilder1.append('/');
          stringBuilder1.append(Uri.encode(str2, "/"));
          String str1 = stringBuilder1.toString();
          return (new Uri.Builder()).scheme("content").authority(this.a).encodedPath(str1).build();
        } 
        stringBuilder = new StringBuilder();
        stringBuilder.append("Failed to find configured root that contains ");
        stringBuilder.append((String)stringBuilder1);
        throw new IllegalArgumentException(stringBuilder.toString());
      } catch (IOException iOException) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("Failed to resolve canonical path for ");
        stringBuilder1.append(stringBuilder);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(stringBuilder1.toString());
        throw illegalArgumentException;
      } 
    }
    
    void c(String param1String, File param1File) {
      if (!TextUtils.isEmpty(param1String))
        try {
          File file = param1File.getCanonicalFile();
          this.b.put(param1String, file);
          return;
        } catch (IOException iOException) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Failed to resolve canonical path for ");
          stringBuilder.append(param1File);
          throw new IllegalArgumentException(stringBuilder.toString(), iOException);
        }  
      throw new IllegalArgumentException("Name must not be empty");
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/core/content/FileProvider.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */