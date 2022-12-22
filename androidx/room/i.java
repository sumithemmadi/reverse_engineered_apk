package androidx.room;

public class i {
  public static String a(String paramString) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '");
    stringBuilder.append(paramString);
    stringBuilder.append("')");
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/room/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */