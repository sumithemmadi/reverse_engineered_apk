package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import b.h.k.t;

class d {
  static void a(Fragment paramFragment, d paramd, t.g paramg) {
    e e;
    View view = paramFragment.J;
    ViewGroup viewGroup = paramFragment.I;
    viewGroup.startViewTransition(view);
    androidx.core.os.b b = new androidx.core.os.b();
    b.c(new a(paramFragment));
    paramg.b(paramFragment, b);
    if (paramd.a != null) {
      e = new e(paramd.a, viewGroup, view);
      paramFragment.y1(paramFragment.J);
      e.setAnimationListener(new b(viewGroup, paramFragment, paramg, b));
      paramFragment.J.startAnimation((Animation)e);
    } else {
      Animator animator = ((d)e).b;
      paramFragment.A1(animator);
      animator.addListener((Animator.AnimatorListener)new c(viewGroup, view, paramFragment, paramg, b));
      animator.setTarget(paramFragment.J);
      animator.start();
    } 
  }
  
  private static int b(Fragment paramFragment, boolean paramBoolean1, boolean paramBoolean2) {
    return paramBoolean2 ? (paramBoolean1 ? paramFragment.K() : paramFragment.L()) : (paramBoolean1 ? paramFragment.u() : paramFragment.x());
  }
  
  static d c(Context paramContext, Fragment paramFragment, boolean paramBoolean1, boolean paramBoolean2) {
    int i = paramFragment.G();
    int j = b(paramFragment, paramBoolean1, paramBoolean2);
    boolean bool = false;
    paramFragment.z1(0, 0, 0, 0);
    ViewGroup viewGroup = paramFragment.I;
    if (viewGroup != null) {
      int m = b.m.b.visible_removing_fragment_view_tag;
      if (viewGroup.getTag(m) != null)
        paramFragment.I.setTag(m, null); 
    } 
    viewGroup = paramFragment.I;
    if (viewGroup != null && viewGroup.getLayoutTransition() != null)
      return null; 
    Animation animation = paramFragment.t0(i, paramBoolean1, j);
    if (animation != null)
      return new d(animation); 
    Animator animator = paramFragment.u0(i, paramBoolean1, j);
    if (animator != null)
      return new d(animator); 
    int k = j;
    if (j == 0) {
      k = j;
      if (i != 0)
        k = d(i, paramBoolean1); 
    } 
    if (k != 0) {
      paramBoolean1 = "anim".equals(paramContext.getResources().getResourceTypeName(k));
      j = bool;
      if (paramBoolean1)
        try {
          Animation animation1 = AnimationUtils.loadAnimation(paramContext, k);
          if (animation1 != null)
            return new d(animation1); 
          j = 1;
        } catch (android.content.res.Resources.NotFoundException notFoundException) {
          throw notFoundException;
        } catch (RuntimeException runtimeException) {
          j = bool;
        }  
      if (j == 0)
        try {
          animator = AnimatorInflater.loadAnimator((Context)notFoundException, k);
          if (animator != null)
            return new d(animator); 
        } catch (RuntimeException runtimeException) {
          if (!paramBoolean1) {
            Animation animation1 = AnimationUtils.loadAnimation((Context)notFoundException, k);
            if (animation1 != null)
              return new d(animation1); 
          } else {
            throw runtimeException;
          } 
        }  
    } 
    return null;
  }
  
  private static int d(int paramInt, boolean paramBoolean) {
    if (paramInt != 4097) {
      if (paramInt != 4099) {
        if (paramInt != 8194) {
          paramInt = -1;
        } else if (paramBoolean) {
          paramInt = b.m.a.fragment_close_enter;
        } else {
          paramInt = b.m.a.fragment_close_exit;
        } 
      } else if (paramBoolean) {
        paramInt = b.m.a.fragment_fade_enter;
      } else {
        paramInt = b.m.a.fragment_fade_exit;
      } 
    } else if (paramBoolean) {
      paramInt = b.m.a.fragment_open_enter;
    } else {
      paramInt = b.m.a.fragment_open_exit;
    } 
    return paramInt;
  }
  
  class a implements androidx.core.os.b.a {
    a(d this$0) {}
    
    public void a() {
      if (this.a.p() != null) {
        View view = this.a.p();
        this.a.y1(null);
        view.clearAnimation();
      } 
      this.a.A1(null);
    }
  }
  
  class b implements Animation.AnimationListener {
    b(d this$0, Fragment param1Fragment, t.g param1g, androidx.core.os.b param1b) {}
    
    public void onAnimationEnd(Animation param1Animation) {
      this.a.post(new a(this));
    }
    
    public void onAnimationRepeat(Animation param1Animation) {}
    
    public void onAnimationStart(Animation param1Animation) {}
    
    class a implements Runnable {
      a(d.b this$0) {}
      
      public void run() {
        if (this.b.b.p() != null) {
          this.b.b.y1(null);
          d.b b1 = this.b;
          b1.c.a(b1.b, b1.d);
        } 
      }
    }
  }
  
  class a implements Runnable {
    a(d this$0) {}
    
    public void run() {
      if (this.b.b.p() != null) {
        this.b.b.y1(null);
        d.b b1 = this.b;
        b1.c.a(b1.b, b1.d);
      } 
    }
  }
  
  class c extends AnimatorListenerAdapter {
    c(d this$0, View param1View, Fragment param1Fragment, t.g param1g, androidx.core.os.b param1b) {}
    
    public void onAnimationEnd(Animator param1Animator) {
      this.a.endViewTransition(this.b);
      param1Animator = this.c.q();
      this.c.A1(null);
      if (param1Animator != null && this.a.indexOfChild(this.b) < 0)
        this.d.a(this.c, this.e); 
    }
  }
  
  static class d {
    public final Animation a = null;
    
    public final Animator b;
    
    d(Animator param1Animator) {
      this.b = param1Animator;
      if (param1Animator != null)
        return; 
      throw new IllegalStateException("Animator cannot be null");
    }
    
    d(Animation param1Animation) {
      this.b = null;
      if (param1Animation != null)
        return; 
      throw new IllegalStateException("Animation cannot be null");
    }
  }
  
  static class e extends AnimationSet implements Runnable {
    private final ViewGroup b;
    
    private final View c;
    
    private boolean d;
    
    private boolean e;
    
    private boolean f = true;
    
    e(Animation param1Animation, ViewGroup param1ViewGroup, View param1View) {
      super(false);
      this.b = param1ViewGroup;
      this.c = param1View;
      addAnimation(param1Animation);
      param1ViewGroup.post(this);
    }
    
    public boolean getTransformation(long param1Long, Transformation param1Transformation) {
      this.f = true;
      if (this.d)
        return this.e ^ true; 
      if (!super.getTransformation(param1Long, param1Transformation)) {
        this.d = true;
        t.a((View)this.b, this);
      } 
      return true;
    }
    
    public boolean getTransformation(long param1Long, Transformation param1Transformation, float param1Float) {
      this.f = true;
      if (this.d)
        return this.e ^ true; 
      if (!super.getTransformation(param1Long, param1Transformation, param1Float)) {
        this.d = true;
        t.a((View)this.b, this);
      } 
      return true;
    }
    
    public void run() {
      if (!this.d && this.f) {
        this.f = false;
        this.b.post(this);
      } else {
        this.b.endViewTransition(this.c);
        this.e = true;
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/fragment/app/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */