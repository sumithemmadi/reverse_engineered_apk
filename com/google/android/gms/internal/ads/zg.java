package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class zg implements bo2 {
  @Deprecated
  private final rq a;
  
  private final re b;
  
  private final eg c;
  
  public zg(re paramre) {
    this(paramre, new eg(4096));
  }
  
  private zg(re paramre, eg parameg) {
    this.b = paramre;
    this.a = (rq)paramre;
    this.c = parameg;
  }
  
  public kt2 a(w<?> paramw) {
    long l = SystemClock.elapsedRealtime();
    while (true) {
      pn pn1;
      pn pn2;
      Collections.emptyList();
      Map<?, ?> map = null;
      try {
        hh2 hh2 = paramw.A();
        if (hh2 == null) {
          pn1 = Collections.emptyMap();
        } else {
          pn1 = (pn)new HashMap<Object, Object>();
          this();
          pn2 = (pn)hh2.b;
          if (pn2 != null)
            pn1.put("If-None-Match", pn2); 
          long l1 = hh2.d;
          if (l1 > 0L)
            pn1.put("If-Modified-Since", po.b(l1)); 
        } 
        pn pn = this.b.a(paramw, (Map<String, String>)pn1);
        pn1 = (pn)map;
        try {
          byte[] arrayOfByte1;
          Iterator<Map.Entry> iterator;
          int i = pn.c();
          pn1 = (pn)map;
          List<yp2> list = pn.d();
          if (i == 304) {
            pn1 = (pn)map;
            long l2 = SystemClock.elapsedRealtime() - l;
            pn1 = (pn)map;
            hh2 hh21 = paramw.A();
            if (hh21 == null) {
              pn1 = (pn)map;
              return new kt2(304, null, true, l2, list);
            } 
            pn1 = (pn)map;
            TreeSet<String> treeSet = new TreeSet();
            pn1 = (pn)map;
            this((Comparator)String.CASE_INSENSITIVE_ORDER);
            pn1 = (pn)map;
            if (!list.isEmpty()) {
              pn1 = (pn)map;
              Iterator<yp2> iterator1 = list.iterator();
              while (true) {
                pn1 = (pn)map;
                if (iterator1.hasNext()) {
                  pn1 = (pn)map;
                  treeSet.add(((yp2)iterator1.next()).a());
                  continue;
                } 
                break;
              } 
            } 
            pn1 = (pn)map;
            ArrayList<yp2> arrayList = new ArrayList();
            pn1 = (pn)map;
            this((Collection)list);
            pn1 = (pn)map;
            list = hh21.h;
            if (list != null) {
              pn1 = (pn)map;
              if (!list.isEmpty()) {
                pn1 = (pn)map;
                Iterator<yp2> iterator1 = hh21.h.iterator();
                while (true) {
                  pn1 = (pn)map;
                  if (iterator1.hasNext()) {
                    pn1 = (pn)map;
                    yp2 yp2 = iterator1.next();
                    pn1 = (pn)map;
                    if (!treeSet.contains(yp2.a())) {
                      pn1 = (pn)map;
                      arrayList.add(yp2);
                    } 
                    continue;
                  } 
                  break;
                } 
              } 
            } else {
              pn1 = (pn)map;
              if (!hh21.g.isEmpty()) {
                pn1 = (pn)map;
                iterator = hh21.g.entrySet().iterator();
                while (true) {
                  pn1 = (pn)map;
                  if (iterator.hasNext()) {
                    pn1 = (pn)map;
                    Map.Entry entry = iterator.next();
                    pn1 = (pn)map;
                    if (!treeSet.contains(entry.getKey())) {
                      pn1 = (pn)map;
                      yp2 yp2 = new yp2();
                      pn1 = (pn)map;
                      this((String)entry.getKey(), (String)entry.getValue());
                      pn1 = (pn)map;
                      arrayList.add(yp2);
                    } 
                    continue;
                  } 
                  break;
                } 
              } 
            } 
            pn1 = (pn)map;
            return new kt2(304, hh21.a, true, l2, arrayList);
          } 
          pn1 = (pn)map;
          InputStream inputStream = pn.a();
          if (inputStream != null) {
            pn1 = (pn)map;
            arrayOfByte1 = ru.c(inputStream, pn.b(), this.c);
          } else {
            byte[] arrayOfByte = arrayOfByte1;
            arrayOfByte1 = new byte[0];
          } 
          byte[] arrayOfByte2 = arrayOfByte1;
          long l1 = SystemClock.elapsedRealtime() - l;
          arrayOfByte2 = arrayOfByte1;
          if (ic.b || l1 > 3000L) {
            String str;
            if (arrayOfByte1 != null) {
              arrayOfByte2 = arrayOfByte1;
              Integer integer = Integer.valueOf(arrayOfByte1.length);
            } else {
              str = "null";
            } 
            arrayOfByte2 = arrayOfByte1;
            ic.a("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", new Object[] { paramw, Long.valueOf(l1), str, Integer.valueOf(i), Integer.valueOf(paramw.E().c()) });
          } 
          if (i >= 200 && i <= 299) {
            arrayOfByte2 = arrayOfByte1;
            return new kt2(i, arrayOfByte1, false, SystemClock.elapsedRealtime() - l, (List)iterator);
          } 
          arrayOfByte2 = arrayOfByte1;
          pn2 = (pn)new IOException();
          arrayOfByte2 = arrayOfByte1;
          this();
          arrayOfByte2 = arrayOfByte1;
          throw pn2;
        } catch (IOException null) {
          pn2 = pn;
        } 
      } catch (IOException iOException) {
        pn2 = null;
        pn1 = pn2;
      } 
      ru.a(paramw, iOException, l, pn2, (byte[])pn1);
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */