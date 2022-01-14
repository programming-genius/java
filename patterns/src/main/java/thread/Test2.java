package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test2 {
    public static void main(String[] arg){
        ExecutorService executor = Executors.newSingleThreadExecutor();
        //newCachedThreadPool()
        //newFixedThreadPool()
        //newScheduledThreadPool()
        executor.submit(new Runnable(){
            public void run(){
                String nomeThread = Thread.currentThread().getName();
                System.out.println("Executor con un solo Thread: " + nomeThread);
            }
        });
        executor.shutdown();
    }
}
