package b.h.k;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import b.h.j.i;

public final class c {
  final ClipData a;
  
  final int b;
  
  final int c;
  
  final Uri d;
  
  final Bundle e;
  
  c(a parama) {
    this.a = (ClipData)i.e(parama.a);
    this.b = i.b(parama.b, 0, 3, "source");
    this.c = i.d(parama.c, 1);
    this.d = parama.d;
    this.e = parama.e;
  }
  
  static String a(int paramInt) {
    return ((paramInt & 0x1) != 0) ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(paramInt);
  }
  
  static String e(int paramInt) {
    return (paramInt != 0) ? ((paramInt != 1) ? ((paramInt != 2) ? ((paramInt != 3) ? String.valueOf(paramInt) : "SOURCE_DRAG_AND_DROP") : "SOURCE_INPUT_METHOD") : "SOURCE_CLIPBOARD") : "SOURCE_APP";
  }
  
  public ClipData b() {
    return this.a;
  }
  
  public int c() {
    return this.c;
  }
  
  public int d() {
    return this.b;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("ContentInfoCompat{clip=");
    stringBuilder.append(this.a);
    stringBuilder.append(", source=");
    stringBuilder.append(e(this.b));
    stringBuilder.append(", flags=");
    stringBuilder.append(a(this.c));
    stringBuilder.append(", linkUri=");
    stringBuilder.append(this.d);
    stringBuilder.append(", extras=");
    stringBuilder.append(this.e);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
  
  public static final class a {
    ClipData a;
    
    int b;
    
    int c;
    
    Uri d;
    
    Bundle e;
    
    public a(ClipData param1ClipData, int param1Int) {
      this.a = param1ClipData;
      this.b = param1Int;
    }
    
    public c a() {
      return new c(this);
    }
    
    public a b(Bundle param1Bundle) {
      this.e = param1Bundle;
      return this;
    }
    
    public a c(int param1Int) {
      this.c = param1Int;
      return this;
    }
    
    public a d(Uri param1Uri) {
      this.d = param1Uri;
      return this;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/h/k/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */