/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2_part3a;

/**
 *
 * @author BEDO
 */
public class HW2_Part3a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Form form=new Form();
         form.setVisible(true);
        PlaneFactory factory=new PlaneFactory();
       
        PlaneStore pStore = new PlaneStore(factory);

        TPX plane1 = pStore.orderPlane("tpx100");
        System.out.println("THY ordered a"+plane1.purpose+"\n");
        
        TPX plane2 = pStore.orderPlane("tpx200");
        System.out.println("Pegasus ordered a"+plane2.purpose+"\n");
        
        TPX plane3 = pStore.orderPlane("tpx300");
        System.out.println("BoraJet ordered a"+plane3.purpose+"\n");

    }
    
}
