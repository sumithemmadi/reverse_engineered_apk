package b.a.o;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.e0;
import androidx.appcompat.widget.q;
import b.a.j;
import b.h.k.i;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class g extends MenuInflater {
  static final Class<?>[] a;
  
  static final Class<?>[] b;
  
  final Object[] c;
  
  final Object[] d;
  
  Context e;
  
  private Object f;
  
  static {
    Class[] arrayOfClass = new Class[1];
    arrayOfClass[0] = Context.class;
    a = arrayOfClass;
    b = arrayOfClass;
  }
  
  public g(Context paramContext) {
    super(paramContext);
    this.e = paramContext;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramContext;
    this.c = arrayOfObject;
    this.d = arrayOfObject;
  }
  
  private Object a(Object paramObject) {
    if (paramObject instanceof android.app.Activity)
      return paramObject; 
    Object object = paramObject;
    if (paramObject instanceof ContextWrapper)
      object = a(((ContextWrapper)paramObject).getBaseContext()); 
    return object;
  }
  
  private void c(XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Menu paramMenu) {
    StringBuilder stringBuilder;
    b b = new b(this, paramMenu);
    int i = paramXmlPullParser.getEventType();
    while (true) {
      if (i == 2) {
        String str = paramXmlPullParser.getName();
        if (str.equals("menu")) {
          i = paramXmlPullParser.next();
          break;
        } 
        stringBuilder = new StringBuilder();
        stringBuilder.append("Expecting menu, got ");
        stringBuilder.append(str);
        throw new RuntimeException(stringBuilder.toString());
      } 
      int k = stringBuilder.next();
      i = k;
      if (k == 1) {
        i = k;
        break;
      } 
    } 
    Menu menu = null;
    boolean bool = false;
    int j = 0;
    while (!bool) {
      if (i != 1) {
        Menu menu1;
        boolean bool1;
        if (i != 2) {
          if (i != 3) {
            bool1 = bool;
            i = j;
            paramMenu = menu;
          } else {
            String str = stringBuilder.getName();
            if (j && str.equals(menu)) {
              paramMenu = null;
              i = 0;
              bool1 = bool;
            } else if (str.equals("group")) {
              b.h();
              bool1 = bool;
              i = j;
              paramMenu = menu;
            } else if (str.equals("item")) {
              bool1 = bool;
              i = j;
              paramMenu = menu;
              if (!b.d()) {
                b.h.k.b b1 = b.A;
                if (b1 != null && b1.a()) {
                  b.b();
                  bool1 = bool;
                  i = j;
                  menu1 = menu;
                } else {
                  b.a();
                  bool1 = bool;
                  i = j;
                  menu1 = menu;
                } 
              } 
            } else {
              bool1 = bool;
              i = j;
              paramMenu = menu;
              if (str.equals("menu")) {
                bool1 = true;
                i = j;
                paramMenu = menu;
              } 
            } 
          } 
        } else if (j) {
          bool1 = bool;
          i = j;
          paramMenu = menu;
        } else {
          String str = stringBuilder.getName();
          if (str.equals("group")) {
            b.f(paramAttributeSet);
            bool1 = bool;
            i = j;
            menu1 = menu;
          } else if (menu1.equals("item")) {
            b.g(paramAttributeSet);
            bool1 = bool;
            i = j;
            menu1 = menu;
          } else if (menu1.equals("menu")) {
            c((XmlPullParser)stringBuilder, paramAttributeSet, (Menu)b.b());
            bool1 = bool;
            i = j;
            menu1 = menu;
          } else {
            i = 1;
            bool1 = bool;
          } 
        } 
        int k = stringBuilder.next();
        bool = bool1;
        j = i;
        menu = menu1;
        i = k;
        continue;
      } 
      throw new RuntimeException("Unexpected end of document");
    } 
  }
  
  Object b() {
    if (this.f == null)
      this.f = a(this.e); 
    return this.f;
  }
  
  public void inflate(int paramInt, Menu paramMenu) {
    XmlPullParserException xmlPullParserException2;
    if (!(paramMenu instanceof b.h.f.a.a)) {
      super.inflate(paramInt, paramMenu);
      return;
    } 
    XmlResourceParser xmlResourceParser1 = null;
    XmlResourceParser xmlResourceParser2 = null;
    XmlResourceParser xmlResourceParser3 = null;
    try {
      XmlResourceParser xmlResourceParser = this.e.getResources().getLayout(paramInt);
      xmlResourceParser3 = xmlResourceParser;
      xmlResourceParser1 = xmlResourceParser;
      xmlResourceParser2 = xmlResourceParser;
      c((XmlPullParser)xmlResourceParser, Xml.asAttributeSet((XmlPullParser)xmlResourceParser), paramMenu);
      if (xmlResourceParser != null)
        xmlResourceParser.close(); 
      return;
    } catch (XmlPullParserException xmlPullParserException1) {
      xmlResourceParser3 = xmlResourceParser2;
      InflateException inflateException = new InflateException();
      xmlResourceParser3 = xmlResourceParser2;
      this("Error inflating menu XML", (Throwable)xmlPullParserException1);
      xmlResourceParser3 = xmlResourceParser2;
      throw inflateException;
    } catch (IOException iOException) {
      xmlPullParserException2 = xmlPullParserException1;
      InflateException inflateException = new InflateException();
      xmlPullParserException2 = xmlPullParserException1;
      this("Error inflating menu XML", iOException);
      xmlPullParserException2 = xmlPullParserException1;
      throw inflateException;
    } finally {}
    if (xmlPullParserException2 != null)
      xmlPullParserException2.close(); 
    throw paramMenu;
  }
  
  private static class a implements MenuItem.OnMenuItemClickListener {
    private static final Class<?>[] a = new Class[] { MenuItem.class };
    
    private Object b;
    
    private Method c;
    
    public a(Object param1Object, String param1String) {
      this.b = param1Object;
      Class<?> clazz = param1Object.getClass();
      try {
        this.c = clazz.getMethod(param1String, a);
        return;
      } catch (Exception exception) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Couldn't resolve menu item onClick handler ");
        stringBuilder.append(param1String);
        stringBuilder.append(" in class ");
        stringBuilder.append(clazz.getName());
        InflateException inflateException = new InflateException(stringBuilder.toString());
        inflateException.initCause(exception);
        throw inflateException;
      } 
    }
    
    public boolean onMenuItemClick(MenuItem param1MenuItem) {
      try {
        if (this.c.getReturnType() == boolean.class)
          return ((Boolean)this.c.invoke(this.b, new Object[] { param1MenuItem })).booleanValue(); 
        this.c.invoke(this.b, new Object[] { param1MenuItem });
        return true;
      } catch (Exception exception) {
        throw new RuntimeException(exception);
      } 
    }
  }
  
  private class b {
    b.h.k.b A;
    
    private CharSequence B;
    
    private CharSequence C;
    
    private ColorStateList D = null;
    
    private PorterDuff.Mode E = null;
    
    private Menu a;
    
    private int b;
    
    private int c;
    
    private int d;
    
    private int e;
    
    private boolean f;
    
    private boolean g;
    
    private boolean h;
    
    private int i;
    
    private int j;
    
    private CharSequence k;
    
    private CharSequence l;
    
    private int m;
    
    private char n;
    
    private int o;
    
    private char p;
    
    private int q;
    
    private int r;
    
    private boolean s;
    
    private boolean t;
    
    private boolean u;
    
    private int v;
    
    private int w;
    
    private String x;
    
    private String y;
    
    private String z;
    
    public b(g this$0, Menu param1Menu) {
      this.a = param1Menu;
      h();
    }
    
    private char c(String param1String) {
      return (param1String == null) ? Character.MIN_VALUE : param1String.charAt(0);
    }
    
    private <T> T e(String param1String, Class<?>[] param1ArrayOfClass, Object[] param1ArrayOfObject) {
      try {
        null = Class.forName(param1String, false, this.F.e.getClassLoader()).getConstructor(param1ArrayOfClass);
        null.setAccessible(true);
        return (T)null.newInstance(param1ArrayOfObject);
      } catch (Exception exception) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot instantiate class: ");
        stringBuilder.append(param1String);
        Log.w("SupportMenuInflater", stringBuilder.toString(), exception);
        return null;
      } 
    }
    
    private void i(MenuItem param1MenuItem) {
      boolean bool2;
      MenuItem menuItem = param1MenuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u);
      int i = this.r;
      boolean bool1 = false;
      if (i >= 1) {
        bool2 = true;
      } else {
        bool2 = false;
      } 
      menuItem.setCheckable(bool2).setTitleCondensed(this.l).setIcon(this.m);
      i = this.v;
      if (i >= 0)
        param1MenuItem.setShowAsAction(i); 
      if (this.z != null)
        if (!this.F.e.isRestricted()) {
          param1MenuItem.setOnMenuItemClickListener(new g.a(this.F.b(), this.z));
        } else {
          throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
        }  
      if (this.r >= 2)
        if (param1MenuItem instanceof i) {
          ((i)param1MenuItem).t(true);
        } else if (param1MenuItem instanceof j) {
          ((j)param1MenuItem).h(true);
        }  
      String str = this.x;
      if (str != null) {
        param1MenuItem.setActionView(e(str, g.a, this.F.c));
        bool1 = true;
      } 
      i = this.w;
      if (i > 0)
        if (!bool1) {
          param1MenuItem.setActionView(i);
        } else {
          Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
        }  
      b.h.k.b b1 = this.A;
      if (b1 != null)
        i.a(param1MenuItem, b1); 
      i.c(param1MenuItem, this.B);
      i.g(param1MenuItem, this.C);
      i.b(param1MenuItem, this.n, this.o);
      i.f(param1MenuItem, this.p, this.q);
      PorterDuff.Mode mode = this.E;
      if (mode != null)
        i.e(param1MenuItem, mode); 
      ColorStateList colorStateList = this.D;
      if (colorStateList != null)
        i.d(param1MenuItem, colorStateList); 
    }
    
    public void a() {
      this.h = true;
      i(this.a.add(this.b, this.i, this.j, this.k));
    }
    
    public SubMenu b() {
      this.h = true;
      SubMenu subMenu = this.a.addSubMenu(this.b, this.i, this.j, this.k);
      i(subMenu.getItem());
      return subMenu;
    }
    
    public boolean d() {
      return this.h;
    }
    
    public void f(AttributeSet param1AttributeSet) {
      TypedArray typedArray = this.F.e.obtainStyledAttributes(param1AttributeSet, j.MenuGroup);
      this.b = typedArray.getResourceId(j.MenuGroup_android_id, 0);
      this.c = typedArray.getInt(j.MenuGroup_android_menuCategory, 0);
      this.d = typedArray.getInt(j.MenuGroup_android_orderInCategory, 0);
      this.e = typedArray.getInt(j.MenuGroup_android_checkableBehavior, 0);
      this.f = typedArray.getBoolean(j.MenuGroup_android_visible, true);
      this.g = typedArray.getBoolean(j.MenuGroup_android_enabled, true);
      typedArray.recycle();
    }
    
    public void g(AttributeSet param1AttributeSet) {
      e0 e0 = e0.u(this.F.e, param1AttributeSet, j.MenuItem);
      this.i = e0.n(j.MenuItem_android_id, 0);
      this.j = e0.k(j.MenuItem_android_menuCategory, this.c) & 0xFFFF0000 | e0.k(j.MenuItem_android_orderInCategory, this.d) & 0xFFFF;
      this.k = e0.p(j.MenuItem_android_title);
      this.l = e0.p(j.MenuItem_android_titleCondensed);
      this.m = e0.n(j.MenuItem_android_icon, 0);
      this.n = c(e0.o(j.MenuItem_android_alphabeticShortcut));
      this.o = e0.k(j.MenuItem_alphabeticModifiers, 4096);
      this.p = c(e0.o(j.MenuItem_android_numericShortcut));
      this.q = e0.k(j.MenuItem_numericModifiers, 4096);
      int i = j.MenuItem_android_checkable;
      if (e0.s(i)) {
        this.r = e0.a(i, false);
      } else {
        this.r = this.e;
      } 
      this.s = e0.a(j.MenuItem_android_checked, false);
      this.t = e0.a(j.MenuItem_android_visible, this.f);
      this.u = e0.a(j.MenuItem_android_enabled, this.g);
      this.v = e0.k(j.MenuItem_showAsAction, -1);
      this.z = e0.o(j.MenuItem_android_onClick);
      this.w = e0.n(j.MenuItem_actionLayout, 0);
      this.x = e0.o(j.MenuItem_actionViewClass);
      String str = e0.o(j.MenuItem_actionProviderClass);
      this.y = str;
      if (str != null) {
        i = 1;
      } else {
        i = 0;
      } 
      if (i != 0 && this.w == 0 && this.x == null) {
        this.A = e(str, g.b, this.F.d);
      } else {
        if (i != 0)
          Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified."); 
        this.A = null;
      } 
      this.B = e0.p(j.MenuItem_contentDescription);
      this.C = e0.p(j.MenuItem_tooltipText);
      i = j.MenuItem_iconTintMode;
      if (e0.s(i)) {
        this.E = q.e(e0.k(i, -1), this.E);
      } else {
        this.E = null;
      } 
      i = j.MenuItem_iconTint;
      if (e0.s(i)) {
        this.D = e0.c(i);
      } else {
        this.D = null;
      } 
      e0.w();
      this.h = false;
    }
    
    public void h() {
      this.b = 0;
      this.c = 0;
      this.d = 0;
      this.e = 0;
      this.f = true;
      this.g = true;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/a/o/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */