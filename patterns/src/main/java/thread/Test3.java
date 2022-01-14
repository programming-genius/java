package thread;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class Test3 {
    public static void main(String[] arg){
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        ScheduledFuture<?> future = executor.schedule(new Runnable(){
            public void run(){
                System.out.println("Scheduling "+Thread.currentThread().getName());
            }
        }, 3, TimeUnit.SECONDS);
        long tempoRimanente = 0;
        while((tempoRimanente=future.getDelay(TimeUnit.MILLISECONDS))>0){
            System.out.printf("Tempo rimanente all'esecuzione: %sms ", tempoRimanente);
            System.out.println();
        }
    }
}
