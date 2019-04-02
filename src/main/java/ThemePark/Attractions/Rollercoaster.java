package ThemePark.Attractions;

import ThemePark.ISecurity;
import ThemePark.Visitor;

import java.util.ArrayList;

public class Rollercoaster extends Attraction implements ISecurity {

    private ArrayList<Visitor> visitors;

    public Rollercoaster(String name, int rating) {
        super(name, rating);
        this.visitors = new ArrayList<>();
    }

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() > 12 && visitor.getHeight() > 145) {
            this.visitors.add(visitor);
        }
        return false;
    }

    public int visitorsCount() {
        return this.visitors.size();
    }
}
