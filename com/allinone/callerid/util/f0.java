package com.allinone.callerid.util;

import android.content.Context;
import com.allinone.callerid.main.EZCallApplication;
import com.tencent.mmkv.MMKV;

public class f0 {
  public static String a = d();
  
  public static boolean a(String paramString1, String paramString2, boolean paramBoolean) {
    try {
      if (MMKV.o() == null) {
        String str = a;
        c c = new c();
        this();
        MMKV.p(str, c);
      } 
    } finally {
      paramString1 = null;
    } 
    return paramBoolean;
  }
  
  public static int b(String paramString1, String paramString2, int paramInt) {
    try {
      if (MMKV.o() == null) {
        String str = a;
        e e = new e();
        this();
        MMKV.p(str, e);
      } 
    } finally {
      paramString1 = null;
    } 
    return paramInt;
  }
  
  public static long c(String paramString1, String paramString2, long paramLong) {
    try {
      if (MMKV.o() == null) {
        String str = a;
        g g = new g();
        this();
        MMKV.p(str, g);
      } 
    } finally {
      paramString1 = null;
    } 
    return paramLong;
  }
  
  private static String d() {
    String str;
    try {
      StringBuilder stringBuilder = new StringBuilder();
      this();
      stringBuilder.append(EZCallApplication.c().getFilesDir().getAbsolutePath());
      stringBuilder.append("/mmkv");
      str = stringBuilder.toString();
    } catch (Exception exception) {
      exception.printStackTrace();
      str = "";
    } 
    return str;
  }
  
  public static String e(String paramString1, String paramString2, String paramString3) {
    try {
      if (MMKV.o() == null) {
        String str = a;
        a a = new a();
        this();
        MMKV.p(str, a);
      } 
    } finally {
      paramString1 = null;
    } 
    return paramString3;
  }
  
  public static void f(String paramString1, String paramString2, boolean paramBoolean) {
    try {
      if (MMKV.o() == null) {
        String str = a;
        d d = new d();
        this();
        MMKV.p(str, d);
      } 
    } finally {
      paramString1 = null;
    } 
  }
  
  public static void g(String paramString1, String paramString2, int paramInt) {
    try {
      if (MMKV.o() == null) {
        String str = a;
        f f = new f();
        this();
        MMKV.p(str, f);
      } 
    } finally {
      paramString1 = null;
    } 
  }
  
  public static void h(String paramString1, String paramString2, long paramLong) {
    try {
      if (MMKV.o() == null) {
        String str = a;
        h h = new h();
        this();
        MMKV.p(str, h);
      } 
    } finally {
      paramString1 = null;
    } 
  }
  
  public static void i(String paramString1, String paramString2, String paramString3) {
    try {
      if (MMKV.o() == null) {
        String str = a;
        b b = new b();
        this();
        MMKV.p(str, b);
      } 
    } finally {
      paramString1 = null;
    } 
  }
  
  static final class a implements MMKV.b {
    public void a(String param1String) {
      try {
        com.getkeepsafe.relinker.b.a((Context)EZCallApplication.c(), param1String);
      } finally {
        param1String = null;
      } 
    }
  }
  
  static final class b implements MMKV.b {
    public void a(String param1String) {
      try {
        com.getkeepsafe.relinker.b.a((Context)EZCallApplication.c(), param1String);
      } finally {
        param1String = null;
      } 
    }
  }
  
  static final class c implements MMKV.b {
    public void a(String param1String) {
      try {
        com.getkeepsafe.relinker.b.a((Context)EZCallApplication.c(), param1String);
      } finally {
        param1String = null;
      } 
    }
  }
  
  static final class d implements MMKV.b {
    public void a(String param1String) {
      try {
        com.getkeepsafe.relinker.b.a((Context)EZCallApplication.c(), param1String);
      } finally {
        param1String = null;
      } 
    }
  }
  
  static final class e implements MMKV.b {
    public void a(String param1String) {
      try {
        com.getkeepsafe.relinker.b.a((Context)EZCallApplication.c(), param1String);
      } finally {
        param1String = null;
      } 
    }
  }
  
  static final class f implements MMKV.b {
    public void a(String param1String) {
      try {
        com.getkeepsafe.relinker.b.a((Context)EZCallApplication.c(), param1String);
      } finally {
        param1String = null;
      } 
    }
  }
  
  static final class g implements MMKV.b {
    public void a(String param1String) {
      try {
        com.getkeepsafe.relinker.b.a((Context)EZCallApplication.c(), param1String);
      } finally {
        param1String = null;
      } 
    }
  }
  
  static final class h implements MMKV.b {
    public void a(String param1String) {
      try {
        com.getkeepsafe.relinker.b.a((Context)EZCallApplication.c(), param1String);
      } finally {
        param1String = null;
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/f0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */