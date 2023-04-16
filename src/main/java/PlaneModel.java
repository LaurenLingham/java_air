public enum PlaneModel {
    BOEING_747 (416, 183000),
    AIRBUS_A220 (160, 58000),
    EMBRAER_EJET(100, 21000);

    private final int capacity;
    private final int weight;

    PlaneModel(int capacity, int weight) {
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getWeight() {
        return weight;
    }
}
