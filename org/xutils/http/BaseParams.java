package org.xutils.http;

import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import org.xutils.common.util.KeyValue;
import org.xutils.http.body.FileBody;
import org.xutils.http.body.InputStreamBody;
import org.xutils.http.body.MultipartBody;
import org.xutils.http.body.RequestBody;
import org.xutils.http.body.StringBody;
import org.xutils.http.body.UrlEncodedBody;

public abstract class BaseParams {
  private String a = "UTF-8";
  
  private HttpMethod b;
  
  private String c;
  
  private String d;
  
  private boolean e = false;
  
  private boolean f = false;
  
  private RequestBody g;
  
  private final List<Header> h = new ArrayList<Header>();
  
  private final List<KeyValue> i = new ArrayList<KeyValue>();
  
  private final List<KeyValue> j = new ArrayList<KeyValue>();
  
  private void a() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield j : Ljava/util/List;
    //   6: invokeinterface isEmpty : ()Z
    //   11: istore_1
    //   12: iload_1
    //   13: ifeq -> 19
    //   16: aload_0
    //   17: monitorexit
    //   18: return
    //   19: aload_0
    //   20: getfield g : Lorg/xutils/http/body/RequestBody;
    //   23: ifnonnull -> 162
    //   26: aload_0
    //   27: getfield b : Lorg/xutils/http/HttpMethod;
    //   30: invokestatic permitsRequestBody : (Lorg/xutils/http/HttpMethod;)Z
    //   33: ifne -> 39
    //   36: goto -> 162
    //   39: aload_0
    //   40: getfield f : Z
    //   43: istore_1
    //   44: iload_1
    //   45: ifeq -> 126
    //   48: aload_0
    //   49: getfield c : Ljava/lang/String;
    //   52: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   55: ifne -> 73
    //   58: new org/json/JSONObject
    //   61: astore_2
    //   62: aload_2
    //   63: aload_0
    //   64: getfield c : Ljava/lang/String;
    //   67: invokespecial <init> : (Ljava/lang/String;)V
    //   70: goto -> 81
    //   73: new org/json/JSONObject
    //   76: dup
    //   77: invokespecial <init> : ()V
    //   80: astore_2
    //   81: aload_0
    //   82: aload_2
    //   83: aload_0
    //   84: getfield j : Ljava/util/List;
    //   87: invokespecial b : (Lorg/json/JSONObject;Ljava/util/List;)V
    //   90: aload_0
    //   91: aload_2
    //   92: invokevirtual toString : ()Ljava/lang/String;
    //   95: putfield c : Ljava/lang/String;
    //   98: aload_0
    //   99: getfield j : Ljava/util/List;
    //   102: invokeinterface clear : ()V
    //   107: goto -> 159
    //   110: astore_3
    //   111: new java/lang/IllegalArgumentException
    //   114: astore_2
    //   115: aload_2
    //   116: aload_3
    //   117: invokevirtual getMessage : ()Ljava/lang/String;
    //   120: aload_3
    //   121: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   124: aload_2
    //   125: athrow
    //   126: aload_0
    //   127: getfield c : Ljava/lang/String;
    //   130: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   133: ifne -> 159
    //   136: aload_0
    //   137: getfield i : Ljava/util/List;
    //   140: aload_0
    //   141: getfield j : Ljava/util/List;
    //   144: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   149: pop
    //   150: aload_0
    //   151: getfield j : Ljava/util/List;
    //   154: invokeinterface clear : ()V
    //   159: aload_0
    //   160: monitorexit
    //   161: return
    //   162: aload_0
    //   163: getfield i : Ljava/util/List;
    //   166: aload_0
    //   167: getfield j : Ljava/util/List;
    //   170: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   175: pop
    //   176: aload_0
    //   177: getfield j : Ljava/util/List;
    //   180: invokeinterface clear : ()V
    //   185: aload_0
    //   186: monitorexit
    //   187: return
    //   188: astore_2
    //   189: aload_0
    //   190: monitorexit
    //   191: aload_2
    //   192: athrow
    // Exception table:
    //   from	to	target	type
    //   2	12	188	finally
    //   19	36	188	finally
    //   39	44	188	finally
    //   48	70	110	org/json/JSONException
    //   48	70	188	finally
    //   73	81	110	org/json/JSONException
    //   73	81	188	finally
    //   81	107	110	org/json/JSONException
    //   81	107	188	finally
    //   111	126	188	finally
    //   126	159	188	finally
    //   162	185	188	finally
  }
  
  private void b(JSONObject paramJSONObject, List<KeyValue> paramList) {
    HashSet<String> hashSet = new HashSet(paramList.size());
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>(paramList.size());
    for (byte b = 0; b < paramList.size(); b++) {
      KeyValue keyValue = paramList.get(b);
      String str = keyValue.key;
      if (!TextUtils.isEmpty(str)) {
        JSONArray jSONArray;
        if (linkedHashMap.containsKey(str)) {
          jSONArray = (JSONArray)linkedHashMap.get(str);
        } else {
          jSONArray = new JSONArray();
          linkedHashMap.put(str, jSONArray);
        } 
        jSONArray.put(a.a(keyValue.value));
        if (keyValue instanceof ArrayItem)
          hashSet.add(str); 
      } 
    } 
    for (Map.Entry<Object, Object> entry : linkedHashMap.entrySet()) {
      String str = (String)entry.getKey();
      JSONArray jSONArray = (JSONArray)entry.getValue();
      if (jSONArray.length() > 1 || hashSet.contains(str)) {
        paramJSONObject.put(str, jSONArray);
        continue;
      } 
      paramJSONObject.put(str, jSONArray.get(0));
    } 
  }
  
  public void addBodyParameter(String paramString, Object paramObject) {
    addBodyParameter(paramString, paramObject, null, null);
  }
  
  public void addBodyParameter(String paramString1, Object paramObject, String paramString2) {
    addBodyParameter(paramString1, paramObject, paramString2, null);
  }
  
  public void addBodyParameter(String paramString1, Object paramObject, String paramString2, String paramString3) {
    if (TextUtils.isEmpty(paramString1) && paramObject == null)
      return; 
    if (TextUtils.isEmpty(paramString2) && TextUtils.isEmpty(paramString3)) {
      if (paramObject instanceof Iterable) {
        for (Object paramObject : paramObject)
          this.j.add(new ArrayItem(paramString1, paramObject)); 
      } else {
        boolean bool = paramObject instanceof JSONArray;
        int i = 0;
        int j = 0;
        if (bool) {
          paramObject = paramObject;
          i = paramObject.length();
          while (j < i) {
            this.j.add(new ArrayItem(paramString1, paramObject.opt(j)));
            j++;
          } 
        } else if (paramObject instanceof byte[]) {
          this.j.add(new KeyValue(paramString1, paramObject));
        } else if (paramObject != null && paramObject.getClass().isArray()) {
          int k = Array.getLength(paramObject);
          for (j = i; j < k; j++)
            this.j.add(new ArrayItem(paramString1, Array.get(paramObject, j))); 
        } else {
          this.j.add(new KeyValue(paramString1, paramObject));
        } 
      } 
    } else {
      this.j.add(new BodyItemWrapper(this, paramString1, paramObject, paramString2, paramString3));
    } 
  }
  
  public void addHeader(String paramString1, String paramString2) {
    if (TextUtils.isEmpty(paramString1))
      return; 
    this.h.add(new Header(paramString1, paramString2, false));
  }
  
  public void addParameter(String paramString, Object paramObject) {
    if (HttpMethod.permitsRequestBody(this.b)) {
      addBodyParameter(paramString, paramObject, null, null);
    } else {
      addQueryStringParameter(paramString, paramObject);
    } 
  }
  
  public void addQueryStringParameter(String paramString, Object paramObject) {
    if (TextUtils.isEmpty(paramString))
      return; 
    if (paramObject instanceof Iterable) {
      paramObject = ((Iterable)paramObject).iterator();
      while (paramObject.hasNext()) {
        Object object = paramObject.next();
        this.i.add(new ArrayItem(paramString, object));
      } 
    } else {
      boolean bool = paramObject instanceof JSONArray;
      int i = 0;
      int j = 0;
      if (bool) {
        paramObject = paramObject;
        i = paramObject.length();
        while (j < i) {
          this.i.add(new ArrayItem(paramString, paramObject.opt(j)));
          j++;
        } 
      } else if (paramObject != null && paramObject.getClass().isArray()) {
        int k = Array.getLength(paramObject);
        for (j = i; j < k; j++)
          this.i.add(new ArrayItem(paramString, Array.get(paramObject, j))); 
      } else {
        this.i.add(new KeyValue(paramString, paramObject));
      } 
    } 
  }
  
  public void clearParams() {
    this.i.clear();
    this.j.clear();
    this.c = null;
    this.d = null;
    this.g = null;
  }
  
  public String getBodyContent() {
    a();
    return this.c;
  }
  
  public List<KeyValue> getBodyParams() {
    a();
    return new ArrayList<KeyValue>(this.j);
  }
  
  public String getCharset() {
    return this.a;
  }
  
  public List<Header> getHeaders() {
    return new ArrayList<Header>(this.h);
  }
  
  public HttpMethod getMethod() {
    return this.b;
  }
  
  public List<KeyValue> getParams(String paramString) {
    ArrayList<KeyValue> arrayList = new ArrayList();
    for (KeyValue keyValue : this.i) {
      if (paramString != null && paramString.equals(keyValue.key))
        arrayList.add(keyValue); 
    } 
    for (KeyValue keyValue : this.j) {
      if (paramString == null && keyValue.key == null) {
        arrayList.add(keyValue);
        continue;
      } 
      if (paramString != null && paramString.equals(keyValue.key))
        arrayList.add(keyValue); 
    } 
    return arrayList;
  }
  
  public List<KeyValue> getQueryStringParams() {
    a();
    return new ArrayList<KeyValue>(this.i);
  }
  
  public RequestBody getRequestBody() {
    UrlEncodedBody urlEncodedBody;
    a();
    RequestBody requestBody = this.g;
    if (requestBody != null)
      return requestBody; 
    if (!TextUtils.isEmpty(this.c)) {
      StringBody stringBody = new StringBody(this.c, this.a);
      stringBody.setContentType(this.d);
    } else if (this.e) {
      MultipartBody multipartBody = new MultipartBody(this.j, this.a);
      multipartBody.setContentType(this.d);
    } else if (this.j.size() == 1) {
      String str1;
      KeyValue keyValue = this.j.get(0);
      String str2 = keyValue.key;
      Object object = keyValue.value;
      requestBody = null;
      if (keyValue instanceof BodyItemWrapper)
        str1 = ((BodyItemWrapper)keyValue).contentType; 
      String str3 = str1;
      if (TextUtils.isEmpty(str1))
        str3 = this.d; 
      if (object instanceof File) {
        FileBody fileBody = new FileBody((File)object, str3);
      } else if (object instanceof InputStream) {
        InputStreamBody inputStreamBody = new InputStreamBody((InputStream)object, str3);
      } else if (object instanceof byte[]) {
        InputStreamBody inputStreamBody = new InputStreamBody(new ByteArrayInputStream((byte[])object), str3);
      } else if (TextUtils.isEmpty(str2)) {
        StringBody stringBody = new StringBody(keyValue.getValueStrOrEmpty(), this.a);
        stringBody.setContentType(str3);
      } else {
        urlEncodedBody = new UrlEncodedBody(this.j, this.a);
        urlEncodedBody.setContentType(str3);
      } 
    } else {
      urlEncodedBody = new UrlEncodedBody(this.j, this.a);
      urlEncodedBody.setContentType(this.d);
    } 
    return (RequestBody)urlEncodedBody;
  }
  
  public boolean isAsJsonContent() {
    return this.f;
  }
  
  public boolean isMultipart() {
    return this.e;
  }
  
  public void removeParameter(String paramString) {
    if (TextUtils.isEmpty(paramString)) {
      this.c = null;
      this.d = null;
    } else {
      Iterator<KeyValue> iterator1 = this.i.iterator();
      while (iterator1.hasNext()) {
        if (paramString.equals(((KeyValue)iterator1.next()).key))
          iterator1.remove(); 
      } 
    } 
    Iterator<KeyValue> iterator = this.j.iterator();
    while (iterator.hasNext()) {
      KeyValue keyValue = iterator.next();
      if (paramString == null && keyValue.key == null) {
        iterator.remove();
        continue;
      } 
      if (paramString != null && paramString.equals(keyValue.key))
        iterator.remove(); 
    } 
  }
  
  public void setAsJsonContent(boolean paramBoolean) {
    this.f = paramBoolean;
  }
  
  public void setBodyContent(String paramString) {
    this.c = paramString;
  }
  
  public void setBodyContentType(String paramString) {
    this.d = paramString;
  }
  
  public void setCharset(String paramString) {
    if (!TextUtils.isEmpty(paramString))
      this.a = paramString; 
  }
  
  public void setHeader(String paramString1, String paramString2) {
    if (TextUtils.isEmpty(paramString1))
      return; 
    Header header = new Header(paramString1, paramString2, true);
    Iterator<Header> iterator = this.h.iterator();
    while (iterator.hasNext()) {
      if (paramString1.equals(((KeyValue)iterator.next()).key))
        iterator.remove(); 
    } 
    this.h.add(header);
  }
  
  public void setMethod(HttpMethod paramHttpMethod) {
    this.b = paramHttpMethod;
  }
  
  public void setMultipart(boolean paramBoolean) {
    this.e = paramBoolean;
  }
  
  public void setRequestBody(RequestBody paramRequestBody) {
    this.g = paramRequestBody;
  }
  
  public String toJSONString() {
    JSONObject jSONObject;
    if (!TextUtils.isEmpty(this.c)) {
      jSONObject = new JSONObject(this.c);
    } else {
      jSONObject = new JSONObject();
    } 
    ArrayList<KeyValue> arrayList = new ArrayList(this.i.size() + this.j.size());
    arrayList.addAll(this.i);
    arrayList.addAll(this.j);
    b(jSONObject, arrayList);
    return jSONObject.toString();
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    if (!this.i.isEmpty()) {
      for (KeyValue keyValue : this.i) {
        stringBuilder.append(keyValue.key);
        stringBuilder.append("=");
        stringBuilder.append(keyValue.value);
        stringBuilder.append("&");
      } 
      stringBuilder.deleteCharAt(stringBuilder.length() - 1);
    } 
    if (!TextUtils.isEmpty(this.c)) {
      stringBuilder.append("<");
      stringBuilder.append(this.c);
      stringBuilder.append(">");
    } else if (!this.j.isEmpty()) {
      stringBuilder.append("<");
      for (KeyValue keyValue : this.j) {
        stringBuilder.append(keyValue.key);
        stringBuilder.append("=");
        stringBuilder.append(keyValue.value);
        stringBuilder.append("&");
      } 
      stringBuilder.deleteCharAt(stringBuilder.length() - 1);
      stringBuilder.append(">");
    } 
    return stringBuilder.toString();
  }
  
  class BaseParams {}
  
  class BaseParams {}
  
  class BaseParams {}
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/org/xutils/http/BaseParams.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */