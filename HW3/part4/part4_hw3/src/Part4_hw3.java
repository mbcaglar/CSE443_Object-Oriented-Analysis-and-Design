/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BEDO
 */
public class Part4_hw3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Form form=new Form();
        form.setVisible(true);
        // TODO code application logic here
        {
            DiscreteTransform.Complex[] cmplex = new DiscreteTransform.Complex[10];
            DiscreteTransform.Complex[] cmplex2 = new DiscreteTransform.Complex[10];

            DiscreteTransform dft = new Fourier(cmplex, cmplex2);



            dft.discreteTransform("input", "outputF", 4);
        }

        {
            DiscreteTransform.Complex[] cmplex = new DiscreteTransform.Complex[10];
            DiscreteTransform.Complex[] cmplex2 = new DiscreteTransform.Complex[10];

            DiscreteTransform dct = new Cosine(cmplex, cmplex2);

            dct.discreteTransform("input", "outputC", 4);

        }
    }
    
}
