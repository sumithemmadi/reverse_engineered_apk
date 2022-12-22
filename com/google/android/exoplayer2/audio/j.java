package com.google.android.exoplayer2.audio;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.provider.Settings;
import com.google.android.exoplayer2.util.h0;
import java.util.Arrays;

@TargetApi(21)
public final class j {
  public static final j a = new j(new int[] { 2 }, 8);
  
  private static final j b = new j(new int[] { 2, 5, 6 }, 8);
  
  private final int[] c;
  
  private final int d;
  
  public j(int[] paramArrayOfint, int paramInt) {
    if (paramArrayOfint != null) {
      paramArrayOfint = Arrays.copyOf(paramArrayOfint, paramArrayOfint.length);
      this.c = paramArrayOfint;
      Arrays.sort(paramArrayOfint);
    } else {
      this.c = new int[0];
    } 
    this.d = paramInt;
  }
  
  private static boolean a() {
    boolean bool;
    if (h0.a >= 17 && "Amazon".equals(h0.c)) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public static j b(Context paramContext) {
    return c(paramContext, paramContext.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
  }
  
  @SuppressLint({"InlinedApi"})
  static j c(Context paramContext, Intent paramIntent) {
    return (a() && Settings.Global.getInt(paramContext.getContentResolver(), "external_surround_sound_enabled", 0) == 1) ? b : ((paramIntent == null || paramIntent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) ? a : new j(paramIntent.getIntArrayExtra("android.media.extra.ENCODINGS"), paramIntent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8)));
  }
  
  public int d() {
    return this.d;
  }
  
  public boolean e(int paramInt) {
    boolean bool;
    if (Arrays.binarySearch(this.c, paramInt) >= 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = true;
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof j))
      return false; 
    paramObject = paramObject;
    if (!Arrays.equals(this.c, ((j)paramObject).c) || this.d != ((j)paramObject).d)
      bool = false; 
    return bool;
  }
  
  public int hashCode() {
    return this.d + Arrays.hashCode(this.c) * 31;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("AudioCapabilities[maxChannelCount=");
    stringBuilder.append(this.d);
    stringBuilder.append(", supportedEncodings=");
    stringBuilder.append(Arrays.toString(this.c));
    stringBuilder.append("]");
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/audio/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */