package com.google.android.gms.ads.internal.util;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.JsonWriter;
import com.google.android.gms.internal.ads.cm;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class h0 {
  private static final j0<Map<String, ?>> a = new k0();
  
  public static String a(m0 paramm0) {
    return o(paramm0);
  }
  
  public static List<String> b(JsonReader paramJsonReader) {
    ArrayList<String> arrayList = new ArrayList();
    paramJsonReader.beginArray();
    while (paramJsonReader.hasNext())
      arrayList.add(paramJsonReader.nextString()); 
    paramJsonReader.endArray();
    return arrayList;
  }
  
  public static List<String> c(JSONArray paramJSONArray, List<String> paramList) {
    List<String> list = paramList;
    if (paramList == null)
      list = new ArrayList<String>(); 
    if (paramJSONArray == null)
      return list; 
    for (byte b = 0; b < paramJSONArray.length(); b++)
      list.add(paramJSONArray.getString(b)); 
    return list;
  }
  
  public static JSONObject d(JSONObject paramJSONObject, String... paramVarArgs) {
    paramJSONObject = k(paramJSONObject, paramVarArgs);
    return (paramJSONObject == null) ? null : paramJSONObject.optJSONObject(paramVarArgs[paramVarArgs.length - 1]);
  }
  
  private static void e(JsonWriter paramJsonWriter, Object paramObject) {
    if (paramObject == null) {
      paramJsonWriter.nullValue();
      return;
    } 
    if (paramObject instanceof Number) {
      paramJsonWriter.value((Number)paramObject);
      return;
    } 
    if (paramObject instanceof Boolean) {
      paramJsonWriter.value(((Boolean)paramObject).booleanValue());
      return;
    } 
    if (paramObject instanceof String) {
      paramJsonWriter.value((String)paramObject);
      return;
    } 
    if (paramObject instanceof m0) {
      ((m0)paramObject).a(paramJsonWriter);
      return;
    } 
    if (paramObject instanceof Map) {
      paramJsonWriter.beginObject();
      for (Map.Entry entry : ((Map)paramObject).entrySet()) {
        paramObject = entry.getKey();
        if (paramObject instanceof String) {
          entry = (Map.Entry)entry.getValue();
          e(paramJsonWriter.name((String)paramObject), entry);
        } 
      } 
      paramJsonWriter.endObject();
      return;
    } 
    if (paramObject instanceof List) {
      paramJsonWriter.beginArray();
      paramObject = ((List)paramObject).iterator();
      while (paramObject.hasNext())
        e(paramJsonWriter, paramObject.next()); 
      paramJsonWriter.endArray();
      return;
    } 
    paramJsonWriter.nullValue();
  }
  
  private static void f(JsonWriter paramJsonWriter, JSONArray paramJSONArray) {
    try {
      JSONException jSONException;
      paramJsonWriter.beginArray();
      for (int i = 0; i < paramJSONArray.length(); i++) {
        Object object = paramJSONArray.get(i);
        if (object instanceof String) {
          paramJsonWriter.value((String)object);
        } else if (object instanceof Number) {
          paramJsonWriter.value((Number)object);
        } else if (object instanceof Boolean) {
          paramJsonWriter.value(((Boolean)object).booleanValue());
        } else if (object instanceof JSONObject) {
          g(paramJsonWriter, (JSONObject)object);
        } else if (object instanceof JSONArray) {
          f(paramJsonWriter, (JSONArray)object);
        } else {
          jSONException = new JSONException();
          String str = String.valueOf(object);
          i = str.length();
          object = new StringBuilder();
          super(i + 23);
          object.append("unable to write field: ");
          object.append(str);
          this(object.toString());
          throw jSONException;
        } 
      } 
      jSONException.endArray();
      return;
    } catch (JSONException jSONException) {
      IOException iOException = new IOException((Throwable)jSONException);
      throw iOException;
    } 
  }
  
  public static void g(JsonWriter paramJsonWriter, JSONObject paramJSONObject) {
    try {
      JSONException jSONException;
      paramJsonWriter.beginObject();
      Iterator<String> iterator = paramJSONObject.keys();
      while (iterator.hasNext()) {
        String str = iterator.next();
        Object object = paramJSONObject.get(str);
        if (object instanceof String) {
          paramJsonWriter.name(str).value((String)object);
          continue;
        } 
        if (object instanceof Number) {
          paramJsonWriter.name(str).value((Number)object);
          continue;
        } 
        if (object instanceof Boolean) {
          paramJsonWriter.name(str).value(((Boolean)object).booleanValue());
          continue;
        } 
        if (object instanceof JSONObject) {
          g(paramJsonWriter.name(str), (JSONObject)object);
          continue;
        } 
        if (object instanceof JSONArray) {
          f(paramJsonWriter.name(str), (JSONArray)object);
          continue;
        } 
        jSONException = new JSONException();
        object = String.valueOf(object);
        int i = object.length();
        StringBuilder stringBuilder = new StringBuilder();
        this(i + 23);
        stringBuilder.append("unable to write field: ");
        stringBuilder.append((String)object);
        this(stringBuilder.toString());
        throw jSONException;
      } 
      jSONException.endObject();
      return;
    } catch (JSONException jSONException) {
      IOException iOException = new IOException((Throwable)jSONException);
      throw iOException;
    } 
  }
  
  public static boolean h(boolean paramBoolean, JSONObject paramJSONObject, String... paramVarArgs) {
    paramJSONObject = k(paramJSONObject, paramVarArgs);
    return (paramJSONObject == null) ? false : paramJSONObject.optBoolean(paramVarArgs[paramVarArgs.length - 1], false);
  }
  
  public static Map<String, String> i(JsonReader paramJsonReader) {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    paramJsonReader.beginObject();
    while (paramJsonReader.hasNext())
      hashMap.put(paramJsonReader.nextName(), paramJsonReader.nextString()); 
    paramJsonReader.endObject();
    return (Map)hashMap;
  }
  
  public static JSONObject j(JSONObject paramJSONObject, String paramString) {
    try {
      JSONObject jSONObject = paramJSONObject.getJSONObject(paramString);
      paramJSONObject = jSONObject;
    } catch (JSONException jSONException) {
      JSONObject jSONObject = new JSONObject();
      paramJSONObject.put(paramString, jSONObject);
      paramJSONObject = jSONObject;
    } 
    return paramJSONObject;
  }
  
  private static JSONObject k(JSONObject paramJSONObject, String[] paramArrayOfString) {
    for (byte b = 0; b < paramArrayOfString.length - 1; b++) {
      if (paramJSONObject == null)
        return null; 
      paramJSONObject = paramJSONObject.optJSONObject(paramArrayOfString[b]);
    } 
    return paramJSONObject;
  }
  
  public static JSONObject l(JsonReader paramJsonReader) {
    StringBuilder stringBuilder;
    JSONObject jSONObject = new JSONObject();
    paramJsonReader.beginObject();
    while (paramJsonReader.hasNext()) {
      String str = paramJsonReader.nextName();
      JsonToken jsonToken = paramJsonReader.peek();
      if (JsonToken.BEGIN_ARRAY.equals(jsonToken)) {
        jSONObject.put(str, m(paramJsonReader));
        continue;
      } 
      if (JsonToken.BEGIN_OBJECT.equals(jsonToken)) {
        jSONObject.put(str, l(paramJsonReader));
        continue;
      } 
      if (JsonToken.BOOLEAN.equals(jsonToken)) {
        jSONObject.put(str, paramJsonReader.nextBoolean());
        continue;
      } 
      if (JsonToken.NUMBER.equals(jsonToken)) {
        jSONObject.put(str, paramJsonReader.nextDouble());
        continue;
      } 
      if (JsonToken.STRING.equals(jsonToken)) {
        jSONObject.put(str, paramJsonReader.nextString());
        continue;
      } 
      str = String.valueOf(jsonToken);
      stringBuilder = new StringBuilder(str.length() + 23);
      stringBuilder.append("unexpected json token: ");
      stringBuilder.append(str);
      throw new IllegalStateException(stringBuilder.toString());
    } 
    stringBuilder.endObject();
    return jSONObject;
  }
  
  public static JSONArray m(JsonReader paramJsonReader) {
    String str;
    JSONArray jSONArray = new JSONArray();
    paramJsonReader.beginArray();
    while (paramJsonReader.hasNext()) {
      JsonToken jsonToken = paramJsonReader.peek();
      if (JsonToken.BEGIN_ARRAY.equals(jsonToken)) {
        jSONArray.put(m(paramJsonReader));
        continue;
      } 
      if (JsonToken.BEGIN_OBJECT.equals(jsonToken)) {
        jSONArray.put(l(paramJsonReader));
        continue;
      } 
      if (JsonToken.BOOLEAN.equals(jsonToken)) {
        jSONArray.put(paramJsonReader.nextBoolean());
        continue;
      } 
      if (JsonToken.NUMBER.equals(jsonToken)) {
        jSONArray.put(paramJsonReader.nextDouble());
        continue;
      } 
      if (JsonToken.STRING.equals(jsonToken)) {
        jSONArray.put(paramJsonReader.nextString());
        continue;
      } 
      str = String.valueOf(jsonToken);
      StringBuilder stringBuilder = new StringBuilder(str.length() + 23);
      stringBuilder.append("unexpected json token: ");
      stringBuilder.append(str);
      throw new IllegalStateException(stringBuilder.toString());
    } 
    str.endArray();
    return jSONArray;
  }
  
  public static Bundle n(JSONObject paramJSONObject) {
    if (paramJSONObject == null)
      return null; 
    Iterator<String> iterator = paramJSONObject.keys();
    Bundle bundle = new Bundle();
    while (iterator.hasNext()) {
      String str = iterator.next();
      Object object = paramJSONObject.opt(str);
      if (object != null) {
        if (object instanceof Boolean) {
          bundle.putBoolean(str, ((Boolean)object).booleanValue());
          continue;
        } 
        if (object instanceof Double) {
          bundle.putDouble(str, ((Double)object).doubleValue());
          continue;
        } 
        if (object instanceof Integer) {
          bundle.putInt(str, ((Integer)object).intValue());
          continue;
        } 
        if (object instanceof Long) {
          bundle.putLong(str, ((Long)object).longValue());
          continue;
        } 
        if (object instanceof String) {
          bundle.putString(str, (String)object);
          continue;
        } 
        if (object instanceof JSONArray) {
          JSONArray jSONArray = (JSONArray)object;
          if (jSONArray.length() == 0)
            continue; 
          int i = jSONArray.length();
          boolean bool1 = false;
          boolean bool2 = false;
          boolean bool3 = false;
          boolean bool4 = false;
          object = null;
          byte b;
          for (b = 0; object == null && b < i; b++) {
            if (!jSONArray.isNull(b)) {
              object = jSONArray.opt(b);
            } else {
              object = null;
            } 
          } 
          if (object == null) {
            object = String.valueOf(str);
            if (object.length() != 0) {
              object = "Expected JSONArray with at least 1 non-null element for key:".concat((String)object);
            } else {
              object = new String("Expected JSONArray with at least 1 non-null element for key:");
            } 
            cm.i((String)object);
            continue;
          } 
          if (object instanceof JSONObject) {
            Bundle[] arrayOfBundle = new Bundle[i];
            for (b = bool4; b < i; b++) {
              if (!jSONArray.isNull(b)) {
                object = n(jSONArray.optJSONObject(b));
              } else {
                object = null;
              } 
              arrayOfBundle[b] = (Bundle)object;
            } 
            bundle.putParcelableArray(str, (Parcelable[])arrayOfBundle);
            continue;
          } 
          if (object instanceof Number) {
            object = new double[jSONArray.length()];
            for (b = bool1; b < i; b++)
              object[b] = jSONArray.optDouble(b); 
            bundle.putDoubleArray(str, (double[])object);
            continue;
          } 
          if (object instanceof CharSequence) {
            String[] arrayOfString = new String[i];
            for (b = bool2; b < i; b++) {
              if (!jSONArray.isNull(b)) {
                object = jSONArray.optString(b);
              } else {
                object = null;
              } 
              arrayOfString[b] = (String)object;
            } 
            bundle.putStringArray(str, arrayOfString);
            continue;
          } 
          if (object instanceof Boolean) {
            object = new boolean[i];
            for (b = bool3; b < i; b++)
              object[b] = jSONArray.optBoolean(b); 
            bundle.putBooleanArray(str, (boolean[])object);
            continue;
          } 
          cm.i(String.format("JSONArray with unsupported type %s for key:%s", new Object[] { object.getClass().getCanonicalName(), str }));
          continue;
        } 
        if (object instanceof JSONObject) {
          bundle.putBundle(str, n((JSONObject)object));
          continue;
        } 
        object = String.valueOf(str);
        if (object.length() != 0) {
          object = "Unsupported type for key:".concat((String)object);
        } else {
          object = new String("Unsupported type for key:");
        } 
        cm.i((String)object);
      } 
    } 
    return bundle;
  }
  
  private static String o(Object paramObject) {
    if (paramObject == null)
      return null; 
    StringWriter stringWriter = new StringWriter();
    try {
      JsonWriter jsonWriter = new JsonWriter();
      this(stringWriter);
      e(jsonWriter, paramObject);
      jsonWriter.close();
      return stringWriter.toString();
    } catch (IOException iOException) {
      cm.c("Error when writing JSON.", iOException);
      return null;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/internal/util/h0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */