package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.d;

public class i {
  static boolean[] a = new boolean[3];
  
  static void a(d paramd, d paramd1, ConstraintWidget paramConstraintWidget) {
    paramConstraintWidget.o = -1;
    paramConstraintWidget.p = -1;
    ConstraintWidget.DimensionBehaviour dimensionBehaviour1 = paramd.V[0];
    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.c;
    if (dimensionBehaviour1 != dimensionBehaviour2 && paramConstraintWidget.V[0] == ConstraintWidget.DimensionBehaviour.e) {
      int j = paramConstraintWidget.K.g;
      int k = paramd.U() - paramConstraintWidget.M.g;
      ConstraintAnchor constraintAnchor = paramConstraintWidget.K;
      constraintAnchor.i = paramd1.q(constraintAnchor);
      constraintAnchor = paramConstraintWidget.M;
      constraintAnchor.i = paramd1.q(constraintAnchor);
      paramd1.f(paramConstraintWidget.K.i, j);
      paramd1.f(paramConstraintWidget.M.i, k);
      paramConstraintWidget.o = 2;
      paramConstraintWidget.C0(j, k);
    } 
    if (paramd.V[1] != dimensionBehaviour2 && paramConstraintWidget.V[1] == ConstraintWidget.DimensionBehaviour.e) {
      int k = paramConstraintWidget.L.g;
      int j = paramd.y() - paramConstraintWidget.N.g;
      ConstraintAnchor constraintAnchor = paramConstraintWidget.L;
      constraintAnchor.i = paramd1.q(constraintAnchor);
      constraintAnchor = paramConstraintWidget.N;
      constraintAnchor.i = paramd1.q(constraintAnchor);
      paramd1.f(paramConstraintWidget.L.i, k);
      paramd1.f(paramConstraintWidget.N.i, j);
      if (paramConstraintWidget.h0 > 0 || paramConstraintWidget.T() == 8) {
        constraintAnchor = paramConstraintWidget.O;
        constraintAnchor.i = paramd1.q(constraintAnchor);
        paramd1.f(paramConstraintWidget.O.i, paramConstraintWidget.h0 + k);
      } 
      paramConstraintWidget.p = 2;
      paramConstraintWidget.T0(k, j);
    } 
  }
  
  public static final boolean b(int paramInt1, int paramInt2) {
    boolean bool;
    if ((paramInt1 & paramInt2) == paramInt2) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/constraintlayout/solver/widgets/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */