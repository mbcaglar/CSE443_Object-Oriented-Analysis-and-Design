/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BEDO
 */
public class readyState implements State{

    HumanMachine humanMachine;
    public readyState(HumanMachine human){
        humanMachine=human;
    }
    @Override
    public void buyGtx() {
        System.out.println("Buying GTX returned\n--->state(Axe State)"); 
        humanMachine.setState(humanMachine.getaxeState());
    }

    @Override
    public void cheating() {
        System.out.println("Cheating returned\n--->state(Axe State)"); 
        humanMachine.setState(humanMachine.getaxeState());
    }

    @Override
    public void exercise() {
        System.out.println("Exirce returned\n--->state(Fit State)"); 
        humanMachine.setState(humanMachine.getfitState());
    }

    @Override
    public void perseverance() {
        System.out.println("Perseverance returned\n--->state(Graduate State)"); 
        humanMachine.setState(humanMachine.getgraduateState());
    }

    @Override
    public void outLate() {
        System.out.println("OutLate returned\n--->state(NeedingSleep State)"); 
        humanMachine.setState(humanMachine.getneedingSleepState());
    }

    @Override
    public void sleep() {
        System.out.println("You re already slept\n--->state(Ready State)");
    }

    @Override
    public void coffeWork() {
        System.out.println("No human coffeWork\n--->state(Ready State)");
    }
    
    
}
