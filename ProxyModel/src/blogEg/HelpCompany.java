package blogEg;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by cx on 2016/10/23.
 */
public class HelpCompany implements InvocationHandler{

    private Object object;

    public HelpCompany(Object object){
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
       Object o = method.invoke(object,args);
        return o;
    }


}
