package b.h.k.g0;

import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

public final class b {
  public static InputConnection a(InputConnection paramInputConnection, EditorInfo paramEditorInfo, c paramc) {
    if (paramInputConnection != null) {
      if (paramEditorInfo != null) {
        if (paramc != null)
          return (InputConnection)((Build.VERSION.SDK_INT >= 25) ? new a(paramInputConnection, false, paramc) : (((a.a(paramEditorInfo)).length == 0) ? paramInputConnection : new b(paramInputConnection, false, paramc))); 
        throw new IllegalArgumentException("onCommitContentListener must be non-null");
      } 
      throw new IllegalArgumentException("editorInfo must be non-null");
    } 
    throw new IllegalArgumentException("inputConnection must be non-null");
  }
  
  static boolean b(String paramString, Bundle paramBundle, c paramc) {
    boolean bool2;
    boolean bool1 = false;
    if (paramBundle == null)
      return false; 
    if (TextUtils.equals("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", paramString)) {
      bool2 = false;
    } else if (TextUtils.equals("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", paramString)) {
      bool2 = true;
    } else {
      return false;
    } 
    if (bool2) {
      paramString = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
    } else {
      paramString = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
    } 
    try {
      ResultReceiver resultReceiver = (ResultReceiver)paramBundle.getParcelable(paramString);
      if (bool2) {
        paramString = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI";
      } else {
        paramString = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";
      } 
    } finally {
      paramBundle = null;
    } 
    if (paramString != null)
      paramString.send(0, null); 
    throw paramBundle;
  }
  
  class a extends InputConnectionWrapper {
    a(b this$0, boolean param1Boolean, b.c param1c) {
      super((InputConnection)this$0, param1Boolean);
    }
    
    public boolean commitContent(InputContentInfo param1InputContentInfo, int param1Int, Bundle param1Bundle) {
      return this.a.a(c.f(param1InputContentInfo), param1Int, param1Bundle) ? true : super.commitContent(param1InputContentInfo, param1Int, param1Bundle);
    }
  }
  
  class b extends InputConnectionWrapper {
    b(b this$0, boolean param1Boolean, b.c param1c) {
      super((InputConnection)this$0, param1Boolean);
    }
    
    public boolean performPrivateCommand(String param1String, Bundle param1Bundle) {
      return b.b(param1String, param1Bundle, this.a) ? true : super.performPrivateCommand(param1String, param1Bundle);
    }
  }
  
  public static interface c {
    boolean a(c param1c, int param1Int, Bundle param1Bundle);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/h/k/g0/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */