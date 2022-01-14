package it.jdk.pattern.observer;

public class Test {
    public static void main(String[] arg){
        Soggetto soggetto = new Soggetto();
        soggetto.register(new Observer1());
        soggetto.register(new Observer2());
        soggetto.notity("Ciao");
    }
}
