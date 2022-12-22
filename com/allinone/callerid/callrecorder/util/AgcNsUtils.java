package com.allinone.callerid.callrecorder.util;

public class AgcNsUtils {
  private int agcInstance = -1;
  
  private WebRtcAgcConfig config = null;
  
  private boolean mIsInit = false;
  
  private int nsHandler = 0;
  
  static {
    try {
      System.loadLibrary("yh_webrtc_agc_ns");
    } finally {
      Exception exception = null;
    } 
  }
  
  public AgcNsUtils() {
    this.config = new WebRtcAgcConfig();
    this.agcInstance = create();
  }
  
  public native int addFarend(int paramInt1, short[] paramArrayOfshort, int paramInt2);
  
  public native int addMic(int paramInt1, short[] paramArrayOfshort, int paramInt2, int paramInt3);
  
  public int agcProcess(short[] paramArrayOfshort1, int paramInt1, int paramInt2, short[] paramArrayOfshort2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    return process(this.agcInstance, paramArrayOfshort1, paramInt1, paramInt2, paramArrayOfshort2, paramInt3, paramInt4, paramInt5, paramInt6);
  }
  
  public void close() {
    if (this.mIsInit) {
      free(this.agcInstance);
      this.agcInstance = -1;
      this.mIsInit = false;
    } 
  }
  
  public native int create();
  
  public native int free(int paramInt);
  
  public native int getAddFarendError();
  
  public native int getConfig();
  
  public native int init(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5);
  
  public native int nsCreate();
  
  public native int nsFree(int paramInt);
  
  public native int nsInit(int paramInt1, int paramInt2);
  
  public native int nsProcess(int paramInt, short[] paramArrayOfshort1, short[] paramArrayOfshort2, short[] paramArrayOfshort3, short[] paramArrayOfshort4);
  
  public native int nsSetPolicy(int paramInt1, int paramInt2);
  
  public native int nsxCreate();
  
  public native int nsxFree(int paramInt);
  
  public native int nsxInit(int paramInt1, int paramInt2);
  
  public native int nsxProcess(int paramInt, short[] paramArrayOfshort1, short[] paramArrayOfshort2, short[] paramArrayOfshort3, short[] paramArrayOfshort4);
  
  public native int nsxSetPolicy(int paramInt1, int paramInt2);
  
  public AgcNsUtils prepare() {
    if (this.mIsInit) {
      close();
      this.agcInstance = create();
    } 
    init(this.agcInstance, 0, 255, 3, 8000);
    this.mIsInit = true;
    setConfig(this.agcInstance, this.config);
    return this;
  }
  
  public native int process(int paramInt1, short[] paramArrayOfshort1, int paramInt2, int paramInt3, short[] paramArrayOfshort2, int paramInt4, int paramInt5, int paramInt6, int paramInt7);
  
  public AgcNsUtils setAgcConfig(int paramInt1, int paramInt2, int paramInt3) {
    WebRtcAgcConfig.access$102(this.config, paramInt1);
    WebRtcAgcConfig.access$202(this.config, paramInt2);
    WebRtcAgcConfig.access$302(this.config, paramInt3);
    return this;
  }
  
  public native int setConfig(int paramInt, WebRtcAgcConfig paramWebRtcAgcConfig);
  
  public native int virtualMic();
  
  private static class WebRtcAgcConfig {
    private int compressionGaindB;
    
    private int limiterEnable;
    
    private int targetLevelDbfs;
    
    private WebRtcAgcConfig() {}
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/callrecorder/util/AgcNsUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */