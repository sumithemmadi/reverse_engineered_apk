package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class e {
  private final Account a;
  
  private final Set<Scope> b;
  
  private final Set<Scope> c;
  
  private final Map<com.google.android.gms.common.api.a<?>, b> d;
  
  private final int e;
  
  private final View f;
  
  private final String g;
  
  private final String h;
  
  private final c.c.a.a.c.a i;
  
  private final boolean j;
  
  private Integer k;
  
  public e(Account paramAccount, Set<Scope> paramSet, Map<com.google.android.gms.common.api.a<?>, b> paramMap, int paramInt, View paramView, String paramString1, String paramString2, c.c.a.a.c.a parama, boolean paramBoolean) {
    this.a = paramAccount;
    if (paramSet == null) {
      set = Collections.emptySet();
    } else {
      set = Collections.unmodifiableSet(paramSet);
    } 
    this.b = set;
    Map<com.google.android.gms.common.api.a<?>, b> map = paramMap;
    if (paramMap == null)
      map = Collections.emptyMap(); 
    this.d = map;
    this.f = paramView;
    this.e = paramInt;
    this.g = paramString1;
    this.h = paramString2;
    this.i = parama;
    this.j = paramBoolean;
    Set<Scope> set = new HashSet<Scope>(set);
    Iterator iterator = map.values().iterator();
    while (iterator.hasNext())
      set.addAll(((b)iterator.next()).a); 
    this.c = Collections.unmodifiableSet(set);
  }
  
  public final Account a() {
    return this.a;
  }
  
  @Deprecated
  public final String b() {
    Account account = this.a;
    return (account != null) ? account.name : null;
  }
  
  public final Account c() {
    Account account = this.a;
    return (account != null) ? account : new Account("<<default account>>", "com.google");
  }
  
  public final Set<Scope> d() {
    return this.c;
  }
  
  public final Set<Scope> e(com.google.android.gms.common.api.a<?> parama) {
    b b = this.d.get(parama);
    if (b == null || b.a.isEmpty())
      return this.b; 
    HashSet<Scope> hashSet = new HashSet<Scope>(this.b);
    hashSet.addAll(b.a);
    return hashSet;
  }
  
  public final Integer f() {
    return this.k;
  }
  
  public final String g() {
    return this.h;
  }
  
  public final String h() {
    return this.g;
  }
  
  public final Set<Scope> i() {
    return this.b;
  }
  
  public final c.c.a.a.c.a j() {
    return this.i;
  }
  
  public final void k(Integer paramInteger) {
    this.k = paramInteger;
  }
  
  public static final class a {
    private Account a;
    
    private b.e.b<Scope> b;
    
    private Map<com.google.android.gms.common.api.a<?>, e.b> c;
    
    private int d = 0;
    
    private View e;
    
    private String f;
    
    private String g;
    
    private c.c.a.a.c.a h = c.c.a.a.c.a.b;
    
    private boolean i;
    
    public final a a(Collection<Scope> param1Collection) {
      if (this.b == null)
        this.b = new b.e.b(); 
      this.b.addAll(param1Collection);
      return this;
    }
    
    public final e b() {
      return new e(this.a, (Set<Scope>)this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }
    
    public final a c(Account param1Account) {
      this.a = param1Account;
      return this;
    }
    
    public final a d(String param1String) {
      this.g = param1String;
      return this;
    }
    
    public final a e(String param1String) {
      this.f = param1String;
      return this;
    }
  }
  
  public static final class b {
    public final Set<Scope> a;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/internal/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */