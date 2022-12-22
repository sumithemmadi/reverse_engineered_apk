package androidx.activity.result.e;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;

public final class c extends a<Intent, ActivityResult> {
  public Intent d(Context paramContext, Intent paramIntent) {
    return paramIntent;
  }
  
  public ActivityResult e(int paramInt, Intent paramIntent) {
    return new ActivityResult(paramInt, paramIntent);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/activity/result/e/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */