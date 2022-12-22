package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class r {
  public static boolean a(Object paramObject1, Object paramObject2) {
    return (paramObject1 == paramObject2 || (paramObject1 != null && paramObject1.equals(paramObject2)));
  }
  
  public static int b(Object... paramVarArgs) {
    return Arrays.hashCode(paramVarArgs);
  }
  
  public static a c(Object paramObject) {
    return new a(paramObject, null);
  }
  
  public static final class a {
    private final List<String> a;
    
    private final Object b;
    
    private a(Object param1Object) {
      this.b = t.j(param1Object);
      this.a = new ArrayList<String>();
    }
    
    public final a a(String param1String, Object param1Object) {
      List<String> list = this.a;
      param1String = t.<String>j(param1String);
      param1Object = String.valueOf(param1Object);
      StringBuilder stringBuilder = new StringBuilder(String.valueOf(param1String).length() + 1 + param1Object.length());
      stringBuilder.append(param1String);
      stringBuilder.append("=");
      stringBuilder.append((String)param1Object);
      list.add(stringBuilder.toString());
      return this;
    }
    
    public final String toString() {
      StringBuilder stringBuilder = new StringBuilder(100);
      stringBuilder.append(this.b.getClass().getSimpleName());
      stringBuilder.append('{');
      int i = this.a.size();
      for (byte b = 0; b < i; b++) {
        stringBuilder.append(this.a.get(b));
        if (b < i - 1)
          stringBuilder.append(", "); 
      } 
      stringBuilder.append('}');
      return stringBuilder.toString();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/internal/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */