package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.c1.b0.e;
import com.google.android.exoplayer2.c1.d0.g0;
import com.google.android.exoplayer2.c1.d0.h;
import com.google.android.exoplayer2.c1.d0.h0;
import com.google.android.exoplayer2.c1.d0.j;
import com.google.android.exoplayer2.c1.d0.l;
import com.google.android.exoplayer2.c1.h;
import com.google.android.exoplayer2.c1.i;
import com.google.android.exoplayer2.extractor.mp4.g;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.e0;
import com.google.android.exoplayer2.util.r;
import java.io.EOFException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class f implements i {
  private final int b;
  
  private final boolean c;
  
  public f() {
    this(0, true);
  }
  
  public f(int paramInt, boolean paramBoolean) {
    this.b = paramInt;
    this.c = paramBoolean;
  }
  
  private static i.a b(h paramh) {
    if (paramh instanceof j || paramh instanceof com.google.android.exoplayer2.c1.d0.f || paramh instanceof h || paramh instanceof e) {
      boolean bool1 = true;
      return new i.a(paramh, bool1, h(paramh));
    } 
    boolean bool = false;
    return new i.a(paramh, bool, h(paramh));
  }
  
  private static i.a c(h paramh, Format paramFormat, e0 parame0) {
    return (paramh instanceof p) ? b(new p(paramFormat.B, parame0)) : ((paramh instanceof j) ? b((h)new j()) : ((paramh instanceof com.google.android.exoplayer2.c1.d0.f) ? b((h)new com.google.android.exoplayer2.c1.d0.f()) : ((paramh instanceof h) ? b((h)new h()) : ((paramh instanceof e) ? b((h)new e()) : null))));
  }
  
  private h d(Uri paramUri, Format paramFormat, List<Format> paramList, e0 parame0) {
    String str2 = paramUri.getLastPathSegment();
    String str1 = str2;
    if (str2 == null)
      str1 = ""; 
    return (h)(("text/vtt".equals(paramFormat.j) || str1.endsWith(".webvtt") || str1.endsWith(".vtt")) ? new p(paramFormat.B, parame0) : (str1.endsWith(".aac") ? new j() : ((str1.endsWith(".ac3") || str1.endsWith(".ec3")) ? new com.google.android.exoplayer2.c1.d0.f() : (str1.endsWith(".ac4") ? new h() : (str1.endsWith(".mp3") ? new e(0, 0L) : ((str1.endsWith(".mp4") || str1.startsWith(".m4", str1.length() - 4) || str1.startsWith(".mp4", str1.length() - 5) || str1.startsWith(".cmf", str1.length() - 5)) ? e(parame0, paramFormat, paramList) : f(this.b, this.c, paramFormat, paramList, parame0)))))));
  }
  
  private static g e(e0 parame0, Format paramFormat, List<Format> paramList) {
    boolean bool;
    if (g(paramFormat)) {
      bool = true;
    } else {
      bool = false;
    } 
    if (paramList == null)
      paramList = Collections.emptyList(); 
    return new g(bool, parame0, null, paramList);
  }
  
  private static g0 f(int paramInt, boolean paramBoolean, Format paramFormat, List<Format> paramList, e0 parame0) {
    paramInt |= 0x10;
    if (paramList != null) {
      paramInt |= 0x20;
    } else if (paramBoolean) {
      paramList = Collections.singletonList(Format.x(null, "application/cea-608", 0, null));
    } else {
      paramList = Collections.emptyList();
    } 
    String str = paramFormat.g;
    int j = paramInt;
    if (!TextUtils.isEmpty(str)) {
      int k = paramInt;
      if (!"audio/mp4a-latm".equals(r.b(str)))
        k = paramInt | 0x2; 
      j = k;
      if (!"video/avc".equals(r.k(str)))
        j = k | 0x4; 
    } 
    return new g0(2, parame0, (h0.c)new l(j, paramList));
  }
  
  private static boolean g(Format paramFormat) {
    Metadata metadata = paramFormat.h;
    if (metadata == null)
      return false; 
    for (byte b = 0; b < metadata.d(); b++) {
      Metadata.Entry entry = metadata.c(b);
      if (entry instanceof HlsTrackMetadataEntry)
        return ((HlsTrackMetadataEntry)entry).d.isEmpty() ^ true; 
    } 
    return false;
  }
  
  private static boolean h(h paramh) {
    return (paramh instanceof g0 || paramh instanceof g);
  }
  
  private static boolean i(h paramh, i parami) {
    boolean bool;
    try {
      bool = paramh.e(parami);
    } catch (EOFException eOFException) {
      parami.h();
    } finally {
      parami.h();
    } 
    return bool;
  }
  
  public i.a a(h paramh, Uri paramUri, Format paramFormat, List<Format> paramList, e0 parame0, Map<String, List<String>> paramMap, i parami) {
    StringBuilder stringBuilder;
    if (paramh != null) {
      if (h(paramh))
        return b(paramh); 
      if (c(paramh, paramFormat, parame0) == null) {
        stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected previousExtractor type: ");
        stringBuilder.append(paramh.getClass().getSimpleName());
        throw new IllegalArgumentException(stringBuilder.toString());
      } 
    } 
    paramh = d((Uri)stringBuilder, paramFormat, paramList, parame0);
    parami.h();
    if (i(paramh, parami))
      return b(paramh); 
    if (!(paramh instanceof p)) {
      p p = new p(paramFormat.B, parame0);
      if (i(p, parami))
        return b(p); 
    } 
    if (!(paramh instanceof j)) {
      j j = new j();
      if (i((h)j, parami))
        return b((h)j); 
    } 
    if (!(paramh instanceof com.google.android.exoplayer2.c1.d0.f)) {
      com.google.android.exoplayer2.c1.d0.f f1 = new com.google.android.exoplayer2.c1.d0.f();
      if (i((h)f1, parami))
        return b((h)f1); 
    } 
    if (!(paramh instanceof h)) {
      h h1 = new h();
      if (i((h)h1, parami))
        return b((h)h1); 
    } 
    if (!(paramh instanceof e)) {
      e e = new e(0, 0L);
      if (i((h)e, parami))
        return b((h)e); 
    } 
    if (!(paramh instanceof g)) {
      g g = e(parame0, paramFormat, paramList);
      if (i((h)g, parami))
        return b((h)g); 
    } 
    if (!(paramh instanceof g0)) {
      g0 g0 = f(this.b, this.c, paramFormat, paramList, parame0);
      if (i((h)g0, parami))
        return b((h)g0); 
    } 
    return b(paramh);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/source/hls/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */