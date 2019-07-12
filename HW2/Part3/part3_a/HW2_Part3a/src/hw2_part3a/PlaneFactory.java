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
public class PlaneFactory {
    public TPX createPlane(String type){
        
        TPX plane = null;
        switch (type) {
            case "tpx100":
                plane = new TPX100();
                break;
            case "tpx200":
                plane = new TPX200();
                break;
            case "tpx300":
                plane = new TPX300();
                break;
            default:
                break;
        }
        return plane;
    }

 
}
