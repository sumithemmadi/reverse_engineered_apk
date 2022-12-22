package androidx.core.content.d;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class c {
  private static int a(TypedArray paramTypedArray, int paramInt) {
    if (Build.VERSION.SDK_INT >= 21)
      return paramTypedArray.getType(paramInt); 
    TypedValue typedValue = new TypedValue();
    paramTypedArray.getValue(paramInt, typedValue);
    return typedValue.type;
  }
  
  public static a b(XmlPullParser paramXmlPullParser, Resources paramResources) {
    int i;
    while (true) {
      i = paramXmlPullParser.next();
      if (i != 2 && i != 1)
        continue; 
      break;
    } 
    if (i == 2)
      return d(paramXmlPullParser, paramResources); 
    XmlPullParserException xmlPullParserException = new XmlPullParserException("No start tag found");
    throw xmlPullParserException;
  }
  
  public static List<List<byte[]>> c(Resources paramResources, int paramInt) {
    if (paramInt == 0)
      return Collections.emptyList(); 
    TypedArray typedArray = paramResources.obtainTypedArray(paramInt);
    try {
      List<?> list;
      if (typedArray.length() == 0) {
        list = Collections.emptyList();
        return (List)list;
      } 
      ArrayList<List<byte[]>> arrayList = new ArrayList();
      this();
      if (a(typedArray, 0) == 1) {
        for (paramInt = 0; paramInt < typedArray.length(); paramInt++) {
          int i = typedArray.getResourceId(paramInt, 0);
          if (i != 0)
            arrayList.add(h(list.getStringArray(i))); 
        } 
      } else {
        arrayList.add(h(list.getStringArray(paramInt)));
      } 
      return arrayList;
    } finally {
      typedArray.recycle();
    } 
  }
  
  private static a d(XmlPullParser paramXmlPullParser, Resources paramResources) {
    paramXmlPullParser.require(2, null, "font-family");
    if (paramXmlPullParser.getName().equals("font-family"))
      return e(paramXmlPullParser, paramResources); 
    g(paramXmlPullParser);
    return null;
  }
  
  private static a e(XmlPullParser paramXmlPullParser, Resources paramResources) {
    TypedArray typedArray = paramResources.obtainAttributes(Xml.asAttributeSet(paramXmlPullParser), b.h.d.FontFamily);
    String str1 = typedArray.getString(b.h.d.FontFamily_fontProviderAuthority);
    String str2 = typedArray.getString(b.h.d.FontFamily_fontProviderPackage);
    String str3 = typedArray.getString(b.h.d.FontFamily_fontProviderQuery);
    int i = typedArray.getResourceId(b.h.d.FontFamily_fontProviderCerts, 0);
    int j = typedArray.getInteger(b.h.d.FontFamily_fontProviderFetchStrategy, 1);
    int k = typedArray.getInteger(b.h.d.FontFamily_fontProviderFetchTimeout, 500);
    String str4 = typedArray.getString(b.h.d.FontFamily_fontProviderSystemFontFamily);
    typedArray.recycle();
    if (str1 != null && str2 != null && str3 != null) {
      while (paramXmlPullParser.next() != 3)
        g(paramXmlPullParser); 
      return new d(new b.h.h.d(str1, str2, str3, c(paramResources, i)), j, k, str4);
    } 
    ArrayList<c> arrayList = new ArrayList();
    while (paramXmlPullParser.next() != 3) {
      if (paramXmlPullParser.getEventType() != 2)
        continue; 
      if (paramXmlPullParser.getName().equals("font")) {
        arrayList.add(f(paramXmlPullParser, paramResources));
        continue;
      } 
      g(paramXmlPullParser);
    } 
    return arrayList.isEmpty() ? null : new b(arrayList.<c>toArray(new c[arrayList.size()]));
  }
  
  private static c f(XmlPullParser paramXmlPullParser, Resources paramResources) {
    boolean bool;
    TypedArray typedArray = paramResources.obtainAttributes(Xml.asAttributeSet(paramXmlPullParser), b.h.d.FontFamilyFont);
    int i = b.h.d.FontFamilyFont_fontWeight;
    if (!typedArray.hasValue(i))
      i = b.h.d.FontFamilyFont_android_fontWeight; 
    int j = typedArray.getInt(i, 400);
    i = b.h.d.FontFamilyFont_fontStyle;
    if (!typedArray.hasValue(i))
      i = b.h.d.FontFamilyFont_android_fontStyle; 
    if (1 == typedArray.getInt(i, 0)) {
      bool = true;
    } else {
      bool = false;
    } 
    i = b.h.d.FontFamilyFont_ttcIndex;
    if (!typedArray.hasValue(i))
      i = b.h.d.FontFamilyFont_android_ttcIndex; 
    int k = b.h.d.FontFamilyFont_fontVariationSettings;
    if (!typedArray.hasValue(k))
      k = b.h.d.FontFamilyFont_android_fontVariationSettings; 
    String str1 = typedArray.getString(k);
    k = typedArray.getInt(i, 0);
    i = b.h.d.FontFamilyFont_font;
    if (!typedArray.hasValue(i))
      i = b.h.d.FontFamilyFont_android_font; 
    int m = typedArray.getResourceId(i, 0);
    String str2 = typedArray.getString(i);
    typedArray.recycle();
    while (paramXmlPullParser.next() != 3)
      g(paramXmlPullParser); 
    return new c(str2, j, bool, str1, k, m);
  }
  
  private static void g(XmlPullParser paramXmlPullParser) {
    for (byte b = 1; b; b++) {
      int i = paramXmlPullParser.next();
      if (i != 2) {
        if (i != 3)
          continue; 
        b--;
        continue;
      } 
    } 
  }
  
  private static List<byte[]> h(String[] paramArrayOfString) {
    ArrayList<byte[]> arrayList = new ArrayList();
    int i = paramArrayOfString.length;
    for (byte b = 0; b < i; b++)
      arrayList.add(Base64.decode(paramArrayOfString[b], 0)); 
    return (List<byte[]>)arrayList;
  }
  
  public static interface a {}
  
  public static final class b implements a {
    private final c.c[] a;
    
    public b(c.c[] param1ArrayOfc) {
      this.a = param1ArrayOfc;
    }
    
    public c.c[] a() {
      return this.a;
    }
  }
  
  public static final class c {
    private final String a;
    
    private int b;
    
    private boolean c;
    
    private String d;
    
    private int e;
    
    private int f;
    
    public c(String param1String1, int param1Int1, boolean param1Boolean, String param1String2, int param1Int2, int param1Int3) {
      this.a = param1String1;
      this.b = param1Int1;
      this.c = param1Boolean;
      this.d = param1String2;
      this.e = param1Int2;
      this.f = param1Int3;
    }
    
    public String a() {
      return this.a;
    }
    
    public int b() {
      return this.f;
    }
    
    public int c() {
      return this.e;
    }
    
    public String d() {
      return this.d;
    }
    
    public int e() {
      return this.b;
    }
    
    public boolean f() {
      return this.c;
    }
  }
  
  public static final class d implements a {
    private final b.h.h.d a;
    
    private final int b;
    
    private final int c;
    
    private final String d;
    
    public d(b.h.h.d param1d, int param1Int1, int param1Int2, String param1String) {
      this.a = param1d;
      this.c = param1Int1;
      this.b = param1Int2;
      this.d = param1String;
    }
    
    public int a() {
      return this.c;
    }
    
    public b.h.h.d b() {
      return this.a;
    }
    
    public String c() {
      return this.d;
    }
    
    public int d() {
      return this.b;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/core/content/d/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */