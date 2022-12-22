package com.allinone.callerid.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ListView;
import b.h.k.j;
import b.h.k.k;
import b.h.k.l;

public class NestedScrollingListView extends ListView implements k {
  private l b;
  
  private int[] c = new int[2];
  
  private int[] d = new int[2];
  
  private int[] e = new int[2];
  
  private int f;
  
  private int g;
  
  private int h;
  
  private boolean i = true;
  
  private int j;
  
  public NestedScrollingListView(Context paramContext) {
    super(paramContext);
    a();
  }
  
  public NestedScrollingListView(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    a();
  }
  
  public NestedScrollingListView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    a();
  }
  
  private void a() {
    this.b = new l((View)this);
    setNestedScrollingEnabled(true);
  }
  
  private boolean b(int paramInt1, int paramInt2) {
    return ((paramInt1 > 0 && paramInt2 < 0) || (paramInt1 < 0 && paramInt2 > 0));
  }
  
  private void c(MotionEvent paramMotionEvent) {
    this.j = 0;
    int[] arrayOfInt = this.c;
    arrayOfInt[1] = 0;
    arrayOfInt[0] = 0;
    this.f = j.d(paramMotionEvent, 0);
    this.g = (int)(paramMotionEvent.getX() + 0.5F);
    this.h = (int)(paramMotionEvent.getY() + 0.5F);
    startNestedScroll(2);
  }
  
  public boolean dispatchNestedFling(float paramFloat1, float paramFloat2, boolean paramBoolean) {
    return this.b.a(paramFloat1, paramFloat2, paramBoolean);
  }
  
  public boolean dispatchNestedPreFling(float paramFloat1, float paramFloat2) {
    return this.b.b(paramFloat1, paramFloat2);
  }
  
  public boolean dispatchNestedPreScroll(int paramInt1, int paramInt2, int[] paramArrayOfint1, int[] paramArrayOfint2) {
    return this.b.c(paramInt1, paramInt2, paramArrayOfint1, paramArrayOfint2);
  }
  
  public boolean dispatchNestedScroll(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfint) {
    return this.b.f(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfint);
  }
  
  public boolean hasNestedScrollingParent() {
    return this.b.j();
  }
  
  public boolean isNestedScrollingEnabled() {
    return this.b.l();
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) {
    StringBuilder stringBuilder;
    MotionEvent motionEvent = MotionEvent.obtain(paramMotionEvent);
    int i = j.c(paramMotionEvent);
    int j = j.b(paramMotionEvent);
    if (i == 0) {
      int[] arrayOfInt1 = this.c;
      arrayOfInt1[1] = 0;
      arrayOfInt1[0] = 0;
    } 
    int[] arrayOfInt = this.c;
    motionEvent.offsetLocation(arrayOfInt[0], arrayOfInt[1]);
    if (i != 0) {
      if (i != 1) {
        if (i != 2) {
          if (i == 5) {
            this.f = j.d(paramMotionEvent, j);
            this.g = (int)(j.e(paramMotionEvent, j) + 0.5F);
            this.h = (int)(j.f(paramMotionEvent, j) + 0.5F);
          } 
        } else {
          j = j.a(paramMotionEvent, this.f);
          if (j < 0) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Error processing scroll; pointer index for id ");
            stringBuilder.append(this.f);
            stringBuilder.append(" not found. Did any MotionEvents get skipped?");
            Log.e("NestedListView", stringBuilder.toString());
            return false;
          } 
          i = (int)(j.e((MotionEvent)stringBuilder, j) + 0.5F);
          j = (int)(j.f((MotionEvent)stringBuilder, j) + 0.5F);
          int m = this.g;
          int n = this.h - j;
          if (this.i) {
            Log.i("pyt", "FIRST");
            this.i = false;
            c((MotionEvent)stringBuilder);
            return true;
          } 
          if (!b(this.j, n)) {
            this.j = n;
            StringBuilder stringBuilder1 = new StringBuilder();
            stringBuilder1.append("move lastY");
            stringBuilder1.append(this.h);
            stringBuilder1.append(",y=");
            stringBuilder1.append(j);
            stringBuilder1.append(",dy=");
            stringBuilder1.append(n);
            Log.i("pyt", stringBuilder1.toString());
            if (dispatchNestedPreScroll(m - i, n, this.d, this.e)) {
              int[] arrayOfInt3 = this.e;
              motionEvent.offsetLocation(arrayOfInt3[0], arrayOfInt3[1]);
              arrayOfInt3 = this.c;
              m = arrayOfInt3[0];
              int[] arrayOfInt2 = this.e;
              arrayOfInt3[0] = m + arrayOfInt2[0];
              arrayOfInt3[1] = arrayOfInt3[1] + arrayOfInt2[1];
            } 
            int[] arrayOfInt1 = this.e;
            this.g = i - arrayOfInt1[0];
            this.h = j - arrayOfInt1[1];
          } 
        } 
      } else {
        stopNestedScroll();
        this.i = true;
      } 
    } else {
      c((MotionEvent)stringBuilder);
    } 
    super.onTouchEvent((MotionEvent)stringBuilder);
    return true;
  }
  
  public void setNestedScrollingEnabled(boolean paramBoolean) {
    this.b.m(paramBoolean);
  }
  
  public boolean startNestedScroll(int paramInt) {
    return this.b.o(paramInt);
  }
  
  public void stopNestedScroll() {
    this.b.q();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/customview/NestedScrollingListView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */