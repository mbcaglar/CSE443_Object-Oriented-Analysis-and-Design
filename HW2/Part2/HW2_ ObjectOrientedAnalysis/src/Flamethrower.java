/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BEDO
 */
public class Flamethrower extends CondimentDecorator {
    Suits suits;
    public Flamethrower(Suits suits){
        this.suits=suits;
    }
    @Override
    public String getDescription() {
       return suits.getDescription()+", Flamethrower"; 
    }

    @Override
    public double cost() {
        return 50000+suits.cost();
    }

    @Override
    public double weight() {
        return 2+suits.weight();
    }
    
}
