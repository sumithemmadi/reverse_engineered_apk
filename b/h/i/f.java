package b.h.i;

import android.os.Build;
import android.text.TextUtils;
import java.util.Locale;

public final class f {
  private static final Locale a = new Locale("", "");
  
  private static int a(Locale paramLocale) {
    byte b = Character.getDirectionality(paramLocale.getDisplayName(paramLocale).charAt(0));
    return (b != 1 && b != 2) ? 0 : 1;
  }
  
  public static int b(Locale paramLocale) {
    if (Build.VERSION.SDK_INT >= 17)
      return TextUtils.getLayoutDirectionFromLocale(paramLocale); 
    if (paramLocale != null && !paramLocale.equals(a)) {
      String str = b.c(paramLocale);
      if (str == null)
        return a(paramLocale); 
      if (str.equalsIgnoreCase("Arab") || str.equalsIgnoreCase("Hebr"))
        return 1; 
    } 
    return 0;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/h/i/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */