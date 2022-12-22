package com.allinone.callerid.service;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.MediaRecorder;
import android.os.Build;
import android.text.format.Formatter;
import androidx.core.app.i;
import com.allinone.callerid.bean.recorder.RecordCall;
import com.allinone.callerid.f.f;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.model.EZSearchContacts;
import com.allinone.callerid.mvc.controller.recorder.RecorderActivity;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.q;
import com.allinone.callerid.util.recorder.AudioRecorder;
import com.allinone.callerid.util.recorder.c;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class b implements MediaRecorder.OnInfoListener, MediaRecorder.OnErrorListener {
  private static final b a = new b();
  
  private RecordCall b;
  
  boolean c = false;
  
  MediaRecorder d;
  
  AudioRecorder e;
  
  private void e(boolean paramBoolean) {
    if (!i1.q0())
      try {
        PendingIntent pendingIntent;
        NotificationManager notificationManager = (NotificationManager)EZCallApplication.c().getSystemService("notification");
        i.e e = new i.e();
        this((Context)EZCallApplication.c(), "Showcaller");
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
          NotificationChannel notificationChannel = new NotificationChannel();
          this("com.allinone.callerid_notfication_N", "Showcaller", 3);
          if (notificationManager != null) {
            notificationManager.createNotificationChannel(notificationChannel);
            e.g("com.allinone.callerid_notfication_N");
          } 
        } 
        if (i >= 21) {
          try {
            EZCallApplication.c().getDrawable(2131231332);
            try {
              e.v(2131231332);
              e.h(EZCallApplication.c().getResources().getColor(2131099706));
            } catch (Exception exception) {}
          } catch (Exception exception) {
            exception.printStackTrace();
            return;
          } 
        } else {
          e.v(2131231118);
          Intent intent1 = new Intent();
          this((Context)EZCallApplication.c(), RecorderActivity.class);
          intent1.setAction(Long.toString(System.currentTimeMillis()));
          intent1.putExtra("record_success", true);
          intent1.addFlags(268468224);
          pendingIntent = PendingIntent.getActivity((Context)EZCallApplication.c(), 65261, intent1, 134217728);
          Intent intent2 = new Intent();
          this((Context)EZCallApplication.c(), RecorderActivity.class);
          intent2.putExtra("record_success_upload", true);
          intent2.addFlags(268468224);
          PendingIntent.getActivity((Context)EZCallApplication.c(), 65261, intent2, 134217728);
          i.e e1 = e.k(EZCallApplication.c().getString(2131755029));
          i.c c = new i.c();
          this();
          e1.x((i.f)c).a(2131231105, EZCallApplication.c().getString(2131755472), pendingIntent);
        } 
        pendingIntent.printStackTrace();
      } catch (Exception exception) {
        exception.printStackTrace();
      }  
  }
  
  public static b f() {
    return a;
  }
  
  private void g() {
    (new Thread(new b(this))).start();
  }
  
  private void h() {
    AudioRecorder audioRecorder = new AudioRecorder(new com.allinone.callerid.util.recorder.a(), this.b.getFilename(), this.b.getFilepath(), com.allinone.callerid.util.recorder.b.a());
    this.e = audioRecorder;
    audioRecorder.n();
  }
  
  private void i() {
    MediaRecorder mediaRecorder = new MediaRecorder();
    this.d = mediaRecorder;
    mediaRecorder.setAudioSource(com.allinone.callerid.util.recorder.b.a());
    this.d.setAudioSamplingRate(44100);
    this.d.setAudioEncodingBitRate(96000);
    this.d.setOutputFormat(1);
    this.d.setAudioEncoder(1);
    this.d.setOutputFile(this.b.getFilepath());
    this.d.prepare();
    this.d.setOnInfoListener(this);
    this.d.setOnErrorListener(this);
    this.d.start();
  }
  
  private void j() {
    if (!this.c) {
      File file;
      this.c = true;
      try {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        this("_yyyyMMdd_HHmmss_", Locale.getDefault());
        file = c.a();
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append(this.b.getShowName());
        stringBuilder.append(simpleDateFormat.format(calendar.getTime()));
        String str = stringBuilder.toString();
        file = File.createTempFile(str, ".amr", file);
        try {
          this.b.setFilepath(file.getAbsolutePath());
          this.b.setFilename(str);
          if (Build.VERSION.SDK_INT < 16) {
            i();
          } else {
            h();
          } 
          this.b.setStarttime(System.currentTimeMillis());
        } catch (Exception null) {}
      } catch (Exception exception) {
        file = null;
      } 
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Exception:");
        stringBuilder.append(exception.getMessage());
        d0.a("wbb", stringBuilder.toString());
      } 
      exception.printStackTrace();
      this.c = false;
      if (file != null)
        file.delete(); 
      this.b = null;
      this.c = false;
    } 
  }
  
  private void l() {
    if (this.c)
      try {
        this.b.setEndtime(System.currentTimeMillis());
        if (Build.VERSION.SDK_INT < 16) {
          this.d.stop();
          this.d.reset();
          this.d.release();
          this.d = null;
          g();
        } else {
          AudioRecorder audioRecorder = this.e;
          a a = new a();
          this(this);
          audioRecorder.o(a);
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      }  
  }
  
  public void k(RecordCall paramRecordCall) {
    this.b = paramRecordCall;
    j();
  }
  
  public void m(boolean paramBoolean) {
    l();
  }
  
  public void onError(MediaRecorder paramMediaRecorder, int paramInt1, int paramInt2) {}
  
  public void onInfo(MediaRecorder paramMediaRecorder, int paramInt1, int paramInt2) {}
  
  class a implements AudioRecorder.c {
    a(b this$0) {}
    
    public void finish() {
      b.a(this.a);
    }
  }
  
  class b implements Runnable {
    b(b this$0) {}
    
    public void run() {
      String str = i1.w((Context)EZCallApplication.c(), b.b(this.b).getNumber());
      if (str != null) {
        b.b(this.b).setName(str);
        b.b(this.b).setNumbertype(101);
        q.b().c("recorder_noupload_count");
      } else {
        b.b(this.b).setNumbertype(100);
        q.b().c("recorder_okupload_count");
      } 
      if (b.b(this.b).getFilepath() != null) {
        File file = new File(b.b(this.b).getFilepath());
        b.b(this.b).setFilesize(file.length());
        b.b(this.b).setFilesizestring(Formatter.formatFileSize((Context)EZCallApplication.c(), file.length()));
      } 
      try {
        EZSearchContacts eZSearchContacts = f.b().d(b.b(this.b).getNumber());
        if (eZSearchContacts != null) {
          String str2 = eZSearchContacts.getName();
          if (str2 != null && !"".equals(str2) && (b.b(this.b).getName() == null || "".equals(b.b(this.b).getName())))
            b.b(this.b).setName(str2); 
          int i = eZSearchContacts.getFaild_error_log();
          String str1 = eZSearchContacts.getType_label();
          if (str1 != null && !str1.equals("")) {
            b.b(this.b).setHarassstatus(121);
            b.b(this.b).setPhoneType(str1);
            q.b().c("recorder_okupload_spam_count");
          } else if (i == 0) {
            b.b(this.b).setHarassstatus(122);
            q.b().c("recorder_okupload_unidentified_count");
          } 
        } else {
          b.b(this.b).setHarassstatus(122);
          q.b().c("recorder_okupload_unidentified_count");
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
      long l1 = b.b(this.b).getEndtime();
      long l2 = b.b(this.b).getStarttime();
      b.b(this.b).setTimespan(l1 - l2);
      if (b.b(this.b).getFilepath() != null && b.b(this.b).getFilesize() > 1024L) {
        int i = i1.u(b.b(this.b).getFilepath());
        if (d0.a) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("duration: ");
          stringBuilder.append(i);
          d0.a("wbb", stringBuilder.toString());
        } 
        if (i > 0)
          b.b(this.b).setTimespan(i); 
        com.allinone.callerid.f.k.b.d().a(b.b(this.b));
        if (str != null) {
          b.d(this.b, true);
        } else {
          b.d(this.b, false);
        } 
      } else {
        try {
          File file = new File();
          this(b.b(this.b).getFilepath());
          file.delete();
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      } 
      b.c(this.b, null);
      this.b.c = false;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/service/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */