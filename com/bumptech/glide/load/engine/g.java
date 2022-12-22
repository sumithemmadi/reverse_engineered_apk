package com.bumptech.glide.load.engine;

import android.util.Log;
import b.h.j.f;
import com.bumptech.glide.load.data.e;
import com.bumptech.glide.load.e;
import com.bumptech.glide.load.f;
import com.bumptech.glide.load.j.h.e;
import com.bumptech.glide.p.j;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class g<DataType, ResourceType, Transcode> {
  private final Class<DataType> a;
  
  private final List<? extends f<DataType, ResourceType>> b;
  
  private final e<ResourceType, Transcode> c;
  
  private final f<List<Throwable>> d;
  
  private final String e;
  
  public g(Class<DataType> paramClass, Class<ResourceType> paramClass1, Class<Transcode> paramClass2, List<? extends f<DataType, ResourceType>> paramList, e<ResourceType, Transcode> parame, f<List<Throwable>> paramf) {
    this.a = paramClass;
    this.b = paramList;
    this.c = parame;
    this.d = paramf;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Failed DecodePath{");
    stringBuilder.append(paramClass.getSimpleName());
    stringBuilder.append("->");
    stringBuilder.append(paramClass1.getSimpleName());
    stringBuilder.append("->");
    stringBuilder.append(paramClass2.getSimpleName());
    stringBuilder.append("}");
    this.e = stringBuilder.toString();
  }
  
  private s<ResourceType> b(e<DataType> parame, int paramInt1, int paramInt2, e parame1) {
    List<Throwable> list = (List)j.d(this.d.b());
    try {
      return c(parame, paramInt1, paramInt2, parame1, list);
    } finally {
      this.d.c(list);
    } 
  }
  
  private s<ResourceType> c(e<DataType> parame, int paramInt1, int paramInt2, e parame1, List<Throwable> paramList) {
    int i = this.b.size();
    s s = null;
    byte b = 0;
    while (true) {
      s s1 = s;
      if (b < i) {
        f f1 = this.b.get(b);
        s1 = s;
        try {
          if (f1.a(parame.a(), parame1))
            s1 = f1.b(parame.a(), paramInt1, paramInt2, parame1); 
        } catch (IOException iOException) {
          if (Log.isLoggable("DecodePath", 2)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to decode data for ");
            stringBuilder.append(f1);
            Log.v("DecodePath", stringBuilder.toString(), iOException);
          } 
          paramList.add(iOException);
          s s2 = s;
        } catch (RuntimeException runtimeException) {
        
        } catch (OutOfMemoryError outOfMemoryError) {}
        if (outOfMemoryError != null)
          break; 
        b++;
        OutOfMemoryError outOfMemoryError1 = outOfMemoryError;
        continue;
      } 
      break;
    } 
    if (outOfMemoryError != null)
      return (s<ResourceType>)outOfMemoryError; 
    GlideException glideException = new GlideException(this.e, new ArrayList<Throwable>(paramList));
    throw glideException;
  }
  
  public s<Transcode> a(e<DataType> parame, int paramInt1, int paramInt2, e parame1, a<ResourceType> parama) {
    s<ResourceType> s = parama.a(b(parame, paramInt1, paramInt2, parame1));
    return this.c.a(s, parame1);
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("DecodePath{ dataClass=");
    stringBuilder.append(this.a);
    stringBuilder.append(", decoders=");
    stringBuilder.append(this.b);
    stringBuilder.append(", transcoder=");
    stringBuilder.append(this.c);
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
  
  static interface a<ResourceType> {
    s<ResourceType> a(s<ResourceType> param1s);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/engine/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */