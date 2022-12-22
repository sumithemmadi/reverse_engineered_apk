package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

public final class p implements Iterable<Intent> {
  private final ArrayList<Intent> b = new ArrayList<Intent>();
  
  private final Context c;
  
  private p(Context paramContext) {
    this.c = paramContext;
  }
  
  public static p i(Context paramContext) {
    return new p(paramContext);
  }
  
  public p a(Intent paramIntent) {
    this.b.add(paramIntent);
    return this;
  }
  
  public p c(Activity paramActivity) {
    Intent intent1;
    if (paramActivity instanceof a) {
      intent1 = ((a)paramActivity).g();
    } else {
      intent1 = null;
    } 
    Intent intent2 = intent1;
    if (intent1 == null)
      intent2 = g.a(paramActivity); 
    if (intent2 != null) {
      ComponentName componentName2 = intent2.getComponent();
      ComponentName componentName1 = componentName2;
      if (componentName2 == null)
        componentName1 = intent2.resolveActivity(this.c.getPackageManager()); 
      f(componentName1);
      a(intent2);
    } 
    return this;
  }
  
  public p f(ComponentName paramComponentName) {
    int i = this.b.size();
    try {
      for (Intent intent = g.b(this.c, paramComponentName); intent != null; intent = g.b(this.c, intent.getComponent()))
        this.b.add(i, intent); 
      return this;
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
      Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
      IllegalArgumentException illegalArgumentException = new IllegalArgumentException((Throwable)nameNotFoundException);
      throw illegalArgumentException;
    } 
  }
  
  @Deprecated
  public Iterator<Intent> iterator() {
    return this.b.iterator();
  }
  
  public void j() {
    k(null);
  }
  
  public void k(Bundle paramBundle) {
    if (!this.b.isEmpty()) {
      ArrayList<Intent> arrayList = this.b;
      Intent[] arrayOfIntent = arrayList.<Intent>toArray(new Intent[arrayList.size()]);
      arrayOfIntent[0] = (new Intent(arrayOfIntent[0])).addFlags(268484608);
      if (!androidx.core.content.a.j(this.c, arrayOfIntent, paramBundle)) {
        Intent intent = new Intent(arrayOfIntent[arrayOfIntent.length - 1]);
        intent.addFlags(268435456);
        this.c.startActivity(intent);
      } 
      return;
    } 
    throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
  }
  
  public static interface a {
    Intent g();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/core/app/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */