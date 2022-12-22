package com.allinone.callerid.customview;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.media.AudioManager;
import android.media.ToneGenerator;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.telephony.TelephonyManager;
import android.text.TextWatcher;
import android.text.method.DialerKeyListener;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.p;
import java.lang.reflect.Method;

public class EZKeyboardView extends RelativeLayout implements View.OnClickListener, View.OnLongClickListener {
  private static boolean b;
  
  private Context c;
  
  public BaseEditText d;
  
  private ImageView e;
  
  private ToneGenerator f;
  
  private Object g = new Object();
  
  private ImageView h;
  
  private ConstraintLayout i;
  
  private Typeface j;
  
  b k = null;
  
  public EZKeyboardView(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    this.c = paramContext;
    LayoutInflater.from(paramContext).inflate(2131493218, (ViewGroup)this);
    d();
    b();
    i();
    synchronized (this.g) {
      ToneGenerator toneGenerator = this.f;
      if (toneGenerator == null)
        try {
          toneGenerator = new ToneGenerator();
          this(3, 80);
          this.f = toneGenerator;
          ((Activity)this.c).setVolumeControlStream(3);
        } catch (RuntimeException runtimeException) {
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("Exception caught while creating local tone generator: ");
          stringBuilder.append(runtimeException);
          Log.w("EZlDial", stringBuilder.toString());
          this.f = null;
        }  
      return;
    } 
  }
  
  private void b() {
    try {
      Method method = EditText.class.getMethod("setShowSoftInputOnFocus", new Class[] { boolean.class });
      method.setAccessible(true);
      method.invoke(this.d, new Object[] { Boolean.FALSE });
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private boolean c() {
    boolean bool2;
    boolean bool1 = false;
    try {
      TelephonyManager telephonyManager = (TelephonyManager)this.c.getSystemService("phone");
      bool2 = bool1;
      if (telephonyManager != null) {
        String str = telephonyManager.getVoiceMailNumber();
        bool2 = bool1;
        if (str != null) {
          boolean bool = str.equals("");
          bool2 = bool1;
          if (!bool)
            bool2 = true; 
        } 
      } 
    } catch (SecurityException securityException) {
      securityException.printStackTrace();
      bool2 = bool1;
    } catch (NullPointerException nullPointerException) {
      nullPointerException.printStackTrace();
      bool2 = bool1;
    } catch (Exception exception) {
      exception.printStackTrace();
      bool2 = bool1;
    } 
    return bool2;
  }
  
  private void f(int paramInt) {
    try {
      KeyEvent keyEvent = new KeyEvent();
      this(0, paramInt);
      this.d.onKeyDown(paramInt, keyEvent);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void h() {
    try {
      this.d.getText().clear();
      this.k.a("del_all", this.d.getText().toString());
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void i() {
    b = PreferenceManager.getDefaultSharedPreferences(this.c).getBoolean("dial_enable_dial_tone", false);
  }
  
  private void j() {
    boolean bool;
    if (this.d.length() != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool) {
      this.e.setEnabled(true);
      this.e.setVisibility(0);
      this.h.setVisibility(0);
      this.i.setVisibility(0);
    } else {
      this.e.setEnabled(false);
      this.e.setVisibility(4);
      this.h.setVisibility(4);
      this.i.setVisibility(8);
    } 
  }
  
  private void setupButton(int paramInt) {
    FrameLayout frameLayout = (FrameLayout)findViewById(paramInt);
    frameLayout.setOnClickListener(this);
    if (paramInt == 2131297322 || paramInt == 2131297323)
      frameLayout.setOnLongClickListener(this); 
  }
  
  public void d() {
    BaseEditText baseEditText = (BaseEditText)findViewById(2131296583);
    this.d = baseEditText;
    baseEditText.setOnClickListener(this);
    this.d.setKeyListener((KeyListener)DialerKeyListener.getInstance());
    String str = p.d((Context)EZCallApplication.c()).getIso_code().split("/")[0];
    a a = new a(this, str);
    if (str != null && !"".equals(str)) {
      this.d.addTextChangedListener((TextWatcher)a);
    } else {
      this.d.addTextChangedListener((TextWatcher)a);
    } 
    this.d.setInputType(3);
    this.j = g1.b();
    ((TextView)findViewById(2131297939)).setTypeface(this.j);
    ((TextView)findViewById(2131297940)).setTypeface(this.j);
    ((TextView)findViewById(2131297941)).setTypeface(this.j);
    ((TextView)findViewById(2131297942)).setTypeface(this.j);
    ((TextView)findViewById(2131297943)).setTypeface(this.j);
    ((TextView)findViewById(2131297944)).setTypeface(this.j);
    ((TextView)findViewById(2131297945)).setTypeface(this.j);
    ((TextView)findViewById(2131297946)).setTypeface(this.j);
    ((TextView)findViewById(2131297947)).setTypeface(this.j);
    ((TextView)findViewById(2131297948)).setTypeface(this.j);
    ((TextView)findViewById(2131297951)).setTypeface(this.j);
    ((TextView)findViewById(2131297952)).setTypeface(this.j);
    ((TextView)findViewById(2131297953)).setTypeface(this.j);
    ((TextView)findViewById(2131297954)).setTypeface(this.j);
    ((TextView)findViewById(2131297955)).setTypeface(this.j);
    ((TextView)findViewById(2131297956)).setTypeface(this.j);
    ((TextView)findViewById(2131297957)).setTypeface(this.j);
    ((TextView)findViewById(2131297958)).setTypeface(this.j);
    ((TextView)findViewById(2131297950)).setTypeface(this.j);
    ((TextView)findViewById(2131297959)).setTypeface(this.j);
    ((TextView)findViewById(2131297949)).setTypeface(this.j);
    this.d.setTypeface(this.j);
    this.i = (ConstraintLayout)findViewById(2131297541);
    this.e = (ImageView)findViewById(2131296551);
    ImageView imageView = (ImageView)findViewById(2131296429);
    this.h = imageView;
    imageView.setOnClickListener(this);
    this.e.setOnClickListener(this);
    this.e.setOnLongClickListener(this);
    if (i1.f0(this.c).booleanValue())
      this.e.setRotation(180.0F); 
    setupButton(2131297323);
    setupButton(2131297324);
    setupButton(2131297325);
    setupButton(2131297326);
    setupButton(2131297327);
    setupButton(2131297328);
    setupButton(2131297329);
    setupButton(2131297330);
    setupButton(2131297331);
    setupButton(2131297335);
    setupButton(2131297322);
    setupButton(2131297334);
  }
  
  public void e() {
    BaseEditText baseEditText = this.d;
    if (baseEditText != null)
      baseEditText.setText(""); 
  }
  
  void g(int paramInt) {
    if (!b)
      return; 
    int i = ((AudioManager)this.c.getSystemService("audio")).getRingerMode();
    if (i == 0 || i == 1)
      return; 
    synchronized (this.g) {
      StringBuilder stringBuilder;
      ToneGenerator toneGenerator = this.f;
      if (toneGenerator == null) {
        stringBuilder = new StringBuilder();
        this();
        stringBuilder.append("playTone: mToneGenerator == null, tone: ");
        stringBuilder.append(paramInt);
        Log.w("EZlDial", stringBuilder.toString());
        return;
      } 
      stringBuilder.startTone(paramInt, 150);
      return;
    } 
  }
  
  public void onClick(View paramView) {
    int i = paramView.getId();
    if (i != 2131296429) {
      if (i != 2131296551) {
        switch (i) {
          default:
            switch (i) {
              default:
                break;
              case 2131297335:
                g(1);
                f(17);
                this.k.a("10", this.d.getText().toString());
                break;
              case 2131297334:
                break;
            } 
            g(1);
            f(18);
            this.k.a("#", this.d.getText().toString());
            break;
          case 2131297331:
            g(1);
            f(16);
            this.k.a("9", this.d.getText().toString());
            break;
          case 2131297330:
            g(1);
            f(15);
            this.k.a("8", this.d.getText().toString());
            break;
          case 2131297329:
            g(1);
            f(14);
            this.k.a("7", this.d.getText().toString());
            break;
          case 2131297328:
            g(1);
            f(13);
            this.k.a("6", this.d.getText().toString());
            break;
          case 2131297327:
            g(1);
            f(12);
            this.k.a("5", this.d.getText().toString());
            break;
          case 2131297326:
            g(1);
            f(11);
            this.k.a("4", this.d.getText().toString());
            break;
          case 2131297325:
            g(1);
            f(10);
            this.k.a("3", this.d.getText().toString());
            break;
          case 2131297324:
            g(1);
            f(9);
            this.k.a("2", this.d.getText().toString());
            break;
          case 2131297323:
            g(1);
            f(8);
            this.k.a("1", this.d.getText().toString());
            break;
          case 2131297322:
            g(1);
            f(7);
            this.k.a("0", this.d.getText().toString());
            break;
        } 
      } else {
        f(67);
        this.k.a("del", this.d.getText().toString());
      } 
    } else if (this.d.getText() != null && !"".equals(this.d.getText().toString())) {
      try {
        Intent intent = new Intent();
        this("android.intent.action.INSERT");
        intent.setType("vnd.android.cursor.dir/person");
        intent.setType("vnd.android.cursor.dir/contact");
        intent.setType("vnd.android.cursor.dir/raw_contact");
        intent.putExtra("phone_type", 2);
        intent.putExtra("phone", this.d.getText().toString());
        this.c.startActivity(intent);
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    } else {
      Toast.makeText((Context)EZCallApplication.c(), getResources().getString(2131755420), 0).show();
    } 
    j();
  }
  
  public boolean onLongClick(View paramView) {
    boolean bool4;
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = bool1;
    try {
      int i = paramView.getId();
      switch (i) {
        default:
          bool4 = bool2;
          break;
        case 2131297323:
          bool4 = bool2;
          try {
            if (this.d.length() == 0) {
              bool4 = c();
              if (bool4) {
                if (com.allinone.callerid.util.k1.a.b(this.c, "android.permission.CALL_PHONE")) {
                  Intent intent = new Intent();
                  this("android.intent.action.CALL");
                  intent.setData(Uri.parse("voicemail:"));
                  this.c.startActivity(intent);
                } 
              } else if (com.allinone.callerid.util.k1.a.b(this.c, "android.permission.CALL_PHONE")) {
                Intent intent = new Intent();
                this("android.intent.action.CALL");
                intent.setData(Uri.parse("voicemail:"));
                this.c.startActivity(intent);
              } 
            } else {
              break;
            } 
          } catch (Exception exception) {
            bool3 = bool1;
            exception.printStackTrace();
            bool4 = bool2;
            break;
          } 
          bool4 = true;
          break;
        case 2131297322:
          bool3 = bool1;
          f(81);
          bool4 = true;
          break;
        case 2131296551:
          bool3 = bool1;
          h();
          bool3 = bool1;
          this.e.setPressed(false);
          bool4 = true;
          break;
      } 
      bool3 = bool4;
      j();
    } catch (Exception exception) {
      exception.printStackTrace();
      bool4 = bool3;
    } 
    return bool4;
  }
  
  public void setNumberCallBack(b paramb) {
    this.k = paramb;
  }
  
  class a extends PhoneNumberFormattingTextWatcher {
    a(EZKeyboardView this$0, String param1String) {
      super(param1String);
    }
    
    public void onTextChanged(CharSequence param1CharSequence, int param1Int1, int param1Int2, int param1Int3) {
      super.onTextChanged(param1CharSequence, param1Int1, param1Int2, param1Int3);
      EZKeyboardView.a(this.b);
    }
  }
  
  public static interface b {
    void a(String param1String1, String param1String2);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/customview/EZKeyboardView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */