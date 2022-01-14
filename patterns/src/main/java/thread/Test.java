package thread;

public class Test {
    public static void main(String[] arg) {
         Thread thread1 = new Thread(){
             public void run(){
                 System.out.println("Sono il thread 1");
             }
         };

         Runnable run = new Runnable() {
             @Override
             public void run() {
                 System.out.println("Sono il thread 2");
             }
         };
         Thread thread2 = new Thread(run);
        /* L’invocazione del metodo start() non comporta l’immediata esecuzione del Thread, ma
            la richiesta di registrazione del Thread presso il Thread Scheduler, il quale
            può essere parte della JVM oppure del sistema operativo*/
        //Eleggibili per l'esecuzione
         thread1.start();
         thread2.start();
    }
}
