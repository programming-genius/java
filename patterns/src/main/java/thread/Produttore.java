package thread;

public class Produttore extends Thread {

    private Container container;

    public Produttore(Container container){
        this.container = container;
    }

    @Override
    public void run(){
        int counter = 0;
        while(!isInterrupted()) {
            synchronized (container) {
                if(container.isEmpty()){
                    int data = ++counter;
                    container.setValue(data);
                    container.setEmpty(false);
                    System.out.println("Prodotto:"+data);
                }
                container.notifyAll();
                try {
                    container.wait(); //l'interrupt potrebbe essere arrivato
                } catch (InterruptedException e) {
                    System.out.println("Produttore, interrupt durante waiting");
                    interrupt(); // in caso di errore viene resettato il segnale di interrupt, devo rigenerarlo
                }
            }
        }
        System.out.println("Produttore: interruzione");
    }
}
