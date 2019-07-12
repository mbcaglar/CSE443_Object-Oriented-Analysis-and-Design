

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BEDO
 */
public abstract class NumericalSolutionStrategy {
    protected static final double EPSILON = 1e-3; 
    protected int satir;
    protected int sutun;
    public abstract void denklem(double[][] matrix,double[] x_cozum);
    public abstract String print_sonuc();
    public void Set_satir(int row){
        satir=row;
    }
    public void Set_sutun(int colmn){
        sutun=colmn;
    }
}
