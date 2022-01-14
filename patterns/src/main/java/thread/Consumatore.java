package thread;

public class Consumatore extends Thread {

    private Container container;

    public Consumatore(Container container) {
        this.container = container;
    }

    @Override
    public void run(){
        while(!isInterrupted()){
            synchronized (container) {
                if(!container.isEmpty()){
                    System.out.println("Consumato:"+container.getValue());
                    container.setEmpty(true);
                }
                container.notifyAll();
                try {
                    container.wait();
                } catch (InterruptedException e) {
                    System.out.println("Consumatore interrupt durante il waiting");
                    interrupt(); //in caso di errore viene resettato il segnale di interrupt, devo rigenerarlo
                }
            }
        }
        System.out.println("Consumatore: interruzione");
    }
}
