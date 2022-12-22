package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

final class v52 {
  static String a(u52 paramu52, String paramString) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("# ");
    stringBuilder.append(paramString);
    b(paramu52, stringBuilder, 0);
    return stringBuilder.toString();
  }
  
  private static void b(u52 paramu52, StringBuilder paramStringBuilder, int paramInt) {
    k42.c c;
    HashMap<Object, Object> hashMap1 = new HashMap<Object, Object>();
    HashMap<Object, Object> hashMap2 = new HashMap<Object, Object>();
    TreeSet<String> treeSet = new TreeSet();
    for (Method method : paramu52.getClass().getDeclaredMethods()) {
      hashMap2.put(method.getName(), method);
      if ((method.getParameterTypes()).length == 0) {
        hashMap1.put(method.getName(), method);
        if (method.getName().startsWith("get"))
          treeSet.add(method.getName()); 
      } 
    } 
    Iterator<String> iterator = treeSet.iterator();
    while (true) {
      while (true)
        break; 
      if (SYNTHETIC_LOCAL_VARIABLE_11 != null)
        c(paramStringBuilder, paramInt, d((String)method), SYNTHETIC_LOCAL_VARIABLE_6); 
    } 
    if (paramu52 instanceof k42.d) {
      Iterator<Map.Entry<k42.c, Object>> iterator1 = ((k42.d)paramu52).zziqr.d();
      if (iterator1.hasNext()) {
        c = (k42.c)((Map.Entry)iterator1.next()).getKey();
        throw new NoSuchMethodError();
      } 
    } 
    j72 j72 = ((k42)c).zziqk;
    if (j72 != null)
      j72.c(paramStringBuilder, paramInt); 
  }
  
  static final void c(StringBuilder paramStringBuilder, int paramInt, String paramString, Object paramObject) {
    if (paramObject instanceof List) {
      paramObject = ((List)paramObject).iterator();
      while (paramObject.hasNext())
        c(paramStringBuilder, paramInt, paramString, paramObject.next()); 
      return;
    } 
    if (paramObject instanceof Map) {
      paramObject = ((Map)paramObject).entrySet().iterator();
      while (paramObject.hasNext())
        c(paramStringBuilder, paramInt, paramString, paramObject.next()); 
      return;
    } 
    paramStringBuilder.append('\n');
    boolean bool = false;
    byte b = 0;
    int i;
    for (i = 0; i < paramInt; i++)
      paramStringBuilder.append(' '); 
    paramStringBuilder.append(paramString);
    if (paramObject instanceof String) {
      paramStringBuilder.append(": \"");
      paramStringBuilder.append(c72.a(zzejr.zzhy((String)paramObject)));
      paramStringBuilder.append('"');
      return;
    } 
    if (paramObject instanceof zzejr) {
      paramStringBuilder.append(": \"");
      paramStringBuilder.append(c72.a((zzejr)paramObject));
      paramStringBuilder.append('"');
      return;
    } 
    if (paramObject instanceof k42) {
      paramStringBuilder.append(" {");
      b((k42)paramObject, paramStringBuilder, paramInt + 2);
      paramStringBuilder.append("\n");
      for (i = b; i < paramInt; i++)
        paramStringBuilder.append(' '); 
      paramStringBuilder.append("}");
      return;
    } 
    if (paramObject instanceof Map.Entry) {
      paramStringBuilder.append(" {");
      Map.Entry entry = (Map.Entry)paramObject;
      i = paramInt + 2;
      c(paramStringBuilder, i, "key", entry.getKey());
      c(paramStringBuilder, i, "value", entry.getValue());
      paramStringBuilder.append("\n");
      for (i = bool; i < paramInt; i++)
        paramStringBuilder.append(' '); 
      paramStringBuilder.append("}");
      return;
    } 
    paramStringBuilder.append(": ");
    paramStringBuilder.append(paramObject.toString());
  }
  
  private static final String d(String paramString) {
    StringBuilder stringBuilder = new StringBuilder();
    for (byte b = 0; b < paramString.length(); b++) {
      char c = paramString.charAt(b);
      if (Character.isUpperCase(c))
        stringBuilder.append("_"); 
      stringBuilder.append(Character.toLowerCase(c));
    } 
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/v52.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */