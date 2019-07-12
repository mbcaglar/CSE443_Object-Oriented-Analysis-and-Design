/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BEDO
 */
public class dec extends Suits{

    public dec(){
        description = "dec";
    } 
    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double cost() {
        return 500000;
    }

    @Override
    public double weight() {
        return 25;
    }
    
}
