package com.allinone.callerid.c.b;

import com.allinone.callerid.util.f0;

public class c {
  public static boolean a() {
    return f0.a("Backup", "backup_enable", false);
  }
  
  public static String b() {
    return f0.e("Backup", "backup_account", "");
  }
  
  public static int c() {
    return f0.b("Backup", "backup_frequency", 0);
  }
  
  public static int d() {
    return f0.b("Backup", "backup_net", 0);
  }
  
  public static long e() {
    return f0.c("Backup", "last_backup_time", 0L);
  }
  
  public static void f(boolean paramBoolean) {
    f0.f("Backup", "backup_enable", paramBoolean);
  }
  
  public static void g(String paramString) {
    f0.i("Backup", "backup_account", paramString);
  }
  
  public static void h(int paramInt) {
    f0.g("Backup", "backup_frequency", paramInt);
  }
  
  public static void i(int paramInt) {
    f0.g("Backup", "backup_net", paramInt);
  }
  
  public static void j(long paramLong) {
    f0.h("Backup", "last_backup_time", paramLong);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/c/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */