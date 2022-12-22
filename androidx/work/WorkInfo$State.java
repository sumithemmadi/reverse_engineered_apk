package androidx.work;

public enum WorkInfo$State {
  b, c, d, e, f, g;
  
  static {
    WorkInfo$State workInfo$State1 = new WorkInfo$State("ENQUEUED", 0);
    b = workInfo$State1;
    WorkInfo$State workInfo$State2 = new WorkInfo$State("RUNNING", 1);
    c = workInfo$State2;
    WorkInfo$State workInfo$State3 = new WorkInfo$State("SUCCEEDED", 2);
    d = workInfo$State3;
    WorkInfo$State workInfo$State4 = new WorkInfo$State("FAILED", 3);
    e = workInfo$State4;
    WorkInfo$State workInfo$State5 = new WorkInfo$State("BLOCKED", 4);
    f = workInfo$State5;
    WorkInfo$State workInfo$State6 = new WorkInfo$State("CANCELLED", 5);
    g = workInfo$State6;
    h = new WorkInfo$State[] { workInfo$State1, workInfo$State2, workInfo$State3, workInfo$State4, workInfo$State5, workInfo$State6 };
  }
  
  public boolean isFinished() {
    return (this == d || this == e || this == g);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/WorkInfo$State.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */