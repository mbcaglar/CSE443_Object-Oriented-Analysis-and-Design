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
public class Other extends PlaneStore{
    
    @Override
    protected TPX createPlane(String type) {
                
        TPX plane = null;
        switch (type) {
            case "tpx100":
                plane = new OtherTPX100();
                break;
            case "tpx200":
                plane = new OtherTPX200();
                break;
            case "tpx300":
                plane = new OtherTPX300();
                break;
            default:
                break;
        }
        return plane;
    }
}
