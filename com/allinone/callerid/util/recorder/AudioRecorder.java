package com.allinone.callerid.util.recorder;

import android.media.AudioRecord;
import android.util.Log;
import com.allinone.callerid.callrecorder.util.AgcNsUtils;
import com.allinone.callerid.util.d0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class AudioRecorder {
  private int a = 1;
  
  private int b = 8000;
  
  private int c = 16;
  
  private int d = 2;
  
  private int e = 0;
  
  private AudioRecord f;
  
  private Status g = Status.b;
  
  protected String h;
  
  protected String i;
  
  protected String j;
  
  private c k;
  
  private int l = 0;
  
  private a m;
  
  public AudioRecorder(a parama, String paramString1, String paramString2, int paramInt) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramString1);
    stringBuilder.append("");
    this.h = c.c(stringBuilder.toString());
    stringBuilder = new StringBuilder();
    stringBuilder.append(paramString1);
    stringBuilder.append("");
    this.i = c.b(stringBuilder.toString());
    this.m = parama;
    this.j = paramString2;
    this.a = paramInt;
    File file = new File(this.h);
    if (file.exists())
      file.delete(); 
    file = new File(this.i);
    if (file.exists())
      file.delete(); 
    this.g = Status.c;
  }
  
  private void i(String paramString1, String paramString2) {
    try {
      AgcNsUtils agcNsUtils = new AgcNsUtils();
      this();
      agcNsUtils.setAgcConfig(3, 50, 1).prepare();
      int i = agcNsUtils.nsCreate();
      int j = agcNsUtils.nsInit(i, 8000);
      int k = agcNsUtils.nsSetPolicy(i, 2);
      boolean bool = d0.a;
      String str = "audio_agc_ns";
      if (bool) {
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append("createStatus = ");
        stringBuilder.append(i);
        stringBuilder.append("initStatus = ");
        stringBuilder.append(j);
        stringBuilder.append("setStatus = ");
        stringBuilder.append(k);
        d0.a("audio_agc_ns", stringBuilder.toString());
      } 
      FileInputStream fileInputStream = new FileInputStream();
      this(paramString1);
      FileOutputStream fileOutputStream = new FileOutputStream();
      this(paramString2);
      byte[] arrayOfByte = new byte[160];
      while (fileInputStream.read(arrayOfByte) != -1) {
        short[] arrayOfShort1 = new short[80];
        short[] arrayOfShort2 = new short[80];
        short[] arrayOfShort3 = new short[80];
        ByteBuffer.wrap(arrayOfByte).order(ByteOrder.LITTLE_ENDIAN).asShortBuffer().get(arrayOfShort1);
        k = agcNsUtils.agcProcess(arrayOfShort1, 0, 80, arrayOfShort2, 0, 0, 0, 0);
        if (d0.a) {
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("-====== aa = ");
          stringBuilder.append(k);
          d0.a("audio_agc_ns ", stringBuilder.toString());
        } 
        k = agcNsUtils.nsProcess(i, arrayOfShort2, null, arrayOfShort3, null);
        if (d0.a) {
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("ret = ");
          stringBuilder.append(k);
          d0.a(str, stringBuilder.toString());
        } 
        fileOutputStream.write(m(arrayOfShort3));
      } 
    } finally {
      Exception exception = null;
      try {
        FileInputStream fileInputStream = new FileInputStream();
        this(paramString1);
        FileOutputStream fileOutputStream = new FileOutputStream();
        this(paramString2);
        byte[] arrayOfByte = new byte[160];
        while (fileInputStream.read(arrayOfByte) != -1) {
          short[] arrayOfShort = new short[80];
          ByteBuffer.wrap(arrayOfByte).order(ByteOrder.LITTLE_ENDIAN).asShortBuffer().get(arrayOfShort);
          fileOutputStream.write(m(arrayOfShort));
        } 
        fileInputStream.close();
        fileOutputStream.close();
      } catch (Exception exception1) {
        exception1.printStackTrace();
      } 
    } 
  }
  
  private void j() {
    if (this.m == null)
      return; 
    (new Thread(new b(this))).start();
  }
  
  private void k() {
    try {
      AudioRecord audioRecord2;
      int i = this.e;
      byte[] arrayOfByte = new byte[i];
      AudioRecord audioRecord1 = null;
      try {
        FileOutputStream fileOutputStream = new FileOutputStream();
        this(this.h, true);
      } catch (FileNotFoundException fileNotFoundException) {
        audioRecord2 = audioRecord1;
        if (d0.a) {
          d0.a("wbb", fileNotFoundException.getMessage());
          audioRecord2 = audioRecord1;
        } 
      } 
      this.g = Status.d;
      while (this.g == Status.d) {
        audioRecord1 = this.f;
        if (audioRecord1 != null) {
          int j = audioRecord1.read(arrayOfByte, 0, this.e);
          if (-3 != j && audioRecord2 != null && j > 0 && j <= i)
            try {
              audioRecord2.write(arrayOfByte, 0, j);
            } catch (IOException iOException) {
              if (d0.a)
                Log.e("wbb", iOException.getMessage()); 
            }  
        } 
      } 
      if (audioRecord2 != null)
        try {
          audioRecord2.close();
        } catch (IOException iOException) {
          if (d0.a)
            Log.e("wbb", iOException.getMessage()); 
        }  
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void l() {
    AudioRecord audioRecord = this.f;
    if (audioRecord != null) {
      audioRecord.release();
      this.f = null;
    } 
    this.g = Status.c;
    h();
  }
  
  private void p() {
    AudioRecord audioRecord = this.f;
    if (audioRecord != null)
      try {
        audioRecord.stop();
      } catch (Exception exception) {
        exception.printStackTrace();
      }  
  }
  
  public void h() {
    try {
      File file = new File();
      this(this.h);
      if (file.exists())
        file.delete(); 
      file = new File();
      this(this.i);
      if (file.exists())
        file.delete(); 
      c.d();
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public byte[] m(short[] paramArrayOfshort) {
    byte[] arrayOfByte = new byte[paramArrayOfshort.length * 2];
    for (byte b = 0; b < paramArrayOfshort.length; b++) {
      int i = b * 2;
      arrayOfByte[i] = (byte)(byte)(paramArrayOfshort[b] & 0xFF);
      arrayOfByte[i + 1] = (byte)(byte)((paramArrayOfshort[b] & 0xFF00) >> 8);
    } 
    return arrayOfByte;
  }
  
  public void n() {
    this.e = AudioRecord.getMinBufferSize(this.b, this.c, this.d);
    if (this.f == null)
      this.f = new AudioRecord(this.a, this.b, this.c, this.d, this.e); 
    Status status = this.g;
    if (status != Status.b) {
      if (status != Status.d) {
        if (d0.a) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("===startRecord===");
          stringBuilder.append(this.f.getState());
          d0.a("wbb", stringBuilder.toString());
        } 
        this.f.startRecording();
        (new Thread(new a(this))).start();
        return;
      } 
      throw new IllegalStateException("is recording ");
    } 
    throw new IllegalStateException("not init");
  }
  
  public void o(c paramc) {
    if (this.g == Status.d) {
      this.k = paramc;
      p();
      j();
      this.g = Status.c;
      return;
    } 
    throw new IllegalStateException("not recording");
  }
  
  public enum Status {
    b, c, d, e, f;
    
    static {
      Status status1 = new Status("STATUS_NO_READY", 0);
      b = status1;
      Status status2 = new Status("STATUS_READY", 1);
      c = status2;
      Status status3 = new Status("STATUS_START", 2);
      d = status3;
      Status status4 = new Status("STATUS_PAUSE", 3);
      e = status4;
      Status status5 = new Status("STATUS_STOP", 4);
      f = status5;
      g = new Status[] { status1, status2, status3, status4, status5 };
    }
  }
  
  class a implements Runnable {
    a(AudioRecorder this$0) {}
    
    public void run() {
      AudioRecorder.a(this.b);
    }
  }
  
  class b implements Runnable {
    b(AudioRecorder this$0) {}
    
    public void run() {
      AudioRecorder audioRecorder = this.b;
      AudioRecorder.b(audioRecorder, audioRecorder.h, audioRecorder.i);
      AudioRecorder.e(this.b).b(AudioRecorder.c(this.b), AudioRecorder.c(this.b) * 16 * AudioRecorder.d(this.b).getChannelCount(), AudioRecorder.d(this.b).getChannelCount());
      AudioRecorder.e(this.b).c(this.b.j);
      AudioRecorder.e(this.b).a(this.b.i);
      AudioRecorder.f(this.b);
      if (AudioRecorder.g(this.b) != null)
        AudioRecorder.g(this.b).finish(); 
    }
  }
  
  public static interface c {
    void finish();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/recorder/AudioRecorder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */