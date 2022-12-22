package org.xutils.common.util;

public class KeyValue {
  public final String key;
  
  public final Object value;
  
  public KeyValue(String paramString, Object paramObject) {
    this.key = paramString;
    this.value = paramObject;
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = true;
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    KeyValue keyValue = (KeyValue)paramObject;
    paramObject = this.key;
    String str = keyValue.key;
    if (paramObject == null) {
      if (str != null)
        bool = false; 
    } else {
      bool = paramObject.equals(str);
    } 
    return bool;
  }
  
  public String getValueStrOrEmpty() {
    Object object = this.value;
    if (object == null) {
      object = "";
    } else {
      object = object.toString();
    } 
    return (String)object;
  }
  
  public String getValueStrOrNull() {
    Object object = this.value;
    if (object == null) {
      object = null;
    } else {
      object = object.toString();
    } 
    return (String)object;
  }
  
  public int hashCode() {
    boolean bool;
    String str = this.key;
    if (str != null) {
      bool = str.hashCode();
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("KeyValue{key='");
    stringBuilder.append(this.key);
    stringBuilder.append('\'');
    stringBuilder.append(", value=");
    stringBuilder.append(this.value);
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/org/xutils/common/util/KeyValue.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */