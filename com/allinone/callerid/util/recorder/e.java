package com.allinone.callerid.util.recorder;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class e {
  private static final ThreadLocal<SimpleDateFormat> a = new a();
  
  private static ThreadLocal<SimpleDateFormat> b = new ThreadLocal<SimpleDateFormat>();
  
  public static boolean a(long paramLong) {
    Calendar calendar1 = Calendar.getInstance();
    calendar1.setTime(new Date(System.currentTimeMillis()));
    Calendar calendar2 = Calendar.getInstance();
    calendar2.setTime(new Date(paramLong));
    return (calendar2.get(1) == calendar1.get(1) && calendar2.get(6) - calendar1.get(6) == 0);
  }
  
  static final class a extends ThreadLocal<SimpleDateFormat> {
    protected SimpleDateFormat a() {
      return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/recorder/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */