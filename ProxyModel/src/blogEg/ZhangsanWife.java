package blogEg;

/**
 * Created by cx on 2016/10/23.
 */
public class ZhangsanWife implements HouseWork {


    @Override
    public void doheDishes() {
        System.out.println("ZhangsanWife碗洗完了");
    }

    @Override
    public void mopFloor() {
        System.out.println("ZhangsanWife地拖完了");
    }

    @Override
    public void cook() {
        System.out.println("ZhangsanWife饭做好了");
    }
}
