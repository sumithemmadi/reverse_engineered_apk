package com.google.android.exoplayer2.metadata;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.emsg.a;
import com.google.android.exoplayer2.metadata.icy.a;
import com.google.android.exoplayer2.metadata.id3.b;
import com.google.android.exoplayer2.metadata.scte35.a;

public interface c {
  public static final c a = new a();
  
  b a(Format paramFormat);
  
  boolean b(Format paramFormat);
  
  static final class a implements c {
    public b a(Format param1Format) {
      String str = param1Format.j;
      if (str != null) {
        StringBuilder stringBuilder;
        byte b = -1;
        switch (str.hashCode()) {
          case 1652648887:
            if (!str.equals("application/x-scte35"))
              break; 
            b = 3;
            break;
          case 1154383568:
            if (!str.equals("application/x-emsg"))
              break; 
            b = 2;
            break;
          case -1248341703:
            if (!str.equals("application/id3"))
              break; 
            b = 1;
            break;
          case -1348231605:
            if (!str.equals("application/x-icy"))
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
          case 3:
            return (b)new a();
          case 2:
            return (b)new a();
          case 1:
            return (b)new b();
          case 0:
            break;
        } 
        return (b)new a();
      } 
    }
    
    public boolean b(Format param1Format) {
      String str = param1Format.j;
      return ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str));
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/metadata/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */