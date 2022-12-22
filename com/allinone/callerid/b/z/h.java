package com.allinone.callerid.b.z;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.n;
import java.util.ArrayList;
import java.util.List;

public class h extends n {
  private final List<Fragment> h = new ArrayList<Fragment>();
  
  private final List<String> i = new ArrayList<String>();
  
  public h(FragmentManager paramFragmentManager) {
    super(paramFragmentManager);
  }
  
  public int e() {
    return this.h.size();
  }
  
  public CharSequence g(int paramInt) {
    return this.i.get(paramInt);
  }
  
  public void n(Parcelable paramParcelable, ClassLoader paramClassLoader) {}
  
  public Fragment v(int paramInt) {
    return (this.h.size() > paramInt) ? this.h.get(paramInt) : null;
  }
  
  public void y(Fragment paramFragment, String paramString) {
    this.h.add(paramFragment);
    this.i.add(paramString);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/b/z/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */