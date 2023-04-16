package people;

public class Pilot extends Crew {

    private String licenceNumber;

    public Pilot(String name, Rank rank, String licenceNumber) {
        super(name, rank);
        this.licenceNumber = licenceNumber;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }
}
