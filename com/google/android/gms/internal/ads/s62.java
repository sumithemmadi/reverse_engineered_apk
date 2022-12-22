package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Map;

final class s62 extends t62<FieldDescriptorType, Object> {
  s62(int paramInt) {
    super(paramInt, null);
  }
  
  public final void g() {
    if (!a()) {
      for (byte b = 0; b < h(); b++) {
        Map.Entry<K, V> entry = p(b);
        if (((f42)entry.getKey()).j())
          entry.setValue((V)Collections.unmodifiableList((List)entry.getValue())); 
      } 
      for (Map.Entry<K, V> entry : i()) {
        if (((f42)entry.getKey()).j())
          entry.setValue(Collections.unmodifiableList((List)entry.getValue())); 
      } 
    } 
    super.g();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/s62.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */