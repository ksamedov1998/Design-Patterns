package structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class SecurityProxy implements InvocationHandler {
    private final Object object;

    private SecurityProxy(Object object) {
        this.object = object;
    }

    public static Object newInstance(Object obj) {
        return java.lang.reflect.Proxy.newProxyInstance(
                obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(),
                new SecurityProxy(obj)
                );
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result;
        try{
        result = method.invoke(object,args);
        }catch (InvocationTargetException e){
            throw e.getTargetException();
        }catch (Exception e){
            throw new RuntimeException("unexpected invocation exception : " + e.getMessage());
        }
        return result;
    }
}
