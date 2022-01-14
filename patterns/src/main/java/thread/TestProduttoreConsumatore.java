package thread;

public class TestProduttoreConsumatore {
    public static void main(String[] arg) {
        Container container = new Container();

        Produttore produttore = new Produttore(container);
        Consumatore consumatore = new Consumatore(container);

        produttore.start();
        consumatore.start();

        while (true) {
            synchronized (container) {
                if (container.getValue() > 20) {
                    produttore.interrupt();
                    consumatore.interrupt();
                    break;
                }
            }
        }

        try {
            produttore.join();
            consumatore.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
