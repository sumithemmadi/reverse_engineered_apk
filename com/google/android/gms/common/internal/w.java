package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.common.g;

public class w {
  private final Resources a;
  
  private final String b;
  
  public w(Context paramContext) {
    t.j(paramContext);
    Resources resources = paramContext.getResources();
    this.a = resources;
    this.b = resources.getResourcePackageName(g.common_google_play_services_unknown_issue);
  }
  
  public String a(String paramString) {
    int i = this.a.getIdentifier(paramString, "string", this.b);
    return (i == 0) ? null : this.a.getString(i);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/internal/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */