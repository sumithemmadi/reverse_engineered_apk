package androidx.appcompat.widget;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

class g {
  static InputConnection a(InputConnection paramInputConnection, EditorInfo paramEditorInfo, View paramView) {
    if (paramInputConnection != null && paramEditorInfo.hintText == null)
      for (ViewParent viewParent = paramView.getParent(); viewParent instanceof View; viewParent = viewParent.getParent()) {
        if (viewParent instanceof l0) {
          paramEditorInfo.hintText = ((l0)viewParent).a();
          break;
        } 
      }  
    return paramInputConnection;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/widget/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */