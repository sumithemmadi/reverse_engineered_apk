package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class CredentialPickerConfig extends AbstractSafeParcelable implements ReflectedParcelable {
  public static final Parcelable.Creator<CredentialPickerConfig> CREATOR = new d();
  
  private final int b;
  
  private final boolean c;
  
  private final boolean d;
  
  @Deprecated
  private final boolean e;
  
  private final int f;
  
  CredentialPickerConfig(int paramInt1, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, int paramInt2) {
    this.b = paramInt1;
    this.c = paramBoolean1;
    this.d = paramBoolean2;
    paramBoolean1 = true;
    boolean bool = true;
    if (paramInt1 < 2) {
      this.e = paramBoolean3;
      paramInt1 = bool;
      if (paramBoolean3)
        paramInt1 = 3; 
      this.f = paramInt1;
      return;
    } 
    if (paramInt2 != 3)
      paramBoolean1 = false; 
    this.e = paramBoolean1;
    this.f = paramInt2;
  }
  
  private CredentialPickerConfig(a parama) {
    this(2, a.b(parama), a.c(parama), false, a.d(parama));
  }
  
  @Deprecated
  public final boolean o0() {
    return (this.f == 3);
  }
  
  public final boolean p0() {
    return this.c;
  }
  
  public final boolean q0() {
    return this.d;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = com.google.android.gms.common.internal.safeparcel.a.a(paramParcel);
    com.google.android.gms.common.internal.safeparcel.a.c(paramParcel, 1, p0());
    com.google.android.gms.common.internal.safeparcel.a.c(paramParcel, 2, q0());
    com.google.android.gms.common.internal.safeparcel.a.c(paramParcel, 3, o0());
    com.google.android.gms.common.internal.safeparcel.a.k(paramParcel, 4, this.f);
    com.google.android.gms.common.internal.safeparcel.a.k(paramParcel, 1000, this.b);
    com.google.android.gms.common.internal.safeparcel.a.b(paramParcel, paramInt);
  }
  
  public static class a {
    private boolean a = false;
    
    private boolean b = true;
    
    private int c = 1;
    
    public CredentialPickerConfig a() {
      return new CredentialPickerConfig(this, null);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/auth/api/credentials/CredentialPickerConfig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */