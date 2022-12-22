package android.support.v4.media;

import androidx.media.AudioAttributesCompat;
import androidx.media.AudioAttributesCompatParcelizer;
import androidx.versionedparcelable.VersionedParcel;

public final class AudioAttributesCompatParcelizer extends AudioAttributesCompatParcelizer {
  public static AudioAttributesCompat read(VersionedParcel paramVersionedParcel) {
    return AudioAttributesCompatParcelizer.read(paramVersionedParcel);
  }
  
  public static void write(AudioAttributesCompat paramAudioAttributesCompat, VersionedParcel paramVersionedParcel) {
    AudioAttributesCompatParcelizer.write(paramAudioAttributesCompat, paramVersionedParcel);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/android/support/v4/media/AudioAttributesCompatParcelizer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */