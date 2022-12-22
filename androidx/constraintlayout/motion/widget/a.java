package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.Log;
import android.view.View;

public class a {
  public static String a() {
    StackTraceElement stackTraceElement = (new Throwable()).getStackTrace()[1];
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(".(");
    stringBuilder.append(stackTraceElement.getFileName());
    stringBuilder.append(":");
    stringBuilder.append(stackTraceElement.getLineNumber());
    stringBuilder.append(")");
    return stringBuilder.toString();
  }
  
  public static String b(Context paramContext, int paramInt) {
    if (paramInt != -1)
      try {
        return paramContext.getResources().getResourceEntryName(paramInt);
      } catch (Exception exception) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("?");
        stringBuilder.append(paramInt);
        return stringBuilder.toString();
      }  
    return "UNKNOWN";
  }
  
  public static String c(View paramView) {
    try {
      return paramView.getContext().getResources().getResourceEntryName(paramView.getId());
    } catch (Exception exception) {
      return "UNKNOWN";
    } 
  }
  
  public static String d(MotionLayout paramMotionLayout, int paramInt) {
    return (paramInt == -1) ? "UNDEFINED" : paramMotionLayout.getContext().getResources().getResourceEntryName(paramInt);
  }
  
  public static void e(String paramString1, String paramString2, int paramInt) {
    StackTraceElement[] arrayOfStackTraceElement = (new Throwable()).getStackTrace();
    int i = arrayOfStackTraceElement.length;
    boolean bool = true;
    i = Math.min(paramInt, i - 1);
    String str = " ";
    for (paramInt = bool; paramInt <= i; paramInt++) {
      StackTraceElement stackTraceElement = arrayOfStackTraceElement[paramInt];
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(".(");
      stringBuilder1.append(arrayOfStackTraceElement[paramInt].getFileName());
      stringBuilder1.append(":");
      stringBuilder1.append(arrayOfStackTraceElement[paramInt].getLineNumber());
      stringBuilder1.append(") ");
      stringBuilder1.append(arrayOfStackTraceElement[paramInt].getMethodName());
      String str1 = stringBuilder1.toString();
      StringBuilder stringBuilder2 = new StringBuilder();
      stringBuilder2.append(str);
      stringBuilder2.append(" ");
      str = stringBuilder2.toString();
      stringBuilder2 = new StringBuilder();
      stringBuilder2.append(paramString2);
      stringBuilder2.append(str);
      stringBuilder2.append(str1);
      stringBuilder2.append(str);
      Log.v(paramString1, stringBuilder2.toString());
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/constraintlayout/motion/widget/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */