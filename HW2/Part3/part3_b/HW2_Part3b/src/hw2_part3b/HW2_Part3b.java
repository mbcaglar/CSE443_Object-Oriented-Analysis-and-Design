/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2_part3b;

import com.sun.jmx.remote.util.OrderClassLoaders;

/**
 *
 * @author BEDO
 */
public class HW2_Part3b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {      
               
        Form form=new Form();
        form.setVisible(true);
        PlaneStore pStore1 = new Domestic();
        PlaneStore pStore2 = new Eurasia();
        PlaneStore pStore3 = new Other();

        TPX plane1 = pStore1.orderPlane("tpx100");
        System.out.println(plane1.motor+"\n"+plane1.cover);
        System.out.println("*THY ordered a"+plane1.purpose+"\n");
        
        TPX plane2 = pStore2.orderPlane("tpx200");
         System.out.println(plane2.motor+"\n"+plane2.cover);
        System.out.println("*Pegasus ordered a"+plane2.purpose+"\n");
        
        TPX plane3 = pStore3.orderPlane("tpx300");
         System.out.println(plane3.motor+"\n"+plane3.cover);
        System.out.println("*BoraJet ordered a"+plane3.purpose+"\n");
       
    }
    
}
