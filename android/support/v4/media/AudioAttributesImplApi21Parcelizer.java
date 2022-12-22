package android.support.v4.media;

import androidx.media.AudioAttributesImplApi21;
import androidx.media.AudioAttributesImplApi21Parcelizer;
import androidx.versionedparcelable.VersionedParcel;

public final class AudioAttributesImplApi21Parcelizer extends AudioAttributesImplApi21Parcelizer {
  public static AudioAttributesImplApi21 read(VersionedParcel paramVersionedParcel) {
    return AudioAttributesImplApi21Parcelizer.read(paramVersionedParcel);
  }
  
  public static void write(AudioAttributesImplApi21 paramAudioAttributesImplApi21, VersionedParcel paramVersionedParcel) {
    AudioAttributesImplApi21Parcelizer.write(paramAudioAttributesImplApi21, paramVersionedParcel);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/android/support/v4/media/AudioAttributesImplApi21Parcelizer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */