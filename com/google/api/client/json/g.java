package com.google.api.client.json;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface g {
  a[] typeDefinitions();
  
  @Retention(RetentionPolicy.RUNTIME)
  @Target({ElementType.FIELD})
  public static @interface a {
    String key();
    
    Class<?> ref();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/api/client/json/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */