package org.xutils.http.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.xutils.http.app.ParamsBuilder;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface HttpRequest {
  Class<? extends ParamsBuilder> builder() default org.xutils.http.app.DefaultParamsBuilder.class;
  
  String[] cacheKeys() default {""};
  
  String host() default "";
  
  String path();
  
  String[] signs() default {""};
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/org/xutils/http/annotation/HttpRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */