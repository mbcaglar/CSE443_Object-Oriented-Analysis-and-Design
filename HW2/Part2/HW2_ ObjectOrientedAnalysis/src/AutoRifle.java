/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BEDO
 */
public class AutoRifle extends CondimentDecorator {
    Suits suits;
    public AutoRifle(Suits suits){
        this.suits=suits;
    }
    @Override
    public String getDescription() {
       return suits.getDescription()+", AutoRifle"; 
    }

    @Override
    public double cost() {
        return 30000+suits.cost();
    }

    @Override
    public double weight() {
        return 1.5+suits.weight();
    }
    
}
