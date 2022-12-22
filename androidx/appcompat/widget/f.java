package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import b.a.c;
import b.a.d;
import b.a.e;

public final class f {
  private static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
  
  private static f b;
  
  private v c;
  
  public static f b() {
    // Byte code:
    //   0: ldc androidx/appcompat/widget/f
    //   2: monitorenter
    //   3: getstatic androidx/appcompat/widget/f.b : Landroidx/appcompat/widget/f;
    //   6: ifnonnull -> 12
    //   9: invokestatic h : ()V
    //   12: getstatic androidx/appcompat/widget/f.b : Landroidx/appcompat/widget/f;
    //   15: astore_0
    //   16: ldc androidx/appcompat/widget/f
    //   18: monitorexit
    //   19: aload_0
    //   20: areturn
    //   21: astore_0
    //   22: ldc androidx/appcompat/widget/f
    //   24: monitorexit
    //   25: aload_0
    //   26: athrow
    // Exception table:
    //   from	to	target	type
    //   3	12	21	finally
    //   12	16	21	finally
  }
  
  public static PorterDuffColorFilter e(int paramInt, PorterDuff.Mode paramMode) {
    // Byte code:
    //   0: ldc androidx/appcompat/widget/f
    //   2: monitorenter
    //   3: iload_0
    //   4: aload_1
    //   5: invokestatic l : (ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;
    //   8: astore_1
    //   9: ldc androidx/appcompat/widget/f
    //   11: monitorexit
    //   12: aload_1
    //   13: areturn
    //   14: astore_1
    //   15: ldc androidx/appcompat/widget/f
    //   17: monitorexit
    //   18: aload_1
    //   19: athrow
    // Exception table:
    //   from	to	target	type
    //   3	9	14	finally
  }
  
  public static void h() {
    // Byte code:
    //   0: ldc androidx/appcompat/widget/f
    //   2: monitorenter
    //   3: getstatic androidx/appcompat/widget/f.b : Landroidx/appcompat/widget/f;
    //   6: ifnonnull -> 48
    //   9: new androidx/appcompat/widget/f
    //   12: astore_0
    //   13: aload_0
    //   14: invokespecial <init> : ()V
    //   17: aload_0
    //   18: putstatic androidx/appcompat/widget/f.b : Landroidx/appcompat/widget/f;
    //   21: aload_0
    //   22: invokestatic h : ()Landroidx/appcompat/widget/v;
    //   25: putfield c : Landroidx/appcompat/widget/v;
    //   28: getstatic androidx/appcompat/widget/f.b : Landroidx/appcompat/widget/f;
    //   31: getfield c : Landroidx/appcompat/widget/v;
    //   34: astore_0
    //   35: new androidx/appcompat/widget/f$a
    //   38: astore_1
    //   39: aload_1
    //   40: invokespecial <init> : ()V
    //   43: aload_0
    //   44: aload_1
    //   45: invokevirtual u : (Landroidx/appcompat/widget/v$f;)V
    //   48: ldc androidx/appcompat/widget/f
    //   50: monitorexit
    //   51: return
    //   52: astore_0
    //   53: ldc androidx/appcompat/widget/f
    //   55: monitorexit
    //   56: aload_0
    //   57: athrow
    // Exception table:
    //   from	to	target	type
    //   3	48	52	finally
  }
  
  static void i(Drawable paramDrawable, c0 paramc0, int[] paramArrayOfint) {
    v.w(paramDrawable, paramc0, paramArrayOfint);
  }
  
  public Drawable c(Context paramContext, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield c : Landroidx/appcompat/widget/v;
    //   6: aload_1
    //   7: iload_2
    //   8: invokevirtual j : (Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //   11: astore_1
    //   12: aload_0
    //   13: monitorexit
    //   14: aload_1
    //   15: areturn
    //   16: astore_1
    //   17: aload_0
    //   18: monitorexit
    //   19: aload_1
    //   20: athrow
    // Exception table:
    //   from	to	target	type
    //   2	12	16	finally
  }
  
  Drawable d(Context paramContext, int paramInt, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield c : Landroidx/appcompat/widget/v;
    //   6: aload_1
    //   7: iload_2
    //   8: iload_3
    //   9: invokevirtual k : (Landroid/content/Context;IZ)Landroid/graphics/drawable/Drawable;
    //   12: astore_1
    //   13: aload_0
    //   14: monitorexit
    //   15: aload_1
    //   16: areturn
    //   17: astore_1
    //   18: aload_0
    //   19: monitorexit
    //   20: aload_1
    //   21: athrow
    // Exception table:
    //   from	to	target	type
    //   2	13	17	finally
  }
  
  ColorStateList f(Context paramContext, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield c : Landroidx/appcompat/widget/v;
    //   6: aload_1
    //   7: iload_2
    //   8: invokevirtual m : (Landroid/content/Context;I)Landroid/content/res/ColorStateList;
    //   11: astore_1
    //   12: aload_0
    //   13: monitorexit
    //   14: aload_1
    //   15: areturn
    //   16: astore_1
    //   17: aload_0
    //   18: monitorexit
    //   19: aload_1
    //   20: athrow
    // Exception table:
    //   from	to	target	type
    //   2	12	16	finally
  }
  
  public void g(Context paramContext) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield c : Landroidx/appcompat/widget/v;
    //   6: aload_1
    //   7: invokevirtual s : (Landroid/content/Context;)V
    //   10: aload_0
    //   11: monitorexit
    //   12: return
    //   13: astore_1
    //   14: aload_0
    //   15: monitorexit
    //   16: aload_1
    //   17: athrow
    // Exception table:
    //   from	to	target	type
    //   2	10	13	finally
  }
  
  class a implements v.f {
    private final int[] a = new int[] { e.abc_textfield_search_default_mtrl_alpha, e.abc_textfield_default_mtrl_alpha, e.abc_ab_share_pack_mtrl_alpha };
    
    private final int[] b = new int[] { e.abc_ic_commit_search_api_mtrl_alpha, e.abc_seekbar_tick_mark_material, e.abc_ic_menu_share_mtrl_alpha, e.abc_ic_menu_copy_mtrl_am_alpha, e.abc_ic_menu_cut_mtrl_alpha, e.abc_ic_menu_selectall_mtrl_alpha, e.abc_ic_menu_paste_mtrl_am_alpha };
    
    private final int[] c = new int[] { e.abc_textfield_activated_mtrl_alpha, e.abc_textfield_search_activated_mtrl_alpha, e.abc_cab_background_top_mtrl_alpha, e.abc_text_cursor_material, e.abc_text_select_handle_left_mtrl, e.abc_text_select_handle_middle_mtrl, e.abc_text_select_handle_right_mtrl };
    
    private final int[] d = new int[] { e.abc_popup_background_mtrl_mult, e.abc_cab_background_internal_bg, e.abc_menu_hardkey_panel_mtrl_mult };
    
    private final int[] e = new int[] { e.abc_tab_indicator_material, e.abc_textfield_search_material };
    
    private final int[] f = new int[] { e.abc_btn_check_material, e.abc_btn_radio_material, e.abc_btn_check_material_anim, e.abc_btn_radio_material_anim };
    
    private boolean f(int[] param1ArrayOfint, int param1Int) {
      int i = param1ArrayOfint.length;
      for (byte b = 0; b < i; b++) {
        if (param1ArrayOfint[b] == param1Int)
          return true; 
      } 
      return false;
    }
    
    private ColorStateList g(Context param1Context) {
      return h(param1Context, 0);
    }
    
    private ColorStateList h(Context param1Context, int param1Int) {
      int i = z.c(param1Context, b.a.a.colorControlHighlight);
      int j = z.b(param1Context, b.a.a.colorButtonNormal);
      int[] arrayOfInt2 = z.b;
      int[] arrayOfInt3 = z.e;
      int k = b.h.e.a.b(i, param1Int);
      int[] arrayOfInt1 = z.c;
      i = b.h.e.a.b(i, param1Int);
      return new ColorStateList(new int[][] { arrayOfInt2, arrayOfInt3, arrayOfInt1, z.i }, new int[] { j, k, i, param1Int });
    }
    
    private ColorStateList i(Context param1Context) {
      return h(param1Context, z.c(param1Context, b.a.a.colorAccent));
    }
    
    private ColorStateList j(Context param1Context) {
      return h(param1Context, z.c(param1Context, b.a.a.colorButtonNormal));
    }
    
    private ColorStateList k(Context param1Context) {
      int[][] arrayOfInt = new int[3][];
      int[] arrayOfInt1 = new int[3];
      int i = b.a.a.colorSwitchThumbNormal;
      ColorStateList colorStateList = z.e(param1Context, i);
      if (colorStateList != null && colorStateList.isStateful()) {
        arrayOfInt[0] = z.b;
        arrayOfInt1[0] = colorStateList.getColorForState(arrayOfInt[0], 0);
        arrayOfInt[1] = z.f;
        arrayOfInt1[1] = z.c(param1Context, b.a.a.colorControlActivated);
        arrayOfInt[2] = z.i;
        arrayOfInt1[2] = colorStateList.getDefaultColor();
      } else {
        arrayOfInt[0] = z.b;
        arrayOfInt1[0] = z.b(param1Context, i);
        arrayOfInt[1] = z.f;
        arrayOfInt1[1] = z.c(param1Context, b.a.a.colorControlActivated);
        arrayOfInt[2] = z.i;
        arrayOfInt1[2] = z.c(param1Context, i);
      } 
      return new ColorStateList(arrayOfInt, arrayOfInt1);
    }
    
    private LayerDrawable l(v param1v, Context param1Context, int param1Int) {
      BitmapDrawable bitmapDrawable1;
      BitmapDrawable bitmapDrawable2;
      BitmapDrawable bitmapDrawable3;
      param1Int = param1Context.getResources().getDimensionPixelSize(param1Int);
      Drawable drawable1 = param1v.j(param1Context, e.abc_star_black_48dp);
      Drawable drawable2 = param1v.j(param1Context, e.abc_star_half_black_48dp);
      if (drawable1 instanceof BitmapDrawable && drawable1.getIntrinsicWidth() == param1Int && drawable1.getIntrinsicHeight() == param1Int) {
        bitmapDrawable2 = (BitmapDrawable)drawable1;
        bitmapDrawable1 = new BitmapDrawable(bitmapDrawable2.getBitmap());
      } else {
        Bitmap bitmap = Bitmap.createBitmap(param1Int, param1Int, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        drawable1.setBounds(0, 0, param1Int, param1Int);
        drawable1.draw(canvas);
        bitmapDrawable2 = new BitmapDrawable(bitmap);
        bitmapDrawable1 = new BitmapDrawable(bitmap);
      } 
      bitmapDrawable1.setTileModeX(Shader.TileMode.REPEAT);
      if (drawable2 instanceof BitmapDrawable && drawable2.getIntrinsicWidth() == param1Int && drawable2.getIntrinsicHeight() == param1Int) {
        bitmapDrawable3 = (BitmapDrawable)drawable2;
      } else {
        Bitmap bitmap = Bitmap.createBitmap(param1Int, param1Int, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        bitmapDrawable3.setBounds(0, 0, param1Int, param1Int);
        bitmapDrawable3.draw(canvas);
        bitmapDrawable3 = new BitmapDrawable(bitmap);
      } 
      LayerDrawable layerDrawable = new LayerDrawable(new Drawable[] { (Drawable)bitmapDrawable2, (Drawable)bitmapDrawable3, (Drawable)bitmapDrawable1 });
      layerDrawable.setId(0, 16908288);
      layerDrawable.setId(1, 16908303);
      layerDrawable.setId(2, 16908301);
      return layerDrawable;
    }
    
    private void m(Drawable param1Drawable, int param1Int, PorterDuff.Mode param1Mode) {
      Drawable drawable = param1Drawable;
      if (q.a(param1Drawable))
        drawable = param1Drawable.mutate(); 
      PorterDuff.Mode mode = param1Mode;
      if (param1Mode == null)
        mode = f.a(); 
      drawable.setColorFilter((ColorFilter)f.e(param1Int, mode));
    }
    
    public boolean a(Context param1Context, int param1Int, Drawable param1Drawable) {
      // Byte code:
      //   0: invokestatic a : ()Landroid/graphics/PorterDuff$Mode;
      //   3: astore #4
      //   5: aload_0
      //   6: aload_0
      //   7: getfield a : [I
      //   10: iload_2
      //   11: invokespecial f : ([II)Z
      //   14: istore #5
      //   16: ldc_w 16842801
      //   19: istore #6
      //   21: iload #5
      //   23: ifeq -> 39
      //   26: getstatic b/a/a.colorControlNormal : I
      //   29: istore_2
      //   30: iconst_m1
      //   31: istore #6
      //   33: iconst_1
      //   34: istore #7
      //   36: goto -> 124
      //   39: aload_0
      //   40: aload_0
      //   41: getfield c : [I
      //   44: iload_2
      //   45: invokespecial f : ([II)Z
      //   48: ifeq -> 58
      //   51: getstatic b/a/a.colorControlActivated : I
      //   54: istore_2
      //   55: goto -> 30
      //   58: aload_0
      //   59: aload_0
      //   60: getfield d : [I
      //   63: iload_2
      //   64: invokespecial f : ([II)Z
      //   67: ifeq -> 81
      //   70: getstatic android/graphics/PorterDuff$Mode.MULTIPLY : Landroid/graphics/PorterDuff$Mode;
      //   73: astore #4
      //   75: iload #6
      //   77: istore_2
      //   78: goto -> 30
      //   81: iload_2
      //   82: getstatic b/a/e.abc_list_divider_mtrl_alpha : I
      //   85: if_icmpne -> 103
      //   88: ldc_w 16842800
      //   91: istore_2
      //   92: ldc_w 40.8
      //   95: invokestatic round : (F)I
      //   98: istore #6
      //   100: goto -> 33
      //   103: iload_2
      //   104: getstatic b/a/e.abc_dialog_material_background : I
      //   107: if_icmpne -> 116
      //   110: iload #6
      //   112: istore_2
      //   113: goto -> 30
      //   116: iconst_m1
      //   117: istore #6
      //   119: iconst_0
      //   120: istore #7
      //   122: iconst_0
      //   123: istore_2
      //   124: iload #7
      //   126: ifeq -> 175
      //   129: aload_3
      //   130: astore #8
      //   132: aload_3
      //   133: invokestatic a : (Landroid/graphics/drawable/Drawable;)Z
      //   136: ifeq -> 145
      //   139: aload_3
      //   140: invokevirtual mutate : ()Landroid/graphics/drawable/Drawable;
      //   143: astore #8
      //   145: aload #8
      //   147: aload_1
      //   148: iload_2
      //   149: invokestatic c : (Landroid/content/Context;I)I
      //   152: aload #4
      //   154: invokestatic e : (ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;
      //   157: invokevirtual setColorFilter : (Landroid/graphics/ColorFilter;)V
      //   160: iload #6
      //   162: iconst_m1
      //   163: if_icmpeq -> 173
      //   166: aload #8
      //   168: iload #6
      //   170: invokevirtual setAlpha : (I)V
      //   173: iconst_1
      //   174: ireturn
      //   175: iconst_0
      //   176: ireturn
    }
    
    public PorterDuff.Mode b(int param1Int) {
      PorterDuff.Mode mode;
      if (param1Int == e.abc_switch_thumb_material) {
        mode = PorterDuff.Mode.MULTIPLY;
      } else {
        mode = null;
      } 
      return mode;
    }
    
    public Drawable c(v param1v, Context param1Context, int param1Int) {
      return (Drawable)((param1Int == e.abc_cab_background_top_material) ? new LayerDrawable(new Drawable[] { param1v.j(param1Context, e.abc_cab_background_internal_bg), param1v.j(param1Context, e.abc_cab_background_top_mtrl_alpha) }) : ((param1Int == e.abc_ratingbar_material) ? l(param1v, param1Context, d.abc_star_big) : ((param1Int == e.abc_ratingbar_indicator_material) ? l(param1v, param1Context, d.abc_star_medium) : ((param1Int == e.abc_ratingbar_small_material) ? l(param1v, param1Context, d.abc_star_small) : null))));
    }
    
    public ColorStateList d(Context param1Context, int param1Int) {
      return (param1Int == e.abc_edit_text_material) ? b.a.k.a.a.c(param1Context, c.abc_tint_edittext) : ((param1Int == e.abc_switch_track_mtrl_alpha) ? b.a.k.a.a.c(param1Context, c.abc_tint_switch_track) : ((param1Int == e.abc_switch_thumb_material) ? k(param1Context) : ((param1Int == e.abc_btn_default_mtrl_shape) ? j(param1Context) : ((param1Int == e.abc_btn_borderless_material) ? g(param1Context) : ((param1Int == e.abc_btn_colored_material) ? i(param1Context) : ((param1Int == e.abc_spinner_mtrl_am_alpha || param1Int == e.abc_spinner_textfield_background_material) ? b.a.k.a.a.c(param1Context, c.abc_tint_spinner) : (f(this.b, param1Int) ? z.e(param1Context, b.a.a.colorControlNormal) : (f(this.e, param1Int) ? b.a.k.a.a.c(param1Context, c.abc_tint_default) : (f(this.f, param1Int) ? b.a.k.a.a.c(param1Context, c.abc_tint_btn_checkable) : ((param1Int == e.abc_seekbar_thumb_material) ? b.a.k.a.a.c(param1Context, c.abc_tint_seek_thumb) : null))))))))));
    }
    
    public boolean e(Context param1Context, int param1Int, Drawable param1Drawable) {
      if (param1Int == e.abc_seekbar_track_material) {
        LayerDrawable layerDrawable = (LayerDrawable)param1Drawable;
        param1Drawable = layerDrawable.findDrawableByLayerId(16908288);
        param1Int = b.a.a.colorControlNormal;
        m(param1Drawable, z.c(param1Context, param1Int), f.a());
        m(layerDrawable.findDrawableByLayerId(16908303), z.c(param1Context, param1Int), f.a());
        m(layerDrawable.findDrawableByLayerId(16908301), z.c(param1Context, b.a.a.colorControlActivated), f.a());
        return true;
      } 
      if (param1Int == e.abc_ratingbar_material || param1Int == e.abc_ratingbar_indicator_material || param1Int == e.abc_ratingbar_small_material) {
        LayerDrawable layerDrawable = (LayerDrawable)param1Drawable;
        m(layerDrawable.findDrawableByLayerId(16908288), z.b(param1Context, b.a.a.colorControlNormal), f.a());
        param1Drawable = layerDrawable.findDrawableByLayerId(16908303);
        param1Int = b.a.a.colorControlActivated;
        m(param1Drawable, z.c(param1Context, param1Int), f.a());
        m(layerDrawable.findDrawableByLayerId(16908301), z.c(param1Context, param1Int), f.a());
        return true;
      } 
      return false;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/widget/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */