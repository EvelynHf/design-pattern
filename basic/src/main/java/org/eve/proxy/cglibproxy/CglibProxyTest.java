package org.eve.proxy.cglibproxy;

/**
 * @author Murphy
 * @Date 2021/08/03 18:47:00
 */
public class CglibProxyTest {

    public static void main(String[] args) {
        LogProxy logProxy = new LogProxy();
        SayHello sayHello = (SayHello) logProxy.getProxy(SayHello.class);
        sayHello.sayHello();
    }
}
