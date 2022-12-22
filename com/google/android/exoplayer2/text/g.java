package com.google.android.exoplayer2.text;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.text.l.a;
import com.google.android.exoplayer2.text.l.c;
import com.google.android.exoplayer2.text.m.a;
import com.google.android.exoplayer2.text.n.a;
import com.google.android.exoplayer2.text.o.a;
import com.google.android.exoplayer2.text.p.a;
import com.google.android.exoplayer2.text.q.a;
import com.google.android.exoplayer2.text.r.a;
import com.google.android.exoplayer2.text.s.b;
import com.google.android.exoplayer2.text.s.g;

public interface g {
  public static final g a = new a();
  
  f a(Format paramFormat);
  
  boolean b(Format paramFormat);
  
  static final class a implements g {
    public f a(Format param1Format) {
      String str = param1Format.j;
      if (str != null) {
        StringBuilder stringBuilder;
        byte b = -1;
        switch (str.hashCode()) {
          case 1693976202:
            if (!str.equals("application/ttml+xml"))
              break; 
            b = 10;
            break;
          case 1668750253:
            if (!str.equals("application/x-subrip"))
              break; 
            b = 9;
            break;
          case 1566016562:
            if (!str.equals("application/cea-708"))
              break; 
            b = 8;
            break;
          case 1566015601:
            if (!str.equals("application/cea-608"))
              break; 
            b = 7;
            break;
          case 930165504:
            if (!str.equals("application/x-mp4-cea-608"))
              break; 
            b = 6;
            break;
          case 822864842:
            if (!str.equals("text/x-ssa"))
              break; 
            b = 5;
            break;
          case 691401887:
            if (!str.equals("application/x-quicktime-tx3g"))
              break; 
            b = 4;
            break;
          case -1004728940:
            if (!str.equals("text/vtt"))
              break; 
            b = 3;
            break;
          case -1026075066:
            if (!str.equals("application/x-mp4-vtt"))
              break; 
            b = 2;
            break;
          case -1248334819:
            if (!str.equals("application/pgs"))
              break; 
            b = 1;
            break;
          case -1351681404:
            if (!str.equals("application/dvbsubs"))
              break; 
            b = 0;
            break;
        } 
        switch (b) {
          default:
            stringBuilder = new StringBuilder();
            stringBuilder.append("Attempted to create decoder for unsupported MIME type: ");
            stringBuilder.append(str);
            throw new IllegalArgumentException(stringBuilder.toString());
          case 10:
            return (f)new a();
          case 9:
            return (f)new a();
          case 8:
            return (f)new c(((Format)stringBuilder).C, ((Format)stringBuilder).l);
          case 6:
          case 7:
            return (f)new a(str, ((Format)stringBuilder).C);
          case 5:
            return (f)new a(((Format)stringBuilder).l);
          case 4:
            return (f)new a(((Format)stringBuilder).l);
          case 3:
            return (f)new g();
          case 2:
            return (f)new b();
          case 1:
            return (f)new a();
          case 0:
            break;
        } 
        return (f)new a(((Format)stringBuilder).l);
      } 
    }
    
    public boolean b(Format param1Format) {
      String str = param1Format.j;
      return ("text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str));
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/text/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */