package androidx.media;

import android.os.Bundle;

public class a {
  public static boolean a(Bundle paramBundle1, Bundle paramBundle2) {
    boolean bool1 = true;
    boolean bool2 = true;
    boolean bool3 = true;
    if (paramBundle1 == paramBundle2)
      return true; 
    if (paramBundle1 == null) {
      if (paramBundle2.getInt("android.media.browse.extra.PAGE", -1) != -1 || paramBundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1) != -1)
        bool3 = false; 
      return bool3;
    } 
    if (paramBundle2 == null) {
      if (paramBundle1.getInt("android.media.browse.extra.PAGE", -1) == -1 && paramBundle1.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1) {
        bool3 = bool1;
      } else {
        bool3 = false;
      } 
      return bool3;
    } 
    if (paramBundle1.getInt("android.media.browse.extra.PAGE", -1) == paramBundle2.getInt("android.media.browse.extra.PAGE", -1) && paramBundle1.getInt("android.media.browse.extra.PAGE_SIZE", -1) == paramBundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1)) {
      bool3 = bool2;
    } else {
      bool3 = false;
    } 
    return bool3;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/media/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */