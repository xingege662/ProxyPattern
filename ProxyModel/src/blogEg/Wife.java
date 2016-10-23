package blogEg;

/**
 * Created by cx on 2016/10/23.
 */
public class Wife implements HouseWork {


    @Override
    public void doheDishes() {
        System.out.println("碗洗完了");
    }

    @Override
    public void mopFloor() {
        System.out.println("地拖完了");
    }

    @Override
    public void cook() {
        System.out.println("饭做好了");
    }
}
