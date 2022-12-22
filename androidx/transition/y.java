package androidx.transition;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class y {
  public final Map<String, Object> a = new HashMap<String, Object>();
  
  public View b;
  
  final ArrayList<Transition> c = new ArrayList<Transition>();
  
  @Deprecated
  public y() {}
  
  public y(View paramView) {
    this.b = paramView;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject instanceof y) {
      View view = this.b;
      paramObject = paramObject;
      if (view == ((y)paramObject).b && this.a.equals(((y)paramObject).a))
        return true; 
    } 
    return false;
  }
  
  public int hashCode() {
    return this.b.hashCode() * 31 + this.a.hashCode();
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("TransitionValues@");
    stringBuilder.append(Integer.toHexString(hashCode()));
    stringBuilder.append(":\n");
    String str2 = stringBuilder.toString();
    stringBuilder = new StringBuilder();
    stringBuilder.append(str2);
    stringBuilder.append("    view = ");
    stringBuilder.append(this.b);
    stringBuilder.append("\n");
    str2 = stringBuilder.toString();
    stringBuilder = new StringBuilder();
    stringBuilder.append(str2);
    stringBuilder.append("    values:");
    String str1 = stringBuilder.toString();
    for (String str : this.a.keySet()) {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(str1);
      stringBuilder1.append("    ");
      stringBuilder1.append(str);
      stringBuilder1.append(": ");
      stringBuilder1.append(this.a.get(str));
      stringBuilder1.append("\n");
      str1 = stringBuilder1.toString();
    } 
    return str1;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/transition/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */