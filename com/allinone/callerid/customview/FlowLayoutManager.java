package com.allinone.callerid.customview;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class FlowLayoutManager extends RecyclerView.o {
  private static final String s = "FlowLayoutManager";
  
  private int A = 0;
  
  private b B = new b(this);
  
  private int C;
  
  private Context D;
  
  private int t;
  
  private int u;
  
  private int v;
  
  private int w;
  
  private int x;
  
  private int y;
  
  private int z = 0;
  
  public FlowLayoutManager(Context paramContext) {
    this.D = paramContext;
  }
  
  private void N1() {
    List<a> list = this.B.c;
    for (byte b1 = 0; b1 < list.size(); b1++) {
      View view = ((a)list.get(b1)).b;
      if (((a)list.get(b1)).a < this.B.b) {
        int i = Q(view);
        b b2 = this.B;
        int j = (int)(b2.a + (b2.b - R(view)) / 2.0F);
        int k = T(view);
        b2 = this.B;
        z0(view, i, j, k, (int)(b2.a + (b2.b - R(view)) / 2.0F + R(view)));
      } 
    } 
    this.B.b();
  }
  
  private int O1() {
    return this.u - d0() - g0();
  }
  
  public RecyclerView.LayoutParams D() {
    return new RecyclerView.LayoutParams(-2, -2);
  }
  
  public void X0(RecyclerView.u paramu, RecyclerView.y paramy) {
    if (paramy.e())
      return; 
    w(paramu);
    this.t = o0();
    this.u = W();
    this.A = 0;
    this.v = e0();
    this.x = f0();
    int i = g0();
    this.w = i;
    this.y = this.t - this.v - this.x;
    this.B.b();
    int j = 0;
    byte b1 = 0;
    int k;
    for (k = 0; b1 < Y(); k = i1) {
      int m;
      int n;
      int i1;
      View view = paramu.o(b1);
      d(view);
      if (8 == view.getVisibility()) {
        m = j;
        n = i;
        i1 = k;
      } else {
        A0(view, 0, 0);
        int i2 = S(view);
        int i3 = R(view);
        String str = s;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("childHeight:");
        stringBuilder.append(i3);
        Log.d(str, stringBuilder.toString());
        int i4 = this.C;
        stringBuilder = new StringBuilder();
        stringBuilder.append("topMargin:");
        stringBuilder.append(i4);
        Log.d(str, stringBuilder.toString());
        i1 = i2 + i4 + i4;
        n = i3 + i4 + i4;
        m = j + i1;
        if (m <= this.y) {
          j = this.v + j + i4;
          i1 = i4 + i;
          z0(view, j, i1, j + i2, i1 + i3);
          k = Math.max(k, n);
          this.B.a(new a(n, view));
          this.B.c(i);
          this.B.d(k);
          n = k;
          k = m;
          j = i;
          i = n;
        } else {
          N1();
          j = i + k;
          this.A += k;
          i = j + i4;
          k = i4 + this.v;
          z0(view, k, i, k + i2, i + i3);
          this.B.a(new a(n, view));
          this.B.c(j);
          this.B.d(n);
          k = i1;
          i = n;
        } 
        m = k;
        n = j;
        i1 = i;
        if (b1 == Y() - 1) {
          N1();
          this.A += i;
          i1 = i;
          n = j;
          m = k;
        } 
      } 
      b1++;
      j = m;
      i = n;
    } 
    this.A = Math.max(this.A, O1());
  }
  
  public void Z0(RecyclerView.u paramu, RecyclerView.y paramy, int paramInt1, int paramInt2) {
    Log.d("TAG", "onMeasure");
    int i = View.MeasureSpec.getMode(paramInt1);
    int j = View.MeasureSpec.getSize(paramInt1);
    paramInt1 = View.MeasureSpec.getMode(paramInt2);
    paramInt2 = View.MeasureSpec.getSize(paramInt2);
    if (i == 1073741824) {
      this.t = j;
    } else {
      this.t = (this.D.getResources().getDisplayMetrics()).widthPixels;
    } 
    if (paramInt1 == 1073741824) {
      this.u = paramInt2;
      Log.d("TAG", "规则的");
    } else {
      Log.d("TAG", "不规则的");
      paramInt1 = ((Activity)this.D).findViewById(16908290).getHeight();
      this.u = Math.min(this.A + g0() + d0(), paramInt1);
    } 
    C1(this.t, this.u);
  }
  
  public boolean l() {
    return true;
  }
  
  public int y1(int paramInt, RecyclerView.u paramu, RecyclerView.y paramy) {
    int j;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("totalHeight:");
    stringBuilder.append(this.A);
    Log.d("TAG", stringBuilder.toString());
    int i = this.z;
    if (i + paramInt < 0) {
      j = -i;
    } else {
      j = paramInt;
      if (i + paramInt > this.A - O1())
        j = this.A - O1() - this.z; 
    } 
    this.z += j;
    D0(-j);
    return j;
  }
  
  public static class a {
    int a;
    
    View b;
    
    public a(int param1Int, View param1View) {
      this.a = param1Int;
      this.b = param1View;
    }
  }
  
  public class b {
    float a;
    
    float b;
    
    List<FlowLayoutManager.a> c = new ArrayList<FlowLayoutManager.a>();
    
    public b(FlowLayoutManager this$0) {}
    
    public void a(FlowLayoutManager.a param1a) {
      this.c.add(param1a);
    }
    
    public void b() {
      this.a = 0.0F;
      this.b = 0.0F;
      this.c.clear();
    }
    
    public void c(float param1Float) {
      this.a = param1Float;
    }
    
    public void d(float param1Float) {
      this.b = param1Float;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/customview/FlowLayoutManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */