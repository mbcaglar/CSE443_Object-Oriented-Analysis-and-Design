/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BEDO
 */
public class chronicState implements State{

     HumanMachine humanMachine;
    public chronicState(HumanMachine human){
        humanMachine=human;
    }
        @Override
    public void buyGtx() {
        System.out.println("No human buyGtx\n--->state(Chronic State)");         
    }

    @Override
    public void cheating() {
        System.out.println("No human cheating\n--->state(Chronic State)");
    }

    @Override
    public void exercise() {
        System.out.println("No human exercise\n--->state(Chronic State)");
    }

    @Override
    public void perseverance() {
        System.out.println("No human perseverance\n--->state(Chronic State)");
    }

    @Override
    public void outLate() {
        System.out.println("No human outLate\n--->state(Chronic State)");
    }

    @Override
    public void sleep() {
        System.out.println("No human sleep\n--->state(Chronic State)");
    }

    @Override
    public void coffeWork() {
        System.out.println("Sorry,You re already coffe work\n--->state(Choronic State)");
    }
}
