package it.jdk.pattern.flyweight;

//Ridurre l'utilizzo della memoria : Flyweight
public class StateFactory {

    private static State1 state1 = new State1();
    private static State2 state2 = new State2();

    public State createState1(){
        return state1;
    }

    public State createState2(){
        return state2;
    }
}
