package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import b.h.f.a.a;
import b.h.k.x;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class g implements a {
  private static final int[] a = new int[] { 1, 4, 5, 3, 2, 0 };
  
  private boolean A;
  
  private final Context b;
  
  private final Resources c;
  
  private boolean d;
  
  private boolean e;
  
  private a f;
  
  private ArrayList<i> g;
  
  private ArrayList<i> h;
  
  private boolean i;
  
  private ArrayList<i> j;
  
  private ArrayList<i> k;
  
  private boolean l;
  
  private int m = 0;
  
  private ContextMenu.ContextMenuInfo n;
  
  CharSequence o;
  
  Drawable p;
  
  View q;
  
  private boolean r = false;
  
  private boolean s = false;
  
  private boolean t = false;
  
  private boolean u = false;
  
  private boolean v = false;
  
  private ArrayList<i> w = new ArrayList<i>();
  
  private CopyOnWriteArrayList<WeakReference<m>> x = new CopyOnWriteArrayList<WeakReference<m>>();
  
  private i y;
  
  private boolean z = false;
  
  public g(Context paramContext) {
    this.b = paramContext;
    this.c = paramContext.getResources();
    this.g = new ArrayList<i>();
    this.h = new ArrayList<i>();
    this.i = true;
    this.j = new ArrayList<i>();
    this.k = new ArrayList<i>();
    this.l = true;
    f0(true);
  }
  
  private static int D(int paramInt) {
    int j = (0xFFFF0000 & paramInt) >> 16;
    if (j >= 0) {
      int[] arrayOfInt = a;
      if (j < arrayOfInt.length)
        return paramInt & 0xFFFF | arrayOfInt[j] << 16; 
    } 
    throw new IllegalArgumentException("order does not contain a valid category.");
  }
  
  private void P(int paramInt, boolean paramBoolean) {
    if (paramInt >= 0 && paramInt < this.g.size()) {
      this.g.remove(paramInt);
      if (paramBoolean)
        M(true); 
    } 
  }
  
  private void a0(int paramInt1, CharSequence paramCharSequence, int paramInt2, Drawable paramDrawable, View paramView) {
    Resources resources = E();
    if (paramView != null) {
      this.q = paramView;
      this.o = null;
      this.p = null;
    } else {
      if (paramInt1 > 0) {
        this.o = resources.getText(paramInt1);
      } else if (paramCharSequence != null) {
        this.o = paramCharSequence;
      } 
      if (paramInt2 > 0) {
        this.p = androidx.core.content.a.f(w(), paramInt2);
      } else if (paramDrawable != null) {
        this.p = paramDrawable;
      } 
      this.q = null;
    } 
    M(false);
  }
  
  private void f0(boolean paramBoolean) {
    boolean bool = true;
    if (paramBoolean && (this.c.getConfiguration()).keyboard != 1 && x.f(ViewConfiguration.get(this.b), this.b)) {
      paramBoolean = bool;
    } else {
      paramBoolean = false;
    } 
    this.e = paramBoolean;
  }
  
  private i g(int paramInt1, int paramInt2, int paramInt3, int paramInt4, CharSequence paramCharSequence, int paramInt5) {
    return new i(this, paramInt1, paramInt2, paramInt3, paramInt4, paramCharSequence, paramInt5);
  }
  
  private void i(boolean paramBoolean) {
    if (this.x.isEmpty())
      return; 
    h0();
    for (WeakReference<m> weakReference : this.x) {
      m m = weakReference.get();
      if (m == null) {
        this.x.remove(weakReference);
        continue;
      } 
      m.c(paramBoolean);
    } 
    g0();
  }
  
  private void j(Bundle paramBundle) {
    SparseArray sparseArray = paramBundle.getSparseParcelableArray("android:menu:presenters");
    if (sparseArray != null && !this.x.isEmpty())
      for (WeakReference<m> weakReference : this.x) {
        m m = weakReference.get();
        if (m == null) {
          this.x.remove(weakReference);
          continue;
        } 
        int j = m.getId();
        if (j > 0) {
          Parcelable parcelable = (Parcelable)sparseArray.get(j);
          if (parcelable != null)
            m.i(parcelable); 
        } 
      }  
  }
  
  private void k(Bundle paramBundle) {
    if (this.x.isEmpty())
      return; 
    SparseArray sparseArray = new SparseArray();
    for (WeakReference<m> weakReference : this.x) {
      m m = weakReference.get();
      if (m == null) {
        this.x.remove(weakReference);
        continue;
      } 
      int j = m.getId();
      if (j > 0) {
        Parcelable parcelable = m.k();
        if (parcelable != null)
          sparseArray.put(j, parcelable); 
      } 
    } 
    paramBundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
  }
  
  private boolean l(r paramr, m paramm) {
    boolean bool1 = this.x.isEmpty();
    boolean bool2 = false;
    if (bool1)
      return false; 
    if (paramm != null)
      bool2 = paramm.j(paramr); 
    for (WeakReference<m> weakReference : this.x) {
      m m1 = weakReference.get();
      if (m1 == null) {
        this.x.remove(weakReference);
        continue;
      } 
      if (!bool2)
        bool2 = m1.j(paramr); 
    } 
    return bool2;
  }
  
  private static int p(ArrayList<i> paramArrayList, int paramInt) {
    for (int j = paramArrayList.size() - 1; j >= 0; j--) {
      if (((i)paramArrayList.get(j)).f() <= paramInt)
        return j + 1; 
    } 
    return 0;
  }
  
  public View A() {
    return this.q;
  }
  
  public ArrayList<i> B() {
    t();
    return this.k;
  }
  
  boolean C() {
    return this.u;
  }
  
  Resources E() {
    return this.c;
  }
  
  public g F() {
    return this;
  }
  
  public ArrayList<i> G() {
    if (!this.i)
      return this.h; 
    this.h.clear();
    int j = this.g.size();
    for (byte b = 0; b < j; b++) {
      i i1 = this.g.get(b);
      if (i1.isVisible())
        this.h.add(i1); 
    } 
    this.i = false;
    this.l = true;
    return this.h;
  }
  
  public boolean H() {
    return this.z;
  }
  
  boolean I() {
    return this.d;
  }
  
  public boolean J() {
    return this.e;
  }
  
  void K(i parami) {
    this.l = true;
    M(true);
  }
  
  void L(i parami) {
    this.i = true;
    M(true);
  }
  
  public void M(boolean paramBoolean) {
    if (!this.r) {
      if (paramBoolean) {
        this.i = true;
        this.l = true;
      } 
      i(paramBoolean);
    } else {
      this.s = true;
      if (paramBoolean)
        this.t = true; 
    } 
  }
  
  public boolean N(MenuItem paramMenuItem, int paramInt) {
    return O(paramMenuItem, null, paramInt);
  }
  
  public boolean O(MenuItem paramMenuItem, m paramm, int paramInt) {
    boolean bool;
    boolean bool2;
    i i1 = (i)paramMenuItem;
    if (i1 == null || !i1.isEnabled())
      return false; 
    boolean bool1 = i1.k();
    b.h.k.b b = i1.b();
    if (b != null && b.a()) {
      bool = true;
    } else {
      bool = false;
    } 
    if (i1.j()) {
      bool1 |= i1.expandActionView();
      bool2 = bool1;
      if (bool1) {
        e(true);
        bool2 = bool1;
      } 
    } else {
      if (i1.hasSubMenu() || bool) {
        if ((paramInt & 0x4) == 0)
          e(false); 
        if (!i1.hasSubMenu())
          i1.x(new r(w(), this, i1)); 
        r r = (r)i1.getSubMenu();
        if (bool)
          b.f(r); 
        bool1 |= l(r, paramm);
        boolean bool3 = bool1;
        if (!bool1) {
          e(true);
          bool3 = bool1;
        } 
        return bool3;
      } 
      bool2 = bool1;
      if ((paramInt & 0x1) == 0) {
        e(true);
        bool2 = bool1;
      } 
    } 
    return bool2;
  }
  
  public void Q(m paramm) {
    for (WeakReference<m> weakReference : this.x) {
      m m1 = weakReference.get();
      if (m1 == null || m1 == paramm)
        this.x.remove(weakReference); 
    } 
  }
  
  public void R(Bundle paramBundle) {
    if (paramBundle == null)
      return; 
    SparseArray sparseArray = paramBundle.getSparseParcelableArray(v());
    int j = size();
    int k;
    for (k = 0; k < j; k++) {
      MenuItem menuItem = getItem(k);
      View view = menuItem.getActionView();
      if (view != null && view.getId() != -1)
        view.restoreHierarchyState(sparseArray); 
      if (menuItem.hasSubMenu())
        ((r)menuItem.getSubMenu()).R(paramBundle); 
    } 
    k = paramBundle.getInt("android:menu:expandedactionview");
    if (k > 0) {
      MenuItem menuItem = findItem(k);
      if (menuItem != null)
        menuItem.expandActionView(); 
    } 
  }
  
  public void S(Bundle paramBundle) {
    j(paramBundle);
  }
  
  public void T(Bundle paramBundle) {
    int j = size();
    SparseArray sparseArray = null;
    byte b = 0;
    while (b < j) {
      MenuItem menuItem = getItem(b);
      View view = menuItem.getActionView();
      SparseArray sparseArray1 = sparseArray;
      if (view != null) {
        sparseArray1 = sparseArray;
        if (view.getId() != -1) {
          SparseArray sparseArray2 = sparseArray;
          if (sparseArray == null)
            sparseArray2 = new SparseArray(); 
          view.saveHierarchyState(sparseArray2);
          sparseArray1 = sparseArray2;
          if (menuItem.isActionViewExpanded()) {
            paramBundle.putInt("android:menu:expandedactionview", menuItem.getItemId());
            sparseArray1 = sparseArray2;
          } 
        } 
      } 
      if (menuItem.hasSubMenu())
        ((r)menuItem.getSubMenu()).T(paramBundle); 
      b++;
      sparseArray = sparseArray1;
    } 
    if (sparseArray != null)
      paramBundle.putSparseParcelableArray(v(), sparseArray); 
  }
  
  public void U(Bundle paramBundle) {
    k(paramBundle);
  }
  
  public void V(a parama) {
    this.f = parama;
  }
  
  public g W(int paramInt) {
    this.m = paramInt;
    return this;
  }
  
  void X(MenuItem paramMenuItem) {
    int j = paramMenuItem.getGroupId();
    int k = this.g.size();
    h0();
    for (byte b = 0; b < k; b++) {
      i i1 = this.g.get(b);
      if (i1.getGroupId() == j && i1.m() && i1.isCheckable()) {
        boolean bool;
        if (i1 == paramMenuItem) {
          bool = true;
        } else {
          bool = false;
        } 
        i1.s(bool);
      } 
    } 
    g0();
  }
  
  protected g Y(int paramInt) {
    a0(0, null, paramInt, null, null);
    return this;
  }
  
  protected g Z(Drawable paramDrawable) {
    a0(0, null, 0, paramDrawable, null);
    return this;
  }
  
  protected MenuItem a(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence) {
    int j = D(paramInt3);
    i i1 = g(paramInt1, paramInt2, paramInt3, j, paramCharSequence, this.m);
    ContextMenu.ContextMenuInfo contextMenuInfo = this.n;
    if (contextMenuInfo != null)
      i1.v(contextMenuInfo); 
    ArrayList<i> arrayList = this.g;
    arrayList.add(p(arrayList, j), i1);
    M(true);
    return (MenuItem)i1;
  }
  
  public MenuItem add(int paramInt) {
    return a(0, 0, 0, this.c.getString(paramInt));
  }
  
  public MenuItem add(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return a(paramInt1, paramInt2, paramInt3, this.c.getString(paramInt4));
  }
  
  public MenuItem add(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence) {
    return a(paramInt1, paramInt2, paramInt3, paramCharSequence);
  }
  
  public MenuItem add(CharSequence paramCharSequence) {
    return a(0, 0, 0, paramCharSequence);
  }
  
  public int addIntentOptions(int paramInt1, int paramInt2, int paramInt3, ComponentName paramComponentName, Intent[] paramArrayOfIntent, Intent paramIntent, int paramInt4, MenuItem[] paramArrayOfMenuItem) {
    byte b2;
    PackageManager packageManager = this.b.getPackageManager();
    byte b1 = 0;
    List<ResolveInfo> list = packageManager.queryIntentActivityOptions(paramComponentName, paramArrayOfIntent, paramIntent, 0);
    if (list != null) {
      b2 = list.size();
    } else {
      b2 = 0;
    } 
    byte b3 = b1;
    if ((paramInt4 & 0x1) == 0) {
      removeGroup(paramInt1);
      b3 = b1;
    } 
    while (b3 < b2) {
      ResolveInfo resolveInfo = list.get(b3);
      paramInt4 = resolveInfo.specificIndex;
      if (paramInt4 < 0) {
        intent = paramIntent;
      } else {
        intent = paramArrayOfIntent[paramInt4];
      } 
      Intent intent = new Intent(intent);
      ActivityInfo activityInfo = resolveInfo.activityInfo;
      intent.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
      MenuItem menuItem = add(paramInt1, paramInt2, paramInt3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent);
      if (paramArrayOfMenuItem != null) {
        paramInt4 = resolveInfo.specificIndex;
        if (paramInt4 >= 0)
          paramArrayOfMenuItem[paramInt4] = menuItem; 
      } 
      b3++;
    } 
    return b2;
  }
  
  public SubMenu addSubMenu(int paramInt) {
    return addSubMenu(0, 0, 0, this.c.getString(paramInt));
  }
  
  public SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return addSubMenu(paramInt1, paramInt2, paramInt3, this.c.getString(paramInt4));
  }
  
  public SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence) {
    i i1 = (i)a(paramInt1, paramInt2, paramInt3, paramCharSequence);
    r r = new r(this.b, this, i1);
    i1.x(r);
    return r;
  }
  
  public SubMenu addSubMenu(CharSequence paramCharSequence) {
    return addSubMenu(0, 0, 0, paramCharSequence);
  }
  
  public void b(m paramm) {
    c(paramm, this.b);
  }
  
  protected g b0(int paramInt) {
    a0(paramInt, null, 0, null, null);
    return this;
  }
  
  public void c(m paramm, Context paramContext) {
    this.x.add(new WeakReference<m>(paramm));
    paramm.h(paramContext, this);
    this.l = true;
  }
  
  protected g c0(CharSequence paramCharSequence) {
    a0(0, paramCharSequence, 0, null, null);
    return this;
  }
  
  public void clear() {
    i i1 = this.y;
    if (i1 != null)
      f(i1); 
    this.g.clear();
    M(true);
  }
  
  public void clearHeader() {
    this.p = null;
    this.o = null;
    this.q = null;
    M(false);
  }
  
  public void close() {
    e(true);
  }
  
  public void d() {
    a a1 = this.f;
    if (a1 != null)
      a1.b(this); 
  }
  
  protected g d0(View paramView) {
    a0(0, null, 0, null, paramView);
    return this;
  }
  
  public final void e(boolean paramBoolean) {
    if (this.v)
      return; 
    this.v = true;
    for (WeakReference<m> weakReference : this.x) {
      m m = weakReference.get();
      if (m == null) {
        this.x.remove(weakReference);
        continue;
      } 
      m.b(this, paramBoolean);
    } 
    this.v = false;
  }
  
  public void e0(boolean paramBoolean) {
    this.A = paramBoolean;
  }
  
  public boolean f(i parami) {
    boolean bool1 = this.x.isEmpty();
    boolean bool2 = false;
    boolean bool3 = false;
    boolean bool4 = bool2;
    if (!bool1)
      if (this.y != parami) {
        bool4 = bool2;
      } else {
        h0();
        Iterator<WeakReference<m>> iterator = this.x.iterator();
        bool4 = bool3;
        while (true) {
          bool3 = bool4;
          if (iterator.hasNext()) {
            WeakReference<m> weakReference = iterator.next();
            m m = weakReference.get();
            if (m == null) {
              this.x.remove(weakReference);
              continue;
            } 
            bool3 = m.e(this, parami);
            bool4 = bool3;
            if (bool3)
              break; 
            continue;
          } 
          break;
        } 
        g0();
        bool4 = bool3;
        if (bool3) {
          this.y = null;
          bool4 = bool3;
        } 
      }  
    return bool4;
  }
  
  public MenuItem findItem(int paramInt) {
    int j = size();
    for (byte b = 0; b < j; b++) {
      i i1 = this.g.get(b);
      if (i1.getItemId() == paramInt)
        return (MenuItem)i1; 
      if (i1.hasSubMenu()) {
        MenuItem menuItem = i1.getSubMenu().findItem(paramInt);
        if (menuItem != null)
          return menuItem; 
      } 
    } 
    return null;
  }
  
  public void g0() {
    this.r = false;
    if (this.s) {
      this.s = false;
      M(this.t);
    } 
  }
  
  public MenuItem getItem(int paramInt) {
    return (MenuItem)this.g.get(paramInt);
  }
  
  boolean h(g paramg, MenuItem paramMenuItem) {
    boolean bool;
    a a1 = this.f;
    if (a1 != null && a1.a(paramg, paramMenuItem)) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void h0() {
    if (!this.r) {
      this.r = true;
      this.s = false;
      this.t = false;
    } 
  }
  
  public boolean hasVisibleItems() {
    if (this.A)
      return true; 
    int j = size();
    for (byte b = 0; b < j; b++) {
      if (((i)this.g.get(b)).isVisible())
        return true; 
    } 
    return false;
  }
  
  public boolean isShortcutKey(int paramInt, KeyEvent paramKeyEvent) {
    boolean bool;
    if (r(paramInt, paramKeyEvent) != null) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public boolean m(i parami) {
    boolean bool1 = this.x.isEmpty();
    boolean bool2 = false;
    if (bool1)
      return false; 
    h0();
    Iterator<WeakReference<m>> iterator = this.x.iterator();
    while (true) {
      bool1 = bool2;
      if (iterator.hasNext()) {
        WeakReference<m> weakReference = iterator.next();
        m m = weakReference.get();
        if (m == null) {
          this.x.remove(weakReference);
          continue;
        } 
        bool1 = m.f(this, parami);
        bool2 = bool1;
        if (bool1)
          break; 
        continue;
      } 
      break;
    } 
    g0();
    if (bool1)
      this.y = parami; 
    return bool1;
  }
  
  public int n(int paramInt) {
    return o(paramInt, 0);
  }
  
  public int o(int paramInt1, int paramInt2) {
    int j = size();
    int k = paramInt2;
    if (paramInt2 < 0)
      k = 0; 
    while (k < j) {
      if (((i)this.g.get(k)).getGroupId() == paramInt1)
        return k; 
      k++;
    } 
    return -1;
  }
  
  public boolean performIdentifierAction(int paramInt1, int paramInt2) {
    return N(findItem(paramInt1), paramInt2);
  }
  
  public boolean performShortcut(int paramInt1, KeyEvent paramKeyEvent, int paramInt2) {
    boolean bool;
    i i1 = r(paramInt1, paramKeyEvent);
    if (i1 != null) {
      bool = N((MenuItem)i1, paramInt2);
    } else {
      bool = false;
    } 
    if ((paramInt2 & 0x2) != 0)
      e(true); 
    return bool;
  }
  
  public int q(int paramInt) {
    int j = size();
    for (byte b = 0; b < j; b++) {
      if (((i)this.g.get(b)).getItemId() == paramInt)
        return b; 
    } 
    return -1;
  }
  
  i r(int paramInt, KeyEvent paramKeyEvent) {
    ArrayList<i> arrayList = this.w;
    arrayList.clear();
    s(arrayList, paramInt, paramKeyEvent);
    if (arrayList.isEmpty())
      return null; 
    int j = paramKeyEvent.getMetaState();
    KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
    paramKeyEvent.getKeyData(keyData);
    int k = arrayList.size();
    if (k == 1)
      return arrayList.get(0); 
    boolean bool = I();
    for (byte b = 0; b < k; b++) {
      char c;
      i i1 = arrayList.get(b);
      if (bool) {
        c = i1.getAlphabeticShortcut();
      } else {
        c = i1.getNumericShortcut();
      } 
      char[] arrayOfChar = keyData.meta;
      if ((c == arrayOfChar[0] && (j & 0x2) == 0) || (c == arrayOfChar[2] && (j & 0x2) != 0) || (bool && c == '\b' && paramInt == 67))
        return i1; 
    } 
    return null;
  }
  
  public void removeGroup(int paramInt) {
    int j = n(paramInt);
    if (j >= 0) {
      int k = this.g.size();
      for (byte b = 0; b < k - j && ((i)this.g.get(j)).getGroupId() == paramInt; b++)
        P(j, false); 
      M(true);
    } 
  }
  
  public void removeItem(int paramInt) {
    P(q(paramInt), true);
  }
  
  void s(List<i> paramList, int paramInt, KeyEvent paramKeyEvent) {
    boolean bool = I();
    int j = paramKeyEvent.getModifiers();
    KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
    if (!paramKeyEvent.getKeyData(keyData) && paramInt != 67)
      return; 
    int k = this.g.size();
    for (byte b = 0; b < k; b++) {
      char c;
      int m;
      i i1 = this.g.get(b);
      if (i1.hasSubMenu())
        ((g)i1.getSubMenu()).s(paramList, paramInt, paramKeyEvent); 
      if (bool) {
        c = i1.getAlphabeticShortcut();
      } else {
        c = i1.getNumericShortcut();
      } 
      if (bool) {
        m = i1.getAlphabeticModifiers();
      } else {
        m = i1.getNumericModifiers();
      } 
      if ((j & 0x1100F) == (m & 0x1100F)) {
        m = 1;
      } else {
        m = 0;
      } 
      if (m != 0 && c != '\000') {
        char[] arrayOfChar = keyData.meta;
        if ((c == arrayOfChar[0] || c == arrayOfChar[2] || (bool && c == '\b' && paramInt == 67)) && i1.isEnabled())
          paramList.add(i1); 
      } 
    } 
  }
  
  public void setGroupCheckable(int paramInt, boolean paramBoolean1, boolean paramBoolean2) {
    int j = this.g.size();
    for (byte b = 0; b < j; b++) {
      i i1 = this.g.get(b);
      if (i1.getGroupId() == paramInt) {
        i1.t(paramBoolean2);
        i1.setCheckable(paramBoolean1);
      } 
    } 
  }
  
  public void setGroupDividerEnabled(boolean paramBoolean) {
    this.z = paramBoolean;
  }
  
  public void setGroupEnabled(int paramInt, boolean paramBoolean) {
    int j = this.g.size();
    for (byte b = 0; b < j; b++) {
      i i1 = this.g.get(b);
      if (i1.getGroupId() == paramInt)
        i1.setEnabled(paramBoolean); 
    } 
  }
  
  public void setGroupVisible(int paramInt, boolean paramBoolean) {
    int j = this.g.size();
    byte b = 0;
    boolean bool;
    for (bool = false; b < j; bool = bool1) {
      i i1 = this.g.get(b);
      boolean bool1 = bool;
      if (i1.getGroupId() == paramInt) {
        bool1 = bool;
        if (i1.y(paramBoolean))
          bool1 = true; 
      } 
      b++;
    } 
    if (bool)
      M(true); 
  }
  
  public void setQwertyMode(boolean paramBoolean) {
    this.d = paramBoolean;
    M(false);
  }
  
  public int size() {
    return this.g.size();
  }
  
  public void t() {
    ArrayList<i> arrayList = G();
    if (!this.l)
      return; 
    Iterator<WeakReference<m>> iterator = this.x.iterator();
    boolean bool;
    for (bool = false; iterator.hasNext(); bool |= m.d()) {
      WeakReference<m> weakReference = iterator.next();
      m m = weakReference.get();
      if (m == null) {
        this.x.remove(weakReference);
        continue;
      } 
    } 
    if (bool) {
      this.j.clear();
      this.k.clear();
      int j = arrayList.size();
      for (bool = false; bool < j; bool++) {
        i i1 = arrayList.get(bool);
        if (i1.l()) {
          this.j.add(i1);
        } else {
          this.k.add(i1);
        } 
      } 
    } else {
      this.j.clear();
      this.k.clear();
      this.k.addAll(G());
    } 
    this.l = false;
  }
  
  public ArrayList<i> u() {
    t();
    return this.j;
  }
  
  protected String v() {
    return "android:menu:actionviewstates";
  }
  
  public Context w() {
    return this.b;
  }
  
  public i x() {
    return this.y;
  }
  
  public Drawable y() {
    return this.p;
  }
  
  public CharSequence z() {
    return this.o;
  }
  
  public static interface a {
    boolean a(g param1g, MenuItem param1MenuItem);
    
    void b(g param1g);
  }
  
  public static interface b {
    boolean a(i param1i);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/view/menu/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */