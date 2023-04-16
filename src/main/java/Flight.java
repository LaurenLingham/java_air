import people.CabinCrew;
import people.Passenger;
import people.Pilot;

import java.util.ArrayList;

public class Flight {

    private Pilot pilot;
    private ArrayList<CabinCrew> crew = new ArrayList<>();
    private ArrayList<Passenger> passengers = new ArrayList<>();
    private Plane plane;
    private String flightNumber;
    private String destinationAirport;
    private String departingAirport;
    private String departureTime;

    public Flight(Plane plane, String flightNumber, String destinationAirport, String departingAirport, String departureTime) {
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destinationAirport = destinationAirport;
        this.departingAirport = departingAirport;
        this.departureTime = departureTime;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    public int getNumberOfCrew() {
        return this.crew.size();
    }

    public void addCabinCrewMember(CabinCrew crewMember) {
        this.crew.add(crewMember);
    }

    public int getNumberOfPassengers() {
        return this.passengers.size();
    }

    public int availableSeats() {
        return this.plane.getModel().getCapacity() - getNumberOfPassengers();
    }

    public void addPassenger(Passenger passenger) {
        if (availableSeats() > 0) {
            this.passengers.add(passenger);
        }
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    public String getDepartingAirport() {
        return departingAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }
}
