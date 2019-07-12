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
public class DomesticTPX100 extends TPX{

    public DomesticTPX100() {
        purpose=" DomesticTPX100 : Domestic flights";
        motor="Turbojet";
        cover="Velvet";
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
