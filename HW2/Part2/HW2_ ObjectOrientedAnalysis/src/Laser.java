/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BEDO
 */
public class  Laser  extends CondimentDecorator {
    Suits suits;
    public  Laser(Suits suits){
        this.suits=suits;
    }
    @Override
    public String getDescription() {
       return suits.getDescription()+", Laser"; 
    }

    @Override
    public double cost() {
        return 200000+suits.cost();
    }

    @Override
    public double weight() {
        return 5.5+suits.weight();
    }
    
}
