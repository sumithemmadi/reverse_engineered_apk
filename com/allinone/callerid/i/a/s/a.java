package com.allinone.callerid.i.a.s;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.allinone.callerid.util.g1;

public class a {
  private static AlertDialog a;
  
  public static void b(FragmentActivity paramFragmentActivity) {
    View view = LayoutInflater.from((Context)paramFragmentActivity).inflate(2131493198, null);
    ImageView imageView = (ImageView)view.findViewById(2131297108);
    Typeface typeface = g1.b();
    ((TextView)view.findViewById(2131297781)).setTypeface(typeface);
    ((TextView)view.findViewById(2131297783)).setTypeface(typeface);
    ((TextView)view.findViewById(2131297785)).setTypeface(typeface);
    ((TextView)view.findViewById(2131297784)).setTypeface(typeface);
    ((TextView)view.findViewById(2131297782)).setTypeface(typeface);
    imageView.setOnClickListener(new a());
    AlertDialog alertDialog = (new AlertDialog.Builder((Context)paramFragmentActivity)).setView(view).create();
    a = alertDialog;
    alertDialog.show();
  }
  
  static final class a implements View.OnClickListener {
    public void onClick(View param1View) {
      if (a.a() != null)
        a.a().dismiss(); 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/i/a/s/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */