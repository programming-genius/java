package it.jdk.pattern.observer;

public class Observer1 implements Observer<String>{
    @Override
    public void notify(String event) {
        System.out.println("Sono l'observer1:"+event);
    }
}
