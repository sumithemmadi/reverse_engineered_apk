package b.h.h;

import android.util.Base64;
import b.h.j.i;
import java.util.List;

public final class d {
  private final String a;
  
  private final String b;
  
  private final String c;
  
  private final List<List<byte[]>> d;
  
  private final int e;
  
  private final String f;
  
  public d(String paramString1, String paramString2, String paramString3, List<List<byte[]>> paramList) {
    this.a = (String)i.e(paramString1);
    this.b = (String)i.e(paramString2);
    this.c = (String)i.e(paramString3);
    this.d = (List<List<byte[]>>)i.e(paramList);
    this.e = 0;
    this.f = a(paramString1, paramString2, paramString3);
  }
  
  private String a(String paramString1, String paramString2, String paramString3) {
    StringBuilder stringBuilder = new StringBuilder(paramString1);
    stringBuilder.append("-");
    stringBuilder.append(paramString2);
    stringBuilder.append("-");
    stringBuilder.append(paramString3);
    return stringBuilder.toString();
  }
  
  public List<List<byte[]>> b() {
    return this.d;
  }
  
  public int c() {
    return this.e;
  }
  
  String d() {
    return this.f;
  }
  
  public String e() {
    return this.a;
  }
  
  public String f() {
    return this.b;
  }
  
  public String g() {
    return this.c;
  }
  
  public String toString() {
    StringBuilder stringBuilder1 = new StringBuilder();
    StringBuilder stringBuilder2 = new StringBuilder();
    stringBuilder2.append("FontRequest {mProviderAuthority: ");
    stringBuilder2.append(this.a);
    stringBuilder2.append(", mProviderPackage: ");
    stringBuilder2.append(this.b);
    stringBuilder2.append(", mQuery: ");
    stringBuilder2.append(this.c);
    stringBuilder2.append(", mCertificates:");
    stringBuilder1.append(stringBuilder2.toString());
    for (byte b = 0; b < this.d.size(); b++) {
      stringBuilder1.append(" [");
      List<byte[]> list = this.d.get(b);
      for (byte b1 = 0; b1 < list.size(); b1++) {
        stringBuilder1.append(" \"");
        stringBuilder1.append(Base64.encodeToString(list.get(b1), 0));
        stringBuilder1.append("\"");
      } 
      stringBuilder1.append(" ]");
    } 
    stringBuilder1.append("}");
    stringBuilder2 = new StringBuilder();
    stringBuilder2.append("mCertificatesArray: ");
    stringBuilder2.append(this.e);
    stringBuilder1.append(stringBuilder2.toString());
    return stringBuilder1.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/h/h/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */