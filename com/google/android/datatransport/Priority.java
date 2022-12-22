package com.google.android.datatransport;

public enum Priority {
  b, c, d;
  
  static {
    Priority priority1 = new Priority("DEFAULT", 0);
    b = priority1;
    Priority priority2 = new Priority("VERY_LOW", 1);
    c = priority2;
    Priority priority3 = new Priority("HIGHEST", 2);
    d = priority3;
    e = new Priority[] { priority1, priority2, priority3 };
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/Priority.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */