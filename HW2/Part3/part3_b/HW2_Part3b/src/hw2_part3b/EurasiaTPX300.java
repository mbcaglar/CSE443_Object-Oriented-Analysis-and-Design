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
public class EurasiaTPX300 extends TPX{

    public EurasiaTPX300() {
        purpose=" EurasiaTPX300 : Transatlantic flights";
        motor="Turbofan";
        cover="Linen";
    }

    
    @Override
    public void constructSkeleton() {
        System.out.println("Titanium alloy");
    }

    @Override
    public void placeEngines() {
       System.out.println("Quadro jet engines");
    }

    @Override
    public void placeSeats() {
        System.out.println("250 Seats");
    }
    
}
