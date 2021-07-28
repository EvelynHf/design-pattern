package org.eve.singleton;

/**
 * 单例模式-懒汉模式，线程不安全
 *
 * @author Murphy
 * @Date 2021/07/13 15:28:00
 */
public class LazyUnsafeSingleton {

    private static LazyUnsafeSingleton instance;

    private LazyUnsafeSingleton() {
    }

    public LazyUnsafeSingleton getInstance() {
        if (null == instance) {
            instance = new LazyUnsafeSingleton();
        }
        return instance;
    }
}
