package org.eve.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Murphy
 * @Date 2021/08/02 15:55:00
 */
public class LogHandler<T> implements InvocationHandler {

    private T object;

    public LogHandler(T object) {
        this.object = object;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.printf("before invoke!\n");
        Object returnValue = method.invoke(object, args);
        System.out.printf("after invoke!\n");
        return returnValue;
    }
}
