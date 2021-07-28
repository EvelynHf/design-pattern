package org.eve.singleton;

/**
 * 单例模式-静态内部类
 * JVM内部的类加载机制能够保证一个类的加载过程是线程互斥的
 *
 * @author Murphy
 * @Date 2021/07/27 16:36:00
 */
public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton() {
    }

    private static class InstanceFactory {
        private static StaticInnerClassSingleton instance = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return InstanceFactory.instance;
    }

}
