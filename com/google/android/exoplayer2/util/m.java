package com.google.android.exoplayer2.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

public final class m {
  private static void a(int paramInt1, String paramString, int paramInt2) {
    paramInt1 = GLES20.glCreateShader(paramInt1);
    GLES20.glShaderSource(paramInt1, paramString);
    GLES20.glCompileShader(paramInt1);
    int[] arrayOfInt = new int[1];
    arrayOfInt[0] = 0;
    GLES20.glGetShaderiv(paramInt1, 35713, arrayOfInt, 0);
    if (arrayOfInt[0] != 1) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(GLES20.glGetShaderInfoLog(paramInt1));
      stringBuilder.append(", source: ");
      stringBuilder.append(paramString);
      j(stringBuilder.toString());
    } 
    GLES20.glAttachShader(paramInt2, paramInt1);
    GLES20.glDeleteShader(paramInt1);
    b();
  }
  
  public static void b() {
    while (true) {
      int i = GLES20.glGetError();
      if (i != 0) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("glError ");
        stringBuilder.append(GLU.gluErrorString(i));
        o.c("GlUtil", stringBuilder.toString());
        continue;
      } 
      break;
    } 
  }
  
  public static int c(String paramString1, String paramString2) {
    int i = GLES20.glCreateProgram();
    b();
    a(35633, paramString1, i);
    a(35632, paramString2, i);
    GLES20.glLinkProgram(i);
    int[] arrayOfInt = new int[1];
    arrayOfInt[0] = 0;
    GLES20.glGetProgramiv(i, 35714, arrayOfInt, 0);
    if (arrayOfInt[0] != 1) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Unable to link shader program: \n");
      stringBuilder.append(GLES20.glGetProgramInfoLog(i));
      j(stringBuilder.toString());
    } 
    b();
    return i;
  }
  
  public static int d(String[] paramArrayOfString1, String[] paramArrayOfString2) {
    return c(TextUtils.join("\n", (Object[])paramArrayOfString1), TextUtils.join("\n", (Object[])paramArrayOfString2));
  }
  
  public static FloatBuffer e(int paramInt) {
    return ByteBuffer.allocateDirect(paramInt * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
  }
  
  public static FloatBuffer f(float[] paramArrayOffloat) {
    return (FloatBuffer)e(paramArrayOffloat.length).put(paramArrayOffloat).flip();
  }
  
  public static int g() {
    int[] arrayOfInt = new int[1];
    GLES20.glGenTextures(1, IntBuffer.wrap(arrayOfInt));
    GLES20.glBindTexture(36197, arrayOfInt[0]);
    GLES20.glTexParameteri(36197, 10241, 9729);
    GLES20.glTexParameteri(36197, 10240, 9729);
    GLES20.glTexParameteri(36197, 10242, 33071);
    GLES20.glTexParameteri(36197, 10243, 33071);
    b();
    return arrayOfInt[0];
  }
  
  @TargetApi(24)
  public static boolean h(Context paramContext) {
    int i = h0.a;
    boolean bool1 = false;
    if (i < 24)
      return false; 
    if (i < 26 && ("samsung".equals(h0.c) || "XT1650".equals(h0.d)))
      return false; 
    if (i < 26 && !paramContext.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance"))
      return false; 
    String str = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
    boolean bool2 = bool1;
    if (str != null) {
      bool2 = bool1;
      if (str.contains("EGL_EXT_protected_content"))
        bool2 = true; 
    } 
    return bool2;
  }
  
  @TargetApi(17)
  public static boolean i() {
    int i = h0.a;
    boolean bool1 = false;
    if (i < 17)
      return false; 
    String str = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
    boolean bool2 = bool1;
    if (str != null) {
      bool2 = bool1;
      if (str.contains("EGL_KHR_surfaceless_context"))
        bool2 = true; 
    } 
    return bool2;
  }
  
  private static void j(String paramString) {
    o.c("GlUtil", paramString);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/util/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */