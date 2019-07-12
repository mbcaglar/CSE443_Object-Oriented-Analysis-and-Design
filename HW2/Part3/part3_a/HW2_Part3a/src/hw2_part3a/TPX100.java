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
public class TPX100 extends TPX{

    public TPX100() {
        purpose=" TPX100 : Domestic flights";
    }
    
    @Override
    public void constructSkeleton() {
        System.out.println("Aluminum alloy");
    }

    @Override
    public void placeEngines() {
        System.out.println("Single jet engine");    
    }

    @Override
    public void placeSeats() {
       System.out.println("50 seats");
    }
    
}
