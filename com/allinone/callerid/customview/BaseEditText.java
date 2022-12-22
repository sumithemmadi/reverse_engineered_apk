package com.allinone.callerid.customview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import java.lang.reflect.Field;

@SuppressLint({"AppCompatCustomView"})
public class BaseEditText extends EditText {
  private static Field b;
  
  static {
    try {
      Field field = View.class.getDeclaredField("mParent");
      b = field;
      field.setAccessible(true);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public BaseEditText(Context paramContext) {
    super(paramContext);
  }
  
  public BaseEditText(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
  }
  
  public BaseEditText(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  protected void onDetachedFromWindow() {
    try {
      Field field = b;
      if (field != null)
        field.set(this, null); 
    } catch (IllegalAccessException illegalAccessException) {
      illegalAccessException.printStackTrace();
    } catch (IllegalArgumentException illegalArgumentException) {
      illegalArgumentException.printStackTrace();
    } 
    super.onDetachedFromWindow();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/customview/BaseEditText.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */