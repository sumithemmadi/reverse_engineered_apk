package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import b.h.j.i;

final class l {
  private TextView a;
  
  private TextClassifier b;
  
  l(TextView paramTextView) {
    this.a = (TextView)i.e(paramTextView);
  }
  
  public TextClassifier a() {
    TextClassifier textClassifier1 = this.b;
    TextClassifier textClassifier2 = textClassifier1;
    if (textClassifier1 == null) {
      TextClassificationManager textClassificationManager = (TextClassificationManager)this.a.getContext().getSystemService(TextClassificationManager.class);
      if (textClassificationManager != null)
        return textClassificationManager.getTextClassifier(); 
      textClassifier2 = TextClassifier.NO_OP;
    } 
    return textClassifier2;
  }
  
  public void b(TextClassifier paramTextClassifier) {
    this.b = paramTextClassifier;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/widget/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */