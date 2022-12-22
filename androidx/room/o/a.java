package androidx.room.o;

import android.database.Cursor;
import android.database.MatrixCursor;

public class a {
  public static Cursor a(Cursor paramCursor) {
    try {
      IllegalStateException illegalStateException;
      MatrixCursor matrixCursor = new MatrixCursor();
      this(paramCursor.getColumnNames(), paramCursor.getCount());
      while (paramCursor.moveToNext()) {
        Object[] arrayOfObject = new Object[paramCursor.getColumnCount()];
        for (byte b = 0; b < paramCursor.getColumnCount(); b++) {
          int i = paramCursor.getType(b);
          if (i != 0) {
            if (i != 1) {
              if (i != 2) {
                if (i != 3) {
                  if (i == 4) {
                    arrayOfObject[b] = paramCursor.getBlob(b);
                  } else {
                    illegalStateException = new IllegalStateException();
                    this();
                    throw illegalStateException;
                  } 
                } else {
                  arrayOfObject[b] = paramCursor.getString(b);
                } 
              } else {
                arrayOfObject[b] = Double.valueOf(paramCursor.getDouble(b));
              } 
            } else {
              arrayOfObject[b] = Long.valueOf(paramCursor.getLong(b));
            } 
          } else {
            arrayOfObject[b] = null;
          } 
        } 
        illegalStateException.addRow(arrayOfObject);
      } 
      return (Cursor)illegalStateException;
    } finally {
      paramCursor.close();
    } 
  }
  
  public static int b(Cursor paramCursor, String paramString) {
    int i = paramCursor.getColumnIndex(paramString);
    if (i >= 0)
      return i; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("`");
    stringBuilder.append(paramString);
    stringBuilder.append("`");
    return paramCursor.getColumnIndexOrThrow(stringBuilder.toString());
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/room/o/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */