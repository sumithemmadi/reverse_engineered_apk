package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.List;

public class Credential extends AbstractSafeParcelable implements ReflectedParcelable {
  public static final Parcelable.Creator<Credential> CREATOR = new b();
  
  private final String b;
  
  private final String c;
  
  private final Uri d;
  
  private final List<IdToken> e;
  
  private final String f;
  
  private final String g;
  
  private final String h;
  
  private final String i;
  
  Credential(String paramString1, String paramString2, Uri paramUri, List<IdToken> paramList, String paramString3, String paramString4, String paramString5, String paramString6) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_1
    //   5: ldc 'credential identifier cannot be null'
    //   7: invokestatic k : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   10: checkcast java/lang/String
    //   13: invokevirtual trim : ()Ljava/lang/String;
    //   16: astore #9
    //   18: aload #9
    //   20: ldc 'credential identifier cannot be empty'
    //   22: invokestatic g : (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    //   25: pop
    //   26: aload #5
    //   28: ifnull -> 52
    //   31: aload #5
    //   33: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   36: ifne -> 42
    //   39: goto -> 52
    //   42: new java/lang/IllegalArgumentException
    //   45: dup
    //   46: ldc 'Password must not be empty if set'
    //   48: invokespecial <init> : (Ljava/lang/String;)V
    //   51: athrow
    //   52: aload #6
    //   54: ifnull -> 190
    //   57: aload #6
    //   59: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   62: istore #10
    //   64: iconst_0
    //   65: istore #11
    //   67: iload #11
    //   69: istore #12
    //   71: iload #10
    //   73: ifne -> 166
    //   76: aload #6
    //   78: invokestatic parse : (Ljava/lang/String;)Landroid/net/Uri;
    //   81: astore_1
    //   82: iload #11
    //   84: istore #12
    //   86: aload_1
    //   87: invokevirtual isAbsolute : ()Z
    //   90: ifeq -> 166
    //   93: iload #11
    //   95: istore #12
    //   97: aload_1
    //   98: invokevirtual isHierarchical : ()Z
    //   101: ifeq -> 166
    //   104: iload #11
    //   106: istore #12
    //   108: aload_1
    //   109: invokevirtual getScheme : ()Ljava/lang/String;
    //   112: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   115: ifne -> 166
    //   118: aload_1
    //   119: invokevirtual getAuthority : ()Ljava/lang/String;
    //   122: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   125: ifeq -> 135
    //   128: iload #11
    //   130: istore #12
    //   132: goto -> 166
    //   135: ldc 'http'
    //   137: aload_1
    //   138: invokevirtual getScheme : ()Ljava/lang/String;
    //   141: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   144: ifne -> 163
    //   147: iload #11
    //   149: istore #12
    //   151: ldc 'https'
    //   153: aload_1
    //   154: invokevirtual getScheme : ()Ljava/lang/String;
    //   157: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   160: ifeq -> 166
    //   163: iconst_1
    //   164: istore #12
    //   166: iload #12
    //   168: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   171: invokevirtual booleanValue : ()Z
    //   174: ifeq -> 180
    //   177: goto -> 190
    //   180: new java/lang/IllegalArgumentException
    //   183: dup
    //   184: ldc 'Account type must be a valid Http/Https URI'
    //   186: invokespecial <init> : (Ljava/lang/String;)V
    //   189: athrow
    //   190: aload #6
    //   192: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   195: ifne -> 219
    //   198: aload #5
    //   200: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   203: ifeq -> 209
    //   206: goto -> 219
    //   209: new java/lang/IllegalArgumentException
    //   212: dup
    //   213: ldc 'Password and AccountType are mutually exclusive'
    //   215: invokespecial <init> : (Ljava/lang/String;)V
    //   218: athrow
    //   219: aload_2
    //   220: astore_1
    //   221: aload_2
    //   222: ifnull -> 239
    //   225: aload_2
    //   226: astore_1
    //   227: aload_2
    //   228: invokevirtual trim : ()Ljava/lang/String;
    //   231: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   234: ifeq -> 239
    //   237: aconst_null
    //   238: astore_1
    //   239: aload_0
    //   240: aload_1
    //   241: putfield c : Ljava/lang/String;
    //   244: aload_0
    //   245: aload_3
    //   246: putfield d : Landroid/net/Uri;
    //   249: aload #4
    //   251: ifnonnull -> 261
    //   254: invokestatic emptyList : ()Ljava/util/List;
    //   257: astore_1
    //   258: goto -> 267
    //   261: aload #4
    //   263: invokestatic unmodifiableList : (Ljava/util/List;)Ljava/util/List;
    //   266: astore_1
    //   267: aload_0
    //   268: aload_1
    //   269: putfield e : Ljava/util/List;
    //   272: aload_0
    //   273: aload #9
    //   275: putfield b : Ljava/lang/String;
    //   278: aload_0
    //   279: aload #5
    //   281: putfield f : Ljava/lang/String;
    //   284: aload_0
    //   285: aload #6
    //   287: putfield g : Ljava/lang/String;
    //   290: aload_0
    //   291: aload #7
    //   293: putfield h : Ljava/lang/String;
    //   296: aload_0
    //   297: aload #8
    //   299: putfield i : Ljava/lang/String;
    //   302: return
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof Credential))
      return false; 
    paramObject = paramObject;
    return (TextUtils.equals(this.b, ((Credential)paramObject).b) && TextUtils.equals(this.c, ((Credential)paramObject).c) && r.a(this.d, ((Credential)paramObject).d) && TextUtils.equals(this.f, ((Credential)paramObject).f) && TextUtils.equals(this.g, ((Credential)paramObject).g));
  }
  
  public int hashCode() {
    return r.b(new Object[] { this.b, this.c, this.d, this.f, this.g });
  }
  
  public String o0() {
    return this.g;
  }
  
  public String p0() {
    return this.i;
  }
  
  public String q0() {
    return this.h;
  }
  
  public String r0() {
    return this.b;
  }
  
  public List<IdToken> s0() {
    return this.e;
  }
  
  public String t0() {
    return this.c;
  }
  
  public String u0() {
    return this.f;
  }
  
  public Uri v0() {
    return this.d;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = a.a(paramParcel);
    a.r(paramParcel, 1, r0(), false);
    a.r(paramParcel, 2, t0(), false);
    a.q(paramParcel, 3, (Parcelable)v0(), paramInt, false);
    a.v(paramParcel, 4, s0(), false);
    a.r(paramParcel, 5, u0(), false);
    a.r(paramParcel, 6, o0(), false);
    a.r(paramParcel, 9, q0(), false);
    a.r(paramParcel, 10, p0(), false);
    a.b(paramParcel, i);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/auth/api/credentials/Credential.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */