package androidx.appcompat.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.AppCompatToggleButton;
import b.a.j;
import b.a.o.d;
import b.e.g;
import b.h.k.w;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class e {
  private static final Class<?>[] a = new Class[] { Context.class, AttributeSet.class };
  
  private static final int[] b = new int[] { 16843375 };
  
  private static final String[] c = new String[] { "android.widget.", "android.view.", "android.webkit." };
  
  private static final g<String, Constructor<? extends View>> d = new g();
  
  private final Object[] e = new Object[2];
  
  private void a(View paramView, AttributeSet paramAttributeSet) {
    Context context = paramView.getContext();
    if (context instanceof ContextWrapper && (Build.VERSION.SDK_INT < 15 || w.Q(paramView))) {
      TypedArray typedArray = context.obtainStyledAttributes(paramAttributeSet, b);
      String str = typedArray.getString(0);
      if (str != null)
        paramView.setOnClickListener(new a(paramView, str)); 
      typedArray.recycle();
    } 
  }
  
  private View r(Context paramContext, String paramString1, String paramString2) {
    g<String, Constructor<? extends View>> g1 = d;
    Constructor constructor = (Constructor)g1.get(paramString1);
    Constructor<View> constructor1 = constructor;
    if (constructor == null) {
      if (paramString2 != null)
        try {
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append(paramString2);
          stringBuilder.append(paramString1);
          paramString2 = stringBuilder.toString();
          constructor1 = Class.forName(paramString2, false, paramContext.getClassLoader()).<View>asSubclass(View.class).getConstructor(a);
          g1.put(paramString1, constructor1);
          constructor1.setAccessible(true);
          return constructor1.newInstance(this.e);
        } catch (Exception exception) {
          return null;
        }  
      paramString2 = paramString1;
    } else {
      constructor1.setAccessible(true);
      return constructor1.newInstance(this.e);
    } 
    constructor1 = Class.forName(paramString2, false, paramContext.getClassLoader()).<View>asSubclass(View.class).getConstructor(a);
    g1.put(paramString1, constructor1);
    constructor1.setAccessible(true);
    return constructor1.newInstance(this.e);
  }
  
  private View s(Context paramContext, String paramString, AttributeSet paramAttributeSet) {
    String str = paramString;
    if (paramString.equals("view"))
      str = paramAttributeSet.getAttributeValue(null, "class"); 
    try {
      Object[] arrayOfObject1;
      Object[] arrayOfObject2 = this.e;
      arrayOfObject2[0] = paramContext;
      arrayOfObject2[1] = paramAttributeSet;
      if (-1 == str.indexOf('.')) {
        byte b = 0;
        while (true) {
          String[] arrayOfString = c;
          if (b < arrayOfString.length) {
            View view = r(paramContext, str, arrayOfString[b]);
            if (view != null)
              return view; 
            b++;
            continue;
          } 
          return null;
        } 
      } 
      return r((Context)arrayOfObject1, str, null);
    } catch (Exception exception) {
      return null;
    } finally {
      Object[] arrayOfObject = this.e;
      arrayOfObject[0] = null;
      arrayOfObject[1] = null;
    } 
  }
  
  private static Context t(Context paramContext, AttributeSet paramAttributeSet, boolean paramBoolean1, boolean paramBoolean2) {
    int i;
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, j.View, 0, 0);
    if (paramBoolean1) {
      i = typedArray.getResourceId(j.View_android_theme, 0);
    } else {
      i = 0;
    } 
    int j = i;
    if (paramBoolean2) {
      j = i;
      if (!i) {
        i = typedArray.getResourceId(j.View_theme, 0);
        j = i;
        if (i != 0) {
          Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
          j = i;
        } 
      } 
    } 
    typedArray.recycle();
    Context context = paramContext;
    if (j != 0) {
      if (paramContext instanceof d) {
        context = paramContext;
        return (Context)((((d)paramContext).c() != j) ? new d(paramContext, j) : context);
      } 
    } else {
      return context;
    } 
    return (Context)new d(paramContext, j);
  }
  
  private void u(View paramView, String paramString) {
    if (paramView != null)
      return; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(getClass().getName());
    stringBuilder.append(" asked to inflate view for <");
    stringBuilder.append(paramString);
    stringBuilder.append(">, but returned null");
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  protected AppCompatAutoCompleteTextView b(Context paramContext, AttributeSet paramAttributeSet) {
    return new AppCompatAutoCompleteTextView(paramContext, paramAttributeSet);
  }
  
  protected AppCompatButton c(Context paramContext, AttributeSet paramAttributeSet) {
    return new AppCompatButton(paramContext, paramAttributeSet);
  }
  
  protected AppCompatCheckBox d(Context paramContext, AttributeSet paramAttributeSet) {
    return new AppCompatCheckBox(paramContext, paramAttributeSet);
  }
  
  protected AppCompatCheckedTextView e(Context paramContext, AttributeSet paramAttributeSet) {
    return new AppCompatCheckedTextView(paramContext, paramAttributeSet);
  }
  
  protected AppCompatEditText f(Context paramContext, AttributeSet paramAttributeSet) {
    return new AppCompatEditText(paramContext, paramAttributeSet);
  }
  
  protected AppCompatImageButton g(Context paramContext, AttributeSet paramAttributeSet) {
    return new AppCompatImageButton(paramContext, paramAttributeSet);
  }
  
  protected AppCompatImageView h(Context paramContext, AttributeSet paramAttributeSet) {
    return new AppCompatImageView(paramContext, paramAttributeSet);
  }
  
  protected AppCompatMultiAutoCompleteTextView i(Context paramContext, AttributeSet paramAttributeSet) {
    return new AppCompatMultiAutoCompleteTextView(paramContext, paramAttributeSet);
  }
  
  protected AppCompatRadioButton j(Context paramContext, AttributeSet paramAttributeSet) {
    return new AppCompatRadioButton(paramContext, paramAttributeSet);
  }
  
  protected AppCompatRatingBar k(Context paramContext, AttributeSet paramAttributeSet) {
    return new AppCompatRatingBar(paramContext, paramAttributeSet);
  }
  
  protected AppCompatSeekBar l(Context paramContext, AttributeSet paramAttributeSet) {
    return new AppCompatSeekBar(paramContext, paramAttributeSet);
  }
  
  protected AppCompatSpinner m(Context paramContext, AttributeSet paramAttributeSet) {
    return new AppCompatSpinner(paramContext, paramAttributeSet);
  }
  
  protected AppCompatTextView n(Context paramContext, AttributeSet paramAttributeSet) {
    return new AppCompatTextView(paramContext, paramAttributeSet);
  }
  
  protected AppCompatToggleButton o(Context paramContext, AttributeSet paramAttributeSet) {
    return new AppCompatToggleButton(paramContext, paramAttributeSet);
  }
  
  protected View p(Context paramContext, String paramString, AttributeSet paramAttributeSet) {
    return null;
  }
  
  final View q(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4) {
    // Byte code:
    //   0: iload #5
    //   2: ifeq -> 18
    //   5: aload_1
    //   6: ifnull -> 18
    //   9: aload_1
    //   10: invokevirtual getContext : ()Landroid/content/Context;
    //   13: astore #9
    //   15: goto -> 21
    //   18: aload_3
    //   19: astore #9
    //   21: iload #6
    //   23: ifne -> 34
    //   26: aload #9
    //   28: astore_1
    //   29: iload #7
    //   31: ifeq -> 46
    //   34: aload #9
    //   36: aload #4
    //   38: iload #6
    //   40: iload #7
    //   42: invokestatic t : (Landroid/content/Context;Landroid/util/AttributeSet;ZZ)Landroid/content/Context;
    //   45: astore_1
    //   46: aload_1
    //   47: astore #9
    //   49: iload #8
    //   51: ifeq -> 60
    //   54: aload_1
    //   55: invokestatic b : (Landroid/content/Context;)Landroid/content/Context;
    //   58: astore #9
    //   60: aload_2
    //   61: invokevirtual hashCode : ()I
    //   64: pop
    //   65: iconst_m1
    //   66: istore #10
    //   68: aload_2
    //   69: invokevirtual hashCode : ()I
    //   72: lookupswitch default -> 196, -1946472170 -> 454, -1455429095 -> 435, -1346021293 -> 416, -938935918 -> 397, -937446323 -> 378, -658531749 -> 359, -339785223 -> 339, 776382189 -> 319, 799298502 -> 299, 1125864064 -> 279, 1413872058 -> 259, 1601505219 -> 239, 1666676343 -> 219, 2001146706 -> 199
    //   196: goto -> 470
    //   199: aload_2
    //   200: ldc_w 'Button'
    //   203: invokevirtual equals : (Ljava/lang/Object;)Z
    //   206: ifne -> 212
    //   209: goto -> 470
    //   212: bipush #13
    //   214: istore #10
    //   216: goto -> 470
    //   219: aload_2
    //   220: ldc_w 'EditText'
    //   223: invokevirtual equals : (Ljava/lang/Object;)Z
    //   226: ifne -> 232
    //   229: goto -> 470
    //   232: bipush #12
    //   234: istore #10
    //   236: goto -> 470
    //   239: aload_2
    //   240: ldc_w 'CheckBox'
    //   243: invokevirtual equals : (Ljava/lang/Object;)Z
    //   246: ifne -> 252
    //   249: goto -> 470
    //   252: bipush #11
    //   254: istore #10
    //   256: goto -> 470
    //   259: aload_2
    //   260: ldc_w 'AutoCompleteTextView'
    //   263: invokevirtual equals : (Ljava/lang/Object;)Z
    //   266: ifne -> 272
    //   269: goto -> 470
    //   272: bipush #10
    //   274: istore #10
    //   276: goto -> 470
    //   279: aload_2
    //   280: ldc_w 'ImageView'
    //   283: invokevirtual equals : (Ljava/lang/Object;)Z
    //   286: ifne -> 292
    //   289: goto -> 470
    //   292: bipush #9
    //   294: istore #10
    //   296: goto -> 470
    //   299: aload_2
    //   300: ldc_w 'ToggleButton'
    //   303: invokevirtual equals : (Ljava/lang/Object;)Z
    //   306: ifne -> 312
    //   309: goto -> 470
    //   312: bipush #8
    //   314: istore #10
    //   316: goto -> 470
    //   319: aload_2
    //   320: ldc_w 'RadioButton'
    //   323: invokevirtual equals : (Ljava/lang/Object;)Z
    //   326: ifne -> 332
    //   329: goto -> 470
    //   332: bipush #7
    //   334: istore #10
    //   336: goto -> 470
    //   339: aload_2
    //   340: ldc_w 'Spinner'
    //   343: invokevirtual equals : (Ljava/lang/Object;)Z
    //   346: ifne -> 352
    //   349: goto -> 470
    //   352: bipush #6
    //   354: istore #10
    //   356: goto -> 470
    //   359: aload_2
    //   360: ldc_w 'SeekBar'
    //   363: invokevirtual equals : (Ljava/lang/Object;)Z
    //   366: ifne -> 372
    //   369: goto -> 470
    //   372: iconst_5
    //   373: istore #10
    //   375: goto -> 470
    //   378: aload_2
    //   379: ldc_w 'ImageButton'
    //   382: invokevirtual equals : (Ljava/lang/Object;)Z
    //   385: ifne -> 391
    //   388: goto -> 470
    //   391: iconst_4
    //   392: istore #10
    //   394: goto -> 470
    //   397: aload_2
    //   398: ldc_w 'TextView'
    //   401: invokevirtual equals : (Ljava/lang/Object;)Z
    //   404: ifne -> 410
    //   407: goto -> 470
    //   410: iconst_3
    //   411: istore #10
    //   413: goto -> 470
    //   416: aload_2
    //   417: ldc_w 'MultiAutoCompleteTextView'
    //   420: invokevirtual equals : (Ljava/lang/Object;)Z
    //   423: ifne -> 429
    //   426: goto -> 470
    //   429: iconst_2
    //   430: istore #10
    //   432: goto -> 470
    //   435: aload_2
    //   436: ldc_w 'CheckedTextView'
    //   439: invokevirtual equals : (Ljava/lang/Object;)Z
    //   442: ifne -> 448
    //   445: goto -> 470
    //   448: iconst_1
    //   449: istore #10
    //   451: goto -> 470
    //   454: aload_2
    //   455: ldc_w 'RatingBar'
    //   458: invokevirtual equals : (Ljava/lang/Object;)Z
    //   461: ifne -> 467
    //   464: goto -> 470
    //   467: iconst_0
    //   468: istore #10
    //   470: iload #10
    //   472: tableswitch default -> 544, 0 -> 791, 1 -> 773, 2 -> 755, 3 -> 737, 4 -> 719, 5 -> 701, 6 -> 683, 7 -> 665, 8 -> 647, 9 -> 629, 10 -> 611, 11 -> 593, 12 -> 575, 13 -> 557
    //   544: aload_0
    //   545: aload #9
    //   547: aload_2
    //   548: aload #4
    //   550: invokevirtual p : (Landroid/content/Context;Ljava/lang/String;Landroid/util/AttributeSet;)Landroid/view/View;
    //   553: astore_1
    //   554: goto -> 806
    //   557: aload_0
    //   558: aload #9
    //   560: aload #4
    //   562: invokevirtual c : (Landroid/content/Context;Landroid/util/AttributeSet;)Landroidx/appcompat/widget/AppCompatButton;
    //   565: astore_1
    //   566: aload_0
    //   567: aload_1
    //   568: aload_2
    //   569: invokespecial u : (Landroid/view/View;Ljava/lang/String;)V
    //   572: goto -> 806
    //   575: aload_0
    //   576: aload #9
    //   578: aload #4
    //   580: invokevirtual f : (Landroid/content/Context;Landroid/util/AttributeSet;)Landroidx/appcompat/widget/AppCompatEditText;
    //   583: astore_1
    //   584: aload_0
    //   585: aload_1
    //   586: aload_2
    //   587: invokespecial u : (Landroid/view/View;Ljava/lang/String;)V
    //   590: goto -> 806
    //   593: aload_0
    //   594: aload #9
    //   596: aload #4
    //   598: invokevirtual d : (Landroid/content/Context;Landroid/util/AttributeSet;)Landroidx/appcompat/widget/AppCompatCheckBox;
    //   601: astore_1
    //   602: aload_0
    //   603: aload_1
    //   604: aload_2
    //   605: invokespecial u : (Landroid/view/View;Ljava/lang/String;)V
    //   608: goto -> 806
    //   611: aload_0
    //   612: aload #9
    //   614: aload #4
    //   616: invokevirtual b : (Landroid/content/Context;Landroid/util/AttributeSet;)Landroidx/appcompat/widget/AppCompatAutoCompleteTextView;
    //   619: astore_1
    //   620: aload_0
    //   621: aload_1
    //   622: aload_2
    //   623: invokespecial u : (Landroid/view/View;Ljava/lang/String;)V
    //   626: goto -> 806
    //   629: aload_0
    //   630: aload #9
    //   632: aload #4
    //   634: invokevirtual h : (Landroid/content/Context;Landroid/util/AttributeSet;)Landroidx/appcompat/widget/AppCompatImageView;
    //   637: astore_1
    //   638: aload_0
    //   639: aload_1
    //   640: aload_2
    //   641: invokespecial u : (Landroid/view/View;Ljava/lang/String;)V
    //   644: goto -> 806
    //   647: aload_0
    //   648: aload #9
    //   650: aload #4
    //   652: invokevirtual o : (Landroid/content/Context;Landroid/util/AttributeSet;)Landroidx/appcompat/widget/AppCompatToggleButton;
    //   655: astore_1
    //   656: aload_0
    //   657: aload_1
    //   658: aload_2
    //   659: invokespecial u : (Landroid/view/View;Ljava/lang/String;)V
    //   662: goto -> 806
    //   665: aload_0
    //   666: aload #9
    //   668: aload #4
    //   670: invokevirtual j : (Landroid/content/Context;Landroid/util/AttributeSet;)Landroidx/appcompat/widget/AppCompatRadioButton;
    //   673: astore_1
    //   674: aload_0
    //   675: aload_1
    //   676: aload_2
    //   677: invokespecial u : (Landroid/view/View;Ljava/lang/String;)V
    //   680: goto -> 806
    //   683: aload_0
    //   684: aload #9
    //   686: aload #4
    //   688: invokevirtual m : (Landroid/content/Context;Landroid/util/AttributeSet;)Landroidx/appcompat/widget/AppCompatSpinner;
    //   691: astore_1
    //   692: aload_0
    //   693: aload_1
    //   694: aload_2
    //   695: invokespecial u : (Landroid/view/View;Ljava/lang/String;)V
    //   698: goto -> 806
    //   701: aload_0
    //   702: aload #9
    //   704: aload #4
    //   706: invokevirtual l : (Landroid/content/Context;Landroid/util/AttributeSet;)Landroidx/appcompat/widget/AppCompatSeekBar;
    //   709: astore_1
    //   710: aload_0
    //   711: aload_1
    //   712: aload_2
    //   713: invokespecial u : (Landroid/view/View;Ljava/lang/String;)V
    //   716: goto -> 806
    //   719: aload_0
    //   720: aload #9
    //   722: aload #4
    //   724: invokevirtual g : (Landroid/content/Context;Landroid/util/AttributeSet;)Landroidx/appcompat/widget/AppCompatImageButton;
    //   727: astore_1
    //   728: aload_0
    //   729: aload_1
    //   730: aload_2
    //   731: invokespecial u : (Landroid/view/View;Ljava/lang/String;)V
    //   734: goto -> 806
    //   737: aload_0
    //   738: aload #9
    //   740: aload #4
    //   742: invokevirtual n : (Landroid/content/Context;Landroid/util/AttributeSet;)Landroidx/appcompat/widget/AppCompatTextView;
    //   745: astore_1
    //   746: aload_0
    //   747: aload_1
    //   748: aload_2
    //   749: invokespecial u : (Landroid/view/View;Ljava/lang/String;)V
    //   752: goto -> 806
    //   755: aload_0
    //   756: aload #9
    //   758: aload #4
    //   760: invokevirtual i : (Landroid/content/Context;Landroid/util/AttributeSet;)Landroidx/appcompat/widget/AppCompatMultiAutoCompleteTextView;
    //   763: astore_1
    //   764: aload_0
    //   765: aload_1
    //   766: aload_2
    //   767: invokespecial u : (Landroid/view/View;Ljava/lang/String;)V
    //   770: goto -> 806
    //   773: aload_0
    //   774: aload #9
    //   776: aload #4
    //   778: invokevirtual e : (Landroid/content/Context;Landroid/util/AttributeSet;)Landroidx/appcompat/widget/AppCompatCheckedTextView;
    //   781: astore_1
    //   782: aload_0
    //   783: aload_1
    //   784: aload_2
    //   785: invokespecial u : (Landroid/view/View;Ljava/lang/String;)V
    //   788: goto -> 806
    //   791: aload_0
    //   792: aload #9
    //   794: aload #4
    //   796: invokevirtual k : (Landroid/content/Context;Landroid/util/AttributeSet;)Landroidx/appcompat/widget/AppCompatRatingBar;
    //   799: astore_1
    //   800: aload_0
    //   801: aload_1
    //   802: aload_2
    //   803: invokespecial u : (Landroid/view/View;Ljava/lang/String;)V
    //   806: aload_1
    //   807: astore #11
    //   809: aload_1
    //   810: ifnonnull -> 833
    //   813: aload_1
    //   814: astore #11
    //   816: aload_3
    //   817: aload #9
    //   819: if_acmpeq -> 833
    //   822: aload_0
    //   823: aload #9
    //   825: aload_2
    //   826: aload #4
    //   828: invokespecial s : (Landroid/content/Context;Ljava/lang/String;Landroid/util/AttributeSet;)Landroid/view/View;
    //   831: astore #11
    //   833: aload #11
    //   835: ifnull -> 846
    //   838: aload_0
    //   839: aload #11
    //   841: aload #4
    //   843: invokespecial a : (Landroid/view/View;Landroid/util/AttributeSet;)V
    //   846: aload #11
    //   848: areturn
  }
  
  private static class a implements View.OnClickListener {
    private final View b;
    
    private final String c;
    
    private Method d;
    
    private Context e;
    
    public a(View param1View, String param1String) {
      this.b = param1View;
      this.c = param1String;
    }
    
    private void a(Context param1Context) {
      String str;
      while (param1Context != null) {
        try {
          if (!param1Context.isRestricted()) {
            Method method = param1Context.getClass().getMethod(this.c, new Class[] { View.class });
            if (method != null) {
              this.d = method;
              this.e = param1Context;
              return;
            } 
          } 
        } catch (NoSuchMethodException noSuchMethodException) {}
        if (param1Context instanceof ContextWrapper) {
          param1Context = ((ContextWrapper)param1Context).getBaseContext();
          continue;
        } 
        param1Context = null;
      } 
      int i = this.b.getId();
      if (i == -1) {
        str = "";
      } else {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(" with id '");
        stringBuilder1.append(this.b.getContext().getResources().getResourceEntryName(i));
        stringBuilder1.append("'");
        str = stringBuilder1.toString();
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Could not find method ");
      stringBuilder.append(this.c);
      stringBuilder.append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
      stringBuilder.append(this.b.getClass());
      stringBuilder.append(str);
      IllegalStateException illegalStateException = new IllegalStateException(stringBuilder.toString());
      throw illegalStateException;
    }
    
    public void onClick(View param1View) {
      if (this.d == null)
        a(this.b.getContext()); 
      try {
        this.d.invoke(this.e, new Object[] { param1View });
        return;
      } catch (IllegalAccessException illegalAccessException) {
        throw new IllegalStateException("Could not execute non-public method for android:onClick", illegalAccessException);
      } catch (InvocationTargetException invocationTargetException) {
        throw new IllegalStateException("Could not execute method for android:onClick", invocationTargetException);
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/app/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */