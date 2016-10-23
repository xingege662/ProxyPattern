package blogEg;

import java.lang.reflect.Proxy;

/**
 * Created by cx on 2016/10/23.
 */
public class CompanyMain {
    public static void main(String[] args){
        ZhangsanWife zhangsanWife = new ZhangsanWife();
        ClassLoader zhangsanClassLoader = zhangsanWife.getClass().getClassLoader();
        HelpCompany helpCompany = new HelpCompany(zhangsanWife);
        HouseWork houseWork = (HouseWork) Proxy.newProxyInstance(zhangsanClassLoader, new Class[]{HouseWork.class}, helpCompany);
        houseWork.doheDishes();
        houseWork.mopFloor();
        houseWork.cook();


        LisiWife lisiWife = new LisiWife();
        ClassLoader lisiClassLoader = lisiWife.getClass().getClassLoader();
        HelpCompany helpCompany_ = new HelpCompany(lisiWife);
        HouseWork houseWork_ = (HouseWork) Proxy.newProxyInstance(lisiClassLoader,new Class[]{HouseWork.class},helpCompany_);
        houseWork_.doheDishes();
        houseWork_.mopFloor();
        houseWork_.cook();

    }
}
