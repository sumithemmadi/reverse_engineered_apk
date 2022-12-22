package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.core.content.d.g;
import b.e.g;
import b.h.k.w;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import org.xmlpull.v1.XmlPullParser;

public abstract class Transition implements Cloneable {
  private static final int[] b = new int[] { 2, 1, 3, 4 };
  
  private static final PathMotion c = new a();
  
  private static ThreadLocal<b.e.a<Animator, d>> d = new ThreadLocal<b.e.a<Animator, d>>();
  
  boolean A = false;
  
  ArrayList<Animator> B = new ArrayList<Animator>();
  
  private int C = 0;
  
  private boolean D = false;
  
  private boolean E = false;
  
  private ArrayList<f> F = null;
  
  private ArrayList<Animator> G = new ArrayList<Animator>();
  
  w H;
  
  private e I;
  
  private b.e.a<String, String> J;
  
  private PathMotion K = c;
  
  private String e = getClass().getName();
  
  private long f = -1L;
  
  long g = -1L;
  
  private TimeInterpolator h = null;
  
  ArrayList<Integer> i = new ArrayList<Integer>();
  
  ArrayList<View> j = new ArrayList<View>();
  
  private ArrayList<String> k = null;
  
  private ArrayList<Class<?>> l = null;
  
  private ArrayList<Integer> m = null;
  
  private ArrayList<View> n = null;
  
  private ArrayList<Class<?>> o = null;
  
  private ArrayList<String> p = null;
  
  private ArrayList<Integer> q = null;
  
  private ArrayList<View> r = null;
  
  private ArrayList<Class<?>> s = null;
  
  private z t = new z();
  
  private z u = new z();
  
  TransitionSet v = null;
  
  private int[] w = b;
  
  private ArrayList<y> x;
  
  private ArrayList<y> y;
  
  private ViewGroup z = null;
  
  public Transition() {}
  
  @SuppressLint({"RestrictedApi"})
  public Transition(Context paramContext, AttributeSet paramAttributeSet) {
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, t.c);
    XmlResourceParser xmlResourceParser = (XmlResourceParser)paramAttributeSet;
    long l = g.g(typedArray, (XmlPullParser)xmlResourceParser, "duration", 1, -1);
    if (l >= 0L)
      f0(l); 
    l = g.g(typedArray, (XmlPullParser)xmlResourceParser, "startDelay", 2, -1);
    if (l > 0L)
      l0(l); 
    int i = g.h(typedArray, (XmlPullParser)xmlResourceParser, "interpolator", 0, 0);
    if (i > 0)
      h0((TimeInterpolator)AnimationUtils.loadInterpolator(paramContext, i)); 
    String str = g.i(typedArray, (XmlPullParser)xmlResourceParser, "matchOrder", 3);
    if (str != null)
      i0(X(str)); 
    typedArray.recycle();
  }
  
  private static b.e.a<Animator, d> G() {
    b.e.a<Animator, d> a1 = d.get();
    b.e.a<Animator, d> a2 = a1;
    if (a1 == null) {
      a2 = new b.e.a();
      d.set(a2);
    } 
    return a2;
  }
  
  private static boolean P(int paramInt) {
    boolean bool = true;
    if (paramInt < 1 || paramInt > 4)
      bool = false; 
    return bool;
  }
  
  private static boolean R(y paramy1, y paramy2, String paramString) {
    int i;
    paramy1 = (y)paramy1.a.get(paramString);
    paramy2 = (y)paramy2.a.get(paramString);
    byte b = 1;
    if (paramy1 == null && paramy2 == null) {
      i = 0;
    } else {
      i = b;
      if (paramy1 != null)
        if (paramy2 == null) {
          i = b;
        } else {
          i = true ^ paramy1.equals(paramy2);
        }  
    } 
    return i;
  }
  
  private void S(b.e.a<View, y> parama1, b.e.a<View, y> parama2, SparseArray<View> paramSparseArray1, SparseArray<View> paramSparseArray2) {
    int i = paramSparseArray1.size();
    for (byte b = 0; b < i; b++) {
      View view = (View)paramSparseArray1.valueAt(b);
      if (view != null && Q(view)) {
        View view1 = (View)paramSparseArray2.get(paramSparseArray1.keyAt(b));
        if (view1 != null && Q(view1)) {
          y y1 = (y)parama1.get(view);
          y y2 = (y)parama2.get(view1);
          if (y1 != null && y2 != null) {
            this.x.add(y1);
            this.y.add(y2);
            parama1.remove(view);
            parama2.remove(view1);
          } 
        } 
      } 
    } 
  }
  
  private void T(b.e.a<View, y> parama1, b.e.a<View, y> parama2) {
    for (int i = parama1.size() - 1; i >= 0; i--) {
      View view = (View)parama1.i(i);
      if (view != null && Q(view)) {
        y y = (y)parama2.remove(view);
        if (y != null && Q(y.b)) {
          y y1 = (y)parama1.k(i);
          this.x.add(y1);
          this.y.add(y);
        } 
      } 
    } 
  }
  
  private void U(b.e.a<View, y> parama1, b.e.a<View, y> parama2, b.e.d<View> paramd1, b.e.d<View> paramd2) {
    int i = paramd1.s();
    for (byte b = 0; b < i; b++) {
      View view = (View)paramd1.t(b);
      if (view != null && Q(view)) {
        View view1 = (View)paramd2.i(paramd1.m(b));
        if (view1 != null && Q(view1)) {
          y y1 = (y)parama1.get(view);
          y y2 = (y)parama2.get(view1);
          if (y1 != null && y2 != null) {
            this.x.add(y1);
            this.y.add(y2);
            parama1.remove(view);
            parama2.remove(view1);
          } 
        } 
      } 
    } 
  }
  
  private void V(b.e.a<View, y> parama1, b.e.a<View, y> parama2, b.e.a<String, View> parama3, b.e.a<String, View> parama4) {
    int i = parama3.size();
    for (byte b = 0; b < i; b++) {
      View view = (View)parama3.m(b);
      if (view != null && Q(view)) {
        View view1 = (View)parama4.get(parama3.i(b));
        if (view1 != null && Q(view1)) {
          y y1 = (y)parama1.get(view);
          y y2 = (y)parama2.get(view1);
          if (y1 != null && y2 != null) {
            this.x.add(y1);
            this.y.add(y2);
            parama1.remove(view);
            parama2.remove(view1);
          } 
        } 
      } 
    } 
  }
  
  private void W(z paramz1, z paramz2) {
    b.e.a<View, y> a1 = new b.e.a((g)paramz1.a);
    b.e.a<View, y> a2 = new b.e.a((g)paramz2.a);
    byte b = 0;
    while (true) {
      int[] arrayOfInt = this.w;
      if (b < arrayOfInt.length) {
        int i = arrayOfInt[b];
        if (i != 1) {
          if (i != 2) {
            if (i != 3) {
              if (i == 4)
                U(a1, a2, paramz1.c, paramz2.c); 
            } else {
              S(a1, a2, paramz1.b, paramz2.b);
            } 
          } else {
            V(a1, a2, paramz1.d, paramz2.d);
          } 
        } else {
          T(a1, a2);
        } 
        b++;
        continue;
      } 
      f(a1, a2);
      return;
    } 
  }
  
  private static int[] X(String paramString) {
    StringBuilder stringBuilder;
    StringTokenizer stringTokenizer = new StringTokenizer(paramString, ",");
    int[] arrayOfInt = new int[stringTokenizer.countTokens()];
    for (byte b = 0; stringTokenizer.hasMoreTokens(); b++) {
      String str = stringTokenizer.nextToken().trim();
      if ("id".equalsIgnoreCase(str)) {
        arrayOfInt[b] = 3;
      } else if ("instance".equalsIgnoreCase(str)) {
        arrayOfInt[b] = 1;
      } else if ("name".equalsIgnoreCase(str)) {
        arrayOfInt[b] = 2;
      } else if ("itemId".equalsIgnoreCase(str)) {
        arrayOfInt[b] = 4;
      } else {
        int[] arrayOfInt1;
        if (str.isEmpty()) {
          arrayOfInt1 = new int[arrayOfInt.length - 1];
          System.arraycopy(arrayOfInt, 0, arrayOfInt1, 0, b);
          b--;
          arrayOfInt = arrayOfInt1;
        } else {
          stringBuilder = new StringBuilder();
          stringBuilder.append("Unknown match type in matchOrder: '");
          stringBuilder.append((String)arrayOfInt1);
          stringBuilder.append("'");
          throw new InflateException(stringBuilder.toString());
        } 
      } 
    } 
    return (int[])stringBuilder;
  }
  
  private void d0(Animator paramAnimator, b.e.a<Animator, d> parama) {
    if (paramAnimator != null) {
      paramAnimator.addListener((Animator.AnimatorListener)new b(this, parama));
      k(paramAnimator);
    } 
  }
  
  private void f(b.e.a<View, y> parama1, b.e.a<View, y> parama2) {
    byte b3;
    byte b1 = 0;
    byte b2 = 0;
    while (true) {
      b3 = b1;
      if (b2 < parama1.size()) {
        y y = (y)parama1.m(b2);
        if (Q(y.b)) {
          this.x.add(y);
          this.y.add(null);
        } 
        b2++;
        continue;
      } 
      break;
    } 
    while (b3 < parama2.size()) {
      y y = (y)parama2.m(b3);
      if (Q(y.b)) {
        this.y.add(y);
        this.x.add(null);
      } 
      b3++;
    } 
  }
  
  private static void g(z paramz, View paramView, y paramy) {
    paramz.a.put(paramView, paramy);
    int i = paramView.getId();
    if (i >= 0)
      if (paramz.b.indexOfKey(i) >= 0) {
        paramz.b.put(i, null);
      } else {
        paramz.b.put(i, paramView);
      }  
    String str = w.M(paramView);
    if (str != null)
      if (paramz.d.containsKey(str)) {
        paramz.d.put(str, null);
      } else {
        paramz.d.put(str, paramView);
      }  
    if (paramView.getParent() instanceof ListView) {
      ListView listView = (ListView)paramView.getParent();
      if (listView.getAdapter().hasStableIds()) {
        long l = listView.getItemIdAtPosition(listView.getPositionForView(paramView));
        if (paramz.c.l(l) >= 0) {
          paramView = (View)paramz.c.i(l);
          if (paramView != null) {
            w.A0(paramView, false);
            paramz.c.n(l, null);
          } 
        } else {
          w.A0(paramView, true);
          paramz.c.n(l, paramView);
        } 
      } 
    } 
  }
  
  private static boolean i(int[] paramArrayOfint, int paramInt) {
    int i = paramArrayOfint[paramInt];
    for (byte b = 0; b < paramInt; b++) {
      if (paramArrayOfint[b] == i)
        return true; 
    } 
    return false;
  }
  
  private void m(View paramView, boolean paramBoolean) {
    if (paramView == null)
      return; 
    int i = paramView.getId();
    ArrayList<Integer> arrayList2 = this.m;
    if (arrayList2 != null && arrayList2.contains(Integer.valueOf(i)))
      return; 
    ArrayList<View> arrayList1 = this.n;
    if (arrayList1 != null && arrayList1.contains(paramView))
      return; 
    ArrayList<Class<?>> arrayList = this.o;
    byte b = 0;
    if (arrayList != null) {
      int j = arrayList.size();
      for (byte b1 = 0; b1 < j; b1++) {
        if (((Class)this.o.get(b1)).isInstance(paramView))
          return; 
      } 
    } 
    if (paramView.getParent() instanceof ViewGroup) {
      y y = new y(paramView);
      if (paramBoolean) {
        q(y);
      } else {
        l(y);
      } 
      y.c.add(this);
      n(y);
      if (paramBoolean) {
        g(this.t, paramView, y);
      } else {
        g(this.u, paramView, y);
      } 
    } 
    if (paramView instanceof ViewGroup) {
      ArrayList<Integer> arrayList5 = this.q;
      if (arrayList5 != null && arrayList5.contains(Integer.valueOf(i)))
        return; 
      ArrayList<View> arrayList4 = this.r;
      if (arrayList4 != null && arrayList4.contains(paramView))
        return; 
      ArrayList<Class<?>> arrayList3 = this.s;
      if (arrayList3 != null) {
        int j = arrayList3.size();
        for (byte b2 = 0; b2 < j; b2++) {
          if (((Class)this.s.get(b2)).isInstance(paramView))
            return; 
        } 
      } 
      ViewGroup viewGroup = (ViewGroup)paramView;
      for (byte b1 = b; b1 < viewGroup.getChildCount(); b1++)
        m(viewGroup.getChildAt(b1), paramBoolean); 
    } 
  }
  
  public e A() {
    return this.I;
  }
  
  public TimeInterpolator B() {
    return this.h;
  }
  
  y C(View paramView, boolean paramBoolean) {
    y y;
    ArrayList<y> arrayList;
    byte b2;
    TransitionSet transitionSet = this.v;
    if (transitionSet != null)
      return transitionSet.C(paramView, paramBoolean); 
    if (paramBoolean) {
      arrayList = this.x;
    } else {
      arrayList = this.y;
    } 
    View view = null;
    if (arrayList == null)
      return null; 
    int i = arrayList.size();
    byte b1 = -1;
    byte b = 0;
    while (true) {
      b2 = b1;
      if (b < i) {
        y y1 = arrayList.get(b);
        if (y1 == null)
          return null; 
        if (y1.b == paramView) {
          b2 = b;
          break;
        } 
        b++;
        continue;
      } 
      break;
    } 
    paramView = view;
    if (b2 >= 0) {
      ArrayList<y> arrayList1;
      if (paramBoolean) {
        arrayList1 = this.y;
      } else {
        arrayList1 = this.x;
      } 
      y = arrayList1.get(b2);
    } 
    return y;
  }
  
  public String D() {
    return this.e;
  }
  
  public PathMotion E() {
    return this.K;
  }
  
  public w F() {
    return this.H;
  }
  
  public long H() {
    return this.f;
  }
  
  public List<Integer> I() {
    return this.i;
  }
  
  public List<String> J() {
    return this.k;
  }
  
  public List<Class<?>> K() {
    return this.l;
  }
  
  public List<View> L() {
    return this.j;
  }
  
  public String[] M() {
    return null;
  }
  
  public y N(View paramView, boolean paramBoolean) {
    z z1;
    TransitionSet transitionSet = this.v;
    if (transitionSet != null)
      return transitionSet.N(paramView, paramBoolean); 
    if (paramBoolean) {
      z1 = this.t;
    } else {
      z1 = this.u;
    } 
    return (y)z1.a.get(paramView);
  }
  
  public boolean O(y paramy1, y paramy2) {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: iload_3
    //   3: istore #4
    //   5: aload_1
    //   6: ifnull -> 117
    //   9: iload_3
    //   10: istore #4
    //   12: aload_2
    //   13: ifnull -> 117
    //   16: aload_0
    //   17: invokevirtual M : ()[Ljava/lang/String;
    //   20: astore #5
    //   22: aload #5
    //   24: ifnull -> 67
    //   27: aload #5
    //   29: arraylength
    //   30: istore #6
    //   32: iconst_0
    //   33: istore #7
    //   35: iload_3
    //   36: istore #4
    //   38: iload #7
    //   40: iload #6
    //   42: if_icmpge -> 117
    //   45: aload_1
    //   46: aload_2
    //   47: aload #5
    //   49: iload #7
    //   51: aaload
    //   52: invokestatic R : (Landroidx/transition/y;Landroidx/transition/y;Ljava/lang/String;)Z
    //   55: ifeq -> 61
    //   58: goto -> 114
    //   61: iinc #7, 1
    //   64: goto -> 35
    //   67: aload_1
    //   68: getfield a : Ljava/util/Map;
    //   71: invokeinterface keySet : ()Ljava/util/Set;
    //   76: invokeinterface iterator : ()Ljava/util/Iterator;
    //   81: astore #5
    //   83: iload_3
    //   84: istore #4
    //   86: aload #5
    //   88: invokeinterface hasNext : ()Z
    //   93: ifeq -> 117
    //   96: aload_1
    //   97: aload_2
    //   98: aload #5
    //   100: invokeinterface next : ()Ljava/lang/Object;
    //   105: checkcast java/lang/String
    //   108: invokestatic R : (Landroidx/transition/y;Landroidx/transition/y;Ljava/lang/String;)Z
    //   111: ifeq -> 83
    //   114: iconst_1
    //   115: istore #4
    //   117: iload #4
    //   119: ireturn
  }
  
  boolean Q(View paramView) {
    int i = paramView.getId();
    ArrayList<Integer> arrayList3 = this.m;
    if (arrayList3 != null && arrayList3.contains(Integer.valueOf(i)))
      return false; 
    ArrayList<View> arrayList2 = this.n;
    if (arrayList2 != null && arrayList2.contains(paramView))
      return false; 
    ArrayList<Class<?>> arrayList1 = this.o;
    if (arrayList1 != null) {
      int j = arrayList1.size();
      for (byte b = 0; b < j; b++) {
        if (((Class)this.o.get(b)).isInstance(paramView))
          return false; 
      } 
    } 
    if (this.p != null && w.M(paramView) != null && this.p.contains(w.M(paramView)))
      return false; 
    if (this.i.size() == 0 && this.j.size() == 0) {
      arrayList1 = this.l;
      if (arrayList1 == null || arrayList1.isEmpty()) {
        ArrayList<String> arrayList4 = this.k;
        if (arrayList4 == null || arrayList4.isEmpty())
          return true; 
      } 
    } 
    if (this.i.contains(Integer.valueOf(i)) || this.j.contains(paramView))
      return true; 
    ArrayList<String> arrayList = this.k;
    if (arrayList != null && arrayList.contains(w.M(paramView)))
      return true; 
    if (this.l != null)
      for (byte b = 0; b < this.l.size(); b++) {
        if (((Class)this.l.get(b)).isInstance(paramView))
          return true; 
      }  
    return false;
  }
  
  public void Y(View paramView) {
    if (!this.E) {
      b.e.a<Animator, d> a1 = G();
      int i = a1.size();
      t0 t0 = j0.d(paramView);
      while (--i >= 0) {
        d d = (d)a1.m(i);
        if (d.a != null && t0.equals(d.d))
          a.b((Animator)a1.i(i)); 
        i--;
      } 
      ArrayList<f> arrayList = this.F;
      if (arrayList != null && arrayList.size() > 0) {
        arrayList = (ArrayList<f>)this.F.clone();
        int j = arrayList.size();
        for (i = 0; i < j; i++)
          ((f)arrayList.get(i)).b(this); 
      } 
      this.D = true;
    } 
  }
  
  void Z(ViewGroup paramViewGroup) {
    this.x = new ArrayList<y>();
    this.y = new ArrayList<y>();
    W(this.t, this.u);
    b.e.a<Animator, d> a1 = G();
    int i = a1.size();
    t0 t0 = j0.d((View)paramViewGroup);
    while (--i >= 0) {
      Animator animator = (Animator)a1.i(i);
      if (animator != null) {
        d d = (d)a1.get(animator);
        if (d != null && d.a != null && t0.equals(d.d)) {
          boolean bool;
          y y1 = d.c;
          View view = d.a;
          y y2 = N(view, true);
          y y3 = C(view, true);
          y y4 = y3;
          if (y2 == null) {
            y4 = y3;
            if (y3 == null)
              y4 = (y)this.u.a.get(view); 
          } 
          if ((y2 != null || y4 != null) && d.e.O(y1, y4)) {
            bool = true;
          } else {
            bool = false;
          } 
          if (bool)
            if (animator.isRunning() || animator.isStarted()) {
              animator.cancel();
            } else {
              a1.remove(animator);
            }  
        } 
      } 
      i--;
    } 
    w(paramViewGroup, this.t, this.u, this.x, this.y);
    e0();
  }
  
  public Transition a(f paramf) {
    if (this.F == null)
      this.F = new ArrayList<f>(); 
    this.F.add(paramf);
    return this;
  }
  
  public Transition a0(f paramf) {
    ArrayList<f> arrayList = this.F;
    if (arrayList == null)
      return this; 
    arrayList.remove(paramf);
    if (this.F.size() == 0)
      this.F = null; 
    return this;
  }
  
  public Transition b(View paramView) {
    this.j.add(paramView);
    return this;
  }
  
  public Transition b0(View paramView) {
    this.j.remove(paramView);
    return this;
  }
  
  public void c0(View paramView) {
    if (this.D) {
      if (!this.E) {
        b.e.a<Animator, d> a1 = G();
        int i = a1.size();
        t0 t0 = j0.d(paramView);
        while (--i >= 0) {
          d d = (d)a1.m(i);
          if (d.a != null && t0.equals(d.d))
            a.c((Animator)a1.i(i)); 
          i--;
        } 
        ArrayList<f> arrayList = this.F;
        if (arrayList != null && arrayList.size() > 0) {
          arrayList = (ArrayList<f>)this.F.clone();
          int j = arrayList.size();
          for (i = 0; i < j; i++)
            ((f)arrayList.get(i)).e(this); 
        } 
      } 
      this.D = false;
    } 
  }
  
  protected void cancel() {
    int i;
    for (i = this.B.size() - 1; i >= 0; i--)
      ((Animator)this.B.get(i)).cancel(); 
    ArrayList<f> arrayList = this.F;
    if (arrayList != null && arrayList.size() > 0) {
      arrayList = (ArrayList<f>)this.F.clone();
      int j = arrayList.size();
      for (i = 0; i < j; i++)
        ((f)arrayList.get(i)).d(this); 
    } 
  }
  
  protected void e0() {
    m0();
    b.e.a<Animator, d> a1 = G();
    for (Animator animator : this.G) {
      if (a1.containsKey(animator)) {
        m0();
        d0(animator, a1);
      } 
    } 
    this.G.clear();
    x();
  }
  
  public Transition f0(long paramLong) {
    this.g = paramLong;
    return this;
  }
  
  public void g0(e parame) {
    this.I = parame;
  }
  
  public Transition h0(TimeInterpolator paramTimeInterpolator) {
    this.h = paramTimeInterpolator;
    return this;
  }
  
  public void i0(int... paramVarArgs) {
    if (paramVarArgs == null || paramVarArgs.length == 0) {
      this.w = b;
      return;
    } 
    byte b = 0;
    while (b < paramVarArgs.length) {
      if (P(paramVarArgs[b])) {
        if (!i(paramVarArgs, b)) {
          b++;
          continue;
        } 
        throw new IllegalArgumentException("matches contains a duplicate value");
      } 
      throw new IllegalArgumentException("matches contains invalid value");
    } 
    this.w = (int[])paramVarArgs.clone();
  }
  
  public void j0(PathMotion paramPathMotion) {
    if (paramPathMotion == null) {
      this.K = c;
    } else {
      this.K = paramPathMotion;
    } 
  }
  
  protected void k(Animator paramAnimator) {
    if (paramAnimator == null) {
      x();
    } else {
      if (y() >= 0L)
        paramAnimator.setDuration(y()); 
      if (H() >= 0L)
        paramAnimator.setStartDelay(H() + paramAnimator.getStartDelay()); 
      if (B() != null)
        paramAnimator.setInterpolator(B()); 
      paramAnimator.addListener((Animator.AnimatorListener)new c(this));
      paramAnimator.start();
    } 
  }
  
  public void k0(w paramw) {
    this.H = paramw;
  }
  
  public abstract void l(y paramy);
  
  public Transition l0(long paramLong) {
    this.f = paramLong;
    return this;
  }
  
  protected void m0() {
    if (this.C == 0) {
      ArrayList<f> arrayList = this.F;
      if (arrayList != null && arrayList.size() > 0) {
        arrayList = (ArrayList<f>)this.F.clone();
        int i = arrayList.size();
        for (byte b = 0; b < i; b++)
          ((f)arrayList.get(b)).a(this); 
      } 
      this.E = false;
    } 
    this.C++;
  }
  
  void n(y paramy) {
    if (this.H != null && !paramy.a.isEmpty()) {
      String[] arrayOfString = this.H.b();
      if (arrayOfString == null)
        return; 
      boolean bool = false;
      byte b = 0;
      while (true) {
        if (b < arrayOfString.length) {
          if (!paramy.a.containsKey(arrayOfString[b])) {
            b = bool;
            break;
          } 
          b++;
          continue;
        } 
        b = 1;
        break;
      } 
      if (b == 0)
        this.H.a(paramy); 
    } 
  }
  
  String n0(String paramString) {
    // Byte code:
    //   0: new java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: aload_2
    //   9: aload_1
    //   10: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   13: pop
    //   14: aload_2
    //   15: aload_0
    //   16: invokevirtual getClass : ()Ljava/lang/Class;
    //   19: invokevirtual getSimpleName : ()Ljava/lang/String;
    //   22: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   25: pop
    //   26: aload_2
    //   27: ldc_w '@'
    //   30: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   33: pop
    //   34: aload_2
    //   35: aload_0
    //   36: invokevirtual hashCode : ()I
    //   39: invokestatic toHexString : (I)Ljava/lang/String;
    //   42: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   45: pop
    //   46: aload_2
    //   47: ldc_w ': '
    //   50: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   53: pop
    //   54: aload_2
    //   55: invokevirtual toString : ()Ljava/lang/String;
    //   58: astore_1
    //   59: aload_1
    //   60: astore_2
    //   61: aload_0
    //   62: getfield g : J
    //   65: ldc2_w -1
    //   68: lcmp
    //   69: ifeq -> 116
    //   72: new java/lang/StringBuilder
    //   75: dup
    //   76: invokespecial <init> : ()V
    //   79: astore_2
    //   80: aload_2
    //   81: aload_1
    //   82: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   85: pop
    //   86: aload_2
    //   87: ldc_w 'dur('
    //   90: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   93: pop
    //   94: aload_2
    //   95: aload_0
    //   96: getfield g : J
    //   99: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   102: pop
    //   103: aload_2
    //   104: ldc_w ') '
    //   107: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   110: pop
    //   111: aload_2
    //   112: invokevirtual toString : ()Ljava/lang/String;
    //   115: astore_2
    //   116: aload_2
    //   117: astore_1
    //   118: aload_0
    //   119: getfield f : J
    //   122: ldc2_w -1
    //   125: lcmp
    //   126: ifeq -> 173
    //   129: new java/lang/StringBuilder
    //   132: dup
    //   133: invokespecial <init> : ()V
    //   136: astore_1
    //   137: aload_1
    //   138: aload_2
    //   139: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   142: pop
    //   143: aload_1
    //   144: ldc_w 'dly('
    //   147: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   150: pop
    //   151: aload_1
    //   152: aload_0
    //   153: getfield f : J
    //   156: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   159: pop
    //   160: aload_1
    //   161: ldc_w ') '
    //   164: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   167: pop
    //   168: aload_1
    //   169: invokevirtual toString : ()Ljava/lang/String;
    //   172: astore_1
    //   173: aload_1
    //   174: astore_2
    //   175: aload_0
    //   176: getfield h : Landroid/animation/TimeInterpolator;
    //   179: ifnull -> 226
    //   182: new java/lang/StringBuilder
    //   185: dup
    //   186: invokespecial <init> : ()V
    //   189: astore_2
    //   190: aload_2
    //   191: aload_1
    //   192: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   195: pop
    //   196: aload_2
    //   197: ldc_w 'interp('
    //   200: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   203: pop
    //   204: aload_2
    //   205: aload_0
    //   206: getfield h : Landroid/animation/TimeInterpolator;
    //   209: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   212: pop
    //   213: aload_2
    //   214: ldc_w ') '
    //   217: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   220: pop
    //   221: aload_2
    //   222: invokevirtual toString : ()Ljava/lang/String;
    //   225: astore_2
    //   226: aload_0
    //   227: getfield i : Ljava/util/ArrayList;
    //   230: invokevirtual size : ()I
    //   233: ifgt -> 248
    //   236: aload_2
    //   237: astore_1
    //   238: aload_0
    //   239: getfield j : Ljava/util/ArrayList;
    //   242: invokevirtual size : ()I
    //   245: ifle -> 504
    //   248: new java/lang/StringBuilder
    //   251: dup
    //   252: invokespecial <init> : ()V
    //   255: astore_1
    //   256: aload_1
    //   257: aload_2
    //   258: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   261: pop
    //   262: aload_1
    //   263: ldc_w 'tgts('
    //   266: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   269: pop
    //   270: aload_1
    //   271: invokevirtual toString : ()Ljava/lang/String;
    //   274: astore_2
    //   275: aload_0
    //   276: getfield i : Ljava/util/ArrayList;
    //   279: invokevirtual size : ()I
    //   282: istore_3
    //   283: iconst_0
    //   284: istore #4
    //   286: aload_2
    //   287: astore_1
    //   288: iload_3
    //   289: ifle -> 378
    //   292: iconst_0
    //   293: istore_3
    //   294: aload_2
    //   295: astore_1
    //   296: iload_3
    //   297: aload_0
    //   298: getfield i : Ljava/util/ArrayList;
    //   301: invokevirtual size : ()I
    //   304: if_icmpge -> 378
    //   307: aload_2
    //   308: astore_1
    //   309: iload_3
    //   310: ifle -> 340
    //   313: new java/lang/StringBuilder
    //   316: dup
    //   317: invokespecial <init> : ()V
    //   320: astore_1
    //   321: aload_1
    //   322: aload_2
    //   323: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   326: pop
    //   327: aload_1
    //   328: ldc_w ', '
    //   331: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   334: pop
    //   335: aload_1
    //   336: invokevirtual toString : ()Ljava/lang/String;
    //   339: astore_1
    //   340: new java/lang/StringBuilder
    //   343: dup
    //   344: invokespecial <init> : ()V
    //   347: astore_2
    //   348: aload_2
    //   349: aload_1
    //   350: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   353: pop
    //   354: aload_2
    //   355: aload_0
    //   356: getfield i : Ljava/util/ArrayList;
    //   359: iload_3
    //   360: invokevirtual get : (I)Ljava/lang/Object;
    //   363: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   366: pop
    //   367: aload_2
    //   368: invokevirtual toString : ()Ljava/lang/String;
    //   371: astore_2
    //   372: iinc #3, 1
    //   375: goto -> 294
    //   378: aload_1
    //   379: astore_2
    //   380: aload_0
    //   381: getfield j : Ljava/util/ArrayList;
    //   384: invokevirtual size : ()I
    //   387: ifle -> 477
    //   390: iload #4
    //   392: istore_3
    //   393: aload_1
    //   394: astore_2
    //   395: iload_3
    //   396: aload_0
    //   397: getfield j : Ljava/util/ArrayList;
    //   400: invokevirtual size : ()I
    //   403: if_icmpge -> 477
    //   406: aload_1
    //   407: astore_2
    //   408: iload_3
    //   409: ifle -> 439
    //   412: new java/lang/StringBuilder
    //   415: dup
    //   416: invokespecial <init> : ()V
    //   419: astore_2
    //   420: aload_2
    //   421: aload_1
    //   422: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   425: pop
    //   426: aload_2
    //   427: ldc_w ', '
    //   430: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   433: pop
    //   434: aload_2
    //   435: invokevirtual toString : ()Ljava/lang/String;
    //   438: astore_2
    //   439: new java/lang/StringBuilder
    //   442: dup
    //   443: invokespecial <init> : ()V
    //   446: astore_1
    //   447: aload_1
    //   448: aload_2
    //   449: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   452: pop
    //   453: aload_1
    //   454: aload_0
    //   455: getfield j : Ljava/util/ArrayList;
    //   458: iload_3
    //   459: invokevirtual get : (I)Ljava/lang/Object;
    //   462: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   465: pop
    //   466: aload_1
    //   467: invokevirtual toString : ()Ljava/lang/String;
    //   470: astore_1
    //   471: iinc #3, 1
    //   474: goto -> 393
    //   477: new java/lang/StringBuilder
    //   480: dup
    //   481: invokespecial <init> : ()V
    //   484: astore_1
    //   485: aload_1
    //   486: aload_2
    //   487: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   490: pop
    //   491: aload_1
    //   492: ldc_w ')'
    //   495: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   498: pop
    //   499: aload_1
    //   500: invokevirtual toString : ()Ljava/lang/String;
    //   503: astore_1
    //   504: aload_1
    //   505: areturn
  }
  
  public abstract void q(y paramy);
  
  void r(ViewGroup paramViewGroup, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: iload_2
    //   2: invokevirtual s : (Z)V
    //   5: aload_0
    //   6: getfield i : Ljava/util/ArrayList;
    //   9: invokevirtual size : ()I
    //   12: istore_3
    //   13: iconst_0
    //   14: istore #4
    //   16: iload_3
    //   17: ifgt -> 30
    //   20: aload_0
    //   21: getfield j : Ljava/util/ArrayList;
    //   24: invokevirtual size : ()I
    //   27: ifle -> 71
    //   30: aload_0
    //   31: getfield k : Ljava/util/ArrayList;
    //   34: astore #5
    //   36: aload #5
    //   38: ifnull -> 49
    //   41: aload #5
    //   43: invokevirtual isEmpty : ()Z
    //   46: ifeq -> 71
    //   49: aload_0
    //   50: getfield l : Ljava/util/ArrayList;
    //   53: astore #5
    //   55: aload #5
    //   57: ifnull -> 80
    //   60: aload #5
    //   62: invokevirtual isEmpty : ()Z
    //   65: ifeq -> 71
    //   68: goto -> 80
    //   71: aload_0
    //   72: aload_1
    //   73: iload_2
    //   74: invokespecial m : (Landroid/view/View;Z)V
    //   77: goto -> 299
    //   80: iconst_0
    //   81: istore_3
    //   82: iload_3
    //   83: aload_0
    //   84: getfield i : Ljava/util/ArrayList;
    //   87: invokevirtual size : ()I
    //   90: if_icmpge -> 199
    //   93: aload_1
    //   94: aload_0
    //   95: getfield i : Ljava/util/ArrayList;
    //   98: iload_3
    //   99: invokevirtual get : (I)Ljava/lang/Object;
    //   102: checkcast java/lang/Integer
    //   105: invokevirtual intValue : ()I
    //   108: invokevirtual findViewById : (I)Landroid/view/View;
    //   111: astore #6
    //   113: aload #6
    //   115: ifnull -> 193
    //   118: new androidx/transition/y
    //   121: dup
    //   122: aload #6
    //   124: invokespecial <init> : (Landroid/view/View;)V
    //   127: astore #5
    //   129: iload_2
    //   130: ifeq -> 142
    //   133: aload_0
    //   134: aload #5
    //   136: invokevirtual q : (Landroidx/transition/y;)V
    //   139: goto -> 148
    //   142: aload_0
    //   143: aload #5
    //   145: invokevirtual l : (Landroidx/transition/y;)V
    //   148: aload #5
    //   150: getfield c : Ljava/util/ArrayList;
    //   153: aload_0
    //   154: invokevirtual add : (Ljava/lang/Object;)Z
    //   157: pop
    //   158: aload_0
    //   159: aload #5
    //   161: invokevirtual n : (Landroidx/transition/y;)V
    //   164: iload_2
    //   165: ifeq -> 182
    //   168: aload_0
    //   169: getfield t : Landroidx/transition/z;
    //   172: aload #6
    //   174: aload #5
    //   176: invokestatic g : (Landroidx/transition/z;Landroid/view/View;Landroidx/transition/y;)V
    //   179: goto -> 193
    //   182: aload_0
    //   183: getfield u : Landroidx/transition/z;
    //   186: aload #6
    //   188: aload #5
    //   190: invokestatic g : (Landroidx/transition/z;Landroid/view/View;Landroidx/transition/y;)V
    //   193: iinc #3, 1
    //   196: goto -> 82
    //   199: iconst_0
    //   200: istore_3
    //   201: iload_3
    //   202: aload_0
    //   203: getfield j : Ljava/util/ArrayList;
    //   206: invokevirtual size : ()I
    //   209: if_icmpge -> 299
    //   212: aload_0
    //   213: getfield j : Ljava/util/ArrayList;
    //   216: iload_3
    //   217: invokevirtual get : (I)Ljava/lang/Object;
    //   220: checkcast android/view/View
    //   223: astore #5
    //   225: new androidx/transition/y
    //   228: dup
    //   229: aload #5
    //   231: invokespecial <init> : (Landroid/view/View;)V
    //   234: astore_1
    //   235: iload_2
    //   236: ifeq -> 247
    //   239: aload_0
    //   240: aload_1
    //   241: invokevirtual q : (Landroidx/transition/y;)V
    //   244: goto -> 252
    //   247: aload_0
    //   248: aload_1
    //   249: invokevirtual l : (Landroidx/transition/y;)V
    //   252: aload_1
    //   253: getfield c : Ljava/util/ArrayList;
    //   256: aload_0
    //   257: invokevirtual add : (Ljava/lang/Object;)Z
    //   260: pop
    //   261: aload_0
    //   262: aload_1
    //   263: invokevirtual n : (Landroidx/transition/y;)V
    //   266: iload_2
    //   267: ifeq -> 283
    //   270: aload_0
    //   271: getfield t : Landroidx/transition/z;
    //   274: aload #5
    //   276: aload_1
    //   277: invokestatic g : (Landroidx/transition/z;Landroid/view/View;Landroidx/transition/y;)V
    //   280: goto -> 293
    //   283: aload_0
    //   284: getfield u : Landroidx/transition/z;
    //   287: aload #5
    //   289: aload_1
    //   290: invokestatic g : (Landroidx/transition/z;Landroid/view/View;Landroidx/transition/y;)V
    //   293: iinc #3, 1
    //   296: goto -> 201
    //   299: iload_2
    //   300: ifne -> 434
    //   303: aload_0
    //   304: getfield J : Lb/e/a;
    //   307: astore_1
    //   308: aload_1
    //   309: ifnull -> 434
    //   312: aload_1
    //   313: invokevirtual size : ()I
    //   316: istore #7
    //   318: new java/util/ArrayList
    //   321: dup
    //   322: iload #7
    //   324: invokespecial <init> : (I)V
    //   327: astore_1
    //   328: iconst_0
    //   329: istore_3
    //   330: iload #4
    //   332: istore #8
    //   334: iload_3
    //   335: iload #7
    //   337: if_icmpge -> 376
    //   340: aload_0
    //   341: getfield J : Lb/e/a;
    //   344: iload_3
    //   345: invokevirtual i : (I)Ljava/lang/Object;
    //   348: checkcast java/lang/String
    //   351: astore #5
    //   353: aload_1
    //   354: aload_0
    //   355: getfield t : Landroidx/transition/z;
    //   358: getfield d : Lb/e/a;
    //   361: aload #5
    //   363: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   366: invokevirtual add : (Ljava/lang/Object;)Z
    //   369: pop
    //   370: iinc #3, 1
    //   373: goto -> 330
    //   376: iload #8
    //   378: iload #7
    //   380: if_icmpge -> 434
    //   383: aload_1
    //   384: iload #8
    //   386: invokevirtual get : (I)Ljava/lang/Object;
    //   389: checkcast android/view/View
    //   392: astore #6
    //   394: aload #6
    //   396: ifnull -> 428
    //   399: aload_0
    //   400: getfield J : Lb/e/a;
    //   403: iload #8
    //   405: invokevirtual m : (I)Ljava/lang/Object;
    //   408: checkcast java/lang/String
    //   411: astore #5
    //   413: aload_0
    //   414: getfield t : Landroidx/transition/z;
    //   417: getfield d : Lb/e/a;
    //   420: aload #5
    //   422: aload #6
    //   424: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   427: pop
    //   428: iinc #8, 1
    //   431: goto -> 376
    //   434: return
  }
  
  void s(boolean paramBoolean) {
    if (paramBoolean) {
      this.t.a.clear();
      this.t.b.clear();
      this.t.c.b();
    } else {
      this.u.a.clear();
      this.u.b.clear();
      this.u.c.b();
    } 
  }
  
  public Transition t() {
    try {
      Transition transition = (Transition)super.clone();
      ArrayList<Animator> arrayList = new ArrayList();
      this();
      transition.G = arrayList;
      z z1 = new z();
      this();
      transition.t = z1;
      z1 = new z();
      this();
      transition.u = z1;
      transition.x = null;
      transition.y = null;
      return transition;
    } catch (CloneNotSupportedException cloneNotSupportedException) {
      return null;
    } 
  }
  
  public String toString() {
    return n0("");
  }
  
  public Animator v(ViewGroup paramViewGroup, y paramy1, y paramy2) {
    return null;
  }
  
  protected void w(ViewGroup paramViewGroup, z paramz1, z paramz2, ArrayList<y> paramArrayList1, ArrayList<y> paramArrayList2) {
    Object object;
    b.e.a<Animator, d> a1 = G();
    SparseIntArray sparseIntArray = new SparseIntArray();
    int i = paramArrayList1.size();
    long l = Long.MAX_VALUE;
    int j = 0;
    while (j < i) {
      y y2 = paramArrayList1.get(j);
      y y1 = paramArrayList2.get(j);
      y y3 = y2;
      if (y2 != null) {
        y3 = y2;
        if (!y2.c.contains(this))
          y3 = null; 
      } 
      y y4 = y1;
      if (y1 != null) {
        y4 = y1;
        if (!y1.c.contains(this))
          y4 = null; 
      } 
      if (y3 != null || y4 != null) {
        int m;
        if (y3 == null || y4 == null || O(y3, y4)) {
          m = 1;
        } else {
          m = 0;
        } 
        if (m) {
          Animator animator = v(paramViewGroup, y3, y4);
          if (animator != null) {
            y y5;
            View view;
            y y6;
            if (y4 != null) {
              View view1 = y4.b;
              String[] arrayOfString = M();
              if (arrayOfString != null && arrayOfString.length > 0) {
                y6 = new y(view1);
                y2 = (y)paramz2.a.get(view1);
                m = j;
                if (y2 != null) {
                  byte b = 0;
                  while (true) {
                    m = j;
                    if (b < arrayOfString.length) {
                      y6.a.put(arrayOfString[b], y2.a.get(arrayOfString[b]));
                      b++;
                      continue;
                    } 
                    break;
                  } 
                } 
                j = m;
                int n = a1.size();
                m = 0;
                while (true) {
                  if (m < n) {
                    d d = (d)a1.get(a1.i(m));
                    if (d.c != null && d.a == view1 && d.b.equals(D()) && d.c.equals(y6)) {
                      animator = null;
                      y y = y6;
                      break;
                    } 
                    m++;
                    continue;
                  } 
                  y2 = y6;
                  break;
                } 
              } else {
                y2 = null;
              } 
              Animator animator1 = animator;
              y5 = y2;
              view = view1;
            } else {
              view = y3.b;
              y y = null;
              y6 = y5;
              y5 = y;
            } 
            Object object2 = object;
            m = j;
            if (y6 != null) {
              w w1 = this.H;
              object2 = object;
              if (w1 != null) {
                long l1 = w1.c(paramViewGroup, this, y3, y4);
                sparseIntArray.put(this.G.size(), (int)l1);
                l1 = Math.min(l1, object);
              } 
              a1.put(y6, new d(view, D(), this, j0.d((View)paramViewGroup), y5));
              this.G.add(y6);
              m = j;
            } 
            continue;
          } 
        } 
      } 
      Object object1 = object;
      int k = j;
      continue;
      j = SYNTHETIC_LOCAL_VARIABLE_17 + 1;
      object = SYNTHETIC_LOCAL_VARIABLE_15;
    } 
    if (sparseIntArray.size() != 0)
      for (j = 0; j < sparseIntArray.size(); j++) {
        int k = sparseIntArray.keyAt(j);
        Animator animator = this.G.get(k);
        animator.setStartDelay(sparseIntArray.valueAt(j) - object + animator.getStartDelay());
      }  
  }
  
  protected void x() {
    int i = this.C - 1;
    this.C = i;
    if (i == 0) {
      ArrayList<f> arrayList = this.F;
      if (arrayList != null && arrayList.size() > 0) {
        arrayList = (ArrayList<f>)this.F.clone();
        int j = arrayList.size();
        for (i = 0; i < j; i++)
          ((f)arrayList.get(i)).c(this); 
      } 
      for (i = 0; i < this.t.c.s(); i++) {
        View view = (View)this.t.c.t(i);
        if (view != null)
          w.A0(view, false); 
      } 
      for (i = 0; i < this.u.c.s(); i++) {
        View view = (View)this.u.c.t(i);
        if (view != null)
          w.A0(view, false); 
      } 
      this.E = true;
    } 
  }
  
  public long y() {
    return this.g;
  }
  
  public Rect z() {
    e e1 = this.I;
    return (e1 == null) ? null : e1.a(this);
  }
  
  static final class a extends PathMotion {
    public Path a(float param1Float1, float param1Float2, float param1Float3, float param1Float4) {
      Path path = new Path();
      path.moveTo(param1Float1, param1Float2);
      path.lineTo(param1Float3, param1Float4);
      return path;
    }
  }
  
  class b extends AnimatorListenerAdapter {
    b(Transition this$0, b.e.a param1a) {}
    
    public void onAnimationEnd(Animator param1Animator) {
      this.a.remove(param1Animator);
      this.b.B.remove(param1Animator);
    }
    
    public void onAnimationStart(Animator param1Animator) {
      this.b.B.add(param1Animator);
    }
  }
  
  class c extends AnimatorListenerAdapter {
    c(Transition this$0) {}
    
    public void onAnimationEnd(Animator param1Animator) {
      this.a.x();
      param1Animator.removeListener((Animator.AnimatorListener)this);
    }
  }
  
  private static class d {
    View a;
    
    String b;
    
    y c;
    
    t0 d;
    
    Transition e;
    
    d(View param1View, String param1String, Transition param1Transition, t0 param1t0, y param1y) {
      this.a = param1View;
      this.b = param1String;
      this.c = param1y;
      this.d = param1t0;
      this.e = param1Transition;
    }
  }
  
  public static abstract class e {
    public abstract Rect a(Transition param1Transition);
  }
  
  public static interface f {
    void a(Transition param1Transition);
    
    void b(Transition param1Transition);
    
    void c(Transition param1Transition);
    
    void d(Transition param1Transition);
    
    void e(Transition param1Transition);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/transition/Transition.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */