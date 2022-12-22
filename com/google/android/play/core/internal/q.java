package com.google.android.play.core.internal;

import android.content.res.AssetManager;
import com.google.android.play.core.splitcompat.b;
import java.io.File;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class q {
  private final b a;
  
  private XmlPullParser b;
  
  public q(b paramb) {
    this.a = paramb;
  }
  
  public final void a(AssetManager paramAssetManager, File paramFile) {
    this.b = (XmlPullParser)paramAssetManager.openXmlResourceParser(b.b(paramAssetManager, paramFile), "AndroidManifest.xml");
  }
  
  public final long b() {
    if (this.b != null) {
      while (true) {
        int i = this.b.next();
        if (i != 2) {
          if (i != 1)
            continue; 
          break;
        } 
        if (this.b.getName().equals("manifest")) {
          String str1 = this.b.getAttributeValue("http://schemas.android.com/apk/res/android", "versionCode");
          String str2 = this.b.getAttributeValue("http://schemas.android.com/apk/res/android", "versionCodeMajor");
          if (str1 != null)
            try {
              int j = Integer.parseInt(str1);
              if (str2 == null)
                return j; 
              try {
                i = Integer.parseInt(str2);
                return i << 32L | j & 0xFFFFFFFFL;
              } catch (NumberFormatException numberFormatException) {
                throw new XmlPullParserException(String.format("Couldn't parse versionCodeMajor to int: %s", new Object[] { numberFormatException.getMessage() }));
              } 
            } catch (NumberFormatException numberFormatException) {
              throw new XmlPullParserException(String.format("Couldn't parse versionCode to int: %s", new Object[] { numberFormatException.getMessage() }));
            }  
          throw new XmlPullParserException("Manifest entry doesn't contain 'versionCode' attribute.");
        } 
        break;
      } 
      throw new XmlPullParserException("Couldn't find manifest entry at top-level.");
    } 
    XmlPullParserException xmlPullParserException = new XmlPullParserException("Manifest file needs to be loaded before parsing.");
    throw xmlPullParserException;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/play/core/internal/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */