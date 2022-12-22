package androidx.work;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class OverwritingInputMerger extends e {
  public d b(List<d> paramList) {
    d.a a = new d.a();
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    Iterator<d> iterator = paramList.iterator();
    while (iterator.hasNext())
      hashMap.putAll(((d)iterator.next()).h()); 
    a.d((Map)hashMap);
    return a.a();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/OverwritingInputMerger.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */