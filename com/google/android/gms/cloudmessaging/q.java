package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.h;

abstract class q<T> {
  final int a;
  
  final h<T> b = new h();
  
  final int c;
  
  final Bundle d;
  
  q(int paramInt1, int paramInt2, Bundle paramBundle) {
    this.a = paramInt1;
    this.c = paramInt2;
    this.d = paramBundle;
  }
  
  abstract void a(Bundle paramBundle);
  
  final void b(zzp paramzzp) {
    if (Log.isLoggable("MessengerIpcClient", 3)) {
      String str1 = String.valueOf(this);
      String str2 = String.valueOf(paramzzp);
      StringBuilder stringBuilder = new StringBuilder(str1.length() + 14 + str2.length());
      stringBuilder.append("Failing ");
      stringBuilder.append(str1);
      stringBuilder.append(" with ");
      stringBuilder.append(str2);
      Log.d("MessengerIpcClient", stringBuilder.toString());
    } 
    this.b.b(paramzzp);
  }
  
  final void c(T paramT) {
    if (Log.isLoggable("MessengerIpcClient", 3)) {
      String str1 = String.valueOf(this);
      String str2 = String.valueOf(paramT);
      StringBuilder stringBuilder = new StringBuilder(str1.length() + 16 + str2.length());
      stringBuilder.append("Finishing ");
      stringBuilder.append(str1);
      stringBuilder.append(" with ");
      stringBuilder.append(str2);
      Log.d("MessengerIpcClient", stringBuilder.toString());
    } 
    this.b.c(paramT);
  }
  
  abstract boolean d();
  
  public String toString() {
    int i = this.c;
    int j = this.a;
    boolean bool = d();
    StringBuilder stringBuilder = new StringBuilder(55);
    stringBuilder.append("Request { what=");
    stringBuilder.append(i);
    stringBuilder.append(" id=");
    stringBuilder.append(j);
    stringBuilder.append(" oneWay=");
    stringBuilder.append(bool);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/cloudmessaging/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */