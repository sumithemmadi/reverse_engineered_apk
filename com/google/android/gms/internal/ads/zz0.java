package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public abstract class zz0<K, V> {
  private static final String a = "zz0";
  
  protected static <K, V> HashMap<K, V> b(String paramString) {
    try {
      if (!TextUtils.isEmpty(paramString)) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream();
        this(Base64.decode(paramString.getBytes(), 0));
        ObjectInputStream objectInputStream = new ObjectInputStream();
        this(byteArrayInputStream);
        return (HashMap)objectInputStream.readObject();
      } 
    } catch (IOException|ClassNotFoundException iOException) {
      Log.d(a, "decode object failure");
    } 
    return null;
  }
  
  protected abstract void a(String paramString);
  
  protected abstract HashMap<K, V> c();
  
  public String toString() {
    try {
      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      this();
      ObjectOutputStream objectOutputStream = new ObjectOutputStream();
      this(byteArrayOutputStream);
      objectOutputStream.writeObject(c());
      objectOutputStream.close();
      return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
    } catch (IOException iOException) {
      return null;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zz0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */