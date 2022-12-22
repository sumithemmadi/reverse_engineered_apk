package b.h.g;

public class a {
  public static float a(float paramFloat1, float paramFloat2, float paramFloat3) {
    return (paramFloat1 < paramFloat2) ? paramFloat2 : ((paramFloat1 > paramFloat3) ? paramFloat3 : paramFloat1);
  }
  
  public static int b(int paramInt1, int paramInt2, int paramInt3) {
    return (paramInt1 < paramInt2) ? paramInt2 : ((paramInt1 > paramInt3) ? paramInt3 : paramInt1);
  }
  
  public static long c(long paramLong1, long paramLong2, long paramLong3) {
    return (paramLong1 < paramLong2) ? paramLong2 : ((paramLong1 > paramLong3) ? paramLong3 : paramLong1);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/h/g/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */