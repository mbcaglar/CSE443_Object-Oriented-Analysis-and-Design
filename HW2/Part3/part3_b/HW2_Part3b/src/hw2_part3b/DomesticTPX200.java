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
public class DomesticTPX200 extends TPX {

    public DomesticTPX200() {
        purpose=" DomesticTPX200 : Domestic and short international flights";
        motor="Turbojet";
        cover="Velvet";
    }
    @Override
    public void constructSkeleton() {
        System.out.println("Nickel alloy");
    }

    @Override
    public void placeEngines() {
       System.out.println("Twin jet engines");
    }

    @Override
    public void placeSeats() {
        System.out.println("100 Seats");
    }
    
}
