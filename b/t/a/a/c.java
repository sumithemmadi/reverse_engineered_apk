package b.t.a.a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.content.d.g;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

public class c extends h implements Animatable {
  private b c;
  
  private Context d;
  
  private ArgbEvaluator e = null;
  
  private Animator.AnimatorListener f = null;
  
  ArrayList<b> g = null;
  
  final Drawable.Callback h;
  
  c() {
    this(null, null, null);
  }
  
  private c(Context paramContext) {
    this(paramContext, null, null);
  }
  
  private c(Context paramContext, b paramb, Resources paramResources) {
    a a = new a(this);
    this.h = a;
    this.d = paramContext;
    if (paramb != null) {
      this.c = paramb;
    } else {
      this.c = new b(paramContext, paramb, a, paramResources);
    } 
  }
  
  public static c a(Context paramContext, Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme) {
    c c1 = new c(paramContext);
    c1.inflate(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
    return c1;
  }
  
  private void b(String paramString, Animator paramAnimator) {
    paramAnimator.setTarget(this.c.b.d(paramString));
    if (Build.VERSION.SDK_INT < 21)
      c(paramAnimator); 
    b b1 = this.c;
    if (b1.d == null) {
      b1.d = new ArrayList<Animator>();
      this.c.e = new b.e.a();
    } 
    this.c.d.add(paramAnimator);
    this.c.e.put(paramAnimator, paramString);
  }
  
  private void c(Animator paramAnimator) {
    if (paramAnimator instanceof AnimatorSet) {
      ArrayList<Animator> arrayList = ((AnimatorSet)paramAnimator).getChildAnimations();
      if (arrayList != null)
        for (byte b1 = 0; b1 < arrayList.size(); b1++)
          c(arrayList.get(b1));  
    } 
    if (paramAnimator instanceof ObjectAnimator) {
      ObjectAnimator objectAnimator = (ObjectAnimator)paramAnimator;
      String str = objectAnimator.getPropertyName();
      if ("fillColor".equals(str) || "strokeColor".equals(str)) {
        if (this.e == null)
          this.e = new ArgbEvaluator(); 
        objectAnimator.setEvaluator((TypeEvaluator)this.e);
      } 
    } 
  }
  
  public void applyTheme(Resources.Theme paramTheme) {
    Drawable drawable = this.b;
    if (drawable != null)
      androidx.core.graphics.drawable.a.a(drawable, paramTheme); 
  }
  
  public boolean canApplyTheme() {
    Drawable drawable = this.b;
    return (drawable != null) ? androidx.core.graphics.drawable.a.b(drawable) : false;
  }
  
  public void draw(Canvas paramCanvas) {
    Drawable drawable = this.b;
    if (drawable != null) {
      drawable.draw(paramCanvas);
      return;
    } 
    this.c.b.draw(paramCanvas);
    if (this.c.c.isStarted())
      invalidateSelf(); 
  }
  
  public int getAlpha() {
    Drawable drawable = this.b;
    return (drawable != null) ? androidx.core.graphics.drawable.a.d(drawable) : this.c.b.getAlpha();
  }
  
  public int getChangingConfigurations() {
    Drawable drawable = this.b;
    return (drawable != null) ? drawable.getChangingConfigurations() : (super.getChangingConfigurations() | this.c.a);
  }
  
  public ColorFilter getColorFilter() {
    Drawable drawable = this.b;
    return (drawable != null) ? androidx.core.graphics.drawable.a.e(drawable) : this.c.b.getColorFilter();
  }
  
  public Drawable.ConstantState getConstantState() {
    return (this.b != null && Build.VERSION.SDK_INT >= 24) ? new c(this.b.getConstantState()) : null;
  }
  
  public int getIntrinsicHeight() {
    Drawable drawable = this.b;
    return (drawable != null) ? drawable.getIntrinsicHeight() : this.c.b.getIntrinsicHeight();
  }
  
  public int getIntrinsicWidth() {
    Drawable drawable = this.b;
    return (drawable != null) ? drawable.getIntrinsicWidth() : this.c.b.getIntrinsicWidth();
  }
  
  public int getOpacity() {
    Drawable drawable = this.b;
    return (drawable != null) ? drawable.getOpacity() : this.c.b.getOpacity();
  }
  
  public void inflate(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet) {
    inflate(paramResources, paramXmlPullParser, paramAttributeSet, null);
  }
  
  public void inflate(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme) {
    Drawable drawable = this.b;
    if (drawable != null) {
      androidx.core.graphics.drawable.a.g(drawable, paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
      return;
    } 
    int i = paramXmlPullParser.getEventType();
    int j = paramXmlPullParser.getDepth();
    while (i != 1 && (paramXmlPullParser.getDepth() >= j + 1 || i != 3)) {
      if (i == 2) {
        TypedArray typedArray;
        String str = paramXmlPullParser.getName();
        if ("animated-vector".equals(str)) {
          typedArray = g.k(paramResources, paramTheme, paramAttributeSet, a.e);
          i = typedArray.getResourceId(0, 0);
          if (i != 0) {
            i i1 = i.b(paramResources, i, paramTheme);
            i1.h(false);
            i1.setCallback(this.h);
            i i2 = this.c.b;
            if (i2 != null)
              i2.setCallback(null); 
            this.c.b = i1;
          } 
          typedArray.recycle();
        } else if ("target".equals(typedArray)) {
          TypedArray typedArray1 = paramResources.obtainAttributes(paramAttributeSet, a.f);
          String str1 = typedArray1.getString(0);
          i = typedArray1.getResourceId(1, 0);
          if (i != 0) {
            Context context = this.d;
            if (context != null) {
              b(str1, e.i(context, i));
            } else {
              typedArray1.recycle();
              throw new IllegalStateException("Context can't be null when inflating animators");
            } 
          } 
          typedArray1.recycle();
        } 
      } 
      i = paramXmlPullParser.next();
    } 
    this.c.a();
  }
  
  public boolean isAutoMirrored() {
    Drawable drawable = this.b;
    return (drawable != null) ? androidx.core.graphics.drawable.a.h(drawable) : this.c.b.isAutoMirrored();
  }
  
  public boolean isRunning() {
    Drawable drawable = this.b;
    return (drawable != null) ? ((AnimatedVectorDrawable)drawable).isRunning() : this.c.c.isRunning();
  }
  
  public boolean isStateful() {
    Drawable drawable = this.b;
    return (drawable != null) ? drawable.isStateful() : this.c.b.isStateful();
  }
  
  public Drawable mutate() {
    Drawable drawable = this.b;
    if (drawable != null)
      drawable.mutate(); 
    return this;
  }
  
  protected void onBoundsChange(Rect paramRect) {
    Drawable drawable = this.b;
    if (drawable != null) {
      drawable.setBounds(paramRect);
      return;
    } 
    this.c.b.setBounds(paramRect);
  }
  
  protected boolean onLevelChange(int paramInt) {
    Drawable drawable = this.b;
    return (drawable != null) ? drawable.setLevel(paramInt) : this.c.b.setLevel(paramInt);
  }
  
  protected boolean onStateChange(int[] paramArrayOfint) {
    Drawable drawable = this.b;
    return (drawable != null) ? drawable.setState(paramArrayOfint) : this.c.b.setState(paramArrayOfint);
  }
  
  public void setAlpha(int paramInt) {
    Drawable drawable = this.b;
    if (drawable != null) {
      drawable.setAlpha(paramInt);
      return;
    } 
    this.c.b.setAlpha(paramInt);
  }
  
  public void setAutoMirrored(boolean paramBoolean) {
    Drawable drawable = this.b;
    if (drawable != null) {
      androidx.core.graphics.drawable.a.j(drawable, paramBoolean);
      return;
    } 
    this.c.b.setAutoMirrored(paramBoolean);
  }
  
  public void setColorFilter(ColorFilter paramColorFilter) {
    Drawable drawable = this.b;
    if (drawable != null) {
      drawable.setColorFilter(paramColorFilter);
      return;
    } 
    this.c.b.setColorFilter(paramColorFilter);
  }
  
  public void setTint(int paramInt) {
    Drawable drawable = this.b;
    if (drawable != null) {
      androidx.core.graphics.drawable.a.n(drawable, paramInt);
      return;
    } 
    this.c.b.setTint(paramInt);
  }
  
  public void setTintList(ColorStateList paramColorStateList) {
    Drawable drawable = this.b;
    if (drawable != null) {
      androidx.core.graphics.drawable.a.o(drawable, paramColorStateList);
      return;
    } 
    this.c.b.setTintList(paramColorStateList);
  }
  
  public void setTintMode(PorterDuff.Mode paramMode) {
    Drawable drawable = this.b;
    if (drawable != null) {
      androidx.core.graphics.drawable.a.p(drawable, paramMode);
      return;
    } 
    this.c.b.setTintMode(paramMode);
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2) {
    Drawable drawable = this.b;
    if (drawable != null)
      return drawable.setVisible(paramBoolean1, paramBoolean2); 
    this.c.b.setVisible(paramBoolean1, paramBoolean2);
    return super.setVisible(paramBoolean1, paramBoolean2);
  }
  
  public void start() {
    Drawable drawable = this.b;
    if (drawable != null) {
      ((AnimatedVectorDrawable)drawable).start();
      return;
    } 
    if (this.c.c.isStarted())
      return; 
    this.c.c.start();
    invalidateSelf();
  }
  
  public void stop() {
    Drawable drawable = this.b;
    if (drawable != null) {
      ((AnimatedVectorDrawable)drawable).stop();
      return;
    } 
    this.c.c.end();
  }
  
  class a implements Drawable.Callback {
    a(c this$0) {}
    
    public void invalidateDrawable(Drawable param1Drawable) {
      this.b.invalidateSelf();
    }
    
    public void scheduleDrawable(Drawable param1Drawable, Runnable param1Runnable, long param1Long) {
      this.b.scheduleSelf(param1Runnable, param1Long);
    }
    
    public void unscheduleDrawable(Drawable param1Drawable, Runnable param1Runnable) {
      this.b.unscheduleSelf(param1Runnable);
    }
  }
  
  private static class b extends Drawable.ConstantState {
    int a;
    
    i b;
    
    AnimatorSet c;
    
    ArrayList<Animator> d;
    
    b.e.a<Animator, String> e;
    
    public b(Context param1Context, b param1b, Drawable.Callback param1Callback, Resources param1Resources) {
      if (param1b != null) {
        this.a = param1b.a;
        i i1 = param1b.b;
        byte b1 = 0;
        if (i1 != null) {
          Drawable.ConstantState constantState = i1.getConstantState();
          if (param1Resources != null) {
            this.b = (i)constantState.newDrawable(param1Resources);
          } else {
            this.b = (i)constantState.newDrawable();
          } 
          i i2 = (i)this.b.mutate();
          this.b = i2;
          i2.setCallback(param1Callback);
          this.b.setBounds(param1b.b.getBounds());
          this.b.h(false);
        } 
        ArrayList<Animator> arrayList = param1b.d;
        if (arrayList != null) {
          int j = arrayList.size();
          this.d = new ArrayList<Animator>(j);
          this.e = new b.e.a(j);
          while (b1 < j) {
            Animator animator2 = param1b.d.get(b1);
            Animator animator1 = animator2.clone();
            String str = (String)param1b.e.get(animator2);
            animator1.setTarget(this.b.d(str));
            this.d.add(animator1);
            this.e.put(animator1, str);
            b1++;
          } 
          a();
        } 
      } 
    }
    
    public void a() {
      if (this.c == null)
        this.c = new AnimatorSet(); 
      this.c.playTogether(this.d);
    }
    
    public int getChangingConfigurations() {
      return this.a;
    }
    
    public Drawable newDrawable() {
      throw new IllegalStateException("No constant state support for SDK < 24.");
    }
    
    public Drawable newDrawable(Resources param1Resources) {
      throw new IllegalStateException("No constant state support for SDK < 24.");
    }
  }
  
  private static class c extends Drawable.ConstantState {
    private final Drawable.ConstantState a;
    
    public c(Drawable.ConstantState param1ConstantState) {
      this.a = param1ConstantState;
    }
    
    public boolean canApplyTheme() {
      return this.a.canApplyTheme();
    }
    
    public int getChangingConfigurations() {
      return this.a.getChangingConfigurations();
    }
    
    public Drawable newDrawable() {
      c c1 = new c();
      Drawable drawable = this.a.newDrawable();
      c1.b = drawable;
      drawable.setCallback(c1.h);
      return c1;
    }
    
    public Drawable newDrawable(Resources param1Resources) {
      c c1 = new c();
      Drawable drawable = this.a.newDrawable(param1Resources);
      c1.b = drawable;
      drawable.setCallback(c1.h);
      return c1;
    }
    
    public Drawable newDrawable(Resources param1Resources, Resources.Theme param1Theme) {
      c c1 = new c();
      Drawable drawable = this.a.newDrawable(param1Resources, param1Theme);
      c1.b = drawable;
      drawable.setCallback(c1.h);
      return c1;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/t/a/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */