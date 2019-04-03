package ThemePark.Attractions;

import ThemePark.IReviewed;

import java.util.ArrayList;

public class Park extends Attraction implements IReviewed {

    public Park(String name, int rating) {
        super(name, rating);
    }

}
