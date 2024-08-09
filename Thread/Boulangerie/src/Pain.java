public class Pain {
    private static int counter = 0;
    private final int id;

    public Pain() {
        this.id = ++counter;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Le pain #" + id;
    }
}
