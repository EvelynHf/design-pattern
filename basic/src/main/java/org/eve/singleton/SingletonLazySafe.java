package org.eve.singleton;

/**
 * 单例-懒汉模式，线程安全
 *
 * @author Murphy
 * @Date 2021/07/27 16:21:00
 */
public class SingletonLazySafe {

    private static SingletonLazySafe instance;

    private SingletonLazySafe() {
    }

    //    public static synchronized SingletonLazySafe getInstance() {
    //        if (null == instance) {
    //            instance = new SingletonLazySafe();
    //        }
    //        return instance;
    //    }

    public static SingletonLazySafe getInstance() {
        if (null == instance) {
            synchronized (SingletonLazySafe.class) {
                if (null == instance) {
                    instance = new SingletonLazySafe();
                }
            }
        }
        return instance;
    }
}
