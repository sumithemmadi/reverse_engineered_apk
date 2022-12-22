package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

public class i {
  public static Bundle a(Notification paramNotification) {
    int j = Build.VERSION.SDK_INT;
    return (j >= 19) ? paramNotification.extras : ((j >= 16) ? k.c(paramNotification) : null);
  }
  
  public static class a {
    final Bundle a;
    
    private IconCompat b;
    
    private final n[] c;
    
    private final n[] d;
    
    private boolean e;
    
    boolean f = true;
    
    private final int g;
    
    private final boolean h;
    
    @Deprecated
    public int i;
    
    public CharSequence j;
    
    public PendingIntent k;
    
    public a(int param1Int, CharSequence param1CharSequence, PendingIntent param1PendingIntent) {
      this(iconCompat, param1CharSequence, param1PendingIntent);
    }
    
    public a(IconCompat param1IconCompat, CharSequence param1CharSequence, PendingIntent param1PendingIntent) {
      this(param1IconCompat, param1CharSequence, param1PendingIntent, new Bundle(), null, null, true, 0, true, false);
    }
    
    a(IconCompat param1IconCompat, CharSequence param1CharSequence, PendingIntent param1PendingIntent, Bundle param1Bundle, n[] param1ArrayOfn1, n[] param1ArrayOfn2, boolean param1Boolean1, int param1Int, boolean param1Boolean2, boolean param1Boolean3) {
      this.b = param1IconCompat;
      if (param1IconCompat != null && param1IconCompat.i() == 2)
        this.i = param1IconCompat.e(); 
      this.j = i.e.d(param1CharSequence);
      this.k = param1PendingIntent;
      if (param1Bundle == null)
        param1Bundle = new Bundle(); 
      this.a = param1Bundle;
      this.c = param1ArrayOfn1;
      this.d = param1ArrayOfn2;
      this.e = param1Boolean1;
      this.g = param1Int;
      this.f = param1Boolean2;
      this.h = param1Boolean3;
    }
    
    public PendingIntent a() {
      return this.k;
    }
    
    public boolean b() {
      return this.e;
    }
    
    public n[] c() {
      return this.d;
    }
    
    public Bundle d() {
      return this.a;
    }
    
    public IconCompat e() {
      if (this.b == null) {
        int i = this.i;
        if (i != 0)
          this.b = IconCompat.c(null, "", i); 
      } 
      return this.b;
    }
    
    public n[] f() {
      return this.c;
    }
    
    public int g() {
      return this.g;
    }
    
    public boolean h() {
      return this.f;
    }
    
    public CharSequence i() {
      return this.j;
    }
    
    public boolean j() {
      return this.h;
    }
  }
  
  public static class b extends f {
    private Bitmap e;
    
    private IconCompat f;
    
    private boolean g;
    
    public void b(h param1h) {
      int i = Build.VERSION.SDK_INT;
      if (i >= 16) {
        Notification.BigPictureStyle bigPictureStyle = (new Notification.BigPictureStyle(param1h.a())).setBigContentTitle(this.b).bigPicture(this.e);
        if (this.g) {
          IconCompat iconCompat = this.f;
          Context context = null;
          if (iconCompat == null) {
            a.a(bigPictureStyle, null);
          } else if (i >= 23) {
            if (param1h instanceof j)
              context = ((j)param1h).f(); 
            b.a(bigPictureStyle, this.f.q(context));
          } else if (iconCompat.i() == 1) {
            a.a(bigPictureStyle, this.f.d());
          } else {
            a.a(bigPictureStyle, null);
          } 
        } 
        if (this.d)
          a.b(bigPictureStyle, this.c); 
      } 
    }
    
    protected String c() {
      return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
    
    public b h(Bitmap param1Bitmap) {
      IconCompat iconCompat;
      if (param1Bitmap == null) {
        param1Bitmap = null;
      } else {
        iconCompat = IconCompat.b(param1Bitmap);
      } 
      this.f = iconCompat;
      this.g = true;
      return this;
    }
    
    public b i(Bitmap param1Bitmap) {
      this.e = param1Bitmap;
      return this;
    }
    
    private static class a {
      static void a(Notification.BigPictureStyle param2BigPictureStyle, Bitmap param2Bitmap) {
        param2BigPictureStyle.bigLargeIcon(param2Bitmap);
      }
      
      static void b(Notification.BigPictureStyle param2BigPictureStyle, CharSequence param2CharSequence) {
        param2BigPictureStyle.setSummaryText(param2CharSequence);
      }
    }
    
    private static class b {
      static void a(Notification.BigPictureStyle param2BigPictureStyle, Icon param2Icon) {
        param2BigPictureStyle.bigLargeIcon(param2Icon);
      }
    }
  }
  
  private static class a {
    static void a(Notification.BigPictureStyle param1BigPictureStyle, Bitmap param1Bitmap) {
      param1BigPictureStyle.bigLargeIcon(param1Bitmap);
    }
    
    static void b(Notification.BigPictureStyle param1BigPictureStyle, CharSequence param1CharSequence) {
      param1BigPictureStyle.setSummaryText(param1CharSequence);
    }
  }
  
  private static class b {
    static void a(Notification.BigPictureStyle param1BigPictureStyle, Icon param1Icon) {
      param1BigPictureStyle.bigLargeIcon(param1Icon);
    }
  }
  
  public static class c extends f {
    private CharSequence e;
    
    public void a(Bundle param1Bundle) {
      super.a(param1Bundle);
      if (Build.VERSION.SDK_INT < 21)
        param1Bundle.putCharSequence("android.bigText", this.e); 
    }
    
    public void b(h param1h) {
      if (Build.VERSION.SDK_INT >= 16) {
        Notification.BigTextStyle bigTextStyle = (new Notification.BigTextStyle(param1h.a())).setBigContentTitle(this.b).bigText(this.e);
        if (this.d)
          bigTextStyle.setSummaryText(this.c); 
      } 
    }
    
    protected String c() {
      return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
    
    public c h(CharSequence param1CharSequence) {
      this.e = i.e.d(param1CharSequence);
      return this;
    }
  }
  
  public static final class d {
    public static Notification.BubbleMetadata a(d param1d) {
      if (param1d == null)
        return null; 
      int i = Build.VERSION.SDK_INT;
      return (i >= 30) ? b.a(param1d) : ((i == 29) ? a.a(param1d) : null);
    }
    
    private static class a {
      static Notification.BubbleMetadata a(i.d param2d) {
        if (param2d == null)
          return null; 
        throw null;
      }
    }
    
    private static class b {
      static Notification.BubbleMetadata a(i.d param2d) {
        if (param2d == null)
          return null; 
        throw null;
      }
    }
  }
  
  private static class a {
    static Notification.BubbleMetadata a(i.d param1d) {
      if (param1d == null)
        return null; 
      throw null;
    }
  }
  
  private static class b {
    static Notification.BubbleMetadata a(i.d param1d) {
      if (param1d == null)
        return null; 
      throw null;
    }
  }
  
  public static class e {
    boolean A;
    
    boolean B;
    
    String C;
    
    Bundle D;
    
    int E = 0;
    
    int F = 0;
    
    Notification G;
    
    RemoteViews H;
    
    RemoteViews I;
    
    RemoteViews J;
    
    String K;
    
    int L = 0;
    
    String M;
    
    androidx.core.content.b N;
    
    long O;
    
    int P = 0;
    
    boolean Q;
    
    i.d R;
    
    Notification S;
    
    boolean T;
    
    Icon U;
    
    @Deprecated
    public ArrayList<String> V;
    
    public Context a;
    
    public ArrayList<i.a> b = new ArrayList<i.a>();
    
    public ArrayList<m> c = new ArrayList<m>();
    
    ArrayList<i.a> d = new ArrayList<i.a>();
    
    CharSequence e;
    
    CharSequence f;
    
    PendingIntent g;
    
    PendingIntent h;
    
    RemoteViews i;
    
    Bitmap j;
    
    CharSequence k;
    
    int l;
    
    int m;
    
    boolean n = true;
    
    boolean o;
    
    i.f p;
    
    CharSequence q;
    
    CharSequence r;
    
    CharSequence[] s;
    
    int t;
    
    int u;
    
    boolean v;
    
    String w;
    
    boolean x;
    
    String y;
    
    boolean z = false;
    
    @Deprecated
    public e(Context param1Context) {
      this(param1Context, null);
    }
    
    public e(Context param1Context, String param1String) {
      Notification notification = new Notification();
      this.S = notification;
      this.a = param1Context;
      this.K = param1String;
      notification.when = System.currentTimeMillis();
      this.S.audioStreamType = -1;
      this.m = 0;
      this.V = new ArrayList<String>();
      this.Q = true;
    }
    
    protected static CharSequence d(CharSequence param1CharSequence) {
      if (param1CharSequence == null)
        return param1CharSequence; 
      CharSequence charSequence = param1CharSequence;
      if (param1CharSequence.length() > 5120)
        charSequence = param1CharSequence.subSequence(0, 5120); 
      return charSequence;
    }
    
    private Bitmap e(Bitmap param1Bitmap) {
      Bitmap bitmap = param1Bitmap;
      if (param1Bitmap != null)
        if (Build.VERSION.SDK_INT >= 27) {
          bitmap = param1Bitmap;
        } else {
          Resources resources = this.a.getResources();
          int i = resources.getDimensionPixelSize(b.h.b.compat_notification_large_icon_max_width);
          int j = resources.getDimensionPixelSize(b.h.b.compat_notification_large_icon_max_height);
          if (param1Bitmap.getWidth() <= i && param1Bitmap.getHeight() <= j)
            return param1Bitmap; 
          double d1 = i;
          double d2 = Math.max(1, param1Bitmap.getWidth());
          Double.isNaN(d1);
          Double.isNaN(d2);
          double d3 = d1 / d2;
          d1 = j;
          d2 = Math.max(1, param1Bitmap.getHeight());
          Double.isNaN(d1);
          Double.isNaN(d2);
          d2 = Math.min(d3, d1 / d2);
          d1 = param1Bitmap.getWidth();
          Double.isNaN(d1);
          i = (int)Math.ceil(d1 * d2);
          d1 = param1Bitmap.getHeight();
          Double.isNaN(d1);
          bitmap = Bitmap.createScaledBitmap(param1Bitmap, i, (int)Math.ceil(d1 * d2), true);
        }  
      return bitmap;
    }
    
    private void n(int param1Int, boolean param1Boolean) {
      if (param1Boolean) {
        Notification notification = this.S;
        notification.flags = param1Int | notification.flags;
      } else {
        Notification notification = this.S;
        notification.flags = (param1Int ^ 0xFFFFFFFF) & notification.flags;
      } 
    }
    
    public e A(int param1Int) {
      this.F = param1Int;
      return this;
    }
    
    public e B(long param1Long) {
      this.S.when = param1Long;
      return this;
    }
    
    public e a(int param1Int, CharSequence param1CharSequence, PendingIntent param1PendingIntent) {
      this.b.add(new i.a(param1Int, param1CharSequence, param1PendingIntent));
      return this;
    }
    
    public Notification b() {
      return (new j(this)).c();
    }
    
    public Bundle c() {
      if (this.D == null)
        this.D = new Bundle(); 
      return this.D;
    }
    
    public e f(boolean param1Boolean) {
      n(16, param1Boolean);
      return this;
    }
    
    public e g(String param1String) {
      this.K = param1String;
      return this;
    }
    
    public e h(int param1Int) {
      this.E = param1Int;
      return this;
    }
    
    public e i(PendingIntent param1PendingIntent) {
      this.g = param1PendingIntent;
      return this;
    }
    
    public e j(CharSequence param1CharSequence) {
      this.f = d(param1CharSequence);
      return this;
    }
    
    public e k(CharSequence param1CharSequence) {
      this.e = d(param1CharSequence);
      return this;
    }
    
    public e l(int param1Int) {
      Notification notification = this.S;
      notification.defaults = param1Int;
      if ((param1Int & 0x4) != 0)
        notification.flags |= 0x1; 
      return this;
    }
    
    public e m(PendingIntent param1PendingIntent) {
      this.S.deleteIntent = param1PendingIntent;
      return this;
    }
    
    public e o(Bitmap param1Bitmap) {
      this.j = e(param1Bitmap);
      return this;
    }
    
    public e p(int param1Int1, int param1Int2, int param1Int3) {
      Notification notification = this.S;
      notification.ledARGB = param1Int1;
      notification.ledOnMS = param1Int2;
      notification.ledOffMS = param1Int3;
      if (param1Int2 != 0 && param1Int3 != 0) {
        param1Int1 = 1;
      } else {
        param1Int1 = 0;
      } 
      notification.flags = param1Int1 | notification.flags & 0xFFFFFFFE;
      return this;
    }
    
    public e q(boolean param1Boolean) {
      this.z = param1Boolean;
      return this;
    }
    
    public e r(int param1Int) {
      this.l = param1Int;
      return this;
    }
    
    public e s(boolean param1Boolean) {
      n(2, param1Boolean);
      return this;
    }
    
    public e t(int param1Int) {
      this.m = param1Int;
      return this;
    }
    
    public e u(boolean param1Boolean) {
      this.n = param1Boolean;
      return this;
    }
    
    public e v(int param1Int) {
      this.S.icon = param1Int;
      return this;
    }
    
    public e w(Uri param1Uri) {
      Notification notification = this.S;
      notification.sound = param1Uri;
      notification.audioStreamType = -1;
      if (Build.VERSION.SDK_INT >= 21)
        notification.audioAttributes = (new AudioAttributes.Builder()).setContentType(4).setUsage(5).build(); 
      return this;
    }
    
    public e x(i.f param1f) {
      if (this.p != param1f) {
        this.p = param1f;
        if (param1f != null)
          param1f.g(this); 
      } 
      return this;
    }
    
    public e y(CharSequence param1CharSequence) {
      this.S.tickerText = d(param1CharSequence);
      return this;
    }
    
    public e z(long[] param1ArrayOflong) {
      this.S.vibrate = param1ArrayOflong;
      return this;
    }
  }
  
  public static abstract class f {
    protected i.e a;
    
    CharSequence b;
    
    CharSequence c;
    
    boolean d = false;
    
    public void a(Bundle param1Bundle) {
      if (this.d)
        param1Bundle.putCharSequence("android.summaryText", this.c); 
      CharSequence charSequence = this.b;
      if (charSequence != null)
        param1Bundle.putCharSequence("android.title.big", charSequence); 
      charSequence = c();
      if (charSequence != null)
        param1Bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", (String)charSequence); 
    }
    
    public abstract void b(h param1h);
    
    protected abstract String c();
    
    public RemoteViews d(h param1h) {
      return null;
    }
    
    public RemoteViews e(h param1h) {
      return null;
    }
    
    public RemoteViews f(h param1h) {
      return null;
    }
    
    public void g(i.e param1e) {
      if (this.a != param1e) {
        this.a = param1e;
        if (param1e != null)
          param1e.x(this); 
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/core/app/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */