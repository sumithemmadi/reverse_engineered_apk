package org.xutils.view.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface Event {
  String method() default "";
  
  int[] parentId() default {0};
  
  String setter() default "";
  
  Class<?> type() default android.view.View.OnClickListener.class;
  
  int[] value();
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/org/xutils/view/annotation/Event.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */