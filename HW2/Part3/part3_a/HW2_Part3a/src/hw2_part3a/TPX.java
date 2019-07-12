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
public abstract class TPX {
    String purpose;
    public abstract void constructSkeleton();
    public abstract void  placeEngines(); 
    public abstract void placeSeats();
    public void getPurpose(){
        System.out.println(purpose);   
    }
  
    
}
