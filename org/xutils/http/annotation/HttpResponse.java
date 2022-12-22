package org.xutils.http.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.xutils.http.app.ResponseParser;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface HttpResponse {
  Class<? extends ResponseParser> parser();
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/org/xutils/http/annotation/HttpResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */