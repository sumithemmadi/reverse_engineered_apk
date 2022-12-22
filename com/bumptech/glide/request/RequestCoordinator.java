package com.bumptech.glide.request;

public interface RequestCoordinator {
  void a(c paramc);
  
  boolean b();
  
  RequestCoordinator c();
  
  boolean e(c paramc);
  
  boolean g(c paramc);
  
  void i(c paramc);
  
  boolean k(c paramc);
  
  public enum RequestState {
    b, c, d, e, f;
    
    private final boolean isComplete;
    
    static {
      RequestState requestState1 = new RequestState("RUNNING", 0, false);
      b = requestState1;
      RequestState requestState2 = new RequestState("PAUSED", 1, false);
      c = requestState2;
      RequestState requestState3 = new RequestState("CLEARED", 2, false);
      d = requestState3;
      RequestState requestState4 = new RequestState("SUCCESS", 3, true);
      e = requestState4;
      RequestState requestState5 = new RequestState("FAILED", 4, true);
      f = requestState5;
      g = new RequestState[] { requestState1, requestState2, requestState3, requestState4, requestState5 };
    }
    
    RequestState(boolean param1Boolean) {
      this.isComplete = param1Boolean;
    }
    
    boolean isComplete() {
      return this.isComplete;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/request/RequestCoordinator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */