package b.h.k.g0;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import b.h.j.i;

public final class a {
  private static final String[] a = new String[0];
  
  public static String[] a(EditorInfo paramEditorInfo) {
    String[] arrayOfString1;
    if (Build.VERSION.SDK_INT >= 25) {
      arrayOfString1 = paramEditorInfo.contentMimeTypes;
      if (arrayOfString1 == null)
        arrayOfString1 = a; 
      return arrayOfString1;
    } 
    Bundle bundle = ((EditorInfo)arrayOfString1).extras;
    if (bundle == null)
      return a; 
    String[] arrayOfString3 = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
    String[] arrayOfString2 = arrayOfString3;
    if (arrayOfString3 == null)
      arrayOfString2 = ((EditorInfo)arrayOfString1).extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"); 
    if (arrayOfString2 == null)
      arrayOfString2 = a; 
    return arrayOfString2;
  }
  
  private static boolean b(CharSequence paramCharSequence, int paramInt1, int paramInt2) {
    return (paramInt2 != 0) ? ((paramInt2 != 1) ? false : Character.isHighSurrogate(paramCharSequence.charAt(paramInt1))) : Character.isLowSurrogate(paramCharSequence.charAt(paramInt1));
  }
  
  private static boolean c(int paramInt) {
    paramInt &= 0xFFF;
    return (paramInt == 129 || paramInt == 225 || paramInt == 18);
  }
  
  public static void d(EditorInfo paramEditorInfo, String[] paramArrayOfString) {
    if (Build.VERSION.SDK_INT >= 25) {
      paramEditorInfo.contentMimeTypes = paramArrayOfString;
    } else {
      if (paramEditorInfo.extras == null)
        paramEditorInfo.extras = new Bundle(); 
      paramEditorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", paramArrayOfString);
      paramEditorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", paramArrayOfString);
    } 
  }
  
  public static void e(EditorInfo paramEditorInfo, CharSequence paramCharSequence, int paramInt) {
    int k;
    i.e(paramCharSequence);
    if (Build.VERSION.SDK_INT >= 30) {
      a.a(paramEditorInfo, paramCharSequence, paramInt);
      return;
    } 
    int i = paramEditorInfo.initialSelStart;
    int j = paramEditorInfo.initialSelEnd;
    if (i > j) {
      k = j - paramInt;
    } else {
      k = i - paramInt;
    } 
    if (i > j) {
      j = i - paramInt;
    } else {
      j -= paramInt;
    } 
    i = paramCharSequence.length();
    if (paramInt < 0 || k < 0 || j > i) {
      g(paramEditorInfo, null, 0, 0);
      return;
    } 
    if (c(paramEditorInfo.inputType)) {
      g(paramEditorInfo, null, 0, 0);
      return;
    } 
    if (i <= 2048) {
      g(paramEditorInfo, paramCharSequence, k, j);
      return;
    } 
    h(paramEditorInfo, paramCharSequence, k, j);
  }
  
  public static void f(EditorInfo paramEditorInfo, CharSequence paramCharSequence) {
    if (Build.VERSION.SDK_INT >= 30) {
      a.a(paramEditorInfo, paramCharSequence, 0);
    } else {
      e(paramEditorInfo, paramCharSequence, 0);
    } 
  }
  
  private static void g(EditorInfo paramEditorInfo, CharSequence paramCharSequence, int paramInt1, int paramInt2) {
    if (paramEditorInfo.extras == null)
      paramEditorInfo.extras = new Bundle(); 
    if (paramCharSequence != null) {
      SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(paramCharSequence);
    } else {
      paramCharSequence = null;
    } 
    paramEditorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", paramCharSequence);
    paramEditorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", paramInt1);
    paramEditorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", paramInt2);
  }
  
  private static void h(EditorInfo paramEditorInfo, CharSequence paramCharSequence, int paramInt1, int paramInt2) {
    int j;
    int i = paramInt2 - paramInt1;
    if (i > 1024) {
      j = 0;
    } else {
      j = i;
    } 
    int k = paramCharSequence.length();
    int m = 2048 - j;
    double d = m;
    Double.isNaN(d);
    int n = Math.min(k - paramInt2, m - Math.min(paramInt1, (int)(d * 0.8D)));
    k = Math.min(paramInt1, m - n);
    int i1 = paramInt1 - k;
    m = k;
    paramInt1 = i1;
    if (b(paramCharSequence, i1, 0)) {
      paramInt1 = i1 + 1;
      m = k - 1;
    } 
    k = n;
    if (b(paramCharSequence, paramInt2 + n - 1, 1))
      k = n - 1; 
    if (j != i) {
      paramCharSequence = TextUtils.concat(new CharSequence[] { paramCharSequence.subSequence(paramInt1, paramInt1 + m), paramCharSequence.subSequence(paramInt2, k + paramInt2) });
    } else {
      paramCharSequence = paramCharSequence.subSequence(paramInt1, m + j + k + paramInt1);
    } 
    paramInt1 = m + 0;
    g(paramEditorInfo, paramCharSequence, paramInt1, j + paramInt1);
  }
  
  private static class a {
    static void a(EditorInfo param1EditorInfo, CharSequence param1CharSequence, int param1Int) {
      param1EditorInfo.setInitialSurroundingSubText(param1CharSequence, param1Int);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/h/k/g0/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */