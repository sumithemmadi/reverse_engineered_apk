package org.xutils.db.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface Table {
  String name();
  
  String onCreated() default "";
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/org/xutils/db/annotation/Table.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */