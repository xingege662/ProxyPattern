package blogEg;

/**
 * Created by cx on 2016/10/23.
 */
public class Husband implements HouseWork {

    private Wife wife;

    public Husband() {
    }

    public Husband(Wife wife) {
        this.wife = wife;
    }

    @Override
    public void doheDishes() {
        wife.doheDishes();
    }

    @Override
    public void mopFloor() {
        wife.mopFloor();
    }

    @Override
    public void cook() {
        wife.cook();
    }
}
