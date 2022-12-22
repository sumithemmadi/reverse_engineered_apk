package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class wu1<P> {
  private static final Charset a = Charset.forName("UTF-8");
  
  private ConcurrentMap<String, List<zu1<P>>> b = new ConcurrentHashMap<String, List<zu1<P>>>();
  
  private zu1<P> c;
  
  private final Class<P> d;
  
  private wu1(Class<P> paramClass) {
    this.d = paramClass;
  }
  
  public static <P> wu1<P> a(Class<P> paramClass) {
    return new wu1<P>(paramClass);
  }
  
  public final zu1<P> b(P paramP, c02.b paramb) {
    if (paramb.J() == zzege.c) {
      byte[] arrayOfByte;
      int i = hu1.a[paramb.K().ordinal()];
      if (i != 1 && i != 2) {
        if (i != 3) {
          if (i == 4) {
            arrayOfByte = iu1.a;
          } else {
            throw new GeneralSecurityException("unknown output prefix type");
          } 
        } else {
          arrayOfByte = ByteBuffer.allocate(5).put((byte)1).putInt(paramb.N()).array();
        } 
      } else {
        arrayOfByte = ByteBuffer.allocate(5).put((byte)0).putInt(paramb.N()).array();
      } 
      zu1<P> zu11 = new zu1<P>(paramP, arrayOfByte, paramb.J(), paramb.K(), paramb.N());
      ArrayList<zu1<P>> arrayList = new ArrayList();
      arrayList.add(zu11);
      String str = new String(zu11.d(), a);
      List<? extends zu1<P>> list = this.b.put(str, Collections.unmodifiableList(arrayList));
      if (list != null) {
        arrayList = new ArrayList<zu1<P>>();
        arrayList.addAll(list);
        arrayList.add(zu11);
        this.b.put(str, Collections.unmodifiableList(arrayList));
      } 
      return zu11;
    } 
    throw new GeneralSecurityException("only ENABLED key is allowed");
  }
  
  public final void c(zu1<P> paramzu1) {
    if (paramzu1 != null) {
      if (paramzu1.b() == zzege.c) {
        byte[] arrayOfByte = paramzu1.d();
        List<?> list = this.b.get(new String(arrayOfByte, a));
        if (list == null)
          list = Collections.emptyList(); 
        if (!list.isEmpty()) {
          this.c = paramzu1;
          return;
        } 
        throw new IllegalArgumentException("the primary entry cannot be set to an entry which is not held by this primitive set");
      } 
      throw new IllegalArgumentException("the primary entry has to be ENABLED");
    } 
    throw new IllegalArgumentException("the primary entry must be non-null");
  }
  
  public final Class<P> d() {
    return this.d;
  }
  
  public final zu1<P> e() {
    return this.c;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/wu1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */