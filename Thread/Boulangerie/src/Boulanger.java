public class Boulanger implements Runnable {
    private final Boulangerie boulangerie;

    public Boulanger(Boulangerie boulangerie) {
        this.boulangerie = boulangerie;
    }

    public void run() {
        try {
            while (true) {
                boulangerie.produce();
                Thread.sleep(500); // Simule le temps de production d'un pain.
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
