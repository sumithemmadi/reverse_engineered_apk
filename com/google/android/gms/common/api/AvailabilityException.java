package com.google.android.gms.common.api;

import android.text.TextUtils;
import b.e.a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.b;
import com.google.android.gms.common.internal.t;
import java.util.ArrayList;
import java.util.Iterator;

public class AvailabilityException extends Exception {
  private final a<b<?>, ConnectionResult> zaba;
  
  public AvailabilityException(a<b<?>, ConnectionResult> parama) {
    this.zaba = parama;
  }
  
  public ConnectionResult getConnectionResult(c<? extends a.d> paramc) {
    boolean bool;
    b<? extends a.d> b = paramc.a();
    if (this.zaba.get(b) != null) {
      bool = true;
    } else {
      bool = false;
    } 
    t.b(bool, "The given API was not part of the availability request.");
    return (ConnectionResult)this.zaba.get(b);
  }
  
  public ConnectionResult getConnectionResult(e<? extends a.d> parame) {
    boolean bool;
    b<? extends a.d> b = parame.a();
    if (this.zaba.get(b) != null) {
      bool = true;
    } else {
      bool = false;
    } 
    t.b(bool, "The given API was not part of the availability request.");
    return (ConnectionResult)this.zaba.get(b);
  }
  
  public String getMessage() {
    ArrayList<String> arrayList = new ArrayList();
    Iterator<b> iterator = this.zaba.keySet().iterator();
    boolean bool = true;
    while (iterator.hasNext()) {
      b b = iterator.next();
      ConnectionResult connectionResult = (ConnectionResult)this.zaba.get(b);
      if (connectionResult.s0())
        bool = false; 
      String str1 = b.a();
      String str2 = String.valueOf(connectionResult);
      StringBuilder stringBuilder1 = new StringBuilder(String.valueOf(str1).length() + 2 + str2.length());
      stringBuilder1.append(str1);
      stringBuilder1.append(": ");
      stringBuilder1.append(str2);
      arrayList.add(stringBuilder1.toString());
    } 
    StringBuilder stringBuilder = new StringBuilder();
    if (bool) {
      stringBuilder.append("None of the queried APIs are available. ");
    } else {
      stringBuilder.append("Some of the queried APIs are unavailable. ");
    } 
    stringBuilder.append(TextUtils.join("; ", arrayList));
    return stringBuilder.toString();
  }
  
  public final a<b<?>, ConnectionResult> zaj() {
    return this.zaba;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/api/AvailabilityException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */