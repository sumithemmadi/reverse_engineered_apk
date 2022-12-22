package com.google.android.exoplayer2.c1;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class p {
  private static final Pattern a = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
  
  public int b = -1;
  
  public int c = -1;
  
  private boolean b(String paramString) {
    Matcher matcher = a.matcher(paramString);
    if (matcher.find())
      try {
        int i = Integer.parseInt(matcher.group(1), 16);
        int j = Integer.parseInt(matcher.group(2), 16);
        if (i > 0 || j > 0) {
          this.b = i;
          this.c = j;
          return true;
        } 
      } catch (NumberFormatException numberFormatException) {} 
    return false;
  }
  
  public boolean a() {
    boolean bool;
    if (this.b != -1 && this.c != -1) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public boolean c(Metadata paramMetadata) {
    for (byte b = 0; b < paramMetadata.d(); b++) {
      CommentFrame commentFrame;
      Metadata.Entry entry = paramMetadata.c(b);
      if (entry instanceof CommentFrame) {
        commentFrame = (CommentFrame)entry;
        if ("iTunSMPB".equals(commentFrame.d) && b(commentFrame.e))
          return true; 
      } else if (commentFrame instanceof InternalFrame) {
        InternalFrame internalFrame = (InternalFrame)commentFrame;
        if ("com.apple.iTunes".equals(internalFrame.c) && "iTunSMPB".equals(internalFrame.d) && b(internalFrame.e))
          return true; 
      } 
    } 
    return false;
  }
  
  public boolean d(int paramInt) {
    int i = paramInt >> 12;
    paramInt &= 0xFFF;
    if (i > 0 || paramInt > 0) {
      this.b = i;
      this.c = paramInt;
      return true;
    } 
    return false;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/c1/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */