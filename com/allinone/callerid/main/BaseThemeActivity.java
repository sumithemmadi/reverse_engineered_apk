package com.allinone.callerid.main;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import androidx.appcompat.app.AppCompatActivity;
import com.allinone.callerid.util.b1;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.j0;
import java.util.Locale;

public class BaseThemeActivity extends AppCompatActivity {
  protected void M(String paramString) {
    Configuration configuration2;
    Resources resources = getResources();
    Configuration configuration1 = resources.getConfiguration();
    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
    paramString.hashCode();
    int i = paramString.hashCode();
    String str1 = "es";
    String str2 = "el";
    String str3 = "bn";
    byte b = -1;
    switch (i) {
      case 115813762:
        if (!paramString.equals("zh-TW"))
          break; 
        b = 25;
        break;
      case 96646193:
        if (!paramString.equals("en_GB"))
          break; 
        b = 24;
        break;
      case 96646068:
        if (!paramString.equals("en_CA"))
          break; 
        b = 23;
        break;
      case 3886:
        if (!paramString.equals("zh"))
          break; 
        b = 22;
        break;
      case 3763:
        if (!paramString.equals("vi"))
          break; 
        b = 21;
        break;
      case 3741:
        if (!paramString.equals("ur"))
          break; 
        b = 20;
        break;
      case 3710:
        if (!paramString.equals("tr"))
          break; 
        b = 19;
        break;
      case 3700:
        if (!paramString.equals("th"))
          break; 
        b = 18;
        break;
      case 3697:
        if (!paramString.equals("te"))
          break; 
        b = 17;
        break;
      case 3651:
        if (!paramString.equals("ru"))
          break; 
        b = 16;
        break;
      case 3588:
        if (!paramString.equals("pt"))
          break; 
        b = 15;
        break;
      case 3494:
        if (!paramString.equals("ms"))
          break; 
        b = 14;
        break;
      case 3428:
        if (!paramString.equals("ko"))
          break; 
        b = 13;
        break;
      case 3424:
        if (!paramString.equals("kk"))
          break; 
        b = 12;
        break;
      case 3374:
        if (!paramString.equals("iw"))
          break; 
        b = 11;
        break;
      case 3371:
        if (!paramString.equals("it"))
          break; 
        b = 10;
        break;
      case 3365:
        if (!paramString.equals("in"))
          break; 
        b = 9;
        break;
      case 3329:
        if (!paramString.equals("hi"))
          break; 
        b = 8;
        break;
      case 3276:
        if (!paramString.equals("fr"))
          break; 
        b = 7;
        break;
      case 3259:
        if (!paramString.equals("fa"))
          break; 
        b = 6;
        break;
      case 3246:
        if (!paramString.equals(str1))
          break; 
        b = 5;
        break;
      case 3241:
        if (!paramString.equals("en"))
          break; 
        b = 4;
        break;
      case 3239:
        if (!paramString.equals(str2))
          break; 
        b = 3;
        break;
      case 3201:
        if (!paramString.equals("de"))
          break; 
        b = 2;
        break;
      case 3148:
        if (!paramString.equals(str3))
          break; 
        b = 1;
        break;
      case 3121:
        if (!paramString.equals("ar"))
          break; 
        b = 0;
        break;
    } 
    switch (b) {
      case 25:
        if (Build.VERSION.SDK_INT >= 17) {
          configuration1.setLocale(Locale.TRADITIONAL_CHINESE);
          break;
        } 
        configuration1.locale = Locale.TRADITIONAL_CHINESE;
        break;
      case 24:
        configuration2 = configuration1;
        if (Build.VERSION.SDK_INT >= 17) {
          configuration2.setLocale(Locale.UK);
          break;
        } 
        configuration2.locale = Locale.UK;
        break;
      case 23:
        configuration2 = configuration1;
        if (Build.VERSION.SDK_INT >= 17) {
          configuration2.setLocale(Locale.CANADA);
          break;
        } 
        configuration2.locale = Locale.CANADA;
        break;
      case 22:
        configuration2 = configuration1;
        if (Build.VERSION.SDK_INT >= 17) {
          configuration2.setLocale(Locale.SIMPLIFIED_CHINESE);
          break;
        } 
        configuration2.locale = Locale.SIMPLIFIED_CHINESE;
        break;
      case 21:
        configuration2 = configuration1;
        if (Build.VERSION.SDK_INT >= 17) {
          configuration2.setLocale(new Locale("vi", "VI"));
          break;
        } 
        configuration2.locale = new Locale("vi", "VI");
        break;
      case 20:
        configuration2 = configuration1;
        if (Build.VERSION.SDK_INT >= 17) {
          configuration2.setLocale(new Locale("ur"));
          break;
        } 
        configuration2.locale = new Locale("ur");
        break;
      case 19:
        configuration2 = configuration1;
        if (Build.VERSION.SDK_INT >= 17) {
          configuration2.setLocale(new Locale("tr", "TR"));
          break;
        } 
        configuration2.locale = new Locale("tr", "TR");
        break;
      case 18:
        configuration2 = configuration1;
        if (Build.VERSION.SDK_INT >= 17) {
          configuration2.setLocale(new Locale("th", "TH"));
          break;
        } 
        configuration2.locale = new Locale("th", "TH");
        break;
      case 17:
        configuration2 = configuration1;
        if (Build.VERSION.SDK_INT >= 17) {
          configuration2.setLocale(new Locale("te"));
          break;
        } 
        configuration2.locale = new Locale("te");
        break;
      case 16:
        configuration2 = configuration1;
        if (Build.VERSION.SDK_INT >= 17) {
          configuration2.setLocale(new Locale("ru", "RU"));
          break;
        } 
        configuration2.locale = new Locale("ru", "RU");
        break;
      case 15:
        configuration2 = configuration1;
        if (Build.VERSION.SDK_INT >= 17) {
          configuration2.setLocale(new Locale("pt", "PT"));
          break;
        } 
        configuration2.locale = new Locale("pt", "PT");
        break;
      case 14:
        configuration2 = configuration1;
        if (Build.VERSION.SDK_INT >= 17) {
          configuration2.setLocale(new Locale("ms", "MY"));
          break;
        } 
        configuration2.locale = new Locale("ms", "MY");
        break;
      case 13:
        configuration2 = configuration1;
        if (Build.VERSION.SDK_INT >= 17) {
          configuration2.setLocale(Locale.KOREA);
          break;
        } 
        configuration2.locale = Locale.KOREA;
        break;
      case 12:
        configuration2 = configuration1;
        if (Build.VERSION.SDK_INT >= 17) {
          configuration2.setLocale(new Locale("kk", "KK"));
          break;
        } 
        configuration2.locale = new Locale("kk", "KK");
        break;
      case 11:
        configuration2 = configuration1;
        if (Build.VERSION.SDK_INT >= 17) {
          configuration2.setLocale(new Locale("iw", "IL"));
          break;
        } 
        configuration2.locale = new Locale("iw", "IL");
        break;
      case 10:
        configuration2 = configuration1;
        if (Build.VERSION.SDK_INT >= 17) {
          configuration2.setLocale(new Locale("it"));
          break;
        } 
        configuration2.locale = new Locale("it");
        break;
      case 9:
        configuration2 = configuration1;
        if (Build.VERSION.SDK_INT >= 17) {
          configuration2.setLocale(new Locale("in", "ID"));
          break;
        } 
        configuration2.locale = new Locale("in", "ID");
        break;
      case 8:
        configuration2 = configuration1;
        if (Build.VERSION.SDK_INT >= 17) {
          configuration2.setLocale(new Locale("hi", "IN"));
          break;
        } 
        configuration2.locale = new Locale("hi", "IN");
        break;
      case 7:
        configuration2 = configuration1;
        if (Build.VERSION.SDK_INT >= 17) {
          configuration2.setLocale(Locale.FRANCE);
          break;
        } 
        configuration2.locale = Locale.FRANCE;
        break;
      case 6:
        if (Build.VERSION.SDK_INT >= 17) {
          configuration1.setLocale(new Locale("fa", "IR"));
          break;
        } 
        configuration1.locale = new Locale("fa", "IR");
        break;
      case 5:
        if (Build.VERSION.SDK_INT >= 17) {
          configuration1.setLocale(new Locale("es", "ES"));
          break;
        } 
        configuration1.locale = new Locale("es", "ES");
        break;
      case 4:
        if (Build.VERSION.SDK_INT >= 17) {
          configuration1.setLocale(Locale.US);
          break;
        } 
        configuration1.locale = Locale.US;
        break;
      case 3:
        if (Build.VERSION.SDK_INT >= 17) {
          configuration1.setLocale(new Locale("el"));
          break;
        } 
        configuration1.locale = new Locale("el");
        break;
      case 2:
        if (Build.VERSION.SDK_INT >= 17) {
          configuration1.setLocale(Locale.GERMANY);
          break;
        } 
        configuration1.locale = Locale.GERMANY;
        break;
      case 1:
        if (Build.VERSION.SDK_INT >= 17) {
          configuration1.setLocale(new Locale("bn", "BD"));
          break;
        } 
        configuration1.locale = new Locale("bn", "BD");
        break;
      case 0:
        if (Build.VERSION.SDK_INT >= 17) {
          configuration1.setLocale(new Locale("ar", "IQ"));
          break;
        } 
        configuration1.locale = new Locale("ar", "IQ");
        break;
    } 
    resources.updateConfiguration(configuration1, displayMetrics);
    if (i1.a)
      (j0.a()).b.execute(new a(this, paramString)); 
  }
  
  protected void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    M((EZCallApplication.c()).f);
  }
  
  protected void onPause() {
    super.onPause();
  }
  
  protected void onResume() {
    super.onResume();
  }
  
  class a implements Runnable {
    a(BaseThemeActivity this$0, String param1String) {}
    
    public void run() {
      b1.f2(this.b);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/main/BaseThemeActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */