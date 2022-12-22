package androidx.room;

import android.content.Context;

public class h {
  public static <T extends RoomDatabase> RoomDatabase.a<T> a(Context paramContext, Class<T> paramClass, String paramString) {
    if (paramString != null && paramString.trim().length() != 0)
      return new RoomDatabase.a<T>(paramContext, paramClass, paramString); 
    throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
  }
  
  static <T, C> T b(Class<C> paramClass, String paramString) {
    String str1 = paramClass.getPackage().getName();
    String str2 = paramClass.getCanonicalName();
    if (!str1.isEmpty())
      str2 = str2.substring(str1.length() + 1); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(str2.replace('.', '_'));
    stringBuilder.append(paramString);
    str2 = stringBuilder.toString();
    try {
      if (str1.isEmpty()) {
        paramString = str2;
      } else {
        StringBuilder stringBuilder1 = new StringBuilder();
        this();
        stringBuilder1.append(str1);
        stringBuilder1.append(".");
        stringBuilder1.append(str2);
        null = stringBuilder1.toString();
      } 
      return (T)Class.forName(null).newInstance();
    } catch (ClassNotFoundException classNotFoundException) {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("cannot find implementation for ");
      stringBuilder1.append(paramClass.getCanonicalName());
      stringBuilder1.append(". ");
      stringBuilder1.append(str2);
      stringBuilder1.append(" does not exist");
      throw new RuntimeException(stringBuilder1.toString());
    } catch (IllegalAccessException illegalAccessException) {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("Cannot access the constructor");
      stringBuilder1.append(paramClass.getCanonicalName());
      throw new RuntimeException(stringBuilder1.toString());
    } catch (InstantiationException instantiationException) {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("Failed to create an instance of ");
      stringBuilder1.append(paramClass.getCanonicalName());
      throw new RuntimeException(stringBuilder1.toString());
    } 
  }
  
  public static <T extends RoomDatabase> RoomDatabase.a<T> c(Context paramContext, Class<T> paramClass) {
    return new RoomDatabase.a<T>(paramContext, paramClass, null);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/room/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */