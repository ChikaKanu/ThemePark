package ThemePark;

import java.util.ArrayList;

public class Themepark implements IReviewed {

    private ArrayList<IReviewed> reviews;

    public Themepark(){
        this.reviews = new ArrayList<>();
    }


    public int getRating() {
        return 0;
    }


    public String getName() {
        return null;
    }


    public ArrayList getAllReviewed(IReviewed attraction) {
        return this.reviews;
    }
}
