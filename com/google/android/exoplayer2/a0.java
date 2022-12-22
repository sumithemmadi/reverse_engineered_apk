package com.google.android.exoplayer2;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.audio.AudioSink;
import com.google.android.exoplayer2.audio.DefaultAudioSink;
import com.google.android.exoplayer2.audio.j;
import com.google.android.exoplayer2.audio.l;
import com.google.android.exoplayer2.audio.t;
import com.google.android.exoplayer2.drm.k;
import com.google.android.exoplayer2.drm.o;
import com.google.android.exoplayer2.mediacodec.f;
import com.google.android.exoplayer2.metadata.e;
import com.google.android.exoplayer2.metadata.f;
import com.google.android.exoplayer2.text.j;
import com.google.android.exoplayer2.text.k;
import com.google.android.exoplayer2.util.o;
import com.google.android.exoplayer2.video.MediaCodecVideoRenderer;
import com.google.android.exoplayer2.video.q;
import com.google.android.exoplayer2.video.r.b;
import java.util.ArrayList;

public class a0 implements v0 {
  private final Context a;
  
  private k<o> b;
  
  private int c;
  
  private long d;
  
  private boolean e;
  
  private boolean f;
  
  private f g;
  
  public a0(Context paramContext) {
    this.a = paramContext;
    this.c = 0;
    this.d = 5000L;
    this.g = f.a;
  }
  
  public r0[] a(Handler paramHandler, q paramq, l paraml, j paramj, e parame, k<o> paramk) {
    if (paramk == null)
      paramk = this.b; 
    ArrayList<r0> arrayList = new ArrayList();
    h(this.a, this.c, this.g, paramk, this.e, this.f, paramHandler, paramq, this.d, arrayList);
    c(this.a, this.c, this.g, paramk, this.e, this.f, b(), paramHandler, paraml, arrayList);
    g(this.a, paramj, paramHandler.getLooper(), this.c, arrayList);
    e(this.a, parame, paramHandler.getLooper(), this.c, arrayList);
    d(this.a, this.c, arrayList);
    f(this.a, paramHandler, this.c, arrayList);
    return arrayList.<r0>toArray(new r0[0]);
  }
  
  protected AudioProcessor[] b() {
    return new AudioProcessor[0];
  }
  
  protected void c(Context paramContext, int paramInt, f paramf, k<o> paramk, boolean paramBoolean1, boolean paramBoolean2, AudioProcessor[] paramArrayOfAudioProcessor, Handler paramHandler, l paraml, ArrayList<r0> paramArrayList) {
    paramArrayList.add(new t(paramContext, paramf, paramk, paramBoolean1, paramBoolean2, paramHandler, paraml, (AudioSink)new DefaultAudioSink(j.b(paramContext), paramArrayOfAudioProcessor)));
    if (paramInt == 0)
      return; 
    int i = paramArrayList.size();
    int j = i;
    if (paramInt == 2)
      j = i - 1; 
    try {
      r0 r0 = Class.forName("com.google.android.exoplayer2.ext.opus.LibopusAudioRenderer").getConstructor(new Class[] { Handler.class, l.class, AudioProcessor[].class }).newInstance(new Object[] { paramHandler, paraml, paramArrayOfAudioProcessor });
      paramInt = j + 1;
      try {
        paramArrayList.add(j, r0);
        o.e("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
      } catch (ClassNotFoundException classNotFoundException) {
        j = paramInt;
        paramInt = j;
      } 
      try {
        r0 = Class.forName("com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer").getConstructor(new Class[] { Handler.class, l.class, AudioProcessor[].class }).newInstance(new Object[] { paramHandler, paraml, paramArrayOfAudioProcessor });
        j = paramInt + 1;
        try {
          paramArrayList.add(paramInt, r0);
          o.e("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
          paramInt = j;
        } catch (ClassNotFoundException classNotFoundException) {
          paramInt = j;
        } 
      } catch (ClassNotFoundException classNotFoundException) {
      
      } catch (Exception exception) {
        throw new RuntimeException("Error instantiating FLAC extension", exception);
      } 
      try {
        paramArrayList.add(paramInt, Class.forName("com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(new Class[] { Handler.class, l.class, AudioProcessor[].class }).newInstance(new Object[] { paramHandler, paraml, paramArrayOfAudioProcessor }));
        o.e("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
      } catch (ClassNotFoundException classNotFoundException) {
      
      } catch (Exception exception) {
        throw new RuntimeException("Error instantiating FFmpeg extension", exception);
      } 
    } catch (ClassNotFoundException classNotFoundException) {
    
    } catch (Exception exception) {
      throw new RuntimeException("Error instantiating Opus extension", exception);
    } 
    paramInt = j;
  }
  
  protected void d(Context paramContext, int paramInt, ArrayList<r0> paramArrayList) {
    paramArrayList.add(new b());
  }
  
  protected void e(Context paramContext, e parame, Looper paramLooper, int paramInt, ArrayList<r0> paramArrayList) {
    paramArrayList.add(new f(parame, paramLooper));
  }
  
  protected void f(Context paramContext, Handler paramHandler, int paramInt, ArrayList<r0> paramArrayList) {}
  
  protected void g(Context paramContext, j paramj, Looper paramLooper, int paramInt, ArrayList<r0> paramArrayList) {
    paramArrayList.add(new k(paramj, paramLooper));
  }
  
  protected void h(Context paramContext, int paramInt, f paramf, k<o> paramk, boolean paramBoolean1, boolean paramBoolean2, Handler paramHandler, q paramq, long paramLong, ArrayList<r0> paramArrayList) {
    paramArrayList.add(new MediaCodecVideoRenderer(paramContext, paramf, paramLong, paramk, paramBoolean1, paramBoolean2, paramHandler, paramq, 50));
    if (paramInt == 0)
      return; 
    int i = paramArrayList.size();
    int j = i;
    if (paramInt == 2)
      j = i - 1; 
    try {
      r0 r0 = Class.forName("com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer").getConstructor(new Class[] { long.class, Handler.class, q.class, int.class }).newInstance(new Object[] { Long.valueOf(paramLong), paramHandler, paramq, Integer.valueOf(50) });
      paramInt = j + 1;
      try {
        paramArrayList.add(j, r0);
        o.e("DefaultRenderersFactory", "Loaded LibvpxVideoRenderer.");
      } catch (ClassNotFoundException classNotFoundException) {
        j = paramInt;
        paramInt = j;
      } 
      try {
        paramArrayList.add(paramInt, Class.forName("com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer").getConstructor(new Class[] { long.class, Handler.class, q.class, int.class }).newInstance(new Object[] { Long.valueOf(paramLong), paramHandler, paramq, Integer.valueOf(50) }));
        o.e("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
      } catch (ClassNotFoundException classNotFoundException) {
      
      } catch (Exception exception) {
        throw new RuntimeException("Error instantiating AV1 extension", exception);
      } 
    } catch (ClassNotFoundException classNotFoundException) {
    
    } catch (Exception exception) {
      throw new RuntimeException("Error instantiating VP9 extension", exception);
    } 
    paramInt = j;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/a0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */