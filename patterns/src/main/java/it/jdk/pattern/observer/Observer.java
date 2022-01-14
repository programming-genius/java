package it.jdk.pattern.observer;

public interface Observer<T> {
    void notify(T event);
}
