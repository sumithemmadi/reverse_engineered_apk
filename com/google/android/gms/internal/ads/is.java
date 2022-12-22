package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

public final class is extends MutableContextWrapper {
  private Activity a;
  
  private Context b;
  
  private Context c;
  
  public is(Context paramContext) {
    super(paramContext);
    setBaseContext(paramContext);
  }
  
  public final Activity a() {
    return this.a;
  }
  
  public final Context b() {
    return this.c;
  }
  
  public final Object getSystemService(String paramString) {
    return this.c.getSystemService(paramString);
  }
  
  public final void setBaseContext(Context paramContext) {
    Activity activity;
    Context context = paramContext.getApplicationContext();
    this.b = context;
    if (paramContext instanceof Activity) {
      activity = (Activity)paramContext;
    } else {
      activity = null;
    } 
    this.a = activity;
    this.c = paramContext;
    super.setBaseContext(context);
  }
  
  public final void startActivity(Intent paramIntent) {
    Activity activity = this.a;
    if (activity != null) {
      activity.startActivity(paramIntent);
      return;
    } 
    paramIntent.setFlags(268435456);
    this.b.startActivity(paramIntent);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/is.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */