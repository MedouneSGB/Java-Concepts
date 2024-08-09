public class Client implements Runnable {
    private final Boulangerie boulangerie;

    public Client(Boulangerie boulangerie) {
        this.boulangerie = boulangerie;
    }

    public void run() {
        try {
            while (true) {
                boulangerie.consume();
                Thread.sleep(1000); // Simule le temps de consomation d'un pain
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
