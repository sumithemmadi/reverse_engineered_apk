package androidx.media;

import java.util.Arrays;

public class AudioAttributesImplBase implements AudioAttributesImpl {
  public int a = 0;
  
  public int b = 0;
  
  public int c = 0;
  
  public int d = -1;
  
  public int a() {
    return this.b;
  }
  
  public int b() {
    int k;
    int i = this.c;
    int j = c();
    if (j == 6) {
      k = i | 0x4;
    } else {
      k = i;
      if (j == 7)
        k = i | 0x1; 
    } 
    return k & 0x111;
  }
  
  public int c() {
    int i = this.d;
    return (i != -1) ? i : AudioAttributesCompat.a(false, this.c, this.a);
  }
  
  public int d() {
    return this.a;
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = paramObject instanceof AudioAttributesImplBase;
    boolean bool1 = false;
    if (!bool)
      return false; 
    paramObject = paramObject;
    bool = bool1;
    if (this.b == paramObject.a()) {
      bool = bool1;
      if (this.c == paramObject.b()) {
        bool = bool1;
        if (this.a == paramObject.d()) {
          bool = bool1;
          if (this.d == ((AudioAttributesImplBase)paramObject).d)
            bool = true; 
        } 
      } 
    } 
    return bool;
  }
  
  public int hashCode() {
    return Arrays.hashCode(new Object[] { Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.a), Integer.valueOf(this.d) });
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder("AudioAttributesCompat:");
    if (this.d != -1) {
      stringBuilder.append(" stream=");
      stringBuilder.append(this.d);
      stringBuilder.append(" derived");
    } 
    stringBuilder.append(" usage=");
    stringBuilder.append(AudioAttributesCompat.b(this.a));
    stringBuilder.append(" content=");
    stringBuilder.append(this.b);
    stringBuilder.append(" flags=0x");
    stringBuilder.append(Integer.toHexString(this.c).toUpperCase());
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/media/AudioAttributesImplBase.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */