package com.tencent.mmkv;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.util.Log;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MMKV implements SharedPreferences, SharedPreferences.Editor {
  private static final EnumMap<MMKVRecoverStrategic, Integer> a;
  
  private static final EnumMap<MMKVLogLevel, Integer> b;
  
  private static final MMKVLogLevel[] c;
  
  private static final Set<Long> d = new HashSet<Long>();
  
  private static String e = null;
  
  private static boolean f = true;
  
  private static final HashMap<String, Parcelable.Creator<?>> g = new HashMap<String, Parcelable.Creator<?>>();
  
  private static b h;
  
  private static boolean i = false;
  
  private static a j;
  
  private final long nativeHandle;
  
  private MMKV(long paramLong) {
    this.nativeHandle = paramLong;
  }
  
  private static MMKV a(long paramLong, String paramString, int paramInt) {
    if (paramLong != 0L) {
      if (!f)
        return new MMKV(paramLong); 
      synchronized (d) {
        if (!null.contains(Long.valueOf(paramLong))) {
          if (!checkProcessMode(paramLong)) {
            String str;
            if (paramInt == 1) {
              StringBuilder stringBuilder1 = new StringBuilder();
              this();
              stringBuilder1.append("Opening a multi-process MMKV instance [");
              stringBuilder1.append(paramString);
              stringBuilder1.append("] with SINGLE_PROCESS_MODE!");
              paramString = stringBuilder1.toString();
            } else {
              StringBuilder stringBuilder2 = new StringBuilder();
              this();
              stringBuilder2.append("Opening an MMKV instance [");
              stringBuilder2.append(paramString);
              stringBuilder2.append("] with MULTI_PROCESS_MODE, ");
              String str1 = stringBuilder2.toString();
              StringBuilder stringBuilder1 = new StringBuilder();
              this();
              stringBuilder1.append(str1);
              stringBuilder1.append("while it's already been opened with SINGLE_PROCESS_MODE by someone somewhere else!");
              str = stringBuilder1.toString();
            } 
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            this(str);
            throw illegalArgumentException;
          } 
          null.add(Long.valueOf(paramLong));
        } 
        return new MMKV(paramLong);
      } 
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Fail to create an MMKV instance [");
    stringBuilder.append(paramString);
    stringBuilder.append("] in JNI");
    throw new RuntimeException(stringBuilder.toString());
  }
  
  private native long actualSize(long paramLong);
  
  private static native boolean checkProcessMode(long paramLong);
  
  private native boolean containsKey(long paramLong, String paramString);
  
  private native long count(long paramLong);
  
  private static native long createNB(int paramInt);
  
  private native boolean decodeBool(long paramLong, String paramString, boolean paramBoolean);
  
  private native byte[] decodeBytes(long paramLong, String paramString);
  
  private native double decodeDouble(long paramLong, String paramString, double paramDouble);
  
  private native float decodeFloat(long paramLong, String paramString, float paramFloat);
  
  private native int decodeInt(long paramLong, String paramString, int paramInt);
  
  private native long decodeLong(long paramLong1, String paramString, long paramLong2);
  
  private native String decodeString(long paramLong, String paramString1, String paramString2);
  
  private native String[] decodeStringSet(long paramLong, String paramString);
  
  private static native void destroyNB(long paramLong, int paramInt);
  
  private native boolean encodeBool(long paramLong, String paramString, boolean paramBoolean);
  
  private native boolean encodeBytes(long paramLong, String paramString, byte[] paramArrayOfbyte);
  
  private native boolean encodeDouble(long paramLong, String paramString, double paramDouble);
  
  private native boolean encodeFloat(long paramLong, String paramString, float paramFloat);
  
  private native boolean encodeInt(long paramLong, String paramString, int paramInt);
  
  private native boolean encodeLong(long paramLong1, String paramString, long paramLong2);
  
  private native boolean encodeSet(long paramLong, String paramString, String[] paramArrayOfString);
  
  private native boolean encodeString(long paramLong, String paramString1, String paramString2);
  
  private static native long getDefaultMMKV(int paramInt, String paramString);
  
  private static native long getMMKVWithAshmemFD(String paramString1, int paramInt1, int paramInt2, String paramString2);
  
  private static native long getMMKVWithID(String paramString1, int paramInt, String paramString2, String paramString3);
  
  private static native long getMMKVWithIDAndSize(String paramString1, int paramInt1, int paramInt2, String paramString2);
  
  private static String i(String paramString, b paramb, MMKVLogLevel paramMMKVLogLevel) {
    if (paramb != null) {
      paramb.a("mmkv");
    } else {
      System.loadLibrary("mmkv");
    } 
    jniInitialize(paramString, q(paramMMKVLogLevel));
    e = paramString;
    return paramString;
  }
  
  public static native boolean isFileValid(String paramString1, String paramString2);
  
  private static native void jniInitialize(String paramString, int paramInt);
  
  private static void mmkvLogImp(int paramInt1, String paramString1, int paramInt2, String paramString2, String paramString3) {
    b b1 = h;
    if (b1 != null && i) {
      b1.b(c[paramInt1], paramString1, paramInt2, paramString2, paramString3);
    } else {
      paramInt1 = a.a[c[paramInt1].ordinal()];
      if (paramInt1 != 1) {
        if (paramInt1 != 2) {
          if (paramInt1 != 3) {
            if (paramInt1 == 5)
              Log.i("MMKV", paramString3); 
          } else {
            Log.e("MMKV", paramString3);
          } 
        } else {
          Log.w("MMKV", paramString3);
        } 
      } else {
        Log.d("MMKV", paramString3);
      } 
    } 
  }
  
  public static String o() {
    return e;
  }
  
  private static void onContentChangedByOuterProcess(String paramString) {
    a a1 = j;
    if (a1 != null)
      a1.a(paramString); 
  }
  
  public static native void onExit();
  
  private static int onMMKVCRCCheckFail(String paramString) {
    int i;
    MMKVRecoverStrategic mMKVRecoverStrategic = MMKVRecoverStrategic.b;
    b b1 = h;
    if (b1 != null)
      mMKVRecoverStrategic = b1.c(paramString); 
    MMKVLogLevel mMKVLogLevel = MMKVLogLevel.c;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Recover strategic for ");
    stringBuilder.append(paramString);
    stringBuilder.append(" is ");
    stringBuilder.append(mMKVRecoverStrategic);
    v(mMKVLogLevel, stringBuilder.toString());
    Integer integer = a.get(mMKVRecoverStrategic);
    if (integer == null) {
      i = 0;
    } else {
      i = integer.intValue();
    } 
    return i;
  }
  
  private static int onMMKVFileLengthError(String paramString) {
    int i;
    MMKVRecoverStrategic mMKVRecoverStrategic = MMKVRecoverStrategic.b;
    b b1 = h;
    if (b1 != null)
      mMKVRecoverStrategic = b1.a(paramString); 
    MMKVLogLevel mMKVLogLevel = MMKVLogLevel.c;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Recover strategic for ");
    stringBuilder.append(paramString);
    stringBuilder.append(" is ");
    stringBuilder.append(mMKVRecoverStrategic);
    v(mMKVLogLevel, stringBuilder.toString());
    Integer integer = a.get(mMKVRecoverStrategic);
    if (integer == null) {
      i = 0;
    } else {
      i = integer.intValue();
    } 
    return i;
  }
  
  @Deprecated
  public static String p(String paramString, b paramb) {
    return i(paramString, paramb, MMKVLogLevel.c);
  }
  
  public static native int pageSize();
  
  private static int q(MMKVLogLevel paramMMKVLogLevel) {
    int i = a.a[paramMMKVLogLevel.ordinal()];
    byte b1 = 4;
    if (i != 1) {
      if (i != 2) {
        if (i != 3) {
          if (i != 4)
            b1 = 1; 
        } else {
          b1 = 3;
        } 
      } else {
        b1 = 2;
      } 
    } else {
      b1 = 0;
    } 
    return b1;
  }
  
  public static MMKV r(String paramString1, int paramInt1, int paramInt2, String paramString2) {
    long l = getMMKVWithAshmemFD(paramString1, paramInt1, paramInt2, paramString2);
    if (l != 0L)
      return new MMKV(l); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Fail to create an ashmem MMKV instance [");
    stringBuilder.append(paramString1);
    stringBuilder.append("] in JNI");
    throw new RuntimeException(stringBuilder.toString());
  }
  
  private native void removeValueForKey(long paramLong, String paramString);
  
  public static MMKV s(Context paramContext, String paramString1, int paramInt1, int paramInt2, String paramString2) {
    if (e != null) {
      String str = MMKVContentProvider.b(paramContext, Process.myPid());
      if (str != null && str.length() != 0) {
        StringBuilder stringBuilder2;
        if (str.contains(":")) {
          Uri uri = MMKVContentProvider.a(paramContext);
          if (uri != null) {
            MMKVLogLevel mMKVLogLevel = MMKVLogLevel.c;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("getting parcelable mmkv in process, Uri = ");
            stringBuilder.append(uri);
            v(mMKVLogLevel, stringBuilder.toString());
            Bundle bundle2 = new Bundle();
            bundle2.putInt("KEY_SIZE", paramInt1);
            bundle2.putInt("KEY_MODE", paramInt2);
            if (paramString2 != null)
              bundle2.putString("KEY_CRYPT", paramString2); 
            Bundle bundle1 = paramContext.getContentResolver().call(uri, "mmkvFromAshmemID", paramString1, bundle2);
            if (bundle1 != null) {
              bundle1.setClassLoader(ParcelableMMKV.class.getClassLoader());
              ParcelableMMKV parcelableMMKV = (ParcelableMMKV)bundle1.getParcelable("KEY");
              if (parcelableMMKV != null) {
                MMKV mMKV = parcelableMMKV.a();
                if (mMKV != null) {
                  stringBuilder2 = new StringBuilder();
                  stringBuilder2.append(mMKV.mmapID());
                  stringBuilder2.append(" fd = ");
                  stringBuilder2.append(mMKV.ashmemFD());
                  stringBuilder2.append(", meta fd = ");
                  stringBuilder2.append(mMKV.ashmemMetaFD());
                  v(mMKVLogLevel, stringBuilder2.toString());
                  return mMKV;
                } 
              } 
            } 
          } else {
            v(MMKVLogLevel.e, "MMKVContentProvider has invalid authority");
            throw new IllegalStateException("MMKVContentProvider has invalid authority");
          } 
        } 
        v(MMKVLogLevel.c, "getting mmkv in main process");
        long l = getMMKVWithIDAndSize((String)stringBuilder2, paramInt1, paramInt2 | 0x8, paramString2);
        if (l != 0L)
          return new MMKV(l); 
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("Fail to create an Ashmem MMKV instance [");
        stringBuilder1.append((String)stringBuilder2);
        stringBuilder1.append("]");
        throw new IllegalStateException(stringBuilder1.toString());
      } 
      v(MMKVLogLevel.e, "process name detect fail, try again later");
      throw new IllegalStateException("process name detect fail, try again later");
    } 
    throw new IllegalStateException("You should Call MMKV.initialize() first.");
  }
  
  private static native void setCallbackHandler(boolean paramBoolean1, boolean paramBoolean2);
  
  private static native void setLogLevel(int paramInt);
  
  private static native void setWantsContentChangeNotify(boolean paramBoolean);
  
  private native void sync(boolean paramBoolean);
  
  public static MMKV t(String paramString, int paramInt) {
    if (e != null)
      return a(getMMKVWithID(paramString, paramInt, null, null), paramString, paramInt); 
    throw new IllegalStateException("You should Call MMKV.initialize() first.");
  }
  
  private native long totalSize(long paramLong);
  
  private static void v(MMKVLogLevel paramMMKVLogLevel, String paramString) {
    int i;
    StackTraceElement[] arrayOfStackTraceElement = Thread.currentThread().getStackTrace();
    StackTraceElement stackTraceElement = arrayOfStackTraceElement[arrayOfStackTraceElement.length - 1];
    Integer integer = b.get(paramMMKVLogLevel);
    if (integer == null) {
      i = 0;
    } else {
      i = integer.intValue();
    } 
    mmkvLogImp(i, stackTraceElement.getFileName(), stackTraceElement.getLineNumber(), stackTraceElement.getMethodName(), paramString);
  }
  
  private native int valueSize(long paramLong, String paramString, boolean paramBoolean);
  
  public static native String version();
  
  private native int writeValueToNB(long paramLong1, String paramString, long paramLong2, int paramInt);
  
  public native String[] allKeys();
  
  @Deprecated
  public void apply() {
    sync(false);
  }
  
  public native int ashmemFD();
  
  public native int ashmemMetaFD();
  
  public boolean b(String paramString) {
    return containsKey(this.nativeHandle, paramString);
  }
  
  public boolean c(String paramString, boolean paramBoolean) {
    return decodeBool(this.nativeHandle, paramString, paramBoolean);
  }
  
  public native void checkContentChangedByOuterProcess();
  
  public native void checkReSetCryptKey(String paramString);
  
  public SharedPreferences.Editor clear() {
    clearAll();
    return this;
  }
  
  public native void clearAll();
  
  public native void clearMemoryCache();
  
  public native void close();
  
  @Deprecated
  public boolean commit() {
    sync(true);
    return true;
  }
  
  public boolean contains(String paramString) {
    return b(paramString);
  }
  
  public native String cryptKey();
  
  public int d(String paramString, int paramInt) {
    return decodeInt(this.nativeHandle, paramString, paramInt);
  }
  
  public long e(String paramString, long paramLong) {
    return decodeLong(this.nativeHandle, paramString, paramLong);
  }
  
  public SharedPreferences.Editor edit() {
    return this;
  }
  
  public String f(String paramString1, String paramString2) {
    return decodeString(this.nativeHandle, paramString1, paramString2);
  }
  
  public Set<String> g(String paramString, Set<String> paramSet) {
    return h(paramString, paramSet, (Class)HashSet.class);
  }
  
  public Map<String, ?> getAll() {
    throw new UnsupportedOperationException("Intentionally Not Supported. Use allKeys() instead, getAll() not implement because type-erasure inside mmkv");
  }
  
  public boolean getBoolean(String paramString, boolean paramBoolean) {
    return decodeBool(this.nativeHandle, paramString, paramBoolean);
  }
  
  public float getFloat(String paramString, float paramFloat) {
    return decodeFloat(this.nativeHandle, paramString, paramFloat);
  }
  
  public int getInt(String paramString, int paramInt) {
    return decodeInt(this.nativeHandle, paramString, paramInt);
  }
  
  public long getLong(String paramString, long paramLong) {
    return decodeLong(this.nativeHandle, paramString, paramLong);
  }
  
  public String getString(String paramString1, String paramString2) {
    return decodeString(this.nativeHandle, paramString1, paramString2);
  }
  
  public Set<String> getStringSet(String paramString, Set<String> paramSet) {
    return g(paramString, paramSet);
  }
  
  public Set<String> h(String paramString, Set<String> paramSet, Class<? extends Set> paramClass) {
    String[] arrayOfString = decodeStringSet(this.nativeHandle, paramString);
    if (arrayOfString == null)
      return paramSet; 
    try {
      Set<String> set = paramClass.newInstance();
      set.addAll(Arrays.asList(arrayOfString));
      return set;
    } catch (IllegalAccessException|InstantiationException illegalAccessException) {
      return paramSet;
    } 
  }
  
  public boolean j(String paramString, int paramInt) {
    return encodeInt(this.nativeHandle, paramString, paramInt);
  }
  
  public boolean k(String paramString, long paramLong) {
    return encodeLong(this.nativeHandle, paramString, paramLong);
  }
  
  public boolean l(String paramString1, String paramString2) {
    return encodeString(this.nativeHandle, paramString1, paramString2);
  }
  
  public native void lock();
  
  public boolean m(String paramString, Set<String> paramSet) {
    String[] arrayOfString;
    long l = this.nativeHandle;
    if (paramSet == null) {
      paramSet = null;
    } else {
      arrayOfString = paramSet.<String>toArray(new String[0]);
    } 
    return encodeSet(l, paramString, arrayOfString);
  }
  
  public native String mmapID();
  
  public boolean n(String paramString, boolean paramBoolean) {
    return encodeBool(this.nativeHandle, paramString, paramBoolean);
  }
  
  public SharedPreferences.Editor putBoolean(String paramString, boolean paramBoolean) {
    encodeBool(this.nativeHandle, paramString, paramBoolean);
    return this;
  }
  
  public SharedPreferences.Editor putFloat(String paramString, float paramFloat) {
    encodeFloat(this.nativeHandle, paramString, paramFloat);
    return this;
  }
  
  public SharedPreferences.Editor putInt(String paramString, int paramInt) {
    encodeInt(this.nativeHandle, paramString, paramInt);
    return this;
  }
  
  public SharedPreferences.Editor putLong(String paramString, long paramLong) {
    encodeLong(this.nativeHandle, paramString, paramLong);
    return this;
  }
  
  public SharedPreferences.Editor putString(String paramString1, String paramString2) {
    encodeString(this.nativeHandle, paramString1, paramString2);
    return this;
  }
  
  public SharedPreferences.Editor putStringSet(String paramString, Set<String> paramSet) {
    m(paramString, paramSet);
    return this;
  }
  
  public native boolean reKey(String paramString);
  
  public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener paramOnSharedPreferenceChangeListener) {
    throw new UnsupportedOperationException("Intentionally Not implement in MMKV");
  }
  
  public SharedPreferences.Editor remove(String paramString) {
    u(paramString);
    return this;
  }
  
  public native void removeValuesForKeys(String[] paramArrayOfString);
  
  public native void trim();
  
  public native boolean tryLock();
  
  public void u(String paramString) {
    removeValueForKey(this.nativeHandle, paramString);
  }
  
  public native void unlock();
  
  public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener paramOnSharedPreferenceChangeListener) {
    throw new UnsupportedOperationException("Intentionally Not implement in MMKV");
  }
  
  static {
    EnumMap<MMKVRecoverStrategic, Object> enumMap = new EnumMap<MMKVRecoverStrategic, Object>(MMKVRecoverStrategic.class);
    a = (EnumMap)enumMap;
    MMKVRecoverStrategic mMKVRecoverStrategic = MMKVRecoverStrategic.b;
    Integer integer1 = Integer.valueOf(0);
    enumMap.put(mMKVRecoverStrategic, integer1);
    mMKVRecoverStrategic = MMKVRecoverStrategic.c;
    Integer integer2 = Integer.valueOf(1);
    enumMap.put(mMKVRecoverStrategic, integer2);
    EnumMap<MMKVLogLevel, Object> enumMap1 = new EnumMap<MMKVLogLevel, Object>(MMKVLogLevel.class);
    b = (EnumMap)enumMap1;
    MMKVLogLevel mMKVLogLevel1 = MMKVLogLevel.b;
    enumMap1.put(mMKVLogLevel1, integer1);
    MMKVLogLevel mMKVLogLevel2 = MMKVLogLevel.c;
    enumMap1.put(mMKVLogLevel2, integer2);
    MMKVLogLevel mMKVLogLevel4 = MMKVLogLevel.d;
    enumMap1.put(mMKVLogLevel4, Integer.valueOf(2));
    MMKVLogLevel mMKVLogLevel5 = MMKVLogLevel.e;
    enumMap1.put(mMKVLogLevel5, Integer.valueOf(3));
    MMKVLogLevel mMKVLogLevel3 = MMKVLogLevel.f;
    enumMap1.put(mMKVLogLevel3, Integer.valueOf(4));
    c = new MMKVLogLevel[] { mMKVLogLevel1, mMKVLogLevel2, mMKVLogLevel4, mMKVLogLevel5, mMKVLogLevel3 };
  }
  
  public static interface b {
    void a(String param1String);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/tencent/mmkv/MMKV.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */