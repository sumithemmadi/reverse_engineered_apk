package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.d;
import com.google.android.exoplayer2.util.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

public class TrackSelectionView extends LinearLayout {
  private final int b;
  
  private final LayoutInflater c;
  
  private final CheckedTextView d;
  
  private final CheckedTextView e;
  
  private final b f;
  
  private final SparseArray<DefaultTrackSelector.SelectionOverride> g;
  
  private boolean h;
  
  private boolean i;
  
  private n j;
  
  private CheckedTextView[][] k;
  
  private d.a l;
  
  private int m;
  
  private TrackGroupArray n;
  
  private boolean o;
  
  private c p;
  
  public TrackSelectionView(Context paramContext) {
    this(paramContext, null);
  }
  
  public TrackSelectionView(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public TrackSelectionView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    setOrientation(1);
    this.g = new SparseArray();
    setSaveFromParentEnabled(false);
    TypedArray typedArray = paramContext.getTheme().obtainStyledAttributes(new int[] { 16843534 });
    paramInt = typedArray.getResourceId(0, 0);
    this.b = paramInt;
    typedArray.recycle();
    LayoutInflater layoutInflater = LayoutInflater.from(paramContext);
    this.c = layoutInflater;
    b b1 = new b(null);
    this.f = b1;
    this.j = new d(getResources());
    this.n = TrackGroupArray.b;
    CheckedTextView checkedTextView2 = (CheckedTextView)layoutInflater.inflate(17367055, (ViewGroup)this, false);
    this.d = checkedTextView2;
    checkedTextView2.setBackgroundResource(paramInt);
    checkedTextView2.setText(j.exo_track_selection_none);
    checkedTextView2.setEnabled(false);
    checkedTextView2.setFocusable(true);
    checkedTextView2.setOnClickListener(b1);
    checkedTextView2.setVisibility(8);
    addView((View)checkedTextView2);
    addView(layoutInflater.inflate(i.exo_list_divider, (ViewGroup)this, false));
    CheckedTextView checkedTextView1 = (CheckedTextView)layoutInflater.inflate(17367055, (ViewGroup)this, false);
    this.e = checkedTextView1;
    checkedTextView1.setBackgroundResource(paramInt);
    checkedTextView1.setText(j.exo_track_selection_auto);
    checkedTextView1.setEnabled(false);
    checkedTextView1.setFocusable(true);
    checkedTextView1.setOnClickListener(b1);
    addView((View)checkedTextView1);
  }
  
  private static int[] b(int[] paramArrayOfint, int paramInt) {
    paramArrayOfint = Arrays.copyOf(paramArrayOfint, paramArrayOfint.length + 1);
    paramArrayOfint[paramArrayOfint.length - 1] = paramInt;
    return paramArrayOfint;
  }
  
  private static int[] c(int[] paramArrayOfint, int paramInt) {
    int[] arrayOfInt = new int[paramArrayOfint.length - 1];
    int i = paramArrayOfint.length;
    byte b1 = 0;
    int j;
    for (j = 0; b1 < i; j = m) {
      int k = paramArrayOfint[b1];
      int m = j;
      if (k != paramInt) {
        arrayOfInt[j] = k;
        m = j + 1;
      } 
      b1++;
    } 
    return arrayOfInt;
  }
  
  private void d(View paramView) {
    if (paramView == this.d) {
      f();
    } else if (paramView == this.e) {
      e();
    } else {
      g(paramView);
    } 
    j();
    c c1 = this.p;
    if (c1 != null)
      c1.a(getIsDisabled(), getOverrides()); 
  }
  
  private void e() {
    this.o = false;
    this.g.clear();
  }
  
  private void f() {
    this.o = true;
    this.g.clear();
  }
  
  private void g(View paramView) {
    this.o = false;
    Pair pair = (Pair)paramView.getTag();
    int i = ((Integer)pair.first).intValue();
    int j = ((Integer)pair.second).intValue();
    DefaultTrackSelector.SelectionOverride selectionOverride = (DefaultTrackSelector.SelectionOverride)this.g.get(i);
    e.e(this.l);
    if (selectionOverride == null) {
      if (!this.i && this.g.size() > 0)
        this.g.clear(); 
      this.g.put(i, new DefaultTrackSelector.SelectionOverride(i, new int[] { j }));
    } else {
      boolean bool;
      int k = selectionOverride.d;
      int[] arrayOfInt = selectionOverride.c;
      boolean bool1 = ((CheckedTextView)paramView).isChecked();
      boolean bool2 = h(i);
      if (bool2 || i()) {
        bool = true;
      } else {
        bool = false;
      } 
      if (bool1 && bool) {
        if (k == 1) {
          this.g.remove(i);
        } else {
          int[] arrayOfInt1 = c(arrayOfInt, j);
          this.g.put(i, new DefaultTrackSelector.SelectionOverride(i, arrayOfInt1));
        } 
      } else if (!bool1) {
        if (bool2) {
          int[] arrayOfInt1 = b(arrayOfInt, j);
          this.g.put(i, new DefaultTrackSelector.SelectionOverride(i, arrayOfInt1));
        } else {
          this.g.put(i, new DefaultTrackSelector.SelectionOverride(i, new int[] { j }));
        } 
      } 
    } 
  }
  
  @RequiresNonNull({"mappedTrackInfo"})
  private boolean h(int paramInt) {
    boolean bool = this.h;
    boolean bool1 = true;
    if (!bool || (this.n.a(paramInt)).b <= 1 || this.l.a(this.m, paramInt, false) == 0)
      bool1 = false; 
    return bool1;
  }
  
  private boolean i() {
    boolean bool = this.i;
    boolean bool1 = true;
    if (!bool || this.n.c <= 1)
      bool1 = false; 
    return bool1;
  }
  
  private void j() {
    boolean bool;
    this.d.setChecked(this.o);
    CheckedTextView checkedTextView = this.e;
    if (!this.o && this.g.size() == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    checkedTextView.setChecked(bool);
    byte b1 = 0;
    while (b1 < this.k.length) {
      DefaultTrackSelector.SelectionOverride selectionOverride = (DefaultTrackSelector.SelectionOverride)this.g.get(b1);
      byte b2 = 0;
      while (true) {
        CheckedTextView[][] arrayOfCheckedTextView = this.k;
        if (b2 < (arrayOfCheckedTextView[b1]).length) {
          CheckedTextView checkedTextView1 = arrayOfCheckedTextView[b1][b2];
          if (selectionOverride != null && selectionOverride.a(b2)) {
            bool = true;
          } else {
            bool = false;
          } 
          checkedTextView1.setChecked(bool);
          b2++;
          continue;
        } 
        b1++;
      } 
    } 
  }
  
  private void k() {
    int i;
    for (i = getChildCount() - 1; i >= 3; i--)
      removeViewAt(i); 
    if (this.l == null) {
      this.d.setEnabled(false);
      this.e.setEnabled(false);
      return;
    } 
    this.d.setEnabled(true);
    this.e.setEnabled(true);
    TrackGroupArray trackGroupArray = this.l.e(this.m);
    this.n = trackGroupArray;
    this.k = new CheckedTextView[trackGroupArray.c][];
    boolean bool = i();
    i = 0;
    while (true) {
      trackGroupArray = this.n;
      if (i < trackGroupArray.c) {
        TrackGroup trackGroup = trackGroupArray.a(i);
        boolean bool1 = h(i);
        this.k[i] = new CheckedTextView[trackGroup.b];
        for (byte b1 = 0; b1 < trackGroup.b; b1++) {
          int j;
          if (b1 == 0)
            addView(this.c.inflate(i.exo_list_divider, (ViewGroup)this, false)); 
          if (bool1 || bool) {
            j = 17367056;
          } else {
            j = 17367055;
          } 
          CheckedTextView checkedTextView = (CheckedTextView)this.c.inflate(j, (ViewGroup)this, false);
          checkedTextView.setBackgroundResource(this.b);
          checkedTextView.setText(this.j.a(trackGroup.a(b1)));
          if (this.l.f(this.m, i, b1) == 4) {
            checkedTextView.setFocusable(true);
            checkedTextView.setTag(Pair.create(Integer.valueOf(i), Integer.valueOf(b1)));
            checkedTextView.setOnClickListener(this.f);
          } else {
            checkedTextView.setFocusable(false);
            checkedTextView.setEnabled(false);
          } 
          this.k[i][b1] = checkedTextView;
          addView((View)checkedTextView);
        } 
        i++;
        continue;
      } 
      j();
      return;
    } 
  }
  
  public boolean getIsDisabled() {
    return this.o;
  }
  
  public List<DefaultTrackSelector.SelectionOverride> getOverrides() {
    ArrayList<Object> arrayList = new ArrayList(this.g.size());
    for (byte b1 = 0; b1 < this.g.size(); b1++)
      arrayList.add(this.g.valueAt(b1)); 
    return arrayList;
  }
  
  public void setAllowAdaptiveSelections(boolean paramBoolean) {
    if (this.h != paramBoolean) {
      this.h = paramBoolean;
      k();
    } 
  }
  
  public void setAllowMultipleOverrides(boolean paramBoolean) {
    if (this.i != paramBoolean) {
      this.i = paramBoolean;
      if (!paramBoolean && this.g.size() > 1)
        for (int i = this.g.size() - 1; i > 0; i--)
          this.g.remove(i);  
      k();
    } 
  }
  
  public void setShowDisableOption(boolean paramBoolean) {
    byte b1;
    CheckedTextView checkedTextView = this.d;
    if (paramBoolean) {
      b1 = 0;
    } else {
      b1 = 8;
    } 
    checkedTextView.setVisibility(b1);
  }
  
  public void setTrackNameProvider(n paramn) {
    this.j = (n)e.e(paramn);
    k();
  }
  
  private class b implements View.OnClickListener {
    private b(TrackSelectionView this$0) {}
    
    public void onClick(View param1View) {
      TrackSelectionView.a(this.b, param1View);
    }
  }
  
  public static interface c {
    void a(boolean param1Boolean, List<DefaultTrackSelector.SelectionOverride> param1List);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/ui/TrackSelectionView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */