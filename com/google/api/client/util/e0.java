package com.google.api.client.util;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface e0 {
  String value() default "##default";
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/api/client/util/e0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */