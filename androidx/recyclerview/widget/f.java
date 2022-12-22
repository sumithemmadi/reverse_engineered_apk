package androidx.recyclerview.widget;

import android.view.View;

class f {
  boolean a = true;
  
  int b;
  
  int c;
  
  int d;
  
  int e;
  
  int f = 0;
  
  int g = 0;
  
  boolean h;
  
  boolean i;
  
  boolean a(RecyclerView.y paramy) {
    boolean bool;
    int i = this.c;
    if (i >= 0 && i < paramy.b()) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  View b(RecyclerView.u paramu) {
    View view = paramu.o(this.c);
    this.c += this.d;
    return view;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("LayoutState{mAvailable=");
    stringBuilder.append(this.b);
    stringBuilder.append(", mCurrentPosition=");
    stringBuilder.append(this.c);
    stringBuilder.append(", mItemDirection=");
    stringBuilder.append(this.d);
    stringBuilder.append(", mLayoutDirection=");
    stringBuilder.append(this.e);
    stringBuilder.append(", mStartLine=");
    stringBuilder.append(this.f);
    stringBuilder.append(", mEndLine=");
    stringBuilder.append(this.g);
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/recyclerview/widget/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */