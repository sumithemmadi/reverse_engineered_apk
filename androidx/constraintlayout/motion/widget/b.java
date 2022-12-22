package androidx.constraintlayout.motion.widget;

import android.util.Pair;
import java.util.HashMap;

public class b {
  static final HashMap<Pair<Integer, Integer>, String> a;
  
  static final HashMap<String, String> b;
  
  private final MotionLayout c;
  
  private String d = null;
  
  private String e = null;
  
  private int f = -1;
  
  private int g = -1;
  
  static {
    HashMap<Object, Object> hashMap1 = new HashMap<Object, Object>();
    a = (HashMap)hashMap1;
    HashMap<Object, Object> hashMap2 = new HashMap<Object, Object>();
    b = (HashMap)hashMap2;
    Integer integer1 = Integer.valueOf(4);
    hashMap1.put(Pair.create(integer1, integer1), "layout_constraintBottom_toBottomOf");
    Integer integer2 = Integer.valueOf(3);
    hashMap1.put(Pair.create(integer1, integer2), "layout_constraintBottom_toTopOf");
    hashMap1.put(Pair.create(integer2, integer1), "layout_constraintTop_toBottomOf");
    hashMap1.put(Pair.create(integer2, integer2), "layout_constraintTop_toTopOf");
    integer1 = Integer.valueOf(6);
    hashMap1.put(Pair.create(integer1, integer1), "layout_constraintStart_toStartOf");
    integer2 = Integer.valueOf(7);
    hashMap1.put(Pair.create(integer1, integer2), "layout_constraintStart_toEndOf");
    hashMap1.put(Pair.create(integer2, integer1), "layout_constraintEnd_toStartOf");
    hashMap1.put(Pair.create(integer2, integer2), "layout_constraintEnd_toEndOf");
    integer1 = Integer.valueOf(1);
    hashMap1.put(Pair.create(integer1, integer1), "layout_constraintLeft_toLeftOf");
    integer2 = Integer.valueOf(2);
    hashMap1.put(Pair.create(integer1, integer2), "layout_constraintLeft_toRightOf");
    hashMap1.put(Pair.create(integer2, integer2), "layout_constraintRight_toRightOf");
    hashMap1.put(Pair.create(integer2, integer1), "layout_constraintRight_toLeftOf");
    integer2 = Integer.valueOf(5);
    hashMap1.put(Pair.create(integer2, integer2), "layout_constraintBaseline_toBaselineOf");
    hashMap2.put("layout_constraintBottom_toBottomOf", "layout_marginBottom");
    hashMap2.put("layout_constraintBottom_toTopOf", "layout_marginBottom");
    hashMap2.put("layout_constraintTop_toBottomOf", "layout_marginTop");
    hashMap2.put("layout_constraintTop_toTopOf", "layout_marginTop");
    hashMap2.put("layout_constraintStart_toStartOf", "layout_marginStart");
    hashMap2.put("layout_constraintStart_toEndOf", "layout_marginStart");
    hashMap2.put("layout_constraintEnd_toStartOf", "layout_marginEnd");
    hashMap2.put("layout_constraintEnd_toEndOf", "layout_marginEnd");
    hashMap2.put("layout_constraintLeft_toLeftOf", "layout_marginLeft");
    hashMap2.put("layout_constraintLeft_toRightOf", "layout_marginLeft");
    hashMap2.put("layout_constraintRight_toRightOf", "layout_marginRight");
    hashMap2.put("layout_constraintRight_toLeftOf", "layout_marginRight");
  }
  
  public b(MotionLayout paramMotionLayout) {
    this.c = paramMotionLayout;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/constraintlayout/motion/widget/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */