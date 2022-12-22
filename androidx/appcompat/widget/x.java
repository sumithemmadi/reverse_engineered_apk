package androidx.appcompat.widget;

class x {
  private int a = 0;
  
  private int b = 0;
  
  private int c = Integer.MIN_VALUE;
  
  private int d = Integer.MIN_VALUE;
  
  private int e = 0;
  
  private int f = 0;
  
  private boolean g = false;
  
  private boolean h = false;
  
  public int a() {
    int i;
    if (this.g) {
      i = this.a;
    } else {
      i = this.b;
    } 
    return i;
  }
  
  public int b() {
    return this.a;
  }
  
  public int c() {
    return this.b;
  }
  
  public int d() {
    int i;
    if (this.g) {
      i = this.b;
    } else {
      i = this.a;
    } 
    return i;
  }
  
  public void e(int paramInt1, int paramInt2) {
    this.h = false;
    if (paramInt1 != Integer.MIN_VALUE) {
      this.e = paramInt1;
      this.a = paramInt1;
    } 
    if (paramInt2 != Integer.MIN_VALUE) {
      this.f = paramInt2;
      this.b = paramInt2;
    } 
  }
  
  public void f(boolean paramBoolean) {
    if (paramBoolean == this.g)
      return; 
    this.g = paramBoolean;
    if (this.h) {
      if (paramBoolean) {
        int i = this.d;
        if (i == Integer.MIN_VALUE)
          i = this.e; 
        this.a = i;
        i = this.c;
        if (i == Integer.MIN_VALUE)
          i = this.f; 
        this.b = i;
      } else {
        int i = this.c;
        if (i == Integer.MIN_VALUE)
          i = this.e; 
        this.a = i;
        i = this.d;
        if (i == Integer.MIN_VALUE)
          i = this.f; 
        this.b = i;
      } 
    } else {
      this.a = this.e;
      this.b = this.f;
    } 
  }
  
  public void g(int paramInt1, int paramInt2) {
    this.c = paramInt1;
    this.d = paramInt2;
    this.h = true;
    if (this.g) {
      if (paramInt2 != Integer.MIN_VALUE)
        this.a = paramInt2; 
      if (paramInt1 != Integer.MIN_VALUE)
        this.b = paramInt1; 
    } else {
      if (paramInt1 != Integer.MIN_VALUE)
        this.a = paramInt1; 
      if (paramInt2 != Integer.MIN_VALUE)
        this.b = paramInt2; 
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/widget/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */