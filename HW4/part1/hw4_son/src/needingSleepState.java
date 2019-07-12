/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BEDO
 */
public class needingSleepState implements State{
    HumanMachine humanMachine;
    public needingSleepState(HumanMachine human){
        humanMachine=human;
    }
    @Override
    public void buyGtx() {
        System.out.println("No human buyGtx\n--->state(NeedingSleep State)");         
    }

    @Override
    public void cheating() {
        System.out.println("No human cheating\n--->state(NeedingSleep State)");
    }

    @Override
    public void exercise() {
        System.out.println("No human exercise\n--->state(NeedingSleep State)");
    }

    @Override
    public void perseverance() {
        System.out.println("No human perseverance\n--->state(NeedingSleep State)");
    }

    @Override
    public void outLate() {
        System.out.println("Sorry, You re already out till late\n--->state(NeedingSleep State)");
    }

    @Override
    public void sleep() {
        System.out.println("Sleep returned\n--->state(Ready State)");
        humanMachine.setState(humanMachine.getreadyState());
    }

    @Override
    public void coffeWork() {
        System.out.println("Coffe work returned\n--->state(Choronic State)");
        humanMachine.setState(humanMachine.getchronicState());
    }
    
}
