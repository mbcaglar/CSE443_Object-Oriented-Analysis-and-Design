

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BEDO
 */
public class GaussianStrategy extends NumericalSolutionStrategy{
   private double[] x ;
    @Override
    public void denklem(double[][] matrix,double[] x_cozum) {
        x=new double[sutun];
         try{
            x=cozumle(matrix,x_cozum);
         }
        catch(Exception e){       
            System.out.println(e.toString());
            System.exit(0); 
        }
        print_sonuc();

    }
    public String print_sonuc(){
        String output;
        output=">>>---GESP METHOD---<<<\n";
//        System.out.println(">>>---GESP METHOD---<<<");
//        System.out.println();
                
        for(int i=0; i<sutun; i++){
            output+=String.format("  x[%d]=>%.4f\n",i+1,x[i]);
            //System.out.printf("x[%d]=>%.4f\n",i+1,x[i]);
        }
        return output;
    }
    public double[] cozumle(double[][] matrice, double[] x_cozum) {
        int size  = satir;

        for (int p = 0; p < size; p++) {

            // find pivot row and swap
            int max = p;
            for (int i = p + 1; i < size; i++) {
                if (Math.abs(matrice[i][p]) > Math.abs(matrice[max][p])) {
                    max = i;
                }
            }
            double[] temp = matrice[p]; matrice[p] = matrice[max]; matrice[max] = temp;
            double   t    = x_cozum[p]; x_cozum[p] = x_cozum[max]; x_cozum[max] = t;

            // singular or nearly singular
            if (Math.abs(matrice[p][p]) <= EPSILON) {
                throw new RuntimeException("Matrix is singular or nearly singular");
            }

            // pivot within A and b
            for (int i = p + 1; i < size; i++) {
                double alfa = matrice[i][p] / matrice[p][p];
                x_cozum[i] -= alfa * x_cozum[p];
                for (int j = p; j < size; j++) {
                    matrice[i][j] -= alfa * matrice[p][j];
                }
            }
        }

        // back substitution
        double[] x = new double[size];
        for (int i = size - 1; i >= 0; i--) {
            double sum = 0.0;
            for (int j = i + 1; j < size; j++) {
                sum += matrice[i][j] * x[j];
            }
            x[i] = (x_cozum[i] - sum) / matrice[i][i];
        }
        return x;
    }
    

    


    
}
