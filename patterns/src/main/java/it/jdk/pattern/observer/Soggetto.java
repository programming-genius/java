package it.jdk.pattern.observer;

import java.util.HashSet;
import java.util.Set;

public class Soggetto<T> {

    private Set<Observer> set = new HashSet<>();
    private T evento;

    public void register(Observer observer){
        set.add(observer);
    }

    public void unRegister(Observer observer){
        set.remove(observer);
    }

    public void notity(T evento) {
        this.evento = evento;
        for (Observer observer : set) {
            observer.notify(evento);
        }
    }
}
