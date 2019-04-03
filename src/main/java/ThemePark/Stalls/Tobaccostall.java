package ThemePark.Stalls;

import ThemePark.IReviewed;
import ThemePark.ISecurity;
import ThemePark.Visitor;

import java.util.ArrayList;

public class Tobaccostall extends Stall implements ISecurity, IReviewed {

    private ArrayList<Visitor> visitors;

    public Tobaccostall (String name, int rating, String ownerName, String parkingSpot) {
        super(name, rating, ownerName, parkingSpot);
        this.visitors = new ArrayList<>();
    }

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() >= 18) {
            this.visitors.add(visitor);
        }
        return false;
    }

    public int visitorsCount() {
        return this.visitors.size();
    }


}

