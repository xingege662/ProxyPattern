package blogEg;

/**
 * Created by cx on 2016/10/23.
 */
public class Main {
    public static void main(String[] args){
        Wife wife = new Wife();
        Husband husband = new Husband(wife);
        husband.doheDishes();
        husband.mopFloor();
        husband.cook();
    }
}
