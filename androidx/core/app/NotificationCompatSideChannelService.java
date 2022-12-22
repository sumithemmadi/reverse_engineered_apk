package androidx.core.app;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;

public abstract class NotificationCompatSideChannelService extends Service {
  public abstract void a(String paramString1, int paramInt, String paramString2);
  
  public abstract void b(String paramString);
  
  void c(int paramInt, String paramString) {
    String[] arrayOfString = getPackageManager().getPackagesForUid(paramInt);
    int i = arrayOfString.length;
    for (byte b = 0; b < i; b++) {
      if (arrayOfString[b].equals(paramString))
        return; 
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("NotificationSideChannelService: Uid ");
    stringBuilder.append(paramInt);
    stringBuilder.append(" is not authorized for package ");
    stringBuilder.append(paramString);
    SecurityException securityException = new SecurityException(stringBuilder.toString());
    throw securityException;
  }
  
  public abstract void d(String paramString1, int paramInt, String paramString2, Notification paramNotification);
  
  public IBinder onBind(Intent paramIntent) {
    return (IBinder)(paramIntent.getAction().equals("android.support.BIND_NOTIFICATION_SIDE_CHANNEL") ? ((Build.VERSION.SDK_INT > 19) ? null : new a(this)) : null);
  }
  
  private class a extends android.support.v4.app.a.a {
    a(NotificationCompatSideChannelService this$0) {}
    
    public void c6(String param1String1, int param1Int, String param1String2) {
      this.b.c(Binder.getCallingUid(), param1String1);
      long l = Binder.clearCallingIdentity();
      try {
        this.b.a(param1String1, param1Int, param1String2);
        return;
      } finally {
        Binder.restoreCallingIdentity(l);
      } 
    }
    
    public void i3(String param1String) {
      this.b.c(Binder.getCallingUid(), param1String);
      long l = Binder.clearCallingIdentity();
      try {
        this.b.b(param1String);
        return;
      } finally {
        Binder.restoreCallingIdentity(l);
      } 
    }
    
    public void i9(String param1String1, int param1Int, String param1String2, Notification param1Notification) {
      this.b.c(Binder.getCallingUid(), param1String1);
      long l = Binder.clearCallingIdentity();
      try {
        this.b.d(param1String1, param1Int, param1String2, param1Notification);
        return;
      } finally {
        Binder.restoreCallingIdentity(l);
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/core/app/NotificationCompatSideChannelService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */