package com.danikula.videocache;

import android.text.TextUtils;
import com.danikula.videocache.q.b;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Locale;

class e extends l {
  private final h j;
  
  private final b k;
  
  private b l;
  
  public e(h paramh, b paramb) {
    super(paramh, (a)paramb);
    this.k = paramb;
    this.j = paramh;
  }
  
  private String p(String paramString, Object... paramVarArgs) {
    return String.format(Locale.US, paramString, paramVarArgs);
  }
  
  private boolean q(d paramd) {
    boolean bool2;
    long l1 = this.j.length();
    boolean bool1 = true;
    if (l1 > 0L) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    long l2 = this.k.b();
    boolean bool3 = bool1;
    if (bool2) {
      bool3 = bool1;
      if (paramd.e)
        if ((float)paramd.d <= (float)l2 + (float)l1 * 0.2F) {
          bool3 = bool1;
        } else {
          bool3 = false;
        }  
    } 
    return bool3;
  }
  
  private String r(d paramd) {
    long l1;
    boolean bool2;
    long l2;
    boolean bool4;
    String str3;
    String str2 = this.j.d();
    boolean bool1 = TextUtils.isEmpty(str2);
    if (this.k.d()) {
      l1 = this.k.b();
    } else {
      l1 = this.j.length();
    } 
    if (l1 >= 0L) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    boolean bool3 = paramd.e;
    if (bool3) {
      l2 = l1 - paramd.d;
    } else {
      l2 = l1;
    } 
    if (bool2 && bool3) {
      bool4 = true;
    } else {
      bool4 = false;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    if (paramd.e) {
      str3 = "HTTP/1.1 206 PARTIAL CONTENT\n";
    } else {
      str3 = "HTTP/1.1 200 OK\n";
    } 
    stringBuilder.append(str3);
    stringBuilder.append("Accept-Ranges: bytes\n");
    String str4 = "";
    if (bool2) {
      str3 = p("Content-Length: %d\n", new Object[] { Long.valueOf(l2) });
    } else {
      str3 = "";
    } 
    stringBuilder.append(str3);
    if (bool4) {
      str1 = p("Content-Range: bytes %d-%d/%d\n", new Object[] { Long.valueOf(paramd.d), Long.valueOf(l1 - 1L), Long.valueOf(l1) });
    } else {
      str1 = "";
    } 
    stringBuilder.append(str1);
    String str1 = str4;
    if ((bool1 ^ true) != 0)
      str1 = p("Content-Type: %s\n", new Object[] { str2 }); 
    stringBuilder.append(str1);
    stringBuilder.append("\n");
    return stringBuilder.toString();
  }
  
  private void u(OutputStream paramOutputStream, long paramLong) {
    byte[] arrayOfByte = new byte[8192];
    while (true) {
      int i = j(arrayOfByte, paramLong, 8192);
      if (i != -1) {
        paramOutputStream.write(arrayOfByte, 0, i);
        paramLong += i;
        continue;
      } 
      paramOutputStream.flush();
      return;
    } 
  }
  
  private void v(OutputStream paramOutputStream, long paramLong) {
    h h1 = new h(this.j);
    paramLong = (int)paramLong;
    try {
      h1.a(paramLong);
      byte[] arrayOfByte = new byte[8192];
      while (true) {
        int i = h1.read(arrayOfByte);
        if (i != -1) {
          paramOutputStream.write(arrayOfByte, 0, i);
          continue;
        } 
        paramOutputStream.flush();
        return;
      } 
    } finally {
      h1.close();
    } 
  }
  
  protected void g(int paramInt) {
    b b1 = this.l;
    if (b1 != null)
      b1.a(this.k.b, this.j.e(), paramInt); 
  }
  
  public void s(d paramd, Socket paramSocket) {
    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(paramSocket.getOutputStream());
    bufferedOutputStream.write(r(paramd).getBytes("UTF-8"));
    long l1 = paramd.d;
    if (q(paramd)) {
      u(bufferedOutputStream, l1);
    } else {
      v(bufferedOutputStream, l1);
    } 
  }
  
  public void t(b paramb) {
    this.l = paramb;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/danikula/videocache/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */