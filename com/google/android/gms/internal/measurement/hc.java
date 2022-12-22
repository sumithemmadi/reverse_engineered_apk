package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.dynamic.a;
import java.util.Map;

public interface hc extends IInterface {
  void beginAdUnitExposure(String paramString, long paramLong);
  
  void clearConditionalUserProperty(String paramString1, String paramString2, Bundle paramBundle);
  
  void clearMeasurementEnabled(long paramLong);
  
  void endAdUnitExposure(String paramString, long paramLong);
  
  void generateEventId(kc paramkc);
  
  void getAppInstanceId(kc paramkc);
  
  void getCachedAppInstanceId(kc paramkc);
  
  void getConditionalUserProperties(String paramString1, String paramString2, kc paramkc);
  
  void getCurrentScreenClass(kc paramkc);
  
  void getCurrentScreenName(kc paramkc);
  
  void getGmpAppId(kc paramkc);
  
  void getMaxUserProperties(String paramString, kc paramkc);
  
  void getTestFlag(kc paramkc, int paramInt);
  
  void getUserProperties(String paramString1, String paramString2, boolean paramBoolean, kc paramkc);
  
  void initForTests(Map paramMap);
  
  void initialize(a parama, zzz paramzzz, long paramLong);
  
  void isDataCollectionEnabled(kc paramkc);
  
  void logEvent(String paramString1, String paramString2, Bundle paramBundle, boolean paramBoolean1, boolean paramBoolean2, long paramLong);
  
  void logEventAndBundle(String paramString1, String paramString2, Bundle paramBundle, kc paramkc, long paramLong);
  
  void logHealthData(int paramInt, String paramString, a parama1, a parama2, a parama3);
  
  void onActivityCreated(a parama, Bundle paramBundle, long paramLong);
  
  void onActivityDestroyed(a parama, long paramLong);
  
  void onActivityPaused(a parama, long paramLong);
  
  void onActivityResumed(a parama, long paramLong);
  
  void onActivitySaveInstanceState(a parama, kc paramkc, long paramLong);
  
  void onActivityStarted(a parama, long paramLong);
  
  void onActivityStopped(a parama, long paramLong);
  
  void performAction(Bundle paramBundle, kc paramkc, long paramLong);
  
  void registerOnMeasurementEventListener(nc paramnc);
  
  void resetAnalyticsData(long paramLong);
  
  void setConditionalUserProperty(Bundle paramBundle, long paramLong);
  
  void setConsent(Bundle paramBundle, long paramLong);
  
  void setConsentThirdParty(Bundle paramBundle, long paramLong);
  
  void setCurrentScreen(a parama, String paramString1, String paramString2, long paramLong);
  
  void setDataCollectionEnabled(boolean paramBoolean);
  
  void setDefaultEventParameters(Bundle paramBundle);
  
  void setEventInterceptor(nc paramnc);
  
  void setInstanceIdProvider(pc parampc);
  
  void setMeasurementEnabled(boolean paramBoolean, long paramLong);
  
  void setMinimumSessionDuration(long paramLong);
  
  void setSessionTimeoutDuration(long paramLong);
  
  void setUserId(String paramString, long paramLong);
  
  void setUserProperty(String paramString1, String paramString2, a parama, boolean paramBoolean, long paramLong);
  
  void unregisterOnMeasurementEventListener(nc paramnc);
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/measurement/hc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */