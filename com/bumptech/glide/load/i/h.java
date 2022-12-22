package com.bumptech.glide.load.i;

import java.util.Collections;
import java.util.Map;

public interface h {
  @Deprecated
  public static final h a = new a();
  
  public static final h b = (new j.a()).a();
  
  Map<String, String> getHeaders();
  
  class a implements h {
    public Map<String, String> getHeaders() {
      return Collections.emptyMap();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/i/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */