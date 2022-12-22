package com.google.android.datatransport.cct.internal;

import android.util.JsonReader;
import android.util.JsonToken;
import com.google.auto.value.AutoValue;
import java.io.IOException;
import java.io.Reader;

@AutoValue
public abstract class m {
  static m a(long paramLong) {
    return new h(paramLong);
  }
  
  public static m b(Reader paramReader) {
    JsonReader jsonReader = new JsonReader(paramReader);
    try {
      jsonReader.beginObject();
      while (jsonReader.hasNext()) {
        if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
          if (jsonReader.peek() == JsonToken.STRING)
            return a(Long.parseLong(jsonReader.nextString())); 
          return a(jsonReader.nextLong());
        } 
        jsonReader.skipValue();
      } 
      IOException iOException = new IOException();
      this("Response is missing nextRequestWaitMillis field.");
      throw iOException;
    } finally {
      jsonReader.close();
    } 
  }
  
  public abstract long c();
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/cct/internal/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */