/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2_part3b;

/**
 *
 * @author BEDO
 */
public class OtherTPX100 extends TPX{

    public OtherTPX100() {
        purpose=" OtherTPX100 : Domestic flights";
        motor="Geared turbofan";
        cover="Leather";
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
