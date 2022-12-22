package androidx.media.session;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.util.Log;
import android.view.KeyEvent;
import java.util.List;

public class MediaButtonReceiver extends BroadcastReceiver {
  private static ComponentName a(Context paramContext, String paramString) {
    ServiceInfo serviceInfo;
    PackageManager packageManager = paramContext.getPackageManager();
    Intent intent = new Intent(paramString);
    intent.setPackage(paramContext.getPackageName());
    List list = packageManager.queryIntentServices(intent, 0);
    if (list.size() == 1) {
      serviceInfo = ((ResolveInfo)list.get(0)).serviceInfo;
      return new ComponentName(serviceInfo.packageName, serviceInfo.name);
    } 
    if (serviceInfo.isEmpty())
      return null; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Expected 1 service that handles ");
    stringBuilder.append(paramString);
    stringBuilder.append(", found ");
    stringBuilder.append(serviceInfo.size());
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  private static void b(Context paramContext, Intent paramIntent) {
    if (Build.VERSION.SDK_INT >= 26) {
      paramContext.startForegroundService(paramIntent);
    } else {
      paramContext.startService(paramIntent);
    } 
  }
  
  public void onReceive(Context paramContext, Intent paramIntent) {
    StringBuilder stringBuilder;
    if (paramIntent == null || !"android.intent.action.MEDIA_BUTTON".equals(paramIntent.getAction()) || !paramIntent.hasExtra("android.intent.extra.KEY_EVENT")) {
      stringBuilder = new StringBuilder();
      stringBuilder.append("Ignore unsupported intent: ");
      stringBuilder.append(paramIntent);
      Log.d("MediaButtonReceiver", stringBuilder.toString());
      return;
    } 
    ComponentName componentName = a((Context)stringBuilder, "android.intent.action.MEDIA_BUTTON");
    if (componentName != null) {
      paramIntent.setComponent(componentName);
      b((Context)stringBuilder, paramIntent);
      return;
    } 
    componentName = a((Context)stringBuilder, "android.media.browse.MediaBrowserService");
    if (componentName != null) {
      BroadcastReceiver.PendingResult pendingResult = goAsync();
      Context context = stringBuilder.getApplicationContext();
      a a = new a(context, paramIntent, pendingResult);
      MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(context, componentName, a, null);
      a.f(mediaBrowserCompat);
      mediaBrowserCompat.a();
      return;
    } 
    throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
  }
  
  private static class a extends MediaBrowserCompat.b {
    private final Context c;
    
    private final Intent d;
    
    private final BroadcastReceiver.PendingResult e;
    
    private MediaBrowserCompat f;
    
    a(Context param1Context, Intent param1Intent, BroadcastReceiver.PendingResult param1PendingResult) {
      this.c = param1Context;
      this.d = param1Intent;
      this.e = param1PendingResult;
    }
    
    private void e() {
      this.f.b();
      this.e.finish();
    }
    
    public void a() {
      try {
        MediaControllerCompat mediaControllerCompat = new MediaControllerCompat();
        this(this.c, this.f.c());
        mediaControllerCompat.a((KeyEvent)this.d.getParcelableExtra("android.intent.extra.KEY_EVENT"));
      } catch (RemoteException remoteException) {
        Log.e("MediaButtonReceiver", "Failed to create a media controller", (Throwable)remoteException);
      } 
      e();
    }
    
    public void b() {
      e();
    }
    
    public void c() {
      e();
    }
    
    void f(MediaBrowserCompat param1MediaBrowserCompat) {
      this.f = param1MediaBrowserCompat;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/media/session/MediaButtonReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */