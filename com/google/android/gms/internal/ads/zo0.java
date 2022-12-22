package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import com.google.android.gms.common.util.e;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;

public final class zo0 {
  private final e a;
  
  public zo0(e parame) {
    this.a = parame;
  }
  
  public final void a(List<Object> paramList, String paramString1, String paramString2, Object... paramVarArgs) {
    if (!((Boolean)i2.a.a()).booleanValue())
      return; 
    long l = this.a.a();
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    try {
      jsonWriter.beginObject();
      jsonWriter.name("timestamp").value(l);
      jsonWriter.name("source").value(paramString1);
      jsonWriter.name("event").value(paramString2);
      jsonWriter.name("components").beginArray();
      Iterator<E> iterator = paramList.iterator();
      while (iterator.hasNext())
        jsonWriter.value(iterator.next().toString()); 
      jsonWriter.endArray();
      jsonWriter.name("params").beginArray();
      int i = paramVarArgs.length;
      for (byte b = 0; b < i; b++) {
        Object object = paramVarArgs[b];
        if (object != null) {
          object = object.toString();
        } else {
          object = null;
        } 
        jsonWriter.value((String)object);
      } 
      jsonWriter.endArray();
      jsonWriter.endObject();
      jsonWriter.flush();
      jsonWriter.close();
    } catch (IOException iOException) {
      cm.c("unable to log", iOException);
    } 
    String str = String.valueOf(stringWriter.toString());
    if (str.length() != 0) {
      str = "AD-DBG ".concat(str);
    } else {
      str = new String("AD-DBG ");
    } 
    cm.h(str);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zo0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */