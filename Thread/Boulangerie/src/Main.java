public class Main {
    public static void main(String[] args) {
        Boulangerie boulangerie = new Boulangerie(5); // Boulangerie avec une capacité de 5 pains

        Boulanger boulanger = new Boulanger(boulangerie);
        Client client = new Client(boulangerie);

        Thread threadBoulanger = new Thread(boulanger);
        Thread threadClient = new Thread(client);

        threadBoulanger.start();
        threadClient.start();

        try {
            threadBoulanger.join();
            threadClient.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
