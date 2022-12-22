package androidx.core.app;

import android.app.Person;
import android.graphics.drawable.Icon;
import androidx.core.graphics.drawable.IconCompat;

public class m {
  CharSequence a;
  
  IconCompat b;
  
  String c;
  
  String d;
  
  boolean e;
  
  boolean f;
  
  public IconCompat a() {
    return this.b;
  }
  
  public String b() {
    return this.d;
  }
  
  public CharSequence c() {
    return this.a;
  }
  
  public String d() {
    return this.c;
  }
  
  public boolean e() {
    return this.e;
  }
  
  public boolean f() {
    return this.f;
  }
  
  public String g() {
    String str = this.c;
    if (str != null)
      return str; 
    if (this.a != null) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("name:");
      stringBuilder.append(this.a);
      return stringBuilder.toString();
    } 
    return "";
  }
  
  public Person h() {
    Icon icon;
    Person.Builder builder = (new Person.Builder()).setName(c());
    if (a() != null) {
      icon = a().p();
    } else {
      icon = null;
    } 
    return builder.setIcon(icon).setUri(d()).setKey(b()).setBot(e()).setImportant(f()).build();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/core/app/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */