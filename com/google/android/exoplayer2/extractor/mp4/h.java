package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.c1.p;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.util.o;
import com.google.android.exoplayer2.util.v;
import java.nio.ByteBuffer;

final class h {
  static final String[] a = new String[] { 
      "Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", 
      "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", 
      "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", 
      "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", 
      "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", 
      "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", 
      "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", 
      "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", 
      "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", 
      "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", 
      "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", 
      "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", 
      "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", 
      "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", 
      "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", 
      "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", 
      "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", 
      "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", 
      "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", 
      "Garage Rock", "Psybient" };
  
  public static Format a(int paramInt, Format paramFormat, Metadata paramMetadata1, Metadata paramMetadata2, p paramp) {
    Format format;
    Metadata.Entry entry;
    if (paramInt == 1) {
      format = paramFormat;
      if (paramp.a())
        format = paramFormat.g(paramp.b, paramp.c); 
      Format format1 = format;
      if (paramMetadata1 != null)
        format1 = format.j(paramMetadata1); 
    } else {
      Format format1 = paramFormat;
      if (paramInt == 2) {
        format1 = paramFormat;
        if (format != null) {
          paramInt = 0;
          while (true) {
            format1 = paramFormat;
            if (paramInt < format.d()) {
              entry = format.c(paramInt);
              Format format2 = paramFormat;
              if (entry instanceof MdtaMetadataEntry) {
                entry = entry;
                format2 = paramFormat;
                if ("com.android.capture.fps".equals(((MdtaMetadataEntry)entry).b)) {
                  format2 = paramFormat;
                  if (((MdtaMetadataEntry)entry).e == 23) {
                    format2 = paramFormat;
                    try {
                      paramFormat = paramFormat.f(ByteBuffer.wrap(((MdtaMetadataEntry)entry).c).asFloatBuffer().get());
                      format2 = paramFormat;
                      Metadata metadata = new Metadata();
                      format2 = paramFormat;
                      this(new Metadata.Entry[] { entry });
                      format2 = paramFormat;
                      paramFormat = paramFormat.j(metadata);
                      format2 = paramFormat;
                    } catch (NumberFormatException numberFormatException) {
                      o.f("MetadataUtil", "Ignoring invalid framerate");
                    } 
                  } 
                } 
              } 
              paramInt++;
              paramFormat = format2;
              continue;
            } 
            break;
          } 
        } 
      } 
    } 
    return (Format)entry;
  }
  
  private static CommentFrame b(int paramInt, v paramv) {
    int i = paramv.k();
    if (paramv.k() == 1684108385) {
      paramv.N(8);
      String str = paramv.u(i - 16);
      return new CommentFrame("und", str, str);
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Failed to parse comment attribute: ");
    stringBuilder.append(c.a(paramInt));
    o.f("MetadataUtil", stringBuilder.toString());
    return null;
  }
  
  private static ApicFrame c(v paramv) {
    int i = paramv.k();
    if (paramv.k() == 1684108385) {
      StringBuilder stringBuilder;
      String str;
      int j = c.b(paramv.k());
      if (j == 13) {
        str = "image/jpeg";
      } else if (j == 14) {
        str = "image/png";
      } else {
        str = null;
      } 
      if (str == null) {
        stringBuilder = new StringBuilder();
        stringBuilder.append("Unrecognized cover art flags: ");
        stringBuilder.append(j);
        o.f("MetadataUtil", stringBuilder.toString());
        return null;
      } 
      stringBuilder.N(4);
      j = i - 16;
      byte[] arrayOfByte = new byte[j];
      stringBuilder.h(arrayOfByte, 0, j);
      return new ApicFrame(str, null, 3, arrayOfByte);
    } 
    o.f("MetadataUtil", "Failed to parse cover art attribute");
    return null;
  }
  
  public static Metadata.Entry d(v paramv) {
    int i = paramv.c() + paramv.k();
    int j = paramv.k();
    int k = j >> 24 & 0xFF;
    if (k == 169 || k == 253) {
      k = 0xFFFFFF & j;
      if (k == 6516084) {
        CommentFrame commentFrame = b(j, paramv);
        paramv.M(i);
        return (Metadata.Entry)commentFrame;
      } 
      if (k == 7233901 || k == 7631467) {
        TextInformationFrame textInformationFrame = i(j, "TIT2", paramv);
        paramv.M(i);
        return (Metadata.Entry)textInformationFrame;
      } 
      if (k == 6516589 || k == 7828084) {
        TextInformationFrame textInformationFrame = i(j, "TCOM", paramv);
        paramv.M(i);
        return (Metadata.Entry)textInformationFrame;
      } 
      if (k == 6578553) {
        TextInformationFrame textInformationFrame = i(j, "TDRC", paramv);
        paramv.M(i);
        return (Metadata.Entry)textInformationFrame;
      } 
      if (k == 4280916) {
        TextInformationFrame textInformationFrame = i(j, "TPE1", paramv);
        paramv.M(i);
        return (Metadata.Entry)textInformationFrame;
      } 
      if (k == 7630703) {
        TextInformationFrame textInformationFrame = i(j, "TSSE", paramv);
        paramv.M(i);
        return (Metadata.Entry)textInformationFrame;
      } 
      if (k == 6384738) {
        TextInformationFrame textInformationFrame = i(j, "TALB", paramv);
        paramv.M(i);
        return (Metadata.Entry)textInformationFrame;
      } 
      if (k == 7108978) {
        TextInformationFrame textInformationFrame = i(j, "USLT", paramv);
        paramv.M(i);
        return (Metadata.Entry)textInformationFrame;
      } 
      if (k == 6776174) {
        TextInformationFrame textInformationFrame = i(j, "TCON", paramv);
        paramv.M(i);
        return (Metadata.Entry)textInformationFrame;
      } 
      if (k == 6779504) {
        TextInformationFrame textInformationFrame = i(j, "TIT1", paramv);
        paramv.M(i);
        return (Metadata.Entry)textInformationFrame;
      } 
      StringBuilder stringBuilder1 = new StringBuilder();
      this();
      stringBuilder1.append("Skipped unknown metadata entry: ");
      stringBuilder1.append(c.a(j));
      o.b("MetadataUtil", stringBuilder1.toString());
      paramv.M(i);
      return null;
    } 
    if (j == 1735291493)
      try {
        return (Metadata.Entry)h(paramv);
      } finally {
        paramv.M(i);
      }  
    if (j == 1684632427) {
      TextInformationFrame textInformationFrame = e(j, "TPOS", paramv);
      paramv.M(i);
      return (Metadata.Entry)textInformationFrame;
    } 
    if (j == 1953655662) {
      TextInformationFrame textInformationFrame = e(j, "TRCK", paramv);
      paramv.M(i);
      return (Metadata.Entry)textInformationFrame;
    } 
    if (j == 1953329263) {
      Id3Frame id3Frame = j(j, "TBPM", paramv, true, false);
      paramv.M(i);
      return (Metadata.Entry)id3Frame;
    } 
    if (j == 1668311404) {
      Id3Frame id3Frame = j(j, "TCMP", paramv, true, true);
      paramv.M(i);
      return (Metadata.Entry)id3Frame;
    } 
    if (j == 1668249202) {
      ApicFrame apicFrame = c(paramv);
      paramv.M(i);
      return (Metadata.Entry)apicFrame;
    } 
    if (j == 1631670868) {
      TextInformationFrame textInformationFrame = i(j, "TPE2", paramv);
      paramv.M(i);
      return (Metadata.Entry)textInformationFrame;
    } 
    if (j == 1936682605) {
      TextInformationFrame textInformationFrame = i(j, "TSOT", paramv);
      paramv.M(i);
      return (Metadata.Entry)textInformationFrame;
    } 
    if (j == 1936679276) {
      TextInformationFrame textInformationFrame = i(j, "TSO2", paramv);
      paramv.M(i);
      return (Metadata.Entry)textInformationFrame;
    } 
    if (j == 1936679282) {
      TextInformationFrame textInformationFrame = i(j, "TSOA", paramv);
      paramv.M(i);
      return (Metadata.Entry)textInformationFrame;
    } 
    if (j == 1936679265) {
      TextInformationFrame textInformationFrame = i(j, "TSOP", paramv);
      paramv.M(i);
      return (Metadata.Entry)textInformationFrame;
    } 
    if (j == 1936679791) {
      TextInformationFrame textInformationFrame = i(j, "TSOC", paramv);
      paramv.M(i);
      return (Metadata.Entry)textInformationFrame;
    } 
    if (j == 1920233063) {
      Id3Frame id3Frame = j(j, "ITUNESADVISORY", paramv, false, false);
      paramv.M(i);
      return (Metadata.Entry)id3Frame;
    } 
    if (j == 1885823344) {
      Id3Frame id3Frame = j(j, "ITUNESGAPLESS", paramv, false, true);
      paramv.M(i);
      return (Metadata.Entry)id3Frame;
    } 
    if (j == 1936683886) {
      TextInformationFrame textInformationFrame = i(j, "TVSHOWSORT", paramv);
      paramv.M(i);
      return (Metadata.Entry)textInformationFrame;
    } 
    if (j == 1953919848) {
      TextInformationFrame textInformationFrame = i(j, "TVSHOW", paramv);
      paramv.M(i);
      return (Metadata.Entry)textInformationFrame;
    } 
    if (j == 757935405) {
      Id3Frame id3Frame = f(paramv, i);
      paramv.M(i);
      return (Metadata.Entry)id3Frame;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    this();
    stringBuilder.append("Skipped unknown metadata entry: ");
    stringBuilder.append(c.a(j));
    o.b("MetadataUtil", stringBuilder.toString());
    paramv.M(i);
    return null;
  }
  
  private static TextInformationFrame e(int paramInt, String paramString, v paramv) {
    int i = paramv.k();
    if (paramv.k() == 1684108385 && i >= 22) {
      paramv.N(10);
      i = paramv.F();
      if (i > 0) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("");
        stringBuilder1.append(i);
        String str2 = stringBuilder1.toString();
        paramInt = paramv.F();
        String str1 = str2;
        if (paramInt > 0) {
          StringBuilder stringBuilder2 = new StringBuilder();
          stringBuilder2.append(str2);
          stringBuilder2.append("/");
          stringBuilder2.append(paramInt);
          str1 = stringBuilder2.toString();
        } 
        return new TextInformationFrame(paramString, null, str1);
      } 
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Failed to parse index/count attribute: ");
    stringBuilder.append(c.a(paramInt));
    o.f("MetadataUtil", stringBuilder.toString());
    return null;
  }
  
  private static Id3Frame f(v paramv, int paramInt) {
    String str1 = null;
    String str2 = str1;
    int i = -1;
    int j = -1;
    while (paramv.c() < paramInt) {
      int k = paramv.c();
      int m = paramv.k();
      int n = paramv.k();
      paramv.N(4);
      if (n == 1835360622) {
        str1 = paramv.u(m - 12);
        continue;
      } 
      if (n == 1851878757) {
        str2 = paramv.u(m - 12);
        continue;
      } 
      if (n == 1684108385) {
        i = k;
        j = m;
      } 
      paramv.N(m - 12);
    } 
    if (str1 == null || str2 == null || i == -1)
      return null; 
    paramv.M(i);
    paramv.N(16);
    return (Id3Frame)new InternalFrame(str1, str2, paramv.u(j - 16));
  }
  
  public static MdtaMetadataEntry g(v paramv, int paramInt, String paramString) {
    while (true) {
      int i = paramv.c();
      if (i < paramInt) {
        int j = paramv.k();
        if (paramv.k() == 1684108385) {
          i = paramv.k();
          paramInt = paramv.k();
          j -= 16;
          byte[] arrayOfByte = new byte[j];
          paramv.h(arrayOfByte, 0, j);
          return new MdtaMetadataEntry(paramString, arrayOfByte, paramInt, i);
        } 
        paramv.M(i + j);
        continue;
      } 
      return null;
    } 
  }
  
  private static TextInformationFrame h(v paramv) {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic k : (Lcom/google/android/exoplayer2/util/v;)I
    //   4: istore_1
    //   5: iload_1
    //   6: ifle -> 28
    //   9: getstatic com/google/android/exoplayer2/extractor/mp4/h.a : [Ljava/lang/String;
    //   12: astore_0
    //   13: iload_1
    //   14: aload_0
    //   15: arraylength
    //   16: if_icmpgt -> 28
    //   19: aload_0
    //   20: iload_1
    //   21: iconst_1
    //   22: isub
    //   23: aaload
    //   24: astore_0
    //   25: goto -> 30
    //   28: aconst_null
    //   29: astore_0
    //   30: aload_0
    //   31: ifnull -> 47
    //   34: new com/google/android/exoplayer2/metadata/id3/TextInformationFrame
    //   37: dup
    //   38: ldc_w 'TCON'
    //   41: aconst_null
    //   42: aload_0
    //   43: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   46: areturn
    //   47: ldc_w 'MetadataUtil'
    //   50: ldc_w 'Failed to parse standard genre code'
    //   53: invokestatic f : (Ljava/lang/String;Ljava/lang/String;)V
    //   56: aconst_null
    //   57: areturn
  }
  
  private static TextInformationFrame i(int paramInt, String paramString, v paramv) {
    int i = paramv.k();
    if (paramv.k() == 1684108385) {
      paramv.N(8);
      return new TextInformationFrame(paramString, null, paramv.u(i - 16));
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Failed to parse text attribute: ");
    stringBuilder.append(c.a(paramInt));
    o.f("MetadataUtil", stringBuilder.toString());
    return null;
  }
  
  private static Id3Frame j(int paramInt, String paramString, v paramv, boolean paramBoolean1, boolean paramBoolean2) {
    int i = k(paramv);
    int j = i;
    if (paramBoolean2)
      j = Math.min(1, i); 
    if (j >= 0) {
      TextInformationFrame textInformationFrame;
      CommentFrame commentFrame;
      if (paramBoolean1) {
        textInformationFrame = new TextInformationFrame(paramString, null, Integer.toString(j));
      } else {
        commentFrame = new CommentFrame("und", (String)textInformationFrame, Integer.toString(j));
      } 
      return (Id3Frame)commentFrame;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Failed to parse uint8 attribute: ");
    stringBuilder.append(c.a(paramInt));
    o.f("MetadataUtil", stringBuilder.toString());
    return null;
  }
  
  private static int k(v paramv) {
    paramv.N(4);
    if (paramv.k() == 1684108385) {
      paramv.N(8);
      return paramv.z();
    } 
    o.f("MetadataUtil", "Failed to parse uint8 attribute value");
    return -1;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/extractor/mp4/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */