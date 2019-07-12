/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BEDO
 */
public class fitState implements State{

    HumanMachine humanMachine;
    public fitState(HumanMachine human){
        humanMachine=human;
    }
       @Override
    public void buyGtx() {
        System.out.println("No human buyGtx\n--->state(Fit State)");         
    }

    @Override
    public void cheating() {
        System.out.println("No human cheating\n--->state(Fit State)");
    }

    @Override
    public void exercise() {
        System.out.println("Sorry,You re already exercised\n--->state(Fit State)");
    }

    @Override
    public void perseverance() {
        System.out.println("Perseverance returned\n--->state(Graduate State)");
        humanMachine.setState(humanMachine.getgraduateState());
    }

    @Override
    public void outLate() {
        System.out.println("No human outLate\n--->state(Fit State)");
    }

    @Override
    public void sleep() {
        System.out.println("No human sleep\n--->state(Fit State)");
    }

    @Override
    public void coffeWork() {
        System.out.println("No human coffeWork\n--->state(Fit State)");
    }
    
}
