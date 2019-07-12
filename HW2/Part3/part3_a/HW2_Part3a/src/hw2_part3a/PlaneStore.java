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
public class PlaneStore {
    PlaneFactory factory;
 
    public PlaneStore(PlaneFactory factory) { 
        this.factory = factory;
    }
 
    public TPX orderPlane(String type) {
        TPX tpx;
 
        tpx = factory.createPlane(type);
 
        tpx.constructSkeleton();
        tpx.placeEngines();
        tpx.placeSeats();
        return tpx;
    }

}
