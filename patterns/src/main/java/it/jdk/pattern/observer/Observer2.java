package it.jdk.pattern.observer;

public class Observer2 implements Observer<String>{
    @Override
    public void notify(String event) {
        System.out.println("Sono l'observer2:"+event);
    }
}
