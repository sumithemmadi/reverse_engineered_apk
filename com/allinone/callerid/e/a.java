package com.allinone.callerid.e;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import com.allinone.callerid.util.d0;

public class a extends ContentObserver {
  private int a = 911;
  
  private Handler b;
  
  public a(Context paramContext, Handler paramHandler) {
    super(paramHandler);
    this.b = paramHandler;
  }
  
  public void onChange(boolean paramBoolean) {
    if (d0.a)
      d0.a("tony", "the contacts has changed"); 
    this.b.obtainMessage(this.a, "gaibian").sendToTarget();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/e/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */