package it.jdk.pattern.singleton;

/**
 * Risolve i problema di ottenre una singola istanza di una classe
 */
public class SynchronizedTextReaderSingleton {

    private static SynchronizedTextReaderSingleton instance;

    private SynchronizedTextReaderSingleton(){
        System.out.println("OK");
    }

    public static SynchronizedTextReaderSingleton getInstance() {
        synchronized (SynchronizedTextReaderSingleton.class){
            if(instance==null){
                instance=new SynchronizedTextReaderSingleton();
            }
        }
        return instance;
    }
}
