package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

public abstract class s {
  private final g a;
  
  private final ClassLoader b;
  
  ArrayList<a> c = new ArrayList<a>();
  
  int d;
  
  int e;
  
  int f;
  
  int g;
  
  int h;
  
  boolean i;
  
  boolean j = true;
  
  String k;
  
  int l;
  
  CharSequence m;
  
  int n;
  
  CharSequence o;
  
  ArrayList<String> p;
  
  ArrayList<String> q;
  
  boolean r = false;
  
  ArrayList<Runnable> s;
  
  s(g paramg, ClassLoader paramClassLoader) {
    this.a = paramg;
    this.b = paramClassLoader;
  }
  
  public s b(int paramInt, Fragment paramFragment) {
    n(paramInt, paramFragment, null, 1);
    return this;
  }
  
  public s c(int paramInt, Fragment paramFragment, String paramString) {
    n(paramInt, paramFragment, paramString, 1);
    return this;
  }
  
  s d(ViewGroup paramViewGroup, Fragment paramFragment, String paramString) {
    paramFragment.I = paramViewGroup;
    return c(paramViewGroup.getId(), paramFragment, paramString);
  }
  
  public s e(Fragment paramFragment, String paramString) {
    n(0, paramFragment, paramString, 1);
    return this;
  }
  
  void f(a parama) {
    this.c.add(parama);
    parama.c = this.d;
    parama.d = this.e;
    parama.e = this.f;
    parama.f = this.g;
  }
  
  public s g(Fragment paramFragment) {
    f(new a(7, paramFragment));
    return this;
  }
  
  public abstract int h();
  
  public abstract int i();
  
  public abstract void j();
  
  public abstract void k();
  
  public s l(Fragment paramFragment) {
    f(new a(6, paramFragment));
    return this;
  }
  
  public s m() {
    if (!this.i) {
      this.j = false;
      return this;
    } 
    throw new IllegalStateException("This transaction is already being added to the back stack");
  }
  
  void n(int paramInt1, Fragment paramFragment, String paramString, int paramInt2) {
    StringBuilder stringBuilder2;
    Class<?> clazz = paramFragment.getClass();
    int i = clazz.getModifiers();
    if (!clazz.isAnonymousClass() && Modifier.isPublic(i) && (!clazz.isMemberClass() || Modifier.isStatic(i))) {
      if (paramString != null) {
        String str = paramFragment.A;
        if (str == null || paramString.equals(str)) {
          paramFragment.A = paramString;
        } else {
          stringBuilder2 = new StringBuilder();
          stringBuilder2.append("Can't change tag of fragment ");
          stringBuilder2.append(paramFragment);
          stringBuilder2.append(": was ");
          stringBuilder2.append(paramFragment.A);
          stringBuilder2.append(" now ");
          stringBuilder2.append(paramString);
          throw new IllegalStateException(stringBuilder2.toString());
        } 
      } 
      if (paramInt1 != 0) {
        StringBuilder stringBuilder;
        if (paramInt1 != -1) {
          i = paramFragment.y;
          if (i == 0 || i == paramInt1) {
            paramFragment.y = paramInt1;
            paramFragment.z = paramInt1;
          } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Can't change container ID of fragment ");
            stringBuilder.append(paramFragment);
            stringBuilder.append(": was ");
            stringBuilder.append(paramFragment.y);
            stringBuilder.append(" now ");
            stringBuilder.append(paramInt1);
            throw new IllegalStateException(stringBuilder.toString());
          } 
        } else {
          stringBuilder2 = new StringBuilder();
          stringBuilder2.append("Can't add fragment ");
          stringBuilder2.append(paramFragment);
          stringBuilder2.append(" with tag ");
          stringBuilder2.append((String)stringBuilder);
          stringBuilder2.append(" to container view with no id");
          throw new IllegalArgumentException(stringBuilder2.toString());
        } 
      } 
      f(new a(paramInt2, paramFragment));
      return;
    } 
    StringBuilder stringBuilder1 = new StringBuilder();
    stringBuilder1.append("Fragment ");
    stringBuilder1.append(stringBuilder2.getCanonicalName());
    stringBuilder1.append(" must be a public static class to be  properly recreated from instance state.");
    throw new IllegalStateException(stringBuilder1.toString());
  }
  
  public s o(Fragment paramFragment) {
    f(new a(3, paramFragment));
    return this;
  }
  
  public s p(int paramInt, Fragment paramFragment) {
    return q(paramInt, paramFragment, null);
  }
  
  public s q(int paramInt, Fragment paramFragment, String paramString) {
    if (paramInt != 0) {
      n(paramInt, paramFragment, paramString, 2);
      return this;
    } 
    throw new IllegalArgumentException("Must use non-zero containerViewId");
  }
  
  public s r(Fragment paramFragment, Lifecycle.State paramState) {
    f(new a(10, paramFragment, paramState));
    return this;
  }
  
  public s s(boolean paramBoolean) {
    this.r = paramBoolean;
    return this;
  }
  
  static final class a {
    int a;
    
    Fragment b;
    
    int c;
    
    int d;
    
    int e;
    
    int f;
    
    Lifecycle.State g;
    
    Lifecycle.State h;
    
    a() {}
    
    a(int param1Int, Fragment param1Fragment) {
      this.a = param1Int;
      this.b = param1Fragment;
      Lifecycle.State state = Lifecycle.State.f;
      this.g = state;
      this.h = state;
    }
    
    a(int param1Int, Fragment param1Fragment, Lifecycle.State param1State) {
      this.a = param1Int;
      this.b = param1Fragment;
      this.g = param1Fragment.T;
      this.h = param1State;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/fragment/app/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */