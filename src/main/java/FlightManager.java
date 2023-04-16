public class FlightManager {

    private Flight flight;

    public FlightManager(Flight flight) {
        this.flight = flight;
    }

    public int planeBaggageWeight() {
        return flight.getPlane().getWeight() / 2;
    }

    public int baggageWeightPerPassenger() {
        return planeBaggageWeight() / flight.getPlane().getModel().getCapacity();
    }

    public int reservedBaggageWeight() {
        return flight.getNumberOfPassengers() * baggageWeightPerPassenger();
    }

    public int remainingBaggageWeight() {
        return planeBaggageWeight() - reservedBaggageWeight();
    }
}
