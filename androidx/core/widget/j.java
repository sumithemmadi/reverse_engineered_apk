package androidx.core.widget;

import android.content.ClipData;
import android.content.Context;
import android.os.Build;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import b.h.k.c;
import b.h.k.r;

public final class j implements r {
  private static CharSequence b(ClipData paramClipData, Context paramContext, int paramInt) {
    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
    for (byte b = 0; b < paramClipData.getItemCount(); b++) {
      CharSequence charSequence = c(paramContext, paramClipData.getItemAt(b), paramInt);
      if (charSequence != null)
        spannableStringBuilder.append(charSequence); 
    } 
    return (CharSequence)spannableStringBuilder;
  }
  
  private static CharSequence c(Context paramContext, ClipData.Item paramItem, int paramInt) {
    return (Build.VERSION.SDK_INT >= 16) ? a.a(paramContext, paramItem, paramInt) : b.a(paramContext, paramItem, paramInt);
  }
  
  private static void d(TextView paramTextView, c paramc) {
    CharSequence charSequence = b(paramc.b(), paramTextView.getContext(), paramc.c());
    e((Editable)paramTextView.getText(), charSequence);
  }
  
  private static void e(Editable paramEditable, CharSequence paramCharSequence) {
    int i = Selection.getSelectionStart((CharSequence)paramEditable);
    int k = Selection.getSelectionEnd((CharSequence)paramEditable);
    int m = Math.max(0, Math.min(i, k));
    i = Math.max(0, Math.max(i, k));
    Selection.setSelection((Spannable)paramEditable, i);
    paramEditable.replace(m, i, paramCharSequence);
  }
  
  public c a(View paramView, c paramc) {
    if (Log.isLoggable("ReceiveContent", 3)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("onReceive: ");
      stringBuilder.append(paramc);
      Log.d("ReceiveContent", stringBuilder.toString());
    } 
    int i = paramc.d();
    if (i == 2)
      return paramc; 
    if (i == 3) {
      d((TextView)paramView, paramc);
      return null;
    } 
    ClipData clipData = paramc.b();
    int k = paramc.c();
    TextView textView = (TextView)paramView;
    Editable editable = (Editable)textView.getText();
    Context context = textView.getContext();
    byte b = 0;
    int m;
    for (m = 0; b < clipData.getItemCount(); m = i) {
      CharSequence charSequence = c(context, clipData.getItemAt(b), k);
      i = m;
      if (charSequence != null)
        if (!m) {
          e(editable, charSequence);
          i = 1;
        } else {
          editable.insert(Selection.getSelectionEnd((CharSequence)editable), "\n");
          editable.insert(Selection.getSelectionEnd((CharSequence)editable), charSequence);
          i = m;
        }  
      b++;
    } 
    return null;
  }
  
  private static final class a {
    static CharSequence a(Context param1Context, ClipData.Item param1Item, int param1Int) {
      CharSequence charSequence1;
      CharSequence charSequence2;
      if ((param1Int & 0x1) != 0) {
        charSequence2 = param1Item.coerceToText(param1Context);
        charSequence1 = charSequence2;
        if (charSequence2 instanceof android.text.Spanned)
          charSequence1 = charSequence2.toString(); 
        return charSequence1;
      } 
      return charSequence2.coerceToStyledText((Context)charSequence1);
    }
  }
  
  private static final class b {
    static CharSequence a(Context param1Context, ClipData.Item param1Item, int param1Int) {
      CharSequence charSequence2 = param1Item.coerceToText(param1Context);
      CharSequence charSequence1 = charSequence2;
      if ((param1Int & 0x1) != 0) {
        charSequence1 = charSequence2;
        if (charSequence2 instanceof android.text.Spanned)
          charSequence1 = charSequence2.toString(); 
      } 
      return charSequence1;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/core/widget/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */