package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Selection;
import android.text.Spannable;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
import android.widget.TextView;
import b.h.k.c;
import b.h.k.g0.c;
import b.h.k.w;

final class j {
  static b.h.k.g0.b.c a(View paramView) {
    return new a(paramView);
  }
  
  static boolean b(View paramView, DragEvent paramDragEvent) {
    if (Build.VERSION.SDK_INT >= 24 && paramDragEvent.getLocalState() == null && w.F(paramView) != null) {
      StringBuilder stringBuilder;
      Activity activity = d(paramView);
      if (activity == null) {
        stringBuilder = new StringBuilder();
        stringBuilder.append("Can't handle drop: no activity: view=");
        stringBuilder.append(paramView);
        Log.i("ReceiveContent", stringBuilder.toString());
        return false;
      } 
      if (stringBuilder.getAction() == 1)
        return paramView instanceof TextView ^ true; 
      if (stringBuilder.getAction() == 3) {
        boolean bool;
        if (paramView instanceof TextView) {
          bool = b.a((DragEvent)stringBuilder, (TextView)paramView, activity);
        } else {
          bool = b.b((DragEvent)stringBuilder, paramView, activity);
        } 
        return bool;
      } 
    } 
    return false;
  }
  
  static boolean c(TextView paramTextView, int paramInt) {
    ClipData clipData;
    boolean bool = false;
    if ((paramInt != 16908322 && paramInt != 16908337) || w.F((View)paramTextView) == null)
      return false; 
    ClipboardManager clipboardManager = (ClipboardManager)paramTextView.getContext().getSystemService("clipboard");
    if (clipboardManager == null) {
      clipboardManager = null;
    } else {
      clipData = clipboardManager.getPrimaryClip();
    } 
    if (clipData != null && clipData.getItemCount() > 0) {
      c.a a = new c.a(clipData, 1);
      if (paramInt == 16908322) {
        paramInt = bool;
      } else {
        paramInt = 1;
      } 
      w.g0((View)paramTextView, a.c(paramInt).a());
    } 
    return true;
  }
  
  static Activity d(View paramView) {
    for (Context context = paramView.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper)context).getBaseContext()) {
      if (context instanceof Activity)
        return (Activity)context; 
    } 
    return null;
  }
  
  class a implements b.h.k.g0.b.c {
    a(j this$0) {}
    
    public boolean a(c param1c, int param1Int, Bundle param1Bundle) {
      int i = Build.VERSION.SDK_INT;
      boolean bool = false;
      Bundle bundle = param1Bundle;
      if (i >= 25) {
        bundle = param1Bundle;
        if ((param1Int & 0x1) != 0)
          try {
            param1c.d();
            InputContentInfo inputContentInfo = (InputContentInfo)param1c.e();
            if (param1Bundle == null) {
              param1Bundle = new Bundle();
            } else {
              param1Bundle = new Bundle(param1Bundle);
            } 
            param1Bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", (Parcelable)inputContentInfo);
            bundle = param1Bundle;
          } catch (Exception exception) {
            Log.w("ReceiveContent", "Can't insert content from IME; requestPermission() failed", exception);
            return false;
          }  
      } 
      c c1 = (new c.a(new ClipData(exception.b(), new ClipData.Item(exception.a())), 2)).d(exception.c()).b(bundle).a();
      if (w.g0(this.a, c1) == null)
        bool = true; 
      return bool;
    }
  }
  
  private static final class b {
    static boolean a(DragEvent param1DragEvent, TextView param1TextView, Activity param1Activity) {
      param1Activity.requestDragAndDropPermissions(param1DragEvent);
      int i = param1TextView.getOffsetForPosition(param1DragEvent.getX(), param1DragEvent.getY());
      param1TextView.beginBatchEdit();
      try {
        Selection.setSelection((Spannable)param1TextView.getText(), i);
        c.a a = new c.a();
        this(param1DragEvent.getClipData(), 3);
        w.g0((View)param1TextView, a.a());
        return true;
      } finally {
        param1TextView.endBatchEdit();
      } 
    }
    
    static boolean b(DragEvent param1DragEvent, View param1View, Activity param1Activity) {
      param1Activity.requestDragAndDropPermissions(param1DragEvent);
      w.g0(param1View, (new c.a(param1DragEvent.getClipData(), 3)).a());
      return true;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/widget/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */