package org.eve.proxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;

/**
 * @author Murphy
 * @Date 2021/08/03 18:47:00
 */
public class CglibProxyTest {

    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        RealSubject proxy = (RealSubject) Enhancer.create(realSubject.getClass(), new LogInterceptor());
        proxy.sayHello();
    }
}
