package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.util.HashMap;
import java.util.HashSet;

public abstract class c {
  public static int a = -1;
  
  int b;
  
  int c;
  
  String d;
  
  protected int e;
  
  HashMap<String, ConstraintAttribute> f;
  
  public c() {
    int i = a;
    this.b = i;
    this.c = i;
    this.d = null;
  }
  
  public abstract void a(HashMap<String, s> paramHashMap);
  
  abstract void b(HashSet<String> paramHashSet);
  
  abstract void c(Context paramContext, AttributeSet paramAttributeSet);
  
  boolean d(String paramString) {
    String str = this.d;
    return (str == null || paramString == null) ? false : paramString.matches(str);
  }
  
  public void e(HashMap<String, Integer> paramHashMap) {}
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/constraintlayout/motion/widget/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */