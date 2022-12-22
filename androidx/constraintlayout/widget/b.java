package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.h;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class b {
  private static final int[] a = new int[] { 0, 4, 8 };
  
  private static SparseIntArray b;
  
  private boolean c;
  
  private HashMap<String, ConstraintAttribute> d = new HashMap<String, ConstraintAttribute>();
  
  private boolean e = true;
  
  private HashMap<Integer, a> f = new HashMap<Integer, a>();
  
  static {
    SparseIntArray sparseIntArray = new SparseIntArray();
    b = sparseIntArray;
    sparseIntArray.append(e.Constraint_layout_constraintLeft_toLeftOf, 25);
    b.append(e.Constraint_layout_constraintLeft_toRightOf, 26);
    b.append(e.Constraint_layout_constraintRight_toLeftOf, 29);
    b.append(e.Constraint_layout_constraintRight_toRightOf, 30);
    b.append(e.Constraint_layout_constraintTop_toTopOf, 36);
    b.append(e.Constraint_layout_constraintTop_toBottomOf, 35);
    b.append(e.Constraint_layout_constraintBottom_toTopOf, 4);
    b.append(e.Constraint_layout_constraintBottom_toBottomOf, 3);
    b.append(e.Constraint_layout_constraintBaseline_toBaselineOf, 1);
    b.append(e.Constraint_layout_editor_absoluteX, 6);
    b.append(e.Constraint_layout_editor_absoluteY, 7);
    b.append(e.Constraint_layout_constraintGuide_begin, 17);
    b.append(e.Constraint_layout_constraintGuide_end, 18);
    b.append(e.Constraint_layout_constraintGuide_percent, 19);
    b.append(e.Constraint_android_orientation, 27);
    b.append(e.Constraint_layout_constraintStart_toEndOf, 32);
    b.append(e.Constraint_layout_constraintStart_toStartOf, 33);
    b.append(e.Constraint_layout_constraintEnd_toStartOf, 10);
    b.append(e.Constraint_layout_constraintEnd_toEndOf, 9);
    b.append(e.Constraint_layout_goneMarginLeft, 13);
    b.append(e.Constraint_layout_goneMarginTop, 16);
    b.append(e.Constraint_layout_goneMarginRight, 14);
    b.append(e.Constraint_layout_goneMarginBottom, 11);
    b.append(e.Constraint_layout_goneMarginStart, 15);
    b.append(e.Constraint_layout_goneMarginEnd, 12);
    b.append(e.Constraint_layout_constraintVertical_weight, 40);
    b.append(e.Constraint_layout_constraintHorizontal_weight, 39);
    b.append(e.Constraint_layout_constraintHorizontal_chainStyle, 41);
    b.append(e.Constraint_layout_constraintVertical_chainStyle, 42);
    b.append(e.Constraint_layout_constraintHorizontal_bias, 20);
    b.append(e.Constraint_layout_constraintVertical_bias, 37);
    b.append(e.Constraint_layout_constraintDimensionRatio, 5);
    b.append(e.Constraint_layout_constraintLeft_creator, 82);
    b.append(e.Constraint_layout_constraintTop_creator, 82);
    b.append(e.Constraint_layout_constraintRight_creator, 82);
    b.append(e.Constraint_layout_constraintBottom_creator, 82);
    b.append(e.Constraint_layout_constraintBaseline_creator, 82);
    b.append(e.Constraint_android_layout_marginLeft, 24);
    b.append(e.Constraint_android_layout_marginRight, 28);
    b.append(e.Constraint_android_layout_marginStart, 31);
    b.append(e.Constraint_android_layout_marginEnd, 8);
    b.append(e.Constraint_android_layout_marginTop, 34);
    b.append(e.Constraint_android_layout_marginBottom, 2);
    b.append(e.Constraint_android_layout_width, 23);
    b.append(e.Constraint_android_layout_height, 21);
    b.append(e.Constraint_android_visibility, 22);
    b.append(e.Constraint_android_alpha, 43);
    b.append(e.Constraint_android_elevation, 44);
    b.append(e.Constraint_android_rotationX, 45);
    b.append(e.Constraint_android_rotationY, 46);
    b.append(e.Constraint_android_rotation, 60);
    b.append(e.Constraint_android_scaleX, 47);
    b.append(e.Constraint_android_scaleY, 48);
    b.append(e.Constraint_android_transformPivotX, 49);
    b.append(e.Constraint_android_transformPivotY, 50);
    b.append(e.Constraint_android_translationX, 51);
    b.append(e.Constraint_android_translationY, 52);
    b.append(e.Constraint_android_translationZ, 53);
    b.append(e.Constraint_layout_constraintWidth_default, 54);
    b.append(e.Constraint_layout_constraintHeight_default, 55);
    b.append(e.Constraint_layout_constraintWidth_max, 56);
    b.append(e.Constraint_layout_constraintHeight_max, 57);
    b.append(e.Constraint_layout_constraintWidth_min, 58);
    b.append(e.Constraint_layout_constraintHeight_min, 59);
    b.append(e.Constraint_layout_constraintCircle, 61);
    b.append(e.Constraint_layout_constraintCircleRadius, 62);
    b.append(e.Constraint_layout_constraintCircleAngle, 63);
    b.append(e.Constraint_animate_relativeTo, 64);
    b.append(e.Constraint_transitionEasing, 65);
    b.append(e.Constraint_drawPath, 66);
    b.append(e.Constraint_transitionPathRotate, 67);
    b.append(e.Constraint_motionStagger, 79);
    b.append(e.Constraint_android_id, 38);
    b.append(e.Constraint_motionProgress, 68);
    b.append(e.Constraint_layout_constraintWidth_percent, 69);
    b.append(e.Constraint_layout_constraintHeight_percent, 70);
    b.append(e.Constraint_chainUseRtl, 71);
    b.append(e.Constraint_barrierDirection, 72);
    b.append(e.Constraint_barrierMargin, 73);
    b.append(e.Constraint_constraint_referenced_ids, 74);
    b.append(e.Constraint_barrierAllowsGoneWidgets, 75);
    b.append(e.Constraint_pathMotionArc, 76);
    b.append(e.Constraint_layout_constraintTag, 77);
    b.append(e.Constraint_visibilityMode, 78);
    b.append(e.Constraint_layout_constrainedWidth, 80);
    b.append(e.Constraint_layout_constrainedHeight, 81);
  }
  
  private int[] m(View paramView, String paramString) {
    String[] arrayOfString = paramString.split(",");
    Context context = paramView.getContext();
    int[] arrayOfInt2 = new int[arrayOfString.length];
    byte b1 = 0;
    byte b2;
    for (b2 = 0; b1 < arrayOfString.length; b2++) {
      String str = arrayOfString[b1].trim();
      try {
        i = d.class.getField(str).getInt(null);
      } catch (Exception exception) {
        i = 0;
      } 
      int j = i;
      if (!i)
        j = context.getResources().getIdentifier(str, "id", context.getPackageName()); 
      int i = j;
      if (j == 0) {
        i = j;
        if (paramView.isInEditMode()) {
          i = j;
          if (paramView.getParent() instanceof ConstraintLayout) {
            Object object = ((ConstraintLayout)paramView.getParent()).g(0, str);
            i = j;
            if (object != null) {
              i = j;
              if (object instanceof Integer)
                i = ((Integer)object).intValue(); 
            } 
          } 
        } 
      } 
      arrayOfInt2[b2] = i;
      b1++;
    } 
    int[] arrayOfInt1 = arrayOfInt2;
    if (b2 != arrayOfString.length)
      arrayOfInt1 = Arrays.copyOf(arrayOfInt2, b2); 
    return arrayOfInt1;
  }
  
  private a n(Context paramContext, AttributeSet paramAttributeSet) {
    a a = new a();
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, e.Constraint);
    z(paramContext, a, typedArray);
    typedArray.recycle();
    return a;
  }
  
  private a o(int paramInt) {
    if (!this.f.containsKey(Integer.valueOf(paramInt)))
      this.f.put(Integer.valueOf(paramInt), new a()); 
    return this.f.get(Integer.valueOf(paramInt));
  }
  
  private static int y(TypedArray paramTypedArray, int paramInt1, int paramInt2) {
    int i = paramTypedArray.getResourceId(paramInt1, paramInt2);
    paramInt2 = i;
    if (i == -1)
      paramInt2 = paramTypedArray.getInt(paramInt1, -1); 
    return paramInt2;
  }
  
  private void z(Context paramContext, a parama, TypedArray paramTypedArray) {
    int i = paramTypedArray.getIndexCount();
    for (byte b1 = 0; b1 < i; b1++) {
      StringBuilder stringBuilder;
      b b7;
      c c3;
      d d4;
      c c2;
      b b6;
      d d3;
      c c1;
      b b5;
      e e2;
      b b4;
      e e1;
      d d2;
      b b3;
      d d1;
      b b2;
      int j = paramTypedArray.getIndex(b1);
      if (j != e.Constraint_android_id && e.Constraint_android_layout_marginStart != j && e.Constraint_android_layout_marginEnd != j) {
        parama.c.b = true;
        parama.d.c = true;
        parama.b.a = true;
        parama.e.b = true;
      } 
      switch (b.get(j)) {
        default:
          stringBuilder = new StringBuilder();
          stringBuilder.append("Unknown attribute 0x");
          stringBuilder.append(Integer.toHexString(j));
          stringBuilder.append("   ");
          stringBuilder.append(b.get(j));
          Log.w("ConstraintSet", stringBuilder.toString());
          break;
        case 82:
          stringBuilder = new StringBuilder();
          stringBuilder.append("unused attribute 0x");
          stringBuilder.append(Integer.toHexString(j));
          stringBuilder.append("   ");
          stringBuilder.append(b.get(j));
          Log.w("ConstraintSet", stringBuilder.toString());
          break;
        case 81:
          b7 = parama.d;
          b7.j0 = paramTypedArray.getBoolean(j, b7.j0);
          break;
        case 80:
          b7 = parama.d;
          b7.i0 = paramTypedArray.getBoolean(j, b7.i0);
          break;
        case 79:
          c3 = parama.c;
          c3.g = paramTypedArray.getFloat(j, c3.g);
          break;
        case 78:
          d4 = parama.b;
          d4.c = paramTypedArray.getInt(j, d4.c);
          break;
        case 77:
          parama.d.h0 = paramTypedArray.getString(j);
          break;
        case 76:
          c2 = parama.c;
          c2.e = paramTypedArray.getInt(j, c2.e);
          break;
        case 75:
          b6 = parama.d;
          b6.k0 = paramTypedArray.getBoolean(j, b6.k0);
          break;
        case 74:
          parama.d.g0 = paramTypedArray.getString(j);
          break;
        case 73:
          b6 = parama.d;
          b6.d0 = paramTypedArray.getDimensionPixelSize(j, b6.d0);
          break;
        case 72:
          b6 = parama.d;
          b6.c0 = paramTypedArray.getInt(j, b6.c0);
          break;
        case 71:
          Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
          break;
        case 70:
          parama.d.b0 = paramTypedArray.getFloat(j, 1.0F);
          break;
        case 69:
          parama.d.a0 = paramTypedArray.getFloat(j, 1.0F);
          break;
        case 68:
          d3 = parama.b;
          d3.e = paramTypedArray.getFloat(j, d3.e);
          break;
        case 67:
          c1 = parama.c;
          c1.h = paramTypedArray.getFloat(j, c1.h);
          break;
        case 66:
          parama.c.f = paramTypedArray.getInt(j, 0);
          break;
        case 65:
          if ((paramTypedArray.peekValue(j)).type == 3) {
            parama.c.d = paramTypedArray.getString(j);
            break;
          } 
          parama.c.d = b.f.a.a.c.b[paramTypedArray.getInteger(j, 0)];
          break;
        case 64:
          c1 = parama.c;
          c1.c = y(paramTypedArray, j, c1.c);
          break;
        case 63:
          b5 = parama.d;
          b5.A = paramTypedArray.getFloat(j, b5.A);
          break;
        case 62:
          b5 = parama.d;
          b5.z = paramTypedArray.getDimensionPixelSize(j, b5.z);
          break;
        case 61:
          b5 = parama.d;
          b5.y = y(paramTypedArray, j, b5.y);
          break;
        case 60:
          e2 = parama.e;
          e2.c = paramTypedArray.getFloat(j, e2.c);
          break;
        case 59:
          b4 = parama.d;
          b4.Z = paramTypedArray.getDimensionPixelSize(j, b4.Z);
          break;
        case 58:
          b4 = parama.d;
          b4.Y = paramTypedArray.getDimensionPixelSize(j, b4.Y);
          break;
        case 57:
          b4 = parama.d;
          b4.X = paramTypedArray.getDimensionPixelSize(j, b4.X);
          break;
        case 56:
          b4 = parama.d;
          b4.W = paramTypedArray.getDimensionPixelSize(j, b4.W);
          break;
        case 55:
          b4 = parama.d;
          b4.V = paramTypedArray.getInt(j, b4.V);
          break;
        case 54:
          b4 = parama.d;
          b4.U = paramTypedArray.getInt(j, b4.U);
          break;
        case 53:
          if (Build.VERSION.SDK_INT >= 21) {
            e e = parama.e;
            e.l = paramTypedArray.getDimension(j, e.l);
          } 
          break;
        case 52:
          e1 = parama.e;
          e1.k = paramTypedArray.getDimension(j, e1.k);
          break;
        case 51:
          e1 = parama.e;
          e1.j = paramTypedArray.getDimension(j, e1.j);
          break;
        case 50:
          e1 = parama.e;
          e1.i = paramTypedArray.getDimension(j, e1.i);
          break;
        case 49:
          e1 = parama.e;
          e1.h = paramTypedArray.getDimension(j, e1.h);
          break;
        case 48:
          e1 = parama.e;
          e1.g = paramTypedArray.getFloat(j, e1.g);
          break;
        case 47:
          e1 = parama.e;
          e1.f = paramTypedArray.getFloat(j, e1.f);
          break;
        case 46:
          e1 = parama.e;
          e1.e = paramTypedArray.getFloat(j, e1.e);
          break;
        case 45:
          e1 = parama.e;
          e1.d = paramTypedArray.getFloat(j, e1.d);
          break;
        case 44:
          if (Build.VERSION.SDK_INT >= 21) {
            e1 = parama.e;
            e1.m = true;
            e1.n = paramTypedArray.getDimension(j, e1.n);
          } 
          break;
        case 43:
          d2 = parama.b;
          d2.d = paramTypedArray.getFloat(j, d2.d);
          break;
        case 42:
          b3 = parama.d;
          b3.T = paramTypedArray.getInt(j, b3.T);
          break;
        case 41:
          b3 = parama.d;
          b3.S = paramTypedArray.getInt(j, b3.S);
          break;
        case 40:
          b3 = parama.d;
          b3.Q = paramTypedArray.getFloat(j, b3.Q);
          break;
        case 39:
          b3 = parama.d;
          b3.R = paramTypedArray.getFloat(j, b3.R);
          break;
        case 38:
          parama.a = paramTypedArray.getResourceId(j, parama.a);
          break;
        case 37:
          b3 = parama.d;
          b3.w = paramTypedArray.getFloat(j, b3.w);
          break;
        case 36:
          b3 = parama.d;
          b3.m = y(paramTypedArray, j, b3.m);
          break;
        case 35:
          b3 = parama.d;
          b3.n = y(paramTypedArray, j, b3.n);
          break;
        case 34:
          b3 = parama.d;
          b3.G = paramTypedArray.getDimensionPixelSize(j, b3.G);
          break;
        case 33:
          b3 = parama.d;
          b3.s = y(paramTypedArray, j, b3.s);
          break;
        case 32:
          b3 = parama.d;
          b3.r = y(paramTypedArray, j, b3.r);
          break;
        case 31:
          if (Build.VERSION.SDK_INT >= 17) {
            b3 = parama.d;
            b3.J = paramTypedArray.getDimensionPixelSize(j, b3.J);
          } 
          break;
        case 30:
          b3 = parama.d;
          b3.l = y(paramTypedArray, j, b3.l);
          break;
        case 29:
          b3 = parama.d;
          b3.k = y(paramTypedArray, j, b3.k);
          break;
        case 28:
          b3 = parama.d;
          b3.F = paramTypedArray.getDimensionPixelSize(j, b3.F);
          break;
        case 27:
          b3 = parama.d;
          b3.D = paramTypedArray.getInt(j, b3.D);
          break;
        case 26:
          b3 = parama.d;
          b3.j = y(paramTypedArray, j, b3.j);
          break;
        case 25:
          b3 = parama.d;
          b3.i = y(paramTypedArray, j, b3.i);
          break;
        case 24:
          b3 = parama.d;
          b3.E = paramTypedArray.getDimensionPixelSize(j, b3.E);
          break;
        case 23:
          b3 = parama.d;
          b3.d = paramTypedArray.getLayoutDimension(j, b3.d);
          break;
        case 22:
          d1 = parama.b;
          d1.b = paramTypedArray.getInt(j, d1.b);
          d1 = parama.b;
          d1.b = a[d1.b];
          break;
        case 21:
          b2 = parama.d;
          b2.e = paramTypedArray.getLayoutDimension(j, b2.e);
          break;
        case 20:
          b2 = parama.d;
          b2.v = paramTypedArray.getFloat(j, b2.v);
          break;
        case 19:
          b2 = parama.d;
          b2.h = paramTypedArray.getFloat(j, b2.h);
          break;
        case 18:
          b2 = parama.d;
          b2.g = paramTypedArray.getDimensionPixelOffset(j, b2.g);
          break;
        case 17:
          b2 = parama.d;
          b2.f = paramTypedArray.getDimensionPixelOffset(j, b2.f);
          break;
        case 16:
          b2 = parama.d;
          b2.L = paramTypedArray.getDimensionPixelSize(j, b2.L);
          break;
        case 15:
          b2 = parama.d;
          b2.P = paramTypedArray.getDimensionPixelSize(j, b2.P);
          break;
        case 14:
          b2 = parama.d;
          b2.M = paramTypedArray.getDimensionPixelSize(j, b2.M);
          break;
        case 13:
          b2 = parama.d;
          b2.K = paramTypedArray.getDimensionPixelSize(j, b2.K);
          break;
        case 12:
          b2 = parama.d;
          b2.O = paramTypedArray.getDimensionPixelSize(j, b2.O);
          break;
        case 11:
          b2 = parama.d;
          b2.N = paramTypedArray.getDimensionPixelSize(j, b2.N);
          break;
        case 10:
          b2 = parama.d;
          b2.t = y(paramTypedArray, j, b2.t);
          break;
        case 9:
          b2 = parama.d;
          b2.u = y(paramTypedArray, j, b2.u);
          break;
        case 8:
          if (Build.VERSION.SDK_INT >= 17) {
            b2 = parama.d;
            b2.I = paramTypedArray.getDimensionPixelSize(j, b2.I);
          } 
          break;
        case 7:
          b2 = parama.d;
          b2.C = paramTypedArray.getDimensionPixelOffset(j, b2.C);
          break;
        case 6:
          b2 = parama.d;
          b2.B = paramTypedArray.getDimensionPixelOffset(j, b2.B);
          break;
        case 5:
          parama.d.x = paramTypedArray.getString(j);
          break;
        case 4:
          b2 = parama.d;
          b2.o = y(paramTypedArray, j, b2.o);
          break;
        case 3:
          b2 = parama.d;
          b2.p = y(paramTypedArray, j, b2.p);
          break;
        case 2:
          b2 = parama.d;
          b2.H = paramTypedArray.getDimensionPixelSize(j, b2.H);
          break;
        case 1:
          b2 = parama.d;
          b2.q = y(paramTypedArray, j, b2.q);
          break;
      } 
    } 
  }
  
  public void A(ConstraintLayout paramConstraintLayout) {
    int i = paramConstraintLayout.getChildCount();
    byte b1 = 0;
    while (b1 < i) {
      View view = paramConstraintLayout.getChildAt(b1);
      ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams)view.getLayoutParams();
      int j = view.getId();
      if (!this.e || j != -1) {
        if (!this.f.containsKey(Integer.valueOf(j)))
          this.f.put(Integer.valueOf(j), new a()); 
        a a = this.f.get(Integer.valueOf(j));
        if (!a.d.c) {
          a.a(a, j, layoutParams);
          if (view instanceof ConstraintHelper) {
            a.d.f0 = ((ConstraintHelper)view).getReferencedIds();
            if (view instanceof Barrier) {
              Barrier barrier = (Barrier)view;
              a.d.k0 = barrier.w();
              a.d.c0 = barrier.getType();
              a.d.d0 = barrier.getMargin();
            } 
          } 
          a.d.c = true;
        } 
        d d = a.b;
        if (!d.a) {
          d.b = view.getVisibility();
          a.b.d = view.getAlpha();
          a.b.a = true;
        } 
        j = Build.VERSION.SDK_INT;
        if (j >= 17) {
          e e = a.e;
          if (!e.b) {
            e.b = true;
            e.c = view.getRotation();
            a.e.d = view.getRotationX();
            a.e.e = view.getRotationY();
            a.e.f = view.getScaleX();
            a.e.g = view.getScaleY();
            float f1 = view.getPivotX();
            float f2 = view.getPivotY();
            if (f1 != 0.0D || f2 != 0.0D) {
              e = a.e;
              e.h = f1;
              e.i = f2;
            } 
            a.e.j = view.getTranslationX();
            a.e.k = view.getTranslationY();
            if (j >= 21) {
              a.e.l = view.getTranslationZ();
              e e1 = a.e;
              if (e1.m)
                e1.n = view.getElevation(); 
            } 
          } 
        } 
        b1++;
        continue;
      } 
      throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
    } 
  }
  
  public void B(b paramb) {
    for (Integer integer : paramb.f.keySet()) {
      int i = integer.intValue();
      a a1 = paramb.f.get(integer);
      if (!this.f.containsKey(Integer.valueOf(i)))
        this.f.put(Integer.valueOf(i), new a()); 
      a a2 = this.f.get(Integer.valueOf(i));
      b b1 = a2.d;
      if (!b1.c)
        b1.a(a1.d); 
      d d = a2.b;
      if (!d.a)
        d.a(a1.b); 
      e e = a2.e;
      if (!e.b)
        e.a(a1.e); 
      c c = a2.c;
      if (!c.b)
        c.a(a1.c); 
      for (String str : a1.f.keySet()) {
        if (!a2.f.containsKey(str))
          a2.f.put(str, a1.f.get(str)); 
      } 
    } 
  }
  
  public void C(boolean paramBoolean) {
    this.e = paramBoolean;
  }
  
  public void D(boolean paramBoolean) {
    this.c = paramBoolean;
  }
  
  public void c(ConstraintLayout paramConstraintLayout) {
    int i = paramConstraintLayout.getChildCount();
    for (byte b1 = 0; b1 < i; b1++) {
      View view = paramConstraintLayout.getChildAt(b1);
      int j = view.getId();
      if (!this.f.containsKey(Integer.valueOf(j))) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("id unknown ");
        stringBuilder.append(androidx.constraintlayout.motion.widget.a.c(view));
        Log.v("ConstraintSet", stringBuilder.toString());
      } else if (!this.e || j != -1) {
        if (this.f.containsKey(Integer.valueOf(j)))
          ConstraintAttribute.h(view, ((a)this.f.get(Integer.valueOf(j))).f); 
      } else {
        throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
      } 
    } 
  }
  
  public void d(ConstraintLayout paramConstraintLayout) {
    f(paramConstraintLayout, true);
    paramConstraintLayout.setConstraintSet(null);
    paramConstraintLayout.requestLayout();
  }
  
  public void e(ConstraintHelper paramConstraintHelper, ConstraintWidget paramConstraintWidget, ConstraintLayout.LayoutParams paramLayoutParams, SparseArray<ConstraintWidget> paramSparseArray) {
    int i = paramConstraintHelper.getId();
    if (this.f.containsKey(Integer.valueOf(i))) {
      a a = this.f.get(Integer.valueOf(i));
      if (paramConstraintWidget instanceof h)
        paramConstraintHelper.o(a, (h)paramConstraintWidget, paramLayoutParams, paramSparseArray); 
    } 
  }
  
  void f(ConstraintLayout paramConstraintLayout, boolean paramBoolean) {
    int i = paramConstraintLayout.getChildCount();
    HashSet hashSet = new HashSet(this.f.keySet());
    int j;
    for (j = 0; j < i; j++) {
      View view = paramConstraintLayout.getChildAt(j);
      int k = view.getId();
      if (!this.f.containsKey(Integer.valueOf(k))) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("id unknown ");
        stringBuilder.append(androidx.constraintlayout.motion.widget.a.c(view));
        Log.w("ConstraintSet", stringBuilder.toString());
      } else if (!this.e || k != -1) {
        if (k != -1)
          if (this.f.containsKey(Integer.valueOf(k))) {
            hashSet.remove(Integer.valueOf(k));
            a a = this.f.get(Integer.valueOf(k));
            if (view instanceof Barrier)
              a.d.e0 = 1; 
            int m = a.d.e0;
            if (m != -1 && m == 1) {
              Barrier barrier = (Barrier)view;
              barrier.setId(k);
              barrier.setType(a.d.c0);
              barrier.setMargin(a.d.d0);
              barrier.setAllowsGoneWidget(a.d.k0);
              b b1 = a.d;
              int[] arrayOfInt = b1.f0;
              if (arrayOfInt != null) {
                barrier.setReferencedIds(arrayOfInt);
              } else {
                String str = b1.g0;
                if (str != null) {
                  b1.f0 = m(barrier, str);
                  barrier.setReferencedIds(a.d.f0);
                } 
              } 
            } 
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams)view.getLayoutParams();
            layoutParams.c();
            a.d(layoutParams);
            if (paramBoolean)
              ConstraintAttribute.h(view, a.f); 
            view.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
            d d = a.b;
            if (d.c == 0)
              view.setVisibility(d.b); 
            k = Build.VERSION.SDK_INT;
            if (k >= 17) {
              view.setAlpha(a.b.d);
              view.setRotation(a.e.c);
              view.setRotationX(a.e.d);
              view.setRotationY(a.e.e);
              view.setScaleX(a.e.f);
              view.setScaleY(a.e.g);
              if (!Float.isNaN(a.e.h))
                view.setPivotX(a.e.h); 
              if (!Float.isNaN(a.e.i))
                view.setPivotY(a.e.i); 
              view.setTranslationX(a.e.j);
              view.setTranslationY(a.e.k);
              if (k >= 21) {
                view.setTranslationZ(a.e.l);
                e e = a.e;
                if (e.m)
                  view.setElevation(e.n); 
              } 
            } 
          } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("WARNING NO CONSTRAINTS for view ");
            stringBuilder.append(k);
            Log.v("ConstraintSet", stringBuilder.toString());
          }  
      } else {
        throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
      } 
    } 
    for (Integer integer : hashSet) {
      a a = this.f.get(integer);
      j = a.d.e0;
      if (j != -1 && j == 1) {
        Barrier barrier = new Barrier(paramConstraintLayout.getContext());
        barrier.setId(integer.intValue());
        b b1 = a.d;
        int[] arrayOfInt = b1.f0;
        if (arrayOfInt != null) {
          barrier.setReferencedIds(arrayOfInt);
        } else {
          String str = b1.g0;
          if (str != null) {
            b1.f0 = m(barrier, str);
            barrier.setReferencedIds(a.d.f0);
          } 
        } 
        barrier.setType(a.d.c0);
        barrier.setMargin(a.d.d0);
        ConstraintLayout.LayoutParams layoutParams = paramConstraintLayout.e();
        barrier.v();
        a.d(layoutParams);
        paramConstraintLayout.addView(barrier, (ViewGroup.LayoutParams)layoutParams);
      } 
      if (a.d.b) {
        Guideline guideline = new Guideline(paramConstraintLayout.getContext());
        guideline.setId(integer.intValue());
        ConstraintLayout.LayoutParams layoutParams = paramConstraintLayout.e();
        a.d(layoutParams);
        paramConstraintLayout.addView(guideline, (ViewGroup.LayoutParams)layoutParams);
      } 
    } 
  }
  
  public void g(int paramInt, ConstraintLayout.LayoutParams paramLayoutParams) {
    if (this.f.containsKey(Integer.valueOf(paramInt)))
      ((a)this.f.get(Integer.valueOf(paramInt))).d(paramLayoutParams); 
  }
  
  public void h(int paramInt1, int paramInt2) {
    if (this.f.containsKey(Integer.valueOf(paramInt1))) {
      a a = this.f.get(Integer.valueOf(paramInt1));
      switch (paramInt2) {
        default:
          throw new IllegalArgumentException("unknown constraint");
        case 7:
          b1 = a.d;
          b1.t = -1;
          b1.u = -1;
          b1.I = -1;
          b1.O = -1;
          return;
        case 6:
          b1 = ((a)b1).d;
          b1.r = -1;
          b1.s = -1;
          b1.J = -1;
          b1.P = -1;
          return;
        case 5:
          ((a)b1).d.q = -1;
          return;
        case 4:
          b1 = ((a)b1).d;
          b1.o = -1;
          b1.p = -1;
          b1.H = -1;
          b1.N = -1;
          return;
        case 3:
          b1 = ((a)b1).d;
          b1.n = -1;
          b1.m = -1;
          b1.G = -1;
          b1.L = -1;
          return;
        case 2:
          b1 = ((a)b1).d;
          b1.l = -1;
          b1.k = -1;
          b1.F = -1;
          b1.M = -1;
          return;
        case 1:
          break;
      } 
      b b1 = ((a)b1).d;
      b1.j = -1;
      b1.i = -1;
      b1.E = -1;
      b1.K = -1;
    } 
  }
  
  public void i(Context paramContext, int paramInt) {
    j((ConstraintLayout)LayoutInflater.from(paramContext).inflate(paramInt, null));
  }
  
  public void j(ConstraintLayout paramConstraintLayout) {
    int i = paramConstraintLayout.getChildCount();
    this.f.clear();
    byte b1 = 0;
    while (b1 < i) {
      View view = paramConstraintLayout.getChildAt(b1);
      ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams)view.getLayoutParams();
      int j = view.getId();
      if (!this.e || j != -1) {
        if (!this.f.containsKey(Integer.valueOf(j)))
          this.f.put(Integer.valueOf(j), new a()); 
        a a = this.f.get(Integer.valueOf(j));
        a.f = ConstraintAttribute.b(this.d, view);
        a.a(a, j, layoutParams);
        a.b.b = view.getVisibility();
        j = Build.VERSION.SDK_INT;
        if (j >= 17) {
          a.b.d = view.getAlpha();
          a.e.c = view.getRotation();
          a.e.d = view.getRotationX();
          a.e.e = view.getRotationY();
          a.e.f = view.getScaleX();
          a.e.g = view.getScaleY();
          float f1 = view.getPivotX();
          float f2 = view.getPivotY();
          if (f1 != 0.0D || f2 != 0.0D) {
            e e = a.e;
            e.h = f1;
            e.i = f2;
          } 
          a.e.j = view.getTranslationX();
          a.e.k = view.getTranslationY();
          if (j >= 21) {
            a.e.l = view.getTranslationZ();
            e e = a.e;
            if (e.m)
              e.n = view.getElevation(); 
          } 
        } 
        if (view instanceof Barrier) {
          view = view;
          a.d.k0 = view.w();
          a.d.f0 = view.getReferencedIds();
          a.d.c0 = view.getType();
          a.d.d0 = view.getMargin();
        } 
        b1++;
        continue;
      } 
      throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
    } 
  }
  
  public void k(Constraints paramConstraints) {
    int i = paramConstraints.getChildCount();
    this.f.clear();
    byte b1 = 0;
    while (b1 < i) {
      View view = paramConstraints.getChildAt(b1);
      Constraints.LayoutParams layoutParams = (Constraints.LayoutParams)view.getLayoutParams();
      int j = view.getId();
      if (!this.e || j != -1) {
        if (!this.f.containsKey(Integer.valueOf(j)))
          this.f.put(Integer.valueOf(j), new a()); 
        a a = this.f.get(Integer.valueOf(j));
        if (view instanceof ConstraintHelper)
          a.b(a, (ConstraintHelper)view, j, layoutParams); 
        a.c(a, j, layoutParams);
        b1++;
        continue;
      } 
      throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
    } 
  }
  
  public void l(int paramInt1, int paramInt2, int paramInt3, float paramFloat) {
    b b1 = (o(paramInt1)).d;
    b1.y = paramInt2;
    b1.z = paramInt3;
    b1.A = paramFloat;
  }
  
  public a p(int paramInt) {
    return this.f.containsKey(Integer.valueOf(paramInt)) ? this.f.get(Integer.valueOf(paramInt)) : null;
  }
  
  public int q(int paramInt) {
    return (o(paramInt)).d.e;
  }
  
  public int[] r() {
    Set<Integer> set = this.f.keySet();
    byte b1 = 0;
    Integer[] arrayOfInteger = set.<Integer>toArray(new Integer[0]);
    int i = arrayOfInteger.length;
    int[] arrayOfInt = new int[i];
    while (b1 < i) {
      arrayOfInt[b1] = arrayOfInteger[b1].intValue();
      b1++;
    } 
    return arrayOfInt;
  }
  
  public a s(int paramInt) {
    return o(paramInt);
  }
  
  public int t(int paramInt) {
    return (o(paramInt)).b.b;
  }
  
  public int u(int paramInt) {
    return (o(paramInt)).b.c;
  }
  
  public int v(int paramInt) {
    return (o(paramInt)).d.d;
  }
  
  public void w(Context paramContext, int paramInt) {
    XmlResourceParser xmlResourceParser = paramContext.getResources().getXml(paramInt);
    try {
      for (paramInt = xmlResourceParser.getEventType(); paramInt != 1; paramInt = xmlResourceParser.next()) {
        if (paramInt != 0) {
          if (paramInt == 2) {
            String str = xmlResourceParser.getName();
            a a = n(paramContext, Xml.asAttributeSet((XmlPullParser)xmlResourceParser));
            if (str.equalsIgnoreCase("Guideline"))
              a.d.b = true; 
            this.f.put(Integer.valueOf(a.a), a);
          } 
        } else {
          xmlResourceParser.getName();
        } 
      } 
    } catch (XmlPullParserException xmlPullParserException) {
      xmlPullParserException.printStackTrace();
    } catch (IOException iOException) {
      iOException.printStackTrace();
    } 
  }
  
  public void x(Context paramContext, XmlPullParser paramXmlPullParser) {
    try {
      int i = paramXmlPullParser.getEventType();
      a a = null;
      while (i != 1) {
        b b2;
        if (i != 0) {
          byte b3 = 3;
          if (i != 2) {
            if (i != 3) {
              a a1 = a;
            } else {
              String str = paramXmlPullParser.getName();
              if ("ConstraintSet".equals(str))
                return; 
              a a1 = a;
              if (str.equalsIgnoreCase("Constraint")) {
                this.f.put(Integer.valueOf(a.a), a);
                a1 = null;
              } 
            } 
          } else {
            RuntimeException runtimeException2;
            StringBuilder stringBuilder1;
            RuntimeException runtimeException1;
            a a2;
            StringBuilder stringBuilder3;
            RuntimeException runtimeException3;
            StringBuilder stringBuilder2;
            a a1;
            boolean bool;
            String str = paramXmlPullParser.getName();
            switch (str.hashCode()) {
              default:
                i = -1;
                break;
              case 1803088381:
                if (str.equals("Constraint")) {
                  i = 0;
                  break;
                } 
              case 1791837707:
                if (str.equals("CustomAttribute")) {
                  i = 7;
                  break;
                } 
              case 1331510167:
                if (str.equals("Barrier")) {
                  i = 2;
                  break;
                } 
              case -71750448:
                if (str.equals("Guideline")) {
                  i = 1;
                  break;
                } 
              case -1238332596:
                if (str.equals("Transform")) {
                  i = 4;
                  break;
                } 
              case -1269513683:
                if (str.equals("PropertySet")) {
                  i = b3;
                  break;
                } 
              case -1984451626:
                if (str.equals("Motion")) {
                  i = 6;
                  break;
                } 
              case -2025855158:
                bool = str.equals("Layout");
                if (bool) {
                  i = 5;
                  break;
                } 
            } 
            switch (i) {
              default:
                a2 = a;
                break;
              case 7:
                if (a != null) {
                  ConstraintAttribute.g(paramContext, paramXmlPullParser, a.f);
                  a2 = a;
                  break;
                } 
                runtimeException2 = new RuntimeException();
                stringBuilder3 = new StringBuilder();
                this();
                stringBuilder3.append("XML parser error must be within a Constraint ");
                stringBuilder3.append(paramXmlPullParser.getLineNumber());
                this(stringBuilder3.toString());
                throw runtimeException2;
              case 6:
                if (a != null) {
                  a.c.b((Context)runtimeException2, Xml.asAttributeSet(paramXmlPullParser));
                  a a3 = a;
                  break;
                } 
                runtimeException2 = new RuntimeException();
                stringBuilder3 = new StringBuilder();
                this();
                stringBuilder3.append("XML parser error must be within a Constraint ");
                stringBuilder3.append(paramXmlPullParser.getLineNumber());
                this(stringBuilder3.toString());
                throw runtimeException2;
              case 5:
                if (a != null) {
                  a.d.b((Context)runtimeException2, Xml.asAttributeSet(paramXmlPullParser));
                  a a3 = a;
                  break;
                } 
                runtimeException2 = new RuntimeException();
                stringBuilder3 = new StringBuilder();
                this();
                stringBuilder3.append("XML parser error must be within a Constraint ");
                stringBuilder3.append(paramXmlPullParser.getLineNumber());
                this(stringBuilder3.toString());
                throw runtimeException2;
              case 4:
                if (a != null) {
                  a.e.b((Context)runtimeException2, Xml.asAttributeSet(paramXmlPullParser));
                  a a3 = a;
                  break;
                } 
                runtimeException3 = new RuntimeException();
                stringBuilder1 = new StringBuilder();
                this();
                stringBuilder1.append("XML parser error must be within a Constraint ");
                stringBuilder1.append(paramXmlPullParser.getLineNumber());
                this(stringBuilder1.toString());
                throw runtimeException3;
              case 3:
                if (a != null) {
                  a.b.b((Context)stringBuilder1, Xml.asAttributeSet(paramXmlPullParser));
                  a a3 = a;
                  break;
                } 
                runtimeException1 = new RuntimeException();
                stringBuilder2 = new StringBuilder();
                this();
                stringBuilder2.append("XML parser error must be within a Constraint ");
                stringBuilder2.append(paramXmlPullParser.getLineNumber());
                this(stringBuilder2.toString());
                throw runtimeException1;
              case 2:
                a1 = n((Context)runtimeException1, Xml.asAttributeSet(paramXmlPullParser));
                a1.d.e0 = 1;
                break;
              case 1:
                a1 = n((Context)runtimeException1, Xml.asAttributeSet(paramXmlPullParser));
                b1 = a1.d;
                b1.b = true;
                b1.c = true;
                break;
              case 0:
                a1 = n((Context)runtimeException1, Xml.asAttributeSet(paramXmlPullParser));
                break;
            } 
          } 
        } else {
          paramXmlPullParser.getName();
          b2 = b1;
        } 
        i = paramXmlPullParser.next();
        b b1 = b2;
      } 
    } catch (XmlPullParserException xmlPullParserException) {
      xmlPullParserException.printStackTrace();
    } catch (IOException iOException) {
      iOException.printStackTrace();
    } 
  }
  
  public static class a {
    int a;
    
    public final b.d b = new b.d();
    
    public final b.c c = new b.c();
    
    public final b.b d = new b.b();
    
    public final b.e e = new b.e();
    
    public HashMap<String, ConstraintAttribute> f = new HashMap<String, ConstraintAttribute>();
    
    private void f(int param1Int, ConstraintLayout.LayoutParams param1LayoutParams) {
      this.a = param1Int;
      b.b b1 = this.d;
      b1.i = param1LayoutParams.d;
      b1.j = param1LayoutParams.e;
      b1.k = param1LayoutParams.f;
      b1.l = param1LayoutParams.g;
      b1.m = param1LayoutParams.h;
      b1.n = param1LayoutParams.i;
      b1.o = param1LayoutParams.j;
      b1.p = param1LayoutParams.k;
      b1.q = param1LayoutParams.l;
      b1.r = param1LayoutParams.p;
      b1.s = param1LayoutParams.q;
      b1.t = param1LayoutParams.r;
      b1.u = param1LayoutParams.s;
      b1.v = param1LayoutParams.z;
      b1.w = param1LayoutParams.A;
      b1.x = param1LayoutParams.B;
      b1.y = param1LayoutParams.m;
      b1.z = param1LayoutParams.n;
      b1.A = param1LayoutParams.o;
      b1.B = param1LayoutParams.Q;
      b1.C = param1LayoutParams.R;
      b1.D = param1LayoutParams.S;
      b1.h = param1LayoutParams.c;
      b1.f = param1LayoutParams.a;
      b1.g = param1LayoutParams.b;
      b1 = this.d;
      b1.d = param1LayoutParams.width;
      b1.e = param1LayoutParams.height;
      b1.E = param1LayoutParams.leftMargin;
      b1.F = param1LayoutParams.rightMargin;
      b1.G = param1LayoutParams.topMargin;
      b1.H = param1LayoutParams.bottomMargin;
      b1.Q = param1LayoutParams.F;
      b1.R = param1LayoutParams.E;
      b1.T = param1LayoutParams.H;
      b1.S = param1LayoutParams.G;
      b1.i0 = param1LayoutParams.T;
      b1.j0 = param1LayoutParams.U;
      b1.U = param1LayoutParams.I;
      b1.V = param1LayoutParams.J;
      b1.W = param1LayoutParams.M;
      b1.X = param1LayoutParams.N;
      b1.Y = param1LayoutParams.K;
      b1.Z = param1LayoutParams.L;
      b1.a0 = param1LayoutParams.O;
      b1.b0 = param1LayoutParams.P;
      b1.h0 = param1LayoutParams.V;
      b1.L = param1LayoutParams.u;
      b1.N = param1LayoutParams.w;
      b1.K = param1LayoutParams.t;
      b1.M = param1LayoutParams.v;
      b1 = this.d;
      b1.P = param1LayoutParams.x;
      b1.O = param1LayoutParams.y;
      if (Build.VERSION.SDK_INT >= 17) {
        b1.I = param1LayoutParams.getMarginEnd();
        this.d.J = param1LayoutParams.getMarginStart();
      } 
    }
    
    private void g(int param1Int, Constraints.LayoutParams param1LayoutParams) {
      f(param1Int, param1LayoutParams);
      this.b.d = param1LayoutParams.p0;
      b.e e1 = this.e;
      e1.c = param1LayoutParams.s0;
      e1.d = param1LayoutParams.t0;
      e1.e = param1LayoutParams.u0;
      e1.f = param1LayoutParams.v0;
      e1.g = param1LayoutParams.w0;
      e1.h = param1LayoutParams.x0;
      e1.i = param1LayoutParams.y0;
      e1.j = param1LayoutParams.z0;
      e1.k = param1LayoutParams.A0;
      e1.l = param1LayoutParams.B0;
      e1.n = param1LayoutParams.r0;
      e1.m = param1LayoutParams.q0;
    }
    
    private void h(ConstraintHelper param1ConstraintHelper, int param1Int, Constraints.LayoutParams param1LayoutParams) {
      g(param1Int, param1LayoutParams);
      if (param1ConstraintHelper instanceof Barrier) {
        b.b b1 = this.d;
        b1.e0 = 1;
        param1ConstraintHelper = param1ConstraintHelper;
        b1.c0 = param1ConstraintHelper.getType();
        this.d.f0 = param1ConstraintHelper.getReferencedIds();
        this.d.d0 = param1ConstraintHelper.getMargin();
      } 
    }
    
    public void d(ConstraintLayout.LayoutParams param1LayoutParams) {
      b.b b1 = this.d;
      param1LayoutParams.d = b1.i;
      param1LayoutParams.e = b1.j;
      param1LayoutParams.f = b1.k;
      param1LayoutParams.g = b1.l;
      param1LayoutParams.h = b1.m;
      param1LayoutParams.i = b1.n;
      param1LayoutParams.j = b1.o;
      param1LayoutParams.k = b1.p;
      param1LayoutParams.l = b1.q;
      param1LayoutParams.p = b1.r;
      param1LayoutParams.q = b1.s;
      param1LayoutParams.r = b1.t;
      param1LayoutParams.s = b1.u;
      param1LayoutParams.leftMargin = b1.E;
      param1LayoutParams.rightMargin = b1.F;
      param1LayoutParams.topMargin = b1.G;
      param1LayoutParams.bottomMargin = b1.H;
      param1LayoutParams.x = b1.P;
      param1LayoutParams.y = b1.O;
      param1LayoutParams.u = b1.L;
      param1LayoutParams.w = b1.N;
      param1LayoutParams.z = b1.v;
      param1LayoutParams.A = b1.w;
      param1LayoutParams.m = b1.y;
      param1LayoutParams.n = b1.z;
      b1 = this.d;
      param1LayoutParams.o = b1.A;
      param1LayoutParams.B = b1.x;
      param1LayoutParams.Q = b1.B;
      param1LayoutParams.R = b1.C;
      param1LayoutParams.F = b1.Q;
      param1LayoutParams.E = b1.R;
      param1LayoutParams.H = b1.T;
      param1LayoutParams.G = b1.S;
      param1LayoutParams.T = b1.i0;
      param1LayoutParams.U = b1.j0;
      param1LayoutParams.I = b1.U;
      param1LayoutParams.J = b1.V;
      param1LayoutParams.M = b1.W;
      param1LayoutParams.N = b1.X;
      param1LayoutParams.K = b1.Y;
      param1LayoutParams.L = b1.Z;
      param1LayoutParams.O = b1.a0;
      param1LayoutParams.P = b1.b0;
      param1LayoutParams.S = b1.D;
      param1LayoutParams.c = b1.h;
      param1LayoutParams.a = b1.f;
      param1LayoutParams.b = b1.g;
      param1LayoutParams.width = b1.d;
      param1LayoutParams.height = b1.e;
      String str = b1.h0;
      if (str != null)
        param1LayoutParams.V = str; 
      if (Build.VERSION.SDK_INT >= 17) {
        param1LayoutParams.setMarginStart(this.d.J);
        param1LayoutParams.setMarginEnd(this.d.I);
      } 
      param1LayoutParams.c();
    }
    
    public a e() {
      a a1 = new a();
      a1.d.a(this.d);
      a1.c.a(this.c);
      a1.b.a(this.b);
      a1.e.a(this.e);
      a1.a = this.a;
      return a1;
    }
  }
  
  public static class b {
    private static SparseIntArray a;
    
    public float A = 0.0F;
    
    public int B = -1;
    
    public int C = -1;
    
    public int D = -1;
    
    public int E = -1;
    
    public int F = -1;
    
    public int G = -1;
    
    public int H = -1;
    
    public int I = -1;
    
    public int J = -1;
    
    public int K = -1;
    
    public int L = -1;
    
    public int M = -1;
    
    public int N = -1;
    
    public int O = -1;
    
    public int P = -1;
    
    public float Q = -1.0F;
    
    public float R = -1.0F;
    
    public int S = 0;
    
    public int T = 0;
    
    public int U = 0;
    
    public int V = 0;
    
    public int W = -1;
    
    public int X = -1;
    
    public int Y = -1;
    
    public int Z = -1;
    
    public float a0 = 1.0F;
    
    public boolean b = false;
    
    public float b0 = 1.0F;
    
    public boolean c = false;
    
    public int c0 = -1;
    
    public int d;
    
    public int d0 = 0;
    
    public int e;
    
    public int e0 = -1;
    
    public int f = -1;
    
    public int[] f0;
    
    public int g = -1;
    
    public String g0;
    
    public float h = -1.0F;
    
    public String h0;
    
    public int i = -1;
    
    public boolean i0 = false;
    
    public int j = -1;
    
    public boolean j0 = false;
    
    public int k = -1;
    
    public boolean k0 = true;
    
    public int l = -1;
    
    public int m = -1;
    
    public int n = -1;
    
    public int o = -1;
    
    public int p = -1;
    
    public int q = -1;
    
    public int r = -1;
    
    public int s = -1;
    
    public int t = -1;
    
    public int u = -1;
    
    public float v = 0.5F;
    
    public float w = 0.5F;
    
    public String x = null;
    
    public int y = -1;
    
    public int z = 0;
    
    static {
      SparseIntArray sparseIntArray = new SparseIntArray();
      a = sparseIntArray;
      sparseIntArray.append(e.Layout_layout_constraintLeft_toLeftOf, 24);
      a.append(e.Layout_layout_constraintLeft_toRightOf, 25);
      a.append(e.Layout_layout_constraintRight_toLeftOf, 28);
      a.append(e.Layout_layout_constraintRight_toRightOf, 29);
      a.append(e.Layout_layout_constraintTop_toTopOf, 35);
      a.append(e.Layout_layout_constraintTop_toBottomOf, 34);
      a.append(e.Layout_layout_constraintBottom_toTopOf, 4);
      a.append(e.Layout_layout_constraintBottom_toBottomOf, 3);
      a.append(e.Layout_layout_constraintBaseline_toBaselineOf, 1);
      a.append(e.Layout_layout_editor_absoluteX, 6);
      a.append(e.Layout_layout_editor_absoluteY, 7);
      a.append(e.Layout_layout_constraintGuide_begin, 17);
      a.append(e.Layout_layout_constraintGuide_end, 18);
      a.append(e.Layout_layout_constraintGuide_percent, 19);
      a.append(e.Layout_android_orientation, 26);
      a.append(e.Layout_layout_constraintStart_toEndOf, 31);
      a.append(e.Layout_layout_constraintStart_toStartOf, 32);
      a.append(e.Layout_layout_constraintEnd_toStartOf, 10);
      a.append(e.Layout_layout_constraintEnd_toEndOf, 9);
      a.append(e.Layout_layout_goneMarginLeft, 13);
      a.append(e.Layout_layout_goneMarginTop, 16);
      a.append(e.Layout_layout_goneMarginRight, 14);
      a.append(e.Layout_layout_goneMarginBottom, 11);
      a.append(e.Layout_layout_goneMarginStart, 15);
      a.append(e.Layout_layout_goneMarginEnd, 12);
      a.append(e.Layout_layout_constraintVertical_weight, 38);
      a.append(e.Layout_layout_constraintHorizontal_weight, 37);
      a.append(e.Layout_layout_constraintHorizontal_chainStyle, 39);
      a.append(e.Layout_layout_constraintVertical_chainStyle, 40);
      a.append(e.Layout_layout_constraintHorizontal_bias, 20);
      a.append(e.Layout_layout_constraintVertical_bias, 36);
      a.append(e.Layout_layout_constraintDimensionRatio, 5);
      a.append(e.Layout_layout_constraintLeft_creator, 76);
      a.append(e.Layout_layout_constraintTop_creator, 76);
      a.append(e.Layout_layout_constraintRight_creator, 76);
      a.append(e.Layout_layout_constraintBottom_creator, 76);
      a.append(e.Layout_layout_constraintBaseline_creator, 76);
      a.append(e.Layout_android_layout_marginLeft, 23);
      a.append(e.Layout_android_layout_marginRight, 27);
      a.append(e.Layout_android_layout_marginStart, 30);
      a.append(e.Layout_android_layout_marginEnd, 8);
      a.append(e.Layout_android_layout_marginTop, 33);
      a.append(e.Layout_android_layout_marginBottom, 2);
      a.append(e.Layout_android_layout_width, 22);
      a.append(e.Layout_android_layout_height, 21);
      a.append(e.Layout_layout_constraintCircle, 61);
      a.append(e.Layout_layout_constraintCircleRadius, 62);
      a.append(e.Layout_layout_constraintCircleAngle, 63);
      a.append(e.Layout_layout_constraintWidth_percent, 69);
      a.append(e.Layout_layout_constraintHeight_percent, 70);
      a.append(e.Layout_chainUseRtl, 71);
      a.append(e.Layout_barrierDirection, 72);
      a.append(e.Layout_barrierMargin, 73);
      a.append(e.Layout_constraint_referenced_ids, 74);
      a.append(e.Layout_barrierAllowsGoneWidgets, 75);
    }
    
    public void a(b param1b) {
      this.b = param1b.b;
      this.d = param1b.d;
      this.c = param1b.c;
      this.e = param1b.e;
      this.f = param1b.f;
      this.g = param1b.g;
      this.h = param1b.h;
      this.i = param1b.i;
      this.j = param1b.j;
      this.k = param1b.k;
      this.l = param1b.l;
      this.m = param1b.m;
      this.n = param1b.n;
      this.o = param1b.o;
      this.p = param1b.p;
      this.q = param1b.q;
      this.r = param1b.r;
      this.s = param1b.s;
      this.t = param1b.t;
      this.u = param1b.u;
      this.v = param1b.v;
      this.w = param1b.w;
      this.x = param1b.x;
      this.y = param1b.y;
      this.z = param1b.z;
      this.A = param1b.A;
      this.B = param1b.B;
      this.C = param1b.C;
      this.D = param1b.D;
      this.E = param1b.E;
      this.F = param1b.F;
      this.G = param1b.G;
      this.H = param1b.H;
      this.I = param1b.I;
      this.J = param1b.J;
      this.K = param1b.K;
      this.L = param1b.L;
      this.M = param1b.M;
      this.N = param1b.N;
      this.O = param1b.O;
      this.P = param1b.P;
      this.Q = param1b.Q;
      this.R = param1b.R;
      this.S = param1b.S;
      this.T = param1b.T;
      this.U = param1b.U;
      this.V = param1b.V;
      this.W = param1b.W;
      this.X = param1b.X;
      this.Y = param1b.Y;
      this.Z = param1b.Z;
      this.a0 = param1b.a0;
      this.b0 = param1b.b0;
      this.c0 = param1b.c0;
      this.d0 = param1b.d0;
      this.e0 = param1b.e0;
      this.h0 = param1b.h0;
      int[] arrayOfInt = param1b.f0;
      if (arrayOfInt != null) {
        this.f0 = Arrays.copyOf(arrayOfInt, arrayOfInt.length);
      } else {
        this.f0 = null;
      } 
      this.g0 = param1b.g0;
      this.i0 = param1b.i0;
      this.j0 = param1b.j0;
      this.k0 = param1b.k0;
    }
    
    void b(Context param1Context, AttributeSet param1AttributeSet) {
      TypedArray typedArray = param1Context.obtainStyledAttributes(param1AttributeSet, e.Layout);
      this.c = true;
      int i = typedArray.getIndexCount();
      for (byte b1 = 0; b1 < i; b1++) {
        int j = typedArray.getIndex(b1);
        int k = a.get(j);
        if (k != 80) {
          if (k != 81) {
            StringBuilder stringBuilder;
            switch (k) {
              default:
                switch (k) {
                  default:
                    switch (k) {
                      default:
                        switch (k) {
                          default:
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("Unknown attribute 0x");
                            stringBuilder.append(Integer.toHexString(j));
                            stringBuilder.append("   ");
                            stringBuilder.append(a.get(j));
                            Log.w("ConstraintSet", stringBuilder.toString());
                            break;
                          case 77:
                            this.h0 = typedArray.getString(j);
                            break;
                          case 76:
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("unused attribute 0x");
                            stringBuilder.append(Integer.toHexString(j));
                            stringBuilder.append("   ");
                            stringBuilder.append(a.get(j));
                            Log.w("ConstraintSet", stringBuilder.toString());
                            break;
                          case 75:
                            this.k0 = typedArray.getBoolean(j, this.k0);
                            break;
                          case 74:
                            this.g0 = typedArray.getString(j);
                            break;
                          case 73:
                            this.d0 = typedArray.getDimensionPixelSize(j, this.d0);
                            break;
                          case 72:
                            this.c0 = typedArray.getInt(j, this.c0);
                            break;
                          case 71:
                            Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                            break;
                          case 70:
                            this.b0 = typedArray.getFloat(j, 1.0F);
                            break;
                          case 69:
                            break;
                        } 
                        this.a0 = typedArray.getFloat(j, 1.0F);
                        break;
                      case 63:
                        this.A = typedArray.getFloat(j, this.A);
                        break;
                      case 62:
                        this.z = typedArray.getDimensionPixelSize(j, this.z);
                        break;
                      case 61:
                        break;
                    } 
                    this.y = b.a(typedArray, j, this.y);
                    break;
                  case 59:
                    this.Z = typedArray.getDimensionPixelSize(j, this.Z);
                    break;
                  case 58:
                    this.Y = typedArray.getDimensionPixelSize(j, this.Y);
                    break;
                  case 57:
                    this.X = typedArray.getDimensionPixelSize(j, this.X);
                    break;
                  case 56:
                    this.W = typedArray.getDimensionPixelSize(j, this.W);
                    break;
                  case 55:
                    this.V = typedArray.getInt(j, this.V);
                    break;
                  case 54:
                    break;
                } 
                this.U = typedArray.getInt(j, this.U);
                break;
              case 40:
                this.T = typedArray.getInt(j, this.T);
                break;
              case 39:
                this.S = typedArray.getInt(j, this.S);
                break;
              case 38:
                this.Q = typedArray.getFloat(j, this.Q);
                break;
              case 37:
                this.R = typedArray.getFloat(j, this.R);
                break;
              case 36:
                this.w = typedArray.getFloat(j, this.w);
                break;
              case 35:
                this.m = b.a(typedArray, j, this.m);
                break;
              case 34:
                this.n = b.a(typedArray, j, this.n);
                break;
              case 33:
                this.G = typedArray.getDimensionPixelSize(j, this.G);
                break;
              case 32:
                this.s = b.a(typedArray, j, this.s);
                break;
              case 31:
                this.r = b.a(typedArray, j, this.r);
                break;
              case 30:
                if (Build.VERSION.SDK_INT >= 17)
                  this.J = typedArray.getDimensionPixelSize(j, this.J); 
                break;
              case 29:
                this.l = b.a(typedArray, j, this.l);
                break;
              case 28:
                this.k = b.a(typedArray, j, this.k);
                break;
              case 27:
                this.F = typedArray.getDimensionPixelSize(j, this.F);
                break;
              case 26:
                this.D = typedArray.getInt(j, this.D);
                break;
              case 25:
                this.j = b.a(typedArray, j, this.j);
                break;
              case 24:
                this.i = b.a(typedArray, j, this.i);
                break;
              case 23:
                this.E = typedArray.getDimensionPixelSize(j, this.E);
                break;
              case 22:
                this.d = typedArray.getLayoutDimension(j, this.d);
                break;
              case 21:
                this.e = typedArray.getLayoutDimension(j, this.e);
                break;
              case 20:
                this.v = typedArray.getFloat(j, this.v);
                break;
              case 19:
                this.h = typedArray.getFloat(j, this.h);
                break;
              case 18:
                this.g = typedArray.getDimensionPixelOffset(j, this.g);
                break;
              case 17:
                this.f = typedArray.getDimensionPixelOffset(j, this.f);
                break;
              case 16:
                this.L = typedArray.getDimensionPixelSize(j, this.L);
                break;
              case 15:
                this.P = typedArray.getDimensionPixelSize(j, this.P);
                break;
              case 14:
                this.M = typedArray.getDimensionPixelSize(j, this.M);
                break;
              case 13:
                this.K = typedArray.getDimensionPixelSize(j, this.K);
                break;
              case 12:
                this.O = typedArray.getDimensionPixelSize(j, this.O);
                break;
              case 11:
                this.N = typedArray.getDimensionPixelSize(j, this.N);
                break;
              case 10:
                this.t = b.a(typedArray, j, this.t);
                break;
              case 9:
                this.u = b.a(typedArray, j, this.u);
                break;
              case 8:
                if (Build.VERSION.SDK_INT >= 17)
                  this.I = typedArray.getDimensionPixelSize(j, this.I); 
                break;
              case 7:
                this.C = typedArray.getDimensionPixelOffset(j, this.C);
                break;
              case 6:
                this.B = typedArray.getDimensionPixelOffset(j, this.B);
                break;
              case 5:
                this.x = typedArray.getString(j);
                break;
              case 4:
                this.o = b.a(typedArray, j, this.o);
                break;
              case 3:
                this.p = b.a(typedArray, j, this.p);
                break;
              case 2:
                this.H = typedArray.getDimensionPixelSize(j, this.H);
                break;
              case 1:
                this.q = b.a(typedArray, j, this.q);
                break;
            } 
          } else {
            this.j0 = typedArray.getBoolean(j, this.j0);
          } 
        } else {
          this.i0 = typedArray.getBoolean(j, this.i0);
        } 
      } 
      typedArray.recycle();
    }
  }
  
  public static class c {
    private static SparseIntArray a;
    
    public boolean b = false;
    
    public int c = -1;
    
    public String d = null;
    
    public int e = -1;
    
    public int f = 0;
    
    public float g = Float.NaN;
    
    public float h = Float.NaN;
    
    static {
      SparseIntArray sparseIntArray = new SparseIntArray();
      a = sparseIntArray;
      sparseIntArray.append(e.Motion_motionPathRotate, 1);
      a.append(e.Motion_pathMotionArc, 2);
      a.append(e.Motion_transitionEasing, 3);
      a.append(e.Motion_drawPath, 4);
      a.append(e.Motion_animate_relativeTo, 5);
      a.append(e.Motion_motionStagger, 6);
    }
    
    public void a(c param1c) {
      this.b = param1c.b;
      this.c = param1c.c;
      this.d = param1c.d;
      this.e = param1c.e;
      this.f = param1c.f;
      this.h = param1c.h;
      this.g = param1c.g;
    }
    
    void b(Context param1Context, AttributeSet param1AttributeSet) {
      TypedArray typedArray = param1Context.obtainStyledAttributes(param1AttributeSet, e.Motion);
      this.b = true;
      int i = typedArray.getIndexCount();
      for (byte b = 0; b < i; b++) {
        int j = typedArray.getIndex(b);
        switch (a.get(j)) {
          case 6:
            this.g = typedArray.getFloat(j, this.g);
            break;
          case 5:
            this.c = b.a(typedArray, j, this.c);
            break;
          case 4:
            this.f = typedArray.getInt(j, 0);
            break;
          case 3:
            if ((typedArray.peekValue(j)).type == 3) {
              this.d = typedArray.getString(j);
              break;
            } 
            this.d = b.f.a.a.c.b[typedArray.getInteger(j, 0)];
            break;
          case 2:
            this.e = typedArray.getInt(j, this.e);
            break;
          case 1:
            this.h = typedArray.getFloat(j, this.h);
            break;
        } 
      } 
      typedArray.recycle();
    }
  }
  
  public static class d {
    public boolean a = false;
    
    public int b = 0;
    
    public int c = 0;
    
    public float d = 1.0F;
    
    public float e = Float.NaN;
    
    public void a(d param1d) {
      this.a = param1d.a;
      this.b = param1d.b;
      this.d = param1d.d;
      this.e = param1d.e;
      this.c = param1d.c;
    }
    
    void b(Context param1Context, AttributeSet param1AttributeSet) {
      TypedArray typedArray = param1Context.obtainStyledAttributes(param1AttributeSet, e.PropertySet);
      this.a = true;
      int i = typedArray.getIndexCount();
      for (byte b = 0; b < i; b++) {
        int j = typedArray.getIndex(b);
        if (j == e.PropertySet_android_alpha) {
          this.d = typedArray.getFloat(j, this.d);
        } else if (j == e.PropertySet_android_visibility) {
          this.b = typedArray.getInt(j, this.b);
          this.b = b.b()[this.b];
        } else if (j == e.PropertySet_visibilityMode) {
          this.c = typedArray.getInt(j, this.c);
        } else if (j == e.PropertySet_motionProgress) {
          this.e = typedArray.getFloat(j, this.e);
        } 
      } 
      typedArray.recycle();
    }
  }
  
  public static class e {
    private static SparseIntArray a;
    
    public boolean b = false;
    
    public float c = 0.0F;
    
    public float d = 0.0F;
    
    public float e = 0.0F;
    
    public float f = 1.0F;
    
    public float g = 1.0F;
    
    public float h = Float.NaN;
    
    public float i = Float.NaN;
    
    public float j = 0.0F;
    
    public float k = 0.0F;
    
    public float l = 0.0F;
    
    public boolean m = false;
    
    public float n = 0.0F;
    
    static {
      SparseIntArray sparseIntArray = new SparseIntArray();
      a = sparseIntArray;
      sparseIntArray.append(e.Transform_android_rotation, 1);
      a.append(e.Transform_android_rotationX, 2);
      a.append(e.Transform_android_rotationY, 3);
      a.append(e.Transform_android_scaleX, 4);
      a.append(e.Transform_android_scaleY, 5);
      a.append(e.Transform_android_transformPivotX, 6);
      a.append(e.Transform_android_transformPivotY, 7);
      a.append(e.Transform_android_translationX, 8);
      a.append(e.Transform_android_translationY, 9);
      a.append(e.Transform_android_translationZ, 10);
      a.append(e.Transform_android_elevation, 11);
    }
    
    public void a(e param1e) {
      this.b = param1e.b;
      this.c = param1e.c;
      this.d = param1e.d;
      this.e = param1e.e;
      this.f = param1e.f;
      this.g = param1e.g;
      this.h = param1e.h;
      this.i = param1e.i;
      this.j = param1e.j;
      this.k = param1e.k;
      this.l = param1e.l;
      this.m = param1e.m;
      this.n = param1e.n;
    }
    
    void b(Context param1Context, AttributeSet param1AttributeSet) {
      TypedArray typedArray = param1Context.obtainStyledAttributes(param1AttributeSet, e.Transform);
      this.b = true;
      int i = typedArray.getIndexCount();
      for (byte b = 0; b < i; b++) {
        int j = typedArray.getIndex(b);
        switch (a.get(j)) {
          case 11:
            if (Build.VERSION.SDK_INT >= 21) {
              this.m = true;
              this.n = typedArray.getDimension(j, this.n);
            } 
            break;
          case 10:
            if (Build.VERSION.SDK_INT >= 21)
              this.l = typedArray.getDimension(j, this.l); 
            break;
          case 9:
            this.k = typedArray.getDimension(j, this.k);
            break;
          case 8:
            this.j = typedArray.getDimension(j, this.j);
            break;
          case 7:
            this.i = typedArray.getDimension(j, this.i);
            break;
          case 6:
            this.h = typedArray.getDimension(j, this.h);
            break;
          case 5:
            this.g = typedArray.getFloat(j, this.g);
            break;
          case 4:
            this.f = typedArray.getFloat(j, this.f);
            break;
          case 3:
            this.e = typedArray.getFloat(j, this.e);
            break;
          case 2:
            this.d = typedArray.getFloat(j, this.d);
            break;
          case 1:
            this.c = typedArray.getFloat(j, this.c);
            break;
        } 
      } 
      typedArray.recycle();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/constraintlayout/widget/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */