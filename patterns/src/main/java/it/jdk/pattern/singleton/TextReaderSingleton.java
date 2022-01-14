package it.jdk.pattern.singleton;

/**
 * Risolve il problema di ottenere una singola istanza di una classe
 */
public class TextReaderSingleton {

    private static TextReaderSingleton instance;

    private TextReaderSingleton(){
        System.out.println("OK");
    }

    public static TextReaderSingleton getInstance(){
        if(instance==null){
            instance=new TextReaderSingleton();
        }
        return instance;
    }
}
