package org.eve.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author Murphy
 * @Date 2021/08/02 17:49:00
 */
public class JdkProxyTest {
    public static void main(String[] args) {
        ISubject realSubject = new SubjectImpl();
        InvocationHandler logHandler = new LogHandler(realSubject);
        ClassLoader loader = realSubject.getClass().getClassLoader();
        Class[] interfaces = new Class[] {ISubject.class};
        ISubject subject = (ISubject) Proxy.newProxyInstance(loader, interfaces, logHandler);
        subject.sayHello();
    }
}
