package com.allinone.callerid.util.recorder;

import com.allinone.callerid.util.b1;
import com.allinone.callerid.util.f0;
import com.allinone.callerid.util.i;
import com.allinone.callerid.util.q;

public class b {
  private static int a = d.b();
  
  public static int a() {
    return f0.b("RecordMode", "AUDIOSOURCE", a);
  }
  
  public static String b() {
    return f0.e("RecordMode", "CLEARRECORDDATA", "");
  }
  
  public static Boolean c() {
    return Boolean.valueOf(f0.a("RecordMode", "ISFIRSTENTER", true));
  }
  
  public static boolean d() {
    return f0.a("RecordMode", "HOMERECORDERNEWTIPVIEW", false);
  }
  
  public static boolean e() {
    return f0.a("RecordMode", "ISOPENRECORD", false);
  }
  
  public static boolean f() {
    return f0.a("RecordMode", "RECORDERGUIDE", false);
  }
  
  public static boolean g() {
    return f0.a("RecordMode", "RecordContactCall", false);
  }
  
  public static int h() {
    return f0.b("RecordMode", "RecordMode", 1);
  }
  
  public static boolean i() {
    return f0.a("RecordMode", "RecordUnknownCall", false);
  }
  
  public static void j(int paramInt) {
    f0.g("RecordMode", "AUDIOSOURCE", paramInt);
  }
  
  public static void k(String paramString) {
    f0.i("RecordMode", "CLEARRECORDDATA", paramString);
  }
  
  public static void l(Boolean paramBoolean) {
    f0.f("RecordMode", "ISFIRSTENTER", paramBoolean.booleanValue());
  }
  
  public static void m(boolean paramBoolean) {
    f0.f("RecordMode", "HOMERECORDERNEWTIPVIEW", paramBoolean);
  }
  
  public static void n(boolean paramBoolean) {
    f0.f("RecordMode", "ISOPENRECORD", paramBoolean);
    if (paramBoolean) {
      if (b1.y() != 0L && i.f(b1.y()).equals(i.f(System.currentTimeMillis())))
        q.b().c("recorder_open_record_first_count"); 
      q.b().c("recorder_open_record_function_count");
    } else {
      q.b().c("recorder_close_record_function_count");
    } 
  }
  
  public static void o(boolean paramBoolean) {
    f0.f("RecordMode", "RECORDERGUIDE", paramBoolean);
  }
  
  public static void p(boolean paramBoolean) {
    f0.f("RecordMode", "RecordContactCall", paramBoolean);
  }
  
  public static void q(int paramInt) {
    f0.g("RecordMode", "RecordMode", paramInt);
  }
  
  public static void r(boolean paramBoolean) {
    f0.f("RecordMode", "RecordUnknownCall", paramBoolean);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/recorder/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */