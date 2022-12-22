package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.offline.StreamKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class e extends g {
  public static final e d = new e("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());
  
  public final List<Uri> e;
  
  public final List<b> f;
  
  public final List<a> g;
  
  public final List<a> h;
  
  public final List<a> i;
  
  public final List<a> j;
  
  public final Format k;
  
  public final List<Format> l;
  
  public final Map<String, String> m;
  
  public final List<DrmInitData> n;
  
  public e(String paramString, List<String> paramList, List<b> paramList1, List<a> paramList2, List<a> paramList3, List<a> paramList4, List<a> paramList5, Format paramFormat, List<Format> paramList6, boolean paramBoolean, Map<String, String> paramMap, List<DrmInitData> paramList7) {
    super(paramString, paramList, paramBoolean);
    this.e = Collections.unmodifiableList(f(paramList1, paramList2, paramList3, paramList4, paramList5));
    this.f = Collections.unmodifiableList(paramList1);
    this.g = Collections.unmodifiableList(paramList2);
    this.h = Collections.unmodifiableList(paramList3);
    this.i = Collections.unmodifiableList(paramList4);
    this.j = Collections.unmodifiableList(paramList5);
    this.k = paramFormat;
    if (paramList6 != null) {
      List<Format> list = Collections.unmodifiableList(paramList6);
    } else {
      paramString = null;
    } 
    this.l = (List<Format>)paramString;
    this.m = Collections.unmodifiableMap(paramMap);
    this.n = Collections.unmodifiableList(paramList7);
  }
  
  private static void b(List<a> paramList, List<Uri> paramList1) {
    for (byte b = 0; b < paramList.size(); b++) {
      Uri uri = ((a)paramList.get(b)).a;
      if (uri != null && !paramList1.contains(uri))
        paramList1.add(uri); 
    } 
  }
  
  private static <T> List<T> d(List<T> paramList, int paramInt, List<StreamKey> paramList1) {
    ArrayList<T> arrayList = new ArrayList(paramList1.size());
    for (byte b = 0; b < paramList.size(); b++) {
      T t = paramList.get(b);
      for (byte b1 = 0; b1 < paramList1.size(); b1++) {
        StreamKey streamKey = paramList1.get(b1);
        if (streamKey.c == paramInt && streamKey.d == b) {
          arrayList.add(t);
          break;
        } 
      } 
    } 
    return arrayList;
  }
  
  public static e e(String paramString) {
    List<b> list = Collections.singletonList(b.b(Uri.parse(paramString)));
    return new e("", Collections.emptyList(), list, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, false, Collections.emptyMap(), Collections.emptyList());
  }
  
  private static List<Uri> f(List<b> paramList, List<a> paramList1, List<a> paramList2, List<a> paramList3, List<a> paramList4) {
    ArrayList<Uri> arrayList = new ArrayList();
    for (byte b = 0; b < paramList.size(); b++) {
      Uri uri = ((b)paramList.get(b)).a;
      if (!arrayList.contains(uri))
        arrayList.add(uri); 
    } 
    b(paramList1, arrayList);
    b(paramList2, arrayList);
    b(paramList3, arrayList);
    b(paramList4, arrayList);
    return arrayList;
  }
  
  public e c(List<StreamKey> paramList) {
    return new e(this.a, this.b, d(this.f, 0, paramList), Collections.emptyList(), d(this.h, 1, paramList), d(this.i, 2, paramList), Collections.emptyList(), this.k, this.l, this.c, this.m, this.n);
  }
  
  public static final class a {
    public final Uri a;
    
    public final Format b;
    
    public final String c;
    
    public final String d;
    
    public a(Uri param1Uri, Format param1Format, String param1String1, String param1String2) {
      this.a = param1Uri;
      this.b = param1Format;
      this.c = param1String1;
      this.d = param1String2;
    }
  }
  
  public static final class b {
    public final Uri a;
    
    public final Format b;
    
    public final String c;
    
    public final String d;
    
    public final String e;
    
    public final String f;
    
    public b(Uri param1Uri, Format param1Format, String param1String1, String param1String2, String param1String3, String param1String4) {
      this.a = param1Uri;
      this.b = param1Format;
      this.c = param1String1;
      this.d = param1String2;
      this.e = param1String3;
      this.f = param1String4;
    }
    
    public static b b(Uri param1Uri) {
      return new b(param1Uri, Format.r("0", null, "application/x-mpegURL", null, null, -1, 0, 0, null), null, null, null, null);
    }
    
    public b a(Format param1Format) {
      return new b(this.a, param1Format, this.c, this.d, this.e, this.f);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/source/hls/playlist/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */