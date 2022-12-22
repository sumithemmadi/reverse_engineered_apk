package androidx.room;

import androidx.lifecycle.LiveData;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

class e {
  final Set<LiveData> a = Collections.newSetFromMap(new IdentityHashMap<LiveData, Boolean>());
  
  private final RoomDatabase b;
  
  e(RoomDatabase paramRoomDatabase) {
    this.b = paramRoomDatabase;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/room/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */