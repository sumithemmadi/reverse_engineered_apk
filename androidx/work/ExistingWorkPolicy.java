package androidx.work;

public enum ExistingWorkPolicy {
  b, c, d;
  
  static {
    ExistingWorkPolicy existingWorkPolicy1 = new ExistingWorkPolicy("REPLACE", 0);
    b = existingWorkPolicy1;
    ExistingWorkPolicy existingWorkPolicy2 = new ExistingWorkPolicy("KEEP", 1);
    c = existingWorkPolicy2;
    ExistingWorkPolicy existingWorkPolicy3 = new ExistingWorkPolicy("APPEND", 2);
    d = existingWorkPolicy3;
    e = new ExistingWorkPolicy[] { existingWorkPolicy1, existingWorkPolicy2, existingWorkPolicy3 };
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/ExistingWorkPolicy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */