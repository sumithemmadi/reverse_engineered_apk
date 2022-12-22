package androidx.work;

public enum BackoffPolicy {
  b, c;
  
  static {
    BackoffPolicy backoffPolicy1 = new BackoffPolicy("EXPONENTIAL", 0);
    b = backoffPolicy1;
    BackoffPolicy backoffPolicy2 = new BackoffPolicy("LINEAR", 1);
    c = backoffPolicy2;
    d = new BackoffPolicy[] { backoffPolicy1, backoffPolicy2 };
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/BackoffPolicy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */