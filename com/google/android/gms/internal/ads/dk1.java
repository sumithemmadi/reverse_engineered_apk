package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public final class dk1 implements ak1 {
  private final Object[] a;
  
  public dk1(zzvl paramzzvl, String paramString1, int paramInt, String paramString2, zzvx paramzzvx) {
    HashSet hashSet = new HashSet(Arrays.asList((Object[])paramString2.split(",")));
    ArrayList<String> arrayList = new ArrayList();
    arrayList.add(paramString2);
    arrayList.add(paramString1);
    if (hashSet.contains("networkType"))
      arrayList.add(Integer.valueOf(paramInt)); 
    if (hashSet.contains("birthday"))
      arrayList.add(Long.valueOf(paramzzvl.c)); 
    if (hashSet.contains("extras")) {
      arrayList.add(a(paramzzvl.d));
    } else if (hashSet.contains("npa")) {
      arrayList.add(paramzzvl.d.getString("npa"));
    } 
    if (hashSet.contains("gender"))
      arrayList.add(Integer.valueOf(paramzzvl.e)); 
    if (hashSet.contains("keywords")) {
      List<String> list = paramzzvl.f;
      if (list != null) {
        arrayList.add(list.toString());
      } else {
        arrayList.add(null);
      } 
    } 
    if (hashSet.contains("isTestDevice"))
      arrayList.add(Boolean.valueOf(paramzzvl.g)); 
    if (hashSet.contains("tagForChildDirectedTreatment"))
      arrayList.add(Integer.valueOf(paramzzvl.h)); 
    if (hashSet.contains("manualImpressionsEnabled"))
      arrayList.add(Boolean.valueOf(paramzzvl.i)); 
    if (hashSet.contains("publisherProvidedId"))
      arrayList.add(paramzzvl.j); 
    if (hashSet.contains("location")) {
      Location location = paramzzvl.l;
      if (location != null) {
        arrayList.add(location.toString());
      } else {
        arrayList.add(null);
      } 
    } 
    if (hashSet.contains("contentUrl"))
      arrayList.add(paramzzvl.m); 
    if (hashSet.contains("networkExtras"))
      arrayList.add(a(paramzzvl.n)); 
    if (hashSet.contains("customTargeting"))
      arrayList.add(a(paramzzvl.o)); 
    if (hashSet.contains("categoryExclusions")) {
      List<String> list = paramzzvl.p;
      if (list != null) {
        arrayList.add(list.toString());
      } else {
        arrayList.add(null);
      } 
    } 
    if (hashSet.contains("requestAgent"))
      arrayList.add(paramzzvl.q); 
    if (hashSet.contains("requestPackage"))
      arrayList.add(paramzzvl.r); 
    if (hashSet.contains("isDesignedForFamilies"))
      arrayList.add(Boolean.valueOf(paramzzvl.s)); 
    if (hashSet.contains("tagForUnderAgeOfConsent"))
      arrayList.add(Integer.valueOf(paramzzvl.u)); 
    if (hashSet.contains("maxAdContentRating"))
      arrayList.add(paramzzvl.v); 
    if (hashSet.contains("orientation"))
      if (paramzzvx != null) {
        arrayList.add(Integer.valueOf(paramzzvx.b));
      } else {
        arrayList.add(null);
      }  
    this.a = arrayList.toArray();
  }
  
  private static String a(Bundle paramBundle) {
    if (paramBundle == null)
      return null; 
    StringBuilder stringBuilder = new StringBuilder();
    Iterator<?> iterator = (new TreeSet(paramBundle.keySet())).iterator();
    while (iterator.hasNext()) {
      Object object = paramBundle.get((String)iterator.next());
      if (object == null) {
        object = "null";
      } else if (object instanceof Bundle) {
        object = a((Bundle)object);
      } else {
        object = object.toString();
      } 
      stringBuilder.append((String)object);
    } 
    return stringBuilder.toString();
  }
  
  public final boolean equals(Object paramObject) {
    if (!(paramObject instanceof dk1))
      return false; 
    paramObject = paramObject;
    return Arrays.equals(this.a, ((dk1)paramObject).a);
  }
  
  public final int hashCode() {
    return Arrays.hashCode(this.a);
  }
  
  public final String toString() {
    int i = hashCode();
    String str = Arrays.toString(this.a);
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 22);
    stringBuilder.append("[PoolKey#");
    stringBuilder.append(i);
    stringBuilder.append(" ");
    stringBuilder.append(str);
    stringBuilder.append("]");
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/dk1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */