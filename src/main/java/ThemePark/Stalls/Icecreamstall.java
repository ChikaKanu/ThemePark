package ThemePark.Stalls;

import ThemePark.IReviewed;

import java.util.ArrayList;

public class Icecreamstall extends Stall implements IReviewed {

    public Icecreamstall(String name, int rating, String ownerName, String parkingSpot) {
        super(name, rating, ownerName, parkingSpot);
    }


}

