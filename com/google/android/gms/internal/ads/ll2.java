package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class ll2 {
  private final Object a = new Object();
  
  private int b;
  
  private List<ml2> c = new LinkedList<ml2>();
  
  public final boolean a(ml2 paramml2) {
    synchronized (this.a) {
      if (this.c.contains(paramml2))
        return true; 
      return false;
    } 
  }
  
  public final boolean b(ml2 paramml2) {
    synchronized (this.a) {
      Iterator<ml2> iterator = this.c.iterator();
      while (iterator.hasNext()) {
        ml2 ml21 = iterator.next();
        if (!q.g().r().u()) {
          if (paramml2 != ml21 && ml21.i().equals(paramml2.i())) {
            iterator.remove();
            return true;
          } 
          continue;
        } 
        if (!q.g().r().l() && paramml2 != ml21 && ml21.k().equals(paramml2.k())) {
          iterator.remove();
          return true;
        } 
      } 
      return false;
    } 
  }
  
  public final void c(ml2 paramml2) {
    synchronized (this.a) {
      if (this.c.size() >= 10) {
        int j = this.c.size();
        StringBuilder stringBuilder = new StringBuilder();
        this(41);
        stringBuilder.append("Queue is full, current size = ");
        stringBuilder.append(j);
        cm.e(stringBuilder.toString());
        this.c.remove(0);
      } 
      int i = this.b;
      this.b = i + 1;
      paramml2.e(i);
      paramml2.o();
      this.c.add(paramml2);
      return;
    } 
  }
  
  public final ml2 d(boolean paramBoolean) {
    synchronized (this.a) {
      int i = this.c.size();
      ml2 ml2 = null;
      if (i == 0) {
        cm.e("Queue empty");
        return null;
      } 
      i = this.c.size();
      int j = 0;
      if (i >= 2) {
        int k = Integer.MIN_VALUE;
        Iterator<ml2> iterator = this.c.iterator();
        i = 0;
        while (iterator.hasNext()) {
          ml2 ml21 = iterator.next();
          int m = ml21.a();
          int n = k;
          if (m > k) {
            j = i;
            ml2 = ml21;
            n = m;
          } 
          i++;
          k = n;
        } 
        this.c.remove(j);
        return ml2;
      } 
      ml2 = this.c.get(0);
      if (paramBoolean) {
        this.c.remove(0);
      } else {
        ml2.l();
      } 
      return ml2;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ll2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */