package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import b.e.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

class j implements h {
  private final Context a;
  
  private final Notification.Builder b;
  
  private final i.e c;
  
  private RemoteViews d;
  
  private RemoteViews e;
  
  private final List<Bundle> f;
  
  private final Bundle g;
  
  private int h;
  
  private RemoteViews i;
  
  j(i.e parame) {
    boolean bool;
    this.f = new ArrayList<Bundle>();
    this.g = new Bundle();
    this.c = parame;
    this.a = parame.a;
    int i = Build.VERSION.SDK_INT;
    if (i >= 26) {
      this.b = new Notification.Builder(parame.a, parame.K);
    } else {
      this.b = new Notification.Builder(parame.a);
    } 
    Notification notification = parame.S;
    Notification.Builder builder1 = this.b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, parame.i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
    if ((notification.flags & 0x2) != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    builder1 = builder1.setOngoing(bool);
    if ((notification.flags & 0x8) != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    builder1 = builder1.setOnlyAlertOnce(bool);
    if ((notification.flags & 0x10) != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    Notification.Builder builder2 = builder1.setAutoCancel(bool).setDefaults(notification.defaults).setContentTitle(parame.e).setContentText(parame.f).setContentInfo(parame.k).setContentIntent(parame.g).setDeleteIntent(notification.deleteIntent);
    PendingIntent pendingIntent = parame.h;
    if ((notification.flags & 0x80) != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    builder2.setFullScreenIntent(pendingIntent, bool).setLargeIcon(parame.j).setNumber(parame.l).setProgress(parame.t, parame.u, parame.v);
    if (i < 21)
      this.b.setSound(notification.sound, notification.audioStreamType); 
    if (i >= 16) {
      this.b.setSubText(parame.q).setUsesChronometer(parame.o).setPriority(parame.m);
      Iterator<i.a> iterator = parame.b.iterator();
      while (iterator.hasNext())
        b(iterator.next()); 
      Bundle bundle = parame.D;
      if (bundle != null)
        this.g.putAll(bundle); 
      if (Build.VERSION.SDK_INT < 20) {
        if (parame.z)
          this.g.putBoolean("android.support.localOnly", true); 
        String str = parame.w;
        if (str != null) {
          this.g.putString("android.support.groupKey", str);
          if (parame.x) {
            this.g.putBoolean("android.support.isGroupSummary", true);
          } else {
            this.g.putBoolean("android.support.useSideChannel", true);
          } 
        } 
        str = parame.y;
        if (str != null)
          this.g.putString("android.support.sortKey", str); 
      } 
      this.d = parame.H;
      this.e = parame.I;
    } 
    i = Build.VERSION.SDK_INT;
    if (i >= 17)
      this.b.setShowWhen(parame.n); 
    if (i >= 19 && i < 21) {
      List<String> list = e(g(parame.c), parame.V);
      if (list != null && !list.isEmpty())
        this.g.putStringArray("android.people", list.<String>toArray(new String[list.size()])); 
    } 
    if (i >= 20) {
      this.b.setLocalOnly(parame.z).setGroup(parame.w).setGroupSummary(parame.x).setSortKey(parame.y);
      this.h = parame.P;
    } 
    if (i >= 21) {
      List<String> list;
      this.b.setCategory(parame.C).setColor(parame.E).setVisibility(parame.F).setPublicVersion(parame.G).setSound(notification.sound, notification.audioAttributes);
      if (i < 28) {
        list = e(g(parame.c), parame.V);
      } else {
        list = parame.V;
      } 
      if (list != null && !list.isEmpty())
        for (String str : list)
          this.b.addPerson(str);  
      this.i = parame.J;
      if (parame.d.size() > 0) {
        Bundle bundle2 = parame.c().getBundle("android.car.EXTENSIONS");
        Bundle bundle1 = bundle2;
        if (bundle2 == null)
          bundle1 = new Bundle(); 
        bundle2 = new Bundle(bundle1);
        Bundle bundle3 = new Bundle();
        for (i = 0; i < parame.d.size(); i++)
          bundle3.putBundle(Integer.toString(i), k.b(parame.d.get(i))); 
        bundle1.putBundle("invisible_actions", bundle3);
        bundle2.putBundle("invisible_actions", bundle3);
        parame.c().putBundle("android.car.EXTENSIONS", bundle1);
        this.g.putBundle("android.car.EXTENSIONS", bundle2);
      } 
    } 
    i = Build.VERSION.SDK_INT;
    if (i >= 23) {
      Icon icon = parame.U;
      if (icon != null)
        this.b.setSmallIcon(icon); 
    } 
    if (i >= 24) {
      this.b.setExtras(parame.D).setRemoteInputHistory(parame.s);
      RemoteViews remoteViews = parame.H;
      if (remoteViews != null)
        this.b.setCustomContentView(remoteViews); 
      remoteViews = parame.I;
      if (remoteViews != null)
        this.b.setCustomBigContentView(remoteViews); 
      remoteViews = parame.J;
      if (remoteViews != null)
        this.b.setCustomHeadsUpContentView(remoteViews); 
    } 
    if (i >= 26) {
      this.b.setBadgeIconType(parame.L).setSettingsText(parame.r).setShortcutId(parame.M).setTimeoutAfter(parame.O).setGroupAlertBehavior(parame.P);
      if (parame.B)
        this.b.setColorized(parame.A); 
      if (!TextUtils.isEmpty(parame.K))
        this.b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null); 
    } 
    if (i >= 28)
      for (m m : parame.c)
        this.b.addPerson(m.h());  
    i = Build.VERSION.SDK_INT;
    if (i >= 29) {
      this.b.setAllowSystemGeneratedContextualActions(parame.Q);
      this.b.setBubbleMetadata(i.d.a(parame.R));
      if (parame.N != null)
        throw null; 
    } 
    if (parame.T) {
      if (this.c.x) {
        this.h = 2;
      } else {
        this.h = 1;
      } 
      this.b.setVibrate(null);
      this.b.setSound(null);
      int k = notification.defaults & 0xFFFFFFFE;
      notification.defaults = k;
      k &= 0xFFFFFFFD;
      notification.defaults = k;
      this.b.setDefaults(k);
      if (i >= 26) {
        if (TextUtils.isEmpty(this.c.w))
          this.b.setGroup("silent"); 
        this.b.setGroupAlertBehavior(this.h);
      } 
    } 
  }
  
  private void b(i.a parama) {
    int i = Build.VERSION.SDK_INT;
    if (i >= 20) {
      Notification.Action.Builder builder;
      Bundle bundle;
      IconCompat iconCompat = parama.e();
      boolean bool = false;
      if (i >= 23) {
        if (iconCompat != null) {
          Icon icon = iconCompat.p();
        } else {
          iconCompat = null;
        } 
        builder = new Notification.Action.Builder((Icon)iconCompat, parama.i(), parama.a());
      } else {
        if (builder != null) {
          i = builder.e();
        } else {
          i = 0;
        } 
        builder = new Notification.Action.Builder(i, parama.i(), parama.a());
      } 
      if (parama.f() != null) {
        RemoteInput[] arrayOfRemoteInput = n.b(parama.f());
        int k = arrayOfRemoteInput.length;
        for (i = bool; i < k; i++)
          builder.addRemoteInput(arrayOfRemoteInput[i]); 
      } 
      if (parama.d() != null) {
        bundle = new Bundle(parama.d());
      } else {
        bundle = new Bundle();
      } 
      bundle.putBoolean("android.support.allowGeneratedReplies", parama.b());
      i = Build.VERSION.SDK_INT;
      if (i >= 24)
        builder.setAllowGeneratedReplies(parama.b()); 
      bundle.putInt("android.support.action.semanticAction", parama.g());
      if (i >= 28)
        builder.setSemanticAction(parama.g()); 
      if (i >= 29)
        builder.setContextual(parama.j()); 
      bundle.putBoolean("android.support.action.showsUserInterface", parama.h());
      builder.addExtras(bundle);
      this.b.addAction(builder.build());
    } else if (i >= 16) {
      this.f.add(k.f(this.b, parama));
    } 
  }
  
  private static List<String> e(List<String> paramList1, List<String> paramList2) {
    if (paramList1 == null)
      return paramList2; 
    if (paramList2 == null)
      return paramList1; 
    b b = new b(paramList1.size() + paramList2.size());
    b.addAll(paramList1);
    b.addAll(paramList2);
    return new ArrayList<String>((Collection<? extends String>)b);
  }
  
  private static List<String> g(List<m> paramList) {
    if (paramList == null)
      return null; 
    ArrayList<String> arrayList = new ArrayList(paramList.size());
    Iterator<m> iterator = paramList.iterator();
    while (iterator.hasNext())
      arrayList.add(((m)iterator.next()).g()); 
    return arrayList;
  }
  
  private void h(Notification paramNotification) {
    paramNotification.sound = null;
    paramNotification.vibrate = null;
    int i = paramNotification.defaults & 0xFFFFFFFE;
    paramNotification.defaults = i;
    paramNotification.defaults = i & 0xFFFFFFFD;
  }
  
  public Notification.Builder a() {
    return this.b;
  }
  
  public Notification c() {
    RemoteViews remoteViews;
    i.f f = this.c.p;
    if (f != null)
      f.b(this); 
    if (f != null) {
      remoteViews = f.e(this);
    } else {
      remoteViews = null;
    } 
    Notification notification = d();
    if (remoteViews != null) {
      notification.contentView = remoteViews;
    } else {
      remoteViews = this.c.H;
      if (remoteViews != null)
        notification.contentView = remoteViews; 
    } 
    int i = Build.VERSION.SDK_INT;
    if (i >= 16 && f != null) {
      remoteViews = f.d(this);
      if (remoteViews != null)
        notification.bigContentView = remoteViews; 
    } 
    if (i >= 21 && f != null) {
      remoteViews = this.c.p.f(this);
      if (remoteViews != null)
        notification.headsUpContentView = remoteViews; 
    } 
    if (i >= 16 && f != null) {
      Bundle bundle = i.a(notification);
      if (bundle != null)
        f.a(bundle); 
    } 
    return notification;
  }
  
  protected Notification d() {
    int i = Build.VERSION.SDK_INT;
    if (i >= 26)
      return this.b.build(); 
    if (i >= 24) {
      Notification notification = this.b.build();
      if (this.h != 0) {
        if (notification.getGroup() != null && (notification.flags & 0x200) != 0 && this.h == 2)
          h(notification); 
        if (notification.getGroup() != null && (notification.flags & 0x200) == 0 && this.h == 1)
          h(notification); 
      } 
      return notification;
    } 
    if (i >= 21) {
      this.b.setExtras(this.g);
      Notification notification = this.b.build();
      RemoteViews remoteViews = this.d;
      if (remoteViews != null)
        notification.contentView = remoteViews; 
      remoteViews = this.e;
      if (remoteViews != null)
        notification.bigContentView = remoteViews; 
      remoteViews = this.i;
      if (remoteViews != null)
        notification.headsUpContentView = remoteViews; 
      if (this.h != 0) {
        if (notification.getGroup() != null && (notification.flags & 0x200) != 0 && this.h == 2)
          h(notification); 
        if (notification.getGroup() != null && (notification.flags & 0x200) == 0 && this.h == 1)
          h(notification); 
      } 
      return notification;
    } 
    if (i >= 20) {
      this.b.setExtras(this.g);
      Notification notification = this.b.build();
      RemoteViews remoteViews = this.d;
      if (remoteViews != null)
        notification.contentView = remoteViews; 
      remoteViews = this.e;
      if (remoteViews != null)
        notification.bigContentView = remoteViews; 
      if (this.h != 0) {
        if (notification.getGroup() != null && (notification.flags & 0x200) != 0 && this.h == 2)
          h(notification); 
        if (notification.getGroup() != null && (notification.flags & 0x200) == 0 && this.h == 1)
          h(notification); 
      } 
      return notification;
    } 
    if (i >= 19) {
      SparseArray<Bundle> sparseArray = k.a(this.f);
      if (sparseArray != null)
        this.g.putSparseParcelableArray("android.support.actionExtras", sparseArray); 
      this.b.setExtras(this.g);
      Notification notification = this.b.build();
      RemoteViews remoteViews = this.d;
      if (remoteViews != null)
        notification.contentView = remoteViews; 
      remoteViews = this.e;
      if (remoteViews != null)
        notification.bigContentView = remoteViews; 
      return notification;
    } 
    if (i >= 16) {
      Notification notification = this.b.build();
      Bundle bundle1 = i.a(notification);
      Bundle bundle2 = new Bundle(this.g);
      for (String str : this.g.keySet()) {
        if (bundle1.containsKey(str))
          bundle2.remove(str); 
      } 
      bundle1.putAll(bundle2);
      SparseArray<Bundle> sparseArray = k.a(this.f);
      if (sparseArray != null)
        i.a(notification).putSparseParcelableArray("android.support.actionExtras", sparseArray); 
      RemoteViews remoteViews = this.d;
      if (remoteViews != null)
        notification.contentView = remoteViews; 
      remoteViews = this.e;
      if (remoteViews != null)
        notification.bigContentView = remoteViews; 
      return notification;
    } 
    return this.b.getNotification();
  }
  
  Context f() {
    return this.a;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/core/app/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */