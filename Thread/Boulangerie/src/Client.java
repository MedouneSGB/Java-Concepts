public class Client implements Runnable {
    private final Boulangerie boulangerie;

    public Client(Boulangerie boulangerie) {
        this.boulangerie = boulangerie;
    }

    public void run() {
        try {
            while (true) {
                boulangerie.consume();
                Thread.sleep(1000); // Simulate time taken to consume a bread
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
