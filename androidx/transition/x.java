package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TypeEvaluator;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

class x {
  private static final boolean a;
  
  private static final boolean b;
  
  private static final boolean c;
  
  static {
    boolean bool2;
    int i = Build.VERSION.SDK_INT;
    boolean bool1 = true;
    if (i >= 19) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    a = bool2;
    if (i >= 18) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    b = bool2;
    if (i >= 28) {
      bool2 = bool1;
    } else {
      bool2 = false;
    } 
    c = bool2;
  }
  
  static View a(ViewGroup paramViewGroup, View paramView1, View paramView2) {
    Matrix matrix = new Matrix();
    matrix.setTranslate(-paramView2.getScrollX(), -paramView2.getScrollY());
    j0.j(paramView1, matrix);
    j0.k((View)paramViewGroup, matrix);
    RectF rectF = new RectF(0.0F, 0.0F, paramView1.getWidth(), paramView1.getHeight());
    matrix.mapRect(rectF);
    int i = Math.round(rectF.left);
    int j = Math.round(rectF.top);
    int k = Math.round(rectF.right);
    int m = Math.round(rectF.bottom);
    ImageView imageView = new ImageView(paramView1.getContext());
    imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
    Bitmap bitmap = b(paramView1, matrix, rectF, paramViewGroup);
    if (bitmap != null)
      imageView.setImageBitmap(bitmap); 
    imageView.measure(View.MeasureSpec.makeMeasureSpec(k - i, 1073741824), View.MeasureSpec.makeMeasureSpec(m - j, 1073741824));
    imageView.layout(i, j, k, m);
    return (View)imageView;
  }
  
  private static Bitmap b(View paramView, Matrix paramMatrix, RectF paramRectF, ViewGroup paramViewGroup) {
    // Byte code:
    //   0: getstatic androidx/transition/x.a : Z
    //   3: ifeq -> 30
    //   6: aload_0
    //   7: invokevirtual isAttachedToWindow : ()Z
    //   10: iconst_1
    //   11: ixor
    //   12: istore #4
    //   14: aload_3
    //   15: ifnonnull -> 21
    //   18: goto -> 33
    //   21: aload_3
    //   22: invokevirtual isAttachedToWindow : ()Z
    //   25: istore #5
    //   27: goto -> 36
    //   30: iconst_0
    //   31: istore #4
    //   33: iconst_0
    //   34: istore #5
    //   36: getstatic androidx/transition/x.b : Z
    //   39: istore #6
    //   41: aconst_null
    //   42: astore #7
    //   44: iload #6
    //   46: ifeq -> 89
    //   49: iload #4
    //   51: ifeq -> 89
    //   54: iload #5
    //   56: ifne -> 61
    //   59: aconst_null
    //   60: areturn
    //   61: aload_0
    //   62: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   65: checkcast android/view/ViewGroup
    //   68: astore #8
    //   70: aload #8
    //   72: aload_0
    //   73: invokevirtual indexOfChild : (Landroid/view/View;)I
    //   76: istore #9
    //   78: aload_3
    //   79: invokevirtual getOverlay : ()Landroid/view/ViewGroupOverlay;
    //   82: aload_0
    //   83: invokevirtual add : (Landroid/view/View;)V
    //   86: goto -> 95
    //   89: aconst_null
    //   90: astore #8
    //   92: iconst_0
    //   93: istore #9
    //   95: aload_2
    //   96: invokevirtual width : ()F
    //   99: invokestatic round : (F)I
    //   102: istore #10
    //   104: aload_2
    //   105: invokevirtual height : ()F
    //   108: invokestatic round : (F)I
    //   111: istore #11
    //   113: aload #7
    //   115: astore #12
    //   117: iload #10
    //   119: ifle -> 273
    //   122: aload #7
    //   124: astore #12
    //   126: iload #11
    //   128: ifle -> 273
    //   131: fconst_1
    //   132: ldc 1048576.0
    //   134: iload #10
    //   136: iload #11
    //   138: imul
    //   139: i2f
    //   140: fdiv
    //   141: invokestatic min : (FF)F
    //   144: fstore #13
    //   146: iload #10
    //   148: i2f
    //   149: fload #13
    //   151: fmul
    //   152: invokestatic round : (F)I
    //   155: istore #10
    //   157: iload #11
    //   159: i2f
    //   160: fload #13
    //   162: fmul
    //   163: invokestatic round : (F)I
    //   166: istore #11
    //   168: aload_1
    //   169: aload_2
    //   170: getfield left : F
    //   173: fneg
    //   174: aload_2
    //   175: getfield top : F
    //   178: fneg
    //   179: invokevirtual postTranslate : (FF)Z
    //   182: pop
    //   183: aload_1
    //   184: fload #13
    //   186: fload #13
    //   188: invokevirtual postScale : (FF)Z
    //   191: pop
    //   192: getstatic androidx/transition/x.c : Z
    //   195: ifeq -> 241
    //   198: new android/graphics/Picture
    //   201: dup
    //   202: invokespecial <init> : ()V
    //   205: astore_2
    //   206: aload_2
    //   207: iload #10
    //   209: iload #11
    //   211: invokevirtual beginRecording : (II)Landroid/graphics/Canvas;
    //   214: astore #12
    //   216: aload #12
    //   218: aload_1
    //   219: invokevirtual concat : (Landroid/graphics/Matrix;)V
    //   222: aload_0
    //   223: aload #12
    //   225: invokevirtual draw : (Landroid/graphics/Canvas;)V
    //   228: aload_2
    //   229: invokevirtual endRecording : ()V
    //   232: aload_2
    //   233: invokestatic createBitmap : (Landroid/graphics/Picture;)Landroid/graphics/Bitmap;
    //   236: astore #12
    //   238: goto -> 273
    //   241: iload #10
    //   243: iload #11
    //   245: getstatic android/graphics/Bitmap$Config.ARGB_8888 : Landroid/graphics/Bitmap$Config;
    //   248: invokestatic createBitmap : (IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    //   251: astore #12
    //   253: new android/graphics/Canvas
    //   256: dup
    //   257: aload #12
    //   259: invokespecial <init> : (Landroid/graphics/Bitmap;)V
    //   262: astore_2
    //   263: aload_2
    //   264: aload_1
    //   265: invokevirtual concat : (Landroid/graphics/Matrix;)V
    //   268: aload_0
    //   269: aload_2
    //   270: invokevirtual draw : (Landroid/graphics/Canvas;)V
    //   273: iload #6
    //   275: ifeq -> 299
    //   278: iload #4
    //   280: ifeq -> 299
    //   283: aload_3
    //   284: invokevirtual getOverlay : ()Landroid/view/ViewGroupOverlay;
    //   287: aload_0
    //   288: invokevirtual remove : (Landroid/view/View;)V
    //   291: aload #8
    //   293: aload_0
    //   294: iload #9
    //   296: invokevirtual addView : (Landroid/view/View;I)V
    //   299: aload #12
    //   301: areturn
  }
  
  static Animator c(Animator paramAnimator1, Animator paramAnimator2) {
    if (paramAnimator1 == null)
      return paramAnimator2; 
    if (paramAnimator2 == null)
      return paramAnimator1; 
    AnimatorSet animatorSet = new AnimatorSet();
    animatorSet.playTogether(new Animator[] { paramAnimator1, paramAnimator2 });
    return (Animator)animatorSet;
  }
  
  static class a implements TypeEvaluator<Matrix> {
    final float[] a = new float[9];
    
    final float[] b = new float[9];
    
    final Matrix c = new Matrix();
    
    public Matrix a(float param1Float, Matrix param1Matrix1, Matrix param1Matrix2) {
      param1Matrix1.getValues(this.a);
      param1Matrix2.getValues(this.b);
      for (byte b = 0; b < 9; b++) {
        float[] arrayOfFloat1 = this.b;
        float f1 = arrayOfFloat1[b];
        float[] arrayOfFloat2 = this.a;
        float f2 = arrayOfFloat2[b];
        arrayOfFloat1[b] = arrayOfFloat2[b] + (f1 - f2) * param1Float;
      } 
      this.c.setValues(this.b);
      return this.c;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/transition/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */