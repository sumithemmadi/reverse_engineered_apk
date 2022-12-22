package androidx.room.o;

public class c {
  public static final String[] a = new String[0];
  
  public static void a(StringBuilder paramStringBuilder, int paramInt) {
    for (byte b = 0; b < paramInt; b++) {
      paramStringBuilder.append("?");
      if (b < paramInt - 1)
        paramStringBuilder.append(","); 
    } 
  }
  
  public static StringBuilder b() {
    return new StringBuilder();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/room/o/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */