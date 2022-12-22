package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.a;

public abstract class gc extends u implements hc {
  public gc() {
    super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
  }
  
  public static hc asInterface(IBinder paramIBinder) {
    if (paramIBinder == null)
      return null; 
    IInterface iInterface = paramIBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    return (hc)((iInterface instanceof hc) ? iInterface : new dc(paramIBinder));
  }
  
  protected final boolean Y0(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    IBinder iBinder14;
    ic ic10;
    IBinder iBinder13;
    lc lc3;
    IBinder iBinder12;
    lc lc2;
    IBinder iBinder11;
    lc lc1;
    IBinder iBinder10;
    ic ic9;
    IBinder iBinder9;
    ic ic8;
    IBinder iBinder8;
    ic ic7;
    IBinder iBinder7;
    ic ic6;
    IBinder iBinder6;
    oc oc;
    IBinder iBinder5;
    ic ic5;
    IBinder iBinder4;
    ic ic4;
    IBinder iBinder3;
    IInterface iInterface2;
    ic ic3;
    IBinder iBinder2;
    ic ic2;
    IBinder iBinder1;
    IInterface iInterface1;
    ic ic1;
    String str1;
    String str2;
    IBinder iBinder30;
    ic ic14;
    IBinder iBinder29;
    ic ic13;
    IBinder iBinder28;
    ic ic12;
    IInterface iInterface3;
    String str3;
    ic ic11;
    Bundle bundle2;
    a a;
    String str4;
    IInterface iInterface5;
    Bundle bundle1;
    boolean bool;
    IBinder iBinder15 = null;
    IBinder iBinder16 = null;
    IBinder iBinder17 = null;
    IBinder iBinder18 = null;
    IBinder iBinder19 = null;
    IBinder iBinder20 = null;
    IBinder iBinder21 = null;
    IBinder iBinder22 = null;
    IBinder iBinder23 = null;
    IBinder iBinder24 = null;
    IBinder iBinder25 = null;
    IBinder iBinder26 = null;
    IBinder iBinder27 = null;
    IInterface iInterface4 = null;
    IBinder iBinder31 = null;
    IInterface iInterface6 = null;
    IBinder iBinder32 = null;
    switch (paramInt1) {
      default:
        return false;
      case 45:
        setConsentThirdParty((Bundle)r0.c(paramParcel1, Bundle.CREATOR), paramParcel1.readLong());
        paramParcel2.writeNoException();
        return true;
      case 44:
        setConsent((Bundle)r0.c(paramParcel1, Bundle.CREATOR), paramParcel1.readLong());
        paramParcel2.writeNoException();
        return true;
      case 43:
        clearMeasurementEnabled(paramParcel1.readLong());
        paramParcel2.writeNoException();
        return true;
      case 42:
        setDefaultEventParameters((Bundle)r0.c(paramParcel1, Bundle.CREATOR));
        paramParcel2.writeNoException();
        return true;
      case 40:
        iBinder14 = paramParcel1.readStrongBinder();
        if (iBinder14 == null) {
          iBinder14 = iBinder32;
        } else {
          kc kc;
          iInterface4 = iBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
          if (iInterface4 instanceof kc) {
            kc = (kc)iInterface4;
          } else {
            ic10 = new ic((IBinder)kc);
          } 
        } 
        isDataCollectionEnabled((kc)ic10);
        paramParcel2.writeNoException();
        return true;
      case 39:
        setDataCollectionEnabled(r0.a((Parcel)ic10));
        paramParcel2.writeNoException();
        return true;
      case 38:
        iBinder30 = ic10.readStrongBinder();
        if (iBinder30 == null) {
          iBinder30 = iBinder15;
        } else {
          kc kc;
          iInterface6 = iBinder30.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
          if (iInterface6 instanceof kc) {
            kc = (kc)iInterface6;
          } else {
            ic14 = new ic((IBinder)kc);
          } 
        } 
        getTestFlag((kc)ic14, ic10.readInt());
        paramParcel2.writeNoException();
        return true;
      case 37:
        initForTests(r0.f((Parcel)ic10));
        paramParcel2.writeNoException();
        return true;
      case 36:
        iBinder13 = ic10.readStrongBinder();
        if (iBinder13 == null) {
          iBinder13 = iBinder16;
        } else {
          nc nc;
          iInterface3 = iBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
          if (iInterface3 instanceof nc) {
            nc = (nc)iInterface3;
          } else {
            lc3 = new lc((IBinder)nc);
          } 
        } 
        unregisterOnMeasurementEventListener((nc)lc3);
        paramParcel2.writeNoException();
        return true;
      case 35:
        iBinder12 = lc3.readStrongBinder();
        if (iBinder12 == null) {
          iBinder12 = iBinder17;
        } else {
          nc nc;
          iInterface3 = iBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
          if (iInterface3 instanceof nc) {
            nc = (nc)iInterface3;
          } else {
            lc2 = new lc((IBinder)nc);
          } 
        } 
        registerOnMeasurementEventListener((nc)lc2);
        paramParcel2.writeNoException();
        return true;
      case 34:
        iBinder11 = lc2.readStrongBinder();
        if (iBinder11 == null) {
          iBinder11 = iBinder18;
        } else {
          nc nc;
          iInterface3 = iBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
          if (iInterface3 instanceof nc) {
            nc = (nc)iInterface3;
          } else {
            lc1 = new lc((IBinder)nc);
          } 
        } 
        setEventInterceptor((nc)lc1);
        paramParcel2.writeNoException();
        return true;
      case 33:
        logHealthData(lc1.readInt(), lc1.readString(), a.a.i1(lc1.readStrongBinder()), a.a.i1(lc1.readStrongBinder()), a.a.i1(lc1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 32:
        bundle2 = (Bundle)r0.c((Parcel)lc1, Bundle.CREATOR);
        iBinder29 = lc1.readStrongBinder();
        if (iBinder29 == null) {
          iBinder29 = iBinder19;
        } else {
          kc kc;
          IInterface iInterface = iBinder29.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
          if (iInterface instanceof kc) {
            kc = (kc)iInterface;
          } else {
            ic13 = new ic((IBinder)kc);
          } 
        } 
        performAction(bundle2, (kc)ic13, lc1.readLong());
        paramParcel2.writeNoException();
        return true;
      case 31:
        a = a.a.i1(lc1.readStrongBinder());
        iBinder28 = lc1.readStrongBinder();
        if (iBinder28 == null) {
          iBinder28 = iBinder20;
        } else {
          kc kc;
          IInterface iInterface = iBinder28.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
          if (iInterface instanceof kc) {
            kc = (kc)iInterface;
          } else {
            ic12 = new ic((IBinder)kc);
          } 
        } 
        onActivitySaveInstanceState(a, (kc)ic12, lc1.readLong());
        paramParcel2.writeNoException();
        return true;
      case 30:
        onActivityResumed(a.a.i1(lc1.readStrongBinder()), lc1.readLong());
        paramParcel2.writeNoException();
        return true;
      case 29:
        onActivityPaused(a.a.i1(lc1.readStrongBinder()), lc1.readLong());
        paramParcel2.writeNoException();
        return true;
      case 28:
        onActivityDestroyed(a.a.i1(lc1.readStrongBinder()), lc1.readLong());
        paramParcel2.writeNoException();
        return true;
      case 27:
        onActivityCreated(a.a.i1(lc1.readStrongBinder()), (Bundle)r0.c((Parcel)lc1, Bundle.CREATOR), lc1.readLong());
        paramParcel2.writeNoException();
        return true;
      case 26:
        onActivityStopped(a.a.i1(lc1.readStrongBinder()), lc1.readLong());
        paramParcel2.writeNoException();
        return true;
      case 25:
        onActivityStarted(a.a.i1(lc1.readStrongBinder()), lc1.readLong());
        paramParcel2.writeNoException();
        return true;
      case 24:
        endAdUnitExposure(lc1.readString(), lc1.readLong());
        paramParcel2.writeNoException();
        return true;
      case 23:
        beginAdUnitExposure(lc1.readString(), lc1.readLong());
        paramParcel2.writeNoException();
        return true;
      case 22:
        iBinder10 = lc1.readStrongBinder();
        if (iBinder10 == null) {
          iBinder10 = iBinder21;
        } else {
          kc kc;
          iInterface3 = iBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
          if (iInterface3 instanceof kc) {
            kc = (kc)iInterface3;
          } else {
            ic9 = new ic((IBinder)kc);
          } 
        } 
        generateEventId((kc)ic9);
        paramParcel2.writeNoException();
        return true;
      case 21:
        iBinder9 = ic9.readStrongBinder();
        if (iBinder9 == null) {
          iBinder9 = iBinder22;
        } else {
          kc kc;
          iInterface3 = iBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
          if (iInterface3 instanceof kc) {
            kc = (kc)iInterface3;
          } else {
            ic8 = new ic((IBinder)kc);
          } 
        } 
        getGmpAppId((kc)ic8);
        paramParcel2.writeNoException();
        return true;
      case 20:
        iBinder8 = ic8.readStrongBinder();
        if (iBinder8 == null) {
          iBinder8 = iBinder23;
        } else {
          kc kc;
          iInterface3 = iBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
          if (iInterface3 instanceof kc) {
            kc = (kc)iInterface3;
          } else {
            ic7 = new ic((IBinder)kc);
          } 
        } 
        getAppInstanceId((kc)ic7);
        paramParcel2.writeNoException();
        return true;
      case 19:
        iBinder7 = ic7.readStrongBinder();
        if (iBinder7 == null) {
          iBinder7 = iBinder24;
        } else {
          kc kc;
          iInterface3 = iBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
          if (iInterface3 instanceof kc) {
            kc = (kc)iInterface3;
          } else {
            ic6 = new ic((IBinder)kc);
          } 
        } 
        getCachedAppInstanceId((kc)ic6);
        paramParcel2.writeNoException();
        return true;
      case 18:
        iBinder6 = ic6.readStrongBinder();
        if (iBinder6 == null) {
          iBinder6 = iBinder25;
        } else {
          pc pc;
          iInterface3 = iBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
          if (iInterface3 instanceof pc) {
            pc = (pc)iInterface3;
          } else {
            oc = new oc((IBinder)pc);
          } 
        } 
        setInstanceIdProvider((pc)oc);
        paramParcel2.writeNoException();
        return true;
      case 17:
        iBinder5 = oc.readStrongBinder();
        if (iBinder5 == null) {
          iBinder5 = iBinder26;
        } else {
          kc kc;
          iInterface3 = iBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
          if (iInterface3 instanceof kc) {
            kc = (kc)iInterface3;
          } else {
            ic5 = new ic((IBinder)kc);
          } 
        } 
        getCurrentScreenClass((kc)ic5);
        paramParcel2.writeNoException();
        return true;
      case 16:
        iBinder4 = ic5.readStrongBinder();
        if (iBinder4 == null) {
          iBinder4 = iBinder27;
        } else {
          kc kc;
          iInterface3 = iBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
          if (iInterface3 instanceof kc) {
            kc = (kc)iInterface3;
          } else {
            ic4 = new ic((IBinder)kc);
          } 
        } 
        getCurrentScreenName((kc)ic4);
        paramParcel2.writeNoException();
        return true;
      case 15:
        setCurrentScreen(a.a.i1(ic4.readStrongBinder()), ic4.readString(), ic4.readString(), ic4.readLong());
        paramParcel2.writeNoException();
        return true;
      case 14:
        setSessionTimeoutDuration(ic4.readLong());
        paramParcel2.writeNoException();
        return true;
      case 13:
        setMinimumSessionDuration(ic4.readLong());
        paramParcel2.writeNoException();
        return true;
      case 12:
        resetAnalyticsData(ic4.readLong());
        paramParcel2.writeNoException();
        return true;
      case 11:
        setMeasurementEnabled(r0.a((Parcel)ic4), ic4.readLong());
        paramParcel2.writeNoException();
        return true;
      case 10:
        str1 = ic4.readString();
        str4 = ic4.readString();
        iBinder3 = ic4.readStrongBinder();
        if (iBinder3 == null) {
          iInterface2 = iInterface3;
        } else {
          kc kc;
          iInterface3 = iInterface2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
          if (iInterface3 instanceof kc) {
            kc = (kc)iInterface3;
          } else {
            ic3 = new ic((IBinder)kc);
          } 
        } 
        getConditionalUserProperties(str1, str4, (kc)ic3);
        paramParcel2.writeNoException();
        return true;
      case 9:
        clearConditionalUserProperty(ic3.readString(), ic3.readString(), (Bundle)r0.c((Parcel)ic3, Bundle.CREATOR));
        paramParcel2.writeNoException();
        return true;
      case 8:
        setConditionalUserProperty((Bundle)r0.c((Parcel)ic3, Bundle.CREATOR), ic3.readLong());
        paramParcel2.writeNoException();
        return true;
      case 7:
        setUserId(ic3.readString(), ic3.readLong());
        paramParcel2.writeNoException();
        return true;
      case 6:
        str3 = ic3.readString();
        iBinder2 = ic3.readStrongBinder();
        if (iBinder2 == null) {
          iBinder2 = iBinder31;
        } else {
          kc kc;
          iInterface5 = iBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
          if (iInterface5 instanceof kc) {
            kc = (kc)iInterface5;
          } else {
            ic2 = new ic((IBinder)kc);
          } 
        } 
        getMaxUserProperties(str3, (kc)ic2);
        paramParcel2.writeNoException();
        return true;
      case 5:
        str1 = ic2.readString();
        str3 = ic2.readString();
        bool = r0.a((Parcel)ic2);
        iBinder1 = ic2.readStrongBinder();
        if (iBinder1 == null) {
          iInterface1 = iInterface5;
        } else {
          kc kc;
          iInterface5 = iInterface1.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
          if (iInterface5 instanceof kc) {
            kc = (kc)iInterface5;
          } else {
            ic1 = new ic((IBinder)kc);
          } 
        } 
        getUserProperties(str1, str3, bool, (kc)ic1);
        paramParcel2.writeNoException();
        return true;
      case 4:
        setUserProperty(ic1.readString(), ic1.readString(), a.a.i1(ic1.readStrongBinder()), r0.a((Parcel)ic1), ic1.readLong());
        paramParcel2.writeNoException();
        return true;
      case 3:
        str1 = ic1.readString();
        str2 = ic1.readString();
        bundle1 = (Bundle)r0.c((Parcel)ic1, Bundle.CREATOR);
        iBinder31 = ic1.readStrongBinder();
        if (iBinder31 == null) {
          str3 = null;
        } else {
          IInterface iInterface = iBinder31.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
          if (iInterface instanceof kc) {
            kc kc = (kc)iInterface;
          } else {
            ic11 = new ic(iBinder31);
          } 
        } 
        logEventAndBundle(str1, str2, bundle1, (kc)ic11, ic1.readLong());
        paramParcel2.writeNoException();
        return true;
      case 2:
        logEvent(ic1.readString(), ic1.readString(), (Bundle)r0.c((Parcel)ic1, Bundle.CREATOR), r0.a((Parcel)ic1), r0.a((Parcel)ic1), ic1.readLong());
        paramParcel2.writeNoException();
        return true;
      case 1:
        break;
    } 
    initialize(a.a.i1(ic1.readStrongBinder()), (zzz)r0.c((Parcel)ic1, zzz.CREATOR), ic1.readLong());
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/measurement/gc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */