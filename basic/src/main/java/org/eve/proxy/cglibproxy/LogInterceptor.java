package org.eve.proxy.cglibproxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * @author Murphy
 * @Date 2021/08/03 18:44:00
 */
public class LogInterceptor implements MethodInterceptor {

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.printf("before invoke!\n");
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.printf("after invoke!\n");
        return result;
    }
}
