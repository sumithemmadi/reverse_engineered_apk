package com.google.android.datatransport.h;

import android.util.Base64;
import com.google.android.datatransport.Priority;
import com.google.auto.value.AutoValue;
import com.google.auto.value.AutoValue.Builder;

@AutoValue
public abstract class m {
  public static a a() {
    return (new c.b()).d(Priority.b);
  }
  
  public abstract String b();
  
  public abstract byte[] c();
  
  public abstract Priority d();
  
  public m e(Priority paramPriority) {
    return a().b(b()).d(paramPriority).c(c()).a();
  }
  
  public final String toString() {
    String str2;
    String str1 = b();
    Priority priority = d();
    if (c() == null) {
      str2 = "";
    } else {
      str2 = Base64.encodeToString(c(), 2);
    } 
    return String.format("TransportContext(%s, %s, %s)", new Object[] { str1, priority, str2 });
  }
  
  @Builder
  public static abstract class a {
    public abstract m a();
    
    public abstract a b(String param1String);
    
    public abstract a c(byte[] param1ArrayOfbyte);
    
    public abstract a d(Priority param1Priority);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/h/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */