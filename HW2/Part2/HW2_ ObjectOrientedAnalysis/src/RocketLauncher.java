/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BEDO
 */
public class  RocketLauncher  extends CondimentDecorator {
    Suits suits;
    public  RocketLauncher(Suits suits){
        this.suits=suits;
    }
    @Override
    public String getDescription() {
       return suits.getDescription()+", RocketLauncher"; 
    }

    @Override
    public double cost() {
        return 150000+suits.cost();
    }

    @Override
    public double weight() {
        return 7.5+suits.weight();
    }
    
}
