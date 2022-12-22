package androidx.activity.result.e;

import android.content.Context;
import android.content.Intent;
import androidx.core.content.a;
import b.e.a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class b extends a<String[], Map<String, Boolean>> {
  static Intent e(String[] paramArrayOfString) {
    return (new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS")).putExtra("androidx.activity.result.contract.extra.PERMISSIONS", paramArrayOfString);
  }
  
  public Intent d(Context paramContext, String[] paramArrayOfString) {
    return e(paramArrayOfString);
  }
  
  public a.a<Map<String, Boolean>> f(Context paramContext, String[] paramArrayOfString) {
    if (paramArrayOfString == null || paramArrayOfString.length == 0)
      return new a.a<Map<String, Boolean>>(Collections.emptyMap()); 
    a<String, Boolean> a1 = new a();
    int i = paramArrayOfString.length;
    byte b1 = 0;
    boolean bool = true;
    while (b1 < i) {
      boolean bool1;
      String str = paramArrayOfString[b1];
      if (a.a(paramContext, str) == 0) {
        bool1 = true;
      } else {
        bool1 = false;
      } 
      a1.put(str, Boolean.valueOf(bool1));
      if (!bool1)
        bool = false; 
      b1++;
    } 
    return bool ? new a.a(a1) : null;
  }
  
  public Map<String, Boolean> g(int paramInt, Intent paramIntent) {
    if (paramInt != -1)
      return Collections.emptyMap(); 
    if (paramIntent == null)
      return Collections.emptyMap(); 
    String[] arrayOfString = paramIntent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
    int[] arrayOfInt = paramIntent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
    if (arrayOfInt == null || arrayOfString == null)
      return Collections.emptyMap(); 
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    int i = arrayOfString.length;
    for (paramInt = 0; paramInt < i; paramInt++) {
      boolean bool;
      String str = arrayOfString[paramInt];
      if (arrayOfInt[paramInt] == 0) {
        bool = true;
      } else {
        bool = false;
      } 
      hashMap.put(str, Boolean.valueOf(bool));
    } 
    return (Map)hashMap;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/activity/result/e/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */