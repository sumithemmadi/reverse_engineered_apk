package b.h.e;

import android.graphics.Insets;
import android.graphics.Rect;

public final class b {
  public static final b a = new b(0, 0, 0, 0);
  
  public final int b;
  
  public final int c;
  
  public final int d;
  
  public final int e;
  
  private b(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramInt3;
    this.e = paramInt4;
  }
  
  public static b a(b paramb1, b paramb2) {
    return b(Math.max(paramb1.b, paramb2.b), Math.max(paramb1.c, paramb2.c), Math.max(paramb1.d, paramb2.d), Math.max(paramb1.e, paramb2.e));
  }
  
  public static b b(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return (paramInt1 == 0 && paramInt2 == 0 && paramInt3 == 0 && paramInt4 == 0) ? a : new b(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public static b c(Rect paramRect) {
    return b(paramRect.left, paramRect.top, paramRect.right, paramRect.bottom);
  }
  
  public static b d(Insets paramInsets) {
    return b(paramInsets.left, paramInsets.top, paramInsets.right, paramInsets.bottom);
  }
  
  public Insets e() {
    return Insets.of(this.b, this.c, this.d, this.e);
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || b.class != paramObject.getClass())
      return false; 
    paramObject = paramObject;
    return (this.e != ((b)paramObject).e) ? false : ((this.b != ((b)paramObject).b) ? false : ((this.d != ((b)paramObject).d) ? false : (!(this.c != ((b)paramObject).c))));
  }
  
  public int hashCode() {
    return ((this.b * 31 + this.c) * 31 + this.d) * 31 + this.e;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Insets{left=");
    stringBuilder.append(this.b);
    stringBuilder.append(", top=");
    stringBuilder.append(this.c);
    stringBuilder.append(", right=");
    stringBuilder.append(this.d);
    stringBuilder.append(", bottom=");
    stringBuilder.append(this.e);
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/h/e/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */