package b.r.a;

public final class a implements e {
  private final String b;
  
  private final Object[] c;
  
  public a(String paramString) {
    this(paramString, null);
  }
  
  public a(String paramString, Object[] paramArrayOfObject) {
    this.b = paramString;
    this.c = paramArrayOfObject;
  }
  
  private static void a(d paramd, int paramInt, Object paramObject) {
    if (paramObject == null) {
      paramd.Y(paramInt);
    } else if (paramObject instanceof byte[]) {
      paramd.O(paramInt, (byte[])paramObject);
    } else if (paramObject instanceof Float) {
      paramd.w(paramInt, ((Float)paramObject).floatValue());
    } else if (paramObject instanceof Double) {
      paramd.w(paramInt, ((Double)paramObject).doubleValue());
    } else if (paramObject instanceof Long) {
      paramd.I(paramInt, ((Long)paramObject).longValue());
    } else if (paramObject instanceof Integer) {
      paramd.I(paramInt, ((Integer)paramObject).intValue());
    } else if (paramObject instanceof Short) {
      paramd.I(paramInt, ((Short)paramObject).shortValue());
    } else if (paramObject instanceof Byte) {
      paramd.I(paramInt, ((Byte)paramObject).byteValue());
    } else if (paramObject instanceof String) {
      paramd.n(paramInt, (String)paramObject);
    } else {
      if (paramObject instanceof Boolean) {
        long l;
        if (((Boolean)paramObject).booleanValue()) {
          l = 1L;
        } else {
          l = 0L;
        } 
        paramd.I(paramInt, l);
        return;
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Cannot bind ");
      stringBuilder.append(paramObject);
      stringBuilder.append(" at index ");
      stringBuilder.append(paramInt);
      stringBuilder.append(" Supported types: null, byte[], float, double, long, int, short, byte,");
      stringBuilder.append(" string");
      throw new IllegalArgumentException(stringBuilder.toString());
    } 
  }
  
  public static void d(d paramd, Object[] paramArrayOfObject) {
    if (paramArrayOfObject == null)
      return; 
    int i = paramArrayOfObject.length;
    byte b = 0;
    while (b < i) {
      Object object = paramArrayOfObject[b];
      a(paramd, ++b, object);
    } 
  }
  
  public String b() {
    return this.b;
  }
  
  public void c(d paramd) {
    d(paramd, this.c);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/r/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */