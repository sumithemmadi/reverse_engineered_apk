package com.google.android.gms.common.server.response;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Iterator;

public abstract class FastSafeParcelableJsonResponse extends FastJsonResponse implements SafeParcelable {
  public Object c(String paramString) {
    return null;
  }
  
  public final int describeContents() {
    return 0;
  }
  
  public boolean e(String paramString) {
    return false;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!getClass().isInstance(paramObject))
      return false; 
    FastJsonResponse fastJsonResponse = (FastJsonResponse)paramObject;
    paramObject = a().values().iterator();
    while (paramObject.hasNext()) {
      FastJsonResponse.Field field = paramObject.next();
      if (d(field)) {
        if (!fastJsonResponse.d(field) || !b(field).equals(fastJsonResponse.b(field)))
          return false; 
        continue;
      } 
      if (fastJsonResponse.d(field))
        return false; 
    } 
    return true;
  }
  
  public int hashCode() {
    Iterator<FastJsonResponse.Field> iterator = a().values().iterator();
    int i = 0;
    while (iterator.hasNext()) {
      FastJsonResponse.Field field = iterator.next();
      if (d(field))
        i = i * 31 + b(field).hashCode(); 
    } 
    return i;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/server/response/FastSafeParcelableJsonResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */