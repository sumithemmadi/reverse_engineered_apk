package b.h.i;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import b.h.j.d;

public class c implements Spannable {
  private static final Object b = new Object();
  
  private final Spannable c;
  
  private final a d;
  
  private final PrecomputedText e;
  
  public a a() {
    return this.d;
  }
  
  public PrecomputedText b() {
    Spannable spannable = this.c;
    return (spannable instanceof PrecomputedText) ? (PrecomputedText)spannable : null;
  }
  
  public char charAt(int paramInt) {
    return this.c.charAt(paramInt);
  }
  
  public int getSpanEnd(Object paramObject) {
    return this.c.getSpanEnd(paramObject);
  }
  
  public int getSpanFlags(Object paramObject) {
    return this.c.getSpanFlags(paramObject);
  }
  
  public int getSpanStart(Object paramObject) {
    return this.c.getSpanStart(paramObject);
  }
  
  @SuppressLint({"NewApi"})
  public <T> T[] getSpans(int paramInt1, int paramInt2, Class<T> paramClass) {
    return (T[])((Build.VERSION.SDK_INT >= 29) ? this.e.getSpans(paramInt1, paramInt2, paramClass) : this.c.getSpans(paramInt1, paramInt2, paramClass));
  }
  
  public int length() {
    return this.c.length();
  }
  
  public int nextSpanTransition(int paramInt1, int paramInt2, Class paramClass) {
    return this.c.nextSpanTransition(paramInt1, paramInt2, paramClass);
  }
  
  @SuppressLint({"NewApi"})
  public void removeSpan(Object paramObject) {
    if (!(paramObject instanceof android.text.style.MetricAffectingSpan)) {
      if (Build.VERSION.SDK_INT >= 29) {
        this.e.removeSpan(paramObject);
      } else {
        this.c.removeSpan(paramObject);
      } 
      return;
    } 
    throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
  }
  
  @SuppressLint({"NewApi"})
  public void setSpan(Object paramObject, int paramInt1, int paramInt2, int paramInt3) {
    if (!(paramObject instanceof android.text.style.MetricAffectingSpan)) {
      if (Build.VERSION.SDK_INT >= 29) {
        this.e.setSpan(paramObject, paramInt1, paramInt2, paramInt3);
      } else {
        this.c.setSpan(paramObject, paramInt1, paramInt2, paramInt3);
      } 
      return;
    } 
    throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
  }
  
  public CharSequence subSequence(int paramInt1, int paramInt2) {
    return this.c.subSequence(paramInt1, paramInt2);
  }
  
  public String toString() {
    return this.c.toString();
  }
  
  public static final class a {
    private final TextPaint a;
    
    private final TextDirectionHeuristic b;
    
    private final int c;
    
    private final int d;
    
    final PrecomputedText.Params e;
    
    public a(PrecomputedText.Params param1Params) {
      this.a = param1Params.getTextPaint();
      this.b = param1Params.getTextDirection();
      this.c = param1Params.getBreakStrategy();
      this.d = param1Params.getHyphenationFrequency();
      if (Build.VERSION.SDK_INT < 29)
        param1Params = null; 
      this.e = param1Params;
    }
    
    @SuppressLint({"NewApi"})
    a(TextPaint param1TextPaint, TextDirectionHeuristic param1TextDirectionHeuristic, int param1Int1, int param1Int2) {
      if (Build.VERSION.SDK_INT >= 29) {
        this.e = (new PrecomputedText.Params.Builder(param1TextPaint)).setBreakStrategy(param1Int1).setHyphenationFrequency(param1Int2).setTextDirection(param1TextDirectionHeuristic).build();
      } else {
        this.e = null;
      } 
      this.a = param1TextPaint;
      this.b = param1TextDirectionHeuristic;
      this.c = param1Int1;
      this.d = param1Int2;
    }
    
    public boolean a(a param1a) {
      int i = Build.VERSION.SDK_INT;
      if (i >= 23) {
        if (this.c != param1a.b())
          return false; 
        if (this.d != param1a.c())
          return false; 
      } 
      if (this.a.getTextSize() != param1a.e().getTextSize())
        return false; 
      if (this.a.getTextScaleX() != param1a.e().getTextScaleX())
        return false; 
      if (this.a.getTextSkewX() != param1a.e().getTextSkewX())
        return false; 
      if (i >= 21) {
        if (this.a.getLetterSpacing() != param1a.e().getLetterSpacing())
          return false; 
        if (!TextUtils.equals(this.a.getFontFeatureSettings(), param1a.e().getFontFeatureSettings()))
          return false; 
      } 
      if (this.a.getFlags() != param1a.e().getFlags())
        return false; 
      if (i >= 24) {
        if (!this.a.getTextLocales().equals(param1a.e().getTextLocales()))
          return false; 
      } else if (i >= 17 && !this.a.getTextLocale().equals(param1a.e().getTextLocale())) {
        return false;
      } 
      if (this.a.getTypeface() == null) {
        if (param1a.e().getTypeface() != null)
          return false; 
      } else if (!this.a.getTypeface().equals(param1a.e().getTypeface())) {
        return false;
      } 
      return true;
    }
    
    public int b() {
      return this.c;
    }
    
    public int c() {
      return this.d;
    }
    
    public TextDirectionHeuristic d() {
      return this.b;
    }
    
    public TextPaint e() {
      return this.a;
    }
    
    public boolean equals(Object param1Object) {
      if (param1Object == this)
        return true; 
      if (!(param1Object instanceof a))
        return false; 
      param1Object = param1Object;
      return !a((a)param1Object) ? false : (!(Build.VERSION.SDK_INT >= 18 && this.b != param1Object.d()));
    }
    
    public int hashCode() {
      int i = Build.VERSION.SDK_INT;
      return (i >= 24) ? d.b(new Object[] { 
            Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Float.valueOf(this.a.getLetterSpacing()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocales(), this.a.getTypeface(), Boolean.valueOf(this.a.isElegantTextHeight()), this.b, Integer.valueOf(this.c), 
            Integer.valueOf(this.d) }) : ((i >= 21) ? d.b(new Object[] { 
            Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Float.valueOf(this.a.getLetterSpacing()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocale(), this.a.getTypeface(), Boolean.valueOf(this.a.isElegantTextHeight()), this.b, Integer.valueOf(this.c), 
            Integer.valueOf(this.d) }) : ((i >= 18) ? d.b(new Object[] { Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocale(), this.a.getTypeface(), this.b, Integer.valueOf(this.c), Integer.valueOf(this.d) }) : ((i >= 17) ? d.b(new Object[] { Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocale(), this.a.getTypeface(), this.b, Integer.valueOf(this.c), Integer.valueOf(this.d) }) : d.b(new Object[] { Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Integer.valueOf(this.a.getFlags()), this.a.getTypeface(), this.b, Integer.valueOf(this.c), Integer.valueOf(this.d) }))));
    }
    
    public String toString() {
      StringBuilder stringBuilder1 = new StringBuilder("{");
      StringBuilder stringBuilder2 = new StringBuilder();
      stringBuilder2.append("textSize=");
      stringBuilder2.append(this.a.getTextSize());
      stringBuilder1.append(stringBuilder2.toString());
      stringBuilder2 = new StringBuilder();
      stringBuilder2.append(", textScaleX=");
      stringBuilder2.append(this.a.getTextScaleX());
      stringBuilder1.append(stringBuilder2.toString());
      stringBuilder2 = new StringBuilder();
      stringBuilder2.append(", textSkewX=");
      stringBuilder2.append(this.a.getTextSkewX());
      stringBuilder1.append(stringBuilder2.toString());
      int i = Build.VERSION.SDK_INT;
      if (i >= 21) {
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append(", letterSpacing=");
        stringBuilder2.append(this.a.getLetterSpacing());
        stringBuilder1.append(stringBuilder2.toString());
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append(", elegantTextHeight=");
        stringBuilder2.append(this.a.isElegantTextHeight());
        stringBuilder1.append(stringBuilder2.toString());
      } 
      if (i >= 24) {
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append(", textLocale=");
        stringBuilder2.append(this.a.getTextLocales());
        stringBuilder1.append(stringBuilder2.toString());
      } else if (i >= 17) {
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append(", textLocale=");
        stringBuilder2.append(this.a.getTextLocale());
        stringBuilder1.append(stringBuilder2.toString());
      } 
      stringBuilder2 = new StringBuilder();
      stringBuilder2.append(", typeface=");
      stringBuilder2.append(this.a.getTypeface());
      stringBuilder1.append(stringBuilder2.toString());
      if (i >= 26) {
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append(", variationSettings=");
        stringBuilder2.append(this.a.getFontVariationSettings());
        stringBuilder1.append(stringBuilder2.toString());
      } 
      stringBuilder2 = new StringBuilder();
      stringBuilder2.append(", textDir=");
      stringBuilder2.append(this.b);
      stringBuilder1.append(stringBuilder2.toString());
      stringBuilder2 = new StringBuilder();
      stringBuilder2.append(", breakStrategy=");
      stringBuilder2.append(this.c);
      stringBuilder1.append(stringBuilder2.toString());
      stringBuilder2 = new StringBuilder();
      stringBuilder2.append(", hyphenationFrequency=");
      stringBuilder2.append(this.d);
      stringBuilder1.append(stringBuilder2.toString());
      stringBuilder1.append("}");
      return stringBuilder1.toString();
    }
    
    public static class a {
      private final TextPaint a;
      
      private TextDirectionHeuristic b;
      
      private int c;
      
      private int d;
      
      public a(TextPaint param2TextPaint) {
        this.a = param2TextPaint;
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
          this.c = 1;
          this.d = 1;
        } else {
          this.d = 0;
          this.c = 0;
        } 
        if (i >= 18) {
          this.b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        } else {
          this.b = null;
        } 
      }
      
      public c.a a() {
        return new c.a(this.a, this.b, this.c, this.d);
      }
      
      public a b(int param2Int) {
        this.c = param2Int;
        return this;
      }
      
      public a c(int param2Int) {
        this.d = param2Int;
        return this;
      }
      
      public a d(TextDirectionHeuristic param2TextDirectionHeuristic) {
        this.b = param2TextDirectionHeuristic;
        return this;
      }
    }
  }
  
  public static class a {
    private final TextPaint a;
    
    private TextDirectionHeuristic b;
    
    private int c;
    
    private int d;
    
    public a(TextPaint param1TextPaint) {
      this.a = param1TextPaint;
      int i = Build.VERSION.SDK_INT;
      if (i >= 23) {
        this.c = 1;
        this.d = 1;
      } else {
        this.d = 0;
        this.c = 0;
      } 
      if (i >= 18) {
        this.b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
      } else {
        this.b = null;
      } 
    }
    
    public c.a a() {
      return new c.a(this.a, this.b, this.c, this.d);
    }
    
    public a b(int param1Int) {
      this.c = param1Int;
      return this;
    }
    
    public a c(int param1Int) {
      this.d = param1Int;
      return this;
    }
    
    public a d(TextDirectionHeuristic param1TextDirectionHeuristic) {
      this.b = param1TextDirectionHeuristic;
      return this;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/h/i/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */