package org.eve.singleton;

/**
 * 单例-饿汉模式
 *
 * @author Murphy
 * @Date 2021/07/27 16:16:00
 */
public class HungrySingleton {

    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return instance;
    }
}
