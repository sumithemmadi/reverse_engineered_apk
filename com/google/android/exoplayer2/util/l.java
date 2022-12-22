package com.google.android.exoplayer2.util;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import com.google.android.exoplayer2.metadata.flac.VorbisComment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class l {
  public final int a;
  
  public final int b;
  
  public final int c;
  
  public final int d;
  
  public final int e;
  
  public final int f;
  
  public final int g;
  
  public final int h;
  
  public final int i;
  
  public final long j;
  
  public final a k;
  
  private final Metadata l;
  
  private l(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, long paramLong, a parama, Metadata paramMetadata) {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
    this.d = paramInt4;
    this.e = paramInt5;
    this.f = l(paramInt5);
    this.g = paramInt6;
    this.h = paramInt7;
    this.i = g(paramInt7);
    this.j = paramLong;
    this.k = parama;
    this.l = paramMetadata;
  }
  
  public l(byte[] paramArrayOfbyte, int paramInt) {
    u u = new u(paramArrayOfbyte);
    u.o(paramInt * 8);
    this.a = u.h(16);
    this.b = u.h(16);
    this.c = u.h(24);
    this.d = u.h(24);
    paramInt = u.h(20);
    this.e = paramInt;
    this.f = l(paramInt);
    this.g = u.h(3) + 1;
    paramInt = u.h(5) + 1;
    this.h = paramInt;
    this.i = g(paramInt);
    this.j = u.j(36);
    this.k = null;
    this.l = null;
  }
  
  private static Metadata a(List<String> paramList, List<PictureFrame> paramList1) {
    Metadata metadata;
    boolean bool = paramList.isEmpty();
    List list = null;
    if (bool && paramList1.isEmpty())
      return null; 
    ArrayList<VorbisComment> arrayList = new ArrayList();
    for (byte b = 0; b < paramList.size(); b++) {
      StringBuilder stringBuilder;
      String str = paramList.get(b);
      String[] arrayOfString = h0.o0(str, "=");
      if (arrayOfString.length != 2) {
        stringBuilder = new StringBuilder();
        stringBuilder.append("Failed to parse Vorbis comment: ");
        stringBuilder.append(str);
        o.f("FlacStreamMetadata", stringBuilder.toString());
      } else {
        arrayList.add(new VorbisComment((String)stringBuilder[0], (String)stringBuilder[1]));
      } 
    } 
    arrayList.addAll(paramList1);
    if (arrayList.isEmpty()) {
      paramList = list;
    } else {
      metadata = new Metadata(arrayList);
    } 
    return metadata;
  }
  
  private static int g(int paramInt) {
    return (paramInt != 8) ? ((paramInt != 12) ? ((paramInt != 16) ? ((paramInt != 20) ? ((paramInt != 24) ? -1 : 6) : 5) : 4) : 2) : 1;
  }
  
  private static int l(int paramInt) {
    switch (paramInt) {
      default:
        return -1;
      case 192000:
        return 3;
      case 176400:
        return 2;
      case 96000:
        return 11;
      case 88200:
        return 1;
      case 48000:
        return 10;
      case 44100:
        return 9;
      case 32000:
        return 8;
      case 24000:
        return 7;
      case 22050:
        return 6;
      case 16000:
        return 5;
      case 8000:
        break;
    } 
    return 4;
  }
  
  public l b(List<PictureFrame> paramList) {
    Metadata metadata = j(a(Collections.emptyList(), paramList));
    return new l(this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.j, this.k, metadata);
  }
  
  public l c(a parama) {
    return new l(this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.j, parama, this.l);
  }
  
  public l d(List<String> paramList) {
    Metadata metadata = j(a(paramList, Collections.emptyList()));
    return new l(this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.j, this.k, metadata);
  }
  
  public long e() {
    long l1;
    long l2;
    int i = this.d;
    if (i > 0) {
      l1 = (i + this.c) / 2L;
      l2 = 1L;
    } else {
      i = this.a;
      if (i == this.b && i > 0) {
        l1 = i;
      } else {
        l1 = 4096L;
      } 
      l1 = l1 * this.g * this.h / 8L;
      l2 = 64L;
    } 
    return l1 + l2;
  }
  
  public int f() {
    return this.h * this.e * this.g;
  }
  
  public long h() {
    long l1 = this.j;
    if (l1 == 0L) {
      l1 = -9223372036854775807L;
    } else {
      l1 = l1 * 1000000L / this.e;
    } 
    return l1;
  }
  
  public Format i(byte[] paramArrayOfbyte, Metadata paramMetadata) {
    paramArrayOfbyte[4] = (byte)Byte.MIN_VALUE;
    int i = this.d;
    if (i <= 0)
      i = -1; 
    paramMetadata = j(paramMetadata);
    return Format.n(null, "audio/flac", null, f(), i, this.g, this.e, -1, 0, 0, Collections.singletonList(paramArrayOfbyte), null, 0, null, paramMetadata);
  }
  
  public Metadata j(Metadata paramMetadata) {
    Metadata metadata = this.l;
    if (metadata != null)
      paramMetadata = metadata.b(paramMetadata); 
    return paramMetadata;
  }
  
  public long k(long paramLong) {
    return h0.o(paramLong * this.e / 1000000L, 0L, this.j - 1L);
  }
  
  public static class a {
    public final long[] a;
    
    public final long[] b;
    
    public a(long[] param1ArrayOflong1, long[] param1ArrayOflong2) {
      this.a = param1ArrayOflong1;
      this.b = param1ArrayOflong2;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/util/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */