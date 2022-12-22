package com.allinone.callerid.util.recorder;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.allinone.callerid.bean.recorder.RecordCall;
import com.allinone.callerid.customview.BaseEditText;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.util.b1;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.q;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class f {
  private static AlertDialog a;
  
  private static AlertDialog b;
  
  private static AlertDialog c;
  
  private static boolean d = false;
  
  private static MediaPlayer e;
  
  private static Handler f;
  
  private static Runnable g;
  
  private static void m() {
    AlertDialog alertDialog = c;
    if (alertDialog != null)
      alertDialog.dismiss(); 
    b.o(true);
    b.n(true);
  }
  
  public static boolean n(String paramString, int paramInt) {
    if (paramInt == 0) {
      paramInt = 1;
    } else {
      paramInt = 0;
    } 
    if (b.h() == 1) {
      if (paramInt != 0) {
        if (b.g())
          return true; 
        if (com.allinone.callerid.f.k.a.c().d(paramString))
          return true; 
      } else {
        if (b.i())
          return true; 
        if (com.allinone.callerid.f.k.a.c().d(paramString))
          return true; 
      } 
      return false;
    } 
    return true;
  }
  
  public static void o(Activity paramActivity, String paramString1, String paramString2) {
    e = new MediaPlayer();
    d = false;
    View view = LayoutInflater.from((Context)paramActivity).inflate(2131493003, null);
    TextView textView1 = (TextView)view.findViewById(2131296358);
    SeekBar seekBar = (SeekBar)view.findViewById(2131296361);
    TextView textView2 = (TextView)view.findViewById(2131296360);
    TextView textView3 = (TextView)view.findViewById(2131296356);
    ImageView imageView1 = (ImageView)view.findViewById(2131296359);
    ImageView imageView2 = (ImageView)view.findViewById(2131296357);
    Typeface typeface = g1.b();
    textView1.setTypeface(typeface);
    textView2.setTypeface(typeface);
    textView3.setTypeface(typeface);
    textView1.setText(paramString1);
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("mm:ss", Locale.getDefault());
    e e = new e(imageView1);
    imageView2.setOnClickListener(e);
    imageView1.setOnClickListener(e);
    if (paramString2 != null) {
      seekBar.setOnSeekBarChangeListener(new f(textView2, simpleDateFormat));
      e.setOnCompletionListener(new g());
      e.setOnErrorListener(new h(paramActivity, paramString2));
      try {
        e.reset();
        e.setDataSource(paramString2);
        e.prepareAsync();
        MediaPlayer mediaPlayer = e;
        i i = new i();
        this(textView3, textView2, seekBar, imageView1);
        mediaPlayer.setOnPreparedListener(i);
      } catch (IOException iOException) {
        iOException.printStackTrace();
      } 
    } 
    try {
      AlertDialog.Builder builder = new AlertDialog.Builder();
      this((Context)paramActivity);
      AlertDialog alertDialog = builder.setView(view).create();
      a = alertDialog;
      j j = new j();
      this();
      alertDialog.setOnDismissListener(j);
      a.show();
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static AlertDialog p(Activity paramActivity, com.allinone.callerid.i.a.c paramc) {
    if (b.f()) {
      b.n(true);
      return null;
    } 
    d.c();
    q.b().c("recorder_show_guide_tip_dialog_count");
    View view = LayoutInflater.from((Context)paramActivity).inflate(2131493017, null);
    TextView textView1 = (TextView)view.findViewById(2131296572);
    FrameLayout frameLayout1 = (FrameLayout)view.findViewById(2131296570);
    TextView textView2 = (TextView)view.findViewById(2131296567);
    TextView textView3 = (TextView)view.findViewById(2131296559);
    TextView textView4 = (TextView)view.findViewById(2131296561);
    TextView textView5 = (TextView)view.findViewById(2131296560);
    CheckBox checkBox1 = (CheckBox)view.findViewById(2131298292);
    ImageView imageView = (ImageView)view.findViewById(2131296569);
    CheckBox checkBox2 = (CheckBox)view.findViewById(2131296468);
    CheckBox checkBox3 = (CheckBox)view.findViewById(2131296469);
    FrameLayout frameLayout2 = (FrameLayout)view.findViewById(2131296571);
    TextView textView6 = (TextView)view.findViewById(2131296568);
    TextView textView7 = (TextView)view.findViewById(2131298147);
    checkBox2.setOnCheckedChangeListener(new m(checkBox3, frameLayout2, frameLayout1));
    checkBox3.setOnCheckedChangeListener(new a(checkBox2, frameLayout2, frameLayout1));
    checkBox1.setOnCheckedChangeListener(new b());
    Typeface typeface = g1.b();
    textView1.setTypeface(typeface);
    textView2.setTypeface(typeface);
    textView3.setTypeface(typeface);
    textView4.setTypeface(typeface);
    textView5.setTypeface(typeface);
    textView7.setTypeface(typeface);
    textView6.setTypeface(typeface);
    textView4.setMovementMethod(LinkMovementMethod.getInstance());
    c c1 = new c(paramActivity);
    frameLayout1.setOnClickListener(c1);
    imageView.setOnClickListener(c1);
    AlertDialog alertDialog = (new AlertDialog.Builder((Context)paramActivity)).setView(view).create();
    c = alertDialog;
    alertDialog.setOnDismissListener(new d(paramc));
    c.show();
    return c;
  }
  
  public static void q(Activity paramActivity, RecordCall paramRecordCall, RecyclerView.Adapter paramAdapter) {
    View view = LayoutInflater.from((Context)paramActivity).inflate(2131493018, null);
    TextView textView1 = (TextView)view.findViewById(2131296577);
    TextView textView2 = (TextView)view.findViewById(2131296575);
    BaseEditText baseEditText = (BaseEditText)view.findViewById(2131296574);
    FrameLayout frameLayout = (FrameLayout)view.findViewById(2131296576);
    TextView textView3 = (TextView)view.findViewById(2131297341);
    ImageView imageView = (ImageView)view.findViewById(2131296573);
    Typeface typeface = g1.b();
    textView1.setTypeface(typeface);
    baseEditText.setTypeface(typeface);
    textView3.setTypeface(typeface);
    textView2.setTypeface(typeface);
    if (paramRecordCall.getRemark() != null) {
      baseEditText.setText(paramRecordCall.getRemark());
      baseEditText.setSelection(paramRecordCall.getRemark().length());
      baseEditText.selectAll();
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(baseEditText.length());
      stringBuilder.append("/200");
      textView2.setText(stringBuilder.toString());
    } 
    baseEditText.addTextChangedListener(new k(textView2, baseEditText, paramActivity));
    l l = new l(baseEditText, paramRecordCall, paramAdapter, paramActivity);
    frameLayout.setOnClickListener(l);
    imageView.setOnClickListener(l);
    AlertDialog alertDialog = (new AlertDialog.Builder((Context)paramActivity)).setView(view).create();
    b = alertDialog;
    alertDialog.show();
  }
  
  public static void r(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (paramView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
      ((ViewGroup.MarginLayoutParams)paramView.getLayoutParams()).setMargins(paramInt1, paramInt2, paramInt3, paramInt4);
      paramView.requestLayout();
    } 
  }
  
  public static void s(String paramString, int paramInt1, int paramInt2) {
    if (b.e() && com.allinone.callerid.i.a.u.a.a() && n(paramString, paramInt1)) {
      RecordCall recordCall = new RecordCall();
      if (Build.VERSION.SDK_INT >= 28) {
        recordCall.setNumber("");
      } else {
        recordCall.setNumber(paramString);
      } 
      if (paramInt2 == 1) {
        recordCall.setPhonestatus(110);
      } else {
        recordCall.setPhonestatus(111);
      } 
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("开始自动录音");
        stringBuilder.append(recordCall.getPhonestatus());
        d0.a("wbb", stringBuilder.toString());
      } 
      com.allinone.callerid.service.b.f().k(recordCall);
      if (b1.p2().booleanValue()) {
        i1.D0((Context)EZCallApplication.c());
        q.b().c("speaker_tip_show");
        b1.G2(Boolean.FALSE);
      } 
    } 
  }
  
  static final class a implements CompoundButton.OnCheckedChangeListener {
    a(CheckBox param1CheckBox, FrameLayout param1FrameLayout1, FrameLayout param1FrameLayout2) {}
    
    public void onCheckedChanged(CompoundButton param1CompoundButton, boolean param1Boolean) {
      if (param1Boolean) {
        if (this.a.isChecked()) {
          this.b.setVisibility(8);
          this.c.setVisibility(0);
        } else {
          this.b.setVisibility(0);
          this.c.setVisibility(8);
        } 
      } else {
        this.b.setVisibility(0);
        this.c.setVisibility(8);
      } 
    }
  }
  
  static final class b implements CompoundButton.OnCheckedChangeListener {
    public void onCheckedChanged(CompoundButton param1CompoundButton, boolean param1Boolean) {
      if (param1Boolean) {
        b.r(true);
        q.b().c("record_tip_enable_auto");
      } else {
        b.r(false);
      } 
    }
  }
  
  static final class c implements View.OnClickListener {
    c(Activity param1Activity) {}
    
    public void onClick(View param1View) {
      switch (param1View.getId()) {
        default:
          return;
        case 2131296570:
          com.allinone.callerid.util.k1.a.l(this.b, new a(this));
        case 2131296569:
          break;
      } 
      if (f.l() != null)
        f.l().dismiss(); 
    }
    
    class a implements com.allinone.callerid.util.k1.a.g {
      a(f.c this$0) {}
      
      public void a() {
        if (d0.a)
          d0.a("wbb", "开启了权限"); 
        f.k();
      }
    }
  }
  
  class a implements com.allinone.callerid.util.k1.a.g {
    a(f this$0) {}
    
    public void a() {
      if (d0.a)
        d0.a("wbb", "开启了权限"); 
      f.k();
    }
  }
  
  static final class d implements DialogInterface.OnDismissListener {
    d(com.allinone.callerid.i.a.c param1c) {}
    
    public void onDismiss(DialogInterface param1DialogInterface) {
      com.allinone.callerid.i.a.c c1 = this.b;
      if (c1 != null)
        c1.a(); 
    }
  }
  
  static final class e implements View.OnClickListener {
    e(ImageView param1ImageView) {}
    
    public void onClick(View param1View) {
      int i = param1View.getId();
      if (i != 2131296357) {
        if (i == 2131296359)
          try {
            if (f.b()) {
              if (f.d() != null)
                f.d().pause(); 
              this.b.setImageResource(2131230812);
              f.c(false);
            } else {
              if (f.d() != null)
                f.d().start(); 
              this.b.setImageResource(2131230813);
              f.c(true);
            } 
          } catch (Exception exception) {
            exception.printStackTrace();
          }  
      } else if (f.a() != null) {
        f.a().dismiss();
      } 
    }
  }
  
  static final class f implements SeekBar.OnSeekBarChangeListener {
    f(TextView param1TextView, SimpleDateFormat param1SimpleDateFormat) {}
    
    public void onProgressChanged(SeekBar param1SeekBar, int param1Int, boolean param1Boolean) {
      if (param1Boolean)
        this.b.setText(this.c.format(Integer.valueOf(param1Int))); 
    }
    
    public void onStartTrackingTouch(SeekBar param1SeekBar) {}
    
    public void onStopTrackingTouch(SeekBar param1SeekBar) {
      try {
        if (f.d() != null)
          f.d().seekTo(param1SeekBar.getProgress()); 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  static final class g implements MediaPlayer.OnCompletionListener {
    public void onCompletion(MediaPlayer param1MediaPlayer) {
      try {
        if (f.a() != null)
          f.a().dismiss(); 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  static final class h implements MediaPlayer.OnErrorListener {
    h(Activity param1Activity, String param1String) {}
    
    public boolean onError(MediaPlayer param1MediaPlayer, int param1Int1, int param1Int2) {
      try {
        Intent intent = new Intent();
        this("android.intent.action.VIEW");
        Activity activity = this.b;
        File file = new File();
        this(this.c);
        Uri uri = FileProvider.e((Context)activity, "com.allinone.callerid", file);
        intent.addFlags(1);
        intent.setDataAndType(uri, "audio/mp3");
        this.b.startActivity(intent);
        if (f.a() != null)
          f.a().dismiss(); 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
      return false;
    }
  }
  
  static final class i implements MediaPlayer.OnPreparedListener {
    i(TextView param1TextView1, TextView param1TextView2, SeekBar param1SeekBar, ImageView param1ImageView) {}
    
    public void onPrepared(MediaPlayer param1MediaPlayer) {
      int j = param1MediaPlayer.getDuration();
      String str = (new SimpleDateFormat("mm:ss", Locale.getDefault())).format(new Date((j + 0)));
      this.b.setText(str);
      this.c.setText("00:00");
      this.d.setMax(f.d().getDuration());
      f.d().start();
      f.c(true);
      this.e.setImageResource(2131230813);
      f.g(new Handler());
      f.i(new a(this));
      f.f().post(f.h());
    }
    
    class a implements Runnable {
      a(f.i this$0) {}
      
      public void run() {
        try {
          SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
          this("mm:ss", Locale.getDefault());
          if (f.d().isPlaying()) {
            this.b.d.setProgress(f.d().getCurrentPosition());
            this.b.c.setText(simpleDateFormat.format(Integer.valueOf(f.d().getCurrentPosition())));
          } 
          f.f().postDelayed(this, 1000L);
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      }
    }
  }
  
  class a implements Runnable {
    a(f this$0) {}
    
    public void run() {
      try {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        this("mm:ss", Locale.getDefault());
        if (f.d().isPlaying()) {
          this.b.d.setProgress(f.d().getCurrentPosition());
          this.b.c.setText(simpleDateFormat.format(Integer.valueOf(f.d().getCurrentPosition())));
        } 
        f.f().postDelayed(this, 1000L);
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  static final class j implements DialogInterface.OnDismissListener {
    public void onDismiss(DialogInterface param1DialogInterface) {
      if (f.d() != null) {
        f.d().release();
        f.e(null);
      } 
      if (f.f() != null && f.h() != null) {
        f.f().removeCallbacks(f.h());
        f.g(null);
        f.i(null);
      } 
    }
  }
  
  static final class k implements TextWatcher {
    k(TextView param1TextView, BaseEditText param1BaseEditText, Activity param1Activity) {}
    
    public void afterTextChanged(Editable param1Editable) {}
    
    public void beforeTextChanged(CharSequence param1CharSequence, int param1Int1, int param1Int2, int param1Int3) {}
    
    public void onTextChanged(CharSequence param1CharSequence, int param1Int1, int param1Int2, int param1Int3) {
      TextView textView = this.b;
      param1CharSequence = new StringBuilder();
      param1CharSequence.append(this.c.length());
      param1CharSequence.append("/200");
      textView.setText(param1CharSequence.toString());
      if (this.c.length() > 200) {
        this.b.setTextColor(this.d.getResources().getColor(2131099915));
      } else {
        this.b.setTextColor(this.d.getResources().getColor(2131099900));
      } 
    }
  }
  
  static final class l implements View.OnClickListener {
    l(BaseEditText param1BaseEditText, RecordCall param1RecordCall, RecyclerView.Adapter param1Adapter, Activity param1Activity) {}
    
    public void onClick(View param1View) {
      int i = param1View.getId();
      if (i != 2131296573) {
        if (i == 2131296576) {
          String str = this.b.getText().toString();
          if (!"".equals(str) && this.b.length() <= 200) {
            this.c.setRemark(str);
            this.d.i();
            (new Thread(new a(this, str))).start();
            q.b().c("recorder_remark_add_count");
            if (f.j() != null)
              f.j().dismiss(); 
          } else {
            Toast.makeText((Context)this.e, 2131755038, 1).show();
          } 
        } 
      } else if (f.j() != null) {
        f.j().dismiss();
      } 
    }
    
    class a implements Runnable {
      a(f.l this$0, String param2String) {}
      
      public void run() {
        com.allinone.callerid.f.k.b.d().k(this.c.c.getFilepath(), this.b);
      }
    }
  }
  
  class a implements Runnable {
    a(f this$0, String param1String) {}
    
    public void run() {
      com.allinone.callerid.f.k.b.d().k(this.c.c.getFilepath(), this.b);
    }
  }
  
  static final class m implements CompoundButton.OnCheckedChangeListener {
    m(CheckBox param1CheckBox, FrameLayout param1FrameLayout1, FrameLayout param1FrameLayout2) {}
    
    public void onCheckedChanged(CompoundButton param1CompoundButton, boolean param1Boolean) {
      if (param1Boolean) {
        if (this.a.isChecked()) {
          this.b.setVisibility(8);
          this.c.setVisibility(0);
        } else {
          this.b.setVisibility(0);
          this.c.setVisibility(8);
        } 
      } else {
        this.b.setVisibility(0);
        this.c.setVisibility(8);
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/recorder/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */