package androidx.fragment.app;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.o;
import b.h.k.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

class t {
  private static final int[] a = new int[] { 
      0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 
      10 };
  
  static final v b;
  
  static final v c = w();
  
  static void A(ArrayList<View> paramArrayList, int paramInt) {
    if (paramArrayList == null)
      return; 
    for (int i = paramArrayList.size() - 1; i >= 0; i--)
      ((View)paramArrayList.get(i)).setVisibility(paramInt); 
  }
  
  static void B(Context paramContext, e parame, ArrayList<a> paramArrayList, ArrayList<Boolean> paramArrayList1, int paramInt1, int paramInt2, boolean paramBoolean, g paramg) {
    SparseArray<h> sparseArray = new SparseArray();
    int i;
    for (i = paramInt1; i < paramInt2; i++) {
      a a = paramArrayList.get(i);
      if (((Boolean)paramArrayList1.get(i)).booleanValue()) {
        e(a, sparseArray, paramBoolean);
      } else {
        c(a, sparseArray, paramBoolean);
      } 
    } 
    if (sparseArray.size() != 0) {
      View view = new View(paramContext);
      int j = sparseArray.size();
      for (i = 0; i < j; i++) {
        int k = sparseArray.keyAt(i);
        b.e.a<String, String> a = d(k, paramArrayList, paramArrayList1, paramInt1, paramInt2);
        h h = (h)sparseArray.valueAt(i);
        if (parame.g()) {
          ViewGroup viewGroup = (ViewGroup)parame.e(k);
          if (viewGroup != null)
            if (paramBoolean) {
              o(viewGroup, h, view, a, paramg);
            } else {
              n(viewGroup, h, view, a, paramg);
            }  
        } 
      } 
    } 
  }
  
  private static void a(ArrayList<View> paramArrayList, b.e.a<String, View> parama, Collection<String> paramCollection) {
    for (int i = parama.size() - 1; i >= 0; i--) {
      View view = (View)parama.m(i);
      if (paramCollection.contains(w.M(view)))
        paramArrayList.add(view); 
    } 
  }
  
  private static void b(a parama, s.a parama1, SparseArray<h> paramSparseArray, boolean paramBoolean1, boolean paramBoolean2) {
    // Byte code:
    //   0: aload_1
    //   1: getfield b : Landroidx/fragment/app/Fragment;
    //   4: astore #5
    //   6: aload #5
    //   8: ifnonnull -> 12
    //   11: return
    //   12: aload #5
    //   14: getfield z : I
    //   17: istore #6
    //   19: iload #6
    //   21: ifne -> 25
    //   24: return
    //   25: iload_3
    //   26: ifeq -> 42
    //   29: getstatic androidx/fragment/app/t.a : [I
    //   32: aload_1
    //   33: getfield a : I
    //   36: iaload
    //   37: istore #7
    //   39: goto -> 48
    //   42: aload_1
    //   43: getfield a : I
    //   46: istore #7
    //   48: iconst_0
    //   49: istore #8
    //   51: iconst_0
    //   52: istore #9
    //   54: iconst_1
    //   55: istore #10
    //   57: iload #7
    //   59: iconst_1
    //   60: if_icmpeq -> 288
    //   63: iload #7
    //   65: iconst_3
    //   66: if_icmpeq -> 200
    //   69: iload #7
    //   71: iconst_4
    //   72: if_icmpeq -> 149
    //   75: iload #7
    //   77: iconst_5
    //   78: if_icmpeq -> 107
    //   81: iload #7
    //   83: bipush #6
    //   85: if_icmpeq -> 200
    //   88: iload #7
    //   90: bipush #7
    //   92: if_icmpeq -> 288
    //   95: iconst_0
    //   96: istore #7
    //   98: iconst_0
    //   99: istore #11
    //   101: iconst_0
    //   102: istore #10
    //   104: goto -> 335
    //   107: iload #4
    //   109: ifeq -> 139
    //   112: aload #5
    //   114: getfield P : Z
    //   117: ifeq -> 325
    //   120: aload #5
    //   122: getfield B : Z
    //   125: ifne -> 325
    //   128: aload #5
    //   130: getfield n : Z
    //   133: ifeq -> 325
    //   136: goto -> 319
    //   139: aload #5
    //   141: getfield B : Z
    //   144: istore #9
    //   146: goto -> 328
    //   149: iload #4
    //   151: ifeq -> 181
    //   154: aload #5
    //   156: getfield P : Z
    //   159: ifeq -> 246
    //   162: aload #5
    //   164: getfield n : Z
    //   167: ifeq -> 246
    //   170: aload #5
    //   172: getfield B : Z
    //   175: ifeq -> 246
    //   178: goto -> 240
    //   181: aload #5
    //   183: getfield n : Z
    //   186: ifeq -> 246
    //   189: aload #5
    //   191: getfield B : Z
    //   194: ifne -> 246
    //   197: goto -> 178
    //   200: iload #4
    //   202: ifeq -> 252
    //   205: aload #5
    //   207: getfield n : Z
    //   210: ifne -> 246
    //   213: aload #5
    //   215: getfield J : Landroid/view/View;
    //   218: astore_1
    //   219: aload_1
    //   220: ifnull -> 246
    //   223: aload_1
    //   224: invokevirtual getVisibility : ()I
    //   227: ifne -> 246
    //   230: aload #5
    //   232: getfield Q : F
    //   235: fconst_0
    //   236: fcmpl
    //   237: iflt -> 246
    //   240: iconst_1
    //   241: istore #7
    //   243: goto -> 271
    //   246: iconst_0
    //   247: istore #7
    //   249: goto -> 271
    //   252: aload #5
    //   254: getfield n : Z
    //   257: ifeq -> 246
    //   260: aload #5
    //   262: getfield B : Z
    //   265: ifne -> 246
    //   268: goto -> 240
    //   271: iload #7
    //   273: istore #10
    //   275: iconst_1
    //   276: istore #11
    //   278: iconst_0
    //   279: istore #7
    //   281: iload #8
    //   283: istore #9
    //   285: goto -> 335
    //   288: iload #4
    //   290: ifeq -> 303
    //   293: aload #5
    //   295: getfield O : Z
    //   298: istore #9
    //   300: goto -> 328
    //   303: aload #5
    //   305: getfield n : Z
    //   308: ifne -> 325
    //   311: aload #5
    //   313: getfield B : Z
    //   316: ifne -> 325
    //   319: iconst_1
    //   320: istore #9
    //   322: goto -> 328
    //   325: iconst_0
    //   326: istore #9
    //   328: iload #10
    //   330: istore #7
    //   332: goto -> 98
    //   335: aload_2
    //   336: iload #6
    //   338: invokevirtual get : (I)Ljava/lang/Object;
    //   341: checkcast androidx/fragment/app/t$h
    //   344: astore #12
    //   346: aload #12
    //   348: astore_1
    //   349: iload #9
    //   351: ifeq -> 379
    //   354: aload #12
    //   356: aload_2
    //   357: iload #6
    //   359: invokestatic p : (Landroidx/fragment/app/t$h;Landroid/util/SparseArray;I)Landroidx/fragment/app/t$h;
    //   362: astore_1
    //   363: aload_1
    //   364: aload #5
    //   366: putfield a : Landroidx/fragment/app/Fragment;
    //   369: aload_1
    //   370: iload_3
    //   371: putfield b : Z
    //   374: aload_1
    //   375: aload_0
    //   376: putfield c : Landroidx/fragment/app/a;
    //   379: iload #4
    //   381: ifne -> 446
    //   384: iload #7
    //   386: ifeq -> 446
    //   389: aload_1
    //   390: ifnull -> 407
    //   393: aload_1
    //   394: getfield d : Landroidx/fragment/app/Fragment;
    //   397: aload #5
    //   399: if_acmpne -> 407
    //   402: aload_1
    //   403: aconst_null
    //   404: putfield d : Landroidx/fragment/app/Fragment;
    //   407: aload_0
    //   408: getfield r : Z
    //   411: ifne -> 446
    //   414: aload_0
    //   415: getfield t : Landroidx/fragment/app/FragmentManager;
    //   418: astore #12
    //   420: aload #12
    //   422: aload #5
    //   424: invokevirtual v : (Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/p;
    //   427: astore #13
    //   429: aload #12
    //   431: invokevirtual s0 : ()Landroidx/fragment/app/r;
    //   434: aload #13
    //   436: invokevirtual p : (Landroidx/fragment/app/p;)V
    //   439: aload #12
    //   441: aload #5
    //   443: invokevirtual Q0 : (Landroidx/fragment/app/Fragment;)V
    //   446: aload_1
    //   447: astore #12
    //   449: iload #10
    //   451: ifeq -> 496
    //   454: aload_1
    //   455: ifnull -> 468
    //   458: aload_1
    //   459: astore #12
    //   461: aload_1
    //   462: getfield d : Landroidx/fragment/app/Fragment;
    //   465: ifnonnull -> 496
    //   468: aload_1
    //   469: aload_2
    //   470: iload #6
    //   472: invokestatic p : (Landroidx/fragment/app/t$h;Landroid/util/SparseArray;I)Landroidx/fragment/app/t$h;
    //   475: astore #12
    //   477: aload #12
    //   479: aload #5
    //   481: putfield d : Landroidx/fragment/app/Fragment;
    //   484: aload #12
    //   486: iload_3
    //   487: putfield e : Z
    //   490: aload #12
    //   492: aload_0
    //   493: putfield f : Landroidx/fragment/app/a;
    //   496: iload #4
    //   498: ifne -> 527
    //   501: iload #11
    //   503: ifeq -> 527
    //   506: aload #12
    //   508: ifnull -> 527
    //   511: aload #12
    //   513: getfield a : Landroidx/fragment/app/Fragment;
    //   516: aload #5
    //   518: if_acmpne -> 527
    //   521: aload #12
    //   523: aconst_null
    //   524: putfield a : Landroidx/fragment/app/Fragment;
    //   527: return
  }
  
  public static void c(a parama, SparseArray<h> paramSparseArray, boolean paramBoolean) {
    int i = parama.c.size();
    for (byte b = 0; b < i; b++)
      b(parama, parama.c.get(b), paramSparseArray, false, paramBoolean); 
  }
  
  private static b.e.a<String, String> d(int paramInt1, ArrayList<a> paramArrayList, ArrayList<Boolean> paramArrayList1, int paramInt2, int paramInt3) {
    b.e.a<String, String> a = new b.e.a();
    while (--paramInt3 >= paramInt2) {
      a a1 = paramArrayList.get(paramInt3);
      if (a1.B(paramInt1)) {
        boolean bool = ((Boolean)paramArrayList1.get(paramInt3)).booleanValue();
        ArrayList<String> arrayList = a1.p;
        if (arrayList != null) {
          ArrayList<String> arrayList1;
          int i = arrayList.size();
          if (bool) {
            arrayList1 = a1.p;
            arrayList = a1.q;
          } else {
            arrayList = a1.p;
            arrayList1 = a1.q;
          } 
          for (byte b = 0; b < i; b++) {
            String str1 = arrayList.get(b);
            String str2 = arrayList1.get(b);
            String str3 = (String)a.remove(str2);
            if (str3 != null) {
              a.put(str1, str3);
            } else {
              a.put(str1, str2);
            } 
          } 
        } 
      } 
      paramInt3--;
    } 
    return a;
  }
  
  public static void e(a parama, SparseArray<h> paramSparseArray, boolean paramBoolean) {
    if (!parama.t.o0().g())
      return; 
    for (int i = parama.c.size() - 1; i >= 0; i--)
      b(parama, parama.c.get(i), paramSparseArray, true, paramBoolean); 
  }
  
  static void f(Fragment paramFragment1, Fragment paramFragment2, boolean paramBoolean1, b.e.a<String, View> parama, boolean paramBoolean2) {
    o o;
    if (paramBoolean1) {
      o = paramFragment2.w();
    } else {
      o = o.w();
    } 
    if (o != null) {
      int i;
      ArrayList<Object> arrayList1 = new ArrayList();
      ArrayList<Object> arrayList2 = new ArrayList();
      byte b = 0;
      if (parama == null) {
        i = 0;
      } else {
        i = parama.size();
      } 
      while (b < i) {
        arrayList2.add(parama.i(b));
        arrayList1.add(parama.m(b));
        b++;
      } 
      if (paramBoolean2)
        throw null; 
      throw null;
    } 
  }
  
  private static boolean g(v paramv, List<Object> paramList) {
    int i = paramList.size();
    for (byte b = 0; b < i; b++) {
      if (!paramv.e(paramList.get(b)))
        return false; 
    } 
    return true;
  }
  
  static b.e.a<String, View> h(v paramv, b.e.a<String, String> parama, Object<String> paramObject, h paramh) {
    o o;
    ArrayList<String> arrayList;
    Fragment fragment = paramh.a;
    View view = fragment.W();
    if (parama.isEmpty() || paramObject == null || view == null) {
      parama.clear();
      return null;
    } 
    b.e.a<String, View> a1 = new b.e.a();
    paramv.j((Map<String, View>)a1, view);
    paramObject = (Object<String>)paramh.c;
    if (paramh.b) {
      o = fragment.z();
      paramObject = (Object<String>)((s)paramObject).p;
    } else {
      o = fragment.w();
      arrayList = ((s)paramObject).q;
    } 
    if (arrayList != null) {
      a1.o(arrayList);
      a1.o(parama.values());
    } 
    if (o == null) {
      x(parama, a1);
      return a1;
    } 
    throw null;
  }
  
  private static b.e.a<String, View> i(v paramv, b.e.a<String, String> parama, Object<String> paramObject, h paramh) {
    o o;
    ArrayList<String> arrayList;
    if (parama.isEmpty() || paramObject == null) {
      parama.clear();
      return null;
    } 
    Fragment fragment = paramh.d;
    b.e.a<String, View> a1 = new b.e.a();
    paramv.j((Map<String, View>)a1, fragment.u1());
    paramObject = (Object<String>)paramh.f;
    if (paramh.e) {
      o = fragment.w();
      paramObject = (Object<String>)((s)paramObject).q;
    } else {
      o = fragment.z();
      arrayList = ((s)paramObject).p;
    } 
    if (arrayList != null)
      a1.o(arrayList); 
    if (o == null) {
      parama.o(a1.keySet());
      return a1;
    } 
    throw null;
  }
  
  private static v j(Fragment paramFragment1, Fragment paramFragment2) {
    ArrayList<Object> arrayList = new ArrayList();
    if (paramFragment1 != null) {
      Object object2 = paramFragment1.y();
      if (object2 != null)
        arrayList.add(object2); 
      object2 = paramFragment1.P();
      if (object2 != null)
        arrayList.add(object2); 
      Object object1 = paramFragment1.R();
      if (object1 != null)
        arrayList.add(object1); 
    } 
    if (paramFragment2 != null) {
      Object object = paramFragment2.v();
      if (object != null)
        arrayList.add(object); 
      object = paramFragment2.N();
      if (object != null)
        arrayList.add(object); 
      object = paramFragment2.Q();
      if (object != null)
        arrayList.add(object); 
    } 
    if (arrayList.isEmpty())
      return null; 
    v v1 = b;
    if (v1 != null && g(v1, arrayList))
      return v1; 
    v v2 = c;
    if (v2 != null && g(v2, arrayList))
      return v2; 
    if (v1 == null && v2 == null)
      return null; 
    throw new IllegalArgumentException("Invalid Transition types");
  }
  
  static ArrayList<View> k(v paramv, Object paramObject, Fragment paramFragment, ArrayList<View> paramArrayList, View paramView) {
    if (paramObject != null) {
      ArrayList<View> arrayList2 = new ArrayList();
      View view = paramFragment.W();
      if (view != null)
        paramv.f(arrayList2, view); 
      if (paramArrayList != null)
        arrayList2.removeAll(paramArrayList); 
      ArrayList<View> arrayList1 = arrayList2;
      if (!arrayList2.isEmpty()) {
        arrayList2.add(paramView);
        paramv.b(paramObject, arrayList2);
        arrayList1 = arrayList2;
      } 
    } else {
      paramFragment = null;
    } 
    return (ArrayList<View>)paramFragment;
  }
  
  private static Object l(v paramv, ViewGroup paramViewGroup, View paramView, b.e.a<String, String> parama, h paramh, ArrayList<View> paramArrayList1, ArrayList<View> paramArrayList2, Object paramObject1, Object paramObject2) {
    Object object;
    Fragment fragment1 = paramh.a;
    Fragment fragment2 = paramh.d;
    if (fragment1 == null || fragment2 == null)
      return null; 
    boolean bool = paramh.b;
    if (parama.isEmpty()) {
      object = null;
    } else {
      object = t(paramv, fragment1, fragment2, bool);
    } 
    b.e.a<String, View> a1 = i(paramv, parama, object, paramh);
    if (parama.isEmpty()) {
      object = null;
    } else {
      paramArrayList1.addAll(a1.values());
    } 
    if (paramObject1 == null && paramObject2 == null && object == null)
      return null; 
    f(fragment1, fragment2, bool, a1, true);
    if (object != null) {
      Rect rect = new Rect();
      paramv.z(object, paramView, paramArrayList1);
      z(paramv, object, paramObject2, a1, paramh.e, paramh.f);
      paramObject2 = rect;
      if (paramObject1 != null) {
        paramv.u(paramObject1, rect);
        paramObject2 = rect;
      } 
    } else {
      paramObject2 = null;
    } 
    b.h.k.t.a((View)paramViewGroup, new f(paramv, parama, object, paramh, paramArrayList2, paramView, fragment1, fragment2, bool, paramArrayList1, paramObject1, (Rect)paramObject2));
    return object;
  }
  
  private static Object m(v paramv, ViewGroup paramViewGroup, View paramView, b.e.a<String, String> parama, h paramh, ArrayList<View> paramArrayList1, ArrayList<View> paramArrayList2, Object paramObject1, Object paramObject2) {
    h h1;
    Object object1;
    Object object2;
    Fragment fragment1 = paramh.a;
    Fragment fragment2 = paramh.d;
    if (fragment1 != null)
      fragment1.u1().setVisibility(0); 
    if (fragment1 == null || fragment2 == null)
      return null; 
    boolean bool = paramh.b;
    if (parama.isEmpty()) {
      object2 = null;
    } else {
      object2 = t(paramv, fragment1, fragment2, bool);
    } 
    b.e.a<String, View> a1 = i(paramv, parama, object2, paramh);
    b.e.a<String, View> a2 = h(paramv, parama, object2, paramh);
    if (parama.isEmpty()) {
      if (a1 != null)
        a1.clear(); 
      if (a2 != null)
        a2.clear(); 
      parama = null;
    } else {
      a(paramArrayList1, a1, parama.keySet());
      a(paramArrayList2, a2, parama.values());
      object1 = object2;
    } 
    if (paramObject1 == null && paramObject2 == null && object1 == null)
      return null; 
    f(fragment1, fragment2, bool, a1, true);
    if (object1 != null) {
      paramArrayList2.add(paramView);
      paramv.z(object1, paramView, paramArrayList1);
      z(paramv, object1, paramObject2, a1, paramh.e, paramh.f);
      Rect rect = new Rect();
      View view = s(a2, paramh, paramObject1, bool);
      if (view != null)
        paramv.u(paramObject1, rect); 
    } else {
      paramh = null;
      h1 = paramh;
    } 
    b.h.k.t.a((View)paramViewGroup, new e(fragment1, fragment2, bool, a2, (View)paramh, paramv, (Rect)h1));
    return object1;
  }
  
  private static void n(ViewGroup paramViewGroup, h paramh, View paramView, b.e.a<String, String> parama, g paramg) {
    Fragment fragment1 = paramh.a;
    Fragment fragment2 = paramh.d;
    v v1 = j(fragment2, fragment1);
    if (v1 == null)
      return; 
    boolean bool1 = paramh.b;
    boolean bool2 = paramh.e;
    Object object2 = q(v1, fragment1, bool1);
    Object object3 = r(v1, fragment2, bool2);
    ArrayList<View> arrayList1 = new ArrayList();
    ArrayList<View> arrayList2 = new ArrayList();
    Object object4 = l(v1, paramViewGroup, paramView, parama, paramh, arrayList1, arrayList2, object2, object3);
    if (object2 == null && object4 == null && object3 == null)
      return; 
    ArrayList<View> arrayList3 = k(v1, object3, fragment2, arrayList1, paramView);
    if (arrayList3 == null || arrayList3.isEmpty())
      object3 = null; 
    v1.a(object2, paramView);
    Object object1 = u(v1, object2, object3, object4, fragment1, paramh.b);
    if (fragment2 != null && arrayList3 != null && (arrayList3.size() > 0 || arrayList1.size() > 0)) {
      androidx.core.os.b b = new androidx.core.os.b();
      paramg.b(fragment2, b);
      v1.w(fragment2, object1, b, new c(paramg, fragment2, b));
    } 
    if (object1 != null) {
      ArrayList<View> arrayList = new ArrayList();
      v1.t(object1, object2, arrayList, object3, arrayList3, object4, arrayList2);
      y(v1, paramViewGroup, fragment1, paramView, arrayList2, object2, arrayList, object3, arrayList3);
      v1.x((View)paramViewGroup, arrayList2, (Map<String, String>)parama);
      v1.c(paramViewGroup, object1);
      v1.s(paramViewGroup, arrayList2, (Map<String, String>)parama);
    } 
  }
  
  private static void o(ViewGroup paramViewGroup, h paramh, View paramView, b.e.a<String, String> parama, g paramg) {
    Fragment fragment1 = paramh.a;
    Fragment fragment2 = paramh.d;
    v v1 = j(fragment2, fragment1);
    if (v1 == null)
      return; 
    boolean bool1 = paramh.b;
    boolean bool2 = paramh.e;
    ArrayList<View> arrayList2 = new ArrayList();
    ArrayList<View> arrayList3 = new ArrayList();
    Object object3 = q(v1, fragment1, bool1);
    Object<View> object4 = (Object<View>)r(v1, fragment2, bool2);
    Object object5 = m(v1, paramViewGroup, paramView, parama, paramh, arrayList3, arrayList2, object3, object4);
    if (object3 == null && object5 == null && object4 == null)
      return; 
    Object<View> object1 = object4;
    object4 = (Object<View>)k(v1, object1, fragment2, arrayList3, paramView);
    ArrayList<View> arrayList1 = k(v1, object3, fragment1, arrayList2, paramView);
    A(arrayList1, 4);
    Object object2 = u(v1, object3, object1, object5, fragment1, bool1);
    if (fragment2 != null && object4 != null && (object4.size() > 0 || arrayList3.size() > 0)) {
      androidx.core.os.b b = new androidx.core.os.b();
      paramg.b(fragment2, b);
      v1.w(fragment2, object2, b, new a(paramg, fragment2, b));
    } 
    if (object2 != null) {
      v(v1, object1, fragment2, (ArrayList<View>)object4);
      ArrayList<String> arrayList = v1.o(arrayList2);
      v1.t(object2, object3, arrayList1, object1, (ArrayList<View>)object4, object5, arrayList2);
      v1.c(paramViewGroup, object2);
      v1.y((View)paramViewGroup, arrayList3, arrayList2, arrayList, (Map<String, String>)parama);
      A(arrayList1, 0);
      v1.A(object5, arrayList3, arrayList2);
    } 
  }
  
  private static h p(h paramh, SparseArray<h> paramSparseArray, int paramInt) {
    h h1 = paramh;
    if (paramh == null) {
      h1 = new h();
      paramSparseArray.put(paramInt, h1);
    } 
    return h1;
  }
  
  private static Object q(v paramv, Fragment paramFragment, boolean paramBoolean) {
    Object object;
    if (paramFragment == null)
      return null; 
    if (paramBoolean) {
      object = paramFragment.N();
    } else {
      object = object.v();
    } 
    return paramv.g(object);
  }
  
  private static Object r(v paramv, Fragment paramFragment, boolean paramBoolean) {
    Object object;
    if (paramFragment == null)
      return null; 
    if (paramBoolean) {
      object = paramFragment.P();
    } else {
      object = object.y();
    } 
    return paramv.g(object);
  }
  
  static View s(b.e.a<String, View> parama, h paramh, Object<String> paramObject, boolean paramBoolean) {
    a a1 = paramh.c;
    if (paramObject != null && parama != null) {
      paramObject = (Object<String>)a1.p;
      if (paramObject != null && !paramObject.isEmpty()) {
        String str;
        if (paramBoolean) {
          str = a1.p.get(0);
        } else {
          str = ((s)str).q.get(0);
        } 
        return (View)parama.get(str);
      } 
    } 
    return null;
  }
  
  private static Object t(v paramv, Fragment paramFragment1, Fragment paramFragment2, boolean paramBoolean) {
    Object object;
    if (paramFragment1 == null || paramFragment2 == null)
      return null; 
    if (paramBoolean) {
      object = paramFragment2.R();
    } else {
      object = object.Q();
    } 
    return paramv.B(paramv.g(object));
  }
  
  private static Object u(v paramv, Object paramObject1, Object paramObject2, Object paramObject3, Fragment paramFragment, boolean paramBoolean) {
    Object object;
    if (paramObject1 != null && paramObject2 != null && paramFragment != null) {
      if (paramBoolean) {
        paramBoolean = paramFragment.o();
      } else {
        paramBoolean = paramFragment.n();
      } 
    } else {
      paramBoolean = true;
    } 
    if (paramBoolean) {
      object = paramv.n(paramObject2, paramObject1, paramObject3);
    } else {
      object = object.m(paramObject2, paramObject1, paramObject3);
    } 
    return object;
  }
  
  private static void v(v paramv, Object paramObject, Fragment paramFragment, ArrayList<View> paramArrayList) {
    if (paramFragment != null && paramObject != null && paramFragment.n && paramFragment.B && paramFragment.P) {
      paramFragment.D1(true);
      paramv.r(paramObject, paramFragment.W(), paramArrayList);
      b.h.k.t.a((View)paramFragment.I, new b(paramArrayList));
    } 
  }
  
  private static v w() {
    try {
      return Class.forName("androidx.transition.e").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
    } catch (Exception exception) {
      return null;
    } 
  }
  
  static void x(b.e.a<String, String> parama, b.e.a<String, View> parama1) {
    for (int i = parama.size() - 1; i >= 0; i--) {
      if (!parama1.containsKey(parama.m(i)))
        parama.k(i); 
    } 
  }
  
  private static void y(v paramv, ViewGroup paramViewGroup, Fragment paramFragment, View paramView, ArrayList<View> paramArrayList1, Object paramObject1, ArrayList<View> paramArrayList2, Object paramObject2, ArrayList<View> paramArrayList3) {
    b.h.k.t.a((View)paramViewGroup, new d(paramObject1, paramv, paramView, paramFragment, paramArrayList1, paramArrayList2, paramArrayList3, paramObject2));
  }
  
  private static void z(v paramv, Object paramObject1, Object paramObject2, b.e.a<String, View> parama, boolean paramBoolean, a parama1) {
    ArrayList<String> arrayList = parama1.p;
    if (arrayList != null && !arrayList.isEmpty()) {
      String str;
      if (paramBoolean) {
        str = parama1.q.get(0);
      } else {
        str = ((s)str).p.get(0);
      } 
      View view = (View)parama.get(str);
      paramv.v(paramObject1, view);
      if (paramObject2 != null)
        paramv.v(paramObject2, view); 
    } 
  }
  
  static {
    v v1;
  }
  
  static {
    if (Build.VERSION.SDK_INT >= 21) {
      v1 = new u();
    } else {
      v1 = null;
    } 
    b = v1;
  }
  
  class a implements Runnable {
    a(t this$0, Fragment param1Fragment, androidx.core.os.b param1b) {}
    
    public void run() {
      this.b.a(this.c, this.d);
    }
  }
  
  class b implements Runnable {
    b(t this$0) {}
    
    public void run() {
      t.A(this.b, 4);
    }
  }
  
  class c implements Runnable {
    c(t this$0, Fragment param1Fragment, androidx.core.os.b param1b) {}
    
    public void run() {
      this.b.a(this.c, this.d);
    }
  }
  
  class d implements Runnable {
    d(t this$0, v param1v, View param1View, Fragment param1Fragment, ArrayList param1ArrayList1, ArrayList param1ArrayList2, ArrayList param1ArrayList3, Object param1Object1) {}
    
    public void run() {
      Object<View> object = (Object<View>)this.b;
      if (object != null) {
        this.c.p(object, this.d);
        object = (Object<View>)t.k(this.c, this.b, this.e, this.f, this.d);
        this.g.addAll((Collection<? extends View>)object);
      } 
      if (this.h != null) {
        if (this.i != null) {
          object = (Object<View>)new ArrayList();
          object.add(this.d);
          this.c.q(this.i, this.h, (ArrayList<View>)object);
        } 
        this.h.clear();
        this.h.add(this.d);
      } 
    }
  }
  
  class e implements Runnable {
    e(t this$0, Fragment param1Fragment1, boolean param1Boolean, b.e.a param1a, View param1View, v param1v, Rect param1Rect) {}
    
    public void run() {
      t.f(this.b, this.c, this.d, this.e, false);
      View view = this.f;
      if (view != null)
        this.g.k(view, this.h); 
    }
  }
  
  class f implements Runnable {
    f(t this$0, b.e.a param1a, Object param1Object1, t.h param1h, ArrayList param1ArrayList1, View param1View, Fragment param1Fragment1, Fragment param1Fragment2, boolean param1Boolean, ArrayList param1ArrayList2, Object param1Object2, Rect param1Rect) {}
    
    public void run() {
      b.e.a<String, View> a1 = t.h(this.b, this.c, this.d, this.e);
      if (a1 != null) {
        this.f.addAll(a1.values());
        this.f.add(this.g);
      } 
      t.f(this.h, this.i, this.j, a1, false);
      Object object = this.d;
      if (object != null) {
        this.b.A(object, this.k, this.f);
        View view = t.s(a1, this.e, this.l, this.j);
        if (view != null)
          this.b.k(view, this.m); 
      } 
    }
  }
  
  static interface g {
    void a(Fragment param1Fragment, androidx.core.os.b param1b);
    
    void b(Fragment param1Fragment, androidx.core.os.b param1b);
  }
  
  static class h {
    public Fragment a;
    
    public boolean b;
    
    public a c;
    
    public Fragment d;
    
    public boolean e;
    
    public a f;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/fragment/app/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */