package androidx.media;

import androidx.versionedparcelable.VersionedParcel;

public class AudioAttributesImplBaseParcelizer {
  public static AudioAttributesImplBase read(VersionedParcel paramVersionedParcel) {
    AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
    audioAttributesImplBase.a = paramVersionedParcel.p(audioAttributesImplBase.a, 1);
    audioAttributesImplBase.b = paramVersionedParcel.p(audioAttributesImplBase.b, 2);
    audioAttributesImplBase.c = paramVersionedParcel.p(audioAttributesImplBase.c, 3);
    audioAttributesImplBase.d = paramVersionedParcel.p(audioAttributesImplBase.d, 4);
    return audioAttributesImplBase;
  }
  
  public static void write(AudioAttributesImplBase paramAudioAttributesImplBase, VersionedParcel paramVersionedParcel) {
    paramVersionedParcel.x(false, false);
    paramVersionedParcel.F(paramAudioAttributesImplBase.a, 1);
    paramVersionedParcel.F(paramAudioAttributesImplBase.b, 2);
    paramVersionedParcel.F(paramAudioAttributesImplBase.c, 3);
    paramVersionedParcel.F(paramAudioAttributesImplBase.d, 4);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/media/AudioAttributesImplBaseParcelizer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */