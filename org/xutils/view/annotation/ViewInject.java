package org.xutils.view.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface ViewInject {
  int parentId() default 0;
  
  int value();
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/org/xutils/view/annotation/ViewInject.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */