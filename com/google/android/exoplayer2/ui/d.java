package com.google.android.exoplayer2.ui;

import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.h0;
import com.google.android.exoplayer2.util.r;
import java.util.Locale;

public class d implements n {
  private final Resources a;
  
  public d(Resources paramResources) {
    this.a = (Resources)e.e(paramResources);
  }
  
  private String b(Format paramFormat) {
    int i = paramFormat.w;
    return (i == -1 || i < 1) ? "" : ((i != 1) ? ((i != 2) ? ((i != 6 && i != 7) ? ((i != 8) ? this.a.getString(j.exo_track_surround) : this.a.getString(j.exo_track_surround_7_point_1)) : this.a.getString(j.exo_track_surround_5_point_1)) : this.a.getString(j.exo_track_stereo)) : this.a.getString(j.exo_track_mono));
  }
  
  private String c(Format paramFormat) {
    String str;
    int i = paramFormat.f;
    if (i == -1) {
      str = "";
    } else {
      str = this.a.getString(j.exo_track_bitrate, new Object[] { Float.valueOf(i / 1000000.0F) });
    } 
    return str;
  }
  
  private String d(Format paramFormat) {
    String str;
    if (TextUtils.isEmpty(paramFormat.c)) {
      str = "";
    } else {
      str = ((Format)str).c;
    } 
    return str;
  }
  
  private String e(Format paramFormat) {
    String str1 = j(new String[] { f(paramFormat), h(paramFormat) });
    String str2 = str1;
    if (TextUtils.isEmpty(str1))
      str2 = d(paramFormat); 
    return str2;
  }
  
  private String f(Format paramFormat) {
    Locale locale;
    String str = paramFormat.B;
    if (TextUtils.isEmpty(str) || "und".equals(str))
      return ""; 
    if (h0.a >= 21) {
      locale = Locale.forLanguageTag(str);
    } else {
      locale = new Locale((String)locale);
    } 
    return locale.getDisplayName();
  }
  
  private String g(Format paramFormat) {
    int i = paramFormat.o;
    int j = paramFormat.p;
    return (i == -1 || j == -1) ? "" : this.a.getString(j.exo_track_resolution, new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
  }
  
  private String h(Format paramFormat) {
    if ((paramFormat.e & 0x2) != 0) {
      str1 = this.a.getString(j.exo_track_role_alternate);
    } else {
      str1 = "";
    } 
    String str2 = str1;
    if ((paramFormat.e & 0x4) != 0)
      str2 = j(new String[] { str1, this.a.getString(j.exo_track_role_supplementary) }); 
    String str1 = str2;
    if ((paramFormat.e & 0x8) != 0)
      str1 = j(new String[] { str2, this.a.getString(j.exo_track_role_commentary) }); 
    str2 = str1;
    if ((paramFormat.e & 0x440) != 0)
      str2 = j(new String[] { str1, this.a.getString(j.exo_track_role_closed_captions) }); 
    return str2;
  }
  
  private static int i(Format paramFormat) {
    int i = r.h(paramFormat.j);
    return (i != -1) ? i : ((r.k(paramFormat.g) != null) ? 2 : ((r.b(paramFormat.g) != null) ? 1 : ((paramFormat.o != -1 || paramFormat.p != -1) ? 2 : ((paramFormat.w != -1 || paramFormat.x != -1) ? 1 : -1))));
  }
  
  private String j(String... paramVarArgs) {
    int i = paramVarArgs.length;
    String str = "";
    byte b = 0;
    while (b < i) {
      String str1 = paramVarArgs[b];
      String str2 = str;
      if (str1.length() > 0)
        if (TextUtils.isEmpty(str)) {
          str2 = str1;
        } else {
          str2 = this.a.getString(j.exo_item_list, new Object[] { str, str1 });
        }  
      b++;
      str = str2;
    } 
    return str;
  }
  
  public String a(Format paramFormat) {
    String str1;
    int i = i(paramFormat);
    if (i == 2) {
      str1 = j(new String[] { h(paramFormat), g(paramFormat), c(paramFormat) });
    } else if (i == 1) {
      str1 = j(new String[] { e((Format)str1), b((Format)str1), c((Format)str1) });
    } else {
      str1 = e((Format)str1);
    } 
    String str2 = str1;
    if (str1.length() == 0)
      str2 = this.a.getString(j.exo_track_unknown); 
    return str2;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/ui/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */