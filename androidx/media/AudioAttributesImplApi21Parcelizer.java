package androidx.media;

import android.media.AudioAttributes;
import android.os.Parcelable;
import androidx.versionedparcelable.VersionedParcel;

public class AudioAttributesImplApi21Parcelizer {
  public static AudioAttributesImplApi21 read(VersionedParcel paramVersionedParcel) {
    AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
    audioAttributesImplApi21.a = (AudioAttributes)paramVersionedParcel.r((Parcelable)audioAttributesImplApi21.a, 1);
    audioAttributesImplApi21.b = paramVersionedParcel.p(audioAttributesImplApi21.b, 2);
    return audioAttributesImplApi21;
  }
  
  public static void write(AudioAttributesImplApi21 paramAudioAttributesImplApi21, VersionedParcel paramVersionedParcel) {
    paramVersionedParcel.x(false, false);
    paramVersionedParcel.H((Parcelable)paramAudioAttributesImplApi21.a, 1);
    paramVersionedParcel.F(paramAudioAttributesImplApi21.b, 2);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/media/AudioAttributesImplApi21Parcelizer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */