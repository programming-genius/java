package it.jdk.pattern.flyweight;

public class Test {
    public static void main(String[] arg){
        StateFactory factory = new StateFactory();
        factory.createState1();
        factory.createState2();
    }
}
