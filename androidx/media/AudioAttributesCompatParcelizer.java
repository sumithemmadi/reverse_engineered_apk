package androidx.media;

import androidx.versionedparcelable.VersionedParcel;

public class AudioAttributesCompatParcelizer {
  public static AudioAttributesCompat read(VersionedParcel paramVersionedParcel) {
    AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
    audioAttributesCompat.c = (AudioAttributesImpl)paramVersionedParcel.v(audioAttributesCompat.c, 1);
    return audioAttributesCompat;
  }
  
  public static void write(AudioAttributesCompat paramAudioAttributesCompat, VersionedParcel paramVersionedParcel) {
    paramVersionedParcel.x(false, false);
    paramVersionedParcel.M(paramAudioAttributesCompat.c, 1);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/media/AudioAttributesCompatParcelizer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */