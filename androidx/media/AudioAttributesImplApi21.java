package androidx.media;

import android.media.AudioAttributes;

public class AudioAttributesImplApi21 implements AudioAttributesImpl {
  public AudioAttributes a;
  
  public int b = -1;
  
  public boolean equals(Object paramObject) {
    if (!(paramObject instanceof AudioAttributesImplApi21))
      return false; 
    paramObject = paramObject;
    return this.a.equals(((AudioAttributesImplApi21)paramObject).a);
  }
  
  public int hashCode() {
    return this.a.hashCode();
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("AudioAttributesCompat: audioattributes=");
    stringBuilder.append(this.a);
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/media/AudioAttributesImplApi21.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */