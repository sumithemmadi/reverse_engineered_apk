package com.google.android.exoplayer2.database;

import android.database.SQLException;
import java.io.IOException;

public final class DatabaseIOException extends IOException {
  public DatabaseIOException(SQLException paramSQLException) {
    super((Throwable)paramSQLException);
  }
  
  public DatabaseIOException(SQLException paramSQLException, String paramString) {
    super(paramString, (Throwable)paramSQLException);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/database/DatabaseIOException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */