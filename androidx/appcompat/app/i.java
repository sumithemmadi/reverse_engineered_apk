package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import androidx.core.content.c;
import java.util.Calendar;

class i {
  private static i a;
  
  private final Context b;
  
  private final LocationManager c;
  
  private final a d = new a();
  
  i(Context paramContext, LocationManager paramLocationManager) {
    this.b = paramContext;
    this.c = paramLocationManager;
  }
  
  static i a(Context paramContext) {
    if (a == null) {
      paramContext = paramContext.getApplicationContext();
      a = new i(paramContext, (LocationManager)paramContext.getSystemService("location"));
    } 
    return a;
  }
  
  @SuppressLint({"MissingPermission"})
  private Location b() {
    Location location2;
    int j = c.b(this.b, "android.permission.ACCESS_COARSE_LOCATION");
    Location location1 = null;
    if (j == 0) {
      location2 = c("network");
    } else {
      location2 = null;
    } 
    if (c.b(this.b, "android.permission.ACCESS_FINE_LOCATION") == 0)
      location1 = c("gps"); 
    if (location1 != null && location2 != null) {
      Location location = location2;
      if (location1.getTime() > location2.getTime())
        location = location1; 
      return location;
    } 
    if (location1 != null)
      location2 = location1; 
    return location2;
  }
  
  private Location c(String paramString) {
    try {
      if (this.c.isProviderEnabled(paramString))
        return this.c.getLastKnownLocation(paramString); 
    } catch (Exception exception) {
      Log.d("TwilightManager", "Failed to get last known location", exception);
    } 
    return null;
  }
  
  private boolean e() {
    boolean bool;
    if (this.d.f > System.currentTimeMillis()) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private void f(Location paramLocation) {
    boolean bool;
    a a1 = this.d;
    long l1 = System.currentTimeMillis();
    h h = h.b();
    h.a(l1 - 86400000L, paramLocation.getLatitude(), paramLocation.getLongitude());
    long l2 = h.b;
    h.a(l1, paramLocation.getLatitude(), paramLocation.getLongitude());
    if (h.d == 1) {
      bool = true;
    } else {
      bool = false;
    } 
    long l3 = h.c;
    long l4 = h.b;
    h.a(86400000L + l1, paramLocation.getLatitude(), paramLocation.getLongitude());
    long l5 = h.c;
    if (l3 == -1L || l4 == -1L) {
      l1 = 43200000L + l1;
    } else {
      if (l1 > l4) {
        l1 = 0L + l5;
      } else if (l1 > l3) {
        l1 = 0L + l4;
      } else {
        l1 = 0L + l3;
      } 
      l1 += 60000L;
    } 
    a1.a = bool;
    a1.b = l2;
    a1.c = l3;
    a1.d = l4;
    a1.e = l5;
    a1.f = l1;
  }
  
  boolean d() {
    a a1 = this.d;
    if (e())
      return a1.a; 
    Location location = b();
    if (location != null) {
      f(location);
      return a1.a;
    } 
    Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
    int j = Calendar.getInstance().get(11);
    return (j < 6 || j >= 22);
  }
  
  private static class a {
    boolean a;
    
    long b;
    
    long c;
    
    long d;
    
    long e;
    
    long f;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/app/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */