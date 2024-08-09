import java.util.LinkedList;
import java.util.Queue;

public class Boulangerie {
    private final Queue<Pain> storage = new LinkedList<>();
    private final int capacity;

    public Boulangerie(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void produce() throws InterruptedException {
        while (storage.size() == capacity) {
            System.out.println("Capacité maximale atteinte, le boulanger attend");
            wait();
        }
        Pain pain = new Pain();
        storage.add(pain);
        System.out.println("Le boulanger produit : " + pain);
        notifyAll();
    }

    public synchronized void consume() throws InterruptedException {
        while (storage.isEmpty()) {
            wait();
        }
        Pain pain = storage.poll();
        System.out.println("Le client achéte : " + pain);
        notifyAll();
    }
}
