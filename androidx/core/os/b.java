package androidx.core.os;

public final class b {
  private boolean a;
  
  private a b;
  
  private Object c;
  
  private boolean d;
  
  private void d() {
    while (this.d) {
      try {
        wait();
      } catch (InterruptedException interruptedException) {}
    } 
  }
  
  public void a() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Z
    //   6: ifeq -> 12
    //   9: aload_0
    //   10: monitorexit
    //   11: return
    //   12: aload_0
    //   13: iconst_1
    //   14: putfield a : Z
    //   17: aload_0
    //   18: iconst_1
    //   19: putfield d : Z
    //   22: aload_0
    //   23: getfield b : Landroidx/core/os/b$a;
    //   26: astore_1
    //   27: aload_0
    //   28: getfield c : Ljava/lang/Object;
    //   31: astore_2
    //   32: aload_0
    //   33: monitorexit
    //   34: aload_1
    //   35: ifnull -> 51
    //   38: aload_1
    //   39: invokeinterface a : ()V
    //   44: goto -> 51
    //   47: astore_2
    //   48: goto -> 73
    //   51: aload_2
    //   52: ifnull -> 93
    //   55: getstatic android/os/Build$VERSION.SDK_INT : I
    //   58: bipush #16
    //   60: if_icmplt -> 93
    //   63: aload_2
    //   64: checkcast android/os/CancellationSignal
    //   67: invokevirtual cancel : ()V
    //   70: goto -> 93
    //   73: aload_0
    //   74: monitorenter
    //   75: aload_0
    //   76: iconst_0
    //   77: putfield d : Z
    //   80: aload_0
    //   81: invokevirtual notifyAll : ()V
    //   84: aload_0
    //   85: monitorexit
    //   86: aload_2
    //   87: athrow
    //   88: astore_2
    //   89: aload_0
    //   90: monitorexit
    //   91: aload_2
    //   92: athrow
    //   93: aload_0
    //   94: monitorenter
    //   95: aload_0
    //   96: iconst_0
    //   97: putfield d : Z
    //   100: aload_0
    //   101: invokevirtual notifyAll : ()V
    //   104: aload_0
    //   105: monitorexit
    //   106: return
    //   107: astore_2
    //   108: aload_0
    //   109: monitorexit
    //   110: aload_2
    //   111: athrow
    //   112: astore_2
    //   113: aload_0
    //   114: monitorexit
    //   115: aload_2
    //   116: athrow
    // Exception table:
    //   from	to	target	type
    //   2	11	112	finally
    //   12	34	112	finally
    //   38	44	47	finally
    //   55	70	47	finally
    //   75	86	88	finally
    //   89	91	88	finally
    //   95	106	107	finally
    //   108	110	107	finally
    //   113	115	112	finally
  }
  
  public boolean b() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Z
    //   6: istore_1
    //   7: aload_0
    //   8: monitorexit
    //   9: iload_1
    //   10: ireturn
    //   11: astore_2
    //   12: aload_0
    //   13: monitorexit
    //   14: aload_2
    //   15: athrow
    // Exception table:
    //   from	to	target	type
    //   2	9	11	finally
    //   12	14	11	finally
  }
  
  public void c(a parama) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokespecial d : ()V
    //   6: aload_0
    //   7: getfield b : Landroidx/core/os/b$a;
    //   10: aload_1
    //   11: if_acmpne -> 17
    //   14: aload_0
    //   15: monitorexit
    //   16: return
    //   17: aload_0
    //   18: aload_1
    //   19: putfield b : Landroidx/core/os/b$a;
    //   22: aload_0
    //   23: getfield a : Z
    //   26: ifeq -> 45
    //   29: aload_1
    //   30: ifnonnull -> 36
    //   33: goto -> 45
    //   36: aload_0
    //   37: monitorexit
    //   38: aload_1
    //   39: invokeinterface a : ()V
    //   44: return
    //   45: aload_0
    //   46: monitorexit
    //   47: return
    //   48: astore_1
    //   49: aload_0
    //   50: monitorexit
    //   51: aload_1
    //   52: athrow
    // Exception table:
    //   from	to	target	type
    //   2	16	48	finally
    //   17	29	48	finally
    //   36	38	48	finally
    //   45	47	48	finally
    //   49	51	48	finally
  }
  
  public static interface a {
    void a();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/core/os/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */