package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.constraintlayout.widget.d;
import androidx.constraintlayout.widget.e;
import androidx.constraintlayout.widget.f;
import b.f.a.a.c;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class r {
  private final MotionLayout a;
  
  f b = null;
  
  b c = null;
  
  private boolean d = false;
  
  private ArrayList<b> e = new ArrayList<b>();
  
  private b f = null;
  
  private ArrayList<b> g = new ArrayList<b>();
  
  private SparseArray<androidx.constraintlayout.widget.b> h = new SparseArray();
  
  private HashMap<String, Integer> i = new HashMap<String, Integer>();
  
  private SparseIntArray j = new SparseIntArray();
  
  private boolean k = false;
  
  private int l = 400;
  
  private int m = 0;
  
  private MotionEvent n;
  
  private boolean o = false;
  
  private boolean p = false;
  
  private MotionLayout.f q;
  
  private boolean r;
  
  float s;
  
  float t;
  
  r(Context paramContext, MotionLayout paramMotionLayout, int paramInt) {
    this.a = paramMotionLayout;
    C(paramContext, paramInt);
    SparseArray<androidx.constraintlayout.widget.b> sparseArray = this.h;
    paramInt = d.motion_base;
    sparseArray.put(paramInt, new androidx.constraintlayout.widget.b());
    this.i.put("motion_base", Integer.valueOf(paramInt));
  }
  
  private boolean A(int paramInt) {
    int i = this.j.get(paramInt);
    for (int j = this.j.size(); i > 0; j--) {
      if (i == paramInt)
        return true; 
      if (j < 0)
        return true; 
      i = this.j.get(i);
    } 
    return false;
  }
  
  private boolean B() {
    boolean bool;
    if (this.q != null) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private void C(Context paramContext, int paramInt) {
    XmlResourceParser xmlResourceParser = paramContext.getResources().getXml(paramInt);
    b b1 = null;
    try {
      int i;
      for (i = xmlResourceParser.getEventType();; i = xmlResourceParser.next()) {
        boolean bool = true;
        if (i != 1) {
          if (i != 0) {
            if (i == 2) {
              i i1;
              f f1;
              u u;
              ArrayList<b> arrayList;
              StringBuilder stringBuilder;
              String str = xmlResourceParser.getName();
              if (this.k) {
                PrintStream printStream = System.out;
                StringBuilder stringBuilder1 = new StringBuilder();
                this();
                stringBuilder1.append("parsing = ");
                stringBuilder1.append(str);
                printStream.println(stringBuilder1.toString());
              } 
              i = str.hashCode();
              switch (i) {
                default:
                  i = -1;
                  break;
                case 1382829617:
                  if (str.equals("StateSet")) {
                    i = 4;
                    break;
                  } 
                case 793277014:
                  if (str.equals("MotionScene")) {
                    i = 0;
                    break;
                  } 
                case 327855227:
                  if (str.equals("OnSwipe")) {
                    i = 2;
                    break;
                  } 
                case 312750793:
                  if (str.equals("OnClick")) {
                    i = 3;
                    break;
                  } 
                case 269306229:
                  if (str.equals("Transition")) {
                    i = bool;
                    break;
                  } 
                case -1239391468:
                  if (str.equals("KeyFrameSet")) {
                    i = 6;
                    break;
                  } 
                case -1349929691:
                  if (str.equals("ConstraintSet")) {
                    i = 5;
                    break;
                  } 
              } 
              switch (i) {
                default:
                  stringBuilder = new StringBuilder();
                  this();
                  stringBuilder.append("WARNING UNKNOWN ATTRIBUTE ");
                  stringBuilder.append(str);
                  Log.v("MotionScene", stringBuilder.toString());
                  i = xmlResourceParser.next();
                  continue;
                case 6:
                  i1 = new i();
                  this(paramContext, (XmlPullParser)xmlResourceParser);
                  b.f(b1).add(i1);
                  break;
                case 5:
                  D(paramContext, (XmlPullParser)xmlResourceParser);
                  break;
                case 4:
                  f1 = new f();
                  this(paramContext, (XmlPullParser)xmlResourceParser);
                  this.b = f1;
                  break;
                case 3:
                  b1.t(paramContext, (XmlPullParser)xmlResourceParser);
                  break;
                case 2:
                  if (b1 == null) {
                    String str1 = paramContext.getResources().getResourceEntryName(paramInt);
                    i = xmlResourceParser.getLineNumber();
                    stringBuilder = new StringBuilder();
                    this();
                    stringBuilder.append(" OnSwipe (");
                    stringBuilder.append(str1);
                    stringBuilder.append(".xml:");
                    stringBuilder.append(i);
                    stringBuilder.append(")");
                    Log.v("MotionScene", stringBuilder.toString());
                  } 
                  u = new u();
                  this(paramContext, this.a, (XmlPullParser)xmlResourceParser);
                  b.n(b1, u);
                  break;
                case 1:
                  arrayList = this.e;
                  b1 = new b();
                  this(this, paramContext, (XmlPullParser)xmlResourceParser);
                  arrayList.add(b1);
                  if (this.c == null && !b.e(b1)) {
                    this.c = b1;
                    if (b.m(b1) != null)
                      b.m(this.c).p(this.r); 
                  } 
                  if (b.e(b1)) {
                    if (b.a(b1) == -1) {
                      this.f = b1;
                    } else {
                      this.g.add(b1);
                    } 
                    this.e.remove(b1);
                  } 
                  break;
                case 0:
                  E(paramContext, (XmlPullParser)xmlResourceParser);
                  break;
              } 
            } 
          } else {
            xmlResourceParser.getName();
          } 
        } else {
          break;
        } 
      } 
    } catch (XmlPullParserException xmlPullParserException) {
      xmlPullParserException.printStackTrace();
    } catch (IOException iOException) {
      iOException.printStackTrace();
    } 
  }
  
  private void D(Context paramContext, XmlPullParser paramXmlPullParser) {
    androidx.constraintlayout.widget.b b1 = new androidx.constraintlayout.widget.b();
    byte b2 = 0;
    b1.C(false);
    int i = paramXmlPullParser.getAttributeCount();
    int j = -1;
    int k = -1;
    while (b2 < i) {
      String str1 = paramXmlPullParser.getAttributeName(b2);
      String str2 = paramXmlPullParser.getAttributeValue(b2);
      if (this.k) {
        PrintStream printStream = System.out;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("id string = ");
        stringBuilder.append(str2);
        printStream.println(stringBuilder.toString());
      } 
      str1.hashCode();
      if (!str1.equals("deriveConstraintsFrom")) {
        if (str1.equals("id")) {
          j = o(paramContext, str2);
          this.i.put(P(str2), Integer.valueOf(j));
        } 
      } else {
        k = o(paramContext, str2);
      } 
      b2++;
    } 
    if (j != -1) {
      if (this.a.V != 0)
        b1.D(true); 
      b1.x(paramContext, paramXmlPullParser);
      if (k != -1)
        this.j.put(j, k); 
      this.h.put(j, b1);
    } 
  }
  
  private void E(Context paramContext, XmlPullParser paramXmlPullParser) {
    TypedArray typedArray = paramContext.obtainStyledAttributes(Xml.asAttributeSet(paramXmlPullParser), e.MotionScene);
    int i = typedArray.getIndexCount();
    for (byte b1 = 0; b1 < i; b1++) {
      int j = typedArray.getIndex(b1);
      if (j == e.MotionScene_defaultDuration) {
        this.l = typedArray.getInt(j, this.l);
      } else if (j == e.MotionScene_layoutDuringTransition) {
        this.m = typedArray.getInteger(j, 0);
      } 
    } 
    typedArray.recycle();
  }
  
  private void I(int paramInt) {
    int i = this.j.get(paramInt);
    if (i > 0) {
      StringBuilder stringBuilder;
      I(this.j.get(paramInt));
      androidx.constraintlayout.widget.b b1 = (androidx.constraintlayout.widget.b)this.h.get(paramInt);
      androidx.constraintlayout.widget.b b2 = (androidx.constraintlayout.widget.b)this.h.get(i);
      if (b2 == null) {
        stringBuilder = new StringBuilder();
        stringBuilder.append("ERROR! invalid deriveConstraintsFrom: @id/");
        stringBuilder.append(a.b(this.a.getContext(), i));
        Log.e("MotionScene", stringBuilder.toString());
        return;
      } 
      b1.B((androidx.constraintlayout.widget.b)stringBuilder);
      this.j.put(paramInt, -1);
    } 
  }
  
  public static String P(String paramString) {
    if (paramString == null)
      return ""; 
    int i = paramString.indexOf('/');
    return (i < 0) ? paramString : paramString.substring(i + 1);
  }
  
  private int o(Context paramContext, String paramString) {
    byte b1;
    if (paramString.contains("/")) {
      String str = paramString.substring(paramString.indexOf('/') + 1);
      int j = paramContext.getResources().getIdentifier(str, "id", paramContext.getPackageName());
      b1 = j;
      if (this.k) {
        PrintStream printStream = System.out;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("id getMap res = ");
        stringBuilder.append(j);
        printStream.println(stringBuilder.toString());
        b1 = j;
      } 
    } else {
      b1 = -1;
    } 
    int i = b1;
    if (b1 == -1)
      if (paramString.length() > 1) {
        i = Integer.parseInt(paramString.substring(1));
      } else {
        Log.e("MotionScene", "error in parsing id");
        i = b1;
      }  
    return i;
  }
  
  private int v(int paramInt) {
    f f1 = this.b;
    if (f1 != null) {
      int i = f1.c(paramInt, -1, -1);
      if (i != -1)
        return i; 
    } 
    return paramInt;
  }
  
  void F(float paramFloat1, float paramFloat2) {
    b b1 = this.c;
    if (b1 != null && b.m(b1) != null)
      b.m(this.c).m(paramFloat1, paramFloat2); 
  }
  
  void G(float paramFloat1, float paramFloat2) {
    b b1 = this.c;
    if (b1 != null && b.m(b1) != null)
      b.m(this.c).n(paramFloat1, paramFloat2); 
  }
  
  void H(MotionEvent paramMotionEvent, int paramInt, MotionLayout paramMotionLayout) {
    RectF rectF1;
    RectF rectF2 = new RectF();
    if (this.q == null)
      this.q = this.a.k0(); 
    this.q.b(paramMotionEvent);
    if (paramInt != -1) {
      int i = paramMotionEvent.getAction();
      boolean bool = false;
      if (i != 0) {
        if (i == 2 && !this.o) {
          MotionEvent motionEvent;
          float f1 = paramMotionEvent.getRawY() - this.t;
          float f2 = paramMotionEvent.getRawX() - this.s;
          if (f2 != 0.0D || f1 != 0.0D) {
            motionEvent = this.n;
            if (motionEvent == null)
              return; 
          } else {
            return;
          } 
          b b2 = g(paramInt, f2, f1, motionEvent);
          if (b2 != null) {
            paramMotionLayout.setTransition(b2);
            rectF2 = b.m(this.c).j((ViewGroup)this.a, rectF2);
            boolean bool1 = bool;
            if (rectF2 != null) {
              bool1 = bool;
              if (!rectF2.contains(this.n.getX(), this.n.getY()))
                bool1 = true; 
            } 
            this.p = bool1;
            b.m(this.c).q(this.s, this.t);
          } 
        } 
      } else {
        this.s = paramMotionEvent.getRawX();
        this.t = paramMotionEvent.getRawY();
        this.n = paramMotionEvent;
        this.o = false;
        if (b.m(this.c) != null) {
          rectF1 = b.m(this.c).e((ViewGroup)this.a, rectF2);
          if (rectF1 != null && !rectF1.contains(this.n.getX(), this.n.getY())) {
            this.n = null;
            this.o = true;
            return;
          } 
          rectF1 = b.m(this.c).j((ViewGroup)this.a, rectF2);
          if (rectF1 != null && !rectF1.contains(this.n.getX(), this.n.getY())) {
            this.p = true;
          } else {
            this.p = false;
          } 
          b.m(this.c).o(this.s, this.t);
        } 
        return;
      } 
    } 
    if (this.o)
      return; 
    b b1 = this.c;
    if (b1 != null && b.m(b1) != null && !this.p)
      b.m(this.c).l((MotionEvent)rectF1, this.q, paramInt, this); 
    this.s = rectF1.getRawX();
    this.t = rectF1.getRawY();
    if (rectF1.getAction() == 1) {
      MotionLayout.f f1 = this.q;
      if (f1 != null) {
        f1.a();
        this.q = null;
        paramInt = paramMotionLayout.D;
        if (paramInt != -1)
          f(paramMotionLayout, paramInt); 
      } 
    } 
  }
  
  void J(MotionLayout paramMotionLayout) {
    int i;
    byte b1 = 0;
    byte b2 = 0;
    while (true) {
      i = b1;
      if (b2 < this.h.size()) {
        i = this.h.keyAt(b2);
        if (A(i)) {
          Log.e("MotionScene", "Cannot be derived from yourself");
          return;
        } 
        I(i);
        b2++;
        continue;
      } 
      break;
    } 
    while (i < this.h.size()) {
      ((androidx.constraintlayout.widget.b)this.h.valueAt(i)).A(paramMotionLayout);
      i++;
    } 
  }
  
  public void K(int paramInt) {
    b b1 = this.c;
    if (b1 != null) {
      b1.F(paramInt);
    } else {
      this.l = paramInt;
    } 
  }
  
  public void L(boolean paramBoolean) {
    this.r = paramBoolean;
    b b1 = this.c;
    if (b1 != null && b.m(b1) != null)
      b.m(this.c).p(this.r); 
  }
  
  void M(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : Landroidx/constraintlayout/widget/f;
    //   4: astore_3
    //   5: aload_3
    //   6: ifnull -> 55
    //   9: aload_3
    //   10: iload_1
    //   11: iconst_m1
    //   12: iconst_m1
    //   13: invokevirtual c : (III)I
    //   16: istore #4
    //   18: iload #4
    //   20: iconst_m1
    //   21: if_icmpeq -> 27
    //   24: goto -> 30
    //   27: iload_1
    //   28: istore #4
    //   30: aload_0
    //   31: getfield b : Landroidx/constraintlayout/widget/f;
    //   34: iload_2
    //   35: iconst_m1
    //   36: iconst_m1
    //   37: invokevirtual c : (III)I
    //   40: istore #5
    //   42: iload #4
    //   44: istore #6
    //   46: iload #5
    //   48: iconst_m1
    //   49: if_icmpeq -> 58
    //   52: goto -> 65
    //   55: iload_1
    //   56: istore #6
    //   58: iload_2
    //   59: istore #5
    //   61: iload #6
    //   63: istore #4
    //   65: aload_0
    //   66: getfield e : Ljava/util/ArrayList;
    //   69: invokevirtual iterator : ()Ljava/util/Iterator;
    //   72: astore #7
    //   74: aload #7
    //   76: invokeinterface hasNext : ()Z
    //   81: ifeq -> 160
    //   84: aload #7
    //   86: invokeinterface next : ()Ljava/lang/Object;
    //   91: checkcast androidx/constraintlayout/motion/widget/r$b
    //   94: astore_3
    //   95: aload_3
    //   96: invokestatic a : (Landroidx/constraintlayout/motion/widget/r$b;)I
    //   99: iload #5
    //   101: if_icmpne -> 113
    //   104: aload_3
    //   105: invokestatic c : (Landroidx/constraintlayout/motion/widget/r$b;)I
    //   108: iload #4
    //   110: if_icmpeq -> 129
    //   113: aload_3
    //   114: invokestatic a : (Landroidx/constraintlayout/motion/widget/r$b;)I
    //   117: iload_2
    //   118: if_icmpne -> 74
    //   121: aload_3
    //   122: invokestatic c : (Landroidx/constraintlayout/motion/widget/r$b;)I
    //   125: iload_1
    //   126: if_icmpne -> 74
    //   129: aload_0
    //   130: aload_3
    //   131: putfield c : Landroidx/constraintlayout/motion/widget/r$b;
    //   134: aload_3
    //   135: ifnull -> 159
    //   138: aload_3
    //   139: invokestatic m : (Landroidx/constraintlayout/motion/widget/r$b;)Landroidx/constraintlayout/motion/widget/u;
    //   142: ifnull -> 159
    //   145: aload_0
    //   146: getfield c : Landroidx/constraintlayout/motion/widget/r$b;
    //   149: invokestatic m : (Landroidx/constraintlayout/motion/widget/r$b;)Landroidx/constraintlayout/motion/widget/u;
    //   152: aload_0
    //   153: getfield r : Z
    //   156: invokevirtual p : (Z)V
    //   159: return
    //   160: aload_0
    //   161: getfield f : Landroidx/constraintlayout/motion/widget/r$b;
    //   164: astore_3
    //   165: aload_0
    //   166: getfield g : Ljava/util/ArrayList;
    //   169: invokevirtual iterator : ()Ljava/util/Iterator;
    //   172: astore #8
    //   174: aload #8
    //   176: invokeinterface hasNext : ()Z
    //   181: ifeq -> 211
    //   184: aload #8
    //   186: invokeinterface next : ()Ljava/lang/Object;
    //   191: checkcast androidx/constraintlayout/motion/widget/r$b
    //   194: astore #7
    //   196: aload #7
    //   198: invokestatic a : (Landroidx/constraintlayout/motion/widget/r$b;)I
    //   201: iload_2
    //   202: if_icmpne -> 174
    //   205: aload #7
    //   207: astore_3
    //   208: goto -> 174
    //   211: new androidx/constraintlayout/motion/widget/r$b
    //   214: dup
    //   215: aload_0
    //   216: aload_3
    //   217: invokespecial <init> : (Landroidx/constraintlayout/motion/widget/r;Landroidx/constraintlayout/motion/widget/r$b;)V
    //   220: astore_3
    //   221: aload_3
    //   222: iload #4
    //   224: invokestatic d : (Landroidx/constraintlayout/motion/widget/r$b;I)I
    //   227: pop
    //   228: aload_3
    //   229: iload #5
    //   231: invokestatic b : (Landroidx/constraintlayout/motion/widget/r$b;I)I
    //   234: pop
    //   235: iload #4
    //   237: iconst_m1
    //   238: if_icmpeq -> 250
    //   241: aload_0
    //   242: getfield e : Ljava/util/ArrayList;
    //   245: aload_3
    //   246: invokevirtual add : (Ljava/lang/Object;)Z
    //   249: pop
    //   250: aload_0
    //   251: aload_3
    //   252: putfield c : Landroidx/constraintlayout/motion/widget/r$b;
    //   255: return
  }
  
  public void N(b paramb) {
    this.c = paramb;
    if (paramb != null && b.m(paramb) != null)
      b.m(this.c).p(this.r); 
  }
  
  void O() {
    b b1 = this.c;
    if (b1 != null && b.m(b1) != null)
      b.m(this.c).r(); 
  }
  
  boolean Q() {
    Iterator<b> iterator = this.e.iterator();
    while (true) {
      boolean bool = iterator.hasNext();
      boolean bool1 = true;
      if (bool) {
        if (b.m(iterator.next()) != null)
          return true; 
        continue;
      } 
      b b1 = this.c;
      if (b1 == null || b.m(b1) == null)
        bool1 = false; 
      return bool1;
    } 
  }
  
  public void e(MotionLayout paramMotionLayout, int paramInt) {
    for (b b1 : this.e) {
      if (b.p(b1).size() > 0) {
        Iterator<b.a> iterator = b.p(b1).iterator();
        while (iterator.hasNext())
          ((b.a)iterator.next()).c(paramMotionLayout); 
      } 
    } 
    for (b b1 : this.g) {
      if (b.p(b1).size() > 0) {
        Iterator<b.a> iterator = b.p(b1).iterator();
        while (iterator.hasNext())
          ((b.a)iterator.next()).c(paramMotionLayout); 
      } 
    } 
    for (b b1 : this.e) {
      if (b.p(b1).size() > 0) {
        Iterator<b.a> iterator = b.p(b1).iterator();
        while (iterator.hasNext())
          ((b.a)iterator.next()).a(paramMotionLayout, paramInt, b1); 
      } 
    } 
    for (b b1 : this.g) {
      if (b.p(b1).size() > 0) {
        Iterator<b.a> iterator = b.p(b1).iterator();
        while (iterator.hasNext())
          ((b.a)iterator.next()).a(paramMotionLayout, paramInt, b1); 
      } 
    } 
  }
  
  boolean f(MotionLayout paramMotionLayout, int paramInt) {
    if (B())
      return false; 
    if (this.d)
      return false; 
    Iterator<b> iterator = this.e.iterator();
    while (iterator.hasNext()) {
      b b1 = iterator.next();
      if (b.r(b1) == 0 || this.c == b1)
        continue; 
      if (paramInt == b.c(b1) && (b.r(b1) == 4 || b.r(b1) == 2)) {
        MotionLayout.TransitionState transitionState = MotionLayout.TransitionState.e;
        paramMotionLayout.setState(transitionState);
        paramMotionLayout.setTransition(b1);
        if (b.r(b1) == 4) {
          paramMotionLayout.q0();
          paramMotionLayout.setState(MotionLayout.TransitionState.c);
          paramMotionLayout.setState(MotionLayout.TransitionState.d);
        } else {
          paramMotionLayout.setProgress(1.0F);
          paramMotionLayout.Z(true);
          paramMotionLayout.setState(MotionLayout.TransitionState.c);
          paramMotionLayout.setState(MotionLayout.TransitionState.d);
          paramMotionLayout.setState(transitionState);
          paramMotionLayout.l0();
        } 
        return true;
      } 
      if (paramInt == b.a(b1) && (b.r(b1) == 3 || b.r(b1) == 1)) {
        MotionLayout.TransitionState transitionState = MotionLayout.TransitionState.e;
        paramMotionLayout.setState(transitionState);
        paramMotionLayout.setTransition(b1);
        if (b.r(b1) == 3) {
          paramMotionLayout.r0();
          paramMotionLayout.setState(MotionLayout.TransitionState.c);
          paramMotionLayout.setState(MotionLayout.TransitionState.d);
        } else {
          paramMotionLayout.setProgress(0.0F);
          paramMotionLayout.Z(true);
          paramMotionLayout.setState(MotionLayout.TransitionState.c);
          paramMotionLayout.setState(MotionLayout.TransitionState.d);
          paramMotionLayout.setState(transitionState);
          paramMotionLayout.l0();
        } 
        return true;
      } 
    } 
    return false;
  }
  
  public b g(int paramInt, float paramFloat1, float paramFloat2, MotionEvent paramMotionEvent) {
    if (paramInt != -1) {
      List<b> list = z(paramInt);
      float f1 = 0.0F;
      b b1 = null;
      RectF rectF = new RectF();
      for (b b2 : list) {
        if (!b.q(b2) && b.m(b2) != null) {
          b.m(b2).p(this.r);
          RectF rectF1 = b.m(b2).j((ViewGroup)this.a, rectF);
          if (rectF1 != null && paramMotionEvent != null && !rectF1.contains(paramMotionEvent.getX(), paramMotionEvent.getY()))
            continue; 
          rectF1 = b.m(b2).j((ViewGroup)this.a, rectF);
          if (rectF1 != null && paramMotionEvent != null && !rectF1.contains(paramMotionEvent.getX(), paramMotionEvent.getY()))
            continue; 
          float f2 = b.m(b2).a(paramFloat1, paramFloat2);
          if (b.a(b2) == paramInt) {
            f3 = -1.0F;
          } else {
            f3 = 1.1F;
          } 
          float f3 = f2 * f3;
          if (f3 > f1) {
            b1 = b2;
            f1 = f3;
          } 
        } 
      } 
      return b1;
    } 
    return this.c;
  }
  
  public int h() {
    byte b2;
    b b1 = this.c;
    if (b1 != null) {
      b2 = b.k(b1);
    } else {
      b2 = -1;
    } 
    return b2;
  }
  
  androidx.constraintlayout.widget.b i(int paramInt) {
    return j(paramInt, -1, -1);
  }
  
  androidx.constraintlayout.widget.b j(int paramInt1, int paramInt2, int paramInt3) {
    if (this.k) {
      PrintStream printStream = System.out;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("id ");
      stringBuilder.append(paramInt1);
      printStream.println(stringBuilder.toString());
      printStream = System.out;
      stringBuilder = new StringBuilder();
      stringBuilder.append("size ");
      stringBuilder.append(this.h.size());
      printStream.println(stringBuilder.toString());
    } 
    f f1 = this.b;
    int i = paramInt1;
    if (f1 != null) {
      paramInt2 = f1.c(paramInt1, paramInt2, paramInt3);
      i = paramInt1;
      if (paramInt2 != -1)
        i = paramInt2; 
    } 
    if (this.h.get(i) == null) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Warning could not find ConstraintSet id/");
      stringBuilder.append(a.b(this.a.getContext(), i));
      stringBuilder.append(" In MotionScene");
      Log.e("MotionScene", stringBuilder.toString());
      SparseArray<androidx.constraintlayout.widget.b> sparseArray = this.h;
      return (androidx.constraintlayout.widget.b)sparseArray.get(sparseArray.keyAt(0));
    } 
    return (androidx.constraintlayout.widget.b)this.h.get(i);
  }
  
  public int[] k() {
    int i = this.h.size();
    int[] arrayOfInt = new int[i];
    for (byte b1 = 0; b1 < i; b1++)
      arrayOfInt[b1] = this.h.keyAt(b1); 
    return arrayOfInt;
  }
  
  public ArrayList<b> l() {
    return this.e;
  }
  
  public int m() {
    b b1 = this.c;
    return (b1 != null) ? b.j(b1) : this.l;
  }
  
  int n() {
    b b1 = this.c;
    return (b1 == null) ? -1 : b.a(b1);
  }
  
  public Interpolator p() {
    int i = b.g(this.c);
    return (Interpolator)((i != -2) ? ((i != -1) ? ((i != 0) ? ((i != 1) ? ((i != 2) ? ((i != 4) ? ((i != 5) ? null : new BounceInterpolator()) : new AnticipateInterpolator()) : new DecelerateInterpolator()) : new AccelerateInterpolator()) : new AccelerateDecelerateInterpolator()) : new a(this, c.c(b.h(this.c)))) : AnimationUtils.loadInterpolator(this.a.getContext(), b.i(this.c)));
  }
  
  public void q(o paramo) {
    b b1 = this.c;
    if (b1 == null) {
      b1 = this.f;
      if (b1 != null) {
        iterator = b.f(b1).iterator();
        while (iterator.hasNext())
          ((i)iterator.next()).a(paramo); 
      } 
      return;
    } 
    Iterator<i> iterator = b.f((b)iterator).iterator();
    while (iterator.hasNext())
      ((i)iterator.next()).a(paramo); 
  }
  
  float r() {
    b b1 = this.c;
    return (b1 != null && b.m(b1) != null) ? b.m(this.c).f() : 0.0F;
  }
  
  float s() {
    b b1 = this.c;
    return (b1 != null && b.m(b1) != null) ? b.m(this.c).g() : 0.0F;
  }
  
  boolean t() {
    b b1 = this.c;
    return (b1 != null && b.m(b1) != null) ? b.m(this.c).h() : false;
  }
  
  float u(float paramFloat1, float paramFloat2) {
    b b1 = this.c;
    return (b1 != null && b.m(b1) != null) ? b.m(this.c).i(paramFloat1, paramFloat2) : 0.0F;
  }
  
  public float w() {
    b b1 = this.c;
    return (b1 != null) ? b.l(b1) : 0.0F;
  }
  
  int x() {
    b b1 = this.c;
    return (b1 == null) ? -1 : b.c(b1);
  }
  
  public b y(int paramInt) {
    for (b b1 : this.e) {
      if (b.o(b1) == paramInt)
        return b1; 
    } 
    return null;
  }
  
  public List<b> z(int paramInt) {
    paramInt = v(paramInt);
    ArrayList<b> arrayList = new ArrayList();
    for (b b1 : this.e) {
      if (b.c(b1) == paramInt || b.a(b1) == paramInt)
        arrayList.add(b1); 
    } 
    return arrayList;
  }
  
  class a implements Interpolator {
    a(r this$0, c param1c) {}
    
    public float getInterpolation(float param1Float) {
      return (float)this.a.a(param1Float);
    }
  }
  
  public static class b {
    private int a = -1;
    
    private boolean b = false;
    
    private int c = -1;
    
    private int d = -1;
    
    private int e = 0;
    
    private String f = null;
    
    private int g = -1;
    
    private int h = 400;
    
    private float i = 0.0F;
    
    private final r j;
    
    private ArrayList<i> k = new ArrayList<i>();
    
    private u l = null;
    
    private ArrayList<a> m = new ArrayList<a>();
    
    private int n = 0;
    
    private boolean o = false;
    
    private int p = -1;
    
    private int q = 0;
    
    private int r = 0;
    
    b(r param1r, Context param1Context, XmlPullParser param1XmlPullParser) {
      this.h = r.d(param1r);
      this.q = r.a(param1r);
      this.j = param1r;
      w(param1r, param1Context, Xml.asAttributeSet(param1XmlPullParser));
    }
    
    b(r param1r, b param1b) {
      this.j = param1r;
      if (param1b != null) {
        this.p = param1b.p;
        this.e = param1b.e;
        this.f = param1b.f;
        this.g = param1b.g;
        this.h = param1b.h;
        this.k = param1b.k;
        this.i = param1b.i;
        this.q = param1b.q;
      } 
    }
    
    private void v(r param1r, Context param1Context, TypedArray param1TypedArray) {
      int i = param1TypedArray.getIndexCount();
      for (byte b1 = 0; b1 < i; b1++) {
        int j = param1TypedArray.getIndex(b1);
        if (j == e.Transition_constraintSetEnd) {
          this.c = param1TypedArray.getResourceId(j, this.c);
          if ("layout".equals(param1Context.getResources().getResourceTypeName(this.c))) {
            androidx.constraintlayout.widget.b b2 = new androidx.constraintlayout.widget.b();
            b2.w(param1Context, this.c);
            r.b(param1r).append(this.c, b2);
          } 
        } else if (j == e.Transition_constraintSetStart) {
          this.d = param1TypedArray.getResourceId(j, this.d);
          if ("layout".equals(param1Context.getResources().getResourceTypeName(this.d))) {
            androidx.constraintlayout.widget.b b2 = new androidx.constraintlayout.widget.b();
            b2.w(param1Context, this.d);
            r.b(param1r).append(this.d, b2);
          } 
        } else if (j == e.Transition_motionInterpolator) {
          int k = (param1TypedArray.peekValue(j)).type;
          if (k == 1) {
            j = param1TypedArray.getResourceId(j, -1);
            this.g = j;
            if (j != -1)
              this.e = -2; 
          } else if (k == 3) {
            String str = param1TypedArray.getString(j);
            this.f = str;
            if (str.indexOf("/") > 0) {
              this.g = param1TypedArray.getResourceId(j, -1);
              this.e = -2;
            } else {
              this.e = -1;
            } 
          } else {
            this.e = param1TypedArray.getInteger(j, this.e);
          } 
        } else if (j == e.Transition_duration) {
          this.h = param1TypedArray.getInt(j, this.h);
        } else if (j == e.Transition_staggered) {
          this.i = param1TypedArray.getFloat(j, this.i);
        } else if (j == e.Transition_autoTransition) {
          this.n = param1TypedArray.getInteger(j, this.n);
        } else if (j == e.Transition_android_id) {
          this.a = param1TypedArray.getResourceId(j, this.a);
        } else if (j == e.Transition_transitionDisable) {
          this.o = param1TypedArray.getBoolean(j, this.o);
        } else if (j == e.Transition_pathMotionArc) {
          this.p = param1TypedArray.getInteger(j, -1);
        } else if (j == e.Transition_layoutDuringTransition) {
          this.q = param1TypedArray.getInteger(j, 0);
        } else if (j == e.Transition_transitionFlags) {
          this.r = param1TypedArray.getInteger(j, 0);
        } 
      } 
      if (this.d == -1)
        this.b = true; 
    }
    
    private void w(r param1r, Context param1Context, AttributeSet param1AttributeSet) {
      TypedArray typedArray = param1Context.obtainStyledAttributes(param1AttributeSet, e.Transition);
      v(param1r, param1Context, typedArray);
      typedArray.recycle();
    }
    
    public int A() {
      return this.q;
    }
    
    public int B() {
      return this.d;
    }
    
    public u C() {
      return this.l;
    }
    
    public boolean D() {
      return this.o ^ true;
    }
    
    public boolean E(int param1Int) {
      boolean bool;
      if ((param1Int & this.r) != 0) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    public void F(int param1Int) {
      this.h = param1Int;
    }
    
    public void t(Context param1Context, XmlPullParser param1XmlPullParser) {
      this.m.add(new a(param1Context, this, param1XmlPullParser));
    }
    
    public String u(Context param1Context) {
      String str1;
      String str2;
      if (this.d == -1) {
        str2 = "null";
      } else {
        str2 = param1Context.getResources().getResourceEntryName(this.d);
      } 
      if (this.c == -1) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str2);
        stringBuilder.append(" -> null");
        str1 = stringBuilder.toString();
      } else {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str2);
        stringBuilder.append(" -> ");
        stringBuilder.append(str1.getResources().getResourceEntryName(this.c));
        str1 = stringBuilder.toString();
      } 
      return str1;
    }
    
    public int x() {
      return this.n;
    }
    
    public int y() {
      return this.h;
    }
    
    public int z() {
      return this.c;
    }
    
    static class a implements View.OnClickListener {
      private final r.b b;
      
      int c = -1;
      
      int d = 17;
      
      public a(Context param2Context, r.b param2b, XmlPullParser param2XmlPullParser) {
        this.b = param2b;
        TypedArray typedArray = param2Context.obtainStyledAttributes(Xml.asAttributeSet(param2XmlPullParser), e.OnClick);
        int i = typedArray.getIndexCount();
        for (byte b1 = 0; b1 < i; b1++) {
          int j = typedArray.getIndex(b1);
          if (j == e.OnClick_targetId) {
            this.c = typedArray.getResourceId(j, this.c);
          } else if (j == e.OnClick_clickAction) {
            this.d = typedArray.getInt(j, this.d);
          } 
        } 
        typedArray.recycle();
      }
      
      public void a(MotionLayout param2MotionLayout, int param2Int, r.b param2b) {
        View view;
        StringBuilder stringBuilder;
        byte b1;
        boolean bool2;
        int i = this.c;
        if (i != -1)
          view = param2MotionLayout.findViewById(i); 
        if (view == null) {
          stringBuilder = new StringBuilder();
          stringBuilder.append("OnClick could not find id ");
          stringBuilder.append(this.c);
          Log.e("MotionScene", stringBuilder.toString());
          return;
        } 
        int j = r.b.c(param2b);
        int k = r.b.a(param2b);
        if (j == -1) {
          stringBuilder.setOnClickListener(this);
          return;
        } 
        int m = this.d;
        boolean bool1 = false;
        if ((m & 0x1) != 0 && param2Int == j) {
          i = 1;
        } else {
          i = 0;
        } 
        if ((m & 0x100) != 0 && param2Int == j) {
          b1 = 1;
        } else {
          b1 = 0;
        } 
        if ((m & 0x1) != 0 && param2Int == j) {
          j = 1;
        } else {
          j = 0;
        } 
        if ((m & 0x10) != 0 && param2Int == k) {
          bool2 = true;
        } else {
          bool2 = false;
        } 
        boolean bool3 = bool1;
        if ((m & 0x1000) != 0) {
          bool3 = bool1;
          if (param2Int == k)
            bool3 = true; 
        } 
        if ((j | i | b1 | bool2 | bool3) != 0)
          stringBuilder.setOnClickListener(this); 
      }
      
      boolean b(r.b param2b, MotionLayout param2MotionLayout) {
        r.b b1 = this.b;
        boolean bool1 = true;
        boolean bool2 = true;
        if (b1 == param2b)
          return true; 
        int i = r.b.a(b1);
        int j = r.b.c(this.b);
        if (j == -1) {
          if (param2MotionLayout.D == i)
            bool2 = false; 
          return bool2;
        } 
        int k = param2MotionLayout.D;
        bool2 = bool1;
        if (k != j)
          if (k == i) {
            bool2 = bool1;
          } else {
            bool2 = false;
          }  
        return bool2;
      }
      
      public void c(MotionLayout param2MotionLayout) {
        StringBuilder stringBuilder;
        int i = this.c;
        if (i == -1)
          return; 
        View view = param2MotionLayout.findViewById(i);
        if (view == null) {
          stringBuilder = new StringBuilder();
          stringBuilder.append(" (*)  could not find id ");
          stringBuilder.append(this.c);
          Log.e("MotionScene", stringBuilder.toString());
          return;
        } 
        stringBuilder.setOnClickListener(null);
      }
      
      public void onClick(View param2View) {
        boolean bool1;
        boolean bool3;
        int j;
        MotionLayout motionLayout = r.c(r.b.s(this.b));
        if (!motionLayout.j0())
          return; 
        if (r.b.c(this.b) == -1) {
          bool1 = motionLayout.getCurrentState();
          if (bool1 == -1) {
            motionLayout.s0(r.b.a(this.b));
            return;
          } 
          r.b b2 = new r.b(r.b.s(this.b), this.b);
          r.b.d(b2, bool1);
          r.b.b(b2, r.b.a(this.b));
          motionLayout.setTransition(b2);
          motionLayout.q0();
          return;
        } 
        r.b b1 = (r.b.s(this.b)).c;
        int i = this.d;
        boolean bool2 = false;
        if ((i & 0x1) != 0 || (i & 0x100) != 0) {
          bool1 = true;
        } else {
          bool1 = false;
        } 
        if ((i & 0x10) != 0 || (i & 0x1000) != 0) {
          i = 1;
        } else {
          i = 0;
        } 
        if (bool1 && i != 0) {
          bool3 = true;
        } else {
          bool3 = false;
        } 
        if (bool3) {
          r.b b2 = (r.b.s(this.b)).c;
          r.b b3 = this.b;
          if (b2 != b3)
            motionLayout.setTransition(b3); 
          j = i;
          bool3 = bool2;
          if (motionLayout.getCurrentState() != motionLayout.getEndState())
            if (motionLayout.getProgress() > 0.5F) {
              j = i;
              bool3 = bool2;
            } else {
              j = 0;
              bool3 = bool1;
            }  
        } else {
          bool3 = bool1;
          j = i;
        } 
        if (b(b1, motionLayout))
          if (bool3 && (this.d & 0x1) != 0) {
            motionLayout.setTransition(this.b);
            motionLayout.q0();
          } else if (j != 0 && (this.d & 0x10) != 0) {
            motionLayout.setTransition(this.b);
            motionLayout.r0();
          } else if (bool3 && (this.d & 0x100) != 0) {
            motionLayout.setTransition(this.b);
            motionLayout.setProgress(1.0F);
          } else if (j != 0 && (this.d & 0x1000) != 0) {
            motionLayout.setTransition(this.b);
            motionLayout.setProgress(0.0F);
          }  
      }
    }
  }
  
  static class a implements View.OnClickListener {
    private final r.b b;
    
    int c = -1;
    
    int d = 17;
    
    public a(Context param1Context, r.b param1b, XmlPullParser param1XmlPullParser) {
      this.b = param1b;
      TypedArray typedArray = param1Context.obtainStyledAttributes(Xml.asAttributeSet(param1XmlPullParser), e.OnClick);
      int i = typedArray.getIndexCount();
      for (byte b1 = 0; b1 < i; b1++) {
        int j = typedArray.getIndex(b1);
        if (j == e.OnClick_targetId) {
          this.c = typedArray.getResourceId(j, this.c);
        } else if (j == e.OnClick_clickAction) {
          this.d = typedArray.getInt(j, this.d);
        } 
      } 
      typedArray.recycle();
    }
    
    public void a(MotionLayout param1MotionLayout, int param1Int, r.b param1b) {
      View view;
      StringBuilder stringBuilder;
      byte b1;
      boolean bool2;
      int i = this.c;
      if (i != -1)
        view = param1MotionLayout.findViewById(i); 
      if (view == null) {
        stringBuilder = new StringBuilder();
        stringBuilder.append("OnClick could not find id ");
        stringBuilder.append(this.c);
        Log.e("MotionScene", stringBuilder.toString());
        return;
      } 
      int j = r.b.c(param1b);
      int k = r.b.a(param1b);
      if (j == -1) {
        stringBuilder.setOnClickListener(this);
        return;
      } 
      int m = this.d;
      boolean bool1 = false;
      if ((m & 0x1) != 0 && param1Int == j) {
        i = 1;
      } else {
        i = 0;
      } 
      if ((m & 0x100) != 0 && param1Int == j) {
        b1 = 1;
      } else {
        b1 = 0;
      } 
      if ((m & 0x1) != 0 && param1Int == j) {
        j = 1;
      } else {
        j = 0;
      } 
      if ((m & 0x10) != 0 && param1Int == k) {
        bool2 = true;
      } else {
        bool2 = false;
      } 
      boolean bool3 = bool1;
      if ((m & 0x1000) != 0) {
        bool3 = bool1;
        if (param1Int == k)
          bool3 = true; 
      } 
      if ((j | i | b1 | bool2 | bool3) != 0)
        stringBuilder.setOnClickListener(this); 
    }
    
    boolean b(r.b param1b, MotionLayout param1MotionLayout) {
      r.b b1 = this.b;
      boolean bool1 = true;
      boolean bool2 = true;
      if (b1 == param1b)
        return true; 
      int i = r.b.a(b1);
      int j = r.b.c(this.b);
      if (j == -1) {
        if (param1MotionLayout.D == i)
          bool2 = false; 
        return bool2;
      } 
      int k = param1MotionLayout.D;
      bool2 = bool1;
      if (k != j)
        if (k == i) {
          bool2 = bool1;
        } else {
          bool2 = false;
        }  
      return bool2;
    }
    
    public void c(MotionLayout param1MotionLayout) {
      StringBuilder stringBuilder;
      int i = this.c;
      if (i == -1)
        return; 
      View view = param1MotionLayout.findViewById(i);
      if (view == null) {
        stringBuilder = new StringBuilder();
        stringBuilder.append(" (*)  could not find id ");
        stringBuilder.append(this.c);
        Log.e("MotionScene", stringBuilder.toString());
        return;
      } 
      stringBuilder.setOnClickListener(null);
    }
    
    public void onClick(View param1View) {
      boolean bool1;
      boolean bool3;
      int j;
      MotionLayout motionLayout = r.c(r.b.s(this.b));
      if (!motionLayout.j0())
        return; 
      if (r.b.c(this.b) == -1) {
        bool1 = motionLayout.getCurrentState();
        if (bool1 == -1) {
          motionLayout.s0(r.b.a(this.b));
          return;
        } 
        r.b b2 = new r.b(r.b.s(this.b), this.b);
        r.b.d(b2, bool1);
        r.b.b(b2, r.b.a(this.b));
        motionLayout.setTransition(b2);
        motionLayout.q0();
        return;
      } 
      r.b b1 = (r.b.s(this.b)).c;
      int i = this.d;
      boolean bool2 = false;
      if ((i & 0x1) != 0 || (i & 0x100) != 0) {
        bool1 = true;
      } else {
        bool1 = false;
      } 
      if ((i & 0x10) != 0 || (i & 0x1000) != 0) {
        i = 1;
      } else {
        i = 0;
      } 
      if (bool1 && i != 0) {
        bool3 = true;
      } else {
        bool3 = false;
      } 
      if (bool3) {
        r.b b2 = (r.b.s(this.b)).c;
        r.b b3 = this.b;
        if (b2 != b3)
          motionLayout.setTransition(b3); 
        j = i;
        bool3 = bool2;
        if (motionLayout.getCurrentState() != motionLayout.getEndState())
          if (motionLayout.getProgress() > 0.5F) {
            j = i;
            bool3 = bool2;
          } else {
            j = 0;
            bool3 = bool1;
          }  
      } else {
        bool3 = bool1;
        j = i;
      } 
      if (b(b1, motionLayout))
        if (bool3 && (this.d & 0x1) != 0) {
          motionLayout.setTransition(this.b);
          motionLayout.q0();
        } else if (j != 0 && (this.d & 0x10) != 0) {
          motionLayout.setTransition(this.b);
          motionLayout.r0();
        } else if (bool3 && (this.d & 0x100) != 0) {
          motionLayout.setTransition(this.b);
          motionLayout.setProgress(1.0F);
        } else if (j != 0 && (this.d & 0x1000) != 0) {
          motionLayout.setTransition(this.b);
          motionLayout.setProgress(0.0F);
        }  
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/constraintlayout/motion/widget/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */