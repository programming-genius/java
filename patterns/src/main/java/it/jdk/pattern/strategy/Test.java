package it.jdk.pattern.strategy;
//Questo Design Pattern consiste nell’incapsulare un algoritmo all’interno di una classe, mantenendo un’interfaccia generica
public class Test {
    public static void main(String[] arg){
        StrategyExecutor executor = new StrategyExecutor();
        executor.execute(new Strategy1());
    }
}
