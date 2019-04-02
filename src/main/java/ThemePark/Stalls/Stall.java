package ThemePark.Stalls;

import ThemePark.Attractions.Attraction;

public abstract class Stall extends Attraction {

    private String ownerName;
    private String parkingSpot;

    public Stall (String name, int rating, String ownerName, String parkingSpot) {
        super(name, rating);
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(String parkingSpot) {
        this.parkingSpot = parkingSpot;
    }
}
