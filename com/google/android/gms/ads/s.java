package com.google.android.gms.ads;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.er2;
import com.google.android.gms.internal.ads.ht2;
import com.google.android.gms.internal.ads.m0;
import com.google.android.gms.internal.ads.x;
import com.google.android.gms.internal.ads.zzvw;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class s {
  private final ht2 a;
  
  private final List<h> b;
  
  private s(ht2 paramht2) {
    this.a = paramht2;
    this.b = new ArrayList<h>();
    x x = m0.S5;
    if (((Boolean)er2.e().c(x)).booleanValue())
      try {
        List list = paramht2.U5();
        if (list != null)
          for (zzvw zzvw : list)
            this.b.add(h.a(zzvw));  
      } catch (RemoteException remoteException) {
        cm.c("Could not forward getAdapterResponseInfo to ResponseInfo.", (Throwable)remoteException);
      }  
  }
  
  public static s c(ht2 paramht2) {
    return (paramht2 != null) ? new s(paramht2) : null;
  }
  
  public final String a() {
    try {
      return this.a.a();
    } catch (RemoteException remoteException) {
      cm.c("Could not forward getMediationAdapterClassName to ResponseInfo.", (Throwable)remoteException);
      return null;
    } 
  }
  
  public final String b() {
    try {
      return this.a.s7();
    } catch (RemoteException remoteException) {
      cm.c("Could not forward getResponseId to ResponseInfo.", (Throwable)remoteException);
      return null;
    } 
  }
  
  public final JSONObject d() {
    JSONObject jSONObject = new JSONObject();
    String str = b();
    if (str == null) {
      jSONObject.put("Response ID", "null");
    } else {
      jSONObject.put("Response ID", str);
    } 
    str = a();
    if (str == null) {
      jSONObject.put("Mediation Adapter Class Name", "null");
    } else {
      jSONObject.put("Mediation Adapter Class Name", str);
    } 
    JSONArray jSONArray = new JSONArray();
    Iterator<h> iterator = this.b.iterator();
    while (iterator.hasNext())
      jSONArray.put(((h)iterator.next()).b()); 
    jSONObject.put("Adapter Responses", jSONArray);
    return jSONObject;
  }
  
  public final String toString() {
    String str;
    try {
      str = d().toString(2);
    } catch (JSONException jSONException) {
      str = "Error forming toString output.";
    } 
    return str;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */