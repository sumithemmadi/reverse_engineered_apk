package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.f;
import androidx.lifecycle.g;
import androidx.lifecycle.h;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@SuppressLint({"RestrictedApi"})
final class Recreator implements f {
  private final c b;
  
  Recreator(c paramc) {
    this.b = paramc;
  }
  
  private void h(String paramString) {
    try {
      StringBuilder stringBuilder;
      Class<? extends SavedStateRegistry.a> clazz = Class.forName(paramString, false, Recreator.class.getClassLoader()).asSubclass(SavedStateRegistry.a.class);
      try {
        Constructor<? extends SavedStateRegistry.a> constructor = clazz.getDeclaredConstructor(new Class[0]);
        constructor.setAccessible(true);
        try {
          SavedStateRegistry.a a = constructor.newInstance(new Object[0]);
          a.a(this.b);
          return;
        } catch (Exception exception) {
          stringBuilder = new StringBuilder();
          stringBuilder.append("Failed to instantiate ");
          stringBuilder.append(paramString);
          throw new RuntimeException(stringBuilder.toString(), exception);
        } 
      } catch (NoSuchMethodException noSuchMethodException) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("Class");
        stringBuilder1.append(stringBuilder.getSimpleName());
        stringBuilder1.append(" must have default constructor in order to be automatically recreated");
        throw new IllegalStateException(stringBuilder1.toString(), noSuchMethodException);
      } 
    } catch (ClassNotFoundException classNotFoundException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Class ");
      stringBuilder.append((String)noSuchMethodException);
      stringBuilder.append(" wasn't found");
      throw new RuntimeException(stringBuilder.toString(), classNotFoundException);
    } 
  }
  
  public void c(h paramh, Lifecycle.Event paramEvent) {
    if (paramEvent == Lifecycle.Event.ON_CREATE) {
      paramh.a().c((g)this);
      Bundle bundle = this.b.j().a("androidx.savedstate.Restarter");
      if (bundle == null)
        return; 
      ArrayList arrayList = bundle.getStringArrayList("classes_to_restore");
      if (arrayList != null) {
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext())
          h(iterator.next()); 
        return;
      } 
      throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
    } 
    AssertionError assertionError = new AssertionError("Next event must be ON_CREATE");
    throw assertionError;
  }
  
  static final class a implements SavedStateRegistry.b {
    final Set<String> a = new HashSet<String>();
    
    a(SavedStateRegistry param1SavedStateRegistry) {
      param1SavedStateRegistry.d("androidx.savedstate.Restarter", this);
    }
    
    public Bundle a() {
      Bundle bundle = new Bundle();
      bundle.putStringArrayList("classes_to_restore", new ArrayList<String>(this.a));
      return bundle;
    }
    
    void b(String param1String) {
      this.a.add(param1String);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/savedstate/Recreator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */