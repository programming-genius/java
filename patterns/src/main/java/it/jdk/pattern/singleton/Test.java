package it.jdk.pattern.singleton;

public class Test {
    static public class T extends Thread{

        @Override
        public void run() {
            SynchronizedTextReaderSingleton.getInstance();
            //TextReaderSingleton.getInstance();
        }
    }
    public static void main(String[] args){
            T t = new T();
            T t2 = new T();
            t.start();
            t2.start();
    }
}
