package org.eve.singleton;

/**
 * 单例-饿汉模式
 *
 * @author Murphy
 * @Date 2021/07/27 16:16:00
 */
public class SingletonHungry {

    private static SingletonHungry instance = new SingletonHungry();

    private SingletonHungry() {
    }

    public static SingletonHungry getInstance() {
        return instance;
    }
}
