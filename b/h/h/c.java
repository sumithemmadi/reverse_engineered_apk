package b.h.h;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class c {
  private static final Comparator<byte[]> a = new a();
  
  private static List<byte[]> a(Signature[] paramArrayOfSignature) {
    ArrayList<byte[]> arrayList = new ArrayList();
    for (byte b = 0; b < paramArrayOfSignature.length; b++)
      arrayList.add(paramArrayOfSignature[b].toByteArray()); 
    return (List<byte[]>)arrayList;
  }
  
  private static boolean b(List<byte[]> paramList1, List<byte[]> paramList2) {
    if (paramList1.size() != paramList2.size())
      return false; 
    for (byte b = 0; b < paramList1.size(); b++) {
      if (!Arrays.equals(paramList1.get(b), paramList2.get(b)))
        return false; 
    } 
    return true;
  }
  
  private static List<List<byte[]>> c(d paramd, Resources paramResources) {
    return (paramd.b() != null) ? paramd.b() : androidx.core.content.d.c.c(paramResources, paramd.c());
  }
  
  static f.a d(Context paramContext, d paramd, CancellationSignal paramCancellationSignal) {
    ProviderInfo providerInfo = e(paramContext.getPackageManager(), paramd, paramContext.getResources());
    return (providerInfo == null) ? f.a.a(1, null) : f.a.a(0, f(paramContext, paramd, providerInfo.authority, paramCancellationSignal));
  }
  
  static ProviderInfo e(PackageManager paramPackageManager, d paramd, Resources paramResources) {
    String str = paramd.e();
    byte b = 0;
    ProviderInfo providerInfo = paramPackageManager.resolveContentProvider(str, 0);
    if (providerInfo != null) {
      List<List<byte[]>> list;
      if (providerInfo.packageName.equals(paramd.f())) {
        List<byte[]> list1 = a((paramPackageManager.getPackageInfo(providerInfo.packageName, 64)).signatures);
        Collections.sort((List)list1, (Comparator)a);
        list = c(paramd, paramResources);
        while (b < list.size()) {
          ArrayList<byte> arrayList = new ArrayList(list.get(b));
          Collections.sort(arrayList, (Comparator)a);
          if (b(list1, (List)arrayList))
            return providerInfo; 
          b++;
        } 
        return null;
      } 
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("Found content provider ");
      stringBuilder1.append(str);
      stringBuilder1.append(", but package was not ");
      stringBuilder1.append(list.f());
      throw new PackageManager.NameNotFoundException(stringBuilder1.toString());
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("No package found for authority: ");
    stringBuilder.append(str);
    PackageManager.NameNotFoundException nameNotFoundException = new PackageManager.NameNotFoundException(stringBuilder.toString());
    throw nameNotFoundException;
  }
  
  static f.b[] f(Context paramContext, d paramd, String paramString, CancellationSignal paramCancellationSignal) {
    ArrayList<f.b> arrayList = new ArrayList();
    Uri uri1 = (new Uri.Builder()).scheme("content").authority(paramString).build();
    Uri uri2 = (new Uri.Builder()).scheme("content").authority(paramString).appendPath("file").build();
    paramString = null;
    try {
      Cursor cursor1;
      String str;
      String[] arrayOfString = new String[7];
      arrayOfString[0] = "_id";
      arrayOfString[1] = "file_id";
      arrayOfString[2] = "font_ttc_index";
      arrayOfString[3] = "font_variation_settings";
      arrayOfString[4] = "font_weight";
      arrayOfString[5] = "font_italic";
      arrayOfString[6] = "result_code";
      if (Build.VERSION.SDK_INT > 16) {
        cursor1 = paramContext.getContentResolver().query(uri1, arrayOfString, "query = ?", new String[] { paramd.g() }, null, paramCancellationSignal);
      } else {
        cursor1 = cursor1.getContentResolver().query(uri1, arrayOfString, "query = ?", new String[] { paramd.g() }, null);
      } 
      ArrayList<f.b> arrayList1 = arrayList;
      return (f.b[])cursor2.toArray((Object[])new f.b[0]);
    } finally {
      String str = paramString;
      if (str != null)
        str.close(); 
    } 
  }
  
  class a implements Comparator<byte[]> {
    public int a(byte[] param1ArrayOfbyte1, byte[] param1ArrayOfbyte2) {
      if (param1ArrayOfbyte1.length != param1ArrayOfbyte2.length) {
        int i = param1ArrayOfbyte1.length;
        int j = param1ArrayOfbyte2.length;
        return i - j;
      } 
      for (byte b = 0; b < param1ArrayOfbyte1.length; b++) {
        if (param1ArrayOfbyte1[b] != param1ArrayOfbyte2[b]) {
          byte b1 = param1ArrayOfbyte1[b];
          byte b2 = param1ArrayOfbyte2[b];
          b = b1;
          b1 = b2;
          return b - b1;
        } 
      } 
      return 0;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/h/h/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */