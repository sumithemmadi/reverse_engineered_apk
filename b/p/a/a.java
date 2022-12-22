package b.p.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public final class a {
  private static final Object a = new Object();
  
  private static a b;
  
  private final Context c;
  
  private final HashMap<BroadcastReceiver, ArrayList<c>> d = new HashMap<BroadcastReceiver, ArrayList<c>>();
  
  private final HashMap<String, ArrayList<c>> e = new HashMap<String, ArrayList<c>>();
  
  private final ArrayList<b> f = new ArrayList<b>();
  
  private final Handler g;
  
  private a(Context paramContext) {
    this.c = paramContext;
    this.g = new a(this, paramContext.getMainLooper());
  }
  
  public static a b(Context paramContext) {
    synchronized (a) {
      if (b == null) {
        a a1 = new a();
        this(paramContext.getApplicationContext());
        b = a1;
      } 
      return b;
    } 
  }
  
  void a() {
    while (true) {
      HashMap<BroadcastReceiver, ArrayList<c>> hashMap;
      c c;
      synchronized (this.d) {
        int i = this.f.size();
        if (i <= 0)
          return; 
        b[] arrayOfB = new b[i];
        this.f.toArray(arrayOfB);
        this.f.clear();
        for (byte b = 0; b < i; b++) {
          b b1 = arrayOfB[b];
          int j = b1.b.size();
          for (byte b2 = 0; b2 < j; b2++) {
            c = b1.b.get(b2);
            if (!c.d)
              c.b.onReceive(this.c, b1.a); 
          } 
        } 
      } 
    } 
  }
  
  public void c(BroadcastReceiver paramBroadcastReceiver, IntentFilter paramIntentFilter) {
    synchronized (this.d) {
      c c = new c();
      this(paramIntentFilter, paramBroadcastReceiver);
      ArrayList<c> arrayList1 = this.d.get(paramBroadcastReceiver);
      ArrayList<c> arrayList2 = arrayList1;
      if (arrayList1 == null) {
        arrayList2 = new ArrayList();
        this(1);
        this.d.put(paramBroadcastReceiver, arrayList2);
      } 
      arrayList2.add(c);
      for (byte b = 0; b < paramIntentFilter.countActions(); b++) {
        String str = paramIntentFilter.getAction(b);
        arrayList2 = this.e.get(str);
        ArrayList<c> arrayList = arrayList2;
        if (arrayList2 == null) {
          arrayList = new ArrayList<c>();
          this(1);
          this.e.put(str, arrayList);
        } 
        arrayList.add(c);
      } 
      return;
    } 
  }
  
  public boolean d(Intent paramIntent) {
    synchronized (this.d) {
      byte b;
      String str1 = paramIntent.getAction();
      String str2 = paramIntent.resolveTypeIfNeeded(this.c.getContentResolver());
      Uri uri = paramIntent.getData();
      String str3 = paramIntent.getScheme();
      Set set = paramIntent.getCategories();
      if ((paramIntent.getFlags() & 0x8) != 0) {
        b = 1;
      } else {
        b = 0;
      } 
      if (b) {
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append("Resolving type ");
        stringBuilder.append(str2);
        stringBuilder.append(" scheme ");
        stringBuilder.append(str3);
        stringBuilder.append(" of intent ");
        stringBuilder.append(paramIntent);
        Log.v("LocalBroadcastManager", stringBuilder.toString());
      } 
      ArrayList<c> arrayList = this.e.get(paramIntent.getAction());
      if (arrayList != null) {
        if (b) {
          StringBuilder stringBuilder1 = new StringBuilder();
          this();
          stringBuilder1.append("Action list: ");
          stringBuilder1.append(arrayList);
          Log.v("LocalBroadcastManager", stringBuilder1.toString());
        } 
        StringBuilder stringBuilder = null;
        for (byte b1 = 0; b1 < arrayList.size(); b1++) {
          c c = arrayList.get(b1);
          if (b) {
            StringBuilder stringBuilder1 = new StringBuilder();
            this();
            stringBuilder1.append("Matching against filter ");
            stringBuilder1.append(c.a);
            Log.v("LocalBroadcastManager", stringBuilder1.toString());
          } 
          if (c.c) {
            if (b)
              Log.v("LocalBroadcastManager", "  Filter's target already added"); 
          } else {
            IntentFilter intentFilter = c.a;
            StringBuilder stringBuilder1 = stringBuilder;
            int i = intentFilter.match(str1, str2, str3, uri, set, "LocalBroadcastManager");
            if (i >= 0) {
              if (b) {
                stringBuilder = new StringBuilder();
                this();
                stringBuilder.append("  Filter matched!  match=0x");
                stringBuilder.append(Integer.toHexString(i));
                Log.v("LocalBroadcastManager", stringBuilder.toString());
              } 
              if (stringBuilder1 == null) {
                ArrayList arrayList1 = new ArrayList();
                this();
              } else {
                stringBuilder = stringBuilder1;
              } 
              stringBuilder.add(c);
              c.c = true;
            } else if (b) {
              String str;
              if (i != -4) {
                if (i != -3) {
                  if (i != -2) {
                    if (i != -1) {
                      str = "unknown reason";
                    } else {
                      str = "type";
                    } 
                  } else {
                    str = "data";
                  } 
                } else {
                  str = "action";
                } 
              } else {
                str = "category";
              } 
              StringBuilder stringBuilder2 = new StringBuilder();
              this();
              stringBuilder2.append("  Filter did not match: ");
              stringBuilder2.append(str);
              Log.v("LocalBroadcastManager", stringBuilder2.toString());
            } 
          } 
        } 
        if (stringBuilder != null) {
          for (b = 0; b < stringBuilder.size(); b++)
            ((c)stringBuilder.get(b)).c = false; 
          ArrayList<b> arrayList1 = this.f;
          b b2 = new b();
          this(paramIntent, (ArrayList<c>)stringBuilder);
          arrayList1.add(b2);
          if (!this.g.hasMessages(1))
            this.g.sendEmptyMessage(1); 
          return true;
        } 
      } 
      return false;
    } 
  }
  
  public void e(BroadcastReceiver paramBroadcastReceiver) {
    synchronized (this.d) {
      ArrayList<c> arrayList = this.d.remove(paramBroadcastReceiver);
      if (arrayList == null)
        return; 
      for (int i = arrayList.size() - 1; i >= 0; i--) {
        c c = arrayList.get(i);
        c.d = true;
        for (byte b = 0; b < c.a.countActions(); b++) {
          String str = c.a.getAction(b);
          ArrayList<c> arrayList1 = this.e.get(str);
          if (arrayList1 != null) {
            for (int j = arrayList1.size() - 1; j >= 0; j--) {
              c c1 = arrayList1.get(j);
              if (c1.b == paramBroadcastReceiver) {
                c1.d = true;
                arrayList1.remove(j);
              } 
            } 
            if (arrayList1.size() <= 0)
              this.e.remove(str); 
          } 
        } 
      } 
      return;
    } 
  }
  
  class a extends Handler {
    a(a this$0, Looper param1Looper) {
      super(param1Looper);
    }
    
    public void handleMessage(Message param1Message) {
      if (param1Message.what != 1) {
        super.handleMessage(param1Message);
      } else {
        this.a.a();
      } 
    }
  }
  
  private static final class b {
    final Intent a;
    
    final ArrayList<a.c> b;
    
    b(Intent param1Intent, ArrayList<a.c> param1ArrayList) {
      this.a = param1Intent;
      this.b = param1ArrayList;
    }
  }
  
  private static final class c {
    final IntentFilter a;
    
    final BroadcastReceiver b;
    
    boolean c;
    
    boolean d;
    
    c(IntentFilter param1IntentFilter, BroadcastReceiver param1BroadcastReceiver) {
      this.a = param1IntentFilter;
      this.b = param1BroadcastReceiver;
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder(128);
      stringBuilder.append("Receiver{");
      stringBuilder.append(this.b);
      stringBuilder.append(" filter=");
      stringBuilder.append(this.a);
      if (this.d)
        stringBuilder.append(" DEAD"); 
      stringBuilder.append("}");
      return stringBuilder.toString();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/p/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */