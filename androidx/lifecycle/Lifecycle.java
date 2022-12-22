package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;

public abstract class Lifecycle {
  AtomicReference<Object> a = new AtomicReference();
  
  public abstract void a(g paramg);
  
  public abstract State b();
  
  public abstract void c(g paramg);
  
  public enum Event {
    ON_ANY, ON_CREATE, ON_DESTROY, ON_PAUSE, ON_RESUME, ON_START, ON_STOP;
    
    static {
      Event event1 = new Event("ON_CREATE", 0);
      ON_CREATE = event1;
      Event event2 = new Event("ON_START", 1);
      ON_START = event2;
      Event event3 = new Event("ON_RESUME", 2);
      ON_RESUME = event3;
      Event event4 = new Event("ON_PAUSE", 3);
      ON_PAUSE = event4;
      Event event5 = new Event("ON_STOP", 4);
      ON_STOP = event5;
      Event event6 = new Event("ON_DESTROY", 5);
      ON_DESTROY = event6;
      Event event7 = new Event("ON_ANY", 6);
      ON_ANY = event7;
      $VALUES = new Event[] { event1, event2, event3, event4, event5, event6, event7 };
    }
    
    public static Event downFrom(Lifecycle.State param1State) {
      int i = Lifecycle.a.a[param1State.ordinal()];
      return (i != 1) ? ((i != 2) ? ((i != 3) ? null : ON_PAUSE) : ON_STOP) : ON_DESTROY;
    }
    
    public static Event downTo(Lifecycle.State param1State) {
      int i = Lifecycle.a.a[param1State.ordinal()];
      return (i != 1) ? ((i != 2) ? ((i != 4) ? null : ON_DESTROY) : ON_PAUSE) : ON_STOP;
    }
    
    public static Event upFrom(Lifecycle.State param1State) {
      int i = Lifecycle.a.a[param1State.ordinal()];
      return (i != 1) ? ((i != 2) ? ((i != 5) ? null : ON_CREATE) : ON_RESUME) : ON_START;
    }
    
    public static Event upTo(Lifecycle.State param1State) {
      int i = Lifecycle.a.a[param1State.ordinal()];
      return (i != 1) ? ((i != 2) ? ((i != 3) ? null : ON_RESUME) : ON_START) : ON_CREATE;
    }
    
    public Lifecycle.State getTargetState() {
      StringBuilder stringBuilder;
      switch (Lifecycle.a.b[ordinal()]) {
        default:
          stringBuilder = new StringBuilder();
          stringBuilder.append(this);
          stringBuilder.append(" has no target state");
          throw new IllegalArgumentException(stringBuilder.toString());
        case 6:
          return Lifecycle.State.b;
        case 5:
          return Lifecycle.State.f;
        case 3:
        case 4:
          return Lifecycle.State.e;
        case 1:
        case 2:
          break;
      } 
      return Lifecycle.State.d;
    }
  }
  
  public enum State {
    b, c, d, e, f;
    
    static {
      State state1 = new State("DESTROYED", 0);
      b = state1;
      State state2 = new State("INITIALIZED", 1);
      c = state2;
      State state3 = new State("CREATED", 2);
      d = state3;
      State state4 = new State("STARTED", 3);
      e = state4;
      State state5 = new State("RESUMED", 4);
      f = state5;
      g = new State[] { state1, state2, state3, state4, state5 };
    }
    
    public boolean isAtLeast(State param1State) {
      boolean bool;
      if (compareTo((E)param1State) >= 0) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/lifecycle/Lifecycle.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */