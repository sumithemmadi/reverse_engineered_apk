package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.h;
import androidx.lifecycle.n;
import androidx.lifecycle.v;
import androidx.lifecycle.w;

public class c extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
  private Handler c0;
  
  private Runnable d0 = new a(this);
  
  private DialogInterface.OnCancelListener e0 = new b(this);
  
  private DialogInterface.OnDismissListener f0 = new c(this);
  
  private int g0 = 0;
  
  private int h0 = 0;
  
  private boolean i0 = true;
  
  private boolean j0 = true;
  
  private int k0 = -1;
  
  private boolean l0;
  
  private n<h> m0 = new d(this);
  
  private Dialog n0;
  
  private boolean o0;
  
  private boolean p0;
  
  private boolean q0;
  
  private boolean r0 = false;
  
  private void U1(boolean paramBoolean1, boolean paramBoolean2) {
    if (this.p0)
      return; 
    this.p0 = true;
    this.q0 = false;
    Dialog dialog = this.n0;
    if (dialog != null) {
      dialog.setOnDismissListener(null);
      this.n0.dismiss();
      if (!paramBoolean2)
        if (Looper.myLooper() == this.c0.getLooper()) {
          onDismiss((DialogInterface)this.n0);
        } else {
          this.c0.post(this.d0);
        }  
    } 
    this.o0 = true;
    if (this.k0 >= 0) {
      I().V0(this.k0, 1);
      this.k0 = -1;
    } else {
      s s = I().l();
      s.o(this);
      if (paramBoolean1) {
        s.i();
      } else {
        s.h();
      } 
    } 
  }
  
  private void a2(Bundle paramBundle) {
    if (!this.j0)
      return; 
    if (!this.r0)
      try {
        this.l0 = true;
        Dialog dialog = X1(paramBundle);
        this.n0 = dialog;
        if (this.j0) {
          d2(dialog, this.g0);
          Context context = t();
          if (context instanceof Activity)
            this.n0.setOwnerActivity((Activity)context); 
          this.n0.setCancelable(this.i0);
          this.n0.setOnCancelListener(this.e0);
          this.n0.setOnDismissListener(this.f0);
          this.r0 = true;
        } else {
          this.n0 = null;
        } 
      } finally {
        this.l0 = false;
      }  
  }
  
  public void A0() {
    super.A0();
    if (!this.q0 && !this.p0)
      this.p0 = true; 
    X().m(this.m0);
  }
  
  public LayoutInflater B0(Bundle paramBundle) {
    String str;
    LayoutInflater layoutInflater2 = super.B0(paramBundle);
    if (!this.j0 || this.l0) {
      if (FragmentManager.G0(2)) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("getting layout inflater for DialogFragment ");
        stringBuilder.append(this);
        str = stringBuilder.toString();
        if (!this.j0) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("mShowsDialog = false: ");
          stringBuilder1.append(str);
          Log.d("FragmentManager", stringBuilder1.toString());
        } else {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("mCreatingDialog = true: ");
          stringBuilder1.append(str);
          Log.d("FragmentManager", stringBuilder1.toString());
        } 
      } 
      return layoutInflater2;
    } 
    a2((Bundle)str);
    if (FragmentManager.G0(2)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("get layout inflater for DialogFragment ");
      stringBuilder.append(this);
      stringBuilder.append(" from dialog context");
      Log.d("FragmentManager", stringBuilder.toString());
    } 
    Dialog dialog = this.n0;
    LayoutInflater layoutInflater1 = layoutInflater2;
    if (dialog != null)
      layoutInflater1 = layoutInflater2.cloneInContext(dialog.getContext()); 
    return layoutInflater1;
  }
  
  public void O0(Bundle paramBundle) {
    super.O0(paramBundle);
    Dialog dialog = this.n0;
    if (dialog != null) {
      Bundle bundle = dialog.onSaveInstanceState();
      bundle.putBoolean("android:dialogShowing", false);
      paramBundle.putBundle("android:savedDialogState", bundle);
    } 
    int i = this.g0;
    if (i != 0)
      paramBundle.putInt("android:style", i); 
    i = this.h0;
    if (i != 0)
      paramBundle.putInt("android:theme", i); 
    boolean bool = this.i0;
    if (!bool)
      paramBundle.putBoolean("android:cancelable", bool); 
    bool = this.j0;
    if (!bool)
      paramBundle.putBoolean("android:showsDialog", bool); 
    i = this.k0;
    if (i != -1)
      paramBundle.putInt("android:backStackId", i); 
  }
  
  public void P0() {
    super.P0();
    Dialog dialog = this.n0;
    if (dialog != null) {
      this.o0 = false;
      dialog.show();
      View view = this.n0.getWindow().getDecorView();
      v.a(view, this);
      w.a(view, this);
      androidx.savedstate.d.a(view, this);
    } 
  }
  
  public void Q0() {
    super.Q0();
    Dialog dialog = this.n0;
    if (dialog != null)
      dialog.hide(); 
  }
  
  public void S0(Bundle paramBundle) {
    super.S0(paramBundle);
    if (this.n0 != null && paramBundle != null) {
      paramBundle = paramBundle.getBundle("android:savedDialogState");
      if (paramBundle != null)
        this.n0.onRestoreInstanceState(paramBundle); 
    } 
  }
  
  public void T1() {
    U1(false, false);
  }
  
  public Dialog V1() {
    return this.n0;
  }
  
  public int W1() {
    return this.h0;
  }
  
  public Dialog X1(Bundle paramBundle) {
    if (FragmentManager.G0(3)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("onCreateDialog called for DialogFragment ");
      stringBuilder.append(this);
      Log.d("FragmentManager", stringBuilder.toString());
    } 
    return new Dialog(t1(), W1());
  }
  
  View Y1(int paramInt) {
    Dialog dialog = this.n0;
    return (dialog != null) ? dialog.findViewById(paramInt) : null;
  }
  
  boolean Z1() {
    return this.r0;
  }
  
  void a1(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
    super.a1(paramLayoutInflater, paramViewGroup, paramBundle);
    if (this.J == null && this.n0 != null && paramBundle != null) {
      Bundle bundle = paramBundle.getBundle("android:savedDialogState");
      if (bundle != null)
        this.n0.onRestoreInstanceState(bundle); 
    } 
  }
  
  public final Dialog b2() {
    Dialog dialog = V1();
    if (dialog != null)
      return dialog; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("DialogFragment ");
    stringBuilder.append(this);
    stringBuilder.append(" does not have a Dialog.");
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  public void c2(boolean paramBoolean) {
    this.j0 = paramBoolean;
  }
  
  public void d2(Dialog paramDialog, int paramInt) {
    if (paramInt != 1 && paramInt != 2) {
      if (paramInt != 3)
        return; 
      Window window = paramDialog.getWindow();
      if (window != null)
        window.addFlags(24); 
    } 
    paramDialog.requestWindowFeature(1);
  }
  
  public void e2(FragmentManager paramFragmentManager, String paramString) {
    this.p0 = false;
    this.q0 = true;
    s s = paramFragmentManager.l();
    s.e(this, paramString);
    s.h();
  }
  
  e g() {
    return new e(this, super.g());
  }
  
  public void onCancel(DialogInterface paramDialogInterface) {}
  
  public void onDismiss(DialogInterface paramDialogInterface) {
    if (!this.o0) {
      if (FragmentManager.G0(3)) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onDismiss called for DialogFragment ");
        stringBuilder.append(this);
        Log.d("FragmentManager", stringBuilder.toString());
      } 
      U1(true, true);
    } 
  }
  
  public void p0(Context paramContext) {
    super.p0(paramContext);
    X().i(this.m0);
    if (!this.q0)
      this.p0 = false; 
  }
  
  public void s0(Bundle paramBundle) {
    boolean bool;
    super.s0(paramBundle);
    this.c0 = new Handler();
    if (this.z == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    this.j0 = bool;
    if (paramBundle != null) {
      this.g0 = paramBundle.getInt("android:style", 0);
      this.h0 = paramBundle.getInt("android:theme", 0);
      this.i0 = paramBundle.getBoolean("android:cancelable", true);
      this.j0 = paramBundle.getBoolean("android:showsDialog", this.j0);
      this.k0 = paramBundle.getInt("android:backStackId", -1);
    } 
  }
  
  public void z0() {
    super.z0();
    Dialog dialog = this.n0;
    if (dialog != null) {
      this.o0 = true;
      dialog.setOnDismissListener(null);
      this.n0.dismiss();
      if (!this.p0)
        onDismiss((DialogInterface)this.n0); 
      this.n0 = null;
      this.r0 = false;
    } 
  }
  
  class a implements Runnable {
    a(c this$0) {}
    
    @SuppressLint({"SyntheticAccessor"})
    public void run() {
      c.R1(this.b).onDismiss((DialogInterface)c.Q1(this.b));
    }
  }
  
  class b implements DialogInterface.OnCancelListener {
    b(c this$0) {}
    
    @SuppressLint({"SyntheticAccessor"})
    public void onCancel(DialogInterface param1DialogInterface) {
      if (c.Q1(this.b) != null) {
        c c1 = this.b;
        c1.onCancel((DialogInterface)c.Q1(c1));
      } 
    }
  }
  
  class c implements DialogInterface.OnDismissListener {
    c(c this$0) {}
    
    @SuppressLint({"SyntheticAccessor"})
    public void onDismiss(DialogInterface param1DialogInterface) {
      if (c.Q1(this.b) != null) {
        c c1 = this.b;
        c1.onDismiss((DialogInterface)c.Q1(c1));
      } 
    }
  }
  
  class d implements n<h> {
    d(c this$0) {}
    
    @SuppressLint({"SyntheticAccessor"})
    public void b(h param1h) {
      if (param1h != null && c.S1(this.a)) {
        View view = this.a.u1();
        if (view.getParent() == null) {
          if (c.Q1(this.a) != null) {
            if (FragmentManager.G0(3)) {
              StringBuilder stringBuilder = new StringBuilder();
              stringBuilder.append("DialogFragment ");
              stringBuilder.append(this);
              stringBuilder.append(" setting the content view on ");
              stringBuilder.append(c.Q1(this.a));
              Log.d("FragmentManager", stringBuilder.toString());
            } 
            c.Q1(this.a).setContentView(view);
          } 
        } else {
          throw new IllegalStateException("DialogFragment can not be attached to a container view");
        } 
      } 
    }
  }
  
  class e extends e {
    e(c this$0, e param1e) {}
    
    public View e(int param1Int) {
      return this.a.g() ? this.a.e(param1Int) : this.b.Y1(param1Int);
    }
    
    public boolean g() {
      return (this.a.g() || this.b.Z1());
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/fragment/app/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */