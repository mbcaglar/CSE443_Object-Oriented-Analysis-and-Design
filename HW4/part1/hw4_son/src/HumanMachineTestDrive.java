/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BEDO
 */
public class HumanMachineTestDrive {
    public static void main(String[] args) {
    HumanMachine humanMachine = new HumanMachine();
    System.out.println(humanMachine);
    humanMachine.beginState();
    humanMachine.exercise();
    humanMachine.perseverance();
    humanMachine.perseverance();
    System.out.println();
    
    System.out.println(humanMachine);
    humanMachine.beginState();
    humanMachine.outLate();
    humanMachine.sleep();
    humanMachine.buyGtx();
    System.out.println();
    
    System.out.println(humanMachine);
    humanMachine.beginState();
    humanMachine.outLate();
    humanMachine.coffeWork();
    humanMachine.perseverance();

    System.out.println();    
    System.out.println(humanMachine);
    humanMachine.beginState();
    humanMachine.outLate();
    humanMachine.sleep();
    humanMachine.exercise();
    humanMachine.perseverance();
    humanMachine.coffeWork();
   
    
}
}
