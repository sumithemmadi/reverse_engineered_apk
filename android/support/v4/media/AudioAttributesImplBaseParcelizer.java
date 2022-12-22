package android.support.v4.media;

import androidx.media.AudioAttributesImplBase;
import androidx.media.AudioAttributesImplBaseParcelizer;
import androidx.versionedparcelable.VersionedParcel;

public final class AudioAttributesImplBaseParcelizer extends AudioAttributesImplBaseParcelizer {
  public static AudioAttributesImplBase read(VersionedParcel paramVersionedParcel) {
    return AudioAttributesImplBaseParcelizer.read(paramVersionedParcel);
  }
  
  public static void write(AudioAttributesImplBase paramAudioAttributesImplBase, VersionedParcel paramVersionedParcel) {
    AudioAttributesImplBaseParcelizer.write(paramAudioAttributesImplBase, paramVersionedParcel);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/android/support/v4/media/AudioAttributesImplBaseParcelizer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */