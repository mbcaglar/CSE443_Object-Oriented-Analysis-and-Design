/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BEDO
 */
public class HumanMachine{

    State fitState;
    State readyState;
    State axeState;
    State needingSleepState;
    State graduateState;
    State chronicState;
    State state = readyState;
    int count = 0;

    public HumanMachine(){
        fitState=new fitState(this);
        readyState=new readyState(this);
        axeState=new axeState(this);
        needingSleepState=new needingSleepState(this);
        graduateState=new graduateState(this);
        chronicState= new chronicState(this);
        state=new readyState(this);
    }
    
    public void beginState() {
       System.out.println("Start State : Ready State");
       state=new readyState(this);
    }
 
    public void buyGtx() {
       state.buyGtx();
    }

    public void cheating() {
        state.cheating();
    }
    
    public void exercise() {
        state.exercise();
    }

    public void perseverance() {
        state.perseverance();
    }

    public void outLate() {
        state.outLate();
    }

    public void sleep() {
        state.sleep();
    }

    public void coffeWork() {
        state.coffeWork();
    }
    public void setState(State state) {
        this.state = state;
    }
    public State getfitState(){
        return fitState;
    }
    public State getaxeState(){
        return axeState;
    }
    public State getreadyState(){
        return readyState;
    }
    public State getneedingSleepState(){
        return needingSleepState;
    }
    public State getgraduateState(){
        return graduateState;
    }
        public State getchronicState(){
        return chronicState;
    }
}
