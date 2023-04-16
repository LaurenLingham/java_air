public class Plane {
    private PlaneModel model;

    public Plane(PlaneModel model) {
        this.model = model;
    }

    public PlaneModel getModel() {
        return model;
    }

    public void setModel(PlaneModel model) {
        this.model = model;
    }

    public int getCapacity() {
        return this.getModel().getCapacity();
    }

    public int getWeight() {
        return this.getModel().getWeight();
    }
}
