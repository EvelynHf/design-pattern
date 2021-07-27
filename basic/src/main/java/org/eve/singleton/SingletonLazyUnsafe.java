package org.eve.singleton;

/**
 * 单例-懒汉模式，线程不安全
 *
 * @author Murphy
 * @Date 2021/07/13 15:28:00
 */
public class SingletonLazyUnsafe {
    private static SingletonLazyUnsafe instance;

    private SingletonLazyUnsafe() {
    }

    public SingletonLazyUnsafe getInstance() {
        if (null == instance) {
            instance = new SingletonLazyUnsafe();
        }
        return instance;
    }
}
