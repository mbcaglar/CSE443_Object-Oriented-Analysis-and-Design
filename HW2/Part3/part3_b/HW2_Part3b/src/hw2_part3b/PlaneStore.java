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
public abstract class PlaneStore {
          
    
        public TPX orderPlane(String type) {
            TPX plane;
            plane = createPlane(type);
            plane.constructSkeleton();
            plane.placeEngines();
            plane.placeSeats();
            
            return plane;
        }
        protected abstract TPX createPlane(String type);
        // other methods here
     
}
