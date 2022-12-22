package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.view.menu.p;
import b.h.k.v;
import b.h.k.w;

public class AppCompatSpinner extends Spinner implements v {
  private static final int[] b = new int[] { 16843505 };
  
  private final d c;
  
  private final Context d;
  
  private t e;
  
  private SpinnerAdapter f;
  
  private final boolean g;
  
  private f h;
  
  int i;
  
  final Rect j;
  
  public AppCompatSpinner(Context paramContext) {
    this(paramContext, null);
  }
  
  public AppCompatSpinner(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, b.a.a.spinnerStyle);
  }
  
  public AppCompatSpinner(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    this(paramContext, paramAttributeSet, paramInt, -1);
  }
  
  public AppCompatSpinner(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    this(paramContext, paramAttributeSet, paramInt1, paramInt2, null);
  }
  
  public AppCompatSpinner(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2, Resources.Theme paramTheme) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: iload_3
    //   4: invokespecial <init> : (Landroid/content/Context;Landroid/util/AttributeSet;I)V
    //   7: aload_0
    //   8: new android/graphics/Rect
    //   11: dup
    //   12: invokespecial <init> : ()V
    //   15: putfield j : Landroid/graphics/Rect;
    //   18: aload_0
    //   19: aload_0
    //   20: invokevirtual getContext : ()Landroid/content/Context;
    //   23: invokestatic a : (Landroid/view/View;Landroid/content/Context;)V
    //   26: aload_1
    //   27: aload_2
    //   28: getstatic b/a/j.Spinner : [I
    //   31: iload_3
    //   32: iconst_0
    //   33: invokestatic v : (Landroid/content/Context;Landroid/util/AttributeSet;[III)Landroidx/appcompat/widget/e0;
    //   36: astore #6
    //   38: aload_0
    //   39: new androidx/appcompat/widget/d
    //   42: dup
    //   43: aload_0
    //   44: invokespecial <init> : (Landroid/view/View;)V
    //   47: putfield c : Landroidx/appcompat/widget/d;
    //   50: aload #5
    //   52: ifnull -> 72
    //   55: aload_0
    //   56: new b/a/o/d
    //   59: dup
    //   60: aload_1
    //   61: aload #5
    //   63: invokespecial <init> : (Landroid/content/Context;Landroid/content/res/Resources$Theme;)V
    //   66: putfield d : Landroid/content/Context;
    //   69: goto -> 110
    //   72: aload #6
    //   74: getstatic b/a/j.Spinner_popupTheme : I
    //   77: iconst_0
    //   78: invokevirtual n : (II)I
    //   81: istore #7
    //   83: iload #7
    //   85: ifeq -> 105
    //   88: aload_0
    //   89: new b/a/o/d
    //   92: dup
    //   93: aload_1
    //   94: iload #7
    //   96: invokespecial <init> : (Landroid/content/Context;I)V
    //   99: putfield d : Landroid/content/Context;
    //   102: goto -> 110
    //   105: aload_0
    //   106: aload_1
    //   107: putfield d : Landroid/content/Context;
    //   110: aconst_null
    //   111: astore #8
    //   113: iload #4
    //   115: istore #7
    //   117: iload #4
    //   119: iconst_m1
    //   120: if_icmpne -> 242
    //   123: aload_1
    //   124: aload_2
    //   125: getstatic androidx/appcompat/widget/AppCompatSpinner.b : [I
    //   128: iload_3
    //   129: iconst_0
    //   130: invokevirtual obtainStyledAttributes : (Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
    //   133: astore #5
    //   135: iload #4
    //   137: istore #7
    //   139: aload #5
    //   141: astore #9
    //   143: aload #5
    //   145: astore #8
    //   147: aload #5
    //   149: iconst_0
    //   150: invokevirtual hasValue : (I)Z
    //   153: ifeq -> 173
    //   156: aload #5
    //   158: astore #8
    //   160: aload #5
    //   162: iconst_0
    //   163: iconst_0
    //   164: invokevirtual getInt : (II)I
    //   167: istore #7
    //   169: aload #5
    //   171: astore #9
    //   173: aload #9
    //   175: invokevirtual recycle : ()V
    //   178: goto -> 242
    //   181: astore #9
    //   183: goto -> 195
    //   186: astore_1
    //   187: goto -> 230
    //   190: astore #9
    //   192: aconst_null
    //   193: astore #5
    //   195: aload #5
    //   197: astore #8
    //   199: ldc 'AppCompatSpinner'
    //   201: ldc 'Could not read android:spinnerMode'
    //   203: aload #9
    //   205: invokestatic i : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   208: pop
    //   209: iload #4
    //   211: istore #7
    //   213: aload #5
    //   215: ifnull -> 242
    //   218: iload #4
    //   220: istore #7
    //   222: aload #5
    //   224: astore #9
    //   226: goto -> 173
    //   229: astore_1
    //   230: aload #8
    //   232: ifnull -> 240
    //   235: aload #8
    //   237: invokevirtual recycle : ()V
    //   240: aload_1
    //   241: athrow
    //   242: iload #7
    //   244: ifeq -> 356
    //   247: iload #7
    //   249: iconst_1
    //   250: if_icmpeq -> 256
    //   253: goto -> 387
    //   256: new androidx/appcompat/widget/AppCompatSpinner$e
    //   259: dup
    //   260: aload_0
    //   261: aload_0
    //   262: getfield d : Landroid/content/Context;
    //   265: aload_2
    //   266: iload_3
    //   267: invokespecial <init> : (Landroidx/appcompat/widget/AppCompatSpinner;Landroid/content/Context;Landroid/util/AttributeSet;I)V
    //   270: astore #5
    //   272: aload_0
    //   273: getfield d : Landroid/content/Context;
    //   276: aload_2
    //   277: getstatic b/a/j.Spinner : [I
    //   280: iload_3
    //   281: iconst_0
    //   282: invokestatic v : (Landroid/content/Context;Landroid/util/AttributeSet;[III)Landroidx/appcompat/widget/e0;
    //   285: astore #8
    //   287: aload_0
    //   288: aload #8
    //   290: getstatic b/a/j.Spinner_android_dropDownWidth : I
    //   293: bipush #-2
    //   295: invokevirtual m : (II)I
    //   298: putfield i : I
    //   301: aload #5
    //   303: aload #8
    //   305: getstatic b/a/j.Spinner_android_popupBackground : I
    //   308: invokevirtual g : (I)Landroid/graphics/drawable/Drawable;
    //   311: invokevirtual b : (Landroid/graphics/drawable/Drawable;)V
    //   314: aload #5
    //   316: aload #6
    //   318: getstatic b/a/j.Spinner_android_prompt : I
    //   321: invokevirtual o : (I)Ljava/lang/String;
    //   324: invokevirtual i : (Ljava/lang/CharSequence;)V
    //   327: aload #8
    //   329: invokevirtual w : ()V
    //   332: aload_0
    //   333: aload #5
    //   335: putfield h : Landroidx/appcompat/widget/AppCompatSpinner$f;
    //   338: aload_0
    //   339: new androidx/appcompat/widget/AppCompatSpinner$a
    //   342: dup
    //   343: aload_0
    //   344: aload_0
    //   345: aload #5
    //   347: invokespecial <init> : (Landroidx/appcompat/widget/AppCompatSpinner;Landroid/view/View;Landroidx/appcompat/widget/AppCompatSpinner$e;)V
    //   350: putfield e : Landroidx/appcompat/widget/t;
    //   353: goto -> 387
    //   356: new androidx/appcompat/widget/AppCompatSpinner$c
    //   359: dup
    //   360: aload_0
    //   361: invokespecial <init> : (Landroidx/appcompat/widget/AppCompatSpinner;)V
    //   364: astore #5
    //   366: aload_0
    //   367: aload #5
    //   369: putfield h : Landroidx/appcompat/widget/AppCompatSpinner$f;
    //   372: aload #5
    //   374: aload #6
    //   376: getstatic b/a/j.Spinner_android_prompt : I
    //   379: invokevirtual o : (I)Ljava/lang/String;
    //   382: invokeinterface i : (Ljava/lang/CharSequence;)V
    //   387: aload #6
    //   389: getstatic b/a/j.Spinner_android_entries : I
    //   392: invokevirtual q : (I)[Ljava/lang/CharSequence;
    //   395: astore #5
    //   397: aload #5
    //   399: ifnull -> 427
    //   402: new android/widget/ArrayAdapter
    //   405: dup
    //   406: aload_1
    //   407: ldc 17367048
    //   409: aload #5
    //   411: invokespecial <init> : (Landroid/content/Context;I[Ljava/lang/Object;)V
    //   414: astore_1
    //   415: aload_1
    //   416: getstatic b/a/g.support_simple_spinner_dropdown_item : I
    //   419: invokevirtual setDropDownViewResource : (I)V
    //   422: aload_0
    //   423: aload_1
    //   424: invokevirtual setAdapter : (Landroid/widget/SpinnerAdapter;)V
    //   427: aload #6
    //   429: invokevirtual w : ()V
    //   432: aload_0
    //   433: iconst_1
    //   434: putfield g : Z
    //   437: aload_0
    //   438: getfield f : Landroid/widget/SpinnerAdapter;
    //   441: astore_1
    //   442: aload_1
    //   443: ifnull -> 456
    //   446: aload_0
    //   447: aload_1
    //   448: invokevirtual setAdapter : (Landroid/widget/SpinnerAdapter;)V
    //   451: aload_0
    //   452: aconst_null
    //   453: putfield f : Landroid/widget/SpinnerAdapter;
    //   456: aload_0
    //   457: getfield c : Landroidx/appcompat/widget/d;
    //   460: aload_2
    //   461: iload_3
    //   462: invokevirtual e : (Landroid/util/AttributeSet;I)V
    //   465: return
    // Exception table:
    //   from	to	target	type
    //   123	135	190	java/lang/Exception
    //   123	135	186	finally
    //   147	156	181	java/lang/Exception
    //   147	156	229	finally
    //   160	169	181	java/lang/Exception
    //   160	169	229	finally
    //   199	209	229	finally
  }
  
  int a(SpinnerAdapter paramSpinnerAdapter, Drawable paramDrawable) {
    int i = 0;
    if (paramSpinnerAdapter == null)
      return 0; 
    int j = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
    int k = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
    int m = Math.max(0, getSelectedItemPosition());
    int n = Math.min(paramSpinnerAdapter.getCount(), m + 15);
    int i1 = Math.max(0, m - 15 - n - m);
    View view = null;
    m = 0;
    while (i1 < n) {
      int i2 = paramSpinnerAdapter.getItemViewType(i1);
      int i3 = i;
      if (i2 != i) {
        view = null;
        i3 = i2;
      } 
      view = paramSpinnerAdapter.getView(i1, view, (ViewGroup)this);
      if (view.getLayoutParams() == null)
        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2)); 
      view.measure(j, k);
      m = Math.max(m, view.getMeasuredWidth());
      i1++;
      i = i3;
    } 
    i1 = m;
    if (paramDrawable != null) {
      paramDrawable.getPadding(this.j);
      Rect rect = this.j;
      i1 = m + rect.left + rect.right;
    } 
    return i1;
  }
  
  void b() {
    if (Build.VERSION.SDK_INT >= 17) {
      this.h.l(getTextDirection(), getTextAlignment());
    } else {
      this.h.l(-1, -1);
    } 
  }
  
  protected void drawableStateChanged() {
    super.drawableStateChanged();
    d d1 = this.c;
    if (d1 != null)
      d1.b(); 
  }
  
  public int getDropDownHorizontalOffset() {
    f f1 = this.h;
    return (f1 != null) ? f1.c() : ((Build.VERSION.SDK_INT >= 16) ? super.getDropDownHorizontalOffset() : 0);
  }
  
  public int getDropDownVerticalOffset() {
    f f1 = this.h;
    return (f1 != null) ? f1.m() : ((Build.VERSION.SDK_INT >= 16) ? super.getDropDownVerticalOffset() : 0);
  }
  
  public int getDropDownWidth() {
    return (this.h != null) ? this.i : ((Build.VERSION.SDK_INT >= 16) ? super.getDropDownWidth() : 0);
  }
  
  final f getInternalPopup() {
    return this.h;
  }
  
  public Drawable getPopupBackground() {
    f f1 = this.h;
    return (f1 != null) ? f1.h() : ((Build.VERSION.SDK_INT >= 16) ? super.getPopupBackground() : null);
  }
  
  public Context getPopupContext() {
    return this.d;
  }
  
  public CharSequence getPrompt() {
    CharSequence charSequence;
    f f1 = this.h;
    if (f1 != null) {
      charSequence = f1.f();
    } else {
      charSequence = super.getPrompt();
    } 
    return charSequence;
  }
  
  public ColorStateList getSupportBackgroundTintList() {
    d d1 = this.c;
    if (d1 != null) {
      ColorStateList colorStateList = d1.c();
    } else {
      d1 = null;
    } 
    return (ColorStateList)d1;
  }
  
  public PorterDuff.Mode getSupportBackgroundTintMode() {
    d d1 = this.c;
    if (d1 != null) {
      PorterDuff.Mode mode = d1.d();
    } else {
      d1 = null;
    } 
    return (PorterDuff.Mode)d1;
  }
  
  protected void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    f f1 = this.h;
    if (f1 != null && f1.a())
      this.h.dismiss(); 
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    super.onMeasure(paramInt1, paramInt2);
    if (this.h != null && View.MeasureSpec.getMode(paramInt1) == Integer.MIN_VALUE)
      setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(paramInt1)), getMeasuredHeight()); 
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable) {
    SavedState savedState = (SavedState)paramParcelable;
    super.onRestoreInstanceState(savedState.getSuperState());
    if (savedState.b) {
      ViewTreeObserver viewTreeObserver = getViewTreeObserver();
      if (viewTreeObserver != null)
        viewTreeObserver.addOnGlobalLayoutListener(new b(this)); 
    } 
  }
  
  public Parcelable onSaveInstanceState() {
    boolean bool;
    SavedState savedState = new SavedState(super.onSaveInstanceState());
    f f1 = this.h;
    if (f1 != null && f1.a()) {
      bool = true;
    } else {
      bool = false;
    } 
    savedState.b = bool;
    return (Parcelable)savedState;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) {
    t t1 = this.e;
    return (t1 != null && t1.onTouch((View)this, paramMotionEvent)) ? true : super.onTouchEvent(paramMotionEvent);
  }
  
  public boolean performClick() {
    f f1 = this.h;
    if (f1 != null) {
      if (!f1.a())
        b(); 
      return true;
    } 
    return super.performClick();
  }
  
  public void setAdapter(SpinnerAdapter paramSpinnerAdapter) {
    if (!this.g) {
      this.f = paramSpinnerAdapter;
      return;
    } 
    super.setAdapter(paramSpinnerAdapter);
    if (this.h != null) {
      Context context1 = this.d;
      Context context2 = context1;
      if (context1 == null)
        context2 = getContext(); 
      this.h.n(new d(paramSpinnerAdapter, context2.getTheme()));
    } 
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable) {
    super.setBackgroundDrawable(paramDrawable);
    d d1 = this.c;
    if (d1 != null)
      d1.f(paramDrawable); 
  }
  
  public void setBackgroundResource(int paramInt) {
    super.setBackgroundResource(paramInt);
    d d1 = this.c;
    if (d1 != null)
      d1.g(paramInt); 
  }
  
  public void setDropDownHorizontalOffset(int paramInt) {
    f f1 = this.h;
    if (f1 != null) {
      f1.k(paramInt);
      this.h.e(paramInt);
    } else if (Build.VERSION.SDK_INT >= 16) {
      super.setDropDownHorizontalOffset(paramInt);
    } 
  }
  
  public void setDropDownVerticalOffset(int paramInt) {
    f f1 = this.h;
    if (f1 != null) {
      f1.j(paramInt);
    } else if (Build.VERSION.SDK_INT >= 16) {
      super.setDropDownVerticalOffset(paramInt);
    } 
  }
  
  public void setDropDownWidth(int paramInt) {
    if (this.h != null) {
      this.i = paramInt;
    } else if (Build.VERSION.SDK_INT >= 16) {
      super.setDropDownWidth(paramInt);
    } 
  }
  
  public void setPopupBackgroundDrawable(Drawable paramDrawable) {
    f f1 = this.h;
    if (f1 != null) {
      f1.b(paramDrawable);
    } else if (Build.VERSION.SDK_INT >= 16) {
      super.setPopupBackgroundDrawable(paramDrawable);
    } 
  }
  
  public void setPopupBackgroundResource(int paramInt) {
    setPopupBackgroundDrawable(b.a.k.a.a.d(getPopupContext(), paramInt));
  }
  
  public void setPrompt(CharSequence paramCharSequence) {
    f f1 = this.h;
    if (f1 != null) {
      f1.i(paramCharSequence);
    } else {
      super.setPrompt(paramCharSequence);
    } 
  }
  
  public void setSupportBackgroundTintList(ColorStateList paramColorStateList) {
    d d1 = this.c;
    if (d1 != null)
      d1.i(paramColorStateList); 
  }
  
  public void setSupportBackgroundTintMode(PorterDuff.Mode paramMode) {
    d d1 = this.c;
    if (d1 != null)
      d1.j(paramMode); 
  }
  
  static class SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<SavedState> CREATOR = new a();
    
    boolean b;
    
    SavedState(Parcel param1Parcel) {
      super(param1Parcel);
      boolean bool;
      if (param1Parcel.readByte() != 0) {
        bool = true;
      } else {
        bool = false;
      } 
      this.b = bool;
    }
    
    SavedState(Parcelable param1Parcelable) {
      super(param1Parcelable);
    }
    
    public void writeToParcel(Parcel param1Parcel, int param1Int) {
      super.writeToParcel(param1Parcel, param1Int);
      param1Parcel.writeByte((byte)this.b);
    }
    
    class a implements Parcelable.Creator<SavedState> {
      public AppCompatSpinner.SavedState a(Parcel param2Parcel) {
        return new AppCompatSpinner.SavedState(param2Parcel);
      }
      
      public AppCompatSpinner.SavedState[] b(int param2Int) {
        return new AppCompatSpinner.SavedState[param2Int];
      }
    }
  }
  
  class a implements Parcelable.Creator<SavedState> {
    public AppCompatSpinner.SavedState a(Parcel param1Parcel) {
      return new AppCompatSpinner.SavedState(param1Parcel);
    }
    
    public AppCompatSpinner.SavedState[] b(int param1Int) {
      return new AppCompatSpinner.SavedState[param1Int];
    }
  }
  
  class a extends t {
    a(AppCompatSpinner this$0, View param1View, AppCompatSpinner.e param1e) {
      super(param1View);
    }
    
    public p b() {
      return this.k;
    }
    
    @SuppressLint({"SyntheticAccessor"})
    public boolean c() {
      if (!this.l.getInternalPopup().a())
        this.l.b(); 
      return true;
    }
  }
  
  class b implements ViewTreeObserver.OnGlobalLayoutListener {
    b(AppCompatSpinner this$0) {}
    
    public void onGlobalLayout() {
      if (!this.b.getInternalPopup().a())
        this.b.b(); 
      ViewTreeObserver viewTreeObserver = this.b.getViewTreeObserver();
      if (viewTreeObserver != null)
        if (Build.VERSION.SDK_INT >= 16) {
          viewTreeObserver.removeOnGlobalLayoutListener(this);
        } else {
          viewTreeObserver.removeGlobalOnLayoutListener(this);
        }  
    }
  }
  
  class c implements f, DialogInterface.OnClickListener {
    androidx.appcompat.app.a b;
    
    private ListAdapter c;
    
    private CharSequence d;
    
    c(AppCompatSpinner this$0) {}
    
    public boolean a() {
      boolean bool;
      androidx.appcompat.app.a a1 = this.b;
      if (a1 != null) {
        bool = a1.isShowing();
      } else {
        bool = false;
      } 
      return bool;
    }
    
    public void b(Drawable param1Drawable) {
      Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }
    
    public int c() {
      return 0;
    }
    
    public void dismiss() {
      androidx.appcompat.app.a a1 = this.b;
      if (a1 != null) {
        a1.dismiss();
        this.b = null;
      } 
    }
    
    public void e(int param1Int) {
      Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }
    
    public CharSequence f() {
      return this.d;
    }
    
    public Drawable h() {
      return null;
    }
    
    public void i(CharSequence param1CharSequence) {
      this.d = param1CharSequence;
    }
    
    public void j(int param1Int) {
      Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }
    
    public void k(int param1Int) {
      Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }
    
    public void l(int param1Int1, int param1Int2) {
      if (this.c == null)
        return; 
      androidx.appcompat.app.a.a a2 = new androidx.appcompat.app.a.a(this.e.getPopupContext());
      CharSequence charSequence = this.d;
      if (charSequence != null)
        a2.q(charSequence); 
      androidx.appcompat.app.a a1 = a2.o(this.c, this.e.getSelectedItemPosition(), this).a();
      this.b = a1;
      ListView listView = a1.h();
      if (Build.VERSION.SDK_INT >= 17) {
        listView.setTextDirection(param1Int1);
        listView.setTextAlignment(param1Int2);
      } 
      this.b.show();
    }
    
    public int m() {
      return 0;
    }
    
    public void n(ListAdapter param1ListAdapter) {
      this.c = param1ListAdapter;
    }
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {
      this.e.setSelection(param1Int);
      if (this.e.getOnItemClickListener() != null)
        this.e.performItemClick(null, param1Int, this.c.getItemId(param1Int)); 
      dismiss();
    }
  }
  
  private static class d implements ListAdapter, SpinnerAdapter {
    private SpinnerAdapter b;
    
    private ListAdapter c;
    
    public d(SpinnerAdapter param1SpinnerAdapter, Resources.Theme param1Theme) {
      this.b = param1SpinnerAdapter;
      if (param1SpinnerAdapter instanceof ListAdapter)
        this.c = (ListAdapter)param1SpinnerAdapter; 
      if (param1Theme != null) {
        ThemedSpinnerAdapter themedSpinnerAdapter;
        if (Build.VERSION.SDK_INT >= 23 && param1SpinnerAdapter instanceof ThemedSpinnerAdapter) {
          themedSpinnerAdapter = (ThemedSpinnerAdapter)param1SpinnerAdapter;
          if (themedSpinnerAdapter.getDropDownViewTheme() != param1Theme)
            themedSpinnerAdapter.setDropDownViewTheme(param1Theme); 
        } else if (themedSpinnerAdapter instanceof a0) {
          a0 a0 = (a0)themedSpinnerAdapter;
          if (a0.getDropDownViewTheme() == null)
            a0.setDropDownViewTheme(param1Theme); 
        } 
      } 
    }
    
    public boolean areAllItemsEnabled() {
      ListAdapter listAdapter = this.c;
      return (listAdapter != null) ? listAdapter.areAllItemsEnabled() : true;
    }
    
    public int getCount() {
      int i;
      SpinnerAdapter spinnerAdapter = this.b;
      if (spinnerAdapter == null) {
        i = 0;
      } else {
        i = spinnerAdapter.getCount();
      } 
      return i;
    }
    
    public View getDropDownView(int param1Int, View param1View, ViewGroup param1ViewGroup) {
      SpinnerAdapter spinnerAdapter = this.b;
      if (spinnerAdapter == null) {
        param1View = null;
      } else {
        param1View = spinnerAdapter.getDropDownView(param1Int, param1View, param1ViewGroup);
      } 
      return param1View;
    }
    
    public Object getItem(int param1Int) {
      Object object = this.b;
      if (object == null) {
        object = null;
      } else {
        object = object.getItem(param1Int);
      } 
      return object;
    }
    
    public long getItemId(int param1Int) {
      long l;
      SpinnerAdapter spinnerAdapter = this.b;
      if (spinnerAdapter == null) {
        l = -1L;
      } else {
        l = spinnerAdapter.getItemId(param1Int);
      } 
      return l;
    }
    
    public int getItemViewType(int param1Int) {
      return 0;
    }
    
    public View getView(int param1Int, View param1View, ViewGroup param1ViewGroup) {
      return getDropDownView(param1Int, param1View, param1ViewGroup);
    }
    
    public int getViewTypeCount() {
      return 1;
    }
    
    public boolean hasStableIds() {
      boolean bool;
      SpinnerAdapter spinnerAdapter = this.b;
      if (spinnerAdapter != null && spinnerAdapter.hasStableIds()) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    public boolean isEmpty() {
      boolean bool;
      if (getCount() == 0) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    public boolean isEnabled(int param1Int) {
      ListAdapter listAdapter = this.c;
      return (listAdapter != null) ? listAdapter.isEnabled(param1Int) : true;
    }
    
    public void registerDataSetObserver(DataSetObserver param1DataSetObserver) {
      SpinnerAdapter spinnerAdapter = this.b;
      if (spinnerAdapter != null)
        spinnerAdapter.registerDataSetObserver(param1DataSetObserver); 
    }
    
    public void unregisterDataSetObserver(DataSetObserver param1DataSetObserver) {
      SpinnerAdapter spinnerAdapter = this.b;
      if (spinnerAdapter != null)
        spinnerAdapter.unregisterDataSetObserver(param1DataSetObserver); 
    }
  }
  
  class e extends ListPopupWindow implements f {
    private CharSequence K;
    
    ListAdapter L;
    
    private final Rect M = new Rect();
    
    private int N;
    
    public e(AppCompatSpinner this$0, Context param1Context, AttributeSet param1AttributeSet, int param1Int) {
      super(param1Context, param1AttributeSet, param1Int);
      B((View)this$0);
      H(true);
      M(0);
      J(new a(this, this$0));
    }
    
    void Q() {
      Drawable drawable = h();
      int i = 0;
      if (drawable != null) {
        drawable.getPadding(this.O.j);
        if (k0.b((View)this.O)) {
          i = this.O.j.right;
        } else {
          i = -this.O.j.left;
        } 
      } else {
        Rect rect = this.O.j;
        rect.right = 0;
        rect.left = 0;
      } 
      int j = this.O.getPaddingLeft();
      int k = this.O.getPaddingRight();
      int m = this.O.getWidth();
      AppCompatSpinner appCompatSpinner = this.O;
      int n = appCompatSpinner.i;
      if (n == -2) {
        int i1 = appCompatSpinner.a((SpinnerAdapter)this.L, h());
        n = (this.O.getContext().getResources().getDisplayMetrics()).widthPixels;
        Rect rect = this.O.j;
        int i2 = n - rect.left - rect.right;
        n = i1;
        if (i1 > i2)
          n = i2; 
        D(Math.max(n, m - j - k));
      } else if (n == -1) {
        D(m - j - k);
      } else {
        D(n);
      } 
      if (k0.b((View)this.O)) {
        i += m - k - x() - R();
      } else {
        i += j + R();
      } 
      e(i);
    }
    
    public int R() {
      return this.N;
    }
    
    boolean S(View param1View) {
      boolean bool;
      if (w.U(param1View) && param1View.getGlobalVisibleRect(this.M)) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    public CharSequence f() {
      return this.K;
    }
    
    public void i(CharSequence param1CharSequence) {
      this.K = param1CharSequence;
    }
    
    public void k(int param1Int) {
      this.N = param1Int;
    }
    
    public void l(int param1Int1, int param1Int2) {
      boolean bool = a();
      Q();
      G(2);
      T0();
      ListView listView = U0();
      listView.setChoiceMode(1);
      if (Build.VERSION.SDK_INT >= 17) {
        listView.setTextDirection(param1Int1);
        listView.setTextAlignment(param1Int2);
      } 
      N(this.O.getSelectedItemPosition());
      if (bool)
        return; 
      ViewTreeObserver viewTreeObserver = this.O.getViewTreeObserver();
      if (viewTreeObserver != null) {
        b b = new b(this);
        viewTreeObserver.addOnGlobalLayoutListener(b);
        I(new c(this, b));
      } 
    }
    
    public void n(ListAdapter param1ListAdapter) {
      super.n(param1ListAdapter);
      this.L = param1ListAdapter;
    }
    
    class a implements AdapterView.OnItemClickListener {
      a(AppCompatSpinner.e this$0, AppCompatSpinner param2AppCompatSpinner) {}
      
      public void onItemClick(AdapterView<?> param2AdapterView, View param2View, int param2Int, long param2Long) {
        this.c.O.setSelection(param2Int);
        if (this.c.O.getOnItemClickListener() != null) {
          AppCompatSpinner.e e1 = this.c;
          e1.O.performItemClick(param2View, param2Int, e1.L.getItemId(param2Int));
        } 
        this.c.dismiss();
      }
    }
    
    class b implements ViewTreeObserver.OnGlobalLayoutListener {
      b(AppCompatSpinner.e this$0) {}
      
      public void onGlobalLayout() {
        AppCompatSpinner.e e1 = this.b;
        if (!e1.S((View)e1.O)) {
          this.b.dismiss();
        } else {
          this.b.Q();
          AppCompatSpinner.e.P(this.b);
        } 
      }
    }
    
    class c implements PopupWindow.OnDismissListener {
      c(AppCompatSpinner.e this$0, ViewTreeObserver.OnGlobalLayoutListener param2OnGlobalLayoutListener) {}
      
      public void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.c.O.getViewTreeObserver();
        if (viewTreeObserver != null)
          viewTreeObserver.removeGlobalOnLayoutListener(this.b); 
      }
    }
  }
  
  class a implements AdapterView.OnItemClickListener {
    a(AppCompatSpinner this$0, AppCompatSpinner param1AppCompatSpinner) {}
    
    public void onItemClick(AdapterView<?> param1AdapterView, View param1View, int param1Int, long param1Long) {
      this.c.O.setSelection(param1Int);
      if (this.c.O.getOnItemClickListener() != null) {
        AppCompatSpinner.e e1 = this.c;
        e1.O.performItemClick(param1View, param1Int, e1.L.getItemId(param1Int));
      } 
      this.c.dismiss();
    }
  }
  
  class b implements ViewTreeObserver.OnGlobalLayoutListener {
    b(AppCompatSpinner this$0) {}
    
    public void onGlobalLayout() {
      AppCompatSpinner.e e1 = this.b;
      if (!e1.S((View)e1.O)) {
        this.b.dismiss();
      } else {
        this.b.Q();
        AppCompatSpinner.e.P(this.b);
      } 
    }
  }
  
  class c implements PopupWindow.OnDismissListener {
    c(AppCompatSpinner this$0, ViewTreeObserver.OnGlobalLayoutListener param1OnGlobalLayoutListener) {}
    
    public void onDismiss() {
      ViewTreeObserver viewTreeObserver = this.c.O.getViewTreeObserver();
      if (viewTreeObserver != null)
        viewTreeObserver.removeGlobalOnLayoutListener(this.b); 
    }
  }
  
  static interface f {
    boolean a();
    
    void b(Drawable param1Drawable);
    
    int c();
    
    void dismiss();
    
    void e(int param1Int);
    
    CharSequence f();
    
    Drawable h();
    
    void i(CharSequence param1CharSequence);
    
    void j(int param1Int);
    
    void k(int param1Int);
    
    void l(int param1Int1, int param1Int2);
    
    int m();
    
    void n(ListAdapter param1ListAdapter);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/widget/AppCompatSpinner.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */