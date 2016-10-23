package blogEg;

/**
 * Created by cx on 2016/10/23.
 */
public class LisiWife implements HouseWork {


    @Override
    public void doheDishes() {
        System.out.println("LisiWife碗洗完了");
    }

    @Override
    public void mopFloor() {
        System.out.println("LisiWife地拖完了");
    }

    @Override
    public void cook() {
        System.out.println("lisiWife饭做好了");
    }
}
