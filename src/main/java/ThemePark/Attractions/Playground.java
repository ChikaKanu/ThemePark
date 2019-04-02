package ThemePark.Attractions;

import ThemePark.ISecurity;
import ThemePark.Visitor;

import java.util.ArrayList;

public class Playground extends Attraction implements ISecurity {

    private ArrayList<Visitor> visitors;

    public Playground(String name, int rating) {
        super(name, rating);
        this.visitors = new ArrayList<>();
    }

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() <= 15) {
            this.visitors.add(visitor);
        }
        return false;
    }

    public int visitorsCount() {
        return this.visitors.size();
    }
}
